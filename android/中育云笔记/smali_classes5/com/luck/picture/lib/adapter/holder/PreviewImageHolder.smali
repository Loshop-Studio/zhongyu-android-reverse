.class public Lcom/luck/picture/lib/adapter/holder/PreviewImageHolder;
.super Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(Lcom/luck/picture/lib/entity/LocalMedia;II)V
    .locals 7

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->g()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    const/4 p1, -0x1

    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    if-ne p3, p1, :cond_0

    .line 13
    .line 14
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 15
    .line 16
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget-object p3, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 23
    .line 24
    invoke-interface {p1, p2, v4, p3}, Ln6/a;->b(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    sget-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 29
    .line 30
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v3, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 37
    .line 38
    move v5, p2

    .line 39
    move v6, p3

    .line 40
    invoke-interface/range {v1 .. v6}, Ln6/a;->f(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 2
    .line 3
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/PreviewImageHolder$a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewImageHolder$a;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewImageHolder;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/photoview/PhotoView;->setOnViewTapListener(Lx6/j;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public g(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 2
    .line 3
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/PreviewImageHolder$b;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewImageHolder$b;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewImageHolder;Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/photoview/PhotoView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
