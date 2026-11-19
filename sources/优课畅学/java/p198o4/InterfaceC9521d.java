package p198o4;

import com.zykj.study.bean.CourseContentDetailBean;
import com.zykj.study.bean.exercise.AnswerMicroResultInput;
import com.zykj.study.bean.exercise.AnswerResultInput;
import com.zykj.study.bean.exercise.CompleteExerciseInput;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.bean.exercise.ExerciseInput;
import com.zykj.study.bean.exercise.GroupStatistic;
import com.zykj.study.bean.exercise.MicroAddInput;
import com.zykj.study.bean.exercise.MicroBean;
import com.zykj.study.bean.exercise.MicroDeleteInput;
import java.util.List;
import p103fa.InterfaceC8487a;
import p103fa.InterfaceC8492f;
import p103fa.InterfaceC8501o;
import p103fa.InterfaceC8506t;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* renamed from: o4.d */
/* loaded from: classes4.dex */
public interface InterfaceC9521d {
    @InterfaceC8492f("SelfStudy/api/supervise/GetUserQuizStatistic")
    /* renamed from: a */
    Object m17712a(@InterfaceC8506t("questiongroupId") int i10, @InterfaceC8506t("userId") String str, InterfaceC9324c<? super GroupStatistic> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/course/GetQuestionExplain")
    /* renamed from: b */
    Object m17713b(@InterfaceC8506t("groupId") int i10, @InterfaceC8506t("questionId") String str, InterfaceC9324c<? super List<MicroBean>> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/supervise/GetUserQuizStatistics")
    /* renamed from: c */
    Object m17714c(@InterfaceC8506t("superviseId") int i10, @InterfaceC8506t("catalogId") int i11, @InterfaceC8506t("userId") String str, InterfaceC9324c<? super GroupStatistic> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/learn/updateQuiz")
    /* renamed from: d */
    Object m17715d(@InterfaceC8487a AnswerMicroResultInput answerMicroResultInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/Supervise/GetGroupQuizStatistics")
    /* renamed from: e */
    Object m17716e(@InterfaceC8506t("courseId") int i10, @InterfaceC8506t("questionGroupId") int i11, InterfaceC9324c<? super GroupStatistic> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/learn/ReadContent")
    /* renamed from: f */
    Object m17717f(@InterfaceC8506t("courseId") int i10, @InterfaceC8506t("catalogId") int i11, InterfaceC9324c<? super CourseContentDetailBean> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/learn/showQuiz")
    /* renamed from: g */
    Object m17718g(@InterfaceC8487a ExerciseInput exerciseInput, InterfaceC9324c<? super ExerciseBean> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/learn/startQuiz")
    /* renamed from: h */
    Object m17719h(@InterfaceC8487a ExerciseInput exerciseInput, InterfaceC9324c<? super ExerciseBean> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/learn/updateQuiz")
    /* renamed from: i */
    Object m17720i(@InterfaceC8487a AnswerResultInput answerResultInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/course/DeleteQuestionExplain")
    /* renamed from: j */
    Object m17721j(@InterfaceC8487a MicroDeleteInput microDeleteInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/learn/CompleteQuiz")
    /* renamed from: k */
    Object m17722k(@InterfaceC8487a CompleteExerciseInput completeExerciseInput, InterfaceC9324c<? super ExerciseBean> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/course/AddQuestionExplain")
    /* renamed from: l */
    Object m17723l(@InterfaceC8487a MicroAddInput microAddInput, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
