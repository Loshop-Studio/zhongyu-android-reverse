package androidx.room;

import kotlin.enums.AbstractC9108a;
import p179m7.InterfaceC9324c;
import p212p7.InterfaceC9760a;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public interface Transactor extends PooledConnection {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SQLiteTransactionType {
        private static final /* synthetic */ InterfaceC9760a $ENTRIES;
        private static final /* synthetic */ SQLiteTransactionType[] $VALUES;
        public static final SQLiteTransactionType DEFERRED = new SQLiteTransactionType("DEFERRED", 0);
        public static final SQLiteTransactionType IMMEDIATE = new SQLiteTransactionType("IMMEDIATE", 1);
        public static final SQLiteTransactionType EXCLUSIVE = new SQLiteTransactionType("EXCLUSIVE", 2);

        private static final /* synthetic */ SQLiteTransactionType[] $values() {
            return new SQLiteTransactionType[]{DEFERRED, IMMEDIATE, EXCLUSIVE};
        }

        static {
            SQLiteTransactionType[] sQLiteTransactionTypeArr$values = $values();
            $VALUES = sQLiteTransactionTypeArr$values;
            $ENTRIES = AbstractC9108a.m16085a(sQLiteTransactionTypeArr$values);
        }

        private SQLiteTransactionType(String str, int i10) {
        }

        public static InterfaceC9760a getEntries() {
            return $ENTRIES;
        }

        public static SQLiteTransactionType valueOf(String str) {
            return (SQLiteTransactionType) Enum.valueOf(SQLiteTransactionType.class, str);
        }

        public static SQLiteTransactionType[] values() {
            return (SQLiteTransactionType[]) $VALUES.clone();
        }
    }

    Object inTransaction(InterfaceC9324c<? super Boolean> interfaceC9324c);

    <R> Object withTransaction(SQLiteTransactionType sQLiteTransactionType, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c);
}
