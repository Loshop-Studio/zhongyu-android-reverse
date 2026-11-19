.class public Lcom/xuexiang/xui/widget/button/SwitchIconView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;
    }
.end annotation


# static fields
.field public static final s:F


# instance fields
.field public final a:J

.field public final b:F

.field public final c:I

.field public final d:I

.field public final e:Landroid/graphics/Path;

.field public final f:I

.field public final g:I

.field public final h:Z

.field public i:I

.field public j:I

.field public k:I

.field public l:Landroid/graphics/PorterDuffColorFilter;

.field public final m:Landroid/animation/ArgbEvaluator;

.field public n:F

.field public o:Z

.field public final p:Landroid/graphics/Paint;

.field public final q:Landroid/graphics/Point;

.field public final r:Landroid/graphics/Point;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, 0x4046800000000000L    # 45.0

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    double-to-float v0, v0

    .line 15
    sput v0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->s:F

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/button/SwitchIconView;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->setFraction(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private setFraction(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->n:F

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->j(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->h(F)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->i()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->e()V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final b(F)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->n:F

    .line 6
    .line 7
    aput v2, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aput p1, v0, v1

    .line 11
    .line 12
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Lcom/xuexiang/xui/widget/button/SwitchIconView$a;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView$a;-><init>(Lcom/xuexiang/xui/widget/button/SwitchIconView;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 25
    .line 26
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 30
    .line 31
    .line 32
    iget-wide v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->a:J

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->n:F

    .line 2
    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->r:Landroid/graphics/Point;

    .line 4
    .line 5
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 6
    .line 7
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->q:Landroid/graphics/Point;

    .line 8
    .line 9
    iget v4, v3, Landroid/graphics/Point;->x:I

    .line 10
    .line 11
    sub-int/2addr v2, v4

    .line 12
    int-to-float v2, v2

    .line 13
    mul-float/2addr v2, v0

    .line 14
    int-to-float v5, v4

    .line 15
    add-float v9, v2, v5

    .line 16
    .line 17
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 18
    .line 19
    iget v2, v3, Landroid/graphics/Point;->y:I

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    int-to-float v1, v1

    .line 23
    mul-float/2addr v0, v1

    .line 24
    int-to-float v1, v2

    .line 25
    add-float v10, v0, v1

    .line 26
    .line 27
    int-to-float v7, v4

    .line 28
    int-to-float v8, v2

    .line 29
    iget-object v11, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->p:Landroid/graphics/Paint;

    .line 30
    .line 31
    move-object v6, p1

    .line 32
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final d()V
    .locals 6

    .line 1
    sget v0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->s:F

    .line 2
    .line 3
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 4
    .line 5
    mul-float/2addr v1, v0

    .line 6
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->i:I

    .line 7
    .line 8
    int-to-float v3, v2

    .line 9
    mul-float/2addr v1, v3

    .line 10
    const/high16 v3, 0x3f000000    # 0.5f

    .line 11
    .line 12
    mul-float/2addr v0, v3

    .line 13
    int-to-float v2, v2

    .line 14
    mul-float/2addr v0, v2

    .line 15
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->q:Landroid/graphics/Point;

    .line 16
    .line 17
    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->c:I

    .line 18
    .line 19
    int-to-float v4, v3

    .line 20
    add-float/2addr v4, v0

    .line 21
    float-to-int v4, v4

    .line 22
    iput v4, v2, Landroid/graphics/Point;->x:I

    .line 23
    .line 24
    iget v4, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->d:I

    .line 25
    .line 26
    float-to-int v5, v1

    .line 27
    add-int/2addr v5, v4

    .line 28
    iput v5, v2, Landroid/graphics/Point;->y:I

    .line 29
    .line 30
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->r:Landroid/graphics/Point;

    .line 31
    .line 32
    iget v5, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->j:I

    .line 33
    .line 34
    add-int/2addr v3, v5

    .line 35
    int-to-float v3, v3

    .line 36
    sub-float/2addr v3, v1

    .line 37
    float-to-int v1, v3

    .line 38
    iput v1, v2, Landroid/graphics/Point;->x:I

    .line 39
    .line 40
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->k:I

    .line 41
    .line 42
    add-int/2addr v4, v1

    .line 43
    int-to-float v1, v4

    .line 44
    sub-float/2addr v1, v0

    .line 45
    float-to-int v0, v1

    .line 46
    iput v0, v2, Landroid/graphics/Point;->y:I

    .line 47
    .line 48
    return-void
.end method

.method public final e()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public f(ZZ)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->o:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->g(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public g(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    :goto_0
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->o:Z

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->b(F)V

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->setFraction(F)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 23
    .line 24
    .line 25
    :goto_1
    return-void
.end method

.method public final h(F)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->b:F

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    sub-float p1, v1, p1

    .line 6
    .line 7
    sub-float/2addr v1, v0

    .line 8
    mul-float/2addr p1, v1

    .line 9
    add-float/2addr v0, p1

    .line 10
    const/high16 p1, 0x437f0000    # 255.0f

    .line 11
    .line 12
    mul-float/2addr v0, p1

    .line 13
    float-to-int p1, v0

    .line 14
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->k(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->p:Landroid/graphics/Paint;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final i()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->i:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sget v1, Lcom/xuexiang/xui/widget/button/SwitchIconView;->s:F

    .line 5
    .line 6
    div-float/2addr v0, v1

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->e:Landroid/graphics/Path;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->e:Landroid/graphics/Path;

    .line 13
    .line 14
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->c:I

    .line 15
    .line 16
    int-to-float v2, v2

    .line 17
    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->d:I

    .line 18
    .line 19
    int-to-float v3, v3

    .line 20
    add-float/2addr v3, v0

    .line 21
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->e:Landroid/graphics/Path;

    .line 25
    .line 26
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->c:I

    .line 27
    .line 28
    int-to-float v2, v2

    .line 29
    add-float/2addr v2, v0

    .line 30
    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->d:I

    .line 31
    .line 32
    int-to-float v3, v3

    .line 33
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->e:Landroid/graphics/Path;

    .line 37
    .line 38
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->c:I

    .line 39
    .line 40
    int-to-float v2, v2

    .line 41
    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->j:I

    .line 42
    .line 43
    int-to-float v3, v3

    .line 44
    iget v4, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->n:F

    .line 45
    .line 46
    mul-float/2addr v3, v4

    .line 47
    add-float/2addr v2, v3

    .line 48
    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->d:I

    .line 49
    .line 50
    int-to-float v3, v3

    .line 51
    iget v5, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->k:I

    .line 52
    .line 53
    int-to-float v5, v5

    .line 54
    mul-float/2addr v5, v4

    .line 55
    add-float/2addr v3, v5

    .line 56
    sub-float/2addr v3, v0

    .line 57
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->e:Landroid/graphics/Path;

    .line 61
    .line 62
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->c:I

    .line 63
    .line 64
    int-to-float v2, v2

    .line 65
    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->j:I

    .line 66
    .line 67
    int-to-float v3, v3

    .line 68
    iget v4, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->n:F

    .line 69
    .line 70
    mul-float/2addr v3, v4

    .line 71
    add-float/2addr v2, v3

    .line 72
    sub-float/2addr v2, v0

    .line 73
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->d:I

    .line 74
    .line 75
    int-to-float v0, v0

    .line 76
    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->k:I

    .line 77
    .line 78
    int-to-float v3, v3

    .line 79
    mul-float/2addr v3, v4

    .line 80
    add-float/2addr v0, v3

    .line 81
    invoke-virtual {v1, v2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final j(F)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->f:I

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->g:I

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->m:Landroid/animation/ArgbEvaluator;

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->g:I

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, p1, v0, v2}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->l(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->p:Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final k(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageAlpha(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final l(I)V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    .line 2
    .line 3
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->l:Landroid/graphics/PorterDuffColorFilter;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->c(Landroid/graphics/Canvas;)V

    .line 6
    .line 7
    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x1a

    .line 11
    .line 12
    if-lt v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->e:Landroid/graphics/Path;

    .line 15
    .line 16
    invoke-static {p1, v0}, Landroidx/compose/ui/text/android/a0;->a(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->e:Landroid/graphics/Path;

    .line 21
    .line 22
    sget-object v1, Landroid/graphics/Region$Op;->XOR:Landroid/graphics/Region$Op;

    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-super {p0, v0}, Landroid/widget/ImageView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 16
    .line 17
    .line 18
    iget-boolean p1, p1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;->a:Z

    .line 19
    .line 20
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->o:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 27
    .line 28
    :goto_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->setFraction(F)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/ImageView;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->o:Z

    .line 11
    .line 12
    iput-boolean v0, v1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;->a:Z

    .line 13
    .line 14
    return-object v1
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    sub-int/2addr p1, p3

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    sub-int/2addr p1, p3

    .line 14
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->j:I

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    sub-int/2addr p2, p1

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    sub-int/2addr p2, p1

    .line 26
    iput p2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->k:I

    .line 27
    .line 28
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->j:I

    .line 29
    .line 30
    add-int/2addr p1, p2

    .line 31
    int-to-float p1, p1

    .line 32
    const p2, 0x3daaaaab

    .line 33
    .line 34
    .line 35
    mul-float/2addr p1, p2

    .line 36
    const/high16 p2, 0x40000000    # 2.0f

    .line 37
    .line 38
    div-float/2addr p1, p2

    .line 39
    float-to-int p1, p1

    .line 40
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->i:I

    .line 41
    .line 42
    iget-object p2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->p:Landroid/graphics/Paint;

    .line 43
    .line 44
    int-to-float p1, p1

    .line 45
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->d()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->i()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public setIconEnabled(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->f(ZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
