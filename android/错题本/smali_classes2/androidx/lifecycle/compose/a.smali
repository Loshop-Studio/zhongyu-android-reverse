.class public final synthetic Landroidx/lifecycle/compose/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/main/MainShellViewModel;Lr6/a;Lr6/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x7

    iput v0, p0, Landroidx/lifecycle/compose/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/compose/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/compose/a;->d:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/compose/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p3, p0, Landroidx/lifecycle/compose/a;->a:I

    iput-object p1, p0, Landroidx/lifecycle/compose/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/compose/a;->c:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/lifecycle/compose/a;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/lifecycle/compose/a;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Landroidx/lifecycle/compose/a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 11
    .line 12
    iget-object v2, v0, Landroidx/lifecycle/compose/a;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lr6/a;

    .line 15
    .line 16
    iget-object v3, v0, Landroidx/lifecycle/compose/a;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lr6/a;

    .line 19
    .line 20
    iget-object v4, v1, Lcom/zykj/mistake/main/MainShellViewModel;->a:Lkotlinx/coroutines/flow/n0;

    .line 21
    .line 22
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Lcom/zykj/mistake/main/m;

    .line 27
    .line 28
    iget-object v4, v4, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    .line 29
    .line 30
    instance-of v4, v4, Lcom/zykj/mistake/main/b;

    .line 31
    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    sget-object v2, Lcom/zykj/mistake/main/c0;->a:Lcom/zykj/mistake/main/c0;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {v2}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    invoke-interface {v3}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :cond_1
    :goto_0
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 56
    .line 57
    return-object v1

    .line 58
    :pswitch_0
    iget-object v1, v0, Landroidx/lifecycle/compose/a;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 61
    .line 62
    iget-object v2, v0, Landroidx/lifecycle/compose/a;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 65
    .line 66
    iget-object v3, v0, Landroidx/lifecycle/compose/a;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, Lcom/zykj/mistake/feature/notebook/list/l0;

    .line 69
    .line 70
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/list/e1;->j:Ljava/util/Set;

    .line 71
    .line 72
    iget-object v4, v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 73
    .line 74
    :goto_1
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    move-object v6, v5

    .line 79
    check-cast v6, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 80
    .line 81
    iget-object v7, v6, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 82
    .line 83
    new-instance v10, Ljava/util/ArrayList;

    .line 84
    .line 85
    const/16 v8, 0xa

    .line 86
    .line 87
    invoke-static {v7, v8}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    invoke-direct {v10, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_3

    .line 103
    .line 104
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    check-cast v8, Lp4/b;

    .line 109
    .line 110
    iget-object v9, v8, Lp4/b;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    if-eqz v9, :cond_2

    .line 117
    .line 118
    iget-object v9, v3, Lcom/zykj/mistake/feature/notebook/list/l0;->e:Ljava/util/ArrayList;

    .line 119
    .line 120
    iget-object v12, v8, Lp4/b;->a:Ljava/lang/String;

    .line 121
    .line 122
    iget v13, v8, Lp4/b;->b:I

    .line 123
    .line 124
    iget v14, v8, Lp4/b;->c:I

    .line 125
    .line 126
    move-object/from16 v32, v6

    .line 127
    .line 128
    move-object/from16 v33, v7

    .line 129
    .line 130
    iget-wide v6, v8, Lp4/b;->d:J

    .line 131
    .line 132
    iget-object v11, v8, Lp4/b;->e:Lcoil3/network/g;

    .line 133
    .line 134
    iget-object v15, v8, Lp4/b;->f:Ljava/lang/String;

    .line 135
    .line 136
    move-object/from16 v34, v1

    .line 137
    .line 138
    iget-object v1, v8, Lp4/b;->g:Ljava/lang/String;

    .line 139
    .line 140
    move-object/from16 v35, v3

    .line 141
    .line 142
    iget-object v3, v8, Lp4/b;->h:Ljava/lang/String;

    .line 143
    .line 144
    move-wide/from16 v16, v6

    .line 145
    .line 146
    iget-object v6, v8, Lp4/b;->i:Ljava/lang/String;

    .line 147
    .line 148
    iget-boolean v7, v8, Lp4/b;->j:Z

    .line 149
    .line 150
    move/from16 v22, v7

    .line 151
    .line 152
    iget-boolean v7, v8, Lp4/b;->k:Z

    .line 153
    .line 154
    move/from16 v23, v7

    .line 155
    .line 156
    iget-boolean v7, v8, Lp4/b;->l:Z

    .line 157
    .line 158
    move/from16 v24, v7

    .line 159
    .line 160
    iget-boolean v7, v8, Lp4/b;->m:Z

    .line 161
    .line 162
    move/from16 v25, v7

    .line 163
    .line 164
    iget-boolean v7, v8, Lp4/b;->n:Z

    .line 165
    .line 166
    move/from16 v26, v7

    .line 167
    .line 168
    iget-object v7, v8, Lp4/b;->o:Ljava/util/Set;

    .line 169
    .line 170
    move-object/from16 v28, v9

    .line 171
    .line 172
    iget v9, v8, Lp4/b;->q:I

    .line 173
    .line 174
    move/from16 v29, v9

    .line 175
    .line 176
    iget v9, v8, Lp4/b;->r:I

    .line 177
    .line 178
    iget-object v8, v8, Lp4/b;->s:Ljava/lang/String;

    .line 179
    .line 180
    move-object/from16 v31, v8

    .line 181
    .line 182
    const-string v8, "id"

    .line 183
    .line 184
    invoke-static {v12, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    const-string/jumbo v8, "subject"

    .line 188
    .line 189
    .line 190
    invoke-static {v15, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const-string v8, "examName"

    .line 194
    .line 195
    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    const-string/jumbo v8, "title"

    .line 199
    .line 200
    .line 201
    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    const-string/jumbo v8, "stemShoot"

    .line 205
    .line 206
    .line 207
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    const-string v8, "collectionIds"

    .line 211
    .line 212
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    move-object/from16 v18, v15

    .line 216
    .line 217
    move-wide/from16 v15, v16

    .line 218
    .line 219
    move-object/from16 v17, v11

    .line 220
    .line 221
    new-instance v11, Lp4/b;

    .line 222
    .line 223
    move-object/from16 v19, v1

    .line 224
    .line 225
    move-object/from16 v20, v3

    .line 226
    .line 227
    move-object/from16 v21, v6

    .line 228
    .line 229
    move-object/from16 v27, v7

    .line 230
    .line 231
    move/from16 v30, v9

    .line 232
    .line 233
    invoke-direct/range {v11 .. v31}, Lp4/b;-><init>(Ljava/lang/String;IIJLcoil3/network/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/util/Set;Ljava/util/List;IILjava/lang/String;)V

    .line 234
    .line 235
    .line 236
    move-object v8, v11

    .line 237
    goto :goto_3

    .line 238
    :cond_2
    move-object/from16 v34, v1

    .line 239
    .line 240
    move-object/from16 v35, v3

    .line 241
    .line 242
    move-object/from16 v32, v6

    .line 243
    .line 244
    move-object/from16 v33, v7

    .line 245
    .line 246
    :goto_3
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-object/from16 v6, v32

    .line 250
    .line 251
    move-object/from16 v7, v33

    .line 252
    .line 253
    move-object/from16 v1, v34

    .line 254
    .line 255
    move-object/from16 v3, v35

    .line 256
    .line 257
    goto/16 :goto_2

    .line 258
    .line 259
    :cond_3
    move-object/from16 v34, v1

    .line 260
    .line 261
    move-object/from16 v35, v3

    .line 262
    .line 263
    move-object/from16 v32, v6

    .line 264
    .line 265
    sget-object v15, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 266
    .line 267
    const/16 v29, 0x0

    .line 268
    .line 269
    const v30, 0x1fffcf7

    .line 270
    .line 271
    .line 272
    const/4 v7, 0x0

    .line 273
    const/4 v8, 0x0

    .line 274
    const/4 v9, 0x0

    .line 275
    const/4 v11, 0x0

    .line 276
    const/4 v12, 0x0

    .line 277
    const/4 v13, 0x0

    .line 278
    const/4 v14, 0x0

    .line 279
    const/16 v16, 0x0

    .line 280
    .line 281
    const/16 v17, 0x0

    .line 282
    .line 283
    const/16 v18, 0x0

    .line 284
    .line 285
    const/16 v19, 0x0

    .line 286
    .line 287
    const/16 v20, 0x0

    .line 288
    .line 289
    const/16 v21, 0x0

    .line 290
    .line 291
    const/16 v22, 0x0

    .line 292
    .line 293
    const/16 v23, 0x0

    .line 294
    .line 295
    const/16 v24, 0x0

    .line 296
    .line 297
    const/16 v25, 0x0

    .line 298
    .line 299
    const/16 v26, 0x0

    .line 300
    .line 301
    const/16 v27, 0x0

    .line 302
    .line 303
    const/16 v28, 0x0

    .line 304
    .line 305
    invoke-static/range {v6 .. v30}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-virtual {v4, v5, v1}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    if-eqz v1, :cond_4

    .line 314
    .line 315
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 316
    .line 317
    sget v3, Lcom/zykj/mistake/R$string;->set_tag_success:I

    .line 318
    .line 319
    invoke-virtual {v2}, Landroidx/lifecycle/AndroidViewModel;->getApplication()Landroid/app/Application;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-virtual {v4, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    const-string v4, "getString(...)"

    .line 328
    .line 329
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-direct {v1, v3}, Lcom/zykj/mistake/feature/notebook/list/x;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 336
    .line 337
    .line 338
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 339
    .line 340
    return-object v1

    .line 341
    :cond_4
    move-object/from16 v1, v34

    .line 342
    .line 343
    move-object/from16 v3, v35

    .line 344
    .line 345
    goto/16 :goto_1

    .line 346
    .line 347
    :pswitch_1
    iget-object v1, v0, Landroidx/lifecycle/compose/a;->b:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 350
    .line 351
    iget-object v2, v0, Landroidx/lifecycle/compose/a;->c:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 354
    .line 355
    iget-object v3, v0, Landroidx/lifecycle/compose/a;->d:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v3, Ljava/lang/String;

    .line 358
    .line 359
    iget-object v4, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 360
    .line 361
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    check-cast v5, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 366
    .line 367
    iget v5, v5, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 368
    .line 369
    iget v2, v2, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 370
    .line 371
    sget-object v6, Lcom/zykj/mistake/feature/notebook/detail/x0;->a:Lcom/zykj/mistake/feature/notebook/detail/x0;

    .line 372
    .line 373
    if-eq v5, v2, :cond_5

    .line 374
    .line 375
    invoke-virtual {v1, v6}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 376
    .line 377
    .line 378
    goto :goto_4

    .line 379
    :cond_5
    invoke-virtual {v1, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->J(Ljava/lang/String;)Lcom/zykj/mistake/feature/notebook/detail/c4;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1, v6}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 390
    .line 391
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->T(Lcom/zykj/mistake/feature/notebook/detail/m3;)V

    .line 392
    .line 393
    .line 394
    :goto_4
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 395
    .line 396
    return-object v1

    .line 397
    :pswitch_2
    iget-object v1, v0, Landroidx/lifecycle/compose/a;->b:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 400
    .line 401
    iget-object v2, v0, Landroidx/lifecycle/compose/a;->c:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/k1;

    .line 404
    .line 405
    iget-object v3, v0, Landroidx/lifecycle/compose/a;->d:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v3, Lcom/zykj/mistake/dialog/ImageDialogFragment;

    .line 408
    .line 409
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/y2;

    .line 410
    .line 411
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/c1;

    .line 412
    .line 413
    iget-object v2, v2, Lcom/zykj/mistake/feature/notebook/detail/c1;->a:Ljava/lang/String;

    .line 414
    .line 415
    invoke-direct {v4, v2}, Lcom/zykj/mistake/feature/notebook/detail/y2;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1, v4}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->t(Lcom/zykj/mistake/feature/notebook/detail/i3;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v3}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->dismiss()V

    .line 422
    .line 423
    .line 424
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 425
    .line 426
    return-object v1

    .line 427
    :pswitch_3
    iget-object v1, v0, Landroidx/lifecycle/compose/a;->b:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 430
    .line 431
    iget-object v2, v0, Landroidx/lifecycle/compose/a;->c:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v2, Lr6/c;

    .line 434
    .line 435
    iget-object v3, v0, Landroidx/lifecycle/compose/a;->d:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v3, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 438
    .line 439
    iget-boolean v4, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->M:Z

    .line 440
    .line 441
    if-nez v4, :cond_8

    .line 442
    .line 443
    iget-boolean v4, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->L:Z

    .line 444
    .line 445
    sget-object v5, Lcom/zykj/mistake/feature/notebook/detail/h3;->a:Lcom/zykj/mistake/feature/notebook/detail/h3;

    .line 446
    .line 447
    if-eqz v4, :cond_7

    .line 448
    .line 449
    invoke-static {v1}, Lcom/zykj/mistake/feature/notebook/detail/g0;->k(Lcom/zykj/mistake/feature/notebook/detail/m3;)Z

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    if-eqz v1, :cond_6

    .line 454
    .line 455
    invoke-interface {v2, v5}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    goto :goto_5

    .line 459
    :cond_6
    new-instance v1, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 460
    .line 461
    const/16 v4, 0x1b

    .line 462
    .line 463
    invoke-direct {v1, v2, v4}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v3, v1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->k(Lr6/c;)V

    .line 467
    .line 468
    .line 469
    goto :goto_5

    .line 470
    :cond_7
    invoke-interface {v2, v5}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    :cond_8
    :goto_5
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 474
    .line 475
    return-object v1

    .line 476
    :pswitch_4
    iget-object v1, v0, Landroidx/lifecycle/compose/a;->b:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v1, Lr6/e;

    .line 479
    .line 480
    iget-object v2, v0, Landroidx/lifecycle/compose/a;->c:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v2, Ljava/lang/String;

    .line 483
    .line 484
    iget-object v3, v0, Landroidx/lifecycle/compose/a;->d:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v3, Ljava/lang/String;

    .line 487
    .line 488
    invoke-interface {v1, v2, v3}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 492
    .line 493
    return-object v1

    .line 494
    :pswitch_5
    iget-object v1, v0, Landroidx/lifecycle/compose/a;->b:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v1, Lr6/c;

    .line 497
    .line 498
    iget-object v2, v0, Landroidx/lifecycle/compose/a;->c:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v2, Lcom/zykj/mistake/feature/ask/n;

    .line 501
    .line 502
    iget-object v3, v0, Landroidx/lifecycle/compose/a;->d:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v3, Lcom/zykj/mistake/feature/ask/y;

    .line 505
    .line 506
    new-instance v4, Lcom/zykj/mistake/feature/ask/s;

    .line 507
    .line 508
    iget-object v2, v2, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 509
    .line 510
    iget-object v3, v3, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

    .line 511
    .line 512
    invoke-direct {v4, v2, v3}, Lcom/zykj/mistake/feature/ask/s;-><init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    invoke-interface {v1, v4}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 519
    .line 520
    return-object v1

    .line 521
    :pswitch_6
    iget-object v1, v0, Landroidx/lifecycle/compose/a;->b:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v1, Landroidx/lifecycle/LifecycleOwner;

    .line 524
    .line 525
    iget-object v2, v0, Landroidx/lifecycle/compose/a;->c:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast v2, Landroidx/lifecycle/Lifecycle$State;

    .line 528
    .line 529
    iget-object v3, v0, Landroidx/lifecycle/compose/a;->d:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v3, Lr6/a;

    .line 532
    .line 533
    invoke-static {v1, v2, v3}, Landroidx/lifecycle/compose/DropUnlessLifecycleKt;->a(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lr6/a;)Ld6/s;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    return-object v1

    .line 538
    nop

    .line 539
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
