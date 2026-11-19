package com.zykj.evaluation.p057ui.detail.correcting;

import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.DetailAnswerInfo;
import com.zykj.evaluation.bean.DetailSubQuestion;
import com.zykj.evaluation.bean.TaskDetailInfo;
import com.zykj.evaluation.bean.TaskState;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.p057ui.detail.AbstractC6896a;
import com.zykj.evaluation.p057ui.detail.AbstractC6899d;
import com.zykj.evaluation.p057ui.detail.BaseDetailViewModel;
import com.zykj.evaluation.p057ui.detail.C6897b;
import com.zykj.evaluation.p057ui.detail.C6898c;
import com.zykj.evaluation.p057ui.detail.GuideQuestion;
import com.zykj.http.bean.HeaderBean;
import com.zykj.message.server.bean.UserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import p089f6.C7459j;
import p101g7.C7589e;
import p122i6.AbstractC7699p0;
import p200p5.InterfaceC8843j;
import p276w5.AbstractC9755a;
import p276w5.AbstractC9776h;
import p276w5.C9758b;
import p276w5.C9761c;
import p276w5.C9767e;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010 \u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00120\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0&H\u0016¢\u0006\u0004\b(\u0010)JO\u00105\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00122\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020201j\b\u0012\u0004\u0012\u000202`3H\u0002¢\u0006\u0004\b5\u00106JI\u0010:\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00152\u0006\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020\u001e2\b\u00109\u001a\u0004\u0018\u00010/2\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020201j\b\u0012\u0004\u0012\u000202`3H\u0002¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=¨\u0006?"}, m13558d2 = {"Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;", "Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/http/bean/HeaderBean;", "headerBeanFlow", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;)V", "Lcom/zykj/evaluation/bean/bundle/DetailBundle;", "detailBundle", "", "isSpecial", "", "U", "(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V", "", "Lcom/zykj/evaluation/ui/detail/GuideQuestion;", "questionList", "", "index", "y0", "(Ljava/util/List;I)V", "Lcom/zykj/evaluation/bean/TaskDetailInfo;", "taskDetailInfo", "v0", "(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V", "", "", "localAnswerMap", "w0", "(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V", "Lf6/j;", "draftFunctions", "t", "(Lf6/j;)V", "Lkotlin/Function0;", "lastCallback", "s", "(Lf6/j;Lkotlin/jvm/functions/Function0;)V", "specificTrainingType", "", "questionId", "Lcom/zykj/evaluation/bean/DetailSubQuestion;", "question", "Lcom/zykj/evaluation/bean/DetailAnswerInfo;", "answerList", "Ljava/util/ArrayList;", "Lcom/zykj/evaluation/ui/detail/c;", "Lkotlin/collections/ArrayList;", "examAnswerList", "F0", "(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/util/List;Ljava/util/ArrayList;)V", "subQuestion", "numberString", "answer", "E0", "(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;)V", "w", "Lkotlinx/coroutines/flow/MutableStateFlow;", "x", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCorrectingDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CorrectingDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel\n+ 2 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n27#2:241\n1869#3,2:242\n1869#3:244\n1869#3,2:245\n1870#3:247\n295#3,2:249\n1563#3:251\n1634#3,3:252\n1#4:248\n*S KotlinDebug\n*F\n+ 1 CorrectingDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel\n*L\n74#1:241\n75#1:242,2\n96#1:244\n111#1:245,2\n96#1:247\n165#1:249,2\n199#1:251\n199#1:252,3\n*E\n"})
/* loaded from: classes4.dex */
public final class CorrectingDetailViewModel extends BaseDetailViewModel {

    /* renamed from: w, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: x, reason: from kotlin metadata */
    public final MutableStateFlow headerBeanFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorrectingDetailViewModel(MutableStateFlow userInfo, MutableStateFlow headerBeanFlow, InterfaceC8843j service) {
        super(userInfo, service);
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(headerBeanFlow, "headerBeanFlow");
        Intrinsics.checkNotNullParameter(service, "service");
        this.userInfo = userInfo;
        this.headerBeanFlow = headerBeanFlow;
    }

