.class public abstract Lcom/zykj/download/work/DownloadFileWork;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/download/work/DownloadFileWork$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/download/work/DownloadFileWork$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final DELAY_TIME:J = 0x3e8L


# instance fields
.field private final appContext:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final appDataBase:Lcom/zykj/download/data/AppDatabase;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public dir:Ljava/lang/String;

.field public downloadUrl:Ljava/lang/String;

.field public fileName:Ljava/lang/String;

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

.field public proxy:Lcom/zykj/download/work/DownloadFileWorkProxy;

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
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/download/work/DownloadFileWork$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/download/work/DownloadFileWork$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/zykj/download/work/DownloadFileWork;->Companion:Lcom/zykj/download/work/DownloadFileWork$a;

    return-void
.end method

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
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->appContext:Landroid/content/Context;

    .line 3
    sget-object p2, Lcom/zykj/download/data/AppDatabase;->n:Lcom/zykj/download/data/AppDatabase$a;

    invoke-virtual {p2, p1}, Lcom/zykj/download/data/AppDatabase$a;->b(Landroid/content/Context;)Lcom/zykj/download/data/AppDatabase;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 4
    new-instance p1, Landroidx/lifecycle/s;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->receiverLengthLiveData:Landroidx/lifecycle/s;

    .line 5
    new-instance p1, Landroidx/lifecycle/s;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->progressLiveData:Landroidx/lifecycle/s;

    return-void
.end method

