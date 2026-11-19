package com.zykj.huiwei.launcher.p035ui.fragment;

import androidx.paging.PagingData;
import com.zykj.huiwei.launcher.bean.resp.MessageInfo;
import com.zykj.huiwei.launcher.p035ui.adapter.NotificationPagingAdapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.NotificationFragment$initView$5", m7918f = "NotificationFragment.kt", m7919i = {}, m7920l = {97}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class NotificationFragment$initView$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6801a;

    /* renamed from: b */
    public final /* synthetic */ NotificationFragment f6802b;

    @Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m7880d2 = {"<anonymous>", "", "it", "Landroidx/paging/PagingData;", "Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.NotificationFragment$initView$5$1", m7918f = "NotificationFragment.kt", m7919i = {0}, m7920l = {98}, m7921m = "invokeSuspend", m7922n = {"it"}, m7923s = {"L$0"})
    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.NotificationFragment$initView$5$1 */
    public static final class C61591 extends SuspendLambda implements Function2<PagingData<MessageInfo>, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6803a;

        /* renamed from: b */
        public /* synthetic */ Object f6804b;

        /* renamed from: c */
        public final /* synthetic */ NotificationFragment f6805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61591(NotificationFragment notificationFragment, Continuation continuation) {
            super(2, continuation);
            this.f6805c = notificationFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C61591 c61591 = new C61591(this.f6805c, continuation);
            c61591.f6804b = obj;
            return c61591;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PagingData pagingData, Continuation continuation) {
            return ((C61591) create(pagingData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PagingData pagingData = (PagingData) this.f6804b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f6803a;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                NotificationPagingAdapter notificationPagingAdapter = this.f6805c.adapter;
                if (notificationPagingAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    notificationPagingAdapter = null;
                }
                this.f6804b = SpillingKt.nullOutSpilledVariable(pagingData);
                this.f6803a = 1;
                if (notificationPagingAdapter.submitData(pagingData, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(PagingData<MessageInfo> pagingData, Continuation<? super Unit> continuation) {
            return invoke2((PagingData) pagingData, (Continuation) continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationFragment$initView$5(NotificationFragment notificationFragment, Continuation continuation) {
        super(2, continuation);
        this.f6802b = notificationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationFragment$initView$5(this.f6802b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6801a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowM6180i = this.f6802b.m5979x().m6180i();
            C61591 c61591 = new C61591(this.f6802b, null);
            this.f6801a = 1;
            if (FlowKt.collectLatest(flowM6180i, c61591, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NotificationFragment$initView$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
