.class public Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$IndicatorAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "IndicatorAdapter"
.end annotation


# instance fields
.field public a:I


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->c(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 2

    .line 1
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 2
    .line 3
    check-cast p1, Landroid/widget/ImageView;

    .line 4
    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$IndicatorAdapter;->a:I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-ne v0, p2, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->a(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->b(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    return-void
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
