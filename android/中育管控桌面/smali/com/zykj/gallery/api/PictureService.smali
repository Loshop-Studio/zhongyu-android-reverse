.class public interface abstract Lcom/zykj/gallery/api/PictureService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ$\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u000e\u0008\u0001\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0010J$\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u000e\u0008\u0001\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u000e\u0008\u0001\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0017H\u00a7@\u00a2\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00032\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u001cH\u00a7@\u00a2\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0008\u0008\u0001\u0010\u001f\u001a\u00020 H\u00a7@\u00a2\u0006\u0002\u0010!\u00a8\u0006\"\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/zykj/gallery/api/PictureService;",
        "",
        "getGarryList",
        "Lcom/zykj/http/bean/ApiResp;",
        "Lcom/zykj/gallery/bean/PagedData;",
        "Lcom/zykj/gallery/bean/GalleryImgBean;",
        "skipCount",
        "",
        "maxResultCount",
        "isRecycleBin",
        "",
        "(IIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "moveToRecycleBinAsync",
        "",
        "list",
        "",
        "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "deletePicture",
        "ids",
        "deleteClear",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "receiverPicture",
        "addPicture",
        "Lcom/zykj/gallery/bean/GalleryBody;",
        "(Lcom/zykj/gallery/bean/GalleryBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getGeneratorTokenTypeV2",
        "Lcom/zykj/gallery/oss/OssToken;",
        "req",
        "Lcom/zykj/gallery/oss/TokenReq;",
        "(Lcom/zykj/gallery/oss/TokenReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "recordPicturesAsync",
        "body",
        "Lcom/zykj/gallery/bean/RecordImgBean;",
        "(Lcom/zykj/gallery/bean/RecordImgBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "module_gallery_release"
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
.method public abstract addPicture(Lcom/zykj/gallery/bean/GalleryBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/gallery/bean/GalleryBody;
        .annotation runtime Lc6/a;
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "/api/services/app/PictureLibrary/AddPictureAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/gallery/bean/GalleryBody;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deleteClear(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation runtime Lc6/b;
        value = "/api/services/app/PictureLibrary/EmptyRecycleBinAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deletePicture(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lc6/t;
            value = "ids"
        .end annotation
    .end param
    .annotation runtime Lc6/b;
        value = "/api/services/app/PictureLibrary/DeletePicture"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getGarryList(IIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lc6/t;
            value = "SkipCount"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lc6/t;
            value = "MaxResultCount"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lc6/t;
            value = "IsRecycleBin"
        .end annotation
    .end param
    .annotation runtime Lc6/f;
        value = "/api/services/app/PictureLibrary/GetAllPicturesFromLibrary"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIZ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/gallery/bean/PagedData<",
            "Lcom/zykj/gallery/bean/GalleryImgBean;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getGeneratorTokenTypeV2(Lcom/zykj/gallery/oss/TokenReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/gallery/oss/TokenReq;
        .annotation runtime Lc6/a;
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "/api/services/app/ObjectStorage/GenerateTokenV2Async"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/gallery/oss/TokenReq;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/gallery/oss/OssToken;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract moveToRecycleBinAsync(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lc6/a;
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "/api/services/app/PictureLibrary/MoveToRecycleBinAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract receiverPicture(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lc6/a;
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "/api/services/app/PictureLibrary/RecoverPictureFromRecycleBinAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract recordPicturesAsync(Lcom/zykj/gallery/bean/RecordImgBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/gallery/bean/RecordImgBean;
        .annotation runtime Lc6/a;
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "/api/services/app/StoreAppControl/RecordPicturesAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/gallery/bean/RecordImgBean;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
