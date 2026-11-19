package androidx.room;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.p019db.SupportSQLiteProgram;
import androidx.sqlite.p019db.SupportSQLiteQuery;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10964p;

@SuppressLint({"WrongConstant"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    private static final int BLOB = 5;
    public static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;
    public static final int POOL_LIMIT = 15;
    private static final int STRING = 4;
    private int argCount;
    private final int[] bindingTypes;
    public final byte[][] blobBindings;

    @VisibleForTesting
    private final int capacity;
    public final double[] doubleBindings;
    public final long[] longBindings;
    private volatile String query;
    public final String[] stringBindings;
    public static final Companion Companion = new Companion(null);
    public static final TreeMap<Integer, RoomSQLiteQuery> queryPool = new TreeMap<>();

    @Retention(RetentionPolicy.SOURCE)
    public @interface Binding {
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getQueryPool$annotations() {
        }

        public final RoomSQLiteQuery acquire(String query, int i10) {
            AbstractC9979u.m20294g(query, "query");
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            synchronized (treeMap) {
                Map.Entry<Integer, RoomSQLiteQuery> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    C10786q c10786q = C10786q.f26013a;
                    RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i10, null);
                    roomSQLiteQuery.init(query, i10);
                    return roomSQLiteQuery;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                RoomSQLiteQuery value = entryCeilingEntry.getValue();
                value.init(query, i10);
                AbstractC9979u.m20291d(value);
                return value;
            }
        }

        public final RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportSQLiteQuery) {
            AbstractC9979u.m20294g(supportSQLiteQuery, "supportSQLiteQuery");
            final RoomSQLiteQuery roomSQLiteQueryAcquire = acquire(supportSQLiteQuery.getSql(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.bindTo(new SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery$Companion$copyFrom$1
                @Override // androidx.sqlite.p019db.SupportSQLiteProgram
                public void bindBlob(int i10, byte[] value) {
                    AbstractC9979u.m20294g(value, "value");
                    roomSQLiteQueryAcquire.bindBlob(i10, value);
                }

                @Override // androidx.sqlite.p019db.SupportSQLiteProgram
                public void bindDouble(int i10, double d10) {
                    roomSQLiteQueryAcquire.bindDouble(i10, d10);
                }

                @Override // androidx.sqlite.p019db.SupportSQLiteProgram
                public void bindLong(int i10, long j10) {
                    roomSQLiteQueryAcquire.bindLong(i10, j10);
                }

                @Override // androidx.sqlite.p019db.SupportSQLiteProgram
                public void bindNull(int i10) {
                    roomSQLiteQueryAcquire.bindNull(i10);
                }

                @Override // androidx.sqlite.p019db.SupportSQLiteProgram
                public void bindString(int i10, String value) {
                    AbstractC9979u.m20294g(value, "value");
                    roomSQLiteQueryAcquire.bindString(i10, value);
                }

                @Override // androidx.sqlite.p019db.SupportSQLiteProgram
                public void clearBindings() {
                    roomSQLiteQueryAcquire.clearBindings();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    roomSQLiteQueryAcquire.close();
                }
            });
            return roomSQLiteQueryAcquire;
        }

        public final void prunePoolLocked$room_runtime_release() {
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            AbstractC9979u.m20293f(it, "iterator(...)");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ RoomSQLiteQuery(int i10, AbstractC9972n abstractC9972n) {
        this(i10);
    }

    public static final RoomSQLiteQuery acquire(String str, int i10) {
        return Companion.acquire(str, i10);
    }

    public static final RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportSQLiteQuery) {
        return Companion.copyFrom(supportSQLiteQuery);
    }

    private static /* synthetic */ void getBindingTypes$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getBlobBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDoubleBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLongBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getStringBindings$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q toRoomRawQuery$lambda$1(RoomSQLiteQuery roomSQLiteQuery, SQLiteStatement it) {
        AbstractC9979u.m20294g(it, "it");
        roomSQLiteQuery.bindTo(it);
        return C10786q.f26013a;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindBlob(int i10, byte[] value) {
        AbstractC9979u.m20294g(value, "value");
        this.bindingTypes[i10] = 5;
        this.blobBindings[i10] = value;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindDouble(int i10, double d10) {
        this.bindingTypes[i10] = 3;
        this.doubleBindings[i10] = d10;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindLong(int i10, long j10) {
        this.bindingTypes[i10] = 2;
        this.longBindings[i10] = j10;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindNull(int i10) {
        this.bindingTypes[i10] = 1;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindString(int i10, String value) {
        AbstractC9979u.m20294g(value, "value");
        this.bindingTypes[i10] = 4;
        this.stringBindings[i10] = value;
    }

    public final void bindText(int i10, String value) {
        AbstractC9979u.m20294g(value, "value");
        bindString(i10, value);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram statement) {
        AbstractC9979u.m20294g(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.bindingTypes[i10];
            if (i11 == 1) {
                statement.bindNull(i10);
            } else if (i11 == 2) {
                statement.bindLong(i10, this.longBindings[i10]);
            } else if (i11 == 3) {
                statement.bindDouble(i10, this.doubleBindings[i10]);
            } else if (i11 == 4) {
                String str = this.stringBindings[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindString(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.blobBindings[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindBlob(i10, bArr);
            }
            if (i10 == argCount) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void clearBindings() {
        AbstractC10964p.m23989D(this.bindingTypes, 1, 0, 0, 6, null);
        AbstractC10964p.m23991F(this.stringBindings, null, 0, 0, 6, null);
        AbstractC10964p.m23991F(this.blobBindings, null, 0, 0, 6, null);
        this.query = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void copyArgumentsFrom(RoomSQLiteQuery other) {
        AbstractC9979u.m20294g(other, "other");
        int argCount = other.getArgCount() + 1;
        System.arraycopy(other.bindingTypes, 0, this.bindingTypes, 0, argCount);
        System.arraycopy(other.longBindings, 0, this.longBindings, 0, argCount);
        System.arraycopy(other.stringBindings, 0, this.stringBindings, 0, argCount);
        System.arraycopy(other.blobBindings, 0, this.blobBindings, 0, argCount);
        System.arraycopy(other.doubleBindings, 0, this.doubleBindings, 0, argCount);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteQuery
    public int getArgCount() {
        return this.argCount;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteQuery
    public String getSql() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void init(String query, int i10) {
        AbstractC9979u.m20294g(query, "query");
        this.query = query;
        this.argCount = i10;
    }

    public final void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = queryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            Companion.prunePoolLocked$room_runtime_release();
            C10786q c10786q = C10786q.f26013a;
        }
    }

    public final RoomRawQuery toRoomRawQuery() {
        return new RoomRawQuery(getSql(), new InterfaceC9540l() { // from class: androidx.room.s
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RoomSQLiteQuery.toRoomRawQuery$lambda$1(this.f2037c, (SQLiteStatement) obj);
            }
        });
    }

    private RoomSQLiteQuery(int i10) {
        this.capacity = i10;
        int i11 = i10 + 1;
        this.bindingTypes = new int[i11];
        this.longBindings = new long[i11];
        this.doubleBindings = new double[i11];
        this.stringBindings = new String[i11];
        this.blobBindings = new byte[i11][];
    }

    public final void bindTo(SQLiteStatement statement) {
        AbstractC9979u.m20294g(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.bindingTypes[i10];
            if (i11 == 1) {
                statement.mo33818bindNull(i10);
            } else if (i11 == 2) {
                statement.mo33817bindLong(i10, this.longBindings[i10]);
            } else if (i11 == 3) {
                statement.mo33816bindDouble(i10, this.doubleBindings[i10]);
            } else if (i11 == 4) {
                String str = this.stringBindings[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.mo33819bindText(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.blobBindings[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.mo33815bindBlob(i10, bArr);
            }
            if (i10 == argCount) {
                return;
            } else {
                i10++;
            }
        }
    }
}
