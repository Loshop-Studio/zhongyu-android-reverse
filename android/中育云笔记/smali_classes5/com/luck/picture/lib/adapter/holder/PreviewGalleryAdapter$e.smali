.class public Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public c:Landroid/widget/ImageView;

.field public d:Landroid/widget/ImageView;

.field public e:Landroid/widget/ImageView;

.field public f:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/luck/picture/lib/R$id;->ivImage:I

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
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;->c:Landroid/widget/ImageView;

    .line 13
    .line 14
    sget v0, Lcom/luck/picture/lib/R$id;->ivPlay:I

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/widget/ImageView;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;->d:Landroid/widget/ImageView;

    .line 23
    .line 24
    sget v0, Lcom/luck/picture/lib/R$id;->ivEditor:I

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/widget/ImageView;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;->e:Landroid/widget/ImageView;

    .line 33
    .line 34
    sget v0, Lcom/luck/picture/lib/R$id;->viewBorder:I

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;->f:Landroid/view/View;

    .line 41
    .line 42
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 43
    .line 44
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->o()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-static {v1}, La7/o;->c(I)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;->e:Landroid/widget/ImageView;

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->o()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->r()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-static {v1}, La7/o;->c(I)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;->f:Landroid/view/View;

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->r()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->s()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-static {v0}, La7/o;->b(I)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 97
    .line 98
    invoke-direct {v1, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 102
    .line 103
    .line 104
    :cond_2
    return-void
.end method
