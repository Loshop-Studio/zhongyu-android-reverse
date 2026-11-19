package p276w5;

import androidx.camera.video.AudioStats;
import com.zykj.evaluation.bean.DetailAnswerInfo;
import com.zykj.evaluation.bean.DetailGroupQstAnswer;
import com.zykj.evaluation.bean.DetailSubQuestion;
import com.zykj.evaluation.bean.MicroClassInfo;
import com.zykj.evaluation.bean.SpecificTrainingType;
import com.zykj.evaluation.bean.TaskDetailInfo;
import com.zykj.evaluation.bean.TypicalAnswer;
import com.zykj.evaluation.bean.constant.RevisingResultEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p122i6.AbstractC7699p0;

/* renamed from: w5.h */
/* loaded from: classes4.dex */
public abstract class AbstractC9776h {
    /* renamed from: a */
    public static final AbstractC7699p0 m16384a(int i10, int i11) {
        AbstractC7699p0.e eVar = AbstractC7699p0.e.f13059b;
        if (i10 == eVar.m12881a()) {
            return eVar;
        }
        AbstractC7699p0.d dVar = AbstractC7699p0.d.f13058b;
        if (i10 == dVar.m12881a()) {
            return dVar;
        }
        AbstractC7699p0.c.a aVar = AbstractC7699p0.c.a.f13056b;
        if (i10 != aVar.m12881a()) {
            AbstractC7699p0.a aVar2 = AbstractC7699p0.a.f13054b;
            if (i10 == aVar2.m12881a()) {
                return aVar2;
            }
        } else if (i11 == SpecificTrainingType.CompositionTraining.INSTANCE.getType()) {
            return AbstractC7699p0.c.b.f13057b;
        }
        return aVar;
    }

