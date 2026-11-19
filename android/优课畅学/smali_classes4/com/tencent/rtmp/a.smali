.class public Lcom/tencent/rtmp/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/basic/b/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rtmp/a$a;
    }
.end annotation


# instance fields
.field private A:J

.field private B:Ljava/lang/String;

.field private C:I

.field private D:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private E:J

.field private F:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioVolumeEvaluationListener;

.field private G:I

.field private H:Lcom/tencent/rtmp/a$a;

.field private I:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;

.field private a:Lcom/tencent/rtmp/ui/TXCloudVideoView;

.field private b:Landroid/view/Surface;

.field private c:I

.field private d:I

.field private e:Lcom/tencent/rtmp/ITXLivePlayListener;

.field private f:Lcom/tencent/rtmp/TXLivePlayConfig;

.field private g:Z

.field private h:Z

.field private i:I

.field private j:I

.field private k:Ljava/lang/String;

.field private l:Z

.field private m:I

.field private n:Lcom/tencent/rtmp/TXLivePlayer$ITXVideoRawDataListener;

.field private o:[B

.field private p:Ljava/lang/Object;

.field private q:Lcom/tencent/rtmp/TXLivePlayer$ITXLivePlayVideoRenderListener;

.field private r:Landroid/content/Context;

.field private s:Landroid/os/Handler;

.field private t:Lcom/tencent/liteav/i;

.field private u:Z

.field private v:F

.field private w:Z

.field private x:I

.field private y:Lcom/tencent/liteav/e;

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/tencent/rtmp/a;->g:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lcom/tencent/rtmp/a;->h:Z

    .line 9
    .line 10
    const-string v2, ""

    .line 11
    .line 12
    iput-object v2, p0, Lcom/tencent/rtmp/a;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/tencent/rtmp/a;->l:Z

    .line 15
    .line 16
    const/16 v2, 0x64

    .line 17
    .line 18
    iput v2, p0, Lcom/tencent/rtmp/a;->m:I

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-object v2, p0, Lcom/tencent/rtmp/a;->n:Lcom/tencent/rtmp/TXLivePlayer$ITXVideoRawDataListener;

    .line 22
    .line 23
    iput-object v2, p0, Lcom/tencent/rtmp/a;->o:[B

    .line 24
    .line 25
    iput-object v2, p0, Lcom/tencent/rtmp/a;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v2, p0, Lcom/tencent/rtmp/a;->q:Lcom/tencent/rtmp/TXLivePlayer$ITXLivePlayVideoRenderListener;

    .line 28
    .line 29
    iput-boolean v1, p0, Lcom/tencent/rtmp/a;->u:Z

    .line 30
    .line 31
    const/high16 v1, 0x3f800000    # 1.0f

    .line 32
    .line 33
    iput v1, p0, Lcom/tencent/rtmp/a;->v:F

    .line 34
    .line 35
    iput-boolean v0, p0, Lcom/tencent/rtmp/a;->w:Z

    .line 36
    .line 37
    iput v0, p0, Lcom/tencent/rtmp/a;->x:I

    .line 38
    .line 39
    const/4 v1, -0x1

    .line 40
    iput v1, p0, Lcom/tencent/rtmp/a;->C:I

    .line 41
    .line 42
    new-instance v1, Ljava/util/Vector;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lcom/tencent/rtmp/a;->D:Ljava/util/Vector;

    .line 48
    .line 49
    const-wide/16 v3, 0x0

    .line 50
    .line 51
    iput-wide v3, p0, Lcom/tencent/rtmp/a;->E:J

    .line 52
    .line 53
    iput-object v2, p0, Lcom/tencent/rtmp/a;->F:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioVolumeEvaluationListener;

    .line 54
    .line 55
    iput v0, p0, Lcom/tencent/rtmp/a;->G:I

    .line 56
    .line 57
    iput-object v2, p0, Lcom/tencent/rtmp/a;->H:Lcom/tencent/rtmp/a$a;

    .line 58
    .line 59
    iput-object v2, p0, Lcom/tencent/rtmp/a;->e:Lcom/tencent/rtmp/ITXLivePlayListener;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lcom/tencent/rtmp/a;->r:Landroid/content/Context;

    .line 66
    .line 67
    invoke-static {p1}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->setAppContext(Landroid/content/Context;)V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lcom/tencent/liteav/basic/log/TXCLog;->init()Z

    .line 71
    .line 72
    .line 73
    new-instance p1, Landroid/os/Handler;

    .line 74
    .line 75
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lcom/tencent/rtmp/a;->s:Landroid/os/Handler;

    .line 83
    .line 84
    iget-object p1, p0, Lcom/tencent/rtmp/a;->r:Landroid/content/Context;

    .line 85
    .line 86
    invoke-static {p1}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->setAppContext(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    invoke-static {}, Lcom/tencent/liteav/basic/log/TXCLog;->init()Z

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public static synthetic a(Lcom/tencent/rtmp/a;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/tencent/rtmp/a;->A:J

    return-wide p1
.end method

.method public static synthetic a(Lcom/tencent/rtmp/a;)Lcom/tencent/liteav/i;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    return-object p0
.end method

.method private a(Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;Landroid/graphics/Bitmap;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 149
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 150
    new-instance v1, Lcom/tencent/rtmp/a$5;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/rtmp/a$5;-><init>(Lcom/tencent/rtmp/a;Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic a(Lcom/tencent/rtmp/a;Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/tencent/rtmp/a;->a(Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/rtmp/a;Z)Z
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/tencent/rtmp/a;->w:Z

    return p1
.end method

.method public static synthetic a(Lcom/tencent/rtmp/a;[B)[B
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/tencent/rtmp/a;->o:[B

    return-object p1
.end method

.method public static synthetic b(Lcom/tencent/rtmp/a;)Lcom/tencent/rtmp/TXLivePlayer$ITXAudioVolumeEvaluationListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/rtmp/a;->F:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioVolumeEvaluationListener;

    return-object p0
.end method

.method public static synthetic c(Lcom/tencent/rtmp/a;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/rtmp/a;->s:Landroid/os/Handler;

    return-object p0
.end method

.method private c(Ljava/lang/String;I)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x6

    if-eq p2, v0, :cond_4

    .line 18
    :try_start_0
    const-string p2, "UTF-8"

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    array-length v1, p2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 20
    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_3

    .line 21
    aget-byte v2, p2, v1

    if-gez v2, :cond_0

    add-int/lit16 v2, v2, 0x100

    :cond_0
    const/16 v3, 0x20

    if-le v2, v3, :cond_2

    const/16 v3, 0x7f

    if-ge v2, v3, :cond_2

    const/16 v3, 0x22

    if-eq v2, v3, :cond_2

    const/16 v3, 0x25

    if-eq v2, v3, :cond_2

    const/16 v3, 0x3c

    if-eq v2, v3, :cond_2

    const/16 v3, 0x3e

    if-eq v2, v3, :cond_2

    const/16 v3, 0x5b

    if-eq v2, v3, :cond_2

    const/16 v3, 0x7d

    if-eq v2, v3, :cond_2

    const/16 v3, 0x5c

    if-eq v2, v3, :cond_2

    const/16 v3, 0x5d

    if-eq v2, v3, :cond_2

    const/16 v3, 0x5e

    if-eq v2, v3, :cond_2

    const/16 v3, 0x60

    if-eq v2, v3, :cond_2

    const/16 v3, 0x7b

    if-eq v2, v3, :cond_2

    const/16 v3, 0x7c

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    int-to-char v2, v2

    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_3

    .line 23
    :cond_2
    :goto_1
    const-string v3, "%%%02X"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 24
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    .line 25
    :goto_3
    const-string v0, "TXLivePlayer"

    const-string v1, "check play url failed."

    invoke-static {v0, v1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    :cond_4
    :goto_4
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic d(Lcom/tencent/rtmp/a;)Lcom/tencent/rtmp/a$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/rtmp/a;->H:Lcom/tencent/rtmp/a$a;

    return-object p0
.end method

.method public static synthetic e(Lcom/tencent/rtmp/a;)Lcom/tencent/rtmp/TXLivePlayer$ITXLivePlayVideoRenderListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/rtmp/a;->q:Lcom/tencent/rtmp/TXLivePlayer$ITXLivePlayVideoRenderListener;

    return-object p0
.end method

.method private f()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_2

    .line 3
    iget v1, p0, Lcom/tencent/rtmp/a;->G:I

    if-lez v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2, v1}, Lcom/tencent/liteav/i;->a(ZI)V

    .line 4
    iget v0, p0, Lcom/tencent/rtmp/a;->G:I

    if-lez v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/tencent/rtmp/a;->H:Lcom/tencent/rtmp/a$a;

    if-nez v0, :cond_1

    .line 6
    new-instance v0, Lcom/tencent/rtmp/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/tencent/rtmp/a$a;-><init>(Lcom/tencent/rtmp/a;Lcom/tencent/rtmp/a$1;)V

    iput-object v0, p0, Lcom/tencent/rtmp/a;->H:Lcom/tencent/rtmp/a$a;

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/tencent/rtmp/a;->H:Lcom/tencent/rtmp/a$a;

    iget v1, p0, Lcom/tencent/rtmp/a;->G:I

    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/a$a;->a(I)V

    .line 8
    iget-object v0, p0, Lcom/tencent/rtmp/a;->s:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 9
    iget-object v1, p0, Lcom/tencent/rtmp/a;->H:Lcom/tencent/rtmp/a$a;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 10
    iget-object v0, p0, Lcom/tencent/rtmp/a;->s:Landroid/os/Handler;

    iget-object v1, p0, Lcom/tencent/rtmp/a;->H:Lcom/tencent/rtmp/a$a;

    iget v2, p0, Lcom/tencent/rtmp/a;->G:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    return-void
.end method

.method public static synthetic f(Lcom/tencent/rtmp/a;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/rtmp/a;->o:[B

    return-object p0
.end method

.method public static synthetic g(Lcom/tencent/rtmp/a;)Lcom/tencent/rtmp/TXLivePlayer$ITXVideoRawDataListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/rtmp/a;->n:Lcom/tencent/rtmp/TXLivePlayer$ITXVideoRawDataListener;

    return-object p0
.end method

.method private g()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1, v1}, Lcom/tencent/liteav/i;->a(ZI)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tencent/rtmp/a;->s:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 5
    iget-object v2, p0, Lcom/tencent/rtmp/a;->H:Lcom/tencent/rtmp/a$a;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/tencent/rtmp/a;->H:Lcom/tencent/rtmp/a$a;

    .line 7
    iput v1, p0, Lcom/tencent/rtmp/a;->G:I

    return-void
.end method

.method private h()Z
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "HUAWEI"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "Che2-TL00"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method


# virtual methods
.method public a(Lcom/tencent/rtmp/TXLivePlayer$ITXLivePlayVideoRenderListener;Ljava/lang/Object;)I
    .locals 3

    .line 127
    const-string v0, "TXLivePlayer"

    if-eqz p2, :cond_0

    .line 128
    instance-of v1, p2, Ljavax/microedition/khronos/egl/EGLContext;

    if-nez v1, :cond_0

    instance-of v1, p2, Landroid/opengl/EGLContext;

    if-nez v1, :cond_0

    .line 129
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setVideoRenderListener error when glContext error "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x1

    return p1

    .line 130
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "liteav_api setVideoRenderListener "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", context "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    iput-object p2, p0, Lcom/tencent/rtmp/a;->p:Ljava/lang/Object;

    .line 132
    iput-object p1, p0, Lcom/tencent/rtmp/a;->q:Lcom/tencent/rtmp/TXLivePlayer$ITXLivePlayVideoRenderListener;

    .line 133
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 134
    new-instance p1, Lcom/tencent/rtmp/a$2;

    invoke-direct {p1, p0}, Lcom/tencent/rtmp/a$2;-><init>(Lcom/tencent/rtmp/a;)V

    sget-object v1, Lcom/tencent/liteav/basic/a/b;->c:Lcom/tencent/liteav/basic/a/b;

    invoke-virtual {v0, p1, v1, p2}, Lcom/tencent/liteav/i;->a(Lcom/tencent/liteav/j;Lcom/tencent/liteav/basic/a/b;Ljava/lang/Object;)V

    goto :goto_0

    .line 135
    :cond_1
    sget-object p1, Lcom/tencent/liteav/basic/a/b;->a:Lcom/tencent/liteav/basic/a/b;

    const/4 p2, 0x0

    invoke-virtual {v0, p2, p1, p2}, Lcom/tencent/liteav/i;->a(Lcom/tencent/liteav/j;Lcom/tencent/liteav/basic/a/b;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public a(Ljava/lang/String;)I
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 110
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->a(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public a(Ljava/lang/String;I)I
    .locals 6

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api startPlay "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v2, -0x1

    if-eqz v0, :cond_0

    .line 37
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "start play error when url is empty "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/tencent/rtmp/a;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_5

    .line 39
    iget-object v0, p0, Lcom/tencent/rtmp/a;->k:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/tencent/rtmp/a;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 40
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "start play error when new url is the same with old url  "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    iget-boolean p1, p0, Lcom/tencent/rtmp/a;->z:Z

    if-eqz p1, :cond_1

    .line 42
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const/16 p2, 0x7d4

    invoke-virtual {p0, p2, p1}, Lcom/tencent/rtmp/a;->onNotifyEvent(ILandroid/os/Bundle;)V

    .line 43
    :cond_1
    iget-boolean p1, p0, Lcom/tencent/rtmp/a;->z:Z

    if-eqz p1, :cond_2

    return v3

    :cond_2
    return v2

    .line 44
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " stop old play when new url is not the same with old url  "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_4

    .line 46
    invoke-virtual {v0, v3}, Lcom/tencent/liteav/i;->a(Z)I

    .line 47
    :cond_4
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/rtmp/a;->k:Ljava/lang/String;

    .line 48
    :cond_5
    iget-object v0, p0, Lcom/tencent/rtmp/a;->r:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->initCrashReport(Landroid/content/Context;)V

    .line 49
    const-string v0, "==========================================================================================================================================================="

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "=====  StartPlay url = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " playType = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " SDKVersion = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->getSDKID()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " , "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->getSDKVersionStr()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "    ======"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    iget v0, p0, Lcom/tencent/rtmp/a;->C:I

    if-eq v0, v2, :cond_6

    if-eq v0, p2, :cond_7

    .line 55
    :cond_6
    iget-object v0, p0, Lcom/tencent/rtmp/a;->r:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/tencent/liteav/k;->a(Landroid/content/Context;I)Lcom/tencent/liteav/i;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    .line 56
    :cond_7
    iput p2, p0, Lcom/tencent/rtmp/a;->C:I

    .line 57
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-nez v0, :cond_8

    const/4 p1, -0x2

    return p1

    .line 58
    :cond_8
    invoke-direct {p0, p1, p2}, Lcom/tencent/rtmp/a;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/rtmp/a;->k:Ljava/lang/String;

    .line 59
    iget-object p1, p0, Lcom/tencent/rtmp/a;->f:Lcom/tencent/rtmp/TXLivePlayConfig;

    invoke-virtual {p0, p1}, Lcom/tencent/rtmp/a;->a(Lcom/tencent/rtmp/TXLivePlayConfig;)V

    .line 60
    iget-object p1, p0, Lcom/tencent/rtmp/a;->a:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    if-eqz p1, :cond_9

    .line 61
    invoke-virtual {p1}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->clearLog()V

    .line 62
    iget-object p1, p0, Lcom/tencent/rtmp/a;->a:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 63
    :cond_9
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    iget-object v0, p0, Lcom/tencent/rtmp/a;->a:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/i;->a(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    .line 64
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    invoke-virtual {p1, p0}, Lcom/tencent/liteav/i;->a(Lcom/tencent/liteav/basic/b/b;)V

    .line 65
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    iget-boolean v0, p0, Lcom/tencent/rtmp/a;->u:Z

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/i;->e(Z)V

    .line 66
    iget-object p1, p0, Lcom/tencent/rtmp/a;->b:Landroid/view/Surface;

    if-eqz p1, :cond_a

    .line 67
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->a(Landroid/view/Surface;)V

    .line 68
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    iget v0, p0, Lcom/tencent/rtmp/a;->c:I

    iget v1, p0, Lcom/tencent/rtmp/a;->d:I

    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/i;->a(II)V

    .line 69
    :cond_a
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    iget-object v0, p0, Lcom/tencent/rtmp/a;->k:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lcom/tencent/liteav/i;->a(Ljava/lang/String;I)I

    .line 70
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    iget-boolean p2, p0, Lcom/tencent/rtmp/a;->l:Z

    invoke-virtual {p1, p2}, Lcom/tencent/liteav/i;->b(Z)V

    .line 71
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    iget p2, p0, Lcom/tencent/rtmp/a;->m:I

    invoke-virtual {p1, p2}, Lcom/tencent/liteav/i;->c(I)V

    .line 72
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    iget p2, p0, Lcom/tencent/rtmp/a;->v:F

    invoke-virtual {p1, p2}, Lcom/tencent/liteav/i;->b(F)V

    .line 73
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    iget p2, p0, Lcom/tencent/rtmp/a;->j:I

    invoke-virtual {p1, p2}, Lcom/tencent/liteav/i;->b(I)V

    .line 74
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    iget p2, p0, Lcom/tencent/rtmp/a;->i:I

    invoke-virtual {p1, p2}, Lcom/tencent/liteav/i;->a(I)V

    .line 75
    iget p1, p0, Lcom/tencent/rtmp/a;->x:I

    invoke-virtual {p0, p1}, Lcom/tencent/rtmp/a;->d(I)V

    .line 76
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    iget-object p2, p0, Lcom/tencent/rtmp/a;->I:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;

    invoke-virtual {p1, p2}, Lcom/tencent/liteav/i;->a(Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;)V

    .line 77
    iget-object p1, p0, Lcom/tencent/rtmp/a;->n:Lcom/tencent/rtmp/TXLivePlayer$ITXVideoRawDataListener;

    if-eqz p1, :cond_b

    invoke-virtual {p0, p1}, Lcom/tencent/rtmp/a;->a(Lcom/tencent/rtmp/TXLivePlayer$ITXVideoRawDataListener;)V

    .line 78
    :cond_b
    iget-object p1, p0, Lcom/tencent/rtmp/a;->q:Lcom/tencent/rtmp/TXLivePlayer$ITXLivePlayVideoRenderListener;

    if-eqz p1, :cond_c

    iget-object p2, p0, Lcom/tencent/rtmp/a;->p:Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/rtmp/a;->a(Lcom/tencent/rtmp/TXLivePlayer$ITXLivePlayVideoRenderListener;Ljava/lang/Object;)I

    .line 79
    :cond_c
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    invoke-virtual {p1}, Lcom/tencent/liteav/i;->f()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 80
    iget-object p1, p0, Lcom/tencent/rtmp/a;->k:Ljava/lang/String;

    iput-object p1, p0, Lcom/tencent/rtmp/a;->B:Ljava/lang/String;

    .line 81
    iget-object p1, p0, Lcom/tencent/rtmp/a;->y:Lcom/tencent/liteav/e;

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lcom/tencent/liteav/e;->a()J

    move-result-wide p1

    goto :goto_0

    :cond_d
    move-wide p1, v0

    :goto_0
    iput-wide p1, p0, Lcom/tencent/rtmp/a;->A:J

    cmp-long p1, p1, v0

    if-lez p1, :cond_e

    .line 82
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    invoke-virtual {p1}, Lcom/tencent/liteav/i;->g()V

    .line 83
    :cond_e
    invoke-direct {p0}, Lcom/tencent/rtmp/a;->f()V

    return v3
.end method

.method public a(Z)I
    .locals 2

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api stopPlay "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 85
    iget-object v0, p0, Lcom/tencent/rtmp/a;->a:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 86
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 87
    :cond_0
    invoke-direct {p0}, Lcom/tencent/rtmp/a;->g()V

    .line 88
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_1

    .line 89
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->a(Z)I

    .line 90
    :cond_1
    const-string p1, ""

    iput-object p1, p0, Lcom/tencent/rtmp/a;->k:Ljava/lang/String;

    const-wide/16 v0, 0x0

    .line 91
    iput-wide v0, p0, Lcom/tencent/rtmp/a;->A:J

    const/4 p1, 0x0

    .line 92
    iput-object p1, p0, Lcom/tencent/rtmp/a;->y:Lcom/tencent/liteav/e;

    const/4 p1, 0x0

    .line 93
    iput-boolean p1, p0, Lcom/tencent/rtmp/a;->z:Z

    return p1
.end method

.method public a(F)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 145
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setRate "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    iput p1, p0, Lcom/tencent/rtmp/a;->v:F

    .line 147
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 148
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->b(F)V

    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 2

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setRenderMode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    iput p1, p0, Lcom/tencent/rtmp/a;->i:I

    .line 107
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->a(I)V

    :cond_0
    return-void
.end method

.method public a(II)V
    .locals 2

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setSurfaceSize "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    iput p1, p0, Lcom/tencent/rtmp/a;->c:I

    .line 102
    iput p2, p0, Lcom/tencent/rtmp/a;->d:I

    .line 103
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 104
    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/i;->a(II)V

    :cond_0
    return-void
.end method

.method public a(Landroid/view/Surface;)V
    .locals 2

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setSurface old : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/rtmp/a;->b:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", new : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    iput-object p1, p0, Lcom/tencent/rtmp/a;->b:Landroid/view/Surface;

    .line 98
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 99
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->a(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/rtmp/ITXLivePlayListener;)V
    .locals 2

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setPlayListener "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    iput-object p1, p0, Lcom/tencent/rtmp/a;->e:Lcom/tencent/rtmp/ITXLivePlayListener;

    return-void
.end method

.method public a(Lcom/tencent/rtmp/TXLivePlayConfig;)V
    .locals 2

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setConfig "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iput-object p1, p0, Lcom/tencent/rtmp/a;->f:Lcom/tencent/rtmp/TXLivePlayConfig;

    if-nez p1, :cond_0

    .line 8
    new-instance p1, Lcom/tencent/rtmp/TXLivePlayConfig;

    invoke-direct {p1}, Lcom/tencent/rtmp/TXLivePlayConfig;-><init>()V

    iput-object p1, p0, Lcom/tencent/rtmp/a;->f:Lcom/tencent/rtmp/TXLivePlayConfig;

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {p1}, Lcom/tencent/liteav/i;->q()Lcom/tencent/liteav/d;

    move-result-object p1

    if-nez p1, :cond_1

    .line 11
    new-instance p1, Lcom/tencent/liteav/d;

    invoke-direct {p1}, Lcom/tencent/liteav/d;-><init>()V

    .line 12
    :cond_1
    iget-object v0, p0, Lcom/tencent/rtmp/a;->f:Lcom/tencent/rtmp/TXLivePlayConfig;

    iget v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mCacheTime:F

    iput v1, p1, Lcom/tencent/liteav/d;->a:F

    .line 13
    iget-boolean v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mAutoAdjustCacheTime:Z

    iput-boolean v1, p1, Lcom/tencent/liteav/d;->g:Z

    .line 14
    iget v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mMinAutoAdjustCacheTime:F

    iput v1, p1, Lcom/tencent/liteav/d;->c:F

    .line 15
    iget v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mMaxAutoAdjustCacheTime:F

    iput v1, p1, Lcom/tencent/liteav/d;->b:F

    .line 16
    iget v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mVideoBlockThreshold:I

    iput v1, p1, Lcom/tencent/liteav/d;->d:I

    .line 17
    iget v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mConnectRetryCount:I

    iput v1, p1, Lcom/tencent/liteav/d;->e:I

    .line 18
    iget v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mConnectRetryInterval:I

    iput v1, p1, Lcom/tencent/liteav/d;->f:I

    .line 19
    iget-boolean v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mEnableNearestIP:Z

    iput-boolean v1, p1, Lcom/tencent/liteav/d;->i:Z

    .line 20
    iget v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mRtmpChannelType:I

    iput v1, p1, Lcom/tencent/liteav/d;->m:I

    .line 21
    iget-boolean v1, p0, Lcom/tencent/rtmp/a;->g:Z

    iput-boolean v1, p1, Lcom/tencent/liteav/d;->h:Z

    .line 22
    iget-object v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mCacheFolderPath:Ljava/lang/String;

    iput-object v1, p1, Lcom/tencent/liteav/d;->n:Ljava/lang/String;

    .line 23
    iget v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mMaxCacheItems:I

    iput v1, p1, Lcom/tencent/liteav/d;->o:I

    .line 24
    iget-boolean v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mEnableMessage:Z

    iput-boolean v1, p1, Lcom/tencent/liteav/d;->j:Z

    .line 25
    iget-boolean v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mEnableMetaData:Z

    iput-boolean v1, p1, Lcom/tencent/liteav/d;->k:Z

    .line 26
    iget-object v1, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mFlvSessionKey:Ljava/lang/String;

    iput-object v1, p1, Lcom/tencent/liteav/d;->l:Ljava/lang/String;

    .line 27
    iget-object v0, v0, Lcom/tencent/rtmp/TXLivePlayConfig;->mHeaders:Ljava/util/Map;

    iput-object v0, p1, Lcom/tencent/liteav/d;->q:Ljava/util/Map;

    .line 28
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->a(Lcom/tencent/liteav/d;)V

    :cond_2
    return-void
.end method

.method public a(Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;)V
    .locals 2

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setAudioRawDataListener "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    iput-object p1, p0, Lcom/tencent/rtmp/a;->I:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;

    .line 143
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 144
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->a(Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/rtmp/TXLivePlayer$ITXAudioVolumeEvaluationListener;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/tencent/rtmp/a;->F:Lcom/tencent/rtmp/TXLivePlayer$ITXAudioVolumeEvaluationListener;

    return-void
.end method

.method public a(Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;)V
    .locals 2

    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api snapshot "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    iget-boolean v0, p0, Lcom/tencent/rtmp/a;->w:Z

    if-nez v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 117
    iput-boolean v0, p0, Lcom/tencent/rtmp/a;->w:Z

    .line 118
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_1

    .line 119
    new-instance v1, Lcom/tencent/rtmp/a$1;

    invoke-direct {v1, p0, p1}, Lcom/tencent/rtmp/a$1;-><init>(Lcom/tencent/rtmp/a;Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;)V

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/i;->a(Lcom/tencent/liteav/basic/c/k;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 120
    iput-boolean p1, p0, Lcom/tencent/rtmp/a;->w:Z

    :cond_2
    :goto_0
    return-void
.end method

.method public a(Lcom/tencent/rtmp/TXLivePlayer$ITXVideoRawDataListener;)V
    .locals 3

    .line 136
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setVideoRawDataListener "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    iput-object p1, p0, Lcom/tencent/rtmp/a;->n:Lcom/tencent/rtmp/TXLivePlayer$ITXVideoRawDataListener;

    .line 138
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 139
    new-instance p1, Lcom/tencent/rtmp/a$3;

    invoke-direct {p1, p0}, Lcom/tencent/rtmp/a$3;-><init>(Lcom/tencent/rtmp/a;)V

    sget-object v2, Lcom/tencent/liteav/basic/a/b;->b:Lcom/tencent/liteav/basic/a/b;

    invoke-virtual {v0, p1, v2, v1}, Lcom/tencent/liteav/i;->a(Lcom/tencent/liteav/j;Lcom/tencent/liteav/basic/a/b;Ljava/lang/Object;)V

    return-void

    .line 140
    :cond_1
    sget-object p1, Lcom/tencent/liteav/basic/a/b;->a:Lcom/tencent/liteav/basic/a/b;

    invoke-virtual {v0, v1, p1, v1}, Lcom/tencent/liteav/i;->a(Lcom/tencent/liteav/j;Lcom/tencent/liteav/basic/a/b;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V
    .locals 2

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setPlayerView old view : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/rtmp/a;->a:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", new view : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    iput-object p1, p0, Lcom/tencent/rtmp/a;->a:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 33
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 34
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->a(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;)V
    .locals 2

    .line 112
    const-string v0, "TXLivePlayer"

    const-string v1, "liteav_api setVideoRecordListener"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 114
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->a(Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;)V

    :cond_0
    return-void
.end method

.method public a()Z
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 95
    invoke-virtual {v0}, Lcom/tencent/liteav/i;->c()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public a([B)Z
    .locals 3

    .line 121
    iget-object v0, p0, Lcom/tencent/rtmp/a;->k:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 122
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/rtmp/a;->g:Z

    const-string v2, "TXLivePlayer"

    if-eqz v0, :cond_1

    .line 123
    const-string p1, "can not addVideoRawData because of hw decode has set!"

    invoke-static {v2, p1}, Lcom/tencent/rtmp/TXLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 124
    :cond_1
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-nez v0, :cond_2

    .line 125
    const-string p1, "player hasn\'t created or not instanceof live player"

    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 126
    :cond_2
    iput-object p1, p0, Lcom/tencent/rtmp/a;->o:[B

    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_0
    return v1
.end method

.method public b(Ljava/lang/String;I)I
    .locals 3

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api prepareLiveSeek "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/tencent/rtmp/a;->y:Lcom/tencent/liteav/e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/tencent/liteav/e;

    invoke-direct {v0}, Lcom/tencent/liteav/e;-><init>()V

    iput-object v0, p0, Lcom/tencent/rtmp/a;->y:Lcom/tencent/liteav/e;

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/tencent/rtmp/a;->y:Lcom/tencent/liteav/e;

    if-eqz v0, :cond_1

    .line 36
    iget-object v1, p0, Lcom/tencent/rtmp/a;->k:Ljava/lang/String;

    new-instance v2, Lcom/tencent/rtmp/a$4;

    invoke-direct {v2, p0}, Lcom/tencent/rtmp/a$4;-><init>(Lcom/tencent/rtmp/a;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/tencent/liteav/e;->a(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/liteav/e$a;)I

    move-result p1

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public b()V
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api pause "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 4
    const-string v0, "pause play"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    invoke-virtual {v0}, Lcom/tencent/liteav/i;->a()V

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 2

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setRenderRotation "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iput p1, p0, Lcom/tencent/rtmp/a;->j:I

    .line 8
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->b(I)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 6

    .line 19
    const-string v0, "enable"

    const-string v1, "params"

    const-string v2, "api"

    const-string v3, "TXLivePlayer"

    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "callExperimentalAPI[lack api or illegal type]: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 22
    :cond_0
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 23
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 24
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 25
    :goto_0
    const-string v4, "muteRemoteAudioInSpeaker"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    if-nez v1, :cond_2

    .line 26
    const-string v0, "muteRemoteAudioInSpeaker[lack parameter]"

    invoke-static {v3, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 27
    :cond_2
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 28
    const-string v0, "muteRemoteAudioInSpeaker[lack parameter]: enable"

    invoke-static {v3, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 29
    :cond_3
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 30
    iget-object v1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v1, :cond_5

    const/4 v2, 0x1

    if-ne v0, v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/i;->c(Z)V

    :cond_5
    return-void

    .line 31
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "callExperimentalAPI[illegal api]: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 32
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "callExperimentalAPI[failed]: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Z)Z
    .locals 2

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api enableHardwareDecode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 11
    invoke-direct {p0}, Lcom/tencent/rtmp/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "enableHardwareDecode failed, MANUFACTURER = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", MODEL"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HardwareDecode"

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    .line 13
    :cond_0
    iput-boolean p1, p0, Lcom/tencent/rtmp/a;->g:Z

    .line 14
    iget-object p1, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz p1, :cond_2

    .line 15
    invoke-virtual {p1}, Lcom/tencent/liteav/i;->q()Lcom/tencent/liteav/d;

    move-result-object p1

    if-nez p1, :cond_1

    .line 16
    new-instance p1, Lcom/tencent/liteav/d;

    invoke-direct {p1}, Lcom/tencent/liteav/d;-><init>()V

    .line 17
    :cond_1
    iget-boolean v0, p0, Lcom/tencent/rtmp/a;->g:Z

    iput-boolean v0, p1, Lcom/tencent/liteav/d;->h:Z

    .line 18
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->a(Lcom/tencent/liteav/d;)V

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public c()V
    .locals 5

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api resume "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_2

    .line 4
    const-string v0, "resume play"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    invoke-virtual {v0}, Lcom/tencent/liteav/i;->b()V

    .line 6
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    invoke-virtual {v0}, Lcom/tencent/liteav/i;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/tencent/rtmp/a;->y:Lcom/tencent/liteav/e;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/liteav/e;->a()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    iput-wide v3, p0, Lcom/tencent/rtmp/a;->A:J

    cmp-long v0, v3, v1

    if-lez v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    invoke-virtual {v0}, Lcom/tencent/liteav/i;->g()V

    .line 9
    :cond_1
    iget v0, p0, Lcom/tencent/rtmp/a;->x:I

    invoke-virtual {p0, v0}, Lcom/tencent/rtmp/a;->d(I)V

    :cond_2
    return-void
.end method

.method public c(I)V
    .locals 2

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    const/16 v0, 0x64

    if-le p1, v0, :cond_1

    move p1, v0

    .line 14
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setVolume volume = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iput p1, p0, Lcom/tencent/rtmp/a;->m:I

    .line 16
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_2

    .line 17
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->c(I)V

    :cond_2
    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setMute "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iput-boolean p1, p0, Lcom/tencent/rtmp/a;->l:Z

    .line 12
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 13
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->b(Z)V

    :cond_0
    return-void
.end method

.method public d()I
    .locals 2

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api stopRecord "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0}, Lcom/tencent/liteav/i;->e()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public d(I)V
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setAudioRoute "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iput p1, p0, Lcom/tencent/rtmp/a;->x:I

    .line 4
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_0

    .line 5
    iget-object v1, p0, Lcom/tencent/rtmp/a;->r:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lcom/tencent/liteav/i;->a(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public d(Z)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api setAutoPlay "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iput-boolean p1, p0, Lcom/tencent/rtmp/a;->u:Z

    return-void
.end method

.method public e()I
    .locals 2

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api resumeLive "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-boolean v0, p0, Lcom/tencent/rtmp/a;->z:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/tencent/rtmp/a;->z:Z

    .line 10
    iget-object v0, p0, Lcom/tencent/rtmp/a;->B:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/tencent/rtmp/a;->a(Ljava/lang/String;I)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public e(I)V
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api enableAudioVolumeEvaluation intervalMs = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-lez p1, :cond_1

    const/16 v0, 0x64

    if-ge p1, v0, :cond_0

    move p1, v0

    .line 3
    :cond_0
    iput p1, p0, Lcom/tencent/rtmp/a;->G:I

    .line 4
    invoke-direct {p0}, Lcom/tencent/rtmp/a;->f()V

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/tencent/rtmp/a;->G:I

    .line 6
    invoke-direct {p0}, Lcom/tencent/rtmp/a;->g()V

    return-void
.end method

.method public f(I)I
    .locals 3

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api startRecord "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0}, Lcom/tencent/rtmp/a;->a()Z

    move-result v0

    const/4 v2, -0x1

    if-nez v0, :cond_0

    .line 13
    const-string p1, "startRecord: there is no playing stream"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_1

    .line 15
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->d(I)I

    move-result p1

    return p1

    :cond_1
    return v2
.end method

.method public g(I)V
    .locals 3

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "liteav_api seek "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXLivePlayer"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    if-eqz v0, :cond_5

    .line 10
    invoke-virtual {v0}, Lcom/tencent/liteav/i;->f()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/tencent/rtmp/a;->z:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/tencent/rtmp/a;->t:Lcom/tencent/liteav/i;

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/i;->e(I)V

    return-void

    .line 12
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/rtmp/a;->y:Lcom/tencent/liteav/e;

    if-eqz v0, :cond_2

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/e;->a(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    const-string v0, ""

    .line 13
    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    const/4 v1, 0x3

    .line 14
    invoke-virtual {p0, v0, v1}, Lcom/tencent/rtmp/a;->a(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lcom/tencent/rtmp/a;->z:Z

    if-eqz v0, :cond_5

    mul-int/lit16 p1, p1, 0x3e8

    int-to-long v0, p1

    .line 15
    iput-wide v0, p0, Lcom/tencent/rtmp/a;->A:J

    return-void

    .line 16
    :cond_4
    iget-object p1, p0, Lcom/tencent/rtmp/a;->e:Lcom/tencent/rtmp/ITXLivePlayListener;

    if-eqz p1, :cond_5

    .line 17
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/16 v1, -0x8fd

    invoke-interface {p1, v1, v0}, Lcom/tencent/rtmp/ITXLivePlayListener;->onPlayEvent(ILandroid/os/Bundle;)V

    :cond_5
    return-void
.end method

.method public onNotifyEvent(ILandroid/os/Bundle;)V
    .locals 5

    .line 1
    const/16 v0, 0x3a99

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lcom/tencent/rtmp/a;->a:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, p2, v1, v0}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->setLogText(Landroid/os/Bundle;Landroid/os/Bundle;I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Lcom/tencent/rtmp/a;->e:Lcom/tencent/rtmp/ITXLivePlayListener;

    .line 15
    .line 16
    if-eqz p1, :cond_a

    .line 17
    .line 18
    invoke-interface {p1, p2}, Lcom/tencent/rtmp/ITXLivePlayListener;->onNetStatus(Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    const/16 v0, 0x7d5

    .line 23
    .line 24
    if-ne p1, v0, :cond_2

    .line 25
    .line 26
    const-string v0, "EVT_PLAY_PROGRESS_MS"

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    int-to-long v1, v1

    .line 33
    iget-wide v3, p0, Lcom/tencent/rtmp/a;->A:J

    .line 34
    .line 35
    add-long/2addr v1, v3

    .line 36
    const-wide/16 v3, 0x0

    .line 37
    .line 38
    cmp-long v3, v1, v3

    .line 39
    .line 40
    if-lez v3, :cond_a

    .line 41
    .line 42
    const-wide/16 v3, 0x3e8

    .line 43
    .line 44
    div-long v3, v1, v3

    .line 45
    .line 46
    long-to-int v3, v3

    .line 47
    const-string v4, "EVT_PLAY_PROGRESS"

    .line 48
    .line 49
    invoke-virtual {p2, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    long-to-int v1, v1

    .line 53
    invoke-virtual {p2, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/tencent/rtmp/a;->e:Lcom/tencent/rtmp/ITXLivePlayListener;

    .line 57
    .line 58
    if-eqz v0, :cond_a

    .line 59
    .line 60
    invoke-interface {v0, p1, p2}, Lcom/tencent/rtmp/ITXLivePlayListener;->onPlayEvent(ILandroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    const/16 v2, 0x7ea

    .line 65
    .line 66
    if-ne p1, v2, :cond_3

    .line 67
    .line 68
    goto/16 :goto_1

    .line 69
    .line 70
    :cond_3
    const/16 v2, -0x905

    .line 71
    .line 72
    const/16 v3, -0x8fd

    .line 73
    .line 74
    if-eq p1, v2, :cond_4

    .line 75
    .line 76
    const/16 v2, -0x903

    .line 77
    .line 78
    if-eq p1, v2, :cond_6

    .line 79
    .line 80
    const/16 v2, -0x900

    .line 81
    .line 82
    if-eq p1, v2, :cond_6

    .line 83
    .line 84
    const/16 v2, 0x7df

    .line 85
    .line 86
    if-eq p1, v2, :cond_6

    .line 87
    .line 88
    const/16 v2, 0x7ec

    .line 89
    .line 90
    if-eq p1, v2, :cond_6

    .line 91
    .line 92
    const/16 v2, 0x7ef

    .line 93
    .line 94
    if-eq p1, v2, :cond_6

    .line 95
    .line 96
    const/16 v2, 0x835

    .line 97
    .line 98
    if-eq p1, v2, :cond_6

    .line 99
    .line 100
    const/16 v2, 0x837

    .line 101
    .line 102
    if-eq p1, v2, :cond_6

    .line 103
    .line 104
    const/16 v2, 0xbbb

    .line 105
    .line 106
    if-eq p1, v2, :cond_6

    .line 107
    .line 108
    const/16 v2, -0x8fe

    .line 109
    .line 110
    if-eq p1, v2, :cond_6

    .line 111
    .line 112
    if-eq p1, v3, :cond_4

    .line 113
    .line 114
    const/16 v2, 0x7dc

    .line 115
    .line 116
    if-eq p1, v2, :cond_6

    .line 117
    .line 118
    const/16 v2, 0x7dd

    .line 119
    .line 120
    if-eq p1, v2, :cond_6

    .line 121
    .line 122
    const/16 v2, 0x7e5

    .line 123
    .line 124
    if-eq p1, v2, :cond_7

    .line 125
    .line 126
    const/16 v2, 0x7e6

    .line 127
    .line 128
    if-eq p1, v2, :cond_7

    .line 129
    .line 130
    const/16 v2, 0x839

    .line 131
    .line 132
    if-eq p1, v2, :cond_8

    .line 133
    .line 134
    const/16 v2, 0x83a

    .line 135
    .line 136
    if-eq p1, v2, :cond_6

    .line 137
    .line 138
    const/16 v2, 0xbbe

    .line 139
    .line 140
    if-eq p1, v2, :cond_5

    .line 141
    .line 142
    const/16 v2, 0xbbf

    .line 143
    .line 144
    if-eq p1, v2, :cond_5

    .line 145
    .line 146
    const/16 v2, 0xbc1

    .line 147
    .line 148
    const/16 v3, 0xbba

    .line 149
    .line 150
    if-eq p1, v2, :cond_4

    .line 151
    .line 152
    const/16 v2, 0xbc2

    .line 153
    .line 154
    if-eq p1, v2, :cond_4

    .line 155
    .line 156
    packed-switch p1, :pswitch_data_0

    .line 157
    .line 158
    .line 159
    packed-switch p1, :pswitch_data_1

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :pswitch_0
    const/16 p1, 0x7d9

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :pswitch_1
    const/16 p1, 0x7d7

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :pswitch_2
    move p1, v0

    .line 170
    goto :goto_0

    .line 171
    :pswitch_3
    const/16 p1, 0x7d4

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :pswitch_4
    const/16 p1, 0x7d2

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :pswitch_5
    const/16 p1, 0x7d1

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_4
    move p1, v3

    .line 181
    goto :goto_0

    .line 182
    :cond_5
    const/16 p1, 0xbbd

    .line 183
    .line 184
    goto :goto_0

    .line 185
    :cond_6
    move p1, v2

    .line 186
    goto :goto_0

    .line 187
    :cond_7
    :pswitch_6
    const/16 p1, 0x7d8

    .line 188
    .line 189
    :cond_8
    :goto_0
    :pswitch_7
    iget-object v0, p0, Lcom/tencent/rtmp/a;->a:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 190
    .line 191
    if-eqz v0, :cond_9

    .line 192
    .line 193
    invoke-virtual {v0, v1, p2, p1}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->setLogText(Landroid/os/Bundle;Landroid/os/Bundle;I)V

    .line 194
    .line 195
    .line 196
    :cond_9
    iget-object v0, p0, Lcom/tencent/rtmp/a;->e:Lcom/tencent/rtmp/ITXLivePlayListener;

    .line 197
    .line 198
    if-eqz v0, :cond_a

    .line 199
    .line 200
    invoke-interface {v0, p1, p2}, Lcom/tencent/rtmp/ITXLivePlayListener;->onPlayEvent(ILandroid/os/Bundle;)V

    .line 201
    .line 202
    .line 203
    :cond_a
    :goto_1
    return-void

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x7d1
        :pswitch_5
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_2
    .end packed-switch

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    :pswitch_data_1
    .packed-switch 0x7d7
        :pswitch_1
        :pswitch_6
        :pswitch_0
    .end packed-switch
.end method
