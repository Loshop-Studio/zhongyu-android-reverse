import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.json.JSONArray;
import org.json.JSONObject;

/** Describe schemas in a process-local database using classes from one original APK. */
public final class SqlSchemaProbe {
    private static final String MIGRATION = "androidx.work.impl.WorkDatabase_AutoMigration_13_14_Impl";

    public static void main(String[] args) throws Exception {
        Thread.setDefaultUncaughtExceptionHandler((thread, error) -> {
            error.printStackTrace(System.err);
            System.exit(1);
        });
        Looper.prepare();
        JSONObject result = new JSONObject();
        try (SQLiteDatabase db = SQLiteDatabase.create(null)) {
            if (args[0].equals("okgo")) {
                Class<?> helper = Class.forName("d7.c");
                SQLiteOpenHelper instance = (SQLiteOpenHelper) helper.getConstructor(Context.class).newInstance((Context)null);
                instance.onCreate(db);
            } else if (args[0].equals("migration")) {
                Class<?> iface = Class.forName("androidx.sqlite.db.SupportSQLiteDatabase");
                Class<?> migration = Class.forName(MIGRATION);
                JSONArray statements = new JSONArray();
                Object bridge = Proxy.newProxyInstance(iface.getClassLoader(), new Class<?>[]{iface}, (self, method, values) -> {
                    if (!"execSQL".equals(method.getName())) throw new IllegalStateException(method.toString());
                    String sql = (String) values[0];
                    db.execSQL(sql);
                    statements.put(sql);
                    // An empty input table with all columns used in the copy lets the
                    // original migration run its INSERT, DROP, RENAME and index DDL.
                    if (statements.length() == 1) db.execSQL("CREATE TABLE WorkSpec AS SELECT * FROM _new_WorkSpec WHERE 0");
                    return null;
                });
                Constructor<?> ctor = migration.getDeclaredConstructor();
                ctor.setAccessible(true);
                Method apply = migration.getMethod("migrate", iface);
                apply.setAccessible(true);
                apply.invoke(ctor.newInstance(), bridge);
                result.put("statements", statements);
            } else if (args[0].equals("tbs-audio")) {
                tbsAudio(db, result);
            } else if (args[0].equals("history")) {
                Class<?> owner = Class.forName("com.loc.ef");
                Field field = owner.getDeclaredField("k");
                field.setAccessible(true);
                String suffix = (String)field.get(owner.getConstructor().newInstance());
                if (!suffix.matches("[0-9]+")) throw new IllegalStateException("Unexpected table suffix");
                // Both literals come from the original method, around the runtime field.
                db.execSQL(args[1] + suffix + args[2]);
                result.put("table_suffix",suffix);
            } else throw new IllegalArgumentException(args[0]);
            JSONArray objects = new JSONArray();
            try (Cursor c = db.rawQuery("SELECT type,name,sql FROM sqlite_master WHERE sql IS NOT NULL AND name NOT LIKE 'sqlite_%' AND name <> 'android_metadata' ORDER BY type,name", null)) {
                while (c.moveToNext()) objects.put(new JSONObject().put("type", c.getString(0))
                    .put("name", c.getString(1)).put("sql", c.getString(2)));
            }
            result.put("objects", objects);
        }
        System.out.println(result);
    }

    private static void tbsAudio(SQLiteDatabase db, JSONObject result) throws Exception {
        Class<?> owner = Class.forName("com.tencent.smtt.audio.core.db.DBManager");
        Object manager = owner.getConstructor(Context.class).newInstance((Context) null);
        Field field = owner.getDeclaredField("helper");
        field.setAccessible(true);
        SQLiteOpenHelper helper = (SQLiteOpenHelper) field.get(manager);
        result.put("database", helper.getDatabaseName());
        String table = "TBS_AUDIO_LAST_LIST";
        helper.onCreate(db);
        String columns;
        try (Cursor fresh = db.rawQuery("SELECT * FROM " + table, null)) {
            columns = String.join(",", fresh.getColumnNames());
        }
        result.put("fresh_columns", columns);
        db.execSQL("DROP TABLE " + table);
        db.execSQL("CREATE TABLE " + table + "(ID INTEGER PRIMARY KEY, ORIGIN_URL TEXT, AUDIO_SRC TEXT,"
            + " TITLE TEXT, ARTIST TEXT, LAST_PLAY_TIME INTEGER, VALID INTEGER, TOTAL_TIME INTEGER)");
        db.execSQL("INSERT INTO " + table + " VALUES(43,'local:lesson','local:audio','本地试听','示例',12345,1,9876)");
        helper.onUpgrade(db, 1, 2);
        try (Cursor c = db.rawQuery("SELECT * FROM " + table, null)) {
            if (!columns.equals(String.join(",", c.getColumnNames())) || !c.moveToFirst())
                throw new IllegalStateException("Missing migrated schema or row");
            JSONObject row = new JSONObject();
            for (int i = 0; i < c.getColumnCount(); ++i) {
                Object value;
                if (c.isNull(i)) value = JSONObject.NULL;
                else if (c.getType(i) == Cursor.FIELD_TYPE_INTEGER) value = c.getLong(i);
                else value = c.getString(i);
                row.put(c.getColumnName(i), value);
            }
            result.put("v1_fixture_id", 43).put("migrated_row", row);
            if (c.moveToNext()) throw new IllegalStateException("Unexpected second row");
        }
    }
}
