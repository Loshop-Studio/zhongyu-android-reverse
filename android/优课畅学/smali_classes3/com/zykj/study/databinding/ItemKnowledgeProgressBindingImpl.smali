.class public Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;
.super Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;
.source "SourceFile"


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private mDirtyFlags:J

.field private final mboundView0:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView1:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView2:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3
    .param p1    # Landroidx/databinding/DataBindingComponent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x6

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 8

    const/4 v0, 0x4

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->ivProgressComplete:Landroid/widget/ImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->ivProgressNotComplete:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 6
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 8
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mboundView1:Landroid/widget/ImageView;

    .line 9
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 10
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 11
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 12
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->tvProgress:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 13
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 14
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public executeBindings()V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->mEntity:Lcom/zykj/study/bean/course/CatalogBean;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->mIsTeacher:Ljava/lang/Boolean;

    .line 14
    .line 15
    const-wide/16 v7, 0x5

    .line 16
    .line 17
    and-long v9, v2, v7

    .line 18
    .line 19
    cmp-long v9, v9, v4

    .line 20
    .line 21
    const-wide/16 v10, 0x1400

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v13, 0x0

    .line 25
    if-eqz v9, :cond_3

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf()Z

    .line 30
    .line 31
    .line 32
    move-result v14

    .line 33
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->getProgress()I

    .line 34
    .line 35
    .line 36
    move-result v15

    .line 37
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->getTitle()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v16

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object/from16 v16, v12

    .line 43
    .line 44
    move v14, v13

    .line 45
    move v15, v14

    .line 46
    :goto_0
    if-eqz v9, :cond_2

    .line 47
    .line 48
    if-eqz v14, :cond_1

    .line 49
    .line 50
    or-long/2addr v2, v10

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const-wide/16 v17, 0xa00

    .line 53
    .line 54
    or-long v2, v2, v17

    .line 55
    .line 56
    :cond_2
    :goto_1
    xor-int/lit8 v9, v14, 0x1

    .line 57
    .line 58
    move-wide/from16 v17, v4

    .line 59
    .line 60
    new-instance v4, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v5, "%"

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    move-object/from16 v5, v16

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    move-wide/from16 v17, v4

    .line 85
    .line 86
    move-object v4, v12

    .line 87
    move-object v5, v4

    .line 88
    move v9, v13

    .line 89
    move v14, v9

    .line 90
    :goto_2
    const-wide/16 v15, 0x7

    .line 91
    .line 92
    and-long v19, v2, v15

    .line 93
    .line 94
    cmp-long v19, v19, v17

    .line 95
    .line 96
    const-wide/16 v20, 0x8

    .line 97
    .line 98
    if-eqz v19, :cond_5

    .line 99
    .line 100
    invoke-static {v6}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v19, :cond_6

    .line 105
    .line 106
    if-eqz v6, :cond_4

    .line 107
    .line 108
    const-wide/16 v22, 0x10

    .line 109
    .line 110
    or-long v2, v2, v22

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_4
    or-long v2, v2, v20

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    move v6, v13

    .line 117
    :cond_6
    :goto_3
    const-wide/16 v22, 0x1408

    .line 118
    .line 119
    and-long v22, v2, v22

    .line 120
    .line 121
    cmp-long v19, v22, v17

    .line 122
    .line 123
    const/16 v22, 0x1

    .line 124
    .line 125
    if-eqz v19, :cond_d

    .line 126
    .line 127
    and-long/2addr v10, v2

    .line 128
    cmp-long v10, v10, v17

    .line 129
    .line 130
    if-eqz v10, :cond_a

    .line 131
    .line 132
    if-eqz v0, :cond_7

    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->getStatus()Lcom/zykj/study/bean/course/StudyStatus;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    goto :goto_4

    .line 139
    :cond_7
    move-object v10, v12

    .line 140
    :goto_4
    const-wide/16 v23, 0x1000

    .line 141
    .line 142
    and-long v23, v2, v23

    .line 143
    .line 144
    cmp-long v11, v23, v17

    .line 145
    .line 146
    if-eqz v11, :cond_8

    .line 147
    .line 148
    sget-object v11, Lcom/zykj/study/bean/course/StudyStatus;->COMPLETE:Lcom/zykj/study/bean/course/StudyStatus;

    .line 149
    .line 150
    if-ne v10, v11, :cond_8

    .line 151
    .line 152
    move/from16 v11, v22

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_8
    move v11, v13

    .line 156
    :goto_5
    const-wide/16 v23, 0x400

    .line 157
    .line 158
    and-long v23, v2, v23

    .line 159
    .line 160
    cmp-long v19, v23, v17

    .line 161
    .line 162
    move-wide/from16 v23, v7

    .line 163
    .line 164
    if-eqz v19, :cond_9

    .line 165
    .line 166
    sget-object v7, Lcom/zykj/study/bean/course/StudyStatus;->NOT_COMPLETE:Lcom/zykj/study/bean/course/StudyStatus;

    .line 167
    .line 168
    if-ne v10, v7, :cond_9

    .line 169
    .line 170
    move/from16 v7, v22

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_9
    move v7, v13

    .line 174
    goto :goto_6

    .line 175
    :cond_a
    move-wide/from16 v23, v7

    .line 176
    .line 177
    move v7, v13

    .line 178
    move v11, v7

    .line 179
    :goto_6
    and-long v19, v2, v20

    .line 180
    .line 181
    cmp-long v8, v19, v17

    .line 182
    .line 183
    if-eqz v8, :cond_c

    .line 184
    .line 185
    if-eqz v0, :cond_b

    .line 186
    .line 187
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->getLocked()I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    goto :goto_7

    .line 192
    :cond_b
    move v0, v13

    .line 193
    :goto_7
    if-nez v0, :cond_c

    .line 194
    .line 195
    move/from16 v0, v22

    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_c
    move v0, v13

    .line 199
    goto :goto_8

    .line 200
    :cond_d
    move-wide/from16 v23, v7

    .line 201
    .line 202
    move v0, v13

    .line 203
    move v7, v0

    .line 204
    move v11, v7

    .line 205
    :goto_8
    and-long v19, v2, v15

    .line 206
    .line 207
    cmp-long v8, v19, v17

    .line 208
    .line 209
    if-eqz v8, :cond_13

    .line 210
    .line 211
    if-eqz v6, :cond_e

    .line 212
    .line 213
    goto :goto_9

    .line 214
    :cond_e
    move/from16 v22, v0

    .line 215
    .line 216
    :goto_9
    if-eqz v8, :cond_10

    .line 217
    .line 218
    if-eqz v22, :cond_f

    .line 219
    .line 220
    const-wide/16 v19, 0x140

    .line 221
    .line 222
    :goto_a
    or-long v2, v2, v19

    .line 223
    .line 224
    goto :goto_b

    .line 225
    :cond_f
    const-wide/16 v19, 0xa0

    .line 226
    .line 227
    goto :goto_a

    .line 228
    :cond_10
    :goto_b
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mboundView1:Landroid/widget/ImageView;

    .line 229
    .line 230
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    if-eqz v22, :cond_11

    .line 235
    .line 236
    sget v6, Lcom/zykj/study/R$drawable;->ic_catalog:I

    .line 237
    .line 238
    :goto_c
    invoke-static {v0, v6}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    move-object v12, v0

    .line 243
    goto :goto_d

    .line 244
    :cond_11
    sget v6, Lcom/zykj/study/R$drawable;->ic_catalog_unable:I

    .line 245
    .line 246
    goto :goto_c

    .line 247
    :goto_d
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 248
    .line 249
    if-eqz v22, :cond_12

    .line 250
    .line 251
    sget v6, Lcom/zykj/message/client/R$color;->black_text:I

    .line 252
    .line 253
    :goto_e
    invoke-static {v0, v6}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    goto :goto_f

    .line 258
    :cond_12
    sget v6, Lcom/zykj/view/R$color;->app_white_gray:I

    .line 259
    .line 260
    goto :goto_e

    .line 261
    :cond_13
    move v0, v13

    .line 262
    :goto_f
    and-long v19, v2, v23

    .line 263
    .line 264
    cmp-long v6, v19, v17

    .line 265
    .line 266
    if-eqz v6, :cond_15

    .line 267
    .line 268
    if-eqz v14, :cond_14

    .line 269
    .line 270
    goto :goto_10

    .line 271
    :cond_14
    move v7, v13

    .line 272
    :goto_10
    if-eqz v14, :cond_16

    .line 273
    .line 274
    move v13, v11

    .line 275
    goto :goto_11

    .line 276
    :cond_15
    move v7, v13

    .line 277
    :cond_16
    :goto_11
    if-eqz v6, :cond_17

    .line 278
    .line 279
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->ivProgressComplete:Landroid/widget/ImageView;

    .line 280
    .line 281
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    invoke-static {v6, v8}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 286
    .line 287
    .line 288
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->ivProgressNotComplete:Landroid/widget/ImageView;

    .line 289
    .line 290
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    invoke-static {v6, v7}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 295
    .line 296
    .line 297
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 298
    .line 299
    invoke-static {v6, v5}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 300
    .line 301
    .line 302
    iget-object v5, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->tvProgress:Landroid/widget/TextView;

    .line 303
    .line 304
    invoke-static {v5, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 305
    .line 306
    .line 307
    iget-object v4, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->tvProgress:Landroid/widget/TextView;

    .line 308
    .line 309
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    invoke-static {v4, v5}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 314
    .line 315
    .line 316
    :cond_17
    and-long/2addr v2, v15

    .line 317
    cmp-long v2, v2, v17

    .line 318
    .line 319
    if-eqz v2, :cond_18

    .line 320
    .line 321
    iget-object v2, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mboundView1:Landroid/widget/ImageView;

    .line 322
    .line 323
    invoke-static {v2, v12}, Landroidx/databinding/adapters/ImageViewBindingAdapter;->setImageDrawable(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 324
    .line 325
    .line 326
    iget-object v2, v1, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 327
    .line 328
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 329
    .line 330
    .line 331
    :cond_18
    return-void

    .line 332
    :catchall_0
    move-exception v0

    .line 333
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 334
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mDirtyFlags:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    monitor-exit p0

    .line 12
    return v0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit p0

    .line 16
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x4

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v0
.end method

.method public onFieldChange(ILjava/lang/Object;I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public setEntity(Lcom/zykj/study/bean/course/CatalogBean;)V
    .locals 4
    .param p1    # Lcom/zykj/study/bean/course/CatalogBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->mEntity:Lcom/zykj/study/bean/course/CatalogBean;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0xf

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method

.method public setIsTeacher(Ljava/lang/Boolean;)V
    .locals 4
    .param p1    # Ljava/lang/Boolean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->mIsTeacher:Ljava/lang/Boolean;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x2

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x1d

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    check-cast p2, Lcom/zykj/study/bean/course/CatalogBean;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->setEntity(Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    const/16 v0, 0x1d

    .line 13
    .line 14
    if-ne v0, p1, :cond_1

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemKnowledgeProgressBindingImpl;->setIsTeacher(Ljava/lang/Boolean;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
.end method
