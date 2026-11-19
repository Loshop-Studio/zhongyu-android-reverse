package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p309qc.AbstractC10776g;
import p325rc.AbstractC10967q0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class WorkDatabasePathHelper {
    public static final WorkDatabasePathHelper INSTANCE = new WorkDatabasePathHelper();

    private WorkDatabasePathHelper() {
    }

    @RequiresApi(23)
    private final File getNoBackupPath(Context context) {
        return new File(Api21Impl.INSTANCE.getNoBackupFilesDir(context), WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
    }

    public static final void migrateDatabase(Context context) {
        AbstractC9979u.m20294g(context, "context");
        WorkDatabasePathHelper workDatabasePathHelper = INSTANCE;
        if (workDatabasePathHelper.getDefaultDatabasePath(context).exists()) {
            Logger.get().debug(WorkDatabasePathHelperKt.TAG, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : workDatabasePathHelper.migrationPaths(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        Logger.get().warning(WorkDatabasePathHelperKt.TAG, "Over-writing contents of " + value);
                    }
                    Logger.get().debug(WorkDatabasePathHelperKt.TAG, key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed");
                }
            }
        }
    }

    public final File getDatabasePath(Context context) {
        AbstractC9979u.m20294g(context, "context");
        return getNoBackupPath(context);
    }

    public final File getDefaultDatabasePath(Context context) {
        AbstractC9979u.m20294g(context, "context");
        File databasePath = context.getDatabasePath(WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
        AbstractC9979u.m20293f(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map<File, File> migrationPaths(Context context) {
        AbstractC9979u.m20294g(context, "context");
        File defaultDatabasePath = getDefaultDatabasePath(context);
        File databasePath = getDatabasePath(context);
        String[] strArr = WorkDatabasePathHelperKt.DATABASE_EXTRA_FILES;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC10410o.m21752e(AbstractC10967q0.m24038e(strArr.length), 16));
        for (String str : strArr) {
            Pair pairM22975a = AbstractC10776g.m22975a(new File(defaultDatabasePath.getPath() + str), new File(databasePath.getPath() + str));
            linkedHashMap.put(pairM22975a.m20051f(), pairM22975a.m20052g());
        }
        return AbstractC9925a.m20095o(linkedHashMap, AbstractC10776g.m22975a(defaultDatabasePath, databasePath));
    }
}
