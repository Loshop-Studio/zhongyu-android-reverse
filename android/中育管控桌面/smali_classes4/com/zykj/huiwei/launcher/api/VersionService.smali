.class public interface abstract Lcom/zykj/huiwei/launcher/api/VersionService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000c\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/api/VersionService;",
        "",
        "checkUpdateAsync",
        "Lcom/zykj/http/bean/ApiResp;",
        "Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;",
        "packageName",
        "",
        "version",
        "",
        "appType",
        "Lcom/zykj/huiwei/launcher/bean/AppType;",
        "(Ljava/lang/String;ILcom/zykj/huiwei/launcher/bean/AppType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.method public abstract checkUpdateAsync(Ljava/lang/String;ILcom/zykj/huiwei/launcher/bean/AppType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lc6/t;
            value = "packageName"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lc6/t;
            value = "version"
        .end annotation
    .end param
    .param p3    # Lcom/zykj/huiwei/launcher/bean/AppType;
        .annotation runtime Lc6/t;
            value = "appType"
        .end annotation
    .end param
    .annotation runtime Lc6/f;
        value = "api/services/app/AppStore/CheckUpdateAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lcom/zykj/huiwei/launcher/bean/AppType;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
