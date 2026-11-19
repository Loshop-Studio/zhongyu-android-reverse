package com.zykj.evaluation.p057ui.detail.todo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.DetailSubQuestion;
import com.zykj.evaluation.bean.TaskDetailInfo;
import com.zykj.evaluation.bean.TaskState;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.p057ui.detail.AbstractC6896a;
import com.zykj.evaluation.p057ui.detail.AbstractC6899d;
import com.zykj.evaluation.p057ui.detail.BaseDetailViewModel;
import com.zykj.evaluation.p057ui.detail.C6897b;
import com.zykj.evaluation.p057ui.detail.C6898c;
import com.zykj.evaluation.p057ui.detail.GuideQuestion;
import com.zykj.evaluation.submit.SubmitTaskManger;
import com.zykj.evaluation.upload.OssTaskManger;
import com.zykj.http.bean.HeaderBean;
import com.zykj.message.server.bean.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
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
import p276w5.C9767e;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010#\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J1\u0010,\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001e0)H\u0016¢\u0006\u0004\b,\u0010-J#\u00100\u001a\u00020\u00162\u0006\u0010.\u001a\u00020*2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020*0\u001e¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u00103J%\u00106\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001604H\u0016¢\u0006\u0004\b6\u00107J%\u00109\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001604H\u0016¢\u0006\u0004\b9\u00107J%\u0010:\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001604H\u0016¢\u0006\u0004\b:\u00107J[\u0010D\u001a\u00020\u00162\u0006\u0010;\u001a\u00020!2\u0006\u0010=\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001e0)2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020A0@j\b\u0012\u0004\u0012\u00020A`BH\u0002¢\u0006\u0004\bD\u0010EJU\u0010H\u001a\u00020\u00162\u0006\u0010;\u001a\u00020!2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010F\u001a\u00020*2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020*0\u001e2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020A0@j\b\u0012\u0004\u0012\u00020A`BH\u0002¢\u0006\u0004\bH\u0010IR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010KR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006V"}, m13558d2 = {"Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;", "Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/http/bean/HeaderBean;", "headerBeanFlow", "Lcom/zykj/evaluation/di/AppDatabase;", "database", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "submitTaskManger", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lp5/j;)V", "Lf6/j;", "draftFunctions", "", "M0", "(Lf6/j;)Z", "", "J0", "(Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/evaluation/bean/bundle/DetailBundle;", "detailBundle", "isSpecial", "U", "(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V", "", "Lcom/zykj/evaluation/ui/detail/GuideQuestion;", "questionList", "", "index", "y0", "(Ljava/util/List;I)V", "Lcom/zykj/evaluation/bean/TaskDetailInfo;", "taskDetailInfo", "v0", "(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V", "", "", "localAnswerMap", "w0", "(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V", "uuid", "localAnswer", "N0", "(Ljava/lang/String;Ljava/util/List;)V", "t", "(Lf6/j;)V", "Lkotlin/Function0;", "lastCallback", "s", "(Lf6/j;Lkotlin/jvm/functions/Function0;)V", "callback", "u", "r", "specificTrainingType", "", "questionId", "Lcom/zykj/evaluation/bean/DetailSubQuestion;", "subQuestion", "Ljava/util/ArrayList;", "Lcom/zykj/evaluation/ui/detail/c;", "Lkotlin/collections/ArrayList;", "localAnswerList", "L0", "(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/util/Map;Ljava/util/ArrayList;)V", "numberString", "localAnswers", "K0", "(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V", "w", "Lkotlinx/coroutines/flow/MutableStateFlow;", "x", "y", "Lcom/zykj/evaluation/di/AppDatabase;", "z", "Lcom/zykj/evaluation/upload/OssTaskManger;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "B", "Z", "hasLocalAnswerChanged", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTodoDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodoDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n*L\n1#1,546:1\n1#2:547\n295#3,2:548\n1869#3:550\n1869#3,2:551\n295#3,2:553\n1870#3:555\n1563#3:556\n1634#3,3:557\n1563#3:560\n1634#3,2:561\n1563#3:563\n1634#3,3:564\n1636#3:567\n1761#3,2:568\n1761#3,3:570\n1763#3:573\n2746#3,3:574\n1491#3:577\n1516#3,3:578\n1519#3,3:588\n1563#3:594\n1634#3,3:595\n1869#3,2:600\n1563#3:602\n1634#3,2:603\n295#3,2:605\n1636#3:607\n1869#3,2:608\n382#4,7:581\n126#5:591\n153#5,2:592\n155#5:598\n27#6:599\n*S KotlinDebug\n*F\n+ 1 TodoDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel\n*L\n123#1:548,2\n146#1:550\n161#1:551,2\n183#1:553,2\n146#1:555\n257#1:556\n257#1:557,3\n313#1:560\n313#1:561,2\n317#1:563\n317#1:564,3\n313#1:567\n454#1:568,2\n455#1:570,3\n454#1:573\n460#1:574,3\n467#1:577\n467#1:578,3\n467#1:588,3\n471#1:594\n471#1:595,3\n489#1:600,2\n508#1:602\n508#1:603,2\n510#1:605,2\n508#1:607\n524#1:608,2\n467#1:581,7\n468#1:591\n468#1:592,2\n468#1:598\n487#1:599\n*E\n"})
/* loaded from: classes4.dex */
public final class TodoDetailViewModel extends BaseDetailViewModel {

