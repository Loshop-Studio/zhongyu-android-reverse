package com.zykj.student.dialogue.p076ui.collect;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.TimeUtils;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.student.dialogue.bean.req.CollectReq;
import com.zykj.student.dialogue.network.BaseResponse;
import com.zykj.student.dialogue.p076ui.collect.AbstractC7494b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p128h6.AbstractC8103b;
import p138i6.AbstractC8137c;
import p158k6.InterfaceC8287g;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.CollectHistoryViewModel$updateCollectState$1", m13451f = "CollectHistoryViewModel.kt", m13452i = {}, m13453l = {100}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class CollectHistoryViewModel$updateCollectState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10764a;

    /* renamed from: b */
    public final /* synthetic */ CollectHistoryViewModel f10765b;

    /* renamed from: c */
    public final /* synthetic */ String f10766c;

    /* renamed from: d */
    public final /* synthetic */ boolean f10767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectHistoryViewModel$updateCollectState$1(CollectHistoryViewModel collectHistoryViewModel, String str, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f10765b = collectHistoryViewModel;
        this.f10766c = str;
        this.f10767d = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectHistoryViewModel$updateCollectState$1(this.f10765b, this.f10766c, this.f10767d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RemoteCodeException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f10764a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8287g interfaceC8287gM10118r = this.f10765b.getDialogueApi();
            CollectReq collectReq = new CollectReq(this.f10766c, this.f10767d);
            this.f10764a = 1;
            obj = interfaceC8287gM10118r.m13390f(collectReq, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AbstractC8137c.m13043b((BaseResponse) obj);
        this.f10765b.m9922g(new AbstractC8103b.a.b(this.f10767d ? "收藏成功" : "取消收藏成功"));
        CollectHistoryViewModel collectHistoryViewModel = this.f10765b;
        String str = this.f10766c;
        boolean z9 = this.f10767d;
        collectHistoryViewModel.m10120t(new AbstractC7494b.a(str, z9, z9 ? TimeUtils.getNowString() : null));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CollectHistoryViewModel$updateCollectState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
