package com.zykj.download.data;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p283w5.AbstractC9830e;
import p283w5.C9826a;
import p283w5.C9827b;
import p283w5.InterfaceC9828c;

@TypeConverters({C9826a.class})
@Database(entities = {C9827b.class, AbstractC9830e.class}, exportSchema = false, version = 1)
@Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m13413d2 = {"Lcom/zykj/download/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lw5/c;", "i", "()Lw5/c;", "a", "download_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public abstract class AppDatabase extends RoomDatabase {

    /* renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b */
    public static volatile AppDatabase f9888b;

    /* renamed from: com.zykj.download.data.AppDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AppDatabase m9796a(Context context) {
            RoomDatabase roomDatabaseBuild = Room.databaseBuilder(context, AppDatabase.class, "download.db").build();
            Intrinsics.checkNotNullExpressionValue(roomDatabaseBuild, "databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()");
            return (AppDatabase) roomDatabaseBuild;
        }

        /* renamed from: b */
        public final AppDatabase m9797b(Context context) {
            AppDatabase appDatabaseM9796a;
            Intrinsics.checkNotNullParameter(context, "context");
            AppDatabase appDatabase = AppDatabase.f9888b;
            if (appDatabase != null) {
                return appDatabase;
            }
            synchronized (this) {
                appDatabaseM9796a = AppDatabase.f9888b;
                if (appDatabaseM9796a == null) {
                    appDatabaseM9796a = AppDatabase.INSTANCE.m9796a(context);
                    AppDatabase.f9888b = appDatabaseM9796a;
                }
            }
            return appDatabaseM9796a;
        }

        public Companion() {
        }
    }

    /* renamed from: i */
    public abstract InterfaceC9828c mo9795i();
}
