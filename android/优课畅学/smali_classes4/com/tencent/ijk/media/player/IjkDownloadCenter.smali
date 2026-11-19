.class public final Lcom/tencent/ijk/media/player/IjkDownloadCenter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/ijk/media/player/IjkDownloadCenter$EventHandler;,
        Lcom/tencent/ijk/media/player/IjkDownloadCenter$NativeEvent;,
        Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;
    }
.end annotation


# static fields
.field private static final DC_PROP_LONG_DOWNLOAD_SIZE:I = 0x3eb

.field private static final DC_PROP_LONG_SIZE:I = 0x3ea

.field private static final DC_PROP_LONG_SPEED:I = 0x3ec

.field private static final DC_PROP_STRING_URL:I = 0x3e9

.field private static final MSG_ERROR:I = 0x1f4

.field private static final MSG_FINISH:I = 0x258

.field private static final MSG_PROGRESS:I = 0x384

.field private static final MSG_RESUME:I = 0x64

.field private static final MSG_STOP:I = 0x12c

.field private static final TAG:Ljava/lang/String; = "IjkDownloadCenter"

.field private static instance:Lcom/tencent/ijk/media/player/IjkDownloadCenter; = null

.field private static volatile mIsLibLoaded:Z = false

.field private static final sLocalLibLoader:Lcom/tencent/ijk/media/player/IjkLibLoader;


# instance fields
.field private mEventHandler:Lcom/tencent/ijk/media/player/IjkDownloadCenter$EventHandler;

.field protected mHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mListener:Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/ijk/media/player/IjkDownloadCenter$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/ijk/media/player/IjkDownloadCenter$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->sLocalLibLoader:Lcom/tencent/ijk/media/player/IjkLibLoader;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 7
    sget-object v0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->sLocalLibLoader:Lcom/tencent/ijk/media/player/IjkLibLoader;

    invoke-direct {p0, v0}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;-><init>(Lcom/tencent/ijk/media/player/IjkLibLoader;)V

    return-void
.end method

