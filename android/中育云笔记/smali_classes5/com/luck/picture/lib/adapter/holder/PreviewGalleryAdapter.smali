.class public Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$d;,
        Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$c;,
        Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Z

.field public c:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$c;

.field public d:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$d;


# direct methods
.method public constructor <init>(ZLjava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->b:Z

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    move p2, p1

    .line 15
    :goto_0
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ge p2, v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMedia;->e0(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMedia;->Q(Z)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 p2, p2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;)Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->c:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;)Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->d:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$d;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public c(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->Q(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-boolean v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->b:Z

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->e(Lcom/luck/picture/lib/entity/LocalMedia;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->e0(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->Q(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    invoke-virtual {p1, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->Q(Z)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    sub-int/2addr p1, v1

    .line 73
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Lcom/luck/picture/lib/entity/LocalMedia;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_2

    .line 9
    .line 10
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->s()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->s()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    cmp-long v1, v1, v3

    .line 41
    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    :goto_1
    return v0

    .line 49
    :cond_2
    const/4 p1, -0x1

    .line 50
    return p1
.end method

.method public f()I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->E()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, -0x1

    .line 29
    return v0
.end method

.method public g(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v2, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v2, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->Q(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->e(Lcom/luck/picture/lib/entity/LocalMedia;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eq p1, v1, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->Q(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public getData()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public h(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 8
    .line 9
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->I()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    sget v1, Lcom/luck/picture/lib/R$color;->ps_color_half_white:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget v1, Lcom/luck/picture/lib/R$color;->ps_color_transparent:I

    .line 25
    .line 26
    :goto_0
    invoke-static {v0, v1}, La7/o;->g(Landroid/content/Context;I)Landroid/graphics/ColorFilter;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->E()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/16 v2, 0x8

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->I()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    iget-object v1, p1, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;->f:Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_1
    iget-object v1, p1, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;->f:Landroid/view/View;

    .line 52
    .line 53
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->E()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    move v4, v3

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move v4, v2

    .line 62
    :goto_1
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    :goto_2
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->H()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_3

    .line 74
    .line 75
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_3

    .line 84
    .line 85
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v4, p1, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;->e:Landroid/widget/ImageView;

    .line 90
    .line 91
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 92
    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_3
    iget-object v4, p1, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;->e:Landroid/widget/ImageView;

    .line 96
    .line 97
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 98
    .line 99
    .line 100
    :goto_3
    iget-object v4, p1, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;->c:Landroid/widget/ImageView;

    .line 101
    .line 102
    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 103
    .line 104
    .line 105
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 106
    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    iget-object v4, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 110
    .line 111
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    iget-object v5, p1, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;->c:Landroid/widget/ImageView;

    .line 116
    .line 117
    invoke-interface {v0, v4, v1, v5}, Ln6/a;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    iget-object v0, p1, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;->d:Landroid/widget/ImageView;

    .line 121
    .line 122
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-static {v1}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    move v2, v3

    .line 133
    :cond_5
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 134
    .line 135
    .line 136
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 137
    .line 138
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$a;

    .line 139
    .line 140
    invoke-direct {v1, p0, p1, p2}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$a;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    .line 145
    .line 146
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 147
    .line 148
    new-instance v0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$b;

    .line 149
    .line 150
    invoke-direct {v0, p0, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$b;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public i(Landroid/view/ViewGroup;I)Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/16 v0, 0x9

    .line 6
    .line 7
    invoke-static {p2, v0}, Ll6/b;->a(Landroid/content/Context;I)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget p2, Lcom/luck/picture/lib/R$layout;->ps_preview_gallery_item:I

    .line 23
    .line 24
    :goto_0
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, p2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance p2, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;

    .line 30
    .line 31
    invoke-direct {p2, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;-><init>(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    return-object p2
.end method

.method public j(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->e(Lcom/luck/picture/lib/entity/LocalMedia;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->b:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->e0(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRemoved(I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public k(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->c:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$c;

    .line 2
    .line 3
    return-void
.end method

.method public l(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->d:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$d;

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->h(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->i(Landroid/view/ViewGroup;I)Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
