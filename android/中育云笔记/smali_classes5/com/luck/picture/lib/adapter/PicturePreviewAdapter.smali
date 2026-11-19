.class public Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/util/List;

.field public b:Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;

.field public final c:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->c:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->c:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/lang/Integer;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->c:Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 30
    .line 31
    instance-of v2, v1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    check-cast v1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->v()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    instance-of v2, v1, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    check-cast v1, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->E()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-void
.end method

.method public b(I)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->c:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 12
    .line 13
    return-object p1
.end method

.method public c(I)Lcom/luck/picture/lib/entity/LocalMedia;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-le p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 18
    .line 19
    return-object p1
.end method

.method public d(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->b(I)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->q()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public e(Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->b:Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->k(Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->c(I)Lcom/luck/picture/lib/entity/LocalMedia;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->c:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0, p2}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->a(Lcom/luck/picture/lib/entity/LocalMedia;I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public f(Landroid/view/ViewGroup;I)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ne p2, v0, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    invoke-static {v0, v1}, Ll6/b;->a(Landroid/content/Context;I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v0, Lcom/luck/picture/lib/R$layout;->ps_preview_video:I

    .line 18
    .line 19
    :goto_0
    invoke-static {p1, p2, v0}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->c(Landroid/view/ViewGroup;II)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_1
    const/4 v0, 0x3

    .line 25
    if-ne p2, v0, :cond_3

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/16 v1, 0xa

    .line 32
    .line 33
    invoke-static {v0, v1}, Ll6/b;->a(Landroid/content/Context;I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    sget v0, Lcom/luck/picture/lib/R$layout;->ps_preview_audio:I

    .line 41
    .line 42
    :goto_1
    invoke-static {p1, p2, v0}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->c(Landroid/view/ViewGroup;II)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v1, 0x7

    .line 52
    invoke-static {v0, v1}, Ll6/b;->a(Landroid/content/Context;I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    sget v0, Lcom/luck/picture/lib/R$layout;->ps_preview_image:I

    .line 60
    .line 61
    :goto_2
    invoke-static {p1, p2, v0}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->c(Landroid/view/ViewGroup;II)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1
.end method

.method public g(Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    return p1

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->a:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    const/4 p1, 0x3

    .line 40
    return p1

    .line 41
    :cond_1
    const/4 p1, 0x1

    .line 42
    return p1
.end method

.method public h(Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->i()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public i(I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->b(I)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->c(I)Lcom/luck/picture/lib/entity/LocalMedia;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->D()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->r()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    iget-object p1, v0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 24
    .line 25
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/photoview/PhotoView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p1, v0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 32
    .line 33
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/photoview/PhotoView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public j(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public k(Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->b:Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;

    .line 2
    .line 3
    return-void
.end method

.method public l(I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->b(I)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->q()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->j:Landroid/widget/ImageView;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public m(I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->b(I)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->w()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->e(Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->f(Landroid/view/ViewGroup;I)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->g(Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->h(Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
