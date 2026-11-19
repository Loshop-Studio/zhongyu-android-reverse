package androidx.room;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.RoomDatabase;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p310qd.AbstractC10793c0;

/* loaded from: classes3.dex */
public final class Room {
    public static final Room INSTANCE = new Room();
    public static final String LOG_TAG = "ROOM";
    public static final String MASTER_TABLE_NAME = "room_master_table";

    private Room() {
    }

    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(Context context, Class<T> klass, String str) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(klass, "klass");
        if (str == null || AbstractC10793c0.m23132h0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (AbstractC9979u.m20289b(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new RoomDatabase.Builder<>(context, klass, str);
    }

    public static /* synthetic */ RoomDatabase.Builder databaseBuilder$default(Room room, Context context, String name, InterfaceC9529a factory, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            AbstractC9979u.m20299l();
            factory = C44703.INSTANCE;
        }
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(factory, "factory");
        if (AbstractC10793c0.m23132h0(name)) {
            throw new IllegalArgumentException("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        if (AbstractC9979u.m20289b(name, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new RoomDatabase.Builder(AbstractC9983y.m20315b(RoomDatabase.class), name, factory, context);
    }

    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, Class<T> klass) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(klass, "klass");
        return new RoomDatabase.Builder<>(context, klass, null);
    }

    public static /* synthetic */ RoomDatabase.Builder inMemoryDatabaseBuilder$default(Room room, Context context, InterfaceC9529a factory, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            AbstractC9979u.m20299l();
            factory = C44711.INSTANCE;
        }
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(factory, "factory");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new RoomDatabase.Builder(AbstractC9983y.m20315b(RoomDatabase.class), null, factory, context);
    }

    public final /* synthetic */ <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, InterfaceC9529a factory) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(factory, "factory");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new RoomDatabase.Builder<>(AbstractC9983y.m20315b(RoomDatabase.class), null, factory, context);
    }

    public final /* synthetic */ <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(Context context, String name, InterfaceC9529a factory) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(factory, "factory");
        if (!AbstractC10793c0.m23132h0(name)) {
            if (!AbstractC9979u.m20289b(name, ":memory:")) {
                AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
                return new RoomDatabase.Builder<>(AbstractC9983y.m20315b(RoomDatabase.class), name, factory, context);
            }
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
        }
        throw new IllegalArgumentException("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
    }
}
