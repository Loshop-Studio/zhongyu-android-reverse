.class final Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Container"
.end annotation


# instance fields
.field private mTabAdapter:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    invoke-direct {p0, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 3
    new-instance p2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    invoke-direct {p2, p1, p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/view/ViewGroup;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->mTabAdapter:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    return-void
.end method


# virtual methods
.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$300(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2700(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2800(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2700(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2700(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2700(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2900(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2700(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2700(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2700(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2900(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 8
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$3000(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$3000(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2700(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$3000(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_1

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2700(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$3100(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public getTabAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->mTabAdapter:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 10

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->mTabAdapter:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getViews()Ljava/util/List;

    move-result-object p1

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    const/4 p4, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    .line 3
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 4
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_9

    if-nez v1, :cond_2

    goto/16 :goto_4

    .line 5
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p2, :cond_8

    .line 6
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 7
    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    .line 8
    :cond_3
    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getMeasuredWidth()I

    move-result v3

    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v4

    add-int v5, v0, v3

    sub-int v6, p5, p3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v7

    sub-int/2addr v6, v7

    invoke-virtual {v2, v0, v4, v5, v6}, Landroid/widget/RelativeLayout;->layout(IIII)V

    .line 10
    iget-object v4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->mTabAdapter:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    invoke-virtual {v4, v1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    .line 11
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getContentLeft()I

    move-result v6

    .line 12
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->getContentWidth()I

    move-result v7

    .line 13
    iget-object v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v8}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$1800(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_4

    iget-object v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v8}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2600(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 14
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    move-result-object v2

    .line 15
    invoke-virtual {v2}, Landroid/widget/TextView;->getLeft()I

    move-result v3

    add-int/2addr v0, v3

    .line 16
    invoke-virtual {v2}, Landroid/widget/TextView;->getWidth()I

    move-result v3

    :cond_4
    if-ne v6, v0, :cond_5

    if-eq v7, v3, :cond_6

    .line 17
    :cond_5
    invoke-virtual {v4, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->setContentLeft(I)V

    .line 18
    invoke-virtual {v4, v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->setContentWidth(I)V

    .line 19
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$1800(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2500(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result v0

    goto :goto_2

    :cond_7
    const/4 v0, 0x0

    :goto_2
    add-int/2addr v5, v0

    move v0, v5

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 20
    :cond_8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$1100(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_9

    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$000(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/animation/Animator;

    move-result-object p1

    if-nez p1, :cond_9

    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 21
    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$100(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result p1

    if-nez p1, :cond_9

    .line 22
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->mTabAdapter:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$1100(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    invoke-static {p1, p2, p4}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$1300(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V

    :cond_9
    :goto_4
    return-void
.end method

.method protected onMeasure(II)V
    .locals 9

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 2
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->mTabAdapter:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getViews()Ljava/util/List;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 5
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    .line 6
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-nez v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_8

    if-nez v4, :cond_2

    goto :goto_5

    .line 7
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    sub-int v3, p2, v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v3, v5

    .line 8
    iget-object v5, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v5}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$1800(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result v5

    const/high16 v6, 0x40000000    # 2.0f

    const/4 v7, 0x1

    if-ne v5, v7, :cond_4

    .line 9
    div-int v4, p1, v4

    :goto_1
    if-ge v2, v1, :cond_7

    .line 10
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    .line 11
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    .line 12
    :cond_3
    invoke-static {v4, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    .line 13
    invoke-static {v3, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 14
    invoke-virtual {v5, v7, v8}, Landroid/view/View;->measure(II)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    :goto_3
    if-ge v2, v1, :cond_6

    .line 15
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    .line 16
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_4

    :cond_5
    const/high16 v7, -0x80000000

    .line 17
    invoke-static {p1, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    .line 18
    invoke-static {v3, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 19
    invoke-virtual {v5, v7, v8}, Landroid/view/View;->measure(II)V

    .line 20
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    iget-object v7, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v7}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2500(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result v7

    add-int/2addr v5, v7

    add-int/2addr v4, v5

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 21
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Container;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2500(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result p1

    sub-int p1, v4, p1

    .line 22
    :cond_7
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void

    .line 23
    :cond_8
    :goto_5
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method
