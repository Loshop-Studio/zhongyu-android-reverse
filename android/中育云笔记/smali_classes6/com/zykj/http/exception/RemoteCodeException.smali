.class public final Lcom/zykj/http/exception/RemoteCodeException;
.super Ljava/io/IOException;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private errorCodeInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/error/code/ErrorCode;)V
    .locals 1

    const-string v0, "errorCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/http/exception/RemoteCodeException;->errorCodeInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "errorCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/http/exception/RemoteCodeException;->errorCodeInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V
    .locals 1

    const-string v0, "errorCodeInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/zykj/http/exception/RemoteCodeException;->errorCodeInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;Ljava/lang/String;)V
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 8
    iput-object p1, p0, Lcom/zykj/http/exception/RemoteCodeException;->errorCodeInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    iput-object p1, p0, Lcom/zykj/http/exception/RemoteCodeException;->errorCodeInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;

    return-void
.end method


# virtual methods
.method public final getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/http/exception/RemoteCodeException;->errorCodeInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setErrorCodeInfo(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/http/exception/RemoteCodeException;->errorCodeInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 7
    .line 8
    return-void
.end method
