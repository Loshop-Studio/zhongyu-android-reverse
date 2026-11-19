.class public Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public c:F

.field public d:F

.field public e:I

.field public final f:Ljava/util/Stack;

.field public final g:Ljava/util/Stack;

.field public final h:Landroid/graphics/Paint;

.field public i:Landroid/graphics/Canvas;

.field public j:Z

.field public k:Landroid/graphics/Path;

.field public l:F

.field public m:F


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
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->c:F

    const/high16 p1, 0x42480000    # 50.0f

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->d:F

    const/16 p1, 0xff

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->e:I

    .line 7
    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->f:Ljava/util/Stack;

    .line 8
    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->g:Ljava/util/Stack;

    .line 9
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

    .line 10
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->b()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->j:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->c()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

    .line 7
    .line 8
    const/high16 v1, -0x1000000

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->c()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:Landroid/graphics/Path;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

    .line 20
    .line 21
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

    .line 27
    .line 28
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

    .line 34
    .line 35
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

    .line 41
    .line 42
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->c:F

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

    .line 48
    .line 49
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->e:I

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

    .line 55
    .line 56
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 57
    .line 58
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 59
    .line 60
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final d(FF)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->l:F

    .line 2
    .line 3
    sub-float v0, p1, v0

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->m:F

    .line 10
    .line 11
    sub-float v1, p2, v1

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/high16 v2, 0x40800000    # 4.0f

    .line 18
    .line 19
    cmpl-float v0, v0, v2

    .line 20
    .line 21
    if-gez v0, :cond_1

    .line 22
    .line 23
    cmpl-float v0, v1, v2

    .line 24
    .line 25
    if-ltz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:Landroid/graphics/Path;

    .line 30
    .line 31
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->l:F

    .line 32
    .line 33
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->m:F

    .line 34
    .line 35
    add-float v3, p1, v1

    .line 36
    .line 37
    const/high16 v4, 0x40000000    # 2.0f

    .line 38
    .line 39
    div-float/2addr v3, v4

    .line 40
    add-float v5, p2, v2

    .line 41
    .line 42
    div-float/2addr v5, v4

    .line 43
    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 44
    .line 45
    .line 46
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->l:F

    .line 47
    .line 48
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->m:F

    .line 49
    .line 50
    return-void
.end method

.method public final e(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->g:Ljava/util/Stack;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 14
    .line 15
    .line 16
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->l:F

    .line 17
    .line 18
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->m:F

    .line 19
    .line 20
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:Landroid/graphics/Path;

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->l:F

    .line 4
    .line 5
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->m:F

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->i:Landroid/graphics/Canvas;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:Landroid/graphics/Path;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->f:Ljava/util/Stack;

    .line 20
    .line 21
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/edit/f;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:Landroid/graphics/Path;

    .line 24
    .line 25
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-direct {v1, v2, v3}, Lcom/xuexiang/xui/widget/imageview/edit/f;-><init>(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    new-instance v0, Landroid/graphics/Path;

    .line 34
    .line 35
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:Landroid/graphics/Path;

    .line 39
    .line 40
    return-void
.end method

.method public getBrushColor()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

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
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public getBrushSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public getDrawingPaint()Landroid/graphics/Paint;
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

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
            "Lcom/xuexiang/xui/widget/imageview/edit/f;",
            ">;",
            "Ljava/util/Stack<",
            "Lcom/xuexiang/xui/widget/imageview/edit/f;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/util/Pair;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->f:Ljava/util/Stack;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->g:Ljava/util/Stack;

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
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->f:Ljava/util/Stack;

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
    check-cast v1, Lcom/xuexiang/xui/widget/imageview/edit/f;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/edit/f;->b()Landroid/graphics/Path;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/edit/f;->a()Landroid/graphics/Paint;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->k:Landroid/graphics/Path;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public onSizeChanged(IIII)V
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
    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->i:Landroid/graphics/Canvas;

    .line 16
    .line 17
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

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
    if-eqz p1, :cond_2

    .line 19
    .line 20
    if-eq p1, v2, :cond_1

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
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->d(FF)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->f()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->e(FF)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 38
    .line 39
    .line 40
    return v2

    .line 41
    :cond_3
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method public setBrushColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

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
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->j:Z

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->a()V

    .line 10
    .line 11
    .line 12
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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->h:Landroid/graphics/Paint;

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
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->d:F

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
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->c:F

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

.method public setBrushViewChangeListener(Lcom/xuexiang/xui/widget/imageview/edit/b;)V
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
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->e:I

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
