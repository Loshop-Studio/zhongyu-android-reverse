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
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import androidx.sqlite.p018db.SupportSQLiteQuery;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p135i8.AbstractC8833f;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p256t7.AbstractC10117b;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
final /* synthetic */ class DBUtil__DBUtil_androidKt {

    @InterfaceC9539d(m17800c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", m17801f = "DBUtil.android.kt", m17802l = {247}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1 */
    public static final class C46541 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10570l $block;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ boolean $isReadOnly;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46541(RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C46541> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$db = roomDatabase;
            this.$inTransaction = z10;
            this.$isReadOnly = z11;
            this.$block = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C46541(this.$db, this.$inTransaction, this.$isReadOnly, this.$block, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C46541) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            boolean z10 = !(this.$db.inCompatibilityMode$room_runtime_release() && this.$db.inTransaction()) && this.$inTransaction;
            RoomDatabase roomDatabase = this.$db;
            boolean z11 = this.$isReadOnly;
            C4649x852501c0 c4649x852501c0 = new C4649x852501c0(z10, z11, roomDatabase, null, this.$block);
            this.label = 1;
            Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(z11, c4649x852501c0, this);
            return objUseConnection$room_runtime_release == objM17291f ? objM17291f : objUseConnection$room_runtime_release;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", m17801f = "DBUtil.android.kt", m17802l = {247}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 */
    public static final class C46552 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC10570l $block;
        final /* synthetic */ RoomDatabase $db;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46552(RoomDatabase roomDatabase, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C46552> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$db = roomDatabase;
            this.$block = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C46552(this.$db, this.$block, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            RoomDatabase roomDatabase = this.$db;
            C4650xfea5cf01 c4650xfea5cf01 = new C4650xfea5cf01(true, false, roomDatabase, null, this.$block);
            this.label = 1;
            Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(false, c4650xfea5cf01, this);
            return objUseConnection$room_runtime_release == objM17291f ? objM17291f : objUseConnection$room_runtime_release;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C46552) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3", m17801f = "DBUtil.android.kt", m17802l = {247}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3 */
    public static final class C46563 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10570l $block;
        final /* synthetic */ RoomDatabase $db;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46563(RoomDatabase roomDatabase, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C46563> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$db = roomDatabase;
            this.$block = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C46563(this.$db, this.$block, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C46563) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            RoomDatabase roomDatabase = this.$db;
            C4651x60b0420 c4651x60b0420 = new C4651x60b0420(true, false, roomDatabase, null, this.$block);
            this.label = 1;
            Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(false, c4651x60b0420, this);
            return objUseConnection$room_runtime_release == objM17291f ? objM17291f : objUseConnection$room_runtime_release;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.util.DBUtil__DBUtil_androidKt", m17801f = "DBUtil.android.kt", m17802l = {249, 251, 251}, m17803m = "performSuspending")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 */
    public static final class C46571<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public C46571(InterfaceC9324c<? super C46571> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DBUtil.performSuspending(null, false, false, null, this);
        }
    }

    private static final <R> Object compatCoroutineExecute$DBUtil__DBUtil_androidKt(RoomDatabase roomDatabase, boolean z10, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        if (roomDatabase.inCompatibilityMode$room_runtime_release() && roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
            return interfaceC10570l.invoke(interfaceC9324c);
        }
        AbstractC9131s.m16126c(0);
        Object coroutineContext = DBUtil.getCoroutineContext(roomDatabase, z10, interfaceC9324c);
        AbstractC9131s.m16126c(1);
        DBUtil__DBUtil_androidKt$compatCoroutineExecute$2 dBUtil__DBUtil_androidKt$compatCoroutineExecute$2 = new DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(interfaceC10570l, null);
        AbstractC9131s.m16126c(0);
        Object objM14848g = AbstractC8833f.m14848g((InterfaceC9100d) coroutineContext, dBUtil__DBUtil_androidKt$compatCoroutineExecute$2, interfaceC9324c);
        AbstractC9131s.m16126c(1);
        return objM14848g;
    }

    @InterfaceC8721a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final CancellationSignal createCancellationSignal() {
        return new CancellationSignal();
    }

    @InterfaceC8721a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(SupportSQLiteDatabase db) {
        AbstractC9133u.m16133g(db, "db");
        DBUtil.dropFtsSyncTriggers(new SupportSQLiteConnection(db));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(SupportSQLiteDatabase db, String tableName) {
        AbstractC9133u.m16133g(db, "db");
        AbstractC9133u.m16133g(tableName, "tableName");
        DBUtil.foreignKeyCheck(new SupportSQLiteConnection(db), tableName);
    }

    public static final Object getCoroutineContext(RoomDatabase roomDatabase, boolean z10, InterfaceC9324c<? super InterfaceC9100d> interfaceC9324c) {
        InterfaceC9099c transactionDispatcher$room_runtime_release;
        InterfaceC9100d interfaceC9100dPlus;
        if (!roomDatabase.inCompatibilityMode$room_runtime_release()) {
            return roomDatabase.getCoroutineScope().getCoroutineContext();
        }
        TransactionElement transactionElement = (TransactionElement) interfaceC9324c.getContext().get(TransactionElement.Key);
        return (transactionElement == null || (transactionDispatcher$room_runtime_release = transactionElement.getTransactionDispatcher$room_runtime_release()) == null || (interfaceC9100dPlus = roomDatabase.getQueryContext().plus(transactionDispatcher$room_runtime_release)) == null) ? z10 ? roomDatabase.getTransactionContext$room_runtime_release() : roomDatabase.getQueryContext() : interfaceC9100dPlus;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> R performBlocking(RoomDatabase db, boolean z10, boolean z11, InterfaceC10570l block) {
        AbstractC9133u.m16133g(db, "db");
        AbstractC9133u.m16133g(block, "block");
        db.assertNotMainThread();
        db.assertNotSuspendingTransaction();
        return (R) RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new C46541(db, z11, z10, block, null));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> Object performInTransactionSuspending(RoomDatabase roomDatabase, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        return roomDatabase.inCompatibilityMode$room_runtime_release() ? RoomDatabaseKt.withTransactionContext(roomDatabase, new C46552(roomDatabase, interfaceC10570l, null), interfaceC9324c) : AbstractC8833f.m14848g(roomDatabase.getCoroutineScope().getCoroutineContext(), new C46563(roomDatabase, interfaceC10570l, null), interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object performSuspending(androidx.room.RoomDatabase r14, boolean r15, boolean r16, p300x7.InterfaceC10570l r17, p179m7.InterfaceC9324c<? super R> r18) throws java.lang.Throwable {
        /*
            r0 = r18
            boolean r1 = r0 instanceof androidx.room.util.DBUtil__DBUtil_androidKt.C46571
            if (r1 == 0) goto L16
            r1 = r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 r1 = (androidx.room.util.DBUtil__DBUtil_androidKt.C46571) r1
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
            java.lang.Object r7 = p190n7.AbstractC9434a.m17291f()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L53
            if (r1 == r8) goto L4f
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            kotlin.AbstractC9079b.m15926b(r0)
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
            x7.l r1 = (p300x7.InterfaceC10570l) r1
            java.lang.Object r3 = r6.L$0
            androidx.room.RoomDatabase r3 = (androidx.room.RoomDatabase) r3
            kotlin.AbstractC9079b.m15926b(r0)
            r12 = r14
            r13 = r1
            r10 = r3
        L4d:
            r11 = r15
            goto L99
        L4f:
            kotlin.AbstractC9079b.m15926b(r0)
            return r0
        L53:
            kotlin.AbstractC9079b.m15926b(r0)
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
            kotlin.coroutines.d r0 = (kotlin.coroutines.InterfaceC9100d) r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 r8 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14 = 0
            r6.L$0 = r14
            r6.L$1 = r14
            r6.label = r2
            java.lang.Object r14 = p135i8.AbstractC8833f.m14848g(r0, r8, r6)
            if (r14 != r7) goto Laf
        Lae:
            return r7
        Laf:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtil_androidKt.performSuspending(androidx.room.RoomDatabase, boolean, boolean, x7.l, m7.c):java.lang.Object");
    }

    @InterfaceC8721a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final Cursor query(RoomDatabase db, SupportSQLiteQuery sqLiteQuery, boolean z10) {
        AbstractC9133u.m16133g(db, "db");
        AbstractC9133u.m16133g(sqLiteQuery, "sqLiteQuery");
        return DBUtil.query(db, sqLiteQuery, z10, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int readVersion(File databaseFile) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(databaseFile, "databaseFile");
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
            AbstractC10117b.m18861a(channel, null);
            return i10;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC10117b.m18861a(channel, th);
                throw th2;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final SQLiteConnection toSQLiteConnection(SupportSQLiteDatabase db) {
        AbstractC9133u.m16133g(db, "db");
        return new SupportSQLiteConnection(db);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final Cursor query(RoomDatabase db, SupportSQLiteQuery sqLiteQuery, boolean z10, CancellationSignal cancellationSignal) {
        AbstractC9133u.m16133g(db, "db");
        AbstractC9133u.m16133g(sqLiteQuery, "sqLiteQuery");
        Cursor cursorQuery = db.query(sqLiteQuery, cancellationSignal);
        if (!z10 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(cursorQuery) : cursorQuery;
    }
}
