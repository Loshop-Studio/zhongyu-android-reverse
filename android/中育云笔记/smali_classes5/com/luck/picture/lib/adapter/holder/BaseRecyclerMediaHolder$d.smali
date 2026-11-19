.class public Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d(Lcom/luck/picture/lib/entity/LocalMedia;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/luck/picture/lib/entity/LocalMedia;

.field public final synthetic d:I

.field public final synthetic e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;Lcom/luck/picture/lib/entity/LocalMedia;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->c:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 4
    .line 5
    iput p3, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->d:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->c:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->J()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_5

    .line 8
    .line 9
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->a(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->c:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Ll6/c;->h(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 31
    .line 32
    iget-object p1, p1, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 33
    .line 34
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->I:Z

    .line 35
    .line 36
    if-nez p1, :cond_4

    .line 37
    .line 38
    :cond_1
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 39
    .line 40
    iget-object p1, p1, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 41
    .line 42
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e:Z

    .line 43
    .line 44
    if-nez p1, :cond_4

    .line 45
    .line 46
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->c:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    const/4 v0, 0x1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 60
    .line 61
    iget-object p1, p1, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 62
    .line 63
    iget-boolean v1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J:Z

    .line 64
    .line 65
    if-nez v1, :cond_4

    .line 66
    .line 67
    iget p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 68
    .line 69
    if-eq p1, v0, :cond_4

    .line 70
    .line 71
    :cond_2
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->c:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p1}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 84
    .line 85
    iget-object p1, p1, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 86
    .line 87
    iget-boolean v1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->K:Z

    .line 88
    .line 89
    if-nez v1, :cond_4

    .line 90
    .line 91
    iget p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 92
    .line 93
    if-ne p1, v0, :cond_3

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 97
    .line 98
    iget-object p1, p1, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->e:Landroid/view/View;

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 105
    .line 106
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->a(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 111
    .line 112
    iget-object v0, v0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    .line 113
    .line 114
    iget v1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->d:I

    .line 115
    .line 116
    iget-object v2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$d;->c:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 117
    .line 118
    invoke-interface {p1, v0, v1, v2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;->c(Landroid/view/View;ILcom/luck/picture/lib/entity/LocalMedia;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    :goto_1
    return-void
.end method
