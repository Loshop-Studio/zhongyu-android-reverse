.class public Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;
.super Lb/c/a/e/h/a/c;
.source ""

# interfaces
.implements Lb/c/a/e/h/a/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;,
        Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;
    }
.end annotation


# static fields
.field public static final o:Landroid/graphics/RectF;

.field public static final p:Landroid/graphics/RectF;

.field public static final q:Landroid/graphics/RectF;


# instance fields
.field public k:I

.field public l:I

.field public m:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

.field public n:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, -0x3e580000    # -21.0f

    const/high16 v2, 0x41a80000    # 21.0f

    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->o:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, -0x3e400000    # -24.0f

    const/high16 v2, 0x41c00000    # 24.0f

    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->p:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, -0x3e680000    # -19.0f

    const/high16 v2, 0x41980000    # 19.0f

    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->q:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    invoke-direct {p0, p1}, Lb/c/a/e/h/a/c;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;-><init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$a;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->m:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

    new-instance v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;-><init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$a;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->n:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v0, 0x42280000    # 42.0f

    mul-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->k:I

    const/high16 v0, 0x42400000    # 48.0f

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->l:I

    const/4 p1, 0x2

    new-array v0, p1, [Landroid/animation/Animator;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->m:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

    .line 1
    sget-object v2, Lb/c/a/e/h/a/a;->a:Landroid/graphics/Path;

    new-array v2, p1, [F

    fill-array-data v2, :array_0

    const-string v3, "trimPathStart"

    invoke-static {v1, v3, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    const-wide/16 v3, 0x535

    invoke-virtual {v2, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object v5, Lb/c/a/e/h/a/r;->b:Landroid/view/animation/Interpolator;

    invoke-virtual {v2, v5}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const/4 v5, -0x1

    invoke-virtual {v2, v5}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    new-array v6, p1, [F

    fill-array-data v6, :array_1

    const-string v7, "trimPathEnd"

    invoke-static {v1, v7, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v6

    invoke-virtual {v6, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object v7, Lb/c/a/e/h/a/q;->b:Landroid/view/animation/Interpolator;

    invoke-virtual {v6, v7}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v6, v5}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    new-array v7, p1, [F

    fill-array-data v7, :array_2

    const-string v8, "trimPathOffset"

    invoke-static {v1, v8, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object v3, Lb/c/a/e/h/a/p;->a:Landroid/view/animation/Interpolator;

    invoke-virtual {v1, v3}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v1, v5}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v7, 0x3

    new-array v7, v7, [Landroid/animation/Animator;

    const/4 v8, 0x0

    aput-object v2, v7, v8

    const/4 v2, 0x1

    aput-object v6, v7, v2

    aput-object v1, v7, p1

    invoke-virtual {v4, v7}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    aput-object v4, v0, v8

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->n:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;

    new-array p1, p1, [F

    .line 3
    fill-array-data p1, :array_3

    const-string v4, "rotation"

    invoke-static {v1, v4, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v6, 0x1a09

    invoke-virtual {p1, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {p1, v3}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {p1, v5}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    aput-object p1, v0, v2

    .line 4
    iput-object v0, p0, Lb/c/a/e/h/a/c;->j:[Landroid/animation/Animator;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f400000    # 0.75f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f400000    # 0.75f
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x3e800000    # 0.25f
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x44340000    # 720.0f
    .end array-data
.end method


# virtual methods
.method public f(Landroid/graphics/Canvas;IILandroid/graphics/Paint;)V
    .locals 10

    iget-boolean v0, p0, Lb/c/a/e/h/a/d;->i:Z

    const/high16 v1, 0x40000000    # 2.0f

    int-to-float p2, p2

    if-eqz v0, :cond_0

    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->p:Landroid/graphics/RectF;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->o:Landroid/graphics/RectF;

    :goto_0
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v2

    div-float/2addr p2, v2

    int-to-float p3, p3

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr p3, v2

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->scale(FF)V

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result p2

    div-float/2addr p2, v1

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result p3

    div-float/2addr p3, v1

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result p2

    iget-object p3, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->n:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;

    .line 2
    iget p3, p3, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;->a:F

    .line 3
    invoke-virtual {p1, p3}, Landroid/graphics/Canvas;->rotate(F)V

    const/high16 p3, -0x3d4c0000    # -90.0f

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->m:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

    iget v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;->c:F

    iget v2, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;->a:F

    add-float/2addr v1, v2

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v1, v3

    add-float v6, v1, p3

    iget p3, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;->b:F

    sub-float/2addr p3, v2

    mul-float v7, p3, v3

    sget-object v5, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->q:Landroid/graphics/RectF;

    const/4 v8, 0x0

    move-object v4, p1

    move-object v9, p4

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public g(Landroid/graphics/Paint;)V
    .locals 1

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v0, 0x40800000    # 4.0f

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object v0, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    return-void
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb/c/a/e/h/a/d;->i:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->l:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->k:I

    :goto_0
    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb/c/a/e/h/a/d;->i:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->l:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->k:I

    :goto_0
    return v0
.end method
