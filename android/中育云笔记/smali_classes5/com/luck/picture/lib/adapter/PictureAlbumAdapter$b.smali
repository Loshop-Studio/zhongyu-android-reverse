.class public Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public c:Landroid/widget/ImageView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/luck/picture/lib/R$id;->first_image:I

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/widget/ImageView;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;->c:Landroid/widget/ImageView;

    .line 13
    .line 14
    sget v0, Lcom/luck/picture/lib/R$id;->tv_folder_name:I

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/widget/TextView;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;->d:Landroid/widget/TextView;

    .line 23
    .line 24
    sget v0, Lcom/luck/picture/lib/R$id;->tv_select_tag:I

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/widget/TextView;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;->e:Landroid/widget/TextView;

    .line 33
    .line 34
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 35
    .line 36
    invoke-virtual {v0}, Lz6/a;->a()Lcom/luck/picture/lib/style/AlbumWindowStyle;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/AlbumWindowStyle;->a()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/AlbumWindowStyle;->b()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;->e:Landroid/widget/TextView;

    .line 56
    .line 57
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/AlbumWindowStyle;->c()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;->d:Landroid/widget/TextView;

    .line 67
    .line 68
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/AlbumWindowStyle;->g()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-lez p1, :cond_3

    .line 76
    .line 77
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;->d:Landroid/widget/TextView;

    .line 78
    .line 79
    int-to-float p1, p1

    .line 80
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 81
    .line 82
    .line 83
    :cond_3
    return-void
.end method
