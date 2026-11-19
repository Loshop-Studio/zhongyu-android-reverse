import java.io.*;
import java.lang.reflect.*;
import java.util.*;

/** Runs on ART against one vendor APK at a time, using local synthetic data. */
public final class LocalStoresProbe {
    private static Object singleton(Class<?> type) throws Exception {
        for (Field field:type.getFields())
            if (Modifier.isStatic(field.getModifiers()) && field.getType()==type) return field.get(null);
        throw new NoSuchFieldException(type.getName());
    }
    private static void check(boolean ok,String what) {
        if (!ok) throw new IllegalStateException(what);
    }
    private static void evaluation(File dir) throws Exception {
        final String pkg="com.zykj.evaluation.utils.";
        Object answers=singleton(Class.forName(pkg+"LocalAnswerManager"));
        Object results=singleton(Class.forName(pkg+"LocalCorrectResultManager"));
        Object revisions=singleton(Class.forName(pkg+"CorrectCommitManager"));
        Class<?> item=Class.forName(pkg+"NeedReviseData");
        String path=dir.getPath();
        Map<String,List<String>> strings=new LinkedHashMap<>();
        strings.put("q-example",Arrays.asList("甲、乙","line\n二","<tag> & \"text\"",""));
        strings.put("q-empty",Collections.<String>emptyList());
        Map<String,Integer> numbers=new LinkedHashMap<>();
        numbers.put("q-example",2); numbers.put("q-zero",0);
        List<Object> rows=Arrays.asList(
            item.getConstructor(long.class,String.class,boolean.class).newInstance(9007199254740993L,"local-a",true),
            item.getConstructor(long.class,String.class,boolean.class).newInstance(42L,"local-b",false));
        answers.getClass().getMethod("c",Map.class,String.class).invoke(answers,strings,path);
        results.getClass().getMethod("b",Map.class,String.class).invoke(results,numbers,path);
        revisions.getClass().getMethod("b",List.class,String.class).invoke(revisions,rows,path);
        check(strings.equals(answers.getClass().getMethod("b",String.class).invoke(answers,path)),"answer map");
        check(numbers.equals(results.getClass().getMethod("a",String.class).invoke(results,path)),"result map");
        check(rows.equals(revisions.getClass().getMethod("a",String.class).invoke(revisions,path)),"revision list");
        // A second independent directory is authored on the host with ordinary JSON.
        File host=new File(dir,"host");
        check(strings.equals(answers.getClass().getMethod("b",String.class).invoke(answers,host.getPath())),"host answer map");
        check(numbers.equals(results.getClass().getMethod("a",String.class).invoke(results,host.getPath())),"host result map");
        check(rows.equals(revisions.getClass().getMethod("a",String.class).invoke(revisions,host.getPath())),"host revision list");
        System.out.println("Android managers wrote and reopened all three files; independently encoded JSON produced equal maps and revision objects");
    }
    private static Method serializerMethod(Class<?> type,String name,Class<?> streamType,int streamIndex) throws Exception {
        for(Method m:type.getMethods()) {
            Class<?>[] args=m.getParameterTypes();
            if(name.equals(m.getName()) && args.length==streamIndex+2 && args[streamIndex]==streamType)return m;
        }
        throw new NoSuchMethodException(type.getName()+"."+name);
    }
    private static void transcode(File dir,String type) throws Exception {
        Object serializer=singleton(Class.forName(type));
        Method read=serializerMethod(serializer.getClass(),"readFrom",InputStream.class,0);
        Method write=serializerMethod(serializer.getClass(),"writeTo",OutputStream.class,1);
        Object first;
        try(InputStream in=new FileInputStream(new File(dir,"input.pb"))){first=read.invoke(serializer,in,null);}
        try(OutputStream out=new FileOutputStream(new File(dir,"native.pb"))){write.invoke(serializer,first,out,null);}
        Object second;
        try(InputStream in=new FileInputStream(new File(dir,"native.pb"))){second=read.invoke(serializer,in,null);}
        if(type.endsWith("PreferencesFileSerializer")) {
            // Byte-array values compare by identity in some releases. Compare the
            // serialized fields on the host and confirm the domain key count here.
            Method asMap=first.getClass().getMethod("asMap");
            Map<?,?> a=(Map<?,?>)asMap.invoke(first), b=(Map<?,?>)asMap.invoke(second);
            check(a.size()==8 && b.size()==8,"expected all eight preference types");
            System.out.println("PreferencesFileSerializer reopened 8 typed keys");
        } else {
            check(first.equals(second),"protobuf model");
            System.out.println("Serializer read and rewrote "+first.getClass().getName()+"; reopened equal message");
        }
    }
    public static void main(String[] args) throws Exception {
        try {
            File dir=new File(args[1]);
            if(args[0].equals("evaluation")) evaluation(dir);
            else transcode(dir,args[0]);
        } catch(InvocationTargetException ex) {
            Throwable why=ex.getCause();
            why.printStackTrace();System.exit(1);
        }
    }
}
