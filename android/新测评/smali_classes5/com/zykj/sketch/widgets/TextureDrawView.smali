.class public final Lcom/zykj/sketch/widgets/TextureDrawView;
.super Landroid/view/TextureView;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;
.implements Lcom/zykj/sketch/core/listener/RealDraw;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00015B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\nH\u0014J\u0010\u0010&\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u0011\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0010J\u0008\u0010\'\u001a\u00020\"H\u0014J\"\u0010(\u001a\u00020\"2\u0008\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0016J\u0012\u0010-\u001a\u00020\u00102\u0008\u0010)\u001a\u0004\u0018\u00010*H\u0016J\"\u0010.\u001a\u00020\"2\u0008\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0016J\u0012\u0010/\u001a\u00020\"2\u0008\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\nH\u0016J\u0012\u00102\u001a\u00020\"2\u0008\u00103\u001a\u0004\u0018\u00010\u0014H\u0016J\u0008\u00104\u001a\u00020\"H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"
    }
    d2 = {
        "Lcom/zykj/sketch/widgets/TextureDrawView;",
        "Landroid/view/TextureView;",
        "Landroid/view/TextureView$SurfaceTextureListener;",
        "Lcom/zykj/sketch/core/listener/RealDraw;",
        "context",
        "Landroid/content/Context;",
        "attr",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "backgroundId",
        "",
        "execute",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        "graph",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "isLocked",
        "",
        "isRend",
        "isVisibility",
        "limitDrawArea",
        "Landroid/graphics/RectF;",
        "mIsDrawing",
        "mSurface",
        "Landroid/view/Surface;",
        "paintTableArea",
        "paintThread",
        "Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;",
        "rendRectF",
        "renderRectPaint",
        "Landroid/graphics/Paint;",
        "tempMatrix",
        "Landroid/graphics/Matrix;",
        "tempPaint",
        "dispatchVisibilityChanged",
        "",
        "changedView",
        "Landroid/view/View;",
        "visibility",
        "drawGraph",
        "onDetachedFromWindow",
        "onSurfaceTextureAvailable",
        "surface",
        "Landroid/graphics/SurfaceTexture;",
        "width",
        "height",
        "onSurfaceTextureDestroyed",
        "onSurfaceTextureSizeChanged",
        "onSurfaceTextureUpdated",
        "setDrawBackground",
        "colorId",
        "setLimitDrawArea",
        "rectF",
        "shutdown",
        "PaintThread",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public _$_findViewCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private backgroundId:I

.field private execute:Ljava/util/concurrent/ScheduledExecutorService;

.field private graph:Lcom/zykj/sketch/core/graph/Graph;

.field private isLocked:Z

.field private isRend:Z

.field private isVisibility:Z

.field private limitDrawArea:Landroid/graphics/RectF;

.field private mIsDrawing:Z

.field private mSurface:Landroid/view/Surface;

.field private paintTableArea:Landroid/graphics/RectF;

.field private final paintThread:Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;

.field private rendRectF:Landroid/graphics/RectF;

.field private renderRectPaint:Landroid/graphics/Paint;

.field private tempMatrix:Landroid/graphics/Matrix;

.field private tempPaint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->_$_findViewCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/view/TextureView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->isVisibility:Z

    .line 18
    .line 19
    iput-boolean p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->isRend:Z

    .line 20
    .line 21
    new-instance p2, Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;

    .line 22
    .line 23
    invoke-direct {p2, p0}, Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;-><init>(Lcom/zykj/sketch/widgets/TextureDrawView;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->paintThread:Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;

    .line 27
    .line 28
    const/4 p2, -0x1

    .line 29
    iput p2, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->backgroundId:I

    .line 30
    .line 31
    new-instance p2, Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p2, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->rendRectF:Landroid/graphics/RectF;

    .line 37
    .line 38
    new-instance p2, Landroid/graphics/Paint;

    .line 39
    .line 40
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->renderRectPaint:Landroid/graphics/Paint;

    .line 44
    .line 45
    new-instance p2, Landroid/graphics/Paint;

    .line 46
    .line 47
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p2, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->tempPaint:Landroid/graphics/Paint;

    .line 51
    .line 52
    new-instance p2, Landroid/graphics/Matrix;

    .line 53
    .line 54
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p2, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->tempMatrix:Landroid/graphics/Matrix;

    .line 58
    .line 59
    invoke-virtual {p0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->renderRectPaint:Landroid/graphics/Paint;

    .line 63
    .line 64
    const/high16 v0, 0x40000000    # 2.0f

    .line 65
    .line 66
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 67
    .line 68
    .line 69
    iget-object p2, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->renderRectPaint:Landroid/graphics/Paint;

    .line 70
    .line 71
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 72
    .line 73
    .line 74
    iget-object p2, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->renderRectPaint:Landroid/graphics/Paint;

    .line 75
    .line 76
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->renderRectPaint:Landroid/graphics/Paint;

    .line 80
    .line 81
    const-string p2, "#797979"

    .line 82
    .line 83
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->renderRectPaint:Landroid/graphics/Paint;

    .line 91
    .line 92
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->renderRectPaint:Landroid/graphics/Paint;

    .line 98
    .line 99
    sget-object p2, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->renderRectPaint:Landroid/graphics/Paint;

    .line 105
    .line 106
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 107
    .line 108
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->renderRectPaint:Landroid/graphics/Paint;

    .line 112
    .line 113
    new-instance p2, Landroid/graphics/DashPathEffect;

    .line 114
    .line 115
    const/4 v0, 0x2

    .line 116
    new-array v0, v0, [F

    .line 117
    .line 118
    fill-array-data v0, :array_0

    .line 119
    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    invoke-direct {p2, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->tempPaint:Landroid/graphics/Paint;

    .line 129
    .line 130
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    .line 131
    .line 132
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 133
    .line 134
    invoke-direct {p2, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x41200000    # 10.0f
    .end array-data
.end method

.method public static final synthetic access$getBackgroundId$p(Lcom/zykj/sketch/widgets/TextureDrawView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->backgroundId:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getGraph$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Lcom/zykj/sketch/core/graph/Graph;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->graph:Lcom/zykj/sketch/core/graph/Graph;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLimitDrawArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->limitDrawArea:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMIsDrawing$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->mIsDrawing:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getMSurface$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/view/Surface;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->mSurface:Landroid/view/Surface;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPaintTableArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->paintTableArea:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getRendRectF$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->rendRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getRenderRectPaint$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->renderRectPaint:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getTempMatrix$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Matrix;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->tempMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getTempPaint$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->tempPaint:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$isLocked$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->isLocked:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$isRend$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->isRend:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$isVisibility$p(Lcom/zykj/sketch/widgets/TextureDrawView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->isVisibility:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$setLocked$p(Lcom/zykj/sketch/widgets/TextureDrawView;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->isLocked:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setPaintTableArea$p(Lcom/zykj/sketch/widgets/TextureDrawView;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->paintTableArea:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->_$_findViewCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->_$_findViewCache:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v1
.end method

.method public dispatchVisibilityChanged(Landroid/view/View;I)V
    .locals 1

    .line 1
    const-string v0, "changedView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/view/View;->dispatchVisibilityChanged(Landroid/view/View;I)V

    .line 7
    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iput-boolean p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->isVisibility:Z

    .line 15
    .line 16
    return-void
.end method

.method public drawGraph(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 1

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->graph:Lcom/zykj/sketch/core/graph/Graph;

    .line 7
    .line 8
    return-void
.end method

.method public final isRend(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->isRend:Z

    .line 2
    .line 3
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->mIsDrawing:Z

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->isLocked:Z

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->mIsDrawing:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->isLocked:Z

    .line 6
    .line 7
    new-instance v2, Landroid/view/Surface;

    .line 8
    .line 9
    invoke-direct {v2, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 10
    .line 11
    .line 12
    iput-object v2, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->mSurface:Landroid/view/Surface;

    .line 13
    .line 14
    :try_start_0
    new-instance p1, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {p1, v1, v1, p2, p3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, p1}, Landroid/view/Surface;->lockCanvas(Landroid/graphics/Rect;)Landroid/graphics/Canvas;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const/4 p2, -0x1

    .line 26
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    move-object p1, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    iget-object p2, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->mSurface:Landroid/view/Surface;

    .line 34
    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    invoke-virtual {p2, p1}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->paintThread:Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;

    .line 49
    .line 50
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 51
    .line 52
    const-wide/16 v2, 0x0

    .line 53
    .line 54
    const-wide/16 v4, 0x18

    .line 55
    .line 56
    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void

    .line 60
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->mIsDrawing:Z

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->isLocked:Z

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->execute:Ljava/util/concurrent/ScheduledExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    .line 23
    .line 24
    :goto_2
    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public setDrawBackground(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->backgroundId:I

    .line 2
    .line 3
    return-void
.end method

.method public setLimitDrawArea(Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->limitDrawArea:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-void
.end method

.method public shutdown()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->mIsDrawing:Z

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->isLocked:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->graph:Lcom/zykj/sketch/core/graph/Graph;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput-object v0, p0, Lcom/zykj/sketch/widgets/TextureDrawView;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 18
    .line 19
    return-void
.end method
