package com.zykj.download.data;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p407xa.AbstractC11820e;
import p407xa.C11816a;
import p407xa.C11817b;
import p407xa.InterfaceC11818c;

@TypeConverters({C11816a.class})
@Database(entities = {C11817b.class, AbstractC11820e.class}, exportSchema = false, version = 1)
/* loaded from: classes6.dex */
public abstract class AppDatabase extends RoomDatabase {

    /* renamed from: a */
    public static final C8558a f19607a = new C8558a(null);

    /* renamed from: b */
    public static volatile AppDatabase f19608b;

    /* renamed from: com.zykj.download.data.AppDatabase$a */
    public static final class C8558a {
        public /* synthetic */ C8558a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final AppDatabase m16500a(Context context) {
            RoomDatabase roomDatabaseBuild = Room.databaseBuilder(context, AppDatabase.class, "download.db").build();
            AbstractC9979u.m20293f(roomDatabaseBuild, "databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()");
            return (AppDatabase) roomDatabaseBuild;
        }

        /* renamed from: b */
        public final AppDatabase m16501b(Context context) {
            AppDatabase appDatabaseM16500a;
            AbstractC9979u.m20294g(context, "context");
            AppDatabase appDatabase = AppDatabase.f19608b;
            if (appDatabase != null) {
                return appDatabase;
            }
            synchronized (this) {
                appDatabaseM16500a = AppDatabase.f19608b;
                if (appDatabaseM16500a == null) {
                    appDatabaseM16500a = AppDatabase.f19607a.m16500a(context);
                    AppDatabase.f19608b = appDatabaseM16500a;
                }
            }
            return appDatabaseM16500a;
        }

        public C8558a() {
        }
    }

    /* renamed from: i */
    public abstract InterfaceC11818c mo16499i();
}
