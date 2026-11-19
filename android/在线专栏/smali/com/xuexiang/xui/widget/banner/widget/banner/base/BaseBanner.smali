.class public abstract Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$OnItemClickListener;,
        Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        "T:",
        "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner<",
        "TE;TT;>;>",
        "Landroid/widget/RelativeLayout;",
        "Lio/github/inflationx/calligraphy3/HasTypeface;"
    }
.end annotation


# instance fields
.field private mContainerScale:F

.field protected mContext:Landroid/content/Context;

.field protected mCurrentPosition:I

.field protected mDatas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation
.end field

.field private mDelay:J

.field protected mDisplayMetrics:Landroid/util/DisplayMetrics;

.field private mExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

.field private mHandler:Landroid/os/Handler;

.field private mInternalPageListener:Landroidx/viewpager/widget/ViewPager$i;

.field private mIsAutoScrollEnable:Z

.field private mIsAutoScrolling:Z

.field private mIsBarShowWhenLast:Z

.field private mIsDataChanged:Z

.field private mIsOnePageLoop:Z

.field private mItemHeight:I

.field private mItemWidth:I

.field protected mLastPosition:I

.field private mLlBottomBar:Landroid/widget/LinearLayout;

.field private mLlIndicatorContainer:Landroid/widget/LinearLayout;

.field private mOnItemClickListener:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$OnItemClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$OnItemClickListener<",
            "TE;>;"
        }
    .end annotation
.end field

.field private mOnPageChangeListener:Landroidx/viewpager/widget/ViewPager$i;

.field private mPeriod:J

.field private mScrollSpeed:I

.field private mTransformerClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Landroidx/viewpager/widget/ViewPager$j;",
            ">;"
        }
    .end annotation
.end field

.field private mTvTitle:Landroid/widget/TextView;

