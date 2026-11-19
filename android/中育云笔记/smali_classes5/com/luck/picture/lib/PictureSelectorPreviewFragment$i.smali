.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPageScrolled(IFI)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    iget-object p2, p2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-le p2, p1, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 12
    .line 13
    iget v0, p2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->C:I

    .line 14
    .line 15
    div-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    iget-object p2, p2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 18
    .line 19
    if-ge p3, v0, :cond_0

    .line 20
    .line 21
    :goto_0
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 32
    .line 33
    iget-object p3, p2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 34
    .line 35
    invoke-virtual {p2, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->S1(Lcom/luck/picture/lib/entity/LocalMedia;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 43
    .line 44
    invoke-static {p2, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->X0(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 45
    .line 46
    .line 47
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 48
    .line 49
    invoke-virtual {p2, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->X1(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public onPageSelected(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    iput p1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 4
    .line 5
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 13
    .line 14
    iget v2, v2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    add-int/2addr v2, v3

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, "/"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 27
    .line 28
    iget v2, v2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->B:I

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/widget/TitleBar;->setTitle(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 41
    .line 42
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-le v0, p1, :cond_7

    .line 49
    .line 50
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 51
    .line 52
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 59
    .line 60
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->X1(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 66
    .line 67
    invoke-static {v1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->j1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 74
    .line 75
    invoke-static {v1, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->k1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;I)V

    .line 76
    .line 77
    .line 78
    :cond_0
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 79
    .line 80
    invoke-static {v1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->l1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 85
    .line 86
    if-eqz v1, :cond_2

    .line 87
    .line 88
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 89
    .line 90
    iget-boolean v2, v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 91
    .line 92
    if-eqz v2, :cond_1

    .line 93
    .line 94
    invoke-static {v1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->G0:Z

    .line 99
    .line 100
    if-eqz v1, :cond_1

    .line 101
    .line 102
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 103
    .line 104
    invoke-static {v1, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;I)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 109
    .line 110
    iget-object v1, v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 111
    .line 112
    invoke-virtual {v1, p1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->l(I)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 117
    .line 118
    invoke-static {v1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->G0:Z

    .line 123
    .line 124
    if-eqz v1, :cond_3

    .line 125
    .line 126
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 127
    .line 128
    invoke-static {v1, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;I)V

    .line 129
    .line 130
    .line 131
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 132
    .line 133
    invoke-static {v1, v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->X0(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 134
    .line 135
    .line 136
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 137
    .line 138
    iget-object v1, v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q:Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

    .line 139
    .line 140
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-static {v2}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-nez v2, :cond_5

    .line 149
    .line 150
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v0}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_4

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_4
    const/4 v0, 0x0

    .line 162
    goto :goto_2

    .line 163
    :cond_5
    :goto_1
    move v0, v3

    .line 164
    :goto_2
    invoke-virtual {v1, v0}, Lcom/luck/picture/lib/widget/PreviewBottomNavBar;->i(Z)V

    .line 165
    .line 166
    .line 167
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 168
    .line 169
    iget-boolean v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y:Z

    .line 170
    .line 171
    if-nez v1, :cond_7

    .line 172
    .line 173
    iget-boolean v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 174
    .line 175
    if-nez v1, :cond_7

    .line 176
    .line 177
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t0:Z

    .line 182
    .line 183
    if-nez v0, :cond_7

    .line 184
    .line 185
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 186
    .line 187
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j0:Z

    .line 192
    .line 193
    if-eqz v0, :cond_7

    .line 194
    .line 195
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 196
    .line 197
    iget-boolean v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->s:Z

    .line 198
    .line 199
    if-eqz v1, :cond_7

    .line 200
    .line 201
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 202
    .line 203
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->getItemCount()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    add-int/lit8 v0, v0, -0xb

    .line 208
    .line 209
    if-eq p1, v0, :cond_6

    .line 210
    .line 211
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 212
    .line 213
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 214
    .line 215
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->getItemCount()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    sub-int/2addr v0, v3

    .line 220
    if-ne p1, v0, :cond_7

    .line 221
    .line 222
    :cond_6
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 223
    .line 224
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->s1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 225
    .line 226
    .line 227
    :cond_7
    return-void
.end method
