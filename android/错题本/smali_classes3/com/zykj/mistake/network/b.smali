.class public interface abstract Lcom/zykj/mistake/network/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0008H\'\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004H\'\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u000eH\'\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00042\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0012H\'\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00042\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0012H\'\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J\u001f\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0019H\'\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0004H\'\u00a2\u0006\u0004\u0008\u001d\u0010\rJ\u001f\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u001eH\'\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0\u0004H\'\u00a2\u0006\u0004\u0008#\u0010\rJ\u001f\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020$H\'\u00a2\u0006\u0004\u0008%\u0010&J\u001f\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020$H\'\u00a2\u0006\u0004\u0008\'\u0010&J\u001f\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020$H\'\u00a2\u0006\u0004\u0008(\u0010&J\u001f\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00042\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0012H\'\u00a2\u0006\u0004\u0008)\u0010\u0016J\u001f\u0010-\u001a\u0008\u0012\u0004\u0012\u00020,0+2\u0008\u0008\u0001\u0010\u0003\u001a\u00020*H\'\u00a2\u0006\u0004\u0008-\u0010.J\u001f\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020/H\'\u00a2\u0006\u0004\u00080\u00101J\u001f\u00105\u001a\u0008\u0012\u0004\u0012\u0002040\u00042\u0008\u0008\u0001\u00103\u001a\u000202H\'\u00a2\u0006\u0004\u00085\u00106J)\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u00107\u001a\u00020\u00122\u0008\u0008\u0001\u00108\u001a\u00020\u0012H\'\u00a2\u0006\u0004\u00089\u0010:J\u001f\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020;H\'\u00a2\u0006\u0004\u0008<\u0010=J\u001f\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020>H\'\u00a2\u0006\u0004\u0008?\u0010@J\u001f\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020AH\'\u00a2\u0006\u0004\u0008B\u0010C\u00a8\u0006D\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/zykj/mistake/network/b;",
        "",
        "Lcom/zykj/mistake/entity/req/MultiSetTagsReq;",
        "req",
        "Lq5/e;",
        "Lcom/zykj/mistake/network/ApiResp;",
        "k",
        "(Lcom/zykj/mistake/entity/req/MultiSetTagsReq;)Lq5/e;",
        "Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;",
        "d",
        "(Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;)Lq5/e;",
        "Lcom/zykj/mistake/entity/resp/MistakeBookResp;",
        "p",
        "()Lq5/e;",
        "Lcom/zykj/mistake/entity/req/MistakeListReq;",
        "Lcom/zykj/mistake/entity/resp/MistakeListResp;",
        "e",
        "(Lcom/zykj/mistake/entity/req/MistakeListReq;)Lq5/e;",
        "",
        "itemId",
        "Lcom/zykj/mistake/entity/resp/MistakeDetailResp;",
        "s",
        "(I)Lq5/e;",
        "Lcom/zykj/mistake/entity/resp/MistakeGroupDetailResp;",
        "b",
        "Lcom/zykj/mistake/entity/req/SetNoteReq;",
        "a",
        "(Lcom/zykj/mistake/entity/req/SetNoteReq;)Lq5/e;",
        "Lcom/zykj/mistake/entity/resp/GetMyTagResp;",
        "f",
        "Lcom/zykj/mistake/entity/req/CreateTagReq;",
        "Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;",
        "h",
        "(Lcom/zykj/mistake/entity/req/CreateTagReq;)Lq5/e;",
        "Lcom/zykj/mistake/entity/resp/SubjectResp;",
        "u",
        "Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;",
        "l",
        "(Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;)Lq5/e;",
        "t",
        "i",
        "j",
        "Lcom/zykj/mistake/entity/req/TokenReq;",
        "Lretrofit2/e;",
        "Lcom/zykj/mistake/entity/resp/GeneratorResp;",
        "o",
        "(Lcom/zykj/mistake/entity/req/TokenReq;)Lretrofit2/e;",
        "Lcom/zykj/mistake/entity/req/MonitorPictureReq;",
        "r",
        "(Lcom/zykj/mistake/entity/req/MonitorPictureReq;)Lq5/e;",
        "",
        "packageName",
        "Lcom/zykj/mistake/entity/resp/CameraPermissionResp;",
        "m",
        "(Ljava/lang/String;)Lq5/e;",
        "examId",
        "questionId",
        "c",
        "(II)Lq5/e;",
        "Lcom/zykj/mistake/entity/req/RemovePicReq;",
        "g",
        "(Lcom/zykj/mistake/entity/req/RemovePicReq;)Lq5/e;",
        "Lcom/zykj/mistake/entity/req/AddPictureNoteReq;",
        "q",
        "(Lcom/zykj/mistake/entity/req/AddPictureNoteReq;)Lq5/e;",
        "Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;",
        "n",
        "(Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;)Lq5/e;",
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
.method public abstract a(Lcom/zykj/mistake/entity/req/SetNoteReq;)Lq5/e;
    .param p1    # Lcom/zykj/mistake/entity/req/SetNoteReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/SetNoteReq;",
            ")",
            "Lq5/e<",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeBook/SetNoteAsync"
    .end annotation
.end method

.method public abstract b(I)Lq5/e;
    .param p1    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "itemId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lq5/e<",
            "Lcom/zykj/mistake/entity/resp/MistakeGroupDetailResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "api/services/app/MistakeBook/GetMistakeRelatedGroupItemDetailInfoAsync"
    .end annotation
