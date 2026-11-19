.class public final synthetic Lq4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/fragment/NoteFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/fragment/NoteFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq4/c;->a:I

    iput-object p1, p0, Lq4/c;->b:Lcom/zykj/mistake/fragment/NoteFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lq4/c;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lq4/c;->b:Lcom/zykj/mistake/fragment/NoteFragment;

    .line 9
    .line 10
    iget-boolean v2, v1, Lcom/zykj/mistake/fragment/NoteFragment;->k:Z

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Ljava/io/File;

    .line 15
    .line 16
    iget-object v3, v1, Lcom/zykj/mistake/fragment/NoteFragment;->g:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    new-instance v6, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v4, ".jpg"

    .line 31
    .line 32
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, Lcom/blankj/utilcode/util/e;->d(Ljava/io/File;)Z

    .line 43
    .line 44
    .line 45
    iget-object v3, v1, Lcom/zykj/mistake/fragment/NoteFragment;->h:Lcom/zykj/view/utils/ImagePicker;

    .line 46
    .line 47
    invoke-static {v2}, Lcom/blankj/utilcode/util/c;->c(Ljava/io/File;)Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v4, "file2Uri(...)"

    .line 52
    .line 53
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v4, Lq4/d;

    .line 57
    .line 58
    const/4 v5, 0x1

    .line 59
    invoke-direct {v4, v1, v5}, Lq4/d;-><init>(Lcom/zykj/mistake/fragment/NoteFragment;I)V

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    invoke-virtual {v3, v2, v1, v4}, Lcom/zykj/view/utils/ImagePicker;->startSystemCamera(Landroid/net/Uri;ZLr6/c;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    iget-object v1, v1, Lcom/zykj/mistake/fragment/NoteFragment;->l:Ll4/d;

    .line 68
    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_0
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 75
    .line 76
    return-object v1

    .line 77
    :pswitch_0
    iget-object v1, v0, Lq4/c;->b:Lcom/zykj/mistake/fragment/NoteFragment;

    .line 78
    .line 79
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v2, :cond_13

    .line 84
    .line 85
    instance-of v3, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 86
    .line 87
    if-eqz v3, :cond_13

    .line 88
    .line 89
    check-cast v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 90
    .line 91
    iget-wide v3, v1, Lcom/zykj/mistake/fragment/NoteFragment;->e:J

    .line 92
    .line 93
    iget-boolean v1, v1, Lcom/zykj/mistake/fragment/NoteFragment;->k:Z

    .line 94
    .line 95
    iget-object v5, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 96
    .line 97
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getNote()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    iget-object v6, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->q:Ljava/util/ArrayList;

    .line 102
    .line 103
    iget v7, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->r:I

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    check-cast v7, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 110
    .line 111
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getHasStem()Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    const/4 v8, 0x0

    .line 116
    if-eqz v7, :cond_2

    .line 117
    .line 118
    sget-object v7, Lcom/zykj/mistake/network/a;->b:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v9, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 121
    .line 122
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getQstPath()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    iget-object v10, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 127
    .line 128
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->isShowAnswer()Z

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    new-instance v11, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v7, "?showAnalysis="

    .line 144
    .line 145
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    goto :goto_1

    .line 156
    :cond_2
    move-object v7, v8

    .line 157
    :goto_1
    iget v9, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->r:I

    .line 158
    .line 159
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    check-cast v6, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 164
    .line 165
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getHasStem()Z

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    if-eqz v6, :cond_3

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_3
    iget-object v6, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 173
    .line 174
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getExtraStems()Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    :goto_2
    new-instance v6, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    iget-object v9, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 184
    .line 185
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getItemType()I

    .line 186
    .line 187
    .line 188
    move-result v9

    .line 189
    const/4 v10, 0x0

    .line 190
    const-string v11, "http"

    .line 191
    .line 192
    const-string v12, "get(...)"

    .line 193
    .line 194
    if-nez v9, :cond_5

    .line 195
    .line 196
    iget-object v9, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 197
    .line 198
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAnswerInfos()Ljava/util/ArrayList;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    if-eqz v9, :cond_9

    .line 203
    .line 204
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    if-eqz v9, :cond_4

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_4
    iget-object v9, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 212
    .line 213
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAnswerInfos()Ljava/util/ArrayList;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    check-cast v9, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 222
    .line 223
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 228
    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_5
    iget-object v9, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 232
    .line 233
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAnswerInfos()Ljava/util/ArrayList;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 238
    .line 239
    .line 240
    move-result v13

    .line 241
    move v14, v10

    .line 242
    :goto_3
    if-ge v14, v13, :cond_9

    .line 243
    .line 244
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v15

    .line 248
    add-int/lit8 v14, v14, 0x1

    .line 249
    .line 250
    check-cast v15, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 251
    .line 252
    invoke-virtual {v15}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 253
    .line 254
    .line 255
    move-result-object v16

    .line 256
    if-eqz v16, :cond_6

    .line 257
    .line 258
    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->isEmpty()Z

    .line 259
    .line 260
    .line 261
    move-result v16

    .line 262
    if-eqz v16, :cond_7

    .line 263
    .line 264
    :cond_6
    move-object/from16 v16, v9

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_7
    move-object/from16 v16, v9

    .line 268
    .line 269
    invoke-virtual {v15}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 270
    .line 271
    .line 272
    move-result-object v9

    .line 273
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v9

    .line 277
    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    check-cast v9, Ljava/lang/CharSequence;

    .line 281
    .line 282
    invoke-static {v9, v11, v10}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    if-eqz v9, :cond_8

    .line 287
    .line 288
    invoke-virtual {v15}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    :cond_8
    :goto_4
    move-object/from16 v9, v16

    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_9
    :goto_5
    new-instance v9, Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 305
    .line 306
    .line 307
    iget-object v13, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 308
    .line 309
    invoke-virtual {v13}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getItemType()I

    .line 310
    .line 311
    .line 312
    move-result v13

    .line 313
    if-nez v13, :cond_b

    .line 314
    .line 315
    iget-object v11, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 316
    .line 317
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAnswerInfos()Ljava/util/ArrayList;

    .line 318
    .line 319
    .line 320
    move-result-object v11

    .line 321
    if-eqz v11, :cond_f

    .line 322
    .line 323
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    if-eqz v11, :cond_a

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_a
    iget-object v11, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 331
    .line 332
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAnswerInfos()Ljava/util/ArrayList;

    .line 333
    .line 334
    .line 335
    move-result-object v11

    .line 336
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v10

    .line 340
    check-cast v10, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 341
    .line 342
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 343
    .line 344
    .line 345
    move-result-object v10

    .line 346
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 347
    .line 348
    .line 349
    goto :goto_8

    .line 350
    :cond_b
    iget-object v13, v2, Lcom/zykj/mistake/activity/MistakeDetailActivity;->h:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 351
    .line 352
    invoke-virtual {v13}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getAnswerInfos()Ljava/util/ArrayList;

    .line 353
    .line 354
    .line 355
    move-result-object v13

    .line 356
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 357
    .line 358
    .line 359
    move-result v14

    .line 360
    move v15, v10

    .line 361
    :goto_6
    if-ge v15, v14, :cond_f

    .line 362
    .line 363
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v16

    .line 367
    add-int/lit8 v15, v15, 0x1

    .line 368
    .line 369
    check-cast v16, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 370
    .line 371
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 372
    .line 373
    .line 374
    move-result-object v17

    .line 375
    if-eqz v17, :cond_c

    .line 376
    .line 377
    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->isEmpty()Z

    .line 378
    .line 379
    .line 380
    move-result v17

    .line 381
    if-eqz v17, :cond_d

    .line 382
    .line 383
    :cond_c
    move-object/from16 v17, v13

    .line 384
    .line 385
    goto :goto_7

    .line 386
    :cond_d
    move-object/from16 v17, v13

    .line 387
    .line 388
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 389
    .line 390
    .line 391
    move-result-object v13

    .line 392
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v13

    .line 396
    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    check-cast v13, Ljava/lang/CharSequence;

    .line 400
    .line 401
    invoke-static {v13, v11, v10}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 402
    .line 403
    .line 404
    move-result v13

    .line 405
    if-eqz v13, :cond_e

    .line 406
    .line 407
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 408
    .line 409
    .line 410
    move-result-object v13

    .line 411
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v13

    .line 415
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    :cond_e
    :goto_7
    move-object/from16 v13, v17

    .line 419
    .line 420
    goto :goto_6

    .line 421
    :cond_f
    :goto_8
    new-instance v10, Landroid/os/Bundle;

    .line 422
    .line 423
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 424
    .line 425
    .line 426
    const-string v11, "itemId"

    .line 427
    .line 428
    invoke-virtual {v10, v11, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 429
    .line 430
    .line 431
    const-string v3, "canOpenCamera"

    .line 432
    .line 433
    invoke-virtual {v10, v3, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 434
    .line 435
    .line 436
    if-eqz v5, :cond_10

    .line 437
    .line 438
    const-string v1, "noteUrl"

    .line 439
    .line 440
    invoke-virtual {v10, v1, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    :cond_10
    if-eqz v7, :cond_11

    .line 444
    .line 445
    const-string v1, "stemUrl"

    .line 446
    .line 447
    invoke-virtual {v10, v1, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    :cond_11
    if-eqz v8, :cond_12

    .line 451
    .line 452
    const-string v1, "stemPathList"

    .line 453
    .line 454
    invoke-virtual {v10, v1, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 455
    .line 456
    .line 457
    :cond_12
    const-string v1, "answerPathList"

    .line 458
    .line 459
    invoke-virtual {v10, v1, v6}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 460
    .line 461
    .line 462
    const-string v1, "revisedAnswerPathList"

    .line 463
    .line 464
    invoke-virtual {v10, v1, v9}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 465
    .line 466
    .line 467
    new-instance v1, Landroid/content/Intent;

    .line 468
    .line 469
    const-class v3, Lcom/zykj/mistake/activity/SketchActivity;

    .line 470
    .line 471
    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, v10}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 478
    .line 479
    .line 480
    :cond_13
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 481
    .line 482
    return-object v1

    .line 483
    :pswitch_1
    iget-object v1, v0, Lq4/c;->b:Lcom/zykj/mistake/fragment/NoteFragment;

    .line 484
    .line 485
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    const-string v2, "requireContext(...)"

    .line 490
    .line 491
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    sget v2, Lcom/zykj/mistake/R$string;->tips_data_err:I

    .line 495
    .line 496
    const/4 v3, 0x0

    .line 497
    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    const/16 v2, 0x51

    .line 502
    .line 503
    const/16 v4, 0xdc

    .line 504
    .line 505
    invoke-virtual {v1, v2, v3, v4}, Landroid/widget/Toast;->setGravity(III)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 509
    .line 510
    .line 511
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 512
    .line 513
    return-object v1

    .line 514
    nop

    .line 515
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
