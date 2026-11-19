package com.tencent.bugly.proguard;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;

/* renamed from: com.tencent.bugly.proguard.o */
/* loaded from: classes4.dex */
public abstract class AbstractC6464o {

    /* renamed from: id */
    public int f5633id;
    public String moduleName;
    public String version;
    public String versionKey;

    public abstract String[] getTables();

    public abstract void init(Context context, boolean z9, BuglyStrategy buglyStrategy);

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
            if (C6414al.m4926b(th)) {
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
            if (C6414al.m4926b(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public void onServerStrategyChanged(StrategyBean strategyBean) {
    }
}
