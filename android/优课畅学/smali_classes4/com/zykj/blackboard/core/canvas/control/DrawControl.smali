.class public final Lcom/zykj/blackboard/core/canvas/control/DrawControl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private activeLayerBitmap:Landroid/graphics/Bitmap;

.field private activeLayerCanvas:Landroid/graphics/Canvas;

.field private final boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

.field private final boardPaint:Landroid/graphics/Paint;

.field private cameraBitmap:Landroid/graphics/Bitmap;

.field private cameraCanvas:Landroid/graphics/Canvas;

.field private final cameraRenderRectF:Landroid/graphics/RectF;

.field private drawLimitRectF:Landroid/graphics/RectF;

.field private fixLayerBitmap:Landroid/graphics/Bitmap;

.field private fixLayerCanvas:Landroid/graphics/Canvas;

.field private matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

.field private final newSelectDrawControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;

.field private final oldPageRectF:Landroid/graphics/RectF;

.field private final renderChangeListener:Lcom/zykj/blackboard/core/canvas/control/DrawControl$renderChangeListener$1;

.field private renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

.field private final renderLayerRect:Landroid/graphics/Rect;

.field private snapshotBitmap:Landroid/graphics/Bitmap;

.field private final tempMatrix:Landroid/graphics/Matrix;

.field private final tempRenderLimitRectF:Landroid/graphics/RectF;

