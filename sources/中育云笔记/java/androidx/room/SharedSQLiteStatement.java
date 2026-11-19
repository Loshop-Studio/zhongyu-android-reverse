package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p019db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class SharedSQLiteStatement {
    private final RoomDatabase database;
    private final AtomicBoolean lock;
    private final InterfaceC10773d stmt$delegate;

    public SharedSQLiteStatement(RoomDatabase database) {
        AbstractC9979u.m20294g(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.room.u
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return this.f2062c.createNewStatement();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportSQLiteStatement createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final SupportSQLiteStatement getStmt() {
        return (SupportSQLiteStatement) this.stmt$delegate.getValue();
    }

    public SupportSQLiteStatement acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(SupportSQLiteStatement statement) {
        AbstractC9979u.m20294g(statement, "statement");
        if (statement == getStmt()) {
            this.lock.set(false);
        }
    }

    private final SupportSQLiteStatement getStmt(boolean z10) {
        return z10 ? getStmt() : createNewStatement();
    }
}
