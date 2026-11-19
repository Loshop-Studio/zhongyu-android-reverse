.class public final synthetic Lcom/zykj/mistake/activity/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/activity/MistakeDetailActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/w;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/w;->b:Lcom/zykj/mistake/activity/MistakeDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/activity/w;->a:I

    .line 4
    .line 5
    const-string v2, "mRemoveMistakeDialog"

    .line 6
    .line 7
    const-string v3, "req"

    .line 8
    .line 9
    const/4 v4, 0x6

    .line 10
    const-string v5, ""

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const-string v7, "mMorePopUpWindow"

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    iget-object v10, v0, Lcom/zykj/mistake/activity/w;->b:Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iget-object v1, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->g:Ll4/i;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    sget v2, Lcom/zykj/mistake/R$string;->add_mistake_tag:I

    .line 27
    .line 28
    invoke-virtual {v10, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, "getString(...)"

    .line 33
    .line 34
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance v3, Lcom/zykj/mistake/activity/m;

    .line 38
    .line 39
    invoke-direct {v3, v10, v8}, Lcom/zykj/mistake/activity/m;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    sget v4, Ll4/i;->d:I

    .line 43
    .line 44
    invoke-virtual {v1, v2, v5, v3}, Ll4/i;->a(Ljava/lang/String;Ljava/lang/String;Lr6/c;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    const-string v1, "mMistakeTagDialog"

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v9

    .line 54
    :pswitch_0
    sget v1, Lcom/zykj/mistake/activity/MistakeDetailActivity;->s:I

    .line 55
    .line 56
    const-string v1, "MistakeDetailShowAnswer"

    .line 57
    .line 58
    invoke-static {v4, v1, v9}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v10}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->D()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_1
    sget v1, Lcom/zykj/mistake/activity/MistakeDetailActivity;->s:I

    .line 66
    .line 67
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lcom/zykj/mistake/presenter/MistakeDetailPresenter;

    .line 72
    .line 73
    sget-object v2, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 74
    .line 75
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-interface {v2}, Lcom/zykj/mistake/network/b;->f()Lq5/e;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    new-instance v3, Lb5/d;

    .line 84
    .line 85
    const/4 v4, 0x3

    .line 86
    invoke-direct {v3, v1, v4}, Lb5/d;-><init>(Lcom/zykj/mistake/presenter/MistakeDetailPresenter;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2, v3, v8}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_2
    iget-object v1, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->e:Landroid/widget/PopupWindow;

    .line 94
    .line 95
    if-eqz v1, :cond_1

    .line 96
    .line 97
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 102
    .line 103
    iget-object v2, v2, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->f:Landroid/widget/ImageView;

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_1
    invoke-static {v7}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v9

    .line 113
    :pswitch_3
    sget v1, Lcom/zykj/mistake/activity/MistakeDetailActivity;->s:I

    .line 114
    .line 115
    invoke-virtual {v10}, Landroid/app/Activity;->finish()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_4
    iget-object v1, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->i:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 129
    .line 130
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 131
    .line 132
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 133
    .line 134
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    move v2, v6

    .line 139
    :goto_0
    if-ge v2, v1, :cond_2

    .line 140
    .line 141
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 146
    .line 147
    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 148
    .line 149
    iget-object v3, v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 150
    .line 151
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v3, v6}, Landroid/view/View;->setSelected(Z)V

    .line 156
    .line 157
    .line 158
    add-int/lit8 v2, v2, 0x1

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_2
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 166
    .line 167
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 168
    .line 169
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 170
    .line 171
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    move v2, v6

    .line 176
    :goto_1
    if-ge v2, v1, :cond_3

    .line 177
    .line 178
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 183
    .line 184
    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 185
    .line 186
    iget-object v3, v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 187
    .line 188
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v3, v6}, Landroid/view/View;->setSelected(Z)V

    .line 193
    .line 194
    .line 195
    add-int/lit8 v2, v2, 0x1

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_3
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 203
    .line 204
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 205
    .line 206
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 207
    .line 208
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    move v2, v6

    .line 213
    :goto_2
    if-ge v2, v1, :cond_4

    .line 214
    .line 215
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 220
    .line 221
    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 222
    .line 223
    iget-object v3, v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 224
    .line 225
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-virtual {v3, v6}, Landroid/view/View;->setSelected(Z)V

    .line 230
    .line 231
    .line 232
    add-int/lit8 v2, v2, 0x1

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_4
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 240
    .line 241
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 242
    .line 243
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 244
    .line 245
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    move v2, v6

    .line 250
    :goto_3
    if-ge v2, v1, :cond_5

    .line 251
    .line 252
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 257
    .line 258
    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 259
    .line 260
    iget-object v3, v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 261
    .line 262
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-virtual {v3, v6}, Landroid/view/View;->setSelected(Z)V

    .line 267
    .line 268
    .line 269
    add-int/lit8 v2, v2, 0x1

    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_5
    return-void

    .line 273
    :pswitch_5
    sget v1, Lcom/zykj/mistake/activity/MistakeDetailActivity;->s:I

    .line 274
    .line 275
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 280
    .line 281
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 282
    .line 283
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 284
    .line 285
    invoke-virtual {v1}, Lcom/zykj/mistake/widget/FlowLayout;->getFirstSelectedIndex()I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    iget-object v2, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->n:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 290
    .line 291
    const/4 v4, -0x1

    .line 292
    if-eq v1, v4, :cond_6

    .line 293
    .line 294
    add-int/2addr v1, v8

    .line 295
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    goto :goto_4

    .line 300
    :cond_6
    move-object v1, v9

    .line 301
    :goto_4
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->setDiff(Ljava/lang/Integer;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 309
    .line 310
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 311
    .line 312
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 313
    .line 314
    invoke-virtual {v1}, Lcom/zykj/mistake/widget/FlowLayout;->getFirstSelectedIndex()I

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    iget-object v2, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->n:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 319
    .line 320
    if-eq v1, v4, :cond_7

    .line 321
    .line 322
    add-int/2addr v1, v8

    .line 323
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    goto :goto_5

    .line 328
    :cond_7
    move-object v1, v9

    .line 329
    :goto_5
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->setAttainedLevel(Ljava/lang/Integer;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 337
    .line 338
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 339
    .line 340
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 341
    .line 342
    invoke-virtual {v1}, Lcom/zykj/mistake/widget/FlowLayout;->getFirstSelectedIndex()I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    iget-object v2, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->n:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 347
    .line 348
    if-eq v1, v4, :cond_8

    .line 349
    .line 350
    add-int/2addr v1, v8

    .line 351
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    :cond_8
    invoke-virtual {v2, v9}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->setErrorReason(Ljava/lang/Integer;)V

    .line 356
    .line 357
    .line 358
    iget-object v1, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->n:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 359
    .line 360
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->getTagIdList()Ljava/util/ArrayList;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 365
    .line 366
    .line 367
    iget-object v1, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->i:Ljava/util/ArrayList;

    .line 368
    .line 369
    new-instance v2, Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    move v7, v6

    .line 379
    :cond_9
    :goto_6
    if-ge v7, v5, :cond_a

    .line 380
    .line 381
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v8

    .line 385
    add-int/lit8 v7, v7, 0x1

    .line 386
    .line 387
    move-object v9, v8

    .line 388
    check-cast v9, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 389
    .line 390
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 391
    .line 392
    .line 393
    move-result v9

    .line 394
    if-ne v9, v4, :cond_9

    .line 395
    .line 396
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    goto :goto_6

    .line 400
    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    :goto_7
    if-ge v6, v1, :cond_b

    .line 405
    .line 406
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    add-int/lit8 v6, v6, 0x1

    .line 411
    .line 412
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 413
    .line 414
    iget-object v5, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->n:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 415
    .line 416
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->getTagIdList()Ljava/util/ArrayList;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 421
    .line 422
    .line 423
    move-result-wide v7

    .line 424
    long-to-int v4, v7

    .line 425
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    goto :goto_7

    .line 433
    :cond_b
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    check-cast v1, Lcom/zykj/mistake/presenter/MistakeDetailPresenter;

    .line 438
    .line 439
    iget-object v2, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->n:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 440
    .line 441
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    sget-object v3, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 445
    .line 446
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    invoke-interface {v3, v2}, Lcom/zykj/mistake/network/b;->k(Lcom/zykj/mistake/entity/req/MultiSetTagsReq;)Lq5/e;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    new-instance v3, Lb5/d;

    .line 455
    .line 456
    const/4 v4, 0x5

    .line 457
    invoke-direct {v3, v1, v4}, Lb5/d;-><init>(Lcom/zykj/mistake/presenter/MistakeDetailPresenter;I)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v1, v2, v3}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 461
    .line 462
    .line 463
    return-void

    .line 464
    :pswitch_6
    sget v1, Lcom/zykj/mistake/activity/MistakeDetailActivity;->s:I

    .line 465
    .line 466
    const-string v1, "MistakeDetailRemove"

    .line 467
    .line 468
    invoke-static {v4, v1, v9}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v10}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    check-cast v1, Lcom/zykj/mistake/presenter/MistakeDetailPresenter;

    .line 476
    .line 477
    iget-object v2, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->m:Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 478
    .line 479
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    sget-object v3, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 483
    .line 484
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    invoke-interface {v3, v2}, Lcom/zykj/mistake/network/b;->d(Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;)Lq5/e;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    new-instance v3, Lb5/d;

    .line 493
    .line 494
    const/4 v4, 0x4

    .line 495
    invoke-direct {v3, v1, v4}, Lb5/d;-><init>(Lcom/zykj/mistake/presenter/MistakeDetailPresenter;I)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v1, v2, v3}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 499
    .line 500
    .line 501
    return-void

    .line 502
    :pswitch_7
    iget-object v1, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->f:Landroid/app/Dialog;

    .line 503
    .line 504
    if-eqz v1, :cond_c

    .line 505
    .line 506
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 507
    .line 508
    .line 509
    return-void

    .line 510
    :cond_c
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    throw v9

    .line 514
    :pswitch_8
    iget-object v1, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->f:Landroid/app/Dialog;

    .line 515
    .line 516
    if-eqz v1, :cond_e

    .line 517
    .line 518
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 519
    .line 520
    .line 521
    iget-object v1, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->e:Landroid/widget/PopupWindow;

    .line 522
    .line 523
    if-eqz v1, :cond_d

    .line 524
    .line 525
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 526
    .line 527
    .line 528
    return-void

    .line 529
    :cond_d
    invoke-static {v7}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    throw v9

    .line 533
    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    throw v9

    .line 537
    :pswitch_9
    sget v1, Lcom/zykj/mistake/activity/MistakeDetailActivity;->s:I

    .line 538
    .line 539
    invoke-virtual {v10}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getNumber()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    if-nez v1, :cond_f

    .line 548
    .line 549
    goto :goto_8

    .line 550
    :cond_f
    move v8, v6

    .line 551
    :goto_8
    invoke-virtual {v10}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getId()J

    .line 556
    .line 557
    .line 558
    move-result-wide v12

    .line 559
    iget-wide v14, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->p:J

    .line 560
    .line 561
    invoke-virtual {v10}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getTitle()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    if-eqz v2, :cond_12

    .line 570
    .line 571
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 572
    .line 573
    .line 574
    move-result v3

    .line 575
    if-lez v3, :cond_10

    .line 576
    .line 577
    goto :goto_9

    .line 578
    :cond_10
    move-object v2, v9

    .line 579
    :goto_9
    if-nez v2, :cond_11

    .line 580
    .line 581
    goto :goto_a

    .line 582
    :cond_11
    move-object/from16 v16, v2

    .line 583
    .line 584
    goto :goto_b

    .line 585
    :cond_12
    :goto_a
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getSource()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    if-nez v2, :cond_11

    .line 590
    .line 591
    move-object/from16 v16, v5

    .line 592
    .line 593
    :goto_b
    iget-object v1, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 594
    .line 595
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getExtraStems()Ljava/util/ArrayList;

    .line 596
    .line 597
    .line 598
    move-result-object v19

    .line 599
    invoke-virtual {v10}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->w()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getStemShoot()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    if-nez v1, :cond_13

    .line 608
    .line 609
    move-object/from16 v18, v5

    .line 610
    .line 611
    goto :goto_c

    .line 612
    :cond_13
    move-object/from16 v18, v1

    .line 613
    .line 614
    :goto_c
    iget-object v1, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 615
    .line 616
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAnswerInfos()Ljava/util/ArrayList;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    if-eqz v1, :cond_14

    .line 621
    .line 622
    invoke-static {v1}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 627
    .line 628
    if-eqz v1, :cond_14

    .line 629
    .line 630
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    if-eqz v1, :cond_14

    .line 635
    .line 636
    :goto_d
    move-object/from16 v20, v1

    .line 637
    .line 638
    goto :goto_e

    .line 639
    :cond_14
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 640
    .line 641
    goto :goto_d

    .line 642
    :goto_e
    invoke-virtual {v10}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->u()Ljava/util/ArrayList;

    .line 643
    .line 644
    .line 645
    move-result-object v17

    .line 646
    new-instance v11, Lcom/zykj/mistake/entity/EditMistakeData;

    .line 647
    .line 648
    invoke-direct/range {v11 .. v20}, Lcom/zykj/mistake/entity/EditMistakeData;-><init>(JJLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 649
    .line 650
    .line 651
    new-instance v1, Landroid/content/Intent;

    .line 652
    .line 653
    const-class v2, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 654
    .line 655
    invoke-direct {v1, v10, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 656
    .line 657
    .line 658
    const-string v2, "isCustomMistake"

    .line 659
    .line 660
    invoke-virtual {v1, v2, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 661
    .line 662
    .line 663
    invoke-static {}, Lcom/blankj/utilcode/util/f;->a()Lcom/google/gson/g;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    invoke-virtual {v2, v11}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    const-string v3, "editMistakeData"

    .line 672
    .line 673
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v10, v1, v6}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 677
    .line 678
    .line 679
    iget-object v1, v10, Lcom/zykj/mistake/activity/MistakeDetailActivity;->e:Landroid/widget/PopupWindow;

    .line 680
    .line 681
    if-eqz v1, :cond_15

    .line 682
    .line 683
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 684
    .line 685
    .line 686
    return-void

    .line 687
    :cond_15
    invoke-static {v7}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    throw v9

    .line 691
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
