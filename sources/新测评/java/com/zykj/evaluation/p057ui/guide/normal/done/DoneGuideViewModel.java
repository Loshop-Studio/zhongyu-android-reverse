package com.zykj.evaluation.p057ui.guide.normal.done;

import androidx.camera.video.AudioStats;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.evaluation.bean.GuideGroup;
import com.zykj.evaluation.bean.GuideNormalQuestion;
import com.zykj.evaluation.bean.GuideTaskInfo;
import com.zykj.evaluation.bean.constant.QuestionTypeEnum;
import com.zykj.evaluation.bean.constant.WhenShowState;
import com.zykj.evaluation.p057ui.guide.normal.GuideViewModel;
import com.zykj.evaluation.submit.SubmitTaskManger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import p133j6.AbstractC7813q;
import p133j6.C7799c;
import p133j6.C7804h;
import p133j6.C7812p;
import p200p5.InterfaceC8843j;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u000e¨\u0006$"}, m13558d2 = {"Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;", "Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "submitTaskManger", "<init>", "(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V", "", "examIsFinish", "", "Z", "(Z)V", "Lcom/zykj/evaluation/bean/GuideTaskInfo;", "Lcom/zykj/evaluation/bean/GuideNormalQuestion;", ExifInterface.LATITUDE_SOUTH, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "guideTaskInfo", "Y", "(Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "whenShowState", "M", "(I)Z", "r", "Lp5/j;", "s", "Lkotlinx/coroutines/flow/MutableStateFlow;", "t", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "u", "v", "a", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nDoneGuideViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoneGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1563#2:153\n1634#2,2:154\n1563#2:156\n1634#2,3:157\n1636#2:160\n*S KotlinDebug\n*F\n+ 1 DoneGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel\n*L\n82#1:153\n82#1:154,2\n88#1:156\n88#1:157,3\n82#1:160\n*E\n"})
/* loaded from: classes4.dex */
public final class DoneGuideViewModel extends GuideViewModel {

    /* renamed from: w */
    public static final int f9648w = 8;

    /* renamed from: r, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: s, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: t, reason: from kotlin metadata */
    public final SubmitTaskManger submitTaskManger;

    /* renamed from: u, reason: from kotlin metadata */
    public boolean examIsFinish;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoneGuideViewModel(InterfaceC8843j service, MutableStateFlow userInfo, SubmitTaskManger submitTaskManger) {
        super(service, userInfo, submitTaskManger);
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(submitTaskManger, "submitTaskManger");
        this.service = service;
        this.userInfo = userInfo;
        this.submitTaskManger = submitTaskManger;
        m9866V(CollectionsKt.emptyList());
    }

