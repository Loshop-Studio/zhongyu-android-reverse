.class public final Lb5/g;
.super La/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/presenter/MistakeListPresenter;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/presenter/MistakeListPresenter;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb5/g;->a:I

    iput-object p1, p0, Lb5/g;->b:Lcom/zykj/mistake/presenter/MistakeListPresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget v0, p0, Lb5/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "e"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lb5/g;->b:Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    const-string v0, "e"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lb5/g;->b:Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 33
    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    iget-object v1, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->g:Landroid/app/Dialog;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const-string v3, "mRemoveMistakeDialog"

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    iget-object v1, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->g:Landroid/app/Dialog;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v2

    .line 61
    :cond_2
    :goto_0
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v2

    .line 69
    :cond_4
    :goto_1
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Ljava/lang/Object;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lb5/g;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lcom/zykj/mistake/network/ApiResp;

    .line 11
    .line 12
    const-string v2, "resp"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lb5/g;->b:Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 22
    .line 23
    if-eqz v1, :cond_a

    .line 24
    .line 25
    iget-object v2, v1, Lcom/zykj/mistake/activity/MistakeListActivity;->p:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 26
    .line 27
    iget-object v3, v1, Lcom/zykj/mistake/activity/MistakeListActivity;->e:Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v4, v1, Lcom/zykj/mistake/activity/MistakeListActivity;->s:Ljava/util/ArrayList;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    move v8, v5

    .line 41
    :goto_0
    if-ge v8, v7, :cond_9

    .line 42
    .line 43
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    add-int/lit8 v8, v8, 0x1

    .line 48
    .line 49
    check-cast v9, Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    check-cast v10, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 60
    .line 61
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->getDiff()Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v11

    .line 65
    if-nez v11, :cond_0

    .line 66
    .line 67
    move-object v11, v6

    .line 68
    :cond_0
    invoke-virtual {v10, v11}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->setDiff(Ljava/lang/Integer;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    check-cast v10, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->getAttainedLevel()Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    if-nez v11, :cond_1

    .line 86
    .line 87
    move-object v11, v6

    .line 88
    :cond_1
    invoke-virtual {v10, v11}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->setAttainedLevel(Ljava/lang/Integer;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    check-cast v10, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 100
    .line 101
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->getErrorReason()Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    if-nez v11, :cond_2

    .line 106
    .line 107
    move-object v11, v6

    .line 108
    :cond_2
    invoke-virtual {v10, v11}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->setErrorReason(Ljava/lang/Integer;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    check-cast v10, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 120
    .line 121
    new-instance v11, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v10, v11}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->setTagNames(Ljava/util/ArrayList;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->getTagIdList()Ljava/util/ArrayList;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    move v12, v5

    .line 138
    :goto_1
    if-ge v12, v11, :cond_7

    .line 139
    .line 140
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    add-int/lit8 v12, v12, 0x1

    .line 145
    .line 146
    check-cast v13, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    iget-object v14, v1, Lcom/zykj/mistake/activity/MistakeListActivity;->u:Ljava/util/ArrayList;

    .line 153
    .line 154
    new-instance v15, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    move-object/from16 v16, v2

    .line 164
    .line 165
    const/4 v2, 0x0

    .line 166
    :goto_2
    if-ge v2, v5, :cond_4

    .line 167
    .line 168
    move-object/from16 v17, v4

    .line 169
    .line 170
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    add-int/lit8 v2, v2, 0x1

    .line 175
    .line 176
    move-object/from16 v18, v4

    .line 177
    .line 178
    check-cast v18, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 179
    .line 180
    invoke-virtual/range {v18 .. v18}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 181
    .line 182
    .line 183
    move-result-wide v18

    .line 184
    move/from16 v21, v5

    .line 185
    .line 186
    move-object/from16 v20, v6

    .line 187
    .line 188
    int-to-long v5, v13

    .line 189
    cmp-long v5, v18, v5

    .line 190
    .line 191
    if-nez v5, :cond_3

    .line 192
    .line 193
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    :cond_3
    move-object/from16 v4, v17

    .line 197
    .line 198
    move-object/from16 v6, v20

    .line 199
    .line 200
    move/from16 v5, v21

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_4
    move-object/from16 v17, v4

    .line 204
    .line 205
    move-object/from16 v20, v6

    .line 206
    .line 207
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    const/4 v4, 0x0

    .line 212
    :cond_5
    :goto_3
    if-ge v4, v2, :cond_6

    .line 213
    .line 214
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    add-int/lit8 v4, v4, 0x1

    .line 219
    .line 220
    check-cast v5, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 221
    .line 222
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    check-cast v6, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 231
    .line 232
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getTagNames()Ljava/util/ArrayList;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    if-eqz v6, :cond_5

    .line 237
    .line 238
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_6
    move-object/from16 v2, v16

    .line 247
    .line 248
    move-object/from16 v4, v17

    .line 249
    .line 250
    move-object/from16 v6, v20

    .line 251
    .line 252
    const/4 v5, 0x0

    .line 253
    goto :goto_1

    .line 254
    :cond_7
    move-object/from16 v16, v2

    .line 255
    .line 256
    move-object/from16 v17, v4

    .line 257
    .line 258
    move-object/from16 v20, v6

    .line 259
    .line 260
    iget-object v2, v1, Lcom/zykj/mistake/activity/MistakeListActivity;->f:Lcom/zykj/mistake/adapter/MistakeListAdapter;

    .line 261
    .line 262
    if-eqz v2, :cond_8

    .line 263
    .line 264
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 265
    .line 266
    .line 267
    move-object/from16 v2, v16

    .line 268
    .line 269
    move-object/from16 v4, v17

    .line 270
    .line 271
    move-object/from16 v6, v20

    .line 272
    .line 273
    const/4 v5, 0x0

    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :cond_8
    const-string v1, "mMistakeListAdapter"

    .line 277
    .line 278
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    const/4 v1, 0x0

    .line 282
    throw v1

    .line 283
    :cond_9
    invoke-virtual {v1}, Lcom/zykj/mistake/activity/MistakeListActivity;->x()V

    .line 284
    .line 285
    .line 286
    sget v2, Lcom/zykj/mistake/R$string;->set_tag_success:I

    .line 287
    .line 288
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    const-string v3, "getString(...)"

    .line 293
    .line 294
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    :cond_a
    return-void

    .line 301
    :pswitch_0
    move-object/from16 v1, p1

    .line 302
    .line 303
    check-cast v1, Lcom/zykj/mistake/network/ApiResp;

    .line 304
    .line 305
    const-string v2, "resp"

    .line 306
    .line 307
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    iget-object v1, v0, Lb5/g;->b:Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 311
    .line 312
    iget-object v1, v1, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v1, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 315
    .line 316
    if-eqz v1, :cond_10

    .line 317
    .line 318
    iget-object v2, v1, Lcom/zykj/mistake/activity/MistakeListActivity;->e:Ljava/util/ArrayList;

    .line 319
    .line 320
    iget-object v3, v1, Lcom/zykj/mistake/activity/MistakeListActivity;->g:Landroid/app/Dialog;

    .line 321
    .line 322
    const/4 v4, 0x0

    .line 323
    const-string v5, "mRemoveMistakeDialog"

    .line 324
    .line 325
    if-eqz v3, :cond_f

    .line 326
    .line 327
    invoke-virtual {v3}, Landroid/app/Dialog;->isShowing()Z

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    if-eqz v3, :cond_c

    .line 332
    .line 333
    iget-object v3, v1, Lcom/zykj/mistake/activity/MistakeListActivity;->g:Landroid/app/Dialog;

    .line 334
    .line 335
    if-eqz v3, :cond_b

    .line 336
    .line 337
    invoke-virtual {v3}, Landroid/app/Dialog;->dismiss()V

    .line 338
    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_b
    invoke-static {v5}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw v4

    .line 345
    :cond_c
    :goto_4
    new-instance v3, Ljava/util/ArrayList;

    .line 346
    .line 347
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 348
    .line 349
    .line 350
    iget-object v5, v1, Lcom/zykj/mistake/activity/MistakeListActivity;->s:Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 353
    .line 354
    .line 355
    move-result v6

    .line 356
    const/4 v7, 0x0

    .line 357
    :goto_5
    if-ge v7, v6, :cond_d

    .line 358
    .line 359
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v8

    .line 363
    add-int/lit8 v7, v7, 0x1

    .line 364
    .line 365
    check-cast v8, Ljava/lang/String;

    .line 366
    .line 367
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 368
    .line 369
    .line 370
    move-result v8

    .line 371
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v8

    .line 375
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    goto :goto_5

    .line 379
    :cond_d
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 380
    .line 381
    .line 382
    iget-object v2, v1, Lcom/zykj/mistake/activity/MistakeListActivity;->f:Lcom/zykj/mistake/adapter/MistakeListAdapter;

    .line 383
    .line 384
    if-eqz v2, :cond_e

    .line 385
    .line 386
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v1}, Lcom/zykj/mistake/activity/MistakeListActivity;->x()V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1}, Lcom/zykj/mistake/activity/MistakeListActivity;->u()V

    .line 393
    .line 394
    .line 395
    sget v2, Lcom/zykj/mistake/R$string;->remove_mistake_success:I

    .line 396
    .line 397
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    const-string v3, "getString(...)"

    .line 402
    .line 403
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_e
    const-string v1, "mMistakeListAdapter"

    .line 411
    .line 412
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    throw v4

    .line 416
    :cond_f
    invoke-static {v5}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    throw v4

    .line 420
    :cond_10
    :goto_6
    return-void

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
