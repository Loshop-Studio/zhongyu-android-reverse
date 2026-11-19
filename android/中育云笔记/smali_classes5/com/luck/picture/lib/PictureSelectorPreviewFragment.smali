.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment;
.super Lcom/luck/picture/lib/basic/PictureCommonFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;
    }
.end annotation


# static fields
.field public static final P:Ljava/lang/String; = "PictureSelectorPreviewFragment"


# instance fields
.field public A:Z

.field public B:I

.field public C:I

.field public D:I

.field public E:J

.field public F:Landroid/widget/TextView;

.field public G:Landroid/widget/TextView;

.field public H:Landroid/view/View;

.field public I:Lcom/luck/picture/lib/widget/CompleteSelectView;

.field public J:Z

.field public K:Z

.field public L:Landroidx/recyclerview/widget/RecyclerView;

.field public M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

.field public N:Ljava/util/List;

.field public final O:Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;

.field public m:Ljava/util/ArrayList;

.field public n:Lcom/luck/picture/lib/magical/MagicalView;

.field public o:Landroidx/viewpager2/widget/ViewPager2;

.field public p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

.field public q:Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

.field public r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

.field public s:Z

.field public t:I

.field public u:Z

.field public v:Z

.field public w:Ljava/lang/String;

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->s:Z

    .line 13
    .line 14
    const-wide/16 v1, -0x1

    .line 15
    .line 16
    iput-wide v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->E:J

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->J:Z

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->K:Z

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 29
    .line 30
    new-instance v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$i;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->O:Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;

    .line 36
    .line 37
    return-void
.end method