.method public constructor <init>(Lcom/tencent/ijk/media/player/IjkLibLoader;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->loadLibrariesOnce(Lcom/tencent/ijk/media/player/IjkLibLoader;)V

    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    new-instance v0, Lcom/tencent/ijk/media/player/IjkDownloadCenter$EventHandler;

    invoke-direct {v0, p0, p1}, Lcom/tencent/ijk/media/player/IjkDownloadCenter$EventHandler;-><init>(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mEventHandler:Lcom/tencent/ijk/media/player/IjkDownloadCenter$EventHandler;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mEventHandler:Lcom/tencent/ijk/media/player/IjkDownloadCenter$EventHandler;

    .line 6
    :goto_0
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->native_download_setup(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic access$000(Lcom/tencent/ijk/media/player/IjkDownloadCenter;)Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mListener:Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;

    .line 2
    .line 3
    return-object p0
.end method

.method private native download_get_task_prop_long(II)I
.end method

.method private native download_get_task_prop_string(II)Ljava/lang/String;
.end method

.method public static getInstance()Lcom/tencent/ijk/media/player/IjkDownloadCenter;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->instance:Lcom/tencent/ijk/media/player/IjkDownloadCenter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->instance:Lcom/tencent/ijk/media/player/IjkDownloadCenter;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->instance:Lcom/tencent/ijk/media/player/IjkDownloadCenter;

    .line 13
    .line 14
    return-object v0
.end method

.method private static hlsVerifyForNative(Ljava/lang/Object;ILjava/lang/String;[B)I
    .locals 1
    .annotation build Lcom/tencent/ijk/media/player/annotations/CalledByNative;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;

    .line 12
    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->convertMedia(I)Lcom/tencent/ijk/media/player/IjkDownloadMedia;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mListener:Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;

    .line 21
    .line 22
    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;->hlsKeyVerify(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Lcom/tencent/ijk/media/player/IjkDownloadMedia;Ljava/lang/String;[B)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method public static loadLibrariesOnce(Lcom/tencent/ijk/media/player/IjkLibLoader;)V
    .locals 2

    .line 1
    const-class v0, Lcom/tencent/ijk/media/player/IjkMediaPlayer;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mIsLibLoaded:Z

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->sLocalLibLoader:Lcom/tencent/ijk/media/player/IjkLibLoader;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    const-string v1, "txffmpeg"

    .line 16
    .line 17
    invoke-interface {p0, v1}, Lcom/tencent/ijk/media/player/IjkLibLoader;->loadLibrary(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "txsdl"

    .line 21
    .line 22
    invoke-interface {p0, v1}, Lcom/tencent/ijk/media/player/IjkLibLoader;->loadLibrary(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v1, "txplayer"

    .line 26
    .line 27
    invoke-interface {p0, v1}, Lcom/tencent/ijk/media/player/IjkLibLoader;->loadLibrary(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    sput-boolean p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mIsLibLoaded:Z

    .line 32
    .line 33
    :cond_1
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw p0
.end method

.method private native native_download_free()V
.end method

.method private native native_download_hls_start(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
.end method

.method private native native_download_setup(Ljava/lang/Object;)V
.end method

.method private native native_download_stop(I)V
.end method

.method private static postEventFromNative(Ljava/lang/Object;IIILjava/lang/Object;)V
    .locals 2
    .annotation build Lcom/tencent/ijk/media/player/annotations/CalledByNative;
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;

    .line 11
    .line 12
    if-nez p0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mEventHandler:Lcom/tencent/ijk/media/player/IjkDownloadCenter$EventHandler;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    new-instance v0, Lcom/tencent/ijk/media/player/IjkDownloadCenter$NativeEvent;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1}, Lcom/tencent/ijk/media/player/IjkDownloadCenter$NativeEvent;-><init>(Lcom/tencent/ijk/media/player/IjkDownloadCenter$1;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->convertMedia(I)Lcom/tencent/ijk/media/player/IjkDownloadMedia;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, Lcom/tencent/ijk/media/player/IjkDownloadCenter$NativeEvent;->media:Lcom/tencent/ijk/media/player/IjkDownloadMedia;

    .line 30
    .line 31
    iput p3, v0, Lcom/tencent/ijk/media/player/IjkDownloadCenter$NativeEvent;->error:I

    .line 32
    .line 33
    if-eqz p4, :cond_2

    .line 34
    .line 35
    check-cast p4, Ljava/lang/String;

    .line 36
    .line 37
    iput-object p4, v0, Lcom/tencent/ijk/media/player/IjkDownloadCenter$NativeEvent;->reason:Ljava/lang/String;

    .line 38
    .line 39
    :cond_2
    iget-object p4, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mEventHandler:Lcom/tencent/ijk/media/player/IjkDownloadCenter$EventHandler;

    .line 40
    .line 41
    invoke-virtual {p4, p1, p2, p3, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object p0, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mEventHandler:Lcom/tencent/ijk/media/player/IjkDownloadCenter$EventHandler;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public convertMedia(I)Lcom/tencent/ijk/media/player/IjkDownloadMedia;
    .locals 3

    .line 1
    const/16 v0, 0x3e9

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->download_get_task_prop_string(II)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    new-instance v1, Lcom/tencent/ijk/media/player/IjkDownloadMedia;

    .line 12
    .line 13
    invoke-direct {v1}, Lcom/tencent/ijk/media/player/IjkDownloadMedia;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v2, 0x3ea

    .line 17
    .line 18
    invoke-direct {p0, v2, p1}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->download_get_task_prop_long(II)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iput v2, v1, Lcom/tencent/ijk/media/player/IjkDownloadMedia;->size:I

    .line 23
    .line 24
    const/16 v2, 0x3eb

    .line 25
    .line 26
    invoke-direct {p0, v2, p1}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->download_get_task_prop_long(II)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iput v2, v1, Lcom/tencent/ijk/media/player/IjkDownloadMedia;->downloadSize:I

    .line 31
    .line 32
    const/16 v2, 0x3ec

    .line 33
    .line 34
    invoke-direct {p0, v2, p1}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->download_get_task_prop_long(II)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iput v2, v1, Lcom/tencent/ijk/media/player/IjkDownloadMedia;->speed:I

    .line 39
    .line 40
    iput-object v0, v1, Lcom/tencent/ijk/media/player/IjkDownloadMedia;->url:Ljava/lang/String;

    .line 41
    .line 42
    iput p1, v1, Lcom/tencent/ijk/media/player/IjkDownloadMedia;->tid:I

    .line 43
    .line 44
    return-object v1
.end method

.method public downloadHls(Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mHeaders:Ljava/util/Map;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    const-string v3, "%s: %s"

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mHeaders:Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, "\r\n"

    .line 55
    .line 56
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mHeaders:Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    invoke-direct {p0, p1, p2, v1}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->native_download_hls_start(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    return p1
.end method

.method public finalize()V
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->native_download_free()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 10
    .line 11
    .line 12
    throw v0
.end method

.method public setHeaders(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mHeaders:Ljava/util/Map;

    .line 2
    .line 3
    return-void
.end method

.method public setListener(Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;)Lcom/tencent/ijk/media/player/IjkDownloadCenter;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->mListener:Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public stop(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->native_download_stop(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
