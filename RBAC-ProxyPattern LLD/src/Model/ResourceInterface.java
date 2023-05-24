package Model;

public interface ResourceInterface {
    
    public void create(String str, ResourceObj obj) throws Exception;
    public void delete(String str, ResourceObj obj) throws Exception;
    public String get(String str, ResourceObj obj) throws Exception;
}
