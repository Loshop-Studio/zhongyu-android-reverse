package com.zykj.evaluation.p057ui.detail.toCorrectSelf;

import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.view.PointerIconCompat;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.DetailAnswerInfo;
import com.zykj.evaluation.bean.DetailSubQuestion;
import com.zykj.evaluation.bean.TaskDetailInfo;
import com.zykj.evaluation.bean.TaskState;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.bean.constant.QuestionResultEnum;
import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.p057ui.detail.AbstractC6896a;
import com.zykj.evaluation.p057ui.detail.AbstractC6899d;
import com.zykj.evaluation.p057ui.detail.AbstractC6900e;
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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import p089f6.C7459j;
import p101g7.C7589e;
import p122i6.AbstractC7699p0;
import p200p5.InterfaceC8843j;
import p276w5.AbstractC9755a;
import p276w5.AbstractC9776h;
import p276w5.AbstractC9778i;
import p276w5.C9758b;
import p276w5.C9761c;
import p276w5.C9767e;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001d\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J1\u0010&\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001f2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00180#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150,H\u0016¢\u0006\u0004\b.\u0010/J%\u00101\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150,H\u0016¢\u0006\u0004\b1\u0010/J#\u00104\u001a\u00020\u00152\u0006\u00102\u001a\u00020$2\f\u00103\u001a\b\u0012\u0004\u0012\u00020$0\u0018¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u0013¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\u00020\u00152\u0006\u00102\u001a\u00020$2\u0006\u00109\u001a\u00020\u0013¢\u0006\u0004\b:\u0010;J\u0081\u0001\u0010H\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010?2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00180#2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00182\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020D0Cj\b\u0012\u0004\u0012\u00020D`E2\u0016\u0010G\u001a\u0012\u0012\u0004\u0012\u00020D0Cj\b\u0012\u0004\u0012\u00020D`EH\u0002¢\u0006\u0004\bH\u0010IJw\u0010M\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010J\u001a\u00020$2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020$0\u00182\b\u0010L\u001a\u0004\u0018\u00010A2\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020D0Cj\b\u0012\u0004\u0012\u00020D`E2\u0016\u0010G\u001a\u0012\u0012\u0004\u0012\u00020D0Cj\b\u0012\u0004\u0012\u00020D`EH\u0002¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0015H\u0082@¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u0015H\u0082@¢\u0006\u0004\bQ\u0010PJ \u0010S\u001a\u00020\u00152\u0006\u00102\u001a\u00020$2\u0006\u0010R\u001a\u00020\u001bH\u0082@¢\u0006\u0004\bS\u0010TR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R \u0010a\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001b0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006b"}, m13558d2 = {"Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;", "Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/http/bean/HeaderBean;", "headerBeanFlow", "Lcom/zykj/evaluation/di/AppDatabase;", "database", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "submitTaskManger", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lp5/j;)V", "Lcom/zykj/evaluation/bean/bundle/DetailBundle;", "detailBundle", "", "isSpecial", "", "U", "(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V", "", "Lcom/zykj/evaluation/ui/detail/GuideQuestion;", "questionList", "", "index", "y0", "(Ljava/util/List;I)V", "Lcom/zykj/evaluation/bean/TaskDetailInfo;", "taskDetailInfo", "v0", "(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V", "", "", "localAnswerMap", "w0", "(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V", "Lf6/j;", "draftFunctions", "t", "(Lf6/j;)V", "Lkotlin/Function0;", "lastCallback", "s", "(Lf6/j;Lkotlin/jvm/functions/Function0;)V", "callback", "u", "uuid", "localAnswer", "S0", "(Ljava/lang/String;Ljava/util/List;)V", "isInCorrect", "M0", "(Z)V", "isRight", "R0", "(Ljava/lang/String;Z)V", "specificTrainingType", "", "questionId", "Lcom/zykj/evaluation/bean/DetailSubQuestion;", "subQuestion", "Lcom/zykj/evaluation/bean/DetailAnswerInfo;", "answerList", "Ljava/util/ArrayList;", "Lcom/zykj/evaluation/ui/detail/c;", "Lkotlin/collections/ArrayList;", "localAnswerList", "examAnswerList", "Q0", "(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "numberString", "localAnswers", "answer", "P0", "(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "N0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "O0", "correctResult", "T0", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w", "Lkotlinx/coroutines/flow/MutableStateFlow;", "x", "y", "Lcom/zykj/evaluation/di/AppDatabase;", "z", "Lcom/zykj/evaluation/upload/OssTaskManger;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "Landroidx/collection/ArrayMap;", "B", "Landroidx/collection/ArrayMap;", "localCorrectResult", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nToCorrectSelfDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToCorrectSelfDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel\n+ 2 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,638:1\n27#2:639\n27#2:640\n27#2:658\n27#2:667\n1869#3,2:641\n1869#3:643\n1869#3,2:644\n1870#3:646\n295#3,2:648\n1563#3:650\n1634#3,3:651\n1563#3:654\n1634#3,3:655\n1869#3,2:659\n1563#3:661\n1634#3,2:662\n295#3,2:664\n1636#3:666\n1869#3:668\n295#3,2:669\n1870#3:671\n1869#3,2:672\n1563#3:674\n1634#3,2:675\n1563#3:677\n1634#3,3:678\n1636#3:681\n1563#3:682\n1634#3,3:683\n1869#3:686\n1563#3:687\n1634#3,3:688\n1870#3:691\n1#4:647\n*S KotlinDebug\n*F\n+ 1 ToCorrectSelfDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel\n*L\n62#1:639\n117#1:640\n422#1:658\n458#1:667\n118#1:641,2\n142#1:643\n158#1:644,2\n142#1:646\n223#1:648,2\n300#1:650\n300#1:651,3\n342#1:654\n342#1:655,3\n424#1:659,2\n444#1:661\n444#1:662,2\n446#1:664,2\n444#1:666\n459#1:668\n468#1:669,2\n459#1:671\n475#1:672,2\n512#1:674\n512#1:675,2\n516#1:677\n516#1:678,3\n512#1:681\n561#1:682\n561#1:683,3\n570#1:686\n576#1:687\n576#1:688,3\n570#1:691\n*E\n"})
/* loaded from: classes4.dex */
public final class ToCorrectSelfDetailViewModel extends BaseDetailViewModel {

