package com.zykj.evaluation.p057ui.guide.normal.toCorrect;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.constant.WhenShowState;
import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.p057ui.guide.normal.GuideViewModel;
import com.zykj.evaluation.submit.SubmitTaskManger;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import p133j6.AbstractC7813q;
import p200p5.InterfaceC8843j;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001e\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010+\u001a\u0012\u0012\u0004\u0012\u00020'0&j\b\u0012\u0004\u0012\u00020'`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m13558d2 = {"Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;", "Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "submitTaskManger", "Lcom/zykj/evaluation/di/AppDatabase;", "database", "<init>", "(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V", "", "taskId", "", "s", "(J)V", "Lcom/zykj/evaluation/bean/GuideTaskInfo;", "Lcom/zykj/evaluation/bean/GuideNormalQuestion;", ExifInterface.LATITUDE_SOUTH, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "guideTaskInfo", "Y", "(Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "whenShowState", "", "M", "(I)Z", "b0", "r", "Lp5/j;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "t", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "u", "Lcom/zykj/evaluation/di/AppDatabase;", "Ljava/util/ArrayList;", "Lcom/zykj/evaluation/utils/NeedReviseData;", "Lkotlin/collections/ArrayList;", "v", "Ljava/util/ArrayList;", "isQuestionNeedReviseList", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nToCorrectGuideViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToCorrectGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1563#2:204\n1634#2,2:205\n1563#2:207\n1634#2,2:208\n774#2:210\n865#2,2:211\n1761#2,3:213\n295#2,2:216\n295#2,2:218\n1636#2:221\n1636#2:222\n1#3:220\n*S KotlinDebug\n*F\n+ 1 ToCorrectGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel\n*L\n92#1:204\n92#1:205,2\n101#1:207\n101#1:208,2\n104#1:210\n104#1:211,2\n110#1:213,3\n114#1:216,2\n119#1:218,2\n101#1:221\n92#1:222\n*E\n"})
/* loaded from: classes4.dex */
public final class ToCorrectGuideViewModel extends GuideViewModel {

    /* renamed from: r, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: s, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: t, reason: from kotlin metadata */
    public final SubmitTaskManger submitTaskManger;

    /* renamed from: u, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: v, reason: from kotlin metadata */
    public final ArrayList isQuestionNeedReviseList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectGuideViewModel(InterfaceC8843j service, MutableStateFlow userInfo, SubmitTaskManger submitTaskManger, AppDatabase database) {
        super(service, userInfo, submitTaskManger);
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(submitTaskManger, "submitTaskManger");
        Intrinsics.checkNotNullParameter(database, "database");
        this.service = service;
        this.userInfo = userInfo;
        this.submitTaskManger = submitTaskManger;
        this.database = database;
        m9866V(CollectionsKt.listOf((Object[]) new AbstractC7813q[]{AbstractC7813q.m.f13529e, AbstractC7813q.k.f13527e, AbstractC7813q.d.f13520e, AbstractC7813q.i.f13525e}));
        this.isQuestionNeedReviseList = new ArrayList();
    }

    @Override // com.zykj.evaluation.p057ui.guide.normal.GuideViewModel
    /* renamed from: M */
    public boolean mo9857M(int whenShowState) {
        return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(WhenShowState.ToDo.INSTANCE.getState()), Integer.valueOf(WhenShowState.Correcting.INSTANCE.getState()), Integer.valueOf(WhenShowState.ToCorrect.INSTANCE.getState())}).contains(Integer.valueOf(whenShowState));
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
            boolean r0 = r7 instanceof com.zykj.evaluation.p057ui.guide.normal.toCorrect.ToCorrectGuideViewModel$getTaskInfo$1
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.evaluation.ui.guide.normal.toCorrect.ToCorrectGuideViewModel$getTaskInfo$1 r0 = (com.zykj.evaluation.p057ui.guide.normal.toCorrect.ToCorrectGuideViewModel$getTaskInfo$1) r0
            int r1 = r0.f9673c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9673c = r1
            goto L18
        L13:
            com.zykj.evaluation.ui.guide.normal.toCorrect.ToCorrectGuideViewModel$getTaskInfo$1 r0 = new com.zykj.evaluation.ui.guide.normal.toCorrect.ToCorrectGuideViewModel$getTaskInfo$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f9671a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f9673c
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
            r0.f9673c = r3
            java.lang.Object r7 = r7.m14833o(r4, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            com.zykj.http.bean.ApiResp r7 = (com.zykj.http.bean.ApiResp) r7
            java.lang.Object r7 = p189o5.AbstractC8711g.m14346a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.normal.toCorrect.ToCorrectGuideViewModel.mo9863S(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel.smali:365
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.zykj.evaluation.p057ui.guide.normal.GuideViewModel
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo9869Y(com.zykj.evaluation.bean.GuideTaskInfo r58, kotlin.coroutines.Continuation r59) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.normal.toCorrect.ToCorrectGuideViewModel.mo9869Y(com.zykj.evaluation.bean.GuideTaskInfo, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel.smali:527
    }

    /* renamed from: b0 */
    public final Object m9889b0(Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ToCorrectGuideViewModel$getQuestionCommitMap$2(this, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Override // com.zykj.evaluation.p057ui.guide.normal.GuideViewModel, com.zykj.evaluation.p057ui.guide.BaseGuideViewModel
    /* renamed from: s */
    public void mo9778s(long taskId) {
        super.mo9778s(taskId);
        BaseViewModel.m8644f(this, null, null, null, null, null, new ToCorrectGuideViewModel$initData$1(this, null), 31, null);
    }
}
