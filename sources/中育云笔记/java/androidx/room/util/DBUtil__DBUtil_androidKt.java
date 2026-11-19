package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.TransactionElement;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import androidx.sqlite.p019db.SupportSQLiteQuery;
import cd.AbstractC5423b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
final /* synthetic */ class DBUtil__DBUtil_androidKt {

    @InterfaceC11829d(m26210c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", m26211f = "DBUtil.android.kt", m26212l = {247}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1 */
    public static final class C46021 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9540l $block;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ boolean $isReadOnly;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46021(RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C46021> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$db = roomDatabase;
            this.$inTransaction = z10;
            this.$isReadOnly = z11;
            this.$block = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C46021(this.$db, this.$inTransaction, this.$isReadOnly, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            boolean z10 = !(this.$db.inCompatibilityMode$room_runtime_release() && this.$db.inTransaction()) && this.$inTransaction;
            RoomDatabase roomDatabase = this.$db;
            boolean z11 = this.$isReadOnly;
            C4597x852501c0 c4597x852501c0 = new C4597x852501c0(z10, z11, roomDatabase, null, this.$block);
            this.label = 1;
            Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(z11, c4597x852501c0, this);
            return objUseConnection$room_runtime_release == objM25952f ? objM25952f : objUseConnection$room_runtime_release;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C46021) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", m26211f = "DBUtil.android.kt", m26212l = {247}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 */
    public static final class C46032 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $block;
        final /* synthetic */ RoomDatabase $db;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46032(RoomDatabase roomDatabase, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C46032> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.$db = roomDatabase;
            this.$block = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C46032(this.$db, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            RoomDatabase roomDatabase = this.$db;
            C4598xfea5cf01 c4598xfea5cf01 = new C4598xfea5cf01(true, false, roomDatabase, null, this.$block);
            this.label = 1;
            Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(false, c4598xfea5cf01, this);
            return objUseConnection$room_runtime_release == objM25952f ? objM25952f : objUseConnection$room_runtime_release;
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C46032) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3", m26211f = "DBUtil.android.kt", m26212l = {247}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3 */
    public static final class C46043 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9540l $block;
        final /* synthetic */ RoomDatabase $db;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46043(RoomDatabase roomDatabase, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C46043> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$db = roomDatabase;
            this.$block = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C46043(this.$db, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            RoomDatabase roomDatabase = this.$db;
            C4599x60b0420 c4599x60b0420 = new C4599x60b0420(true, false, roomDatabase, null, this.$block);
            this.label = 1;
            Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(false, c4599x60b0420, this);
            return objUseConnection$room_runtime_release == objM25952f ? objM25952f : objUseConnection$room_runtime_release;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C46043) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.util.DBUtil__DBUtil_androidKt", m26211f = "DBUtil.android.kt", m26212l = {249, 251, 251}, m26213m = "performSuspending")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 */
    public static final class C46051<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public C46051(InterfaceC11588c<? super C46051> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DBUtil.performSuspending(null, false, false, null, this);
        }
    }

    private static final <R> Object compatCoroutineExecute$DBUtil__DBUtil_androidKt(RoomDatabase roomDatabase, boolean z10, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        if (roomDatabase.inCompatibilityMode$room_runtime_release() && roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
            return interfaceC9540l.invoke(interfaceC11588c);
        }
        AbstractC9977s.m20287c(0);
        Object coroutineContext = DBUtil.getCoroutineContext(roomDatabase, z10, interfaceC11588c);
        AbstractC9977s.m20287c(1);
        DBUtil__DBUtil_androidKt$compatCoroutineExecute$2 dBUtil__DBUtil_androidKt$compatCoroutineExecute$2 = new DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(interfaceC9540l, null);
        AbstractC9977s.m20287c(0);
        Object objM24709g = AbstractC11109f.m24709g((InterfaceC9945d) coroutineContext, dBUtil__DBUtil_androidKt$compatCoroutineExecute$2, interfaceC11588c);
        AbstractC9977s.m20287c(1);
        return objM24709g;
    }

    @InterfaceC10770a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final CancellationSignal createCancellationSignal() {
        return new CancellationSignal();
    }

    @InterfaceC10770a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        DBUtil.dropFtsSyncTriggers(new SupportSQLiteConnection(db2));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(SupportSQLiteDatabase db2, String tableName) {
        AbstractC9979u.m20294g(db2, "db");
        AbstractC9979u.m20294g(tableName, "tableName");
        DBUtil.foreignKeyCheck(new SupportSQLiteConnection(db2), tableName);
    }

    public static final Object getCoroutineContext(RoomDatabase roomDatabase, boolean z10, InterfaceC11588c<? super InterfaceC9945d> interfaceC11588c) {
        InterfaceC9944c transactionDispatcher$room_runtime_release;
        InterfaceC9945d interfaceC9945dPlus;
        if (!roomDatabase.inCompatibilityMode$room_runtime_release()) {
            return roomDatabase.getCoroutineScope().getCoroutineContext();
        }
        TransactionElement transactionElement = (TransactionElement) interfaceC11588c.getContext().get(TransactionElement.Key);
        return (transactionElement == null || (transactionDispatcher$room_runtime_release = transactionElement.getTransactionDispatcher$room_runtime_release()) == null || (interfaceC9945dPlus = roomDatabase.getQueryContext().plus(transactionDispatcher$room_runtime_release)) == null) ? z10 ? roomDatabase.getTransactionContext$room_runtime_release() : roomDatabase.getQueryContext() : interfaceC9945dPlus;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> R performBlocking(RoomDatabase db2, boolean z10, boolean z11, InterfaceC9540l block) {
        AbstractC9979u.m20294g(db2, "db");
        AbstractC9979u.m20294g(block, "block");
        db2.assertNotMainThread();
        db2.assertNotSuspendingTransaction();
        return (R) RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new C46021(db2, z11, z10, block, null));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> Object performInTransactionSuspending(RoomDatabase roomDatabase, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        return roomDatabase.inCompatibilityMode$room_runtime_release() ? RoomDatabaseKt.withTransactionContext(roomDatabase, new C46032(roomDatabase, interfaceC9540l, null), interfaceC11588c) : AbstractC11109f.m24709g(roomDatabase.getCoroutineScope().getCoroutineContext(), new C46043(roomDatabase, interfaceC9540l, null), interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object performSuspending(androidx.room.RoomDatabase r14, boolean r15, boolean r16, p181hd.InterfaceC9540l r17, vc.InterfaceC11588c<? super R> r18) throws java.lang.Throwable {
        /*
            r0 = r18
            boolean r1 = r0 instanceof androidx.room.util.DBUtil__DBUtil_androidKt.C46051
            if (r1 == 0) goto L16
            r1 = r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 r1 = (androidx.room.util.DBUtil__DBUtil_androidKt.C46051) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r6 = r1
            goto L1c
        L16:
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 r1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.result
            java.lang.Object r7 = p393wc.AbstractC11725a.m25952f()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L53
            if (r1 == r8) goto L4f
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            kotlin.AbstractC9924b.m20071b(r0)
            return r0
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            boolean r14 = r6.Z$1
            boolean r15 = r6.Z$0
            java.lang.Object r1 = r6.L$1
            hd.l r1 = (p181hd.InterfaceC9540l) r1
            java.lang.Object r3 = r6.L$0
            androidx.room.RoomDatabase r3 = (androidx.room.RoomDatabase) r3
            kotlin.AbstractC9924b.m20071b(r0)
            r12 = r14
            r13 = r1
            r10 = r3
        L4d:
            r11 = r15
            goto L99
        L4f:
            kotlin.AbstractC9924b.m20071b(r0)
            return r0
        L53:
            kotlin.AbstractC9924b.m20071b(r0)
            boolean r0 = r14.inCompatibilityMode$room_runtime_release()
            if (r0 == 0) goto L7f
            boolean r0 = r14.isOpenInternal()
            if (r0 == 0) goto L7f
            boolean r0 = r14.inTransaction()
            if (r0 == 0) goto L7f
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1
            r4 = 0
            r3 = r14
            r2 = r15
            r1 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r0
            r6.label = r8
            java.lang.Object r14 = r14.useConnection$room_runtime_release(r15, r2, r6)
            if (r14 != r7) goto L7e
            goto Lae
        L7e:
            return r14
        L7f:
            r4 = r16
            r6.L$0 = r14
            r5 = r17
            r6.L$1 = r5
            r6.Z$0 = r15
            r6.Z$1 = r4
            r6.label = r3
            java.lang.Object r3 = androidx.room.util.DBUtil.getCoroutineContext(r14, r4, r6)
            if (r3 != r7) goto L94
            goto Lae
        L94:
            r10 = r14
            r0 = r3
            r12 = r4
            r13 = r5
            goto L4d
        L99:
            kotlin.coroutines.d r0 = (kotlin.coroutines.InterfaceC9945d) r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 r8 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14 = 0
            r6.L$0 = r14
            r6.L$1 = r14
            r6.label = r2
            java.lang.Object r14 = sd.AbstractC11109f.m24709g(r0, r8, r6)
            if (r14 != r7) goto Laf
        Lae:
            return r7
        Laf:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtil_androidKt.performSuspending(androidx.room.RoomDatabase, boolean, boolean, hd.l, vc.c):java.lang.Object");
    }

    @InterfaceC10770a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final Cursor query(RoomDatabase db2, SupportSQLiteQuery sqLiteQuery, boolean z10) {
        AbstractC9979u.m20294g(db2, "db");
        AbstractC9979u.m20294g(sqLiteQuery, "sqLiteQuery");
        return DBUtil.query(db2, sqLiteQuery, z10, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int readVersion(File databaseFile) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            AbstractC5423b.m2902a(channel, null);
            return i10;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC5423b.m2902a(channel, th);
                throw th2;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final SQLiteConnection toSQLiteConnection(SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        return new SupportSQLiteConnection(db2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final Cursor query(RoomDatabase db2, SupportSQLiteQuery sqLiteQuery, boolean z10, CancellationSignal cancellationSignal) {
        AbstractC9979u.m20294g(db2, "db");
        AbstractC9979u.m20294g(sqLiteQuery, "sqLiteQuery");
        Cursor cursorQuery = db2.query(sqLiteQuery, cancellationSignal);
        if (!z10 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(cursorQuery) : cursorQuery;
    }
}
