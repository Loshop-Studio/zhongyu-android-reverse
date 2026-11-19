.class public Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;
.super Landroid/webkit/WebView;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;
.implements Landroidx/core/view/k;


# instance fields
.field private final DENSITY:F

.field private mChildHelper:Landroidx/core/view/l;

.field private mLinkageEvent:Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

.field private mMaximumVelocity:I

.field private mMinimumVelocity:I

.field private mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

.field private final mScrollConsumed:[I

.field private mScroller:Landroid/widget/Scroller;

.field private mVelocityTracker:Landroid/view/VelocityTracker;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x2

    new-array p2, p2, [I

    .line 4
    iput-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mScrollConsumed:[I

    .line 5
    new-instance p2, Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mScroller:Landroid/widget/Scroller;

    .line 6
    new-instance p2, Landroidx/core/view/l;

    invoke-direct {p2, p0}, Landroidx/core/view/l;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mChildHelper:Landroidx/core/view/l;

    .line 7
    new-instance p2, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    invoke-direct {p2}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    .line 8
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    .line 9
    iget-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    invoke-virtual {p3, v0}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->setTouchSlop(I)V

    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->DENSITY:F

    .line 11
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mMaximumVelocity:I

    .line 12
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mMinimumVelocity:I

    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->setNestedScrollingEnabled(Z)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;I)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->canScrollVertical(I)Z

    move-result p0

    return p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;)I
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/WebView;->computeVerticalScrollExtent()I

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;)I
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/WebView;->computeVerticalScrollOffset()I

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;)I
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/WebView;->computeVerticalScrollRange()I

    move-result p0

    return p0
.end method

.method private canScrollVertical(I)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v0

    const/4 v1, 0x1

    if-gez p1, :cond_1

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    .line 2
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->isScrollToBottom()Z

    move-result p1

    xor-int/2addr p1, v1

    return p1
.end method

.method private flingWithNestedDispatch(I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    if-lez p1, :cond_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->getScrollRange()I

    move-result v2

    if-lt v0, v2, :cond_2

    if-gez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    int-to-float v2, p1

    const/4 v3, 0x0

    .line 3
    invoke-virtual {p0, v3, v2}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->dispatchNestedPreFling(FF)Z

    move-result v4

    if-nez v4, :cond_3

    .line 4
    invoke-virtual {p0, v3, v2, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->dispatchNestedFling(FFZ)Z

    .line 5
    invoke-virtual {p0, v1, p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->flingScroll(II)V

    :cond_3
    return-void
.end method

.method private initOrResetVelocityTracker()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mVelocityTracker:Landroid/view/VelocityTracker;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    :goto_0
    return-void
.end method

.method private initVelocityTrackerIfNotExists()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mVelocityTracker:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method private isScrollToBottom()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->getScrollRange()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private recycleVelocityTracker()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mVelocityTracker:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method


# virtual methods
.method public computeScroll()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v1, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->scrollTo(II)V

    .line 4
    invoke-virtual {p0}, Landroid/webkit/WebView;->invalidate()V

    :cond_0
    return-void
.end method

.method public dispatchNestedFling(FFZ)Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/core/view/l;->a(FFZ)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreFling(FF)Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/l;->b(FF)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/core/view/l;->c(II[I[I)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .locals 6

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mChildHelper:Landroidx/core/view/l;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/core/view/l;->f(IIII[I)Z

    move-result p1

    return p1
.end method

.method public flingScroll(II)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v2

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/high16 v7, -0x80000000

    const v8, 0x7fffffff

    move v4, p2

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 2
    invoke-virtual {p0}, Landroid/webkit/WebView;->invalidate()V

    return-void
.end method

.method public getScrollRange()I
    .locals 2

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->getWebViewContentHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/webkit/WebView;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public getWebViewContentHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContentHeight()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->DENSITY:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public hasNestedScrollingParent()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0}, Landroidx/core/view/l;->k()Z

    move-result v0

    return v0
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0}, Landroidx/core/view/l;->m()Z

    move-result v0

    return v0
.end method

.method protected onScrollChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebView;->onScrollChanged(IIII)V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->canScrollVertically(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->isScrollToBottom()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mLinkageEvent:Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    if-eqz p1, :cond_1

    .line 5
    invoke-interface {p1, p0}, Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;->onContentScrollToBottom(Landroid/view/View;)V

    :cond_1
    const/4 p1, -0x1

    .line 6
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->canScrollVertically(I)Z

    move-result p1

    if-nez p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mLinkageEvent:Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    if-eqz p1, :cond_2

    .line 8
    invoke-interface {p1, p0}, Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;->onContentScrollToTop(Landroid/view/View;)V

    .line 9
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mLinkageEvent:Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    if-eqz p1, :cond_3

    .line 10
    invoke-interface {p1, p0}, Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;->onContentScroll(Landroid/view/View;)V

    :cond_3
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    const/4 v5, 0x3

    if-eq v2, v3, :cond_0

    if-eq v2, v5, :cond_2

    goto/16 :goto_0

    .line 4
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    invoke-virtual {v2, v0, v1}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->onMove(FF)V

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->initVelocityTrackerIfNotExists()V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->isDragging()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->getOffsetY()F

    move-result v0

    neg-float v0, v0

    float-to-int v0, v0

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mScrollConsumed:[I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0, v1, v2}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->dispatchNestedPreScroll(II[I[I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 10
    invoke-virtual {p0, v3, v0}, Landroid/webkit/WebView;->scrollBy(II)V

    .line 11
    :cond_1
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->setAction(I)V

    goto :goto_0

    .line 12
    :cond_2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    invoke-virtual {v2, v0, v1}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->onRelease(FF)V

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_5

    const/16 v1, 0x3e8

    .line 15
    iget v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mMaximumVelocity:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    float-to-int v0, v0

    .line 17
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->recycleVelocityTracker()V

    .line 18
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mMinimumVelocity:I

    if-le v1, v2, :cond_5

    neg-int v0, v0

    .line 19
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->flingWithNestedDispatch(I)V

    goto :goto_0

    .line 20
    :cond_3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    invoke-virtual {v2, v0, v1}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->onDown(FF)V

    .line 21
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->startNestedScroll(I)Z

    .line 22
    invoke-virtual {p0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 23
    invoke-virtual {p0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 24
    :cond_4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->initOrResetVelocityTracker()V

    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 27
    :cond_5
    :goto_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    return v4
.end method

.method public provideScrollHandler()Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView$1;-><init>(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;)V

    return-object v0
.end method

.method public scrollTo(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->getScrollRange()I

    move-result v0

    const/4 v1, 0x0

    .line 2
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 3
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 4
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->scrollTo(II)V

    return-void
.end method

.method public scrollToBottom()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->getWebViewContentHeight()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroid/webkit/WebView;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-super {p0, v1, v0}, Landroid/webkit/WebView;->scrollTo(II)V

    return-void
.end method

.method public setChildLinkageEvent(Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mLinkageEvent:Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0, p1}, Landroidx/core/view/l;->n(Z)V

    return-void
.end method

.method public smoothScrollToBottom()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v2

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->getScrollRange()I

    move-result v1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v3

    sub-int v4, v1, v3

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/16 v5, 0xc8

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 2
    invoke-virtual {p0}, Landroid/webkit/WebView;->invalidate()V

    return-void
.end method

.method public startNestedScroll(I)Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0, p1}, Landroidx/core/view/l;->p(I)Z

    move-result p1

    return p1
.end method

.method public stopNestedScroll()V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0}, Landroidx/core/view/l;->r()V

    return-void
.end method
