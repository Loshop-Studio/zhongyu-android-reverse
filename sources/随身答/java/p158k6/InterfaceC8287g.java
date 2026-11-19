package p158k6;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.req.AddCategoryReq;
import com.zykj.student.dialogue.bean.req.AddMessageReq;
import com.zykj.student.dialogue.bean.req.CollectReq;
import com.zykj.student.dialogue.bean.req.CollectSessionReq;
import com.zykj.student.dialogue.bean.req.CreateSessionReq;
import com.zykj.student.dialogue.bean.req.MessageRequest;
import com.zykj.student.dialogue.bean.req.MonitorPictureReq;
import com.zykj.student.dialogue.bean.req.MoveCategoryReq;
import com.zykj.student.dialogue.bean.req.SessionsReq;
import com.zykj.student.dialogue.bean.req.SetSessionStateReq;
import com.zykj.student.dialogue.bean.req.SortCatalogReq;
import com.zykj.student.dialogue.bean.req.UpdateCategoryReq;
import com.zykj.student.dialogue.bean.resp.CatalogResp;
import com.zykj.student.dialogue.bean.resp.CollectSession;
import com.zykj.student.dialogue.bean.resp.CourseItem;
import com.zykj.student.dialogue.bean.resp.MessageResponse;
import com.zykj.student.dialogue.bean.resp.QuestionResp;
import com.zykj.student.dialogue.bean.resp.SearchQuestion;
import com.zykj.student.dialogue.bean.resp.SubjectResp;
import com.zykj.student.dialogue.bean.resp.SystemSettingsBean;
import com.zykj.student.dialogue.network.BaseResponse;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p110f9.InterfaceC7956a;
import p110f9.InterfaceC7961f;
import p110f9.InterfaceC7970o;
import p110f9.InterfaceC7975t;