.field protected mViewPager:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    const/16 v0, 0x1c2

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mScrollSpeed:I

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsDataChanged:Z

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsOnePageLoop:Z

    .line 6
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$1;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mHandler:Landroid/os/Handler;

    .line 7
    new-instance v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mInternalPageListener:Landroidx/viewpager/widget/ViewPager$i;

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 9
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    const/16 v0, 0x1c2

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mScrollSpeed:I

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsDataChanged:Z

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsOnePageLoop:Z

    .line 14
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$1;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mHandler:Landroid/os/Handler;

    .line 15
    new-instance v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mInternalPageListener:Landroidx/viewpager/widget/ViewPager$i;

    .line 16
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 17
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    const/16 p3, 0x1c2

    .line 19
    iput p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mScrollSpeed:I

    const/4 p3, 0x0

    .line 20
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsDataChanged:Z

    const/4 p3, 0x1

    .line 21
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsOnePageLoop:Z

    .line 22
    new-instance p3, Landroid/os/Handler;

    new-instance v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$1;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    invoke-direct {p3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mHandler:Landroid/os/Handler;

    .line 23
    new-instance p3, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;

    invoke-direct {p3, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mInternalPageListener:Landroidx/viewpager/widget/ViewPager$i;

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->scrollToNextItem(I)V

    return-void
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroidx/viewpager/widget/ViewPager$i;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mOnPageChangeListener:Landroidx/viewpager/widget/ViewPager$i;

    return-object p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsBarShowWhenLast:Z

    return p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroid/widget/LinearLayout;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$OnItemClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mOnItemClickListener:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$OnItemClickListener;

    return-object p0
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 1
    iput-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mContext:Landroid/content/Context;

    .line 2
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iput-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDisplayMetrics:Landroid/util/DisplayMetrics;

    .line 3
    sget-object v3, Lcom/xuexiang/xui/R$styleable;->BaseBanner:[I

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 4
    sget v4, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_scale:I

    const/high16 v5, -0x40800000    # -1.0f

    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    iput v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mContainerScale:F

    .line 5
    sget v4, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isLoopEnable:I

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    .line 6
    sget v6, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_delay:I

    const/4 v7, 0x5

    invoke-virtual {v3, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    int-to-long v8, v6

    iput-wide v8, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDelay:J

    .line 7
    sget v6, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_period:I

    invoke-virtual {v3, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    int-to-long v8, v6

    iput-wide v8, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mPeriod:J

    .line 8
    sget v6, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isAutoScrollEnable:I

    invoke-virtual {v3, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsAutoScrollEnable:Z

    .line 9
    sget v6, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barColor:I

    const/4 v8, 0x0

    invoke-virtual {v3, v6, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    .line 10
    sget v9, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isBarShowWhenLast:I

    invoke-virtual {v3, v9, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    iput-boolean v9, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsBarShowWhenLast:Z

    .line 11
    sget v9, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_indicatorGravity:I

    const/16 v10, 0x11

    invoke-virtual {v3, v9, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v9

    .line 12
    sget v11, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barPaddingLeft:I

    const/high16 v12, 0x41200000    # 10.0f

    invoke-virtual {v0, v12}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v3, v11, v13}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v11

    .line 13
    sget v13, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barPaddingTop:I

    const/high16 v15, 0x40000000    # 2.0f

    if-ne v9, v10, :cond_0

    const/high16 v14, 0x40c00000    # 6.0f

    goto :goto_0

    :cond_0
    const/high16 v14, 0x40000000    # 2.0f

    :goto_0
    invoke-virtual {v0, v14}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result v14

    int-to-float v14, v14

    invoke-virtual {v3, v13, v14}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v13

    .line 14
    sget v14, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barPaddingRight:I

    invoke-virtual {v0, v12}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result v12

    int-to-float v12, v12

    invoke-virtual {v3, v14, v12}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v12

    .line 15
    sget v14, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_barPaddingBottom:I

    if-ne v9, v10, :cond_1

    const/high16 v15, 0x40c00000    # 6.0f

    :cond_1
    invoke-virtual {v0, v15}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result v15

    int-to-float v15, v15

    invoke-virtual {v3, v14, v15}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v14

    .line 16
    sget v15, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_textColor:I

    const-string v16, "#ffffff"

    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v3, v15, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    .line 17
    sget v15, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_textSize:I

    const/high16 v10, 0x41480000    # 12.5f

    invoke-direct {v0, v10}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->sp2px(F)F

    move-result v10

    invoke-virtual {v3, v15, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v10

    .line 18
    sget v15, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isTitleShow:I

    invoke-virtual {v3, v15, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v15

    .line 19
    sget v8, Lcom/xuexiang/xui/R$styleable;->BaseBanner_bb_isIndicatorShow:I

    invoke-virtual {v3, v8, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    .line 20
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    const-string v3, "http://schemas.android.com/apk/res/android"

    const-string v5, "layout_height"

    .line 21
    invoke-interface {v2, v3, v5}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v4, :cond_2

    .line 22
    new-instance v4, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-direct {v4, v1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_2
    new-instance v4, Landroidx/viewpager/widget/ViewPager;

    invoke-direct {v4, v1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    :goto_1
    iput-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    const/4 v5, 0x2

    .line 23
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->setOverScrollMode(I)V

    .line 24
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDisplayMetrics:Landroid/util/DisplayMetrics;

    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mItemWidth:I

    .line 25
    iget v5, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mContainerScale:F

    const/16 v17, 0x0

    move/from16 v18, v9

    const/4 v9, -0x2

    cmpg-float v17, v5, v17

    if-gez v17, :cond_5

    const-string v4, "-1"

    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v4, -0x1

    .line 27
    iput v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mItemHeight:I

    goto :goto_2

    :cond_3
    const-string v4, "-2"

    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 29
    iput v9, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mItemHeight:I

    goto :goto_2

    :cond_4
    const/4 v3, 0x1

    new-array v4, v3, [I

    const v3, 0x10100f5

    const/4 v5, 0x0

    aput v3, v4, v5

    .line 30
    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 31
    invoke-virtual {v2, v5, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 32
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 33
    iput v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mItemHeight:I

    goto :goto_2

    :cond_5
    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v3, v5, v2

    if-lez v3, :cond_6

    .line 34
    iput v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mContainerScale:F

    :cond_6
    int-to-float v2, v4

    .line 35
    iget v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mContainerScale:F

    mul-float v2, v2, v3

    float-to-int v2, v2

    iput v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mItemHeight:I

    .line 36
    :goto_2
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    iget v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mItemWidth:I

    iget v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mItemHeight:I

    invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 37
    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 38
    new-instance v3, Landroid/widget/RelativeLayout;

    invoke-direct {v3, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 39
    invoke-virtual {v0, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    .line 41
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    iget v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mItemWidth:I

    invoke-direct {v2, v4, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0xc

    const/4 v5, -0x1

    .line 42
    invoke-virtual {v2, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 43
    iget-object v4, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v4, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 44
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v6}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 45
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    float-to-int v3, v11

    float-to-int v4, v13

    float-to-int v5, v12

    float-to-int v6, v14

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 46
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setClipChildren(Z)V

    .line 47
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setClipToPadding(Z)V

    .line 48
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlIndicatorContainer:Landroid/widget/LinearLayout;

    const/16 v3, 0x11

    .line 49
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 50
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlIndicatorContainer:Landroid/widget/LinearLayout;

    const/4 v3, 0x4

    if-eqz v8, :cond_7

    const/4 v4, 0x0

    goto :goto_3

    :cond_7
    const/4 v4, 0x4

    :goto_3
    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 51
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlIndicatorContainer:Landroid/widget/LinearLayout;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setClipChildren(Z)V

    .line 52
    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlIndicatorContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setClipToPadding(Z)V

    .line 53
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    .line 54
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v1, v4, v9, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 56
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 57
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    invoke-virtual {v1, v4, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 58
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    if-eqz v15, :cond_8

    const/4 v3, 0x0

    :cond_8
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    move/from16 v1, v18

    const/16 v2, 0x11

    if-ne v1, v2, :cond_9

    .line 59
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 60
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlIndicatorContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_4

    :cond_9
    const/high16 v2, 0x40e00000    # 7.0f

    const/16 v3, 0x10

    const/4 v4, 0x3

    const/4 v5, 0x5

    if-ne v1, v5, :cond_a

    .line 61
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 62
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 63
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlIndicatorContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 64
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v3, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 65
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 66
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setGravity(I)V

    goto :goto_4

    :cond_a
    if-ne v1, v4, :cond_b

    .line 67
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 68
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlIndicatorContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 69
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    iget-object v3, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 70
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 71
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 72
    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    :cond_b
    :goto_4
    return-void
.end method

.method private scrollToNextItem(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsDataChanged:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->updateViewPager()V

    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :cond_1
    return-void
.end method

.method private setScrollSpeed()V
    .locals 5

    .line 1
    :try_start_0
    const-class v0, Landroidx/viewpager/widget/ViewPager;

    const-string v1, "mScroller"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 3
    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 4
    new-instance v2, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/FixedSpeedScroller;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mContext:Landroid/content/Context;

    iget v4, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mScrollSpeed:I

    invoke-direct {v2, v3, v1, v4}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/FixedSpeedScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;I)V

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private setViewPager()V
    .locals 3

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$1;)V

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/a;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTransformerClass:Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager$j;

    invoke-virtual {v1, v2, v0}, Landroidx/viewpager/widget/ViewPager;->setPageTransformer(ZLandroidx/viewpager/widget/ViewPager$j;)V

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->isLoopViewPager()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x226

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mScrollSpeed:I

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->setScrollSpeed()V

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->isLoopViewPager()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x1c2

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mScrollSpeed:I

    .line 11
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->setScrollSpeed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 13
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mInternalPageListener:Landroidx/viewpager/widget/ViewPager$i;

    if-eqz v0, :cond_2

    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    .line 15
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mInternalPageListener:Landroidx/viewpager/widget/ViewPager$i;

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    return-void
.end method

.method private sp2px(F)F
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    mul-float p1, p1, v0

    return p1
.end method

.method private stopScroll()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    :cond_0
    return-void
.end method

.method private updateViewPager()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->isLoopViewPager()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    check-cast v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->getPageAdapterWrapper()Landroidx/viewpager/widget/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/viewpager/widget/a;->notifyDataSetChanged()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/viewpager/widget/a;->notifyDataSetChanged()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mOnPageChangeListener:Landroidx/viewpager/widget/ViewPager$i;

    return-object p0
.end method

.method public barPadding(FFFF)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFF)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result p1

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result p2

    invoke-virtual {p0, p3}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result p3

    invoke-virtual {p0, p4}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->dp2px(F)I

    move-result p4

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    return-object p0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->goOnScroll()V

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->goOnScroll()V

    goto :goto_0

    .line 4
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->pauseScroll()V

    .line 5
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected dp2px(F)I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public getContainerScale()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mContainerScale:F

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getItemHeight()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mItemHeight:I

    return v0
.end method

.method public getItemWidth()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mItemWidth:I

    return v0
.end method

.method public getViewPager()Landroidx/viewpager/widget/ViewPager;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    return-object v0
.end method

.method public goOnScroll()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsAutoScrolling:Z

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->isLoopViewPager()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsAutoScrollEnable:Z

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->pauseScroll()V

    .line 5
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iput-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    new-instance v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$3;

    invoke-direct {v2, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$3;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V

    iget-wide v3, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDelay:J

    iget-wide v5, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mPeriod:J

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsAutoScrolling:Z

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "--->goOnScroll()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/xuexiang/xui/logs/UILog;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsAutoScrolling:Z

    :goto_0
    return-void
.end method

.method protected isLoopViewPager()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    instance-of v0, v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    return v0
.end method

.method protected isValid()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "ViewPager is not exist!"

    .line 2
    invoke-static {v0}, Lcom/xuexiang/xui/logs/UILog;->e(Ljava/lang/String;)V

    return v1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsOnePageLoop:Z

    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eq v0, v2, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    return v1

    :cond_4
    :goto_0
    const-string v0, "DataList must be not empty!"

    .line 5
    invoke-static {v0}, Lcom/xuexiang/xui/logs/UILog;->e(Ljava/lang/String;)V

    return v1
.end method

.method public abstract onCreateIndicator()Landroid/view/View;
.end method

.method public abstract onCreateItemView(I)Landroid/view/View;
.end method

.method public onTitleSelect(Landroid/widget/TextView;I)V
    .locals 0

    return-void
.end method

.method public pauseScroll()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->stopScroll()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "--->pauseScroll()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/xuexiang/xui/logs/UILog;->d(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsAutoScrolling:Z

    return-void
.end method

.method public recycle()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->pauseScroll()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mHandler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public setAutoScrollEnable(Z)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsAutoScrollEnable:Z

    return-object p0
.end method

.method public setBarColor(I)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlBottomBar:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    return-object p0
.end method

.method public setBarShowWhenLast(Z)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsBarShowWhenLast:Z

    return-object p0
.end method

.method public abstract setCurrentIndicator(I)V
.end method

.method public setDelay(J)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TT;"
        }
    .end annotation

    iput-wide p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDelay:J

    return-object p0
.end method

.method public setIndicatorShow(Z)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlIndicatorContainer:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-object p0
.end method

.method public setIsOnePageLoop(Z)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsOnePageLoop:Z

    return-object p0
.end method

.method public setOnItemClickListener(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$OnItemClickListener;)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$OnItemClickListener<",
            "TE;>;)",
            "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mOnItemClickListener:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$OnItemClickListener;

    return-object p0
.end method

.method public setPeriod(J)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TT;"
        }
    .end annotation

    iput-wide p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mPeriod:J

    return-object p0
.end method

.method public setSource(Ljava/util/List;)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TE;>;)TT;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mIsDataChanged:Z

    return-object p0
.end method

.method public setTextColor(I)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-object p0
.end method

.method public setTextSize(F)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    return-object p0
.end method

.method public setTitleShow(Z)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-object p0
.end method

.method public setTransformerClass(Ljava/lang/Class;)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/viewpager/widget/ViewPager$j;",
            ">;)TT;"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTransformerClass:Ljava/lang/Class;

    return-object p0
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public startScroll()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mCurrentPosition:I

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mCurrentPosition:I

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mTvTitle:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mCurrentPosition:I

    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->onTitleSelect(Landroid/widget/TextView;I)V

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->setViewPager()V

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->onCreateIndicator()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlIndicatorContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLlIndicatorContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 9
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->goOnScroll()V

    return-void

    .line 10
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Data source is empty,you must setSource() before startScroll()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
