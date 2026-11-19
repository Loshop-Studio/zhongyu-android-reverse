.class public Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$o;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$x$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$OnPageChangeListener;,
        Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;
    }
.end annotation


# static fields
.field public static final DETERMINE_BY_MAX_AND_MIN:I = -0x1

.field public static final HORIZONTAL:I = 0x0

.field public static final VERTICAL:I = 0x1


# instance fields
.field private angle:F

.field private itemSpace:I

.field protected mDecoratedMeasurement:I

.field protected mDecoratedMeasurementInOther:I

.field private mEnableBringCenterToFront:Z

.field private mInfinite:Z

.field private mIntegerDy:Z

.field protected mInterval:F

.field private mLeftItems:I

.field private mMaxVisibleItemCount:I

.field protected mOffset:F

.field mOrientation:I

.field protected mOrientationHelper:Landroidx/recyclerview/widget/j;

.field private mPendingSavedState:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

.field private mPendingScrollPosition:I

.field private mRecycleChildrenOnDetach:Z

.field private mReverseLayout:Z

.field private mRightItems:I

.field private mSmoothScrollbarEnabled:Z

.field protected mSpaceInOther:I

.field protected mSpaceMain:I

.field private minScale:F

.field onPageChangeListener:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$OnPageChangeListener;


# direct methods
.method public constructor <init>(FII)V
    .locals 1

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, p3, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;-><init>(IZ)V

    .line 19
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->minScale:F

    .line 20
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->itemSpace:I

    .line 21
    iput p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 4

    .line 2
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$o;-><init>()V

    const/high16 v0, 0x3f400000    # 0.75f

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->minScale:F

    const/high16 v0, 0x41000000    # 8.0f

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->angle:F

    const/16 v0, 0x181

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->itemSpace:I

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInfinite:Z

    const/4 v1, 0x0

    .line 7
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSmoothScrollbarEnabled:Z

    const/4 v2, -0x1

    .line 9
    iput v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mPendingScrollPosition:I

    const/4 v3, 0x0

    .line 10
    iput-object v3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mPendingSavedState:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 11
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mIntegerDy:Z

    .line 12
    iput v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mMaxVisibleItemCount:I

    .line 13
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->setOrientation(I)V

    .line 14
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->setReverseLayout(Z)V

    .line 15
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->setAutoMeasureEnabled(Z)V

    .line 16
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->setEnableBringCenterToFront(Z)V

    .line 17
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->setIntegerDy(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, p1, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;-><init>(IZ)V

    return-void
.end method

.method private calRotation(F)F
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->angle:F

    neg-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    div-float/2addr v0, v1

    mul-float v0, v0, p1

    return v0
.end method

.method private calculateScale(F)F
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientationHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->n()I

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mDecoratedMeasurement:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->minScale:F

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v0, v2

    mul-float v0, v0, p1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientationHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/j;->n()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v1

    div-float/2addr v0, p1

    add-float/2addr v0, v2

    return v0
.end method

.method private computeScrollExtent()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSmoothScrollbarEnabled:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    .line 3
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    float-to-int v0, v0

    return v0
.end method

.method private computeScrollOffset()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSmoothScrollbarEnabled:Z

    if-nez v0, :cond_2

    .line 3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    if-nez v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getCurrentPosition()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getCurrentPosition()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    return v0

    .line 5
    :cond_2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getOffsetOfRightAdapterPosition()F

    move-result v0

    .line 6
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    if-nez v1, :cond_3

    float-to-int v0, v0

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    mul-float v1, v1, v2

    add-float/2addr v1, v0

    float-to-int v0, v1

    :goto_1
    return v0
.end method

.method private computeScrollRange()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSmoothScrollbarEnabled:Z

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v0

    return v0

    .line 4
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private getCurrentPositionOffset()I
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method private getMaxOffset()F
    .locals 2

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    mul-float v0, v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private getMinOffset()F
    .locals 2

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    neg-int v0, v0

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    mul-float v0, v0, v1

    :goto_0
    return v0
.end method

.method private getOffsetOfRightAdapterPosition()F
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInfinite:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v2

    int-to-float v2, v2

    mul-float v1, v1, v2

    rem-float/2addr v0, v1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    neg-float v2, v1

    mul-float v0, v0, v2

    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v3

    int-to-float v3, v3

    mul-float v1, v1, v3

    rem-float/2addr v2, v1

    add-float/2addr v0, v2

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    :goto_0
    return v0

    .line 5
    :cond_2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInfinite:Z

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    cmpl-float v1, v0, v1

    if-ltz v1, :cond_3

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v2

    int-to-float v2, v2

    mul-float v1, v1, v2

    rem-float/2addr v0, v1

    goto :goto_1

    .line 7
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    mul-float v0, v0, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v3

    int-to-float v3, v3

    mul-float v1, v1, v3

    rem-float/2addr v2, v1

    add-float/2addr v0, v2

    goto :goto_1

    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    :goto_1
    return v0
.end method

.method private getProperty(I)F
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    int-to-float p1, p1

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    neg-float v0, v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    :goto_0
    mul-float p1, p1, v0

    return p1
.end method

.method private layoutItems(Landroidx/recyclerview/widget/RecyclerView$u;)V
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/RecyclerView$u;)V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getCurrentPositionOffset()I

    move-result v0

    neg-int v0, v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getCurrentPositionOffset()I

    move-result v0

    .line 4
    :goto_0
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mLeftItems:I

    sub-int v1, v0, v1

    .line 5
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mRightItems:I

    add-int/2addr v2, v0

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->useMaxVisibleCount()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mMaxVisibleItemCount:I

    rem-int/lit8 v2, v1, 0x2

    const/4 v3, 0x1

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    .line 8
    div-int/lit8 v1, v1, 0x2

    sub-int v2, v0, v1

    add-int/2addr v2, v3

    goto :goto_2

    :cond_2
    sub-int/2addr v1, v3

    .line 9
    div-int/lit8 v1, v1, 0x2

    sub-int v2, v0, v1

    :goto_2
    add-int/2addr v0, v1

    add-int/2addr v0, v3

    move v1, v2

    move v2, v0

    .line 10
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v0

    .line 11
    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInfinite:Z

    if-nez v3, :cond_6

    if-gez v1, :cond_5

    .line 12
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->useMaxVisibleCount()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 13
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mMaxVisibleItemCount:I

    :cond_4
    const/4 v1, 0x0

    :cond_5
    if-le v2, v0, :cond_6

    move v2, v0

    :cond_6
    const/4 v3, 0x1

    :goto_3
    if-ge v1, v2, :cond_e

    .line 14
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->useMaxVisibleCount()Z

    move-result v5

    if-nez v5, :cond_7

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getProperty(I)F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    sub-float/2addr v5, v6

    invoke-direct {p0, v5}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->removeCondition(F)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_7
    if-lt v1, v0, :cond_8

    .line 15
    rem-int v5, v1, v0

    goto :goto_4

    :cond_8
    if-gez v1, :cond_a

    neg-int v5, v1

    .line 16
    rem-int/2addr v5, v0

    if-nez v5, :cond_9

    move v5, v0

    :cond_9
    sub-int v5, v0, v5

    goto :goto_4

    :cond_a
    move v5, v1

    .line 17
    :goto_4
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView$u;->o(I)Landroid/view/View;

    move-result-object v6

    .line 18
    invoke-virtual {p0, v6, v4, v4}, Landroidx/recyclerview/widget/RecyclerView$o;->measureChildWithMargins(Landroid/view/View;II)V

    .line 19
    invoke-direct {p0, v6}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->resetViewProperty(Landroid/view/View;)V

    .line 20
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getProperty(I)F

    move-result v7

    iget v8, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    sub-float/2addr v7, v8

    .line 21
    invoke-direct {p0, v6, v7}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->layoutScrap(Landroid/view/View;F)V

    .line 22
    iget-boolean v8, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mEnableBringCenterToFront:Z

    if-eqz v8, :cond_b

    .line 23
    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->setViewElevation(Landroid/view/View;F)F

    move-result v5

    goto :goto_5

    :cond_b
    int-to-float v5, v5

    :goto_5
    cmpl-float v3, v5, v3

    if-lez v3, :cond_c

    .line 24
    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/RecyclerView$o;->addView(Landroid/view/View;)V

    goto :goto_6

    .line 25
    :cond_c
    invoke-virtual {p0, v6, v4}, Landroidx/recyclerview/widget/RecyclerView$o;->addView(Landroid/view/View;I)V

    :goto_6
    move v3, v5

    :cond_d
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_e
    return-void
