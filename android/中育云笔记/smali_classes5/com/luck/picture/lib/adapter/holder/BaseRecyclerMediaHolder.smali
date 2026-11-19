.class public Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# instance fields
.field public c:Landroid/widget/ImageView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/view/View;

.field public f:Landroid/content/Context;

.field public g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

.field public h:Z

.field public i:Z

.field public j:Landroid/graphics/ColorFilter;

.field public k:Landroid/graphics/ColorFilter;

.field public l:Landroid/graphics/ColorFilter;

.field public m:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lcom/luck/picture/lib/config/PictureSelectionConfig;)V
    .locals 6

    .line 2
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->f:Landroid/content/Context;

    .line 5
    sget v1, Lcom/luck/picture/lib/R$color;->ps_color_20:I

    invoke-static {v0, v1}, La7/o;->g(Landroid/content/Context;I)Landroid/graphics/ColorFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->j:Landroid/graphics/ColorFilter;

    .line 6
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->f:Landroid/content/Context;

    sget v1, Lcom/luck/picture/lib/R$color;->ps_color_80:I

    invoke-static {v0, v1}, La7/o;->g(Landroid/content/Context;I)Landroid/graphics/ColorFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->k:Landroid/graphics/ColorFilter;

    .line 7
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->f:Landroid/content/Context;

    sget v1, Lcom/luck/picture/lib/R$color;->ps_color_half_white:I

    invoke-static {v0, v1}, La7/o;->g(Landroid/content/Context;I)Landroid/graphics/ColorFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->l:Landroid/graphics/ColorFilter;

    .line 8
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->Z()Z

    move-result v1

    iput-boolean v1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->h:Z

    .line 10
    sget v1, Lcom/luck/picture/lib/R$id;->ivPicture:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->c:Landroid/widget/ImageView;

    .line 11
    sget v1, Lcom/luck/picture/lib/R$id;->tvCheck:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    .line 12
    sget v1, Lcom/luck/picture/lib/R$id;->btnCheck:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->e:Landroid/view/View;

    .line 13
    iget p1, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    iget-boolean p1, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e:Z

    if-eqz p1, :cond_0

    .line 14
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 15
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->e:Landroid/view/View;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->e:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    :goto_0
    iget-boolean p1, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e:Z

    if-nez p1, :cond_1

    iget p1, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    if-eq p1, v2, :cond_2

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v1

    :cond_2
    :goto_1
    iput-boolean v2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->i:Z

    .line 19
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->w()I

    move-result p1

    .line 20
    invoke-static {p1}, La7/o;->b(I)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 21
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    int-to-float p1, p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 22
    :cond_3
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->v()I

    move-result p1

    .line 23
    invoke-static {p1}, La7/o;->c(I)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 24
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 25
    :cond_4
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->J()I

    move-result p1

    .line 26
    invoke-static {p1}, La7/o;->c(I)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 27
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 28
    :cond_5
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->u()[I

    move-result-object p1

    .line 29
    invoke-static {p1}, La7/o;->a([I)Z

    move-result p2

    if-eqz p2, :cond_8

    .line 30
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    instance-of p2, p2, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v2, 0x15

    if-eqz p2, :cond_6

    .line 31
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p2, v2}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 32
    array-length p2, p1

    move v3, v1

    :goto_2
    if-ge v3, p2, :cond_6

    aget v4, p1, v3

    .line 33
    iget-object v5, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v5, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 34
    :cond_6
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->e:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    instance-of p2, p2, Landroid/widget/RelativeLayout$LayoutParams;

    if-eqz p2, :cond_7

    .line 35
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->e:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p2, v2}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 36
    array-length p2, p1

    :goto_3
    if-ge v1, p2, :cond_7

    aget v2, p1, v1

    .line 37
    iget-object v3, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->e:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v3, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 38
    :cond_7
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->t()I

    move-result p1

    .line 39
    invoke-static {p1}, La7/o;->b(I)Z

    move-result p2

    if-eqz p2, :cond_8

    .line 40
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->e:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    .line 41
    iput p1, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 42
    iput p1, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_8
    return-void
.end method

