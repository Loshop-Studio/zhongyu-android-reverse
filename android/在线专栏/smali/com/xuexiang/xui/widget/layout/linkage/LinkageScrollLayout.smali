.class public Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;
    }
.end annotation


# static fields
.field public static final FLING_ORIENTATION_DOWN:I = 0x12

.field public static final FLING_ORIENTATION_NONE:I = 0x0

.field public static final FLING_ORIENTATION_UP:I = 0x11

.field public static final LOC_SCROLL_DURATION:I = 0x118

.field public static final TAG:Ljava/lang/String; = "ELinkageScrollLayout"


# instance fields
.field private mChildLinkageEvent:Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

.field private mEdgeList:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/view/View;",
            "Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;",
            ">;"
        }
    .end annotation
.end field

.field private mFlingOrientation:I

.field private mIsIntercept:Z

.field private mLastY:I

.field private mLocScroller:Landroid/widget/Scroller;

.field private mMaximumVelocity:I

.field private mMinimumVelocity:I

.field private mParentHelper:Landroidx/core/view/o;

.field private mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

.field private mScrollRange:I

.field private mScroller:Landroid/widget/Scroller;

.field private mVelocityScroller:Landroid/widget/Scroller;

.field private mVelocityTracker:Landroid/view/VelocityTracker;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mEdgeList:Ljava/util/HashMap;

    const/4 p2, 0x0

    .line 5
    iput p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mFlingOrientation:I

    .line 6
    new-instance p3, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;

    invoke-direct {p3, p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$1;-><init>(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mChildLinkageEvent:Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    .line 7
    new-instance p3, Landroidx/core/view/o;

    invoke-direct {p3, p0}, Landroidx/core/view/o;-><init>(Landroid/view/ViewGroup;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mParentHelper:Landroidx/core/view/o;

    .line 8
    new-instance p3, Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScroller:Landroid/widget/Scroller;

    .line 9
    new-instance p3, Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mLocScroller:Landroid/widget/Scroller;

    .line 10
    new-instance p3, Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityScroller:Landroid/widget/Scroller;

    .line 11
    new-instance p3, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    invoke-direct {p3}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    .line 12
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mMaximumVelocity:I

    .line 14
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mMinimumVelocity:I

    .line 15
    iget-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->setTouchSlop(I)V

    .line 16
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V

    const/4 p1, 0x1

    .line 17
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setVerticalScrollBarEnabled(Z)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mFlingOrientation:I

    return p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->isFirstTarget(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getLinkageScrollHandler(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getTargetEdge(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityScroller:Landroid/widget/Scroller;

    return-object p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;F)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->parentFling(F)V

    return-void
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->isLastTarget(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->awakenScrollBars()Z

    move-result p0

    return p0
.end method

.method private checkTargetsScroll()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mEdgeList:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;

    .line 4
    iget v4, v3, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;->topEdge:I

    if-lt v0, v4, :cond_0

    iget v3, v3, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;->bottomEdge:I

    if-ge v0, v3, :cond_0

    .line 5
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    return-void

    .line 6
    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "#checkTargetsScroll# index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ELinkageScrollLayout"

    invoke-static {v2, v1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 9
    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollTargetContentToBottom(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 11
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 12
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollTargetContentToTop(Landroid/view/View;)V

    goto :goto_2

    :cond_4
    return-void
.end method

.method private dispatchTouchEventSupper(Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method private getLinkageScrollHandler(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;
    .locals 0

    check-cast p1, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;->provideScrollHandler()Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object p1

    return-object p1
.end method

.method private getNextEdge()I
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v0

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mFlingOrientation:I

    const/16 v2, 0x11

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_3

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_7

    .line 4
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 5
    invoke-direct {p0, v6}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getLinkageScrollHandler(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object v7

    .line 6
    iget-object v8, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mEdgeList:Ljava/util/HashMap;

    invoke-virtual {v8, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;

    if-eqz v8, :cond_0

    .line 7
    iget v8, v8, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;->topEdge:I

    goto :goto_1

    :cond_0
    const/4 v8, 0x0

    :goto_1
    if-le v8, v0, :cond_2

    .line 8
    invoke-direct {p0, v6}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->isTargetScrollable(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 9
    invoke-interface {v7, v3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->canScrollVertically(I)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    return v8

    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    const/16 v5, 0x12

    if-ne v1, v5, :cond_9

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    sub-int/2addr v1, v3

    :goto_3
    if-ltz v1, :cond_7

    .line 11
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 12
    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getLinkageScrollHandler(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object v5

    .line 13
    iget-object v6, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mEdgeList:Ljava/util/HashMap;

    invoke-virtual {v6, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;

    if-eqz v6, :cond_4

    .line 14
    iget v6, v6, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;->topEdge:I

    goto :goto_4

    :cond_4
    const/4 v6, 0x0

    :goto_4
    if-ge v6, v0, :cond_6

    .line 15
    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->isTargetScrollable(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    .line 16
    invoke-interface {v5, v3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->canScrollVertically(I)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_5

    :cond_5
    return v6

    :cond_6
    :goto_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_3

    .line 17
    :cond_7
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mFlingOrientation:I

    if-ne v0, v2, :cond_8

    iget v4, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScrollRange:I

    :cond_8
    return v4

    .line 18
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "#getNextEdge# unknown Fling Orientation"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getTargetByEdge(I)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 3
    iget-object v3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mEdgeList:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;

    if-eqz v3, :cond_0

    .line 4
    iget v3, v3, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;->topEdge:I

    if-ne v3, p1, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private getTargetEdge(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mEdgeList:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;

    return-object p1
.end method

.method private getTouchTarget(FF)Landroid/view/View;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 2
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [I

    .line 3
    invoke-virtual {v3, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v5, v4, v1

    const/4 v6, 0x1

    aget v4, v4, v6

    .line 4
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v6

    add-int/2addr v6, v5

    .line 5
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v7

    add-int/2addr v7, v4

    .line 6
    new-instance v8, Landroid/graphics/RectF;

    int-to-float v5, v5

    int-to-float v4, v4

    int-to-float v6, v6

    int-to-float v7, v7

    invoke-direct {v8, v5, v4, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 7
    invoke-virtual {v8, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private initOrResetVelocityTracker()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method private isFirstTarget(Landroid/view/View;)Z
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-ne p1, v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private isLastTarget(Landroid/view/View;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private isTargetScrollable(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getLinkageScrollHandler(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->isScrollable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v0

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private parentFling(F)V
    .locals 10

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mMinimumVelocity:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    const/16 v0, 0x11

    goto :goto_0

    :cond_0
    const/16 v0, 0x12

    .line 2
    :goto_0
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mFlingOrientation:I

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScroller:Landroid/widget/Scroller;

    const/4 v2, 0x0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v3

    const/4 v4, 0x1

    float-to-int v5, p1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, -0x80000000

    const v9, 0x7fffffff

    invoke-virtual/range {v1 .. v9}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_1
    return-void
.end method

.method private recycleVelocityTracker()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method private resetScroll()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mFlingOrientation:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mLocScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    return-void
.end method

.method private scrollTargetContentToBottom(Landroid/view/View;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;

    .line 2
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;->provideScrollHandler()Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object p1

    .line 3
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->isScrollable()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 4
    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->canScrollVertically(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->scrollContentToBottom()V

    :cond_0
    return-void
.end method

.method private scrollTargetContentToTop(Landroid/view/View;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;

    .line 2
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;->provideScrollHandler()Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object p1

    .line 3
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->isScrollable()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    .line 4
    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->canScrollVertically(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->scrollContentToTop()V

    :cond_0
    return-void
.end method

.method private scrollToIndex(I)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 3
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mEdgeList:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;

    if-eqz p1, :cond_0

    .line 5
    iget p1, p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;->topEdge:I

    invoke-virtual {p0, v0, p1, v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollTo(IIZ)V

    :cond_0
    return-void
.end method

.method private smoothScrollToIndex(I)V
    .locals 6

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 3
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mEdgeList:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;

    if-eqz p1, :cond_0

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mLocScroller:Landroid/widget/Scroller;

    const/4 v1, 0x0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v2

    const/4 v3, 0x0

    iget p1, p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;->topEdge:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v4

    sub-int v4, p1, v4

    const/16 v5, 0x118

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_0
    return-void
.end method

.method private trackVelocity(F)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityScroller:Landroid/widget/Scroller;

    float-to-int v4, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/high16 v7, -0x80000000

    const v8, 0x7fffffff

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method


# virtual methods
.method public computeScroll()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    const/4 v2, 0x1

    .line 3
    invoke-virtual {p0, v1, v0, v2}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollTo(IIZ)V

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mLocScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mLocScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    .line 7
    invoke-virtual {p0, v1, v0, v1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollTo(IIZ)V

    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mLocScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ELinkageScrollLayout"

    const-string v1, "#computeScroll#, LocScroll finished"

    .line 10
    invoke-static {v0, v1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->checkTargetsScroll()V

    :cond_1
    return-void
.end method

.method protected computeVerticalScrollExtent()I
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->computeVerticalScrollExtent()I

    move-result v0

    return v0
.end method

.method protected computeVerticalScrollOffset()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 2
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 3
    check-cast v3, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;

    .line 4
    invoke-interface {v3}, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;->provideScrollHandler()Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object v3

    invoke-interface {v3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->getVerticalScrollOffset()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v0

    add-int/2addr v2, v0

    return v2
.end method

.method protected computeVerticalScrollRange()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 2
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 3
    check-cast v3, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;

    .line 4
    invoke-interface {v3}, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;->provideScrollHandler()Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object v3

    invoke-interface {v3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->getVerticalScrollRange()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    const/4 v3, 0x3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 4
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    invoke-virtual {v2, v0, v1}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->onMove(FF)V

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->initVelocityTrackerIfNotExists()V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    invoke-virtual {v2, v0, v1}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->onRelease(FF)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    invoke-virtual {v2, v0, v1}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->onDown(FF)V

    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->resetScroll()V

    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->initOrResetVelocityTracker()V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 12
    :goto_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->dispatchTouchEventSupper(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public getNestedScrollAxes()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mParentHelper:Landroidx/core/view/o;

    invoke-virtual {v0}, Landroidx/core/view/o;->a()I

    move-result v0

    return v0
.end method

.method public gotoChild(I)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->smoothScrollToIndex(I)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 3
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollTargetContentToBottom(Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4
    :cond_0
    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 6
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollTargetContentToTop(Landroid/view/View;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method protected onFinishInflate()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onFinishInflate()V

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 3
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 4
    invoke-virtual {v3, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 5
    invoke-virtual {v3, v1}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 6
    instance-of v4, v3, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;

    if-eqz v4, :cond_0

    .line 7
    move-object v4, v3

    check-cast v4, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;

    iget-object v5, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mChildLinkageEvent:Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    invoke-interface {v4, v5}, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;->setChildLinkageEvent(Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;)V

    const/4 v4, 0x2

    .line 8
    invoke-virtual {v3, v4}, Landroid/view/View;->setOverScrollMode(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Child in LinkageScrollLayout must implement ILinkageScroll"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    const/4 p1, 0x3

    if-eq v0, p1, :cond_1

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    float-to-int p1, p1

    int-to-float p1, p1

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getTouchTarget(FF)Landroid/view/View;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mPosIndicator:Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->isDragging()Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    .line 4
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getLinkageScrollHandler(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object p1

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->isScrollable()Z

    move-result p1

    if-nez p1, :cond_3

    .line 5
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mIsIntercept:Z

    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 7
    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    .line 8
    :cond_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mIsIntercept:Z

    goto :goto_0

    .line 9
    :cond_2
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mIsIntercept:Z

    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->checkTargetsScroll()V

    .line 11
    :cond_3
    :goto_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mIsIntercept:Z

    return p1
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    const/4 p1, 0x0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScrollRange:I

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p5

    :goto_0
    if-ge p1, p5, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v1, p3

    .line 5
    invoke-virtual {v0, p2, p3, p4, v1}, Landroid/view/View;->layout(IIII)V

    .line 6
    iget p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScrollRange:I

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int/2addr p3, v2

    iput p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScrollRange:I

    .line 7
    iget-object p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mEdgeList:Ljava/util/HashMap;

    new-instance v2, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;-><init>(II)V

    invoke-virtual {p3, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    move p3, v1

    goto :goto_0

    .line 8
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScrollRange:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p2

    sub-int/2addr p1, p2

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScrollRange:I

    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 4
    invoke-virtual {p0, v2, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 1

    .line 1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "#onNestedPreFling# velocityY: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ELinkageScrollLayout"

    invoke-static {v0, p2}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result p2

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getTargetEdge(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;

    move-result-object p1

    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-lez v0, :cond_0

    const/16 v0, 0x11

    goto :goto_0

    :cond_0
    const/16 v0, 0x12

    .line 4
    :goto_0
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mFlingOrientation:I

    .line 5
    iget p1, p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;->topEdge:I

    if-ne p2, p1, :cond_1

    .line 6
    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->trackVelocity(F)V

    const/4 p1, 0x0

    return p1

    .line 7
    :cond_1
    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->parentFling(F)V

    const/4 p1, 0x1

    return p1
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 8

    .line 1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "#onNestedPreScroll# dy: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ELinkageScrollLayout"

    invoke-static {v0, p2}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v1, 0x1

    if-lez p3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    xor-int/lit8 v3, v2, 0x1

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v4

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getTargetEdge(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;

    move-result-object v5

    .line 4
    move-object v6, p1

    check-cast v6, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;

    .line 5
    invoke-interface {v6}, Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;->provideScrollHandler()Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object v6

    .line 6
    iget v7, v5, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;->topEdge:I

    if-ne v4, v7, :cond_4

    if-eqz v3, :cond_1

    const/4 v3, -0x1

    .line 7
    invoke-interface {v6, v3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->canScrollVertically(I)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    if-eqz v2, :cond_3

    .line 8
    invoke-interface {v6, v1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->canScrollVertically(I)Z

    move-result v2

    if-nez v2, :cond_3

    .line 9
    :cond_2
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 10
    aput p3, p4, v1

    goto :goto_3

    .line 11
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "#onNestedPreScroll#, handle scroll by "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    if-le v4, v7, :cond_7

    if-eqz v2, :cond_5

    .line 12
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 13
    aput p3, p4, v1

    :cond_5
    if-eqz v3, :cond_a

    add-int p1, v4, p3

    .line 14
    iget v0, v5, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;->topEdge:I

    if-le p1, v0, :cond_6

    goto :goto_1

    :cond_6
    sub-int p3, v0, v4

    .line 15
    :goto_1
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 16
    aput p3, p4, v1

    goto :goto_3

    :cond_7
    if-eqz v3, :cond_8

    .line 17
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 18
    aput p3, p4, v1

    :cond_8
    if-eqz v2, :cond_a

    add-int p1, v4, p3

    .line 19
    iget v0, v5, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$ViewEdge;->topEdge:I

    if-ge p1, v0, :cond_9

    goto :goto_2

    :cond_9
    sub-int p3, v0, v4

    .line 20
    :goto_2
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    .line 21
    aput p3, p4, v1

    :cond_a
    :goto_3
    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .locals 0

    if-eqz p3, :cond_0

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p5}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    :cond_0
    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "#onNestedScrollAccepted# axes: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ELinkageScrollLayout"

    invoke-static {v1, v0}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mParentHelper:Landroidx/core/view/o;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/core/view/o;->b(Landroid/view/View;Landroid/view/View;I)V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->resetScroll()V

    return-void
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "#onStartNestedScroll# nestedScrollAxes: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ELinkageScrollLayout"

    invoke-static {p2, p1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "#onStopNestedScroll# child: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ELinkageScrollLayout"

    invoke-static {v1, v0}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mParentHelper:Landroidx/core/view/o;

    invoke-virtual {v0, p1}, Landroidx/core/view/o;->d(Landroid/view/View;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    const/4 p1, 0x3

    if-eq v0, p1, :cond_2

    goto :goto_0

    .line 2
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mLastY:I

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mLastY:I

    return v1

    .line 4
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mLastY:I

    sub-int v0, p1, v0

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mLastY:I

    neg-int p1, v0

    .line 7
    invoke-virtual {p0, v2, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->scrollBy(II)V

    goto :goto_0

    .line 8
    :cond_2
    iput v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mLastY:I

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_4

    const/16 v0, 0x3e8

    .line 10
    iget v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mMaximumVelocity:I

    int-to-float v2, v2

    invoke-virtual {p1, v0, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result p1

    float-to-int p1, p1

    .line 12
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->recycleVelocityTracker()V

    neg-int v0, p1

    int-to-float v0, v0

    .line 13
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->parentFling(F)V

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "#dispatchTouchEvent# ACTION_UP, yVelocity: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ELinkageScrollLayout"

    invoke-static {v0, p1}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 15
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mLastY:I

    :cond_4
    :goto_0
    return v1
.end method

.method public scrollBy(II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->awakenScrollBars()Z

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v0

    if-gez p2, :cond_0

    add-int v1, v0, p2

    if-gez v1, :cond_1

    neg-int p2, v0

    goto :goto_0

    :cond_0
    add-int v1, v0, p2

    .line 3
    iget v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScrollRange:I

    if-le v1, v2, :cond_1

    sub-int p2, v2, v0

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 4
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->scrollBy(II)V

    :cond_2
    return-void
.end method

.method public scrollTo(IIZ)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->awakenScrollBars()Z

    const/4 v0, 0x0

    if-eqz p3, :cond_6

    .line 2
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 3
    iget p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScrollRange:I

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getNextEdge()I

    move-result p3

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mFlingOrientation:I

    const/16 v1, 0x11

    if-ne v0, v1, :cond_0

    .line 6
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 7
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mFlingOrientation:I

    const/16 v2, 0x12

    if-ne v0, v2, :cond_1

    .line 8
    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 9
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->scrollTo(II)V

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result p1

    if-ne p1, p3, :cond_7

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrVelocity()F

    move-result p1

    float-to-int p1, p1

    .line 12
    iget p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mFlingOrientation:I

    if-ne p2, v1, :cond_3

    if-lez p1, :cond_2

    goto :goto_0

    :cond_2
    neg-int p1, p1

    :cond_3
    :goto_0
    if-ne p2, v2, :cond_5

    if-gez p1, :cond_4

    goto :goto_1

    :cond_4
    neg-int p1, p1

    .line 13
    :cond_5
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "#scrollTo# To Edge: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", velocity: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ELinkageScrollLayout"

    invoke-static {v0, p2}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {p2}, Landroid/widget/Scroller;->abortAnimation()V

    .line 15
    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getTargetByEdge(I)Landroid/view/View;

    move-result-object p2

    .line 16
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->getLinkageScrollHandler(Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;

    move-result-object p3

    .line 17
    invoke-interface {p3, p2, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;->flingContent(Landroid/view/View;I)V

    int-to-float p1, p1

    .line 18
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->trackVelocity(F)V

    goto :goto_2

    .line 19
    :cond_6
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 20
    iget p3, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->mScrollRange:I

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 21
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->scrollTo(II)V

    :cond_7
    :goto_2
    return-void
.end method