.end method

.method private layoutScrap(Landroid/view/View;F)V
    .locals 9

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->calItemLeft(Landroid/view/View;F)I

    move-result v0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->calItemTop(Landroid/view/View;F)I

    move-result v1

    .line 3
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 4
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSpaceInOther:I

    add-int v5, v2, v0

    iget v3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSpaceMain:I

    add-int v6, v3, v1

    add-int/2addr v2, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mDecoratedMeasurementInOther:I

    add-int v7, v2, v0

    add-int/2addr v3, v1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mDecoratedMeasurement:I

    add-int v8, v3, v0

    move-object v3, p0

    move-object v4, p1

    invoke-virtual/range {v3 .. v8}, Landroidx/recyclerview/widget/RecyclerView$o;->layoutDecorated(Landroid/view/View;IIII)V

    goto :goto_0

    .line 5
    :cond_0
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSpaceMain:I

    add-int v5, v2, v0

    iget v3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSpaceInOther:I

    add-int v6, v3, v1

    add-int/2addr v2, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mDecoratedMeasurement:I

    add-int v7, v2, v0

    add-int/2addr v3, v1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mDecoratedMeasurementInOther:I

    add-int v8, v3, v0

    move-object v3, p0

    move-object v4, p1

    invoke-virtual/range {v3 .. v8}, Landroidx/recyclerview/widget/RecyclerView$o;->layoutDecorated(Landroid/view/View;IIII)V

    .line 6
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->setItemViewProperty(Landroid/view/View;F)V

    return-void
