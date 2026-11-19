package local.zy.downloadroom;

import android.app.Instrumentation;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.util.SparseArray;
import dalvik.system.DexClassLoader;
import org.json.JSONObject;
import java.io.File;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/** Exercises the packaged breakpoint models without a network downloader or a real file transfer. */
public final class BreakpointStoreProbe extends Instrumentation {
    private static final long SPLIT = 4294967400L;
    private static final String URL = "https://example.invalid/class/diagram";
    private Bundle opts;
    private ClassLoader loader;
    @Override
    public void onCreate(Bundle args) {
        opts = args;
        start();
    }
    private Class<?> type(String name) throws Exception {
        return loader.loadClass(name);
    }
    private static Object invoke(Object o, String name, Class<?>[] types, Object... args) throws Exception {
        return o.getClass().getMethod(name, types).invoke(o, args);
    }
    private static Object noArgs(Object o, String name) throws Exception {
        return invoke(o, name, new Class<?>[] {});
    }
    private static void check(boolean ok, String msg) {
        if (!ok)
            throw new AssertionError(msg);
    }
    private static long single(SQLiteDatabase db, String sql) {
        try (Cursor c = db.rawQuery(sql, null)) {
            check(c.moveToFirst(), sql);
            return c.getLong(0);
        }
    }
    private static void checkpoint(SQLiteDatabase db) {
        check(single(db, "PRAGMA wal_checkpoint(TRUNCATE)") == 0, "WAL busy");
    }

    private JSONObject ok(Context ctx, String ns, boolean writing) throws Exception {
        Class<?> info = type(ns + ".c"), part = type(ns + ".a");
        SQLiteOpenHelper h = (SQLiteOpenHelper) type(ns + ".e").getConstructor(Context.class).newInstance(ctx);
        try {
            if (writing) {
                Object task = info.getConstructor(int.class, String.class, File.class, String.class)
                                  .newInstance(71, URL, new File("/local/study"), "diagram.pdf");
                invoke(task, "s", new Class<?>[] {String.class}, "local-etag");
                Constructor<?> block = part.getConstructor(long.class, long.class, long.class);
                invoke(task, "a", new Class<?>[] {part}, block.newInstance(0L, SPLIT, 31L));
                invoke(task, "a", new Class<?>[] {part}, block.newInstance(SPLIT, 140L, 25L));
                invoke(h, "a", new Class<?>[] {info}, task);
                invoke(h, "o", new Class<?>[] {info, int.class, long.class}, task, 1, 75L);
                Object stream = info.getConstructor(int.class, String.class, File.class, String.class)
                                    .newInstance(72, URL + "/stream", new File("/local/study"), null);
                invoke(stream, "a", new Class<?>[] {part}, block.newInstance(0L, -1L, 13L));
                invoke(stream, "r", new Class<?>[] {boolean.class}, true);
                invoke(h, "a", new Class<?>[] {info}, stream);
                invoke(h, "p", new Class<?>[] {String.class, String.class}, URL + "/stream", "first.pdf");
                invoke(h, "p", new Class<?>[] {String.class, String.class}, URL + "/stream", "final.pdf");
                for (int id : new int[] {71, 72}) invoke(h, "j", new Class<?>[] {int.class}, id);
                invoke(h, "i", new Class<?>[] {int.class}, 71);
            }
            SparseArray<?> tasks = (SparseArray<?>) noArgs(h, "h");
            Object task = tasks.get(71), stream = tasks.get(72);
            Object block = invoke(task, "c", new Class<?>[] {int.class}, 1);
            long next = (Long) noArgs(block, "d"), total = (Long) noArgs(task, "j"),
                 done = (Long) noArgs(task, "k");
            long storedStart = single(h.getReadableDatabase(),
                "SELECT start_offset FROM block WHERE breakpoint_id=71 AND block_index=1");
            // Both writers bind long values. Their packaged model constructors read SQLite columns with getInt.
            check(storedStart == SPLIT && next == (int) SPLIT + 75 && total == (int) SPLIT + 140 && done == 106,
                "block readback " + storedStart + " / " + next + " / " + total + " / " + done);
            check((Long) noArgs(stream, "j") == 13 && (Long) noArgs(stream, "k") == 13
                    && (Boolean) noArgs(stream, "m"),
                "chunked stream");
            Map<?,?> names=(Map<?,?>)noArgs(h,"g");
            List<?> dirty = (List<?>) noArgs(h, ns.equals("s1") ? "f" : "c");
            check(dirty.size() == 1 && dirty.contains(72) && "final.pdf".equals(names.get(URL + "/stream")),
                "independent metadata");
            JSONObject out = new JSONObject()
                                 .put("stored_second_block_start", storedStart)
                                 .put("native_second_block_next_byte", next)
                                 .put("native_total_length", total)
                                 .put("downloaded_bytes", done)
                                 .put("chunked_bytes", 13)
                                 .put("response_filename", "final.pdf")
                                 .put("dirty_id", 72);
            // Test the actual migration callback against an isolated database at each entry version.
            for (int target : new int[] {2, 3}) {
                try (SQLiteDatabase scratch = SQLiteDatabase.create(null)) {
                    h.onUpgrade(scratch, 1, target);
                    boolean created =
                        single(scratch,
                            "SELECT COUNT(*) FROM sqlite_master WHERE name='okdownloadResponseFilename'")
                        == 1;
                    check(created == (target == 2), "response filename migration");
                    check(single(scratch, "SELECT COUNT(*) FROM sqlite_master WHERE name='taskFileDirty'") == 1,
                        "dirty migration");
                    out.put("response_filename_table_after_1_to_" + target, created);
                }
            }
            checkpoint(h.getWritableDatabase());
            return out;
        } finally {
            h.close();
        }
    }

