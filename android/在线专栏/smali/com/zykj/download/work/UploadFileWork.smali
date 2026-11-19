.class public abstract Lcom/zykj/download/work/UploadFileWork;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final appContext:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final progressLiveData:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final receiverLengthLiveData:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/WorkerParameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 2
    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork;->appContext:Landroid/content/Context;

    .line 3
    new-instance p1, Landroidx/lifecycle/s;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork;->receiverLengthLiveData:Landroidx/lifecycle/s;

    .line 4
    new-instance p1, Landroidx/lifecycle/s;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork;->progressLiveData:Landroidx/lifecycle/s;

    return-void
.end method

.method public static final synthetic access$uploadFileWithProgress(Lcom/zykj/download/work/UploadFileWork;Lq2/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/zykj/download/work/UploadFileWork;->uploadFileWithProgress(Lq2/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic doWork$suspendImpl(Lcom/zykj/download/work/UploadFileWork;Lq2/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork;->appContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/zykj/download/OssUtils;->isNetworkConnected(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p0, 0x1

    new-array p1, p0, [Lo2/k;

    .line 2
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_NO_CONNECT:Lcom/zykj/lib/error/code/ErrorCode;

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "error_key"

    invoke-static {v1, v0}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p1, v1

    .line 3
    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0}, Landroidx/work/a$a;-><init>()V

    :goto_0
    if-ge v1, p0, :cond_0

    .line 4
    aget-object v2, p1, v1

    .line 5
    invoke-virtual {v2}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p0

    const-string p1, "dataBuilder.build()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-static {p0}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p0

    const-string p1, "failure(workDataOf(ERROR_KEY to ErrorCode.NET_NO_CONNECT.errorCodeInfo.code))"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    .line 8
    :cond_1
    invoke-direct {p0, p1}, Lcom/zykj/download/work/UploadFileWork;->uploadFileWithProgress(Lq2/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final uploadFileWithProgress(Lq2/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/d<",
            "-",
            "Landroidx/work/ListenableWorker$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/zykj/download/work/UploadFileWork$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/zykj/download/work/UploadFileWork$b;

    iget v1, v0, Lcom/zykj/download/work/UploadFileWork$b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/zykj/download/work/UploadFileWork$b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/zykj/download/work/UploadFileWork$b;

    invoke-direct {v0, p0, p1}, Lcom/zykj/download/work/UploadFileWork$b;-><init>(Lcom/zykj/download/work/UploadFileWork;Lq2/d;)V

    :goto_0
    iget-object p1, v0, Lcom/zykj/download/work/UploadFileWork$b;->b:Ljava/lang/Object;

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/zykj/download/work/UploadFileWork$b;->d:I

    const-string v3, "error_key"

    const-string v4, "dataBuilder.build()"

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v6, :cond_1

    iget-object v0, v0, Lcom/zykj/download/work/UploadFileWork$b;->a:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/x;

    :try_start_0
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 2
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_2
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    :try_start_1
    invoke-virtual {p0}, Lcom/zykj/download/work/UploadFileWork;->initParameter()V

    .line 5
    new-instance p1, Lkotlin/jvm/internal/x;

    invoke-direct {p1}, Lkotlin/jvm/internal/x;-><init>()V

    .line 6
    invoke-static {}, Lf3/v0;->b()Lf3/e0;

    move-result-object v2

    new-instance v7, Lcom/zykj/download/work/UploadFileWork$c;

    const/4 v8, 0x0

    invoke-direct {v7, p0, p1, v8}, Lcom/zykj/download/work/UploadFileWork$c;-><init>(Lcom/zykj/download/work/UploadFileWork;Lkotlin/jvm/internal/x;Lq2/d;)V

    iput-object p1, v0, Lcom/zykj/download/work/UploadFileWork$b;->a:Ljava/lang/Object;

    iput v6, v0, Lcom/zykj/download/work/UploadFileWork$b;->d:I

    invoke-static {v2, v7, v0}, Lf3/g;->g(Lq2/g;Lx2/p;Lq2/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    new-array p1, v6, [Lo2/k;

    const-string v1, "success_key"

    .line 7
    iget-object v0, v0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    invoke-static {v1, v0}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v0

    aput-object v0, p1, v5

    .line 8
    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0}, Landroidx/work/a$a;-><init>()V

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v6, :cond_4

    .line 9
    aget-object v2, p1, v1

    .line 10
    invoke-virtual {v2}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v2}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v7, v2}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 11
    :cond_4
    invoke-virtual {v0}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->e(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "success(workDataOf(SUCCESS_KEY to successResult))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    new-array p1, v6, [Lo2/k;

    .line 14
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->DEFAULT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3, v0}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v0

    aput-object v0, p1, v5

    .line 15
    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0}, Landroidx/work/a$a;-><init>()V

    :goto_3
    if-ge v5, v6, :cond_5

    .line 16
    aget-object v1, p1, v5

    .line 17
    invoke-virtual {v1}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 18
    :cond_5
    invoke-virtual {v0}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.DEFAULT_ERROR.errorCodeInfo.code))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/NullPointerException;->printStackTrace()V

    new-array p1, v6, [Lo2/k;

    .line 21
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NULL_POINT:Lcom/zykj/lib/error/code/ErrorCode;

    invoke-static {v3, v0}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v0

    aput-object v0, p1, v5

    .line 22
    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0}, Landroidx/work/a$a;-><init>()V

    :goto_4
    if-ge v5, v6, :cond_6

    .line 23
    aget-object v1, p1, v5

    .line 24
    invoke-virtual {v1}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 25
    :cond_6
    invoke-virtual {v0}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.NULL_POINT))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :catch_1
    move-exception p1

    .line 27
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    .line 28
    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 29
    instance-of v0, v0, Ljava/io/FileNotFoundException;

    if-eqz v0, :cond_8

    new-array p1, v6, [Lo2/k;

    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->OSS_CLIENT_FILE_NOT_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3, v0}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v0

    aput-object v0, p1, v5

    .line 30
    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0}, Landroidx/work/a$a;-><init>()V

    :goto_5
    if-ge v5, v6, :cond_7

    .line 31
    aget-object v1, p1, v5

    .line 32
    invoke-virtual {v1}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 33
    :cond_7
    invoke-virtual {v0}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.OSS_CLIENT_FILE_NOT_FOUND.errorCodeInfo.code))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_7

    :cond_8
    new-array v0, v6, [Lo2/k;

    .line 35
    invoke-virtual {p1}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v3, p1}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object p1

    aput-object p1, v0, v5

    .line 36
    new-instance p1, Landroidx/work/a$a;

    invoke-direct {p1}, Landroidx/work/a$a;-><init>()V

    :goto_6
    if-ge v5, v6, :cond_9

    .line 37
    aget-object v1, v0, v5

    .line 38
    invoke-virtual {v1}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    .line 39
    :cond_9
    invoke-virtual {p1}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "failure(workDataOf(ERROR_KEY to e.errorCodeInfo.code))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_7
    return-object p1

    :catch_2
    move-exception p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    new-array v0, v6, [Lo2/k;

    .line 42
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/oss/ServiceException;->getStatusCode()I

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v3, p1}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object p1

    aput-object p1, v0, v5

    .line 43
    new-instance p1, Landroidx/work/a$a;

    invoke-direct {p1}, Landroidx/work/a$a;-><init>()V

    :goto_8
    if-ge v5, v6, :cond_a

    .line 44
    aget-object v1, v0, v5

    .line 45
    invoke-virtual {v1}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    .line 46
    :cond_a
    invoke-virtual {p1}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "failure(workDataOf(ERROR_KEY to e.statusCode))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :catch_3
    move-exception p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 49
    invoke-virtual {p1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 50
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_c

    new-array p1, v6, [Lo2/k;

    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->OSS_CLIENT_SOCKET_TIME_OUT:Lcom/zykj/lib/error/code/ErrorCode;

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3, v0}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v0

    aput-object v0, p1, v5

    .line 51
    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0}, Landroidx/work/a$a;-><init>()V

    :goto_9
    if-ge v5, v6, :cond_b

    .line 52
    aget-object v1, p1, v5

    .line 53
    invoke-virtual {v1}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    .line 54
    :cond_b
    invoke-virtual {v0}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.OSS_CLIENT_SOCKET_TIME_OUT.errorCodeInfo.code))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_b

    :cond_c
    new-array p1, v6, [Lo2/k;

    .line 56
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->OSS_CLIENT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3, v0}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v0

    aput-object v0, p1, v5

    .line 57
    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0}, Landroidx/work/a$a;-><init>()V

    :goto_a
    if-ge v5, v6, :cond_d

    .line 58
    aget-object v1, p1, v5

    .line 59
    invoke-virtual {v1}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    .line 60
    :cond_d
    invoke-virtual {v0}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.OSS_CLIENT_ERROR.errorCodeInfo.code))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_b
    return-object p1
