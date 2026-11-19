.class public Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;
.super Lcom/xuexiang/xui/widget/progress/materialprogressbar/c;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;,
        Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;
    }
.end annotation


# static fields
.field public static final p:Landroid/graphics/RectF;

.field public static final q:Landroid/graphics/RectF;

.field public static final r:Landroid/graphics/RectF;


# instance fields
.field public l:I

.field public m:I

.field public n:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

.field public o:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    const/high16 v1, -0x3e580000    # -21.0f

    .line 4
    .line 5
    const/high16 v2, 0x41a80000    # 21.0f

    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->p:Landroid/graphics/RectF;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/RectF;

    .line 13
    .line 14
    const/high16 v1, -0x3e400000    # -24.0f

    .line 15
    .line 16
    const/high16 v2, 0x41c00000    # 24.0f

    .line 17
    .line 18
    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->q:Landroid/graphics/RectF;

    .line 22
    .line 23
    new-instance v0, Landroid/graphics/RectF;

    .line 24
    .line 25
    const/high16 v1, -0x3e680000    # -19.0f

    .line 26
    .line 27
    const/high16 v2, 0x41980000    # 19.0f

    .line 28
    .line 29
    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->r:Landroid/graphics/RectF;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/c;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;-><init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$a;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->n:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

    .line 11
    .line 12
    new-instance v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;-><init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$a;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->o:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 28
    .line 29
    const/high16 v0, 0x42280000    # 42.0f

    .line 30
    .line 31
    mul-float/2addr v0, p1

    .line 32
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->l:I

    .line 37
    .line 38
    const/high16 v0, 0x42400000    # 48.0f

    .line 39
    .line 40
    mul-float/2addr p1, v0

    .line 41
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->m:I

    .line 46
    .line 47
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->n:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

    .line 48
    .line 49
    invoke-static {p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/a;->a(Ljava/lang/Object;)Landroid/animation/Animator;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->o:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;

    .line 54
    .line 55
    invoke-static {v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/a;->d(Ljava/lang/Object;)Landroid/animation/Animator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    filled-new-array {p1, v0}, [Landroid/animation/Animator;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/c;->k:[Landroid/animation/Animator;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public bridge synthetic c(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/e;->c(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic d()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/e;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic draw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/c;->draw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic getAlpha()I
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->getAlpha()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->getColorFilter()Landroid/graphics/ColorFilter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->l()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->l()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic getOpacity()I
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->getOpacity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public h(Landroid/graphics/Canvas;IILandroid/graphics/Paint;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/e;->j:Z

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    int-to-float p2, p2

    .line 8
    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->q:Landroid/graphics/RectF;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    div-float/2addr p2, v2

    .line 15
    int-to-float p3, p3

    .line 16
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    div-float/2addr p3, v2

    .line 21
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    div-float/2addr p2, v1

    .line 29
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    div-float/2addr p3, v1

    .line 34
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    int-to-float p2, p2

    .line 39
    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->p:Landroid/graphics/RectF;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    div-float/2addr p2, v2

    .line 46
    int-to-float p3, p3

    .line 47
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    div-float/2addr p3, v2

    .line 52
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    div-float/2addr p2, v1

    .line 60
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    div-float/2addr p3, v1

    .line 65
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-virtual {p0, p1, p4}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->k(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public i(Landroid/graphics/Paint;)V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    .line 5
    .line 6
    const/high16 v0, 0x40800000    # 4.0f

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public bridge synthetic isRunning()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/c;->isRunning()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic isStateful()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->isStateful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final k(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->o:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;

    .line 6
    .line 7
    invoke-static {v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;->a(Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;)F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->rotate(F)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->n:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

    .line 15
    .line 16
    iget v2, v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;->c:F

    .line 17
    .line 18
    iget v3, v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;->a:F

    .line 19
    .line 20
    add-float/2addr v2, v3

    .line 21
    const/high16 v4, 0x43b40000    # 360.0f

    .line 22
    .line 23
    mul-float/2addr v2, v4

    .line 24
    const/high16 v5, -0x3d4c0000    # -90.0f

    .line 25
    .line 26
    add-float v8, v2, v5

    .line 27
    .line 28
    iget v1, v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;->b:F

    .line 29
    .line 30
    sub-float/2addr v1, v3

    .line 31
    mul-float v9, v1, v4

    .line 32
    .line 33
    sget-object v7, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->r:Landroid/graphics/RectF;

    .line 34
    .line 35
    const/4 v10, 0x0

    .line 36
    move-object v6, p1

    .line 37
    move-object v11, p2

    .line 38
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final l()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/e;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->m:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->l:I

    .line 9
    .line 10
    return v0
.end method

.method public bridge synthetic setAlpha(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->setAlpha(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setTint(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->setTint(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic start()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/c;->start()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic stop()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/c;->stop()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
