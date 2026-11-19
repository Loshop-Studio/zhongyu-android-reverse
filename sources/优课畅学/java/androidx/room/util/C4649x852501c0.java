package androidx.room.util;

import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.room.RoomDatabase;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.coroutines.RawConnectionAccessor;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1", m17801f = "DBUtil.android.kt", m17802l = {C3721BR.userInfo, C3721BR.versionName, C3721BR.viewModel, C3721BR.webViewControlViewModel}, m17803m = "invokeSuspend")
/* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 */
/* loaded from: classes3.dex */
public final class C4649x852501c0 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10570l $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ RoomDatabase $this_internalPerform;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @InterfaceC9539d(m17800c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1", m17801f = "DBUtil.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10570l $block$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC9324c interfaceC9324c, InterfaceC10570l interfaceC10570l) {
            super(2, interfaceC9324c);
            this.$block$inlined = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC9324c, this.$block$inlined);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(TransactionScope<R> transactionScope, InterfaceC9324c<? super R> interfaceC9324c) {
            return ((AnonymousClass1) create(transactionScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            TransactionScope transactionScope = (TransactionScope) this.L$0;
            AbstractC9133u.m16131e(transactionScope, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
            return this.$block$inlined.invoke(((RawConnectionAccessor) transactionScope).getRawConnection());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4649x852501c0(boolean z10, boolean z11, RoomDatabase roomDatabase, InterfaceC9324c interfaceC9324c, InterfaceC10570l interfaceC10570l) {
        super(2, interfaceC9324c);
        this.$inTransaction = z10;
        this.$isReadOnly = z11;
        this.$this_internalPerform = roomDatabase;
        this.$block$inlined = interfaceC10570l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        C4649x852501c0 c4649x852501c0 = new C4649x852501c0(this.$inTransaction, this.$isReadOnly, this.$this_internalPerform, interfaceC9324c, this.$block$inlined);
        c4649x852501c0.L$0 = obj;
        return c4649x852501c0;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(Transactor transactor, InterfaceC9324c<? super R> interfaceC9324c) {
        return ((C4649x852501c0) create(transactor, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[PHI: r1 r8
      0x00a2: PHI (r1v11 androidx.room.Transactor) = (r1v8 androidx.room.Transactor), (r1v18 androidx.room.Transactor) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C4649x852501c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
