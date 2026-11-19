package androidx.room.util;

import android.database.SQLException;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.Transactor;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;
import p123h7.C8736p;
import p134i7.AbstractC8807u;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p278v7.AbstractC10251a;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
final /* synthetic */ class DBUtil__DBUtilKt {

    @InterfaceC9539d(m17800c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2", m17801f = "DBUtil.kt", m17802l = {C3721BR.userInfo, C3721BR.versionName, C3721BR.viewModel, C3721BR.webViewControlViewModel, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtilKt$internalPerform$2 */
    public static final class C46482 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ boolean $isReadOnly;
        final /* synthetic */ RoomDatabase $this_internalPerform;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46482(boolean z10, boolean z11, RoomDatabase roomDatabase, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C46482> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$inTransaction = z10;
            this.$isReadOnly = z11;
            this.$this_internalPerform = roomDatabase;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C46482 c46482 = new C46482(this.$inTransaction, this.$isReadOnly, this.$this_internalPerform, this.$block, interfaceC9324c);
            c46482.L$0 = obj;
            return c46482;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(Transactor transactor, InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C46482) create(transactor, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtilKt.C46482.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invokeSuspend$$forInline(Object obj) throws Throwable {
            Transactor transactor = (Transactor) this.L$0;
            if (!this.$inTransaction) {
                return this.$block.invoke(transactor, this);
            }
            boolean z10 = this.$isReadOnly;
            Transactor.SQLiteTransactionType sQLiteTransactionType = z10 ? Transactor.SQLiteTransactionType.DEFERRED : Transactor.SQLiteTransactionType.IMMEDIATE;
            if (!z10) {
                AbstractC9131s.m16126c(0);
                Object objInTransaction = transactor.inTransaction(this);
                AbstractC9131s.m16126c(1);
                if (!((Boolean) objInTransaction).booleanValue()) {
                    InvalidationTracker invalidationTracker = this.$this_internalPerform.getInvalidationTracker();
                    AbstractC9131s.m16126c(0);
                    invalidationTracker.sync$room_runtime_release(this);
                    AbstractC9131s.m16126c(1);
                }
            }
            DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$1 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, null);
            AbstractC9131s.m16126c(0);
            Object objWithTransaction = transactor.withTransaction(sQLiteTransactionType, dBUtil__DBUtilKt$internalPerform$2$result$1, this);
            AbstractC9131s.m16126c(1);
            if (!this.$isReadOnly) {
                AbstractC9131s.m16126c(0);
                Object objInTransaction2 = transactor.inTransaction(this);
                AbstractC9131s.m16126c(1);
                if (!((Boolean) objInTransaction2).booleanValue()) {
                    this.$this_internalPerform.getInvalidationTracker().refreshAsync();
                }
            }
            return objWithTransaction;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(SQLiteConnection connection) {
        AbstractC9133u.m16133g(connection, "connection");
        List listM14753c = AbstractC8807u.m14753c();
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (sQLiteStatementPrepare.step()) {
            try {
                listM14753c.add(sQLiteStatementPrepare.getText(0));
            } finally {
            }
        }
        C8736p c8736p = C8736p.f16368a;
        AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
        for (String str : AbstractC8807u.m14751a(listM14753c)) {
            if (AbstractC8687z.m14105M(str, "room_fts_content_sync_", false, 2, null)) {
                SQLite.execSQL(connection, "DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(SQLiteConnection db, String tableName) {
        AbstractC9133u.m16133g(db, "db");
        AbstractC9133u.m16133g(tableName, "tableName");
        SQLiteStatement sQLiteStatementPrepare = db.prepare("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            if (sQLiteStatementPrepare.step()) {
                throw new SQLException(processForeignKeyCheckFailure$DBUtil__DBUtilKt(sQLiteStatementPrepare));
            }
            C8736p c8736p = C8736p.f16368a;
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC10251a.m19205a(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public static final <R> Object internalPerform(RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        return roomDatabase.useConnection$room_runtime_release(z10, new C46482(z11, z10, roomDatabase, interfaceC10574p, null), interfaceC9324c);
    }

    private static final <R> Object internalPerform$$forInline(RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        C46482 c46482 = new C46482(z11, z10, roomDatabase, interfaceC10574p, null);
        AbstractC9131s.m16126c(0);
        Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(z10, c46482, interfaceC9324c);
        AbstractC9131s.m16126c(1);
        return objUseConnection$room_runtime_release;
    }

    private static final String processForeignKeyCheckFailure$DBUtil__DBUtilKt(SQLiteStatement sQLiteStatement) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        do {
            if (i10 == 0) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(sQLiteStatement.getText(0));
                sb.append("'.\n");
            }
            String text = sQLiteStatement.getText(3);
            if (!linkedHashMap.containsKey(text)) {
                linkedHashMap.put(text, sQLiteStatement.getText(2));
            }
            i10++;
        } while (sQLiteStatement.step());
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append(SignParameters.NEW_LINE);
        sb.append("Number of rows in violation: ");
        sb.append(i10);
        sb.append(SignParameters.NEW_LINE);
        sb.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append("\tParent Table = ");
            sb.append(str2);
            sb.append(", Foreign Key Constraint Index = ");
            sb.append(str);
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }
}