.method public static final synthetic access$downloadFileWithProgress(Lcom/zykj/download/work/DownloadFileWork;Lq2/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/zykj/download/work/DownloadFileWork;->downloadFileWithProgress(Lq2/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final checkParam()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->downloadUrl:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->dir:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->fileName:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 5
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->NULL_POINT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 6
    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "DownloadFileWork fileName is null"

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    throw v0

    .line 8
    :cond_1
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 9
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->NULL_POINT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 10
    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "DownloadFileWork dir is null"

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    throw v0

    .line 12
    :cond_2
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 13
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->NULL_POINT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 14
    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "DownloadFileWork fileUrl is null"

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    throw v0
.end method

.method static synthetic doWork$suspendImpl(Lcom/zykj/download/work/DownloadFileWork;Lq2/d;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/download/work/DownloadFileWorkProxy;

    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork;->appContext:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getAppDataBase()Lcom/zykj/download/data/AppDatabase;

    move-result-object v2

    invoke-direct {v0, v1, v2, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;-><init>(Landroid/content/Context;Lcom/zykj/download/data/AppDatabase;Lcom/zykj/download/work/DownloadFileWork;)V

    invoke-virtual {p0, v0}, Lcom/zykj/download/work/DownloadFileWork;->setProxy(Lcom/zykj/download/work/DownloadFileWorkProxy;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/download/work/DownloadFileWork;->downloadFileWithProgress(Lq2/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final downloadFileWithProgress(Lq2/d;)Ljava/lang/Object;
    .locals 14
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

    instance-of v0, p1, Lcom/zykj/download/work/DownloadFileWork$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/zykj/download/work/DownloadFileWork$b;

    iget v1, v0, Lcom/zykj/download/work/DownloadFileWork$b;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/zykj/download/work/DownloadFileWork$b;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/zykj/download/work/DownloadFileWork$b;

    invoke-direct {v0, p0, p1}, Lcom/zykj/download/work/DownloadFileWork$b;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lq2/d;)V

    :goto_0
    iget-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$b;->c:Ljava/lang/Object;

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/zykj/download/work/DownloadFileWork$b;->e:I

    const-string v3, "success_key"

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-string v9, "error_key"

    const-string v10, "dataBuilder.build()"

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v2, :cond_6

    if-eq v2, v12, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/zykj/download/work/DownloadFileWork$b;->a:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    :try_start_0
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    .line 2
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_2
    iget-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$b;->b:Ljava/lang/Object;

    check-cast v2, Ljava/io/File;

    iget-object v5, v0, Lcom/zykj/download/work/DownloadFileWork$b;->a:Ljava/lang/Object;

    check-cast v5, Lcom/zykj/download/work/DownloadFileWork;

    :try_start_1
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_5

    :cond_3
    iget-object v0, v0, Lcom/zykj/download/work/DownloadFileWork$b;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_2
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :cond_4
    iget-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$b;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    :try_start_3
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_3
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object p1, v2

    goto :goto_2

    :cond_5
    iget-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$b;->b:Ljava/lang/Object;

    check-cast v2, Ljava/io/File;

    iget-object v13, v0, Lcom/zykj/download/work/DownloadFileWork$b;->a:Ljava/lang/Object;

    check-cast v13, Lcom/zykj/download/work/DownloadFileWork;

    :try_start_4
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_4
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1

    :cond_6
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    :try_start_5
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->initParameter()V

    .line 5
    invoke-direct {p0}, Lcom/zykj/download/work/DownloadFileWork;->checkParam()V

    .line 6
    new-instance v2, Ljava/io/File;

    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDir()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getFileName()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v2, p1, v13}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object p1

    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    move-result-object v13

    iput-object p0, v0, Lcom/zykj/download/work/DownloadFileWork$b;->a:Ljava/lang/Object;

    iput-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$b;->b:Ljava/lang/Object;

    iput v12, v0, Lcom/zykj/download/work/DownloadFileWork$b;->e:I

    invoke-virtual {p1, v13, v2, v0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->checkDownloadSuccess(Ljava/lang/String;Ljava/io/File;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    move-object v13, p0

    .line 8
    :goto_1
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_b

    const-wide/16 v4, 0x0

    const/16 v2, 0x64

    .line 9
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$b;->a:Ljava/lang/Object;

    iput-object v8, v0, Lcom/zykj/download/work/DownloadFileWork$b;->b:Ljava/lang/Object;

    iput v7, v0, Lcom/zykj/download/work/DownloadFileWork$b;->e:I

    invoke-virtual {v13, v4, v5, v2, v0}, Lcom/zykj/download/work/DownloadFileWork;->notifyProgress(JLjava/lang/Integer;Lq2/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    return-object v1

    :cond_8
    :goto_2
    const-wide/16 v4, 0x3e8

    .line 10
    iput-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$b;->a:Ljava/lang/Object;

    iput v6, v0, Lcom/zykj/download/work/DownloadFileWork$b;->e:I

    invoke-static {v4, v5, v0}, Lf3/r0;->a(JLq2/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_9

    return-object v1

    :cond_9
    move-object v0, p1

    :goto_3
    new-array p1, v12, [Lo2/k;

    .line 11
    invoke-static {v3, v0}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v0

    aput-object v0, p1, v11

    .line 12
    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0}, Landroidx/work/a$a;-><init>()V

    const/4 v1, 0x0

    :goto_4
    if-ge v1, v12, :cond_a

    .line 13
    aget-object v2, p1, v1

    .line 14
    invoke-virtual {v2}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 15
    :cond_a
    invoke-virtual {v0}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v10}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->e(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "success(workDataOf(SUCCESS_KEY to localPathForSuccess))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 17
    :cond_b
    sget-object p1, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    iget-object v6, v13, Lcom/zykj/download/work/DownloadFileWork;->appContext:Landroid/content/Context;

    invoke-virtual {p1, v6}, Lcom/zykj/download/OssUtils;->isNetworkConnected(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_c

    .line 18
    new-instance p1, Landroidx/work/a$a;

    invoke-direct {p1}, Landroidx/work/a$a;-><init>()V

    .line 19
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_NO_CONNECT:Lcom/zykj/lib/error/code/ErrorCode;

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    move-result v0

    .line 20
    invoke-virtual {p1, v9, v0}, Landroidx/work/a$a;->e(Ljava/lang/String;I)Landroidx/work/a$a;

    move-result-object p1

    .line 21
    invoke-virtual {p1}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    .line 22
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "failure(\n                    Data.Builder().putInt(\n                        ERROR_KEY,\n                        ErrorCode.NET_NO_CONNECT.errorCodeInfo.code\n                    ).build()\n                )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 23
    :cond_c
    invoke-virtual {v13}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object p1

    invoke-virtual {v13}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    move-result-object v6

    iput-object v13, v0, Lcom/zykj/download/work/DownloadFileWork$b;->a:Ljava/lang/Object;

    iput-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$b;->b:Ljava/lang/Object;

    iput v5, v0, Lcom/zykj/download/work/DownloadFileWork$b;->e:I

    invoke-virtual {p1, v6, v2, v0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->checkRecord(Ljava/lang/String;Ljava/io/File;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_d

    return-object v1

    :cond_d
    move-object v5, v13

    .line 24
    :goto_5
    check-cast p1, Lv1/b;

    .line 25
    invoke-static {}, Lf3/v0;->b()Lf3/e0;

    move-result-object v6

    new-instance v7, Lcom/zykj/download/work/DownloadFileWork$c;

    invoke-direct {v7, v5, p1, v8}, Lcom/zykj/download/work/DownloadFileWork$c;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lv1/b;Lq2/d;)V

    iput-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$b;->a:Ljava/lang/Object;

    iput-object v8, v0, Lcom/zykj/download/work/DownloadFileWork$b;->b:Ljava/lang/Object;

    iput v4, v0, Lcom/zykj/download/work/DownloadFileWork$b;->e:I

    invoke-static {v6, v7, v0}, Lf3/g;->g(Lq2/g;Lx2/p;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    return-object v1

    :cond_e
    move-object v0, v2

    .line 26
    :goto_6
    check-cast p1, Lcom/zykj/http/exception/RemoteCodeException;

    if-eqz p1, :cond_10

    new-array v0, v12, [Lo2/k;

    .line 27
    invoke-virtual {p1}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v9, p1}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object p1

    aput-object p1, v0, v11

    .line 28
    new-instance p1, Landroidx/work/a$a;

    invoke-direct {p1}, Landroidx/work/a$a;-><init>()V

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v12, :cond_f

    .line 29
    aget-object v2, v0, v1

    .line 30
    invoke-virtual {v2}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v3, v2}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 31
    :cond_f
    invoke-virtual {p1}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v10}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "failure(workDataOf(ERROR_KEY to error.errorCodeInfo.code))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_10
    new-array p1, v12, [Lo2/k;

    .line 33
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v0

    aput-object v0, p1, v11

    .line 34
    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0}, Landroidx/work/a$a;-><init>()V

    const/4 v1, 0x0

    :goto_8
    if-ge v1, v12, :cond_11

    .line 35
    aget-object v2, p1, v1

    .line 36
    invoke-virtual {v2}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    .line 37
    :cond_11
    invoke-virtual {v0}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v10}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->e(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "success(workDataOf(SUCCESS_KEY to file.absolutePath))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_5
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    new-array p1, v12, [Lo2/k;

    .line 40
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->DEFAULT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v9, v0}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v0

    aput-object v0, p1, v11

    .line 41
    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0}, Landroidx/work/a$a;-><init>()V

    :goto_9
    if-ge v11, v12, :cond_12

    .line 42
    aget-object v1, p1, v11

    .line 43
    invoke-virtual {v1}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    .line 44
    :cond_12
    invoke-virtual {v0}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v10}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.DEFAULT_ERROR.errorCodeInfo.code))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :catch_0
    move-exception p1

    .line 46
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    new-array v0, v12, [Lo2/k;

    .line 47
    invoke-virtual {p1}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v9, p1}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object p1

    aput-object p1, v0, v11

    .line 48
    new-instance p1, Landroidx/work/a$a;

    invoke-direct {p1}, Landroidx/work/a$a;-><init>()V

    :goto_a
    if-ge v11, v12, :cond_13

    .line 49
    aget-object v1, v0, v11

    .line 50
    invoke-virtual {v1}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v11, v11, 0x1

    goto :goto_a

    .line 51
    :cond_13
    invoke-virtual {p1}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v10}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "failure(workDataOf(ERROR_KEY to e.errorCodeInfo.code))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :catch_1
    move-exception p1

    .line 53
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    new-array v0, v12, [Lo2/k;

    .line 54
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/oss/ServiceException;->getStatusCode()I

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v9, p1}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object p1

    aput-object p1, v0, v11

    .line 55
    new-instance p1, Landroidx/work/a$a;

    invoke-direct {p1}, Landroidx/work/a$a;-><init>()V

    :goto_b
    if-ge v11, v12, :cond_14

    .line 56
    aget-object v1, v0, v11

    .line 57
    invoke-virtual {v1}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v11, v11, 0x1

    goto :goto_b

    .line 58
    :cond_14
    invoke-virtual {p1}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v10}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "failure(workDataOf(ERROR_KEY to e.statusCode))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :catch_2
    move-exception p1

    .line 60
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    new-array p1, v12, [Lo2/k;

    .line 61
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->OSS_CLIENT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v9, v0}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v0

    aput-object v0, p1, v11

    .line 62
    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0}, Landroidx/work/a$a;-><init>()V

    :goto_c
    if-ge v11, v12, :cond_15

    .line 63
    aget-object v1, p1, v11

    .line 64
    invoke-virtual {v1}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v11, v11, 0x1

    goto :goto_c

    .line 65
    :cond_15
    invoke-virtual {v0}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p1

    invoke-static {p1, v10}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-static {p1}, Landroidx/work/ListenableWorker$a;->b(Landroidx/work/a;)Landroidx/work/ListenableWorker$a;

    move-result-object p1

    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.OSS_CLIENT_ERROR.errorCodeInfo.code))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic notifyProgress$default(Lcom/zykj/download/work/DownloadFileWork;JLjava/lang/Integer;Lq2/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/download/work/DownloadFileWork;->notifyProgress(JLjava/lang/Integer;Lq2/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: notifyProgress"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
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

    invoke-static {p0, p1}, Lcom/zykj/download/work/DownloadFileWork;->doWork$suspendImpl(Lcom/zykj/download/work/DownloadFileWork;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract downloadFile(Lv1/b;Lq2/d;)Ljava/lang/Object;
    .param p1    # Lv1/b;
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
            "Lv1/b;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public final getAppDataBase()Lcom/zykj/download/data/AppDatabase;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    return-object v0
.end method

.method public final getDir()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->dir:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "dir"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getDownloadUrl()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->downloadUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "downloadUrl"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->fileName:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "fileName"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
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

    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->progressLiveData:Landroidx/lifecycle/s;

    return-object v0
.end method

.method public final getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->proxy:Lcom/zykj/download/work/DownloadFileWorkProxy;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "proxy"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
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

    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->receiverLengthLiveData:Landroidx/lifecycle/s;

    return-object v0
.end method

.method public abstract initParameter()V
.end method

.method public final notifyProgress(JLjava/lang/Integer;Lq2/d;)Ljava/lang/Object;
    .locals 7
    .param p3    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/Integer;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p4, Lcom/zykj/download/work/DownloadFileWork$d;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/zykj/download/work/DownloadFileWork$d;

    iget v1, v0, Lcom/zykj/download/work/DownloadFileWork$d;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/zykj/download/work/DownloadFileWork$d;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/zykj/download/work/DownloadFileWork$d;

    invoke-direct {v0, p0, p4}, Lcom/zykj/download/work/DownloadFileWork$d;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lq2/d;)V

    :goto_0
    iget-object p4, v0, Lcom/zykj/download/work/DownloadFileWork$d;->c:Ljava/lang/Object;

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/zykj/download/work/DownloadFileWork$d;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lcom/zykj/download/work/DownloadFileWork$d;->b:J

    iget-object p3, v0, Lcom/zykj/download/work/DownloadFileWork$d;->a:Ljava/lang/Object;

    check-cast p3, Lcom/zykj/download/work/DownloadFileWork;

    invoke-static {p4}, Lo2/m;->b(Ljava/lang/Object;)V

    goto :goto_2

    .line 2
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_2
    invoke-static {p4}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/s;

    move-result-object p4

    invoke-virtual {p4, p3}, Landroidx/lifecycle/s;->postValue(Ljava/lang/Object;)V

    const/4 p4, 0x2

    new-array v2, p4, [Lo2/k;

    .line 5
    invoke-static {p1, p2}, Lkotlin/coroutines/jvm/internal/b;->d(J)Ljava/lang/Long;

    move-result-object v4

    const-string v5, "speed"

    invoke-static {v5, v4}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v2, v5

    const-string v4, "progress"

    .line 6
    invoke-static {v4, p3}, Lo2/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Lo2/k;

    move-result-object p3

    aput-object p3, v2, v3

    .line 7
    new-instance p3, Landroidx/work/a$a;

    invoke-direct {p3}, Landroidx/work/a$a;-><init>()V

    :goto_1
    if-ge v5, p4, :cond_3

    .line 8
    aget-object v4, v2, v5

    .line 9
    invoke-virtual {v4}, Lo2/k;->c()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v4}, Lo2/k;->d()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p3, v6, v4}, Landroidx/work/a$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/a$a;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 10
    :cond_3
    invoke-virtual {p3}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object p3

    const-string p4, "dataBuilder.build()"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iput-object p0, v0, Lcom/zykj/download/work/DownloadFileWork$d;->a:Ljava/lang/Object;

    iput-wide p1, v0, Lcom/zykj/download/work/DownloadFileWork$d;->b:J

    iput v3, v0, Lcom/zykj/download/work/DownloadFileWork$d;->e:I

    invoke-virtual {p0, p3, v0}, Landroidx/work/CoroutineWorker;->setProgress(Landroidx/work/a;Lq2/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object p3, p0

    .line 12
    :goto_2
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "speed="

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", progress="

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/s;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 13
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method

.method public final sendSpeedAndProgress(Lf3/h0;Lq2/d;)Ljava/lang/Object;
    .locals 11
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

    instance-of v0, p2, Lcom/zykj/download/work/DownloadFileWork$e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/zykj/download/work/DownloadFileWork$e;

    iget v1, v0, Lcom/zykj/download/work/DownloadFileWork$e;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/zykj/download/work/DownloadFileWork$e;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/zykj/download/work/DownloadFileWork$e;

    invoke-direct {v0, p0, p2}, Lcom/zykj/download/work/DownloadFileWork$e;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lq2/d;)V

    :goto_0
    iget-object p2, v0, Lcom/zykj/download/work/DownloadFileWork$e;->d:Ljava/lang/Object;

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/zykj/download/work/DownloadFileWork$e;->f:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$e;->c:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/w;

    iget-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$e;->b:Ljava/lang/Object;

    check-cast v2, Lf3/h0;

    iget-object v5, v0, Lcom/zykj/download/work/DownloadFileWork$e;->a:Ljava/lang/Object;

    check-cast v5, Lcom/zykj/download/work/DownloadFileWork;

    invoke-static {p2}, Lo2/m;->b(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v2

    goto :goto_1

    .line 2
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_2
    iget-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$e;->c:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/w;

    iget-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$e;->b:Ljava/lang/Object;

    check-cast v2, Lf3/h0;

    iget-object v5, v0, Lcom/zykj/download/work/DownloadFileWork$e;->a:Ljava/lang/Object;

    check-cast v5, Lcom/zykj/download/work/DownloadFileWork;

    invoke-static {p2}, Lo2/m;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p2}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    new-instance p2, Lkotlin/jvm/internal/w;

    invoke-direct {p2}, Lkotlin/jvm/internal/w;-><init>()V

    move-object v5, p0

    .line 5
    :cond_4
    :goto_1
    invoke-static {p1}, Lf3/i0;->b(Lf3/h0;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 6
    invoke-virtual {v5}, Lcom/zykj/download/work/DownloadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/s;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    if-nez v2, :cond_5

    goto :goto_4

    .line 7
    :cond_5
    iget-wide v6, p2, Lkotlin/jvm/internal/w;->a:J

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-nez v10, :cond_6

    goto :goto_2

    .line 8
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-wide v8, p2, Lkotlin/jvm/internal/w;->a:J

    sub-long/2addr v6, v8

    sget-object v8, Lcom/zykj/download/work/DownloadFileWorkProxy;->Companion:Lcom/zykj/download/work/DownloadFileWorkProxy$a;

    invoke-virtual {v8}, Lcom/zykj/download/work/DownloadFileWorkProxy$a;->a()J

    move-result-wide v8

    div-long v8, v6, v8

    .line 9
    :goto_2
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iput-wide v6, p2, Lkotlin/jvm/internal/w;->a:J

    .line 10
    invoke-virtual {v5}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/s;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v5, v0, Lcom/zykj/download/work/DownloadFileWork$e;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$e;->b:Ljava/lang/Object;

    iput-object p2, v0, Lcom/zykj/download/work/DownloadFileWork$e;->c:Ljava/lang/Object;

    iput v4, v0, Lcom/zykj/download/work/DownloadFileWork$e;->f:I

    invoke-virtual {v5, v8, v9, v2, v0}, Lcom/zykj/download/work/DownloadFileWork;->notifyProgress(JLjava/lang/Integer;Lq2/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    return-object v1

    :cond_7
    move-object v2, p1

    move-object p1, p2

    :goto_3
    move-object p2, p1

    move-object p1, v2

    .line 11
    :goto_4
    sget-object v2, Lcom/zykj/download/work/DownloadFileWorkProxy;->Companion:Lcom/zykj/download/work/DownloadFileWorkProxy$a;

    invoke-virtual {v2}, Lcom/zykj/download/work/DownloadFileWorkProxy$a;->a()J

    move-result-wide v6

    iput-object v5, v0, Lcom/zykj/download/work/DownloadFileWork$e;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$e;->b:Ljava/lang/Object;

    iput-object p2, v0, Lcom/zykj/download/work/DownloadFileWork$e;->c:Ljava/lang/Object;

    iput v3, v0, Lcom/zykj/download/work/DownloadFileWork$e;->f:I

    invoke-static {v6, v7, v0}, Lf3/r0;->a(JLq2/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    .line 12
    :cond_8
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method

.method public final setDir(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->dir:Ljava/lang/String;

    return-void
.end method

.method public final setDownloadUrl(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->downloadUrl:Ljava/lang/String;

    return-void
.end method

.method public final setFileName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->fileName:Ljava/lang/String;

    return-void
.end method

.method public final setProxy(Lcom/zykj/download/work/DownloadFileWorkProxy;)V
    .locals 1
    .param p1    # Lcom/zykj/download/work/DownloadFileWorkProxy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->proxy:Lcom/zykj/download/work/DownloadFileWorkProxy;

    return-void
.end method
