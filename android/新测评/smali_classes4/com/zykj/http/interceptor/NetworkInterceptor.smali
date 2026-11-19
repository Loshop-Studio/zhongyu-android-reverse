.class public final Lcom/zykj/http/interceptor/NetworkInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La9/s;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/zykj/http/interceptor/NetworkInterceptor;",
        "La9/s;",
        "<init>",
        "()V",
        "La9/s$a;",
        "chain",
        "La9/y;",
        "intercept",
        "(La9/s$a;)La9/y;",
        "http_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


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
.method public intercept(La9/s$a;)La9/y;
    .locals 1

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isConnected()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, La9/s$a;->a()La9/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p1, v0}, La9/s$a;->b(La9/w;)La9/y;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_NO_CONNECT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 24
    .line 25
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method
