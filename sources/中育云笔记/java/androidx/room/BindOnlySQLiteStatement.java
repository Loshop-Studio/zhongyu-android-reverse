package androidx.room;

import androidx.annotation.IntRange;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
final class BindOnlySQLiteStatement implements SQLiteStatement {
    public static final Companion Companion = new Companion(null);
    private static final String ONLY_BIND_CALLS_ALLOWED_ERROR = "Only bind*() calls are allowed on the RoomRawQuery received statement.";
    private final /* synthetic */ SQLiteStatement $$delegate_0;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public BindOnlySQLiteStatement(SQLiteStatement delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.$$delegate_0 = delegate;
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindBlob */
    public void mo33815bindBlob(@IntRange(from = 1) int i10, byte[] value) {
        AbstractC9979u.m20294g(value, "value");
        this.$$delegate_0.mo33815bindBlob(i10, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBoolean(@IntRange(from = 1) int i10, boolean z10) {
        this.$$delegate_0.bindBoolean(i10, z10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindDouble */
    public void mo33816bindDouble(@IntRange(from = 1) int i10, double d10) {
        this.$$delegate_0.mo33816bindDouble(i10, d10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindFloat(@IntRange(from = 1) int i10, float f10) {
        this.$$delegate_0.bindFloat(i10, f10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindInt(@IntRange(from = 1) int i10, int i11) {
        this.$$delegate_0.bindInt(i10, i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindLong */
    public void mo33817bindLong(@IntRange(from = 1) int i10, long j10) {
        this.$$delegate_0.mo33817bindLong(i10, j10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindNull */
    public void mo33818bindNull(@IntRange(from = 1) int i10) {
        this.$$delegate_0.mo33818bindNull(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindText */
    public void mo33819bindText(@IntRange(from = 1) int i10, String value) {
        AbstractC9979u.m20294g(value, "value");
        this.$$delegate_0.mo33819bindText(i10, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: clearBindings */
    public void mo33820clearBindings() {
        this.$$delegate_0.mo33820clearBindings();
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public byte[] getBlob(int i10) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean getBoolean(@IntRange(from = 0) int i10) {
        return this.$$delegate_0.getBoolean(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getColumnName(int i10) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public List<String> getColumnNames() {
        return this.$$delegate_0.getColumnNames();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(int i10) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int i10) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public float getFloat(@IntRange(from = 0) int i10) {
        return this.$$delegate_0.getFloat(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getInt(@IntRange(from = 0) int i10) {
        return this.$$delegate_0.getInt(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int i10) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getText(int i10) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int i10) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR);
    }
}
