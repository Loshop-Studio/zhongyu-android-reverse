.class public final Lcom/zykj/http/interceptor/OfflineModeInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/s;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/zykj/http/interceptor/OfflineModeInterceptor;",
        "Ll8/s;",
        "<init>",
        "()V",
        "Ll8/s$a;",
        "chain",
        "Ll8/y;",
        "intercept",
        "(Ll8/s$a;)Ll8/y;",
        "Lcom/zykj/http/bean/HeaderLiveData;",
        "headerLiveData",
        "Lcom/zykj/http/bean/HeaderLiveData;",
        "getHeaderLiveData",
        "()Lcom/zykj/http/bean/HeaderLiveData;",
        "setHeaderLiveData",
        "(Lcom/zykj/http/bean/HeaderLiveData;)V",
        "http_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public headerLiveData:Lcom/zykj/http/bean/HeaderLiveData;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getHeaderLiveData()Lcom/zykj/http/bean/HeaderLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/http/interceptor/OfflineModeInterceptor;->headerLiveData:Lcom/zykj/http/bean/HeaderLiveData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "headerLiveData"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public intercept(Ll8/s$a;)Ll8/y;
    .locals 1

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/http/interceptor/OfflineModeInterceptor;->getHeaderLiveData()Lcom/zykj/http/bean/HeaderLiveData;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/http/bean/HeaderLiveData;->getOfflineMode()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Boolean;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    :goto_0
    invoke-interface {p1}, Ll8/s$a;->a()Ll8/w;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {p1, v0}, Ll8/s$a;->b(Ll8/w;)Ll8/y;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_1
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 39
    .line 40
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_OFFLINE_MODE:Lcom/zykj/lib/error/code/ErrorCode;

    .line 41
    .line 42
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method public final setHeaderLiveData(Lcom/zykj/http/bean/HeaderLiveData;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/http/interceptor/OfflineModeInterceptor;->headerLiveData:Lcom/zykj/http/bean/HeaderLiveData;

    .line 7
    .line 8
    return-void
.end method
