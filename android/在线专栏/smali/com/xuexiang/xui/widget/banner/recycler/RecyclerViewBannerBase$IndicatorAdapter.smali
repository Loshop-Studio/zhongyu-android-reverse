.class public Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "IndicatorAdapter"
.end annotation


# instance fields
.field currentPosition:I

.field final synthetic this$0:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;


# direct methods
.method protected constructor <init>(Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;->currentPosition:I

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;

    iget v0, v0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mBannerSize:I

    return v0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$b0;I)V
    .locals 1

    .line 1
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$b0;->itemView:Landroid/view/View;

    check-cast p1, Landroid/widget/ImageView;

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;->currentPosition:I

    if-ne v0, p2, :cond_0

    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;

    iget-object p2, p2, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mSelectedDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;

    iget-object p2, p2, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mUnselectedDrawable:Landroid/graphics/drawable/Drawable;

    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$b0;
    .locals 1

    .line 1
    new-instance p1, Landroid/widget/ImageView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;

    invoke-virtual {p2}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p2, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    const/4 v0, -0x2

    invoke-direct {p2, v0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;

    iget v0, v0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase;->mIndicatorMargin:I

    invoke-virtual {p2, v0, v0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 4
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    new-instance p2, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter$1;

    invoke-direct {p2, p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter$1;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public setPosition(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;->currentPosition:I

    return-void
.end method
