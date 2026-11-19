.class public final Lw1/g$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/g$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lw1/g$h;

.field public final b:I


# direct methods
.method public constructor <init>(Lw1/g$h;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 5
    .line 6
    iput p2, p0, Lw1/g$h$a;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lw1/g$h$a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/AssertionError;

    .line 7
    .line 8
    iget v1, p0, Lw1/g$h$a;->b:I

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 15
    .line 16
    invoke-static {v0}, Lw1/g$h;->g(Lw1/g$h;)Lp2/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 21
    .line 22
    invoke-virtual {v1}, Lw1/g$h;->m()Lje/v;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v0, v1}, Lp2/j;->a(Lp2/a;Lje/v;)Ls2/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :pswitch_1
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 32
    .line 33
    invoke-static {v0}, Lw1/g$h;->k(Lw1/g$h;)Lsa/a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 38
    .line 39
    invoke-virtual {v1}, Lw1/g$h;->m()Lje/v;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v0, v1}, Lsa/b;->a(Lsa/a;Lje/v;)Lpa/a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :pswitch_2
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 49
    .line 50
    invoke-static {v0}, Lw1/g$h;->f(Lw1/g$h;)Ld2/a;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 55
    .line 56
    iget-object v1, v1, Lw1/g$h;->j:Lgc/f;

    .line 57
    .line 58
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lcom/friday/common/MyDataBase;

    .line 63
    .line 64
    invoke-static {v0, v1}, Ld2/e;->a(Ld2/a;Lcom/friday/common/MyDataBase;)Lc2/a1;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :pswitch_3
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 70
    .line 71
    invoke-static {v0}, Lw1/g$h;->g(Lw1/g$h;)Lp2/a;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 76
    .line 77
    iget-object v1, v1, Lw1/g$h;->z:Lgc/f;

    .line 78
    .line 79
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Lcom/friday/document/service/FileManager;

    .line 84
    .line 85
    invoke-static {v0, v1}, Lp2/g;->a(Lp2/a;Lcom/friday/document/service/FileManager;)Lj2/d;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    return-object v0

    .line 90
    :pswitch_4
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 91
    .line 92
    invoke-static {v0}, Lw1/g$h;->h(Lw1/g$h;)Lt3/a;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 97
    .line 98
    invoke-virtual {v1}, Lw1/g$h;->t()Lje/v;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v0, v1}, Lt3/b;->a(Lt3/a;Lje/v;)Lu3/a;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :pswitch_5
    new-instance v0, Lcom/friday/document/repositroy/FileRepository;

    .line 108
    .line 109
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 110
    .line 111
    iget-object v1, v1, Lw1/g$h;->k:Lgc/f;

    .line 112
    .line 113
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Lcom/friday/common/dao/ResourceDao;

    .line 118
    .line 119
    iget-object v2, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 120
    .line 121
    iget-object v2, v2, Lw1/g$h;->m:Lgc/f;

    .line 122
    .line 123
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    check-cast v2, Lcom/friday/common/dao/FileDao;

    .line 128
    .line 129
    iget-object v3, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 130
    .line 131
    iget-object v3, v3, Lw1/g$h;->n:Lgc/f;

    .line 132
    .line 133
    invoke-interface {v3}, Lpc/a;->get()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    check-cast v3, Lc2/v0;

    .line 138
    .line 139
    invoke-direct {v0, v1, v2, v3}, Lcom/friday/document/repositroy/FileRepository;-><init>(Lcom/friday/common/dao/ResourceDao;Lcom/friday/common/dao/FileDao;Lc2/v0;)V

    .line 140
    .line 141
    .line 142
    return-object v0

    .line 143
    :pswitch_6
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 144
    .line 145
    invoke-static {v0}, Lw1/g$h;->g(Lw1/g$h;)Lp2/a;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v0}, Lp2/b;->a(Lp2/a;)Lsd/i0;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0

    .line 154
    :pswitch_7
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 155
    .line 156
    invoke-static {v0}, Lw1/g$h;->g(Lw1/g$h;)Lp2/a;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 161
    .line 162
    iget-object v1, v1, Lw1/g$h;->u:Lgc/f;

    .line 163
    .line 164
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, Ls2/a;

    .line 169
    .line 170
    iget-object v2, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 171
    .line 172
    iget-object v2, v2, Lw1/g$h;->m:Lgc/f;

    .line 173
    .line 174
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, Lcom/friday/common/dao/FileDao;

    .line 179
    .line 180
    iget-object v3, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 181
    .line 182
    iget-object v3, v3, Lw1/g$h;->k:Lgc/f;

    .line 183
    .line 184
    invoke-interface {v3}, Lpc/a;->get()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    check-cast v3, Lcom/friday/common/dao/ResourceDao;

    .line 189
    .line 190
    invoke-static {v0, v1, v2, v3}, Lp2/l;->a(Lp2/a;Ls2/a;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;)Lcom/friday/document/sync/SyncStateThree;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0

    .line 195
    :pswitch_8
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 196
    .line 197
    invoke-static {v0}, Lw1/g$h;->g(Lw1/g$h;)Lp2/a;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 202
    .line 203
    iget-object v0, v0, Lw1/g$h;->u:Lgc/f;

    .line 204
    .line 205
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    move-object v2, v0

    .line 210
    check-cast v2, Ls2/a;

    .line 211
    .line 212
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 213
    .line 214
    iget-object v0, v0, Lw1/g$h;->v:Lgc/f;

    .line 215
    .line 216
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    move-object v3, v0

    .line 221
    check-cast v3, Ld2/i;

    .line 222
    .line 223
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 224
    .line 225
    iget-object v0, v0, Lw1/g$h;->m:Lgc/f;

    .line 226
    .line 227
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    move-object v4, v0

    .line 232
    check-cast v4, Lcom/friday/common/dao/FileDao;

    .line 233
    .line 234
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 235
    .line 236
    iget-object v0, v0, Lw1/g$h;->k:Lgc/f;

    .line 237
    .line 238
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    move-object v5, v0

    .line 243
    check-cast v5, Lcom/friday/common/dao/ResourceDao;

    .line 244
    .line 245
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 246
    .line 247
    iget-object v0, v0, Lw1/g$h;->n:Lgc/f;

    .line 248
    .line 249
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    move-object v6, v0

    .line 254
    check-cast v6, Lc2/v0;

    .line 255
    .line 256
    invoke-static/range {v1 .. v6}, Lp2/k;->a(Lp2/a;Ls2/a;Ld2/i;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lc2/v0;)Lcom/friday/document/sync/SyncStateOne;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    return-object v0

    .line 261
    :pswitch_9
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 262
    .line 263
    invoke-virtual {v0}, Lw1/g$h;->t()Lje/v;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-static {v0}, Ld2/k;->a(Lje/v;)Ld2/i;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    return-object v0

    .line 272
    :pswitch_a
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 273
    .line 274
    invoke-static {v0}, Lw1/g$h;->g(Lw1/g$h;)Lp2/a;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 279
    .line 280
    iget-object v0, v0, Lw1/g$h;->v:Lgc/f;

    .line 281
    .line 282
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    move-object v2, v0

    .line 287
    check-cast v2, Ld2/i;

    .line 288
    .line 289
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 290
    .line 291
    iget-object v0, v0, Lw1/g$h;->q:Lgc/f;

    .line 292
    .line 293
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    move-object v3, v0

    .line 298
    check-cast v3, Lcom/friday/common/network/StudentSession;

    .line 299
    .line 300
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 301
    .line 302
    iget-object v0, v0, Lw1/g$h;->m:Lgc/f;

    .line 303
    .line 304
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    move-object v4, v0

    .line 309
    check-cast v4, Lcom/friday/common/dao/FileDao;

    .line 310
    .line 311
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 312
    .line 313
    iget-object v0, v0, Lw1/g$h;->k:Lgc/f;

    .line 314
    .line 315
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    move-object v5, v0

    .line 320
    check-cast v5, Lcom/friday/common/dao/ResourceDao;

    .line 321
    .line 322
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 323
    .line 324
    invoke-static {v0}, Lw1/g$h;->j(Lw1/g$h;)Lz3/a;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v0}, Lz3/b;->a(Lz3/a;)Lj2/g;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 333
    .line 334
    iget-object v0, v0, Lw1/g$h;->w:Lgc/f;

    .line 335
    .line 336
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    move-object v7, v0

    .line 341
    check-cast v7, Lcom/friday/document/sync/SyncStateOne;

    .line 342
    .line 343
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 344
    .line 345
    iget-object v0, v0, Lw1/g$h;->x:Lgc/f;

    .line 346
    .line 347
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    move-object v8, v0

    .line 352
    check-cast v8, Lcom/friday/document/sync/SyncStateThree;

    .line 353
    .line 354
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 355
    .line 356
    iget-object v0, v0, Lw1/g$h;->l:Lgc/f;

    .line 357
    .line 358
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    move-object v9, v0

    .line 363
    check-cast v9, Lc2/g2;

    .line 364
    .line 365
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 366
    .line 367
    iget-object v0, v0, Lw1/g$h;->y:Lgc/f;

    .line 368
    .line 369
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    move-object v10, v0

    .line 374
    check-cast v10, Lsd/i0;

    .line 375
    .line 376
    invoke-static/range {v1 .. v10}, Lp2/e;->a(Lp2/a;Ld2/i;Lcom/friday/common/network/StudentSession;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lj2/g;Lcom/friday/document/sync/SyncStateOne;Lcom/friday/document/sync/SyncStateThree;Lc2/g2;Lsd/i0;)Lcom/friday/document/service/FileManager;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    return-object v0

    .line 381
    :pswitch_b
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 382
    .line 383
    invoke-static {v0}, Lw1/g$h;->g(Lw1/g$h;)Lp2/a;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 388
    .line 389
    invoke-virtual {v1}, Lw1/g$h;->m()Lje/v;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-static {v0, v1}, Lp2/d;->a(Lp2/a;Lje/v;)Ls2/a;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    return-object v0

    .line 398
    :pswitch_c
    new-instance v0, Lcom/friday/common/network/RefreshRepositoryImpl;

    .line 399
    .line 400
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 401
    .line 402
    iget-object v1, v1, Lw1/g$h;->p:Lgc/f;

    .line 403
    .line 404
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    check-cast v1, Lvd/l;

    .line 409
    .line 410
    invoke-direct {v0, v1}, Lcom/friday/common/network/RefreshRepositoryImpl;-><init>(Lvd/l;)V

    .line 411
    .line 412
    .line 413
    return-object v0

    .line 414
    :pswitch_d
    invoke-static {}, Ld2/n;->a()Lvd/k;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    return-object v0

    .line 419
    :pswitch_e
    invoke-static {}, Ld2/l;->a()Lvd/l;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    return-object v0

    .line 424
    :pswitch_f
    new-instance v0, Lcom/friday/common/network/StudentSession;

    .line 425
    .line 426
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 427
    .line 428
    iget-object v1, v1, Lw1/g$h;->p:Lgc/f;

    .line 429
    .line 430
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    check-cast v1, Lvd/l;

    .line 435
    .line 436
    invoke-direct {v0, v1}, Lcom/friday/common/network/StudentSession;-><init>(Lvd/l;)V

    .line 437
    .line 438
    .line 439
    return-object v0

    .line 440
    :pswitch_10
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 441
    .line 442
    invoke-static {v0}, Lw1/g$h;->h(Lw1/g$h;)Lt3/a;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 447
    .line 448
    invoke-virtual {v1}, Lw1/g$h;->m()Lje/v;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    invoke-static {v0, v1}, Lt3/c;->a(Lt3/a;Lje/v;)Lu3/b;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    return-object v0

    .line 457
    :pswitch_11
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 458
    .line 459
    invoke-static {v0}, Lw1/g$h;->f(Lw1/g$h;)Ld2/a;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 464
    .line 465
    iget-object v1, v1, Lw1/g$h;->j:Lgc/f;

    .line 466
    .line 467
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    check-cast v1, Lcom/friday/common/MyDataBase;

    .line 472
    .line 473
    invoke-static {v0, v1}, Ld2/h;->a(Ld2/a;Lcom/friday/common/MyDataBase;)Lcom/friday/common/dao/UserDao;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    return-object v0

    .line 478
    :pswitch_12
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 479
    .line 480
    invoke-static {v0}, Lw1/g$h;->f(Lw1/g$h;)Ld2/a;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 485
    .line 486
    iget-object v1, v1, Lw1/g$h;->j:Lgc/f;

    .line 487
    .line 488
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    check-cast v1, Lcom/friday/common/MyDataBase;

    .line 493
    .line 494
    invoke-static {v0, v1}, Ld2/d;->a(Ld2/a;Lcom/friday/common/MyDataBase;)Lc2/v0;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    return-object v0

    .line 499
    :pswitch_13
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 500
    .line 501
    invoke-static {v0}, Lw1/g$h;->f(Lw1/g$h;)Ld2/a;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 506
    .line 507
    iget-object v1, v1, Lw1/g$h;->j:Lgc/f;

    .line 508
    .line 509
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    check-cast v1, Lcom/friday/common/MyDataBase;

    .line 514
    .line 515
    invoke-static {v0, v1}, Ld2/c;->a(Ld2/a;Lcom/friday/common/MyDataBase;)Lcom/friday/common/dao/FileDao;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    return-object v0

    .line 520
    :pswitch_14
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 521
    .line 522
    invoke-static {v0}, Lw1/g$h;->f(Lw1/g$h;)Ld2/a;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 527
    .line 528
    iget-object v1, v1, Lw1/g$h;->j:Lgc/f;

    .line 529
    .line 530
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    check-cast v1, Lcom/friday/common/MyDataBase;

    .line 535
    .line 536
    invoke-static {v0, v1}, Ld2/g;->a(Ld2/a;Lcom/friday/common/MyDataBase;)Lc2/g2;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    return-object v0

    .line 541
    :pswitch_15
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 542
    .line 543
    invoke-static {v0}, Lw1/g$h;->f(Lw1/g$h;)Ld2/a;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 548
    .line 549
    invoke-static {v1}, Lw1/g$h;->e(Lw1/g$h;)Lec/a;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    invoke-static {v1}, Lec/b;->a(Lec/a;)Landroid/app/Application;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    invoke-static {v0, v1}, Ld2/b;->a(Ld2/a;Landroid/app/Application;)Lcom/friday/common/MyDataBase;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    return-object v0

    .line 562
    :pswitch_16
    iget-object v0, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 563
    .line 564
    invoke-static {v0}, Lw1/g$h;->f(Lw1/g$h;)Ld2/a;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    iget-object v1, p0, Lw1/g$h$a;->a:Lw1/g$h;

    .line 569
    .line 570
    iget-object v1, v1, Lw1/g$h;->j:Lgc/f;

    .line 571
    .line 572
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    check-cast v1, Lcom/friday/common/MyDataBase;

    .line 577
    .line 578
    invoke-static {v0, v1}, Ld2/f;->a(Ld2/a;Lcom/friday/common/MyDataBase;)Lcom/friday/common/dao/ResourceDao;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    return-object v0

    .line 583
    :pswitch_data_0
    .packed-switch 0x0
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
