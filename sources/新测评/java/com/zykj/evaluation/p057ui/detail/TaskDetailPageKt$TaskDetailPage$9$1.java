package com.zykj.evaluation.p057ui.detail;

import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.p057ui.guide.normal.GuideViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p101g7.AbstractC7586b;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.TaskDetailPageKt$TaskDetailPage$9$1", m13596f = "TaskDetailPage.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class TaskDetailPageKt$TaskDetailPage$9$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9190a;

    /* renamed from: b */
    public final /* synthetic */ BaseDetailViewModel f9191b;

    /* renamed from: c */
    public final /* synthetic */ DetailBundle f9192c;

    /* renamed from: d */
    public final /* synthetic */ GuideViewModel f9193d;

    /* renamed from: e */
    public final /* synthetic */ long f9194e;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "Lcom/zykj/evaluation/bean/bundle/DetailBundle;", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.TaskDetailPageKt$TaskDetailPage$9$1$1", m13596f = "TaskDetailPage.kt", m13597i = {}, m13598l = {94}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.ui.detail.TaskDetailPageKt$TaskDetailPage$9$1$1 */
    public static final class C68951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DetailBundle>, Object> {

        /* renamed from: a */
        public int f9195a;

        /* renamed from: b */
        public final /* synthetic */ GuideViewModel f9196b;

        /* renamed from: c */
        public final /* synthetic */ long f9197c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C68951(GuideViewModel guideViewModel, long j10, Continuation continuation) {
            super(2, continuation);
            this.f9196b = guideViewModel;
            this.f9197c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C68951(this.f9196b, this.f9197c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super DetailBundle> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f9195a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            GuideViewModel guideViewModel = this.f9196b;
            long j10 = this.f9197c;
            this.f9195a = 1;
            Object objM9856L = guideViewModel.m9856L(j10, this);
            return objM9856L == coroutine_suspended ? coroutine_suspended : objM9856L;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C68951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskDetailPageKt$TaskDetailPage$9$1(BaseDetailViewModel baseDetailViewModel, DetailBundle detailBundle, GuideViewModel guideViewModel, long j10, Continuation continuation) {
        super(2, continuation);
        this.f9191b = baseDetailViewModel;
        this.f9192c = detailBundle;
        this.f9193d = guideViewModel;
        this.f9194e = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaskDetailPageKt$TaskDetailPage$9$1(this.f9191b, this.f9192c, this.f9193d, this.f9194e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9190a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.f9191b.m9280Y()) {
            return Unit.INSTANCE;
        }
        DetailBundle detailBundle = this.f9192c;
        if (detailBundle == null) {
            this.f9191b.m9278V(new C68951(this.f9193d, this.f9194e, null));
        } else {
            BaseDetailViewModel.m9255W(this.f9191b, detailBundle, false, 2, null);
            AbstractC7586b.m12450a().putParcelable("KEY_DETAIL_BUNDLE", null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TaskDetailPageKt$TaskDetailPage$9$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
