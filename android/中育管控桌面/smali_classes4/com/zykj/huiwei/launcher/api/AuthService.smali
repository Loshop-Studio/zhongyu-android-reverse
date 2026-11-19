.class public interface abstract Lcom/zykj/huiwei/launcher/api/AuthService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0001\u0010\t\u001a\u00020\u00062\u0008\u0008\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u000cJF\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\t\u001a\u00020\u00062\u0008\u0008\u0001\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u00062\u0008\u0008\u0001\u0010\r\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/api/AuthService;",
        "",
        "getToken",
        "Lcom/zykj/http/bean/ApiResp;",
        "Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;",
        "serverUrl",
        "",
        "req",
        "Lcom/zykj/huiwei/launcher/bean/req/LoginReq;",
        "appName",
        "versionCode",
        "",
        "(Ljava/lang/String;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "refreshToken",
        "Lcom/zykj/huiwei/launcher/bean/resp/TokenResp;",
        "authorization",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.method public abstract getToken(Ljava/lang/String;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lc6/y;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/huiwei/launcher/bean/req/LoginReq;
        .annotation runtime Lc6/a;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lc6/i;
            value = "AppName"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lc6/i;
            value = "AppVersion"
        .end annotation
    .end param
    .annotation runtime Lc6/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/zykj/huiwei/launcher/bean/req/LoginReq;",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract refreshToken(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lc6/y;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lc6/i;
            value = "AppName"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lc6/i;
            value = "AppVersion"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lc6/i;
            value = "Authorization"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lc6/i;
            value = "RefreshToken"
        .end annotation
    .end param
    .annotation runtime Lc6/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/resp/TokenResp;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
