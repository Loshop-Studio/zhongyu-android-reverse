.class public Lcom/luck/picture/lib/adapter/holder/AudioViewHolder;
.super Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;
.source "SourceFile"


# instance fields
.field public final n:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/luck/picture/lib/config/PictureSelectionConfig;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;-><init>(Landroid/view/View;Lcom/luck/picture/lib/config/PictureSelectionConfig;)V

    .line 2
    .line 3
    .line 4
    sget p2, Lcom/luck/picture/lib/R$id;->tv_duration:I

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/AudioViewHolder;->n:Landroid/widget/TextView;

    .line 13
    .line 14
    sget-object p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 15
    .line 16
    invoke-virtual {p2}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2}, Lcom/luck/picture/lib/style/SelectMainStyle;->j()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v0}, La7/o;->c(I)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1, v0, v2, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p2}, Lcom/luck/picture/lib/style/SelectMainStyle;->m()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0}, La7/o;->b(I)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    int-to-float v0, v0

    .line 45
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p2}, Lcom/luck/picture/lib/style/SelectMainStyle;->l()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {v0}, La7/o;->c(I)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-virtual {p2}, Lcom/luck/picture/lib/style/SelectMainStyle;->i()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-static {v0}, La7/o;->c(I)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-virtual {p2}, Lcom/luck/picture/lib/style/SelectMainStyle;->k()[I

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-static {p2}, La7/o;->a([I)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    instance-of v0, v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 89
    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 97
    .line 98
    const/16 v0, 0xc

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 101
    .line 102
    .line 103
    array-length p1, p2

    .line 104
    :goto_0
    if-ge v2, p1, :cond_4

    .line 105
    .line 106
    aget v0, p2, v2

    .line 107
    .line 108
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/AudioViewHolder;->n:Landroid/widget/TextView;

    .line 109
    .line 110
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 117
    .line 118
    .line 119
    add-int/lit8 v2, v2, 0x1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_4
    return-void
.end method


# virtual methods
.method public d(Lcom/luck/picture/lib/entity/LocalMedia;I)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d(Lcom/luck/picture/lib/entity/LocalMedia;I)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/AudioViewHolder;->n:Landroid/widget/TextView;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->p()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, La7/d;->b(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->c:Landroid/widget/ImageView;

    .line 2
    .line 3
    sget v0, Lcom/luck/picture/lib/R$drawable;->ps_audio_placeholder:I

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