    /* renamed from: b */
    public static final TaskDetailInfo m16385b(List list) throws Exception {
        double d10;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new Exception("TaskDetailInfoList is Empty");
        }
        int i10 = 10;
        int i11 = 1;
        int i12 = 0;
        if (list.size() == 1) {
            TaskDetailInfo taskDetailInfo = (TaskDetailInfo) list.get(0);
            List<DetailSubQuestion> qstFlows = taskDetailInfo.getQstFlows();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(qstFlows, 10));
            Iterator<T> it = qstFlows.iterator();
            while (it.hasNext()) {
                arrayList.add(m16396m((DetailSubQuestion) it.next(), taskDetailInfo.getId()));
            }
            return TaskDetailInfo.copy$default(taskDetailInfo, 0L, 0, 0, null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, false, arrayList, 0, false, false, null, null, null, null, 0, null, null, false, null, null, null, 67106815, null);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        Iterator it2 = list.iterator();
        boolean z9 = true;
        int qstFlowsCount = 0;
        double totalScore = 0.0d;
        Double dValueOf = null;
        double d11 = 0.0d;
        while (it2.hasNext()) {
            TaskDetailInfo taskDetailInfo2 = (TaskDetailInfo) it2.next();
            Double originScore = taskDetailInfo2.getOriginScore();
            if (originScore != null) {
                double dDoubleValue = originScore.doubleValue();
                if (dValueOf == null) {
                    dValueOf = Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
                }
                dValueOf = Double.valueOf(dValueOf.doubleValue() + dDoubleValue);
            }
            double totalAnswerScore = d11 + taskDetailInfo2.getTotalAnswerScore();
            totalScore += taskDetailInfo2.getTotalScore();
            arrayList2.addAll(taskDetailInfo2.getAnswerList());
            List<DetailGroupQstAnswer> qstAnswers = taskDetailInfo2.getQstAnswers();
            if (qstAnswers != null) {
                arrayList3.addAll(qstAnswers);
            }
            DetailSubQuestion detailSubQuestionM16387d = m16387d(taskDetailInfo2.getQstFlows());
            if (!taskDetailInfo2.getAnswerWithQuestion() || detailSubQuestionM16387d == null) {
                int iM16386c = m16386c(taskDetailInfo2.getQstFlows());
                List<DetailSubQuestion> qstFlows2 = taskDetailInfo2.getQstFlows();
                d10 = totalAnswerScore;
                ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(qstFlows2, i10));
                Iterator it3 = qstFlows2.iterator();
                while (it3.hasNext()) {
                    DetailSubQuestion detailSubQuestion = (DetailSubQuestion) it3.next();
                    Integer numValueOf = Integer.valueOf(taskDetailInfo2.getNumber());
                    if (!(numValueOf.intValue() != 0)) {
                        numValueOf = null;
                    }
                    String string = numValueOf != null ? numValueOf.toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    ArrayList arrayList10 = arrayList9;
                    long id = taskDetailInfo2.getId();
                    Iterator it4 = it3;
                    boolean z10 = true;
                    if (iM16386c <= 1) {
                        z10 = false;
                    }
                    arrayList9 = arrayList10;
                    arrayList9.add(m16395l(detailSubQuestion, string, id, z10));
                    it3 = it4;
                }
                arrayList4.addAll(arrayList9);
            } else {
                long id2 = taskDetailInfo2.getId();
                Integer numValueOf2 = Integer.valueOf(taskDetailInfo2.getNumber());
                if ((numValueOf2.intValue() != 0 ? i11 : i12) == 0) {
                    numValueOf2 = null;
                }
                String string2 = numValueOf2 != null ? numValueOf2.toString() : null;
                arrayList4.add(DetailSubQuestion.copy$default(detailSubQuestionM16387d, null, 0, AudioStats.AUDIO_AMPLITUDE_NONE, null, 0, null, 0, null, id2, string2 == null ? "" : string2, 127, null));
                d10 = totalAnswerScore;
            }
            qstFlowsCount += taskDetailInfo2.getQstFlowsCount();
            if (taskDetailInfo2.getRevisingResult() != RevisingResultEnum.NOTHING.ordinal() && !taskDetailInfo2.getRevisingAnswerd()) {
                z9 = false;
            }
            arrayList5.addAll(taskDetailInfo2.getLastRoundRevisingRecords());
            List<MicroClassInfo> microClassToQuestionList = taskDetailInfo2.getMicroClassToQuestionList();
            if (microClassToQuestionList != null) {
                arrayList6.addAll(microClassToQuestionList);
            }
            List<TypicalAnswer> typicalRightAnswers = taskDetailInfo2.getTypicalRightAnswers();
            if (typicalRightAnswers != null) {
                arrayList7.addAll(typicalRightAnswers);
            }
            List<TypicalAnswer> typicalErrorAnswers = taskDetailInfo2.getTypicalErrorAnswers();
            if (typicalErrorAnswers != null) {
                arrayList8.addAll(typicalErrorAnswers);
            }
            d11 = d10;
            i10 = 10;
            i11 = 1;
            i12 = 0;
        }
        return TaskDetailInfo.copy$default((TaskDetailInfo) list.get(i12), 0L, 0, 0, dValueOf, AudioStats.AUDIO_AMPLITUDE_NONE, d11, totalScore, null, arrayList2, arrayList3, false, arrayList4, qstFlowsCount, false, false, null, null, arrayList6, null, 0, arrayList8, arrayList7, z9, arrayList5, null, null, 51241107, null);
    }

    /* renamed from: c */
    public static final int m16386c(List list) {
        List<DetailSubQuestion> subQuestions;
        Iterator it = list.iterator();
        int iM16386c = 0;
        while (it.hasNext()) {
            DetailSubQuestion detailSubQuestion = (DetailSubQuestion) it.next();
            iM16386c += (detailSubQuestion.getType() != 0 || (subQuestions = detailSubQuestion.getSubQuestions()) == null || subQuestions.isEmpty()) ? 1 : m16386c(detailSubQuestion.getSubQuestions());
        }
        return iM16386c;
    }

    /* renamed from: d */
    public static final DetailSubQuestion m16387d(List list) {
        List<DetailSubQuestion> subQuestions;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DetailSubQuestion detailSubQuestionM16387d = (DetailSubQuestion) it.next();
            if (detailSubQuestionM16387d.getType() != 0 || (subQuestions = detailSubQuestionM16387d.getSubQuestions()) == null || subQuestions.isEmpty() || (detailSubQuestionM16387d = m16387d(detailSubQuestionM16387d.getSubQuestions())) != null) {
                return detailSubQuestionM16387d;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final C9761c m16388e(TaskDetailInfo taskDetailInfo) {
        Intrinsics.checkNotNullParameter(taskDetailInfo, "<this>");
        String revisingDraft = taskDetailInfo.getRevisingDraft();
        if (revisingDraft == null || revisingDraft.length() == 0) {
            return null;
        }
        return new C9761c("订正草稿", taskDetailInfo.getRevisingDraft());
    }

    /* renamed from: f */
    public static final C9761c m16389f(TaskDetailInfo taskDetailInfo) {
        Intrinsics.checkNotNullParameter(taskDetailInfo, "<this>");
        String examDraft = taskDetailInfo.getExamDraft();
        if (examDraft == null || examDraft.length() == 0) {
            return null;
        }
        return new C9761c("测评草稿", taskDetailInfo.getExamDraft());
    }

    /* renamed from: g */
    public static final String m16390g(TaskDetailInfo taskDetailInfo) {
        DetailAnswerInfo detailAnswerInfoPrevious;
        String examMicroLessonComment;
        Intrinsics.checkNotNullParameter(taskDetailInfo, "<this>");
        List<DetailAnswerInfo> answerList = taskDetailInfo.getAnswerList();
        ListIterator<DetailAnswerInfo> listIterator = answerList.listIterator(answerList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                detailAnswerInfoPrevious = null;
                break;
            }
            detailAnswerInfoPrevious = listIterator.previous();
            String examMicroLessonComment2 = detailAnswerInfoPrevious.getExamMicroLessonComment();
            if (!(examMicroLessonComment2 == null || examMicroLessonComment2.length() == 0)) {
                break;
            }
        }
        DetailAnswerInfo detailAnswerInfo = detailAnswerInfoPrevious;
        return (detailAnswerInfo == null || (examMicroLessonComment = detailAnswerInfo.getExamMicroLessonComment()) == null) ? "" : examMicroLessonComment;
    }

    /* renamed from: h */
    public static final List m16391h(TaskDetailInfo taskDetailInfo, boolean z9) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(taskDetailInfo, "<this>");
        if (!z9) {
            return CollectionsKt.emptyList();
        }
        List<MicroClassInfo> microClassToQuestionList = taskDetailInfo.getMicroClassToQuestionList();
        if (microClassToQuestionList == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : microClassToQuestionList) {
            if (((MicroClassInfo) obj).getAddress() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            MicroClassInfo microClassInfo = (MicroClassInfo) obj2;
            String name = microClassInfo.getName();
            List listSplit$default = name != null ? StringsKt.split$default((CharSequence) name, new String[]{" "}, false, 0, 6, (Object) null) : null;
            String str3 = "";
            if (listSplit$default == null || (str = (String) CollectionsKt.getOrNull(listSplit$default, 0)) == null) {
                str = "";
            }
            if (listSplit$default == null || (str2 = (String) CollectionsKt.getOrNull(listSplit$default, 1)) == null) {
                str2 = "";
            }
            String snapshot = microClassInfo.getSnapshot();
            if (snapshot == null) {
                snapshot = "";
            }
            String address = microClassInfo.getAddress();
            if (address != null) {
                str3 = address;
            }
            arrayList2.add(new C9764d(snapshot, str3, str, str2));
        }
        return arrayList2;
    }

    /* renamed from: i */
    public static final String m16392i(TaskDetailInfo taskDetailInfo) {
        DetailAnswerInfo detailAnswerInfoPrevious;
        String reviseMicroLessonComment;
        Intrinsics.checkNotNullParameter(taskDetailInfo, "<this>");
        List<DetailAnswerInfo> answerList = taskDetailInfo.getAnswerList();
        ListIterator<DetailAnswerInfo> listIterator = answerList.listIterator(answerList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                detailAnswerInfoPrevious = null;
                break;
            }
            detailAnswerInfoPrevious = listIterator.previous();
            String reviseMicroLessonComment2 = detailAnswerInfoPrevious.getReviseMicroLessonComment();
            if (!(reviseMicroLessonComment2 == null || reviseMicroLessonComment2.length() == 0)) {
                break;
            }
        }
        DetailAnswerInfo detailAnswerInfo = detailAnswerInfoPrevious;
        return (detailAnswerInfo == null || (reviseMicroLessonComment = detailAnswerInfo.getReviseMicroLessonComment()) == null) ? "" : reviseMicroLessonComment;
    }

    /* renamed from: j */
    public static final List m16393j(TaskDetailInfo taskDetailInfo, boolean z9) {
        Intrinsics.checkNotNullParameter(taskDetailInfo, "<this>");
        if (!z9) {
            return CollectionsKt.emptyList();
        }
        List<TypicalAnswer> typicalErrorAnswers = taskDetailInfo.getTypicalErrorAnswers();
        if (typicalErrorAnswers == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(typicalErrorAnswers, 10));
        for (TypicalAnswer typicalAnswer : typicalErrorAnswers) {
            String str = (String) CollectionsKt.firstOrNull((List) typicalAnswer.getAnswers());
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = (String) CollectionsKt.firstOrNull((List) typicalAnswer.getComments());
            if (str3 != null) {
                str2 = str3;
            }
            arrayList.add(new C9773g(str, str2, null, 4, null));
        }
        return arrayList;
    }

    /* renamed from: k */
    public static final List m16394k(TaskDetailInfo taskDetailInfo, boolean z9) {
        Intrinsics.checkNotNullParameter(taskDetailInfo, "<this>");
        if (!z9) {
            return CollectionsKt.emptyList();
        }
        List<TypicalAnswer> typicalRightAnswers = taskDetailInfo.getTypicalRightAnswers();
        if (typicalRightAnswers == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(typicalRightAnswers, 10));
        for (TypicalAnswer typicalAnswer : typicalRightAnswers) {
            String str = (String) CollectionsKt.firstOrNull((List) typicalAnswer.getAnswers());
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = (String) CollectionsKt.firstOrNull((List) typicalAnswer.getComments());
            if (str3 == null) {
                str3 = "";
            }
            String fullname = typicalAnswer.getFullname();
            if (fullname != null) {
                str2 = fullname;
            }
            arrayList.add(new C9773g(str, str3, str2));
        }
        return arrayList;
    }

    /* renamed from: l */
    public static final DetailSubQuestion m16395l(DetailSubQuestion detailSubQuestion, String str, long j10, boolean z9) {
        String str2;
        String string;
        ArrayList arrayList = null;
        if (z9) {
            if (StringsKt.isBlank(str)) {
                Integer numValueOf = Integer.valueOf(detailSubQuestion.getNumber());
                if (numValueOf.intValue() == 0) {
                    numValueOf = null;
                }
                string = numValueOf != null ? numValueOf.toString() : null;
                if (string == null) {
                    string = "";
                }
            } else {
                if (detailSubQuestion.getNumber() != 0) {
                    string = str + "." + detailSubQuestion.getNumber();
                }
                str2 = str;
            }
            str2 = string;
        } else {
            str2 = str;
        }
        List<DetailSubQuestion> subQuestions = detailSubQuestion.getSubQuestions();
        if (subQuestions != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subQuestions, 10));
            Iterator<T> it = subQuestions.iterator();
            while (it.hasNext()) {
                arrayList.add(m16395l((DetailSubQuestion) it.next(), str2, j10, z9));
            }
        }
        return DetailSubQuestion.copy$default(detailSubQuestion, null, 0, AudioStats.AUDIO_AMPLITUDE_NONE, null, 0, null, 0, arrayList, j10, str2, 127, null);
    }

    /* renamed from: m */
    public static final DetailSubQuestion m16396m(DetailSubQuestion detailSubQuestion, long j10) {
        long j11;
        ArrayList arrayList;
        List<DetailSubQuestion> subQuestions = detailSubQuestion.getSubQuestions();
        if (subQuestions != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subQuestions, 10));
            Iterator<T> it = subQuestions.iterator();
            while (it.hasNext()) {
                arrayList.add(m16396m((DetailSubQuestion) it.next(), j10));
            }
            j11 = j10;
        } else {
            j11 = j10;
            arrayList = null;
        }
        return DetailSubQuestion.copy$default(detailSubQuestion, null, 0, AudioStats.AUDIO_AMPLITUDE_NONE, null, 0, null, 0, arrayList, j11, null, 639, null);
    }
}
