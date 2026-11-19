.class public Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;
.super Landroid/widget/ScrollView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;,
        Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$PagerAdapterObserver;,
        Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;,
        Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;
    }
.end annotation


# static fields
.field public static TAB_MODE_FIXED:I = 0xa

.field public static TAB_MODE_SCROLLABLE:I = 0xb


# instance fields
.field private mColorIndicator:I

.field private mContext:Landroid/content/Context;

.field private mIndicatorCorners:F

.field private mIndicatorGravity:I

.field private mIndicatorWidth:I

.field private mLastPositionOffset:F

.field private mPagerAdapter:Landroidx/viewpager/widget/a;

.field private mPagerAdapterObserver:Landroid/database/DataSetObserver;

.field private mSelectedTab:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

.field private mTabAdapter:Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;

.field private mTabFragmentManager:Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;

.field private mTabHeight:I

.field private mTabMargin:I

.field private mTabMode:I

.field private mTabPageChangeListener:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;

.field private mTabSelectedListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;",
            ">;"
        }
    .end annotation
.end field

.field private mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

.field private mViewPager:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mContext:Landroid/content/Context;

    .line 5
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabSelectedListeners:Ljava/util/List;

    .line 6
    sget-object p3, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 7
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_indicator_color:I

    invoke-static {p1}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mColorIndicator:I

    .line 8
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_indicator_width:I

    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorWidth:I

    .line 9
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_indicator_corners:I

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorCorners:F

    .line 10
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_indicator_gravity:I

    const/4 v0, 0x3

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorGravity:I

    if-ne p1, v0, :cond_0

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorGravity:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x5

    if-ne p1, v0, :cond_1

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorGravity:I

    goto :goto_0

    :cond_1
    const/16 v0, 0x77

    if-ne p1, v0, :cond_2

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorGravity:I

    .line 14
    :cond_2
    :goto_0
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_tab_margin:I

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabMargin:I

    .line 15
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_tab_mode:I

    sget p3, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->TAB_MODE_FIXED:I

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabMode:I

    .line 16
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_tab_height:I

    const/high16 p3, -0x40000000    # -2.0f

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabHeight:I

    .line 17
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setTabSelectedImpl(IZZ)V

    return-void
.end method

