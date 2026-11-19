.class public final Lcom/friday/document/receiver/AliMessageReceiver;
.super Lq2/c;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/receiver/AliMessageReceiver$a;
    }
.end annotation


# instance fields
.field public e:Lcom/friday/common/dao/ResourceDao;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq2/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic b(Lcom/friday/document/receiver/AliMessageReceiver;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/receiver/AliMessageReceiver;->e()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(Lcom/friday/document/receiver/AliMessageReceiver;Lcom/friday/document/receiver/AliMessageReceiver$a;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/receiver/AliMessageReceiver;->f(Lcom/friday/document/receiver/AliMessageReceiver$a;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final d()Lcom/friday/common/dao/ResourceDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/receiver/AliMessageReceiver;->e:Lcom/friday/common/dao/ResourceDao;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "resourceDao"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->t()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final f(Lcom/friday/document/receiver/AliMessageReceiver$a;Lvc/c;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    instance-of v1, v0, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->k:I

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
    iput v2, v1, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->k:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    :goto_0
    move-object v9, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;

    .line 26
    .line 27
    move-object/from16 v2, p0

    .line 28
    .line 29
    invoke-direct {v1, v2, v0}, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;-><init>(Lcom/friday/document/receiver/AliMessageReceiver;Lvc/c;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->i:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget v3, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->k:I

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    const-string v12, "\uff0cpicture="

    .line 43
    .line 44
    const/4 v13, 0x2

    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    if-eq v3, v4, :cond_2

    .line 48
    .line 49
    if-ne v3, v13, :cond_1

    .line 50
    .line 51
    iget-object v1, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lcom/friday/common/entity/ResourceEntity;

    .line 54
    .line 55
    iget-object v3, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->g:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->f:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Ljava/lang/String;

    .line 62
    .line 63
    iget-object v3, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, Ljava/lang/String;

    .line 66
    .line 67
    iget-object v3, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, Ljava/util/List;

    .line 70
    .line 71
    iget-object v3, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, Lcom/friday/document/receiver/AliMessageReceiver$a;

    .line 74
    .line 75
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_4

    .line 79
    .line 80
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 83
    .line 84
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_2
    iget-object v3, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->g:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v3, Ljava/lang/String;

    .line 91
    .line 92
    iget-object v4, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->f:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v4, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v5, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->e:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v5, Ljava/lang/String;

    .line 99
    .line 100
    iget-object v6, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->d:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v6, Ljava/util/List;

    .line 103
    .line 104
    iget-object v7, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v7, Lcom/friday/document/receiver/AliMessageReceiver$a;

    .line 107
    .line 108
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move-object v14, v7

    .line 112
    goto/16 :goto_2

    .line 113
    .line 114
    :cond_3
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {p1 .. p1}, Lcom/friday/document/receiver/AliMessageReceiver$a;->a()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v2}, Lcom/friday/document/receiver/AliMessageReceiver;->e()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    new-instance v5, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v6, "note_v2/res/"

    .line 131
    .line 132
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    const/4 v5, 0x0

    .line 143
    const/4 v6, 0x0

    .line 144
    invoke-static {v0, v3, v5, v13, v6}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_4

    .line 149
    .line 150
    const-string v0, "\u9875\u9762 AliMessageReceiver.kt -> handleMessageEntity\uff0c\u5f53\u524d\u63a8\u9001\u4e0d\u662f\u4e91\u7b14\u8bb0\u56fe\u7247\uff0c\u8df3\u8fc7\u5904\u7406"

    .line 151
    .line 152
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 160
    .line 161
    return-object v0

    .line 162
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/friday/document/receiver/AliMessageReceiver$a;->a()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    const-string v0, "/"

    .line 167
    .line 168
    filled-new-array {v0}, [Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v15

    .line 172
    const/16 v18, 0x6

    .line 173
    .line 174
    const/16 v19, 0x0

    .line 175
    .line 176
    const/16 v16, 0x0

    .line 177
    .line 178
    const/16 v17, 0x0

    .line 179
    .line 180
    invoke-static/range {v14 .. v19}, Lqd/c0;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    const/16 v5, 0x8

    .line 189
    .line 190
    if-ge v3, v5, :cond_5

    .line 191
    .line 192
    invoke-virtual/range {p1 .. p1}, Lcom/friday/document/receiver/AliMessageReceiver$a;->a()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    new-instance v1, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    .line 200
    .line 201
    const-string v3, "\u9875\u9762 AliMessageReceiver.kt -> handleMessageEntity\uff0c\u56fe\u7247\u5730\u5740\u683c\u5f0f\u5f02\u5e38\uff0cpicture="

    .line 202
    .line 203
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 221
    .line 222
    return-object v0

    .line 223
    :cond_5
    invoke-static {v0}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    move-object v6, v3

    .line 228
    check-cast v6, Ljava/lang/String;

    .line 229
    .line 230
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    sub-int/2addr v3, v13

    .line 235
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    move-object v5, v3

    .line 240
    check-cast v5, Ljava/lang/String;

    .line 241
    .line 242
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    add-int/lit8 v3, v3, -0x3

    .line 247
    .line 248
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    check-cast v3, Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {v2}, Lcom/friday/document/receiver/AliMessageReceiver;->d()Lcom/friday/common/dao/ResourceDao;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    move-object/from16 v14, p1

    .line 259
    .line 260
    iput-object v14, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->c:Ljava/lang/Object;

    .line 261
    .line 262
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    iput-object v8, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->d:Ljava/lang/Object;

    .line 267
    .line 268
    iput-object v6, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->e:Ljava/lang/Object;

    .line 269
    .line 270
    iput-object v5, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->f:Ljava/lang/Object;

    .line 271
    .line 272
    iput-object v3, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->g:Ljava/lang/Object;

    .line 273
    .line 274
    iput v4, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->k:I

    .line 275
    .line 276
    move-object v4, v3

    .line 277
    move-object v3, v7

    .line 278
    const-wide/16 v7, 0x0

    .line 279
    .line 280
    const/16 v10, 0x8

    .line 281
    .line 282
    const/4 v11, 0x0

    .line 283
    invoke-static/range {v3 .. v11}, Lcom/friday/common/dao/ResourceDao;->n(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    if-ne v3, v1, :cond_6

    .line 288
    .line 289
    goto/16 :goto_3

    .line 290
    .line 291
    :cond_6
    move-object/from16 v21, v6

    .line 292
    .line 293
    move-object v6, v0

    .line 294
    move-object v0, v3

    .line 295
    move-object v3, v4

    .line 296
    move-object v4, v5

    .line 297
    move-object/from16 v5, v21

    .line 298
    .line 299
    :goto_2
    check-cast v0, Lcom/friday/common/entity/ResourceEntity;

    .line 300
    .line 301
    if-nez v0, :cond_7

    .line 302
    .line 303
    new-instance v0, Ljava/lang/StringBuilder;

    .line 304
    .line 305
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 306
    .line 307
    .line 308
    const-string v1, "\u9875\u9762 AliMessageReceiver.kt -> handleMessageEntity\uff0c\u672a\u627e\u5230\u56fe\u7247\u8d44\u6e90\uff0cfileId="

    .line 309
    .line 310
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    const-string v1, "\uff0cpageName="

    .line 317
    .line 318
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    const-string v1, "\uff0cpicName="

    .line 325
    .line 326
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 344
    .line 345
    return-object v0

    .line 346
    :cond_7
    invoke-virtual {v0}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    invoke-virtual {v14}, Lcom/friday/document/receiver/AliMessageReceiver$a;->a()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    new-instance v10, Ljava/lang/StringBuilder;

    .line 355
    .line 356
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 357
    .line 358
    .line 359
    const-string v11, "\u9875\u9762 AliMessageReceiver.kt -> handleMessageEntity\uff0c\u5f00\u59cb\u4e0b\u8f7d\u540e\u7aef\u63a8\u9001 picture\uff0cresourceId="

    .line 360
    .line 361
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    invoke-static {v7}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    sget-object v7, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 385
    .line 386
    invoke-virtual {v7}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 387
    .line 388
    .line 389
    move-result-object v15

    .line 390
    invoke-virtual {v14}, Lcom/friday/document/receiver/AliMessageReceiver$a;->a()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v16

    .line 394
    invoke-virtual {v0}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v17

    .line 398
    const/16 v19, 0x4

    .line 399
    .line 400
    const/16 v20, 0x0

    .line 401
    .line 402
    const/16 v18, 0x0

    .line 403
    .line 404
    invoke-static/range {v15 .. v20}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    invoke-virtual {v14}, Lcom/friday/document/receiver/AliMessageReceiver$a;->a()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v8

    .line 415
    new-instance v10, Ljava/lang/StringBuilder;

    .line 416
    .line 417
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 418
    .line 419
    .line 420
    const-string v11, "\u9875\u9762 AliMessageReceiver.kt -> handleMessageEntity\uff0c\u5df2\u4e0b\u8f7d\u540e\u7aef\u63a8\u9001 picture \u5e76\u66ff\u6362\u672c\u5730\u56fe\u7247\uff0cresourceId="

    .line 421
    .line 422
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v7

    .line 438
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v7

    .line 442
    invoke-static {v7}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2}, Lcom/friday/document/receiver/AliMessageReceiver;->d()Lcom/friday/common/dao/ResourceDao;

    .line 446
    .line 447
    .line 448
    move-result-object v7

    .line 449
    invoke-virtual {v0}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v8

    .line 453
    invoke-virtual {v14}, Lcom/friday/document/receiver/AliMessageReceiver$a;->a()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v10

    .line 457
    iput-object v14, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->c:Ljava/lang/Object;

    .line 458
    .line 459
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    iput-object v6, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->d:Ljava/lang/Object;

    .line 464
    .line 465
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    iput-object v5, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->e:Ljava/lang/Object;

    .line 470
    .line 471
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    iput-object v4, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->f:Ljava/lang/Object;

    .line 476
    .line 477
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    iput-object v3, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->g:Ljava/lang/Object;

    .line 482
    .line 483
    iput-object v0, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->h:Ljava/lang/Object;

    .line 484
    .line 485
    iput v13, v9, Lcom/friday/document/receiver/AliMessageReceiver$handleMessageEntity$1;->k:I

    .line 486
    .line 487
    invoke-interface {v7, v8, v10, v9}, Lcom/friday/common/dao/ResourceDao;->a(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    if-ne v3, v1, :cond_8

    .line 492
    .line 493
    :goto_3
    return-object v1

    .line 494
    :cond_8
    move-object v1, v0

    .line 495
    move-object v3, v14

    .line 496
    :goto_4
    invoke-virtual {v1}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-virtual {v3}, Lcom/friday/document/receiver/AliMessageReceiver$a;->a()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    new-instance v3, Ljava/lang/StringBuilder;

    .line 505
    .line 506
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 507
    .line 508
    .line 509
    const-string v4, "\u9875\u9762 AliMessageReceiver.kt -> handleMessageEntity\uff0c\u5df2\u5199\u5165\u540e\u7aef\u63a8\u9001 picture\uff0cresourceId="

    .line 510
    .line 511
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 535
    .line 536
    return-object v0
.end method

.method public onMessage(Landroid/content/Context;Lcom/alibaba/sdk/android/push/notification/CPushMessage;)V
    .locals 6

    .line 1
    const-string p1, "cPushMessage"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lsd/h1;->c:Lsd/h1;

    .line 7
    .line 8
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v3, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-direct {v3, p2, p0, p1}, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;-><init>(Lcom/alibaba/sdk/android/push/notification/CPushMessage;Lcom/friday/document/receiver/AliMessageReceiver;Lvc/c;)V

    .line 16
    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    .line 1
    const-string p1, "title"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "summary"

    .line 7
    .line 8
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "extraMap"

    .line 12
    .line 13
    invoke-static {p4, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v0, "Receive notification, title: "

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p2, ", summary: "

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p2, ", extraMap: "

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string p2, "MyMessageReceiver"

    .line 50
    .line 51
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public onNotificationClickedWithNoAction(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string p1, "title"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "summary"

    .line 7
    .line 8
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "extraMap"

    .line 12
    .line 13
    invoke-static {p4, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v0, "onNotificationClickedWithNoAction, title: "

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p2, ", summary: "

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p2, ", extraMap:"

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string p2, "MyMessageReceiver"

    .line 50
    .line 51
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public onNotificationOpened(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string p1, "title"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "summary"

    .line 7
    .line 8
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "extraMap"

    .line 12
    .line 13
    invoke-static {p4, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v0, "onNotificationOpened, title: "

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p2, ", summary: "

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p2, ", extraMap:"

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string p2, "MyMessageReceiver"

    .line 50
    .line 51
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public onNotificationReceivedInApp(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string p1, "title"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "summary"

    .line 7
    .line 8
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "extraMap"

    .line 12
    .line 13
    invoke-static {p4, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "openActivity"

    .line 17
    .line 18
    invoke-static {p6, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p1, "openUrl"

    .line 22
    .line 23
    invoke-static {p7, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v0, "onNotificationReceivedInApp, title: "

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p2, ", summary: "

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p2, ", extraMap:"

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p2, ", openType:"

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p2, ", openActivity:"

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p2, ", openUrl:"

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string p2, "MyMessageReceiver"

    .line 84
    .line 85
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public onNotificationRemoved(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    const-string p1, "MyMessageReceiver"

    .line 2
    .line 3
    const-string p2, "onNotificationRemoved"

    .line 4
    .line 5
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method
