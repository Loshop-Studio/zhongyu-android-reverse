package androidx.sqlite.p019db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;

/* loaded from: classes3.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    public static abstract class Callback {
        public static final Companion Companion = new Companion(null);
        private static final String TAG = "SupportSQLite";
        public final int version;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            private Companion() {
            }
        }

        public Callback(int i10) {
            this.version = i10;
        }

        private final void deleteDatabaseFile(String str) {
            if (AbstractC10819z.m23230C(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = AbstractC9979u.m20296i(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w(TAG, "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w(TAG, "delete failed: ", e10);
            }
        }

        public void onConfigure(SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
        }

        public void onCorruption(SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            Log.e(TAG, "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String path = db2.getPath();
                if (path != null) {
                    deleteDatabaseFile(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = db2.getAttachedDbs();
                } catch (SQLiteException unused) {
                }
                try {
                    db2.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            } finally {
                if (attachedDbs != null) {
                    Iterator<T> it = attachedDbs.iterator();
                    while (it.hasNext()) {
                        Object second = ((Pair) it.next()).second;
                        AbstractC9979u.m20293f(second, "second");
                        deleteDatabaseFile((String) second);
                    }
                } else {
                    String path2 = db2.getPath();
                    if (path2 != null) {
                        deleteDatabaseFile(path2);
                    }
                }
            }
        }

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onDowngrade(SupportSQLiteDatabase db2, int i10, int i11) {
            AbstractC9979u.m20294g(db2, "db");
            throw new SQLiteException("Can't downgrade database from version " + i10 + " to " + i11);
        }

        public void onOpen(SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
        }

        public abstract void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i10, int i11);
    }

    public interface Factory {
        SupportSQLiteOpenHelper create(Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    SupportSQLiteDatabase getReadableDatabase();

    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);

    public static final class Configuration {
        public static final Companion Companion = new Companion(null);
        public final boolean allowDataLossOnRecovery;
        public final Callback callback;
        public final Context context;
        public final String name;
        public final boolean useNoBackupDirectory;

        public static class Builder {
            private boolean allowDataLossOnRecovery;
            private Callback callback;
            private final Context context;
            private String name;
            private boolean useNoBackupDirectory;

            public Builder(Context context) {
                AbstractC9979u.m20294g(context, "context");
                this.context = context;
            }

            public Builder allowDataLossOnRecovery(boolean z10) {
                this.allowDataLossOnRecovery = z10;
                return this;
            }

            public Configuration build() {
                String str;
                Callback callback = this.callback;
                if (callback == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.useNoBackupDirectory && ((str = this.name) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new Configuration(this.context, this.name, callback, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
            }

            public Builder callback(Callback callback) {
                AbstractC9979u.m20294g(callback, "callback");
                this.callback = callback;
                return this;
            }

            public Builder name(String str) {
                this.name = str;
                return this;
            }

            public Builder noBackupDirectory(boolean z10) {
                this.useNoBackupDirectory = z10;
                return this;
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public final Builder builder(Context context) {
                AbstractC9979u.m20294g(context, "context");
                return new Builder(context);
            }

            private Companion() {
            }
        }

        public Configuration(Context context, String str, Callback callback, boolean z10, boolean z11) {
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(callback, "callback");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z10;
            this.allowDataLossOnRecovery = z11;
        }

        public static final Builder builder(Context context) {
            return Companion.builder(context);
        }

        public /* synthetic */ Configuration(Context context, String str, Callback callback, boolean z10, boolean z11, int i10, AbstractC9972n abstractC9972n) {
            this(context, str, callback, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
        }
    }
}
