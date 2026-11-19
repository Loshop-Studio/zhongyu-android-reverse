.class public final Lcom/zykj/mistake/utils/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/zykj/mistake/utils/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/mistake/utils/l;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/utils/l;->a:Lcom/zykj/mistake/utils/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    instance-of v4, v3, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;

    .line 15
    .line 16
    iget v5, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->label:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->label:I

    .line 26
    .line 27
    move-object/from16 v5, p0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;

    .line 31
    .line 32
    move-object/from16 v5, p0

    .line 33
    .line 34
    invoke-direct {v4, v5, v3}, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;-><init>(Lcom/zykj/mistake/utils/l;Lh6/c;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object v3, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->result:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object v6, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 40
    .line 41
    iget v7, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->label:I

    .line 42
    .line 43
    const/4 v8, 0x3

    .line 44
    const/4 v9, 0x2

    .line 45
    const-string v10, "/"

    .line 46
    .line 47
    const/4 v11, 0x1

    .line 48
    const/4 v12, 0x0

    .line 49
    if-eqz v7, :cond_4

    .line 50
    .line 51
    if-eq v7, v11, :cond_3

    .line 52
    .line 53
    if-eq v7, v9, :cond_2

    .line 54
    .line 55
    if-ne v7, v8, :cond_1

    .line 56
    .line 57
    iget-object v0, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;

    .line 60
    .line 61
    iget-object v1, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Ljava/lang/String;

    .line 64
    .line 65
    iget-object v2, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_4

    .line 73
    .line 74
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_2
    iget-object v0, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;

    .line 85
    .line 86
    iget-object v1, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Ljava/lang/String;

    .line 89
    .line 90
    iget-object v2, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    move-object v7, v12

    .line 98
    goto/16 :goto_2

    .line 99
    .line 100
    :cond_3
    iget-object v0, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;

    .line 103
    .line 104
    iget-object v1, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, Ljava/lang/String;

    .line 107
    .line 108
    iget-object v2, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    move-object v7, v12

    .line 116
    goto/16 :goto_1

    .line 117
    .line 118
    :cond_4
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;->getStrategy()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    const-string v7, "GridFS"

    .line 126
    .line 127
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    const-string v14, "POST"

    .line 132
    .line 133
    const-string v15, "3f4e17759c6b9c6a364211895bbb2abdc0ba62db"

    .line 134
    .line 135
    const-string v8, "Checksum"

    .line 136
    .line 137
    const-string v9, "bearer "

    .line 138
    .line 139
    const-string v13, "Authorization"

    .line 140
    .line 141
    const-string v16, "multipart/form-data"

    .line 142
    .line 143
    if-eqz v7, :cond_6

    .line 144
    .line 145
    iput-object v12, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 146
    .line 147
    iput-object v1, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v2, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 150
    .line 151
    iput v11, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->label:I

    .line 152
    .line 153
    new-instance v3, Ljava/io/File;

    .line 154
    .line 155
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    new-instance v7, Lokhttp3/v;

    .line 159
    .line 160
    invoke-direct {v7}, Lokhttp3/v;-><init>()V

    .line 161
    .line 162
    .line 163
    sget-object v11, Lokhttp3/x;->f:Lokhttp3/u;

    .line 164
    .line 165
    invoke-virtual {v7, v11}, Lokhttp3/v;->c(Lokhttp3/u;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    sget-object v11, Lokhttp3/g0;->Companion:Lokhttp3/f0;

    .line 173
    .line 174
    new-instance v12, Ljava/io/File;

    .line 175
    .line 176
    invoke-direct {v12, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    sget-object v0, Lokhttp3/u;->d:Ljava/util/regex/Pattern;

    .line 180
    .line 181
    invoke-static/range {v16 .. v16}, Lokhttp3/o;->h(Ljava/lang/String;)Lokhttp3/u;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    new-instance v11, Lokhttp3/d0;

    .line 189
    .line 190
    const/4 v5, 0x0

    .line 191
    invoke-direct {v11, v0, v12, v5}, Lokhttp3/d0;-><init>(Lokhttp3/u;Ljava/lang/Object;I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7, v3, v11}, Lokhttp3/v;->a(Ljava/lang/String;Lokhttp3/d0;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v7}, Lokhttp3/v;->b()Lokhttp3/x;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    new-instance v3, Lokhttp3/b0;

    .line 202
    .line 203
    invoke-direct {v3}, Lokhttp3/b0;-><init>()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;->getEndpoint()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    new-instance v7, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-virtual {v3, v5}, Lokhttp3/b0;->f(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;->getSecurityToken()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    new-instance v7, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-virtual {v3, v13, v5}, Lokhttp3/b0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v3, v8, v15}, Lokhttp3/b0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, v14, v0}, Lokhttp3/b0;->d(Ljava/lang/String;Lokhttp3/g0;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3}, Lokhttp3/b0;->b()Lokhttp3/c0;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    sget-object v3, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 261
    .line 262
    sget-object v3, Lg7/d;->a:Lg7/d;

    .line 263
    .line 264
    new-instance v5, Lcom/zykj/mistake/utils/UploadUtils$gridFsUpload$2;

    .line 265
    .line 266
    const/4 v7, 0x0

    .line 267
    invoke-direct {v5, v0, v7}, Lcom/zykj/mistake/utils/UploadUtils$gridFsUpload$2;-><init>(Lokhttp3/c0;Lh6/c;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v3, v5, v4}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    if-ne v3, v6, :cond_5

    .line 275
    .line 276
    goto/16 :goto_3

    .line 277
    .line 278
    :cond_5
    move-object v0, v2

    .line 279
    :goto_1
    check-cast v3, Ljava/lang/Boolean;

    .line 280
    .line 281
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    goto/16 :goto_5

    .line 286
    .line 287
    :cond_6
    move-object v7, v12

    .line 288
    const-string v5, "ZYFS"

    .line 289
    .line 290
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-eqz v3, :cond_8

    .line 295
    .line 296
    iput-object v7, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 297
    .line 298
    iput-object v1, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 299
    .line 300
    iput-object v2, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 301
    .line 302
    const/4 v3, 0x2

    .line 303
    iput v3, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->label:I

    .line 304
    .line 305
    new-instance v3, Ljava/io/File;

    .line 306
    .line 307
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    new-instance v5, Lokhttp3/v;

    .line 311
    .line 312
    invoke-direct {v5}, Lokhttp3/v;-><init>()V

    .line 313
    .line 314
    .line 315
    sget-object v7, Lokhttp3/x;->f:Lokhttp3/u;

    .line 316
    .line 317
    invoke-virtual {v5, v7}, Lokhttp3/v;->c(Lokhttp3/u;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    sget-object v7, Lokhttp3/g0;->Companion:Lokhttp3/f0;

    .line 325
    .line 326
    new-instance v11, Ljava/io/File;

    .line 327
    .line 328
    invoke-direct {v11, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    sget-object v0, Lokhttp3/u;->d:Ljava/util/regex/Pattern;

    .line 332
    .line 333
    invoke-static/range {v16 .. v16}, Lokhttp3/o;->h(Ljava/lang/String;)Lokhttp3/u;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    new-instance v7, Lokhttp3/d0;

    .line 341
    .line 342
    const/4 v12, 0x0

    .line 343
    invoke-direct {v7, v0, v11, v12}, Lokhttp3/d0;-><init>(Lokhttp3/u;Ljava/lang/Object;I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v5, v3, v7}, Lokhttp3/v;->a(Ljava/lang/String;Lokhttp3/d0;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v5}, Lokhttp3/v;->b()Lokhttp3/x;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    new-instance v3, Lokhttp3/b0;

    .line 354
    .line 355
    invoke-direct {v3}, Lokhttp3/b0;-><init>()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;->getEndpoint()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    new-instance v7, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    invoke-virtual {v3, v5}, Lokhttp3/b0;->f(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;->getSecurityToken()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    new-instance v7, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    invoke-virtual {v3, v13, v5}, Lokhttp3/b0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v3, v8, v15}, Lokhttp3/b0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v3, v14, v0}, Lokhttp3/b0;->d(Ljava/lang/String;Lokhttp3/g0;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v3}, Lokhttp3/b0;->b()Lokhttp3/c0;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    sget-object v3, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 413
    .line 414
    sget-object v3, Lg7/d;->a:Lg7/d;

    .line 415
    .line 416
    new-instance v5, Lcom/zykj/mistake/utils/UploadUtils$zyFsUpload$2;

    .line 417
    .line 418
    const/4 v7, 0x0

    .line 419
    invoke-direct {v5, v0, v7}, Lcom/zykj/mistake/utils/UploadUtils$zyFsUpload$2;-><init>(Lokhttp3/c0;Lh6/c;)V

    .line 420
    .line 421
    .line 422
    invoke-static {v3, v5, v4}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    if-ne v3, v6, :cond_7

    .line 427
    .line 428
    goto/16 :goto_3

    .line 429
    .line 430
    :cond_7
    move-object v0, v2

    .line 431
    :goto_2
    check-cast v3, Ljava/lang/Boolean;

    .line 432
    .line 433
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    goto/16 :goto_5

    .line 438
    .line 439
    :cond_8
    iput-object v7, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 440
    .line 441
    iput-object v1, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 442
    .line 443
    iput-object v2, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 444
    .line 445
    const/4 v3, 0x3

    .line 446
    iput v3, v4, Lcom/zykj/mistake/utils/UploadUtils$uploadFile$1;->label:I

    .line 447
    .line 448
    new-instance v3, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    const-string v5, "start ossUpload file:"

    .line 451
    .line 452
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    const-string v5, ", serverPath: "

    .line 459
    .line 460
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    invoke-static {v3}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    new-instance v3, Lcom/alibaba/sdk/android/oss/common/auth/OSSStsTokenCredentialProvider;

    .line 478
    .line 479
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;->getAccessKeyId()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v5

    .line 483
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;->getAccessKeySecret()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v7

    .line 487
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;->getSecurityToken()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v8

    .line 491
    invoke-direct {v3, v5, v7, v8}, Lcom/alibaba/sdk/android/oss/common/auth/OSSStsTokenCredentialProvider;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;->getEndpoint()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v5

    .line 498
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;->getBucket()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v7

    .line 505
    new-instance v8, Ljava/lang/StringBuilder;

    .line 506
    .line 507
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    const-string v7, "."

    .line 514
    .line 515
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v7

    .line 522
    const-string v8, ""

    .line 523
    .line 524
    invoke-static {v5, v7, v8}, Lkotlin/text/w;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    new-instance v7, Lcom/alibaba/sdk/android/oss/OSSClient;

    .line 529
    .line 530
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 531
    .line 532
    .line 533
    move-result-object v8

    .line 534
    invoke-direct {v7, v8, v5, v3}, Lcom/alibaba/sdk/android/oss/OSSClient;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/common/auth/OSSCredentialProvider;)V

    .line 535
    .line 536
    .line 537
    new-instance v3, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;

    .line 538
    .line 539
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;->getBucket()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v5

    .line 543
    invoke-direct {v3, v5, v1, v0}, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    sget-object v5, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 547
    .line 548
    sget-object v5, Lg7/d;->a:Lg7/d;

    .line 549
    .line 550
    new-instance v8, Lcom/zykj/mistake/utils/UploadUtils$ossUpload$2;

    .line 551
    .line 552
    const/4 v9, 0x0

    .line 553
    invoke-direct {v8, v7, v3, v0, v9}, Lcom/zykj/mistake/utils/UploadUtils$ossUpload$2;-><init>(Lcom/alibaba/sdk/android/oss/OSSClient;Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;Ljava/lang/String;Lh6/c;)V

    .line 554
    .line 555
    .line 556
    invoke-static {v5, v8, v4}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v3

    .line 560
    if-ne v3, v6, :cond_9

    .line 561
    .line 562
    :goto_3
    return-object v6

    .line 563
    :cond_9
    move-object v0, v2

    .line 564
    :goto_4
    check-cast v3, Ljava/lang/Boolean;

    .line 565
    .line 566
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 567
    .line 568
    .line 569
    move-result v2

    .line 570
    :goto_5
    if-eqz v2, :cond_a

    .line 571
    .line 572
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;->getEndpoint()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-static {v0, v10, v1}, Landroid/support/v4/media/f;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    return-object v0

    .line 581
    :cond_a
    const/16 v17, 0x0

    .line 582
    .line 583
    return-object v17
.end method
