package Model;

public class ResourceImpl implements ResourceInterface{


    @Override
    public void create(String str, ResourceObj obj) {
        System.out.println("Resource has been created");
    }

    @Override
    public void delete(String str, ResourceObj obj) {
        System.out.println("Resource has been deleted");
    }

    @Override
    public String get(String str, ResourceObj obj) {

        System.out.println("Resource :"+obj.name+" "+obj.id);
        return obj.name+" "+obj.id;
    }
}