.method private M1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q:Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/PreviewBottomNavBar;->f()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q:Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/BottomNavBar;->h()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q:Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

    .line 12
    .line 13
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$e;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$e;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/widget/BottomNavBar;->setOnBottomNavBarListener(Lcom/luck/picture/lib/widget/BottomNavBar$b;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private N1()V
    .locals 3

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->E()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, La7/o;->c(I)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->E()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->J()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, La7/o;->c(I)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->J()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->G()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, La7/o;->f(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G:Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->G()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G:Landroid/widget/TextView;

    .line 67
    .line 68
    const-string v2, ""

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->I()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-static {v1}, La7/o;->b(I)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G:Landroid/widget/TextView;

    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->I()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    int-to-float v2, v2

    .line 90
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 91
    .line 92
    .line 93
    :cond_3
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->H()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-static {v1}, La7/o;->c(I)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G:Landroid/widget/TextView;

    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->H()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 110
    .line 111
    .line 112
    :cond_4
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->F()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    invoke-static {v1}, La7/o;->b(I)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_6

    .line 121
    .line 122
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    instance-of v1, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 129
    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 133
    .line 134
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    instance-of v1, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 139
    .line 140
    if-eqz v1, :cond_6

    .line 141
    .line 142
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 143
    .line 144
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 149
    .line 150
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->F()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_5
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 158
    .line 159
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    instance-of v1, v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 164
    .line 165
    if-eqz v1, :cond_6

    .line 166
    .line 167
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 168
    .line 169
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 174
    .line 175
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->F()I

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 180
    .line 181
    :cond_6
    :goto_2
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 182
    .line 183
    invoke-virtual {v1}, Lcom/luck/picture/lib/widget/CompleteSelectView;->c()V

    .line 184
    .line 185
    .line 186
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 187
    .line 188
    const/4 v2, 0x1

    .line 189
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/widget/CompleteSelectView;->setSelectedChange(Z)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->U()Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_8

    .line 197
    .line 198
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 199
    .line 200
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    instance-of v1, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 205
    .line 206
    if-eqz v1, :cond_7

    .line 207
    .line 208
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 209
    .line 210
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 215
    .line 216
    sget v2, Lcom/luck/picture/lib/R$id;->title_bar:I

    .line 217
    .line 218
    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToTop:I

    .line 219
    .line 220
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 221
    .line 222
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 227
    .line 228
    sget v2, Lcom/luck/picture/lib/R$id;->title_bar:I

    .line 229
    .line 230
    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 231
    .line 232
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 233
    .line 234
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 235
    .line 236
    if-eqz v1, :cond_8

    .line 237
    .line 238
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 239
    .line 240
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 245
    .line 246
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-static {v2}, La7/e;->h(Landroid/content/Context;)I

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_7
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 258
    .line 259
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    instance-of v1, v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 264
    .line 265
    if-eqz v1, :cond_8

    .line 266
    .line 267
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 268
    .line 269
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 270
    .line 271
    if-eqz v1, :cond_8

    .line 272
    .line 273
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 274
    .line 275
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 280
    .line 281
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-static {v2}, La7/e;->h(Landroid/content/Context;)I

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 290
    .line 291
    :cond_8
    :goto_3
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->Y()Z

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    if-eqz v1, :cond_9

    .line 296
    .line 297
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 298
    .line 299
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    instance-of v1, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 304
    .line 305
    if-eqz v1, :cond_b

    .line 306
    .line 307
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 308
    .line 309
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 314
    .line 315
    sget v2, Lcom/luck/picture/lib/R$id;->bottom_nar_bar:I

    .line 316
    .line 317
    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToTop:I

    .line 318
    .line 319
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 320
    .line 321
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 326
    .line 327
    sget v2, Lcom/luck/picture/lib/R$id;->bottom_nar_bar:I

    .line 328
    .line 329
    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 330
    .line 331
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G:Landroid/widget/TextView;

    .line 332
    .line 333
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 338
    .line 339
    sget v2, Lcom/luck/picture/lib/R$id;->bottom_nar_bar:I

    .line 340
    .line 341
    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToTop:I

    .line 342
    .line 343
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G:Landroid/widget/TextView;

    .line 344
    .line 345
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 350
    .line 351
    sget v2, Lcom/luck/picture/lib/R$id;->bottom_nar_bar:I

    .line 352
    .line 353
    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 354
    .line 355
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->H:Landroid/view/View;

    .line 356
    .line 357
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 362
    .line 363
    sget v2, Lcom/luck/picture/lib/R$id;->bottom_nar_bar:I

    .line 364
    .line 365
    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToTop:I

    .line 366
    .line 367
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->H:Landroid/view/View;

    .line 368
    .line 369
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 374
    .line 375
    sget v2, Lcom/luck/picture/lib/R$id;->bottom_nar_bar:I

    .line 376
    .line 377
    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 378
    .line 379
    goto :goto_4

    .line 380
    :cond_9
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 381
    .line 382
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 383
    .line 384
    if-eqz v1, :cond_b

    .line 385
    .line 386
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G:Landroid/widget/TextView;

    .line 387
    .line 388
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    instance-of v1, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 393
    .line 394
    if-eqz v1, :cond_a

    .line 395
    .line 396
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G:Landroid/widget/TextView;

    .line 397
    .line 398
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 403
    .line 404
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-static {v2}, La7/e;->h(Landroid/content/Context;)I

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 413
    .line 414
    goto :goto_4

    .line 415
    :cond_a
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G:Landroid/widget/TextView;

    .line 416
    .line 417
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    instance-of v1, v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 422
    .line 423
    if-eqz v1, :cond_b

    .line 424
    .line 425
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G:Landroid/widget/TextView;

    .line 426
    .line 427
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 432
    .line 433
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-static {v2}, La7/e;->h(Landroid/content/Context;)I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 442
    .line 443
    :cond_b
    :goto_4
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 444
    .line 445
    new-instance v2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$p;

    .line 446
    .line 447
    invoke-direct {v2, p0, v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$p;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Lcom/luck/picture/lib/style/SelectMainStyle;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 451
    .line 452
    .line 453
    return-void
.end method

.method private P1()V
    .locals 3

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz6/a;->d()Lcom/luck/picture/lib/style/TitleBarStyle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->v()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/PreviewTitleBar;->d()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 26
    .line 27
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$q;

    .line 28
    .line 29
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$q;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/widget/TitleBar;->setOnTitleBarListener(Lcom/luck/picture/lib/widget/TitleBar$a;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    iget v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v2, "/"

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->B:I

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/widget/TitleBar;->setTitle(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/TitleBar;->getImageDelete()Landroid/widget/ImageView;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$r;

    .line 73
    .line 74
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$r;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->H:Landroid/view/View;

    .line 81
    .line 82
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$s;

    .line 83
    .line 84
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$s;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 91
    .line 92
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$t;

    .line 93
    .line 94
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$t;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public static synthetic U0(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;[I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->C1([I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static U1()Lcom/luck/picture/lib/PictureSelectorPreviewFragment;
    .locals 2

    .line 1
    new-instance v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static synthetic V0(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->J1(Ljava/util/List;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic W0(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic X0(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->V1(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic Y0(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic Z0(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic a1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;[I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o2([I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->g2()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic i1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->Z1(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->R1()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic k1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->B1(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic m1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic n1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p2(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic o1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic p1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic q1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->R()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic s1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->T1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic t1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;III)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m2(III)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic u1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic v1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic w1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic x1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic y1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->E1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic z1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public varargs A1([Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final B1(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$l;

    .line 21
    .line 22
    invoke-direct {v1, p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$l;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0, v2, v1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->H1(Lcom/luck/picture/lib/entity/LocalMedia;ZLq6/b;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {p0, v0, v2}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G1(Lcom/luck/picture/lib/entity/LocalMedia;Z)[I

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    aget v1, v0, v2

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    aget v0, v0, v2

    .line 37
    .line 38
    invoke-virtual {p0, v1, v0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m2(III)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final C1([I)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->x:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 7
    .line 8
    add-int/2addr v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 11
    .line 12
    :goto_0
    invoke-static {v0}, Lt6/a;->d(I)Lcom/luck/picture/lib/magical/ViewParams;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    aget v8, p1, v2

    .line 20
    .line 21
    if-eqz v8, :cond_2

    .line 22
    .line 23
    aget v9, p1, v1

    .line 24
    .line 25
    if-nez v9, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    iget-object v3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 29
    .line 30
    iget v4, v0, Lcom/luck/picture/lib/magical/ViewParams;->c:I

    .line 31
    .line 32
    iget v5, v0, Lcom/luck/picture/lib/magical/ViewParams;->d:I

    .line 33
    .line 34
    iget v6, v0, Lcom/luck/picture/lib/magical/ViewParams;->e:I

    .line 35
    .line 36
    iget v7, v0, Lcom/luck/picture/lib/magical/ViewParams;->f:I

    .line 37
    .line 38
    invoke-virtual/range {v3 .. v9}, Lcom/luck/picture/lib/magical/MagicalView;->F(IIIIII)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/luck/picture/lib/magical/MagicalView;->B()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    :goto_1
    iget-object v3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 48
    .line 49
    aget v8, p1, v2

    .line 50
    .line 51
    aget v9, p1, v1

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    invoke-virtual/range {v3 .. v9}, Lcom/luck/picture/lib/magical/MagicalView;->F(IIIIII)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 61
    .line 62
    aget v3, p1, v2

    .line 63
    .line 64
    aget p1, p1, v1

    .line 65
    .line 66
    invoke-virtual {v0, v3, p1, v2}, Lcom/luck/picture/lib/magical/MagicalView;->C(IIZ)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public D1()Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final E1()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public F0(Z)V
    .locals 1

    .line 1
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/luck/picture/lib/style/SelectMainStyle;->X()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 14
    .line 15
    invoke-virtual {p1}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lcom/luck/picture/lib/style/SelectMainStyle;->Z()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    :goto_0
    invoke-static {}, Lu6/a;->l()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-ge p1, v0, :cond_0

    .line 31
    .line 32
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMedia;->j0(I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-void
.end method

.method public final F1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/TitleBar;->getImageDelete()Landroid/widget/ImageView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->z:Z

    .line 8
    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v1, v2

    .line 16
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q:Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final G1(Lcom/luck/picture/lib/entity/LocalMedia;Z)[I
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->D()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->r()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, La7/h;->m(II)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->C:I

    .line 16
    .line 17
    iget v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->D:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->D()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->r()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    if-lez v0, :cond_1

    .line 31
    .line 32
    if-lez v1, :cond_1

    .line 33
    .line 34
    if-le v0, v1, :cond_3

    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->g()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {p2, v2}, La7/h;->f(Landroid/content/Context;Ljava/lang/String;)Lo6/b;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2}, Lo6/b;->c()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-lez v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {p2}, Lo6/b;->c()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->s0(I)V

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-virtual {p2}, Lo6/b;->b()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-lez v2, :cond_3

    .line 66
    .line 67
    invoke-virtual {p2}, Lo6/b;->b()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-virtual {p1, p2}, Lcom/luck/picture/lib/entity/LocalMedia;->f0(I)V

    .line 72
    .line 73
    .line 74
    move v3, v0

    .line 75
    move v0, p2

    .line 76
    move p2, v3

    .line 77
    goto :goto_0

    .line 78
    :cond_3
    move p2, v0

    .line 79
    move v0, v1

    .line 80
    :goto_0
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->G()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->l()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-lez v1, :cond_4

    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->k()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-lez v1, :cond_4

    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->l()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->k()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    :cond_4
    filled-new-array {p2, v0}, [I

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1
.end method

.method public final H1(Lcom/luck/picture/lib/entity/LocalMedia;ZLq6/b;)V
    .locals 2

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->D()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-lez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->r()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-lez p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->D()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->r()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-le p2, v0, :cond_1

    .line 24
    .line 25
    :cond_0
    iget-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 26
    .line 27
    iget-boolean p2, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M0:Z

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->g()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$m;

    .line 46
    .line 47
    invoke-direct {v1, p0, p1, p3}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$m;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Lcom/luck/picture/lib/entity/LocalMedia;Lq6/b;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p2, v0, v1}, La7/h;->l(Landroid/content/Context;Ljava/lang/String;Lq6/b;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->D()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->r()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    filled-new-array {p2, p1}, [I

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-interface {p3, p1}, Lq6/b;->a(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final I1()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 12
    .line 13
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->K1()V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m0()V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public final J1(Ljava/util/List;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-boolean p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->s:Z

    .line 13
    .line 14
    if-eqz p2, :cond_2

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-lez p2, :cond_1

    .line 21
    .line 22
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 40
    .line 41
    invoke-virtual {v0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeChanged(II)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->T1()V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    return-void
.end method

.method public final K1()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x1

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/view/View;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q:Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/PreviewBottomNavBar;->getEditor()Landroid/widget/TextView;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final L1()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->R1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->k2()V

    .line 10
    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->v:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/magical/MagicalView;->setBackgroundAlpha(F)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    :goto_1
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-ge v0, v2, :cond_2

    .line 31
    .line 32
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    instance-of v2, v2, Lcom/luck/picture/lib/widget/TitleBar;

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Landroid/view/View;->setAlpha(F)V

    .line 52
    .line 53
    .line 54
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    return-void

    .line 58
    :cond_3
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/magical/MagicalView;->setBackgroundAlpha(F)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public O1(Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->W()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_6

    .line 12
    .line 13
    new-instance v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->q()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, La7/o;->c(I)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->q()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    sget v1, Lcom/luck/picture/lib/R$drawable;->ps_preview_gallery_bg:I

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    instance-of v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 68
    .line 69
    const/4 v0, -0x1

    .line 70
    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 71
    .line 72
    const/4 v0, -0x2

    .line 73
    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 74
    .line 75
    sget v0, Lcom/luck/picture/lib/R$id;->bottom_nar_bar:I

    .line 76
    .line 77
    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->bottomToTop:I

    .line 78
    .line 79
    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->startToStart:I

    .line 80
    .line 81
    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->endToEnd:I

    .line 82
    .line 83
    :cond_1
    new-instance p1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$a;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-direct {p1, p0, v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$a;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Landroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 93
    .line 94
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-eqz v0, :cond_2

    .line 99
    .line 100
    check-cast v0, Landroidx/recyclerview/widget/SimpleItemAnimator;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/SimpleItemAnimator;->setSupportsChangeAnimations(Z)V

    .line 103
    .line 104
    .line 105
    :cond_2
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 106
    .line 107
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_3

    .line 112
    .line 113
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 114
    .line 115
    new-instance v2, Lcom/luck/picture/lib/decoration/HorizontalItemDecoration;

    .line 116
    .line 117
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const/high16 v4, 0x40c00000    # 6.0f

    .line 122
    .line 123
    invoke-static {v3, v4}, La7/e;->a(Landroid/content/Context;F)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    const v4, 0x7fffffff

    .line 128
    .line 129
    .line 130
    invoke-direct {v2, v4, v3}, Lcom/luck/picture/lib/decoration/HorizontalItemDecoration;-><init>(II)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 134
    .line 135
    .line 136
    :cond_3
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 140
    .line 141
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 142
    .line 143
    .line 144
    invoke-static {}, Lu6/a;->l()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-lez p1, :cond_4

    .line 149
    .line 150
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 151
    .line 152
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget v2, Lcom/luck/picture/lib/R$anim;->ps_anim_layout_fall_enter:I

    .line 157
    .line 158
    invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadLayoutAnimation(Landroid/content/Context;I)Landroid/view/animation/LayoutAnimationController;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setLayoutAnimation(Landroid/view/animation/LayoutAnimationController;)V

    .line 163
    .line 164
    .line 165
    :cond_4
    new-instance p1, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 166
    .line 167
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 168
    .line 169
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-direct {p1, v0, v2}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;-><init>(ZLjava/util/List;)V

    .line 174
    .line 175
    .line 176
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 177
    .line 178
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 179
    .line 180
    iget v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 181
    .line 182
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 187
    .line 188
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->V1(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 189
    .line 190
    .line 191
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 192
    .line 193
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 194
    .line 195
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 196
    .line 197
    .line 198
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 199
    .line 200
    new-instance v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;

    .line 201
    .line 202
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->k(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$c;)V

    .line 206
    .line 207
    .line 208
    invoke-static {}, Lu6/a;->l()I

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    if-lez p1, :cond_5

    .line 213
    .line 214
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 215
    .line 216
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 217
    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_5
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 221
    .line 222
    const/4 v0, 0x4

    .line 223
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 224
    .line 225
    .line 226
    :goto_1
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 227
    .line 228
    const/4 v0, 0x1

    .line 229
    new-array v0, v0, [Landroid/view/View;

    .line 230
    .line 231
    aput-object p1, v0, v1

    .line 232
    .line 233
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->A1([Landroid/view/View;)V

    .line 234
    .line 235
    .line 236
    new-instance p1, Landroidx/recyclerview/widget/ItemTouchHelper;

    .line 237
    .line 238
    new-instance v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;

    .line 239
    .line 240
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 241
    .line 242
    .line 243
    invoke-direct {p1, v0}, Landroidx/recyclerview/widget/ItemTouchHelper;-><init>(Landroidx/recyclerview/widget/ItemTouchHelper$Callback;)V

    .line 244
    .line 245
    .line 246
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 247
    .line 248
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/ItemTouchHelper;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 249
    .line 250
    .line 251
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 252
    .line 253
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$d;

    .line 254
    .line 255
    invoke-direct {v1, p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$d;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Landroidx/recyclerview/widget/ItemTouchHelper;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->l(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$d;)V

    .line 259
    .line 260
    .line 261
    :cond_6
    return-void
.end method

.method public final Q1(Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->D1()Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->j(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 11
    .line 12
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Lcom/luck/picture/lib/PictureSelectorPreviewFragment$j;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->k(Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setOrientation(I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lu6/a;->g()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iget v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-le v0, v2, :cond_0

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_0
    iget v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 59
    .line 60
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q:Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {v3}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-nez v3, :cond_2

    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {v3}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    move v3, v1

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    :goto_0
    const/4 v3, 0x1

    .line 86
    :goto_1
    invoke-virtual {v2, v3}, Lcom/luck/picture/lib/widget/PreviewBottomNavBar;->i(Z)V

    .line 87
    .line 88
    .line 89
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 90
    .line 91
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iget-object v4, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 96
    .line 97
    invoke-virtual {v4}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setSelected(Z)V

    .line 110
    .line 111
    .line 112
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 113
    .line 114
    iget-object v3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->O:Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;

    .line 115
    .line 116
    invoke-virtual {v2, v3}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 117
    .line 118
    .line 119
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 120
    .line 121
    new-instance v3, Landroidx/viewpager2/widget/MarginPageTransformer;

    .line 122
    .line 123
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    const/high16 v5, 0x40400000    # 3.0f

    .line 128
    .line 129
    invoke-static {v4, v5}, La7/e;->a(Landroid/content/Context;F)I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    invoke-direct {v3, v4}, Landroidx/viewpager2/widget/MarginPageTransformer;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v3}, Landroidx/viewpager2/widget/ViewPager2;->setPageTransformer(Landroidx/viewpager2/widget/ViewPager2$PageTransformer;)V

    .line 137
    .line 138
    .line 139
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 140
    .line 141
    iget v3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 142
    .line 143
    invoke-virtual {v2, v3, v1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F0(Z)V

    .line 147
    .line 148
    .line 149
    iget v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 150
    .line 151
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 156
    .line 157
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->X1(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q2(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_3
    :goto_2
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p0()V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public final R1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 6
    .line 7
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public S1(Lcom/luck/picture/lib/entity/LocalMedia;)Z
    .locals 1

    .line 1
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final T1()V
    .locals 7

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 2
    .line 3
    add-int/lit8 v4, v0, 0x1

    .line 4
    .line 5
    iput v4, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 6
    .line 7
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->f:Ls6/a;

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->E:J

    .line 12
    .line 13
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 14
    .line 15
    iget v5, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->i0:I

    .line 16
    .line 17
    new-instance v6, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$o;

    .line 18
    .line 19
    invoke-direct {v6, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$o;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {v1 .. v6}, Ls6/a;->i(JIILq6/g;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final V1(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->W()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->g(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public W()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {v0, v1}, Ll6/b;->a(Landroid/content/Context;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    sget v0, Lcom/luck/picture/lib/R$layout;->ps_fragment_preview:I

    .line 14
    .line 15
    return v0
.end method

.method public final W1(ZLcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->W()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x4

    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 35
    .line 36
    iget p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    if-ne p1, v0, :cond_1

    .line 40
    .line 41
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->d()V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->c(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 52
    .line 53
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 54
    .line 55
    invoke-virtual {p2}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->getItemCount()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    sub-int/2addr p2, v0

    .line 60
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->j(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lu6/a;->l()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_3

    .line 74
    .line 75
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L:Landroidx/recyclerview/widget/RecyclerView;

    .line 76
    .line 77
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    :cond_3
    return-void
.end method

.method public X1(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->X()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 14
    .line 15
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->Z()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 26
    .line 27
    const-string v1, ""

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    :goto_0
    invoke-static {}, Lu6/a;->l()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-ge v0, v1, :cond_2

    .line 38
    .line 39
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_0

    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->s()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->s()J

    .line 68
    .line 69
    .line 70
    move-result-wide v4

    .line 71
    cmp-long v2, v2, v4

    .line 72
    .line 73
    if-nez v2, :cond_1

    .line 74
    .line 75
    :cond_0
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->u()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-virtual {p1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->j0(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->y()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->o0(I)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->u()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-static {v2}, La7/q;->g(Ljava/lang/Object;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    return-void
.end method

.method public Y1()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 9
    .line 10
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j0:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Ls6/d;

    .line 15
    .line 16
    invoke-direct {v0}, Ls6/d;-><init>()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    new-instance v0, Ls6/b;

    .line 21
    .line 22
    invoke-direct {v0}, Ls6/b;-><init>()V

    .line 23
    .line 24
    .line 25
    :goto_0
    iput-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->f:Ls6/a;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Ls6/a;->f(Landroid/content/Context;Lcom/luck/picture/lib/config/PictureSelectionConfig;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final Z1(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 0

    .line 1
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    return-void
.end method

.method public final a2()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 16
    .line 17
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/luck/picture/lib/magical/MagicalView;->t()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m0()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e0()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 40
    .line 41
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/luck/picture/lib/magical/MagicalView;->t()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e0()V

    .line 52
    .line 53
    .line 54
    :cond_4
    return-void
.end method

.method public b2(F)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

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
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    instance-of v1, v1, Lcom/luck/picture/lib/widget/TitleBar;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    .line 30
    .line 31
    .line 32
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public c2(Lcom/luck/picture/lib/magical/MagicalView;Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 2
    .line 3
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 4
    .line 5
    invoke-virtual {p2}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p1, p2}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->b(I)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_0
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->G()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->l()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-lez v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->k()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-lez v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->l()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->k()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->D()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->r()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    :goto_0
    invoke-static {v0, p2}, La7/h;->m(II)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-eqz p2, :cond_2

    .line 71
    .line 72
    iget-object p2, p1, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 73
    .line 74
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 75
    .line 76
    invoke-virtual {p2, v0}, Lcom/luck/picture/lib/photoview/PhotoView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    iget-object p2, p1, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 81
    .line 82
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 83
    .line 84
    invoke-virtual {p2, v0}, Lcom/luck/picture/lib/photoview/PhotoView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 85
    .line 86
    .line 87
    :goto_1
    instance-of p2, p1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 88
    .line 89
    if-eqz p2, :cond_4

    .line 90
    .line 91
    check-cast p1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 92
    .line 93
    iget-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 94
    .line 95
    iget-boolean p2, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->G0:Z

    .line 96
    .line 97
    if-eqz p2, :cond_3

    .line 98
    .line 99
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p2(I)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_3
    iget-object p2, p1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->j:Landroid/widget/ImageView;

    .line 110
    .line 111
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    const/16 v0, 0x8

    .line 116
    .line 117
    if-ne p2, v0, :cond_4

    .line 118
    .line 119
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 120
    .line 121
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 122
    .line 123
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-virtual {p2, v0}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->d(I)Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-nez p2, :cond_4

    .line 132
    .line 133
    iget-object p1, p1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->j:Landroid/widget/ImageView;

    .line 134
    .line 135
    const/4 p2, 0x0

    .line 136
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 137
    .line 138
    .line 139
    :cond_4
    :goto_2
    return-void
.end method

.method public d2()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->b(I)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, v0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/16 v2, 0x8

    .line 23
    .line 24
    if-ne v1, v2, :cond_1

    .line 25
    .line 26
    iget-object v1, v0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    :cond_1
    instance-of v1, v0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    check-cast v0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 37
    .line 38
    iget-object v1, v0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->j:Landroid/widget/ImageView;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    iget-object v0, v0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->j:Landroid/widget/ImageView;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    return-void
.end method

.method public e2(Z)V
    .locals 3

    .line 1
    iget-boolean p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->x:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 6
    .line 7
    add-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 11
    .line 12
    :goto_0
    invoke-static {p1}, Lt6/a;->d(I)Lcom/luck/picture/lib/magical/ViewParams;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->b(I)Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    :goto_1
    return-void

    .line 34
    :cond_2
    iget-object v1, v0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget v2, p1, Lcom/luck/picture/lib/magical/ViewParams;->e:I

    .line 41
    .line 42
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 43
    .line 44
    iget-object v1, v0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget p1, p1, Lcom/luck/picture/lib/magical/ViewParams;->f:I

    .line 51
    .line 52
    iput p1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 53
    .line 54
    iget-object p1, v0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 55
    .line 56
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/photoview/PhotoView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public f2()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->c0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->R1()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m0()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e0()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public g0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q:Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/BottomNavBar;->g()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g2()V
    .locals 13

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    cmpl-float v0, v0, v1

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    move v0, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v2

    .line 22
    :goto_0
    new-instance v4, Landroid/animation/AnimatorSet;

    .line 23
    .line 24
    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 25
    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    move v5, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    iget-object v5, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 32
    .line 33
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    neg-int v5, v5

    .line 38
    int-to-float v5, v5

    .line 39
    :goto_1
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iget-object v6, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 42
    .line 43
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    neg-int v6, v6

    .line 48
    int-to-float v6, v6

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    move v6, v1

    .line 51
    :goto_2
    const/high16 v7, 0x3f800000    # 1.0f

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    move v8, v7

    .line 56
    goto :goto_3

    .line 57
    :cond_4
    move v8, v1

    .line 58
    :goto_3
    if-eqz v0, :cond_5

    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_5
    move v1, v7

    .line 62
    :goto_4
    move v7, v2

    .line 63
    :goto_5
    iget-object v9, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    if-ge v7, v9, :cond_7

    .line 70
    .line 71
    iget-object v9, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    check-cast v9, Landroid/view/View;

    .line 78
    .line 79
    const/4 v10, 0x2

    .line 80
    new-array v11, v10, [F

    .line 81
    .line 82
    aput v8, v11, v2

    .line 83
    .line 84
    aput v1, v11, v3

    .line 85
    .line 86
    const-string v12, "alpha"

    .line 87
    .line 88
    invoke-static {v9, v12, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    new-array v12, v3, [Landroid/animation/Animator;

    .line 93
    .line 94
    aput-object v11, v12, v2

    .line 95
    .line 96
    invoke-virtual {v4, v12}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 97
    .line 98
    .line 99
    instance-of v11, v9, Lcom/luck/picture/lib/widget/TitleBar;

    .line 100
    .line 101
    if-eqz v11, :cond_6

    .line 102
    .line 103
    new-array v10, v10, [F

    .line 104
    .line 105
    aput v5, v10, v2

    .line 106
    .line 107
    aput v6, v10, v3

    .line 108
    .line 109
    const-string v11, "translationY"

    .line 110
    .line 111
    invoke-static {v9, v11, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    new-array v10, v3, [Landroid/animation/Animator;

    .line 116
    .line 117
    aput-object v9, v10, v2

    .line 118
    .line 119
    invoke-virtual {v4, v10}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 120
    .line 121
    .line 122
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_7
    const-wide/16 v1, 0x15e

    .line 126
    .line 127
    invoke-virtual {v4, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Landroid/animation/AnimatorSet;->start()V

    .line 131
    .line 132
    .line 133
    iput-boolean v3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->A:Z

    .line 134
    .line 135
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$h;

    .line 136
    .line 137
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$h;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 141
    .line 142
    .line 143
    if-eqz v0, :cond_8

    .line 144
    .line 145
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n2()V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_8
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->K1()V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public h2(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "com.luck.picture.lib.current_page"

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 11
    .line 12
    const-string v0, "com.luck.picture.lib.current_bucketId"

    .line 13
    .line 14
    const-wide/16 v1, -0x1

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->E:J

    .line 21
    .line 22
    const-string v0, "com.luck.picture.lib.current_preview_position"

    .line 23
    .line 24
    iget v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 25
    .line 26
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 31
    .line 32
    const-string v0, "com.luck.picture.lib.display_camera"

    .line 33
    .line 34
    iget-boolean v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->x:Z

    .line 35
    .line 36
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->x:Z

    .line 41
    .line 42
    const-string v0, "com.luck.picture.lib.current_album_total"

    .line 43
    .line 44
    iget v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->B:I

    .line 45
    .line 46
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iput v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->B:I

    .line 51
    .line 52
    const-string v0, "com.luck.picture.lib.external_preview"

    .line 53
    .line 54
    iget-boolean v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y:Z

    .line 55
    .line 56
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y:Z

    .line 61
    .line 62
    const-string v0, "com.luck.picture.lib.external_preview_display_delete"

    .line 63
    .line 64
    iget-boolean v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->z:Z

    .line 65
    .line 66
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iput-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->z:Z

    .line 71
    .line 72
    const-string v0, "com.luck.picture.lib.bottom_preview"

    .line 73
    .line 74
    iget-boolean v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 75
    .line 76
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 81
    .line 82
    const-string v0, "com.luck.picture.lib.current_album_name"

    .line 83
    .line 84
    const-string v1, ""

    .line 85
    .line 86
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->w:Ljava/lang/String;

    .line 91
    .line 92
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_0

    .line 99
    .line 100
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 101
    .line 102
    new-instance v0, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-static {}, Lu6/a;->m()Ljava/util/ArrayList;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 112
    .line 113
    .line 114
    :cond_0
    return-void
.end method

.method public i2(IILjava/util/ArrayList;Z)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    iput p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->B:I

    .line 4
    .line 5
    iput p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 6
    .line 7
    iput-boolean p4, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->z:Z

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y:Z

    .line 11
    .line 12
    return-void
.end method

.method public j0(Landroid/content/Intent;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-le v0, v1, :cond_3

    .line 14
    .line 15
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 28
    .line 29
    invoke-static {p1}, Ll6/a;->b(Landroid/content/Intent;)Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string v1, ""

    .line 41
    .line 42
    :goto_0
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->Z(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Ll6/a;->h(Landroid/content/Intent;)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->T(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Ll6/a;->e(Landroid/content/Intent;)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->S(I)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Ll6/a;->f(Landroid/content/Intent;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->U(I)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, Ll6/a;->g(Landroid/content/Intent;)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->V(I)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Ll6/a;->c(Landroid/content/Intent;)F

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->W(F)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    xor-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->Y(Z)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Ll6/a;->d(Landroid/content/Intent;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->X(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->G()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->c0(Z)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->q0(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_2

    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->i()Lcom/luck/picture/lib/entity/LocalMedia;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    if-eqz v1, :cond_1

    .line 129
    .line 130
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->Z(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->G()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->Y(Z)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->H()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->c0(Z)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->m()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->X(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->q0(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-static {p1}, Ll6/a;->h(Landroid/content/Intent;)I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->T(I)V

    .line 170
    .line 171
    .line 172
    invoke-static {p1}, Ll6/a;->e(Landroid/content/Intent;)I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->S(I)V

    .line 177
    .line 178
    .line 179
    invoke-static {p1}, Ll6/a;->f(Landroid/content/Intent;)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->U(I)V

    .line 184
    .line 185
    .line 186
    invoke-static {p1}, Ll6/a;->g(Landroid/content/Intent;)I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->V(I)V

    .line 191
    .line 192
    .line 193
    invoke-static {p1}, Ll6/a;->c(Landroid/content/Intent;)F

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    invoke-virtual {v1, p1}, Lcom/luck/picture/lib/entity/LocalMedia;->W(F)V

    .line 198
    .line 199
    .line 200
    :cond_1
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->G0(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_2
    const/4 p1, 0x0

    .line 205
    invoke-virtual {p0, v0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->E(Lcom/luck/picture/lib/entity/LocalMedia;Z)I

    .line 206
    .line 207
    .line 208
    :goto_1
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 209
    .line 210
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 211
    .line 212
    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->V1(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 220
    .line 221
    .line 222
    :cond_3
    return-void
.end method

.method public j2(ZLjava/lang/String;ZIIIJLjava/util/ArrayList;)V
    .locals 0

    .line 1
    iput p6, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 2
    .line 3
    iput-wide p7, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->E:J

    .line 4
    .line 5
    iput-object p9, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput p5, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->B:I

    .line 8
    .line 9
    iput p4, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 10
    .line 11
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->w:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->x:Z

    .line 14
    .line 15
    iput-boolean p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 16
    .line 17
    return-void
.end method

.method public k2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 2
    .line 3
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$j;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$j;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/magical/MagicalView;->setOnMojitoViewCallback(Lt6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public l0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->K1()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final l2()V
    .locals 3

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->D()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, La7/o;->c(I)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->D()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {v1, v0}, Lcom/luck/picture/lib/magical/MagicalView;->setBackgroundColor(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 28
    .line 29
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 30
    .line 31
    invoke-static {}, Ll6/d;->b()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eq v0, v1, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-lez v0, :cond_1

    .line 46
    .line 47
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    sget v2, Lcom/luck/picture/lib/R$color;->ps_color_black:I

    .line 74
    .line 75
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/magical/MagicalView;->setBackgroundColor(I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    sget v2, Lcom/luck/picture/lib/R$color;->ps_color_white:I

    .line 90
    .line 91
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/magical/MagicalView;->setBackgroundColor(I)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public m0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->m0()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final m2(III)V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, p2, v1}, Lcom/luck/picture/lib/magical/MagicalView;->A(IIZ)V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->x:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    add-int/lit8 p3, p3, 0x1

    .line 12
    .line 13
    :cond_0
    invoke-static {p3}, Lt6/a;->d(I)Lcom/luck/picture/lib/magical/ViewParams;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    if-eqz p3, :cond_2

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    if-nez p2, :cond_1

    .line 22
    .line 23
    move v10, p1

    .line 24
    move v6, p2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 27
    .line 28
    iget v1, p3, Lcom/luck/picture/lib/magical/ViewParams;->c:I

    .line 29
    .line 30
    iget v2, p3, Lcom/luck/picture/lib/magical/ViewParams;->d:I

    .line 31
    .line 32
    iget v3, p3, Lcom/luck/picture/lib/magical/ViewParams;->e:I

    .line 33
    .line 34
    iget v4, p3, Lcom/luck/picture/lib/magical/ViewParams;->f:I

    .line 35
    .line 36
    move v5, p1

    .line 37
    move v6, p2

    .line 38
    invoke-virtual/range {v0 .. v6}, Lcom/luck/picture/lib/magical/MagicalView;->F(IIIIII)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    move v6, p2

    .line 43
    move v10, p1

    .line 44
    :goto_0
    iget-object v5, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    move v11, v6

    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    invoke-virtual/range {v5 .. v11}, Lcom/luck/picture/lib/magical/MagicalView;->F(IIIIII)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final n2()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroid/view/View;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q:Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/luck/picture/lib/widget/PreviewBottomNavBar;->getEditor()Landroid/widget/TextView;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final o2([I)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v2, p1, v1

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    aget v4, p1, v3

    .line 8
    .line 9
    invoke-virtual {v0, v2, v4, v1}, Lcom/luck/picture/lib/magical/MagicalView;->A(IIZ)V

    .line 10
    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->x:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 17
    .line 18
    add-int/2addr v0, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 21
    .line 22
    :goto_0
    invoke-static {v0}, Lt6/a;->d(I)Lcom/luck/picture/lib/magical/ViewParams;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    aget v9, p1, v1

    .line 29
    .line 30
    if-nez v9, :cond_1

    .line 31
    .line 32
    aget v2, p1, v3

    .line 33
    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-object v4, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 38
    .line 39
    iget v5, v0, Lcom/luck/picture/lib/magical/ViewParams;->c:I

    .line 40
    .line 41
    iget v6, v0, Lcom/luck/picture/lib/magical/ViewParams;->d:I

    .line 42
    .line 43
    iget v7, v0, Lcom/luck/picture/lib/magical/ViewParams;->e:I

    .line 44
    .line 45
    iget v8, v0, Lcom/luck/picture/lib/magical/ViewParams;->f:I

    .line 46
    .line 47
    aget v10, p1, v3

    .line 48
    .line 49
    invoke-virtual/range {v4 .. v10}, Lcom/luck/picture/lib/magical/MagicalView;->F(IIIIII)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 53
    .line 54
    invoke-virtual {p1, v1}, Lcom/luck/picture/lib/magical/MagicalView;->J(Z)V

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 59
    .line 60
    aget v2, p1, v1

    .line 61
    .line 62
    aget p1, p1, v3

    .line 63
    .line 64
    invoke-virtual {v0, v2, p1, v1}, Lcom/luck/picture/lib/magical/MagicalView;->K(IIZ)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 68
    .line 69
    const/high16 v0, 0x3f800000    # 1.0f

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/magical/MagicalView;->setBackgroundAlpha(F)V

    .line 72
    .line 73
    .line 74
    :goto_2
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-ge v1, p1, :cond_3

    .line 81
    .line 82
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Landroid/view/View;

    .line 89
    .line 90
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    :goto_3
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 97
    .line 98
    const/4 v0, 0x2

    .line 99
    new-array v0, v0, [F

    .line 100
    .line 101
    fill-array-data v0, :array_0

    .line 102
    .line 103
    .line 104
    const-string v1, "alpha"

    .line 105
    .line 106
    invoke-static {p1, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const-wide/16 v0, 0x32

    .line 111
    .line 112
    invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    nop

    .line 121
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->R1()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 17
    .line 18
    if-le p1, v0, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/4 v1, 0x0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    new-instance v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$n;

    .line 40
    .line 41
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$n;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1, v1, v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->H1(Lcom/luck/picture/lib/entity/LocalMedia;ZLq6/b;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-virtual {p0, p1, v1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G1(Lcom/luck/picture/lib/entity/LocalMedia;Z)[I

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->C1([I)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method public onCreateAnimation(IZI)Landroid/view/animation/Animation;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->R1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lz6/a;->e()Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, v0, Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;->e:I

    .line 16
    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    iget v1, v0, Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;->f:I

    .line 20
    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    iget p3, v0, Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;->e:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget p3, v0, Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;->f:I

    .line 33
    .line 34
    :goto_0
    invoke-static {p1, p3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->k0()V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_2
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->l0()V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_3
    invoke-super {p0, p1, p2, p3}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->onCreateAnimation(IZI)Landroid/view/animation/Animation;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->O:Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->unregisterOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-super {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->onDestroy()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "com.luck.picture.lib.current_page"

    .line 5
    .line 6
    iget v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    const-string v0, "com.luck.picture.lib.current_bucketId"

    .line 12
    .line 13
    iget-wide v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->E:J

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 16
    .line 17
    .line 18
    const-string v0, "com.luck.picture.lib.current_preview_position"

    .line 19
    .line 20
    iget v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    const-string v0, "com.luck.picture.lib.current_album_total"

    .line 26
    .line 27
    iget v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->B:I

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    const-string v0, "com.luck.picture.lib.external_preview"

    .line 33
    .line 34
    iget-boolean v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y:Z

    .line 35
    .line 36
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "com.luck.picture.lib.external_preview_display_delete"

    .line 40
    .line 41
    iget-boolean v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->z:Z

    .line 42
    .line 43
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    const-string v0, "com.luck.picture.lib.display_camera"

    .line 47
    .line 48
    iget-boolean v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->x:Z

    .line 49
    .line 50
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "com.luck.picture.lib.bottom_preview"

    .line 54
    .line 55
    iget-boolean v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 56
    .line 57
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    const-string v0, "com.luck.picture.lib.current_album_name"

    .line 61
    .line 62
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->w:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-static {p1}, Lu6/a;->d(Ljava/util/ArrayList;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->h2(Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    move p2, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p2, v0

    .line 14
    :goto_0
    iput-boolean p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->v:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p2}, La7/e;->e(Landroid/content/Context;)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iput p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->C:I

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-static {p2}, La7/e;->g(Landroid/content/Context;)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    iput p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->D:I

    .line 35
    .line 36
    sget p2, Lcom/luck/picture/lib/R$id;->title_bar:I

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    check-cast p2, Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 43
    .line 44
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 45
    .line 46
    sget p2, Lcom/luck/picture/lib/R$id;->ps_tv_selected:I

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    check-cast p2, Landroid/widget/TextView;

    .line 53
    .line 54
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 55
    .line 56
    sget p2, Lcom/luck/picture/lib/R$id;->ps_tv_selected_word:I

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    check-cast p2, Landroid/widget/TextView;

    .line 63
    .line 64
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G:Landroid/widget/TextView;

    .line 65
    .line 66
    sget p2, Lcom/luck/picture/lib/R$id;->select_click_area:I

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->H:Landroid/view/View;

    .line 73
    .line 74
    sget p2, Lcom/luck/picture/lib/R$id;->ps_complete_select:I

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    check-cast p2, Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 81
    .line 82
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 83
    .line 84
    sget p2, Lcom/luck/picture/lib/R$id;->magical:I

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    check-cast p2, Lcom/luck/picture/lib/magical/MagicalView;

    .line 91
    .line 92
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 93
    .line 94
    new-instance p2, Landroidx/viewpager2/widget/ViewPager2;

    .line 95
    .line 96
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-direct {p2, v2}, Landroidx/viewpager2/widget/ViewPager2;-><init>(Landroid/content/Context;)V

    .line 101
    .line 102
    .line 103
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 104
    .line 105
    sget p2, Lcom/luck/picture/lib/R$id;->bottom_nar_bar:I

    .line 106
    .line 107
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    check-cast p2, Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

    .line 112
    .line 113
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q:Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

    .line 114
    .line 115
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 116
    .line 117
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 118
    .line 119
    invoke-virtual {p2, v2}, Lcom/luck/picture/lib/magical/MagicalView;->setMagicalContent(Landroid/view/View;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->l2()V

    .line 123
    .line 124
    .line 125
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 126
    .line 127
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 128
    .line 129
    iget-object v3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G:Landroid/widget/TextView;

    .line 130
    .line 131
    iget-object v4, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->H:Landroid/view/View;

    .line 132
    .line 133
    iget-object v5, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 134
    .line 135
    iget-object v6, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q:Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

    .line 136
    .line 137
    const/4 v7, 0x6

    .line 138
    new-array v7, v7, [Landroid/view/View;

    .line 139
    .line 140
    aput-object p2, v7, v0

    .line 141
    .line 142
    aput-object v2, v7, v1

    .line 143
    .line 144
    const/4 p2, 0x2

    .line 145
    aput-object v3, v7, p2

    .line 146
    .line 147
    const/4 p2, 0x3

    .line 148
    aput-object v4, v7, p2

    .line 149
    .line 150
    const/4 p2, 0x4

    .line 151
    aput-object v5, v7, p2

    .line 152
    .line 153
    const/4 p2, 0x5

    .line 154
    aput-object v6, v7, p2

    .line 155
    .line 156
    invoke-virtual {p0, v7}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->A1([Landroid/view/View;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->Y1()V

    .line 160
    .line 161
    .line 162
    invoke-direct {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->P1()V

    .line 163
    .line 164
    .line 165
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-virtual {p0, p2}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->Q1(Ljava/util/ArrayList;)V

    .line 168
    .line 169
    .line 170
    iget-boolean p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y:Z

    .line 171
    .line 172
    if-eqz p2, :cond_1

    .line 173
    .line 174
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F1()V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_1
    invoke-direct {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M1()V

    .line 179
    .line 180
    .line 181
    check-cast p1, Landroid/view/ViewGroup;

    .line 182
    .line 183
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->O1(Landroid/view/ViewGroup;)V

    .line 184
    .line 185
    .line 186
    invoke-direct {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N1()V

    .line 187
    .line 188
    .line 189
    :goto_1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->L1()V

    .line 190
    .line 191
    .line 192
    return-void
.end method

.method public p0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->a2()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final p2(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 2
    .line 3
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$k;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$k;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public q2(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->v:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 11
    .line 12
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 17
    .line 18
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$f;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$f;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->g()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Ll6/c;->g(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    xor-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$g;

    .line 47
    .line 48
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$g;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1, v0, v1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->H1(Lcom/luck/picture/lib/entity/LocalMedia;ZLq6/b;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->g()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Ll6/c;->g(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    xor-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    invoke-virtual {p0, p1, v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->G1(Lcom/luck/picture/lib/entity/LocalMedia;Z)[I

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o2([I)V

    .line 70
    .line 71
    .line 72
    :cond_2
    :goto_0
    return-void
.end method

.method public x0(ZLcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q:Lcom/luck/picture/lib/widget/PreviewBottomNavBar;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/BottomNavBar;->h()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->I:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/widget/CompleteSelectView;->setSelectedChange(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->X1(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->W1(ZLcom/luck/picture/lib/entity/LocalMedia;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
