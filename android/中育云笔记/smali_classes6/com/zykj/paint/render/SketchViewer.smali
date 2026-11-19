# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class public Lcom/zykj/paint/render/SketchViewer;
.super Landroid/view/SurfaceView;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/paint/render/SketchViewer$ProgressTask;,
        Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;,
        Lcom/zykj/paint/render/SketchViewer$CheckActionRunnable;
    }
.end annotation


# static fields
.field private static final DELAY_TIME:J = 0x1f4L

.field private static final FRAME_TIME:J = 0x28L

.field private static final TAG:Ljava/lang/String; = "SketchViewer"


# instance fields
.field private actionProcessor:Lcom/zykj/paint/runner/ActionProcessor;

.field private isBackgroudPlaced:Z

.field private isRend:Z

.field private mActionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyAction;",
            ">;"
        }
    .end annotation
.end field

.field private mCanvas:Landroid/graphics/Canvas;

.field private mCaptureBitmap:Landroid/graphics/Bitmap;

.field private mCurrentIndex:I

.field private mHolder:Landroid/view/SurfaceHolder;

.field private mIsDrawing:Z

.field private mIsRunning:Z

.field private mStartTime:J

.field public map:Lcom/zykj/paint/graphic/Map;

.field private mapRender:Lcom/zykj/paint/render/MapRender;

.field private maxProgress:J

.field private mediaPlayer:Landroid/media/MediaPlayer;

.field private playStatusListener:Lcom/zykj/paint/player/PlayStatusListener;

.field private progressTask:Lcom/zykj/paint/render/SketchViewer$ProgressTask;

.field private renderActionRunnable:Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;

.field private scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

.field private scheduledFuture:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private sourceUrl:Ljava/lang/String;

.field private timeRecord:J

.field private timer:Ljava/util/Timer;

.field private toRenderActionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyAction;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/zykj/paint/render/SketchViewer;->isRend:Z

    .line 3
    new-instance p1, Lcom/zykj/paint/render/SketchViewer$3;

    invoke-direct {p1, p0}, Lcom/zykj/paint/render/SketchViewer$3;-><init>(Lcom/zykj/paint/render/SketchViewer;)V

    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->playStatusListener:Lcom/zykj/paint/player/PlayStatusListener;

    .line 4
    invoke-direct {p0}, Lcom/zykj/paint/render/SketchViewer;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/zykj/paint/render/SketchViewer;->isRend:Z

    .line 7
    new-instance p1, Lcom/zykj/paint/render/SketchViewer$3;

    invoke-direct {p1, p0}, Lcom/zykj/paint/render/SketchViewer$3;-><init>(Lcom/zykj/paint/render/SketchViewer;)V

    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->playStatusListener:Lcom/zykj/paint/player/PlayStatusListener;

    .line 8
    invoke-direct {p0}, Lcom/zykj/paint/render/SketchViewer;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/zykj/paint/render/SketchViewer;->isRend:Z

    .line 11
    new-instance p1, Lcom/zykj/paint/render/SketchViewer$3;

    invoke-direct {p1, p0}, Lcom/zykj/paint/render/SketchViewer$3;-><init>(Lcom/zykj/paint/render/SketchViewer;)V

    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->playStatusListener:Lcom/zykj/paint/player/PlayStatusListener;

    .line 12
    invoke-direct {p0}, Lcom/zykj/paint/render/SketchViewer;->init()V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/paint/render/SketchViewer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/render/SketchViewer;->renderTemp()V

    return-void
.end method