.end method

.method private removeCondition(F)Z
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->maxRemoveOffset()F

    move-result v0

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->minRemoveOffset()F

    move-result v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private resetViewProperty(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/View;->setRotation(F)V

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setRotationY(F)V

    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->setRotationX(F)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleX(F)V

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method private resolveShouldLayoutReverse()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    :cond_0
    return-void
.end method

.method private scrollBy(ILandroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getChildCount()I

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_6

    if-nez p1, :cond_0

    goto/16 :goto_3

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->ensureLayoutState()V

    int-to-float p3, p1

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getDistanceRatio()F

    move-result v1

    div-float v1, p3, v1

    .line 4
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const v3, 0x322bcc77    # 1.0E-8f

    cmpg-float v2, v2, v3

    if-gez v2, :cond_1

    return v0

    .line 5
    :cond_1
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    add-float/2addr v2, v1

    .line 6
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInfinite:Z

    if-nez v1, :cond_2

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getMinOffset()F

    move-result v1

    cmpg-float v1, v2, v1

    if-gez v1, :cond_2

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getMinOffset()F

    move-result p1

    sub-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getDistanceRatio()F

    move-result p1

    mul-float v2, v2, p1

    sub-float/2addr p3, v2

    float-to-int p1, p3

    goto :goto_0

    .line 8
    :cond_2
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInfinite:Z

    if-nez p3, :cond_3

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getMaxOffset()F

    move-result p3

    cmpl-float p3, v2, p3

    if-lez p3, :cond_3

    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getMaxOffset()F

    move-result p1

    iget p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    sub-float/2addr p1, p3

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getDistanceRatio()F

    move-result p3

    mul-float p1, p1, p3

    float-to-int p1, p1

    .line 10
    :cond_3
    :goto_0
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mIntegerDy:Z

    if-eqz p3, :cond_4

    int-to-float p3, p1

    .line 11
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getDistanceRatio()F

    move-result v1

    div-float/2addr p3, v1

    float-to-int p3, p3

    int-to-float p3, p3

    goto :goto_1

    :cond_4
    int-to-float p3, p1

    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getDistanceRatio()F

    move-result v1

    div-float/2addr p3, v1

    .line 13
    :goto_1
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    add-float/2addr v1, p3

    iput v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    .line 14
    :goto_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 15
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 16
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->propertyChangeWhenScroll(Landroid/view/View;)F

    move-result v2

    sub-float/2addr v2, p3

    .line 17
    invoke-direct {p0, v1, v2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->layoutScrap(Landroid/view/View;F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 18
    :cond_5
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->layoutItems(Landroidx/recyclerview/widget/RecyclerView$u;)V

    return p1

    :cond_6
    :goto_3
    return v0
.end method

.method private useMaxVisibleCount()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mMaxVisibleItemCount:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method protected calItemLeft(Landroid/view/View;F)I
    .locals 1

    iget p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    float-to-int p1, p2

    :goto_0
    return p1
.end method

.method protected calItemTop(Landroid/view/View;F)I
    .locals 1

    iget p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    float-to-int p1, p2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public canScrollHorizontally()Z
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public canScrollVertically()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public computeHorizontalScrollExtent(Landroidx/recyclerview/widget/RecyclerView$y;)I
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->computeScrollExtent()I

    move-result p1

    return p1
.end method

.method public computeHorizontalScrollOffset(Landroidx/recyclerview/widget/RecyclerView$y;)I
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->computeScrollOffset()I

    move-result p1

    return p1
.end method

.method public computeHorizontalScrollRange(Landroidx/recyclerview/widget/RecyclerView$y;)I
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->computeScrollRange()I

    move-result p1

    return p1
.end method

.method public computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->getPosition(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x1

    if-ge p1, v1, :cond_1

    const/4 v0, 0x1

    .line 3
    :cond_1
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    xor-int/2addr p1, v2

    if-ne v0, p1, :cond_2

    const/high16 p1, -0x40800000    # -1.0f

    goto :goto_0

    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 4
    :goto_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getDistanceRatio()F

    move-result v0

    div-float/2addr p1, v0

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    const/4 v1, 0x0

    if-nez v0, :cond_3

    .line 6
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, p1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0

    .line 7
    :cond_3
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public computeVerticalScrollExtent(Landroidx/recyclerview/widget/RecyclerView$y;)I
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->computeScrollExtent()I

    move-result p1

    return p1
.end method

.method public computeVerticalScrollOffset(Landroidx/recyclerview/widget/RecyclerView$y;)I
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->computeScrollOffset()I

    move-result p1

    return p1
.end method

.method public computeVerticalScrollRange(Landroidx/recyclerview/widget/RecyclerView$y;)I
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->computeScrollRange()I

    move-result p1

    return p1
.end method

.method ensureLayoutState()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientationHelper:Landroidx/recyclerview/widget/j;

    if-nez v0, :cond_0

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    invoke-static {p0, v0}, Landroidx/recyclerview/widget/j;->b(Landroidx/recyclerview/widget/RecyclerView$o;I)Landroidx/recyclerview/widget/j;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientationHelper:Landroidx/recyclerview/widget/j;

    :cond_0
    return-void
.end method

.method public generateDefaultLayoutParams()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .locals 2

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public getAngle()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->angle:F

    return v0
.end method

.method public getCurrentPosition()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getCurrentPositionOffset()I

    move-result v0

    .line 2
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInfinite:Z

    if-nez v1, :cond_0

    .line 3
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    return v0

    .line 4
    :cond_0
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    if-nez v1, :cond_2

    if-ltz v0, :cond_1

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v1

    rem-int/2addr v0, v1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v2

    rem-int/2addr v0, v2

    add-int/2addr v0, v1

    goto :goto_0

    :cond_2
    if-lez v0, :cond_3

    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v2

    rem-int/2addr v0, v2

    sub-int v0, v1, v0

    goto :goto_0

    :cond_3
    neg-int v0, v0

    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemCount()I

    move-result v1

    rem-int/2addr v0, v1

    :goto_0
    return v0
.end method

.method protected getDistanceRatio()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public getEnableBringCenterToFront()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mEnableBringCenterToFront:Z

    return v0
.end method

.method public getInfinite()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInfinite:Z

    return v0
.end method

.method public getItemSpace()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->itemSpace:I

    return v0
.end method

.method public getMaxVisibleItemCount()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mMaxVisibleItemCount:I

    return v0
.end method

.method public getMinScale()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->minScale:F

    return v0
.end method

.method public getOffsetToCenter()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInfinite:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getCurrentPositionOffset()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    mul-float v0, v0, v1

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    sub-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getDistanceRatio()F

    move-result v1

    :goto_0
    mul-float v0, v0, v1

    float-to-int v0, v0

    return v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getCurrentPosition()I

    move-result v0

    int-to-float v0, v0

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    if-nez v1, :cond_1

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    goto :goto_1

    :cond_1
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    neg-float v1, v1

    :goto_1
    mul-float v0, v0, v1

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    sub-float/2addr v0, v1

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getDistanceRatio()F

    move-result v1

    goto :goto_0
.end method

.method public getOrientation()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    return v0
.end method

.method public getRecycleChildrenOnDetach()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mRecycleChildrenOnDetach:Z

    return v0
.end method

.method public getReverseLayout()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    return v0
.end method

.method public getSmoothScrollbarEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSmoothScrollbarEnabled:Z

    return v0
.end method

.method public getTotalSpaceInOther()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getPaddingBottom()I

    move-result v1

    :goto_0
    sub-int/2addr v0, v1

    return v0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->getPaddingRight()I

    move-result v1

    goto :goto_0
.end method

.method public isIntegerDy()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mIntegerDy:Z

    return v0
.end method

.method protected maxRemoveOffset()F
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientationHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->n()I

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSpaceMain:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    return v0
.end method

.method protected minRemoveOffset()F
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mDecoratedMeasurement:I

    neg-int v0, v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientationHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/j;->m()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSpaceMain:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    return v0
.end method

.method public onAdapterChanged(Landroidx/recyclerview/widget/RecyclerView$g;Landroidx/recyclerview/widget/RecyclerView$g;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->removeAllViews()V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    return-void
.end method

.method public onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$u;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$u;)V

    .line 2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mRecycleChildrenOnDetach:Z

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->removeAndRecycleAllViews(Landroidx/recyclerview/widget/RecyclerView$u;)V

    .line 4
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$u;->c()V

    :cond_0
    return-void
.end method

.method public onLayoutChildren(Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$y;->b()I

    move-result p2

    if-nez p2, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->removeAndRecycleAllViews(Landroidx/recyclerview/widget/RecyclerView$u;)V

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->ensureLayoutState()V

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->resolveShouldLayoutReverse()V

    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$u;->o(I)Landroid/view/View;

    move-result-object v0

    .line 7
    invoke-virtual {p0, v0, p2, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->measureChildWithMargins(Landroid/view/View;II)V

    .line 8
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientationHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/j;->e(Landroid/view/View;)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mDecoratedMeasurement:I

    .line 9
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientationHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/j;->f(Landroid/view/View;)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mDecoratedMeasurementInOther:I

    .line 10
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientationHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/j;->n()I

    move-result p2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mDecoratedMeasurement:I

    sub-int/2addr p2, v0

    div-int/lit8 p2, p2, 0x2

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSpaceMain:I

    .line 11
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getTotalSpaceInOther()I

    move-result p2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mDecoratedMeasurementInOther:I

    sub-int/2addr p2, v0

    div-int/lit8 p2, p2, 0x2

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSpaceInOther:I

    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->setInterval()F

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    .line 13
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->setUp()V

    .line 14
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->minRemoveOffset()F

    move-result p2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    div-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    float-to-int p2, p2

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mLeftItems:I

    .line 15
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->maxRemoveOffset()F

    move-result p2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    div-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    float-to-int p2, p2

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mRightItems:I

    .line 16
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mPendingSavedState:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    if-eqz p2, :cond_1

    .line 17
    iget-boolean v0, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->isReverseLayout:Z

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    .line 18
    iget v0, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->position:I

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mPendingScrollPosition:I

    .line 19
    iget p2, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->offset:F

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    .line 20
    :cond_1
    iget p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mPendingScrollPosition:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_3

    .line 21
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    int-to-float p2, p2

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    neg-float v0, v0

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    :goto_0
    mul-float p2, p2, v0

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    .line 22
    :cond_3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/RecyclerView$u;)V

    .line 23
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->layoutItems(Landroidx/recyclerview/widget/RecyclerView$u;)V

    return-void
.end method

.method public onLayoutCompleted(Landroidx/recyclerview/widget/RecyclerView$y;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->onLayoutCompleted(Landroidx/recyclerview/widget/RecyclerView$y;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mPendingSavedState:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    const/4 p1, -0x1

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mPendingScrollPosition:I

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    check-cast p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mPendingSavedState:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->requestLayout()V

    :cond_0
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mPendingSavedState:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mPendingSavedState:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;)V

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;-><init>()V

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mPendingScrollPosition:I

    iput v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->position:I

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    iput v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->offset:F

    .line 6
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->isReverseLayout:Z

    return-object v0
.end method

.method protected propertyChangeWhenScroll(Landroid/view/View;)F
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSpaceMain:I

    :goto_0
    sub-int/2addr p1, v0

    int-to-float p1, p1

    return p1

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSpaceMain:I

    goto :goto_0
.end method

.method public scrollHorizontallyBy(ILandroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;)I

    move-result p1

    return p1
.end method

.method public scrollToPosition(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mPendingScrollPosition:I

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    int-to-float p1, p1

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    neg-float v0, v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInterval:F

    :goto_0
    mul-float p1, p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOffset:F

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->requestLayout()V

    return-void
.end method

.method public scrollVerticallyBy(ILandroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;)I

    move-result p1

    return p1
.end method

.method public setAngle(F)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->angle:F

    return-void
.end method

.method public setEnableBringCenterToFront(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mEnableBringCenterToFront:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 3
    :cond_0
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mEnableBringCenterToFront:Z

    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->requestLayout()V

    return-void
.end method

.method public setInfinite(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInfinite:Z

    if-ne p1, v0, :cond_0

    return-void

    .line 3
    :cond_0
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mInfinite:Z

    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->requestLayout()V

    return-void
.end method

.method public setIntegerDy(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mIntegerDy:Z

    return-void
.end method

.method protected setInterval()F
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mDecoratedMeasurement:I

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->itemSpace:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    return v0
.end method

.method public setItemSpace(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->itemSpace:I

    return-void
.end method

.method protected setItemViewProperty(Landroid/view/View;F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSpaceMain:I

    int-to-float v0, v0

    add-float/2addr v0, p2

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->calculateScale(F)F

    move-result v0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleX(F)V

    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setElevation(F)V

    .line 5
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->calRotation(F)F

    move-result p2

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getOrientation()I

    move-result v0

    if-nez v0, :cond_0

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->setRotationY(F)V

    goto :goto_0

    :cond_0
    neg-float p2, p2

    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->setRotationX(F)V

    :goto_0
    return-void
.end method

.method public setMaxVisibleItemCount(I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mMaxVisibleItemCount:I

    if-ne v0, p1, :cond_0

    return-void

    .line 3
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mMaxVisibleItemCount:I

    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->removeAllViews()V

    return-void
.end method

.method public setMinScale(F)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->minScale:F

    return-void
.end method

.method public setOnPageChangeListener(Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$OnPageChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->onPageChangeListener:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$OnPageChangeListener;

    return-void
.end method

.method public setOrientation(I)V
    .locals 3

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid orientation:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    if-ne p1, v1, :cond_2

    return-void

    .line 4
    :cond_2
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientation:I

    .line 5
    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mOrientationHelper:Landroidx/recyclerview/widget/j;

    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->removeAllViews()V

    return-void
.end method

.method public setRecycleChildrenOnDetach(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mRecycleChildrenOnDetach:Z

    return-void
.end method

.method public setReverseLayout(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    if-ne p1, v0, :cond_0

    return-void

    .line 3
    :cond_0
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mReverseLayout:Z

    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->removeAllViews()V

    return-void
.end method

.method public setSmoothScrollbarEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->mSmoothScrollbarEnabled:Z

    return-void
.end method

.method protected setUp()V
    .locals 0

    return-void
.end method

.method protected setViewElevation(Landroid/view/View;F)F
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getScaleX()F

    move-result p1

    const/high16 p2, 0x40a00000    # 5.0f

    mul-float p1, p1, p2

    return p1
.end method

.method public smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$y;I)V
    .locals 0

    .line 1
    new-instance p2, Landroidx/recyclerview/widget/g;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/g;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView$x;->setTargetPosition(I)V

    .line 3
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->startSmoothScroll(Landroidx/recyclerview/widget/RecyclerView$x;)V

    return-void
.end method
