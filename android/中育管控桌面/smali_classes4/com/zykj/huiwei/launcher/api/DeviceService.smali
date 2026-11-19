.class public interface abstract Lcom/zykj/huiwei/launcher/api/DeviceService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J$\u0010\u0008\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\tj\u0008\u0012\u0004\u0012\u00020\u0006`\n0\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00032\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/api/DeviceService;",
        "",
        "getDeviceState",
        "Lcom/zykj/http/bean/ApiResp;",
        "",
        "id",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getWhiteListApps",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "deviceAuthorized",
        "Ljava/lang/Void;",
        "uploadTrackInfo",
        "",
        "req",
        "Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;",
        "(Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getWhiteIPList",
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
.method public abstract deviceAuthorized(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lc6/t;
            value = "deviceNumber"
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "api/services/app/CrackRecord/AuthorizedAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Void;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getDeviceState(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lc6/t;
            value = "deviceNumber"
        .end annotation
    .end param
    .annotation runtime Lc6/f;
        value = "api/services/app/CrackRecord/GetDeviceStateAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Integer;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getWhiteIPList(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation runtime Lc6/f;
        value = "api/services/app/WebWhiteList/GetAllWhiteIpsAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getWhiteListApps(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation runtime Lc6/f;
        value = "api/services/app/AppStore/GetWhiteListAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract uploadTrackInfo(Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;
        .annotation runtime Lc6/a;
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "api/services/app/CrackRecord/ReportAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
