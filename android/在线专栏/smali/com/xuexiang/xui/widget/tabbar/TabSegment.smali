.class public Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$PagerAdapterObserver;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$ViewPagerOnTabSelectedListener;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$TypefaceProvider;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabClickListener;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$IconPosition;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$Mode;
    }
.end annotation


# static fields
.field public static final ICON_POSITION_BOTTOM:I = 0x3

.field public static final ICON_POSITION_LEFT:I = 0x0

.field public static final ICON_POSITION_RIGHT:I = 0x2

.field public static final ICON_POSITION_TOP:I = 0x1

.field public static final MODE_FIXED:I = 0x1

.field public static final MODE_SCROLLABLE:I = 0x0

.field private static final NO_POSITION:I = -0x1

.field private static final TAG:Ljava/lang/String; = "TabSegment"


# instance fields
.field private mAdapterChangeListener:Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;

.field private mContentLayout:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;

.field private mCurrentSelectedIndex:I

.field private mDefaultTabIconPosition:I

.field private mHasIndicator:Z

.field private mIndicatorDrawable:Landroid/graphics/drawable/Drawable;

.field private mIndicatorHeight:I

.field private mIndicatorPaint:Landroid/graphics/Paint;

.field private mIndicatorRect:Landroid/graphics/Rect;

.field private mIndicatorTop:Z

.field private mIsInSelectTab:Z

.field private mIsIndicatorWidthFollowContent:Z

.field private mItemSpaceInScrollMode:I

.field private mMode:I

.field private mNormalColor:I

.field private mOnPageChangeListener:Landroidx/viewpager/widget/ViewPager$i;

.field private mOnTabClickListener:Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabClickListener;

.field private mPagerAdapter:Landroidx/viewpager/widget/a;

.field private mPagerAdapterObserver:Landroid/database/DataSetObserver;

.field private mPendingSelectedIndex:I

.field private mSelectAnimator:Landroid/animation/Animator;

.field private mSelectedColor:I

.field private final mSelectedListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;",
            ">;"
        }
    .end annotation
.end field

.field protected mTabOnClickListener:Landroid/view/View$OnClickListener;

.field private mTabTextSize:I

.field private mTypefaceProvider:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TypefaceProvider;

.field private mViewPager:Landroidx/viewpager/widget/ViewPager;

.field private mViewPagerScrollState:I

