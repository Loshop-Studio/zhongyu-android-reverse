package com.zykj.evaluation.p057ui.detail.mistake;

import com.zykj.evaluation.bean.CreateTagReq;
import com.zykj.http.bean.ApiResp;
import com.zykj.http.exception.RemoteCodeException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p189o5.AbstractC8711g;
import p200p5.InterfaceC8843j;
import p306z5.C10013l1;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$createOrUpdateTag$1", m13596f = "MistakeViewModel.kt", m13597i = {}, m13598l = {162}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nMistakeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,585:1\n230#2,3:586\n233#2,2:591\n1869#3,2:589\n*S KotlinDebug\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1\n*L\n165#1:586,3\n165#1:591,2\n169#1:589,2\n*E\n"})
/* loaded from: classes4.dex */
public final class MistakeViewModel$createOrUpdateTag$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9304a;

    /* renamed from: b */
    public final /* synthetic */ MistakeViewModel f9305b;

    /* renamed from: c */
    public final /* synthetic */ long f9306c;

    /* renamed from: d */
    public final /* synthetic */ String f9307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeViewModel$createOrUpdateTag$1(MistakeViewModel mistakeViewModel, long j10, String str, Continuation continuation) {
        super(2, continuation);
        this.f9305b = mistakeViewModel;
        this.f9306c = j10;
        this.f9307d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MistakeViewModel$createOrUpdateTag$1(this.f9305b, this.f9306c, this.f9307d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RemoteCodeException {
        Object objM14835q;
        Object value;
        C10013l1 c10013l1;
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9304a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8843j interfaceC8843j = this.f9305b.androidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String;
            CreateTagReq createTagReq = new CreateTagReq(Boxing.boxLong(this.f9306c), this.f9307d);
            this.f9304a = 1;
            objM14835q = interfaceC8843j.m14835q(createTagReq, this);
            if (objM14835q == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM14835q = obj;
        }
        Object objM14346a = AbstractC8711g.m14346a((ApiResp) objM14835q);
        MistakeViewModel mistakeViewModel = this.f9305b;
        String str = this.f9307d;
        long jLongValue = ((Number) objM14346a).longValue();
        MutableStateFlow mutableStateFlow = mistakeViewModel._mistakeUiState;
        do {
            value = mutableStateFlow.getValue();
            c10013l1 = (C10013l1) value;
            arrayList = new ArrayList();
            boolean z9 = true;
            for (TagData tagData : c10013l1.m16849e()) {
                if (tagData.getId() == jLongValue) {
                    arrayList.add(TagData.copy$default(tagData, 0L, str, false, 5, null));
                    z9 = false;
                } else {
                    arrayList.add(tagData);
                }
            }
            if (z9) {
                arrayList.add(1, new TagData(jLongValue, str, !MistakeViewModel.m9575w(mistakeViewModel, null, 1, null)));
            }
            Unit unit = Unit.INSTANCE;
        } while (!mutableStateFlow.compareAndSet(value, C10013l1.m16845b(c10013l1, null, 0L, false, null, null, false, null, null, null, arrayList, null, 1535, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MistakeViewModel$createOrUpdateTag$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