    /* renamed from: A, reason: from kotlin metadata */
    public final SubmitTaskManger submitTaskManger;

    /* renamed from: B, reason: from kotlin metadata */
    public boolean hasLocalAnswerChanged;

    /* renamed from: w, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: x, reason: from kotlin metadata */
    public final MutableStateFlow headerBeanFlow;

    /* renamed from: y, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: z, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodoDetailViewModel(MutableStateFlow userInfo, MutableStateFlow headerBeanFlow, AppDatabase database, OssTaskManger ossTaskManger, SubmitTaskManger submitTaskManger, InterfaceC8843j service) {
        super(userInfo, service);
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(headerBeanFlow, "headerBeanFlow");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        Intrinsics.checkNotNullParameter(submitTaskManger, "submitTaskManger");
        Intrinsics.checkNotNullParameter(service, "service");
        this.userInfo = userInfo;
        this.headerBeanFlow = headerBeanFlow;
        this.database = database;
        this.ossTaskManger = ossTaskManger;
        this.submitTaskManger = submitTaskManger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x032c, code lost:
    
        if (r5.mo8766b(r1, r11) == r2) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04fe, code lost:
    
        if (r5.m10486r(r12, r19, r8, r9, r0, r1, true, r14, r15, r11) == r2) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ac, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r6, r7, r11) == r2) goto L156;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0230 A[EDGE_INSN: B:81:0x0230->B:82:0x0231 BREAK  A[LOOP:7: B:75:0x0212->B:177:?]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r19v0, types: [T, com.zykj.evaluation.bean.UploadData] */
    /* JADX WARN: Type inference failed for: r5v18, types: [T, com.zykj.evaluation.bean.UploadData] */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9742J0(p089f6.C7459j r37, kotlin.coroutines.Continuation r38) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.todo.TodoDetailViewModel.m9742J0(f6.j, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/todo/TodoDetailViewModel.smali:354
    }

    /* renamed from: M0 */
    private final boolean m9743M0(C7459j draftFunctions) {
        return ((Boolean) draftFunctions.m12058j().invoke()).booleanValue() || this.hasLocalAnswerChanged;
    }