.end method


# virtual methods
.method public doWork(Lq2/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/d<",
            "-",
            "Landroidx/work/ListenableWorker$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1}, Lcom/zykj/download/work/UploadFileWork;->doWork$suspendImpl(Lcom/zykj/download/work/UploadFileWork;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getProgressLiveData()Landroidx/lifecycle/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/download/work/UploadFileWork;->progressLiveData:Landroidx/lifecycle/s;

    return-object v0
.end method

.method public final getReceiverLengthLiveData()Landroidx/lifecycle/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/download/work/UploadFileWork;->receiverLengthLiveData:Landroidx/lifecycle/s;

    return-object v0
.end method

.method public abstract initParameter()V
.end method

.method public final sendSpeedAndProgress(Lf3/h0;Lq2/d;)Ljava/lang/Object;
    .locals 16
    .param p1    # Lf3/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/h0;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p2

    instance-of v1, v0, Lcom/zykj/download/work/UploadFileWork$a;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/zykj/download/work/UploadFileWork$a;

    iget v2, v1, Lcom/zykj/download/work/UploadFileWork$a;->h:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/zykj/download/work/UploadFileWork$a;->h:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/zykj/download/work/UploadFileWork$a;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lcom/zykj/download/work/UploadFileWork$a;-><init>(Lcom/zykj/download/work/UploadFileWork;Lq2/d;)V

    :goto_0
    iget-object v0, v1, Lcom/zykj/download/work/UploadFileWork$a;->f:Ljava/lang/Object;

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v1, Lcom/zykj/download/work/UploadFileWork$a;->h:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v4, v1, Lcom/zykj/download/work/UploadFileWork$a;->c:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/w;

    iget-object v7, v1, Lcom/zykj/download/work/UploadFileWork$a;->b:Ljava/lang/Object;

    check-cast v7, Lf3/h0;

    iget-object v8, v1, Lcom/zykj/download/work/UploadFileWork$a;->a:Ljava/lang/Object;

    check-cast v8, Lcom/zykj/download/work/UploadFileWork;

    invoke-static {v0}, Lo2/m;->b(Ljava/lang/Object;)V

    move-object v9, v4

    move-object v0, v7

    :goto_1
    move-object v11, v8

    goto :goto_2

    .line 2
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_2
    iget-wide v7, v1, Lcom/zykj/download/work/UploadFileWork$a;->e:J

    iget-object v4, v1, Lcom/zykj/download/work/UploadFileWork$a;->d:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Long;

    iget-object v9, v1, Lcom/zykj/download/work/UploadFileWork$a;->c:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/w;

    iget-object v10, v1, Lcom/zykj/download/work/UploadFileWork$a;->b:Ljava/lang/Object;

    check-cast v10, Lf3/h0;

    iget-object v11, v1, Lcom/zykj/download/work/UploadFileWork$a;->a:Ljava/lang/Object;

    check-cast v11, Lcom/zykj/download/work/UploadFileWork;

    invoke-static {v0}, Lo2/m;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    invoke-static {v0}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    new-instance v0, Lkotlin/jvm/internal/w;

    invoke-direct {v0}, Lkotlin/jvm/internal/w;-><init>()V

    move-object v9, v0

    move-object v11, v2

    move-object/from16 v0, p1

    .line 5
    :goto_2
    invoke-static {v0}, Lf3/i0;->b(Lf3/h0;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 6
    invoke-virtual {v11}, Lcom/zykj/download/work/UploadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/s;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    if-nez v4, :cond_4

    move-object v4, v9

    goto/16 :goto_5

    .line 7
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    iget-wide v12, v9, Lkotlin/jvm/internal/w;->a:J

    sub-long/2addr v7, v12

    int-to-long v12, v5

    mul-long v7, v7, v12

    const/16 v10, 0x400

    int-to-long v12, v10

    div-long/2addr v7, v12

    new-array v10, v5, [Lo2/k;

    .line 8
    invoke-static {v7, v8}, Lkotlin/coroutines/jvm/internal/b;->d(J)Ljava/lang/Long;

    move-result-object v12

    const-string v13, "speed"

    invoke-static {v13, v12}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v12

    const/4 v13, 0x0

    aput-object v12, v10, v13

    .line 9
    invoke-virtual {v11}, Lcom/zykj/download/work/UploadFileWork;->getProgressLiveData()Landroidx/lifecycle/s;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v12

    const-string v14, "progress"

    invoke-static {v14, v12}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v12

    aput-object v12, v10, v6

    .line 10
    new-instance v12, Landroidx/work/a$a;

    invoke-direct {v12}, Landroidx/work/a$a;-><init>()V

    :goto_3
    if-ge v13, v5, :cond_5

    .line 11
    aget-object v14, v10, v13

    .line 12
    invoke-virtual {v14}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v14}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v12, v15, v14}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    .line 13
    :cond_5
    invoke-virtual {v12}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object v10

    const-string v12, "dataBuilder.build()"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iput-object v11, v1, Lcom/zykj/download/work/UploadFileWork$a;->a:Ljava/lang/Object;

    iput-object v0, v1, Lcom/zykj/download/work/UploadFileWork$a;->b:Ljava/lang/Object;

    iput-object v9, v1, Lcom/zykj/download/work/UploadFileWork$a;->c:Ljava/lang/Object;

    iput-object v4, v1, Lcom/zykj/download/work/UploadFileWork$a;->d:Ljava/lang/Object;

    iput-wide v7, v1, Lcom/zykj/download/work/UploadFileWork$a;->e:J

    iput v6, v1, Lcom/zykj/download/work/UploadFileWork$a;->h:I

    invoke-virtual {v11, v10, v1}, Landroidx/work/CoroutineWorker;->setProgress(Landroidx/work/a;Lq2/d;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_6

    return-object v3

    :cond_6
    move-object v10, v0

    :goto_4
    const-string v0, "it"

    .line 15
    invoke-static {v4, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iput-wide v12, v9, Lkotlin/jvm/internal/w;->a:J

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "speed="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ", progress="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Lcom/zykj/download/work/UploadFileWork;->getProgressLiveData()Landroidx/lifecycle/s;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v4, 0x20

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v4, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    move-object v4, v9

    move-object v0, v10

    :goto_5
    move-object v8, v11

    const-wide/16 v9, 0x1f4

    .line 17
    iput-object v8, v1, Lcom/zykj/download/work/UploadFileWork$a;->a:Ljava/lang/Object;

    iput-object v0, v1, Lcom/zykj/download/work/UploadFileWork$a;->b:Ljava/lang/Object;

    iput-object v4, v1, Lcom/zykj/download/work/UploadFileWork$a;->c:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v1, Lcom/zykj/download/work/UploadFileWork$a;->d:Ljava/lang/Object;

    iput v5, v1, Lcom/zykj/download/work/UploadFileWork$a;->h:I

    invoke-static {v9, v10, v1}, Lf3/r0;->a(JLq2/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_7

    return-object v3

    :cond_7
    move-object v9, v4

    goto/16 :goto_1

    .line 18
    :cond_8
    sget-object v0, Lo2/r;->a:Lo2/r;

    return-object v0
.end method

.method public abstract uploadFile(Lq2/d;)Ljava/lang/Object;
    .param p1    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