.end method

.method public abstract c(II)Lq5/e;
    .param p1    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "examId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "questionId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lq5/e<",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/services/app/Exam/SetQstMicroClassReadAsync"
    .end annotation
.end method

.method public abstract d(Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;)Lq5/e;
    .param p1    # Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;",
            ")",
            "Lq5/e<",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeBook/MultiRemoveMistakeItemsAsync"
    .end annotation
.end method

.method public abstract e(Lcom/zykj/mistake/entity/req/MistakeListReq;)Lq5/e;
    .param p1    # Lcom/zykj/mistake/entity/req/MistakeListReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/MistakeListReq;",
            ")",
            "Lq5/e<",
            "Lcom/zykj/mistake/entity/resp/MistakeListResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeBook/SearchMistakeQstItemsAsync"
    .end annotation
.end method

.method public abstract f()Lq5/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq5/e<",
            "Lcom/zykj/mistake/entity/resp/GetMyTagResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "api/services/app/MistakeBook/GetMyTags"
    .end annotation
.end method

.method public abstract g(Lcom/zykj/mistake/entity/req/RemovePicReq;)Lq5/e;
    .param p1    # Lcom/zykj/mistake/entity/req/RemovePicReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/RemovePicReq;",
            ")",
            "Lq5/e<",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/services/app/MistakeBook/RemovePictureNoteAsync"
    .end annotation
.end method

.method public abstract h(Lcom/zykj/mistake/entity/req/CreateTagReq;)Lq5/e;
    .param p1    # Lcom/zykj/mistake/entity/req/CreateTagReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/CreateTagReq;",
            ")",
            "Lq5/e<",
            "Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/services/app/MistakeBook/CreateOrUpdateTagAsync"
    .end annotation
.end method

.method public abstract i(Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;)Lq5/e;
    .param p1    # Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;",
            ")",
            "Lq5/e<",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeBook/UpdateMistakeQstItemAsync"
    .end annotation
.end method

.method public abstract j(I)Lq5/e;
    .param p1    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "itemId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lq5/e<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetailResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/api/services/app/MistakeBook/GetCustomMistakeQstItemDetailInfoAsync"
    .end annotation
.end method

.method public abstract k(Lcom/zykj/mistake/entity/req/MultiSetTagsReq;)Lq5/e;
    .param p1    # Lcom/zykj/mistake/entity/req/MultiSetTagsReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/MultiSetTagsReq;",
            ")",
            "Lq5/e<",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeBook/MultiSetTagsAsync"
    .end annotation
.end method

.method public abstract l(Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;)Lq5/e;
    .param p1    # Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;",
            ")",
            "Lq5/e<",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/services/app/MistakeBook/AddCustomMistakeQstItemAsync"
    .end annotation
.end method

.method public abstract m(Ljava/lang/String;)Lq5/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "packageName"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lq5/e<",
            "Lcom/zykj/mistake/entity/resp/CameraPermissionResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/api/services/app/StoreAppControl/CanIOpenCameraAsync"
    .end annotation
.end method

.method public abstract n(Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;)Lq5/e;
    .param p1    # Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;",
            ")",
            "Lq5/e<",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/services/app/MistakeBook/UpdatePictureNoteAsync"
    .end annotation
.end method

.method public abstract o(Lcom/zykj/mistake/entity/req/TokenReq;)Lretrofit2/e;
    .param p1    # Lcom/zykj/mistake/entity/req/TokenReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/TokenReq;",
            ")",
            "Lretrofit2/e<",
            "Lcom/zykj/mistake/entity/resp/GeneratorResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/services/app/ObjectStorage/GenerateTokenV2Async"
    .end annotation
.end method

.method public abstract p()Lq5/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq5/e<",
            "Lcom/zykj/mistake/entity/resp/MistakeBookResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "api/services/app/MistakeBook/GetMyMistakeBooksAsync"
    .end annotation
.end method

.method public abstract q(Lcom/zykj/mistake/entity/req/AddPictureNoteReq;)Lq5/e;
    .param p1    # Lcom/zykj/mistake/entity/req/AddPictureNoteReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/AddPictureNoteReq;",
            ")",
            "Lq5/e<",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/services/app/MistakeBook/AddPictureNoteAsync"
    .end annotation
.end method

.method public abstract r(Lcom/zykj/mistake/entity/req/MonitorPictureReq;)Lq5/e;
    .param p1    # Lcom/zykj/mistake/entity/req/MonitorPictureReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/MonitorPictureReq;",
            ")",
            "Lq5/e<",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/services/app/StoreAppControl/RecordPicturesAsync"
    .end annotation
.end method

.method public abstract s(I)Lq5/e;
    .param p1    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "itemId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lq5/e<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetailResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "api/services/app/MistakeBook/GetMistakeQstItemDetailInfoAsync"
    .end annotation
.end method

.method public abstract t(Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;)Lq5/e;
    .param p1    # Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;",
            ")",
            "Lq5/e<",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "api/services/app/MistakeBook/UpdateCustomMistakeQstItemAsync"
    .end annotation
.end method

.method public abstract u()Lq5/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq5/e<",
            "Lcom/zykj/mistake/entity/resp/SubjectResp;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "api/services/app/User/GetMyTopics"
    .end annotation
.end method
