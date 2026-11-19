.class public Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer$OnStickyPositionChangedListener;
    }
.end annotation


# instance fields
.field private mLastOffset:I

.field private mLastStickyHeadPosition:I

.field private mOffset:I

.field private mOnStickyPositionChangedListener:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer$OnStickyPositionChangedListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p1, -0x80000000

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mLastOffset:I

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mLastStickyHeadPosition:I

    return-void
.end method


# virtual methods
.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    return p1
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 2
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method protected getChildHeight()I
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    :cond_0
    return v0
.end method

.method public getLastStickyHeadPosition()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mLastStickyHeadPosition:I

    return v0
.end method

.method public onInVisible()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->reset()V

    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p3

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p4

    .line 5
    iget p5, p2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p3, p5

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p5

    add-int/2addr p5, p3

    .line 7
    iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p4, p2

    iget p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mOffset:I

    add-int/2addr p4, p2

    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    add-int/2addr p2, p4

    .line 9
    invoke-virtual {p1, p3, p4, p5, p2}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, v0

    move v3, p1

    move v5, p2

    .line 3
    invoke-virtual/range {v1 .. v6}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v2, v3

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v2, v3

    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, v3

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v3

    add-int/2addr v1, v3

    add-int/2addr v2, v1

    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    add-int/2addr v1, v3

    add-int/2addr v0, v1

    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 11
    invoke-static {v1, p1}, Landroid/view/ViewGroup;->resolveSize(II)I

    move-result p1

    invoke-static {v0, p2}, Landroid/view/ViewGroup;->resolveSize(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void

    .line 12
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "you must set only one child view\uff01"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onNotEnoughHighScroll()V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->onInVisible()V

    return-void
.end method

.method protected onPositionChanged(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mOnStickyPositionChangedListener:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer$OnStickyPositionChangedListener;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mLastStickyHeadPosition:I

    if-eq v1, p1, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer$OnStickyPositionChangedListener;->onPositionChanged(I)V

    .line 3
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mLastStickyHeadPosition:I

    return-void
.end method

.method public onScrolling(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->scrollChild(I)V

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public recycle()V
    .locals 1

    const/high16 v0, -0x80000000

    .line 1
    iput v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mLastStickyHeadPosition:I

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mOnStickyPositionChangedListener:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer$OnStickyPositionChangedListener;

    return-void
.end method

.method public reset()V
    .locals 1

    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mLastStickyHeadPosition:I

    return-void
.end method

.method public scrollChild(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mLastOffset:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mOffset:I

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mOffset:I

    iget v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mLastOffset:I

    sub-int/2addr v0, v1

    invoke-static {p1, v0}, Landroidx/core/view/u;->b0(Landroid/view/View;I)V

    .line 5
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mOffset:I

    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mLastOffset:I

    return-void
.end method

.method public setOnStickyPositionChangedListener(Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer$OnStickyPositionChangedListener;)Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->mOnStickyPositionChangedListener:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer$OnStickyPositionChangedListener;

    return-object p0
.end method
