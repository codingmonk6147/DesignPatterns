package Model;

public class ResourceImpleProxy implements ResourceInterface {

    ResourceImpl resourceImplObj;

     public ResourceImpleProxy(){
        resourceImplObj = new ResourceImpl();
    }


    @Override
    public void create(String str, ResourceObj obj) throws Exception {
             if(str.equals("MANAGER")){
                 resourceImplObj.create(str,obj);

             }
             else{
                 throw new Exception("Access Denied");
             }
    }

    @Override
    public void delete(String str, ResourceObj obj) throws Exception {
        if(str.equals("ADMIN")){
            resourceImplObj.delete(str,obj);

        }
        else{
            throw new Exception("Access Denied");
        }

    }

    @Override
    public String get(String str, ResourceObj obj) throws Exception {
        if(str.equals("ADMIN") || str.equals("MANAGER")){
           return resourceImplObj.get(str,obj);

        }
        else{
            throw new Exception("Access Denied");
        }
    }
}
