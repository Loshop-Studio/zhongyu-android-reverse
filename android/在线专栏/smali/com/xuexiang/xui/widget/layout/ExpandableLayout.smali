.class public Lcom/xuexiang/xui/widget/layout/ExpandableLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;,
        Lcom/xuexiang/xui/widget/layout/ExpandableLayout$OnExpansionChangedListener;,
        Lcom/xuexiang/xui/widget/layout/ExpandableLayout$State;
    }
.end annotation


# static fields
.field private static final DEFAULT_DURATION:I = 0x12c

.field public static final HORIZONTAL:I = 0x0

.field public static final KEY_EXPANSION:Ljava/lang/String; = "key_expansion"

.field public static final KEY_SUPER_STATE:Ljava/lang/String; = "key_super_state"

.field public static final VERTICAL:I = 0x1


# instance fields
.field private mAnimator:Landroid/animation/ValueAnimator;

.field private mDuration:I

.field private mExpansion:F

.field private mInterpolator:Landroid/view/animation/Interpolator;

.field private mListener:Lcom/xuexiang/xui/widget/layout/ExpandableLayout$OnExpansionChangedListener;

.field private mOrientation:I

.field private mParallax:F

.field private mState:I


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
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mDuration:I

    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/layout/interpolator/FastOutSlowInInterpolator;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/layout/interpolator/FastOutSlowInInterpolator;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mInterpolator:Landroid/view/animation/Interpolator;

    if-eqz p2, :cond_2

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout:[I

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 6
    sget v0, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout_el_duration:I

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mDuration:I

    .line 7
    sget p1, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout_el_expanded:I

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mExpansion:F

    .line 8
    sget p1, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout_android_orientation:I

    const/4 v3, 0x1

    invoke-virtual {p2, p1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mOrientation:I

    .line 9
    sget p1, Lcom/xuexiang/xui/R$styleable;->ExpandableLayout_el_parallax:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mParallax:F

    .line 10
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 11
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mExpansion:F

    cmpl-float p1, p1, v2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x3

    :goto_1
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mState:I

    .line 12
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mParallax:F

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->setParallax(F)Lcom/xuexiang/xui/widget/layout/ExpandableLayout;

    :cond_2
    return-void
.end method

.method static synthetic access$002(Lcom/xuexiang/xui/widget/layout/ExpandableLayout;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mState:I

    return p1
.end method

.method private animateSize(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mAnimator:Landroid/animation/ValueAnimator;

    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mExpansion:F

    aput v2, v0, v1

    const/4 v1, 0x1

    int-to-float v2, p1

    aput v2, v0, v1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mAnimator:Landroid/animation/ValueAnimator;

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mInterpolator:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mAnimator:Landroid/animation/ValueAnimator;

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mDuration:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$1;-><init>(Lcom/xuexiang/xui/widget/layout/ExpandableLayout;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;-><init>(Lcom/xuexiang/xui/widget/layout/ExpandableLayout;I)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method


# virtual methods
.method public collapse()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->collapse(Z)V

    return-void
.end method

.method public collapse(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->setExpanded(ZZ)V

    return-void
.end method

.method public expand()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->expand(Z)V

    return-void
.end method

.method public expand(Z)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->setExpanded(ZZ)V

    return-void
.end method

.method public getDuration()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mDuration:I

    return v0
.end method

.method public getExpansion()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mExpansion:F

    return v0
.end method

.method public getOrientation()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mOrientation:I

    return v0
.end method

.method public getParallax()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mParallax:F

    return v0
.end method

.method public getState()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mState:I

    return v0
.end method

.method public isExpanded()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mState:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 3
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 7

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredWidth()I

    move-result p1

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result p2

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mOrientation:I

    if-nez v0, :cond_0

    move v0, p1

    goto :goto_0

    :cond_0
    move v0, p2

    .line 5
    :goto_0
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mExpansion:F

    const/4 v2, 0x0

    const/4 v3, 0x0

    cmpl-float v1, v1, v3

    if-nez v1, :cond_1

    if-nez v0, :cond_1

    const/16 v1, 0x8

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    int-to-float v1, v0

    .line 6
    iget v4, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mExpansion:F

    mul-float v1, v1, v4

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    sub-int/2addr v0, v1

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mParallax:F

    cmpl-float v3, v1, v3

    if-lez v3, :cond_4

    int-to-float v3, v0

    mul-float v3, v3, v1

    .line 8
    :goto_2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v1

    if-ge v2, v1, :cond_4

    .line 9
    invoke-virtual {p0, v2}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 10
    iget v4, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mOrientation:I

    if-nez v4, :cond_3

    const/4 v4, -0x1

    .line 11
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutDirection()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_2

    const/4 v4, 0x1

    :cond_2
    int-to-float v4, v4

    mul-float v4, v4, v3

    .line 12
    invoke-virtual {v1, v4}, Landroid/view/View;->setTranslationX(F)V

    goto :goto_3

    :cond_3
    neg-float v4, v3

    .line 13
    invoke-virtual {v1, v4}, Landroid/view/View;->setTranslationY(F)V

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 14
    :cond_4
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mOrientation:I

    if-nez v1, :cond_5

    sub-int/2addr p1, v0

    .line 15
    invoke-virtual {p0, p1, p2}, Landroid/widget/FrameLayout;->setMeasuredDimension(II)V

    goto :goto_4

    :cond_5
    sub-int/2addr p2, v0

    .line 16
    invoke-virtual {p0, p1, p2}, Landroid/widget/FrameLayout;->setMeasuredDimension(II)V

    :goto_4
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "key_expansion"

    .line 2
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mExpansion:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mState:I

    const-string v0, "key_super_state"

    .line 4
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    .line 5
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->isExpanded()Z

    move-result v2

    if-eqz v2, :cond_0

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput v2, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mExpansion:F

    const-string v3, "key_expansion"

    .line 4
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v2, "key_super_state"

    .line 5
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-object v1
.end method

.method public setDuration(I)Lcom/xuexiang/xui/widget/layout/ExpandableLayout;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mDuration:I

    return-object p0
.end method

.method public setExpanded(Z)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->setExpanded(ZZ)V

    return-void
.end method

.method public setExpanded(ZZ)V
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->isExpanded()Z

    move-result v0

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->animateSize(I)V

    goto :goto_0

    :cond_1
    int-to-float p1, p1

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->setExpansion(F)V

    :goto_0
    return-void
.end method

.method public setExpansion(F)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mExpansion:F

    cmpl-float v1, v0, p1

    if-nez v1, :cond_0

    return-void

    :cond_0
    sub-float v0, p1, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    cmpl-float v3, p1, v2

    if-nez v3, :cond_1

    .line 2
    iput v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mState:I

    goto :goto_0

    :cond_1
    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v3, p1, v3

    if-nez v3, :cond_2

    const/4 v0, 0x3

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mState:I

    goto :goto_0

    :cond_2
    cmpg-float v3, v0, v2

    if-gez v3, :cond_3

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mState:I

    goto :goto_0

    :cond_3
    cmpl-float v0, v0, v2

    if-lez v0, :cond_4

    const/4 v0, 0x2

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mState:I

    .line 6
    :cond_4
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mState:I

    if-nez v0, :cond_5

    const/16 v1, 0x8

    :cond_5
    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mExpansion:F

    .line 8
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mListener:Lcom/xuexiang/xui/widget/layout/ExpandableLayout$OnExpansionChangedListener;

    if-eqz v0, :cond_6

    .line 10
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mState:I

    invoke-interface {v0, p1, v1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$OnExpansionChangedListener;->onExpansionChanged(FI)V

    :cond_6
    return-void
.end method

.method public setInterpolator(Landroid/view/animation/Interpolator;)Lcom/xuexiang/xui/widget/layout/ExpandableLayout;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mInterpolator:Landroid/view/animation/Interpolator;

    return-object p0
.end method

.method public setOnExpansionChangedListener(Lcom/xuexiang/xui/widget/layout/ExpandableLayout$OnExpansionChangedListener;)Lcom/xuexiang/xui/widget/layout/ExpandableLayout;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mListener:Lcom/xuexiang/xui/widget/layout/ExpandableLayout$OnExpansionChangedListener;

    return-object p0
.end method

.method public setOrientation(I)Lcom/xuexiang/xui/widget/layout/ExpandableLayout;
    .locals 1

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    if-gt p1, v0, :cond_0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mOrientation:I

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Orientation must be either 0 (horizontal) or 1 (vertical)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setParallax(F)Lcom/xuexiang/xui/widget/layout/ExpandableLayout;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->mParallax:F

    return-object p0
.end method

.method public toggle()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->toggle(Z)V

    return-void
.end method

.method public toggle(Z)V
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->isExpanded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->collapse(Z)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->expand(Z)V

    :goto_0
    return-void
.end method
