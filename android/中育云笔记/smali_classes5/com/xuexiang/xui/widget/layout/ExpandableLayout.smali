.class public Lcom/xuexiang/xui/widget/layout/ExpandableLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/layout/ExpandableLayout$b;
    }
.end annotation


# instance fields
.field public c:I

.field public d:F

.field public e:F

.field public f:I

.field public g:I

.field public h:Landroid/view/animation/Interpolator;

.field public i:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x12c

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:I

    .line 4
    new-instance v0, Lx8/a;

    invoke-direct {v0}, Lx8/a;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->h:Landroid/view/animation/Interpolator;

    if-eqz p2, :cond_2

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout:[I

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 6
    sget v0, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout_el_duration:I

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:I

    .line 7
    sget p1, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout_el_expanded:I

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz p1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:F

    .line 8
    sget p1, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout_android_orientation:I

    const/4 v3, 0x1

    invoke-virtual {p2, p1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->f:I

    .line 9
    sget p1, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout_el_parallax:I

    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->d:F

    .line 10
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 11
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:F

    cmpl-float p1, p1, v1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x3

    :goto_1
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:I

    .line 12
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->d:F

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e(F)Lcom/xuexiang/xui/widget/layout/ExpandableLayout;

    :cond_2
    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/layout/ExpandableLayout;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:I

    .line 2
    .line 3
    return p1
.end method


# virtual methods
.method public final b(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->i:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->i:Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:F

    .line 12
    .line 13
    int-to-float v1, p1

    .line 14
    const/4 v2, 0x2

    .line 15
    new-array v2, v2, [F

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    aput v0, v2, v3

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    aput v1, v2, v0

    .line 22
    .line 23
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->i:Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->h:Landroid/view/animation/Interpolator;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->i:Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:I

    .line 37
    .line 38
    int-to-long v1, v1

    .line 39
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->i:Landroid/animation/ValueAnimator;

    .line 43
    .line 44
    new-instance v1, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$a;

    .line 45
    .line 46
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$a;-><init>(Lcom/xuexiang/xui/widget/layout/ExpandableLayout;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->i:Landroid/animation/ValueAnimator;

    .line 53
    .line 54
    new-instance v1, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$b;

    .line 55
    .line 56
    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$b;-><init>(Lcom/xuexiang/xui/widget/layout/ExpandableLayout;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->i:Landroid/animation/ValueAnimator;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public c()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
.end method

.method public d(ZZ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-eqz p2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->b(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    int-to-float p1, p1

    .line 15
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->setExpansion(F)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public e(F)Lcom/xuexiang/xui/widget/layout/ExpandableLayout;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->d:F

    .line 13
    .line 14
    return-object p0
.end method

.method public getDuration()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public getExpansion()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public getOrientation()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public getParallax()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public getState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->i:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onMeasure(II)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->f:I

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    move v0, p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, p2

    .line 19
    :goto_0
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:F

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    cmpl-float v1, v1, v2

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const/16 v1, 0x8

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v1, v3

    .line 33
    :goto_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    int-to-float v1, v0

    .line 37
    iget v4, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:F

    .line 38
    .line 39
    mul-float/2addr v1, v4

    .line 40
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    sub-int/2addr v0, v1

    .line 45
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->d:F

    .line 46
    .line 47
    cmpl-float v2, v1, v2

    .line 48
    .line 49
    if-lez v2, :cond_4

    .line 50
    .line 51
    int-to-float v2, v0

    .line 52
    mul-float/2addr v2, v1

    .line 53
    :goto_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-ge v3, v1, :cond_4

    .line 58
    .line 59
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget v4, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->f:I

    .line 64
    .line 65
    if-nez v4, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    const/4 v5, 0x1

    .line 72
    if-ne v4, v5, :cond_2

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_2
    const/4 v5, -0x1

    .line 76
    :goto_3
    int-to-float v4, v5

    .line 77
    mul-float/2addr v4, v2

    .line 78
    invoke-virtual {v1, v4}, Landroid/view/View;->setTranslationX(F)V

    .line 79
    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_3
    neg-float v4, v2

    .line 83
    invoke-virtual {v1, v4}, Landroid/view/View;->setTranslationY(F)V

    .line 84
    .line 85
    .line 86
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->f:I

    .line 90
    .line 91
    if-nez v1, :cond_5

    .line 92
    .line 93
    sub-int/2addr p1, v0

    .line 94
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_5
    sub-int/2addr p2, v0

    .line 99
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    check-cast p1, Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v0, "key_expansion"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:F

    .line 10
    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    cmpl-float v0, v0, v1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:I

    .line 21
    .line 22
    const-string v0, "key_super_state"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    const/high16 v2, 0x3f800000    # 1.0f

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    :goto_0
    iput v2, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:F

    .line 21
    .line 22
    const-string v3, "key_expansion"

    .line 23
    .line 24
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 25
    .line 26
    .line 27
    const-string v2, "key_super_state"

    .line 28
    .line 29
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public setExpanded(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->d(ZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setExpansion(F)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:F

    .line 2
    .line 3
    cmpl-float v1, v0, p1

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sub-float v0, p1, v0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    cmpl-float v2, p1, v1

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    iput v3, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:I

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/high16 v2, 0x3f800000    # 1.0f

    .line 20
    .line 21
    cmpl-float v2, p1, v2

    .line 22
    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    cmpg-float v2, v0, v1

    .line 30
    .line 31
    if-gez v2, :cond_3

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    cmpl-float v0, v0, v1

    .line 38
    .line 39
    if-lez v0, :cond_4

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:I

    .line 43
    .line 44
    :cond_4
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:I

    .line 45
    .line 46
    if-nez v0, :cond_5

    .line 47
    .line 48
    const/16 v3, 0x8

    .line 49
    .line 50
    :cond_5
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:F

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 56
    .line 57
    .line 58
    return-void
.end method