    /* renamed from: A, reason: from kotlin metadata */
    public final SubmitTaskManger submitTaskManger;

    /* renamed from: B, reason: from kotlin metadata */
    public final ArrayMap localCorrectResult;

    /* renamed from: w, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: x, reason: from kotlin metadata */
    public final MutableStateFlow headerBeanFlow;

    /* renamed from: y, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: z, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectSelfDetailViewModel(MutableStateFlow userInfo, MutableStateFlow headerBeanFlow, AppDatabase database, OssTaskManger ossTaskManger, SubmitTaskManger submitTaskManger, InterfaceC8843j service) {
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
        this.localCorrectResult = new ArrayMap();
    }

    /* renamed from: M0 */
    public final void m9706M0(boolean isInCorrect) {
        m9290i0(C9767e.m16364b(m9314x(), null, false, isInCorrect, null, null, null, null, null, null, null, null, null, 4091, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x02eb, code lost:
    
        if (r3.m10487s(r7, r6, r12, r9, r5, r1, r11) == r2) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9707N0(kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel.m9707N0(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel.smali:509
    }

    /* renamed from: O0 */
    public final Object m9708O0(Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2(this, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* renamed from: P0 */
    public final void m9709P0(int specificTrainingType, long questionId, DetailSubQuestion subQuestion, String numberString, List localAnswers, DetailAnswerInfo answer, ArrayList localAnswerList, ArrayList examAnswerList) {
        List list;
        List listEmptyList;
        int iIntValue;
        List<String> listEmptyList2;
        List listEmptyList3;
        AbstractC7699p0 abstractC7699p0M16384a = AbstractC9776h.m16384a(subQuestion.getQstType(), specificTrainingType);
        String displayNumber = subQuestion.getDisplayNumber();
        if (displayNumber == null) {
            displayNumber = "";
        }
        String str = StringsKt.isBlank(displayNumber) ? numberString : displayNumber;
        Long lValueOf = Long.valueOf(subQuestion.getQuestionId());
        if (lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        long jLongValue = lValueOf != null ? lValueOf.longValue() : questionId;
        C6898c c6898c = new C6898c(subQuestion.getQuestionId(), subQuestion.getUuid(), abstractC7699p0M16384a, str, null, null, null, null, null, null, PointerIconCompat.TYPE_TEXT, null);
        List<String> options = subQuestion.getOptions();
        if (options != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
            for (String str2 : options) {
                listEmptyList.add(new C9758b(str2, localAnswers.contains(str2) ? AbstractC9755a.a.f17180c : AbstractC9755a.b.f17181c, false, 4, null));
            }
            list = localAnswers;
        } else {
            list = localAnswers;
            listEmptyList = CollectionsKt.emptyList();
        }
        List list2 = listEmptyList;
        Integer num = (Integer) this.localCorrectResult.get(subQuestion.getUuid());
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Integer numValueOf = answer != null ? Integer.valueOf(answer.getResult()) : null;
            iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        }
        QuestionResultEnum questionResultEnum = QuestionResultEnum.RIGHT;
        if (iIntValue > questionResultEnum.ordinal()) {
            localAnswerList.add(C6898c.m9449b(c6898c, 0L, null, null, null, list2, list, ((abstractC7699p0M16384a instanceof AbstractC7699p0.c.a) || (abstractC7699p0M16384a instanceof AbstractC7699p0.a)) ? m9268K().m12466l(jLongValue, subQuestion.getUuid()) : m9268K().m12465k(jLongValue, subQuestion.getUuid()), null, null, null, 911, null));
        }
        if (answer == null || (listEmptyList2 = answer.getExamAnswers()) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        boolean z9 = false;
        if (answer != null && answer.getResult() == questionResultEnum.ordinal()) {
            z9 = true;
        }
        List<String> options2 = subQuestion.getOptions();
        if (options2 != null) {
            listEmptyList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(options2, 10));
            for (String str3 : options2) {
                listEmptyList3.add(new C9758b(str3, listEmptyList2.contains(str3) ? z9 ? AbstractC9755a.d.f17183c : AbstractC9755a.c.f17182c : AbstractC9755a.b.f17181c, false, 4, null));
            }
        } else {
            listEmptyList3 = CollectionsKt.emptyList();
        }
        List list3 = listEmptyList3;
        AbstractC6900e abstractC6900e = iIntValue == QuestionResultEnum.RIGHT.ordinal() ? AbstractC6900e.d.f9267d : (iIntValue == QuestionResultEnum.ERROR.ordinal() || iIntValue == QuestionResultEnum.REVISING_RIGHT.ordinal()) ? AbstractC6900e.a.f9264d : AbstractC6900e.b.f9265d;
        examAnswerList.add(C6898c.m9449b(c6898c, 0L, null, null, null, list3, listEmptyList2, null, null, null, abstractC6900e, 463, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9710Q0(int r19, long r20, com.zykj.evaluation.bean.DetailSubQuestion r22, java.util.Map r23, java.util.List r24, java.util.ArrayList r25, java.util.ArrayList r26) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel.m9710Q0(int, long, com.zykj.evaluation.bean.DetailSubQuestion, java.util.Map, java.util.List, java.util.ArrayList, java.util.ArrayList):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel.smali:3108
    }

    /* renamed from: R0 */
    public final void m9711R0(String uuid, boolean isRight) {
        AbstractC6900e abstractC6900e;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        AbstractC6900e abstractC6900e2 = isRight ? AbstractC6900e.d.f9267d : AbstractC6900e.a.f9264d;
        BaseViewModel.m8644f(this, null, null, new ToCorrectSelfDetailViewModel$updateCorrectResult$1(null), new ToCorrectSelfDetailViewModel$updateCorrectResult$2(null), null, new ToCorrectSelfDetailViewModel$updateCorrectResult$3(this, uuid, abstractC6900e2, null), 19, null);
        List<C6898c> listM16367d = m9314x().m16367d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16367d, 10));
        for (C6898c c6898cM9449b : listM16367d) {
            if (Intrinsics.areEqual(c6898cM9449b.m9460l(), uuid)) {
                abstractC6900e = abstractC6900e2;
                c6898cM9449b = C6898c.m9449b(c6898cM9449b, 0L, null, null, null, null, null, null, null, null, abstractC6900e, 511, null);
            } else {
                abstractC6900e = abstractC6900e2;
            }
            arrayList.add(c6898cM9449b);
            abstractC6900e2 = abstractC6900e;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C6898c c6898c = (C6898c) obj;
            if (Intrinsics.areEqual(c6898c.m9453e(), AbstractC6900e.a.f9264d)) {
                List listEmptyList = (List) getLocalAnswerMap().get(c6898c.m9460l());
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List list = listEmptyList;
                List<C9758b> listM9455g = c6898c.m9455g();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM9455g, 10));
                for (C9758b c9758b : listM9455g) {
                    arrayList3.add(new C9758b(c9758b.m16356d(), list.contains(c9758b.m16356d()) ? AbstractC9755a.a.f17180c : AbstractC9755a.b.f17181c, false, 4, null));
                }
                arrayList2.add(C6898c.m9449b(c6898c, 0L, null, null, null, arrayList3, list, m9268K().m12466l(m9274Q(), c6898c.m9460l()), null, null, AbstractC6900e.c.f9266d, 399, null));
            }
        }
        m9290i0(C9767e.m16364b(m9314x(), null, false, false, arrayList, null, arrayList2, null, null, null, null, null, null, 4055, null));
    }

    /* renamed from: S0 */
    public final void m9712S0(String uuid, List localAnswer) {
        List localAnswer2 = localAnswer;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(localAnswer2, "localAnswer");
        BaseViewModel.m8644f(this, null, null, new ToCorrectSelfDetailViewModel$updateLocalAnswer$1(null), new ToCorrectSelfDetailViewModel$updateLocalAnswer$2(null), null, new ToCorrectSelfDetailViewModel$updateLocalAnswer$3(this, uuid, localAnswer2, null), 19, null);
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

    /* renamed from: T0 */
    public final Object m9713T0(String str, int i10, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ToCorrectSelfDetailViewModel$updateLocalCorrectResultMap$2(this, str, i10, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
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
        m9289h0(C6897b.m9427b(m9312w(), null, null, null, null, false, null, null, false, false, null, false, null, null, null, true, false, null, null, 0L, null, 1032191, null));
        BaseViewModel.m8644f(this, null, null, null, null, null, new ToCorrectSelfDetailViewModel$initData$1(this, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: s */
    public void mo9304s(C7459j draftFunctions, Function0 lastCallback) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        Intrinsics.checkNotNullParameter(lastCallback, "lastCallback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new ToCorrectSelfDetailViewModel$commitAndChangeQuestionToNext$1(this, lastCallback, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: t */
    public void mo9306t(C7459j draftFunctions) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        BaseViewModel.m8644f(this, null, null, null, null, null, new ToCorrectSelfDetailViewModel$commitAndChangeQuestionToPre$1(this, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: u */
    public void mo9308u(C7459j draftFunctions, Function0 callback) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new ToCorrectSelfDetailViewModel$commitAndSubmitTask$1(this, callback, null), 31, null);
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
        m9289h0(C6897b.m9427b(c6897bM9312w, null, null, null, null, false, null, serverUrl + (path != null ? path : "") + "?showAnalysis=" + m9260C(), false, false, m9268K().m12464j(taskDetailInfo.getId()), false, taskDetailInfo.getAskForHelp() ? AbstractC6896a.b.f9201c : AbstractC6896a.a.f9200c, taskDetailInfo.isInMistakeBook() ? AbstractC6899d.b.f9246c : AbstractC6899d.a.f9245c, AbstractC9778i.a.f17248c, false, false, null, null, 0L, taskDetailInfo.getStem(), 509375, null));
        m9290i0(C9767e.m16364b(m9314x(), null, false, false, null, null, null, null, null, null, null, null, null, 4091, null));
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: w0 */
    public void mo9313w0(TaskDetailInfo taskDetailInfo, Map localAnswerMap) {
        String strValueOf;
        List<DetailSubQuestion> subQuestions;
        Intrinsics.checkNotNullParameter(taskDetailInfo, "taskDetailInfo");
        Intrinsics.checkNotNullParameter(localAnswerMap, "localAnswerMap");
        ArrayMap arrayMap = new ArrayMap();
        for (DetailAnswerInfo detailAnswerInfo : taskDetailInfo.getAnswerList()) {
            arrayMap.put(detailAnswerInfo.getUuid(), detailAnswerInfo);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (taskDetailInfo.getAnswerWithQuestion()) {
            m9710Q0(m9270M(), taskDetailInfo.getId(), (DetailSubQuestion) CollectionsKt.firstOrNull((List) taskDetailInfo.getQstFlows()), localAnswerMap, taskDetailInfo.getAnswerList(), arrayList, arrayList2);
        } else {
            boolean z9 = taskDetailInfo.getQstFlows().size() > 1;
            for (DetailSubQuestion detailSubQuestion : taskDetailInfo.getQstFlows()) {
                String str = ".";
                if (z9) {
                    strValueOf = (taskDetailInfo.getNumber() == 0 ? "" : taskDetailInfo.getNumber() + ".") + detailSubQuestion.getNumber();
                } else {
                    strValueOf = taskDetailInfo.getNumber() == 0 ? "" : String.valueOf(taskDetailInfo.getNumber());
                }
                if (detailSubQuestion.getType() != 0 || (subQuestions = detailSubQuestion.getSubQuestions()) == null || subQuestions.isEmpty()) {
                    String str2 = strValueOf;
                    int iM9270M = m9270M();
                    long id = taskDetailInfo.getId();
                    List listEmptyList = (List) localAnswerMap.get(detailSubQuestion.getUuid());
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    m9709P0(iM9270M, id, detailSubQuestion, str2, listEmptyList, (DetailAnswerInfo) arrayMap.get(detailSubQuestion.getUuid()), arrayList, arrayList2);
                } else {
                    boolean z10 = detailSubQuestion.getSubQuestions().size() > 1;
                    for (DetailSubQuestion detailSubQuestion2 : detailSubQuestion.getSubQuestions()) {
                        int iM9270M2 = m9270M();
                        long id2 = taskDetailInfo.getId();
                        String str3 = strValueOf + (z10 ? str + detailSubQuestion2.getNumber() : "");
                        List listEmptyList2 = (List) localAnswerMap.get(detailSubQuestion2.getUuid());
                        if (listEmptyList2 == null) {
                            listEmptyList2 = CollectionsKt.emptyList();
                        }
                        m9709P0(iM9270M2, id2, detailSubQuestion2, str3, listEmptyList2, (DetailAnswerInfo) arrayMap.get(detailSubQuestion2.getUuid()), arrayList, arrayList2);
                        strValueOf = strValueOf;
                        str = str;
                    }
                }
            }
        }
        C9767e c9767eM9314x = m9314x();
        boolean answerWithQuestion = taskDetailInfo.getAnswerWithQuestion();
        List listM16391h = AbstractC9776h.m16391h(taskDetailInfo, m9261D());
        List listM16394k = AbstractC9776h.m16394k(taskDetailInfo, m9261D());
        List listM16393j = AbstractC9776h.m16393j(taskDetailInfo, m9261D());
        ArrayList arrayList3 = new ArrayList();
        C9761c c9761cM16389f = AbstractC9776h.m16389f(taskDetailInfo);
        if (c9761cM16389f != null) {
            arrayList3.add(c9761cM16389f);
        }
        m9290i0(C9767e.m16364b(c9767eM9314x, null, answerWithQuestion, false, arrayList2, null, arrayList, null, null, listM16391h, listM16394k, listM16393j, arrayList3, 213, null));
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
