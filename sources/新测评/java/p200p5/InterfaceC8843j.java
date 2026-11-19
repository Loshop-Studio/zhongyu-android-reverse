package p200p5;

import com.zykj.evaluation.bean.AddMistakeReq;
import com.zykj.evaluation.bean.AskForHelpReq;
import com.zykj.evaluation.bean.ClassItem;
import com.zykj.evaluation.bean.CommitSelfCorrectReq;
import com.zykj.evaluation.bean.CommitTaskAnswer;
import com.zykj.evaluation.bean.CreateTagReq;
import com.zykj.evaluation.bean.ExamProgress;
import com.zykj.evaluation.bean.GetTaskListReq;
import com.zykj.evaluation.bean.GetTaskListResponse;
import com.zykj.evaluation.bean.GetTopicList;
import com.zykj.evaluation.bean.GuideNoStemQuestion;
import com.zykj.evaluation.bean.GuideNormalQuestion;
import com.zykj.evaluation.bean.GuideTaskInfo;
import com.zykj.evaluation.bean.MonitorPictureReq;
import com.zykj.evaluation.bean.PaperResponse;
import com.zykj.evaluation.bean.SetTaskFavoriteReq;
import com.zykj.evaluation.bean.TagInfo;
import com.zykj.evaluation.bean.TaskDetailInfo;
import com.zykj.http.bean.ApiResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p259u9.InterfaceC9597a;
import p259u9.InterfaceC9598b;
import p259u9.InterfaceC9602f;
import p259u9.InterfaceC9611o;
import p259u9.InterfaceC9616t;

