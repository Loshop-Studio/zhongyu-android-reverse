.class public abstract Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;
    }
.end annotation


# instance fields
.field public final c:I

.field public final d:I

.field public final e:I

.field public f:Lcom/luck/picture/lib/entity/LocalMedia;

.field public final g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

.field public h:Lcom/luck/picture/lib/photoview/PhotoView;

.field public i:Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, La7/e;->e(Landroid/content/Context;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->c:I

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, La7/e;->g(Landroid/content/Context;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->d:I

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, La7/e;->d(Landroid/content/Context;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iput v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->e:I

    .line 39
    .line 40
    sget v0, Lcom/luck/picture/lib/R$id;->preview_image:I

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/luck/picture/lib/photoview/PhotoView;

    .line 47
    .line 48
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->b(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static c(Landroid/view/ViewGroup;II)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, p2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 p2, 0x2

    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    new-instance p1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;-><init>(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    const/4 p2, 0x3

    .line 24
    if-ne p1, p2, :cond_1

    .line 25
    .line 26
    new-instance p1, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 27
    .line 28
    invoke-direct {p1, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;-><init>(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    new-instance p1, Lcom/luck/picture/lib/adapter/holder/PreviewImageHolder;

    .line 33
    .line 34
    invoke-direct {p1, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewImageHolder;-><init>(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    return-object p1
.end method


# virtual methods
.method public a(Lcom/luck/picture/lib/entity/LocalMedia;I)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->f:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->d(Lcom/luck/picture/lib/entity/LocalMedia;)[I

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x0

    .line 8
    aget v1, p2, v0

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    aget p2, p2, v2

    .line 12
    .line 13
    invoke-static {v1, p2}, La7/c;->b(II)[I

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    aget v0, p2, v0

    .line 18
    .line 19
    aget p2, p2, v2

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0, p2}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->e(Lcom/luck/picture/lib/entity/LocalMedia;II)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->l(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->j(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->f()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->g(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public abstract b(Landroid/view/View;)V
.end method

.method public d(Lcom/luck/picture/lib/entity/LocalMedia;)[I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->l()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->k()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->l()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->k()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    filled-new-array {v0, p1}, [I

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->D()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->r()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    filled-new-array {v0, p1}, [I

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
.end method

.method public abstract e(Lcom/luck/picture/lib/entity/LocalMedia;II)V
.end method

.method public abstract f()V
.end method

.method public abstract g(Lcom/luck/picture/lib/entity/LocalMedia;)V
.end method

.method public h()V
    .locals 0

    .line 1
    return-void
.end method

.method public i()V
    .locals 0

    .line 1
    return-void
.end method

.method public j(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->D()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->r()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {v0, p1}, La7/h;->m(II)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 16
    .line 17
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/photoview/PhotoView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

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
.end method

.method public k(Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->i:Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;

    .line 2
    .line 3
    return-void
.end method

.method public l(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->c:I

    .line 8
    .line 9
    iget v1, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->d:I

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->D()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->r()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-lez p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 32
    .line 33
    iget v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->c:I

    .line 34
    .line 35
    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 36
    .line 37
    iget v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->e:I

    .line 38
    .line 39
    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 40
    .line 41
    const/16 v0, 0x11

    .line 42
    .line 43
    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 44
    .line 45
    :cond_0
    return-void
.end method
