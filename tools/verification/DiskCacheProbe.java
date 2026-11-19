import java.io.File;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/** Write local fixture values with the disk cache implementation bundled in each original APK. */
public final class DiskCacheProbe {
    static final String KEY = "classroom_image";
    static final String DATA = "locally generated image-cache fixture";
    static final String META = "local synthetic metadata";

    static Object call(Object value, String name) throws Exception {
        return value.getClass().getMethod(name).invoke(value);
    }

    static Object keyed(Object value, String name, String key) throws Exception {
        return value.getClass().getMethod(name, String.class).invoke(value, key);
    }

    static void check(boolean ok) {
        if (!ok) throw new AssertionError("Cache value differs");
    }

    static void glide(File dir) throws Exception {
        Class<?> type = Class.forName("com.bumptech.glide.disklrucache.DiskLruCache");
        Object cache = type.getMethod("open", File.class, int.class, int.class, long.class)
                .invoke(null, dir, 1, 1, 1048576L);
        Object edit = keyed(cache, "edit", KEY);
        edit.getClass().getMethod("set", int.class, String.class).invoke(edit, 0, DATA);
        call(edit, "commit");
        Object value = keyed(cache, "get", KEY);
        check(DATA.equals(value.getClass().getMethod("getString", int.class).invoke(value, 0)));
        call(keyed(cache, "edit", "discarded"), "abort");
        call(cache, "close");
    }

    static void coil(File dir) throws Exception {
        Class<?> wrapper = Class.forName("coil3.disk.b");
        Class<?> path = Class.forName("okio.Path"), fs = Class.forName("okio.FileSystem");
        Object cache = wrapper.getConstructor(long.class, path, fs, Class.forName("kotlin.coroutines.d"))
                .newInstance(1048576L, path.getMethod("get", File.class).invoke(null, dir),
                        fs.getField("SYSTEM").get(null),
                        Class.forName("kotlin.coroutines.EmptyCoroutineContext").getField("c").get(null));
        Object editor = keyed(cache, "a", KEY);
        Files.write(new File(call(editor, "getMetadata").toString()).toPath(), META.getBytes(StandardCharsets.UTF_8));
        Files.write(new File(call(editor, "getData").toString()).toPath(), DATA.getBytes(StandardCharsets.UTF_8));
        call(call(editor, "c"), "close");
        Object snap = keyed(cache, "b", KEY);
        check(Arrays.equals(Files.readAllBytes(new File(call(snap, "getData").toString()).toPath()),
                DATA.getBytes(StandardCharsets.UTF_8)));
        call(snap, "close");
        call(keyed(cache, "a", "discarded"), "b");
        call(wrapper.getField("d").get(cache), "close");
    }

    static void okhttp(File dir) throws Exception {
        Class<?> type = Class.forName("okhttp3.internal.cache.DiskLruCache");
        Class<?> fs = Class.forName("okhttp3.internal.io.FileSystem");
        Class<?> tasks = Class.forName("okhttp3.internal.concurrent.TaskRunner");
        Object cache = type.getConstructor(fs, File.class, int.class, int.class, long.class, tasks)
                .newInstance(fs.getField("SYSTEM").get(null), dir, 201105, 2, 1048576L,
                        tasks.getField("INSTANCE").get(null));
        Class<?> sink = Class.forName("okio.Sink"), buffer = Class.forName("okio.Buffer");
        Object edit = keyed(cache, "edit", KEY);
        String[] values = {META, DATA};
        for (int index = 0; index < values.length; index++) {
            Object out = edit.getClass().getMethod("newSink", int.class).invoke(edit, index);
            Object content = buffer.getConstructor().newInstance();
            buffer.getMethod("writeUtf8", String.class).invoke(content, values[index]);
            sink.getMethod("write", buffer, long.class).invoke(out, content,
                    (long)values[index].getBytes(StandardCharsets.UTF_8).length);
            sink.getMethod("close").invoke(out);
        }
        call(edit, "commit");
        Object snap = keyed(cache, "get", KEY);
        check(snap != null);
        call(snap, "close");
        call(keyed(cache, "edit", "discarded"), "abort");
        call(cache, "close");
    }

    public static void main(String[] args) throws Exception {
        File dir = new File(args[1]);
        if (args[0].equals("coil")) coil(dir);
        else if (args[0].equals("okhttp")) okhttp(dir);
        else if (args[0].equals("glide")) glide(dir);
        else throw new IllegalArgumentException(args[0]);
        System.out.println("Original " + args[0] + " cache committed and reopened a synthetic entry.");
        System.exit(0);
    }
}
