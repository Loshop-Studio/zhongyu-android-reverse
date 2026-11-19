package androidx.room;

import kotlin.enums.AbstractC9953a;
import p181hd.InterfaceC9544p;
import p425yc.InterfaceC11943a;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public interface Transactor extends PooledConnection {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SQLiteTransactionType {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
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
            $ENTRIES = AbstractC9953a.m20230a(sQLiteTransactionTypeArr$values);
        }

        private SQLiteTransactionType(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static SQLiteTransactionType valueOf(String str) {
            return (SQLiteTransactionType) Enum.valueOf(SQLiteTransactionType.class, str);
        }

        public static SQLiteTransactionType[] values() {
            return (SQLiteTransactionType[]) $VALUES.clone();
        }
    }

    Object inTransaction(InterfaceC11588c<? super Boolean> interfaceC11588c);

    <R> Object withTransaction(SQLiteTransactionType sQLiteTransactionType, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c);
}