.method public static synthetic a(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->m:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;Lcom/luck/picture/lib/entity/LocalMedia;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g(Lcom/luck/picture/lib/entity/LocalMedia;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->j(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static f(Landroid/view/ViewGroup;IILcom/luck/picture/lib/config/PictureSelectionConfig;)Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;
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
    const/4 p2, 0x1

    .line 15
    if-eq p1, p2, :cond_2

    .line 16
    .line 17
    const/4 p2, 0x3

    .line 18
    if-eq p1, p2, :cond_1

    .line 19
    .line 20
    const/4 p2, 0x4

    .line 21
    if-eq p1, p2, :cond_0

    .line 22
    .line 23
    new-instance p1, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;

    .line 24
    .line 25
    invoke-direct {p1, p0, p3}, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;-><init>(Landroid/view/View;Lcom/luck/picture/lib/config/PictureSelectionConfig;)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    new-instance p1, Lcom/luck/picture/lib/adapter/holder/AudioViewHolder;

    .line 30
    .line 31
    invoke-direct {p1, p0, p3}, Lcom/luck/picture/lib/adapter/holder/AudioViewHolder;-><init>(Landroid/view/View;Lcom/luck/picture/lib/config/PictureSelectionConfig;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    new-instance p1, Lcom/luck/picture/lib/adapter/holder/VideoViewHolder;

    .line 36
    .line 37
    invoke-direct {p1, p0, p3}, Lcom/luck/picture/lib/adapter/holder/VideoViewHolder;-><init>(Landroid/view/View;Lcom/luck/picture/lib/config/PictureSelectionConfig;)V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_2
    new-instance p1, Lcom/luck/picture/lib/adapter/holder/CameraViewHolder;

    .line 42
    .line 43
    invoke-direct {p1, p0}, Lcom/luck/picture/lib/adapter/holder/CameraViewHolder;-><init>(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    return-object p1
.end method


# virtual methods
.method public d(Lcom/luck/picture/lib/entity/LocalMedia;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAbsoluteAdapterPosition()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p1, Lcom/luck/picture/lib/entity/LocalMedia;->o:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g(Lcom/luck/picture/lib/entity/LocalMedia;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->j(Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->h:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->i(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-boolean v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->i:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 26
    .line 27
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l0:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->e(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->H()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_2
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->h(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    .line 52
    .line 53
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$a;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$a;-><init>(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->e:Landroid/view/View;

    .line 62
    .line 63
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;

    .line 64
    .line 65
    invoke-direct {v1, p0, p1, p2}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;-><init>(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;Lcom/luck/picture/lib/entity/LocalMedia;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 72
    .line 73
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$c;

    .line 74
    .line 75
    invoke-direct {v1, p0, p2}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$c;-><init>(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 82
    .line 83
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;

    .line 84
    .line 85
    invoke-direct {v1, p0, p1, p2}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;-><init>(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;Lcom/luck/picture/lib/entity/LocalMedia;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final e(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 4

    .line 1
    invoke-static {}, Lu6/a;->l()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_7

    .line 6
    .line 7
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_7

    .line 16
    .line 17
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 18
    .line 19
    iget-boolean v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Q:Z

    .line 20
    .line 21
    const v2, 0x7fffffff

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 28
    .line 29
    if-ne v0, v3, :cond_0

    .line 30
    .line 31
    invoke-static {}, Lu6/a;->l()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-ne v0, v2, :cond_7

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_0
    invoke-static {}, Lu6/a;->l()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 43
    .line 44
    iget v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 45
    .line 46
    if-ne v0, v1, :cond_7

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    invoke-static {}, Lu6/a;->o()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 60
    .line 61
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 62
    .line 63
    if-ne v1, v3, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 67
    .line 68
    if-lez v1, :cond_3

    .line 69
    .line 70
    move v2, v1

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 73
    .line 74
    move v2, v0

    .line 75
    :goto_0
    invoke-static {}, Lu6/a;->l()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eq v0, v2, :cond_6

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Ll6/c;->h(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_7

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 93
    .line 94
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 95
    .line 96
    if-ne v1, v3, :cond_5

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    iget v2, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 100
    .line 101
    :goto_1
    invoke-static {}, Lu6/a;->l()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eq v0, v2, :cond_6

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_7

    .line 116
    .line 117
    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->c:Landroid/widget/ImageView;

    .line 118
    .line 119
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->l:Landroid/graphics/ColorFilter;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->h0(Z)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_7
    const/4 v0, 0x0

    .line 129
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->h0(Z)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final g(Lcom/luck/picture/lib/entity/LocalMedia;)Z
    .locals 3

    .line 1
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->i()Lcom/luck/picture/lib/entity/LocalMedia;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->H()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->Z(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    xor-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    invoke-virtual {p1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->Y(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->H()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p1, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->c0(Z)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->c:Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->c:Landroid/widget/ImageView;

    .line 12
    .line 13
    invoke-interface {v0, v1, p1, v2}, Ln6/a;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final i(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-static {}, Lu6/a;->l()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge v0, v1, :cond_2

    .line 14
    .line 15
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->s()J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->s()J

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    cmp-long v2, v2, v4

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    :cond_0
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->u()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {p1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->j0(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->y()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->o0(I)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->u()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v2}, La7/q;->g(Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    return-void
.end method

.method public final j(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 15
    .line 16
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->c:Landroid/widget/ImageView;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->j:Landroid/graphics/ColorFilter;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->c:Landroid/widget/ImageView;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->k:Landroid/graphics/ColorFilter;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->j:Landroid/graphics/ColorFilter;

    .line 36
    .line 37
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public k(Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->m:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;

    .line 2
    .line 3
    return-void
.end method
