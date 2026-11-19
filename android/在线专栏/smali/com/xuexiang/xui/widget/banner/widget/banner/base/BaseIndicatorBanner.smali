.class public abstract Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
.super Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner$ReverseInterpolator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        "T:",
        "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner<",
        "TE;TT;>;>",
        "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner<",
        "TE;TT;>;"
    }
.end annotation


# static fields
.field public static final STYLE_CORNER_RECTANGLE:I = 0x1

.field public static final STYLE_DRAWABLE_RESOURCE:I


# instance fields
.field private mIndicatorCornerRadius:I

.field private mIndicatorGap:I

.field private mIndicatorHeight:I

.field private mIndicatorStyle:I

.field private mIndicatorViews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private mIndicatorWidth:I

.field private mLlIndicators:Landroid/widget/LinearLayout;

.field private mSelectAnimClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;",
            ">;"
        }
    .end annotation
.end field

.field private mSelectColor:I

.field private mSelectDrawable:Landroid/graphics/drawable/Drawable;

.field private mUnSelectDrawable:Landroid/graphics/drawable/Drawable;

.field private mUnselectAnimClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;",
            ">;"
        }
    .end annotation
.end field

.field private mUnselectColor:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorViews:Ljava/util/List;

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorViews:Ljava/util/List;

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorViews:Ljava/util/List;

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private getDrawable(IF)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 2
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-object v0
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorStyle:I

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorStyle:I

    .line 3
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorWidth:I

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result v2

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorWidth:I

    .line 4
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorHeight:I

    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result v2

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorHeight:I

    .line 5
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorGap:I

    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorGap:I

    .line 6
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorCornerRadius:I

    const/high16 v1, 0x40400000    # 3.0f

    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorCornerRadius:I

    .line 7
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorSelectColor:I

    const-string v1, "#ffffff"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mSelectColor:I

    .line 8
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorUnselectColor:I

    const-string v1, "#88ffffff"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mUnselectColor:I

    .line 9
    sget v0, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorSelectRes:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 10
    sget v2, Lcom/xuexiang/xui/R$styleable;->BaseIndicatorBanner_bb_indicatorUnselectRes:I

    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 11
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 12
    new-instance p2, Landroid/widget/LinearLayout;

    invoke-direct {p2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mLlIndicators:Landroid/widget/LinearLayout;

    const/16 p1, 0x11

    .line 13
    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 14
    invoke-virtual {p0, v1, v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->setIndicatorSelectorRes(II)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;

    return-void
.end method


# virtual methods
.method public onCreateIndicator()Landroid/view/View;
    .locals 7

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorStyle:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mUnselectColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorCornerRadius:I

    int-to-float v1, v1

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->getDrawable(IF)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mUnSelectDrawable:Landroid/graphics/drawable/Drawable;

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mSelectColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorCornerRadius:I

    int-to-float v1, v1

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->getDrawable(IF)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mSelectDrawable:Landroid/graphics/drawable/Drawable;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorViews:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mLlIndicators:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 7
    new-instance v3, Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mContext:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 8
    iget v4, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mCurrentPosition:I

    if-ne v2, v4, :cond_1

    iget-object v4, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mSelectDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    :cond_1
    iget-object v4, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mUnSelectDrawable:Landroid/graphics/drawable/Drawable;

    :goto_1
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    iget v5, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorWidth:I

    iget v6, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorHeight:I

    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    if-nez v2, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    .line 10
    :cond_2
    iget v5, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorGap:I

    :goto_2
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 11
    iget-object v5, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mLlIndicators:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    iget-object v4, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorViews:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 13
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mCurrentPosition:I

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->setCurrentIndicator(I)V

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mLlIndicators:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public setCurrentIndicator(I)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorViews:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorViews:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-ne v0, p1, :cond_0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mSelectDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mUnSelectDrawable:Landroid/graphics/drawable/Drawable;

    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mSelectAnimClass:Ljava/lang/Class;

    if-eqz v0, :cond_4

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLastPosition:I

    if-ne p1, v1, :cond_2

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorViews:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->playOn(Landroid/view/View;)V

    goto :goto_2

    .line 6
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorViews:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->playOn(Landroid/view/View;)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mUnselectAnimClass:Ljava/lang/Class;

    if-nez p1, :cond_3

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mSelectAnimClass:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;

    new-instance v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner$ReverseInterpolator;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner$ReverseInterpolator;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner$1;)V

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->interpolator(Landroid/view/animation/Interpolator;)Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorViews:Ljava/util/List;

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLastPosition:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->playOn(Landroid/view/View;)V

    goto :goto_2

    .line 9
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorViews:Ljava/util/List;

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLastPosition:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->playOn(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_2
    return-void
.end method

.method public setIndicatorCornerRadius(F)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorCornerRadius:I

    return-object p0
.end method

.method public setIndicatorGap(F)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorGap:I

    return-object p0
.end method

.method public setIndicatorHeight(F)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorHeight:I

    return-object p0
.end method

.method public setIndicatorSelectColor(I)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mSelectColor:I

    return-object p0
.end method

.method public setIndicatorSelectorRes(II)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)TT;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorStyle:I

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mSelectDrawable:Landroid/graphics/drawable/Drawable;

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mUnSelectDrawable:Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Landroid/content/res/Resources$NotFoundException;->printStackTrace()V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setIndicatorStyle(I)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorStyle:I

    return-object p0
.end method

.method public setIndicatorUnselectColor(I)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mUnselectColor:I

    return-object p0
.end method

.method public setIndicatorWidth(F)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mIndicatorWidth:I

    return-object p0
.end method

.method public setSelectAnimClass(Ljava/lang/Class;)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;",
            ">;)TT;"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mSelectAnimClass:Ljava/lang/Class;

    return-object p0
.end method

.method public setUnselectAnimClass(Ljava/lang/Class;)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;",
            ">;)TT;"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;->mUnselectAnimClass:Ljava/lang/Class;

    return-object p0
.end method
