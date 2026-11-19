package androidx.room;

import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class RoomRawQuery {
    private final InterfaceC10570l bindingFunction;
    private final String sql;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomRawQuery(String sql) {
        this(sql, null, 2, 0 == true ? 1 : 0);
        AbstractC9133u.m16133g(sql, "sql");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p _init_$lambda$0(SQLiteStatement it) {
        AbstractC9133u.m16133g(it, "it");
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p bindingFunction$lambda$1(InterfaceC10570l interfaceC10570l, SQLiteStatement it) {
        AbstractC9133u.m16133g(it, "it");
        interfaceC10570l.invoke(new BindOnlySQLiteStatement(it));
        return C8736p.f16368a;
    }

    public final InterfaceC10570l getBindingFunction() {
        return this.bindingFunction;
    }

    public final String getSql() {
        return this.sql;
    }

    public RoomRawQuery(String sql, final InterfaceC10570l onBindStatement) {
        AbstractC9133u.m16133g(sql, "sql");
        AbstractC9133u.m16133g(onBindStatement, "onBindStatement");
        this.sql = sql;
        this.bindingFunction = new InterfaceC10570l() { // from class: androidx.room.p
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return RoomRawQuery.bindingFunction$lambda$1(onBindStatement, (SQLiteStatement) obj);
            }
        };
    }

    public /* synthetic */ RoomRawQuery(String str, InterfaceC10570l interfaceC10570l, int i10, AbstractC9126n abstractC9126n) {
        this(str, (i10 & 2) != 0 ? new InterfaceC10570l() { // from class: androidx.room.q
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return RoomRawQuery._init_$lambda$0((SQLiteStatement) obj);
            }
        } : interfaceC10570l);
    }
}
