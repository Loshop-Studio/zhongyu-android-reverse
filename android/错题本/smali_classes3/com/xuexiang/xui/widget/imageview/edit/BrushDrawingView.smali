.class public Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public c:I

.field public final d:Ljava/util/Stack;

.field public final e:Ljava/util/Stack;

.field public final f:Landroid/graphics/Paint;

.field public g:Landroid/graphics/Canvas;

.field public h:Z

.field public i:Landroid/graphics/Path;

.field public j:F

.field public k:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p1, 0x41c80000    # 25.0f

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->a:F

    const/high16 p1, 0x42480000    # 50.0f

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->b:F

    const/16 p1, 0xff

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->c:I

    .line 7
    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->d:Ljava/util/Stack;

    .line 8
    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->e:Ljava/util/Stack;

    .line 9
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->f:Landroid/graphics/Paint;

    const/4 p2, 0x2

    const/4 p3, 0x0

    .line 10
    invoke-virtual {p0, p2, p3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    const/high16 p2, -0x1000000

    .line 11
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->a()V

    const/16 p1, 0x8

    .line 13
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->i:Landroid/graphics/Path;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->f:Landroid/graphics/Paint;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 15
    .line 16
    .line 17
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 20
    .line 21
    .line 22
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 30
    .line 31
    .line 32
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->a:F

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 35
    .line 36
    .line 37
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->c:I

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 43
    .line 44
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 45
    .line 46
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public getBrushColor()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->f:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getBrushDrawingMode()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public getBrushSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->a:F

    .line 2
    .line 3
    return v0
.end method

.method public getDrawingPaint()Landroid/graphics/Paint;
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->f:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDrawingPath()Landroid/util/Pair;
    .locals 3
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Pair<",
            "Ljava/util/Stack<",
            "Lcom/xuexiang/xui/widget/imageview/edit/e;",
            ">;",
            "Ljava/util/Stack<",
            "Lcom/xuexiang/xui/widget/imageview/edit/e;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/util/Pair;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->d:Ljava/util/Stack;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->e:Ljava/util/Stack;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public getEraserSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->d:Ljava/util/Stack;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/xuexiang/xui/widget/imageview/edit/e;

    .line 18
    .line 19
    iget-object v2, v1, Lcom/xuexiang/xui/widget/imageview/edit/e;->b:Landroid/graphics/Path;

    .line 20
    .line 21
    iget-object v1, v1, Lcom/xuexiang/xui/widget/imageview/edit/e;->a:Landroid/graphics/Paint;

    .line 22
    .line 23
    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->i:Landroid/graphics/Path;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->f:Landroid/graphics/Paint;

    .line 30
    .line 31
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 5
    .line 6
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance p2, Landroid/graphics/Canvas;

    .line 11
    .line 12
    invoke-direct {p2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->g:Landroid/graphics/Canvas;

    .line 16
    .line 17
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    if-eq p1, v2, :cond_2

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    if-eq p1, v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->j:F

    .line 27
    .line 28
    sub-float p1, v0, p1

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:F

    .line 35
    .line 36
    sub-float v3, v1, v3

    .line 37
    .line 38
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/high16 v4, 0x40800000    # 4.0f

    .line 43
    .line 44
    cmpl-float p1, p1, v4

    .line 45
    .line 46
    if-gez p1, :cond_1

    .line 47
    .line 48
    cmpl-float p1, v3, v4

    .line 49
    .line 50
    if-ltz p1, :cond_4

    .line 51
    .line 52
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->i:Landroid/graphics/Path;

    .line 53
    .line 54
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->j:F

    .line 55
    .line 56
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:F

    .line 57
    .line 58
    add-float v5, v0, v3

    .line 59
    .line 60
    const/high16 v6, 0x40000000    # 2.0f

    .line 61
    .line 62
    div-float/2addr v5, v6

    .line 63
    add-float v7, v1, v4

    .line 64
    .line 65
    div-float/2addr v7, v6

    .line 66
    invoke-virtual {p1, v3, v4, v5, v7}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 67
    .line 68
    .line 69
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->j:F

    .line 70
    .line 71
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:F

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->i:Landroid/graphics/Path;

    .line 75
    .line 76
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->j:F

    .line 77
    .line 78
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:F

    .line 79
    .line 80
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->g:Landroid/graphics/Canvas;

    .line 84
    .line 85
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->i:Landroid/graphics/Path;

    .line 86
    .line 87
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->f:Landroid/graphics/Paint;

    .line 88
    .line 89
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 90
    .line 91
    .line 92
    new-instance p1, Lcom/xuexiang/xui/widget/imageview/edit/e;

    .line 93
    .line 94
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->i:Landroid/graphics/Path;

    .line 95
    .line 96
    invoke-direct {p1, v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/e;-><init>(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->d:Ljava/util/Stack;

    .line 100
    .line 101
    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    new-instance p1, Landroid/graphics/Path;

    .line 105
    .line 106
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->i:Landroid/graphics/Path;

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->e:Ljava/util/Stack;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->clear()V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->i:Landroid/graphics/Path;

    .line 118
    .line 119
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->i:Landroid/graphics/Path;

    .line 123
    .line 124
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 125
    .line 126
    .line 127
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->j:F

    .line 128
    .line 129
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:F

    .line 130
    .line 131
    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 132
    .line 133
    .line 134
    return v2

    .line 135
    :cond_5
    const/4 p1, 0x0

    .line 136
    return p1
.end method

.method public setBrushColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->f:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushDrawingMode(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setBrushDrawingMode(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->a()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setBrushEraserColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->f:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushDrawingMode(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setBrushEraserSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->b:F

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushDrawingMode(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setBrushSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->a:F

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushDrawingMode(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setBrushViewChangeListener(Lcom/xuexiang/xui/widget/imageview/edit/a;)V
    .locals 0

    return-void
.end method

.method public setOpacity(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
            to = 0xffL
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->c:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushDrawingMode(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
