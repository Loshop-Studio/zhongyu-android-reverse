package com.tencent.bugly.proguard;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;

/* renamed from: com.tencent.bugly.proguard.o */
/* loaded from: classes5.dex */
public abstract class AbstractC7829o {

    /* renamed from: id */
    public int f14075id;
    public String moduleName;
    public String version;
    public String versionKey;

    public abstract String[] getTables();

    public abstract void init(Context context, boolean z10, BuglyStrategy buglyStrategy);

    public void onDbCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onDbDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (getTables() == null) {
                return;
            }
            for (String str : getTables()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(str)));
            }
            onDbCreate(sQLiteDatabase);
        } catch (Throwable th) {
            if (C7779al.m10616b(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public void onDbUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (getTables() == null) {
                return;
            }
            for (String str : getTables()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(str)));
            }
            onDbCreate(sQLiteDatabase);
        } catch (Throwable th) {
            if (C7779al.m10616b(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public void onServerStrategyChanged(StrategyBean strategyBean) {
    }
}
