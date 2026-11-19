.class public final synthetic Landroidx/navigation/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/navigation/d;->a:I

    iput-object p2, p0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Landroidx/navigation/d;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 13
    .line 14
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 17
    .line 18
    check-cast v1, Lcom/zykj/message/server/bean/ServerInfo;

    .line 19
    .line 20
    const-string v4, "OkHttp"

    .line 21
    .line 22
    const-string/jumbo v5, "\u56de\u8c03\u5f00\u59cb"

    .line 23
    .line 24
    .line 25
    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    iget-object v4, v1, Lcom/zykj/message/server/bean/ServerInfo;->c:Ljava/lang/String;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v4, 0x0

    .line 34
    :goto_0
    if-eqz v4, :cond_2

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v1, Lcom/zykj/message/server/bean/ServerInfo;->c:Ljava/lang/String;

    .line 47
    .line 48
    const-string v4, "getToken(...)"

    .line 49
    .line 50
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 54
    .line 55
    :cond_2
    :goto_1
    const/4 v1, 0x0

    .line 56
    iput-boolean v1, v3, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 57
    .line 58
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 59
    .line 60
    return-object v1

    .line 61
    :pswitch_0
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Lm4/f;

    .line 64
    .line 65
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Lm4/e;

    .line 68
    .line 69
    check-cast v1, Ljava/lang/Long;

    .line 70
    .line 71
    iget-object v4, v2, Lm4/f;->b:Lokhttp3/m0;

    .line 72
    .line 73
    invoke-virtual {v4}, Lokhttp3/m0;->contentLength()J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    const-wide/16 v7, -0x1

    .line 82
    .line 83
    cmp-long v9, v4, v7

    .line 84
    .line 85
    if-eqz v9, :cond_3

    .line 86
    .line 87
    const-wide/16 v9, 0x0

    .line 88
    .line 89
    cmp-long v4, v4, v9

    .line 90
    .line 91
    if-eqz v4, :cond_3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    const/4 v6, 0x0

    .line 95
    :goto_2
    if-eqz v6, :cond_5

    .line 96
    .line 97
    iget-object v2, v2, Lm4/f;->d:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, Lm4/d;

    .line 100
    .line 101
    iget-wide v3, v3, Lm4/e;->a:J

    .line 102
    .line 103
    const/16 v5, 0x64

    .line 104
    .line 105
    int-to-long v9, v5

    .line 106
    mul-long/2addr v3, v9

    .line 107
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v5

    .line 111
    div-long/2addr v3, v5

    .line 112
    long-to-int v3, v3

    .line 113
    if-nez v1, :cond_4

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 117
    .line 118
    .line 119
    move-result-wide v4

    .line 120
    cmp-long v1, v4, v7

    .line 121
    .line 122
    :goto_3
    invoke-interface {v2, v3}, Lm4/d;->update(I)V

    .line 123
    .line 124
    .line 125
    :cond_5
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 126
    .line 127
    return-object v1

    .line 128
    :pswitch_1
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v2, Landroidx/compose/ui/graphics/painter/Painter;

    .line 131
    .line 132
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v3, Landroidx/compose/ui/graphics/painter/Painter;

    .line 135
    .line 136
    check-cast v1, Lcoil3/compose/i;

    .line 137
    .line 138
    instance-of v4, v1, Lcoil3/compose/g;

    .line 139
    .line 140
    if-eqz v4, :cond_6

    .line 141
    .line 142
    check-cast v1, Lcoil3/compose/g;

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_6
    instance-of v4, v1, Lcoil3/compose/f;

    .line 146
    .line 147
    if-eqz v4, :cond_8

    .line 148
    .line 149
    check-cast v1, Lcoil3/compose/f;

    .line 150
    .line 151
    iget-object v4, v1, Lcoil3/compose/f;->b:Ls/b;

    .line 152
    .line 153
    iget-object v5, v4, Ls/b;->c:Ljava/lang/Throwable;

    .line 154
    .line 155
    instance-of v5, v5, Lcoil3/request/NullRequestDataException;

    .line 156
    .line 157
    if-eqz v5, :cond_7

    .line 158
    .line 159
    if-eqz v2, :cond_8

    .line 160
    .line 161
    new-instance v1, Lcoil3/compose/f;

    .line 162
    .line 163
    invoke-direct {v1, v2, v4}, Lcoil3/compose/f;-><init>(Landroidx/compose/ui/graphics/painter/Painter;Ls/b;)V

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_7
    if-eqz v3, :cond_8

    .line 168
    .line 169
    new-instance v1, Lcoil3/compose/f;

    .line 170
    .line 171
    invoke-direct {v1, v3, v4}, Lcoil3/compose/f;-><init>(Landroidx/compose/ui/graphics/painter/Painter;Ls/b;)V

    .line 172
    .line 173
    .line 174
    :cond_8
    :goto_4
    return-object v1

    .line 175
    :pswitch_2
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v2, Ld7/d;

    .line 178
    .line 179
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v3, Landroidx/camera/core/impl/utils/a;

    .line 182
    .line 183
    check-cast v1, Ljava/lang/Throwable;

    .line 184
    .line 185
    iget-object v1, v2, Ld7/d;->a:Landroid/os/Handler;

    .line 186
    .line 187
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 188
    .line 189
    .line 190
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 191
    .line 192
    return-object v1

    .line 193
    :pswitch_3
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v2, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;

    .line 196
    .line 197
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v3, Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 200
    .line 201
    check-cast v1, Ljava/lang/Integer;

    .line 202
    .line 203
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    invoke-static {v2, v3, v1}, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->a(Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;Lcom/zykj/view/board/play/SketchPlayFragment;I)Ld6/s;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    return-object v1

    .line 212
    :pswitch_4
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v2, Lr6/c;

    .line 215
    .line 216
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v3, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 219
    .line 220
    check-cast v1, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-static {v2, v3, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;->a(Lr6/c;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Ld6/s;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    return-object v1

    .line 231
    :pswitch_5
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v2, Lcom/zykj/mistake/utils/k;

    .line 234
    .line 235
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v3, Landroidx/compose/runtime/State;

    .line 238
    .line 239
    iget-object v4, v2, Lcom/zykj/mistake/utils/k;->b:Lr6/a;

    .line 240
    .line 241
    invoke-interface {v4}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    check-cast v4, Ljava/lang/Number;

    .line 246
    .line 247
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 248
    .line 249
    .line 250
    move-result-wide v4

    .line 251
    iget-object v6, v2, Lcom/zykj/mistake/utils/k;->c:Ljava/lang/Long;

    .line 252
    .line 253
    if-eqz v6, :cond_9

    .line 254
    .line 255
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 256
    .line 257
    .line 258
    move-result-wide v6

    .line 259
    sub-long v6, v4, v6

    .line 260
    .line 261
    iget-wide v8, v2, Lcom/zykj/mistake/utils/k;->a:J

    .line 262
    .line 263
    cmp-long v6, v6, v8

    .line 264
    .line 265
    if-ltz v6, :cond_a

    .line 266
    .line 267
    :cond_9
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    iput-object v4, v2, Lcom/zykj/mistake/utils/k;->c:Ljava/lang/Long;

    .line 272
    .line 273
    invoke-interface {v3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    check-cast v2, Lr6/c;

    .line 278
    .line 279
    invoke-interface {v2, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    :cond_a
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 283
    .line 284
    return-object v1

    .line 285
    :pswitch_6
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v2, Lr6/e;

    .line 288
    .line 289
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v3, Lcom/zykj/mistake/main/l;

    .line 292
    .line 293
    check-cast v1, Lcom/zykj/mistake/main/z0;

    .line 294
    .line 295
    const-string/jumbo v4, "selection"

    .line 296
    .line 297
    .line 298
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    check-cast v3, Lcom/zykj/mistake/main/d;

    .line 302
    .line 303
    iget-object v3, v3, Lcom/zykj/mistake/main/d;->a:Lcom/zykj/mistake/main/a1;

    .line 304
    .line 305
    invoke-interface {v2, v3, v1}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 309
    .line 310
    return-object v1

    .line 311
    :pswitch_7
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v2, Lcom/zykj/mistake/main/a;

    .line 314
    .line 315
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v3, Ljava/lang/String;

    .line 318
    .line 319
    check-cast v1, Lcom/zykj/mistake/main/a1;

    .line 320
    .line 321
    const-string/jumbo v4, "state"

    .line 322
    .line 323
    .line 324
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    const/4 v4, 0x1

    .line 328
    const/4 v5, 0x3

    .line 329
    const-string v6, ""

    .line 330
    .line 331
    invoke-static {v2, v3, v6, v4, v5}, Lcom/zykj/mistake/main/a;->a(Lcom/zykj/mistake/main/a;Ljava/lang/String;Ljava/lang/String;ZI)Lcom/zykj/mistake/main/a;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    const/4 v3, 0x7

    .line 336
    const/4 v4, 0x0

    .line 337
    invoke-static {v1, v4, v2, v3}, Lcom/zykj/mistake/main/a1;->a(Lcom/zykj/mistake/main/a1;Ljava/util/List;Lcom/zykj/mistake/main/a;I)Lcom/zykj/mistake/main/a1;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    return-object v1

    .line 342
    :pswitch_8
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 343
    .line 344
    move-object v7, v2

    .line 345
    check-cast v7, Ljava/lang/String;

    .line 346
    .line 347
    iget-object v2, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 348
    .line 349
    move-object v8, v2

    .line 350
    check-cast v8, Ljava/lang/String;

    .line 351
    .line 352
    move-object v3, v1

    .line 353
    check-cast v3, Lcom/zykj/mistake/main/p;

    .line 354
    .line 355
    const-string v1, "draft"

    .line 356
    .line 357
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    const/4 v15, 0x0

    .line 361
    const/16 v16, 0xfc3

    .line 362
    .line 363
    const/4 v4, 0x0

    .line 364
    const/4 v5, 0x0

    .line 365
    const/4 v6, 0x3

    .line 366
    const/4 v9, 0x1

    .line 367
    const/4 v10, 0x0

    .line 368
    const/4 v11, 0x0

    .line 369
    const/4 v12, 0x0

    .line 370
    const/4 v13, 0x0

    .line 371
    const/4 v14, 0x0

    .line 372
    invoke-static/range {v3 .. v16}, Lcom/zykj/mistake/main/p;->a(Lcom/zykj/mistake/main/p;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;I)Lcom/zykj/mistake/main/p;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    return-object v1

    .line 377
    :pswitch_9
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v2, Lr6/c;

    .line 380
    .line 381
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

    .line 384
    .line 385
    check-cast v1, Ljava/lang/Boolean;

    .line 386
    .line 387
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    if-eqz v1, :cond_b

    .line 392
    .line 393
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/d2;

    .line 394
    .line 395
    invoke-direct {v1, v3}, Lcom/zykj/mistake/feature/notebook/detail/d2;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;)V

    .line 396
    .line 397
    .line 398
    invoke-interface {v2, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    goto :goto_5

    .line 402
    :cond_b
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/e2;

    .line 403
    .line 404
    invoke-direct {v1, v3}, Lcom/zykj/mistake/feature/notebook/detail/e2;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;)V

    .line 405
    .line 406
    .line 407
    invoke-interface {v2, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    :goto_5
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 411
    .line 412
    return-object v1

    .line 413
    :pswitch_a
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v2, Landroidx/lifecycle/LifecycleOwner;

    .line 416
    .line 417
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 420
    .line 421
    check-cast v1, Landroidx/compose/runtime/DisposableEffectScope;

    .line 422
    .line 423
    const-string v4, "$this$DisposableEffect"

    .line 424
    .line 425
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    new-instance v1, Landroidx/navigation/internal/b;

    .line 429
    .line 430
    const/4 v4, 0x2

    .line 431
    invoke-direct {v1, v3, v4}, Landroidx/navigation/internal/b;-><init>(Ljava/lang/Object;I)V

    .line 432
    .line 433
    .line 434
    invoke-interface {v2}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 435
    .line 436
    .line 437
    move-result-object v3

    .line 438
    invoke-virtual {v3, v1}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 439
    .line 440
    .line 441
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$lambda$10$lambda$9$$inlined$onDispose$1;

    .line 442
    .line 443
    invoke-direct {v3, v2, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$lambda$10$lambda$9$$inlined$onDispose$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/navigation/internal/b;)V

    .line 444
    .line 445
    .line 446
    return-object v3

    .line 447
    :pswitch_b
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 450
    .line 451
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v3, Landroidx/compose/runtime/MutableState;

    .line 454
    .line 455
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 456
    .line 457
    const-string v4, "mode"

    .line 458
    .line 459
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    invoke-interface {v3, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    iput-object v1, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->d:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 469
    .line 470
    invoke-virtual {v2}, Lcom/zykj/mistake/feature/notebook/detail/a5;->c()V

    .line 471
    .line 472
    .line 473
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 474
    .line 475
    return-object v1

    .line 476
    :pswitch_c
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v2, Ljava/lang/String;

    .line 479
    .line 480
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v3, Lr6/a;

    .line 483
    .line 484
    check-cast v1, Landroid/content/Context;

    .line 485
    .line 486
    const-string v4, "context"

    .line 487
    .line 488
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    new-instance v4, Landroid/widget/ImageView;

    .line 492
    .line 493
    invoke-direct {v4, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 494
    .line 495
    .line 496
    sget v5, Lcom/zykj/mistake/feature/notebook/detail/t4;->q:F

    .line 497
    .line 498
    sget v6, Lcom/zykj/mistake/feature/notebook/detail/t4;->r:F

    .line 499
    .line 500
    sub-float/2addr v5, v6

    .line 501
    const/high16 v6, 0x40000000    # 2.0f

    .line 502
    .line 503
    div-float/2addr v5, v6

    .line 504
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 513
    .line 514
    mul-float/2addr v5, v1

    .line 515
    invoke-static {v5}, Lt6/a;->q(F)I

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 520
    .line 521
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v4, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v4, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 528
    .line 529
    .line 530
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/a;

    .line 531
    .line 532
    const/4 v2, 0x2

    .line 533
    invoke-direct {v1, v3, v2}, Lcom/zykj/mistake/feature/notebook/detail/a;-><init>(Lr6/a;I)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v4, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 537
    .line 538
    .line 539
    return-object v4

    .line 540
    :pswitch_d
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v2, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 543
    .line 544
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast v3, Lr6/c;

    .line 547
    .line 548
    check-cast v1, Lp4/b;

    .line 549
    .line 550
    const-string v4, "item"

    .line 551
    .line 552
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    iget-boolean v2, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->G:Z

    .line 556
    .line 557
    if-nez v2, :cond_c

    .line 558
    .line 559
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/e0;->a:Lcom/zykj/mistake/feature/collection/detail/e0;

    .line 560
    .line 561
    invoke-interface {v3, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    new-instance v2, Lcom/zykj/mistake/feature/collection/detail/v0;

    .line 565
    .line 566
    iget-object v1, v1, Lp4/b;->a:Ljava/lang/String;

    .line 567
    .line 568
    invoke-direct {v2, v1}, Lcom/zykj/mistake/feature/collection/detail/v0;-><init>(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    invoke-interface {v3, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    :cond_c
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 575
    .line 576
    return-object v1

    .line 577
    :pswitch_e
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast v2, Lr6/c;

    .line 580
    .line 581
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v3, Ljava/lang/Integer;

    .line 584
    .line 585
    check-cast v1, Ljava/lang/String;

    .line 586
    .line 587
    const-string/jumbo v4, "value"

    .line 588
    .line 589
    .line 590
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    if-eqz v3, :cond_d

    .line 594
    .line 595
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 596
    .line 597
    .line 598
    move-result v3

    .line 599
    invoke-static {v3, v1}, Lkotlin/text/p;->i0(ILjava/lang/String;)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    :cond_d
    invoke-interface {v2, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 607
    .line 608
    return-object v1

    .line 609
    :pswitch_f
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast v2, Lcom/zykj/mistake/feature/ask/n;

    .line 612
    .line 613
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v3, Lr6/c;

    .line 616
    .line 617
    move-object v4, v1

    .line 618
    check-cast v4, Landroidx/compose/foundation/lazy/grid/LazyGridScope;

    .line 619
    .line 620
    const-string v1, "$this$LazyVerticalGrid"

    .line 621
    .line 622
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    iget-object v1, v2, Lcom/zykj/mistake/feature/ask/n;->e:Ljava/util/List;

    .line 626
    .line 627
    new-instance v5, Landroidx/navigation/a;

    .line 628
    .line 629
    const/16 v6, 0x1a

    .line 630
    .line 631
    invoke-direct {v5, v6}, Landroidx/navigation/a;-><init>(I)V

    .line 632
    .line 633
    .line 634
    sget-object v6, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$1;->INSTANCE:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$1;

    .line 635
    .line 636
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 637
    .line 638
    .line 639
    move-result v7

    .line 640
    new-instance v8, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$2;

    .line 641
    .line 642
    invoke-direct {v8, v5, v1}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$2;-><init>(Lr6/c;Ljava/util/List;)V

    .line 643
    .line 644
    .line 645
    move-object v5, v8

    .line 646
    new-instance v8, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$4;

    .line 647
    .line 648
    invoke-direct {v8, v6, v1}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$4;-><init>(Lr6/c;Ljava/util/List;)V

    .line 649
    .line 650
    .line 651
    new-instance v6, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5;

    .line 652
    .line 653
    invoke-direct {v6, v1, v2, v3}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5;-><init>(Ljava/util/List;Lcom/zykj/mistake/feature/ask/n;Lr6/c;)V

    .line 654
    .line 655
    .line 656
    const v1, 0x29b3c0fe

    .line 657
    .line 658
    .line 659
    const/4 v2, 0x1

    .line 660
    invoke-static {v1, v2, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 661
    .line 662
    .line 663
    move-result-object v9

    .line 664
    move-object v6, v5

    .line 665
    move v5, v7

    .line 666
    const/4 v7, 0x0

    .line 667
    invoke-interface/range {v4 .. v9}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILr6/c;Lr6/e;Lr6/c;Lr6/g;)V

    .line 668
    .line 669
    .line 670
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 671
    .line 672
    return-object v1

    .line 673
    :pswitch_10
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 674
    .line 675
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 676
    .line 677
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 678
    .line 679
    check-cast v3, Lr6/c;

    .line 680
    .line 681
    check-cast v1, Landroid/net/Uri;

    .line 682
    .line 683
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v2, Landroid/net/Uri;

    .line 686
    .line 687
    invoke-static {v2}, Lcom/blankj/utilcode/util/c;->r(Landroid/net/Uri;)Ljava/io/File;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 692
    .line 693
    .line 694
    if-eqz v1, :cond_e

    .line 695
    .line 696
    invoke-static {v1}, Lcom/blankj/utilcode/util/c;->r(Landroid/net/Uri;)Ljava/io/File;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v1

    .line 704
    goto :goto_6

    .line 705
    :cond_e
    const/4 v1, 0x0

    .line 706
    :goto_6
    invoke-interface {v3, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 710
    .line 711
    return-object v1

    .line 712
    :pswitch_11
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v2, Landroidx/navigation/NavHostController;

    .line 715
    .line 716
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 717
    .line 718
    check-cast v3, Landroidx/lifecycle/LifecycleOwner;

    .line 719
    .line 720
    check-cast v1, Landroidx/compose/runtime/DisposableEffectScope;

    .line 721
    .line 722
    invoke-static {v2, v3, v1}, Landroidx/navigation/compose/NavHostKt;->x(Landroidx/navigation/NavHostController;Landroidx/lifecycle/LifecycleOwner;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    return-object v1

    .line 727
    :pswitch_12
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast v2, Landroidx/compose/runtime/State;

    .line 730
    .line 731
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 732
    .line 733
    check-cast v3, Landroidx/navigation/compose/ComposeNavigator;

    .line 734
    .line 735
    check-cast v1, Landroidx/compose/runtime/DisposableEffectScope;

    .line 736
    .line 737
    invoke-static {v2, v3, v1}, Landroidx/navigation/compose/NavHostKt;->r(Landroidx/compose/runtime/State;Landroidx/navigation/compose/ComposeNavigator;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    return-object v1

    .line 742
    :pswitch_13
    iget-object v2, v0, Landroidx/navigation/d;->b:Ljava/lang/Object;

    .line 743
    .line 744
    check-cast v2, Landroidx/navigation/NavDestination;

    .line 745
    .line 746
    iget-object v3, v0, Landroidx/navigation/d;->c:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast v3, Landroidx/navigation/NavController;

    .line 749
    .line 750
    check-cast v1, Landroidx/navigation/NavOptionsBuilder;

    .line 751
    .line 752
    invoke-static {v2, v3, v1}, Landroidx/navigation/NavController;->c(Landroidx/navigation/NavDestination;Landroidx/navigation/NavController;Landroidx/navigation/NavOptionsBuilder;)Ld6/s;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    return-object v1

    .line 757
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
