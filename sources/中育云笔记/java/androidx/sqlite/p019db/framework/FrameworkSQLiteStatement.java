package androidx.sqlite.p019db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.p019db.SupportSQLiteStatement;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class FrameworkSQLiteStatement extends FrameworkSQLiteProgram implements SupportSQLiteStatement {
    private final SQLiteStatement delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteStatement(SQLiteStatement delegate) {
        super(delegate);
        AbstractC9979u.m20294g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteStatement
    public void execute() {
        this.delegate.execute();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteStatement
    public long executeInsert() {
        return this.delegate.executeInsert();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        return this.delegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        return this.delegate.simpleQueryForLong();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteStatement
    public String simpleQueryForString() {
        return this.delegate.simpleQueryForString();
    }
}
