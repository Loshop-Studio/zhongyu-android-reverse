package local.zy.pdfprogress;

import android.app.Instrumentation;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/** Run both shipped Room DAOs against local, synthetic PDF reading positions. */
public final class PdfProgressProbe extends Instrumentation {
    private static final String A = "/offline/甲组/讲义'一.pdf";
    private static final String B = "/offline/乙组/讲义'一.pdf";
    private static final String MISSING = "/offline/甲组/./讲义'一.pdf";
    private Bundle options;
    private ClassLoader loader;
    private Object room, dao, empty, suspended;
    private Constructor<?> row;
    private Method insert, query, throwOnFailure;

    @Override
    public void onCreate(Bundle arguments) {
        options = arguments;
        start();
    }

    private Class<?> type(String name) throws Exception {
        return loader.loadClass(name);
    }

    private static void check(boolean match, String description) {
        if (!match)
            throw new AssertionError(description);
    }

    private void connect(Context ctx, Class<?> dbClass, boolean cloud) throws Exception {
        Object factory = dbClass.getField(cloud ? "a" : "Companion").get(null);
        room = factory.getClass().getMethod(cloud ? "a" : "getInstance", Context.class).invoke(factory, ctx);
        dao = dbClass.getMethod(cloud ? "t" : "pdfDao").invoke(room);
        Class<?> entity =
            type(cloud ? "com.friday.common.entity.PdfEntity" : "com.zykj.study.data.PdfEntity");
        Class<?> continuation = type(cloud ? "vc.c" : "m7.c");
        row = entity.getConstructor(String.class, int.class, int.class);
        insert = dao.getClass().getMethod(cloud ? "a" : "insertPdf", entity, continuation);
        query = dao.getClass().getMethod(cloud ? "b" : "queryPdf", String.class, continuation);
        empty = type("kotlin.coroutines.EmptyCoroutineContext").getField(cloud ? "c" : "a").get(null);
        suspended = type(cloud ? "wc.a" : "n7.a").getMethod("f").invoke(null);
        throwOnFailure = type("kotlin.b").getMethod("b", Object.class);
    }

    private Object await(Method method, Object arg) throws Exception {
        Class<?> continuation = method.getParameterTypes()[1];
        CountDownLatch done = new CountDownLatch(1);
        Object[] result = {null};
        Object listener = Proxy.newProxyInstance(loader, new Class<?>[] {continuation}, (p, m, a) -> {
            switch (m.getName()) {
                case "getContext":
                    return empty;
                case "resumeWith":
                    result[0] = a[0];
                    done.countDown();
                    return null;
                default:
                    throw new UnsupportedOperationException(m.getName());
            }
        });
        Object value = method.invoke(dao, arg, listener);
        if (value != suspended)
            return value;
        check(done.await(15, TimeUnit.SECONDS), "timed out waiting for " + method.getName());
        throwOnFailure.invoke(null, result[0]);
        return result[0];
    }

    // Supply the original ViewModel with the original DAO instead of starting the
    // application's navigation and login UI. Dispatch on the UI thread as PDFView does.
    private void pageChanged(boolean cloud, String path, int page, int count) throws Exception {
        Throwable[] errors = {null};
        runOnMainSync(() -> {
            try {
                Class<?> fragmentClass = type(cloud ? "com.friday.document.view.preview.PdfPreviewFragment"
                                                    : "com.zykj.study.ui.PdfFragment");
                Class<?> modelClass = type(cloud ? "com.friday.document.viewmodel.PdfViewerViewModel"
                                                 : "com.zykj.study.viewmodels.PDFViewModel");
                Object fragment = fragmentClass.getConstructor().newInstance();
                Bundle args = new Bundle();
                args.putString(cloud ? "filePath" : "path", path);
                fragmentClass.getMethod("setArguments", Bundle.class).invoke(fragment, args);
                Object model = modelClass.getConstructors()[0].newInstance(dao);
                Field delegate = fragmentClass.getDeclaredField(cloud ? "i" : "f");
                delegate.setAccessible(true);
                delegate.set(fragment,
                    type("kotlin.InitializedLazyImpl").getConstructor(Object.class).newInstance(model));
                fragmentClass.getMethod(cloud ? "k" : "c", int.class, int.class)
                    .invoke(fragment, page, count);
            } catch (Throwable error) {
                errors[0] = error;
            }
        });
        if (errors[0] != null)
            throw new IllegalStateException("page callback failed", errors[0]);
        Object wanted = row.newInstance(path, page, count);
        long deadline = SystemClock.elapsedRealtime() + 10000;
        while (!wanted.equals(await(query, path))) {
            check(SystemClock.elapsedRealtime() < deadline, "original page callback did not persist");
            SystemClock.sleep(20);
        }
    }

