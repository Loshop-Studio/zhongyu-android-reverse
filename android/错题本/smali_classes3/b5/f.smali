.class public final Lb5/f;
.super La/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/presenter/MistakeListPresenter;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/presenter/MistakeListPresenter;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb5/f;->a:Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 5
    .line 6
    iput-boolean p2, p0, Lb5/f;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/f;->a:Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final n(Ljava/lang/Object;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lcom/zykj/mistake/entity/resp/GetMyTagResp;

    .line 6
    .line 7
    const-string v2, "resp"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Lb5/f;->a:Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 13
    .line 14
    iget-object v2, v2, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 17
    .line 18
    if-eqz v2, :cond_d

    .line 19
    .line 20
    iget-object v3, v2, Lcom/zykj/mistake/activity/MistakeListActivity;->t:Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v4, v2, Lcom/zykj/mistake/activity/MistakeListActivity;->u:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/GetMyTagResp;->getResult()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-boolean v1, v0, Lb5/f;->b:Z

    .line 37
    .line 38
    const/16 v6, 0x8

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v8, 0x1

    .line 42
    if-eqz v1, :cond_c

    .line 43
    .line 44
    iput-boolean v8, v2, Lcom/zykj/mistake/activity/MistakeListActivity;->w:Z

    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 51
    .line 52
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 53
    .line 54
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->h:Landroid/widget/TextView;

    .line 55
    .line 56
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 64
    .line 65
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 66
    .line 67
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->c:Lcom/zykj/mistake/widget/FlowLayout;

    .line 68
    .line 69
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 77
    .line 78
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 79
    .line 80
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->j:Landroid/widget/TextView;

    .line 81
    .line 82
    sget v9, Lcom/zykj/mistake/R$string;->filter:I

    .line 83
    .line 84
    invoke-virtual {v2, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 96
    .line 97
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 98
    .line 99
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->a:Landroid/widget/TextView;

    .line 100
    .line 101
    sget v9, Lcom/zykj/mistake/R$string;->reset:I

    .line 102
    .line 103
    invoke-virtual {v2, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 115
    .line 116
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 117
    .line 118
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->i:Landroid/widget/TextView;

    .line 119
    .line 120
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 121
    .line 122
    .line 123
    new-instance v1, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    iget-object v6, v2, Lcom/zykj/mistake/activity/MistakeListActivity;->n:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 129
    .line 130
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getHaveNoTag()Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    if-eqz v9, :cond_1

    .line 135
    .line 136
    new-instance v10, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 137
    .line 138
    sget v9, Lcom/zykj/mistake/R$string;->no_tag:I

    .line 139
    .line 140
    invoke-virtual {v2, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    const-string v9, "getString(...)"

    .line 145
    .line 146
    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    const/16 v16, 0x6

    .line 150
    .line 151
    const/16 v17, 0x0

    .line 152
    .line 153
    const-wide/16 v12, 0x0

    .line 154
    .line 155
    const/4 v14, 0x0

    .line 156
    const/4 v15, 0x3

    .line 157
    invoke-direct/range {v10 .. v17}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    :cond_1
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getDiff()Ljava/util/ArrayList;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-nez v9, :cond_3

    .line 172
    .line 173
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getDiff()Ljava/util/ArrayList;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    check-cast v9, Ljava/lang/Integer;

    .line 182
    .line 183
    if-nez v9, :cond_2

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_2
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    if-eqz v9, :cond_3

    .line 191
    .line 192
    :goto_0
    new-instance v10, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 193
    .line 194
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getDiff()Ljava/util/ArrayList;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    check-cast v9, Ljava/lang/Number;

    .line 203
    .line 204
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    sub-int/2addr v9, v8

    .line 209
    sget-object v11, Lcom/zykj/mistake/utils/d;->a:[Ljava/lang/String;

    .line 210
    .line 211
    aget-object v11, v11, v9

    .line 212
    .line 213
    const/16 v16, 0x6

    .line 214
    .line 215
    const/16 v17, 0x0

    .line 216
    .line 217
    const-wide/16 v12, 0x0

    .line 218
    .line 219
    const/4 v14, 0x0

    .line 220
    const/4 v15, 0x0

    .line 221
    invoke-direct/range {v10 .. v17}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    :cond_3
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getAttainedLevel()Ljava/util/ArrayList;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-nez v9, :cond_5

    .line 236
    .line 237
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getAttainedLevel()Ljava/util/ArrayList;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    check-cast v9, Ljava/lang/Integer;

    .line 246
    .line 247
    if-nez v9, :cond_4

    .line 248
    .line 249
    goto :goto_1

    .line 250
    :cond_4
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    if-eqz v9, :cond_5

    .line 255
    .line 256
    :goto_1
    new-instance v10, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 257
    .line 258
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getAttainedLevel()Ljava/util/ArrayList;

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    check-cast v9, Ljava/lang/Number;

    .line 267
    .line 268
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result v9

    .line 272
    sub-int/2addr v9, v8

    .line 273
    sget-object v11, Lcom/zykj/mistake/utils/d;->b:[Ljava/lang/String;

    .line 274
    .line 275
    aget-object v11, v11, v9

    .line 276
    .line 277
    const/16 v16, 0x6

    .line 278
    .line 279
    const/16 v17, 0x0

    .line 280
    .line 281
    const-wide/16 v12, 0x0

    .line 282
    .line 283
    const/4 v14, 0x0

    .line 284
    const/4 v15, 0x1

    .line 285
    invoke-direct/range {v10 .. v17}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    :cond_5
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getErrorReason()Ljava/util/ArrayList;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    if-nez v9, :cond_7

    .line 300
    .line 301
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getErrorReason()Ljava/util/ArrayList;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    check-cast v9, Ljava/lang/Integer;

    .line 310
    .line 311
    if-nez v9, :cond_6

    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_6
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    if-eqz v9, :cond_7

    .line 319
    .line 320
    :goto_2
    new-instance v10, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 321
    .line 322
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getErrorReason()Ljava/util/ArrayList;

    .line 323
    .line 324
    .line 325
    move-result-object v9

    .line 326
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v9

    .line 330
    check-cast v9, Ljava/lang/Number;

    .line 331
    .line 332
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    sub-int/2addr v9, v8

    .line 337
    sget-object v8, Lcom/zykj/mistake/utils/d;->c:[Ljava/lang/String;

    .line 338
    .line 339
    aget-object v11, v8, v9

    .line 340
    .line 341
    const/16 v16, 0x6

    .line 342
    .line 343
    const/16 v17, 0x0

    .line 344
    .line 345
    const-wide/16 v12, 0x0

    .line 346
    .line 347
    const/4 v14, 0x0

    .line 348
    const/4 v15, 0x2

    .line 349
    invoke-direct/range {v10 .. v17}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    :cond_7
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getTagIdList()Ljava/util/ArrayList;

    .line 356
    .line 357
    .line 358
    move-result-object v8

    .line 359
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 360
    .line 361
    .line 362
    move-result v9

    .line 363
    move v10, v7

    .line 364
    :goto_3
    if-ge v10, v9, :cond_a

    .line 365
    .line 366
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v11

    .line 370
    add-int/lit8 v10, v10, 0x1

    .line 371
    .line 372
    check-cast v11, Ljava/lang/Number;

    .line 373
    .line 374
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 375
    .line 376
    .line 377
    move-result v11

    .line 378
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    move v13, v7

    .line 383
    :goto_4
    if-ge v13, v12, :cond_9

    .line 384
    .line 385
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v14

    .line 389
    add-int/lit8 v13, v13, 0x1

    .line 390
    .line 391
    move-object v15, v14

    .line 392
    check-cast v15, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 393
    .line 394
    move-object/from16 v16, v6

    .line 395
    .line 396
    int-to-long v5, v11

    .line 397
    invoke-virtual {v15}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 398
    .line 399
    .line 400
    move-result-wide v17

    .line 401
    cmp-long v5, v5, v17

    .line 402
    .line 403
    if-nez v5, :cond_8

    .line 404
    .line 405
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-object/from16 v6, v16

    .line 409
    .line 410
    goto :goto_3

    .line 411
    :cond_8
    move-object/from16 v6, v16

    .line 412
    .line 413
    goto :goto_4

    .line 414
    :cond_9
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 415
    .line 416
    const-string v2, "Collection contains no element matching the predicate."

    .line 417
    .line 418
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    throw v1

    .line 422
    :cond_a
    move-object/from16 v16, v6

    .line 423
    .line 424
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2, v1, v7}, Lcom/zykj/mistake/activity/MistakeListActivity;->z(Ljava/util/ArrayList;Z)V

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getHaveNoTag()Z

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    if-eqz v1, :cond_b

    .line 438
    .line 439
    invoke-virtual {v2, v7}, Lcom/zykj/mistake/activity/MistakeListActivity;->A(Z)V

    .line 440
    .line 441
    .line 442
    :cond_b
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 447
    .line 448
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 449
    .line 450
    const v2, 0x800005

    .line 451
    .line 452
    .line 453
    invoke-virtual {v1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->openDrawer(I)V

    .line 454
    .line 455
    .line 456
    return-void

    .line 457
    :cond_c
    iput-boolean v7, v2, Lcom/zykj/mistake/activity/MistakeListActivity;->w:Z

    .line 458
    .line 459
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 464
    .line 465
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 466
    .line 467
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->h:Landroid/widget/TextView;

    .line 468
    .line 469
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 477
    .line 478
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 479
    .line 480
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->c:Lcom/zykj/mistake/widget/FlowLayout;

    .line 481
    .line 482
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 490
    .line 491
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 492
    .line 493
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->j:Landroid/widget/TextView;

    .line 494
    .line 495
    sget v4, Lcom/zykj/mistake/R$string;->edit_tag:I

    .line 496
    .line 497
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v4

    .line 501
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 509
    .line 510
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 511
    .line 512
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->a:Landroid/widget/TextView;

    .line 513
    .line 514
    sget v4, Lcom/zykj/mistake/R$string;->cancel:I

    .line 515
    .line 516
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v4

    .line 520
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 528
    .line 529
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 530
    .line 531
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->i:Landroid/widget/TextView;

    .line 532
    .line 533
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 534
    .line 535
    .line 536
    new-instance v1, Ljava/util/ArrayList;

    .line 537
    .line 538
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v2, v1, v8}, Lcom/zykj/mistake/activity/MistakeListActivity;->z(Ljava/util/ArrayList;Z)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 552
    .line 553
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 554
    .line 555
    const v2, 0x800005

    .line 556
    .line 557
    .line 558
    invoke-virtual {v1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->openDrawer(I)V

    .line 559
    .line 560
    .line 561
    :cond_d
    return-void
.end method
