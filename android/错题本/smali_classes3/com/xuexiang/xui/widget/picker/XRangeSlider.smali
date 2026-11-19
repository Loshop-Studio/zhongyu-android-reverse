.class public Lcom/xuexiang/xui/widget/picker/XRangeSlider;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public b:I

.field public c:I

.field public d:Z

.field public final e:Landroid/graphics/Rect;

.field public final f:Landroid/graphics/Rect;

.field public final g:Ljava/util/HashSet;

.field public final h:Ljava/util/HashSet;

.field public i:I

.field public j:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->XRangeSliderStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->a:Landroid/graphics/Paint;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b:I

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c:I

    .line 7
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->e:Landroid/graphics/Rect;

    .line 8
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->f:Landroid/graphics/Rect;

    .line 9
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 10
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->g:Ljava/util/HashSet;

    .line 11
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->h:Ljava/util/HashSet;

    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->i:I

    const/16 p1, 0x64

    .line 13
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->j:I

    .line 14
    invoke-static {}, Lt1/a;->a()V

    const/4 p1, 0x0

    throw p1
.end method

.method private getMaxTextLength()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->j:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->f:Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c(Ljava/lang/String;Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method private getMinTextLength()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->i:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->e:Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c(Ljava/lang/String;Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method private setSelectedMax(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->i:I

    .line 2
    .line 3
    sub-int/2addr p1, v0

    .line 4
    int-to-float p1, p1

    .line 5
    const/4 v0, 0x0

    .line 6
    div-float/2addr p1, v0

    .line 7
    const/4 v0, 0x0

    .line 8
    int-to-float v0, v0

    .line 9
    add-float/2addr p1, v0

    .line 10
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c:I

    .line 15
    .line 16
    return-void
.end method

.method private setSelectedMin(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->i:I

    .line 2
    .line 3
    sub-int/2addr p1, v0

    .line 4
    int-to-float p1, p1

    .line 5
    const/4 v0, 0x0

    .line 6
    div-float/2addr p1, v0

    .line 7
    const/4 v0, 0x0

    .line 8
    int-to-float v0, v0

    .line 9
    add-float/2addr p1, v0

    .line 10
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;I)Z
    .locals 3

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c:I

    .line 6
    .line 7
    int-to-float v1, v1

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c:I

    .line 18
    .line 19
    int-to-float v2, v2

    .line 20
    cmpg-float v0, v0, v2

    .line 21
    .line 22
    if-gez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getY(I)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-float v2, v1

    .line 29
    cmpl-float v0, v0, v2

    .line 30
    .line 31
    if-lez v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getY(I)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    cmpg-float v0, v0, v2

    .line 38
    .line 39
    if-gez v0, :cond_0

    .line 40
    .line 41
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->d:Z

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->h:Ljava/util/HashSet;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :cond_0
    return v1
.end method

.method public final b(Landroid/view/MotionEvent;I)Z
    .locals 3

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b:I

    .line 6
    .line 7
    int-to-float v1, v1

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b:I

    .line 18
    .line 19
    int-to-float v2, v2

    .line 20
    cmpg-float v0, v0, v2

    .line 21
    .line 22
    if-gez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getY(I)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-float v2, v1

    .line 29
    cmpl-float v0, v0, v2

    .line 30
    .line 31
    if-lez v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getY(I)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    cmpg-float v0, v0, v2

    .line 38
    .line 39
    if-gez v0, :cond_0

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->d:Z

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->g:Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    return v0

    .line 58
    :cond_0
    return v1
.end method

.method public final c(Ljava/lang/String;Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->a:Landroid/graphics/Paint;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-virtual {v1, p1, v0, v2, p2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final d(Landroid/view/MotionEvent;I)V
    .locals 3

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c:I

    .line 6
    .line 7
    int-to-float v1, v1

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-float v2, v1

    .line 18
    cmpg-float v0, v0, v2

    .line 19
    .line 20
    if-gtz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    float-to-int p1, p1

    .line 27
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c:I

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b:I

    .line 38
    .line 39
    int-to-float v2, v2

    .line 40
    cmpg-float v0, v0, v2

    .line 41
    .line 42
    if-gez v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    int-to-float v1, v1

    .line 49
    cmpl-float v0, v0, v1

    .line 50
    .line 51
    if-ltz v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    float-to-int p1, p1

    .line 58
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b:I

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public final e(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public getMax()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public getMin()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public getSelectedMax()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    mul-float/2addr v0, v1

    .line 6
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->i:I

    .line 7
    .line 8
    int-to-float v1, v1

    .line 9
    add-float/2addr v0, v1

    .line 10
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public getSelectedMin()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    mul-float/2addr v0, v1

    .line 6
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->i:I

    .line 7
    .line 8
    int-to-float v1, v1

    .line 9
    add-float/2addr v0, v1

    .line 10
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v5, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 5
    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 9
    .line 10
    .line 11
    int-to-float v1, v6

    .line 12
    move v2, v1

    .line 13
    move v3, v1

    .line 14
    move v4, v1

    .line 15
    move-object v0, p1

    .line 16
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b:I

    .line 26
    .line 27
    int-to-float p1, p1

    .line 28
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c:I

    .line 29
    .line 30
    int-to-float v3, v2

    .line 31
    move v2, v1

    .line 32
    move v1, p1

    .line 33
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->getSelectedMin()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->getSelectedMax()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->e:Landroid/graphics/Rect;

    .line 53
    .line 54
    invoke-virtual {p0, p1, v1}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c(Ljava/lang/String;Landroid/graphics/Rect;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->f:Landroid/graphics/Rect;

    .line 58
    .line 59
    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c(Ljava/lang/String;Landroid/graphics/Rect;)V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    throw p1
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->i:I

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->e:Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c(Ljava/lang/String;Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->j:I

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->f:Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c(Ljava/lang/String;Landroid/graphics/Rect;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    throw p1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eqz v3, :cond_10

    .line 23
    .line 24
    iget-object v5, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->h:Ljava/util/HashSet;

    .line 25
    .line 26
    iget-object v6, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->g:Ljava/util/HashSet;

    .line 27
    .line 28
    if-eq v3, v4, :cond_f

    .line 29
    .line 30
    const/4 v7, 0x2

    .line 31
    if-eq v3, v7, :cond_5

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    if-eq v3, v1, :cond_4

    .line 35
    .line 36
    const/4 v1, 0x5

    .line 37
    if-eq v3, v1, :cond_1

    .line 38
    .line 39
    const/4 v1, 0x6

    .line 40
    if-eq v3, v1, :cond_f

    .line 41
    .line 42
    goto/16 :goto_7

    .line 43
    .line 44
    :cond_1
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->e(Z)V

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-ge v0, v1, :cond_12

    .line 52
    .line 53
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->d:Z

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b(Landroid/view/MotionEvent;I)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->a(Landroid/view/MotionEvent;I)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_3

    .line 68
    .line 69
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->d(Landroid/view/MotionEvent;I)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->a(Landroid/view/MotionEvent;I)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b(Landroid/view/MotionEvent;I)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->d(Landroid/view/MotionEvent;I)V

    .line 86
    .line 87
    .line 88
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->e(Z)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/util/HashSet;->clear()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/util/HashSet;->clear()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 101
    .line 102
    .line 103
    return v4

    .line 104
    :cond_5
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->e(Z)V

    .line 105
    .line 106
    .line 107
    :goto_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-ge v0, v2, :cond_e

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v6, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_9

    .line 126
    .line 127
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    float-to-int v2, v2

    .line 132
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 137
    .line 138
    .line 139
    move-result-wide v7

    .line 140
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 141
    .line 142
    .line 143
    move-result-wide v9

    .line 144
    cmpl-double v3, v7, v9

    .line 145
    .line 146
    if-lez v3, :cond_6

    .line 147
    .line 148
    :goto_3
    move-object v2, v1

    .line 149
    goto :goto_4

    .line 150
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 151
    .line 152
    .line 153
    move-result-wide v7

    .line 154
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 155
    .line 156
    .line 157
    move-result-wide v9

    .line 158
    cmpg-double v3, v7, v9

    .line 159
    .line 160
    if-gez v3, :cond_7

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_7
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    iget v3, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c:I

    .line 168
    .line 169
    if-lt v2, v3, :cond_8

    .line 170
    .line 171
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c:I

    .line 172
    .line 173
    :cond_8
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b:I

    .line 174
    .line 175
    :cond_9
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v5, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-eqz v2, :cond_d

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    float-to-int v2, v2

    .line 194
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 199
    .line 200
    .line 201
    move-result-wide v7

    .line 202
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 203
    .line 204
    .line 205
    move-result-wide v9

    .line 206
    cmpl-double v3, v7, v9

    .line 207
    .line 208
    if-lez v3, :cond_a

    .line 209
    .line 210
    :goto_5
    move-object v2, v1

    .line 211
    goto :goto_6

    .line 212
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 213
    .line 214
    .line 215
    move-result-wide v7

    .line 216
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 217
    .line 218
    .line 219
    move-result-wide v9

    .line 220
    cmpg-double v3, v7, v9

    .line 221
    .line 222
    if-gez v3, :cond_b

    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_b
    :goto_6
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    iget v3, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b:I

    .line 230
    .line 231
    if-gt v2, v3, :cond_c

    .line 232
    .line 233
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b:I

    .line 234
    .line 235
    :cond_c
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->c:I

    .line 236
    .line 237
    :cond_d
    add-int/lit8 v0, v0, 0x1

    .line 238
    .line 239
    goto/16 :goto_2

    .line 240
    .line 241
    :cond_e
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 242
    .line 243
    .line 244
    return v4

    .line 245
    :cond_f
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->e(Z)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v6, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-virtual {v5, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 271
    .line 272
    .line 273
    return v4

    .line 274
    :cond_10
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->e(Z)V

    .line 275
    .line 276
    .line 277
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->d:Z

    .line 278
    .line 279
    if-eqz v0, :cond_11

    .line 280
    .line 281
    invoke-virtual {p0, p1, v2}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b(Landroid/view/MotionEvent;I)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-nez v0, :cond_12

    .line 286
    .line 287
    invoke-virtual {p0, p1, v2}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->a(Landroid/view/MotionEvent;I)Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-nez v0, :cond_12

    .line 292
    .line 293
    invoke-virtual {p0, p1, v2}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->d(Landroid/view/MotionEvent;I)V

    .line 294
    .line 295
    .line 296
    return v4

    .line 297
    :cond_11
    invoke-virtual {p0, p1, v2}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->a(Landroid/view/MotionEvent;I)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-nez v0, :cond_12

    .line 302
    .line 303
    invoke-virtual {p0, p1, v2}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->b(Landroid/view/MotionEvent;I)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-nez v0, :cond_12

    .line 308
    .line 309
    invoke-virtual {p0, p1, v2}, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->d(Landroid/view/MotionEvent;I)V

    .line 310
    .line 311
    .line 312
    :cond_12
    :goto_7
    return v4
.end method

.method public setMax(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->j:I

    .line 2
    .line 3
    return-void
.end method

.method public setMin(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XRangeSlider;->i:I

    .line 2
    .line 3
    return-void
.end method

.method public setOnRangeSliderListener(Ld3/b;)V
    .locals 0

    .line 1
    return-void
.end method