@Metadata(m13557d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0001\u0010\n\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0011H§@¢\u0006\u0004\b\u001c\u0010\u0015J0\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00112\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003H§@¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a0\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0011H§@¢\u0006\u0004\b!\u0010\u0015J&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a0\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0011H§@¢\u0006\u0004\b\"\u0010\u0015J*\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00112\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b%\u0010&J*\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010'\u001a\u00020\u0011H§@¢\u0006\u0004\b)\u0010*J0\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010+\u001a\u00020\u0011H§@¢\u0006\u0004\b,\u0010*J*\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00112\b\b\u0001\u0010\n\u001a\u00020\u001dH§@¢\u0006\u0004\b-\u0010.J0\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00112\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003H§@¢\u0006\u0004\b/\u0010\u001fJ*\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00112\b\b\u0001\u0010\n\u001a\u00020\u001dH§@¢\u0006\u0004\b0\u0010.J \u00102\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\n\u001a\u000201H§@¢\u0006\u0004\b2\u00103J \u00104\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0011H§@¢\u0006\u0004\b4\u0010\u0015J6\u00107\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010'\u001a\u00020\u00112\n\b\u0003\u00106\u001a\u0004\u0018\u000105H§@¢\u0006\u0004\b7\u00108J \u0010:\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\n\u001a\u000209H§@¢\u0006\u0004\b:\u0010;J4\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010'\u001a\u00020\u00112\b\b\u0001\u0010<\u001a\u00020#H§@¢\u0006\u0004\b=\u0010>J\u001c\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00030\u0002H§@¢\u0006\u0004\b@\u0010\u0006J \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010\n\u001a\u00020AH§@¢\u0006\u0004\bB\u0010CJ \u0010F\u001a\b\u0012\u0004\u0012\u00020#0\u00022\b\b\u0001\u0010E\u001a\u00020DH§@¢\u0006\u0004\bF\u0010GJ \u0010I\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020HH§@¢\u0006\u0004\bI\u0010JJ \u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u00022\b\b\u0001\u0010K\u001a\u00020\u0011H§@¢\u0006\u0004\bM\u0010\u0015¨\u0006NÀ\u0006\u0003"}, m13558d2 = {"Lp5/j;", "", "Lcom/zykj/http/bean/ApiResp;", "", "Lcom/zykj/evaluation/bean/GetTopicList;", "w", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/evaluation/bean/ClassItem;", "k", "Lcom/zykj/evaluation/bean/SetTaskFavoriteReq;", "req", "f", "(Lcom/zykj/evaluation/bean/SetTaskFavoriteReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/evaluation/bean/GetTaskListReq;", "Lcom/zykj/evaluation/bean/GetTaskListResponse;", "t", "(Lcom/zykj/evaluation/bean/GetTaskListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "examId", "Lcom/zykj/evaluation/bean/ExamProgress;", "c", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/evaluation/bean/AskForHelpReq;", "h", "(Lcom/zykj/evaluation/bean/AskForHelpReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "taskId", "Lcom/zykj/evaluation/bean/GuideTaskInfo;", "Lcom/zykj/evaluation/bean/GuideNoStemQuestion;", "n", "Lcom/zykj/evaluation/bean/CommitTaskAnswer;", "y", "(JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/evaluation/bean/GuideNormalQuestion;", "v", "o", "", "isRevising", "m", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "questionId", "Lcom/zykj/evaluation/bean/TaskDetailInfo;", "r", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "groupId", "l", "b", "(JLcom/zykj/evaluation/bean/CommitTaskAnswer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "z", "u", "Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;", "x", "(Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i", "", "readProgress", "a", "(JJLjava/lang/Float;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/evaluation/bean/AddMistakeReq;", "g", "(Lcom/zykj/evaluation/bean/AddMistakeReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isRelatedGroup", "d", "(JJZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/evaluation/bean/TagInfo;", "e", "Lcom/zykj/evaluation/bean/CreateTagReq;", "q", "(Lcom/zykj/evaluation/bean/CreateTagReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "packageName", "p", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/evaluation/bean/MonitorPictureReq;", "j", "(Lcom/zykj/evaluation/bean/MonitorPictureReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "testPagerId", "Lcom/zykj/evaluation/bean/PaperResponse;", "s", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* renamed from: p5.j */
/* loaded from: classes4.dex */
public interface InterfaceC8843j {
    @InterfaceC9611o("api/services/app/Exam/SetQstMicroClassReadAsync")
    /* renamed from: a */
    Object m14819a(@InterfaceC9616t("examId") long j10, @InterfaceC9616t("questionId") long j11, @InterfaceC9616t("readProgress") Float f10, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC9611o("api/services/app/Task/ExamAnswerAsync")
    /* renamed from: b */
    Object m14820b(@InterfaceC9616t("taskId") long j10, @InterfaceC9597a CommitTaskAnswer commitTaskAnswer, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC9602f("/api/services/app/Task/GetExamAnswerProgressAsync")
    /* renamed from: c */
    Object m14821c(@InterfaceC9616t("examId") long j10, Continuation<? super ApiResp<ExamProgress>> continuation);

    @InterfaceC9598b("api/services/app/MistakeBook/RemoveFromMistakeBookAsync")
    /* renamed from: d */
    Object m14822d(@InterfaceC9616t("examId") long j10, @InterfaceC9616t("questionId") long j11, @InterfaceC9616t("isRelatedGroup") boolean z9, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC9602f("api/services/app/MistakeBook/GetMyTags")
    /* renamed from: e */
    Object m14823e(Continuation<? super ApiResp<List<TagInfo>>> continuation);

    @InterfaceC9611o("/api/services/app/Task/SetExamTaskCollectAsync")
    /* renamed from: f */
    Object m14824f(@InterfaceC9597a SetTaskFavoriteReq setTaskFavoriteReq, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC9611o("api/services/app/MistakeBook/AddInMistakeBookAsync")
    /* renamed from: g */
    Object m14825g(@InterfaceC9597a AddMistakeReq addMistakeReq, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC9611o("/api/services/app/Task/AskForHelpAsync")
    /* renamed from: h */
    Object m14826h(@InterfaceC9597a AskForHelpReq askForHelpReq, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC9611o("/api/services/app/Task/FinishSelfCorrectWithSelfAsync")
    /* renamed from: i */
    Object m14827i(@InterfaceC9616t("taskId") long j10, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC9611o("api/services/app/StoreAppControl/RecordPicturesAsync")
    /* renamed from: j */
    Object m14828j(@InterfaceC9597a MonitorPictureReq monitorPictureReq, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC9602f("api/services/app/Grade/GetAllInCurrentStageAsync")
    /* renamed from: k */
    Object m14829k(Continuation<? super ApiResp<List<ClassItem>>> continuation);

    @InterfaceC9602f("api/services/app/Task/GetRelatedQstViewAsync")
    /* renamed from: l */
    Object m14830l(@InterfaceC9616t("examId") long j10, @InterfaceC9616t("relatedGroupId") long j11, Continuation<? super ApiResp<List<TaskDetailInfo>>> continuation);

    @InterfaceC9611o("api/services/app/Task/CompleteAsync")
    /* renamed from: m */
    Object m14831m(@InterfaceC9616t("id") long j10, @InterfaceC9616t("isRevising") boolean z9, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC9602f("/api/services/app/Task/GetNoQstExamTaskAsync")
    /* renamed from: n */
    Object m14832n(@InterfaceC9616t("id") long j10, Continuation<? super ApiResp<GuideTaskInfo<GuideNoStemQuestion>>> continuation);

    @InterfaceC9602f("/api/services/app/Task/GetRevisingTaskAsync")
    /* renamed from: o */
    Object m14833o(@InterfaceC9616t("id") long j10, Continuation<? super ApiResp<GuideTaskInfo<GuideNormalQuestion>>> continuation);

    @InterfaceC9602f("api/services/app/StoreAppControl/CanIOpenCameraAsync")
    /* renamed from: p */
    Object m14834p(@InterfaceC9616t("packageName") String str, Continuation<? super ApiResp<Boolean>> continuation);

    @InterfaceC9611o("api/services/app/MistakeBook/CreateOrUpdateTagAsync")
    /* renamed from: q */
    Object m14835q(@InterfaceC9597a CreateTagReq createTagReq, Continuation<? super ApiResp<Long>> continuation);

    @InterfaceC9602f("api/services/app/Task/GetQuestionViewAsync")
    /* renamed from: r */
    Object m14836r(@InterfaceC9616t("examId") long j10, @InterfaceC9616t("questionId") long j11, Continuation<? super ApiResp<TaskDetailInfo>> continuation);

    @InterfaceC9602f("api/services/app/Test/GetLastAnswerSheetAsync")
    /* renamed from: s */
    Object m14837s(@InterfaceC9616t("testPagerId") long j10, Continuation<? super ApiResp<PaperResponse>> continuation);

    @InterfaceC9611o("/api/services/app/Task/GetStudentTaskListAsync")
    /* renamed from: t */
    Object m14838t(@InterfaceC9597a GetTaskListReq getTaskListReq, Continuation<? super ApiResp<GetTaskListResponse>> continuation);

    @InterfaceC9611o("api/services/app/Task/RevisingAnswerAsync")
    /* renamed from: u */
    Object m14839u(@InterfaceC9616t("taskId") long j10, @InterfaceC9597a CommitTaskAnswer commitTaskAnswer, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC9602f("/api/services/app/Task/GetExamTaskAsync")
    /* renamed from: v */
    Object m14840v(@InterfaceC9616t("id") long j10, Continuation<? super ApiResp<GuideTaskInfo<GuideNormalQuestion>>> continuation);

    @InterfaceC9602f("/api/services/app/User/GetMyTopics")
    /* renamed from: w */
    Object m14841w(Continuation<? super ApiResp<List<GetTopicList>>> continuation);

    @InterfaceC9611o("api/services/app/Task/SubmitSelfCorrectResultAsync")
    /* renamed from: x */
    Object m14842x(@InterfaceC9597a CommitSelfCorrectReq commitSelfCorrectReq, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC9611o("/api/services/app/Task/NoQstExamAnswerAsync")
    /* renamed from: y */
    Object m14843y(@InterfaceC9616t("taskId") long j10, @InterfaceC9597a List<CommitTaskAnswer> list, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC9611o("api/services/app/Task/ExamRelatedAnswerAsync")
    /* renamed from: z */
    Object m14844z(@InterfaceC9616t("taskId") long j10, @InterfaceC9597a List<CommitTaskAnswer> list, Continuation<? super ApiResp<Object>> continuation);
}
