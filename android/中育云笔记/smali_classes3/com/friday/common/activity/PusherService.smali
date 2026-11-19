# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class public final Lcom/friday/common/activity/PusherService;
.super Lcom/friday/common/service/BaseLifecycleService;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "WrongConstant"
    }
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final d:Lqc/d;

.field public e:Landroid/media/projection/MediaProjection;

.field public final f:Lqc/d;

.field public g:Ljava/net/DatagramSocket;

.field public h:Landroid/content/Intent;

.field public i:I

.field public j:I

.field public k:I

.field public final l:Ljava/lang/String;

.field public final m:Lqc/d;

.field public n:Z

.field public volatile o:Z

.field public final p:Ljava/util/concurrent/ExecutorService;

.field public volatile q:J

.field public final r:Landroid/media/ImageReader$OnImageAvailableListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/friday/common/service/BaseLifecycleService;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La2/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, La2/a;-><init>(Lcom/friday/common/activity/PusherService;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/friday/common/activity/PusherService;->d:Lqc/d;

    .line 14
    .line 15
    new-instance v0, La2/b;

    .line 16
    .line 17
    invoke-direct {v0}, La2/b;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/friday/common/activity/PusherService;->f:Lqc/d;

    .line 25
    .line 26
    const/16 v0, 0x224e

    .line 27
    .line 28
    iput v0, p0, Lcom/friday/common/activity/PusherService;->i:I

    .line 29
    .line 30
    const/16 v0, 0x8

    .line 31
    .line 32
    iput v0, p0, Lcom/friday/common/activity/PusherService;->j:I

    .line 33
    .line 34
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->k()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lcom/friday/common/activity/PusherService;->l:Ljava/lang/String;

    .line 45
    .line 46
    new-instance v0, La2/c;

    .line 47
    .line 48
    invoke-direct {v0, p0}, La2/c;-><init>(Lcom/friday/common/activity/PusherService;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lcom/friday/common/activity/PusherService;->m:Lqc/d;

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    iput-boolean v0, p0, Lcom/friday/common/activity/PusherService;->n:Z

    .line 59
    .line 60
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/friday/common/activity/PusherService;->p:Ljava/util/concurrent/ExecutorService;

    .line 65
    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    iput-wide v0, p0, Lcom/friday/common/activity/PusherService;->q:J

    .line 71
    .line 72
    new-instance v0, La2/d;

    .line 73
    .line 74
    invoke-direct {v0, p0}, La2/d;-><init>(Lcom/friday/common/activity/PusherService;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Lcom/friday/common/activity/PusherService;->r:Landroid/media/ImageReader$OnImageAvailableListener;

    .line 78
    .line 79
    return-void
.end method

.method public static synthetic b(Lcom/friday/common/activity/PusherService;Landroid/media/ImageReader;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/activity/PusherService;->q(Lcom/friday/common/activity/PusherService;Landroid/media/ImageReader;)V

    return-void
.end method

.method public static synthetic c()Landroid/media/ImageReader;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/common/activity/PusherService;->m()Landroid/media/ImageReader;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lcom/friday/common/activity/PusherService;)Lcom/friday/common/activity/PusherService$a;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/common/activity/PusherService;->o(Lcom/friday/common/activity/PusherService;)Lcom/friday/common/activity/PusherService$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/friday/common/activity/PusherService;Landroid/media/ImageReader;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/activity/PusherService;->r(Lcom/friday/common/activity/PusherService;Landroid/media/ImageReader;)V

    return-void
.end method

.method public static synthetic f(Lcom/friday/common/activity/PusherService;)Landroid/media/projection/MediaProjectionManager;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/common/activity/PusherService;->n(Lcom/friday/common/activity/PusherService;)Landroid/media/projection/MediaProjectionManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/common/activity/PusherService;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/common/activity/PusherService;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final m()Landroid/media/ImageReader;
    .locals 4

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x2

    .line 11
    invoke-static {v0, v1, v2, v3}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "newInstance(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public static final n(Lcom/friday/common/activity/PusherService;)Landroid/media/projection/MediaProjectionManager;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "media_projection"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager"

    .line 12
    .line 13
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast p0, Landroid/media/projection/MediaProjectionManager;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final o(Lcom/friday/common/activity/PusherService;)Lcom/friday/common/activity/PusherService$a;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/common/activity/PusherService$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/friday/common/activity/PusherService$a;-><init>(Lcom/friday/common/activity/PusherService;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final p(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/friday/common/activity/PusherService;->k()Lcom/friday/common/activity/PusherService$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lcom/blankj/utilcode/util/NetworkUtils;->registerNetworkStatusChangedListener(Lcom/blankj/utilcode/util/NetworkUtils$OnNetworkStatusChangedListener;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/activity/PusherService;->k()Lcom/friday/common/activity/PusherService$a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lcom/blankj/utilcode/util/NetworkUtils;->unregisterNetworkStatusChangedListener(Lcom/blankj/utilcode/util/NetworkUtils$OnNetworkStatusChangedListener;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static final q(Lcom/friday/common/activity/PusherService;Landroid/media/ImageReader;)V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-boolean v2, p0, Lcom/friday/common/activity/PusherService;->o:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-boolean v2, p0, Lcom/friday/common/activity/PusherService;->n:Z

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget-wide v2, p0, Lcom/friday/common/activity/PusherService;->q:J

    .line 14
    .line 15
    sub-long/2addr v0, v2

    .line 16
    long-to-float v0, v0

    .line 17
    iget v1, p0, Lcom/friday/common/activity/PusherService;->j:I

    .line 18
    .line 19
    int-to-float v1, v1

    .line 20
    const/high16 v2, 0x447a0000    # 1000.0f

    .line 21
    .line 22
    div-float/2addr v2, v1

    .line 23
    cmpl-float v0, v0, v2

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lcom/friday/common/activity/PusherService;->p:Ljava/util/concurrent/ExecutorService;

    .line 28
    .line 29
    new-instance v1, La2/e;

    .line 30
    .line 31
    invoke-direct {v1, p0, p1}, La2/e;-><init>(Lcom/friday/common/activity/PusherService;Landroid/media/ImageReader;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/media/ImageReader;->acquireLatestImage()Landroid/media/Image;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/media/Image;->close()V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    :cond_1
    return-void

    .line 50
    :catch_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 51
    .line 52
    return-void
.end method

.method public static final r(Lcom/friday/common/activity/PusherService;Landroid/media/ImageReader;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/friday/common/activity/PusherService;->l(Landroid/media/ImageReader;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final h()Landroid/media/ImageReader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/activity/PusherService;->f:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/media/ImageReader;

    .line 8
    .line 9
    return-object v0
.end method

.method public final i(Ljava/lang/String;)I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    :catch_0
    return v0
.end method

.method public final j()Landroid/media/projection/MediaProjectionManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/activity/PusherService;->d:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/media/projection/MediaProjectionManager;

    .line 8
    .line 9
    return-object v0
.end method

.method public final k()Lcom/friday/common/activity/PusherService$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/activity/PusherService;->m:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/common/activity/PusherService$a;

    .line 8
    .line 9
    return-object v0
.end method

# RE I/O 编码位图（Bitmap.compress）。
.method public final declared-synchronized l(Landroid/media/ImageReader;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/media/ImageReader;->acquireLatestImage()Landroid/media/Image;

    .line 5
    .line 6
    .line 7
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Landroid/media/Image;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-virtual {v2}, Landroid/media/Image;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-virtual {v2}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v5, "getPlanes(...)"

    .line 25
    .line 26
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    aget-object v6, v0, v5

    .line 31
    .line 32
    invoke-virtual {v6}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    const-string v7, "getBuffer(...)"

    .line 37
    .line 38
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    aget-object v7, v0, v5

    .line 42
    .line 43
    invoke-virtual {v7}, Landroid/media/Image$Plane;->getPixelStride()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    aget-object v0, v0, v5

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/media/Image$Plane;->getRowStride()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    mul-int v8, v7, v3

    .line 54
    .line 55
    sub-int/2addr v0, v8

    .line 56
    div-int/2addr v0, v7

    .line 57
    add-int/2addr v0, v3

    .line 58
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 59
    .line 60
    invoke-static {v0, v4, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    const-string v0, "createBitmap(...)"

    .line 65
    .line 66
    invoke-static {v7, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7, v6}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 70
    .line 71
    .line 72
    move v6, v5

    .line 73
    :goto_0
    const/4 v8, 0x3

    .line 74
    const/4 v9, 0x1

    .line 75
    if-ge v6, v8, :cond_3

    .line 76
    .line 77
    move v10, v5

    .line 78
    :goto_1
    if-ge v10, v8, :cond_2

    .line 79
    .line 80
    mul-int v0, v6, v3

    .line 81
    .line 82
    div-int/2addr v0, v8

    .line 83
    mul-int v11, v10, v4

    .line 84
    .line 85
    div-int/2addr v11, v8

    .line 86
    div-int/lit8 v12, v3, 0x3

    .line 87
    .line 88
    div-int/lit8 v13, v4, 0x3

    .line 89
    .line 90
    invoke-static {v7, v0, v11, v12, v13}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v11, "createBitmap(...)"

    .line 95
    .line 96
    invoke-static {v0, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    new-instance v11, Ljava/io/ByteArrayOutputStream;

    .line 100
    .line 101
    invoke-direct {v11}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 102
    .line 103
    .line 104
    sget-object v12, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 105
    .line 106
    const/16 v13, 0x1e

    .line 107
    .line 108
    invoke-virtual {v0, v12, v13, v11}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 109
    .line 110
    .line 111
    invoke-virtual {v11}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    array-length v11, v0

    .line 116
    const/16 v12, 0x8

    .line 117
    .line 118
    add-int/2addr v11, v12

    .line 119
    new-array v13, v11, [B

    .line 120
    .line 121
    invoke-static {v9}, Lcom/blankj/utilcode/util/NetworkUtils;->getIPAddress(Z)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    const-string v15, "getIPAddress(...)"

    .line 126
    .line 127
    invoke-static {v14, v15}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const-string v15, "."

    .line 131
    .line 132
    move/from16 p1, v8

    .line 133
    .line 134
    const/4 v8, 0x2

    .line 135
    move/from16 v16, v9

    .line 136
    .line 137
    const/4 v9, 0x0

    .line 138
    invoke-static {v14, v15, v9, v8, v9}, Lqd/c0;->W0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    aput-byte v5, v13, v5

    .line 143
    .line 144
    invoke-virtual {v1, v9}, Lcom/friday/common/activity/PusherService;->i(Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    int-to-byte v9, v9

    .line 149
    aput-byte v9, v13, v16

    .line 150
    .line 151
    iget v9, v1, Lcom/friday/common/activity/PusherService;->k:I

    .line 152
    .line 153
    shr-int/lit8 v14, v9, 0x18

    .line 154
    .line 155
    and-int/lit16 v14, v14, 0xff

    .line 156
    .line 157
    int-to-byte v14, v14

    .line 158
    aput-byte v14, v13, v8

    .line 159
    .line 160
    shr-int/lit8 v8, v9, 0x10

    .line 161
    .line 162
    and-int/lit16 v8, v8, 0xff

    .line 163
    .line 164
    int-to-byte v8, v8

    .line 165
    aput-byte v8, v13, p1

    .line 166
    .line 167
    shr-int/lit8 v8, v9, 0x8

    .line 168
    .line 169
    and-int/lit16 v8, v8, 0xff

    .line 170
    .line 171
    int-to-byte v8, v8

    .line 172
    const/4 v14, 0x4

    .line 173
    aput-byte v8, v13, v14

    .line 174
    .line 175
    and-int/lit16 v8, v9, 0xff

    .line 176
    .line 177
    int-to-byte v8, v8

    .line 178
    const/4 v9, 0x5

    .line 179
    aput-byte v8, v13, v9

    .line 180
    .line 181
    const/4 v8, 0x6

    .line 182
    int-to-byte v9, v6

    .line 183
    aput-byte v9, v13, v8

    .line 184
    .line 185
    const/4 v8, 0x7

    .line 186
    int-to-byte v9, v10

    .line 187
    aput-byte v9, v13, v8

    .line 188
    .line 189
    array-length v8, v0

    .line 190
    invoke-static {v0, v5, v13, v12, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 191
    .line 192
    .line 193
    const v0, 0xfde8

    .line 194
    .line 195
    .line 196
    if-gt v11, v0, :cond_1

    .line 197
    .line 198
    new-instance v0, Ljava/net/DatagramPacket;

    .line 199
    .line 200
    iget-object v8, v1, Lcom/friday/common/activity/PusherService;->l:Ljava/lang/String;

    .line 201
    .line 202
    invoke-static {v8}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    iget v9, v1, Lcom/friday/common/activity/PusherService;->i:I

    .line 207
    .line 208
    invoke-direct {v0, v13, v11, v8, v9}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 209
    .line 210
    .line 211
    const-wide/16 v8, 0xa

    .line 212
    .line 213
    :try_start_2
    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V

    .line 214
    .line 215
    .line 216
    iget-object v8, v1, Lcom/friday/common/activity/PusherService;->g:Ljava/net/DatagramSocket;

    .line 217
    .line 218
    if-eqz v8, :cond_1

    .line 219
    .line 220
    invoke-virtual {v8, v0}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    .line 221
    .line 222
    .line 223
    sget-object v0, Lqc/q;->a:Lqc/q;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :catchall_0
    move-exception v0

    .line 227
    goto :goto_3

    .line 228
    :catch_0
    move-exception v0

    .line 229
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 230
    .line 231
    .line 232
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 233
    .line 234
    :cond_1
    :goto_2
    add-int/lit8 v10, v10, 0x1

    .line 235
    .line 236
    move/from16 v8, p1

    .line 237
    .line 238
    move/from16 v9, v16

    .line 239
    .line 240
    goto/16 :goto_1

    .line 241
    .line 242
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :cond_3
    move/from16 v16, v9

    .line 247
    .line 248
    iget v0, v1, Lcom/friday/common/activity/PusherService;->k:I

    .line 249
    .line 250
    add-int/lit8 v0, v0, 0x1

    .line 251
    .line 252
    iput v0, v1, Lcom/friday/common/activity/PusherService;->k:I

    .line 253
    .line 254
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 255
    .line 256
    .line 257
    move-result-wide v3

    .line 258
    iput-wide v3, v1, Lcom/friday/common/activity/PusherService;->q:J

    .line 259
    .line 260
    invoke-virtual {v2}, Landroid/media/Image;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 261
    .line 262
    .line 263
    monitor-exit p0

    .line 264
    return-void

    .line 265
    :goto_3
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 266
    throw v0
.end method

.method public onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/friday/common/service/BaseLifecycleService;->onCreate()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, v0}, Lcom/friday/common/activity/PusherService;->p(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/friday/common/activity/PusherService;->p(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/friday/common/activity/PusherService;->t()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/friday/common/activity/PusherService;->e:Landroid/media/projection/MediaProjection;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/media/projection/MediaProjection;->stop()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/friday/common/activity/PusherService;->e:Landroid/media/projection/MediaProjection;

    .line 20
    .line 21
    :cond_0
    iput-object v1, p0, Lcom/friday/common/activity/PusherService;->g:Ljava/net/DatagramSocket;

    .line 22
    .line 23
    invoke-super {p0}, Lcom/friday/common/service/BaseLifecycleService;->onDestroy()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 10

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/lifecycle/LifecycleService;->onStartCommand(Landroid/content/Intent;II)I

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/friday/common/activity/PusherService;->e:Landroid/media/projection/MediaProjection;

    .line 5
    .line 6
    const/4 p3, 0x2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    return p3

    .line 10
    :cond_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    return p3

    .line 13
    :cond_1
    const-string p2, "resultIntent"

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Landroid/content/Intent;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/friday/common/activity/PusherService;->h:Landroid/content/Intent;

    .line 22
    .line 23
    const-string p2, "port"

    .line 24
    .line 25
    const/16 v0, 0x224e

    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, Lcom/friday/common/activity/PusherService;->i:I

    .line 32
    .line 33
    iget-object p1, p0, Lcom/friday/common/activity/PusherService;->h:Landroid/content/Intent;

    .line 34
    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 38
    .line 39
    .line 40
    return p3

    .line 41
    :cond_2
    new-instance p1, Ljava/net/DatagramSocket;

    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    invoke-direct {p1, p2}, Ljava/net/DatagramSocket;-><init>(Ljava/net/SocketAddress;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lcom/friday/common/activity/PusherService;->g:Ljava/net/DatagramSocket;

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    invoke-virtual {p1, v0}, Ljava/net/DatagramSocket;->setReuseAddress(Z)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/friday/common/activity/PusherService;->g:Ljava/net/DatagramSocket;

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    new-instance v0, Ljava/net/InetSocketAddress;

    .line 58
    .line 59
    iget v1, p0, Lcom/friday/common/activity/PusherService;->i:I

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/net/InetSocketAddress;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/net/DatagramSocket;->bind(Ljava/net/SocketAddress;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-virtual {p0}, Lcom/friday/common/activity/PusherService;->h()Landroid/media/ImageReader;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object v0, p0, Lcom/friday/common/activity/PusherService;->r:Landroid/media/ImageReader$OnImageAvailableListener;

    .line 72
    .line 73
    invoke-virtual {p1, v0, p2}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/friday/common/activity/PusherService;->j()Landroid/media/projection/MediaProjectionManager;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object p2, p0, Lcom/friday/common/activity/PusherService;->h:Landroid/content/Intent;

    .line 81
    .line 82
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const/4 v0, -0x1

    .line 86
    invoke-virtual {p1, v0, p2}, Landroid/media/projection/MediaProjectionManager;->getMediaProjection(ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iput-object v1, p0, Lcom/friday/common/activity/PusherService;->e:Landroid/media/projection/MediaProjection;

    .line 91
    .line 92
    if-eqz v1, :cond_4

    .line 93
    .line 94
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenWidth()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenHeight()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenDensityDpi()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    invoke-virtual {p0}, Lcom/friday/common/activity/PusherService;->h()Landroid/media/ImageReader;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    const/4 v8, 0x0

    .line 115
    const/4 v9, 0x0

    .line 116
    const-string v2, "mainView"

    .line 117
    .line 118
    const/16 v6, 0x13

    .line 119
    .line 120
    invoke-virtual/range {v1 .. v9}, Landroid/media/projection/MediaProjection;->createVirtualDisplay(Ljava/lang/String;IIIILandroid/view/Surface;Landroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;

    .line 121
    .line 122
    .line 123
    :cond_4
    invoke-virtual {p0}, Lcom/friday/common/activity/PusherService;->s()V

    .line 124
    .line 125
    .line 126
    return p3
.end method

.method public final s()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/friday/common/activity/PusherService;->o:Z

    .line 3
    .line 4
    return-void
.end method

.method public final t()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/friday/common/activity/PusherService;->o:Z

    .line 3
    .line 4
    return-void
.end method