.field private final translateMatrix:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 2

    .line 1
    const-string v0, "boardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->oldPageRectF:Landroid/graphics/RectF;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/RectF;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawLimitRectF:Landroid/graphics/RectF;

    .line 24
    .line 25
    new-instance v0, Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 31
    .line 32
    new-instance v0, Landroid/graphics/RectF;

    .line 33
    .line 34
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 38
    .line 39
    new-instance v0, Landroid/graphics/Matrix;

    .line 40
    .line 41
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->translateMatrix:Landroid/graphics/Matrix;

    .line 45
    .line 46
    new-instance v0, Landroid/graphics/RectF;

    .line 47
    .line 48
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempRenderLimitRectF:Landroid/graphics/RectF;

    .line 52
    .line 53
    new-instance v0, Landroid/graphics/Matrix;

    .line 54
    .line 55
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 59
    .line 60
    new-instance v0, Landroid/graphics/Paint;

    .line 61
    .line 62
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 63
    .line 64
    .line 65
    const v1, -0xffff01

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 69
    .line 70
    .line 71
    const/high16 v1, 0x40a00000    # 5.0f

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 74
    .line 75
    .line 76
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 79
    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 89
    .line 90
    new-instance v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl$renderChangeListener$1;

    .line 91
    .line 92
    invoke-direct {v0, p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl$renderChangeListener$1;-><init>(Lcom/zykj/blackboard/core/canvas/control/DrawControl;)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderChangeListener:Lcom/zykj/blackboard/core/canvas/control/DrawControl$renderChangeListener$1;

    .line 96
    .line 97
    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;

    .line 98
    .line 99
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;-><init>(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->newSelectDrawControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;

    .line 103
    .line 104
    return-void
.end method

.method public static final synthetic access$drawMaskLayer(Lcom/zykj/blackboard/core/canvas/control/DrawControl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawMaskLayer()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setActiveLayerBitmap$p(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setCameraBitmap$p(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setFixLayerBitmap$p(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setSnapshotBitmap$p(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->snapshotBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method

.method private final checkActiveLayer()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerBitmap:Landroid/graphics/Bitmap;

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerBitmap:Landroid/graphics/Bitmap;

    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eq v0, v1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void

    .line 50
    :cond_1
    :goto_0
    new-instance v0, Landroid/graphics/RectF;

    .line 51
    .line 52
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->initActiveLayer(Landroid/graphics/RectF;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private final clearActiveBitmapAndCanvas()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerBitmap:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 12
    .line 13
    return-void
.end method

.method private final drawActiveLayer(Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v1, v0, p1}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->draw(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public static synthetic drawActiveLayer$default(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Matrix;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer(Landroid/graphics/Matrix;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getBackgroundLayer()Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1, p2}, Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;->drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static synthetic drawBackground$default(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    new-instance p2, Landroid/graphics/Matrix;

    .line 6
    .line 7
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private final drawFixLayer()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getFixLayer()Lcom/zykj/blackboard/core/canvas/view/FixLayer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v1, v0}, Lcom/zykj/blackboard/core/canvas/view/FixLayer;->draw(Landroid/graphics/Bitmap;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method private final drawMaskLayer()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->oldPageRectF:Landroid/graphics/RectF;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->oldPageRectF:Landroid/graphics/RectF;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->oldPageRectF:Landroid/graphics/RectF;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getRenderRect()Landroid/graphics/Rect;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object v0, v1

    .line 55
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    int-to-float v0, v0

    .line 63
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getRenderRect()Landroid/graphics/Rect;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    int-to-float v1, v1

    .line 89
    :goto_1
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawLimitRectF:Landroid/graphics/RectF;

    .line 90
    .line 91
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 92
    .line 93
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    int-to-float v3, v3

    .line 102
    mul-float/2addr v0, v3

    .line 103
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 104
    .line 105
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    int-to-float v3, v3

    .line 114
    mul-float/2addr v1, v3

    .line 115
    const/4 v3, 0x0

    .line 116
    invoke-virtual {v2, v3, v3, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawLimitRectF:Landroid/graphics/RectF;

    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 123
    .line 124
    .line 125
    :goto_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawLimitRectF:Landroid/graphics/RectF;

    .line 126
    .line 127
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_4

    .line 132
    .line 133
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 134
    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getMaskLayer()Lcom/zykj/blackboard/core/canvas/view/MaskLayer;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_8

    .line 142
    .line 143
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/view/MaskLayer;->hide()V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_4
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempRenderLimitRectF:Landroid/graphics/RectF;

    .line 148
    .line 149
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawLimitRectF:Landroid/graphics/RectF;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 155
    .line 156
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 157
    .line 158
    .line 159
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 160
    .line 161
    if-eqz v1, :cond_6

    .line 162
    .line 163
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->oldPageRectF:Landroid/graphics/RectF;

    .line 164
    .line 165
    invoke-virtual {v2}, Landroid/graphics/RectF;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_5

    .line 170
    .line 171
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-static {v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 195
    .line 196
    .line 197
    :cond_6
    :goto_3
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 198
    .line 199
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempRenderLimitRectF:Landroid/graphics/RectF;

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 202
    .line 203
    .line 204
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempRenderLimitRectF:Landroid/graphics/RectF;

    .line 205
    .line 206
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 207
    .line 208
    invoke-static {v1}, Lcom/zykj/blackboard/utils/RectExtKt;->toRectF(Landroid/graphics/Rect;)Landroid/graphics/RectF;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-nez v0, :cond_7

    .line 217
    .line 218
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 219
    .line 220
    if-eqz v0, :cond_8

    .line 221
    .line 222
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getMaskLayer()Lcom/zykj/blackboard/core/canvas/view/MaskLayer;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-eqz v0, :cond_8

    .line 227
    .line 228
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/view/MaskLayer;->hide()V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :cond_7
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 233
    .line 234
    if-eqz v0, :cond_8

    .line 235
    .line 236
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getMaskLayer()Lcom/zykj/blackboard/core/canvas/view/MaskLayer;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    if-eqz v0, :cond_8

    .line 241
    .line 242
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/view/MaskLayer;->show()V

    .line 243
    .line 244
    .line 245
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempRenderLimitRectF:Landroid/graphics/RectF;

    .line 246
    .line 247
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/core/canvas/view/MaskLayer;->changeClipRectF(Landroid/graphics/RectF;)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/view/MaskLayer;->refresh()V

    .line 251
    .line 252
    .line 253
    :cond_8
    return-void
.end method

.method public static synthetic drawPath$default(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic getMinScreenShot$default(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Lcom/zykj/blackboard/core/graph/IGraph;IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;ILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    and-int/lit8 p11, p10, 0x20

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p11, :cond_0

    .line 5
    .line 6
    move p6, v0

    .line 7
    :cond_0
    and-int/lit8 p11, p10, 0x40

    .line 8
    .line 9
    if-eqz p11, :cond_1

    .line 10
    .line 11
    move p7, v0

    .line 12
    :cond_1
    and-int/lit16 p11, p10, 0x80

    .line 13
    .line 14
    if-eqz p11, :cond_2

    .line 15
    .line 16
    move p8, v0

    .line 17
    :cond_2
    and-int/lit16 p10, p10, 0x100

    .line 18
    .line 19
    if-eqz p10, :cond_3

    .line 20
    .line 21
    const/4 p9, 0x0

    .line 22
    :cond_3
    invoke-virtual/range {p0 .. p9}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getMinScreenShot(Lcom/zykj/blackboard/core/graph/IGraph;IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method private final initActiveLayer(Landroid/graphics/RectF;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    float-to-int v0, v0

    .line 20
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    float-to-int p1, p1

    .line 25
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 26
    .line 27
    invoke-static {v0, p1, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerBitmap:Landroid/graphics/Bitmap;

    .line 32
    .line 33
    new-instance p1, Landroid/graphics/Canvas;

    .line 34
    .line 35
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerBitmap:Landroid/graphics/Bitmap;

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 44
    .line 45
    return-void
.end method

.method private final initCameraBitmap(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 26
    .line 27
    iget-object v4, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :cond_0
    invoke-interface {v2, v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v2}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraBitmap:Landroid/graphics/Bitmap;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    float-to-int v0, v0

    .line 65
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    float-to-int v1, v1

    .line 72
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 73
    .line 74
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraBitmap:Landroid/graphics/Bitmap;

    .line 79
    .line 80
    new-instance v0, Landroid/graphics/Canvas;

    .line 81
    .line 82
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraBitmap:Landroid/graphics/Bitmap;

    .line 83
    .line 84
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraCanvas:Landroid/graphics/Canvas;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    iput-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraBitmap:Landroid/graphics/Bitmap;

    .line 94
    .line 95
    iput-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraCanvas:Landroid/graphics/Canvas;

    .line 96
    .line 97
    :goto_1
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraCanvas:Landroid/graphics/Canvas;

    .line 98
    .line 99
    if-eqz v3, :cond_6

    .line 100
    .line 101
    invoke-virtual {v3}, Landroid/graphics/Canvas;->save()I

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 105
    .line 106
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 107
    .line 108
    neg-float v1, v1

    .line 109
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 110
    .line 111
    neg-float v0, v0

    .line 112
    invoke-virtual {v3, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 116
    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-nez v0, :cond_4

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_4
    :goto_2
    move-object v4, v0

    .line 127
    goto :goto_4

    .line 128
    :cond_5
    :goto_3
    new-instance v0, Landroid/graphics/Matrix;

    .line 129
    .line 130
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :goto_4
    const/16 v8, 0xc

    .line 135
    .line 136
    const/4 v9, 0x0

    .line 137
    const/4 v5, 0x0

    .line 138
    const/4 v6, 0x0

    .line 139
    const/4 v7, 0x1

    .line 140
    move-object v2, p1

    .line 141
    invoke-static/range {v2 .. v9}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    .line 145
    .line 146
    .line 147
    :cond_6
    return-void
.end method

.method public static synthetic newSelect$default(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;ILjava/lang/Object;)V
    .locals 7

    .line 1
    and-int/lit8 p7, p7, 0x20

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p6, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    move-object v5, p5

    .line 12
    move-object v6, p6

    .line 13
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->newSelect(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final add(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 2

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {p1, v0, v1}, Lcom/zykj/blackboard/core/graph/IDraw;->render(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const-string p1, "DrawView"

    .line 22
    .line 23
    const-string v0, "\u5f00\u59cb\u7ed8\u5236"

    .line 24
    .line 25
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawFixLayer()V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->clear()V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public final cameraChangeEnd(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 9

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-static {v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControlKt;->clear(Landroid/graphics/Canvas;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const/16 v7, 0xc

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    move-object v1, p1

    .line 33
    invoke-static/range {v1 .. v8}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawFixLayer()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->clearActiveBitmapAndCanvas()V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->clear()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->checkActiveLayer()V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 68
    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 73
    .line 74
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    const/4 p1, 0x1

    .line 78
    const/4 v0, 0x0

    .line 79
    invoke-static {p0, v0, p1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer$default(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 83
    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_4

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->updateBackgroundMatrix(Landroid/graphics/Matrix;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    return-void
.end method

.method public final cameraChangeStart(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 6

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->initCameraBitmap(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->translateMatrix:Landroid/graphics/Matrix;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 21
    .line 22
    iget v2, v0, Landroid/graphics/RectF;->left:F

    .line 23
    .line 24
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 25
    .line 26
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraBitmap:Landroid/graphics/Bitmap;

    .line 30
    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 34
    .line 35
    new-instance v2, Landroid/graphics/RectF;

    .line 36
    .line 37
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 38
    .line 39
    invoke-direct {v2, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/graphics/RectF;->contains(Landroid/graphics/RectF;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 49
    .line 50
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 51
    .line 52
    neg-float v2, v0

    .line 53
    const/4 v3, 0x0

    .line 54
    cmpl-float v2, v2, v3

    .line 55
    .line 56
    if-ltz v2, :cond_0

    .line 57
    .line 58
    neg-float v0, v0

    .line 59
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    int-to-float v2, v2

    .line 64
    cmpg-float v0, v0, v2

    .line 65
    .line 66
    if-gtz v0, :cond_0

    .line 67
    .line 68
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 69
    .line 70
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 71
    .line 72
    neg-float v2, v0

    .line 73
    cmpl-float v2, v2, v3

    .line 74
    .line 75
    if-ltz v2, :cond_0

    .line 76
    .line 77
    neg-float v0, v0

    .line 78
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    int-to-float v2, v2

    .line 83
    cmpg-float v0, v0, v2

    .line 84
    .line 85
    if-gtz v0, :cond_0

    .line 86
    .line 87
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 88
    .line 89
    iget v2, v0, Landroid/graphics/RectF;->left:F

    .line 90
    .line 91
    float-to-int v2, v2

    .line 92
    neg-int v2, v2

    .line 93
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 94
    .line 95
    float-to-int v0, v0

    .line 96
    neg-int v0, v0

    .line 97
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    iget-object v4, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 102
    .line 103
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 104
    .line 105
    float-to-int v4, v4

    .line 106
    add-int/2addr v3, v4

    .line 107
    iget-object v4, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 108
    .line 109
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    iget-object v5, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 122
    .line 123
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 124
    .line 125
    float-to-int v5, v5

    .line 126
    add-int/2addr v4, v5

    .line 127
    iget-object v5, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 128
    .line 129
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    invoke-static {p1, v2, v0, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 142
    .line 143
    if-eqz v0, :cond_4

    .line 144
    .line 145
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-eqz v0, :cond_4

    .line 150
    .line 151
    const-string v2, "bitmap"

    .line 152
    .line 153
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v0, p1, v1}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->draw(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 161
    .line 162
    if-eqz p1, :cond_4

    .line 163
    .line 164
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-eqz p1, :cond_4

    .line 169
    .line 170
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->clear()V

    .line 171
    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 175
    .line 176
    if-eqz v0, :cond_4

    .line 177
    .line 178
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-eqz v0, :cond_4

    .line 183
    .line 184
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->translateMatrix:Landroid/graphics/Matrix;

    .line 185
    .line 186
    invoke-interface {v0, p1, v1}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->draw(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 187
    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_2
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->checkActiveLayer()V

    .line 191
    .line 192
    .line 193
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 194
    .line 195
    if-eqz p1, :cond_3

    .line 196
    .line 197
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerBitmap:Landroid/graphics/Bitmap;

    .line 198
    .line 199
    if-eqz v0, :cond_3

    .line 200
    .line 201
    sget-object v2, Lcom/zykj/blackboard/utils/CanvasUtils;->INSTANCE:Lcom/zykj/blackboard/utils/CanvasUtils;

    .line 202
    .line 203
    new-instance v3, Landroid/graphics/Matrix;

    .line 204
    .line 205
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, p1, v0, v3}, Lcom/zykj/blackboard/utils/CanvasUtils;->drawLargeBitmap(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 209
    .line 210
    .line 211
    :cond_3
    const/4 p1, 0x1

    .line 212
    invoke-static {p0, v1, p1, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer$default(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 216
    .line 217
    if-eqz p1, :cond_5

    .line 218
    .line 219
    invoke-static {p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControlKt;->clear(Landroid/graphics/Canvas;)V

    .line 220
    .line 221
    .line 222
    :cond_5
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawFixLayer()V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public final cameraChanging(Landroid/graphics/Matrix;)V
    .locals 7

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->translateMatrix:Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    new-array v0, v0, [F

    .line 26
    .line 27
    fill-array-data v0, :array_0

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    aget v3, v0, v2

    .line 42
    .line 43
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v3, "  "

    .line 47
    .line 48
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    aget v4, v0, v3

    .line 53
    .line 54
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v4, "cameraChanging"

    .line 62
    .line 63
    invoke-static {v4, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraBitmap:Landroid/graphics/Bitmap;

    .line 67
    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    iget-object v4, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraRenderRectF:Landroid/graphics/RectF;

    .line 71
    .line 72
    new-instance v5, Landroid/graphics/RectF;

    .line 73
    .line 74
    iget-object v6, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 75
    .line 76
    invoke-direct {v5, v6}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v5}, Landroid/graphics/RectF;->contains(Landroid/graphics/RectF;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_1

    .line 84
    .line 85
    aget v4, v0, v2

    .line 86
    .line 87
    neg-float v5, v4

    .line 88
    const/4 v6, 0x0

    .line 89
    cmpl-float v5, v5, v6

    .line 90
    .line 91
    if-ltz v5, :cond_0

    .line 92
    .line 93
    neg-float v4, v4

    .line 94
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    int-to-float v5, v5

    .line 99
    cmpg-float v4, v4, v5

    .line 100
    .line 101
    if-gtz v4, :cond_0

    .line 102
    .line 103
    aget v4, v0, v3

    .line 104
    .line 105
    neg-float v5, v4

    .line 106
    cmpl-float v5, v5, v6

    .line 107
    .line 108
    if-ltz v5, :cond_0

    .line 109
    .line 110
    neg-float v4, v4

    .line 111
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    int-to-float v5, v5

    .line 116
    cmpg-float v4, v4, v5

    .line 117
    .line 118
    if-gtz v4, :cond_0

    .line 119
    .line 120
    aget v4, v0, v2

    .line 121
    .line 122
    float-to-int v4, v4

    .line 123
    neg-int v4, v4

    .line 124
    aget v5, v0, v3

    .line 125
    .line 126
    float-to-int v5, v5

    .line 127
    neg-int v5, v5

    .line 128
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    aget v2, v0, v2

    .line 133
    .line 134
    float-to-int v2, v2

    .line 135
    add-int/2addr v6, v2

    .line 136
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 137
    .line 138
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    invoke-static {v6, v2}, Ljava/lang/Math;->min(II)I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    aget v0, v0, v3

    .line 151
    .line 152
    float-to-int v0, v0

    .line 153
    add-int/2addr v6, v0

    .line 154
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 155
    .line 156
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    invoke-static {v6, v0}, Ljava/lang/Math;->min(II)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-static {v1, v4, v5, v2, v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 169
    .line 170
    if-eqz v1, :cond_3

    .line 171
    .line 172
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-eqz v1, :cond_3

    .line 177
    .line 178
    const-string v2, "bitmap"

    .line 179
    .line 180
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    const/4 v2, 0x0

    .line 184
    invoke-interface {v1, v0, v2}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->draw(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 185
    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 189
    .line 190
    if-eqz v0, :cond_3

    .line 191
    .line 192
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    if-eqz v0, :cond_3

    .line 197
    .line 198
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->clear()V

    .line 199
    .line 200
    .line 201
    goto :goto_0

    .line 202
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 203
    .line 204
    if-eqz v0, :cond_3

    .line 205
    .line 206
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-eqz v0, :cond_3

    .line 211
    .line 212
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 213
    .line 214
    invoke-interface {v0, v1, v2}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->draw(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_2
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer(Landroid/graphics/Matrix;)V

    .line 219
    .line 220
    .line 221
    :cond_3
    :goto_0
    new-instance v0, Landroid/graphics/Matrix;

    .line 222
    .line 223
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 224
    .line 225
    .line 226
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 227
    .line 228
    if-eqz v1, :cond_4

    .line 229
    .line 230
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 245
    .line 246
    .line 247
    :cond_4
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->updateBackgroundMatrix(Landroid/graphics/Matrix;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public final contentThumbnail(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;
    .locals 7

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 31
    .line 32
    iget-object v4, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    :cond_0
    invoke-interface {v2, v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v2}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance v1, Landroid/graphics/RectF;

    .line 49
    .line 50
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getFixLayer()Lcom/zykj/blackboard/core/canvas/view/FixLayer;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-interface {v2}, Lcom/zykj/blackboard/core/canvas/view/FixLayer;->rect()Landroid/graphics/Rect;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move-object v2, v3

    .line 66
    :goto_1
    invoke-direct {v1, v2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 67
    .line 68
    .line 69
    new-instance v2, Landroid/graphics/RectF;

    .line 70
    .line 71
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 72
    .line 73
    .line 74
    iget-object v4, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 75
    .line 76
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_3

    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    iget-object v5, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 91
    .line 92
    invoke-virtual {v5}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v5}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    int-to-float v5, v5

    .line 101
    mul-float/2addr v4, v5

    .line 102
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    iget-object v6, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 107
    .line 108
    invoke-virtual {v6}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v6}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    int-to-float v6, v6

    .line 117
    mul-float/2addr v5, v6

    .line 118
    const/4 v6, 0x0

    .line 119
    invoke-virtual {v2, v6, v6, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    invoke-virtual {v2, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 124
    .line 125
    .line 126
    :goto_2
    iget v4, v2, Landroid/graphics/RectF;->bottom:F

    .line 127
    .line 128
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 129
    .line 130
    invoke-static {v4, v0}, Ljava/lang/Math;->min(FF)F

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    iput v0, v2, Landroid/graphics/RectF;->bottom:F

    .line 135
    .line 136
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 137
    .line 138
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    iput v0, v2, Landroid/graphics/RectF;->bottom:F

    .line 143
    .line 144
    invoke-virtual {v2}, Landroid/graphics/RectF;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_4

    .line 149
    .line 150
    return-object v3

    .line 151
    :cond_4
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    float-to-int v0, v0

    .line 156
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    float-to-int v1, v1

    .line 161
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 162
    .line 163
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    new-instance v2, Landroid/graphics/Canvas;

    .line 168
    .line 169
    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 170
    .line 171
    .line 172
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 173
    .line 174
    if-eqz v1, :cond_5

    .line 175
    .line 176
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    if-eqz v3, :cond_5

    .line 181
    .line 182
    invoke-direct {p0, v2, v3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 183
    .line 184
    .line 185
    const/4 v5, 0x0

    .line 186
    const/4 v6, 0x1

    .line 187
    const/4 v4, 0x0

    .line 188
    move-object v1, p1

    .line 189
    invoke-interface/range {v1 .. v6}, Lcom/zykj/blackboard/core/graph/IDraw;->onDraw(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZ)V

    .line 190
    .line 191
    .line 192
    :cond_5
    return-object v0
.end method

.method public final delete(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 9

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 7
    .line 8
    if-eqz v2, :cond_2

    .line 9
    .line 10
    invoke-static {v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControlKt;->clear(Landroid/graphics/Canvas;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    move-object v3, v0

    .line 25
    goto :goto_2

    .line 26
    :cond_1
    :goto_1
    new-instance v0, Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    const/16 v7, 0xc

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    move-object v1, p1

    .line 44
    invoke-static/range {v1 .. v8}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawFixLayer()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final drawGraphInActive(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 7
    .line 8
    if-eqz v2, :cond_2

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v1, v0

    .line 25
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_0
    :goto_1
    move-object v3, v0

    .line 39
    goto :goto_3

    .line 40
    :cond_1
    :goto_2
    new-instance v0, Landroid/graphics/Matrix;

    .line 41
    .line 42
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :goto_3
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    const/16 v7, 0xc

    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-static/range {v1 .. v8}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const/4 p1, 0x1

    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-static {p0, v0, p1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer$default(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final drawGraphInFix(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 7
    .line 8
    if-eqz v2, :cond_2

    .line 9
    .line 10
    invoke-static {v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControlKt;->clear(Landroid/graphics/Canvas;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v1, v0

    .line 28
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_0
    :goto_1
    move-object v3, v0

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    :goto_2
    new-instance v0, Landroid/graphics/Matrix;

    .line 44
    .line 45
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :goto_3
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    const/16 v7, 0xc

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v4, 0x0

    .line 59
    const/4 v5, 0x0

    .line 60
    invoke-static/range {v1 .. v8}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawFixLayer()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {v0, p1, p2, p3}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->draw(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final getBackgroundColor()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getBackgroundLayer()Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;->getMyBackgroundColor()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0

    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundColorOutside()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    return v0
.end method

.method public final getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getBackgroundLayer()Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object v0

    .line 19
    :cond_1
    :goto_0
    new-instance v1, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 20
    .line 21
    const/16 v6, 0xf

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;FILkotlin/jvm/internal/n;)V

    .line 29
    .line 30
    .line 31
    return-object v1
.end method

.method public final getMinScreenShot(Lcom/zykj/blackboard/core/graph/IGraph;IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;
    .locals 10

    move-object/from16 v2, p9

    const-string v3, "graph"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 2
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    move-result-object v4

    .line 3
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 4
    invoke-static {v5, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 5
    iget-object v7, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    move-result-object v6

    :cond_1
    invoke-interface {v5, v6}, Lcom/zykj/blackboard/core/graph/IGraph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    goto :goto_0

    .line 6
    :cond_2
    iget v4, v3, Landroid/graphics/RectF;->left:F

    int-to-float p2, p2

    sub-float/2addr v4, p2

    iput v4, v3, Landroid/graphics/RectF;->left:F

    .line 7
    iget v4, v3, Landroid/graphics/RectF;->right:F

    add-float/2addr v4, p2

    iput v4, v3, Landroid/graphics/RectF;->right:F

    .line 8
    iget p2, v3, Landroid/graphics/RectF;->top:F

    int-to-float p3, p3

    sub-float/2addr p2, p3

    iput p2, v3, Landroid/graphics/RectF;->top:F

    .line 9
    iget p2, v3, Landroid/graphics/RectF;->bottom:F

    add-float/2addr p2, p3

    iput p2, v3, Landroid/graphics/RectF;->bottom:F

    .line 10
    new-instance p2, Landroid/graphics/RectF;

    iget-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getFixLayer()Lcom/zykj/blackboard/core/canvas/view/FixLayer;

    move-result-object p3

    if-eqz p3, :cond_3

    invoke-interface {p3}, Lcom/zykj/blackboard/core/canvas/view/FixLayer;->rect()Landroid/graphics/Rect;

    move-result-object p3

    goto :goto_1

    :cond_3
    move-object p3, v6

    :goto_1
    invoke-direct {p2, p3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 11
    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    .line 12
    iget-object v4, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    move-result-object v4

    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_5

    .line 13
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v4

    iget-object v7, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    invoke-virtual {v7}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    move-result-object v7

    invoke-virtual {v7}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v4, v7

    .line 14
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result v7

    iget-object v8, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    invoke-virtual {v8}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    move-result-object v8

    invoke-virtual {v8}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    move-result v8

    int-to-float v8, v8

    mul-float/2addr v7, v8

    .line 15
    invoke-virtual {p3, v5, v5, v4, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 16
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 17
    iget-object v7, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    if-eqz v7, :cond_4

    .line 18
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    move-result-object v8

    invoke-static {v8}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    move-result-object v8

    invoke-virtual {v4, v8}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 19
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 20
    :cond_4
    invoke-virtual {v4, p3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    goto :goto_2

    .line 21
    :cond_5
    invoke-virtual {p3}, Landroid/graphics/RectF;->setEmpty()V

    .line 22
    :goto_2
    iget-object v4, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v4, p2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    :cond_6
    if-eqz p7, :cond_7

    .line 23
    invoke-virtual {p3}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_7

    .line 24
    invoke-virtual {p2, p3}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 25
    invoke-virtual {v3, p3}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 26
    :cond_7
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 27
    iget-object v7, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    if-eqz v7, :cond_8

    .line 28
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 29
    :cond_8
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v7

    float-to-int v7, v7

    .line 30
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v8

    float-to-int v8, v8

    const/4 v9, 0x2

    if-eqz p6, :cond_9

    .line 31
    iget v0, p2, Landroid/graphics/RectF;->left:F

    neg-float v0, v0

    invoke-virtual {v4, v0, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 32
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result p2

    float-to-int p2, p2

    move v7, p2

    goto :goto_3

    :cond_9
    if-ge v7, p4, :cond_a

    sub-int p2, p4, v7

    int-to-float p2, p2

    int-to-float v7, v9

    div-float/2addr p2, v7

    .line 33
    iget v7, v3, Landroid/graphics/RectF;->left:F

    sub-float/2addr p2, v7

    invoke-virtual {v4, p2, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    move v7, p4

    goto :goto_3

    .line 34
    :cond_a
    iget p2, v3, Landroid/graphics/RectF;->left:F

    neg-float p2, p2

    invoke-virtual {v4, p2, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    :goto_3
    if-eqz p8, :cond_b

    .line 35
    invoke-virtual {p3}, Landroid/graphics/RectF;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_b

    .line 36
    iget p2, p3, Landroid/graphics/RectF;->top:F

    neg-float p2, p2

    invoke-virtual {v4, v5, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 37
    iget p2, v3, Landroid/graphics/RectF;->bottom:F

    iget p3, p3, Landroid/graphics/RectF;->top:F

    sub-float/2addr p2, p3

    float-to-int p2, p2

    goto :goto_4

    :cond_b
    if-ge v8, p5, :cond_c

    sub-int p2, p5, v8

    int-to-float p2, p2

    int-to-float p3, v9

    div-float/2addr p2, p3

    .line 38
    iget p3, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr p2, p3

    invoke-virtual {v4, v5, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    move p2, p5

    goto :goto_4

    .line 39
    :cond_c
    iget p2, v3, Landroid/graphics/RectF;->top:F

    neg-float p2, p2

    invoke-virtual {v4, v5, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    move p2, v8

    :goto_4
    if-lez v7, :cond_f

    if-gtz p2, :cond_d

    goto :goto_5

    .line 40
    :cond_d
    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v7, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->snapshotBitmap:Landroid/graphics/Bitmap;

    if-eqz p2, :cond_e

    .line 41
    new-instance p3, Landroid/graphics/Canvas;

    invoke-direct {p3, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 42
    invoke-direct {p0, p3, v4}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 43
    new-instance p2, Lcom/zykj/blackboard/core/canvas/control/DrawControl$getMinScreenShot$1$1;

    invoke-direct {p2, v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl$getMinScreenShot$1$1;-><init>(Lcom/zykj/blackboard/core/graph/IGraph;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    move-object p4, p1

    move-object/from16 p7, p2

    move-object p5, p3

    move/from16 p8, v0

    move/from16 p9, v1

    move-object/from16 p6, v4

    invoke-interface/range {p4 .. p9}, Lcom/zykj/blackboard/core/graph/IDraw;->onDraw(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZ)V

    .line 44
    :cond_e
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->snapshotBitmap:Landroid/graphics/Bitmap;

    return-object p1

    :cond_f
    :goto_5
    return-object v6
.end method

.method public final getOldPageRectF()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->oldPageRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final newSelect(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "selectRectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "selectFunctionRectF"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "functionRectF"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "typeList"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->newSelectDrawControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;

    .line 27
    .line 28
    invoke-virtual {v0, p1, p5, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->getSelectPath(Landroid/graphics/RectF;Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Path;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/4 p2, 0x0

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    new-instance p1, Landroid/graphics/RectF;

    .line 42
    .line 43
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, p1, p2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 47
    .line 48
    .line 49
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 50
    .line 51
    const/high16 v1, 0x40400000    # 3.0f

    .line 52
    .line 53
    sub-float/2addr v0, v1

    .line 54
    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 55
    .line 56
    iget v0, p1, Landroid/graphics/RectF;->top:F

    .line 57
    .line 58
    sub-float/2addr v0, v1

    .line 59
    iput v0, p1, Landroid/graphics/RectF;->top:F

    .line 60
    .line 61
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 62
    .line 63
    add-float/2addr v0, v1

    .line 64
    iput v0, p1, Landroid/graphics/RectF;->right:F

    .line 65
    .line 66
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 67
    .line 68
    add-float/2addr v0, v1

    .line 69
    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 70
    .line 71
    new-instance v0, Landroid/graphics/RectF;

    .line 72
    .line 73
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->initActiveLayer(Landroid/graphics/RectF;)V

    .line 83
    .line 84
    .line 85
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 86
    .line 87
    if-eqz v2, :cond_0

    .line 88
    .line 89
    sget-object p1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 90
    .line 91
    invoke-virtual {v2, p2, p1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 95
    .line 96
    .line 97
    iget p1, v0, Landroid/graphics/RectF;->left:F

    .line 98
    .line 99
    neg-float p1, p1

    .line 100
    iget p2, v0, Landroid/graphics/RectF;->top:F

    .line 101
    .line 102
    neg-float p2, p2

    .line 103
    invoke-virtual {v2, p1, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->newSelectDrawControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;

    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getBackgroundColor()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    move-object v5, p4

    .line 113
    move-object v6, p5

    .line 114
    move-object v7, p6

    .line 115
    invoke-virtual/range {v1 .. v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawSelect(Landroid/graphics/Canvas;ILandroid/graphics/Path;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 119
    .line 120
    .line 121
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 122
    .line 123
    iget p2, v0, Landroid/graphics/RectF;->left:F

    .line 124
    .line 125
    iget p3, v0, Landroid/graphics/RectF;->top:F

    .line 126
    .line 127
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 131
    .line 132
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer(Landroid/graphics/Matrix;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_1
    move-object v5, p4

    .line 137
    move-object v6, p5

    .line 138
    move-object v7, p6

    .line 139
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->checkActiveLayer()V

    .line 140
    .line 141
    .line 142
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 143
    .line 144
    if-eqz v2, :cond_2

    .line 145
    .line 146
    sget-object p1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 147
    .line 148
    invoke-virtual {v2, p2, p1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->newSelectDrawControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;

    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getBackgroundColor()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    invoke-virtual/range {v1 .. v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawSelect(Landroid/graphics/Canvas;ILandroid/graphics/Path;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 158
    .line 159
    .line 160
    :cond_2
    const/4 p1, 0x1

    .line 161
    const/4 p2, 0x0

    .line 162
    invoke-static {p0, p2, p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer$default(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    return-void
.end method

.method public final newSelecting(FFFF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->newSelectDrawControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;

    .line 12
    .line 13
    invoke-virtual {v1, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawSelectingPath(FFFF)Landroid/graphics/Path;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->newSelectDrawControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getBackgroundColor()I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    invoke-virtual {p2, p3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawSelectingPaint(I)Landroid/graphics/Paint;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 p3, 0x0

    .line 28
    invoke-interface {v0, p1, p2, p3}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->draw(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final newTextHandleEnd(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "selectRectF"

    .line 7
    .line 8
    move-object/from16 v9, p2

    .line 9
    .line 10
    invoke-static {v9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "matrix"

    .line 14
    .line 15
    move-object/from16 v10, p3

    .line 16
    .line 17
    invoke-static {v10, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "selectFunctionRectF"

    .line 21
    .line 22
    move-object/from16 v11, p4

    .line 23
    .line 24
    invoke-static {v11, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "functionRectF"

    .line 28
    .line 29
    move-object/from16 v12, p5

    .line 30
    .line 31
    invoke-static {v12, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v0, "typeList"

    .line 35
    .line 36
    move-object/from16 v13, p6

    .line 37
    .line 38
    invoke-static {v13, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-static {v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControlKt;->clear(Landroid/graphics/Canvas;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    const/16 v7, 0x8

    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x0

    .line 67
    move-object v1, p1

    .line 68
    invoke-static/range {v1 .. v8}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawFixLayer()V

    .line 72
    .line 73
    .line 74
    move-object v1, p0

    .line 75
    move-object/from16 v7, p7

    .line 76
    .line 77
    move-object v2, v9

    .line 78
    move-object v3, v10

    .line 79
    move-object v4, v11

    .line 80
    move-object v5, v12

    .line 81
    move-object v6, v13

    .line 82
    invoke-virtual/range {v1 .. v7}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->newSelect(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final newTextHandleStart(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "rootGraph"

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "textGraph"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v2, "selectRectF"

    .line 18
    .line 19
    move-object/from16 v11, p3

    .line 20
    .line 21
    invoke-static {v11, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v2, "matrix"

    .line 25
    .line 26
    move-object/from16 v12, p4

    .line 27
    .line 28
    invoke-static {v12, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v2, "selectFunctionRectF"

    .line 32
    .line 33
    move-object/from16 v13, p5

    .line 34
    .line 35
    invoke-static {v13, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v2, "functionRectF"

    .line 39
    .line 40
    move-object/from16 v14, p6

    .line 41
    .line 42
    invoke-static {v14, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v2, "typeList"

    .line 46
    .line 47
    move-object/from16 v15, p7

    .line 48
    .line 49
    invoke-static {v15, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v4, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 53
    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    invoke-static {v4}, Lcom/zykj/blackboard/core/canvas/control/DrawControlKt;->clear(Landroid/graphics/Canvas;)V

    .line 57
    .line 58
    .line 59
    iget-object v2, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 60
    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    new-instance v6, Lcom/zykj/blackboard/core/canvas/control/DrawControl$newTextHandleStart$1$1$1;

    .line 68
    .line 69
    invoke-direct {v6, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl$newTextHandleStart$1$1$1;-><init>(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 73
    .line 74
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    const/16 v9, 0x8

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v7, 0x0

    .line 82
    invoke-static/range {v3 .. v10}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_0
    invoke-direct {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawFixLayer()V

    .line 86
    .line 87
    .line 88
    move-object/from16 v7, p8

    .line 89
    .line 90
    move-object v2, v11

    .line 91
    move-object v3, v12

    .line 92
    move-object v4, v13

    .line 93
    move-object v5, v14

    .line 94
    move-object v6, v15

    .line 95
    invoke-virtual/range {v0 .. v7}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->newTextHandling(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final newTextHandling(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v6, p6

    .line 10
    .line 11
    const-string v4, "textGraph"

    .line 12
    .line 13
    move-object/from16 v5, p1

    .line 14
    .line 15
    invoke-static {v5, v4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v4, "selectRectF"

    .line 19
    .line 20
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v4, "matrix"

    .line 24
    .line 25
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v4, "selectFunctionRectF"

    .line 29
    .line 30
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v4, "functionRectF"

    .line 34
    .line 35
    move-object/from16 v15, p5

    .line 36
    .line 37
    invoke-static {v15, v4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v4, "typeList"

    .line 41
    .line 42
    invoke-static {v6, v4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v4, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->newSelectDrawControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;

    .line 46
    .line 47
    invoke-virtual {v4, v1, v6, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->getSelectPath(Landroid/graphics/RectF;Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Path;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-object v1, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    const/4 v2, 0x0

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    new-instance v1, Landroid/graphics/RectF;

    .line 61
    .line 62
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v1, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 66
    .line 67
    .line 68
    iget v7, v1, Landroid/graphics/RectF;->left:F

    .line 69
    .line 70
    const/high16 v8, 0x40400000    # 3.0f

    .line 71
    .line 72
    sub-float/2addr v7, v8

    .line 73
    iput v7, v1, Landroid/graphics/RectF;->left:F

    .line 74
    .line 75
    iget v7, v1, Landroid/graphics/RectF;->top:F

    .line 76
    .line 77
    sub-float/2addr v7, v8

    .line 78
    iput v7, v1, Landroid/graphics/RectF;->top:F

    .line 79
    .line 80
    iget v7, v1, Landroid/graphics/RectF;->right:F

    .line 81
    .line 82
    add-float/2addr v7, v8

    .line 83
    iput v7, v1, Landroid/graphics/RectF;->right:F

    .line 84
    .line 85
    iget v7, v1, Landroid/graphics/RectF;->bottom:F

    .line 86
    .line 87
    add-float/2addr v7, v8

    .line 88
    iput v7, v1, Landroid/graphics/RectF;->bottom:F

    .line 89
    .line 90
    new-instance v7, Landroid/graphics/RectF;

    .line 91
    .line 92
    invoke-direct {v7}, Landroid/graphics/RectF;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7, v1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v0, v7}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->initActiveLayer(Landroid/graphics/RectF;)V

    .line 102
    .line 103
    .line 104
    iget-object v8, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 105
    .line 106
    if-eqz v8, :cond_2

    .line 107
    .line 108
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 109
    .line 110
    invoke-virtual {v8, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8}, Landroid/graphics/Canvas;->save()I

    .line 114
    .line 115
    .line 116
    iget v1, v7, Landroid/graphics/RectF;->left:F

    .line 117
    .line 118
    neg-float v1, v1

    .line 119
    iget v2, v7, Landroid/graphics/RectF;->top:F

    .line 120
    .line 121
    neg-float v2, v2

    .line 122
    invoke-virtual {v8, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 123
    .line 124
    .line 125
    iget-object v1, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 126
    .line 127
    if-eqz v1, :cond_1

    .line 128
    .line 129
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-nez v1, :cond_0

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_0
    :goto_0
    move-object v9, v1

    .line 137
    goto :goto_2

    .line 138
    :cond_1
    :goto_1
    new-instance v1, Landroid/graphics/Matrix;

    .line 139
    .line 140
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :goto_2
    const/16 v13, 0xc

    .line 145
    .line 146
    const/4 v14, 0x0

    .line 147
    const/4 v10, 0x0

    .line 148
    const/4 v11, 0x0

    .line 149
    const/4 v12, 0x1

    .line 150
    move-object v1, v7

    .line 151
    move-object v7, v5

    .line 152
    invoke-static/range {v7 .. v14}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    move-object v2, v1

    .line 156
    iget-object v1, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->newSelectDrawControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;

    .line 157
    .line 158
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getBackgroundColor()I

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    move-object v5, v8

    .line 163
    move-object v8, v2

    .line 164
    move-object v2, v5

    .line 165
    move-object/from16 v7, p7

    .line 166
    .line 167
    move-object v5, v15

    .line 168
    invoke-virtual/range {v1 .. v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawSelect(Landroid/graphics/Canvas;ILandroid/graphics/Path;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_2
    move-object v8, v7

    .line 176
    :goto_3
    iget-object v1, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 177
    .line 178
    iget v2, v8, Landroid/graphics/RectF;->left:F

    .line 179
    .line 180
    iget v3, v8, Landroid/graphics/RectF;->top:F

    .line 181
    .line 182
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 183
    .line 184
    .line 185
    iget-object v1, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 186
    .line 187
    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer(Landroid/graphics/Matrix;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_3
    invoke-direct {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->checkActiveLayer()V

    .line 192
    .line 193
    .line 194
    iget-object v6, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 195
    .line 196
    if-eqz v6, :cond_5

    .line 197
    .line 198
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 199
    .line 200
    invoke-virtual {v6, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 201
    .line 202
    .line 203
    iget-object v1, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 204
    .line 205
    if-eqz v1, :cond_4

    .line 206
    .line 207
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    const/16 v11, 0x1c

    .line 212
    .line 213
    const/4 v12, 0x0

    .line 214
    const/4 v8, 0x0

    .line 215
    const/4 v9, 0x0

    .line 216
    const/4 v10, 0x0

    .line 217
    move-object/from16 v5, p1

    .line 218
    .line 219
    invoke-static/range {v5 .. v12}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    :cond_4
    move-object v2, v6

    .line 223
    iget-object v1, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->newSelectDrawControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;

    .line 224
    .line 225
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getBackgroundColor()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    move-object/from16 v5, p5

    .line 230
    .line 231
    move-object/from16 v6, p6

    .line 232
    .line 233
    move-object/from16 v7, p7

    .line 234
    .line 235
    invoke-virtual/range {v1 .. v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawSelect(Landroid/graphics/Canvas;ILandroid/graphics/Path;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 236
    .line 237
    .line 238
    :cond_5
    const/4 v1, 0x1

    .line 239
    const/4 v2, 0x0

    .line 240
    invoke-static {v0, v2, v1, v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer$default(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    return-void
.end method

.method public final refresh()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getFixLayer()Lcom/zykj/blackboard/core/canvas/view/FixLayer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/view/FixLayer;->refresh()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->refresh()V

    .line 25
    .line 26
    .line 27
    :cond_1
    const/4 v0, 0x1

    .line 28
    return v0
.end method

.method public final release()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 5
    .line 6
    sget-object v0, Lcom/zykj/blackboard/utils/BitmapUtil;->INSTANCE:Lcom/zykj/blackboard/utils/BitmapUtil;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerBitmap:Landroid/graphics/Bitmap;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerBitmap:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->snapshotBitmap:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    iget-object v4, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraBitmap:Landroid/graphics/Bitmap;

    .line 15
    .line 16
    filled-new-array {v1, v2, v3, v4}, [Landroid/graphics/Bitmap;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Lcom/zykj/blackboard/core/canvas/control/DrawControl$release$1;

    .line 21
    .line 22
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl$release$1;-><init>(Lcom/zykj/blackboard/core/canvas/control/DrawControl;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/utils/BitmapUtil;->recycle([Landroid/graphics/Bitmap;Lx7/a;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderChangeListener:Lcom/zykj/blackboard/core/canvas/control/DrawControl$renderChangeListener$1;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->unRegisterRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final renderRectFInFix(Landroid/graphics/RectF;Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 17
    .line 18
    float-to-int v1, v1

    .line 19
    const/4 v2, 0x1

    .line 20
    add-int/2addr v1, v2

    .line 21
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 22
    .line 23
    iget v1, p1, Landroid/graphics/RectF;->top:F

    .line 24
    .line 25
    float-to-int v1, v1

    .line 26
    add-int/2addr v1, v2

    .line 27
    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 28
    .line 29
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 30
    .line 31
    float-to-int v1, v1

    .line 32
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 33
    .line 34
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 35
    .line 36
    float-to-int p1, p1

    .line 37
    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 48
    .line 49
    invoke-static {p1, v1, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v4, Landroid/graphics/Canvas;

    .line 54
    .line 55
    invoke-direct {v4, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 56
    .line 57
    .line 58
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 59
    .line 60
    int-to-float v1, v1

    .line 61
    neg-float v1, v1

    .line 62
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 63
    .line 64
    int-to-float v3, v3

    .line 65
    neg-float v3, v3

    .line 66
    invoke-virtual {v4, v1, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    move-object v3, v1

    .line 84
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 85
    .line 86
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 87
    .line 88
    if-eqz v1, :cond_1

    .line 89
    .line 90
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-nez v1, :cond_0

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_0
    :goto_1
    move-object v5, v1

    .line 98
    goto :goto_3

    .line 99
    :cond_1
    :goto_2
    new-instance v1, Landroid/graphics/Matrix;

    .line 100
    .line 101
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :goto_3
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    const/4 v9, 0x4

    .line 112
    const/4 v10, 0x0

    .line 113
    const/4 v6, 0x0

    .line 114
    const/4 v7, 0x0

    .line 115
    invoke-static/range {v3 .. v10}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 120
    .line 121
    if-eqz p2, :cond_3

    .line 122
    .line 123
    new-instance v1, Landroid/graphics/Paint;

    .line 124
    .line 125
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 129
    .line 130
    .line 131
    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    .line 132
    .line 133
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 134
    .line 135
    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 139
    .line 140
    .line 141
    sget-object v2, Lh7/p;->a:Lh7/p;

    .line 142
    .line 143
    invoke-virtual {p2, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 144
    .line 145
    .line 146
    new-instance v1, Landroid/graphics/Rect;

    .line 147
    .line 148
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    const/4 v4, 0x0

    .line 157
    invoke-direct {v1, v4, v4, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 158
    .line 159
    .line 160
    const/4 v2, 0x0

    .line 161
    invoke-virtual {p2, p1, v1, v0, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 162
    .line 163
    .line 164
    :cond_3
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawFixLayer()V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->reset()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final screenshot(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getFixLayer()Lcom/zykj/blackboard/core/canvas/view/FixLayer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Lcom/zykj/blackboard/core/canvas/view/FixLayer;->rect()Landroid/graphics/Rect;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Landroid/graphics/RectF;

    .line 28
    .line 29
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 49
    .line 50
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    int-to-float v3, v3

    .line 59
    mul-float/2addr v2, v3

    .line 60
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    iget-object v4, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 65
    .line 66
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    int-to-float v4, v4

    .line 75
    mul-float/2addr v3, v4

    .line 76
    const/4 v4, 0x0

    .line 77
    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 78
    .line 79
    .line 80
    new-instance v2, Landroid/graphics/Matrix;

    .line 81
    .line 82
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 83
    .line 84
    .line 85
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 86
    .line 87
    if-eqz v3, :cond_1

    .line 88
    .line 89
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-static {v4}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {v2, v4}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 105
    .line 106
    .line 107
    :cond_1
    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    invoke-virtual {v1}, Landroid/graphics/RectF;->setEmpty()V

    .line 112
    .line 113
    .line 114
    :goto_1
    invoke-virtual {v1}, Landroid/graphics/RectF;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_3

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 121
    .line 122
    .line 123
    :cond_3
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    float-to-int v1, v1

    .line 128
    add-int/lit8 v1, v1, 0x1

    .line 129
    .line 130
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    float-to-int v0, v0

    .line 135
    add-int/lit8 v0, v0, 0x1

    .line 136
    .line 137
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 138
    .line 139
    invoke-static {v1, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->snapshotBitmap:Landroid/graphics/Bitmap;

    .line 144
    .line 145
    if-eqz v0, :cond_4

    .line 146
    .line 147
    new-instance v2, Landroid/graphics/Canvas;

    .line 148
    .line 149
    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 153
    .line 154
    if-eqz v0, :cond_4

    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    if-eqz v3, :cond_4

    .line 161
    .line 162
    invoke-direct {p0, v2, v3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 163
    .line 164
    .line 165
    const/4 v7, 0x4

    .line 166
    const/4 v8, 0x0

    .line 167
    const/4 v4, 0x0

    .line 168
    const/4 v5, 0x0

    .line 169
    const/4 v6, 0x1

    .line 170
    move-object v1, p1

    .line 171
    invoke-static/range {v1 .. v8}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_4
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->snapshotBitmap:Landroid/graphics/Bitmap;

    .line 175
    .line 176
    return-object p1
.end method

.method public final select(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    .locals 4

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 18
    .line 19
    :cond_0
    new-instance v0, Landroid/graphics/RectF;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 25
    .line 26
    .line 27
    iget v2, v0, Landroid/graphics/RectF;->left:F

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    sub-float/2addr v2, v3

    .line 34
    iput v2, v0, Landroid/graphics/RectF;->left:F

    .line 35
    .line 36
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    sub-float/2addr v2, v3

    .line 43
    iput v2, v0, Landroid/graphics/RectF;->top:F

    .line 44
    .line 45
    iget v2, v0, Landroid/graphics/RectF;->right:F

    .line 46
    .line 47
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    add-float/2addr v2, v3

    .line 52
    iput v2, v0, Landroid/graphics/RectF;->right:F

    .line 53
    .line 54
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 55
    .line 56
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    add-float/2addr v2, v3

    .line 61
    iput v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 62
    .line 63
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->initActiveLayer(Landroid/graphics/RectF;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 67
    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 71
    .line 72
    invoke-virtual {v2, v1, v3}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 76
    .line 77
    .line 78
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 79
    .line 80
    neg-float v1, v1

    .line 81
    iget v3, v0, Landroid/graphics/RectF;->top:F

    .line 82
    .line 83
    neg-float v3, v3

    .line 84
    invoke-virtual {v2, v1, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, p1, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 91
    .line 92
    .line 93
    :cond_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 94
    .line 95
    iget p2, v0, Landroid/graphics/RectF;->left:F

    .line 96
    .line 97
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 98
    .line 99
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 103
    .line 104
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer(Landroid/graphics/Matrix;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_2
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->checkActiveLayer()V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 112
    .line 113
    if-eqz v0, :cond_4

    .line 114
    .line 115
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 116
    .line 117
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 118
    .line 119
    .line 120
    if-nez p2, :cond_3

    .line 121
    .line 122
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 123
    .line 124
    :cond_3
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 125
    .line 126
    .line 127
    :cond_4
    const/4 p1, 0x1

    .line 128
    const/4 p2, 0x0

    .line 129
    invoke-static {p0, p2, p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer$default(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final selectCancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->clearActiveBitmapAndCanvas()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->clear()V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final setBackgroundColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getBackgroundLayer()Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;->setMyBackgroundColor(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getBackgroundLayer()Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;->refresh()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final setBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 1

    .line 1
    const-string v0, "backgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getBackgroundLayer()Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;->setBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getBackgroundLayer()Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;->refresh()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final setMatrixAdapter(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V
    .locals 1

    .line 1
    const-string v0, "matrixAdapter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderChangeListener:Lcom/zykj/blackboard/core/canvas/control/DrawControl$renderChangeListener$1;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->registerRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setRenderLayer(Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V
    .locals 2

    .line 1
    const-string v0, "renderLayer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getRenderRect()Landroid/graphics/Rect;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayerRect:Landroid/graphics/Rect;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 38
    .line 39
    invoke-static {p1, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerBitmap:Landroid/graphics/Bitmap;

    .line 44
    .line 45
    new-instance p1, Landroid/graphics/Canvas;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerBitmap:Landroid/graphics/Bitmap;

    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 56
    .line 57
    :cond_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawMaskLayer()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final textHandle(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V
    .locals 11

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, p3

    .line 12
    :goto_0
    new-instance v1, Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 21
    .line 22
    .line 23
    iget v3, v1, Landroid/graphics/RectF;->left:F

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    sub-float/2addr v3, v4

    .line 30
    iput v3, v1, Landroid/graphics/RectF;->left:F

    .line 31
    .line 32
    iget v3, v1, Landroid/graphics/RectF;->top:F

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    sub-float/2addr v3, v4

    .line 39
    iput v3, v1, Landroid/graphics/RectF;->top:F

    .line 40
    .line 41
    iget v3, v1, Landroid/graphics/RectF;->right:F

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    add-float/2addr v3, v4

    .line 48
    iput v3, v1, Landroid/graphics/RectF;->right:F

    .line 49
    .line 50
    iget v3, v1, Landroid/graphics/RectF;->bottom:F

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    add-float/2addr v3, v0

    .line 57
    iput v3, v1, Landroid/graphics/RectF;->bottom:F

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const/4 v0, 0x0

    .line 70
    :goto_1
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/graph/Graph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 75
    .line 76
    .line 77
    :goto_2
    invoke-direct {p0, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->initActiveLayer(Landroid/graphics/RectF;)V

    .line 78
    .line 79
    .line 80
    iget-object v4, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 81
    .line 82
    if-eqz v4, :cond_6

    .line 83
    .line 84
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 85
    .line 86
    invoke-virtual {v4, v2, v0}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Landroid/graphics/Canvas;->save()I

    .line 90
    .line 91
    .line 92
    iget v0, v1, Landroid/graphics/RectF;->left:F

    .line 93
    .line 94
    neg-float v0, v0

    .line 95
    iget v2, v1, Landroid/graphics/RectF;->top:F

    .line 96
    .line 97
    neg-float v2, v2

    .line 98
    invoke-virtual {v4, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 102
    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 110
    .line 111
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    const/4 v9, 0x4

    .line 116
    const/4 v10, 0x0

    .line 117
    const/4 v6, 0x0

    .line 118
    const/4 v7, 0x0

    .line 119
    move-object v3, p1

    .line 120
    invoke-static/range {v3 .. v10}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_3
    if-eqz p2, :cond_5

    .line 124
    .line 125
    if-nez p3, :cond_4

    .line 126
    .line 127
    iget-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 128
    .line 129
    :cond_4
    invoke-virtual {v4, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 130
    .line 131
    .line 132
    :cond_5
    invoke-virtual {v4}, Landroid/graphics/Canvas;->restore()V

    .line 133
    .line 134
    .line 135
    :cond_6
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->translateMatrix:Landroid/graphics/Matrix;

    .line 136
    .line 137
    iget p2, v1, Landroid/graphics/RectF;->left:F

    .line 138
    .line 139
    iget p3, v1, Landroid/graphics/RectF;->top:F

    .line 140
    .line 141
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->translateMatrix:Landroid/graphics/Matrix;

    .line 145
    .line 146
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer(Landroid/graphics/Matrix;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public final textHandleEnd(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V
    .locals 9

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-static {v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControlKt;->clear(Landroid/graphics/Canvas;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const/4 v7, 0x4

    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    move-object v1, p1

    .line 32
    invoke-static/range {v1 .. v8}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawFixLayer()V

    .line 36
    .line 37
    .line 38
    if-eqz p2, :cond_3

    .line 39
    .line 40
    if-nez p3, :cond_1

    .line 41
    .line 42
    iget-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 43
    .line 44
    :cond_1
    new-instance p1, Landroid/graphics/RectF;

    .line 45
    .line 46
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p2, p1, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 51
    .line 52
    .line 53
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 54
    .line 55
    invoke-virtual {p3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    sub-float/2addr v1, v2

    .line 60
    iput v1, p1, Landroid/graphics/RectF;->left:F

    .line 61
    .line 62
    iget v1, p1, Landroid/graphics/RectF;->top:F

    .line 63
    .line 64
    invoke-virtual {p3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    sub-float/2addr v1, v2

    .line 69
    iput v1, p1, Landroid/graphics/RectF;->top:F

    .line 70
    .line 71
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 72
    .line 73
    invoke-virtual {p3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    add-float/2addr v1, v2

    .line 78
    iput v1, p1, Landroid/graphics/RectF;->right:F

    .line 79
    .line 80
    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 81
    .line 82
    invoke-virtual {p3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    add-float/2addr v1, v2

    .line 87
    iput v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 88
    .line 89
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->initActiveLayer(Landroid/graphics/RectF;)V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 93
    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 97
    .line 98
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 102
    .line 103
    .line 104
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 105
    .line 106
    neg-float v0, v0

    .line 107
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 108
    .line 109
    neg-float v2, v2

    .line 110
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 117
    .line 118
    .line 119
    :cond_2
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 120
    .line 121
    iget p3, p1, Landroid/graphics/RectF;->left:F

    .line 122
    .line 123
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 124
    .line 125
    invoke-virtual {p2, p3, p1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 126
    .line 127
    .line 128
    invoke-direct {p0, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer(Landroid/graphics/Matrix;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_3
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->clearActiveBitmapAndCanvas()V

    .line 133
    .line 134
    .line 135
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 136
    .line 137
    if-eqz p1, :cond_4

    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-eqz p1, :cond_4

    .line 144
    .line 145
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->clear()V

    .line 146
    .line 147
    .line 148
    :cond_4
    return-void
.end method

.method public final textHandleStart(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V
    .locals 10

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graph"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControlKt;->clear(Landroid/graphics/Canvas;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    new-instance v4, Lcom/zykj/blackboard/core/canvas/control/DrawControl$textHandleStart$1$1$1;

    .line 27
    .line 28
    invoke-direct {v4, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl$textHandleStart$1$1$1;-><init>(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V

    .line 29
    .line 30
    .line 31
    const/16 v7, 0x18

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    move-object v1, p1

    .line 37
    invoke-static/range {v1 .. v8}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawFixLayer()V

    .line 41
    .line 42
    .line 43
    if-nez p4, :cond_1

    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object p1, p4

    .line 49
    :goto_0
    new-instance v0, Landroid/graphics/RectF;

    .line 50
    .line 51
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    if-eqz p3, :cond_2

    .line 56
    .line 57
    invoke-virtual {p3, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 58
    .line 59
    .line 60
    iget v2, v0, Landroid/graphics/RectF;->left:F

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    sub-float/2addr v2, v3

    .line 67
    iput v2, v0, Landroid/graphics/RectF;->left:F

    .line 68
    .line 69
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    sub-float/2addr v2, v3

    .line 76
    iput v2, v0, Landroid/graphics/RectF;->top:F

    .line 77
    .line 78
    iget v2, v0, Landroid/graphics/RectF;->right:F

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    add-float/2addr v2, v3

    .line 85
    iput v2, v0, Landroid/graphics/RectF;->right:F

    .line 86
    .line 87
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    add-float/2addr v2, p1

    .line 94
    iput v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 98
    .line 99
    if-eqz p1, :cond_3

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    const/4 p1, 0x0

    .line 107
    :goto_1
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/graph/Graph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 108
    .line 109
    .line 110
    :goto_2
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->initActiveLayer(Landroid/graphics/RectF;)V

    .line 111
    .line 112
    .line 113
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 114
    .line 115
    if-eqz v3, :cond_7

    .line 116
    .line 117
    sget-object p1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 118
    .line 119
    invoke-virtual {v3, v1, p1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Landroid/graphics/Canvas;->save()I

    .line 123
    .line 124
    .line 125
    iget p1, v0, Landroid/graphics/RectF;->left:F

    .line 126
    .line 127
    neg-float p1, p1

    .line 128
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 129
    .line 130
    neg-float v1, v1

    .line 131
    invoke-virtual {v3, p1, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 135
    .line 136
    if-eqz p1, :cond_4

    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    const/4 v8, 0x4

    .line 149
    const/4 v9, 0x0

    .line 150
    const/4 v5, 0x0

    .line 151
    const/4 v6, 0x0

    .line 152
    move-object v2, p2

    .line 153
    invoke-static/range {v2 .. v9}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :cond_4
    if-eqz p3, :cond_6

    .line 157
    .line 158
    if-nez p4, :cond_5

    .line 159
    .line 160
    iget-object p4, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 161
    .line 162
    :cond_5
    invoke-virtual {v3, p3, p4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 163
    .line 164
    .line 165
    :cond_6
    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    .line 166
    .line 167
    .line 168
    :cond_7
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->translateMatrix:Landroid/graphics/Matrix;

    .line 169
    .line 170
    iget p2, v0, Landroid/graphics/RectF;->left:F

    .line 171
    .line 172
    iget p3, v0, Landroid/graphics/RectF;->top:F

    .line 173
    .line 174
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 175
    .line 176
    .line 177
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->translateMatrix:Landroid/graphics/Matrix;

    .line 178
    .line 179
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer(Landroid/graphics/Matrix;)V

    .line 180
    .line 181
    .line 182
    return-void
.end method

.method public final transGraph(Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->translateMatrix:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer(Landroid/graphics/Matrix;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer(Landroid/graphics/Matrix;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final transGraphEnd(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V
    .locals 9

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-static {v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControlKt;->clear(Landroid/graphics/Canvas;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const/16 v7, 0xc

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    move-object v1, p1

    .line 33
    invoke-static/range {v1 .. v8}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawFixLayer()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    const/4 v0, 0x0

    .line 46
    if-eqz p1, :cond_5

    .line 47
    .line 48
    if-eqz p2, :cond_3

    .line 49
    .line 50
    if-nez p3, :cond_1

    .line 51
    .line 52
    iget-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 53
    .line 54
    :cond_1
    new-instance p1, Landroid/graphics/RectF;

    .line 55
    .line 56
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p1, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 60
    .line 61
    .line 62
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 63
    .line 64
    invoke-virtual {p3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    sub-float/2addr v1, v2

    .line 69
    iput v1, p1, Landroid/graphics/RectF;->left:F

    .line 70
    .line 71
    iget v1, p1, Landroid/graphics/RectF;->top:F

    .line 72
    .line 73
    invoke-virtual {p3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    sub-float/2addr v1, v2

    .line 78
    iput v1, p1, Landroid/graphics/RectF;->top:F

    .line 79
    .line 80
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 81
    .line 82
    invoke-virtual {p3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    add-float/2addr v1, v2

    .line 87
    iput v1, p1, Landroid/graphics/RectF;->right:F

    .line 88
    .line 89
    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 90
    .line 91
    invoke-virtual {p3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    add-float/2addr v1, v2

    .line 96
    iput v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 97
    .line 98
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->initActiveLayer(Landroid/graphics/RectF;)V

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 102
    .line 103
    if-eqz v1, :cond_2

    .line 104
    .line 105
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 106
    .line 107
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 111
    .line 112
    .line 113
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 114
    .line 115
    neg-float v0, v0

    .line 116
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 117
    .line 118
    neg-float v2, v2

    .line 119
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 126
    .line 127
    .line 128
    :cond_2
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 129
    .line 130
    iget p3, p1, Landroid/graphics/RectF;->left:F

    .line 131
    .line 132
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 133
    .line 134
    invoke-virtual {p2, p3, p1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 135
    .line 136
    .line 137
    invoke-direct {p0, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer(Landroid/graphics/Matrix;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_3
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->clearActiveBitmapAndCanvas()V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 145
    .line 146
    if-eqz p1, :cond_4

    .line 147
    .line 148
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-eqz p1, :cond_4

    .line 153
    .line 154
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->clear()V

    .line 155
    .line 156
    .line 157
    :cond_4
    return-void

    .line 158
    :cond_5
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->checkActiveLayer()V

    .line 159
    .line 160
    .line 161
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 162
    .line 163
    if-eqz p1, :cond_7

    .line 164
    .line 165
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 166
    .line 167
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 168
    .line 169
    .line 170
    if-eqz p2, :cond_7

    .line 171
    .line 172
    if-nez p3, :cond_6

    .line 173
    .line 174
    iget-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 175
    .line 176
    :cond_6
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 177
    .line 178
    .line 179
    :cond_7
    const/4 p1, 0x1

    .line 180
    const/4 p2, 0x0

    .line 181
    invoke-static {p0, p2, p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer$default(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    return-void
.end method

.method public final transGraphStart(Lcom/zykj/blackboard/core/graph/IGraph;Ljava/util/List;Landroid/graphics/Path;Landroid/graphics/Paint;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;",
            "Landroid/graphics/Path;",
            "Landroid/graphics/Paint;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "rootGraph"

    .line 8
    .line 9
    move-object/from16 v4, p1

    .line 10
    .line 11
    invoke-static {v4, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v3, "graphList"

    .line 15
    .line 16
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v5, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->fixLayerCanvas:Landroid/graphics/Canvas;

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    invoke-static {v5}, Lcom/zykj/blackboard/core/canvas/control/DrawControlKt;->clear(Landroid/graphics/Canvas;)V

    .line 24
    .line 25
    .line 26
    iget-object v3, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    new-instance v7, Lcom/zykj/blackboard/core/canvas/control/DrawControl$transGraphStart$1$1$1;

    .line 35
    .line 36
    invoke-direct {v7, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl$transGraphStart$1$1$1;-><init>(Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    iget-object v3, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    const/16 v10, 0x8

    .line 46
    .line 47
    const/4 v11, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    invoke-static/range {v4 .. v11}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-direct {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawFixLayer()V

    .line 53
    .line 54
    .line 55
    iget-object v3, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 56
    .line 57
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    if-eqz v3, :cond_a

    .line 64
    .line 65
    if-nez p4, :cond_1

    .line 66
    .line 67
    iget-object v3, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move-object/from16 v3, p4

    .line 71
    .line 72
    :goto_0
    new-instance v6, Landroid/graphics/RectF;

    .line 73
    .line 74
    invoke-direct {v6}, Landroid/graphics/RectF;-><init>()V

    .line 75
    .line 76
    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    invoke-virtual {v2, v6, v5}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 80
    .line 81
    .line 82
    iget v4, v6, Landroid/graphics/RectF;->left:F

    .line 83
    .line 84
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    sub-float/2addr v4, v7

    .line 89
    iput v4, v6, Landroid/graphics/RectF;->left:F

    .line 90
    .line 91
    iget v4, v6, Landroid/graphics/RectF;->top:F

    .line 92
    .line 93
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    sub-float/2addr v4, v7

    .line 98
    iput v4, v6, Landroid/graphics/RectF;->top:F

    .line 99
    .line 100
    iget v4, v6, Landroid/graphics/RectF;->right:F

    .line 101
    .line 102
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    add-float/2addr v4, v7

    .line 107
    iput v4, v6, Landroid/graphics/RectF;->right:F

    .line 108
    .line 109
    iget v4, v6, Landroid/graphics/RectF;->bottom:F

    .line 110
    .line 111
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    add-float/2addr v4, v3

    .line 116
    iput v4, v6, Landroid/graphics/RectF;->bottom:F

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-eqz v7, :cond_4

    .line 128
    .line 129
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    check-cast v7, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 134
    .line 135
    iget-object v8, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 136
    .line 137
    if-eqz v8, :cond_3

    .line 138
    .line 139
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    goto :goto_2

    .line 144
    :cond_3
    move-object v8, v4

    .line 145
    :goto_2
    invoke-interface {v7, v8}, Lcom/zykj/blackboard/core/graph/IGraph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-virtual {v6, v7}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    :goto_3
    invoke-direct {v0, v6}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->initActiveLayer(Landroid/graphics/RectF;)V

    .line 154
    .line 155
    .line 156
    iget-object v9, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 157
    .line 158
    if-eqz v9, :cond_9

    .line 159
    .line 160
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 161
    .line 162
    invoke-virtual {v9, v5, v3}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v9}, Landroid/graphics/Canvas;->save()I

    .line 166
    .line 167
    .line 168
    iget v3, v6, Landroid/graphics/RectF;->left:F

    .line 169
    .line 170
    neg-float v3, v3

    .line 171
    iget v4, v6, Landroid/graphics/RectF;->top:F

    .line 172
    .line 173
    neg-float v4, v4

    .line 174
    invoke-virtual {v9, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    :cond_5
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_6

    .line 186
    .line 187
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    move-object v8, v3

    .line 192
    check-cast v8, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 193
    .line 194
    iget-object v3, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 195
    .line 196
    if-eqz v3, :cond_5

    .line 197
    .line 198
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    const/16 v14, 0xc

    .line 203
    .line 204
    const/4 v15, 0x0

    .line 205
    const/4 v11, 0x0

    .line 206
    const/4 v12, 0x0

    .line 207
    const/4 v13, 0x1

    .line 208
    invoke-static/range {v8 .. v15}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_6
    if-eqz v2, :cond_8

    .line 213
    .line 214
    if-nez p4, :cond_7

    .line 215
    .line 216
    iget-object v1, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_7
    move-object/from16 v1, p4

    .line 220
    .line 221
    :goto_5
    invoke-virtual {v9, v2, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 222
    .line 223
    .line 224
    :cond_8
    invoke-virtual {v9}, Landroid/graphics/Canvas;->restore()V

    .line 225
    .line 226
    .line 227
    :cond_9
    iget-object v1, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->translateMatrix:Landroid/graphics/Matrix;

    .line 228
    .line 229
    iget v2, v6, Landroid/graphics/RectF;->left:F

    .line 230
    .line 231
    iget v3, v6, Landroid/graphics/RectF;->top:F

    .line 232
    .line 233
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 234
    .line 235
    .line 236
    iget-object v1, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->translateMatrix:Landroid/graphics/Matrix;

    .line 237
    .line 238
    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer(Landroid/graphics/Matrix;)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :cond_a
    invoke-direct {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->checkActiveLayer()V

    .line 243
    .line 244
    .line 245
    iget-object v6, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->activeLayerCanvas:Landroid/graphics/Canvas;

    .line 246
    .line 247
    if-eqz v6, :cond_e

    .line 248
    .line 249
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 250
    .line 251
    invoke-virtual {v6, v5, v3}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    :cond_b
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-eqz v3, :cond_c

    .line 263
    .line 264
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    move-object v5, v3

    .line 269
    check-cast v5, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 270
    .line 271
    iget-object v3, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 272
    .line 273
    if-eqz v3, :cond_b

    .line 274
    .line 275
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    const/16 v11, 0x1c

    .line 280
    .line 281
    const/4 v12, 0x0

    .line 282
    const/4 v8, 0x0

    .line 283
    const/4 v9, 0x0

    .line 284
    const/4 v10, 0x0

    .line 285
    invoke-static/range {v5 .. v12}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lx7/l;ZZILjava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_c
    if-eqz v2, :cond_e

    .line 290
    .line 291
    if-nez p4, :cond_d

    .line 292
    .line 293
    iget-object v1, v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->boardPaint:Landroid/graphics/Paint;

    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_d
    move-object/from16 v1, p4

    .line 297
    .line 298
    :goto_7
    invoke-virtual {v6, v2, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 299
    .line 300
    .line 301
    :cond_e
    const/4 v1, 0x1

    .line 302
    invoke-static {v0, v4, v1, v4}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawActiveLayer$default(Lcom/zykj/blackboard/core/canvas/control/DrawControl;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    return-void
.end method

.method public final updateBackgroundMatrix(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getBackgroundLayer()Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;->setMatrix(Landroid/graphics/Matrix;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
