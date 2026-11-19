import java.io.FileOutputStream;
import java.lang.reflect.Method;

/** Invokes only the bundled, parameterless ObjectBox schema builder. */
public final class ModelProbe {
    public static void main(String[] args) throws Exception {
        Method build=Class.forName("com.zykj.blackboard.core.data.dao."+args[0]).getDeclaredMethod(args[1]);
        build.setAccessible(true);
        byte[] model=(byte[])build.invoke(null);
        try(FileOutputStream out=new FileOutputStream(args[2])){out.write(model);}
        System.out.println("model bytes="+model.length);
    }
}
