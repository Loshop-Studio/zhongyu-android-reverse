.class public interface abstract Lcom/friday/common/dao/ResourceDao;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic F(Lcom/friday/common/dao/ResourceDao;Ljava/util/List;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Lcom/friday/common/helper/b;->t()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao;->L(Ljava/util/List;JLvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string p1, "Super calls with default arguments not supported in this target, function: deleteResourceByOssUrlEmpty"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public static synthetic G(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Lcom/friday/common/helper/b;->t()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao;->T(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string p1, "Super calls with default arguments not supported in this target, function: getPageIndex"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public static synthetic J(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    instance-of v2, v1, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->q:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->q:I

    .line 22
    .line 23
    :goto_0
    move-object v5, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;-><init>(Lcom/friday/common/dao/ResourceDao;Lvc/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->o:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget v2, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->q:I

    .line 38
    .line 39
    const/4 v8, 0x3

    .line 40
    const/4 v9, 0x2

    .line 41
    const/4 v3, 0x1

    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    if-eq v2, v3, :cond_3

    .line 45
    .line 46
    if-eq v2, v9, :cond_2

    .line 47
    .line 48
    if-ne v2, v8, :cond_1

    .line 49
    .line 50
    iget v0, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->m:I

    .line 51
    .line 52
    iget-wide v2, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->l:J

    .line 53
    .line 54
    iget-object v4, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->k:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 57
    .line 58
    iget-object v4, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->i:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, Ljava/util/Iterator;

    .line 61
    .line 62
    iget-object v9, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->h:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v9, Ljava/lang/Iterable;

    .line 65
    .line 66
    iget-object v10, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->g:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v10, Ljava/util/List;

    .line 69
    .line 70
    iget-object v11, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->f:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v11, Ljava/util/List;

    .line 73
    .line 74
    iget-object v12, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v12, Ljava/lang/String;

    .line 77
    .line 78
    iget-object v13, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->d:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v13, Ljava/lang/String;

    .line 81
    .line 82
    iget-object v14, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v14, Lcom/friday/common/dao/ResourceDao;

    .line 85
    .line 86
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move v7, v8

    .line 90
    const/4 v1, 0x0

    .line 91
    goto/16 :goto_7

    .line 92
    .line 93
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 96
    .line 97
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v0

    .line 101
    :cond_2
    iget-wide v2, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->l:J

    .line 102
    .line 103
    iget-object v0, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->f:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Ljava/util/List;

    .line 106
    .line 107
    iget-object v4, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->e:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v4, Ljava/lang/String;

    .line 110
    .line 111
    iget-object v9, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->d:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v9, Ljava/lang/String;

    .line 114
    .line 115
    iget-object v10, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v10, Lcom/friday/common/dao/ResourceDao;

    .line 118
    .line 119
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_3

    .line 123
    .line 124
    :cond_3
    iget-wide v2, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->l:J

    .line 125
    .line 126
    iget-object v0, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->e:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Ljava/lang/String;

    .line 129
    .line 130
    iget-object v4, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->d:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v4, Ljava/lang/String;

    .line 133
    .line 134
    iget-object v10, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->c:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v10, Lcom/friday/common/dao/ResourceDao;

    .line 137
    .line 138
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iput-object v0, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->c:Ljava/lang/Object;

    .line 146
    .line 147
    move-object/from16 v1, p1

    .line 148
    .line 149
    iput-object v1, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->d:Ljava/lang/Object;

    .line 150
    .line 151
    move-object/from16 v2, p2

    .line 152
    .line 153
    iput-object v2, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->e:Ljava/lang/Object;

    .line 154
    .line 155
    move-wide/from16 v10, p3

    .line 156
    .line 157
    iput-wide v10, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->l:J

    .line 158
    .line 159
    iput v3, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->q:I

    .line 160
    .line 161
    move-wide v3, v10

    .line 162
    invoke-interface/range {v0 .. v5}, Lcom/friday/common/dao/ResourceDao;->r(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    if-ne v10, v6, :cond_5

    .line 167
    .line 168
    goto/16 :goto_6

    .line 169
    .line 170
    :cond_5
    move-object/from16 v4, p1

    .line 171
    .line 172
    move-object/from16 v0, p2

    .line 173
    .line 174
    move-wide/from16 v2, p3

    .line 175
    .line 176
    move-object v1, v10

    .line 177
    move-object/from16 v10, p0

    .line 178
    .line 179
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 180
    .line 181
    iput-object v10, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->c:Ljava/lang/Object;

    .line 182
    .line 183
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    iput-object v11, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->d:Ljava/lang/Object;

    .line 188
    .line 189
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    iput-object v11, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->e:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v1, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->f:Ljava/lang/Object;

    .line 196
    .line 197
    iput-wide v2, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->l:J

    .line 198
    .line 199
    iput v9, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->q:I

    .line 200
    .line 201
    move-object/from16 p2, v0

    .line 202
    .line 203
    move-wide/from16 p3, v2

    .line 204
    .line 205
    move-object/from16 p1, v4

    .line 206
    .line 207
    move-object/from16 p5, v5

    .line 208
    .line 209
    move-object/from16 p0, v10

    .line 210
    .line 211
    invoke-interface/range {p0 .. p5}, Lcom/friday/common/dao/ResourceDao;->f(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    move-object/from16 v9, p1

    .line 216
    .line 217
    move-object/from16 v4, p2

    .line 218
    .line 219
    if-ne v0, v6, :cond_6

    .line 220
    .line 221
    goto/16 :goto_6

    .line 222
    .line 223
    :cond_6
    move-object v0, v1

    .line 224
    :goto_3
    move-object v1, v0

    .line 225
    check-cast v1, Ljava/lang/Iterable;

    .line 226
    .line 227
    new-instance v11, Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 230
    .line 231
    .line 232
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    :cond_7
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v12

    .line 240
    if-eqz v12, :cond_8

    .line 241
    .line 242
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    move-object v13, v12

    .line 247
    check-cast v13, Lcom/friday/common/entity/ResourceEntity;

    .line 248
    .line 249
    invoke-virtual {v13}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v13

    .line 253
    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    .line 254
    .line 255
    .line 256
    move-result v13

    .line 257
    if-nez v13, :cond_7

    .line 258
    .line 259
    invoke-interface {v11, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_8
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    move-object v12, v4

    .line 268
    move-object v13, v9

    .line 269
    move-object v14, v10

    .line 270
    move-object v9, v11

    .line 271
    move-object v10, v9

    .line 272
    move-object v11, v0

    .line 273
    move-object v4, v1

    .line 274
    const/4 v0, 0x0

    .line 275
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_a

    .line 280
    .line 281
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    move-object v15, v1

    .line 286
    check-cast v15, Lcom/friday/common/entity/ResourceEntity;

    .line 287
    .line 288
    invoke-virtual {v15}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    iput-object v14, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->c:Ljava/lang/Object;

    .line 293
    .line 294
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    iput-object v7, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->d:Ljava/lang/Object;

    .line 299
    .line 300
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    iput-object v7, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->e:Ljava/lang/Object;

    .line 305
    .line 306
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    iput-object v7, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->f:Ljava/lang/Object;

    .line 311
    .line 312
    iput-object v10, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->g:Ljava/lang/Object;

    .line 313
    .line 314
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    iput-object v7, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->h:Ljava/lang/Object;

    .line 319
    .line 320
    iput-object v4, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->i:Ljava/lang/Object;

    .line 321
    .line 322
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    iput-object v1, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->j:Ljava/lang/Object;

    .line 327
    .line 328
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    iput-object v1, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->k:Ljava/lang/Object;

    .line 333
    .line 334
    iput-wide v2, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->l:J

    .line 335
    .line 336
    iput v0, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->m:I

    .line 337
    .line 338
    const/4 v1, 0x0

    .line 339
    iput v1, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->n:I

    .line 340
    .line 341
    const/4 v7, 0x3

    .line 342
    iput v7, v5, Lcom/friday/common/dao/ResourceDao$deletePageResources$1;->q:I

    .line 343
    .line 344
    invoke-interface {v14, v8, v5}, Lcom/friday/common/dao/ResourceDao;->Z(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v8

    .line 348
    if-ne v8, v6, :cond_9

    .line 349
    .line 350
    :goto_6
    return-object v6

    .line 351
    :cond_9
    :goto_7
    move v8, v7

    .line 352
    goto :goto_5

    .line 353
    :cond_a
    return-object v10
.end method

.method public static synthetic K(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;Ljava/util/Map;JLvc/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v1, v0, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->p:I

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
    iput v2, v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->p:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;-><init>(Lcom/friday/common/dao/ResourceDao;Lvc/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->n:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget v4, v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->p:I

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x1

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    if-ne v4, v6, :cond_1

    .line 44
    .line 45
    iget v2, v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->k:I

    .line 46
    .line 47
    iget-wide v7, v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->j:J

    .line 48
    .line 49
    iget-object v4, v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->i:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v4, Ljava/lang/String;

    .line 52
    .line 53
    iget-object v4, v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->h:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v4, Ljava/util/Map$Entry;

    .line 56
    .line 57
    iget-object v4, v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->g:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Ljava/util/Iterator;

    .line 60
    .line 61
    iget-object v9, v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->f:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v9, Ljava/util/Map;

    .line 64
    .line 65
    iget-object v10, v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v10, Ljava/util/Map;

    .line 68
    .line 69
    iget-object v11, v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v11, Ljava/lang/String;

    .line 72
    .line 73
    iget-object v12, v1, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v12, Lcom/friday/common/dao/ResourceDao;

    .line 76
    .line 77
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object v13, v1

    .line 81
    move-object v1, v9

    .line 82
    move-object v0, v10

    .line 83
    move-wide/from16 v16, v7

    .line 84
    .line 85
    move-object v8, v11

    .line 86
    move-object v7, v12

    .line 87
    move-wide/from16 v11, v16

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 93
    .line 94
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v0

    .line 98
    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    move-object/from16 v8, p1

    .line 110
    .line 111
    move-wide/from16 v11, p3

    .line 112
    .line 113
    move-object v4, v0

    .line 114
    move-object v13, v1

    .line 115
    move-object v7, v2

    .line 116
    move v2, v5

    .line 117
    move-object/from16 v0, p2

    .line 118
    .line 119
    move-object v1, v0

    .line 120
    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    if-eqz v9, :cond_4

    .line 125
    .line 126
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    check-cast v9, Ljava/util/Map$Entry;

    .line 131
    .line 132
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    check-cast v10, Ljava/lang/String;

    .line 137
    .line 138
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v14

    .line 142
    check-cast v14, Ljava/lang/Number;

    .line 143
    .line 144
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 145
    .line 146
    .line 147
    move-result v14

    .line 148
    iput-object v7, v13, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->c:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v8, v13, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->d:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v15

    .line 156
    iput-object v15, v13, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->e:Ljava/lang/Object;

    .line 157
    .line 158
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v15

    .line 162
    iput-object v15, v13, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->f:Ljava/lang/Object;

    .line 163
    .line 164
    iput-object v4, v13, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->g:Ljava/lang/Object;

    .line 165
    .line 166
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    iput-object v9, v13, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->h:Ljava/lang/Object;

    .line 171
    .line 172
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    iput-object v9, v13, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->i:Ljava/lang/Object;

    .line 177
    .line 178
    iput-wide v11, v13, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->j:J

    .line 179
    .line 180
    iput v2, v13, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->k:I

    .line 181
    .line 182
    iput v5, v13, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->l:I

    .line 183
    .line 184
    iput v14, v13, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->m:I

    .line 185
    .line 186
    iput v6, v13, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->p:I

    .line 187
    .line 188
    move-object v9, v10

    .line 189
    move v10, v14

    .line 190
    invoke-interface/range {v7 .. v13}, Lcom/friday/common/dao/ResourceDao;->m(Ljava/lang/String;Ljava/lang/String;IJLvc/c;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    if-ne v9, v3, :cond_3

    .line 195
    .line 196
    return-object v3

    .line 197
    :cond_4
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 198
    .line 199
    return-object v0
.end method

.method public static synthetic M(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;IJLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    if-nez p7, :cond_1

    .line 2
    .line 3
    and-int/lit8 p6, p6, 0x4

    .line 4
    .line 5
    if-eqz p6, :cond_0

    .line 6
    .line 7
    sget-object p3, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {p3}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p3}, Lcom/friday/common/helper/b;->t()J

    .line 14
    .line 15
    .line 16
    move-result-wide p3

    .line 17
    :cond_0
    move-object v0, p0

    .line 18
    move-object v1, p1

    .line 19
    move v2, p2

    .line 20
    move-wide v3, p3

    .line 21
    move-object v5, p5

    .line 22
    invoke-interface/range {v0 .. v5}, Lcom/friday/common/dao/ResourceDao;->d(Ljava/lang/String;IJLvc/c;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 28
    .line 29
    const-string p1, "Super calls with default arguments not supported in this target, function: findResourcesByFileIdAndIndex"

    .line 30
    .line 31
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p0
.end method

.method public static synthetic N(Lcom/friday/common/dao/ResourceDao;Ljava/util/List;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Lcom/friday/common/helper/b;->t()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao;->b(Ljava/util/List;JLvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string p1, "Super calls with default arguments not supported in this target, function: softDeleteResourceByOssUrlNotEmpty"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public static synthetic P(Lcom/friday/common/dao/ResourceDao;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->m:I

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
    iput v1, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;-><init>(Lcom/friday/common/dao/ResourceDao;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->k:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->m:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget p0, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->i:I

    .line 40
    .line 41
    iget-object p1, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ljava/lang/String;

    .line 44
    .line 45
    iget-object p1, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->f:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/util/Iterator;

    .line 48
    .line 49
    iget-object v2, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Ljava/lang/Iterable;

    .line 52
    .line 53
    iget-object v5, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Ljava/util/List;

    .line 56
    .line 57
    iget-object v6, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Lcom/friday/common/dao/ResourceDao;

    .line 60
    .line 61
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object p2, v5

    .line 65
    move-object v5, v2

    .line 66
    move-object v2, p1

    .line 67
    move p1, p0

    .line 68
    move-object p0, v6

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move-object p2, p1

    .line 82
    check-cast p2, Ljava/lang/Iterable;

    .line 83
    .line 84
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    move-object v5, p2

    .line 89
    move-object p2, p1

    .line 90
    move p1, v3

    .line 91
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    move-object v7, v6

    .line 102
    check-cast v7, Ljava/lang/String;

    .line 103
    .line 104
    iput-object p0, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->c:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    iput-object v8, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->d:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    iput-object v8, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->e:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v2, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->f:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    iput-object v6, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->g:Ljava/lang/Object;

    .line 125
    .line 126
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    iput-object v6, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->h:Ljava/lang/Object;

    .line 131
    .line 132
    iput p1, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->i:I

    .line 133
    .line 134
    iput v3, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->j:I

    .line 135
    .line 136
    iput v4, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceList$1;->m:I

    .line 137
    .line 138
    invoke-interface {p0, v7, v0}, Lcom/friday/common/dao/ResourceDao;->Z(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    if-ne v6, v1, :cond_3

    .line 143
    .line 144
    return-object v1

    .line 145
    :cond_4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 146
    .line 147
    return-object p0
.end method

.method public static synthetic Q(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Lcom/friday/common/helper/b;->t()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao;->v(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string p1, "Super calls with default arguments not supported in this target, function: findAllResourceByFileId"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public static synthetic U(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Lcom/friday/common/helper/b;->t()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao;->R(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string p1, "Super calls with default arguments not supported in this target, function: deleteResourceByFileId"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public static synthetic c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Lcom/friday/common/helper/b;->t()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao;->V(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string p1, "Super calls with default arguments not supported in this target, function: findResourcesByFileId"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public static synthetic g(Lcom/friday/common/dao/ResourceDao;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->h:I

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
    iput v1, v0, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->h:I

    .line 18
    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;-><init>(Lcom/friday/common/dao/ResourceDao;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->f:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->h:I

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    const/4 v9, 0x2

    .line 37
    const/4 v2, 0x1

    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    if-eq v1, v2, :cond_3

    .line 41
    .line 42
    if-eq v1, v9, :cond_2

    .line 43
    .line 44
    if-ne v1, v8, :cond_1

    .line 45
    .line 46
    iget-object p0, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Ljava/util/List;

    .line 49
    .line 50
    iget-object p1, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Ljava/util/List;

    .line 53
    .line 54
    iget-object p1, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Lcom/friday/common/dao/ResourceDao;

    .line 57
    .line 58
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p0

    .line 70
    :cond_2
    iget-object p0, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, Ljava/util/List;

    .line 73
    .line 74
    iget-object p1, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Lcom/friday/common/dao/ResourceDao;

    .line 77
    .line 78
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move-object v1, p1

    .line 82
    goto :goto_3

    .line 83
    :cond_3
    iget-object p0, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->d:Ljava/lang/Object;

    .line 84
    .line 85
    move-object p1, p0

    .line 86
    check-cast p1, Ljava/util/List;

    .line 87
    .line 88
    iget-object p0, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p0, Lcom/friday/common/dao/ResourceDao;

    .line 91
    .line 92
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    move-object v1, p0

    .line 96
    move-object v2, p1

    .line 97
    goto :goto_2

    .line 98
    :cond_4
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iput-object p0, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->c:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object p1, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->d:Ljava/lang/Object;

    .line 104
    .line 105
    iput v2, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->h:I

    .line 106
    .line 107
    const-wide/16 v3, 0x0

    .line 108
    .line 109
    const/4 v6, 0x2

    .line 110
    const/4 v7, 0x0

    .line 111
    move-object v1, p0

    .line 112
    move-object v2, p1

    .line 113
    invoke-static/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao;->F(Lcom/friday/common/dao/ResourceDao;Ljava/util/List;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    if-ne p0, v0, :cond_5

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_5
    :goto_2
    iput-object v1, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->c:Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    iput-object p0, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->d:Ljava/lang/Object;

    .line 127
    .line 128
    iput v9, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->h:I

    .line 129
    .line 130
    const-wide/16 v3, 0x0

    .line 131
    .line 132
    const/4 v6, 0x2

    .line 133
    const/4 v7, 0x0

    .line 134
    invoke-static/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao;->w(Lcom/friday/common/dao/ResourceDao;Ljava/util/List;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    if-ne p2, v0, :cond_6

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_6
    move-object p0, v2

    .line 142
    :goto_3
    check-cast p2, Ljava/util/List;

    .line 143
    .line 144
    move-object p1, p2

    .line 145
    check-cast p1, Ljava/lang/Iterable;

    .line 146
    .line 147
    new-instance v2, Ljava/util/ArrayList;

    .line 148
    .line 149
    const/16 v3, 0xa

    .line 150
    .line 151
    invoke-static {p1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_7

    .line 167
    .line 168
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, Lcom/friday/common/entity/ResourceEntity;

    .line 173
    .line 174
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_7
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    iput-object p1, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->c:Ljava/lang/Object;

    .line 187
    .line 188
    invoke-static {p0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    iput-object p0, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->d:Ljava/lang/Object;

    .line 193
    .line 194
    iput-object p2, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->e:Ljava/lang/Object;

    .line 195
    .line 196
    iput v8, v5, Lcom/friday/common/dao/ResourceDao$deleteResourceListExceptOssUrlNotEmpty$1;->h:I

    .line 197
    .line 198
    const-wide/16 v3, 0x0

    .line 199
    .line 200
    const/4 v6, 0x2

    .line 201
    const/4 v7, 0x0

    .line 202
    invoke-static/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao;->N(Lcom/friday/common/dao/ResourceDao;Ljava/util/List;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    if-ne p0, v0, :cond_8

    .line 207
    .line 208
    :goto_5
    return-object v0

    .line 209
    :cond_8
    return-object p2
.end method

.method public static synthetic h(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->h:I

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
    iput v1, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;-><init>(Lcom/friday/common/dao/ResourceDao;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->h:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Ljava/util/List;

    .line 44
    .line 45
    iget-object p0, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Ljava/lang/String;

    .line 48
    .line 49
    iget-object p0, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Lcom/friday/common/dao/ResourceDao;

    .line 52
    .line 53
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_2
    iget-object p0, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->e:Ljava/lang/Object;

    .line 66
    .line 67
    move-object p2, p0

    .line 68
    check-cast p2, Ljava/util/List;

    .line 69
    .line 70
    iget-object p0, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->d:Ljava/lang/Object;

    .line 71
    .line 72
    move-object p1, p0

    .line 73
    check-cast p1, Ljava/lang/String;

    .line 74
    .line 75
    iget-object p0, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, Lcom/friday/common/dao/ResourceDao;

    .line 78
    .line 79
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iput-object p0, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->c:Ljava/lang/Object;

    .line 87
    .line 88
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    iput-object p3, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->d:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p2, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->e:Ljava/lang/Object;

    .line 95
    .line 96
    iput v4, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->h:I

    .line 97
    .line 98
    invoke-interface {p0, p1, v0}, Lcom/friday/common/dao/ResourceDao;->C(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    if-ne p3, v1, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    :goto_1
    invoke-static {p0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    iput-object p3, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->c:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iput-object p1, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->d:Ljava/lang/Object;

    .line 116
    .line 117
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iput-object p1, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->e:Ljava/lang/Object;

    .line 122
    .line 123
    iput v3, v0, Lcom/friday/common/dao/ResourceDao$syncResourceList$1;->h:I

    .line 124
    .line 125
    invoke-interface {p0, p2, v0}, Lcom/friday/common/dao/ResourceDao;->x(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    if-ne p0, v1, :cond_5

    .line 130
    .line 131
    :goto_2
    return-object v1

    .line 132
    :cond_5
    :goto_3
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 133
    .line 134
    return-object p0
.end method

.method public static synthetic n(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    if-nez p8, :cond_1

    .line 2
    .line 3
    and-int/lit8 p7, p7, 0x8

    .line 4
    .line 5
    if-eqz p7, :cond_0

    .line 6
    .line 7
    sget-object p4, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {p4}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    invoke-virtual {p4}, Lcom/friday/common/helper/b;->t()J

    .line 14
    .line 15
    .line 16
    move-result-wide p4

    .line 17
    :cond_0
    move-object v0, p0

    .line 18
    move-object v1, p1

    .line 19
    move-object v2, p2

    .line 20
    move-object v3, p3

    .line 21
    move-wide v4, p4

    .line 22
    move-object v6, p6

    .line 23
    invoke-interface/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 29
    .line 30
    const-string p1, "Super calls with default arguments not supported in this target, function: selectPicture"

    .line 31
    .line 32
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0
.end method

.method public static synthetic t(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Lcom/friday/common/helper/b;->t()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao;->X(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string p1, "Super calls with default arguments not supported in this target, function: findResourceByName"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public static synthetic u(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Lcom/friday/common/helper/b;->t()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao;->I(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string p1, "Super calls with default arguments not supported in this target, function: findResource"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public static synthetic w(Lcom/friday/common/dao/ResourceDao;Ljava/util/List;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Lcom/friday/common/helper/b;->t()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao;->Y(Ljava/util/List;JLvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string p1, "Super calls with default arguments not supported in this target, function: getResourceByOssUrlNotEmpty"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public static synthetic y(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Lcom/friday/common/helper/b;->t()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao;->e(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string p1, "Super calls with default arguments not supported in this target, function: findFailedResources"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public static synthetic z(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x4

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    new-instance p3, Ljava/text/SimpleDateFormat;

    .line 8
    .line 9
    const-string p5, "yyyy-MM-dd HH:mm:ss"

    .line 10
    .line 11
    sget-object p6, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 12
    .line 13
    invoke-direct {p3, p5, p6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 14
    .line 15
    .line 16
    new-instance p5, Ljava/util/Date;

    .line 17
    .line 18
    invoke-direct {p5}, Ljava/util/Date;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3, p5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    const-string p5, "format(...)"

    .line 26
    .line 27
    invoke-static {p3, p5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/ResourceDao;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 36
    .line 37
    const-string p1, "Super calls with default arguments not supported in this target, function: updateResMD5AndUpdateTimeStamp"

    .line 38
    .line 39
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/common/dao/ResourceDao;->J(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract B(JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract C(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract D(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract H(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract I(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract L(Ljava/util/List;JLvc/c;)Ljava/lang/Object;
.end method

.method public O(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ResourceDao;->P(Lcom/friday/common/dao/ResourceDao;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract R(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract S(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract T(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract V(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract W(Ljava/lang/String;ILvc/c;)Ljava/lang/Object;
.end method

.method public abstract X(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract Y(Ljava/util/List;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract Z(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract a(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract b(Ljava/util/List;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract d(Ljava/lang/String;IJLvc/c;)Ljava/lang/Object;
.end method

.method public abstract e(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract f(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public i(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/ResourceDao;->g(Lcom/friday/common/dao/ResourceDao;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract k(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract m(Ljava/lang/String;Ljava/lang/String;IJLvc/c;)Ljava/lang/Object;
.end method

.method public o(Ljava/lang/String;Ljava/util/Map;JLvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/common/dao/ResourceDao;->K(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;Ljava/util/Map;JLvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract p(Ljava/lang/String;ILvc/c;)Ljava/lang/Object;
.end method

.method public abstract q(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract r(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public s(Ljava/lang/String;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/ResourceDao;->h(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract v(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract x(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
.end method
