package local.zy.downloadroom;

import android.app.Instrumentation;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import dalvik.system.DexClassLoader;
import org.json.JSONObject;

import java.io.File;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.Arrays;

/** Uses the target APK's factory, DAO, seven-field entity and enum converter. No transfer is scheduled. */
public final class DownloadRoomProbe extends Instrumentation {
    private static final String URL = "https://example.invalid/lesson.pdf";
    private static final String A = "/offline/第一页.pdf", B = "/offline/copy.pdf";
    private static final long TOTAL = 9007199254740993L, PART = 4294967303L;
    private Bundle options;
    private Constructor<?> row;
    private Object[] flags;
    private Object dao;
    private Object work;
    private Method insert, update, find;

    @Override
    public void onCreate(Bundle args) {
        options = args;
        start();
    }

    private void open(Context ctx) throws Exception {
        File target = new File(ctx.getFilesDir(), "target.apk");
        ClassLoader loader = new DexClassLoader(
            target.toString(), ctx.getCodeCacheDir().toString(), null, getClass().getClassLoader());
        Class<?> type = loader.loadClass("com.zykj.download.data.AppDatabase");
        Object db = null;
        for (Field f : type.getDeclaredFields()) {
            if (!Modifier.isStatic(f.getModifiers()) || f.getType().getEnclosingClass() != type)
                continue;
            f.setAccessible(true);
            for (Method m : f.getType().getDeclaredMethods()) {
                if (m.getReturnType() != type
                    || !Arrays.equals(m.getParameterTypes(), new Class<?>[] {Context.class}))
                    continue;
                m.setAccessible(true);
                db = m.invoke(f.get(null), ctx);
                break;
            }
            if (db != null)
                break;
        }
        if (db == null)
            throw new IllegalStateException("Missing original database factory");
        for (Method m : type.getDeclaredMethods()) {
            if (!Modifier.isAbstract(m.getModifiers()) || m.getParameterTypes().length != 0)
                continue;
            dao = m.invoke(db);
            for (Method op : m.getReturnType().getMethods()) {
                Class<?>[] args = op.getParameterTypes();
                if (Arrays.equals(args, new Class<?>[] {String.class, String.class}))
                    find = op;
                else if (args.length == 1 && op.getReturnType() == long.class)
                    insert = op;
                else if (args.length == 1 && op.getReturnType() == void.class)
                    update = op;
            }
            if (find != null)
                break;
        }
        if (insert == null || update == null || find == null)
            throw new AssertionError("DAO signatures");
        Class<?> flag = loader.loadClass("com.zykj.download.DownloadFlag");
        flags = flag.getEnumConstants();
        require(flags.length == 2 && ((Enum<?>) flags[0]).name().equals("DOWNLOADING")
                && ((Enum<?>) flags[1]).name().equals("DOWNLOAD_SUCCESS"),
            "enum");
        row = find.getReturnType().getConstructor(
            int.class, String.class, String.class, long.class, long.class, String.class, flag);
        Class<?> proxy = loader.loadClass("com.zykj.download.work.DownloadFileWorkProxy");
        for (Constructor<?> c : proxy.getConstructors()) {
            if (c.getParameterTypes().length == 3)
                work = c.newInstance(ctx, db, null);
        }
    }
    private Object entity(int id, String path, long size, long done, String code, int flag) throws Exception {
        return row.newInstance(id, URL, path, size, done, code, flags[flag]);
    }
    private Object find(String path) throws Exception {
        return find.invoke(dao, URL, path);
    }
    private static void require(boolean ok, String why) {
        if (!ok)
            throw new AssertionError(why);
    }
    private Object call(String name, Object... args) throws Exception {
        for (Method method : work.getClass().getDeclaredMethods()) {
            if (method.getName().equals(name) && method.getParameterTypes().length == args.length)
                return method.invoke(work, args);
        }
        throw new NoSuchMethodException(name);
    }
    private JSONObject exerciseFiles(Context ctx) throws Exception {
        File sample = new File(ctx.getFilesDir(), "local-page.pdf");
        String path = sample.toString();
        byte[] bytes = "Offline teaching handout".getBytes(StandardCharsets.UTF_8);
        String digest = android.util.Base64.encodeToString(
            MessageDigest.getInstance("MD5").digest(bytes), android.util.Base64.NO_WRAP);
        require(call("checkDownloadSuccess", URL, sample, null) == null, "no row accepted");
        Object taskRow = call("checkRecord", URL, sample, null);
        require(entity(3, path, 0, 0, null, 0).equals(taskRow), "new record");
        call("updateTotalSize", taskRow, 100L, null);
        call("updateDownloadSize", taskRow, 13L, null);
        call("updateVerifyCode", taskRow, digest, null);
        Files.write(sample.toPath(), bytes);
        require(
            entity(3, path, 100, 13, digest, 0).equals(call("checkRecord", URL, sample, null)), "in progress");
        require(call("checkDownloadSuccess", URL, sample, null) == null, "unfinished record accepted");
        require(sample.delete(), "test file removal");
        taskRow = call("checkRecord", URL, sample, null);
        require(entity(3, path, 0, 0, digest, 0).equals(taskRow), "missing partial record");
        Files.write(sample.toPath(), bytes);
        call("updateTotalSize", taskRow, (long) bytes.length, null);
        call("updateDownloadSize", taskRow, (long) bytes.length, null);
        call("updateFlag", taskRow, flags[1], null);
        require(path.equals(call("checkDownloadSuccess", URL, sample, null)), "local checksum");
        require(taskRow.equals(call("checkRecord", URL, sample, null)), "valid completed record");
        byte[] changed = bytes.clone();
        changed[0] ^= 1;
        Files.write(sample.toPath(), changed);
        require(
            call("checkDownloadSuccess", URL, sample, null) == null && sample.exists(), "lookup modified file");
        taskRow = call("checkRecord", URL, sample, null);
        require(
            !sample.exists() && entity(3, path, 0, 0, digest, 0).equals(taskRow) && taskRow.equals(find(path)),
            "changed file recovery");
        call("updateFlag", taskRow, flags[1], null);
        taskRow = call("checkRecord", URL, sample, null);
        require(entity(3, path, 0, 0, digest, 0).equals(taskRow) && taskRow.equals(find(path)),
            "missing completed file");
        return new JSONObject()
            .put("payload_bytes", bytes.length)
            .put("base64_md5", digest)
            .put("no_task_creates_id", 3)
            .put("existing_partial_stored_bytes", 13)
            .put("changed_same_size_file_retained_by_lookup", true)
            .put("changed_file_removed_by_checkRecord", true)
            .put("missing_partial_resets_sizes", true)
            .put("missing_complete_resets_flag", true)
            .put("reset_keeps_checksum", true);
    }
    @Override
    public void onStart() {
        Bundle result = new Bundle();
        try {
            Context ctx = getTargetContext();
            open(ctx);
            JSONObject out = new JSONObject()
                                 .put("pid", Process.myPid())
                                 .put("entity", row.getDeclaringClass().getName())
                                 .put("dao", dao.getClass().getName());
            if ("files".equals(options.getString("phase")))
                out.put("local_file_checks", exerciseFiles(ctx));
            if ("write".equals(options.getString("phase"))) {
                require(find(A) == null, "initial lookup");
                long first = (Long) insert.invoke(dao, entity(0, A, TOTAL, PART, null, 0));
                long second = (Long) insert.invoke(dao, entity(0, B, 1000, 0, null, 0));
                require(first == 1 && second == 2, "autoincrement");
                require(entity(1, A, TOTAL, PART, null, 0).equals(find(A)), "in-progress lookup");
                update.invoke(dao, entity(1, A, TOTAL, TOTAL, "local-check", 1));
                // Write a fixed ID again through the real INSERT OR REPLACE binding.
                require(
                    (Long) insert.invoke(dao, entity(2, B, 123456789012L, PART, null, 0)) == 2, "replaced id");
                update.invoke(dao, entity(97, "/does-not-exist", 0, 0, null, 0));
                require(find("/does-not-exist") == null, "missing update created a row");
                out.put("initial_partial_bytes", PART)
                    .put("insert_ids", new org.json.JSONArray().put(first).put(second));
            }
            require(entity(1, A, TOTAL, TOTAL, "local-check", 1).equals(find(A)), "completed record");
            require(entity(2, B, 123456789012L, PART, null, 0).equals(find(B)), "separate path");
            require(find.invoke(dao, URL + "?different", A) == null, "combined lookup");
            File file = ctx.getDatabasePath("download.db");
            try (SQLiteDatabase sql =
                     SQLiteDatabase.openDatabase(file.toString(), null, SQLiteDatabase.OPEN_READWRITE);
                Cursor checkpoint = sql.rawQuery("PRAGMA wal_checkpoint(TRUNCATE)", null)) {
                require(checkpoint.moveToFirst() && checkpoint.getInt(0) == 0, "checkpoint busy");
            }
            out.put("complete_and_partial_rows_verified", true).put("combined_lookup_verified", true);
            Files.write(new File(ctx.getFilesDir(), "report.json").toPath(),
                out.toString().getBytes(StandardCharsets.UTF_8));
            finish(-1, result);
        } catch (Throwable error) {
            result.putString("error", Log.getStackTraceString(error));
            finish(0, result);
        }
    }
}
