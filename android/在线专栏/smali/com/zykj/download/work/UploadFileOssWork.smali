.class public Lcom/zykj/download/work/UploadFileOssWork;
.super Lcom/zykj/download/work/UploadFileWork;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/download/work/UploadFileOssWork$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/download/work/UploadFileOssWork$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final fileOkHttpClient:Lokhttp3/OkHttpClient;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final uploadApi:Lcom/zykj/download/api/UploadApi;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final appContext:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private filePath:Ljava/lang/String;

.field private objectName:Ljava/lang/String;

.field private ossToken:Lcom/zykj/download/OssToken;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/zykj/download/work/UploadFileOssWork$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/download/work/UploadFileOssWork$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/zykj/download/work/UploadFileOssWork;->Companion:Lcom/zykj/download/work/UploadFileOssWork$a;

    .line 1
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 2
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 3
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 4
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    .line 5
    sput-object v0, Lcom/zykj/download/work/UploadFileOssWork;->fileOkHttpClient:Lokhttp3/OkHttpClient;

    .line 6
    new-instance v1, Lretrofit2/Retrofit$Builder;

    invoke-direct {v1}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 7
    invoke-virtual {v1, v0}, Lretrofit2/Retrofit$Builder;->client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    .line 8
    sget-object v1, Lcom/zykj/http/BaseUrlEnum;->DEFAULT:Lcom/zykj/http/BaseUrlEnum;

    invoke-virtual {v1}, Lcom/zykj/http/BaseUrlEnum;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    move-result-object v0

    const-class v1, Lcom/zykj/download/api/UploadApi;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Builder()\n            .client(fileOkHttpClient)\n            .baseUrl(BaseUrlEnum.DEFAULT.url)\n            .build().create(UploadApi::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/zykj/download/api/UploadApi;

    sput-object v0, Lcom/zykj/download/work/UploadFileOssWork;->uploadApi:Lcom/zykj/download/api/UploadApi;

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

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/download/work/UploadFileWork;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 2
    iput-object p1, p0, Lcom/zykj/download/work/UploadFileOssWork;->appContext:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(Lcom/zykj/download/work/UploadFileOssWork;Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;JJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/zykj/download/work/UploadFileOssWork;->uploadFile$lambda-1(Lcom/zykj/download/work/UploadFileOssWork;Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;JJ)V

    return-void
.end method

.method private static final uploadFile$lambda-1(Lcom/zykj/download/work/UploadFileOssWork;Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;JJ)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/zykj/download/work/UploadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/s;

    move-result-object p1

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/s;->postValue(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p0}, Lcom/zykj/download/work/UploadFileWork;->getProgressLiveData()Landroidx/lifecycle/s;

    move-result-object p0

    long-to-float p1, p2

    const/high16 p2, 0x42c80000    # 100.0f

    mul-float p1, p1, p2

    long-to-float p2, p4

    div-float/2addr p1, p2

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/s;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic uploadFile$suspendImpl(Lcom/zykj/download/work/UploadFileOssWork;Lq2/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Lcom/zykj/download/work/UploadFileOssWork$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/zykj/download/work/UploadFileOssWork$b;

    iget v1, v0, Lcom/zykj/download/work/UploadFileOssWork$b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/zykj/download/work/UploadFileOssWork$b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/zykj/download/work/UploadFileOssWork$b;

    invoke-direct {v0, p0, p1}, Lcom/zykj/download/work/UploadFileOssWork$b;-><init>(Lcom/zykj/download/work/UploadFileOssWork;Lq2/d;)V

    :goto_0
    move-object v6, v0

    iget-object p1, v6, Lcom/zykj/download/work/UploadFileOssWork$b;->b:Ljava/lang/Object;

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, v6, Lcom/zykj/download/work/UploadFileOssWork$b;->d:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p0, v6, Lcom/zykj/download/work/UploadFileOssWork$b;->a:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 2
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 3
    :cond_2
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    const-string v3, "ossToken"

    const/4 v4, 0x0

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lcom/zykj/download/OssToken;->getEndpoint()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/download/work/UploadFileOssWork;->objectName:Ljava/lang/String;

    const-string v5, "objectName"

    if-eqz v1, :cond_10

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Lcom/zykj/download/OssToken;->getStrategy()Lcom/zykj/download/StrategyEnum;

    move-result-object v1

    sget-object v7, Lcom/zykj/download/StrategyEnum;->ALI_OSS:Lcom/zykj/download/StrategyEnum;

    const-string v8, "filePath"

    if-ne v1, v7, :cond_8

    .line 6
    sget-object v0, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "applicationContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    if-eqz v2, :cond_7

    invoke-virtual {v0, v1, v2}, Lcom/zykj/download/OssUtils;->getOssClient(Landroid/content/Context;Lcom/zykj/download/OssToken;)Lcom/alibaba/sdk/android/oss/OSSClient;

    move-result-object v0

    .line 7
    new-instance v1, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;

    iget-object v2, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/zykj/download/OssToken;->getBucket()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/zykj/download/work/UploadFileOssWork;->objectName:Ljava/lang/String;

    if-eqz v3, :cond_5

    iget-object v5, p0, Lcom/zykj/download/work/UploadFileOssWork;->filePath:Ljava/lang/String;

    if-eqz v5, :cond_4

    invoke-direct {v1, v2, v3, v5}, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    new-instance v2, Lcom/alibaba/sdk/android/oss/model/ObjectMetadata;

    invoke-direct {v2}, Lcom/alibaba/sdk/android/oss/model/ObjectMetadata;-><init>()V

    .line 9
    iget-object v3, p0, Lcom/zykj/download/work/UploadFileOssWork;->filePath:Ljava/lang/String;

    if-eqz v3, :cond_3

    invoke-static {v3}, Lcom/alibaba/sdk/android/oss/common/utils/BinaryUtil;->calculateBase64Md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/alibaba/sdk/android/oss/model/ObjectMetadata;->setContentMD5(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v1, v2}, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;->setMetadata(Lcom/alibaba/sdk/android/oss/model/ObjectMetadata;)V

    .line 11
    new-instance v2, Lcom/zykj/download/work/a;

    invoke-direct {v2, p0}, Lcom/zykj/download/work/a;-><init>(Lcom/zykj/download/work/UploadFileOssWork;)V

    invoke-virtual {v1, v2}, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;->setProgressCallback(Lcom/alibaba/sdk/android/oss/callback/OSSProgressCallback;)V

    .line 12
    invoke-virtual {p0}, Lcom/zykj/download/work/UploadFileWork;->getProgressLiveData()Landroidx/lifecycle/s;

    move-result-object p0

    const/16 v2, 0x64

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroidx/lifecycle/s;->postValue(Ljava/lang/Object;)V

    .line 13
    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/oss/OSSClient;->putObject(Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;)Lcom/alibaba/sdk/android/oss/model/PutObjectResult;

    move-result-object p0

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ETag:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/oss/model/PutObjectResult;->getETag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "  RequestId\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/oss/model/OSSResult;->getRequestId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 15
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_2

    .line 16
    :cond_3
    invoke-static {v8}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v4

    .line 17
    :cond_4
    invoke-static {v8}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v4

    :cond_5
    invoke-static {v5}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v4

    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v4

    .line 18
    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v4

    .line 19
    :cond_8
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lcom/zykj/download/OssToken;->getStrategy()Lcom/zykj/download/StrategyEnum;

    move-result-object v1

    sget-object v5, Lcom/zykj/download/StrategyEnum;->GRID_FS:Lcom/zykj/download/StrategyEnum;

    if-ne v1, v5, :cond_c

    .line 20
    new-instance v1, Ljava/io/File;

    iget-object v5, p0, Lcom/zykj/download/work/UploadFileOssWork;->filePath:Ljava/lang/String;

    if-eqz v5, :cond_b

    invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 21
    sget-object v5, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    const-string v7, "multipart/form-data"

    invoke-virtual {v5, v7}, Lokhttp3/MediaType$Companion;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v5

    .line 22
    new-instance v7, Lcom/zykj/download/work/UploadFileOssWork$c;

    invoke-direct {v7, p0}, Lcom/zykj/download/work/UploadFileOssWork$c;-><init>(Lcom/zykj/download/work/UploadFileOssWork;)V

    .line 23
    invoke-static {v1, v5, v7}, Lcom/zykj/http/progress/ProgressRequestBodyKt;->asProgressRequestBody(Ljava/io/File;Lokhttp3/MediaType;Lcom/zykj/http/listener/UploadProgressListener;)Lcom/zykj/http/progress/ProgressRequestBody;

    move-result-object v5

    .line 24
    sget-object v7, Lokhttp3/MultipartBody$Part;->Companion:Lokhttp3/MultipartBody$Part$Companion;

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v8, "file"

    invoke-virtual {v7, v8, v1, v5}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;

    move-result-object v5

    .line 25
    sget-object v1, Lcom/zykj/download/work/UploadFileOssWork;->uploadApi:Lcom/zykj/download/api/UploadApi;

    .line 26
    iget-object p0, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Lcom/zykj/download/OssToken;->getSecurityToken()Ljava/lang/String;

    move-result-object p0

    const-string v3, "Bearer "

    invoke-static {v3, p0}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 27
    iput-object p1, v6, Lcom/zykj/download/work/UploadFileOssWork$b;->a:Ljava/lang/Object;

    iput v2, v6, Lcom/zykj/download/work/UploadFileOssWork$b;->d:I

    const-string v4, "3f4e17759c6b9c6a364211895bbb2abdc0ba62db"

    move-object v2, p1

    invoke-interface/range {v1 .. v6}, Lcom/zykj/download/api/UploadApi;->gridFs(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lq2/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_9

    return-object v0

    :cond_9
    move-object p0, p1

    :goto_1
    move-object p1, p0

    :goto_2
    return-object p1

    .line 28
    :cond_a
    invoke-static {v3}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v4

    .line 29
    :cond_b
    invoke-static {v8}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v4

    .line 30
    :cond_c
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 31
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NULL_POINT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 32
    new-instance v1, Ljava/lang/NullPointerException;

    iget-object p0, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    if-nez p0, :cond_d

    invoke-static {v3}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v4

    :cond_d
    invoke-virtual {p0}, Lcom/zykj/download/OssToken;->getStrategy()Lcom/zykj/download/StrategyEnum;

    move-result-object p0

    const-string v2, "not support ossToken.strategy = "

    invoke-static {v2, p0}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 33
    invoke-direct {p1, v0, v1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    throw p1

    .line 34
    :cond_e
    invoke-static {v3}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v4

    .line 35
    :cond_f
    invoke-static {v3}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v4

    .line 36
    :cond_10
    invoke-static {v5}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v4

    :cond_11
    invoke-static {v3}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v4
.end method


# virtual methods
.method public initParameter()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/a;

    move-result-object v0

    const-string v1, "oss_object_name"

    invoke-virtual {v0, v1}, Landroidx/work/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    iput-object v0, p0, Lcom/zykj/download/work/UploadFileOssWork;->objectName:Ljava/lang/String;

    .line 2
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/a;

    move-result-object v0

    const-string v1, "file_path"

    invoke-virtual {v0, v1}, Landroidx/work/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    iput-object v0, p0, Lcom/zykj/download/work/UploadFileOssWork;->filePath:Ljava/lang/String;

    .line 3
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

    .line 4
    iput-object v0, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    .line 5
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/zykj/download/work/UploadFileOssWork;->filePath:Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "filePath"

    if-eqz v1, :cond_2

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 8
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->FILE_NO_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 9
    new-instance v4, Ljava/io/FileNotFoundException;

    iget-object v5, p0, Lcom/zykj/download/work/UploadFileOssWork;->filePath:Ljava/lang/String;

    if-nez v5, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v2

    :cond_0
    invoke-direct {v4, v5}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-direct {v0, v1, v4}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    return-void

    .line 11
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    throw v2

    :catch_0
    move-exception v0

    .line 12
    new-instance v1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 13
    sget-object v2, Lcom/zykj/lib/error/code/ErrorCode;->FILE_NO_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 14
    invoke-direct {v1, v2, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    throw v1

    .line 15
    :cond_3
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 16
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->FILE_NO_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 17
    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "UploadFileOssWork ->filePath is not set"

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 18
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    throw v0

    .line 19
    :cond_4
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 20
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->FILE_NO_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 21
    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "UploadFileOssWork ->objectName is not set"

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 22
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public uploadFile(Lq2/d;)Ljava/lang/Object;
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
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1}, Lcom/zykj/download/work/UploadFileOssWork;->uploadFile$suspendImpl(Lcom/zykj/download/work/UploadFileOssWork;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
