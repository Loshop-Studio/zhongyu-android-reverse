package com.zykj.download.data;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p096f3.C8431a;
import p096f3.InterfaceC8432b;

@TypeConverters({C8431a.class})
@Database(entities = {DownloadEntity.class, UploadEntity.class}, exportSchema = false, version = 1)
/* loaded from: classes4.dex */
public abstract class AppDatabase extends RoomDatabase {

    /* renamed from: a */
    public static final C7278a f9614a = new C7278a(null);

    /* renamed from: b */
    public static volatile AppDatabase f9615b;

    /* renamed from: com.zykj.download.data.AppDatabase$a */
    public static final class C7278a {
        public /* synthetic */ C7278a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final AppDatabase m9173a(Context context) {
            RoomDatabase roomDatabaseBuild = Room.databaseBuilder(context, AppDatabase.class, "download.db").build();
            AbstractC9133u.m16132f(roomDatabaseBuild, "databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()");
            return (AppDatabase) roomDatabaseBuild;
        }

        /* renamed from: b */
        public final AppDatabase m9174b(Context context) {
            AppDatabase appDatabaseM9173a;
            AbstractC9133u.m16133g(context, "context");
            AppDatabase appDatabase = AppDatabase.f9615b;
            if (appDatabase != null) {
                return appDatabase;
            }
            synchronized (this) {
                appDatabaseM9173a = AppDatabase.f9615b;
                if (appDatabaseM9173a == null) {
                    appDatabaseM9173a = AppDatabase.f9614a.m9173a(context);
                    AppDatabase.f9615b = appDatabaseM9173a;
                }
            }
            return appDatabaseM9173a;
        }

        public C7278a() {
        }
    }

    /* renamed from: i */
    public abstract InterfaceC8432b mo9172i();
}