.method static synthetic access$1100(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mColorIndicator:I

    return p0
.end method

.method static synthetic access$1200(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorCorners:F

    return p0
.end method

.method static synthetic access$1300(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setTabSelected(IZZ)V

    return-void
.end method

.method static synthetic access$1400(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->populateFromPagerAdapter()V

    return-void
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    return-object p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorGravity:I

    return p0
.end method

.method static synthetic access$402(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorGravity:I

    return p1
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorWidth:I

    return p0
.end method

.method static synthetic access$502(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorWidth:I

    return p1
.end method

.method private addTabWithMode(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->initTabWithMode(Landroid/widget/LinearLayout$LayoutParams;)V

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v1, p1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->indexOfChild(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 5
    invoke-interface {p1, v0}, Landroid/widget/Checkable;->setChecked(Z)V

    .line 6
    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 8
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mSelectedTab:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$1;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private initTabStrip()V
    .locals 3

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mContext:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    .line 2
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private initTabWithMode(Landroid/widget/LinearLayout$LayoutParams;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabMode:I

    sget v1, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->TAB_MODE_FIXED:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    .line 2
    iput v2, p1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 3
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 4
    invoke-virtual {p1, v2, v2, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    goto :goto_0

    .line 6
    :cond_0
    sget v1, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->TAB_MODE_SCROLLABLE:I

    if-ne v0, v1, :cond_1

    .line 7
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabHeight:I

    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v0, 0x0

    .line 8
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabMargin:I

    invoke-virtual {p1, v2, v0, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 10
    invoke-virtual {p0, v2}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method private populateFromPagerAdapter()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->removeAllTabs()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mPagerAdapter:Landroidx/viewpager/widget/a;

    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {v0}, Landroidx/viewpager/widget/a;->getCount()I

    move-result v0

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mPagerAdapter:Landroidx/viewpager/widget/a;

    instance-of v2, v1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;

    if-eqz v2, :cond_0

    .line 5
    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;

    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setTabAdapter(Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;)V

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 6
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mPagerAdapter:Landroidx/viewpager/widget/a;

    invoke-virtual {v2, v1}, Landroidx/viewpager/widget/a;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 7
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "tab"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 8
    :goto_1
    new-instance v3, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mContext:Landroid/content/Context;

    invoke-direct {v3, v4}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;-><init>(Landroid/content/Context;)V

    new-instance v4, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;

    invoke-direct {v4}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;-><init>()V

    .line 9
    invoke-virtual {v4, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->setContent(Ljava/lang/String;)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->build()Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    move-result-object v2

    .line 10
    invoke-virtual {v3, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setTitle(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->addTab(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 11
    :cond_2
    :goto_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    if-eqz v1, :cond_4

    if-lez v0, :cond_4

    .line 12
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    .line 13
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getSelectedTabPosition()I

    move-result v1

    if-eq v0, v1, :cond_4

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getTabCount()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 14
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setTabSelected(I)V

    goto :goto_3

    .line 15
    :cond_3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->removeAllTabs()V

    :cond_4
    :goto_3
    return-void
.end method

.method private scrollByTab(IF)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getTabAt(I)Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getScrollY()I

    move-result v0

    .line 3
    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getTop()I

    move-result v1

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    sub-int/2addr v1, v0

    .line 4
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 5
    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getHeight()I

    move-result p1

    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabMargin:I

    add-int/2addr p1, v2

    const/4 v2, 0x0

    cmpl-float v2, p2, v2

    if-lez v2, :cond_0

    .line 6
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mLastPositionOffset:F

    sub-float v2, p2, v2

    if-le v1, v0, :cond_0

    const/4 v0, 0x0

    int-to-float p1, p1

    mul-float p1, p1, v2

    float-to-int p1, p1

    .line 7
    invoke-virtual {p0, v0, p1}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    .line 8
    :cond_0
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mLastPositionOffset:F

    return-void
.end method

.method private scrollToTab(I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getTabAt(I)Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getScrollY()I

    move-result v0

    .line 3
    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getTop()I

    move-result v1

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    add-int/2addr v1, p1

    sub-int/2addr v1, v0

    .line 4
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    const/4 v0, 0x0

    if-le v1, p1, :cond_0

    sub-int/2addr v1, p1

    .line 5
    invoke-virtual {p0, v0, v1}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    goto :goto_0

    :cond_0
    if-ge v1, p1, :cond_1

    sub-int/2addr v1, p1

    .line 6
    invoke-virtual {p0, v0, v1}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    :cond_1
    :goto_0
    return-void
.end method

.method private setPagerAdapter(Landroidx/viewpager/widget/a;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mPagerAdapter:Landroidx/viewpager/widget/a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mPagerAdapterObserver:Landroid/database/DataSetObserver;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/a;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mPagerAdapter:Landroidx/viewpager/widget/a;

    if-eqz p2, :cond_2

    if-eqz p1, :cond_2

    .line 4
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mPagerAdapterObserver:Landroid/database/DataSetObserver;

    if-nez p2, :cond_1

    .line 5
    new-instance p2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$PagerAdapterObserver;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$PagerAdapterObserver;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$1;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mPagerAdapterObserver:Landroid/database/DataSetObserver;

    .line 6
    :cond_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mPagerAdapterObserver:Landroid/database/DataSetObserver;

    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/a;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 7
    :cond_2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->populateFromPagerAdapter()V

    return-void
.end method

.method private setTabSelected(IZZ)V
    .locals 1

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$3;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$3;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZZ)V

    invoke-virtual {p0, v0}, Landroid/widget/ScrollView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private setTabSelectedImpl(IZZ)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getTabAt(I)Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mSelectedTab:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x0

    if-eqz v4, :cond_3

    if-eqz v1, :cond_1

    .line 3
    invoke-interface {v1, v3}, Landroid/widget/Checkable;->setChecked(Z)V

    .line 4
    iget-object v5, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mSelectedTab:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 5
    :cond_1
    invoke-interface {v0, v2}, Landroid/widget/Checkable;->setChecked(Z)V

    if-eqz p2, :cond_2

    .line 6
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->moveIndicatorWithAnimator(I)V

    .line 7
    :cond_2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->scrollToTab(I)V

    .line 8
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mSelectedTab:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    :cond_3
    if-eqz p3, :cond_6

    .line 9
    :goto_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabSelectedListeners:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-ge v3, p2, :cond_6

    .line 10
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabSelectedListeners:Ljava/util/List;

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;

    if-eqz p2, :cond_5

    if-eqz v4, :cond_4

    .line 11
    invoke-interface {p2, v0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;->onTabSelected(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;I)V

    if-eqz v5, :cond_5

    .line 12
    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getPositionByTabView(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)I

    move-result p3

    invoke-interface {p2, v5, p3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;->onTabUnselected(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;I)V

    goto :goto_2

    .line 13
    :cond_4
    invoke-interface {p2, v0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;->onTabReselected(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;I)V

    :cond_5
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    return-void
.end method


# virtual methods
.method public addOnTabSelectedListener(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabSelectedListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public addTab(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->addTabWithMode(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)V

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$2;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$2;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "tabView can\'t be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getPositionByTabView(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->indexOfChild(Landroid/view/View;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method

.method public getSelectedTabPosition()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mSelectedTab:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getPositionByTabView(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)I

    move-result v0

    return v0
.end method

.method public getTabAdapter()Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabAdapter:Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;

    return-object v0
.end method

.method public getTabAt(I)Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    return-object p1
.end method

.method public getTabCount()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    return v0
.end method

.method protected onFinishInflate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/ScrollView;->onFinishInflate()V

    .line 2
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/widget/ScrollView;->removeAllViews()V

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->initTabStrip()V

    return-void
.end method

.method public removeAllTabs()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mSelectedTab:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    return-void
.end method

.method public removeOnTabSelectedListener(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabSelectedListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public setIndicatorColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mColorIndicator:I

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->invalidate()V

    return-void
.end method

.method public setIndicatorCorners(I)V
    .locals 0

    int-to-float p1, p1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorCorners:F

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->invalidate()V

    return-void
.end method

.method public setIndicatorGravity(I)V
    .locals 1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    const/16 v0, 0x77

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "only support Gravity.LEFT, Gravity.RIGHT, Gravity.FILL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2
    :cond_1
    :goto_0
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorGravity:I

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->setIndicatorGravity()V

    return-void
.end method

.method public setIndicatorWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mIndicatorWidth:I

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->setIndicatorGravity()V

    return-void
.end method

.method public setTabAdapter(Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->removeAllTabs()V

    if-eqz p1, :cond_0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabAdapter:Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;

    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 4
    new-instance v1, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mContext:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;-><init>(Landroid/content/Context;)V

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;->getIcon(I)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setIcon(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    move-result-object v1

    .line 5
    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;->getTitle(I)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setTitle(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    move-result-object v1

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;->getBadge(I)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setBadge(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    move-result-object v1

    .line 6
    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;->getBackground(I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setBackground(I)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    move-result-object v1

    .line 7
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->addTab(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setTabBadge(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getTabAt(I)Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;->getBadgeView()Lcom/xuexiang/xui/widget/textview/badge/Badge;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setBadgeNumber(I)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    return-void
.end method

.method public setTabBadge(ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getTabAt(I)Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;->getBadgeView()Lcom/xuexiang/xui/widget/textview/badge/Badge;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setBadgeText(Ljava/lang/String;)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    return-void
.end method

.method public setTabHeight(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabHeight:I

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabHeight:I

    .line 3
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabMode:I

    sget v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->TAB_MODE_FIXED:I

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-ge p1, v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 7
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabHeight:I

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->invalidate()V

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$6;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$6;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setTabMargin(I)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabMargin:I

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabMargin:I

    .line 3
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabMode:I

    sget v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->TAB_MODE_FIXED:I

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    if-nez v0, :cond_2

    const/4 v3, 0x0

    goto :goto_1

    .line 7
    :cond_2
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabMargin:I

    :goto_1
    invoke-virtual {v2, p1, v3, p1, p1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 8
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 9
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->invalidate()V

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$5;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$5;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setTabMode(I)V
    .locals 3

    .line 1
    sget v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->TAB_MODE_FIXED:I

    if-eq p1, v0, :cond_1

    sget v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->TAB_MODE_SCROLLABLE:I

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "only support TAB_MODE_FIXED or TAB_MODE_SCROLLABLE"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabMode:I

    if-ne p1, v0, :cond_2

    return-void

    .line 4
    :cond_2
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabMode:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 5
    :goto_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 8
    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->initTabWithMode(Landroid/widget/LinearLayout$LayoutParams;)V

    if-nez v0, :cond_3

    .line 9
    invoke-virtual {v2, p1, p1, p1, p1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 10
    :cond_3
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 11
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->invalidate()V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabStrip:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$4;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$4;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setTabSelected(I)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setTabSelected(IZZ)V

    return-void
.end method

.method public setupWithFragment(Landroidx/fragment/app/FragmentManager;ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentManager;",
            "I",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;)V"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabFragmentManager:Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;->detach()V

    :cond_0
    if-eqz p2, :cond_1

    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;

    invoke-direct {v0, p1, p2, p3, p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;-><init>(Landroidx/fragment/app/FragmentManager;ILjava/util/List;Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabFragmentManager:Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;

    goto :goto_0

    .line 6
    :cond_1
    new-instance p2, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;

    invoke-direct {p2, p1, p3, p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabFragmentManager:Lcom/xuexiang/xui/widget/tabbar/vertical/TabFragmentManager;

    :goto_0
    return-void
.end method

.method public setupWithFragment(Landroidx/fragment/app/FragmentManager;ILjava/util/List;Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentManager;",
            "I",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;",
            ")V"
        }
    .end annotation

    .line 7
    invoke-virtual {p0, p4}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setTabAdapter(Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;)V

    .line 8
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setupWithFragment(Landroidx/fragment/app/FragmentManager;ILjava/util/List;)V

    return-void
.end method

.method public setupWithFragment(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentManager;",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setupWithFragment(Landroidx/fragment/app/FragmentManager;ILjava/util/List;)V

    return-void
.end method

.method public setupWithFragment(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentManager;",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setupWithFragment(Landroidx/fragment/app/FragmentManager;ILjava/util/List;Lcom/xuexiang/xui/widget/tabbar/vertical/TabAdapter;)V

    return-void
.end method

.method public setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabPageChangeListener:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    :cond_0
    const/4 v0, 0x1

    if-eqz p1, :cond_3

    .line 3
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/a;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    .line 5
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabPageChangeListener:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;

    if-nez v2, :cond_1

    .line 6
    new-instance v2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;

    invoke-direct {v2, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabPageChangeListener:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;

    .line 7
    :cond_1
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mTabPageChangeListener:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabPageChangeListener;

    invoke-virtual {p1, v2}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    .line 8
    new-instance p1, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$7;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$7;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->addOnTabSelectedListener(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$OnTabSelectedListener;)V

    .line 9
    invoke-direct {p0, v1, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setPagerAdapter(Landroidx/viewpager/widget/a;Z)V

    goto :goto_0

    .line 10
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ViewPager does not have a PagerAdapter set"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    .line 12
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setPagerAdapter(Landroidx/viewpager/widget/a;Z)V

    :goto_0
    return-void
.end method
