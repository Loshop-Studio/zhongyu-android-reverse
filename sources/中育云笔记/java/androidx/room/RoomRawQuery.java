package androidx.room;

import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes3.dex */
public final class RoomRawQuery {
    private final InterfaceC9540l bindingFunction;
    private final String sql;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomRawQuery(String sql) {
        this(sql, null, 2, 0 == true ? 1 : 0);
        AbstractC9979u.m20294g(sql, "sql");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q _init_$lambda$0(SQLiteStatement it) {
        AbstractC9979u.m20294g(it, "it");
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q bindingFunction$lambda$1(InterfaceC9540l interfaceC9540l, SQLiteStatement it) {
        AbstractC9979u.m20294g(it, "it");
        interfaceC9540l.invoke(new BindOnlySQLiteStatement(it));
        return C10786q.f26013a;
    }

    public final InterfaceC9540l getBindingFunction() {
        return this.bindingFunction;
    }

    public final String getSql() {
        return this.sql;
    }

    public RoomRawQuery(String sql, final InterfaceC9540l onBindStatement) {
        AbstractC9979u.m20294g(sql, "sql");
        AbstractC9979u.m20294g(onBindStatement, "onBindStatement");
        this.sql = sql;
        this.bindingFunction = new InterfaceC9540l() { // from class: androidx.room.p
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RoomRawQuery.bindingFunction$lambda$1(onBindStatement, (SQLiteStatement) obj);
            }
        };
    }

    public /* synthetic */ RoomRawQuery(String str, InterfaceC9540l interfaceC9540l, int i10, AbstractC9972n abstractC9972n) {
        this(str, (i10 & 2) != 0 ? new InterfaceC9540l() { // from class: androidx.room.q
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RoomRawQuery._init_$lambda$0((SQLiteStatement) obj);
            }
        } : interfaceC9540l);
    }
}
