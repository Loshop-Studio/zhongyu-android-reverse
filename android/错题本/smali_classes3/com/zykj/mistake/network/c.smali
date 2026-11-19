.class public interface abstract Lcom/zykj/mistake/network/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0013H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0017H\u00a7@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0017H\u00a7@\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00192\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0017H\u00a7@\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u001a\u0010!\u001a\u00020 2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u001fH\u00a7@\u00a2\u0006\u0004\u0008!\u0010\"J\u001a\u0010&\u001a\u00020%2\u0008\u0008\u0001\u0010$\u001a\u00020#H\u00a7@\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010)\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020(H\u00a7@\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010,\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020+H\u00a7@\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u0010/\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020.H\u00a7@\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00102\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u000201H\u00a7@\u00a2\u0006\u0004\u00082\u00103J\u0010\u00105\u001a\u000204H\u00a7@\u00a2\u0006\u0004\u00085\u0010\u000cJ\u001a\u00107\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u000206H\u00a7@\u00a2\u0006\u0004\u00087\u00108J\u001a\u0010;\u001a\u00020:2\u0008\u0008\u0001\u0010\u0003\u001a\u000209H\u00a7@\u00a2\u0006\u0004\u0008;\u0010<J\u001a\u0010?\u001a\u00020>2\u0008\u0008\u0001\u0010\u0003\u001a\u00020=H\u00a7@\u00a2\u0006\u0004\u0008?\u0010@J\u001a\u0010A\u001a\u00020\u00142\u0008\u0008\u0001\u0010\u0003\u001a\u00020=H\u00a7@\u00a2\u0006\u0004\u0008A\u0010@J\u001a\u0010C\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020BH\u00a7@\u00a2\u0006\u0004\u0008C\u0010DJ\u001a\u0010E\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020BH\u00a7@\u00a2\u0006\u0004\u0008E\u0010DJ\u001a\u0010G\u001a\u00020\u00142\u0008\u0008\u0001\u0010\u0003\u001a\u00020FH\u00a7@\u00a2\u0006\u0004\u0008G\u0010HJ\u001a\u0010J\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020IH\u00a7@\u00a2\u0006\u0004\u0008J\u0010KJ\u001a\u0010M\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020LH\u00a7@\u00a2\u0006\u0004\u0008M\u0010NJ\u0010\u0010P\u001a\u00020OH\u00a7@\u00a2\u0006\u0004\u0008P\u0010\u000cJ\u001a\u0010S\u001a\u00020R2\u0008\u0008\u0001\u0010\u0003\u001a\u00020QH\u00a7@\u00a2\u0006\u0004\u0008S\u0010TJ$\u0010Z\u001a\u00020Y2\u0008\u0008\u0001\u0010V\u001a\u00020U2\u0008\u0008\u0001\u0010X\u001a\u00020WH\u00a7@\u00a2\u0006\u0004\u0008Z\u0010[J\u001a\u0010^\u001a\u00020]2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\\H\u00a7@\u00a2\u0006\u0004\u0008^\u0010_J\u001a\u0010a\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020`H\u00a7@\u00a2\u0006\u0004\u0008a\u0010bJ\u001a\u0010c\u001a\u00020\u00042\u0008\u0008\u0001\u0010V\u001a\u00020UH\u00a7@\u00a2\u0006\u0004\u0008c\u0010d\u00a8\u0006e\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/zykj/mistake/network/c;",
        "",
        "Lcom/zykj/mistake/entity/req/MultiSetTagsReq;",
        "req",
        "Lcom/zykj/mistake/network/ApiResp;",
        "w",
        "(Lcom/zykj/mistake/entity/req/MultiSetTagsReq;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;",
        "b",
        "(Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/resp/GetMyTagResp;",
        "c",
        "(Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;",
        "m",
        "Lcom/zykj/mistake/entity/req/CreateTagReq;",
        "Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;",
        "j",
        "(Lcom/zykj/mistake/entity/req/CreateTagReq;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/req/MistakeListReq;",
        "Lcom/zykj/mistake/entity/resp/MistakeListResp;",
        "a",
        "(Lcom/zykj/mistake/entity/req/MistakeListReq;Lh6/c;)Ljava/lang/Object;",
        "",
        "itemId",
        "Lcom/zykj/mistake/entity/resp/MistakeDetailResp;",
        "p",
        "(ILh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/resp/MistakeGroupDetailResp;",
        "i",
        "A",
        "Lcom/zykj/mistake/entity/req/TokenReq;",
        "Lcom/zykj/mistake/entity/resp/GeneratorResp;",
        "d",
        "(Lcom/zykj/mistake/entity/req/TokenReq;Lh6/c;)Ljava/lang/Object;",
        "",
        "packageName",
        "Lcom/zykj/mistake/entity/resp/CameraPermissionResp;",
        "t",
        "(Ljava/lang/String;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/req/AddPictureNoteReq;",
        "e",
        "(Lcom/zykj/mistake/entity/req/AddPictureNoteReq;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/req/RemovePicReq;",
        "u",
        "(Lcom/zykj/mistake/entity/req/RemovePicReq;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;",
        "n",
        "(Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/req/SetMistakeQstItemPracticeResultReq;",
        "D",
        "(Lcom/zykj/mistake/entity/req/SetMistakeQstItemPracticeResultReq;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/resp/MistakeCollectionListResp;",
        "l",
        "Lcom/zykj/mistake/entity/req/DeleteMyCollectionsReq;",
        "x",
        "(Lcom/zykj/mistake/entity/req/DeleteMyCollectionsReq;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/req/CreateOrUpdateCollectionReq;",
        "Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;",
        "g",
        "(Lcom/zykj/mistake/entity/req/CreateOrUpdateCollectionReq;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;",
        "Lcom/zykj/mistake/entity/resp/SearchMistakeCollectionIdsResp;",
        "k",
        "(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Lh6/c;)Ljava/lang/Object;",
        "v",
        "Lcom/zykj/mistake/entity/req/AddItemsToCollectionReq;",
        "B",
        "(Lcom/zykj/mistake/entity/req/AddItemsToCollectionReq;Lh6/c;)Ljava/lang/Object;",
        "h",
        "Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;",
        "o",
        "(Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/req/RemoveItemsFromCollectionReq;",
        "y",
        "(Lcom/zykj/mistake/entity/req/RemoveItemsFromCollectionReq;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/req/SetMistakeQstItemDraftReq;",
        "s",
        "(Lcom/zykj/mistake/entity/req/SetMistakeQstItemDraftReq;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/resp/ReviewHomeResp;",
        "q",
        "Lcom/zykj/mistake/entity/req/StartReviewSessionReq;",
        "Lcom/zykj/mistake/entity/resp/StartReviewSessionResp;",
        "z",
        "(Lcom/zykj/mistake/entity/req/StartReviewSessionReq;Lh6/c;)Ljava/lang/Object;",
        "",
        "sessionId",
        "",
        "continueNextRound",
        "Lcom/zykj/mistake/entity/resp/GetNextReviewQuestionResp;",
        "C",
        "(JZLh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;",
        "Lcom/zykj/mistake/entity/resp/SubmitReviewResultResp;",
        "r",
        "(Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;Lh6/c;)Ljava/lang/Object;",
        "Lcom/zykj/mistake/entity/req/AddMistakeQstReviewStateReq;",
        "f",
        "(Lcom/zykj/mistake/entity/req/AddMistakeQstReviewStateReq;Lh6/c;)Ljava/lang/Object;",
        "E",
        "(JLh6/c;)Ljava/lang/Object;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract A(ILh6/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "itemId"
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/MistakeDetailResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/api/services/app/MistakeBook/GetCustomMistakeQstItemDetailInfoAsync"
    .end annotation
