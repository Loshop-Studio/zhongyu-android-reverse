package androidx.room.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.room.RoomDatabase;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9131s;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1", m17801f = "DBUtil.android.kt", m17802l = {C3721BR.userInfo, C3721BR.versionName, C3721BR.viewModel, C3721BR.webViewControlViewModel, ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m17803m = "invokeSuspend")
/* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1 */
/* loaded from: classes3.dex */
public final class C4651x60b0420 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10570l $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ RoomDatabase $this_internalPerform;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @InterfaceC9539d(m17800c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1$1", m17801f = "DBUtil.android.kt", m17802l = {C3721BR.webViewControlViewModel}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1$1, reason: invalid class name */
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
            InterfaceC10570l interfaceC10570l = this.$block$inlined;
            this.label = 1;
            AbstractC9131s.m16126c(6);
            Object objInvoke = interfaceC10570l.invoke(this);
            AbstractC9131s.m16126c(7);
            return objInvoke == objM17291f ? objM17291f : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4651x60b0420(boolean z10, boolean z11, RoomDatabase roomDatabase, InterfaceC9324c interfaceC9324c, InterfaceC10570l interfaceC10570l) {
        super(2, interfaceC9324c);
        this.$inTransaction = z10;
        this.$isReadOnly = z11;
        this.$this_internalPerform = roomDatabase;
        this.$block$inlined = interfaceC10570l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        C4651x60b0420 c4651x60b0420 = new C4651x60b0420(this.$inTransaction, this.$isReadOnly, this.$this_internalPerform, interfaceC9324c, this.$block$inlined);
        c4651x60b0420.L$0 = obj;
        return c4651x60b0420;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(Transactor transactor, InterfaceC9324c<? super R> interfaceC9324c) {
        return ((C4651x60b0420) create(transactor, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r9.sync$room_runtime_release(r8) == r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[PHI: r1 r9
      0x00a8: PHI (r1v12 androidx.room.Transactor) = (r1v9 androidx.room.Transactor), (r1v19 androidx.room.Transactor) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
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
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C4651x60b0420.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