    @Override // com.zykj.evaluation.p057ui.guide.normal.GuideViewModel
    /* renamed from: M */
    public boolean mo9857M(int whenShowState) {
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(Integer.valueOf(WhenShowState.ToDo.INSTANCE.getState()), Integer.valueOf(WhenShowState.Correcting.INSTANCE.getState()), Integer.valueOf(WhenShowState.ToCorrect.INSTANCE.getState()), Integer.valueOf(WhenShowState.Completed.INSTANCE.getState()));
        if (this.examIsFinish) {
            arrayListArrayListOf.add(Integer.valueOf(WhenShowState.ExamFinished.INSTANCE.getState()));
        }
        return arrayListArrayListOf.contains(Integer.valueOf(whenShowState));
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
            boolean r0 = r7 instanceof com.zykj.evaluation.p057ui.guide.normal.done.DoneGuideViewModel$getTaskInfo$1
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.evaluation.ui.guide.normal.done.DoneGuideViewModel$getTaskInfo$1 r0 = (com.zykj.evaluation.p057ui.guide.normal.done.DoneGuideViewModel$getTaskInfo$1) r0
            int r1 = r0.f9655c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9655c = r1
            goto L18
        L13:
            com.zykj.evaluation.ui.guide.normal.done.DoneGuideViewModel$getTaskInfo$1 r0 = new com.zykj.evaluation.ui.guide.normal.done.DoneGuideViewModel$getTaskInfo$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f9653a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f9655c
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
            r0.f9655c = r3
            java.lang.Object r7 = r7.m14840v(r4, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            com.zykj.http.bean.ApiResp r7 = (com.zykj.http.bean.ApiResp) r7
            java.lang.Object r7 = p189o5.AbstractC8711g.m14346a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.normal.done.DoneGuideViewModel.mo9863S(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel.smali:330
    }

    @Override // com.zykj.evaluation.p057ui.guide.normal.GuideViewModel
    /* renamed from: Y */
    public Object mo9869Y(GuideTaskInfo guideTaskInfo, Continuation continuation) {
        Iterator it;
        String str;
        m9866V(guideTaskInfo.getEnableScore() ? CollectionsKt.listOf((Object[]) new AbstractC7813q[]{AbstractC7813q.j.f13526e, AbstractC7813q.b.f13518e, AbstractC7813q.a.f13517e}) : CollectionsKt.listOf((Object[]) new AbstractC7813q[]{AbstractC7813q.j.f13526e, AbstractC7813q.c.f13519e, AbstractC7813q.b.f13518e, AbstractC7813q.a.f13517e}));
        boolean zMo9857M = mo9857M(guideTaskInfo.getWhenShowMicroLesson());
        List<GuideGroup> groups = guideTaskInfo.getGroups();
        int i10 = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(groups, 10));
        for (GuideGroup guideGroup : groups) {
            String title = guideGroup.getTitle();
            String str2 = "（共" + guideGroup.getQstCount() + "题" + (guideTaskInfo.getEnableScore() ? "，共" + guideGroup.getScore() + "分）" : "）");
            String description = guideGroup.getDescription();
            if (description == null) {
                description = "";
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(guideGroup.getQuestions(), i10));
            for (Iterator it2 = r7.iterator(); it2.hasNext(); it2 = it) {
                GuideNormalQuestion guideNormalQuestion = (GuideNormalQuestion) it2.next();
                int state = guideNormalQuestion.getState();
                AbstractC7813q abstractC7813q = state != 0 ? state != 2 ? AbstractC7813q.j.f13526e : AbstractC7813q.a.f13517e : (!guideTaskInfo.getEnableScore() && CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(QuestionTypeEnum.QSTANDANSWER.getType()), Boxing.boxInt(QuestionTypeEnum.WRITING.getType()), Boxing.boxInt(QuestionTypeEnum.COMPOSITION.getType())}).contains(Boxing.boxInt(guideNormalQuestion.getItemType())) && ((guideNormalQuestion.getMyScore() > AudioStats.AUDIO_AMPLITUDE_NONE ? 1 : (guideNormalQuestion.getMyScore() == AudioStats.AUDIO_AMPLITUDE_NONE ? 0 : -1)) > 0 && (guideNormalQuestion.getMyScore() > guideNormalQuestion.getScore() ? 1 : (guideNormalQuestion.getMyScore() == guideNormalQuestion.getScore() ? 0 : -1)) < 0) && guideNormalQuestion.getRevisingResult() == 0) ? AbstractC7813q.c.f13519e : AbstractC7813q.b.f13518e;
                if (guideTaskInfo.getEnableScore()) {
                    it = it2;
                    str = guideNormalQuestion.getMyScore() + "/" + guideNormalQuestion.getScore() + "分";
                } else {
                    it = it2;
                    str = "";
                }
                arrayList2.add(new C7804h(guideNormalQuestion.getId(), abstractC7813q, guideNormalQuestion.getTitle(), guideNormalQuestion.getAskForHelp(), zMo9857M && guideNormalQuestion.getHasMicroClass(), new AnnotatedString("", null, 2, null), str));
            }
            arrayList.add(new C7799c(title, str2, description, arrayList2));
            i10 = 10;
        }
        m9865U(C7812p.m13231b(m9861Q(), false, arrayList, false, 5, null));
        return Unit.INSTANCE;
    }

    /* renamed from: Z */
    public final void m9875Z(boolean examIsFinish) {
        this.examIsFinish = examIsFinish;
    }
}