    /* renamed from: K0 */
    public final void m9745K0(int specificTrainingType, long questionId, DetailSubQuestion subQuestion, String numberString, List localAnswers, ArrayList localAnswerList) {
        List list;
        List listEmptyList;
        List<String> options = subQuestion.getOptions();
        if (options != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
            for (String str : options) {
                listEmptyList.add(new C9758b(str, localAnswers.contains(str) ? AbstractC9755a.a.f17180c : AbstractC9755a.b.f17181c, false, 4, null));
            }
            list = localAnswers;
        } else {
            list = localAnswers;
            listEmptyList = CollectionsKt.emptyList();
        }
        List list2 = listEmptyList;
        AbstractC7699p0 abstractC7699p0M16384a = AbstractC9776h.m16384a(subQuestion.getQstType(), specificTrainingType);
        String displayNumber = subQuestion.getDisplayNumber();
        if (displayNumber == null) {
            displayNumber = "";
        }
        String str2 = StringsKt.isBlank(displayNumber) ? numberString : displayNumber;
        Long lValueOf = Long.valueOf(subQuestion.getQuestionId());
        if (lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        long jLongValue = lValueOf != null ? lValueOf.longValue() : questionId;
        localAnswerList.add(new C6898c(subQuestion.getQuestionId(), subQuestion.getUuid(), abstractC7699p0M16384a, str2, list2, list, ((abstractC7699p0M16384a instanceof AbstractC7699p0.c.a) || (abstractC7699p0M16384a instanceof AbstractC7699p0.a)) ? m9268K().m12466l(jLongValue, subQuestion.getUuid()) : m9268K().m12465k(jLongValue, subQuestion.getUuid()), null, null, null, 896, null));
    }

    /* renamed from: L0 */
    public final void m9746L0(int specificTrainingType, long questionId, DetailSubQuestion subQuestion, Map localAnswerMap, ArrayList localAnswerList) {
        String uuid;
        List listEmptyList;
        String uuid2;
        if (subQuestion == null || (uuid = subQuestion.getUuid()) == null) {
            uuid = "";
        }
        String str = uuid;
        long questionId2 = subQuestion != null ? subQuestion.getQuestionId() : questionId;
        AbstractC7699p0 abstractC7699p0M16384a = AbstractC9776h.m16384a(AbstractC7699p0.c.a.f13056b.m12881a(), specificTrainingType);
        if (subQuestion == null || (uuid2 = subQuestion.getUuid()) == null || (listEmptyList = (List) localAnswerMap.get(uuid2)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        localAnswerList.add(new C6898c(questionId2, str, abstractC7699p0M16384a, null, null, listEmptyList, m9268K().m12466l(questionId, str), null, null, null, 920, null));
    }

    /* renamed from: N0 */
    public final void m9747N0(String uuid, List localAnswer) {
        List localAnswer2 = localAnswer;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(localAnswer2, "localAnswer");
        this.hasLocalAnswerChanged = true;
        getLocalAnswerMap().put(uuid, localAnswer2);
        BaseViewModel.m8644f(this, null, null, new TodoDetailViewModel$updateLocalAnswer$1(null), new TodoDetailViewModel$updateLocalAnswer$2(null), null, new TodoDetailViewModel$updateLocalAnswer$3(this, uuid, localAnswer2, null), 19, null);
        C9767e c9767eM9314x = m9314x();
        List<C6898c> listM16369f = m9314x().m16369f();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16369f, 10));
        for (C6898c c6898cM9449b : listM16369f) {
            if (Intrinsics.areEqual(c6898cM9449b.m9460l(), uuid)) {
                List<C9758b> listM9455g = c6898cM9449b.m9455g();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM9455g, 10));
                for (C9758b c9758b : listM9455g) {
                    arrayList2.add(C9758b.m16353b(c9758b, null, localAnswer2.contains(c9758b.m16356d()) ? AbstractC9755a.a.f17180c : AbstractC9755a.b.f17181c, false, 5, null));
                }
                c6898cM9449b = C6898c.m9449b(c6898cM9449b, 0L, null, null, null, arrayList2, localAnswer2, null, null, null, null, 975, null);
            }
            arrayList.add(c6898cM9449b);
            localAnswer2 = localAnswer;
        }
        m9290i0(C9767e.m16364b(c9767eM9314x, null, false, false, null, null, arrayList, null, null, null, null, null, null, 4063, null));
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: U */
    public void mo9277U(DetailBundle detailBundle, boolean isSpecial) {
        Intrinsics.checkNotNullParameter(detailBundle, "detailBundle");
        super.mo9277U(detailBundle, isSpecial);
        TaskState.ToDo toDo = TaskState.ToDo.INSTANCE;
        Long lM10602a = ((UserInfo) this.userInfo.getValue()).m10602a();
        Intrinsics.checkNotNullExpressionValue(lM10602a, "getId(...)");
        m9301q0(new C7589e(toDo, lM10602a.longValue(), m9271N()));
        m9289h0(C6897b.m9427b(m9312w(), null, null, null, null, false, null, null, false, false, null, false, null, null, null, true, false, null, null, 0L, null, 1032191, null));
        BaseViewModel.m8644f(this, null, null, null, null, null, new TodoDetailViewModel$initData$1(this, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: r */
    public void mo9302r(C7459j draftFunctions, Function0 callback) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (m9743M0(draftFunctions)) {
            BaseViewModel.m8644f(this, null, null, null, null, null, new TodoDetailViewModel$commitAndBack$1(this, draftFunctions, callback, null), 31, null);
        } else {
            callback.invoke();
        }
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: s */
    public void mo9304s(C7459j draftFunctions, Function0 lastCallback) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        Intrinsics.checkNotNullParameter(lastCallback, "lastCallback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new TodoDetailViewModel$commitAndChangeQuestionToNext$1(this, draftFunctions, lastCallback, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: t */
    public void mo9306t(C7459j draftFunctions) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        BaseViewModel.m8644f(this, null, null, null, null, null, new TodoDetailViewModel$commitAndChangeQuestionToPre$1(this, draftFunctions, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: u */
    public void mo9308u(C7459j draftFunctions, Function0 callback) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new TodoDetailViewModel$commitAndSubmitTask$1(this, draftFunctions, callback, null), 31, null);
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
        m9289h0(C6897b.m9427b(c6897bM9312w, null, null, null, null, false, null, serverUrl + (path != null ? path : "") + "?showAnalysis=" + m9260C(), false, false, m9268K().m12464j(taskDetailInfo.getId()), false, taskDetailInfo.getAskForHelp() ? AbstractC6896a.b.f9201c : AbstractC6896a.a.f9200c, taskDetailInfo.isInMistakeBook() ? AbstractC6899d.b.f9246c : AbstractC6899d.a.f9245c, null, false, false, null, null, 0L, taskDetailInfo.getStem(), 517439, null));
        m9290i0(C9767e.m16364b(m9314x(), null, false, true, null, null, null, null, null, null, null, null, null, 4091, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9313w0(com.zykj.evaluation.bean.TaskDetailInfo r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.todo.TodoDetailViewModel.mo9313w0(com.zykj.evaluation.bean.TaskDetailInfo, java.util.Map):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/todo/TodoDetailViewModel.smali:5069
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: y0 */
    public void mo9317y0(List questionList, int index) {
        Intrinsics.checkNotNullParameter(questionList, "questionList");
        if (index >= 0 && index < questionList.size()) {
            GuideQuestion guideQuestion = (GuideQuestion) questionList.get(index);
            m9289h0(C6897b.m9427b(m9312w(), guideQuestion.getTitle(), (index + 1) + "/" + questionList.size(), null, null, false, null, null, false, false, null, false, null, null, null, false, false, index == 0 ? "第一题" : "上一题", index == questionList.size() + (-1) ? "保存答案" : "保存,下一题", 0L, null, 851964, null));
        }
    }
}
