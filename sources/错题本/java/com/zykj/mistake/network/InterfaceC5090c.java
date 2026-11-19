package com.zykj.mistake.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.mistake.entity.req.AddItemsToCollectionReq;
import com.zykj.mistake.entity.req.AddMistakeQstReviewStateReq;
import com.zykj.mistake.entity.req.AddPictureNoteReq;
import com.zykj.mistake.entity.req.CreateOrUpdateCollectionReq;
import com.zykj.mistake.entity.req.CreateTagReq;
import com.zykj.mistake.entity.req.DeleteMyCollectionsReq;
import com.zykj.mistake.entity.req.GetCollectionItemsReq;
import com.zykj.mistake.entity.req.MistakeListReq;
import com.zykj.mistake.entity.req.MultiRemoveMistakeReq;
import com.zykj.mistake.entity.req.MultiSetTagsReq;
import com.zykj.mistake.entity.req.RemoveItemsFromCollectionReq;
import com.zykj.mistake.entity.req.RemovePicReq;
import com.zykj.mistake.entity.req.SearchMistakeCollectionReq;
import com.zykj.mistake.entity.req.SetMistakeQstItemDraftReq;
import com.zykj.mistake.entity.req.SetMistakeQstItemPracticeResultReq;
import com.zykj.mistake.entity.req.StartReviewSessionReq;
import com.zykj.mistake.entity.req.SubmitReviewResultReq;
import com.zykj.mistake.entity.req.TokenReq;
import com.zykj.mistake.entity.req.UpdatePictureNoteListReq;
import com.zykj.mistake.entity.resp.CameraPermissionResp;
import com.zykj.mistake.entity.resp.CreateOrEditTagResp;
import com.zykj.mistake.entity.resp.CreateOrUpdateCollectionResp;
import com.zykj.mistake.entity.resp.GeneratorResp;
import com.zykj.mistake.entity.resp.GetMyTagResp;
import com.zykj.mistake.entity.resp.GetNextReviewQuestionResp;
import com.zykj.mistake.entity.resp.MistakeBookFilterOptionsResp;
import com.zykj.mistake.entity.resp.MistakeCollectionListResp;
import com.zykj.mistake.entity.resp.MistakeDetailResp;
import com.zykj.mistake.entity.resp.MistakeGroupDetailResp;
import com.zykj.mistake.entity.resp.MistakeListResp;
import com.zykj.mistake.entity.resp.ReviewHomeResp;
import com.zykj.mistake.entity.resp.SearchMistakeCollectionIdsResp;
import com.zykj.mistake.entity.resp.StartReviewSessionResp;
import com.zykj.mistake.entity.resp.SubmitReviewResultResp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(m5109d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001d\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010!\u001a\u00020 2\b\b\u0001\u0010\u0003\u001a\u00020\u001fH§@¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H§@¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020+H§@¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020.H§@¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u000201H§@¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204H§@¢\u0006\u0004\b5\u0010\fJ\u001a\u00107\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u000206H§@¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020:2\b\b\u0001\u0010\u0003\u001a\u000209H§@¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020>2\b\b\u0001\u0010\u0003\u001a\u00020=H§@¢\u0006\u0004\b?\u0010@J\u001a\u0010A\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020=H§@¢\u0006\u0004\bA\u0010@J\u001a\u0010C\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020BH§@¢\u0006\u0004\bC\u0010DJ\u001a\u0010E\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020BH§@¢\u0006\u0004\bE\u0010DJ\u001a\u0010G\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020FH§@¢\u0006\u0004\bG\u0010HJ\u001a\u0010J\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020IH§@¢\u0006\u0004\bJ\u0010KJ\u001a\u0010M\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020LH§@¢\u0006\u0004\bM\u0010NJ\u0010\u0010P\u001a\u00020OH§@¢\u0006\u0004\bP\u0010\fJ\u001a\u0010S\u001a\u00020R2\b\b\u0001\u0010\u0003\u001a\u00020QH§@¢\u0006\u0004\bS\u0010TJ$\u0010Z\u001a\u00020Y2\b\b\u0001\u0010V\u001a\u00020U2\b\b\u0001\u0010X\u001a\u00020WH§@¢\u0006\u0004\bZ\u0010[J\u001a\u0010^\u001a\u00020]2\b\b\u0001\u0010\u0003\u001a\u00020\\H§@¢\u0006\u0004\b^\u0010_J\u001a\u0010a\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020`H§@¢\u0006\u0004\ba\u0010bJ\u001a\u0010c\u001a\u00020\u00042\b\b\u0001\u0010V\u001a\u00020UH§@¢\u0006\u0004\bc\u0010d¨\u0006eÀ\u0006\u0003"}, m5110d2 = {"Lcom/zykj/mistake/network/c;", "", "Lcom/zykj/mistake/entity/req/MultiSetTagsReq;", "req", "Lcom/zykj/mistake/network/ApiResp;", "w", "(Lcom/zykj/mistake/entity/req/MultiSetTagsReq;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;", "b", "(Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/resp/GetMyTagResp;", "c", "(Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;", "m", "Lcom/zykj/mistake/entity/req/CreateTagReq;", "Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;", "j", "(Lcom/zykj/mistake/entity/req/CreateTagReq;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/req/MistakeListReq;", "Lcom/zykj/mistake/entity/resp/MistakeListResp;", "a", "(Lcom/zykj/mistake/entity/req/MistakeListReq;Lh6/c;)Ljava/lang/Object;", "", "itemId", "Lcom/zykj/mistake/entity/resp/MistakeDetailResp;", "p", "(ILh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/resp/MistakeGroupDetailResp;", "i", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/zykj/mistake/entity/req/TokenReq;", "Lcom/zykj/mistake/entity/resp/GeneratorResp;", "d", "(Lcom/zykj/mistake/entity/req/TokenReq;Lh6/c;)Ljava/lang/Object;", "", "packageName", "Lcom/zykj/mistake/entity/resp/CameraPermissionResp;", "t", "(Ljava/lang/String;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/req/AddPictureNoteReq;", "e", "(Lcom/zykj/mistake/entity/req/AddPictureNoteReq;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/req/RemovePicReq;", "u", "(Lcom/zykj/mistake/entity/req/RemovePicReq;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;", "n", "(Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/req/SetMistakeQstItemPracticeResultReq;", "D", "(Lcom/zykj/mistake/entity/req/SetMistakeQstItemPracticeResultReq;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/resp/MistakeCollectionListResp;", "l", "Lcom/zykj/mistake/entity/req/DeleteMyCollectionsReq;", "x", "(Lcom/zykj/mistake/entity/req/DeleteMyCollectionsReq;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/req/CreateOrUpdateCollectionReq;", "Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;", "g", "(Lcom/zykj/mistake/entity/req/CreateOrUpdateCollectionReq;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;", "Lcom/zykj/mistake/entity/resp/SearchMistakeCollectionIdsResp;", "k", "(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Lh6/c;)Ljava/lang/Object;", "v", "Lcom/zykj/mistake/entity/req/AddItemsToCollectionReq;", "B", "(Lcom/zykj/mistake/entity/req/AddItemsToCollectionReq;Lh6/c;)Ljava/lang/Object;", "h", "Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;", "o", "(Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/req/RemoveItemsFromCollectionReq;", "y", "(Lcom/zykj/mistake/entity/req/RemoveItemsFromCollectionReq;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/req/SetMistakeQstItemDraftReq;", "s", "(Lcom/zykj/mistake/entity/req/SetMistakeQstItemDraftReq;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/resp/ReviewHomeResp;", "q", "Lcom/zykj/mistake/entity/req/StartReviewSessionReq;", "Lcom/zykj/mistake/entity/resp/StartReviewSessionResp;", "z", "(Lcom/zykj/mistake/entity/req/StartReviewSessionReq;Lh6/c;)Ljava/lang/Object;", "", "sessionId", "", "continueNextRound", "Lcom/zykj/mistake/entity/resp/GetNextReviewQuestionResp;", "C", "(JZLh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;", "Lcom/zykj/mistake/entity/resp/SubmitReviewResultResp;", "r", "(Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;Lh6/c;)Ljava/lang/Object;", "Lcom/zykj/mistake/entity/req/AddMistakeQstReviewStateReq;", "f", "(Lcom/zykj/mistake/entity/req/AddMistakeQstReviewStateReq;Lh6/c;)Ljava/lang/Object;", ExifInterface.LONGITUDE_EAST, "(JLh6/c;)Ljava/lang/Object;", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: com.zykj.mistake.network.c */
/* loaded from: classes3.dex */
public interface InterfaceC5090c {
    @GET("/api/services/app/MistakeBook/GetCustomMistakeQstItemDetailInfoAsync")
    @Nullable
    /* renamed from: A */
    Object m4404A(@Query("itemId") int i, @NotNull InterfaceC5631c<? super MistakeDetailResp> interfaceC5631c);

    @POST("api/services/app/MistakeCollection/SyncItemsToCollectionsAsync")
    @Nullable
    /* renamed from: B */
    Object m4405B(@Body @NotNull AddItemsToCollectionReq addItemsToCollectionReq, @NotNull InterfaceC5631c<? super ApiResp> interfaceC5631c);

    @GET("api/services/app/MistakeReview/GetNextReviewQuestionAsync")
    @Nullable
    /* renamed from: C */
    Object m4406C(@Query("sessionId") long j7, @Query("continueNextRound") boolean z8, @NotNull InterfaceC5631c<? super GetNextReviewQuestionResp> interfaceC5631c);

    @POST("api/services/app/MistakeBook/SetMistakeQstItemPracticeResultAsync")
    @Nullable
    /* renamed from: D */
    Object m4407D(@Body @NotNull SetMistakeQstItemPracticeResultReq setMistakeQstItemPracticeResultReq, @NotNull InterfaceC5631c<? super ApiResp> interfaceC5631c);

    @POST("api/services/app/MistakeReview/FinishReviewSessionAsync")
    @Nullable
    /* renamed from: E */
    Object m4408E(@Query("sessionId") long j7, @NotNull InterfaceC5631c<? super ApiResp> interfaceC5631c);

    @POST("api/services/app/MistakeBook/SearchMistakeQstItemsAsync")
    @Nullable
    /* renamed from: a */
    Object m4409a(@Body @NotNull MistakeListReq mistakeListReq, @NotNull InterfaceC5631c<? super MistakeListResp> interfaceC5631c);

    @POST("api/services/app/MistakeBook/MultiRemoveMistakeItemsAsync")
    @Nullable
    /* renamed from: b */
    Object m4410b(@Body @NotNull MultiRemoveMistakeReq multiRemoveMistakeReq, @NotNull InterfaceC5631c<? super ApiResp> interfaceC5631c);

    @GET("api/services/app/MistakeBook/GetMyTags")
    @Nullable
    /* renamed from: c */
    Object m4411c(@NotNull InterfaceC5631c<? super GetMyTagResp> interfaceC5631c);

    @POST("/api/services/app/ObjectStorage/GenerateTokenV2Async")
    @Nullable
    /* renamed from: d */
    Object m4412d(@Body @NotNull TokenReq tokenReq, @NotNull InterfaceC5631c<? super GeneratorResp> interfaceC5631c);

    @POST("/api/services/app/MistakeBook/AddPictureNoteAsync")
    @Nullable
    /* renamed from: e */
    Object m4413e(@Body @NotNull AddPictureNoteReq addPictureNoteReq, @NotNull InterfaceC5631c<? super ApiResp> interfaceC5631c);

    @POST("api/services/app/MistakeReview/AddMistakeQstReviewStateAsync")
    @Nullable
    /* renamed from: f */
    Object m4414f(@Body @NotNull AddMistakeQstReviewStateReq addMistakeQstReviewStateReq, @NotNull InterfaceC5631c<? super ApiResp> interfaceC5631c);

    @POST("api/services/app/MistakeCollection/CreateOrUpdateAsync")
    @Nullable
    /* renamed from: g */
    Object m4415g(@Body @NotNull CreateOrUpdateCollectionReq createOrUpdateCollectionReq, @NotNull InterfaceC5631c<? super CreateOrUpdateCollectionResp> interfaceC5631c);

    @POST("api/services/app/MistakeCollection/AppendItemsToCollectionAsync")
    @Nullable
    /* renamed from: h */
    Object m4416h(@Body @NotNull AddItemsToCollectionReq addItemsToCollectionReq, @NotNull InterfaceC5631c<? super ApiResp> interfaceC5631c);

    @GET("api/services/app/MistakeBook/GetMistakeRelatedGroupItemDetailInfoAsync")
    @Nullable
    /* renamed from: i */
    Object m4417i(@Query("itemId") int i, @NotNull InterfaceC5631c<? super MistakeGroupDetailResp> interfaceC5631c);

    @POST("/api/services/app/MistakeBook/CreateOrUpdateTagAsync")
    @Nullable
    /* renamed from: j */
    Object m4418j(@Body @NotNull CreateTagReq createTagReq, @NotNull InterfaceC5631c<? super CreateOrEditTagResp> interfaceC5631c);

    @POST("api/services/app/MistakeCollection/SearchMistakeCollectionItemIdsAsync")
    @Nullable
    /* renamed from: k */
    Object m4419k(@Body @NotNull SearchMistakeCollectionReq searchMistakeCollectionReq, @NotNull InterfaceC5631c<? super SearchMistakeCollectionIdsResp> interfaceC5631c);

    @GET("api/services/app/MistakeCollection/GetMyCollectionsAsync")
    @Nullable
    /* renamed from: l */
    Object m4420l(@NotNull InterfaceC5631c<? super MistakeCollectionListResp> interfaceC5631c);

    @GET("/api/services/app/MistakeBook/GetMistakeBookFilterOptionsAsync")
    @Nullable
    /* renamed from: m */
    Object m4421m(@NotNull InterfaceC5631c<? super MistakeBookFilterOptionsResp> interfaceC5631c);

    @POST("/api/services/app/MistakeBook/UpdatePictureNoteAsync")
    @Nullable
    /* renamed from: n */
    Object m4422n(@Body @NotNull UpdatePictureNoteListReq updatePictureNoteListReq, @NotNull InterfaceC5631c<? super ApiResp> interfaceC5631c);

    @POST("api/services/app/MistakeCollection/GetCollectionItemsAsync")
    @Nullable
    /* renamed from: o */
    Object m4423o(@Body @NotNull GetCollectionItemsReq getCollectionItemsReq, @NotNull InterfaceC5631c<? super MistakeListResp> interfaceC5631c);

    @GET("api/services/app/MistakeBook/GetMistakeQstItemDetailInfoAsync")
    @Nullable
    /* renamed from: p */
    Object m4424p(@Query("itemId") int i, @NotNull InterfaceC5631c<? super MistakeDetailResp> interfaceC5631c);

    @GET("api/services/app/MistakeReview/GetReviewHomeAsync")
    @Nullable
    /* renamed from: q */
    Object m4425q(@NotNull InterfaceC5631c<? super ReviewHomeResp> interfaceC5631c);

    @POST("api/services/app/MistakeReview/SubmitReviewResultAsync")
    @Nullable
    /* renamed from: r */
    Object m4426r(@Body @NotNull SubmitReviewResultReq submitReviewResultReq, @NotNull InterfaceC5631c<? super SubmitReviewResultResp> interfaceC5631c);

    @POST("api/services/app/MistakeBook/SetMistakeQstItemDraftAsync")
    @Nullable
    /* renamed from: s */
    Object m4427s(@Body @NotNull SetMistakeQstItemDraftReq setMistakeQstItemDraftReq, @NotNull InterfaceC5631c<? super ApiResp> interfaceC5631c);

    @GET("/api/services/app/StoreAppControl/CanIOpenCameraAsync")
    @Nullable
    /* renamed from: t */
    Object m4428t(@NotNull @Query("packageName") String str, @NotNull InterfaceC5631c<? super CameraPermissionResp> interfaceC5631c);

    @POST("/api/services/app/MistakeBook/RemovePictureNoteAsync")
    @Nullable
    /* renamed from: u */
    Object m4429u(@Body @NotNull RemovePicReq removePicReq, @NotNull InterfaceC5631c<? super ApiResp> interfaceC5631c);

    @POST("api/services/app/MistakeCollection/SearchMistakeCollectionItemsAsync")
    @Nullable
    /* renamed from: v */
    Object m4430v(@Body @NotNull SearchMistakeCollectionReq searchMistakeCollectionReq, @NotNull InterfaceC5631c<? super MistakeListResp> interfaceC5631c);

    @POST("api/services/app/MistakeBook/MultiSetTagsAsync")
    @Nullable
    /* renamed from: w */
    Object m4431w(@Body @NotNull MultiSetTagsReq multiSetTagsReq, @NotNull InterfaceC5631c<? super ApiResp> interfaceC5631c);

    @POST("api/services/app/MistakeCollection/DeleteAsync")
    @Nullable
    /* renamed from: x */
    Object m4432x(@Body @NotNull DeleteMyCollectionsReq deleteMyCollectionsReq, @NotNull InterfaceC5631c<? super ApiResp> interfaceC5631c);

    @POST("api/services/app/MistakeCollection/RemoveItemsFromCollectionAsync")
    @Nullable
    /* renamed from: y */
    Object m4433y(@Body @NotNull RemoveItemsFromCollectionReq removeItemsFromCollectionReq, @NotNull InterfaceC5631c<? super ApiResp> interfaceC5631c);

    @POST("api/services/app/MistakeReview/StartReviewSessionAsync")
    @Nullable
    /* renamed from: z */
    Object m4434z(@Body @NotNull StartReviewSessionReq startReviewSessionReq, @NotNull InterfaceC5631c<? super StartReviewSessionResp> interfaceC5631c);
}
