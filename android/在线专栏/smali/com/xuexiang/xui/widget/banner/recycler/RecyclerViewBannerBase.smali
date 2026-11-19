.class public abstract Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$OnIndicatorIndexChangedListener;,
        Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$OnBannerItemClickListener;,
        Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "L:Landroidx/recyclerview/widget/RecyclerView$o;",
        "A:",
        "Landroidx/recyclerview/widget/RecyclerView$g;",
        ">",
        "Landroid/widget/FrameLayout;"
    }
.end annotation


# static fields
.field private static final WHAT_AUTO_PLAY:I = 0x3e8


# instance fields
.field protected mAdapter:Landroidx/recyclerview/widget/RecyclerView$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field

.field protected mAutoPlayDuration:I

.field protected mBannerSize:I

.field protected mCurrentIndex:I

.field protected mHandler:Landroid/os/Handler;

.field protected mHasInit:Z

.field protected mIndicatorAdapter:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase<",
            "T",
            "L;",
            "TA;>.IndicatorAdapter;"
        }
    .end annotation
.end field

.field protected mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

.field protected mIndicatorMargin:I

.field protected mIsAutoPlaying:Z

.field protected mIsPlaying:Z

.field protected mLayoutManager:Landroidx/recyclerview/widget/RecyclerView$o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "T",
            "L;"
        }
    .end annotation
.end field

.field private mOnIndicatorIndexChangedListener:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$OnIndicatorIndexChangedListener;

.field protected mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field protected mSelectedDrawable:Landroid/graphics/drawable/Drawable;

.field protected mShowIndicator:Z

.field protected mTempUrlList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected mUnselectedDrawable:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0xfa0

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mAutoPlayDuration:I

    const/4 p3, 0x1

    .line 5
    iput p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mBannerSize:I

    .line 6
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mTempUrlList:Ljava/util/List;

    .line 7
    new-instance p3, Landroid/os/Handler;

    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$1;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;)V

    invoke-direct {p3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mHandler:Landroid/os/Handler;

    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->initView(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method protected compareListDifferent(Ljava/util/List;Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p2, :cond_5

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-eq v1, v2, :cond_1

    return v0

    :cond_1
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 4
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    return v0

    .line 5
    :cond_2
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return v1

    :cond_5
    :goto_1
    return v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    const/4 v3, 0x3

    if-eq v0, v3, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    .line 4
    :goto_0
    :try_start_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    return v1
.end method

.method protected abstract getAdapter(Landroid/content/Context;Ljava/util/List;Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$OnBannerItemClickListener;)Landroidx/recyclerview/widget/RecyclerView$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$OnBannerItemClickListener;",
            ")TA;"
        }
    .end annotation
.end method

.method protected getColor(I)I
    .locals 1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/content/a;->b(Landroid/content/Context;I)I

    move-result p1

    return p1
.end method

.method protected abstract getLayoutManager(Landroid/content/Context;I)Landroidx/recyclerview/widget/RecyclerView$o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I)T",
            "L;"
        }
    .end annotation
.end method

