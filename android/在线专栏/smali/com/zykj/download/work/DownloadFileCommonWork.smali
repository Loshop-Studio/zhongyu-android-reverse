.class public Lcom/zykj/download/work/DownloadFileCommonWork;
.super Lcom/zykj/download/work/DownloadFileWork;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/download/work/DownloadFileCommonWork$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/download/work/DownloadFileCommonWork$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static downLoadApi:Lcom/zykj/download/api/DownLoadApi;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final okHttpClient:Lokhttp3/OkHttpClient;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/zykj/download/work/DownloadFileCommonWork$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/download/work/DownloadFileCommonWork$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/zykj/download/work/DownloadFileCommonWork;->Companion:Lcom/zykj/download/work/DownloadFileCommonWork$a;

    .line 1
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 2
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 3
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    .line 4
    sput-object v0, Lcom/zykj/download/work/DownloadFileCommonWork;->okHttpClient:Lokhttp3/OkHttpClient;

    .line 5
    new-instance v1, Lretrofit2/Retrofit$Builder;

    invoke-direct {v1}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 6
    invoke-virtual {v1, v0}, Lretrofit2/Retrofit$Builder;->client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    const-string v1, "http://www.zykj.com/"

    .line 7
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    move-result-object v0

    const-class v1, Lcom/zykj/download/api/DownLoadApi;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Builder()\n            .client(okHttpClient)\n            .baseUrl(\"http://www.zykj.com/\")//\u8fd9\u91cc\u4e0d\u91cd\u8981\uff0c\u5728\u8bf7\u6c42\u65f6\uff0c\u4f1a\u88ab\u5b8c\u6574url\u66ff\u6362\u6389\n            .build().create(DownLoadApi::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/zykj/download/api/DownLoadApi;

    sput-object v0, Lcom/zykj/download/work/DownloadFileCommonWork;->downLoadApi:Lcom/zykj/download/api/DownLoadApi;

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
    invoke-direct {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileWork;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "DownloadFileCommonWork"

    .line 2
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    return-void
.end method

.method static synthetic downloadFile$suspendImpl(Lcom/zykj/download/work/DownloadFileCommonWork;Lv1/b;Lq2/d;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/zykj/download/work/DownloadFileCommonWork$b;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;

    iget v3, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->q:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->q:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;

    invoke-direct {v2, v0, v1}, Lcom/zykj/download/work/DownloadFileCommonWork$b;-><init>(Lcom/zykj/download/work/DownloadFileCommonWork;Lq2/d;)V

    :goto_0
    iget-object v1, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->o:Ljava/lang/Object;

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->q:I

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v4, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v3, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->b:Ljava/lang/Object;

    check-cast v3, Ljava/io/Closeable;

    iget-object v2, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->a:Ljava/lang/Object;

    check-cast v2, Lcom/zykj/download/work/DownloadFileCommonWork;

    :try_start_0
    invoke-static {v1}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_e

    .line 2
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_2
    iget-wide v11, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->n:J

    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->m:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->l:Ljava/lang/Object;

    check-cast v4, Ljava/io/Closeable;

    iget-object v8, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->k:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/u;

    iget-object v13, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->j:Ljava/lang/Object;

    check-cast v13, Lkotlin/jvm/internal/w;

    iget-object v14, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->i:Ljava/lang/Object;

    check-cast v14, Lkotlin/jvm/internal/v;

    iget-object v15, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->h:Ljava/lang/Object;

    check-cast v15, Ljava/io/RandomAccessFile;

    iget-object v6, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->g:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Throwable;

    iget-object v10, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->f:Ljava/lang/Object;

    check-cast v10, Ljava/io/Closeable;

    iget-object v5, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->e:Ljava/lang/Object;

    check-cast v5, Ljava/io/InputStream;

    iget-object v7, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->d:Ljava/lang/Object;

    check-cast v7, [B

    iget-object v9, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->c:Ljava/lang/Object;

    check-cast v9, Lretrofit2/Response;

    move-object/from16 p0, v0

    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->b:Ljava/lang/Object;

    check-cast v0, Lv1/b;

    move-object/from16 p1, v0

    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->a:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/download/work/DownloadFileCommonWork;

    :try_start_1
    invoke-static {v1}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v1, p0

    move-object/from16 p0, p1

    move-object/from16 v17, v5

    move-object v5, v2

    move-object v2, v6

    move-object v6, v4

    move-object v4, v0

    move-object/from16 v20, v10

    move-object v10, v7

    move-object v7, v13

    move-wide/from16 v21, v11

    move-object v12, v9

    move-object/from16 v11, v20

    move-object v9, v14

    move-wide/from16 v13, v21

    goto/16 :goto_5

    :catchall_1
    move-exception v0

    move-object v1, v0

    move-object v3, v10

    goto/16 :goto_c

    :cond_3
    iget-wide v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->n:J

    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->e:Ljava/lang/Object;

    check-cast v0, Lokhttp3/ResponseBody;

    iget-object v6, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->d:Ljava/lang/Object;

    check-cast v6, Lretrofit2/Response;

    iget-object v7, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->c:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/w;

    iget-object v8, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->b:Ljava/lang/Object;

    check-cast v8, Lv1/b;

    iget-object v9, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->a:Ljava/lang/Object;

    check-cast v9, Lcom/zykj/download/work/DownloadFileCommonWork;

    invoke-static {v1}, Lo2/m;->b(Ljava/lang/Object;)V

    move-object v1, v9

    const/4 v9, 0x1

    goto/16 :goto_2

    :cond_4
    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->c:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/w;

    iget-object v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->b:Ljava/lang/Object;

    check-cast v4, Lv1/b;

    iget-object v5, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->a:Ljava/lang/Object;

    check-cast v5, Lcom/zykj/download/work/DownloadFileCommonWork;

    invoke-static {v1}, Lo2/m;->b(Ljava/lang/Object;)V

    move-object v7, v0

    move-object v0, v5

    const/4 v9, 0x1

    goto :goto_1

    :cond_5
    invoke-static {v1}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    new-instance v1, Lkotlin/jvm/internal/w;

    invoke-direct {v1}, Lkotlin/jvm/internal/w;-><init>()V

    .line 5
    invoke-virtual/range {p1 .. p1}, Lv1/b;->c()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v9, v4, v6

    if-lez v9, :cond_6

    .line 6
    invoke-virtual/range {p1 .. p1}, Lv1/b;->c()J

    move-result-wide v4

    const-wide/16 v6, 0x1

    sub-long/2addr v4, v6

    iput-wide v4, v1, Lkotlin/jvm/internal/w;->a:J

    .line 7
    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "bytes="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, v1, Lkotlin/jvm/internal/w;->a:J

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v5, 0x2d

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 8
    iget-object v5, v0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    const-string v6, "Content-range="

    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    sget-object v5, Lcom/zykj/download/work/DownloadFileCommonWork;->downLoadApi:Lcom/zykj/download/api/DownLoadApi;

    invoke-virtual/range {p0 .. p0}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    move-result-object v6

    iput-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->a:Ljava/lang/Object;

    move-object/from16 v7, p1

    iput-object v7, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->b:Ljava/lang/Object;

    iput-object v1, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->c:Ljava/lang/Object;

    const/4 v9, 0x1

    iput v9, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->q:I

    invoke-interface {v5, v6, v4, v2}, Lcom/zykj/download/api/DownLoadApi;->download(Ljava/lang/String;Ljava/lang/String;Lq2/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_7

    return-object v3

    :cond_7
    move-object/from16 v20, v7

    move-object v7, v1

    move-object v1, v4

    move-object/from16 v4, v20

    .line 10
    :goto_1
    move-object v6, v1

    check-cast v6, Lretrofit2/Response;

    .line 11
    invoke-virtual {v6}, Lretrofit2/Response;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_11

    .line 12
    invoke-virtual {v6}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 13
    invoke-virtual {v6}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lokhttp3/ResponseBody;

    if-nez v1, :cond_8

    goto/16 :goto_b

    .line 14
    :cond_8
    iget-wide v10, v7, Lkotlin/jvm/internal/w;->a:J

    invoke-virtual {v1}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v12

    add-long/2addr v10, v12

    .line 15
    invoke-virtual {v0}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object v5

    iput-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->a:Ljava/lang/Object;

    iput-object v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->b:Ljava/lang/Object;

    iput-object v7, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->c:Ljava/lang/Object;

    iput-object v6, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->d:Ljava/lang/Object;

    iput-object v1, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->e:Ljava/lang/Object;

    iput-wide v10, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->n:J

    iput v8, v2, Lcom/zykj/download/work/DownloadFileCommonWork$b;->q:I

    invoke-virtual {v5, v4, v10, v11, v2}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateTotalSize(Lv1/b;JLq2/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_9

    return-object v3

    :cond_9
    move-object v8, v4

    move-wide v4, v10

    move-object/from16 v20, v1

    move-object v1, v0

    move-object/from16 v0, v20

    .line 16
    :goto_2
    iget-object v10, v1, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    .line 17
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "download totalLength = "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v12, " url="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 18
    invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v10, 0x800

    new-array v10, v10, [B

    .line 19
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v0

    .line 20
    new-instance v11, Ljava/io/RandomAccessFile;

    invoke-virtual {v8}, Lv1/b;->g()Ljava/lang/String;

    move-result-object v12

    const-string v13, "rwd"

    invoke-direct {v11, v12, v13}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    :try_start_2
    iget-wide v12, v7, Lkotlin/jvm/internal/w;->a:J

    invoke-virtual {v11, v12, v13}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 22
    new-instance v12, Lkotlin/jvm/internal/v;

    invoke-direct {v12}, Lkotlin/jvm/internal/v;-><init>()V

    .line 23
    new-instance v13, Lkotlin/jvm/internal/w;

    invoke-direct {v13}, Lkotlin/jvm/internal/w;-><init>()V

    iget-wide v14, v7, Lkotlin/jvm/internal/w;->a:J

    iput-wide v14, v13, Lkotlin/jvm/internal/w;->a:J

    .line 24
    new-instance v7, Lkotlin/jvm/internal/u;

    invoke-direct {v7}, Lkotlin/jvm/internal/u;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    move-object/from16 p0, v3

    move-object v9, v12

    move-object v15, v13

    move-object v3, v1

    move-wide v13, v4

    move-object v12, v6

    move-object v5, v11

    const/4 v1, 0x0

    move-object v6, v0

    move-object v4, v2

    const/4 v2, 0x0

    move-object v0, v8

    move-object v8, v7

    move-object v7, v6

    .line 25
    :goto_3
    :try_start_3
    invoke-virtual {v7, v10}, Ljava/io/InputStream;->read([B)I

    move-result v16

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v16

    move-wide/from16 v17, v13

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    move-result v13

    .line 26
    iput v13, v9, Lkotlin/jvm/internal/v;->a:I

    const/4 v14, -0x1

    if-ne v13, v14, :cond_a

    const/4 v13, 0x1

    goto :goto_4

    :cond_a
    const/4 v13, 0x0

    .line 27
    :goto_4
    iput-boolean v13, v8, Lkotlin/jvm/internal/u;->a:Z

    .line 28
    sget-object v13, Lo2/r;->a:Lo2/r;

    .line 29
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    move-result v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eq v14, v13, :cond_c

    .line 30
    :try_start_4
    invoke-virtual {v3}, Landroidx/work/ListenableWorker;->isStopped()Z

    move-result v13

    if-nez v13, :cond_c

    .line 31
    iget v13, v9, Lkotlin/jvm/internal/v;->a:I

    const/4 v14, 0x0

    invoke-virtual {v5, v10, v14, v13}, Ljava/io/RandomAccessFile;->write([BII)V

    .line 32
    iget-wide v13, v15, Lkotlin/jvm/internal/w;->a:J

    move-object/from16 v16, v1

    iget v1, v9, Lkotlin/jvm/internal/v;->a:I

    move-object/from16 p1, v8

    move-object/from16 v19, v9

    int-to-long v8, v1

    add-long/2addr v13, v8

    iput-wide v13, v15, Lkotlin/jvm/internal/w;->a:J

    .line 33
    invoke-virtual {v3}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object v1

    iget-wide v8, v15, Lkotlin/jvm/internal/w;->a:J

    iput-object v3, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->a:Ljava/lang/Object;

    iput-object v0, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->b:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->c:Ljava/lang/Object;

    iput-object v10, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->d:Ljava/lang/Object;

    iput-object v7, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->e:Ljava/lang/Object;

    iput-object v11, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->f:Ljava/lang/Object;

    iput-object v2, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->g:Ljava/lang/Object;

    iput-object v5, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->h:Ljava/lang/Object;

    move-object/from16 v13, v19

    iput-object v13, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->i:Ljava/lang/Object;

    iput-object v15, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->j:Ljava/lang/Object;

    move-object/from16 v14, p1

    iput-object v14, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->k:Ljava/lang/Object;

    iput-object v6, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->l:Ljava/lang/Object;

    move-object/from16 v19, v5

    move-object/from16 v5, v16

    iput-object v5, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->m:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    move-object/from16 p1, v10

    move-object/from16 v16, v11

    move-wide/from16 v10, v17

    :try_start_5
    iput-wide v10, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->n:J

    move-object/from16 v17, v7

    const/4 v7, 0x3

    iput v7, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->q:I

    invoke-virtual {v1, v0, v8, v9, v4}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateDownloadSize(Lv1/b;JLq2/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object/from16 v8, p0

    if-ne v1, v8, :cond_b

    return-object v8

    :cond_b
    move-object/from16 p0, v0

    move-object v1, v5

    move-object v9, v13

    move-object v7, v15

    move-object/from16 v15, v19

    move-object v5, v4

    move-object v4, v3

    move-object v3, v8

    move-object v8, v14

    move-wide v13, v10

    move-object/from16 v11, v16

    move-object/from16 v10, p1

    .line 34
    :goto_5
    :try_start_6
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/s;

    move-result-object v0

    move-object/from16 p1, v1

    move-object/from16 v16, v2

    iget-wide v1, v7, Lkotlin/jvm/internal/w;->a:J

    invoke-static {v1, v2}, Lkotlin/coroutines/jvm/internal/b;->d(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/s;->postValue(Ljava/lang/Object;)V

    .line 35
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/s;

    move-result-object v0

    iget-wide v1, v7, Lkotlin/jvm/internal/w;->a:J

    long-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float v1, v1, v2

    long-to-float v2, v13

    div-float/2addr v1, v2

    float-to-int v1, v1

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/s;->postValue(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 p0, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v15

    move-object/from16 v2, v16

    move-object v15, v7

    move-object/from16 v7, v17

    goto/16 :goto_3

    :catchall_2
    move-exception v0

    :goto_6
    move-object v1, v0

    move-object v4, v6

    move-object v3, v11

    goto/16 :goto_c

    :catchall_3
    move-exception v0

    goto :goto_7

    :catchall_4
    move-exception v0

    move-object/from16 v16, v11

    :goto_7
    move-object v1, v0

    move-object v4, v6

    move-object/from16 v3, v16

    goto/16 :goto_c

    :cond_c
    move-object v5, v1

    move-object v14, v8

    move-object/from16 v16, v11

    move-wide/from16 v10, v17

    move-object/from16 v8, p0

    .line 36
    :try_start_7
    invoke-virtual {v3}, Lcom/zykj/download/work/DownloadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/s;

    move-result-object v1

    move-object v9, v8

    iget-wide v7, v15, Lkotlin/jvm/internal/w;->a:J

    invoke-static {v7, v8}, Lkotlin/coroutines/jvm/internal/b;->d(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/lifecycle/s;->postValue(Ljava/lang/Object;)V

    .line 37
    invoke-virtual {v3}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/s;

    move-result-object v1

    iget-wide v7, v15, Lkotlin/jvm/internal/w;->a:J

    long-to-float v7, v7

    const/high16 v8, 0x42c80000    # 100.0f

    mul-float v7, v7, v8

    long-to-float v8, v10

    div-float/2addr v7, v8

    float-to-int v7, v7

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/lifecycle/s;->postValue(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 38
    :try_start_8
    invoke-static {v6, v5}, Lv2/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 39
    iget-boolean v1, v14, Lkotlin/jvm/internal/u;->a:Z

    if-eqz v1, :cond_f

    .line 40
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Lv1/b;->g()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v10, v11, v1}, Lcom/zykj/download/work/DownloadFileCommonWork;->checkContentLength(JLjava/io/File;)V

    .line 41
    invoke-virtual {v0}, Lv1/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/alibaba/sdk/android/oss/common/utils/BinaryUtil;->calculateBase64Md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-virtual {v12}, Lretrofit2/Response;->headers()Lokhttp3/Headers;

    move-result-object v5

    const-string v6, "Content-MD5"

    invoke-virtual {v5, v6}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_d

    goto :goto_8

    :cond_d
    const-string v6, "it"

    .line 43
    invoke-static {v1, v6}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lv1/b;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v1, v6}, Lcom/zykj/download/work/DownloadFileCommonWork;->checkMD5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    :goto_8
    invoke-virtual {v3}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object v5

    iput-object v3, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->a:Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    move-object/from16 v11, v16

    :try_start_9
    iput-object v11, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->b:Ljava/lang/Object;

    iput-object v2, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->c:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->d:Ljava/lang/Object;

    iput-object v6, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->e:Ljava/lang/Object;

    iput-object v6, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->f:Ljava/lang/Object;

    iput-object v6, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->g:Ljava/lang/Object;

    iput-object v6, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->h:Ljava/lang/Object;

    iput-object v6, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->i:Ljava/lang/Object;

    iput-object v6, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->j:Ljava/lang/Object;

    iput-object v6, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->k:Ljava/lang/Object;

    iput-object v6, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->l:Ljava/lang/Object;

    iput-object v6, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->m:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, v4, Lcom/zykj/download/work/DownloadFileCommonWork$b;->q:I

    invoke-virtual {v5, v0, v1, v4}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateVerifyCode(Lv1/b;Ljava/lang/String;Lq2/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_e

    return-object v9

    :cond_e
    move-object v0, v2

    move-object v2, v3

    move-object v3, v11

    :goto_9
    move-object v11, v3

    move-object v3, v2

    move-object v2, v0

    goto :goto_a

    :cond_f
    move-object/from16 v11, v16

    .line 45
    :goto_a
    iget-object v0, v3, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    const-string v1, "download complete url="

    invoke-virtual {v3}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 46
    invoke-static {v11, v2}, Lv2/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 47
    :goto_b
    sget-object v0, Lo2/r;->a:Lo2/r;

    return-object v0

    :catchall_5
    move-exception v0

    move-object/from16 v11, v16

    goto :goto_d

    :catchall_6
    move-exception v0

    move-object/from16 v11, v16

    goto/16 :goto_6

    .line 48
    :goto_c
    :try_start_a
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    :catchall_7
    move-exception v0

    move-object v2, v0

    :try_start_b
    invoke-static {v4, v1}, Lv2/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :catchall_8
    move-exception v0

    :goto_d
    move-object v1, v0

    move-object v3, v11

    .line 49
    :goto_e
    :try_start_c
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    :catchall_9
    move-exception v0

    move-object v2, v0

    invoke-static {v3, v1}, Lv2/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    .line 50
    :cond_10
    iget-object v0, v0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    const-string v1, "download fail response=null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->NET_RESPONSE_NULL:Lcom/zykj/lib/error/code/ErrorCode;

    invoke-direct {v0, v1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    throw v0

    .line 52
    :cond_11
    iget-object v0, v0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    const-string v1, "download fail response="

    invoke-static {v1, v6}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 54
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    invoke-virtual {v6}, Lretrofit2/Response;->code()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/zykj/lib/error/code/ErrorCodeHandler;->getErrorCode(I)Lcom/zykj/lib/error/code/ErrorCode;

    move-result-object v1

    .line 55
    invoke-direct {v0, v1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    throw v0
.end method


# virtual methods
.method public final checkContentLength(JLjava/io/File;)V
    .locals 5
    .param p3    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/zykj/http/exception/RemoteCodeException;
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p3}, Ljava/io/File;->length()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p3}, Ljava/io/File;->delete()Z

    .line 3
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 4
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->FILE_BREAKDOWN:Lcom/zykj/lib/error/code/ErrorCode;

    .line 5
    new-instance v2, Ljava/lang/Exception;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "totalLength = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " ,file.length = "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/io/File;->length()J

    move-result-wide p1

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final checkMD5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/zykj/http/exception/RemoteCodeException;
        }
    .end annotation

    const-string v0, "md5"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileMd5"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localPath"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " net md5 = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ,local md5 = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 4
    new-instance p3, Lcom/zykj/http/exception/RemoteCodeException;

    .line 5
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->FILE_BREAKDOWN:Lcom/zykj/lib/error/code/ErrorCode;

    .line 6
    new-instance v1, Ljava/lang/Exception;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-direct {p3, v0, v1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    throw p3
.end method

.method public downloadFile(Lv1/b;Lq2/d;)Ljava/lang/Object;
    .locals 0
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

    invoke-static {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileCommonWork;->downloadFile$suspendImpl(Lcom/zykj/download/work/DownloadFileCommonWork;Lv1/b;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public initParameter()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/a;

    move-result-object v0

    const-string v1, "file_url"

    invoke-virtual {v0, v1}, Landroidx/work/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/zykj/download/work/DownloadFileWork;->setDownloadUrl(Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "applicationContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/a;

    move-result-object v2

    const-string v3, "file_dir"

    invoke-virtual {v2, v3}, Landroidx/work/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/zykj/download/OssUtils;->checkDownloadDir(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/zykj/download/work/DownloadFileWork;->setDir(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/a;

    move-result-object v1

    const-string v2, "file_name"

    invoke-virtual {v1, v2}, Landroidx/work/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/zykj/download/OssUtils;->checkFileName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/zykj/download/work/DownloadFileWork;->setFileName(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "will download "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/io/File;

    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDir()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getFileName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 5
    :cond_0
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 6
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->FILE_NO_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 7
    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "DownloadOssFileWork ->downloadUrl is not set"

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 8
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    throw v0
.end method
