.class public Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$OnIndicatorIndexChangedListener;,
        Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$OnBannerItemClickListener;,
        Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$IndicatorAdapter;
    }
.end annotation


# static fields
.field private static final WHAT_AUTO_PLAY:I = 0x3e8


# instance fields
.field private mAutoPlayDuration:I

.field private mBannerSize:I

.field private mCenterScale:F

.field private mCurrentIndex:I

.field protected mHandler:Landroid/os/Handler;

.field private mHasInit:Z

.field private mIndicatorAdapter:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$IndicatorAdapter;

.field private mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

.field private mIndicatorMargin:I

.field private mIsAutoPlaying:Z

.field private mIsPlaying:Z

.field private mItemSpace:I

.field private mLayoutManager:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

.field private mMoveSpeed:F

.field private mOnIndicatorIndexChangedListener:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$OnIndicatorIndexChangedListener;

.field private mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private mSelectedDrawable:Landroid/graphics/drawable/Drawable;

.field private mShowIndicator:Z

.field private mUnselectedDrawable:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->BannerLayoutStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mBannerSize:I

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIsPlaying:Z

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIsAutoPlaying:Z

    .line 7
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$1;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mHandler:Landroid/os/Handler;

    .line 8
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->initView(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mCurrentIndex:I

    return p0
.end method

.method static synthetic access$002(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mCurrentIndex:I

    return p1
.end method

.method static synthetic access$004(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mCurrentIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mCurrentIndex:I

    return v0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mLayoutManager:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mAutoPlayDuration:I

    return p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIndicatorMargin:I

    return p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)Landroid/graphics/drawable/Drawable;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mSelectedDrawable:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)Landroid/graphics/drawable/Drawable;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mUnselectedDrawable:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mBannerSize:I

    return p0
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->setPlaying(Z)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->setPlaying(Z)V

    .line 4
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected initView(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->BannerLayout:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget p3, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_showIndicator:I

    const/4 v0, 0x1

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mShowIndicator:Z

    .line 3
    sget p3, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_interval:I

    const/16 v2, 0xfa0

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mAutoPlayDuration:I

    .line 4
    sget p3, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_autoPlaying:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIsAutoPlaying:Z

    .line 5
    sget p3, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_itemSpace:I

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_itemSpace:I

    invoke-static {v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mItemSpace:I

    .line 6
    sget p3, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_centerScale:I

    const v2, 0x3f99999a    # 1.2f

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mCenterScale:F

    .line 7
    sget p3, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_moveSpeed:I

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mMoveSpeed:F

    .line 8
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v2, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_indicatorSelectedSrc:I

    invoke-static {p3, p2, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mSelectedDrawable:Landroid/graphics/drawable/Drawable;

    .line 9
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v2, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_indicatorUnselectedSrc:I

    invoke-static {p3, p2, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mUnselectedDrawable:Landroid/graphics/drawable/Drawable;

    .line 10
    sget p3, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_indicatorSize:I

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorSize:I

    invoke-static {v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    .line 11
    sget v2, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_indicatorSelectedColor:I

    sget v3, Lcom/xuexiang/xui/R$color;->xui_config_color_red:I

    invoke-static {v3}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v3

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    .line 12
    sget v3, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_indicatorUnselectedColor:I

    sget v4, Lcom/xuexiang/xui/R$color;->xui_config_color_gray_2:I

    invoke-static {v4}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v4

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    .line 13
    iget-object v4, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mSelectedDrawable:Landroid/graphics/drawable/Drawable;

    if-nez v4, :cond_0

    .line 14
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 15
    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 16
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 17
    invoke-virtual {v4, p3, p3}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    shr-int/lit8 v2, p3, 0x1

    int-to-float v2, v2

    .line 18
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 19
    new-instance v2, Landroid/graphics/drawable/LayerDrawable;

    new-array v5, v0, [Landroid/graphics/drawable/Drawable;

    aput-object v4, v5, v1

    invoke-direct {v2, v5}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mSelectedDrawable:Landroid/graphics/drawable/Drawable;

    .line 20
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mUnselectedDrawable:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_1

    .line 21
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 22
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 23
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 24
    invoke-virtual {v2, p3, p3}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    shr-int/2addr p3, v0

    int-to-float p3, p3

    .line 25
    invoke-virtual {v2, p3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 26
    new-instance p3, Landroid/graphics/drawable/LayerDrawable;

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    aput-object v2, v0, v1

    invoke-direct {p3, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mUnselectedDrawable:Landroid/graphics/drawable/Drawable;

    .line 27
    :cond_1
    sget p3, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_indicatorSpace:I

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorSpace:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIndicatorMargin:I

    .line 28
    sget p3, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_indicatorMarginLeft:I

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorMarginLeft:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    .line 29
    sget v0, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_indicatorMarginRight:I

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorMarginRight:I

    invoke-static {v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    .line 30
    sget v2, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_indicatorMarginBottom:I

    sget v3, Lcom/xuexiang/xui/R$dimen;->default_recycler_banner_indicatorMarginBottom:I

    invoke-static {v3}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v3

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    .line 31
    sget v3, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_indicatorGravity:I

    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

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

    .line 32
    :goto_0
    sget v4, Lcom/xuexiang/xui/R$styleable;->BannerLayout_bl_orientation:I

    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 33
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 34
    new-instance p2, Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v5, -0x1

    invoke-direct {p2, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 36
    iget-object v5, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, v5, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    new-instance p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {p2, v5, v4}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mLayoutManager:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    .line 38
    iget v5, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mItemSpace:I

    invoke-virtual {p2, v5}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->setItemSpace(I)V

    .line 39
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mLayoutManager:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    iget v5, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mCenterScale:F

    invoke-virtual {p2, v5}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->setCenterScale(F)V

    .line 40
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mLayoutManager:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    iget v5, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mMoveSpeed:F

    invoke-virtual {p2, v5}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->setMoveSpeed(F)V

    .line 41
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mLayoutManager:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    invoke-virtual {p2, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 42
    new-instance p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;

    invoke-direct {p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;-><init>()V

    iget-object v5, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, v5}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 43
    new-instance p2, Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    .line 44
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p2, p1, v4, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 45
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 46
    new-instance p1, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$IndicatorAdapter;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$IndicatorAdapter;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIndicatorAdapter:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$IndicatorAdapter;

    .line 47
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 48
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p2, -0x2

    invoke-direct {p1, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    or-int/lit8 p2, v3, 0x50

    .line 49
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 50
    invoke-virtual {p1, p3, v1, v0, v2}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 51
    invoke-virtual {p1, p3}, Landroid/widget/FrameLayout$LayoutParams;->setMarginStart(I)V

    .line 52
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout$LayoutParams;->setMarginEnd(I)V

    .line 53
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p2, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mShowIndicator:Z

    if-nez p1, :cond_4

    .line 55
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method public isPlaying()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIsPlaying:Z

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->setPlaying(Z)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->setPlaying(Z)V

    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onWindowVisibilityChanged(I)V

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->setPlaying(Z)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->setPlaying(Z)V

    :goto_0
    return-void
.end method

.method protected declared-synchronized refreshIndicator()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mBannerSize:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mCurrentIndex:I

    rem-int/2addr v1, v0

    .line 3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mShowIndicator:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIndicatorAdapter:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$IndicatorAdapter;

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$IndicatorAdapter;->setPosition(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIndicatorAdapter:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$IndicatorAdapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyDataSetChanged()V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mOnIndicatorIndexChangedListener:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$OnIndicatorIndexChangedListener;

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

.method public setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V
    .locals 4

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mHasInit:Z

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->getItemCount()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mBannerSize:I

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mLayoutManager:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    const/4 v2, 0x1

    const/4 v3, 0x3

    if-lt p1, v3, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->setInfinite(Z)V

    .line 5
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->setPlaying(Z)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$2;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$2;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$s;)V

    .line 7
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mHasInit:Z

    return-void
.end method

.method public setAutoPlayDuration(I)Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mAutoPlayDuration:I

    return-object p0
.end method

.method public setAutoPlaying(Z)Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIsAutoPlaying:Z

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->setPlaying(Z)V

    return-object p0
.end method

.method public setCenterScale(F)Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mCenterScale:F

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mLayoutManager:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->setCenterScale(F)V

    return-object p0
.end method

.method public setItemSpace(I)Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mItemSpace:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mLayoutManager:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->setItemSpace(I)V

    return-object p0
.end method

.method public setMoveSpeed(F)Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mMoveSpeed:F

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mLayoutManager:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->setMoveSpeed(F)V

    return-object p0
.end method

.method public setOnIndicatorIndexChangedListener(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$OnIndicatorIndexChangedListener;)Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mOnIndicatorIndexChangedListener:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$OnIndicatorIndexChangedListener;

    return-object p0
.end method

.method public setOrientation(I)Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mLayoutManager:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->setOrientation(I)V

    return-object p0
.end method

.method protected declared-synchronized setPlaying(Z)V
    .locals 4

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIsAutoPlaying:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mHasInit:Z

    if-eqz v0, :cond_1

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIsPlaying:Z

    const/16 v1, 0x3e8

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mHandler:Landroid/os/Handler;

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mAutoPlayDuration:I

    int-to-long v2, v0

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIsPlaying:Z

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeMessages(I)V

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIsPlaying:Z
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

.method public setShowIndicator(Z)Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mShowIndicator:Z

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mIndicatorContainer:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-object p0
.end method