.method public static synthetic access$000(Lcom/zykj/paint/render/SketchViewer;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/paint/render/SketchViewer;->mIsRunning:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$100(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/render/SketchViewer;->mActionList:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1000(Lcom/zykj/paint/render/SketchViewer;)Landroid/media/MediaPlayer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lcom/zykj/paint/render/SketchViewer;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/paint/render/SketchViewer;->mCurrentIndex:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$208(Lcom/zykj/paint/render/SketchViewer;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCurrentIndex:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/zykj/paint/render/SketchViewer;->mCurrentIndex:I

    .line 6
    .line 7
    return v0
.end method

.method public static synthetic access$300(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/render/SketchViewer;->scheduledFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$302(Lcom/zykj/paint/render/SketchViewer;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->scheduledFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$400(Lcom/zykj/paint/render/SketchViewer;)Lcom/zykj/paint/player/PlayStatusListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/render/SketchViewer;->playStatusListener:Lcom/zykj/paint/player/PlayStatusListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Lcom/zykj/paint/render/SketchViewer;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/paint/render/SketchViewer;->maxProgress:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic access$600(Lcom/zykj/paint/render/SketchViewer;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/paint/render/SketchViewer;->timeRecord:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic access$602(Lcom/zykj/paint/render/SketchViewer;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/paint/render/SketchViewer;->timeRecord:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic access$700(Lcom/zykj/paint/render/SketchViewer;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/paint/render/SketchViewer;->mStartTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic access$800(Lcom/zykj/paint/render/SketchViewer;)Lcom/zykj/paint/runner/ActionProcessor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/render/SketchViewer;->actionProcessor:Lcom/zykj/paint/runner/ActionProcessor;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$900(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/render/SketchViewer;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    return-object p0
.end method

.method private getScaleMatrix(IIII)Landroid/graphics/Matrix;
    .locals 3

    .line 1
    int-to-float p1, p1

    .line 2
    const/high16 v0, 0x3f800000    # 1.0f

    .line 3
    .line 4
    mul-float v1, p1, v0

    .line 5
    .line 6
    int-to-float p3, p3

    .line 7
    div-float/2addr v1, p3

    .line 8
    int-to-float p2, p2

    .line 9
    mul-float/2addr v0, p2

    .line 10
    int-to-float p4, p4

    .line 11
    div-float/2addr v0, p4

    .line 12
    cmpl-float v2, v1, v0

    .line 13
    .line 14
    if-lez v2, :cond_0

    .line 15
    .line 16
    move v1, v0

    .line 17
    :cond_0
    const/high16 v0, 0x40000000    # 2.0f

    .line 18
    .line 19
    div-float/2addr p3, v0

    .line 20
    div-float/2addr p4, v0

    .line 21
    div-float/2addr p1, v0

    .line 22
    sub-float/2addr p1, p3

    .line 23
    div-float/2addr p2, v0

    .line 24
    sub-float/2addr p2, p4

    .line 25
    new-instance v0, Landroid/graphics/Matrix;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v1, p3, p4}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method private getTotalTime(Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyAction;",
            ">;)I"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 2
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$EzyAction;

    .line 3
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getStartAt()I

    move-result v0

    .line 4
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getDuration()I

    move-result p1

    add-int/2addr v0, p1

    return v0
.end method

.method private init()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mHolder:Landroid/view/SurfaceHolder;

    .line 6
    .line 7
    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private playMusic()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 15
    .line 16
    .line 17
    :try_start_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer;->sourceUrl:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v2, "/track.wav"

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 52
    .line 53
    new-instance v1, Lcom/zykj/paint/render/SketchViewer$2;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Lcom/zykj/paint/render/SketchViewer$2;-><init>(Lcom/zykj/paint/render/SketchViewer;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catch_0
    move-exception v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method private renderTemp()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mHolder:Landroid/view/SurfaceHolder;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/view/SurfaceHolder;->lockCanvas()Landroid/graphics/Canvas;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->sourceUrl:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "/thumbnail.jpg"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    invoke-direct {p0, v2, v3, v4, v5}, Lcom/zykj/paint/render/SketchViewer;->getScaleMatrix(IIII)Landroid/graphics/Matrix;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const/4 v3, 0x0

    .line 61
    invoke-virtual {v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 68
    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mHolder:Landroid/view/SurfaceHolder;

    .line 72
    .line 73
    invoke-interface {v1, v0}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    goto :goto_0

    .line 79
    :catch_0
    move-exception v0

    .line 80
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 84
    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mHolder:Landroid/view/SurfaceHolder;

    .line 88
    .line 89
    invoke-interface {v1, v0}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :goto_0
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 94
    .line 95
    if-eqz v1, :cond_0

    .line 96
    .line 97
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer;->mHolder:Landroid/view/SurfaceHolder;

    .line 98
    .line 99
    invoke-interface {v2, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 100
    .line 101
    .line 102
    :cond_0
    throw v0

    .line 103
    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public getCapture()Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    const-string v0, "SketchViewer"

    .line 2
    .line 3
    const-string v1, "[\u83b7\u53d6\u622a\u56fe]---->>>>getCapture()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCaptureBitmap:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    new-instance v0, Landroid/graphics/Canvas;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mCaptureBitmap:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 36
    .line 37
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer;->mapRender:Lcom/zykj/paint/render/MapRender;

    .line 38
    .line 39
    invoke-virtual {v1, v2, v0}, Lcom/zykj/paint/graphic/Map;->directRender(Lcom/zykj/paint/render/MapRender;Landroid/graphics/Canvas;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCaptureBitmap:Landroid/graphics/Bitmap;

    .line 43
    .line 44
    return-object v0
.end method

.method public getTotalTime()J
    .locals 2

    .line 5
    iget-wide v0, p0, Lcom/zykj/paint/render/SketchViewer;->maxProgress:J

    return-wide v0
.end method

.method public isEnded(I)Z
    .locals 4

    .line 1
    int-to-long v0, p1

    .line 2
    iget-wide v2, p0, Lcom/zykj/paint/render/SketchViewer;->maxProgress:J

    .line 3
    .line 4
    cmp-long p1, v0, v2

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public isRend(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/paint/render/SketchViewer;->isRend:Z

    .line 2
    .line 3
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/paint/render/SketchViewer;->mIsRunning:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/zykj/paint/render/SketchViewer;->mIsDrawing:Z

    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->playStatusListener:Lcom/zykj/paint/player/PlayStatusListener;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/zykj/paint/player/PlayStatusListener;->onPlayPause()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public play()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/paint/render/SketchViewer;->mIsRunning:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/zykj/paint/render/SketchViewer;->mIsDrawing:Z

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCurrentIndex:I

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/zykj/paint/render/SketchViewer;->timeRecord:J

    .line 12
    .line 13
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/zykj/paint/graphic/Map;->reset()V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    iput-wide v2, p0, Lcom/zykj/paint/render/SketchViewer;->mStartTime:J

    .line 25
    .line 26
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    iget-object v3, p0, Lcom/zykj/paint/render/SketchViewer;->renderActionRunnable:Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;

    .line 29
    .line 30
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 31
    .line 32
    invoke-interface {v2, v3, v0, v1, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->scheduledFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 37
    .line 38
    invoke-direct {p0}, Lcom/zykj/paint/render/SketchViewer;->playMusic()V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->playStatusListener:Lcom/zykj/paint/player/PlayStatusListener;

    .line 42
    .line 43
    invoke-interface {v0}, Lcom/zykj/paint/player/PlayStatusListener;->onPlayStart()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public release()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->progressTask:Lcom/zykj/paint/render/SketchViewer$ProgressTask;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->progressTask:Lcom/zykj/paint/render/SketchViewer$ProgressTask;

    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->timer:Ljava/util/Timer;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->timer:Ljava/util/Timer;

    .line 26
    .line 27
    :cond_2
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->actionProcessor:Lcom/zykj/paint/runner/ActionProcessor;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/zykj/paint/runner/ActionProcessor;->destroy()V

    .line 32
    .line 33
    .line 34
    :cond_3
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 35
    .line 36
    if-eqz v0, :cond_5

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 47
    .line 48
    .line 49
    :cond_4
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 55
    .line 56
    :cond_5
    return-void
.end method

.method public renderAll()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/zykj/paint/render/SketchViewer;->mIsDrawing:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/zykj/paint/render/SketchViewer;->isRend:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mHolder:Landroid/view/SurfaceHolder;

    .line 11
    .line 12
    invoke-interface {v0}, Landroid/view/SurfaceHolder;->lockCanvas()Landroid/graphics/Canvas;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    const/4 v1, -0x1

    .line 21
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mapRender:Lcom/zykj/paint/render/MapRender;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Lcom/zykj/paint/graphic/Map;->directRender(Lcom/zykj/paint/render/MapRender;Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mHolder:Landroid/view/SurfaceHolder;

    .line 38
    .line 39
    invoke-interface {v1, v0}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception v0

    .line 46
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mHolder:Landroid/view/SurfaceHolder;

    .line 54
    .line 55
    invoke-interface {v1, v0}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :goto_0
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 60
    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer;->mHolder:Landroid/view/SurfaceHolder;

    .line 64
    .line 65
    invoke-interface {v2, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    throw v0

    .line 69
    :cond_2
    :goto_1
    return-void
.end method

.method public renderHistory()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "[\u6e32\u67d3\u62d6\u52a8\u7684\u753b\u9762] mCurrentIndex="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lcom/zykj/paint/render/SketchViewer;->mCurrentIndex:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "SketchViewer"

    .line 21
    .line 22
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/zykj/paint/graphic/Map;->reset()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->actionProcessor:Lcom/zykj/paint/runner/ActionProcessor;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mActionList:Ljava/util/List;

    .line 33
    .line 34
    iget v2, p0, Lcom/zykj/paint/render/SketchViewer;->mCurrentIndex:I

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-interface {v1, v3, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderHistory(Ljava/util/List;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public renderHistorySnapshot()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mHolder:Landroid/view/SurfaceHolder;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/view/SurfaceHolder;->lockCanvas()Landroid/graphics/Canvas;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mapRender:Lcom/zykj/paint/render/MapRender;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Lcom/zykj/paint/graphic/Map;->directRender(Lcom/zykj/paint/render/MapRender;Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mHolder:Landroid/view/SurfaceHolder;

    .line 29
    .line 30
    invoke-interface {v1, v0}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mHolder:Landroid/view/SurfaceHolder;

    .line 45
    .line 46
    invoke-interface {v1, v0}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :goto_0
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mCanvas:Landroid/graphics/Canvas;

    .line 51
    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer;->mHolder:Landroid/view/SurfaceHolder;

    .line 55
    .line 56
    invoke-interface {v2, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    throw v0

    .line 60
    :cond_1
    :goto_1
    return-void
.end method

.method public reset()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/paint/render/SketchViewer;->mCurrentIndex:I

    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/zykj/paint/render/SketchViewer;->timeRecord:J

    .line 7
    .line 8
    return-void
.end method

.method public resume()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/paint/render/SketchViewer;->mIsRunning:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/zykj/paint/render/SketchViewer;->mIsDrawing:Z

    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/paint/graphic/Map;->reset()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-wide v2, p0, Lcom/zykj/paint/render/SketchViewer;->timeRecord:J

    .line 16
    .line 17
    sub-long/2addr v0, v2

    .line 18
    iput-wide v0, p0, Lcom/zykj/paint/render/SketchViewer;->mStartTime:J

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->actionProcessor:Lcom/zykj/paint/runner/ActionProcessor;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->mActionList:Ljava/util/List;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iget v3, p0, Lcom/zykj/paint/render/SketchViewer;->mCurrentIndex:I

    .line 26
    .line 27
    invoke-interface {v1, v2, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Lcom/zykj/paint/runner/ActionProcessor;->renderHistory(Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->renderActionRunnable:Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;

    .line 37
    .line 38
    const-wide/16 v2, 0x0

    .line 39
    .line 40
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 41
    .line 42
    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->scheduledFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 53
    .line 54
    .line 55
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->playStatusListener:Lcom/zykj/paint/player/PlayStatusListener;

    .line 56
    .line 57
    invoke-interface {v0}, Lcom/zykj/paint/player/PlayStatusListener;->onPlayStart()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public seekToCurrentIndex(I)J
    .locals 8

    .line 1
    const-string v0, "/track.wav"

    .line 2
    .line 3
    int-to-long v1, p1

    .line 4
    iget-wide v3, p0, Lcom/zykj/paint/render/SketchViewer;->maxProgress:J

    .line 5
    .line 6
    cmp-long v3, v1, v3

    .line 7
    .line 8
    if-nez v3, :cond_0

    .line 9
    .line 10
    iget-object v3, p0, Lcom/zykj/paint/render/SketchViewer;->actionProcessor:Lcom/zykj/paint/runner/ActionProcessor;

    .line 11
    .line 12
    iget-object v4, p0, Lcom/zykj/paint/render/SketchViewer;->mActionList:Ljava/util/List;

    .line 13
    .line 14
    invoke-virtual {v3, v4}, Lcom/zykj/paint/runner/ActionProcessor;->renderHistory(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Lcom/zykj/paint/render/SketchViewer;->playStatusListener:Lcom/zykj/paint/player/PlayStatusListener;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {v3}, Lcom/zykj/paint/player/PlayStatusListener;->onPlayEnd()V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->playStatusListener:Lcom/zykj/paint/player/PlayStatusListener;

    .line 25
    .line 26
    iget-wide v3, p0, Lcom/zykj/paint/render/SketchViewer;->maxProgress:J

    .line 27
    .line 28
    invoke-interface {p1, v3, v4}, Lcom/zykj/paint/player/PlayStatusListener;->onUpdate(J)V

    .line 29
    .line 30
    .line 31
    return-wide v1

    .line 32
    :cond_0
    iget-object v3, p0, Lcom/zykj/paint/render/SketchViewer;->mActionList:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x0

    .line 39
    :goto_0
    add-int/lit8 v5, v3, -0x1

    .line 40
    .line 41
    if-ge v4, v5, :cond_5

    .line 42
    .line 43
    iget-object v5, p0, Lcom/zykj/paint/render/SketchViewer;->mActionList:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, Lcom/zykj/paint/Actions$EzyAction;

    .line 50
    .line 51
    iget-object v6, p0, Lcom/zykj/paint/render/SketchViewer;->mActionList:Ljava/util/List;

    .line 52
    .line 53
    add-int/lit8 v7, v4, 0x1

    .line 54
    .line 55
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    check-cast v6, Lcom/zykj/paint/Actions$EzyAction;

    .line 60
    .line 61
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyAction;->getStartAt()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-virtual {v6}, Lcom/zykj/paint/Actions$EzyAction;->getStartAt()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    sub-int v5, p1, v5

    .line 70
    .line 71
    if-ltz v5, :cond_1

    .line 72
    .line 73
    if-lt p1, v6, :cond_2

    .line 74
    .line 75
    :cond_1
    if-nez p1, :cond_4

    .line 76
    .line 77
    :cond_2
    iput v4, p0, Lcom/zykj/paint/render/SketchViewer;->mCurrentIndex:I

    .line 78
    .line 79
    iput-wide v1, p0, Lcom/zykj/paint/render/SketchViewer;->timeRecord:J

    .line 80
    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 82
    .line 83
    .line 84
    move-result-wide v3

    .line 85
    sub-long/2addr v3, v1

    .line 86
    iput-wide v3, p0, Lcom/zykj/paint/render/SketchViewer;->mStartTime:J

    .line 87
    .line 88
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->playStatusListener:Lcom/zykj/paint/player/PlayStatusListener;

    .line 89
    .line 90
    invoke-interface {v1}, Lcom/zykj/paint/player/PlayStatusListener;->onPlayPause()V

    .line 91
    .line 92
    .line 93
    if-nez p1, :cond_3

    .line 94
    .line 95
    invoke-direct {p0}, Lcom/zykj/paint/render/SketchViewer;->renderTemp()V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/paint/render/SketchViewer;->renderHistory()V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    move v4, v7

    .line 104
    goto :goto_0

    .line 105
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 106
    .line 107
    if-nez p1, :cond_6

    .line 108
    .line 109
    new-instance p1, Landroid/media/MediaPlayer;

    .line 110
    .line 111
    invoke-direct {p1}, Landroid/media/MediaPlayer;-><init>()V

    .line 112
    .line 113
    .line 114
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 115
    .line 116
    :cond_6
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->stop()V

    .line 119
    .line 120
    .line 121
    :try_start_0
    new-instance p1, Ljava/io/File;

    .line 122
    .line 123
    new-instance v1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer;->sourceUrl:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_7

    .line 148
    .line 149
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->reset()V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 155
    .line 156
    new-instance v1, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    iget-object v2, p0, Lcom/zykj/paint/render/SketchViewer;->sourceUrl:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 177
    .line 178
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 179
    .line 180
    .line 181
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 182
    .line 183
    new-instance v0, Lcom/zykj/paint/render/SketchViewer$1;

    .line 184
    .line 185
    invoke-direct {v0, p0}, Lcom/zykj/paint/render/SketchViewer$1;-><init>(Lcom/zykj/paint/render/SketchViewer;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :catch_0
    move-exception p1

    .line 193
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 194
    .line 195
    .line 196
    :cond_7
    :goto_2
    iget-wide v0, p0, Lcom/zykj/paint/render/SketchViewer;->timeRecord:J

    .line 197
    .line 198
    return-wide v0
.end method

.method public setDataSource(Ljava/util/List;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyAction;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mActionList:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/paint/render/SketchViewer;->sourceUrl:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/zykj/paint/render/SketchViewer;->getTotalTime(Ljava/util/List;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    int-to-long v0, p1

    .line 10
    iput-wide v0, p0, Lcom/zykj/paint/render/SketchViewer;->maxProgress:J

    .line 11
    .line 12
    new-instance p1, Lcom/zykj/paint/graphic/Map;

    .line 13
    .line 14
    invoke-direct {p1}, Lcom/zykj/paint/graphic/Map;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 18
    .line 19
    new-instance p1, Lcom/zykj/paint/render/MapRender;

    .line 20
    .line 21
    invoke-direct {p1}, Lcom/zykj/paint/render/MapRender;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mapRender:Lcom/zykj/paint/render/MapRender;

    .line 25
    .line 26
    const/4 p1, 0x2

    .line 27
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 32
    .line 33
    new-instance p1, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;-><init>(Lcom/zykj/paint/render/SketchViewer;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->renderActionRunnable:Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;

    .line 39
    .line 40
    new-instance p1, Lcom/zykj/paint/runner/ActionProcessor;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 43
    .line 44
    invoke-direct {p1, p0, v0}, Lcom/zykj/paint/runner/ActionProcessor;-><init>(Lcom/zykj/paint/render/SketchViewer;Lcom/zykj/paint/graphic/Map;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->actionProcessor:Lcom/zykj/paint/runner/ActionProcessor;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Lcom/zykj/paint/runner/ActionProcessor;->setSourceUrl(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 53
    .line 54
    if-nez p1, :cond_0

    .line 55
    .line 56
    new-instance p1, Landroid/media/MediaPlayer;

    .line 57
    .line 58
    invoke-direct {p1}, Landroid/media/MediaPlayer;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->stop()V

    .line 65
    .line 66
    .line 67
    :goto_0
    :try_start_0
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->reset()V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 73
    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p2, "/track.wav"

    .line 83
    .line 84
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :catch_0
    move-exception v0

    .line 101
    :goto_1
    move-object p1, v0

    .line 102
    goto :goto_2

    .line 103
    :catch_1
    move-exception v0

    .line 104
    goto :goto_1

    .line 105
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 106
    .line 107
    .line 108
    :goto_3
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->timer:Ljava/util/Timer;

    .line 109
    .line 110
    const/4 p2, 0x0

    .line 111
    if-eqz p1, :cond_1

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    .line 114
    .line 115
    .line 116
    iput-object p2, p0, Lcom/zykj/paint/render/SketchViewer;->timer:Ljava/util/Timer;

    .line 117
    .line 118
    :cond_1
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->progressTask:Lcom/zykj/paint/render/SketchViewer$ProgressTask;

    .line 119
    .line 120
    if-eqz p1, :cond_2

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/util/TimerTask;->cancel()Z

    .line 123
    .line 124
    .line 125
    iput-object p2, p0, Lcom/zykj/paint/render/SketchViewer;->progressTask:Lcom/zykj/paint/render/SketchViewer$ProgressTask;

    .line 126
    .line 127
    :cond_2
    new-instance p1, Lcom/zykj/paint/render/SketchViewer$ProgressTask;

    .line 128
    .line 129
    invoke-direct {p1, p0}, Lcom/zykj/paint/render/SketchViewer$ProgressTask;-><init>(Lcom/zykj/paint/render/SketchViewer;)V

    .line 130
    .line 131
    .line 132
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->progressTask:Lcom/zykj/paint/render/SketchViewer$ProgressTask;

    .line 133
    .line 134
    new-instance v0, Ljava/util/Timer;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 137
    .line 138
    .line 139
    iput-object v0, p0, Lcom/zykj/paint/render/SketchViewer;->timer:Ljava/util/Timer;

    .line 140
    .line 141
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer;->progressTask:Lcom/zykj/paint/render/SketchViewer$ProgressTask;

    .line 142
    .line 143
    const-wide/16 v2, 0x1f4

    .line 144
    .line 145
    const-wide/16 v4, 0x3e8

    .line 146
    .line 147
    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 148
    .line 149
    .line 150
    new-instance p1, Lcom/zykj/paint/render/a;

    .line 151
    .line 152
    invoke-direct {p1, p0}, Lcom/zykj/paint/render/a;-><init>(Lcom/zykj/paint/render/SketchViewer;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 156
    .line 157
    .line 158
    const-string p1, "SketchViewer"

    .line 159
    .line 160
    const-string p2, "setDataSource-->"

    .line 161
    .line 162
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    return-void
.end method

.method public setPlayStatusListener(Lcom/zykj/paint/player/PlayStatusListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer;->playStatusListener:Lcom/zykj/paint/player/PlayStatusListener;

    .line 2
    .line 3
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 4

    .line 1
    const-string v0, "SketchViewer"

    .line 2
    .line 3
    const-string v1, "surfaceCreated-->"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/zykj/paint/render/SketchViewer;->mIsDrawing:Z

    .line 10
    .line 11
    iget-boolean v1, p0, Lcom/zykj/paint/render/SketchViewer;->isBackgroudPlaced:Z

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/zykj/paint/render/SketchViewer;->isBackgroudPlaced:Z

    .line 16
    .line 17
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->lockCanvas()Landroid/graphics/Canvas;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, -0x1

    .line 22
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-wide v0, p0, Lcom/zykj/paint/render/SketchViewer;->timeRecord:J

    .line 29
    .line 30
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    cmp-long p1, v0, v2

    .line 33
    .line 34
    if-lez p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/paint/render/SketchViewer;->renderAll()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-direct {p0}, Lcom/zykj/paint/render/SketchViewer;->renderTemp()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1
    const-string p1, "SketchViewer"

    .line 2
    .line 3
    const-string v0, "surfaceDestroyed-->"

    .line 4
    .line 5
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/zykj/paint/render/SketchViewer;->mIsDrawing:Z

    .line 10
    .line 11
    return-void
.end method