@Metadata(m13412d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00030\u0002H§@¢\u0006\u0004\b\u001b\u0010\u0006J&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020 H§@¢\u0006\u0004\b!\u0010\"J \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020#H§@¢\u0006\u0004\b$\u0010%J2\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00030\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160&H§@¢\u0006\u0004\b(\u0010)J \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020*H§@¢\u0006\u0004\b+\u0010,J \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b-\u0010\u0019J&\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020.H§@¢\u0006\u0004\b0\u00101J \u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\b\u001a\u000202H§@¢\u0006\u0004\b3\u00104J\u001c\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00030\u0002H§@¢\u0006\u0004\b6\u0010\u0006J \u00108\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\b\u001a\u000207H§@¢\u0006\u0004\b8\u00109J&\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00022\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020:0\u0003H§@¢\u0006\u0004\b<\u0010=J \u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00022\b\b\u0001\u0010>\u001a\u00020\u0016H§@¢\u0006\u0004\b@\u0010\u0019J \u0010B\u001a\b\u0012\u0004\u0012\u00020;0\u00022\b\b\u0001\u0010\b\u001a\u00020AH§@¢\u0006\u0004\bB\u0010CJ \u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0016H§@¢\u0006\u0004\bE\u0010\u0019¨\u0006FÀ\u0006\u0003"}, m13413d2 = {"Lk6/g;", "", "Lcom/zykj/student/dialogue/network/BaseResponse;", "", "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/bean/req/UpdateCategoryReq;", "req", "r", "(Lcom/zykj/student/dialogue/bean/req/UpdateCategoryReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/bean/req/AddCategoryReq;", "l", "(Lcom/zykj/student/dialogue/bean/req/AddCategoryReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "c", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/bean/req/SessionsReq;", "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;", "t", "(Lcom/zykj/student/dialogue/bean/req/SessionsReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sessionId", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/bean/resp/SubjectResp;", "s", "Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;", "Lcom/zykj/student/dialogue/bean/resp/CollectSession;", "n", "(Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/bean/req/CollectReq;", "f", "(Lcom/zykj/student/dialogue/bean/req/CollectReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/bean/req/MoveCategoryReq;", "k", "(Lcom/zykj/student/dialogue/bean/req/MoveCategoryReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;", "p", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/bean/req/AddMessageReq;", "d", "(Lcom/zykj/student/dialogue/bean/req/AddMessageReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lcom/zykj/student/dialogue/bean/req/MessageRequest;", "Lcom/zykj/student/dialogue/bean/resp/MessageResponse;", "b", "(Lcom/zykj/student/dialogue/bean/req/MessageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/bean/req/CreateSessionReq;", "j", "(Lcom/zykj/student/dialogue/bean/req/CreateSessionReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/bean/resp/CourseItem;", "m", "Lcom/zykj/student/dialogue/bean/req/SetSessionStateReq;", "h", "(Lcom/zykj/student/dialogue/bean/req/SetSessionStateReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/bean/req/SortCatalogReq;", "Ljava/lang/Void;", "u", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "packageName", "", "q", "Lcom/zykj/student/dialogue/bean/req/MonitorPictureReq;", "i", "(Lcom/zykj/student/dialogue/bean/req/MonitorPictureReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/bean/resp/SystemSettingsBean;", "g", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: k6.g */
/* loaded from: classes5.dex */
public interface InterfaceC8287g {
    @InterfaceC7961f("api/services/app/Quora/GetSessionById")
    /* renamed from: a */
    Object m13385a(@InterfaceC7975t("id") String str, Continuation<? super BaseResponse<QuestionResp>> continuation);

    @InterfaceC7970o("api/services/app/Quora/GetMessages")
    /* renamed from: b */
    Object m13386b(@InterfaceC7956a MessageRequest messageRequest, Continuation<? super BaseResponse<List<MessageResponse>>> continuation);

    @InterfaceC7961f("api/services/app/Quora/DeleteCatalog")
    /* renamed from: c */
    Object m13387c(@InterfaceC7975t("id") long j9, Continuation<? super BaseResponse<Object>> continuation);

    @InterfaceC7970o("api/services/app/Quora/AddMessage")
    /* renamed from: d */
    Object m13388d(@InterfaceC7956a AddMessageReq addMessageReq, Continuation<? super BaseResponse<Object>> continuation);

    @InterfaceC7961f("api/services/app/Quora/ResetReadState")
    /* renamed from: e */
    Object m13389e(@InterfaceC7975t("sessionId") String str, Continuation<? super BaseResponse<Object>> continuation);

    @InterfaceC7970o("api/services/app/Quora/SetQuoraCollectAsync")
    /* renamed from: f */
    Object m13390f(@InterfaceC7956a CollectReq collectReq, Continuation<? super BaseResponse<Object>> continuation);

    @InterfaceC7961f("/api/services/app/Setting/GetSystemSettingsAsync")
    /* renamed from: g */
    Object m13391g(@InterfaceC7975t("propertyName") String str, Continuation<? super BaseResponse<SystemSettingsBean>> continuation);

    @InterfaceC7970o("api/services/app/Quora/SetSessionState")
    /* renamed from: h */
    Object m13392h(@InterfaceC7956a SetSessionStateReq setSessionStateReq, Continuation<? super BaseResponse<Object>> continuation);

    @InterfaceC7970o("/api/services/app/StoreAppControl/RecordPicturesAsync")
    /* renamed from: i */
    Object m13393i(@InterfaceC7956a MonitorPictureReq monitorPictureReq, Continuation<? super BaseResponse<Void>> continuation);

    @InterfaceC7970o("api/services/app/Quora/CreateSession")
    /* renamed from: j */
    Object m13394j(@InterfaceC7956a CreateSessionReq createSessionReq, Continuation<? super BaseResponse<Object>> continuation);

    @InterfaceC7970o("api/services/app/Quora/MultiChangeCatalog")
    /* renamed from: k */
    Object m13395k(@InterfaceC7956a MoveCategoryReq moveCategoryReq, Continuation<? super BaseResponse<Object>> continuation);

    @InterfaceC7970o("api/services/app/Quora/AddCatalog")
    /* renamed from: l */
    Object m13396l(@InterfaceC7956a AddCategoryReq addCategoryReq, Continuation<? super BaseResponse<Object>> continuation);

    @InterfaceC7970o("api/services/app/StudentUser/CoursesSubscribed")
    /* renamed from: m */
    Object m13397m(Continuation<? super BaseResponse<List<CourseItem>>> continuation);

    @InterfaceC7970o("api/services/app/Quora/GetCollectSessions")
    /* renamed from: n */
    Object m13398n(@InterfaceC7956a CollectSessionReq collectSessionReq, Continuation<? super BaseResponse<List<CollectSession>>> continuation);

    @InterfaceC7961f("api/services/app/Quora/GetCatalogs")
    /* renamed from: o */
    Object m13399o(Continuation<? super BaseResponse<List<CatalogResp>>> continuation);

    @InterfaceC7970o("api/services/app/Quora/SearchQuora")
    /* renamed from: p */
    Object m13400p(@InterfaceC7956a Map<String, String> map, Continuation<? super BaseResponse<List<SearchQuestion>>> continuation);

    @InterfaceC7961f("/api/services/app/StoreAppControl/CanIOpenCameraAsync")
    /* renamed from: q */
    Object m13401q(@InterfaceC7975t("packageName") String str, Continuation<? super BaseResponse<Boolean>> continuation);

    @InterfaceC7970o("api/services/app/Quora/UpdateCatalog")
    /* renamed from: r */
    Object m13402r(@InterfaceC7956a UpdateCategoryReq updateCategoryReq, Continuation<? super BaseResponse<Object>> continuation);

    @InterfaceC7961f("api/services/app/Quora/GetQuoraStudentTopicsAsync")
    /* renamed from: s */
    Object m13403s(Continuation<? super BaseResponse<List<SubjectResp>>> continuation);

    @InterfaceC7970o("api/services/app/Quora/GetSessions")
    /* renamed from: t */
    Object m13404t(@InterfaceC7956a SessionsReq sessionsReq, Continuation<? super BaseResponse<List<QuestionResp>>> continuation);

    @InterfaceC7970o("api/services/app/Quora/AlterQuoraCatalogSortAsync")
    /* renamed from: u */
    Object m13405u(@InterfaceC7956a List<SortCatalogReq> list, Continuation<? super BaseResponse<Void>> continuation);
}
