.class public Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# instance fields
.field public a:I


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 1
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 2
    .line 3
    check-cast p1, Landroid/widget/ImageView;

    .line 4
    .line 5
    iget p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/RecyclerViewBannerBase$IndicatorAdapter;->a:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    throw v0
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    new-instance p1, Landroid/widget/ImageView;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    throw p1
.end method