    /* renamed from: E0 */
    public final void m9466E0(int specificTrainingType, DetailSubQuestion subQuestion, String numberString, DetailAnswerInfo answer, ArrayList examAnswerList) {
        List<String> listEmptyList;
        List listEmptyList2;
        if (answer == null || (listEmptyList = answer.getExamAnswers()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<String> list = listEmptyList;
        List<String> options = subQuestion.getOptions();
        if (options != null) {
            listEmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
            for (String str : options) {
                listEmptyList2.add(new C9758b(str, list.contains(str) ? AbstractC9755a.a.f17180c : AbstractC9755a.b.f17181c, false, 4, null));
            }
        } else {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List list2 = listEmptyList2;
        String displayNumber = subQuestion.getDisplayNumber();
        if (displayNumber == null) {
            displayNumber = "";
        }
        examAnswerList.add(new C6898c(subQuestion.getQuestionId(), subQuestion.getUuid(), AbstractC9776h.m16384a(subQuestion.getQstType(), specificTrainingType), StringsKt.isBlank(displayNumber) ? numberString : displayNumber, list2, list, null, null, null, null, 960, null));
    }

    /* renamed from: F0 */
    public final void m9467F0(int specificTrainingType, long questionId, DetailSubQuestion question, List answerList, ArrayList examAnswerList) {
        Object obj;
        String uuid;
        List<String> listEmptyList;
        Iterator it = answerList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) CollectionsKt.firstOrNull((List) ((DetailAnswerInfo) next).getExamAnswers());
            if (str != null && StringsKt.contains$default((CharSequence) str, (CharSequence) "http", false, 2, (Object) null)) {
                obj = next;
                break;
            }
        }
        DetailAnswerInfo detailAnswerInfo = (DetailAnswerInfo) obj;
        if (detailAnswerInfo == null) {
            detailAnswerInfo = (DetailAnswerInfo) CollectionsKt.firstOrNull(answerList);
        }
        long questionId2 = question != null ? question.getQuestionId() : questionId;
        if (detailAnswerInfo == null || (uuid = detailAnswerInfo.getUuid()) == null) {
            uuid = "";
        }
        String str2 = uuid;
        AbstractC7699p0 abstractC7699p0M16384a = AbstractC9776h.m16384a(AbstractC7699p0.c.a.f13056b.m12881a(), specificTrainingType);
        if (detailAnswerInfo == null || (listEmptyList = detailAnswerInfo.getExamAnswers()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        examAnswerList.add(new C6898c(questionId2, str2, abstractC7699p0M16384a, null, null, listEmptyList, null, null, null, null, 984, null));
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: U */
    public void mo9277U(DetailBundle detailBundle, boolean isSpecial) {
        Intrinsics.checkNotNullParameter(detailBundle, "detailBundle");
        super.mo9277U(detailBundle, isSpecial);
        TaskState.Correcting correcting = TaskState.Correcting.INSTANCE;
        Long lM10602a = ((UserInfo) this.userInfo.getValue()).m10602a();
        Intrinsics.checkNotNullExpressionValue(lM10602a, "getId(...)");
        m9301q0(new C7589e(correcting, lM10602a.longValue(), m9271N()));
        m9289h0(C6897b.m9427b(m9312w(), null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, null, null, 0L, null, 1032191, null));
        BaseViewModel.m8644f(this, null, null, null, null, null, new CorrectingDetailViewModel$initData$1(this, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: s */
    public void mo9304s(C7459j draftFunctions, Function0 lastCallback) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        Intrinsics.checkNotNullParameter(lastCallback, "lastCallback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new CorrectingDetailViewModel$commitAndChangeQuestionToNext$1(this, lastCallback, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: t */
    public void mo9306t(C7459j draftFunctions) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        BaseViewModel.m8644f(this, null, null, null, null, null, new CorrectingDetailViewModel$commitAndChangeQuestionToPre$1(this, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: v0 */
    public void mo9311v0(TaskDetailInfo taskDetailInfo) {
        Intrinsics.checkNotNullParameter(taskDetailInfo, "taskDetailInfo");
        C6897b c6897bM9312w = m9312w();
        String serverUrl = ((HeaderBean) this.headerBeanFlow.getValue()).getServerUrl();
        if (serverUrl == null) {
            serverUrl = "";
        }
        String path = taskDetailInfo.getPath();
        m9289h0(C6897b.m9427b(c6897bM9312w, null, null, null, null, false, null, serverUrl + (path != null ? path : "") + "?showAnalysis=" + m9260C(), false, false, m9268K().m12464j(taskDetailInfo.getId()), false, taskDetailInfo.getAskForHelp() ? AbstractC6896a.b.f9201c : AbstractC6896a.a.f9200c, taskDetailInfo.isInMistakeBook() ? AbstractC6899d.b.f9246c : AbstractC6899d.a.f9245c, null, false, false, null, null, 0L, taskDetailInfo.getStem(), 517567, null));
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: w0 */
    public void mo9313w0(TaskDetailInfo taskDetailInfo, Map localAnswerMap) {
        String strValueOf;
        String str;
        List<DetailSubQuestion> subQuestions;
        Intrinsics.checkNotNullParameter(taskDetailInfo, "taskDetailInfo");
        Intrinsics.checkNotNullParameter(localAnswerMap, "localAnswerMap");
        ArrayMap arrayMap = new ArrayMap();
        for (DetailAnswerInfo detailAnswerInfo : taskDetailInfo.getAnswerList()) {
            arrayMap.put(detailAnswerInfo.getUuid(), detailAnswerInfo);
        }
        ArrayList arrayList = new ArrayList();
        if (taskDetailInfo.getAnswerWithQuestion()) {
            m9467F0(m9270M(), taskDetailInfo.getId(), (DetailSubQuestion) CollectionsKt.firstOrNull((List) taskDetailInfo.getQstFlows()), taskDetailInfo.getAnswerList(), arrayList);
            arrayList = arrayList;
        } else {
            boolean z9 = taskDetailInfo.getQstFlows().size() > 1;
            for (DetailSubQuestion detailSubQuestion : taskDetailInfo.getQstFlows()) {
                if (z9) {
                    strValueOf = (taskDetailInfo.getNumber() == 0 ? "" : taskDetailInfo.getNumber() + ".") + detailSubQuestion.getNumber();
                } else if (taskDetailInfo.getNumber() == 0) {
                    str = "";
                    if (detailSubQuestion.getType() == 0 || (subQuestions = detailSubQuestion.getSubQuestions()) == null || subQuestions.isEmpty()) {
                        m9466E0(m9270M(), detailSubQuestion, str, (DetailAnswerInfo) arrayMap.get(detailSubQuestion.getUuid()), arrayList);
                    } else {
                        boolean z10 = detailSubQuestion.getSubQuestions().size() > 1;
                        for (DetailSubQuestion detailSubQuestion2 : detailSubQuestion.getSubQuestions()) {
                            m9466E0(m9270M(), detailSubQuestion2, str + (z10 ? "." + detailSubQuestion2.getNumber() : ""), (DetailAnswerInfo) arrayMap.get(detailSubQuestion2.getUuid()), arrayList);
                        }
                    }
                } else {
                    strValueOf = String.valueOf(taskDetailInfo.getNumber());
                }
                str = strValueOf;
                if (detailSubQuestion.getType() == 0) {
                }
                m9466E0(m9270M(), detailSubQuestion, str, (DetailAnswerInfo) arrayMap.get(detailSubQuestion.getUuid()), arrayList);
            }
        }
        C9767e c9767eM9314x = m9314x();
        boolean answerWithQuestion = taskDetailInfo.getAnswerWithQuestion();
        List listM16391h = AbstractC9776h.m16391h(taskDetailInfo, m9261D());
        List listM16394k = AbstractC9776h.m16394k(taskDetailInfo, m9261D());
        List listM16393j = AbstractC9776h.m16393j(taskDetailInfo, m9261D());
        ArrayList arrayList2 = new ArrayList();
        C9761c c9761cM16389f = AbstractC9776h.m16389f(taskDetailInfo);
        if (c9761cM16389f != null) {
            arrayList2.add(c9761cM16389f);
        }
        Unit unit = Unit.INSTANCE;
        m9290i0(C9767e.m16364b(c9767eM9314x, null, answerWithQuestion, false, arrayList, null, null, null, null, listM16391h, listM16394k, listM16393j, arrayList2, 245, null));
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
