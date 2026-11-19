package androidx.room.paging;

import android.database.AbstractCursor;
import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class SQLiteStatementCursor extends AbstractCursor {
    private final int rowCount;
    private final SQLiteStatement statement;

    public SQLiteStatementCursor(SQLiteStatement statement, int i10) {
        AbstractC9979u.m20294g(statement, "statement");
        this.statement = statement;
        this.rowCount = i10;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return (String[]) this.statement.getColumnNames().toArray(new String[0]);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        return this.rowCount;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public double getDouble(int i10) {
        return this.statement.getDouble(i10);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public float getFloat(int i10) {
        return this.statement.getFloat(i10);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getInt(int i10) {
        return this.statement.getInt(i10);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public long getLong(int i10) {
        return this.statement.getLong(i10);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public short getShort(int i10) {
        return (short) this.statement.getLong(i10);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public String getString(int i10) {
        return this.statement.getText(i10);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean isNull(int i10) {
        return this.statement.isNull(i10);
    }

    @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int i10, int i11) {
        if (i10 + 1 == i11) {
            return this.statement.step();
        }
        throw new IllegalStateException("Compat cursor can only move forward one position at a time.");
    }
}
