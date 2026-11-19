.class public final Lcom/zykj/http/exception/RemoteCodeException;
.super Ljava/io/IOException;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private errorCodeInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/lib/error/code/ErrorCode;)V
    .locals 1
    .param p1    # Lcom/zykj/lib/error/code/ErrorCode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "errorCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

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
    .param p1    # Lcom/zykj/lib/error/code/ErrorCode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "errorCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

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
    .param p1    # Lcom/zykj/lib/error/code/ErrorCodeInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "errorCodeInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

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
    .param p1    # Lcom/zykj/lib/error/code/ErrorCodeInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 8
    iput-object p1, p0, Lcom/zykj/http/exception/RemoteCodeException;->errorCodeInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Lcom/zykj/lib/error/code/ErrorCodeInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/http/exception/RemoteCodeException;->errorCodeInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;

    return-object v0
.end method

.method public final setErrorCodeInfo(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V
    .locals 1
    .param p1    # Lcom/zykj/lib/error/code/ErrorCodeInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/zykj/http/exception/RemoteCodeException;->errorCodeInfo:Lcom/zykj/lib/error/code/ErrorCodeInfo;

    return-void
.end method
