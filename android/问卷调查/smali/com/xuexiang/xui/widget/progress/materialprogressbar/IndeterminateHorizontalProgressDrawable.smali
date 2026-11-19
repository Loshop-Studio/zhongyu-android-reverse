.class public Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;
.super Lb/c/a/e/h/a/c;
.source ""

# interfaces
.implements Lb/c/a/e/h/a/t;
.implements Lb/c/a/e/h/a/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;
    }
.end annotation


# static fields
.field public static final q:Landroid/graphics/RectF;

.field public static final r:Landroid/graphics/RectF;

.field public static final s:Landroid/graphics/RectF;

.field public static final t:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

.field public static final u:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;


# instance fields
.field public k:I

.field public l:I

.field public m:Z

.field public n:F

.field public o:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

.field public p:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, -0x3ccc0000    # -180.0f

    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v3, 0x43340000    # 180.0f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->q:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    const/high16 v5, -0x3f800000    # -4.0f

    const/high16 v6, 0x40800000    # 4.0f

    invoke-direct {v0, v1, v5, v3, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->r:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, -0x3cf00000    # -144.0f

    const/high16 v3, 0x43100000    # 144.0f

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->s:Landroid/graphics/RectF;

    new-instance v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    const v1, -0x3bfd599a    # -522.6f

    const v2, 0x3dcccccd    # 0.1f

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;-><init>(FF)V

    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->t:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    new-instance v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    const v1, -0x3cba6666    # -197.6f

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;-><init>(FF)V

    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->u:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 13

    invoke-direct {p0, p1}, Lb/c/a/e/h/a/c;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->m:Z

    new-instance v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    sget-object v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->t:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;-><init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->o:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    new-instance v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    sget-object v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->u:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;-><init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->p:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x40800000    # 4.0f

    mul-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->k:I

    const/high16 v2, 0x41800000    # 16.0f

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->l:I

    const v1, 0x1010033

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Lb/c/a/a;->D(Landroid/content/Context;IF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->n:F

    const/4 p1, 0x2

    new-array v1, p1, [Landroid/animation/Animator;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->o:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 1
    sget-object v3, Lb/c/a/e/h/a/a;->a:Landroid/graphics/Path;

    const-string v4, "translateX"

    const/4 v5, 0x0

    .line 2
    invoke-static {v2, v4, v5, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v3

    const-wide/16 v6, 0x7d0

    .line 3
    invoke-virtual {v3, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object v8, Lb/c/a/e/h/a/m;->b:Landroid/view/animation/Interpolator;

    invoke-virtual {v3, v8}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const/4 v8, -0x1

    invoke-virtual {v3, v8}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    sget-object v9, Lb/c/a/e/h/a/a;->b:Landroid/graphics/Path;

    const-string v10, "scaleX"

    .line 4
    invoke-static {v2, v5, v10, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 5
    invoke-virtual {v2, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object v9, Lb/c/a/e/h/a/l;->b:Landroid/view/animation/Interpolator;

    invoke-virtual {v2, v9}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v2, v8}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    new-instance v9, Landroid/animation/AnimatorSet;

    invoke-direct {v9}, Landroid/animation/AnimatorSet;-><init>()V

    new-array v11, p1, [Landroid/animation/Animator;

    const/4 v12, 0x0

    aput-object v3, v11, v12

    aput-object v2, v11, v0

    invoke-virtual {v9, v11}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    aput-object v9, v1, v12

    .line 6
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->p:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 7
    sget-object v3, Lb/c/a/e/h/a/a;->c:Landroid/graphics/Path;

    .line 8
    invoke-static {v2, v4, v5, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 9
    invoke-virtual {v3, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object v4, Lb/c/a/e/h/a/o;->b:Landroid/view/animation/Interpolator;

    invoke-virtual {v3, v4}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v3, v8}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    sget-object v4, Lb/c/a/e/h/a/a;->d:Landroid/graphics/Path;

    .line 10
    invoke-static {v2, v5, v10, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 11
    invoke-virtual {v2, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object v4, Lb/c/a/e/h/a/n;->b:Landroid/view/animation/Interpolator;

    invoke-virtual {v2, v4}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v2, v8}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    new-array p1, p1, [Landroid/animation/Animator;

    aput-object v3, p1, v12

    aput-object v2, p1, v0

    invoke-virtual {v4, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    aput-object v4, v1, v0

    .line 12
    iput-object v1, p0, Lb/c/a/e/h/a/c;->j:[Landroid/animation/Animator;

    return-void
.end method

.method public static i(Landroid/graphics/Canvas;Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;Landroid/graphics/Paint;)V
    .locals 3

    invoke-virtual {p0}, Landroid/graphics/Canvas;->save()I

    move-result v0

    iget v1, p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->a:F

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    iget p1, p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->b:F

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, v1}, Landroid/graphics/Canvas;->scale(FF)V

    sget-object p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->s:Landroid/graphics/RectF;

    invoke-virtual {p0, p1, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-virtual {p0, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->m:Z

    return v0
.end method

.method public b(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->m:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->m:Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public f(Landroid/graphics/Canvas;IILandroid/graphics/Paint;)V
    .locals 3

    iget-boolean v0, p0, Lb/c/a/e/h/a/d;->i:Z

    const/high16 v1, 0x40000000    # 2.0f

    int-to-float p2, p2

    if-eqz v0, :cond_0

    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->r:Landroid/graphics/RectF;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->q:Landroid/graphics/RectF;

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

    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->m:Z

    if-eqz p2, :cond_1

    iget p2, p0, Lb/c/a/e/h/a/b;->b:I

    int-to-float p2, p2

    iget p3, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->n:F

    mul-float/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-virtual {p4, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 1
    sget-object p2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->q:Landroid/graphics/RectF;

    invoke-virtual {p1, p2, p4}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 2
    iget p2, p0, Lb/c/a/e/h/a/b;->b:I

    invoke-virtual {p4, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    :cond_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->p:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    invoke-static {p1, p2, p4}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->i(Landroid/graphics/Canvas;Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;Landroid/graphics/Paint;)V

    iget-object p2, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->o:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    invoke-static {p1, p2, p4}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->i(Landroid/graphics/Canvas;Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;Landroid/graphics/Paint;)V

    return-void
.end method

.method public g(Landroid/graphics/Paint;)V
    .locals 1

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method

.method public getIntrinsicHeight()I
    .locals 1

    iget-boolean v0, p0, Lb/c/a/e/h/a/d;->i:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->l:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->k:I

    :goto_0
    return v0
.end method
