.class public Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/util/List;

.field public b:Lq6/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;)Lq6/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;->b:Lq6/a;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b(Ljava/util/List;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;->a:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public d(Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;I)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->i()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->g()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, p1, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;->e:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->l()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    const/4 v6, 0x0

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    move v5, v6

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v5, 0x4

    .line 33
    :goto_0
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iget-object v5, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 45
    .line 46
    .line 47
    move-result-wide v7

    .line 48
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 49
    .line 50
    .line 51
    move-result-wide v9

    .line 52
    cmp-long v4, v7, v9

    .line 53
    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    const/4 v6, 0x1

    .line 57
    :cond_1
    invoke-virtual {v5, v6}, Landroid/view/View;->setSelected(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->h()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v4}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_2

    .line 69
    .line 70
    iget-object v3, p1, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;->c:Landroid/widget/ImageView;

    .line 71
    .line 72
    sget v4, Lcom/luck/picture/lib/R$drawable;->ps_audio_placeholder:I

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    sget-object v4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 79
    .line 80
    if-eqz v4, :cond_3

    .line 81
    .line 82
    iget-object v5, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 83
    .line 84
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    iget-object v6, p1, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;->c:Landroid/widget/ImageView;

    .line 89
    .line 90
    invoke-interface {v4, v5, v3, v6}, Ln6/a;->d(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_1
    iget-object v3, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 94
    .line 95
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    iget-object v4, p1, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;->d:Landroid/widget/TextView;

    .line 100
    .line 101
    sget v5, Lcom/luck/picture/lib/R$string;->ps_camera_roll_num:I

    .line 102
    .line 103
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v3, v5, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 119
    .line 120
    new-instance v1, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$a;

    .line 121
    .line 122
    invoke-direct {v1, p0, p2, v0}, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$a;-><init>(Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;ILcom/luck/picture/lib/entity/LocalMediaFolder;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public e(Landroid/view/ViewGroup;I)Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x6

    .line 6
    invoke-static {p2, v0}, Ll6/b;->a(Landroid/content/Context;I)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget p2, Lcom/luck/picture/lib/R$layout;->ps_album_folder_item:I

    .line 22
    .line 23
    :goto_0
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, p2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance p2, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;

    .line 29
    .line 30
    invoke-direct {p2, p1}, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;-><init>(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    return-object p2
.end method

.method public f(Lq6/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;->b:Lq6/a;

    .line 2
    .line 3
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;->a:Ljava/util/List;

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

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;->d(Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;->e(Landroid/view/ViewGroup;I)Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
