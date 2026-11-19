.class public final Lcom/zykj/mistake/utils/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/zykj/mistake/utils/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/mistake/utils/j;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/utils/j;->a:Lcom/zykj/mistake/utils/j;

    .line 7
    .line 8
    return-void
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "screenshot.png"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Lkotlin/text/w;->u(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "res/image"

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Lkotlin/text/w;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v1

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lr6/f;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 24

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
    const-string v4, ".zip"

    .line 10
    .line 11
    instance-of v5, v3, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    move-object v5, v3

    .line 16
    check-cast v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;

    .line 17
    .line 18
    iget v6, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->label:I

    .line 19
    .line 20
    const/high16 v7, -0x80000000

    .line 21
    .line 22
    and-int v8, v6, v7

    .line 23
    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    sub-int/2addr v6, v7

    .line 27
    iput v6, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->label:I

    .line 28
    .line 29
    move-object/from16 v6, p0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;

    .line 33
    .line 34
    move-object/from16 v6, p0

    .line 35
    .line 36
    invoke-direct {v5, v6, v3}, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;-><init>(Lcom/zykj/mistake/utils/j;Lh6/c;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v3, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->result:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object v7, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 42
    .line 43
    iget v8, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->label:I

    .line 44
    .line 45
    const-string v9, "Download Failed"

    .line 46
    .line 47
    const/4 v10, 0x3

    .line 48
    const-string v11, "getAbsolutePath(...)"

    .line 49
    .line 50
    const/4 v12, 0x1

    .line 51
    const/4 v13, 0x2

    .line 52
    const/4 v14, 0x0

    .line 53
    const/4 v15, 0x0

    .line 54
    if-eqz v8, :cond_4

    .line 55
    .line 56
    if-eq v8, v12, :cond_3

    .line 57
    .line 58
    if-eq v8, v13, :cond_2

    .line 59
    .line 60
    if-ne v8, v10, :cond_1

    .line 61
    .line 62
    iget v0, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->I$1:I

    .line 63
    .line 64
    iget v1, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->I$0:I

    .line 65
    .line 66
    iget-object v2, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$13:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Ljava/lang/String;

    .line 69
    .line 70
    iget-object v2, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$12:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Ljava/io/File;

    .line 73
    .line 74
    iget-object v4, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$11:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, Ljava/lang/String;

    .line 77
    .line 78
    iget-object v8, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$10:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v8, Lcom/zykj/mistake/utils/NoteRemoteFileInfo;

    .line 81
    .line 82
    iget-object v8, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$8:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v8, Ljava/util/Iterator;

    .line 85
    .line 86
    iget-object v9, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$7:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v9, Ljava/lang/String;

    .line 89
    .line 90
    iget-object v12, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$6:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v12, Ljava/util/List;

    .line 93
    .line 94
    iget-object v12, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$5:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v12, Ljava/lang/Iterable;

    .line 97
    .line 98
    iget-object v12, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$4:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v12, Ljava/lang/String;

    .line 101
    .line 102
    iget-object v12, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$3:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v12, Ljava/lang/String;

    .line 105
    .line 106
    iget-object v12, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$2:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v12, Lr6/f;

    .line 109
    .line 110
    iget-object v13, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$1:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v13, Ljava/lang/String;

    .line 113
    .line 114
    iget-object v10, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v10, Ljava/lang/String;

    .line 117
    .line 118
    :try_start_0
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    .line 121
    const/4 v14, 0x3

    .line 122
    goto/16 :goto_7

    .line 123
    .line 124
    :catchall_0
    move-exception v0

    .line 125
    goto/16 :goto_a

    .line 126
    .line 127
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 130
    .line 131
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v0

    .line 135
    :cond_2
    iget v0, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->I$0:I

    .line 136
    .line 137
    iget-object v1, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$3:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v1, Ljava/lang/String;

    .line 140
    .line 141
    iget-object v2, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$2:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, Lr6/f;

    .line 144
    .line 145
    iget-object v4, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$1:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v4, Ljava/lang/String;

    .line 148
    .line 149
    iget-object v8, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$0:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v8, Ljava/lang/String;

    .line 152
    .line 153
    :try_start_1
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    .line 155
    .line 156
    move-object/from16 v23, v3

    .line 157
    .line 158
    move v3, v0

    .line 159
    move-object v0, v8

    .line 160
    move-object/from16 v8, v23

    .line 161
    .line 162
    move-object/from16 v23, v4

    .line 163
    .line 164
    move-object v4, v1

    .line 165
    move-object/from16 v1, v23

    .line 166
    .line 167
    goto/16 :goto_3

    .line 168
    .line 169
    :cond_3
    iget-object v0, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$4:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, Ljava/io/File;

    .line 172
    .line 173
    iget-object v1, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$3:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v1, Ljava/io/File;

    .line 176
    .line 177
    iget-object v1, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$2:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v1, Lr6/f;

    .line 180
    .line 181
    iget-object v1, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$1:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v1, Ljava/lang/String;

    .line 184
    .line 185
    iget-object v2, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$0:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v2, Ljava/lang/String;

    .line 188
    .line 189
    :try_start_2
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_4
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :try_start_3
    invoke-static {v0, v4, v14}, Lkotlin/text/w;->u(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-eqz v3, :cond_7

    .line 201
    .line 202
    new-instance v3, Ljava/io/File;

    .line 203
    .line 204
    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    new-instance v8, Ljava/io/File;

    .line 208
    .line 209
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    new-instance v13, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-direct {v8, v10, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v8}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z

    .line 236
    .line 237
    .line 238
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    iput-object v15, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$0:Ljava/lang/Object;

    .line 246
    .line 247
    iput-object v1, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$1:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v15, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$2:Ljava/lang/Object;

    .line 250
    .line 251
    iput-object v15, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$3:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object v8, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$4:Ljava/lang/Object;

    .line 254
    .line 255
    iput v14, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->I$0:I

    .line 256
    .line 257
    iput v12, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->label:I

    .line 258
    .line 259
    invoke-interface {v2, v0, v3, v5}, Lr6/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    if-ne v3, v7, :cond_5

    .line 264
    .line 265
    goto/16 :goto_6

    .line 266
    .line 267
    :cond_5
    move-object v0, v8

    .line 268
    :goto_1
    check-cast v3, Ljava/lang/String;

    .line 269
    .line 270
    if-nez v3, :cond_6

    .line 271
    .line 272
    new-instance v0, Ljava/lang/Exception;

    .line 273
    .line 274
    invoke-direct {v0, v9}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    return-object v0

    .line 286
    :cond_6
    invoke-static {v3, v1}, Lcom/blankj/utilcode/util/c;->q(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v0}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z

    .line 290
    .line 291
    .line 292
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    goto/16 :goto_9

    .line 297
    .line 298
    :cond_7
    const-string v3, ".json"

    .line 299
    .line 300
    invoke-static {v0, v3, v14}, Lkotlin/text/w;->u(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-eqz v3, :cond_12

    .line 305
    .line 306
    sget v3, Lcom/blankj/utilcode/util/e;->a:I

    .line 307
    .line 308
    invoke-static {v0}, Lcom/blankj/utilcode/util/c0;->f(Ljava/lang/String;)Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-eqz v3, :cond_8

    .line 313
    .line 314
    const-string v3, ""

    .line 315
    .line 316
    goto :goto_2

    .line 317
    :cond_8
    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 318
    .line 319
    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    const/4 v4, -0x1

    .line 324
    if-ne v3, v4, :cond_9

    .line 325
    .line 326
    move-object v3, v0

    .line 327
    goto :goto_2

    .line 328
    :cond_9
    add-int/2addr v3, v12

    .line 329
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    :goto_2
    new-instance v4, Ljava/io/File;

    .line 334
    .line 335
    invoke-direct {v4, v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    iput-object v0, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$0:Ljava/lang/Object;

    .line 346
    .line 347
    iput-object v1, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$1:Ljava/lang/Object;

    .line 348
    .line 349
    iput-object v2, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$2:Ljava/lang/Object;

    .line 350
    .line 351
    iput-object v3, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$3:Ljava/lang/Object;

    .line 352
    .line 353
    iput v14, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->I$0:I

    .line 354
    .line 355
    iput v13, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->label:I

    .line 356
    .line 357
    invoke-interface {v2, v0, v4, v5}, Lr6/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    if-ne v4, v7, :cond_a

    .line 362
    .line 363
    goto/16 :goto_6

    .line 364
    .line 365
    :cond_a
    move-object v8, v4

    .line 366
    move-object v4, v3

    .line 367
    move v3, v14

    .line 368
    :goto_3
    check-cast v8, Ljava/lang/String;

    .line 369
    .line 370
    if-nez v8, :cond_b

    .line 371
    .line 372
    new-instance v0, Ljava/lang/Exception;

    .line 373
    .line 374
    invoke-direct {v0, v9}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    return-object v0

    .line 386
    :cond_b
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v0, v4}, Lkotlin/text/p;->X(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-static {v8}, Lcom/blankj/utilcode/util/c;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    new-instance v9, Lcom/zykj/mistake/utils/i;

    .line 398
    .line 399
    invoke-direct {v9}, Lcom/zykj/mistake/utils/i;-><init>()V

    .line 400
    .line 401
    .line 402
    iget-object v9, v9, Lk1/a;->b:Ljava/lang/reflect/Type;

    .line 403
    .line 404
    invoke-static {}, Lcom/blankj/utilcode/util/f;->a()Lcom/google/gson/g;

    .line 405
    .line 406
    .line 407
    move-result-object v10

    .line 408
    new-instance v12, Lk1/a;

    .line 409
    .line 410
    invoke-direct {v12, v9}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v10, v4, v12}, Lcom/google/gson/g;->c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    check-cast v4, Ljava/util/List;

    .line 418
    .line 419
    invoke-static {v8}, Lcom/blankj/utilcode/util/e;->g(Ljava/lang/String;)Ljava/io/File;

    .line 420
    .line 421
    .line 422
    move-result-object v8

    .line 423
    invoke-static {v8}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z

    .line 424
    .line 425
    .line 426
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    move-object v9, v0

    .line 434
    move-object v13, v1

    .line 435
    move-object v12, v2

    .line 436
    move v1, v3

    .line 437
    move-object v8, v4

    .line 438
    move v0, v14

    .line 439
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    if-eqz v2, :cond_11

    .line 444
    .line 445
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    check-cast v2, Lcom/zykj/mistake/utils/NoteRemoteFileInfo;

    .line 450
    .line 451
    invoke-virtual {v2}, Lcom/zykj/mistake/utils/NoteRemoteFileInfo;->getUrl()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    invoke-static {v3, v9}, Lkotlin/text/p;->V(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    new-instance v3, Ljava/io/File;

    .line 460
    .line 461
    invoke-direct {v3, v13, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    invoke-static {v3}, Lcom/blankj/utilcode/util/e;->h(Ljava/io/File;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v10

    .line 468
    invoke-static {v4}, Lcom/zykj/mistake/utils/j;->b(Ljava/lang/String;)Z

    .line 469
    .line 470
    .line 471
    move-result v16

    .line 472
    if-nez v16, :cond_e

    .line 473
    .line 474
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 475
    .line 476
    .line 477
    move-result v16

    .line 478
    if-nez v16, :cond_c

    .line 479
    .line 480
    goto :goto_5

    .line 481
    :cond_c
    invoke-virtual {v2}, Lcom/zykj/mistake/utils/NoteRemoteFileInfo;->getMd5()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v14

    .line 485
    invoke-virtual {v10, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v10

    .line 489
    if-nez v10, :cond_d

    .line 490
    .line 491
    goto :goto_5

    .line 492
    :cond_d
    const/4 v14, 0x3

    .line 493
    goto :goto_8

    .line 494
    :cond_e
    :goto_5
    invoke-static {v3}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2}, Lcom/zykj/mistake/utils/NoteRemoteFileInfo;->getUrl()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v10

    .line 505
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    iput-object v15, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$0:Ljava/lang/Object;

    .line 509
    .line 510
    iput-object v13, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$1:Ljava/lang/Object;

    .line 511
    .line 512
    iput-object v12, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$2:Ljava/lang/Object;

    .line 513
    .line 514
    iput-object v15, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$3:Ljava/lang/Object;

    .line 515
    .line 516
    iput-object v15, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$4:Ljava/lang/Object;

    .line 517
    .line 518
    iput-object v15, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$5:Ljava/lang/Object;

    .line 519
    .line 520
    iput-object v15, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$6:Ljava/lang/Object;

    .line 521
    .line 522
    iput-object v9, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$7:Ljava/lang/Object;

    .line 523
    .line 524
    iput-object v8, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$8:Ljava/lang/Object;

    .line 525
    .line 526
    iput-object v15, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$9:Ljava/lang/Object;

    .line 527
    .line 528
    iput-object v15, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$10:Ljava/lang/Object;

    .line 529
    .line 530
    iput-object v4, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$11:Ljava/lang/Object;

    .line 531
    .line 532
    iput-object v3, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$12:Ljava/lang/Object;

    .line 533
    .line 534
    iput-object v15, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->L$13:Ljava/lang/Object;

    .line 535
    .line 536
    iput v1, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->I$0:I

    .line 537
    .line 538
    iput v0, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->I$1:I

    .line 539
    .line 540
    const/4 v14, 0x0

    .line 541
    iput v14, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->I$2:I

    .line 542
    .line 543
    const/4 v14, 0x3

    .line 544
    iput v14, v5, Lcom/zykj/mistake/utils/NoteDownloadUtils$downloadNote$1;->label:I

    .line 545
    .line 546
    invoke-interface {v12, v2, v10, v5}, Lr6/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    if-ne v2, v7, :cond_f

    .line 551
    .line 552
    :goto_6
    return-object v7

    .line 553
    :cond_f
    move-object/from16 v23, v3

    .line 554
    .line 555
    move-object v3, v2

    .line 556
    move-object/from16 v2, v23

    .line 557
    .line 558
    :goto_7
    check-cast v3, Ljava/lang/String;

    .line 559
    .line 560
    if-nez v3, :cond_10

    .line 561
    .line 562
    invoke-static {v4}, Lcom/zykj/mistake/utils/j;->b(Ljava/lang/String;)Z

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    if-eqz v3, :cond_10

    .line 567
    .line 568
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 569
    .line 570
    .line 571
    move-result-object v3

    .line 572
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    sget v4, Lcom/zykj/mistake/R$mipmap;->pic_error:I

    .line 577
    .line 578
    invoke-static {v3, v4, v15}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 579
    .line 580
    .line 581
    move-result-object v17

    .line 582
    if-eqz v17, :cond_10

    .line 583
    .line 584
    const/16 v21, 0x7

    .line 585
    .line 586
    const/16 v22, 0x0

    .line 587
    .line 588
    const/16 v18, 0x0

    .line 589
    .line 590
    const/16 v19, 0x0

    .line 591
    .line 592
    const/16 v20, 0x0

    .line 593
    .line 594
    invoke-static/range {v17 .. v22}, Landroidx/core/graphics/drawable/DrawableKt;->toBitmap$default(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 595
    .line 596
    .line 597
    move-result-object v3

    .line 598
    if-eqz v3, :cond_10

    .line 599
    .line 600
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 601
    .line 602
    invoke-static {v3, v2}, Lcom/blankj/utilcode/util/c;->n(Landroid/graphics/Bitmap;Ljava/io/File;)Z

    .line 603
    .line 604
    .line 605
    :cond_10
    :goto_8
    const/4 v14, 0x0

    .line 606
    goto/16 :goto_4

    .line 607
    .line 608
    :cond_11
    invoke-static {v13}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    goto :goto_9

    .line 613
    :cond_12
    new-instance v0, Ljava/lang/Exception;

    .line 614
    .line 615
    const-string v1, "Url is Unknow"

    .line 616
    .line 617
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    :goto_9
    invoke-static {v0}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 636
    goto :goto_b

    .line 637
    :goto_a
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    :goto_b
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v1

    .line 649
    if-eqz v1, :cond_13

    .line 650
    .line 651
    goto :goto_c

    .line 652
    :cond_13
    move-object v15, v0

    .line 653
    :goto_c
    check-cast v15, Lkotlin/Result;

    .line 654
    .line 655
    if-eqz v15, :cond_14

    .line 656
    .line 657
    invoke-virtual {v15}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    goto :goto_d

    .line 662
    :cond_14
    new-instance v0, Ljava/lang/Exception;

    .line 663
    .line 664
    const-string v1, "Download failed"

    .line 665
    .line 666
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    :goto_d
    return-object v0
.end method

.method public final c(Ljava/io/File;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lr6/f;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->label:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;-><init>(Lcom/zykj/mistake/utils/j;Lh6/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v4, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->label:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eq v4, v7, :cond_2

    .line 42
    .line 43
    if-ne v4, v5, :cond_1

    .line 44
    .line 45
    iget v4, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$2:I

    .line 46
    .line 47
    iget v8, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$1:I

    .line 48
    .line 49
    iget v9, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$0:I

    .line 50
    .line 51
    iget-object v10, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$11:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v10, Ljava/lang/String;

    .line 54
    .line 55
    iget-object v10, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$10:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v10, Ljava/lang/String;

    .line 58
    .line 59
    iget-object v11, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$9:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v11, Ljava/lang/String;

    .line 62
    .line 63
    iget-object v11, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$8:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v11, Ljava/io/File;

    .line 66
    .line 67
    iget-object v12, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$7:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v12, Ljava/io/File;

    .line 70
    .line 71
    iget-object v12, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$6:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v12, [Ljava/io/File;

    .line 74
    .line 75
    iget-object v13, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$5:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v13, Lr6/f;

    .line 78
    .line 79
    iget-object v14, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$4:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v14, Ljava/lang/String;

    .line 82
    .line 83
    iget-object v15, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$3:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v15, Ljava/lang/String;

    .line 86
    .line 87
    iget-object v5, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v5, Ljava/util/ArrayList;

    .line 90
    .line 91
    iget-object v7, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v7, Ljava/util/ArrayList;

    .line 94
    .line 95
    iget-object v6, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v6, Ljava/io/File;

    .line 98
    .line 99
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move-object v6, v14

    .line 103
    const/4 v2, 0x0

    .line 104
    move-object v14, v3

    .line 105
    const/4 v3, 0x2

    .line 106
    goto/16 :goto_4

    .line 107
    .line 108
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 111
    .line 112
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v0

    .line 116
    :cond_2
    iget v4, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$2:I

    .line 117
    .line 118
    iget v5, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$1:I

    .line 119
    .line 120
    iget v6, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$0:I

    .line 121
    .line 122
    iget-object v7, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$8:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v7, Ljava/io/File;

    .line 125
    .line 126
    iget-object v7, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$7:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v7, Ljava/io/File;

    .line 129
    .line 130
    iget-object v7, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$6:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v7, [Ljava/io/File;

    .line 133
    .line 134
    iget-object v8, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$5:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v8, Lr6/f;

    .line 137
    .line 138
    iget-object v9, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$4:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v9, Ljava/lang/String;

    .line 141
    .line 142
    iget-object v10, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$3:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v10, Ljava/lang/String;

    .line 145
    .line 146
    iget-object v11, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v11, Ljava/util/ArrayList;

    .line 149
    .line 150
    iget-object v12, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v12, Ljava/util/ArrayList;

    .line 153
    .line 154
    iget-object v13, v1, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v13, Ljava/io/File;

    .line 157
    .line 158
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_2

    .line 162
    .line 163
    :cond_3
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    if-eqz v0, :cond_a

    .line 171
    .line 172
    array-length v4, v0

    .line 173
    move-object/from16 v7, p2

    .line 174
    .line 175
    move-object/from16 v8, p3

    .line 176
    .line 177
    move-object/from16 v9, p4

    .line 178
    .line 179
    move-object/from16 v10, p5

    .line 180
    .line 181
    move-object/from16 v11, p6

    .line 182
    .line 183
    move-object v13, v0

    .line 184
    move-object v12, v1

    .line 185
    const/4 v0, 0x0

    .line 186
    const/4 v1, 0x0

    .line 187
    :goto_1
    if-ge v0, v4, :cond_a

    .line 188
    .line 189
    aget-object v6, v13, v0

    .line 190
    .line 191
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    const/4 v14, 0x0

    .line 196
    if-eqz v5, :cond_5

    .line 197
    .line 198
    iput-object v14, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 199
    .line 200
    iput-object v7, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 201
    .line 202
    iput-object v8, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v9, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$3:Ljava/lang/Object;

    .line 205
    .line 206
    iput-object v10, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$4:Ljava/lang/Object;

    .line 207
    .line 208
    iput-object v11, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$5:Ljava/lang/Object;

    .line 209
    .line 210
    iput-object v13, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$6:Ljava/lang/Object;

    .line 211
    .line 212
    iput-object v14, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$7:Ljava/lang/Object;

    .line 213
    .line 214
    iput-object v14, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$8:Ljava/lang/Object;

    .line 215
    .line 216
    iput-object v14, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$9:Ljava/lang/Object;

    .line 217
    .line 218
    iput-object v14, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$10:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v14, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$11:Ljava/lang/Object;

    .line 221
    .line 222
    iput v1, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$0:I

    .line 223
    .line 224
    iput v0, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$1:I

    .line 225
    .line 226
    iput v4, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$2:I

    .line 227
    .line 228
    const/4 v5, 0x0

    .line 229
    iput v5, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$3:I

    .line 230
    .line 231
    const/4 v5, 0x1

    .line 232
    iput v5, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->label:I

    .line 233
    .line 234
    sget-object v5, Lcom/zykj/mistake/utils/j;->a:Lcom/zykj/mistake/utils/j;

    .line 235
    .line 236
    invoke-virtual/range {v5 .. v12}, Lcom/zykj/mistake/utils/j;->c(Ljava/io/File;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lr6/f;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    if-ne v5, v3, :cond_4

    .line 241
    .line 242
    move-object v14, v3

    .line 243
    goto/16 :goto_3

    .line 244
    .line 245
    :cond_4
    move-object v5, v11

    .line 246
    move-object v11, v8

    .line 247
    move-object v8, v5

    .line 248
    move-object v5, v10

    .line 249
    move-object v10, v9

    .line 250
    move-object v9, v5

    .line 251
    move v5, v0

    .line 252
    move v6, v1

    .line 253
    move-object v1, v12

    .line 254
    move-object v12, v7

    .line 255
    move-object v7, v13

    .line 256
    :goto_2
    move-object v0, v11

    .line 257
    move-object v11, v8

    .line 258
    move-object v8, v0

    .line 259
    move-object v0, v10

    .line 260
    move-object v10, v9

    .line 261
    move-object v9, v0

    .line 262
    move-object v14, v3

    .line 263
    move v0, v5

    .line 264
    move-object v13, v7

    .line 265
    move-object v7, v12

    .line 266
    const/4 v3, 0x2

    .line 267
    const/16 v16, 0x1

    .line 268
    .line 269
    move-object v12, v1

    .line 270
    move v1, v6

    .line 271
    goto/16 :goto_5

    .line 272
    .line 273
    :cond_5
    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    if-eqz v5, :cond_9

    .line 278
    .line 279
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    new-instance v15, Ljava/lang/StringBuilder;

    .line 287
    .line 288
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    const-string v14, "/"

    .line 295
    .line 296
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v15

    .line 303
    invoke-static {v5, v15}, Lkotlin/text/p;->V(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v15

    .line 307
    invoke-static {v10, v14, v15}, Landroid/support/v4/media/f;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v14

    .line 311
    new-instance v2, Ljava/lang/StringBuilder;

    .line 312
    .line 313
    move-object/from16 v17, v3

    .line 314
    .line 315
    const-string v3, "localPath -> "

    .line 316
    .line 317
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    const-string v3, " \nremotePath -> "

    .line 324
    .line 325
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-static {v2}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    const/4 v2, 0x0

    .line 343
    iput-object v2, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$0:Ljava/lang/Object;

    .line 344
    .line 345
    iput-object v7, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$1:Ljava/lang/Object;

    .line 346
    .line 347
    iput-object v8, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$2:Ljava/lang/Object;

    .line 348
    .line 349
    iput-object v9, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$3:Ljava/lang/Object;

    .line 350
    .line 351
    iput-object v10, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$4:Ljava/lang/Object;

    .line 352
    .line 353
    iput-object v11, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$5:Ljava/lang/Object;

    .line 354
    .line 355
    iput-object v13, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$6:Ljava/lang/Object;

    .line 356
    .line 357
    iput-object v2, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$7:Ljava/lang/Object;

    .line 358
    .line 359
    iput-object v6, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$8:Ljava/lang/Object;

    .line 360
    .line 361
    iput-object v2, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$9:Ljava/lang/Object;

    .line 362
    .line 363
    iput-object v15, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$10:Ljava/lang/Object;

    .line 364
    .line 365
    iput-object v2, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->L$11:Ljava/lang/Object;

    .line 366
    .line 367
    iput v1, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$0:I

    .line 368
    .line 369
    iput v0, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$1:I

    .line 370
    .line 371
    iput v4, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$2:I

    .line 372
    .line 373
    const/4 v2, 0x0

    .line 374
    iput v2, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->I$3:I

    .line 375
    .line 376
    const/4 v3, 0x2

    .line 377
    iput v3, v12, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadFile$1;->label:I

    .line 378
    .line 379
    invoke-interface {v11, v5, v14, v12}, Lr6/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    move-object/from16 v14, v17

    .line 384
    .line 385
    if-ne v5, v14, :cond_6

    .line 386
    .line 387
    :goto_3
    return-object v14

    .line 388
    :cond_6
    move-object/from16 v18, v8

    .line 389
    .line 390
    move v8, v0

    .line 391
    move-object v0, v5

    .line 392
    move-object/from16 v5, v18

    .line 393
    .line 394
    move-object/from16 v18, v9

    .line 395
    .line 396
    move v9, v1

    .line 397
    move-object v1, v12

    .line 398
    move-object v12, v13

    .line 399
    move-object v13, v11

    .line 400
    move-object v11, v6

    .line 401
    move-object v6, v10

    .line 402
    move-object v10, v15

    .line 403
    move-object/from16 v15, v18

    .line 404
    .line 405
    :goto_4
    check-cast v0, Ljava/lang/String;

    .line 406
    .line 407
    if-eqz v0, :cond_8

    .line 408
    .line 409
    new-instance v2, Lcom/zykj/mistake/utils/NoteRemoteFileInfo;

    .line 410
    .line 411
    invoke-static {v11}, Lcom/blankj/utilcode/util/e;->h(Ljava/io/File;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v11

    .line 415
    invoke-direct {v2, v0, v11}, Lcom/zykj/mistake/utils/NoteRemoteFileInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    invoke-static {v10}, Lcom/zykj/mistake/utils/j;->b(Ljava/lang/String;)Z

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-eqz v2, :cond_7

    .line 426
    .line 427
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    :cond_7
    move-object v10, v6

    .line 431
    move v0, v8

    .line 432
    move-object v11, v13

    .line 433
    const/16 v16, 0x1

    .line 434
    .line 435
    move-object v8, v5

    .line 436
    move-object v13, v12

    .line 437
    move-object v12, v1

    .line 438
    move v1, v9

    .line 439
    move-object v9, v15

    .line 440
    goto :goto_5

    .line 441
    :cond_8
    new-instance v0, Ljava/lang/Exception;

    .line 442
    .line 443
    const-string v1, "Upload Failed"

    .line 444
    .line 445
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    throw v0

    .line 449
    :cond_9
    move-object v14, v3

    .line 450
    const/4 v3, 0x2

    .line 451
    const/16 v16, 0x1

    .line 452
    .line 453
    :goto_5
    add-int/lit8 v0, v0, 0x1

    .line 454
    .line 455
    move-object/from16 v2, p0

    .line 456
    .line 457
    move-object v3, v14

    .line 458
    goto/16 :goto_1

    .line 459
    .line 460
    :cond_a
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 461
    .line 462
    return-object v0
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Lr6/f;Landroidx/navigation/i;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p5, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->label:I

    .line 18
    .line 19
    :goto_0
    move-object v8, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;-><init>(Lcom/zykj/mistake/utils/j;Lh6/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v1, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->label:I

    .line 32
    .line 33
    const/4 v9, 0x2

    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v2, :cond_2

    .line 38
    .line 39
    if-ne v1, v9, :cond_1

    .line 40
    .line 41
    iget-object p1, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$7:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ljava/io/File;

    .line 44
    .line 45
    iget-object p1, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$6:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/lang/String;

    .line 48
    .line 49
    iget-object p1, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$5:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Ljava/util/ArrayList;

    .line 52
    .line 53
    iget-object p1, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$4:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Ljava/util/ArrayList;

    .line 56
    .line 57
    iget-object p1, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$3:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Lr6/c;

    .line 60
    .line 61
    iget-object p1, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$2:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Lr6/f;

    .line 64
    .line 65
    iget-object p1, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$1:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, Ljava/lang/String;

    .line 68
    .line 69
    iget-object p1, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {p5}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-object p5

    .line 77
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_2
    iget-object p1, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$5:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Ljava/util/ArrayList;

    .line 88
    .line 89
    iget-object p2, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$4:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p2, Ljava/util/ArrayList;

    .line 92
    .line 93
    iget-object p3, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$3:Ljava/lang/Object;

    .line 94
    .line 95
    move-object p4, p3

    .line 96
    check-cast p4, Lr6/c;

    .line 97
    .line 98
    iget-object p3, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$2:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p3, Lr6/f;

    .line 101
    .line 102
    iget-object v1, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$1:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Ljava/lang/String;

    .line 105
    .line 106
    iget-object v2, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$0:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {p5}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    invoke-static {p5}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    new-instance v3, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .line 121
    .line 122
    new-instance v4, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    move p5, v2

    .line 128
    new-instance v2, Ljava/io/File;

    .line 129
    .line 130
    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iput-object p1, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$0:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object p2, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$1:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object p3, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$2:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object p4, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$3:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v3, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$4:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object v4, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$5:Ljava/lang/Object;

    .line 144
    .line 145
    iput p5, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->label:I

    .line 146
    .line 147
    move-object v1, p0

    .line 148
    move-object v5, p1

    .line 149
    move-object v6, p2

    .line 150
    move-object v7, p3

    .line 151
    invoke-virtual/range {v1 .. v8}, Lcom/zykj/mistake/utils/j;->c(Ljava/io/File;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lr6/f;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    if-ne p1, v0, :cond_4

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_4
    move-object p2, v3

    .line 159
    move-object p1, v4

    .line 160
    move-object v2, v5

    .line 161
    move-object v1, v6

    .line 162
    move-object p3, v7

    .line 163
    :goto_2
    if-eqz p4, :cond_5

    .line 164
    .line 165
    invoke-interface {p4, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Ljava/lang/Boolean;

    .line 170
    .line 171
    :cond_5
    invoke-static {}, Lcom/blankj/utilcode/util/f;->a()Lcom/google/gson/g;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p1, p2}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    new-instance p2, Ljava/io/File;

    .line 180
    .line 181
    const-string p4, "fileList.json"

    .line 182
    .line 183
    invoke-direct {p2, v2, p4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    const/4 p4, 0x0

    .line 187
    invoke-static {p2, p1, p4}, Lcom/blankj/utilcode/util/c;->u(Ljava/io/File;Ljava/lang/String;Z)Z

    .line 188
    .line 189
    .line 190
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    const-string p4, "getAbsolutePath(...)"

    .line 195
    .line 196
    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    const-string p4, "/"

    .line 204
    .line 205
    invoke-static {v1, p4, p2}, Landroid/support/v4/media/f;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    const/4 p4, 0x0

    .line 210
    iput-object p4, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$0:Ljava/lang/Object;

    .line 211
    .line 212
    iput-object p4, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$1:Ljava/lang/Object;

    .line 213
    .line 214
    iput-object p4, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$2:Ljava/lang/Object;

    .line 215
    .line 216
    iput-object p4, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$3:Ljava/lang/Object;

    .line 217
    .line 218
    iput-object p4, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$4:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object p4, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$5:Ljava/lang/Object;

    .line 221
    .line 222
    iput-object p4, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$6:Ljava/lang/Object;

    .line 223
    .line 224
    iput-object p4, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->L$7:Ljava/lang/Object;

    .line 225
    .line 226
    iput v9, v8, Lcom/zykj/mistake/utils/NoteDownloadUtils$uploadNote$1;->label:I

    .line 227
    .line 228
    invoke-interface {p3, p1, p2, v8}, Lr6/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    if-ne p1, v0, :cond_6

    .line 233
    .line 234
    :goto_3
    return-object v0

    .line 235
    :cond_6
    return-object p1
.end method
