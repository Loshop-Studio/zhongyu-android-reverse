package androidx.room.util;

import android.database.SQLException;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.Transactor;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p152fd.AbstractC9223a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10976v;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
final /* synthetic */ class DBUtil__DBUtilKt {

    @InterfaceC11829d(m26210c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2", m26211f = "DBUtil.kt", m26212l = {Opcodes.FSTORE, Opcodes.DSTORE, 59, 60, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtilKt$internalPerform$2 */
    public static final class C45962 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ boolean $isReadOnly;
        final /* synthetic */ RoomDatabase $this_internalPerform;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45962(boolean z10, boolean z11, RoomDatabase roomDatabase, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C45962> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$inTransaction = z10;
            this.$isReadOnly = z11;
            this.$this_internalPerform = roomDatabase;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C45962 c45962 = new C45962(this.$inTransaction, this.$isReadOnly, this.$this_internalPerform, this.$block, interfaceC11588c);
            c45962.L$0 = obj;
            return c45962;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(Transactor transactor, InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C45962) create(transactor, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
        
            if (r9.sync$room_runtime_release(r8) == r0) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[PHI: r1 r9
          0x00a8: PHI (r1v11 androidx.room.Transactor) = (r1v8 androidx.room.Transactor), (r1v18 androidx.room.Transactor) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r9v13 java.lang.Object) = (r9v12 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtilKt.C45962.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invokeSuspend$$forInline(Object obj) throws Throwable {
            Transactor transactor = (Transactor) this.L$0;
            if (!this.$inTransaction) {
                return this.$block.invoke(transactor, this);
            }
            boolean z10 = this.$isReadOnly;
            Transactor.SQLiteTransactionType sQLiteTransactionType = z10 ? Transactor.SQLiteTransactionType.DEFERRED : Transactor.SQLiteTransactionType.IMMEDIATE;
            if (!z10) {
                AbstractC9977s.m20287c(0);
                Object objInTransaction = transactor.inTransaction(this);
                AbstractC9977s.m20287c(1);
                if (!((Boolean) objInTransaction).booleanValue()) {
                    InvalidationTracker invalidationTracker = this.$this_internalPerform.getInvalidationTracker();
                    AbstractC9977s.m20287c(0);
                    invalidationTracker.sync$room_runtime_release(this);
                    AbstractC9977s.m20287c(1);
                }
            }
            DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$1 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, null);
            AbstractC9977s.m20287c(0);
            Object objWithTransaction = transactor.withTransaction(sQLiteTransactionType, dBUtil__DBUtilKt$internalPerform$2$result$1, this);
            AbstractC9977s.m20287c(1);
            if (!this.$isReadOnly) {
                AbstractC9977s.m20287c(0);
                Object objInTransaction2 = transactor.inTransaction(this);
                AbstractC9977s.m20287c(1);
                if (!((Boolean) objInTransaction2).booleanValue()) {
                    this.$this_internalPerform.getInvalidationTracker().refreshAsync();
                }
            }
            return objWithTransaction;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(SQLiteConnection connection) {
        AbstractC9979u.m20294g(connection, "connection");
        List listM24124c = AbstractC10976v.m24124c();
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (sQLiteStatementPrepare.step()) {
            try {
                listM24124c.add(sQLiteStatementPrepare.getText(0));
            } finally {
            }
        }
        C10786q c10786q = C10786q.f26013a;
        AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
        for (String str : AbstractC10976v.m24122a(listM24124c)) {
            if (AbstractC10819z.m23242O(str, "room_fts_content_sync_", false, 2, null)) {
                SQLite.execSQL(connection, "DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(SQLiteConnection db2, String tableName) {
        AbstractC9979u.m20294g(db2, "db");
        AbstractC9979u.m20294g(tableName, "tableName");
        SQLiteStatement sQLiteStatementPrepare = db2.prepare("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            if (sQLiteStatementPrepare.step()) {
                throw new SQLException(processForeignKeyCheckFailure$DBUtil__DBUtilKt(sQLiteStatementPrepare));
            }
            C10786q c10786q = C10786q.f26013a;
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC9223a.m18142a(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public static final <R> Object internalPerform(RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return roomDatabase.useConnection$room_runtime_release(z10, new C45962(z11, z10, roomDatabase, interfaceC9544p, null), interfaceC11588c);
    }

    private static final <R> Object internalPerform$$forInline(RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        C45962 c45962 = new C45962(z11, z10, roomDatabase, interfaceC9544p, null);
        AbstractC9977s.m20287c(0);
        Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(z10, c45962, interfaceC11588c);
        AbstractC9977s.m20287c(1);
        return objUseConnection$room_runtime_release;
    }

    private static final String processForeignKeyCheckFailure$DBUtil__DBUtilKt(SQLiteStatement sQLiteStatement) {
        StringBuilder sb2 = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        do {
            if (i10 == 0) {
                sb2.append("Foreign key violation(s) detected in '");
                sb2.append(sQLiteStatement.getText(0));
                sb2.append("'.\n");
            }
            String text = sQLiteStatement.getText(3);
            if (!linkedHashMap.containsKey(text)) {
                linkedHashMap.put(text, sQLiteStatement.getText(2));
            }
            i10++;
        } while (sQLiteStatement.step());
        sb2.append("Number of different violations discovered: ");
        sb2.append(linkedHashMap.keySet().size());
        sb2.append(SignParameters.NEW_LINE);
        sb2.append("Number of rows in violation: ");
        sb2.append(i10);
        sb2.append(SignParameters.NEW_LINE);
        sb2.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb2.append("\tParent Table = ");
            sb2.append(str2);
            sb2.append(", Foreign Key Constraint Index = ");
            sb2.append(str);
            sb2.append(SignParameters.NEW_LINE);
        }
        return sb2.toString();
    }
}
