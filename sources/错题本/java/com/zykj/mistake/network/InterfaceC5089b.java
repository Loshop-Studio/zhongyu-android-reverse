package com.zykj.mistake.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.entity.req.AddPictureNoteReq;
import com.zykj.mistake.entity.req.CreateOrUpdateMistakeReq;
import com.zykj.mistake.entity.req.CreateTagReq;
import com.zykj.mistake.entity.req.MistakeListReq;
import com.zykj.mistake.entity.req.MonitorPictureReq;
import com.zykj.mistake.entity.req.MultiRemoveMistakeReq;
import com.zykj.mistake.entity.req.MultiSetTagsReq;
import com.zykj.mistake.entity.req.RemovePicReq;
import com.zykj.mistake.entity.req.SetNoteReq;
import com.zykj.mistake.entity.req.TokenReq;
import com.zykj.mistake.entity.req.UpdatePictureNoteListReq;
import com.zykj.mistake.entity.resp.CameraPermissionResp;
import com.zykj.mistake.entity.resp.CreateOrEditTagResp;
import com.zykj.mistake.entity.resp.GeneratorResp;
import com.zykj.mistake.entity.resp.GetMyTagResp;
import com.zykj.mistake.entity.resp.MistakeBookResp;
import com.zykj.mistake.entity.resp.MistakeDetailResp;
import com.zykj.mistake.entity.resp.MistakeGroupDetailResp;
import com.zykj.mistake.entity.resp.MistakeListResp;
import com.zykj.mistake.entity.resp.SubjectResp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p145q5.AbstractC6434e;
import retrofit2.InterfaceC6490e;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(m5109d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004H'¢\u0006\u0004\b\u001d\u0010\rJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0004H'¢\u0006\u0004\b#\u0010\rJ\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020$H'¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020$H'¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020$H'¢\u0006\u0004\b(\u0010&J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b)\u0010\u0016J\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\b\b\u0001\u0010\u0003\u001a\u00020*H'¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020/H'¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00042\b\b\u0001\u00103\u001a\u000202H'¢\u0006\u0004\b5\u00106J)\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u00107\u001a\u00020\u00122\b\b\u0001\u00108\u001a\u00020\u0012H'¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020;H'¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020>H'¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020AH'¢\u0006\u0004\bB\u0010C¨\u0006DÀ\u0006\u0003"}, m5110d2 = {"Lcom/zykj/mistake/network/b;", "", "Lcom/zykj/mistake/entity/req/MultiSetTagsReq;", "req", "Lq5/e;", "Lcom/zykj/mistake/network/ApiResp;", "k", "(Lcom/zykj/mistake/entity/req/MultiSetTagsReq;)Lq5/e;", "Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;", "d", "(Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;)Lq5/e;", "Lcom/zykj/mistake/entity/resp/MistakeBookResp;", "p", "()Lq5/e;", "Lcom/zykj/mistake/entity/req/MistakeListReq;", "Lcom/zykj/mistake/entity/resp/MistakeListResp;", "e", "(Lcom/zykj/mistake/entity/req/MistakeListReq;)Lq5/e;", "", "itemId", "Lcom/zykj/mistake/entity/resp/MistakeDetailResp;", "s", "(I)Lq5/e;", "Lcom/zykj/mistake/entity/resp/MistakeGroupDetailResp;", "b", "Lcom/zykj/mistake/entity/req/SetNoteReq;", "a", "(Lcom/zykj/mistake/entity/req/SetNoteReq;)Lq5/e;", "Lcom/zykj/mistake/entity/resp/GetMyTagResp;", "f", "Lcom/zykj/mistake/entity/req/CreateTagReq;", "Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;", "h", "(Lcom/zykj/mistake/entity/req/CreateTagReq;)Lq5/e;", "Lcom/zykj/mistake/entity/resp/SubjectResp;", "u", "Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;", "l", "(Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;)Lq5/e;", "t", "i", "j", "Lcom/zykj/mistake/entity/req/TokenReq;", "Lretrofit2/e;", "Lcom/zykj/mistake/entity/resp/GeneratorResp;", "o", "(Lcom/zykj/mistake/entity/req/TokenReq;)Lretrofit2/e;", "Lcom/zykj/mistake/entity/req/MonitorPictureReq;", "r", "(Lcom/zykj/mistake/entity/req/MonitorPictureReq;)Lq5/e;", "", "packageName", "Lcom/zykj/mistake/entity/resp/CameraPermissionResp;", "m", "(Ljava/lang/String;)Lq5/e;", "examId", "questionId", "c", "(II)Lq5/e;", "Lcom/zykj/mistake/entity/req/RemovePicReq;", "g", "(Lcom/zykj/mistake/entity/req/RemovePicReq;)Lq5/e;", "Lcom/zykj/mistake/entity/req/AddPictureNoteReq;", "q", "(Lcom/zykj/mistake/entity/req/AddPictureNoteReq;)Lq5/e;", "Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;", "n", "(Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;)Lq5/e;", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: com.zykj.mistake.network.b */
/* loaded from: classes3.dex */
public interface InterfaceC5089b {
    @POST("api/services/app/MistakeBook/SetNoteAsync")
    @NotNull
    /* renamed from: a */
    AbstractC6434e<ApiResp> m4383a(@Body @NotNull SetNoteReq req);

    @GET("api/services/app/MistakeBook/GetMistakeRelatedGroupItemDetailInfoAsync")
    @NotNull
    /* renamed from: b */
    AbstractC6434e<MistakeGroupDetailResp> m4384b(@Query("itemId") int itemId);

    @POST("/api/services/app/Exam/SetQstMicroClassReadAsync")
    @NotNull
    /* renamed from: c */
    AbstractC6434e<ApiResp> m4385c(@Query("examId") int examId, @Query("questionId") int questionId);

    @POST("api/services/app/MistakeBook/MultiRemoveMistakeItemsAsync")
    @NotNull
    /* renamed from: d */
    AbstractC6434e<ApiResp> m4386d(@Body @NotNull MultiRemoveMistakeReq req);

    @POST("api/services/app/MistakeBook/SearchMistakeQstItemsAsync")
    @NotNull
    /* renamed from: e */
    AbstractC6434e<MistakeListResp> m4387e(@Body @NotNull MistakeListReq req);

    @GET("api/services/app/MistakeBook/GetMyTags")
    @NotNull
    /* renamed from: f */
    AbstractC6434e<GetMyTagResp> m4388f();

    @POST("/api/services/app/MistakeBook/RemovePictureNoteAsync")
    @NotNull
    /* renamed from: g */
    AbstractC6434e<ApiResp> m4389g(@Body @NotNull RemovePicReq req);

    @POST("/api/services/app/MistakeBook/CreateOrUpdateTagAsync")
    @NotNull
    /* renamed from: h */
    AbstractC6434e<CreateOrEditTagResp> m4390h(@Body @NotNull CreateTagReq req);

    @POST("api/services/app/MistakeBook/UpdateMistakeQstItemAsync")
    @NotNull
    /* renamed from: i */
    AbstractC6434e<ApiResp> m4391i(@Body @NotNull CreateOrUpdateMistakeReq req);

    @GET("/api/services/app/MistakeBook/GetCustomMistakeQstItemDetailInfoAsync")
    @NotNull
    /* renamed from: j */
    AbstractC6434e<MistakeDetailResp> m4392j(@Query("itemId") int itemId);

    @POST("api/services/app/MistakeBook/MultiSetTagsAsync")
    @NotNull
    /* renamed from: k */
    AbstractC6434e<ApiResp> m4393k(@Body @NotNull MultiSetTagsReq req);

    @POST("/api/services/app/MistakeBook/AddCustomMistakeQstItemAsync")
    @NotNull
    /* renamed from: l */
    AbstractC6434e<ApiResp> m4394l(@Body @NotNull CreateOrUpdateMistakeReq req);

    @GET("/api/services/app/StoreAppControl/CanIOpenCameraAsync")
    @NotNull
    /* renamed from: m */
    AbstractC6434e<CameraPermissionResp> m4395m(@NotNull @Query("packageName") String packageName);

    @POST("/api/services/app/MistakeBook/UpdatePictureNoteAsync")
    @NotNull
    /* renamed from: n */
    AbstractC6434e<ApiResp> m4396n(@Body @NotNull UpdatePictureNoteListReq req);

    @POST("/api/services/app/ObjectStorage/GenerateTokenV2Async")
    @NotNull
    /* renamed from: o */
    InterfaceC6490e<GeneratorResp> m4397o(@Body @NotNull TokenReq req);

    @GET("api/services/app/MistakeBook/GetMyMistakeBooksAsync")
    @NotNull
    /* renamed from: p */
    AbstractC6434e<MistakeBookResp> m4398p();

    @POST("/api/services/app/MistakeBook/AddPictureNoteAsync")
    @NotNull
    /* renamed from: q */
    AbstractC6434e<ApiResp> m4399q(@Body @NotNull AddPictureNoteReq req);

    @POST("/api/services/app/StoreAppControl/RecordPicturesAsync")
    @NotNull
    /* renamed from: r */
    AbstractC6434e<ApiResp> m4400r(@Body @NotNull MonitorPictureReq req);

    @GET("api/services/app/MistakeBook/GetMistakeQstItemDetailInfoAsync")
    @NotNull
    /* renamed from: s */
    AbstractC6434e<MistakeDetailResp> m4401s(@Query("itemId") int itemId);

    @POST("api/services/app/MistakeBook/UpdateCustomMistakeQstItemAsync")
    @NotNull
    /* renamed from: t */
    AbstractC6434e<ApiResp> m4402t(@Body @NotNull CreateOrUpdateMistakeReq req);

    @GET("api/services/app/User/GetMyTopics")
    @NotNull
    /* renamed from: u */
    AbstractC6434e<SubjectResp> m4403u();
}
