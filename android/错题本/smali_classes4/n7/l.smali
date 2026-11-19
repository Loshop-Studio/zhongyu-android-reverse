.class public final synthetic Ln7/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ln7/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Ln7/l;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "it"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const-string v4, "$this$composable"

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    move v1, v3

    .line 15
    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :pswitch_0
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/o0;

    .line 21
    .line 22
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;->g:Ljava/util/List;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/o0;

    .line 29
    .line 30
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;->f:Ljava/util/List;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_2
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/o0;

    .line 37
    .line 38
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;->e:Ljava/util/List;

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_3
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/o0;

    .line 45
    .line 46
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;->d:Ljava/util/List;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_4
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 53
    .line 54
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lt4/g;->d()Landroidx/compose/animation/ExitTransition;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :pswitch_5
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 63
    .line 64
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    sget-object p1, Lt4/g;->a:Landroidx/compose/animation/core/TweenSpec;

    .line 68
    .line 69
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/j;

    .line 70
    .line 71
    invoke-direct {v0, v3}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v0}, Landroidx/compose/animation/EnterExitTransitionKt;->slideInHorizontally(Landroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/EnterTransition;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :pswitch_6
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 80
    .line 81
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lt4/g;->b()Landroidx/compose/animation/ExitTransition;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :pswitch_7
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 90
    .line 91
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lt4/g;->c()Landroidx/compose/animation/EnterTransition;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :pswitch_8
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 100
    .line 101
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {}, Lt4/g;->d()Landroidx/compose/animation/ExitTransition;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    :pswitch_9
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 110
    .line 111
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    sget-object p1, Lt4/g;->a:Landroidx/compose/animation/core/TweenSpec;

    .line 115
    .line 116
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/j;

    .line 117
    .line 118
    invoke-direct {v0, v3}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1, v0}, Landroidx/compose/animation/EnterExitTransitionKt;->slideInHorizontally(Landroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/EnterTransition;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    return-object p1

    .line 126
    :pswitch_a
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 127
    .line 128
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const/4 p1, 0x6

    .line 132
    const/4 v0, 0x0

    .line 133
    invoke-static {v1, v1, v0, p1, v0}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    const/4 v1, 0x0

    .line 138
    const/4 v2, 0x2

    .line 139
    invoke-static {p1, v1, v2, v0}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    sget-object p1, Lt4/g;->a:Landroidx/compose/animation/core/TweenSpec;

    .line 150
    .line 151
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    return-object p1

    .line 156
    :pswitch_c
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 157
    .line 158
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-static {}, Lt4/g;->b()Landroidx/compose/animation/ExitTransition;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    return-object p1

    .line 166
    :pswitch_d
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 167
    .line 168
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-static {}, Lt4/g;->c()Landroidx/compose/animation/EnterTransition;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    return-object p1

    .line 176
    :pswitch_e
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 177
    .line 178
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-static {}, Lt4/g;->d()Landroidx/compose/animation/ExitTransition;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    return-object p1

    .line 186
    :pswitch_f
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 187
    .line 188
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    sget-object p1, Lt4/g;->a:Landroidx/compose/animation/core/TweenSpec;

    .line 192
    .line 193
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/j;

    .line 194
    .line 195
    invoke-direct {v0, v3}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 196
    .line 197
    .line 198
    invoke-static {p1, v0}, Landroidx/compose/animation/EnterExitTransitionKt;->slideInHorizontally(Landroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/EnterTransition;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    return-object p1

    .line 203
    :pswitch_10
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 204
    .line 205
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-static {}, Lt4/g;->b()Landroidx/compose/animation/ExitTransition;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    return-object p1

    .line 213
    :pswitch_11
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 214
    .line 215
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-static {}, Lt4/g;->c()Landroidx/compose/animation/EnterTransition;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    return-object p1

    .line 223
    :pswitch_12
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 224
    .line 225
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-static {}, Lt4/g;->b()Landroidx/compose/animation/ExitTransition;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    return-object p1

    .line 233
    :pswitch_13
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 234
    .line 235
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-static {}, Lt4/g;->c()Landroidx/compose/animation/EnterTransition;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    return-object p1

    .line 243
    :pswitch_14
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 244
    .line 245
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-static {}, Lt4/g;->d()Landroidx/compose/animation/ExitTransition;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    return-object p1

    .line 253
    :pswitch_15
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 254
    .line 255
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    sget-object p1, Lt4/g;->a:Landroidx/compose/animation/core/TweenSpec;

    .line 259
    .line 260
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/j;

    .line 261
    .line 262
    invoke-direct {v0, v3}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 263
    .line 264
    .line 265
    invoke-static {p1, v0}, Landroidx/compose/animation/EnterExitTransitionKt;->slideInHorizontally(Landroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/EnterTransition;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    return-object p1

    .line 270
    :pswitch_16
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 271
    .line 272
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-static {}, Lt4/g;->d()Landroidx/compose/animation/ExitTransition;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    return-object p1

    .line 280
    :pswitch_17
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 281
    .line 282
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-static {}, Lt4/g;->b()Landroidx/compose/animation/ExitTransition;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    return-object p1

    .line 290
    :pswitch_18
    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    .line 291
    .line 292
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-static {}, Lt4/g;->c()Landroidx/compose/animation/EnterTransition;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    return-object p1

    .line 300
    :pswitch_19
    check-cast p1, Lokio/internal/ZipEntry;

    .line 301
    .line 302
    invoke-static {p1}, Lokio/internal/ZipFilesKt;->a(Lokio/internal/ZipEntry;)Z

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    return-object p1

    .line 311
    :pswitch_1a
    check-cast p1, Lokio/internal/ZipEntry;

    .line 312
    .line 313
    invoke-static {p1}, Lokio/internal/ResourceFileSystem;->b(Lokio/internal/ZipEntry;)Z

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    return-object p1

    .line 322
    :pswitch_1b
    check-cast p1, Ljava/util/Map$Entry;

    .line 323
    .line 324
    const-string v0, "<destruct>"

    .line 325
    .line 326
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    check-cast v0, Ljava/lang/String;

    .line 334
    .line 335
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    check-cast p1, Ln7/j;

    .line 340
    .line 341
    new-instance v1, Ljava/lang/StringBuilder;

    .line 342
    .line 343
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 344
    .line 345
    .line 346
    invoke-static {v1, v0}, Lkotlinx/serialization/json/internal/y;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    const/16 v0, 0x3a

    .line 350
    .line 351
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    return-object p1

    .line 362
    :pswitch_1c
    check-cast p1, Lk7/a;

    .line 363
    .line 364
    const-string v0, "$this$buildSerialDescriptor"

    .line 365
    .line 366
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    new-instance v0, Lcom/zykj/view/board/play/b;

    .line 370
    .line 371
    const/16 v1, 0x10

    .line 372
    .line 373
    invoke-direct {v0, v1}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 374
    .line 375
    .line 376
    new-instance v1, Ln7/n;

    .line 377
    .line 378
    invoke-direct {v1, v0}, Ln7/n;-><init>(Lr6/a;)V

    .line 379
    .line 380
    .line 381
    const-string v0, "JsonPrimitive"

    .line 382
    .line 383
    invoke-static {p1, v0, v1}, Lk7/a;->a(Lk7/a;Ljava/lang/String;Lk7/g;)V

    .line 384
    .line 385
    .line 386
    new-instance v0, Lcom/zykj/view/board/play/b;

    .line 387
    .line 388
    const/16 v1, 0x11

    .line 389
    .line 390
    invoke-direct {v0, v1}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 391
    .line 392
    .line 393
    new-instance v1, Ln7/n;

    .line 394
    .line 395
    invoke-direct {v1, v0}, Ln7/n;-><init>(Lr6/a;)V

    .line 396
    .line 397
    .line 398
    const-string v0, "JsonNull"

    .line 399
    .line 400
    invoke-static {p1, v0, v1}, Lk7/a;->a(Lk7/a;Ljava/lang/String;Lk7/g;)V

    .line 401
    .line 402
    .line 403
    new-instance v0, Lcom/zykj/view/board/play/b;

    .line 404
    .line 405
    const/16 v1, 0x12

    .line 406
    .line 407
    invoke-direct {v0, v1}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 408
    .line 409
    .line 410
    new-instance v1, Ln7/n;

    .line 411
    .line 412
    invoke-direct {v1, v0}, Ln7/n;-><init>(Lr6/a;)V

    .line 413
    .line 414
    .line 415
    const-string v0, "JsonLiteral"

    .line 416
    .line 417
    invoke-static {p1, v0, v1}, Lk7/a;->a(Lk7/a;Ljava/lang/String;Lk7/g;)V

    .line 418
    .line 419
    .line 420
    new-instance v0, Lcom/zykj/view/board/play/b;

    .line 421
    .line 422
    const/16 v1, 0x13

    .line 423
    .line 424
    invoke-direct {v0, v1}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 425
    .line 426
    .line 427
    new-instance v1, Ln7/n;

    .line 428
    .line 429
    invoke-direct {v1, v0}, Ln7/n;-><init>(Lr6/a;)V

    .line 430
    .line 431
    .line 432
    const-string v0, "JsonObject"

    .line 433
    .line 434
    invoke-static {p1, v0, v1}, Lk7/a;->a(Lk7/a;Ljava/lang/String;Lk7/g;)V

    .line 435
    .line 436
    .line 437
    new-instance v0, Lcom/zykj/view/board/play/b;

    .line 438
    .line 439
    const/16 v1, 0x14

    .line 440
    .line 441
    invoke-direct {v0, v1}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 442
    .line 443
    .line 444
    new-instance v1, Ln7/n;

    .line 445
    .line 446
    invoke-direct {v1, v0}, Ln7/n;-><init>(Lr6/a;)V

    .line 447
    .line 448
    .line 449
    const-string v0, "JsonArray"

    .line 450
    .line 451
    invoke-static {p1, v0, v1}, Lk7/a;->a(Lk7/a;Ljava/lang/String;Lk7/g;)V

    .line 452
    .line 453
    .line 454
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 455
    .line 456
    return-object p1

    .line 457
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
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
