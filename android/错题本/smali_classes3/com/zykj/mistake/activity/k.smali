.class public final synthetic Lcom/zykj/mistake/activity/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lcom/zykj/mistake/entity/resp/CustomTagInfo;

.field public final synthetic d:Lcom/zykj/mistake/base/BaseMVPActivity;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lcom/zykj/mistake/base/BaseMVPActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/zykj/mistake/activity/k;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/k;->b:Landroid/view/View;

    iput-object p2, p0, Lcom/zykj/mistake/activity/k;->d:Lcom/zykj/mistake/base/BaseMVPActivity;

    iput-object p3, p0, Lcom/zykj/mistake/activity/k;->c:Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 11

    .line 1
    iget p1, p0, Lcom/zykj/mistake/activity/k;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "null cannot be cast to non-null type com.zykj.mistake.widget.FlowLayout"

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, -0x1

    .line 9
    iget-object v5, p0, Lcom/zykj/mistake/activity/k;->c:Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 10
    .line 11
    iget-object v6, p0, Lcom/zykj/mistake/activity/k;->d:Lcom/zykj/mistake/base/BaseMVPActivity;

    .line 12
    .line 13
    iget-object v7, p0, Lcom/zykj/mistake/activity/k;->b:Landroid/view/View;

    .line 14
    .line 15
    packed-switch p1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v6, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 19
    .line 20
    sget p1, Lcom/zykj/mistake/activity/MistakeListActivity;->x:I

    .line 21
    .line 22
    invoke-virtual {v7}, Landroid/view/View;->isSelected()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {v7, v2}, Landroid/view/View;->setSelected(Z)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeListActivity;->t:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    :cond_0
    if-ge v2, v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    move-object v3, v1

    .line 46
    check-cast v3, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 47
    .line 48
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 49
    .line 50
    .line 51
    move-result-wide v6

    .line 52
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 53
    .line 54
    .line 55
    move-result-wide v8

    .line 56
    cmp-long v4, v6, v8

    .line 57
    .line 58
    if-nez v4, :cond_0

    .line 59
    .line 60
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_1
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 79
    .line 80
    const-string v0, "Collection contains no element matching the predicate."

    .line 81
    .line 82
    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_2
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eq p1, v4, :cond_7

    .line 91
    .line 92
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    check-cast p1, Lcom/zykj/mistake/widget/FlowLayout;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    move v1, v2

    .line 106
    :goto_0
    if-ge v1, v0, :cond_3

    .line 107
    .line 108
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v3, v2}, Landroid/view/View;->setSelected(Z)V

    .line 113
    .line 114
    .line 115
    add-int/lit8 v1, v1, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_3
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeListActivity;->t:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    move v1, v4

    .line 125
    :goto_1
    if-ge v2, v0, :cond_5

    .line 126
    .line 127
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    check-cast v3, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 132
    .line 133
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    if-ne v3, v8, :cond_4

    .line 142
    .line 143
    move v1, v2

    .line 144
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_5
    if-eq v1, v4, :cond_6

    .line 148
    .line 149
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6, v7, v5}, Lcom/zykj/mistake/activity/MistakeListActivity;->C(Landroid/view/View;Lcom/zykj/mistake/entity/resp/CustomTagInfo;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    iget v0, v6, Lcom/zykj/mistake/activity/MistakeListActivity;->v:I

    .line 161
    .line 162
    if-ge p1, v0, :cond_8

    .line 163
    .line 164
    invoke-virtual {v6, v7, v5}, Lcom/zykj/mistake/activity/MistakeListActivity;->C(Landroid/view/View;Lcom/zykj/mistake/entity/resp/CustomTagInfo;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_7
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeListActivity;->t:Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    iget v0, v6, Lcom/zykj/mistake/activity/MistakeListActivity;->v:I

    .line 175
    .line 176
    if-ge p1, v0, :cond_8

    .line 177
    .line 178
    invoke-virtual {v6, v7, v5}, Lcom/zykj/mistake/activity/MistakeListActivity;->C(Landroid/view/View;Lcom/zykj/mistake/entity/resp/CustomTagInfo;)V

    .line 179
    .line 180
    .line 181
    :cond_8
    :goto_2
    return-void

    .line 182
    :pswitch_0
    check-cast v6, Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 183
    .line 184
    sget p1, Lcom/zykj/mistake/activity/MistakeDetailActivity;->s:I

    .line 185
    .line 186
    invoke-virtual {v7}, Landroid/view/View;->isSelected()Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-eqz p1, :cond_b

    .line 191
    .line 192
    invoke-virtual {v7, v2}, Landroid/view/View;->setSelected(Z)V

    .line 193
    .line 194
    .line 195
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeDetailActivity;->i:Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    :cond_9
    if-ge v2, v1, :cond_a

    .line 202
    .line 203
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    add-int/lit8 v2, v2, 0x1

    .line 208
    .line 209
    move-object v4, v3

    .line 210
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 211
    .line 212
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 213
    .line 214
    .line 215
    move-result-wide v7

    .line 216
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 217
    .line 218
    .line 219
    move-result-wide v9

    .line 220
    cmp-long v7, v7, v9

    .line 221
    .line 222
    if-nez v7, :cond_9

    .line 223
    .line 224
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    if-ne v7, v8, :cond_9

    .line 233
    .line 234
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-eqz v4, :cond_9

    .line 247
    .line 248
    move-object v0, v3

    .line 249
    :cond_a
    check-cast v0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 250
    .line 251
    if-eqz v0, :cond_11

    .line 252
    .line 253
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeDetailActivity;->i:Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    goto/16 :goto_5

    .line 259
    .line 260
    :cond_b
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    if-eq p1, v4, :cond_10

    .line 265
    .line 266
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    check-cast p1, Lcom/zykj/mistake/widget/FlowLayout;

    .line 274
    .line 275
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    move v1, v2

    .line 280
    :goto_3
    if-ge v1, v0, :cond_c

    .line 281
    .line 282
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    invoke-virtual {v8, v2}, Landroid/view/View;->setSelected(Z)V

    .line 287
    .line 288
    .line 289
    add-int/lit8 v1, v1, 0x1

    .line 290
    .line 291
    goto :goto_3

    .line 292
    :cond_c
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeDetailActivity;->i:Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    move v1, v4

    .line 299
    :goto_4
    if-ge v2, v0, :cond_e

    .line 300
    .line 301
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    check-cast v8, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 306
    .line 307
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 308
    .line 309
    .line 310
    move-result v8

    .line 311
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 312
    .line 313
    .line 314
    move-result v9

    .line 315
    if-ne v8, v9, :cond_d

    .line 316
    .line 317
    move v1, v2

    .line 318
    :cond_d
    add-int/lit8 v2, v2, 0x1

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_e
    if-eq v1, v4, :cond_f

    .line 322
    .line 323
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v7, v3}, Landroid/view/View;->setSelected(Z)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    goto :goto_5

    .line 333
    :cond_f
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    iget v1, v6, Lcom/zykj/mistake/activity/MistakeDetailActivity;->j:I

    .line 338
    .line 339
    if-ge v0, v1, :cond_11

    .line 340
    .line 341
    invoke-virtual {v7, v3}, Landroid/view/View;->setSelected(Z)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_10
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeDetailActivity;->i:Ljava/util/ArrayList;

    .line 349
    .line 350
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 351
    .line 352
    .line 353
    move-result p1

    .line 354
    iget v0, v6, Lcom/zykj/mistake/activity/MistakeDetailActivity;->j:I

    .line 355
    .line 356
    if-ge p1, v0, :cond_11

    .line 357
    .line 358
    invoke-virtual {v7, v3}, Landroid/view/View;->setSelected(Z)V

    .line 359
    .line 360
    .line 361
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeDetailActivity;->i:Ljava/util/ArrayList;

    .line 362
    .line 363
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    :cond_11
    :goto_5
    return-void

    .line 367
    :pswitch_1
    check-cast v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 368
    .line 369
    sget p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 370
    .line 371
    invoke-virtual {v7}, Landroid/view/View;->isSelected()Z

    .line 372
    .line 373
    .line 374
    move-result p1

    .line 375
    if-eqz p1, :cond_14

    .line 376
    .line 377
    invoke-virtual {v7, v2}, Landroid/view/View;->setSelected(Z)V

    .line 378
    .line 379
    .line 380
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->h:Ljava/util/ArrayList;

    .line 381
    .line 382
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    :cond_12
    if-ge v2, v1, :cond_13

    .line 387
    .line 388
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    add-int/lit8 v2, v2, 0x1

    .line 393
    .line 394
    move-object v4, v3

    .line 395
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 396
    .line 397
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 398
    .line 399
    .line 400
    move-result-wide v7

    .line 401
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 402
    .line 403
    .line 404
    move-result-wide v9

    .line 405
    cmp-long v7, v7, v9

    .line 406
    .line 407
    if-nez v7, :cond_12

    .line 408
    .line 409
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 410
    .line 411
    .line 412
    move-result v7

    .line 413
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    if-ne v7, v8, :cond_12

    .line 418
    .line 419
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v7

    .line 427
    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v4

    .line 431
    if-eqz v4, :cond_12

    .line 432
    .line 433
    move-object v0, v3

    .line 434
    :cond_13
    check-cast v0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 435
    .line 436
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->h:Ljava/util/ArrayList;

    .line 437
    .line 438
    invoke-static {p1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Object;)Ljava/util/Collection;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    invoke-interface {p1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    goto :goto_7

    .line 446
    :cond_14
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 447
    .line 448
    .line 449
    move-result p1

    .line 450
    if-eq p1, v4, :cond_18

    .line 451
    .line 452
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->h:Ljava/util/ArrayList;

    .line 453
    .line 454
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    move v1, v4

    .line 459
    :goto_6
    if-ge v2, v0, :cond_16

    .line 460
    .line 461
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    check-cast v3, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 466
    .line 467
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 472
    .line 473
    .line 474
    move-result v8

    .line 475
    if-ne v3, v8, :cond_15

    .line 476
    .line 477
    move v1, v2

    .line 478
    :cond_15
    add-int/lit8 v2, v2, 0x1

    .line 479
    .line 480
    goto :goto_6

    .line 481
    :cond_16
    if-eq v1, v4, :cond_17

    .line 482
    .line 483
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    invoke-static {v7}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u(Landroid/view/View;)V

    .line 490
    .line 491
    .line 492
    goto :goto_7

    .line 493
    :cond_17
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    iget v1, v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->i:I

    .line 498
    .line 499
    if-ge v0, v1, :cond_19

    .line 500
    .line 501
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    invoke-static {v7}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u(Landroid/view/View;)V

    .line 505
    .line 506
    .line 507
    goto :goto_7

    .line 508
    :cond_18
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->h:Ljava/util/ArrayList;

    .line 509
    .line 510
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 511
    .line 512
    .line 513
    move-result p1

    .line 514
    iget v0, v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->i:I

    .line 515
    .line 516
    if-ge p1, v0, :cond_19

    .line 517
    .line 518
    invoke-virtual {v7, v3}, Landroid/view/View;->setSelected(Z)V

    .line 519
    .line 520
    .line 521
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->h:Ljava/util/ArrayList;

    .line 522
    .line 523
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    :cond_19
    :goto_7
    return-void

    .line 527
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