    private JSONObject expect(String path, int page, int count) throws Exception {
        Object item = await(query, path);
        check(item != null && item.equals(row.newInstance(path, page, count)),
            "wrong reading position for " + path);
        return new JSONObject()
            .put("path", item.getClass().getMethod("getId").invoke(item))
            .put("current_page_index", item.getClass().getMethod("getCurrentPage").invoke(item))
            .put("page_count", item.getClass().getMethod("getPageCount").invoke(item));
    }

    private static String scalar(SQLiteDatabase db, String sql) {
        try (Cursor cursor = db.rawQuery(sql, null)) {
            check(cursor.moveToFirst(), sql);
            return cursor.getString(0);
        }
    }

    private JSONObject migration(Class<?> dbClass, boolean cloud) throws Exception {
        // Isolate this migration from other app tables. The actual Room factory above
        // separately validates and opens its complete current schema.
        Field field = dbClass.getDeclaredField(cloud ? "l" : "MIGRATION_1_2");
        field.setAccessible(true);
        Object migration = field.get(null);
        try (SQLiteDatabase sqlite = SQLiteDatabase.create(null)) {
            sqlite.execSQL("CREATE TABLE prior(value TEXT NOT NULL)");
            sqlite.execSQL("INSERT INTO prior VALUES ('kept')");
            Object wrapper = type("androidx.sqlite.db.framework.FrameworkSQLiteDatabase")
                                 .getConstructor(SQLiteDatabase.class)
                                 .newInstance(sqlite);
            Method migrate =
                migration.getClass().getMethod("migrate", type("androidx.sqlite.db.SupportSQLiteDatabase"));
            migrate.setAccessible(true);
            migrate.invoke(migration, wrapper);
            return new JSONObject()
                .put("from", cloud ? 10 : 1)
                .put("to", cloud ? 11 : 2)
                .put("previous_row", scalar(sqlite, "SELECT value FROM prior"))
                .put("pdf_ddl", scalar(sqlite, "SELECT sql FROM sqlite_master WHERE name='PdfEntity'"));
        }
    }

    private JSONObject exercise() throws Exception {
        boolean cloud = options.getString("app").equals("cloud");
        boolean writing = options.getString("phase").equals("write");
        Context ctx = getTargetContext();
        loader = new DexClassLoader(new File(ctx.getFilesDir(), "target.apk") + File.pathSeparator
                + new File(ctx.getFilesDir(), "recovered.jar"),
            ctx.getCodeCacheDir().toString(), null, getClass().getClassLoader());
        Class<?> dbClass = type(cloud ? "com.friday.common.MyDataBase" : "com.zykj.study.data.AppDatabase");
        connect(ctx, dbClass, cloud);
        JSONObject result = new JSONObject().put("pid", Process.myPid());
        try {
            if (writing) {
                check(await(query, A) == null, "new database should have no reading position");
                await(insert, row.newInstance(A, 0, 12));
                result.put("first_open", expect(A, 0, 12));
                pageChanged(cloud, B, 0, 3);
                pageChanged(cloud, A, 7, 12);
                result.put("fragment_callbacks", 2);
            }
            check(await(query, MISSING) == null, "DAO equated two different path strings");
            result.put("different_spelling_missing", true);
            result.put("positions", new JSONArray().put(expect(A, 7, 12)).put(expect(B, 0, 3)));
        } finally {
            room.getClass().getMethod("close").invoke(room);
        }
        if (writing)
            result.put("migration", migration(dbClass, cloud));
        if (writing)
            result.put("dispatch_cases", new PdfDispatchCases(loader, cloud).verify());
        return result;
    }

    @Override
    public void onStart() {
        Bundle outcome = new Bundle();
        try {
            JSONObject result = exercise();
            Files.write(new File(getTargetContext().getFilesDir(), "result.json").toPath(),
                result.toString().getBytes(StandardCharsets.UTF_8));
            finish(-1, outcome);
        } catch (Throwable error) {
            outcome.putString("error", Log.getStackTraceString(error));
            finish(0, outcome);
        }
    }
}
