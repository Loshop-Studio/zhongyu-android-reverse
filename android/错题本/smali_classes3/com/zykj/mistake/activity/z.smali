# RE note 本类字节码直接引用的读写或显示接口包括偏好设置。
.class public final synthetic Lcom/zykj/mistake/activity/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/activity/MistakeListActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MistakeListActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/z;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/z;->b:Lcom/zykj/mistake/activity/MistakeListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
# RE I/O 读取布尔偏好（SharedPreferences.getBoolean）。
.method public final onClick(Landroid/view/View;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/activity/z;->a:I

    .line 4
    .line 5
    const v2, 0x800005

    .line 6
    .line 7
    .line 8
    const-string v3, "mRemoveMistakeDialog"

    .line 9
    .line 10
    const/4 v4, 0x6

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    iget-object v8, v0, Lcom/zykj/mistake/activity/z;->b:Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v1, v8, Lcom/zykj/mistake/activity/MistakeListActivity;->h:Ll4/i;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    sget v2, Lcom/zykj/mistake/R$string;->add_mistake_tag:I

    .line 24
    .line 25
    invoke-virtual {v8, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "getString(...)"

    .line 30
    .line 31
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Lcom/zykj/mistake/activity/m;

    .line 35
    .line 36
    const/4 v4, 0x2

    .line 37
    invoke-direct {v3, v8, v4}, Lcom/zykj/mistake/activity/m;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    sget v4, Ll4/i;->d:I

    .line 41
    .line 42
    const-string v4, ""

    .line 43
    .line 44
    invoke-virtual {v1, v2, v4, v3}, Ll4/i;->a(Ljava/lang/String;Ljava/lang/String;Lr6/c;)V

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
    throw v6

    .line 54
    :pswitch_0
    sget v1, Lcom/zykj/mistake/activity/MistakeListActivity;->x:I

    .line 55
    .line 56
    const-string v1, "MistakeListManageDeleteConfirm"

    .line 57
    .line 58
    invoke-static {v4, v1, v6}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v8, Lcom/zykj/mistake/activity/MistakeListActivity;->s:Ljava/util/ArrayList;

    .line 62
    .line 63
    iget-object v2, v8, Lcom/zykj/mistake/activity/MistakeListActivity;->o:Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    move v4, v5

    .line 70
    :goto_0
    if-ge v4, v3, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    check-cast v6, Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;->getItemIds()Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    iget-object v9, v8, Lcom/zykj/mistake/activity/MistakeListActivity;->e:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    check-cast v6, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 95
    .line 96
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getId()J

    .line 97
    .line 98
    .line 99
    move-result-wide v9

    .line 100
    long-to-int v6, v9

    .line 101
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 114
    .line 115
    const-string v3, "req"

    .line 116
    .line 117
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    sget-object v3, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 121
    .line 122
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-interface {v3, v2}, Lcom/zykj/mistake/network/b;->d(Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;)Lq5/e;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    new-instance v3, Lb5/g;

    .line 131
    .line 132
    invoke-direct {v3, v1, v5}, Lb5/g;-><init>(Lcom/zykj/mistake/presenter/MistakeListPresenter;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v2, v3}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_1
    iget-object v1, v8, Lcom/zykj/mistake/activity/MistakeListActivity;->g:Landroid/app/Dialog;

    .line 140
    .line 141
    if-eqz v1, :cond_2

    .line 142
    .line 143
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v6

    .line 151
    :pswitch_2
    sget v1, Lcom/zykj/mistake/activity/MistakeListActivity;->x:I

    .line 152
    .line 153
    invoke-virtual {v8}, Lcom/zykj/mistake/activity/MistakeListActivity;->x()V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :pswitch_3
    sget v1, Lcom/zykj/mistake/activity/MistakeListActivity;->x:I

    .line 158
    .line 159
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 164
    .line 165
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-interface {v2}, Lcom/zykj/mistake/network/b;->f()Lq5/e;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    new-instance v3, Lb5/f;

    .line 174
    .line 175
    invoke-direct {v3, v1, v5}, Lb5/f;-><init>(Lcom/zykj/mistake/presenter/MistakeListPresenter;Z)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v2, v3, v7}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :pswitch_4
    iget-object v1, v8, Lcom/zykj/mistake/activity/MistakeListActivity;->g:Landroid/app/Dialog;

    .line 183
    .line 184
    if-eqz v1, :cond_3

    .line 185
    .line 186
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw v6

    .line 194
    :pswitch_5
    sget v1, Lcom/zykj/mistake/activity/MistakeListActivity;->x:I

    .line 195
    .line 196
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    check-cast v1, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 201
    .line 202
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-interface {v2}, Lcom/zykj/mistake/network/b;->f()Lq5/e;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    new-instance v3, Lb5/f;

    .line 211
    .line 212
    invoke-direct {v3, v1, v7}, Lb5/f;-><init>(Lcom/zykj/mistake/presenter/MistakeListPresenter;Z)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1, v2, v3, v7}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :pswitch_6
    sget v1, Lcom/zykj/mistake/activity/MistakeListActivity;->x:I

    .line 220
    .line 221
    invoke-virtual {v8, v6}, Lcom/zykj/mistake/activity/MistakeListActivity;->E(Ljava/lang/Integer;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :pswitch_7
    sget v1, Lcom/zykj/mistake/activity/MistakeListActivity;->x:I

    .line 226
    .line 227
    invoke-virtual {v8}, Landroid/app/Activity;->finish()V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :pswitch_8
    iget-boolean v1, v8, Lcom/zykj/mistake/activity/MistakeListActivity;->w:Z

    .line 232
    .line 233
    if-eqz v1, :cond_4

    .line 234
    .line 235
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 240
    .line 241
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 242
    .line 243
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->c:Lcom/zykj/mistake/widget/FlowLayout;

    .line 244
    .line 245
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v1, v5}, Landroid/view/View;->setSelected(Z)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8, v7}, Lcom/zykj/mistake/activity/MistakeListActivity;->A(Z)V

    .line 253
    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_4
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 261
    .line 262
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 263
    .line 264
    invoke-virtual {v1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->closeDrawer(I)V

    .line 265
    .line 266
    .line 267
    :goto_1
    return-void

    .line 268
    :pswitch_9
    iget-boolean v1, v8, Lcom/zykj/mistake/activity/MistakeListActivity;->w:Z

    .line 269
    .line 270
    iget-object v3, v8, Lcom/zykj/mistake/activity/MistakeListActivity;->t:Ljava/util/ArrayList;

    .line 271
    .line 272
    iget-object v9, v8, Lcom/zykj/mistake/activity/MistakeListActivity;->p:Lcom/zykj/mistake/entity/req/MultiSetTagsReq;

    .line 273
    .line 274
    iget-object v10, v8, Lcom/zykj/mistake/activity/MistakeListActivity;->n:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 275
    .line 276
    const-wide/16 v11, 0x0

    .line 277
    .line 278
    const/4 v13, -0x1

    .line 279
    if-eqz v1, :cond_d

    .line 280
    .line 281
    invoke-virtual {v10, v5}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setSkipCount(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getDiff()Ljava/util/ArrayList;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getAttainedLevel()Ljava/util/ArrayList;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getErrorReason()Ljava/util/ArrayList;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getTagIdList()Ljava/util/ArrayList;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 317
    .line 318
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 319
    .line 320
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->c:Lcom/zykj/mistake/widget/FlowLayout;

    .line 321
    .line 322
    invoke-virtual {v1}, Lcom/zykj/mistake/widget/FlowLayout;->getFirstSelectedIndex()I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eq v1, v13, :cond_5

    .line 327
    .line 328
    move v1, v7

    .line 329
    goto :goto_2

    .line 330
    :cond_5
    move v1, v5

    .line 331
    :goto_2
    invoke-virtual {v10, v1}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setHaveNoTag(Z)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getHaveNoTag()Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-nez v1, :cond_c

    .line 339
    .line 340
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 345
    .line 346
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 347
    .line 348
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 349
    .line 350
    invoke-virtual {v1}, Lcom/zykj/mistake/widget/FlowLayout;->getFirstSelectedIndex()I

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eq v1, v13, :cond_6

    .line 355
    .line 356
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getDiff()Ljava/util/ArrayList;

    .line 357
    .line 358
    .line 359
    move-result-object v9

    .line 360
    add-int/2addr v1, v7

    .line 361
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    :cond_6
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 373
    .line 374
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 375
    .line 376
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 377
    .line 378
    invoke-virtual {v1}, Lcom/zykj/mistake/widget/FlowLayout;->getFirstSelectedIndex()I

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    if-eq v1, v13, :cond_7

    .line 383
    .line 384
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getAttainedLevel()Ljava/util/ArrayList;

    .line 385
    .line 386
    .line 387
    move-result-object v9

    .line 388
    add-int/2addr v1, v7

    .line 389
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    :cond_7
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 401
    .line 402
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 403
    .line 404
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 405
    .line 406
    invoke-virtual {v1}, Lcom/zykj/mistake/widget/FlowLayout;->getFirstSelectedIndex()I

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    if-eq v1, v13, :cond_8

    .line 411
    .line 412
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getErrorReason()Ljava/util/ArrayList;

    .line 413
    .line 414
    .line 415
    move-result-object v9

    .line 416
    add-int/2addr v1, v7

    .line 417
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    .line 425
    .line 426
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 430
    .line 431
    .line 432
    move-result v9

    .line 433
    move v14, v5

    .line 434
    :goto_3
    if-ge v14, v9, :cond_b

    .line 435
    .line 436
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v15

    .line 440
    add-int/lit8 v14, v14, 0x1

    .line 441
    .line 442
    move-object/from16 v16, v15

    .line 443
    .line 444
    check-cast v16, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 445
    .line 446
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 447
    .line 448
    .line 449
    move-result-wide v17

    .line 450
    cmp-long v17, v17, v11

    .line 451
    .line 452
    if-eqz v17, :cond_a

    .line 453
    .line 454
    move-wide/from16 v17, v11

    .line 455
    .line 456
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 457
    .line 458
    .line 459
    move-result v11

    .line 460
    if-ne v11, v13, :cond_9

    .line 461
    .line 462
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    :cond_9
    :goto_4
    move-wide/from16 v11, v17

    .line 466
    .line 467
    goto :goto_3

    .line 468
    :cond_a
    move-wide/from16 v17, v11

    .line 469
    .line 470
    goto :goto_4

    .line 471
    :cond_b
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    :goto_5
    if-ge v5, v3, :cond_c

    .line 476
    .line 477
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v9

    .line 481
    add-int/lit8 v5, v5, 0x1

    .line 482
    .line 483
    check-cast v9, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 484
    .line 485
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getTagIdList()Ljava/util/ArrayList;

    .line 486
    .line 487
    .line 488
    move-result-object v11

    .line 489
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 490
    .line 491
    .line 492
    move-result-wide v12

    .line 493
    long-to-int v9, v12

    .line 494
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 495
    .line 496
    .line 497
    move-result-object v9

    .line 498
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    goto :goto_5

    .line 502
    :cond_c
    const-string v1, "MistakeListFilter"

    .line 503
    .line 504
    invoke-static {v4, v1, v6}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    check-cast v1, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 512
    .line 513
    invoke-virtual {v1, v10, v7}, Lcom/zykj/mistake/presenter/MistakeListPresenter;->d(Lcom/zykj/mistake/entity/req/MistakeListReq;Z)V

    .line 514
    .line 515
    .line 516
    goto/16 :goto_b

    .line 517
    .line 518
    :cond_d
    move-wide/from16 v17, v11

    .line 519
    .line 520
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 525
    .line 526
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 527
    .line 528
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 529
    .line 530
    invoke-virtual {v1}, Lcom/zykj/mistake/widget/FlowLayout;->getFirstSelectedIndex()I

    .line 531
    .line 532
    .line 533
    move-result v1

    .line 534
    if-eq v1, v13, :cond_e

    .line 535
    .line 536
    add-int/2addr v1, v7

    .line 537
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    goto :goto_6

    .line 542
    :cond_e
    move-object v1, v6

    .line 543
    :goto_6
    invoke-virtual {v9, v1}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->setDiff(Ljava/lang/Integer;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 551
    .line 552
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 553
    .line 554
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 555
    .line 556
    invoke-virtual {v1}, Lcom/zykj/mistake/widget/FlowLayout;->getFirstSelectedIndex()I

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    if-eq v1, v13, :cond_f

    .line 561
    .line 562
    add-int/2addr v1, v7

    .line 563
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    goto :goto_7

    .line 568
    :cond_f
    move-object v1, v6

    .line 569
    :goto_7
    invoke-virtual {v9, v1}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->setAttainedLevel(Ljava/lang/Integer;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 577
    .line 578
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 579
    .line 580
    iget-object v1, v1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 581
    .line 582
    invoke-virtual {v1}, Lcom/zykj/mistake/widget/FlowLayout;->getFirstSelectedIndex()I

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    if-eq v1, v13, :cond_10

    .line 587
    .line 588
    add-int/2addr v1, v7

    .line 589
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 590
    .line 591
    .line 592
    move-result-object v6

    .line 593
    :cond_10
    invoke-virtual {v9, v6}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->setErrorReason(Ljava/lang/Integer;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->getTagIdList()Ljava/util/ArrayList;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 601
    .line 602
    .line 603
    new-instance v1, Ljava/util/ArrayList;

    .line 604
    .line 605
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 609
    .line 610
    .line 611
    move-result v4

    .line 612
    move v6, v5

    .line 613
    :cond_11
    :goto_8
    if-ge v6, v4, :cond_12

    .line 614
    .line 615
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v10

    .line 619
    add-int/lit8 v6, v6, 0x1

    .line 620
    .line 621
    move-object v11, v10

    .line 622
    check-cast v11, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 623
    .line 624
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 625
    .line 626
    .line 627
    move-result-wide v14

    .line 628
    cmp-long v12, v14, v17

    .line 629
    .line 630
    if-eqz v12, :cond_11

    .line 631
    .line 632
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 633
    .line 634
    .line 635
    move-result v11

    .line 636
    if-ne v11, v13, :cond_11

    .line 637
    .line 638
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    goto :goto_8

    .line 642
    :cond_12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    move v4, v5

    .line 647
    :goto_9
    if-ge v4, v3, :cond_13

    .line 648
    .line 649
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v6

    .line 653
    add-int/lit8 v4, v4, 0x1

    .line 654
    .line 655
    check-cast v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 656
    .line 657
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->getTagIdList()Ljava/util/ArrayList;

    .line 658
    .line 659
    .line 660
    move-result-object v10

    .line 661
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 662
    .line 663
    .line 664
    move-result-wide v11

    .line 665
    long-to-int v6, v11

    .line 666
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 667
    .line 668
    .line 669
    move-result-object v6

    .line 670
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    goto :goto_9

    .line 674
    :cond_13
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->getItemIds()Ljava/util/ArrayList;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 679
    .line 680
    .line 681
    iget-object v1, v8, Lcom/zykj/mistake/activity/MistakeListActivity;->s:Ljava/util/ArrayList;

    .line 682
    .line 683
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 684
    .line 685
    .line 686
    move-result v3

    .line 687
    :goto_a
    if-ge v5, v3, :cond_14

    .line 688
    .line 689
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v4

    .line 693
    add-int/lit8 v5, v5, 0x1

    .line 694
    .line 695
    check-cast v4, Ljava/lang/String;

    .line 696
    .line 697
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/MultiSetTagsReq;->getItemIds()Ljava/util/ArrayList;

    .line 698
    .line 699
    .line 700
    move-result-object v6

    .line 701
    iget-object v10, v8, Lcom/zykj/mistake/activity/MistakeListActivity;->e:Ljava/util/ArrayList;

    .line 702
    .line 703
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 704
    .line 705
    .line 706
    move-result v4

    .line 707
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v4

    .line 711
    check-cast v4, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 712
    .line 713
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->getId()J

    .line 714
    .line 715
    .line 716
    move-result-wide v10

    .line 717
    long-to-int v4, v10

    .line 718
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 719
    .line 720
    .line 721
    move-result-object v4

    .line 722
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 723
    .line 724
    .line 725
    goto :goto_a

    .line 726
    :cond_14
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    check-cast v1, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 731
    .line 732
    sget-object v3, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 733
    .line 734
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 735
    .line 736
    .line 737
    move-result-object v3

    .line 738
    invoke-interface {v3, v9}, Lcom/zykj/mistake/network/b;->k(Lcom/zykj/mistake/entity/req/MultiSetTagsReq;)Lq5/e;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    new-instance v4, Lb5/g;

    .line 743
    .line 744
    invoke-direct {v4, v1, v7}, Lb5/g;-><init>(Lcom/zykj/mistake/presenter/MistakeListPresenter;I)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v1, v3, v4}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 748
    .line 749
    .line 750
    :goto_b
    invoke-virtual {v8}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 755
    .line 756
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 757
    .line 758
    invoke-virtual {v1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->closeDrawer(I)V

    .line 759
    .line 760
    .line 761
    return-void

    .line 762
    :pswitch_a
    sget v1, Lcom/zykj/mistake/activity/MistakeListActivity;->x:I

    .line 763
    .line 764
    const-string v1, "zykjMistake"

    .line 765
    .line 766
    invoke-virtual {v8, v1, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    const-string v2, "SP_CONTACT_MODE"

    .line 771
    .line 772
    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 773
    .line 774
    .line 775
    move-result v1

    .line 776
    xor-int/2addr v1, v7

    .line 777
    invoke-static {v8, v2, v1}, Lcom/zykj/mistake/utils/d;->e(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v8, v1}, Lcom/zykj/mistake/activity/MistakeListActivity;->B(Z)V

    .line 781
    .line 782
    .line 783
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v1

    .line 787
    const/4 v2, 0x4

    .line 788
    const-string v3, "MistakeListPracticeMode"

    .line 789
    .line 790
    invoke-static {v2, v3, v1}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    return-void

    .line 794
    nop

    .line 795
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
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