    private JSONObject linspirer(Context ctx, boolean writing) throws Exception {
        type("com.huawei.hem.of$b").getField("a").set(null, ctx);
        Class<?> model = type("com.liulishuo.filedownloader.model.FileDownloadModel"),
                 part = type("com.huawei.hem.ng");
        Object store = type("com.huawei.hem.lf").newInstance();
        if (writing) {
            Object m = model.newInstance();
            model.getField("a").setInt(m, 71);
            model.getField("b").set(m, URL);
            model.getField("c").set(m, "/local/study");
            model.getField("d").setBoolean(m, true);
            model.getField("e").set(m, "diagram.pdf");
            ((AtomicLong) model.getField("g").get(m)).set(99L);
            model.getField("k").setInt(m, 2);
            invoke(m, "e", new Class<?>[] {byte.class}, (byte) 3);
            invoke(m, "f", new Class<?>[] {long.class}, SPLIT + 140);
            invoke(store, "h", new Class<?>[] {model}, m);
            for (int index = 0; index < 2; index++) {
                Object connection = part.newInstance();
                part.getField("a").setInt(connection, 71);
                part.getField("b").setInt(connection, index);
                part.getField("c").setLong(connection, index == 0 ? 0L : SPLIT);
                part.getField("d").setLong(connection, index == 0 ? 31L : SPLIT + 25L);
                part.getField("e").setLong(connection, index == 0 ? SPLIT - 1 : -1L);
                invoke(store, "b", new Class<?>[] {part}, connection);
            }
            invoke(store, "k", new Class<?>[] {int.class, int.class, long.class}, 71, 1, SPLIT + 75L);
        }
        Object m = invoke(store, "o", new Class<?>[] {int.class}, 71);
        List<?> connections = (List<?>) invoke(store, "n", new Class<?>[] {int.class}, 71);
        long done = (Long) part.getMethod("a", List.class).invoke(null, connections);
        check(connections.size() == 2 && done == 106 && (Long) noArgs(m, "a") == 99, "connection positions");
        SQLiteOpenHelper h =
            (SQLiteOpenHelper) type("com.huawei.hem.mf").getConstructor(Context.class).newInstance(ctx);
        org.json.JSONArray migrated = new org.json.JSONArray();
        try (SQLiteDatabase scratch = SQLiteDatabase.create(null)) {
            h.onCreate(scratch);
            scratch.execSQL(
                "INSERT INTO filedownloaderConnection VALUES(9,0,0,0,0),(9,1,30,30,0),(9,2,70,70,100)");
            h.onUpgrade(scratch, 3, 4);
            long first =
                single(scratch, "SELECT endOffset FROM filedownloaderConnection WHERE connectionIndex=0");
            long second =
                single(scratch, "SELECT endOffset FROM filedownloaderConnection WHERE connectionIndex=1");
            long third =
                single(scratch, "SELECT endOffset FROM filedownloaderConnection WHERE connectionIndex=2");
            check(first == 0 && second == -1 && third == 100, "end-offset migration");
            migrated.put(first).put(second).put(third);
            checkpoint(h.getWritableDatabase());
        } finally {
            h.close();
        }
        return new JSONObject()
            .put("task_sofar", 99)
            .put("downloaded_across_connections", done)
            .put("second_connection_current", SPLIT + 75L)
            .put("upgrade_3_to_4_end_offsets", migrated);
    }
    @Override
    public void onStart() {
        Bundle result = new Bundle();
        try {
            Context ctx = getTargetContext();
            loader = new DexClassLoader(new File(ctx.getFilesDir(), "target.apk").toString(),
                ctx.getCodeCacheDir().toString(), null, getClass().getClassLoader());
            String ns = opts.getString("namespace");
            boolean writing = "write".equals(opts.getString("phase"));
            JSONObject details = ns.equals("linspirer") ? linspirer(ctx, writing) : ok(ctx, ns, writing);
            details.put("pid", Process.myPid());
            Files.write(new File(ctx.getFilesDir(), "report.json").toPath(),
                details.toString().getBytes(StandardCharsets.UTF_8));
            finish(-1, result);
        } catch (Throwable error) {
            result.putString("error", Log.getStackTraceString(error));
            finish(0, result);
        }
    }
}
