package com.zykj.evaluation.p057ui.guide.normal.revising;

import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.PlatformSpanStyle;
import androidx.compose.p013ui.text.SpanStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.evaluation.bean.GuideGroup;
import com.zykj.evaluation.bean.GuideNormalQuestion;
import com.zykj.evaluation.bean.GuideTaskInfo;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import p133j6.AbstractC7813q;
import p133j6.C7799c;
import p133j6.C7804h;
import p133j6.C7812p;
import p200p5.InterfaceC8843j;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m13558d2 = {"Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;", "Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "submitTaskManger", "<init>", "(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V", "Lcom/zykj/evaluation/bean/GuideTaskInfo;", "Lcom/zykj/evaluation/bean/GuideNormalQuestion;", ExifInterface.LATITUDE_SOUTH, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "guideTaskInfo", "", "Y", "(Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "whenShowState", "", "M", "(I)Z", "r", "Lp5/j;", "s", "Lkotlinx/coroutines/flow/MutableStateFlow;", "t", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRevisingGuideViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevisingGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1563#2:116\n1634#2,2:117\n1563#2:119\n1634#2,3:120\n1636#2:123\n*S KotlinDebug\n*F\n+ 1 RevisingGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel\n*L\n47#1:116\n47#1:117,2\n61#1:119\n61#1:120,3\n47#1:123\n*E\n"})
/* loaded from: classes4.dex */
public final class RevisingGuideViewModel extends GuideViewModel {

    /* renamed from: r, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: s, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: t, reason: from kotlin metadata */
    public final SubmitTaskManger submitTaskManger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevisingGuideViewModel(InterfaceC8843j service, MutableStateFlow userInfo, SubmitTaskManger submitTaskManger) {
        super(service, userInfo, submitTaskManger);
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(submitTaskManger, "submitTaskManger");
        this.service = service;
        this.userInfo = userInfo;
        this.submitTaskManger = submitTaskManger;
        m9866V(CollectionsKt.listOf((Object[]) new AbstractC7813q[]{AbstractC7813q.f.f13522e, AbstractC7813q.d.f13520e, AbstractC7813q.i.f13525e}));
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
            boolean r0 = r7 instanceof com.zykj.evaluation.p057ui.guide.normal.revising.RevisingGuideViewModel$getTaskInfo$1
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.evaluation.ui.guide.normal.revising.RevisingGuideViewModel$getTaskInfo$1 r0 = (com.zykj.evaluation.p057ui.guide.normal.revising.RevisingGuideViewModel$getTaskInfo$1) r0
            int r1 = r0.f9661c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9661c = r1
            goto L18
        L13:
            com.zykj.evaluation.ui.guide.normal.revising.RevisingGuideViewModel$getTaskInfo$1 r0 = new com.zykj.evaluation.ui.guide.normal.revising.RevisingGuideViewModel$getTaskInfo$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f9659a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f9661c
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
            r0.f9661c = r3
            java.lang.Object r7 = r7.m14833o(r4, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            com.zykj.http.bean.ApiResp r7 = (com.zykj.http.bean.ApiResp) r7
            java.lang.Object r7 = p189o5.AbstractC8711g.m14346a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.normal.revising.RevisingGuideViewModel.mo9863S(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel.smali:284
    }

    @Override // com.zykj.evaluation.p057ui.guide.normal.GuideViewModel
    /* renamed from: Y */
    public Object mo9869Y(GuideTaskInfo guideTaskInfo, Continuation continuation) {
        String str;
        Iterator it;
        String str2;
        Iterator it2;
        GuideNormalQuestion guideNormalQuestion;
        AbstractC7813q abstractC7813q;
        String str3;
        List groups = guideTaskInfo.getGroups();
        int i10 = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(groups, 10));
        Iterator it3 = groups.iterator();
        while (it3.hasNext()) {
            GuideGroup guideGroup = (GuideGroup) it3.next();
            boolean zContains = CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(WhenShowState.ToDo.INSTANCE.getState()), Boxing.boxInt(WhenShowState.Correcting.INSTANCE.getState()), Boxing.boxInt(WhenShowState.ToCorrect.INSTANCE.getState())}).contains(Boxing.boxInt(guideTaskInfo.getWhenShowMicroLesson()));
            String title = guideGroup.getTitle();
            int qstCount = guideGroup.getQstCount();
            if (guideTaskInfo.getEnableScore()) {
                str = "，共" + guideGroup.getScore() + "分）";
            } else {
                str = "）";
            }
            String str4 = "（共" + qstCount + "题" + str;
            String description = guideGroup.getDescription();
            if (description == null) {
                description = "";
            }
            List questions = guideGroup.getQuestions();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(questions, i10));
            Iterator it4 = questions.iterator();
            while (it4.hasNext()) {
                GuideNormalQuestion guideNormalQuestion2 = (GuideNormalQuestion) it4.next();
                AbstractC7813q abstractC7813q2 = guideNormalQuestion2.getNeedRevise() ? guideNormalQuestion2.getCompleted() ? AbstractC7813q.d.f13520e : AbstractC7813q.f.f13522e : AbstractC7813q.i.f13525e;
                if (!guideTaskInfo.getEnableScore() || guideNormalQuestion2.getOriginScore() == null) {
                    it = it4;
                    str2 = "";
                } else {
                    it = it4;
                    str2 = guideNormalQuestion2.getOriginScore() + "/" + guideNormalQuestion2.getScore() + "分";
                }
                if (guideTaskInfo.getEnableScore()) {
                    guideNormalQuestion = guideNormalQuestion2;
                    abstractC7813q = abstractC7813q2;
                    it2 = it3;
                    str3 = guideNormalQuestion.getMyScore() + "/" + guideNormalQuestion.getScore() + "分";
                } else {
                    it2 = it3;
                    guideNormalQuestion = guideNormalQuestion2;
                    abstractC7813q = abstractC7813q2;
                    str3 = "";
                }
                long id = guideNormalQuestion.getId();
                AbstractC7813q abstractC7813q3 = abstractC7813q;
                String title2 = guideNormalQuestion.getTitle();
                boolean askForHelp = guideNormalQuestion.getAskForHelp();
                boolean z9 = zContains && guideNormalQuestion.getHasMicroClass();
                AnnotatedString.Builder builder = new AnnotatedString.Builder(str2);
                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), 0, builder.getLength());
                Unit unit = Unit.INSTANCE;
                arrayList2.add(new C7804h(id, abstractC7813q3, title2, askForHelp, z9, builder.toAnnotatedString(), str3));
                it4 = it;
                it3 = it2;
            }
            arrayList.add(new C7799c(title, str4, description, arrayList2));
            it3 = it3;
            i10 = 10;
        }
        m9865U(C7812p.m13231b(m9861Q(), false, arrayList, false, 5, null));
        return Unit.INSTANCE;
    }
}