.method public initBannerImageView(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 19
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->initBannerImageView(Ljava/util/List;Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$OnBannerItemClickListener;)V

    return-void
.end method

.method public initBannerImageView(Ljava/util/List;Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$OnBannerItemClickListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$OnBannerItemClickListener;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mTempUrlList:Ljava/util/List;

    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->compareListDifferent(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mHasInit:Z

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 4
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0, v2, p1, p2}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->getAdapter(Landroid/content/Context;Ljava/util/List;Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$OnBannerItemClickListener;)Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mAdapter:Landroidx/recyclerview/widget/RecyclerView$g;

    .line 6
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 7
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mTempUrlList:Ljava/util/List;

    .line 8
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mBannerSize:I

    const/4 p2, 0x1

    if-le p1, p2, :cond_0

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 10
    iget p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mBannerSize:I

    mul-int/lit16 p1, p1, 0x2710

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mCurrentIndex:I

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorAdapter:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyDataSetChanged()V

    .line 13
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    goto :goto_0

    .line 14
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 15
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mCurrentIndex:I

    .line 16
    :goto_0
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mHasInit:Z

    .line 17
    :cond_1
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mShowIndicator:Z

    if-nez p1, :cond_2

    .line 18
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method protected initView(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_showIndicator:I

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mShowIndicator:Z

    .line 3
    sget v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_interval:I

    const/16 v2, 0xfa0

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mAutoPlayDuration:I

    .line 4
    sget v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_autoPlaying:I

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIsAutoPlaying:Z

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorSelectedSrc:I

    invoke-static {v0, p2, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mSelectedDrawable:Landroid/graphics/drawable/Drawable;

    .line 6
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorUnselectedSrc:I

    invoke-static {v0, p2, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mUnselectedDrawable:Landroid/graphics/drawable/Drawable;

    .line 7
    sget v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorSize:I

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorSize:I

    invoke-static {v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    .line 8
    sget v2, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorSelectedColor:I

    const/high16 v3, -0x10000

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    .line 9
    sget v3, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorUnselectedColor:I

    const v4, -0x777778

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    .line 10
    iget-object v4, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mSelectedDrawable:Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x0

    if-nez v4, :cond_0

    .line 11
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 12
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 13
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 14
    invoke-virtual {v4, v0, v0}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    shr-int/lit8 v2, v0, 0x1

    int-to-float v2, v2

    .line 15
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 16
    new-instance v2, Landroid/graphics/drawable/LayerDrawable;

    new-array v6, v1, [Landroid/graphics/drawable/Drawable;

    aput-object v4, v6, v5

    invoke-direct {v2, v6}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mSelectedDrawable:Landroid/graphics/drawable/Drawable;

    .line 17
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mUnselectedDrawable:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_1

    .line 18
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 19
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 20
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 21
    invoke-virtual {v2, v0, v0}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    shr-int/2addr v0, v1

    int-to-float v0, v0

    .line 22
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 23
    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    new-array v1, v1, [Landroid/graphics/drawable/Drawable;

    aput-object v2, v1, v5

    invoke-direct {v0, v1}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mUnselectedDrawable:Landroid/graphics/drawable/Drawable;

    .line 24
    :cond_1
    sget v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorSpace:I

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorSpace:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorMargin:I

    .line 25
    sget v0, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorMarginLeft:I

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorMarginLeft:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    .line 26
    sget v1, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorMarginRight:I

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorMarginRight:I

    invoke-static {v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    .line 27
    sget v2, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorMarginBottom:I

    sget v3, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorMarginBottom:I

    invoke-static {v3}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v3

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    .line 28
    sget v3, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_indicatorGravity:I

    invoke-virtual {p2, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    if-nez v3, :cond_2

    const v3, 0x800003

    goto :goto_0

    :cond_2
    const/4 v4, 0x2

    if-ne v3, v4, :cond_3

    const v3, 0x800005

    goto :goto_0

    :cond_3
    const/16 v3, 0x11

    .line 29
    :goto_0
    sget v4, Lcom/xuexiang/xui/R$styleable;->RecyclerViewBannerBase_rvbb_orientation:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 30
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 31
    new-instance p2, Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 32
    new-instance p2, Landroidx/recyclerview/widget/k;

    invoke-direct {p2}, Landroidx/recyclerview/widget/k;-><init>()V

    iget-object v6, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, v6}, Landroidx/recyclerview/widget/o;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 33
    invoke-virtual {p0, p1, v4}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->getLayoutManager(Landroid/content/Context;I)Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mLayoutManager:Landroidx/recyclerview/widget/RecyclerView$o;

    .line 34
    iget-object v6, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 35
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v6, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$2;

    invoke-direct {v6, p0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$2;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;)V

    invoke-virtual {p2, v6}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$s;)V

    .line 36
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v6, -0x1

    invoke-direct {p2, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 37
    iget-object v6, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, v6, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 38
    new-instance p2, Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    .line 39
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p2, p1, v4, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 40
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 41
    new-instance p1, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorAdapter:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;

    .line 42
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 43
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p2, -0x2

    invoke-direct {p1, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    or-int/lit8 p2, v3, 0x50

    .line 44
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 45
    invoke-virtual {p1, v0, v5, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 46
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p2, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mShowIndicator:Z

    if-nez p1, :cond_4

    .line 48
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method public isPlaying()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIsPlaying:Z

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    return-void
.end method

.method protected onBannerScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    return-void
.end method

.method protected onBannerScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    const/4 p1, 0x0

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    const/4 p1, 0x0

    return p1
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onWindowVisibilityChanged(I)V

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    :goto_0
    return-void
.end method

.method protected declared-synchronized refreshIndicator()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mBannerSize:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mCurrentIndex:I

    rem-int/2addr v1, v0

    .line 3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mShowIndicator:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorAdapter:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;->setPosition(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorAdapter:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyDataSetChanged()V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mOnIndicatorIndexChangedListener:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$OnIndicatorIndexChangedListener;

    if-eqz v0, :cond_1

    .line 7
    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$OnIndicatorIndexChangedListener;->onIndexChanged(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public setAutoPlaying(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIsAutoPlaying:Z

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->setPlaying(Z)V

    return-void
.end method

.method public setIndicatorInterval(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mAutoPlayDuration:I

    return-void
.end method

.method public setOnIndicatorIndexChangedListener(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$OnIndicatorIndexChangedListener;)Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mOnIndicatorIndexChangedListener:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$OnIndicatorIndexChangedListener;

    return-object p0
.end method

.method protected declared-synchronized setPlaying(Z)V
    .locals 4

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIsAutoPlaying:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mHasInit:Z

    if-eqz v0, :cond_1

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIsPlaying:Z

    const/16 v1, 0x3e8

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mHandler:Landroid/os/Handler;

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mAutoPlayDuration:I

    int-to-long v2, v0

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIsPlaying:Z

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeMessages(I)V

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIsPlaying:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setShowIndicator(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mShowIndicator:Z

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method
