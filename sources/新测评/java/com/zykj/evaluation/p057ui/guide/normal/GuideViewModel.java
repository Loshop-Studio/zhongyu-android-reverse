package com.zykj.evaluation.p057ui.guide.normal;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.GuideGroup;
import com.zykj.evaluation.bean.GuideNormalQuestion;
import com.zykj.evaluation.bean.GuideTaskInfo;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.p057ui.detail.GuideQuestion;
import com.zykj.evaluation.p057ui.guide.BaseGuideViewModel;
import com.zykj.evaluation.submit.SubmitTaskManger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import p133j6.C7812p;
import p200p5.InterfaceC8843j;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010 J\u001d\u0010%\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R+\u00105\u001a\u00020-2\u0006\u0010.\u001a\u00020-8F@DX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R7\u0010=\u001a\b\u0012\u0004\u0012\u000207062\f\u0010.\u001a\b\u0012\u0004\u0012\u000207068F@DX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00100\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010C\u001a\b\u0012\u0004\u0012\u00020>068\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<¨\u0006D"}, m13558d2 = {"Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;", "Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;", "Lcom/zykj/evaluation/bean/GuideNormalQuestion;", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "submitTaskManger", "<init>", "(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V", "Lcom/zykj/evaluation/bean/GuideTaskInfo;", ExifInterface.LATITUDE_SOUTH, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "guideTaskInfo", "", "Y", "(Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "whenShowState", "", "M", "(I)Z", "", "taskId", "s", "(J)V", "Lcom/zykj/evaluation/bean/bundle/DetailBundle;", "L", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.LONGITUDE_WEST, "()V", "questionId", "N", "(J)Lcom/zykj/evaluation/bean/bundle/DetailBundle;", "P", "X", "(Lcom/zykj/evaluation/bean/GuideTaskInfo;)V", "l", "Lp5/j;", "m", "Lkotlinx/coroutines/flow/MutableStateFlow;", "n", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "Lj6/p;", "<set-?>", "o", "Landroidx/compose/runtime/MutableState;", "Q", "()Lj6/p;", "U", "(Lj6/p;)V", "guideViewState", "", "Lj6/q;", "p", "R", "()Ljava/util/List;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/util/List;)V", "questionTagState", "Lcom/zykj/evaluation/ui/detail/GuideQuestion;", "q", "Ljava/util/List;", "O", ExifInterface.GPS_DIRECTION_TRUE, "guideQuestionList", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nGuideViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/GuideViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n85#2:209\n113#2,2:210\n85#2:212\n113#2,2:213\n1869#3:215\n1869#3,2:216\n1870#3:218\n360#3,7:219\n*S KotlinDebug\n*F\n+ 1 GuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/GuideViewModel\n*L\n60#1:209\n60#1:210,2\n64#1:212\n64#1:213,2\n142#1:215\n143#1:216,2\n142#1:218\n185#1:219,7\n*E\n"})
/* loaded from: classes4.dex */
public abstract class GuideViewModel extends BaseGuideViewModel<GuideNormalQuestion> {

    /* renamed from: l, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: n, reason: from kotlin metadata */
    public final SubmitTaskManger submitTaskManger;

    /* renamed from: o, reason: from kotlin metadata */
    public final MutableState guideViewState;

    /* renamed from: p, reason: from kotlin metadata */
    public final MutableState questionTagState;

    /* renamed from: q, reason: from kotlin metadata */
    public List guideQuestionList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideViewModel(InterfaceC8843j service, MutableStateFlow userInfo, SubmitTaskManger submitTaskManger) {
        super(service, userInfo);
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(submitTaskManger, "submitTaskManger");
        this.service = service;
        this.userInfo = userInfo;
        this.submitTaskManger = submitTaskManger;
        this.guideViewState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C7812p(false, null, false, 7, null), null, 2, null);
        this.questionTagState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9856L(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.zykj.evaluation.p057ui.guide.normal.GuideViewModel$buildDetailBundleWithRequest$1
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.evaluation.ui.guide.normal.GuideViewModel$buildDetailBundleWithRequest$1 r0 = (com.zykj.evaluation.p057ui.guide.normal.GuideViewModel$buildDetailBundleWithRequest$1) r0
            int r1 = r0.f9627e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9627e = r1
            goto L18
        L13:
            com.zykj.evaluation.ui.guide.normal.GuideViewModel$buildDetailBundleWithRequest$1 r0 = new com.zykj.evaluation.ui.guide.normal.GuideViewModel$buildDetailBundleWithRequest$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f9625c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f9627e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f9624b
            com.zykj.evaluation.ui.guide.normal.GuideViewModel r5 = (com.zykj.evaluation.p057ui.guide.normal.GuideViewModel) r5
            kotlin.ResultKt.throwOnFailure(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r7)
            r4.m9783x(r5)
            r0.f9624b = r4
            r0.f9623a = r5
            r0.f9627e = r3
            java.lang.Object r7 = r4.mo9863S(r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            com.zykj.evaluation.bean.GuideTaskInfo r7 = (com.zykj.evaluation.bean.GuideTaskInfo) r7
            r5.m9780u(r7)
            com.zykj.evaluation.bean.GuideTaskInfo r5 = r4.getGuideTaskInfo()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r4.m9868X(r5)
            java.util.List r5 = r4.m9859O()
            java.lang.Object r5 = kotlin.collections.CollectionsKt.firstOrNull(r5)
            com.zykj.evaluation.ui.detail.GuideQuestion r5 = (com.zykj.evaluation.p057ui.detail.GuideQuestion) r5
            if (r5 == 0) goto L6d
            long r5 = r5.getQuestionId()
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            goto L6e
        L6d:
            r5 = 0
        L6e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            long r5 = r5.longValue()
            com.zykj.evaluation.bean.bundle.DetailBundle r5 = r4.m9858N(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.normal.GuideViewModel.m9856L(long, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/normal/GuideViewModel.smali:354
    }

    /* renamed from: M */
    public abstract boolean mo9857M(int whenShowState);

    /* renamed from: N */
    public final DetailBundle m9858N(long questionId) {
        GuideTaskInfo guideTaskInfo = getGuideTaskInfo();
        if (guideTaskInfo == null) {
            return null;
        }
        Iterator it = m9859O().iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((GuideQuestion) it.next()).getQuestionId() == questionId) {
                break;
            }
            i10++;
        }
        int i11 = i10;
        boolean zMo9857M = mo9857M(guideTaskInfo.getWhenShowAnswer());
        boolean zMo9857M2 = mo9857M(guideTaskInfo.getWhenShowMicroLesson());
        long jM9776q = m9776q();
        long examId = guideTaskInfo.getExamId();
        List listM9859O = m9859O();
        boolean noQstStem = guideTaskInfo.getNoQstStem();
        boolean enableScore = guideTaskInfo.getEnableScore();
        String examDescription = guideTaskInfo.getExamDescription();
        String str = examDescription == null ? "" : examDescription;
        boolean zIsRepresentative = guideTaskInfo.isRepresentative();
        int specificTrainingType = guideTaskInfo.getSpecificTrainingType();
        String examName = guideTaskInfo.getExamName();
        return new DetailBundle(jM9776q, examId, listM9859O, i11, noQstStem, enableScore, zMo9857M, zMo9857M2, str, zIsRepresentative, specificTrainingType, examName == null ? "" : examName, guideTaskInfo.getTopicId());
    }

    /* renamed from: O */
    public final List m9859O() {
        List list = this.guideQuestionList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("guideQuestionList");
        return null;
    }

    /* renamed from: P */
    public final void m9860P() {
        BaseViewModel.m8644f(this, null, null, null, null, null, new GuideViewModel$getGuideTask$1(this, null), 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    public final C7812p m9861Q() {
        return (C7812p) this.guideViewState.getValue();
    }

    /* renamed from: R */
    public final List m9862R() {
        return (List) this.questionTagState.getValue();
    }

    /* renamed from: S */
    public abstract Object mo9863S(Continuation continuation);

    /* renamed from: T */
    public final void m9864T(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.guideQuestionList = list;
    }

    /* renamed from: U */
    public final void m9865U(C7812p c7812p) {
        Intrinsics.checkNotNullParameter(c7812p, "<set-?>");
        this.guideViewState.setValue(c7812p);
    }

    /* renamed from: V */
    public final void m9866V(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.questionTagState.setValue(list);
    }

    /* renamed from: W */
    public final void m9867W() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GuideViewModel$submitNormalTask$1(this, null), 3, null);
    }

    /* renamed from: X */
    public final void m9868X(GuideTaskInfo guideTaskInfo) {
        ArrayList arrayList = new ArrayList();
        for (GuideGroup guideGroup : guideTaskInfo.getGroups()) {
            for (GuideNormalQuestion guideNormalQuestion : guideGroup.getQuestions()) {
                String str = guideGroup.getName() + " " + guideNormalQuestion.getTitle();
                String description = guideGroup.getDescription();
                if (description == null) {
                    description = "";
                }
                arrayList.add(new GuideQuestion(str, description, guideNormalQuestion.getAnswerByGroup(), guideNormalQuestion.getId(), guideNormalQuestion.getRelatedGroupId(), guideNormalQuestion.getNeedRevise()));
            }
        }
        m9864T(arrayList);
    }

    /* renamed from: Y */
    public abstract Object mo9869Y(GuideTaskInfo guideTaskInfo, Continuation continuation);

    @Override // com.zykj.evaluation.p057ui.guide.BaseGuideViewModel
    /* renamed from: s */
    public void mo9778s(long taskId) {
        super.mo9778s(taskId);
        m9860P();
    }
}
