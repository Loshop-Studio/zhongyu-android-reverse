package com.zykj.download.data;

import android.content.Context;
import androidx.room.AbstractC0621h0;
import androidx.room.C0619g0;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p162v1.InterfaceC3420c;

/* loaded from: classes.dex */
public abstract class AppDatabase extends AbstractC0621h0 {

    /* renamed from: n */
    @NotNull
    public static final C2375a f9701n = new C2375a(null);

    /* renamed from: o */
    @Nullable
    private static volatile AppDatabase f9702o;

    /* renamed from: com.zykj.download.data.AppDatabase$a */
    public static final class C2375a {
        private C2375a() {
        }

        public /* synthetic */ C2375a(C2764g c2764g) {
            this();
        }

        /* renamed from: a */
        private final AppDatabase m7976a(Context context) {
            AbstractC0621h0 abstractC0621h0M3562d = C0619g0.m3527a(context, AppDatabase.class, "download.db").m3562d();
            C2769l.m9240d(abstractC0621h0M3562d, "databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()");
            return (AppDatabase) abstractC0621h0M3562d;
        }

        @NotNull
        /* renamed from: b */
        public final AppDatabase m7977b(@NotNull Context context) {
            C2769l.m9241e(context, "context");
            AppDatabase appDatabase = AppDatabase.f9702o;
            if (appDatabase == null) {
                synchronized (this) {
                    appDatabase = AppDatabase.f9702o;
                    if (appDatabase == null) {
                        AppDatabase appDatabaseM7976a = AppDatabase.f9701n.m7976a(context);
                        AppDatabase.f9702o = appDatabaseM7976a;
                        appDatabase = appDatabaseM7976a;
                    }
                }
            }
            return appDatabase;
        }
    }

    @NotNull
    /* renamed from: E */
    public abstract InterfaceC3420c mo7975E();
}
