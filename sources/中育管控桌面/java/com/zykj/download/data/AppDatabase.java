package com.zykj.download.data;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p018b3.AbstractC4417e;
import p018b3.C4413a;
import p018b3.C4414b;
import p018b3.InterfaceC4415c;

@TypeConverters({C4413a.class})
@Database(entities = {C4414b.class, AbstractC4417e.class}, exportSchema = false, version = 1)
@Metadata(m7879d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m7880d2 = {"Lcom/zykj/download/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lb3/c;", "i", "()Lb3/c;", "a", "download_release"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public abstract class AppDatabase extends RoomDatabase {

    /* renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b */
    public static volatile AppDatabase f5648b;

    /* renamed from: com.zykj.download.data.AppDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AppDatabase m4995a(Context context) {
            RoomDatabase roomDatabaseBuild = Room.databaseBuilder(context, AppDatabase.class, "download.db").build();
            Intrinsics.checkNotNullExpressionValue(roomDatabaseBuild, "databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()");
            return (AppDatabase) roomDatabaseBuild;
        }

        /* renamed from: b */
        public final AppDatabase m4996b(Context context) {
            AppDatabase appDatabaseM4995a;
            Intrinsics.checkNotNullParameter(context, "context");
            AppDatabase appDatabase = AppDatabase.f5648b;
            if (appDatabase != null) {
                return appDatabase;
            }
            synchronized (this) {
                appDatabaseM4995a = AppDatabase.f5648b;
                if (appDatabaseM4995a == null) {
                    appDatabaseM4995a = AppDatabase.INSTANCE.m4995a(context);
                    AppDatabase.f5648b = appDatabaseM4995a;
                }
            }
            return appDatabaseM4995a;
        }

        public Companion() {
        }
    }

    /* renamed from: i */
    public abstract InterfaceC4415c mo4994i();
}
