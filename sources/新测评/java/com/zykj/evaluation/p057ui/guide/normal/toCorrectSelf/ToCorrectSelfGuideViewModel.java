package com.zykj.evaluation.p057ui.guide.normal.toCorrectSelf;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.zykj.evaluation.bean.constant.WhenShowState;
import com.zykj.evaluation.p057ui.guide.normal.GuideViewModel;
import com.zykj.evaluation.submit.SubmitTaskManger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import p133j6.AbstractC7813q;
import p200p5.InterfaceC8843j;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m13558d2 = {"Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;", "Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "submitTaskManger", "<init>", "(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V", "Lcom/zykj/evaluation/bean/GuideTaskInfo;", "Lcom/zykj/evaluation/bean/GuideNormalQuestion;", ExifInterface.LATITUDE_SOUTH, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "guideTaskInfo", "", "Y", "(Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "whenShowState", "", "M", "(I)Z", "c0", "()V", "r", "Lp5/j;", "s", "Lkotlinx/coroutines/flow/MutableStateFlow;", "t", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nToCorrectSelfGuideViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToCorrectSelfGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1563#2:125\n1634#2,2:126\n1563#2:128\n1634#2,2:129\n1636#2:132\n1636#2:133\n1#3:131\n*S KotlinDebug\n*F\n+ 1 ToCorrectSelfGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel\n*L\n57#1:125\n57#1:126,2\n70#1:128\n70#1:129,2\n70#1:132\n57#1:133\n*E\n"})
/* loaded from: classes4.dex */
public final class ToCorrectSelfGuideViewModel extends GuideViewModel {

    /* renamed from: r, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: s, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: t, reason: from kotlin metadata */
    public final SubmitTaskManger submitTaskManger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectSelfGuideViewModel(InterfaceC8843j service, MutableStateFlow userInfo, SubmitTaskManger submitTaskManger) {
        super(service, userInfo, submitTaskManger);
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(submitTaskManger, "submitTaskManger");
        this.service = service;
        this.userInfo = userInfo;
        this.submitTaskManger = submitTaskManger;
        m9866V(CollectionsKt.listOf((Object[]) new AbstractC7813q[]{AbstractC7813q.g.f13523e, AbstractC7813q.j.f13526e, AbstractC7813q.b.f13518e}));
    }

    @Override // com.zykj.evaluation.p057ui.guide.normal.GuideViewModel
    /* renamed from: M */
    public boolean mo9857M(int whenShowState) {
        return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(WhenShowState.ToDo.INSTANCE.getState()), Integer.valueOf(WhenShowState.Correcting.INSTANCE.getState())}).contains(Integer.valueOf(whenShowState));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.evaluation.p057ui.guide.normal.GuideViewModel
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo9863S(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.zykj.evaluation.p057ui.guide.normal.toCorrectSelf.ToCorrectSelfGuideViewModel$getTaskInfo$1
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.evaluation.ui.guide.normal.toCorrectSelf.ToCorrectSelfGuideViewModel$getTaskInfo$1 r0 = (com.zykj.evaluation.p057ui.guide.normal.toCorrectSelf.ToCorrectSelfGuideViewModel$getTaskInfo$1) r0
            int r1 = r0.f9687c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9687c = r1
            goto L18
        L13:
            com.zykj.evaluation.ui.guide.normal.toCorrectSelf.ToCorrectSelfGuideViewModel$getTaskInfo$1 r0 = new com.zykj.evaluation.ui.guide.normal.toCorrectSelf.ToCorrectSelfGuideViewModel$getTaskInfo$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f9685a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f9687c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.ResultKt.throwOnFailure(r7)
            p5.j r7 = r6.service
            long r4 = r6.m9776q()
            r0.f9687c = r3
            java.lang.Object r7 = r7.m14840v(r4, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            com.zykj.http.bean.ApiResp r7 = (com.zykj.http.bean.ApiResp) r7
            java.lang.Object r7 = p189o5.AbstractC8711g.m14346a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.normal.toCorrectSelf.ToCorrectSelfGuideViewModel.mo9863S(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel.smali:303
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    @Override // com.zykj.evaluation.p057ui.guide.normal.GuideViewModel
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo9869Y(com.zykj.evaluation.bean.GuideTaskInfo r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.normal.toCorrectSelf.ToCorrectSelfGuideViewModel.mo9869Y(com.zykj.evaluation.bean.GuideTaskInfo, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel.smali:465
    }

    /* renamed from: c0 */
    public final void m9904c0() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ToCorrectSelfGuideViewModel$submitCorrectSelfTasK$1(this, null), 3, null);
    }
}
