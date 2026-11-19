.class public Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;
.super Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;
.source "SourceFile"


# instance fields
.field public final n:Landroid/widget/ImageView;

.field public final o:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/luck/picture/lib/config/PictureSelectionConfig;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;-><init>(Landroid/view/View;Lcom/luck/picture/lib/config/PictureSelectionConfig;)V

    .line 2
    .line 3
    .line 4
    sget p2, Lcom/luck/picture/lib/R$id;->tv_media_tag:I

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->o:Landroid/widget/TextView;

    .line 13
    .line 14
    sget p2, Lcom/luck/picture/lib/R$id;->ivEditor:I

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Landroid/widget/ImageView;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->n:Landroid/widget/ImageView;

    .line 23
    .line 24
    sget-object p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 25
    .line 26
    invoke-virtual {p2}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p2}, Lcom/luck/picture/lib/style/SelectMainStyle;->o()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, La7/o;->c(I)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p2}, Lcom/luck/picture/lib/style/SelectMainStyle;->n()[I

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, La7/o;->a([I)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/4 v2, 0x0

    .line 52
    const/16 v3, 0xc

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    instance-of v1, v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 61
    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 69
    .line 70
    invoke-virtual {p1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 71
    .line 72
    .line 73
    array-length p1, v0

    .line 74
    move v1, v2

    .line 75
    :goto_0
    if-ge v1, p1, :cond_1

    .line 76
    .line 77
    aget v4, v0, v1

    .line 78
    .line 79
    iget-object v5, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->n:Landroid/widget/ImageView;

    .line 80
    .line 81
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 86
    .line 87
    invoke-virtual {v5, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    invoke-virtual {p2}, Lcom/luck/picture/lib/style/SelectMainStyle;->y()[I

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, La7/o;->a([I)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->o:Landroid/widget/TextView;

    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    instance-of v0, v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 110
    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->o:Landroid/widget/TextView;

    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 120
    .line 121
    const/16 v1, 0x15

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->o:Landroid/widget/TextView;

    .line 127
    .line 128
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 133
    .line 134
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 135
    .line 136
    .line 137
    array-length v0, p1

    .line 138
    :goto_1
    if-ge v2, v0, :cond_2

    .line 139
    .line 140
    aget v1, p1, v2

    .line 141
    .line 142
    iget-object v3, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->o:Landroid/widget/TextView;

    .line 143
    .line 144
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 149
    .line 150
    invoke-virtual {v3, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 151
    .line 152
    .line 153
    add-int/lit8 v2, v2, 0x1

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_2
    invoke-virtual {p2}, Lcom/luck/picture/lib/style/SelectMainStyle;->x()I

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    invoke-static {p1}, La7/o;->c(I)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_3

    .line 165
    .line 166
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->o:Landroid/widget/TextView;

    .line 167
    .line 168
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 169
    .line 170
    .line 171
    :cond_3
    invoke-virtual {p2}, Lcom/luck/picture/lib/style/SelectMainStyle;->A()I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    invoke-static {p1}, La7/o;->b(I)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_4

    .line 180
    .line 181
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->o:Landroid/widget/TextView;

    .line 182
    .line 183
    int-to-float p1, p1

    .line 184
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 185
    .line 186
    .line 187
    :cond_4
    invoke-virtual {p2}, Lcom/luck/picture/lib/style/SelectMainStyle;->z()I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    invoke-static {p1}, La7/o;->c(I)Z

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    if-eqz p2, :cond_5

    .line 196
    .line 197
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->o:Landroid/widget/TextView;

    .line 198
    .line 199
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 200
    .line 201
    .line 202
    :cond_5
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
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->H()Z

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->G()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->n:Landroid/widget/ImageView;

    .line 20
    .line 21
    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->n:Landroid/widget/ImageView;

    .line 26
    .line 27
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->o:Landroid/widget/TextView;

    .line 31
    .line 32
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p2}, Ll6/c;->f(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->o:Landroid/widget/TextView;

    .line 46
    .line 47
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->f:Landroid/content/Context;

    .line 48
    .line 49
    sget v0, Lcom/luck/picture/lib/R$string;->ps_gif_tag:I

    .line 50
    .line 51
    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-static {p2}, Ll6/c;->j(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_2

    .line 68
    .line 69
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->o:Landroid/widget/TextView;

    .line 70
    .line 71
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->f:Landroid/content/Context;

    .line 72
    .line 73
    sget v0, Lcom/luck/picture/lib/R$string;->ps_webp_tag:I

    .line 74
    .line 75
    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->D()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->r()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-static {p2, p1}, La7/h;->m(II)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_3

    .line 96
    .line 97
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->o:Landroid/widget/TextView;

    .line 98
    .line 99
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->f:Landroid/content/Context;

    .line 100
    .line 101
    sget v0, Lcom/luck/picture/lib/R$string;->ps_long_chart:I

    .line 102
    .line 103
    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_3
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/ImageViewHolder;->o:Landroid/widget/TextView;

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 114
    .line 115
    .line 116
    return-void
.end method
