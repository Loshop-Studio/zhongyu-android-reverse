.class Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->access$200(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroidx/viewpager/widget/ViewPager$i;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->access$200(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroidx/viewpager/widget/ViewPager$i;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$i;->onPageScrollStateChanged(I)V

    :cond_0
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->access$200(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroidx/viewpager/widget/ViewPager$i;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->access$200(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroidx/viewpager/widget/ViewPager$i;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Landroidx/viewpager/widget/ViewPager$i;->onPageScrolled(IFI)V

    :cond_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    rem-int v1, p1, v1

    iput v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mCurrentPosition:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    iget v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mCurrentPosition:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->setCurrentIndicator(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->access$300(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    iget v2, v2, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mCurrentPosition:I

    invoke-virtual {v0, v1, v2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->onTitleSelect(Landroid/widget/TextView;I)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->access$500(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroid/widget/LinearLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    iget v2, v1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mCurrentPosition:I

    iget-object v1, v1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mDatas:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v2, v1, :cond_0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->access$400(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Z

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    iget v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mCurrentPosition:I

    iput v1, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mLastPosition:I

    .line 6
    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->access$200(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroidx/viewpager/widget/ViewPager$i;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$2;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->access$200(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Landroidx/viewpager/widget/ViewPager$i;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$i;->onPageSelected(I)V

    :cond_1
    return-void
.end method
