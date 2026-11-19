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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J%\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/zykj/download/work/DownloadFileCommonWork;",
        "Lcom/zykj/download/work/DownloadFileWork;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "",
        "initParameter",
        "()V",
        "Lw5/b;",
        "entity",
        "downloadFile",
        "(Lw5/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "totalLength",
        "Ljava/io/File;",
        "file",
        "checkContentLength",
        "(JLjava/io/File;)V",
        "",
        "md5",
        "fileMd5",
        "localPath",
        "checkMD5",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "TAG",
        "Ljava/lang/String;",
        "Companion",
        "a",
        "download_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/download/work/DownloadFileCommonWork$a;

.field private static downLoadApi:Lcom/zykj/download/api/DownLoadApi;

.field private static final okHttpClient:Ll8/v;


# instance fields
.field private final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/download/work/DownloadFileCommonWork$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/download/work/DownloadFileCommonWork$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/download/work/DownloadFileCommonWork;->Companion:Lcom/zykj/download/work/DownloadFileCommonWork$a;

    .line 8
    .line 9
    new-instance v0, Ll8/v$a;

    .line 10
    .line 11
    invoke-direct {v0}, Ll8/v$a;-><init>()V

    .line 12
    .line 13
    .line 14
    const-wide/16 v1, 0x2

    .line 15
    .line 16
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2, v3}, Ll8/v$a;->O(JLjava/util/concurrent/TimeUnit;)Ll8/v$a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ll8/v$a;->c()Ll8/v;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/zykj/download/work/DownloadFileCommonWork;->okHttpClient:Ll8/v;

    .line 26
    .line 27
    new-instance v1, Lc9/y$b;

    .line 28
    .line 29
    invoke-direct {v1}, Lc9/y$b;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lc9/y$b;->g(Ll8/v;)Lc9/y$b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "http://www.zykj.com/"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lc9/y$b;->c(Ljava/lang/String;)Lc9/y$b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lc9/y$b;->e()Lc9/y;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-class v1, Lcom/zykj/download/api/DownLoadApi;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lc9/y;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "Builder()\n            .client(okHttpClient)\n            .baseUrl(\"http://www.zykj.com/\")//\u8fd9\u91cc\u4e0d\u91cd\u8981\uff0c\u5728\u8bf7\u6c42\u65f6\uff0c\u4f1a\u88ab\u5b8c\u6574url\u66ff\u6362\u6389\n            .build().create(DownLoadApi::class.java)"

    .line 53
    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    check-cast v0, Lcom/zykj/download/api/DownLoadApi;

    .line 58
    .line 59
    sput-object v0, Lcom/zykj/download/work/DownloadFileCommonWork;->downLoadApi:Lcom/zykj/download/api/DownLoadApi;

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "workerParams"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileWork;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 12
    .line 13
    .line 14
    const-string p1, "DownloadFileCommonWork"

    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic downloadFile$suspendImpl(Lcom/zykj/download/work/DownloadFileCommonWork;Lw5/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;

    iget v3, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->q:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->q:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;

    invoke-direct {v2, v0, v1}, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;-><init>(Lcom/zykj/download/work/DownloadFileCommonWork;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->o:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->q:I

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v4, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v3, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->b:Ljava/lang/Object;

    check-cast v3, Ljava/io/Closeable;

    iget-object v2, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->a:Ljava/lang/Object;

    check-cast v2, Lcom/zykj/download/work/DownloadFileCommonWork;

    :try_start_0
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_d

    .line 2
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_2
    iget-wide v11, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->n:J

    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->m:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->l:Ljava/lang/Object;

    check-cast v4, Ljava/io/Closeable;

    iget-object v8, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->k:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v13, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->j:Ljava/lang/Object;

    check-cast v13, Lkotlin/jvm/internal/Ref$LongRef;

    iget-object v14, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->i:Ljava/lang/Object;

    check-cast v14, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v15, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->h:Ljava/lang/Object;

    check-cast v15, Ljava/io/RandomAccessFile;

    const/high16 p2, 0x42c80000    # 100.0f

    iget-object v5, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->g:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Throwable;

    iget-object v6, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->f:Ljava/lang/Object;

    check-cast v6, Ljava/io/Closeable;

    iget-object v10, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->e:Ljava/lang/Object;

    check-cast v10, Ljava/io/InputStream;

    iget-object v7, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->d:Ljava/lang/Object;

    check-cast v7, [B

    iget-object v9, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    check-cast v9, Lc9/x;

    move-object/from16 p0, v0

    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->b:Ljava/lang/Object;

    check-cast v0, Lw5/b;

    move-object/from16 p1, v0

    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->a:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/download/work/DownloadFileCommonWork;

    :try_start_1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v20, p1

    move-object/from16 p1, p0

    move-object/from16 p0, v20

    move-object/from16 v20, v5

    move-object v5, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v4

    move-object v4, v0

    move-object v0, v13

    move-object v13, v3

    move-object v3, v15

    move-object/from16 v21, v6

    move-object/from16 v6, v20

    move-wide/from16 v22, v11

    move-object/from16 v11, v21

    move-object v12, v10

    move-object v10, v9

    move-object v9, v14

    move-wide/from16 v14, v22

    goto/16 :goto_6

    :catchall_1
    move-exception v0

    move-object v1, v0

    move-object v3, v6

    goto/16 :goto_c

    :cond_3
    const/high16 p2, 0x42c80000    # 100.0f

    iget-wide v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->n:J

    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->e:Ljava/lang/Object;

    check-cast v0, Ll8/z;

    iget-object v6, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->d:Ljava/lang/Object;

    check-cast v6, Lc9/x;

    iget-object v7, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/Ref$LongRef;

    iget-object v8, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->b:Ljava/lang/Object;

    check-cast v8, Lw5/b;

    iget-object v9, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->a:Ljava/lang/Object;

    check-cast v9, Lcom/zykj/download/work/DownloadFileCommonWork;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, v9

    const/4 v9, 0x1

    goto/16 :goto_3

    :cond_4
    const/high16 p2, 0x42c80000    # 100.0f

    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$LongRef;

    iget-object v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->b:Ljava/lang/Object;

    check-cast v4, Lw5/b;

    iget-object v5, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->a:Ljava/lang/Object;

    check-cast v5, Lcom/zykj/download/work/DownloadFileCommonWork;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, v0

    move-object v0, v5

    const/4 v9, 0x1

    goto :goto_2

    :cond_5
    const/high16 p2, 0x42c80000    # 100.0f

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    new-instance v1, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 5
    invoke-virtual/range {p1 .. p1}, Lw5/b;->c()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-lez v4, :cond_6

    .line 6
    invoke-virtual/range {p1 .. p1}, Lw5/b;->c()J

    move-result-wide v4

    const-wide/16 v6, 0x1

    sub-long/2addr v4, v6

    iput-wide v4, v1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 7
    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "bytes="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, v1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v5, 0x2d

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 8
    iget-object v5, v0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    const-string v6, "Content-range="

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    sget-object v5, Lcom/zykj/download/work/DownloadFileCommonWork;->downLoadApi:Lcom/zykj/download/api/DownLoadApi;

    invoke-virtual {v0}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    move-result-object v6

    iput-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->a:Ljava/lang/Object;

    move-object/from16 v7, p1

    iput-object v7, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->b:Ljava/lang/Object;

    iput-object v1, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    const/4 v9, 0x1

    iput v9, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->q:I

    invoke-interface {v5, v6, v4, v2}, Lcom/zykj/download/api/DownLoadApi;->download(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_7

    :goto_1
    move-object v13, v3

    goto/16 :goto_8

    :cond_7
    move-object/from16 v20, v7

    move-object v7, v1

    move-object v1, v4

    move-object/from16 v4, v20

    .line 10
    :goto_2
    move-object v6, v1

    check-cast v6, Lc9/x;

    .line 11
    invoke-virtual {v6}, Lc9/x;->f()Z

    move-result v1

    if-eqz v1, :cond_11

    .line 12
    invoke-virtual {v6}, Lc9/x;->a()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 13
    invoke-virtual {v6}, Lc9/x;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll8/z;

    if-nez v1, :cond_8

    goto/16 :goto_b

    .line 14
    :cond_8
    iget-wide v10, v7, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-virtual {v1}, Ll8/z;->contentLength()J

    move-result-wide v12

    add-long/2addr v10, v12

    .line 15
    invoke-virtual {v0}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object v5

    iput-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->a:Ljava/lang/Object;

    iput-object v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->b:Ljava/lang/Object;

    iput-object v7, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    iput-object v6, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->d:Ljava/lang/Object;

    iput-object v1, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->e:Ljava/lang/Object;

    iput-wide v10, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->n:J

    iput v8, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->q:I

    invoke-virtual {v5, v4, v10, v11, v2}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateTotalSize(Lw5/b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_9

    goto :goto_1

    :cond_9
    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    move-object v8, v4

    move-wide v4, v10

    .line 16
    :goto_3
    iget-object v10, v1, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    .line 17
    invoke-virtual {v1}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    const/16 v10, 0x800

    .line 18
    new-array v10, v10, [B

    .line 19
    invoke-virtual {v0}, Ll8/z;->byteStream()Ljava/io/InputStream;

    move-result-object v0

    .line 20
    new-instance v11, Ljava/io/RandomAccessFile;

    invoke-virtual {v8}, Lw5/b;->g()Ljava/lang/String;

    move-result-object v12

    const-string v13, "rwd"

    invoke-direct {v11, v12, v13}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    :try_start_2
    iget-wide v12, v7, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-virtual {v11, v12, v13}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 22
    new-instance v12, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v12}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 23
    new-instance v13, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v13}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    iget-wide v14, v7, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    iput-wide v14, v13, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 24
    new-instance v7, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-object/from16 v16, v3

    move-object v3, v11

    move-object v9, v12

    move-object v15, v13

    move-object v12, v0

    move-wide v13, v4

    move-object v4, v1

    move-object v5, v2

    move-object v0, v8

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v8, v7

    move-object v7, v10

    move-object v10, v6

    move-object v6, v12

    .line 25
    :goto_4
    :try_start_3
    invoke-virtual {v12, v7}, Ljava/io/InputStream;->read([B)I

    move-result v17

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v17

    move-wide/from16 p0, v13

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    move-result v13

    .line 26
    iput v13, v9, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v14, -0x1

    if-ne v13, v14, :cond_a

    const/4 v13, 0x1

    goto :goto_5

    :cond_a
    const/4 v13, 0x0

    .line 27
    :goto_5
    iput-boolean v13, v8, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 28
    sget-object v13, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    move-result v13

    if-eq v14, v13, :cond_c

    .line 30
    invoke-virtual {v4}, Landroidx/work/ListenableWorker;->isStopped()Z

    move-result v13

    if-nez v13, :cond_c

    .line 31
    iget v13, v9, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v14, 0x0

    invoke-virtual {v3, v7, v14, v13}, Ljava/io/RandomAccessFile;->write([BII)V

    .line 32
    iget-wide v13, v15, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    move-wide/from16 v17, v13

    iget v13, v9, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    int-to-long v13, v13

    add-long v13, v17, v13

    iput-wide v13, v15, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 33
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object v13

    move-object/from16 v17, v13

    iget-wide v13, v15, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    iput-object v4, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->a:Ljava/lang/Object;

    iput-object v0, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->b:Ljava/lang/Object;

    iput-object v10, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    iput-object v7, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->d:Ljava/lang/Object;

    iput-object v12, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->e:Ljava/lang/Object;

    iput-object v11, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->f:Ljava/lang/Object;

    iput-object v2, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->g:Ljava/lang/Object;

    iput-object v3, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->h:Ljava/lang/Object;

    iput-object v9, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->i:Ljava/lang/Object;

    iput-object v15, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->j:Ljava/lang/Object;

    iput-object v8, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->k:Ljava/lang/Object;

    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->l:Ljava/lang/Object;

    iput-object v1, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->m:Ljava/lang/Object;

    move-object/from16 v19, v9

    move-object/from16 v18, v10

    move-wide/from16 v9, p0

    iput-wide v9, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->n:J

    move-object/from16 p0, v3

    const/4 v3, 0x3

    iput v3, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->q:I

    move-object/from16 v3, v17

    invoke-virtual {v3, v0, v13, v14, v5}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateDownloadSize(Lw5/b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v13, v16

    if-ne v3, v13, :cond_b

    goto/16 :goto_8

    :cond_b
    move-object/from16 v3, p0

    move-object/from16 p0, v0

    move-object/from16 p1, v1

    move-object v0, v15

    move-wide v14, v9

    move-object/from16 v10, v18

    move-object/from16 v9, v19

    .line 34
    :goto_6
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    iget-wide v2, v0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v2, v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 35
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    iget-wide v2, v0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    long-to-float v2, v2

    mul-float v2, v2, p2

    long-to-float v3, v14

    div-float/2addr v2, v3

    float-to-int v2, v2

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    move-object/from16 v2, v16

    move-object/from16 v3, v17

    move-object/from16 v16, v13

    move-wide v13, v14

    move-object v15, v0

    move-object/from16 v0, p0

    goto/16 :goto_4

    :catchall_2
    move-exception v0

    move-object v1, v0

    move-object v4, v6

    move-object v3, v11

    goto/16 :goto_c

    :cond_c
    move-object/from16 v18, v10

    move-object/from16 v13, v16

    move-wide/from16 v9, p0

    .line 36
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v3

    move-object/from16 v16, v13

    iget-wide v12, v15, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v12, v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 37
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v3

    iget-wide v12, v15, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    long-to-float v7, v12

    mul-float v7, v7, p2

    long-to-float v12, v9

    div-float/2addr v7, v12

    float-to-int v7, v7

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 38
    :try_start_4
    invoke-static {v6, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 39
    iget-boolean v1, v8, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v1, :cond_f

    .line 40
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Lw5/b;->g()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v9, v10, v1}, Lcom/zykj/download/work/DownloadFileCommonWork;->checkContentLength(JLjava/io/File;)V

    .line 41
    invoke-virtual {v0}, Lw5/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/alibaba/sdk/android/oss/common/utils/BinaryUtil;->calculateBase64Md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-virtual/range {v18 .. v18}, Lc9/x;->e()Ll8/q;

    move-result-object v3

    const-string v6, "Content-MD5"

    invoke-virtual {v3, v6}, Ll8/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_d

    goto :goto_7

    .line 43
    :cond_d
    const-string v6, "it"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lw5/b;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v3, v1, v6}, Lcom/zykj/download/work/DownloadFileCommonWork;->checkMD5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    :goto_7
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    move-result-object v3

    iput-object v4, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->a:Ljava/lang/Object;

    iput-object v11, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->b:Ljava/lang/Object;

    iput-object v2, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->d:Ljava/lang/Object;

    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->e:Ljava/lang/Object;

    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->f:Ljava/lang/Object;

    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->g:Ljava/lang/Object;

    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->h:Ljava/lang/Object;

    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->i:Ljava/lang/Object;

    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->j:Ljava/lang/Object;

    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->k:Ljava/lang/Object;

    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->l:Ljava/lang/Object;

    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->m:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->q:I

    invoke-virtual {v3, v0, v1, v5}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateVerifyCode(Lw5/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move-object/from16 v13, v16

    if-ne v0, v13, :cond_e

    :goto_8
    return-object v13

    :cond_e
    move-object v0, v2

    move-object v2, v4

    move-object v3, v11

    :goto_9
    move-object v4, v2

    move-object v2, v0

    goto :goto_a

    :catchall_3
    move-exception v0

    move-object v1, v0

    move-object v3, v11

    goto :goto_d

    :cond_f
    move-object v3, v11

    .line 45
    :goto_a
    :try_start_5
    iget-object v0, v4, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    const-string v1, "download complete url="

    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 46
    invoke-static {v3, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 47
    :goto_b
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 48
    :goto_c
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    move-exception v0

    :try_start_7
    invoke-static {v4, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 49
    :goto_d
    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :catchall_5
    move-exception v0

    invoke-static {v3, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

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

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 54
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    invoke-virtual {v6}, Lc9/x;->b()I

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
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/zykj/http/exception/RemoteCodeException;
        }
    .end annotation

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Ljava/io/File;->length()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    cmp-long v0, p1, v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p3}, Ljava/io/File;->delete()Z

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 19
    .line 20
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->FILE_BREAKDOWN:Lcom/zykj/lib/error/code/ErrorCode;

    .line 21
    .line 22
    new-instance v2, Ljava/lang/Exception;

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v4, "totalLength = "

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p1, " ,file.length = "

    .line 38
    .line 39
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3}, Ljava/io/File;->length()J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {v2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v0
.end method

.method public final checkMD5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/zykj/http/exception/RemoteCodeException;
        }
    .end annotation

    .line 1
    const-string v0, "md5"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileMd5"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "localPath"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, " net md5 = "

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v3, " ,local md5 = "

    .line 39
    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    new-instance v0, Ljava/io/File;

    .line 54
    .line 55
    invoke-direct {v0, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 59
    .line 60
    .line 61
    new-instance p3, Lcom/zykj/http/exception/RemoteCodeException;

    .line 62
    .line 63
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->FILE_BREAKDOWN:Lcom/zykj/lib/error/code/ErrorCode;

    .line 64
    .line 65
    new-instance v1, Ljava/lang/Exception;

    .line 66
    .line 67
    new-instance v4, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-direct {p3, v0, v1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    throw p3
.end method

.method public downloadFile(Lw5/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw5/b;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileCommonWork;->downloadFile$suspendImpl(Lcom/zykj/download/work/DownloadFileCommonWork;Lw5/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public initParameter()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "file_url"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/zykj/download/work/DownloadFileWork;->setDownloadUrl(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "applicationContext"

    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "file_dir"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v1, v2}, Lcom/zykj/download/OssUtils;->checkDownloadDir(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p0, v1}, Lcom/zykj/download/work/DownloadFileWork;->setDir(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-string v2, "file_name"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v0, v1, v2}, Lcom/zykj/download/OssUtils;->checkFileName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p0, v0}, Lcom/zykj/download/work/DownloadFileWork;->setFileName(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    new-instance v0, Ljava/io/File;

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDir()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getFileName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_0
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 86
    .line 87
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->FILE_NO_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 88
    .line 89
    new-instance v2, Ljava/lang/NullPointerException;

    .line 90
    .line 91
    const-string v3, "DownloadOssFileWork ->downloadUrl is not set"

    .line 92
    .line 93
    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw v0
.end method
