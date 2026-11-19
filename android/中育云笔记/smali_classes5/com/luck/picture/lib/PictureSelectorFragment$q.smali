.class public Lcom/luck/picture/lib/PictureSelectorFragment$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorFragment;->K1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/PictureSelectorFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(ILcom/luck/picture/lib/entity/LocalMediaFolder;)V
    .locals 7

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->a1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E:Z

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const-wide/16 v5, -0x1

    .line 18
    .line 19
    cmp-long v0, v3, v5

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    move v0, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v2

    .line 26
    :goto_0
    invoke-static {p1, v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->Z0(Lcom/luck/picture/lib/PictureSelectorFragment;Z)Z

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->U0(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 36
    .line 37
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->Y0(Lcom/luck/picture/lib/PictureSelectorFragment;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->j(Z)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->J1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/TitleBar;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->i()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/widget/TitleBar;->setTitle(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 66
    .line 67
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->b1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j0:Z

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 76
    .line 77
    .line 78
    move-result-wide v5

    .line 79
    cmp-long v0, v5, v3

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 84
    .line 85
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->U0(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->o(Ljava/util/ArrayList;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 97
    .line 98
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->c1(Lcom/luck/picture/lib/PictureSelectorFragment;)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->n(I)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 106
    .line 107
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->G1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->b()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->t(Z)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c()Ljava/util/ArrayList;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-lez p1, :cond_1

    .line 127
    .line 128
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->k()Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_1

    .line 133
    .line 134
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 135
    .line 136
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c()Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {p1, v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->d1(Lcom/luck/picture/lib/PictureSelectorFragment;Ljava/util/ArrayList;)V

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 144
    .line 145
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->b()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-static {p1, v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->e1(Lcom/luck/picture/lib/PictureSelectorFragment;I)I

    .line 150
    .line 151
    .line 152
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 153
    .line 154
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->G1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->k()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->setEnabledLoadMore(Z)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 166
    .line 167
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->G1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_1
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 176
    .line 177
    invoke-static {p1, v1}, Lcom/luck/picture/lib/PictureSelectorFragment;->f1(Lcom/luck/picture/lib/PictureSelectorFragment;I)I

    .line 178
    .line 179
    .line 180
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 181
    .line 182
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 183
    .line 184
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->k1(Lcom/luck/picture/lib/PictureSelectorFragment;)Ls6/a;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 189
    .line 190
    .line 191
    move-result-wide v1

    .line 192
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 193
    .line 194
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->i1(Lcom/luck/picture/lib/PictureSelectorFragment;)I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 199
    .line 200
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->j1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    iget v4, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->i0:I

    .line 205
    .line 206
    new-instance v5, Lcom/luck/picture/lib/PictureSelectorFragment$q$a;

    .line 207
    .line 208
    invoke-direct {v5, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$q$a;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment$q;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v0 .. v5}, Ls6/a;->i(JIILq6/g;)V

    .line 212
    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_2
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 216
    .line 217
    .line 218
    move-result-wide v0

    .line 219
    cmp-long p1, v0, v3

    .line 220
    .line 221
    if-eqz p1, :cond_3

    .line 222
    .line 223
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 224
    .line 225
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c()Ljava/util/ArrayList;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-static {p1, v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->d1(Lcom/luck/picture/lib/PictureSelectorFragment;Ljava/util/ArrayList;)V

    .line 230
    .line 231
    .line 232
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 233
    .line 234
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->G1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 239
    .line 240
    .line 241
    :cond_3
    :goto_1
    invoke-static {p2}, Lu6/a;->p(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V

    .line 242
    .line 243
    .line 244
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 245
    .line 246
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->H1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lm6/a;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-virtual {p1}, Lm6/a;->dismiss()V

    .line 251
    .line 252
    .line 253
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 254
    .line 255
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->l1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    if-eqz p1, :cond_4

    .line 260
    .line 261
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 262
    .line 263
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->m1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E0:Z

    .line 268
    .line 269
    if-eqz p1, :cond_4

    .line 270
    .line 271
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 272
    .line 273
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->l1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 278
    .line 279
    invoke-static {p2}, Lcom/luck/picture/lib/PictureSelectorFragment;->U0(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    invoke-virtual {p2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->e()Z

    .line 284
    .line 285
    .line 286
    move-result p2

    .line 287
    invoke-virtual {p1, p2}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->n(I)Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 288
    .line 289
    .line 290
    :cond_4
    return-void
.end method
