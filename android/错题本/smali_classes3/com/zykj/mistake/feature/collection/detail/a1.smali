.class public final synthetic Lcom/zykj/mistake/feature/collection/detail/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lr6/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "it"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/b3;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/notebook/detail/b3;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 19
    .line 20
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 24
    .line 25
    return-object p1

    .line 26
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 27
    .line 28
    const-string v0, "it"

    .line 29
    .line 30
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/r1;

    .line 34
    .line 35
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/notebook/detail/r1;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 51
    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    sget-object p1, Lcom/zykj/mistake/feature/notebook/detail/h3;->a:Lcom/zykj/mistake/feature/notebook/detail/h3;

    .line 55
    .line 56
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    new-instance p1, Lcom/zykj/mistake/feature/notebook/detail/e2;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-direct {p1, v1}, Lcom/zykj/mistake/feature/notebook/detail/e2;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :goto_1
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_2
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/j3;

    .line 73
    .line 74
    const-string v0, "it"

    .line 75
    .line 76
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/s2;

    .line 80
    .line 81
    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/j3;->c:Ljava/lang/String;

    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    invoke-direct {v0, p1, v1, v1}, Lcom/zykj/mistake/feature/notebook/detail/s2;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 88
    .line 89
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_3
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/j3;

    .line 94
    .line 95
    const-string v0, "it"

    .line 96
    .line 97
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/s2;

    .line 101
    .line 102
    iget-object v1, p1, Lcom/zykj/mistake/feature/notebook/detail/j3;->c:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v2, p1, Lcom/zykj/mistake/feature/notebook/detail/j3;->e:Ljava/lang/Integer;

    .line 105
    .line 106
    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/j3;->f:Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-direct {v0, v1, v2, p1}, Lcom/zykj/mistake/feature/notebook/detail/s2;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 112
    .line 113
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :pswitch_4
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    .line 118
    .line 119
    const-string v0, "it"

    .line 120
    .line 121
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/c3;

    .line 125
    .line 126
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/notebook/detail/c3;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 130
    .line 131
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :pswitch_5
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/o3;

    .line 136
    .line 137
    const-string v0, "it"

    .line 138
    .line 139
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/u2;

    .line 143
    .line 144
    iget-object v1, p1, Lcom/zykj/mistake/feature/notebook/detail/o3;->b:Ljava/lang/String;

    .line 145
    .line 146
    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/o3;->c:Ljava/lang/String;

    .line 147
    .line 148
    invoke-direct {v0, v1, p1}, Lcom/zykj/mistake/feature/notebook/detail/u2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 152
    .line 153
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :pswitch_6
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/o3;

    .line 159
    .line 160
    const-string v0, "it"

    .line 161
    .line 162
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/u2;

    .line 166
    .line 167
    iget-object v1, p1, Lcom/zykj/mistake/feature/notebook/detail/o3;->b:Ljava/lang/String;

    .line 168
    .line 169
    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/o3;->c:Ljava/lang/String;

    .line 170
    .line 171
    invoke-direct {v0, v1, p1}, Lcom/zykj/mistake/feature/notebook/detail/u2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 175
    .line 176
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :pswitch_7
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/j3;

    .line 182
    .line 183
    const-string v0, "it"

    .line 184
    .line 185
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/s2;

    .line 189
    .line 190
    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/j3;->c:Ljava/lang/String;

    .line 191
    .line 192
    const/4 v1, 0x0

    .line 193
    invoke-direct {v0, p1, v1, v1}, Lcom/zykj/mistake/feature/notebook/detail/s2;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 194
    .line 195
    .line 196
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 197
    .line 198
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 204
    .line 205
    const-string v0, "collectionId"

    .line 206
    .line 207
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    new-instance v0, Lcom/zykj/mistake/feature/collection/list/l;

    .line 211
    .line 212
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/list/l;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 216
    .line 217
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 223
    .line 224
    const-string v0, "it"

    .line 225
    .line 226
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    new-instance v0, Lcom/zykj/mistake/feature/collection/list/k;

    .line 230
    .line 231
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/list/k;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 235
    .line 236
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :pswitch_a
    check-cast p1, Ljava/lang/Long;

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 244
    .line 245
    .line 246
    move-result-wide v0

    .line 247
    new-instance p1, Lcom/zykj/mistake/feature/collection/filter/q0;

    .line 248
    .line 249
    invoke-direct {p1, v0, v1}, Lcom/zykj/mistake/feature/collection/filter/q0;-><init>(J)V

    .line 250
    .line 251
    .line 252
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 253
    .line 254
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    goto/16 :goto_0

    .line 258
    .line 259
    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    .line 260
    .line 261
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/l0;

    .line 266
    .line 267
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/filter/l0;-><init>(I)V

    .line 268
    .line 269
    .line 270
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 271
    .line 272
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    goto/16 :goto_0

    .line 276
    .line 277
    :pswitch_c
    check-cast p1, Lp4/b;

    .line 278
    .line 279
    const-string v0, "it"

    .line 280
    .line 281
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/n0;

    .line 285
    .line 286
    iget p1, p1, Lp4/b;->c:I

    .line 287
    .line 288
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/filter/n0;-><init>(I)V

    .line 289
    .line 290
    .line 291
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 292
    .line 293
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    goto/16 :goto_0

    .line 297
    .line 298
    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/k0;

    .line 305
    .line 306
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/filter/k0;-><init>(I)V

    .line 307
    .line 308
    .line 309
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 310
    .line 311
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    goto/16 :goto_0

    .line 315
    .line 316
    :pswitch_e
    check-cast p1, Ljava/lang/Integer;

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 319
    .line 320
    .line 321
    move-result p1

    .line 322
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/g0;

    .line 323
    .line 324
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/filter/g0;-><init>(I)V

    .line 325
    .line 326
    .line 327
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 328
    .line 329
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :pswitch_f
    check-cast p1, Ljava/lang/Integer;

    .line 335
    .line 336
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/i0;

    .line 337
    .line 338
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/filter/i0;-><init>(Ljava/lang/Integer;)V

    .line 339
    .line 340
    .line 341
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 342
    .line 343
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    goto/16 :goto_0

    .line 347
    .line 348
    :pswitch_10
    check-cast p1, Ljava/lang/Integer;

    .line 349
    .line 350
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/f0;

    .line 351
    .line 352
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/filter/f0;-><init>(Ljava/lang/Integer;)V

    .line 353
    .line 354
    .line 355
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 356
    .line 357
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    goto/16 :goto_0

    .line 361
    .line 362
    :pswitch_11
    check-cast p1, Ljava/lang/Integer;

    .line 363
    .line 364
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/h0;

    .line 365
    .line 366
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/filter/h0;-><init>(Ljava/lang/Integer;)V

    .line 367
    .line 368
    .line 369
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 370
    .line 371
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    goto/16 :goto_0

    .line 375
    .line 376
    :pswitch_12
    check-cast p1, Ljava/lang/Long;

    .line 377
    .line 378
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 379
    .line 380
    .line 381
    move-result-wide v0

    .line 382
    new-instance p1, Lcom/zykj/mistake/feature/collection/filter/p0;

    .line 383
    .line 384
    invoke-direct {p1, v0, v1}, Lcom/zykj/mistake/feature/collection/filter/p0;-><init>(J)V

    .line 385
    .line 386
    .line 387
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 388
    .line 389
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    goto/16 :goto_0

    .line 393
    .line 394
    :pswitch_13
    check-cast p1, Ljava/lang/Long;

    .line 395
    .line 396
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 397
    .line 398
    .line 399
    move-result-wide v0

    .line 400
    new-instance p1, Lcom/zykj/mistake/feature/collection/detail/x0;

    .line 401
    .line 402
    invoke-direct {p1, v0, v1}, Lcom/zykj/mistake/feature/collection/detail/x0;-><init>(J)V

    .line 403
    .line 404
    .line 405
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 406
    .line 407
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    goto/16 :goto_0

    .line 411
    .line 412
    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    .line 413
    .line 414
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 415
    .line 416
    .line 417
    move-result p1

    .line 418
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/s0;

    .line 419
    .line 420
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/detail/s0;-><init>(I)V

    .line 421
    .line 422
    .line 423
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 424
    .line 425
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    goto/16 :goto_0

    .line 429
    .line 430
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 431
    .line 432
    const-string v0, "it"

    .line 433
    .line 434
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/r;

    .line 438
    .line 439
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/detail/r;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 443
    .line 444
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    goto/16 :goto_0

    .line 448
    .line 449
    :pswitch_16
    check-cast p1, Ljava/lang/Integer;

    .line 450
    .line 451
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 452
    .line 453
    .line 454
    move-result p1

    .line 455
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/r0;

    .line 456
    .line 457
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/detail/r0;-><init>(I)V

    .line 458
    .line 459
    .line 460
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 461
    .line 462
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    goto/16 :goto_0

    .line 466
    .line 467
    :pswitch_17
    check-cast p1, Ljava/lang/Integer;

    .line 468
    .line 469
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 470
    .line 471
    .line 472
    move-result p1

    .line 473
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/n0;

    .line 474
    .line 475
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/detail/n0;-><init>(I)V

    .line 476
    .line 477
    .line 478
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 479
    .line 480
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    goto/16 :goto_0

    .line 484
    .line 485
    :pswitch_18
    check-cast p1, Ljava/lang/Integer;

    .line 486
    .line 487
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/p0;

    .line 488
    .line 489
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/detail/p0;-><init>(Ljava/lang/Integer;)V

    .line 490
    .line 491
    .line 492
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 493
    .line 494
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    goto/16 :goto_0

    .line 498
    .line 499
    :pswitch_19
    check-cast p1, Ljava/lang/Integer;

    .line 500
    .line 501
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/m0;

    .line 502
    .line 503
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/detail/m0;-><init>(Ljava/lang/Integer;)V

    .line 504
    .line 505
    .line 506
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 507
    .line 508
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    goto/16 :goto_0

    .line 512
    .line 513
    :pswitch_1a
    check-cast p1, Ljava/lang/Integer;

    .line 514
    .line 515
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/o0;

    .line 516
    .line 517
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/detail/o0;-><init>(Ljava/lang/Integer;)V

    .line 518
    .line 519
    .line 520
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 521
    .line 522
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    goto/16 :goto_0

    .line 526
    .line 527
    :pswitch_1b
    check-cast p1, Ljava/lang/Long;

    .line 528
    .line 529
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 530
    .line 531
    .line 532
    move-result-wide v0

    .line 533
    new-instance p1, Lcom/zykj/mistake/feature/collection/detail/w0;

    .line 534
    .line 535
    invoke-direct {p1, v0, v1}, Lcom/zykj/mistake/feature/collection/detail/w0;-><init>(J)V

    .line 536
    .line 537
    .line 538
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 539
    .line 540
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    goto/16 :goto_0

    .line 544
    .line 545
    :pswitch_1c
    check-cast p1, Ljava/lang/String;

    .line 546
    .line 547
    const-string v0, "itemId"

    .line 548
    .line 549
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/u;

    .line 553
    .line 554
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/detail/u;-><init>(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/a1;->b:Lr6/c;

    .line 558
    .line 559
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    goto/16 :goto_0

    .line 563
    .line 564
    nop

    .line 565
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
