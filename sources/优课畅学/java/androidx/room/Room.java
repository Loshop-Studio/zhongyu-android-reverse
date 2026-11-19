package androidx.room;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.RoomDatabase;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p113g8.AbstractC8661c0;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class Room {
    public static final Room INSTANCE = new Room();
    public static final String LOG_TAG = "ROOM";
    public static final String MASTER_TABLE_NAME = "room_master_table";

    private Room() {
    }

    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(Context context, Class<T> klass, String str) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(klass, "klass");
        if (str == null || AbstractC8661c0.m13993h0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (AbstractC9133u.m16128b(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new RoomDatabase.Builder<>(context, klass, str);
    }

    public static /* synthetic */ RoomDatabase.Builder databaseBuilder$default(Room room, Context context, String name, InterfaceC10559a factory, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            AbstractC9133u.m16138l();
            factory = C45223.INSTANCE;
        }
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(factory, "factory");
        if (AbstractC8661c0.m13993h0(name)) {
            throw new IllegalArgumentException("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        if (AbstractC9133u.m16128b(name, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new RoomDatabase.Builder(AbstractC9137y.m16154b(RoomDatabase.class), name, factory, context);
    }

    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, Class<T> klass) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(klass, "klass");
        return new RoomDatabase.Builder<>(context, klass, null);
    }

    public static /* synthetic */ RoomDatabase.Builder inMemoryDatabaseBuilder$default(Room room, Context context, InterfaceC10559a factory, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            AbstractC9133u.m16138l();
            factory = C45231.INSTANCE;
        }
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(factory, "factory");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new RoomDatabase.Builder(AbstractC9137y.m16154b(RoomDatabase.class), null, factory, context);
    }

    public final /* synthetic */ <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, InterfaceC10559a factory) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(factory, "factory");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new RoomDatabase.Builder<>(AbstractC9137y.m16154b(RoomDatabase.class), null, factory, context);
    }

    public final /* synthetic */ <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(Context context, String name, InterfaceC10559a factory) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(factory, "factory");
        if (!AbstractC8661c0.m13993h0(name)) {
            if (!AbstractC9133u.m16128b(name, ":memory:")) {
                AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
                return new RoomDatabase.Builder<>(AbstractC9137y.m16154b(RoomDatabase.class), name, factory, context);
            }
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        throw new IllegalArgumentException("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
    }
}
