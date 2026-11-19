package com.zykj.evaluation.p057ui.detail.revising;

import androidx.camera.video.AudioStats;
import androidx.collection.ArrayMap;
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
import androidx.core.view.PointerIconCompat;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.DetailAnswerInfo;
import com.zykj.evaluation.bean.DetailSubQuestion;
import com.zykj.evaluation.bean.TaskDetailInfo;
import com.zykj.evaluation.bean.TaskState;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.bean.constant.QuestionResultEnum;
import com.zykj.evaluation.bean.constant.QuestionTypeEnum;
import com.zykj.evaluation.p057ui.detail.BaseDetailViewModel;
import com.zykj.evaluation.p057ui.detail.C6897b;
import com.zykj.evaluation.p057ui.detail.C6898c;
import com.zykj.evaluation.p057ui.detail.GuideQuestion;
import com.zykj.message.server.bean.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import p089f6.C7459j;
import p101g7.C7589e;
import p200p5.InterfaceC8843j;
import p276w5.AbstractC9755a;
import p276w5.AbstractC9776h;
import p276w5.C9758b;
import p276w5.C9761c;
import p276w5.C9767e;
import p276w5.C9770f;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010 \u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00120\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0&H\u0016¢\u0006\u0004\b(\u0010)J\u0083\u0001\u00107\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010,\u001a\u00020+2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020-0\u00122\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00122\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020100j\b\u0012\u0004\u0012\u000201`22\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020400j\b\u0012\u0004\u0012\u000204`22\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020400j\b\u0012\u0004\u0012\u000204`2H\u0002¢\u0006\u0004\b7\u00108Jy\u0010<\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00152\u0006\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020\u001e2\b\u0010;\u001a\u0004\u0018\u00010.2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020100j\b\u0012\u0004\u0012\u000201`22\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020400j\b\u0012\u0004\u0012\u000204`22\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020400j\b\u0012\u0004\u0012\u000204`2H\u0002¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?¨\u0006A"}, m13558d2 = {"Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;", "Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/http/bean/HeaderBean;", "headerBeanFlow", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;)V", "Lcom/zykj/evaluation/bean/bundle/DetailBundle;", "detailBundle", "", "isSpecial", "", "U", "(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V", "", "Lcom/zykj/evaluation/ui/detail/GuideQuestion;", "questionList", "", "index", "y0", "(Ljava/util/List;I)V", "Lcom/zykj/evaluation/bean/TaskDetailInfo;", "taskDetailInfo", "v0", "(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V", "", "", "localAnswerMap", "w0", "(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V", "Lf6/j;", "draftFunctions", "t", "(Lf6/j;)V", "Lkotlin/Function0;", "lastCallback", "s", "(Lf6/j;Lkotlin/jvm/functions/Function0;)V", "specificTrainingType", "", "questionId", "Lcom/zykj/evaluation/bean/DetailSubQuestion;", "Lcom/zykj/evaluation/bean/DetailAnswerInfo;", "answerList", "Ljava/util/ArrayList;", "Lw5/f;", "Lkotlin/collections/ArrayList;", "scoreList", "Lcom/zykj/evaluation/ui/detail/c;", "examAnswerList", "reviseAnswerList", "F0", "(IJLjava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "question", "numberString", "answer", "E0", "(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "w", "Lkotlinx/coroutines/flow/MutableStateFlow;", "x", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRevisingDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevisingDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel\n+ 2 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,462:1\n27#2:463\n1869#3,2:464\n1869#3:466\n1869#3,2:467\n1870#3:469\n1878#3,3:471\n1878#3,3:474\n774#3:477\n865#3,2:478\n295#3,2:480\n1563#3:482\n1634#3,3:483\n1563#3:486\n1634#3,3:487\n1#4:470\n*S KotlinDebug\n*F\n+ 1 RevisingDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel\n*L\n105#1:463\n106#1:464,2\n135#1:466\n150#1:467,2\n135#1:469\n219#1:471,3\n260#1:474,3\n295#1:477\n295#1:478,2\n299#1:480,2\n392#1:482\n392#1:483,3\n427#1:486\n427#1:487,3\n*E\n"})
/* loaded from: classes4.dex */
public final class RevisingDetailViewModel extends BaseDetailViewModel {

    /* renamed from: w, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: x, reason: from kotlin metadata */
    public final MutableStateFlow headerBeanFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevisingDetailViewModel(MutableStateFlow userInfo, MutableStateFlow headerBeanFlow, InterfaceC8843j service) {
        super(userInfo, service);
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(headerBeanFlow, "headerBeanFlow");
        Intrinsics.checkNotNullParameter(service, "service");
        this.userInfo = userInfo;
        this.headerBeanFlow = headerBeanFlow;
    }

    /* renamed from: E0 */
    public final void m9607E0(int specificTrainingType, DetailSubQuestion question, String numberString, DetailAnswerInfo answer, ArrayList scoreList, ArrayList examAnswerList, ArrayList reviseAnswerList) {
        List<String> listEmptyList;
        List listEmptyList2;
        List<String> listEmptyList3;
        List listEmptyList4;
        List<String> revisingComments;
        String str;
        List<String> examComments;
        String str2;
        Integer originResult;
        AnnotatedString annotatedString;
        boolean z9 = question.getType() == QuestionTypeEnum.QSTANDANSWER.getType();
        String displayNumber = question.getDisplayNumber();
        if (displayNumber == null) {
            displayNumber = "";
        }
        String str3 = StringsKt.isBlank(displayNumber) ? numberString : displayNumber;
        Boolean boolValueOf = null;
        if (m9266I() && answer != null && z9) {
            double score = question.getScore();
            String str4 = answer.getScore() + "/" + score;
            if (answer.getOriginScore() != null) {
                String str5 = answer.getOriginScore() + "/" + score;
                AnnotatedString.Builder builder = new AnnotatedString.Builder(str5);
                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), 0, str5.length());
                annotatedString = builder.toAnnotatedString();
            } else {
                annotatedString = new AnnotatedString("", null, 2, null);
            }
            scoreList.add(new C9770f(str3, annotatedString, str4));
        }
        C6898c c6898c = new C6898c(question.getQuestionId(), question.getUuid(), AbstractC9776h.m16384a(question.getQstType(), specificTrainingType), str3, null, null, null, null, null, null, PointerIconCompat.TYPE_TEXT, null);
        int result = (answer == null || (originResult = answer.getOriginResult()) == null) ? answer != null ? answer.getResult() : -1 : originResult.intValue();
        int result2 = answer != null ? answer.getResult() : -1;
        if (answer == null || (listEmptyList = answer.getExamAnswers()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        boolean z10 = QuestionResultEnum.RIGHT.ordinal() == result2;
        List<String> options = question.getOptions();
        if (options != null) {
            listEmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
            for (String str6 : options) {
                listEmptyList2.add(new C9758b(str6, listEmptyList.contains(str6) ? z10 ? AbstractC9755a.d.f17183c : AbstractC9755a.c.f17182c : AbstractC9755a.b.f17181c, false, 4, null));
            }
        } else {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List list = listEmptyList2;
        if (answer != null) {
            double score2 = answer.getScore();
            boolValueOf = Boolean.valueOf(score2 > AudioStats.AUDIO_AMPLITUDE_NONE && score2 < question.getScore());
        }
        examAnswerList.add(C6898c.m9449b(c6898c, 0L, null, null, null, list, listEmptyList, null, (answer == null || (examComments = answer.getExamComments()) == null || (str2 = (String) CollectionsKt.firstOrNull((List) examComments)) == null) ? "" : str2, m9316y(result2, z9, boolValueOf), null, 591, null));
        if (result > QuestionResultEnum.RIGHT.ordinal()) {
            if (answer == null || (listEmptyList3 = answer.getRevisingAnswers()) == null) {
                listEmptyList3 = CollectionsKt.emptyList();
            }
            List<String> options2 = question.getOptions();
            if (options2 != null) {
                listEmptyList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(options2, 10));
                for (String str7 : options2) {
                    listEmptyList4.add(new C9758b(str7, listEmptyList3.contains(str7) ? AbstractC9755a.a.f17180c : AbstractC9755a.b.f17181c, false, 4, null));
                }
            } else {
                listEmptyList4 = CollectionsKt.emptyList();
            }
            reviseAnswerList.add(C6898c.m9449b(c6898c, 0L, null, null, null, listEmptyList4, listEmptyList3, null, (answer == null || (revisingComments = answer.getRevisingComments()) == null || (str = (String) CollectionsKt.firstOrNull((List) revisingComments)) == null) ? "" : str, null, null, 847, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9608F0(int r36, long r37, java.util.List r39, java.util.List r40, java.util.ArrayList r41, java.util.ArrayList r42, java.util.ArrayList r43) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.revising.RevisingDetailViewModel.m9608F0(int, long, java.util.List, java.util.List, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel.smali:1441
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: U */
    public void mo9277U(DetailBundle detailBundle, boolean isSpecial) {
        Intrinsics.checkNotNullParameter(detailBundle, "detailBundle");
        super.mo9277U(detailBundle, isSpecial);
        TaskState.Revising revising = TaskState.Revising.INSTANCE;
        Long lM10602a = ((UserInfo) this.userInfo.getValue()).m10602a();
        Intrinsics.checkNotNullExpressionValue(lM10602a, "getId(...)");
        m9301q0(new C7589e(revising, lM10602a.longValue(), m9271N()));
        m9289h0(C6897b.m9427b(m9312w(), null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, null, null, 0L, null, 1032191, null));
        BaseViewModel.m8644f(this, null, null, null, null, null, new RevisingDetailViewModel$initData$1(this, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: s */
    public void mo9304s(C7459j draftFunctions, Function0 lastCallback) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        Intrinsics.checkNotNullParameter(lastCallback, "lastCallback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new RevisingDetailViewModel$commitAndChangeQuestionToNext$1(this, lastCallback, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: t */
    public void mo9306t(C7459j draftFunctions) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        BaseViewModel.m8644f(this, null, null, null, null, null, new RevisingDetailViewModel$commitAndChangeQuestionToPre$1(this, null), 31, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012a  */
    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9311v0(com.zykj.evaluation.bean.TaskDetailInfo r31) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.revising.RevisingDetailViewModel.mo9311v0(com.zykj.evaluation.bean.TaskDetailInfo):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel.smali:3111
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: w0 */
    public void mo9313w0(TaskDetailInfo taskDetailInfo, Map localAnswerMap) {
        ArrayList arrayList;
        String strValueOf;
        List<DetailSubQuestion> subQuestions;
        Intrinsics.checkNotNullParameter(taskDetailInfo, "taskDetailInfo");
        Intrinsics.checkNotNullParameter(localAnswerMap, "localAnswerMap");
        ArrayMap arrayMap = new ArrayMap();
        for (DetailAnswerInfo detailAnswerInfo : taskDetailInfo.getAnswerList()) {
            arrayMap.put(detailAnswerInfo.getUuid(), detailAnswerInfo);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (taskDetailInfo.getAnswerWithQuestion()) {
            arrayList = arrayList3;
            m9608F0(m9270M(), taskDetailInfo.getId(), taskDetailInfo.getQstFlows(), taskDetailInfo.getAnswerList(), arrayList2, arrayList, arrayList4);
            arrayList4 = arrayList4;
        } else {
            arrayList = arrayList3;
            boolean z9 = taskDetailInfo.getQstFlows().size() > 1;
            for (DetailSubQuestion detailSubQuestion : taskDetailInfo.getQstFlows()) {
                if (z9) {
                    strValueOf = (taskDetailInfo.getNumber() == 0 ? "" : taskDetailInfo.getNumber() + ".") + detailSubQuestion.getNumber();
                } else {
                    strValueOf = taskDetailInfo.getNumber() == 0 ? "" : String.valueOf(taskDetailInfo.getNumber());
                }
                if (detailSubQuestion.getType() != 0 || (subQuestions = detailSubQuestion.getSubQuestions()) == null || subQuestions.isEmpty()) {
                    ArrayList arrayList5 = arrayList;
                    m9607E0(m9270M(), detailSubQuestion, strValueOf, (DetailAnswerInfo) arrayMap.get(detailSubQuestion.getUuid()), arrayList2, arrayList5, arrayList4);
                    arrayList = arrayList5;
                } else {
                    boolean z10 = detailSubQuestion.getSubQuestions().size() > 1;
                    for (DetailSubQuestion detailSubQuestion2 : detailSubQuestion.getSubQuestions()) {
                        ArrayList arrayList6 = arrayList;
                        m9607E0(m9270M(), detailSubQuestion2, strValueOf + (z10 ? "." + detailSubQuestion2.getNumber() : ""), (DetailAnswerInfo) arrayMap.get(detailSubQuestion2.getUuid()), arrayList2, arrayList6, arrayList4);
                        strValueOf = strValueOf;
                        arrayList = arrayList6;
                    }
                }
            }
        }
        C9767e c9767eM9314x = m9314x();
        boolean answerWithQuestion = taskDetailInfo.getAnswerWithQuestion();
        List listM16391h = AbstractC9776h.m16391h(taskDetailInfo, m9261D());
        List listM16394k = AbstractC9776h.m16394k(taskDetailInfo, m9261D());
        List listM16393j = AbstractC9776h.m16393j(taskDetailInfo, m9261D());
        ArrayList arrayList7 = new ArrayList();
        C9761c c9761cM16389f = AbstractC9776h.m16389f(taskDetailInfo);
        if (c9761cM16389f != null) {
            arrayList7.add(c9761cM16389f);
        }
        C9761c c9761cM16388e = AbstractC9776h.m16388e(taskDetailInfo);
        if (c9761cM16388e != null) {
            arrayList7.add(c9761cM16388e);
        }
        Unit unit = Unit.INSTANCE;
        m9290i0(C9767e.m16364b(c9767eM9314x, null, answerWithQuestion, false, arrayList, arrayList4, null, null, null, listM16391h, listM16394k, listM16393j, arrayList7, 229, null));
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: y0 */
    public void mo9317y0(List questionList, int index) {
        Intrinsics.checkNotNullParameter(questionList, "questionList");
        if (index >= 0 && index < questionList.size()) {
            GuideQuestion guideQuestion = (GuideQuestion) questionList.get(index);
            m9289h0(C6897b.m9427b(m9312w(), guideQuestion.getTitle(), (index + 1) + "/" + questionList.size(), null, null, false, null, null, false, false, null, false, null, null, null, false, false, index == 0 ? "第一题" : "上一题", index == questionList.size() + (-1) ? "最后一题" : "下一题", 0L, null, 851964, null));
        }
    }
}
