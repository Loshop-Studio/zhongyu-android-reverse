.class public Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private arrowPaint:Landroid/graphics/Paint;

.field private arrowPath:Landroid/graphics/Path;

.field private arrowSize:F

.field private backViewColor:I

.field private backViewHeight:F

.field private bgPaint:Landroid/graphics/Paint;

.field private bgPath:Landroid/graphics/Path;

.field private maxSlideLength:F

.field private slideLength:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p1, -0x1000000

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->backViewColor:I

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->backViewHeight:F

    const/high16 p2, 0x41200000    # 10.0f

    .line 6
    iput p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowSize:F

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->maxSlideLength:F

    .line 8
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->slideLength:F

    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->init()V

    return-void
.end method

.method private init()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->bgPath:Landroid/graphics/Path;

    .line 2
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowPath:Landroid/graphics/Path;

    .line 3
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->bgPaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->bgPaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->bgPaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->backViewColor:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->bgPaint:Landroid/graphics/Paint;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 8
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowPaint:Landroid/graphics/Paint;

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowPaint:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowPaint:Landroid/graphics/Paint;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method


# virtual methods
.method public getBackViewHeight()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->backViewHeight:F

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->bgPath:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 3
    iget-object v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->bgPath:Landroid/graphics/Path;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 4
    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->bgPath:Landroid/graphics/Path;

    iget v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->backViewHeight:F

    const/high16 v11, 0x40000000    # 2.0f

    mul-float v5, v2, v11

    const/high16 v12, 0x41100000    # 9.0f

    div-float v6, v5, v12

    iget v9, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->slideLength:F

    const/high16 v13, 0x40400000    # 3.0f

    div-float v8, v2, v13

    div-float v10, v2, v11

    const/4 v5, 0x0

    move v7, v9

    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 5
    iget-object v14, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->bgPath:Landroid/graphics/Path;

    iget v15, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->slideLength:F

    iget v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->backViewHeight:F

    mul-float v4, v2, v11

    div-float v16, v4, v13

    const/high16 v4, 0x40e00000    # 7.0f

    mul-float v4, v4, v2

    div-float v18, v4, v12

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v20, v2

    invoke-virtual/range {v14 .. v20}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 6
    iget-object v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->bgPath:Landroid/graphics/Path;

    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->bgPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 7
    iget v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->slideLength:F

    iget v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->maxSlideLength:F

    div-float/2addr v2, v4

    const/high16 v4, 0x3f400000    # 0.75f

    cmpg-float v5, v2, v4

    if-gez v5, :cond_0

    goto :goto_0

    :cond_0
    sub-float v3, v2, v4

    mul-float v3, v3, v11

    .line 8
    :goto_0
    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowPath:Landroid/graphics/Path;

    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 9
    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowPath:Landroid/graphics/Path;

    iget v5, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->slideLength:F

    div-float/2addr v5, v11

    iget v6, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowSize:F

    mul-float v7, v6, v3

    add-float/2addr v5, v7

    iget v7, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->backViewHeight:F

    div-float/2addr v7, v11

    mul-float v6, v6, v2

    sub-float/2addr v7, v6

    invoke-virtual {v4, v5, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 10
    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowPath:Landroid/graphics/Path;

    iget v5, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->slideLength:F

    div-float/2addr v5, v11

    iget v6, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowSize:F

    mul-float v6, v6, v3

    sub-float/2addr v5, v6

    iget v6, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->backViewHeight:F

    div-float/2addr v6, v11

    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 11
    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowPath:Landroid/graphics/Path;

    iget v5, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->slideLength:F

    div-float/2addr v5, v11

    iget v6, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowSize:F

    mul-float v3, v3, v6

    add-float/2addr v5, v3

    iget v3, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->backViewHeight:F

    div-float/2addr v3, v11

    mul-float v2, v2, v6

    add-float/2addr v3, v2

    invoke-virtual {v4, v5, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 12
    iget-object v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowPath:Landroid/graphics/Path;

    iget-object v3, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 13
    iget v1, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->slideLength:F

    iget v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->maxSlideLength:F

    div-float/2addr v1, v2

    const v2, 0x3e4ccccd    # 0.2f

    sub-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public setArrowSize(F)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->arrowSize:F

    return-void
.end method

.method public setBackViewColor(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->backViewColor:I

    return-void
.end method

.method public setBackViewHeight(F)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->backViewHeight:F

    return-void
.end method

.method public setMaxSlideLength(F)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->maxSlideLength:F

    return-void
.end method

.method public updateSlideLength(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->slideLength:F

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
