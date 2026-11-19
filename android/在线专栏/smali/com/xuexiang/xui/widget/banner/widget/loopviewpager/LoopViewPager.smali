.class public Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;
.super Landroidx/viewpager/widget/ViewPager;
.source "SourceFile"


# static fields
.field private static final DEFAULT_BOUNDARY_CASHING:Z = false


# instance fields
.field private mAdapter:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

.field private mBoundaryCaching:Z

.field private mOnPageChangeListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/viewpager/widget/ViewPager$i;",
            ">;"
        }
    .end annotation
.end field

.field private onPageChangeListener:Landroidx/viewpager/widget/ViewPager$i;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mBoundaryCaching:Z

    .line 3
    new-instance v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;-><init>(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->onPageChangeListener:Landroidx/viewpager/widget/ViewPager$i;

    .line 4
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mBoundaryCaching:Z

    .line 7
    new-instance p2, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;

    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;-><init>(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->onPageChangeListener:Landroidx/viewpager/widget/ViewPager$i;

    .line 8
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->init(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mAdapter:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mOnPageChangeListeners:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$201(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)I
    .locals 0

    invoke-super {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p0

    return p0
.end method

.method private init(Landroid/content/Context;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->onPageChangeListener:Landroidx/viewpager/widget/ViewPager$i;

    if-eqz p1, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->onPageChangeListener:Landroidx/viewpager/widget/ViewPager$i;

    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    return-void
.end method

.method public static toRealPosition(II)I
    .locals 0

    add-int/lit8 p0, p0, -0x1

    if-gez p0, :cond_0

    add-int/2addr p0, p1

    goto :goto_0

    :cond_0
    rem-int/2addr p0, p1

    :goto_0
    return p0
.end method


# virtual methods
.method public addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mOnPageChangeListeners:Ljava/util/List;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mOnPageChangeListeners:Ljava/util/List;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mOnPageChangeListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public clearOnPageChangeListeners()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mOnPageChangeListeners:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    return-void
.end method

.method public getAdapter()Landroidx/viewpager/widget/a;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mAdapter:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->getRealAdapter()Landroidx/viewpager/widget/a;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getCurrentItem()I
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mAdapter:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->toRealPosition(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getPageAdapterWrapper()Landroidx/viewpager/widget/a;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mAdapter:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    return-object v0
.end method

.method public removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mOnPageChangeListeners:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public setAdapter(Landroidx/viewpager/widget/a;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;-><init>(Landroidx/viewpager/widget/a;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mAdapter:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    .line 2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mBoundaryCaching:Z

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->setBoundaryCaching(Z)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mAdapter:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/a;)V

    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1, p1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->setCurrentItem(IZ)V

    return-void
.end method

.method public setBoundaryCaching(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mBoundaryCaching:Z

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mAdapter:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->setBoundaryCaching(Z)V

    :cond_0
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->getCurrentItem()I

    move-result v0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->setCurrentItem(IZ)V

    :cond_0
    return-void
.end method

.method public setCurrentItem(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->mAdapter:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->toInnerPosition(I)I

    move-result p1

    .line 2
    invoke-super {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    return-void
.end method

.method public setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    return-void
.end method