.end method

.method public abstract B(Lcom/zykj/mistake/entity/req/AddItemsToCollectionReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/AddItemsToCollectionReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/AddItemsToCollectionReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeCollection/SyncItemsToCollectionsAsync"
    .end annotation
.end method

.method public abstract C(JZLh6/c;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lretrofit2/http/Query;
            value = "sessionId"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lretrofit2/http/Query;
            value = "continueNextRound"
        .end annotation
    .end param
    .param p4    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/GetNextReviewQuestionResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "api/services/app/MistakeReview/GetNextReviewQuestionAsync"
    .end annotation
.end method

.method public abstract D(Lcom/zykj/mistake/entity/req/SetMistakeQstItemPracticeResultReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/SetMistakeQstItemPracticeResultReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/SetMistakeQstItemPracticeResultReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeBook/SetMistakeQstItemPracticeResultAsync"
    .end annotation
.end method

.method public abstract E(JLh6/c;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lretrofit2/http/Query;
            value = "sessionId"
        .end annotation
    .end param
    .param p3    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeReview/FinishReviewSessionAsync"
    .end annotation
.end method

.method public abstract a(Lcom/zykj/mistake/entity/req/MistakeListReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/MistakeListReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/MistakeListReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/MistakeListResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeBook/SearchMistakeQstItemsAsync"
    .end annotation
.end method

.method public abstract b(Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeBook/MultiRemoveMistakeItemsAsync"
    .end annotation
.end method

.method public abstract c(Lh6/c;)Ljava/lang/Object;
    .param p1    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/GetMyTagResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "api/services/app/MistakeBook/GetMyTags"
    .end annotation
.end method

.method public abstract d(Lcom/zykj/mistake/entity/req/TokenReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/TokenReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/TokenReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/GeneratorResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/services/app/ObjectStorage/GenerateTokenV2Async"
    .end annotation
.end method

.method public abstract e(Lcom/zykj/mistake/entity/req/AddPictureNoteReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/AddPictureNoteReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/AddPictureNoteReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/services/app/MistakeBook/AddPictureNoteAsync"
    .end annotation
.end method

.method public abstract f(Lcom/zykj/mistake/entity/req/AddMistakeQstReviewStateReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/AddMistakeQstReviewStateReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/AddMistakeQstReviewStateReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeReview/AddMistakeQstReviewStateAsync"
    .end annotation
.end method

.method public abstract g(Lcom/zykj/mistake/entity/req/CreateOrUpdateCollectionReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/CreateOrUpdateCollectionReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/CreateOrUpdateCollectionReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeCollection/CreateOrUpdateAsync"
    .end annotation
.end method

.method public abstract h(Lcom/zykj/mistake/entity/req/AddItemsToCollectionReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/AddItemsToCollectionReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/AddItemsToCollectionReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeCollection/AppendItemsToCollectionAsync"
    .end annotation
.end method

.method public abstract i(ILh6/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "itemId"
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/MistakeGroupDetailResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "api/services/app/MistakeBook/GetMistakeRelatedGroupItemDetailInfoAsync"
    .end annotation
.end method

.method public abstract j(Lcom/zykj/mistake/entity/req/CreateTagReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/CreateTagReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/CreateTagReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/services/app/MistakeBook/CreateOrUpdateTagAsync"
    .end annotation
.end method

.method public abstract k(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/SearchMistakeCollectionIdsResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeCollection/SearchMistakeCollectionItemIdsAsync"
    .end annotation
.end method

.method public abstract l(Lh6/c;)Ljava/lang/Object;
    .param p1    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/MistakeCollectionListResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "api/services/app/MistakeCollection/GetMyCollectionsAsync"
    .end annotation
.end method

.method public abstract m(Lh6/c;)Ljava/lang/Object;
    .param p1    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/api/services/app/MistakeBook/GetMistakeBookFilterOptionsAsync"
    .end annotation
.end method

.method public abstract n(Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/services/app/MistakeBook/UpdatePictureNoteAsync"
    .end annotation
.end method

.method public abstract o(Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/MistakeListResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeCollection/GetCollectionItemsAsync"
    .end annotation
.end method

.method public abstract p(ILh6/c;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "itemId"
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/MistakeDetailResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "api/services/app/MistakeBook/GetMistakeQstItemDetailInfoAsync"
    .end annotation
.end method

.method public abstract q(Lh6/c;)Ljava/lang/Object;
    .param p1    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/ReviewHomeResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "api/services/app/MistakeReview/GetReviewHomeAsync"
    .end annotation
.end method

.method public abstract r(Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/SubmitReviewResultResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeReview/SubmitReviewResultAsync"
    .end annotation
.end method

.method public abstract s(Lcom/zykj/mistake/entity/req/SetMistakeQstItemDraftReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/SetMistakeQstItemDraftReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/SetMistakeQstItemDraftReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeBook/SetMistakeQstItemDraftAsync"
    .end annotation
.end method

.method public abstract t(Ljava/lang/String;Lh6/c;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "packageName"
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/CameraPermissionResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/api/services/app/StoreAppControl/CanIOpenCameraAsync"
    .end annotation
.end method

.method public abstract u(Lcom/zykj/mistake/entity/req/RemovePicReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/RemovePicReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/RemovePicReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/services/app/MistakeBook/RemovePictureNoteAsync"
    .end annotation
.end method

.method public abstract v(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/MistakeListResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeCollection/SearchMistakeCollectionItemsAsync"
    .end annotation
.end method

.method public abstract w(Lcom/zykj/mistake/entity/req/MultiSetTagsReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/MultiSetTagsReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/MultiSetTagsReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeBook/MultiSetTagsAsync"
    .end annotation
.end method

.method public abstract x(Lcom/zykj/mistake/entity/req/DeleteMyCollectionsReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/DeleteMyCollectionsReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/DeleteMyCollectionsReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeCollection/DeleteAsync"
    .end annotation
.end method

.method public abstract y(Lcom/zykj/mistake/entity/req/RemoveItemsFromCollectionReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/RemoveItemsFromCollectionReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/RemoveItemsFromCollectionReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeCollection/RemoveItemsFromCollectionAsync"
    .end annotation
.end method

.method public abstract z(Lcom/zykj/mistake/entity/req/StartReviewSessionReq;Lh6/c;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/mistake/entity/req/StartReviewSessionReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/StartReviewSessionReq;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/StartReviewSessionResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeReview/StartReviewSessionAsync"
    .end annotation
.end method
