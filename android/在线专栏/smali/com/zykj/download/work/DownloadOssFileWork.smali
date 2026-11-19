# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public final Lcom/zykj/download/work/DownloadOssFileWork;
.super Lcom/zykj/download/work/DownloadFileCommonWork;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/download/work/DownloadOssFileWork$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/download/work/DownloadOssFileWork$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public ossToken:Lcom/zykj/download/OssToken;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/download/work/DownloadOssFileWork$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/download/work/DownloadOssFileWork$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/zykj/download/work/DownloadOssFileWork;->Companion:Lcom/zykj/download/work/DownloadOssFileWork$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1
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

    invoke-direct {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileCommonWork;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method


# virtual methods
.method public downloadFile(Lv1/b;Lq2/d;)Ljava/lang/Object;
    .locals 12
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

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/lang/SecurityException;,
            Lcom/alibaba/sdk/android/oss/ClientException;,
            Lcom/alibaba/sdk/android/oss/ServiceException;,
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "applicationContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadOssFileWork;->getOssToken()Lcom/zykj/download/OssToken;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/zykj/download/OssUtils;->getOssClient(Landroid/content/Context;Lcom/zykj/download/OssToken;)Lcom/alibaba/sdk/android/oss/OSSClient;

    move-result-object v1

    .line 2
    new-instance v2, Lcom/alibaba/sdk/android/oss/model/GetObjectRequest;

    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadOssFileWork;->getOssToken()Lcom/zykj/download/OssToken;

    move-result-object v3

    invoke-virtual {v3}, Lcom/zykj/download/OssToken;->getBucket()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadOssFileWork;->getOssToken()Lcom/zykj/download/OssToken;

    move-result-object v4

    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lcom/zykj/download/OssUtils;->getObjectKey(Lcom/zykj/download/OssToken;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/alibaba/sdk/android/oss/model/GetObjectRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/alibaba/sdk/android/oss/model/OSSRequest$CRC64Config;->YES:Lcom/alibaba/sdk/android/oss/model/OSSRequest$CRC64Config;

    invoke-virtual {v2, v0}, Lcom/alibaba/sdk/android/oss/model/OSSRequest;->setCRC64(Ljava/lang/Enum;)V

    .line 4
    invoke-virtual {v1, v2}, Lcom/alibaba/sdk/android/oss/OSSClient;->getObject(Lcom/alibaba/sdk/android/oss/model/GetObjectRequest;)Lcom/alibaba/sdk/android/oss/model/GetObjectResult;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/oss/model/GetObjectResult;->getContentLength()J

    move-result-wide v1

    const/16 v3, 0x800

    new-array v3, v3, [B

    .line 6
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-virtual {p1}, Lv1/b;->g()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    const-wide/16 v5, 0x0

    .line 7
    :try_start_0
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/oss/model/GetObjectResult;->getObjectContent()Ljava/io/InputStream;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :goto_0
    const/4 v8, -0x1

    .line 8
    :try_start_1
    invoke-virtual {v7, v3}, Ljava/io/InputStream;->read([B)I

    move-result v9

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v10

    sget-object v11, Lo2/r;->a:Lo2/r;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    if-eq v8, v9, :cond_0

    const/4 v8, 0x0

    .line 9
    invoke-virtual {v4, v3, v8, v10}, Ljava/io/FileOutputStream;->write([BII)V

    int-to-long v8, v10

    add-long/2addr v5, v8

    .line 10
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/s;

    move-result-object v8

    invoke-static {v5, v6}, Lkotlin/coroutines/jvm/internal/b;->d(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/lifecycle/s;->postValue(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/s;

    move-result-object v8

    long-to-float v9, v5

    const/high16 v10, 0x42c80000    # 100.0f

    mul-float v9, v9, v10

    long-to-float v10, v1

    div-float/2addr v9, v10

    float-to-int v9, v9

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/lifecycle/s;->postValue(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 12
    :try_start_2
    invoke-static {v7, v3}, Lv2/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 13
    invoke-static {v4, v3}, Lv2/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 14
    invoke-virtual {p1}, Lv1/b;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/alibaba/sdk/android/oss/common/utils/BinaryUtil;->calculateBase64Md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 15
    new-instance v4, Ljava/io/File;

    invoke-virtual {p1}, Lv1/b;->g()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1, v2, v4}, Lcom/zykj/download/work/DownloadFileCommonWork;->checkContentLength(JLjava/io/File;)V

    .line 16
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/oss/model/GetObjectResult;->getMetadata()Lcom/alibaba/sdk/android/oss/model/ObjectMetadata;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alibaba/sdk/android/oss/model/ObjectMetadata;->getContentMD5()Ljava/lang/String;

    move-result-object v0

    const-string v1, "result.metadata.contentMD5"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lv1/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v3, v1}, Lcom/zykj/download/work/DownloadFileCommonWork;->checkMD5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object v0

    invoke-virtual {v0, p1, v3, p2}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateVerifyCode(Lv1/b;Ljava/lang/String;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object v11

    :catchall_0
    move-exception p1

    .line 18
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-static {v7, p1}, Lv2/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 19
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception p2

    invoke-static {v4, p1}, Lv2/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final getOssToken()Lcom/zykj/download/OssToken;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/download/work/DownloadOssFileWork;->ossToken:Lcom/zykj/download/OssToken;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "ossToken"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public initParameter()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/zykj/download/work/DownloadFileCommonWork;->initParameter()V

    .line 2
    :try_start_0
    sget-object v0, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/a;

    move-result-object v1

    const-string v2, "inputData"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/zykj/download/OssUtils;->getOssToken(Landroidx/work/a;)Lcom/zykj/download/OssToken;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/zykj/download/work/DownloadOssFileWork;->setOssToken(Lcom/zykj/download/OssToken;)V

    return-void

    :catch_0
    move-exception v0

    .line 4
    new-instance v1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 5
    sget-object v2, Lcom/zykj/lib/error/code/ErrorCode;->FILE_NO_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 6
    invoke-direct {v1, v2, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final setOssToken(Lcom/zykj/download/OssToken;)V
    .locals 1
    .param p1    # Lcom/zykj/download/OssToken;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/zykj/download/work/DownloadOssFileWork;->ossToken:Lcom/zykj/download/OssToken;

    return-void
.end method
