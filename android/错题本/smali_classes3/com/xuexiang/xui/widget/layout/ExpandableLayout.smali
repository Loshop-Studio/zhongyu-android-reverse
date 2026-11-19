.class public Lcom/xuexiang/xui/widget/layout/ExpandableLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:F

.field public c:F

.field public final d:I

.field public e:I

.field public final f:La3/a;

.field public g:Landroid/animation/ValueAnimator;


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
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->a:I

    .line 4
    new-instance v0, La3/a;

    .line 5
    sget-object v1, La3/a;->c:[F

    invoke-direct {v0, v1}, La3/a;-><init>([F)V

    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->f:La3/a;

    if-eqz p2, :cond_2

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout:[I

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 8
    sget v0, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout_el_duration:I

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->a:I

    .line 9
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
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:F

    .line 10
    sget p1, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout_android_orientation:I

    const/4 v3, 0x1

    invoke-virtual {p2, p1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->d:I

    .line 11
    sget p1, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout_el_parallax:I

    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->b:F

    .line 12
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 13
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:F

    cmpl-float p1, p1, v1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x3

    :goto_1
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:I

    .line 14
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->b:F

    .line 15
    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {v2, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    .line 16
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->b:F

    :cond_2
    return-void
.end method


# virtual methods
.method public getDuration()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public getExpansion()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public getOrientation()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public getParallax()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public getState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:Landroid/animation/ValueAnimator;

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

.method public final onMeasure(II)V
    .locals 7

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
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->d:I

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    move v1, p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v1, p2

    .line 19
    :goto_0
    iget v2, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:F

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    cmpl-float v2, v2, v3

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    const/16 v2, 0x8

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v2, v4

    .line 33
    :goto_1
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    int-to-float v2, v1

    .line 37
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:F

    .line 38
    .line 39
    mul-float/2addr v2, v5

    .line 40
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    sub-int/2addr v1, v2

    .line 45
    iget v2, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->b:F

    .line 46
    .line 47
    cmpl-float v3, v2, v3

    .line 48
    .line 49
    if-lez v3, :cond_4

    .line 50
    .line 51
    int-to-float v3, v1

    .line 52
    mul-float/2addr v3, v2

    .line 53
    :goto_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-ge v4, v2, :cond_4

    .line 58
    .line 59
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-nez v0, :cond_3

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    const/4 v6, 0x1

    .line 70
    if-ne v5, v6, :cond_2

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_2
    const/4 v6, -0x1

    .line 74
    :goto_3
    int-to-float v5, v6

    .line 75
    mul-float/2addr v5, v3

    .line 76
    invoke-virtual {v2, v5}, Landroid/view/View;->setTranslationX(F)V

    .line 77
    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_3
    neg-float v5, v3

    .line 81
    invoke-virtual {v2, v5}, Landroid/view/View;->setTranslationY(F)V

    .line 82
    .line 83
    .line 84
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    if-nez v0, :cond_5

    .line 88
    .line 89
    sub-int/2addr p1, v1

    .line 90
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_5
    sub-int/2addr p2, v1

    .line 95
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
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
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:F

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
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:I

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

.method public final onSaveInstanceState()Landroid/os/Parcelable;
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
    iget v2, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:I

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    if-eq v2, v3, :cond_1

    .line 14
    .line 15
    const/4 v3, 0x3

    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/high16 v2, 0x3f800000    # 1.0f

    .line 22
    .line 23
    :goto_1
    iput v2, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:F

    .line 24
    .line 25
    const-string v3, "key_expansion"

    .line 26
    .line 27
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 28
    .line 29
    .line 30
    const-string v2, "key_super_state"

    .line 31
    .line 32
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 33
    .line 34
    .line 35
    return-object v1
.end method

.method public setExpanded(Z)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    if-eq v0, v3, :cond_1

    .line 7
    .line 8
    const/4 v4, 0x3

    .line 9
    if-ne v0, v4, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v2

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    move v0, v1

    .line 15
    :goto_1
    if-ne p1, v0, :cond_2

    .line 16
    .line 17
    return-void

    .line 18
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:Landroid/animation/ValueAnimator;

    .line 27
    .line 28
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:F

    .line 29
    .line 30
    int-to-float v4, p1

    .line 31
    new-array v3, v3, [F

    .line 32
    .line 33
    aput v0, v3, v2

    .line 34
    .line 35
    aput v4, v3, v1

    .line 36
    .line 37
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:Landroid/animation/ValueAnimator;

    .line 42
    .line 43
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->f:La3/a;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:Landroid/animation/ValueAnimator;

    .line 49
    .line 50
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->a:I

    .line 51
    .line 52
    int-to-long v1, v1

    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:Landroid/animation/ValueAnimator;

    .line 57
    .line 58
    new-instance v1, Lcom/xuexiang/xui/widget/button/f;

    .line 59
    .line 60
    const/4 v2, 0x6

    .line 61
    invoke-direct {v1, p0, v2}, Lcom/xuexiang/xui/widget/button/f;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:Landroid/animation/ValueAnimator;

    .line 68
    .line 69
    new-instance v1, Lz2/a;

    .line 70
    .line 71
    invoke-direct {v1, p0, p1}, Lz2/a;-><init>(Lcom/xuexiang/xui/widget/layout/ExpandableLayout;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->g:Landroid/animation/ValueAnimator;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public setExpansion(F)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:F

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
    iput v3, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:I

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
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:I

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
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:I

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
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:I

    .line 43
    .line 44
    :cond_4
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->e:I

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
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->c:F

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 56
    .line 57
    .line 58
    return-void
.end method
