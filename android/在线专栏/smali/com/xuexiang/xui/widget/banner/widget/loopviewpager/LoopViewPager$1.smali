.class Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private mPreviousOffset:F

.field private mPreviousPosition:F

.field final synthetic this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p1, -0x40800000    # -1.0f

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->mPreviousOffset:F

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->mPreviousPosition:F

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$000(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$201(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)I

    move-result v0

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$000(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->toRealPosition(I)I

    move-result v2

    if-nez p1, :cond_1

    if-eqz v0, :cond_0

    .line 4
    iget-object v3, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$000(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    move-result-object v3

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->getCount()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ne v0, v3, :cond_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-virtual {v0, v2, v1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->setCurrentItem(IZ)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$100(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$100(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$100(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager$i;

    if-eqz v0, :cond_2

    .line 9
    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$i;->onPageScrollStateChanged(I)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$000(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$000(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->toRealPosition(I)I

    move-result v0

    cmpl-float v3, p2, v1

    if-nez v3, :cond_1

    .line 3
    iget v3, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->mPreviousOffset:F

    cmpl-float v3, v3, v1

    if-nez v3, :cond_1

    if-eqz p1, :cond_0

    iget-object v3, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$000(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    move-result-object v3

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->getCount()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ne p1, v3, :cond_1

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-virtual {p1, v0, v2}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->setCurrentItem(IZ)V

    :cond_1
    move p1, v0

    .line 5
    :cond_2
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->mPreviousOffset:F

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$000(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$000(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->getRealCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    const/4 v0, -0x1

    .line 7
    :goto_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$100(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_7

    const/4 v3, 0x0

    .line 8
    :goto_1
    iget-object v4, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$100(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_7

    .line 9
    iget-object v4, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$100(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/viewpager/widget/ViewPager$i;

    if-eqz v4, :cond_6

    if-eq p1, v0, :cond_4

    .line 10
    invoke-interface {v4, p1, p2, p3}, Landroidx/viewpager/widget/ViewPager$i;->onPageScrolled(IFI)V

    goto :goto_2

    :cond_4
    float-to-double v5, p2

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    cmpl-double v9, v5, v7

    if-lez v9, :cond_5

    .line 11
    invoke-interface {v4, v2, v1, v2}, Landroidx/viewpager/widget/ViewPager$i;->onPageScrolled(IFI)V

    goto :goto_2

    .line 12
    :cond_5
    invoke-interface {v4, p1, v1, v2}, Landroidx/viewpager/widget/ViewPager$i;->onPageScrolled(IFI)V

    :cond_6
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$000(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopPagerAdapterWrapper;->toRealPosition(I)I

    move-result p1

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->mPreviousPosition:F

    int-to-float v1, p1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    .line 3
    iput v1, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->mPreviousPosition:F

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$100(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$100(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;->access$100(Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/LoopViewPager;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/viewpager/widget/ViewPager$i;

    if-eqz v1, :cond_0

    .line 7
    invoke-interface {v1, p1}, Landroidx/viewpager/widget/ViewPager$i;->onPageSelected(I)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
