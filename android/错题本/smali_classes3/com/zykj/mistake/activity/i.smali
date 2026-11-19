.class public final synthetic Lcom/zykj/mistake/activity/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/i;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/i;->b:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lcom/zykj/mistake/activity/i;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-object v2, p0, Lcom/zykj/mistake/activity/i;->b:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v3, v2, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->p:[Ljava/lang/String;

    .line 16
    .line 17
    iget-object v4, v2, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 18
    .line 19
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->d:Landroid/widget/EditText;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v5, "getText(...)"

    .line 28
    .line 29
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lkotlin/text/p;->k0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const-string v5, "getString(...)"

    .line 41
    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    sget v0, Lcom/zykj/mistake/R$string;->mistake_info_missing:I

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_0
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v6, "isCustomMistake"

    .line 63
    .line 64
    const/4 v7, 0x1

    .line 65
    invoke-virtual {v0, v6, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v8, 0x0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    aget-object v0, v3, v8

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    aget-object v0, v3, v7

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getExtraStems()Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_1

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_2

    .line 99
    .line 100
    :cond_1
    sget v0, Lcom/zykj/mistake/R$string;->mistake_info_missing:I

    .line 101
    .line 102
    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :cond_2
    iget-object v0, v2, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->e:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    check-cast v5, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 121
    .line 122
    iget-object v5, v5, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->t:Lorg/angmarch/views/NiceSpinner;

    .line 123
    .line 124
    invoke-virtual {v5}, Lorg/angmarch/views/NiceSpinner;->getSelectedIndex()I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Lcom/zykj/mistake/entity/resp/SubjectResp$Subject;

    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/SubjectResp$Subject;->getId()J

    .line 135
    .line 136
    .line 137
    move-result-wide v9

    .line 138
    invoke-virtual {v4, v9, v10}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setTopicId(J)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 146
    .line 147
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->d:Landroid/widget/EditText;

    .line 148
    .line 149
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v4, v0}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setTitle(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    const/4 v0, 0x0

    .line 161
    invoke-virtual {v4, v0}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setDiff(Ljava/lang/Integer;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, v0}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setAttainedLevel(Ljava/lang/Integer;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v0}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setErrorReason(Ljava/lang/Integer;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getTagIdList()Ljava/util/ArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 175
    .line 176
    .line 177
    iget-object v0, v2, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->f:Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    move v9, v8

    .line 184
    :goto_0
    if-ge v9, v5, :cond_7

    .line 185
    .line 186
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    add-int/lit8 v9, v9, 0x1

    .line 191
    .line 192
    check-cast v10, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 193
    .line 194
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    const/4 v12, -0x1

    .line 199
    if-eq v11, v12, :cond_6

    .line 200
    .line 201
    if-eqz v11, :cond_5

    .line 202
    .line 203
    if-eq v11, v7, :cond_4

    .line 204
    .line 205
    if-eq v11, v1, :cond_3

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_3
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 209
    .line 210
    .line 211
    move-result-wide v10

    .line 212
    long-to-int v10, v10

    .line 213
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    invoke-virtual {v4, v10}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setErrorReason(Ljava/lang/Integer;)V

    .line 218
    .line 219
    .line 220
    goto :goto_0

    .line 221
    :cond_4
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 222
    .line 223
    .line 224
    move-result-wide v10

    .line 225
    long-to-int v10, v10

    .line 226
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    invoke-virtual {v4, v10}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setAttainedLevel(Ljava/lang/Integer;)V

    .line 231
    .line 232
    .line 233
    goto :goto_0

    .line 234
    :cond_5
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 235
    .line 236
    .line 237
    move-result-wide v10

    .line 238
    long-to-int v10, v10

    .line 239
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    invoke-virtual {v4, v10}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setDiff(Ljava/lang/Integer;)V

    .line 244
    .line 245
    .line 246
    goto :goto_0

    .line 247
    :cond_6
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getTagIdList()Ljava/util/ArrayList;

    .line 248
    .line 249
    .line 250
    move-result-object v11

    .line 251
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 252
    .line 253
    .line 254
    move-result-wide v12

    .line 255
    long-to-int v10, v12

    .line 256
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    goto :goto_0

    .line 264
    :cond_7
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0, v6, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_b

    .line 273
    .line 274
    iget-object v0, v2, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->l:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v2, v7}, Lcom/zykj/mistake/base/BaseMVPActivity;->d(Z)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    check-cast v5, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 284
    .line 285
    iget-object v5, v5, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->b:Landroid/widget/TextView;

    .line 286
    .line 287
    invoke-virtual {v5, v8}, Landroid/view/View;->setClickable(Z)V

    .line 288
    .line 289
    .line 290
    array-length v5, v3

    .line 291
    move v6, v8

    .line 292
    :goto_1
    if-ge v6, v5, :cond_a

    .line 293
    .line 294
    aget-object v9, v3, v6

    .line 295
    .line 296
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 297
    .line 298
    .line 299
    move-result v9

    .line 300
    if-lez v9, :cond_9

    .line 301
    .line 302
    array-length v1, v3

    .line 303
    :goto_2
    if-ge v8, v1, :cond_c

    .line 304
    .line 305
    aget-object v4, v3, v8

    .line 306
    .line 307
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-lez v4, :cond_8

    .line 312
    .line 313
    new-instance v4, Landroid/content/Intent;

    .line 314
    .line 315
    const-class v5, Lcom/zykj/mistake/service/UploadIntentService;

    .line 316
    .line 317
    invoke-direct {v4, v2, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 318
    .line 319
    .line 320
    const-string v5, "UPLOAD_TYPE"

    .line 321
    .line 322
    invoke-virtual {v4, v5, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 323
    .line 324
    .line 325
    new-instance v5, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    const-string v6, "/"

    .line 334
    .line 335
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    const-string v9, ".jpg"

    .line 342
    .line 343
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    const-string v9, "UPLOAD_PATH"

    .line 351
    .line 352
    invoke-virtual {v4, v9, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 353
    .line 354
    .line 355
    const-string v5, "UPLOAD_DATA"

    .line 356
    .line 357
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v9

    .line 361
    invoke-virtual {v4, v5, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 362
    .line 363
    .line 364
    const-string v5, "UPLOAD_MESSENGER"

    .line 365
    .line 366
    iget-object v9, v2, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->t:Landroid/os/Messenger;

    .line 367
    .line 368
    invoke-virtual {v4, v5, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 372
    .line 373
    .line 374
    new-instance v4, Ljava/lang/StringBuilder;

    .line 375
    .line 376
    const-string v5, "path--->> "

    .line 377
    .line 378
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    const-string v5, ".jpg, tag--->> "

    .line 391
    .line 392
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    const-string v5, "uploadImage"

    .line 403
    .line 404
    invoke-static {v5, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 405
    .line 406
    .line 407
    iget-object v4, v2, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->q:[Ljava/lang/Integer;

    .line 408
    .line 409
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    aput-object v5, v4, v8

    .line 414
    .line 415
    :cond_8
    add-int/lit8 v8, v8, 0x1

    .line 416
    .line 417
    goto :goto_2

    .line 418
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 419
    .line 420
    goto/16 :goto_1

    .line 421
    .line 422
    :cond_a
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 427
    .line 428
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-interface {v2, v4}, Lcom/zykj/mistake/network/b;->t(Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;)Lq5/e;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    new-instance v3, Lb5/b;

    .line 437
    .line 438
    invoke-direct {v3, v0, v1}, Lb5/b;-><init>(Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;I)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0, v2, v3, v8}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 442
    .line 443
    .line 444
    goto :goto_3

    .line 445
    :cond_b
    invoke-virtual {v2}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 450
    .line 451
    sget-object v1, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 452
    .line 453
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    invoke-interface {v1, v4}, Lcom/zykj/mistake/network/b;->i(Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;)Lq5/e;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    new-instance v2, Lb5/b;

    .line 462
    .line 463
    const/4 v3, 0x3

    .line 464
    invoke-direct {v2, v0, v3}, Lb5/b;-><init>(Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;I)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0, v1, v2, v8}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 468
    .line 469
    .line 470
    :cond_c
    :goto_3
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 471
    .line 472
    return-object v0

    .line 473
    :pswitch_0
    sget v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 474
    .line 475
    new-instance v0, Ll4/d;

    .line 476
    .line 477
    invoke-direct {v0, v2}, Ll4/d;-><init>(Landroid/content/Context;)V

    .line 478
    .line 479
    .line 480
    return-object v0

    .line 481
    :pswitch_1
    sget v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 482
    .line 483
    new-instance v0, Ll4/i;

    .line 484
    .line 485
    invoke-direct {v0, v2, v1}, Ll4/i;-><init>(Landroid/content/Context;I)V

    .line 486
    .line 487
    .line 488
    return-object v0

    .line 489
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