.field private mViewPagerSelectedListener:Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 4
    sget v0, Lcom/xuexiang/xui/R$attr;->TabSegmentStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mCurrentSelectedIndex:I

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPendingSelectedIndex:I

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mHasIndicator:Z

    const/4 v1, 0x0

    .line 10
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorTop:Z

    .line 11
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsIndicatorWidthFollowContent:Z

    const/4 v2, 0x0

    .line 12
    iput-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorRect:Landroid/graphics/Rect;

    .line 13
    iput-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorPaint:Landroid/graphics/Paint;

    .line 14
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mMode:I

    .line 15
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mViewPagerScrollState:I

    .line 16
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$1;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mTabOnClickListener:Landroid/view/View$OnClickListener;

    .line 17
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsInSelectTab:Z

    .line 18
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    invoke-virtual {p0, v1}, Landroid/widget/HorizontalScrollView;->setHorizontalScrollBarEnabled(Z)V

    .line 20
    invoke-virtual {p0, v1}, Landroid/widget/HorizontalScrollView;->setClipToPadding(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mHasIndicator:Z

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/animation/Animator;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectAnimator:Landroid/animation/Animator;

    return-object p0
.end method

.method static synthetic access$002(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/animation/Animator;)Landroid/animation/Animator;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectAnimator:Landroid/animation/Animator;

    return-object p1
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mViewPagerScrollState:I

    return p0
.end method

.method static synthetic access$1000(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/widget/TextView;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->setTextViewTypeface(Landroid/widget/TextView;Z)V

    return-void
.end method

.method static synthetic access$1100(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mCurrentSelectedIndex:I

    return p0
.end method

.method static synthetic access$1102(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mCurrentSelectedIndex:I

    return p1
.end method

.method static synthetic access$1200(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPendingSelectedIndex:I

    return p0
.end method

.method static synthetic access$1202(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPendingSelectedIndex:I

    return p1
.end method

.method static synthetic access$1300(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->layoutIndicator(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V

    return-void
.end method

.method static synthetic access$1600(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->setViewPagerScrollState(I)V

    return-void
.end method

.method static synthetic access$1700(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabCount()I

    move-result p0

    return p0
.end method

.method static synthetic access$1800(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mMode:I

    return p0
.end method

.method static synthetic access$1900(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabTextSize(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$2000(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    return-object p0
.end method

.method static synthetic access$2100(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$2200(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->dispatchTabDoubleTap(I)V

    return-void
.end method

.method static synthetic access$2300(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabIconPosition(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result p0

    return p0
.end method

.method static synthetic access$2400(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->setDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method static synthetic access$2500(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mItemSpaceInScrollMode:I

    return p0
.end method

.method static synthetic access$2600(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsIndicatorWidthFollowContent:Z

    return p0
.end method

.method static synthetic access$2700(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Rect;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorRect:Landroid/graphics/Rect;

    return-object p0
.end method

.method static synthetic access$2800(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorTop:Z

    return p0
.end method

.method static synthetic access$2900(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorHeight:I

    return p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mHasIndicator:Z

    return p0
.end method

.method static synthetic access$3000(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/drawable/Drawable;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorDrawable:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method static synthetic access$3100(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Paint;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorPaint:Landroid/graphics/Paint;

    return-object p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mOnTabClickListener:Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabClickListener;

    return-object p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabSelectedColor(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result p0

    return p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabNormalColor(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result p0

    return p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;F)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->layoutIndicatorInTransition(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;F)V

    return-void
.end method

.method static synthetic access$800(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->dispatchTabSelected(I)V

    return-void
.end method

.method static synthetic access$900(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->dispatchTabUnselected(I)V

    return-void
.end method

.method private createTypefaceProvider(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    const-string v0, "Could not instantiate the TypefaceProvider: "

    .line 1
    invoke-static {p2}, Lcom/xuexiang/xui/utils/Utils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    return-void

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getFullClassName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 5
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    .line 8
    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-class v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TypefaceProvider;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v1, 0x0

    :try_start_1
    new-array v2, v1, [Ljava/lang/Class;

    .line 9
    invoke-virtual {p1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v2, 0x1

    .line 10
    :try_start_2
    invoke-virtual {p1, v2}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    new-array v1, v1, [Ljava/lang/Object;

    .line 11
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TypefaceProvider;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mTypefaceProvider:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TypefaceProvider;

    return-void

    :catch_0
    move-exception p1

    .line 12
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error creating TypefaceProvider "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p1

    .line 13
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Class is not a TypefaceProvider "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p1

    .line 14
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot access non-public constructor "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p1

    .line 15
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_4
    move-exception p1

    .line 16
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_5
    move-exception p1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to find TypefaceProvider "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private dispatchTabDoubleTap(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;

    invoke-interface {v1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;->onDoubleTap(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private dispatchTabReselected(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;

    invoke-interface {v1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;->onTabReselected(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private dispatchTabSelected(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;

    invoke-interface {v1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;->onTabSelected(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private dispatchTabUnselected(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;

    invoke-interface {v1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;->onTabUnselected(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mContentLayout:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->getTabAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v0

    return-object v0
.end method

.method private getFullClassName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2e

    if-ne v0, v1, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method private getTabCount()I
    .locals 1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getSize()I

    move-result v0

    return v0
.end method

.method private getTabIconPosition(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getIconPosition()I

    move-result p1

    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_0

    .line 2
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mDefaultTabIconPosition:I

    :cond_0
    return p1
.end method

.method private getTabNormalColor(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getNormalColor()I

    move-result p1

    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_0

    .line 2
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mNormalColor:I

    :cond_0
    return p1
.end method

.method private getTabSelectedColor(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getSelectedColor()I

    move-result p1

    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_0

    .line 2
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedColor:I

    :cond_0
    return p1
.end method

.method private getTabTextSize(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getTextSize()I

    move-result p1

    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_0

    .line 2
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mTabTextSize:I

    :cond_0
    return p1
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->TabSegment:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_selected_color:I

    invoke-static {p1}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedColor:I

    .line 3
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_normal_color:I

    sget v0, Lcom/xuexiang/xui/R$color;->xui_config_color_gray_5:I

    invoke-static {p1, v0}, Landroidx/core/content/a;->b(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mNormalColor:I

    .line 4
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_has_indicator:I

    const/4 v0, 0x1

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mHasIndicator:Z

    .line 5
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_indicator_height:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$dimen;->xui_tab_segment_indicator_height:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorHeight:I

    .line 6
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_android_textSize:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$dimen;->xui_tab_segment_text_size:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mTabTextSize:I

    .line 7
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_indicator_top:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorTop:Z

    .line 8
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_icon_position:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mDefaultTabIconPosition:I

    .line 9
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_mode:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mMode:I

    .line 10
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_space:I

    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mItemSpaceInScrollMode:I

    .line 11
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_typeface_provider:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    .line 12
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 13
    new-instance p2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;

    invoke-direct {p2, p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mContentLayout:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;

    .line 14
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p2, v0}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    invoke-direct {p0, p1, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->createTypefaceProvider(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private layoutIndicator(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorRect:Landroid/graphics/Rect;

    if-nez v0, :cond_1

    .line 2
    new-instance v0, Landroid/graphics/Rect;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->access$1400(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v1

    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->access$1400(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v2

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->access$1500(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v3

    add-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorRect:Landroid/graphics/Rect;

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->access$1400(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorRect:Landroid/graphics/Rect;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->access$1400(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v1

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->access$1500(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 6
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorPaint:Landroid/graphics/Paint;

    if-nez v0, :cond_2

    .line 7
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorPaint:Landroid/graphics/Paint;

    .line 8
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorPaint:Landroid/graphics/Paint;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabSelectedColor(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    if-eqz p2, :cond_3

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mContentLayout:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->invalidate()V

    :cond_3
    return-void
.end method

.method private layoutIndicatorInTransition(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;F)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getContentLeft()I

    move-result v0

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getContentLeft()I

    move-result v1

    sub-int/2addr v0, v1

    .line 2
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getContentWidth()I

    move-result v1

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getContentWidth()I

    move-result v2

    sub-int/2addr v1, v2

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getContentLeft()I

    move-result v2

    int-to-float v2, v2

    int-to-float v0, v0

    mul-float v0, v0, p3

    add-float/2addr v2, v0

    float-to-int v0, v2

    .line 4
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getContentWidth()I

    move-result v2

    int-to-float v2, v2

    int-to-float v1, v1

    mul-float v1, v1, p3

    add-float/2addr v2, v1

    float-to-int v1, v2

    .line 5
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorRect:Landroid/graphics/Rect;

    if-nez v2, :cond_0

    .line 6
    new-instance v2, Landroid/graphics/Rect;

    add-int/2addr v1, v0

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3, v1, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorRect:Landroid/graphics/Rect;

    goto :goto_0

    .line 7
    :cond_0
    iput v0, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v0, v1

    .line 8
    iput v0, v2, Landroid/graphics/Rect;->right:I

    .line 9
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorPaint:Landroid/graphics/Paint;

    if-nez v0, :cond_1

    .line 10
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorPaint:Landroid/graphics/Paint;

    .line 11
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 12
    :cond_1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabSelectedColor(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result p1

    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabSelectedColor(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result p2

    .line 13
    invoke-static {p1, p2, p3}, Lcom/xuexiang/xui/utils/ColorUtils;->computeColor(IIF)I

    move-result p1

    .line 14
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorPaint:Landroid/graphics/Paint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 15
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mContentLayout:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method private setDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;I)V
    .locals 5

    const/4 v0, 0x0

    if-nez p3, :cond_0

    move-object v1, p2

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    const/4 v2, 0x1

    if-ne p3, v2, :cond_1

    move-object v2, p2

    goto :goto_1

    :cond_1
    move-object v2, v0

    :goto_1
    const/4 v3, 0x2

    if-ne p3, v3, :cond_2

    move-object v3, p2

    goto :goto_2

    :cond_2
    move-object v3, v0

    :goto_2
    const/4 v4, 0x3

    if-ne p3, v4, :cond_3

    goto :goto_3

    :cond_3
    move-object p2, v0

    :goto_3
    invoke-virtual {p1, v1, v2, v3, p2}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private setTextViewTypeface(Landroid/widget/TextView;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mTypefaceProvider:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TypefaceProvider;

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    .line 2
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TypefaceProvider;->isSelectedTabBold()Z

    move-result p2

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TypefaceProvider;->isNormalTabBold()Z

    move-result p2

    .line 3
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mTypefaceProvider:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TypefaceProvider;

    invoke-interface {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TypefaceProvider;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_2
    :goto_1
    return-void
.end method

.method private setViewPagerScrollState(I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mViewPagerScrollState:I

    if-nez p1, :cond_0

    .line 2
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPendingSelectedIndex:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectAnimator:Landroid/animation/Animator;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 3
    invoke-virtual {p0, p1, v1, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->selectTab(IZZ)V

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPendingSelectedIndex:I

    :cond_0
    return-void
.end method


# virtual methods
.method public addOnTabSelectedListener(Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public addTab(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)Lcom/xuexiang/xui/widget/tabbar/TabSegment;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mContentLayout:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->getTabAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->addItem(Ljava/lang/Object;)Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;

    return-object p0
.end method

.method public clearOnTabSelectedListeners()V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public getMode()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mMode:I

    return v0
.end method

.method public getSelectedIndex()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mCurrentSelectedIndex:I

    return v0
.end method

.method public getSignCount(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getSignCount()I

    move-result p1

    return p1
.end method

.method public getTab(I)Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;
    .locals 1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    return-object p1
.end method

.method public hideSignCountView(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->hideSignCountView()V

    return-void
.end method

.method public notifyDataChanged()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->setup()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->populateFromPagerAdapter(Z)V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/HorizontalScrollView;->onLayout(ZIIII)V

    .line 2
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mCurrentSelectedIndex:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_1

    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mMode:I

    if-nez p1, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getViews()Ljava/util/List;

    move-result-object p1

    iget p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mCurrentSelectedIndex:I

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 5
    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result p2

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getLeft()I

    move-result p3

    const/4 p4, 0x0

    if-le p2, p3, :cond_0

    .line 6
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getLeft()I

    move-result p1

    invoke-virtual {p0, p1, p4}, Landroid/widget/HorizontalScrollView;->scrollTo(II)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getPaddingRight()I

    move-result p3

    sub-int/2addr p2, p3

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getPaddingLeft()I

    move-result p3

    sub-int/2addr p2, p3

    .line 8
    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getRight()I

    move-result p5

    if-ge p3, p5, :cond_1

    .line 9
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getRight()I

    move-result p1

    sub-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {p0, p1, p4}, Landroid/widget/HorizontalScrollView;->scrollBy(II)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 6

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 3
    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getChildCount()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x0

    .line 4
    invoke-virtual {p0, v2}, Landroid/widget/HorizontalScrollView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 5
    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getPaddingRight()I

    move-result v4

    add-int/2addr v3, v4

    sub-int v4, v0, v3

    const/high16 v5, 0x40000000    # 2.0f

    .line 6
    invoke-static {v4, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {v2, v4, p2}, Landroid/view/View;->measure(II)V

    const/high16 v4, -0x80000000

    if-ne v1, v4, :cond_0

    .line 7
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    add-int/2addr p1, v3

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {p0, p1, p2}, Landroid/widget/HorizontalScrollView;->setMeasuredDimension(II)V

    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroid/widget/HorizontalScrollView;->setMeasuredDimension(II)V

    return-void
.end method

.method populateFromPagerAdapter(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPagerAdapter:Landroidx/viewpager/widget/a;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->reset()V

    :cond_0
    return-void

    .line 3
    :cond_1
    invoke-virtual {v0}, Landroidx/viewpager/widget/a;->getCount()I

    move-result v0

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->reset()V

    const/4 p1, 0x0

    :goto_0
    if-ge p1, v0, :cond_2

    .line 5
    new-instance v2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPagerAdapter:Landroidx/viewpager/widget/a;

    invoke-virtual {v3, p1}, Landroidx/viewpager/widget/a;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->addTab(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->notifyDataChanged()V

    .line 7
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    if-eqz p1, :cond_4

    if-lez v0, :cond_4

    .line 8
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p1

    const/4 v0, 0x1

    .line 9
    invoke-virtual {p0, p1, v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->selectTab(IZZ)V

    :cond_4
    return-void
.end method

.method public removeOnTabSelectedListener(Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public replaceTab(ILcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->replaceItem(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mContentLayout:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->getTabAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->clear()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mCurrentSelectedIndex:I

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectAnimator:Landroid/animation/Animator;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectAnimator:Landroid/animation/Animator;

    :cond_0
    return-void
.end method

.method public selectTab(I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->selectTab(IZZ)V

    return-void
.end method

.method public selectTab(IZZ)V
    .locals 16

    move-object/from16 v8, p0

    move/from16 v6, p1

    .line 2
    iget-boolean v0, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsInSelectTab:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsInSelectTab:Z

    .line 4
    invoke-direct/range {p0 .. p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getViews()Ljava/util/List;

    move-result-object v2

    .line 6
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getSize()I

    move-result v4

    if-eq v3, v4, :cond_1

    .line 7
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->setup()V

    .line 8
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getViews()Ljava/util/List;

    move-result-object v2

    .line 9
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v9, 0x0

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-gt v3, v6, :cond_2

    goto/16 :goto_2

    .line 10
    :cond_2
    iget-object v3, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectAnimator:Landroid/animation/Animator;

    if-nez v3, :cond_b

    iget v3, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mViewPagerScrollState:I

    if-eqz v3, :cond_3

    goto/16 :goto_1

    .line 11
    :cond_3
    iget v3, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mCurrentSelectedIndex:I

    if-ne v3, v6, :cond_5

    if-eqz p3, :cond_4

    .line 12
    invoke-direct/range {p0 .. p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->dispatchTabReselected(I)V

    .line 13
    :cond_4
    iput-boolean v9, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsInSelectTab:Z

    .line 14
    iget-object v0, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mContentLayout:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->invalidate()V

    return-void

    .line 15
    :cond_5
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, -0x1

    if-le v3, v4, :cond_6

    const-string v3, "TabSegment"

    const-string v4, "selectTab: current selected index is bigger than views size."

    .line 16
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    iput v5, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mCurrentSelectedIndex:I

    .line 18
    :cond_6
    iget v7, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mCurrentSelectedIndex:I

    if-ne v7, v5, :cond_7

    .line 19
    invoke-virtual {v1, v6}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    .line 20
    invoke-direct {v8, v1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->layoutIndicator(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V

    .line 21
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    move-result-object v3

    .line 22
    invoke-direct {v8, v3, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->setTextViewTypeface(Landroid/widget/TextView;Z)V

    .line 23
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    invoke-virtual {v2, v1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->updateDecoration(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V

    .line 24
    invoke-direct/range {p0 .. p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->dispatchTabSelected(I)V

    .line 25
    iput v6, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mCurrentSelectedIndex:I

    .line 26
    iput-boolean v9, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsInSelectTab:Z

    return-void

    .line 27
    :cond_7
    invoke-virtual {v1, v7}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    .line 28
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 29
    invoke-virtual {v1, v6}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    .line 30
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    if-eqz p2, :cond_a

    .line 31
    invoke-direct {v8, v7}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->dispatchTabUnselected(I)V

    .line 32
    invoke-direct/range {p0 .. p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->dispatchTabSelected(I)V

    .line 33
    invoke-virtual {v11}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    move-result-object v1

    invoke-direct {v8, v1, v9}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->setTextViewTypeface(Landroid/widget/TextView;Z)V

    .line 34
    invoke-virtual {v13}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    move-result-object v1

    invoke-direct {v8, v1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->setTextViewTypeface(Landroid/widget/TextView;Z)V

    .line 35
    invoke-virtual {v11, v10, v9}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->updateDecoration(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V

    .line 36
    invoke-virtual {v13, v12, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->updateDecoration(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V

    .line 37
    invoke-virtual/range {p0 .. p0}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v1

    invoke-virtual {v13}, Landroid/widget/RelativeLayout;->getLeft()I

    move-result v2

    if-le v1, v2, :cond_8

    .line 38
    invoke-virtual {v13}, Landroid/widget/RelativeLayout;->getLeft()I

    move-result v1

    invoke-virtual {v8, v1, v9}, Landroid/widget/HorizontalScrollView;->smoothScrollTo(II)V

    goto :goto_0

    .line 39
    :cond_8
    invoke-virtual/range {p0 .. p0}, Landroid/widget/HorizontalScrollView;->getWidth()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/widget/HorizontalScrollView;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual/range {p0 .. p0}, Landroid/widget/HorizontalScrollView;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    .line 40
    invoke-virtual/range {p0 .. p0}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {v13}, Landroid/widget/RelativeLayout;->getRight()I

    move-result v3

    if-ge v2, v3, :cond_9

    .line 41
    invoke-virtual {v13}, Landroid/widget/RelativeLayout;->getRight()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual/range {p0 .. p0}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v1

    sub-int/2addr v2, v1

    invoke-virtual {v8, v2, v9}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    .line 42
    :cond_9
    :goto_0
    iput v6, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mCurrentSelectedIndex:I

    .line 43
    iput-boolean v9, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsInSelectTab:Z

    .line 44
    invoke-direct {v8, v12, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->layoutIndicator(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V

    return-void

    :cond_a
    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 45
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v14

    .line 46
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v14, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 47
    new-instance v15, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;

    move-object v0, v15

    move-object/from16 v1, p0

    move-object v2, v10

    move-object v3, v12

    move-object v4, v11

    move-object v5, v13

    invoke-direct/range {v0 .. v5}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;)V

    invoke-virtual {v14, v15}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 48
    new-instance v15, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;

    move-object v0, v15

    move-object v2, v11

    move-object v3, v10

    move-object v4, v13

    move-object v5, v12

    move/from16 v6, p1

    invoke-direct/range {v0 .. v7}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;II)V

    invoke-virtual {v14, v15}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const-wide/16 v0, 0xc8

    .line 49
    invoke-virtual {v14, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 50
    invoke-virtual {v14}, Landroid/animation/ValueAnimator;->start()V

    .line 51
    iput-boolean v9, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsInSelectTab:Z

    return-void

    .line 52
    :cond_b
    :goto_1
    iput v6, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPendingSelectedIndex:I

    .line 53
    iput-boolean v9, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsInSelectTab:Z

    return-void

    .line 54
    :cond_c
    :goto_2
    iput-boolean v9, v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsInSelectTab:Z

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public setDefaultNormalColor(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mNormalColor:I

    return-void
.end method

.method public setDefaultSelectedColor(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectedColor:I

    return-void
.end method

.method public setDefaultTabIconPosition(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mDefaultTabIconPosition:I

    return-void
.end method

.method public setHasIndicator(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mHasIndicator:Z

    if-eq v0, p1, :cond_0

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mHasIndicator:Z

    .line 3
    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    :cond_0
    return-void
.end method

.method public setIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorHeight:I

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mContentLayout:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method public setIndicatorPosition(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorTop:Z

    if-eq v0, p1, :cond_0

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIndicatorTop:Z

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mContentLayout:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->invalidate()V

    :cond_0
    return-void
.end method

.method public setIndicatorWidthAdjustContent(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsIndicatorWidthFollowContent:Z

    if-eq v0, p1, :cond_0

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsIndicatorWidthFollowContent:Z

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mContentLayout:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setItemSpaceInScrollMode(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mItemSpaceInScrollMode:I

    return-void
.end method

.method public setMode(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mMode:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mMode:I

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mContentLayout:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->invalidate()V

    :cond_0
    return-void
.end method

.method public setOnTabClickListener(Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mOnTabClickListener:Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabClickListener;

    return-void
.end method

.method setPagerAdapter(Landroidx/viewpager/widget/a;ZZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPagerAdapter:Landroidx/viewpager/widget/a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPagerAdapterObserver:Landroid/database/DataSetObserver;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/a;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPagerAdapter:Landroidx/viewpager/widget/a;

    if-eqz p3, :cond_2

    if-eqz p1, :cond_2

    .line 4
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPagerAdapterObserver:Landroid/database/DataSetObserver;

    if-nez p3, :cond_1

    .line 5
    new-instance p3, Lcom/xuexiang/xui/widget/tabbar/TabSegment$PagerAdapterObserver;

    invoke-direct {p3, p0, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$PagerAdapterObserver;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Z)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPagerAdapterObserver:Landroid/database/DataSetObserver;

    .line 6
    :cond_1
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mPagerAdapterObserver:Landroid/database/DataSetObserver;

    invoke-virtual {p1, p3}, Landroidx/viewpager/widget/a;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 7
    :cond_2
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->populateFromPagerAdapter(Z)V

    return-void
.end method

.method public setTabTextSize(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mTabTextSize:I

    return-void
.end method

.method public setTypefaceProvider(Lcom/xuexiang/xui/widget/tabbar/TabSegment$TypefaceProvider;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mTypefaceProvider:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TypefaceProvider;

    return-void
.end method

.method public setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;Z)V

    return-void
.end method

.method public setupWithViewPager(Landroidx/viewpager/widget/ViewPager;Z)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;ZZ)V

    return-void
.end method

.method public setupWithViewPager(Landroidx/viewpager/widget/ViewPager;ZZ)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mOnPageChangeListener:Landroidx/viewpager/widget/ViewPager$i;

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mAdapterChangeListener:Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;

    if-eqz v0, :cond_1

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->removeOnAdapterChangeListener(Landroidx/viewpager/widget/ViewPager$h;)V

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mViewPagerSelectedListener:Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->removeOnTabSelectedListener(Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;)V

    .line 10
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mViewPagerSelectedListener:Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;

    :cond_2
    if-eqz p1, :cond_6

    .line 11
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mOnPageChangeListener:Landroidx/viewpager/widget/ViewPager$i;

    if-nez v0, :cond_3

    .line 13
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mOnPageChangeListener:Landroidx/viewpager/widget/ViewPager$i;

    .line 14
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mOnPageChangeListener:Landroidx/viewpager/widget/ViewPager$i;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    .line 15
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$ViewPagerOnTabSelectedListener;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$ViewPagerOnTabSelectedListener;-><init>(Landroidx/viewpager/widget/ViewPager;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mViewPagerSelectedListener:Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;

    .line 16
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->addOnTabSelectedListener(Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabSelectedListener;)V

    .line 17
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/a;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 18
    invoke-virtual {p0, v0, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->setPagerAdapter(Landroidx/viewpager/widget/a;ZZ)V

    .line 19
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mAdapterChangeListener:Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;

    if-nez v0, :cond_5

    .line 20
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;

    invoke-direct {v0, p0, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Z)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mAdapterChangeListener:Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;

    .line 21
    :cond_5
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mAdapterChangeListener:Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;

    invoke-virtual {p2, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;->setAutoRefresh(Z)V

    .line 22
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mAdapterChangeListener:Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;

    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->addOnAdapterChangeListener(Landroidx/viewpager/widget/ViewPager$h;)V

    goto :goto_0

    .line 23
    :cond_6
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    const/4 p1, 0x0

    .line 24
    invoke-virtual {p0, v1, p1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->setPagerAdapter(Landroidx/viewpager/widget/a;ZZ)V

    :goto_0
    return-void
.end method

.method public showSignCountView(Landroid/content/Context;II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    .line 2
    invoke-virtual {p2, p1, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->showSignCountView(Landroid/content/Context;I)V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->notifyDataChanged()V

    return-void
.end method

.method public updateIndicatorPosition(IF)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mSelectAnimator:Landroid/animation/Animator;

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->mIsInSelectTab:Z

    if-nez v0, :cond_3

    const/4 v0, 0x0

    cmpl-float v1, p2, v0

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    cmpg-float v0, p2, v0

    if-gez v0, :cond_1

    add-int/lit8 v0, p1, -0x1

    neg-float p2, p2

    goto :goto_0

    :cond_1
    add-int/lit8 v0, p1, 0x1

    .line 2
    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getViews()Ljava/util/List;

    move-result-object v2

    .line 4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, p1, :cond_3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-gt v3, v0, :cond_2

    goto :goto_1

    .line 5
    :cond_2
    invoke-virtual {v1, p1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    .line 6
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    .line 7
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 8
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 9
    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabSelectedColor(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v2

    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabNormalColor(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v4

    invoke-static {v2, v4, p2}, Lcom/xuexiang/xui/utils/ColorUtils;->computeColor(IIF)I

    move-result v2

    .line 10
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabNormalColor(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v4

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabSelectedColor(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v5

    invoke-static {v4, v5, p2}, Lcom/xuexiang/xui/utils/ColorUtils;->computeColor(IIF)I

    move-result v4

    .line 11
    invoke-virtual {p1, v3, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->setColorInTransition(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;I)V

    .line 12
    invoke-virtual {v0, v1, v4}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->setColorInTransition(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;I)V

    .line 13
    invoke-direct {p0, v3, v1, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->layoutIndicatorInTransition(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;F)V

    :cond_3
    :goto_1
    return-void
.end method

.method public updateTabText(ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->notifyDataChanged()V

    return-void
.end method
