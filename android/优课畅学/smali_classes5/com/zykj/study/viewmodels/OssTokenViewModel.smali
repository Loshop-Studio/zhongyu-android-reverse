# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/viewmodels/OssTokenViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lt4/k;

.field public final b:Landroidx/datastore/core/DataStore;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lt4/k;Landroidx/datastore/core/DataStore;)V
    .locals 1

    .line 1
    const-string v0, "tokenRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userDataStore"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/viewmodels/OssTokenViewModel;->a:Lt4/k;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/viewmodels/OssTokenViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic b(Lcom/zykj/study/viewmodels/OssTokenViewModel;Lcom/zykj/study/bean/OssFileType;Ljava/lang/String;Lcom/zykj/study/bean/OssFileResource;Ljava/lang/String;Ljava/lang/String;JLm7/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    and-int/lit8 v0, p9, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p2, ""

    .line 6
    .line 7
    :cond_0
    move-object v2, p2

    .line 8
    and-int/lit8 p2, p9, 0x8

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    const-string p2, "0"

    .line 13
    .line 14
    move-object v4, p2

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object v4, p4

    .line 17
    :goto_0
    and-int/lit8 p2, p9, 0x10

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const-string p2, "toString(...)"

    .line 30
    .line 31
    invoke-static {v5, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v9, 0x4

    .line 35
    const/4 v10, 0x0

    .line 36
    const-string v6, "-"

    .line 37
    .line 38
    const-string v7, ""

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    invoke-static/range {v5 .. v10}, Lg8/z;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    move-object v5, p2

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object/from16 v5, p5

    .line 48
    .line 49
    :goto_1
    and-int/lit8 p2, p9, 0x20

    .line 50
    .line 51
    if-eqz p2, :cond_3

    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    move-wide v6, v0

    .line 58
    move-object v3, p3

    .line 59
    move-object/from16 v8, p8

    .line 60
    .line 61
    move-object v0, p0

    .line 62
    move-object v1, p1

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move-wide/from16 v6, p6

    .line 65
    .line 66
    move-object v0, p0

    .line 67
    move-object v1, p1

    .line 68
    move-object v3, p3

    .line 69
    move-object/from16 v8, p8

    .line 70
    .line 71
    :goto_2
    invoke-virtual/range {v0 .. v8}, Lcom/zykj/study/viewmodels/OssTokenViewModel;->a(Lcom/zykj/study/bean/OssFileType;Ljava/lang/String;Lcom/zykj/study/bean/OssFileResource;Ljava/lang/String;Ljava/lang/String;JLm7/c;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method


# virtual methods
.method public final a(Lcom/zykj/study/bean/OssFileType;Ljava/lang/String;Lcom/zykj/study/bean/OssFileResource;Ljava/lang/String;Ljava/lang/String;JLm7/c;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    move-object/from16 v7, p4

    .line 6
    .line 7
    move-object/from16 v8, p5

    .line 8
    .line 9
    move-wide/from16 v9, p6

    .line 10
    .line 11
    move-object/from16 v0, p8

    .line 12
    .line 13
    instance-of v2, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    move-object v2, v0

    .line 18
    check-cast v2, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;

    .line 19
    .line 20
    iget v3, v2, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->t:I

    .line 21
    .line 22
    const/high16 v4, -0x80000000

    .line 23
    .line 24
    and-int v6, v3, v4

    .line 25
    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    sub-int/2addr v3, v4

    .line 29
    iput v3, v2, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->t:I

    .line 30
    .line 31
    :goto_0
    move-object v0, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    new-instance v2, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;

    .line 34
    .line 35
    invoke-direct {v2, v1, v0}, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;-><init>(Lcom/zykj/study/viewmodels/OssTokenViewModel;Lm7/c;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_1
    iget-object v2, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->r:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v14

    .line 45
    iget v3, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->t:I

    .line 46
    .line 47
    const/4 v15, 0x1

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    if-ne v3, v15, :cond_1

    .line 51
    .line 52
    iget-object v3, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->n:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Ljava/lang/String;

    .line 55
    .line 56
    iget-object v4, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->m:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, Ljava/lang/String;

    .line 59
    .line 60
    iget-object v4, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->l:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, Ljava/lang/String;

    .line 63
    .line 64
    iget-object v4, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->k:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v4, Ljava/lang/String;

    .line 67
    .line 68
    iget-object v4, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->j:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v4, Lcom/zykj/study/bean/OssTokenReq;

    .line 71
    .line 72
    iget-object v4, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->i:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v4, Ljava/lang/String;

    .line 75
    .line 76
    iget-object v4, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->h:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, Ljava/lang/String;

    .line 79
    .line 80
    iget-object v4, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->g:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v4, Ljava/lang/String;

    .line 83
    .line 84
    iget-object v4, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->f:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v4, Ljava/lang/String;

    .line 87
    .line 88
    iget-object v4, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->e:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Ljava/lang/String;

    .line 91
    .line 92
    iget-object v4, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->d:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v4, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v4, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Lcom/zykj/study/bean/OssFileResource;

    .line 99
    .line 100
    iget-object v4, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v4, Ljava/lang/String;

    .line 103
    .line 104
    iget-object v0, v0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->a:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lcom/zykj/study/bean/OssFileType;

    .line 107
    .line 108
    :try_start_0
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    goto/16 :goto_4

    .line 112
    .line 113
    :catchall_0
    move-exception v0

    .line 114
    goto/16 :goto_5

    .line 115
    .line 116
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 119
    .line 120
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v0

    .line 124
    :cond_2
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-static {}, Le5/n;->a()J

    .line 128
    .line 129
    .line 130
    move-result-wide v2

    .line 131
    invoke-virtual/range {p3 .. p3}, Lcom/zykj/study/bean/OssFileResource;->getName()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/OssFileType;->getValue()I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    new-instance v11, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v11, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v12, "+"

    .line 148
    .line 149
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v13, "study_v2"

    .line 153
    .line 154
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v11, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v16

    .line 197
    invoke-static/range {v16 .. v16}, Lcom/blankj/utilcode/util/i;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    move-wide/from16 v17, v2

    .line 202
    .line 203
    new-instance v2, Lcom/zykj/study/bean/OssTokenReq;

    .line 204
    .line 205
    move-object v3, v4

    .line 206
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/OssFileType;->getValue()I

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    invoke-virtual/range {p3 .. p3}, Lcom/zykj/study/bean/OssFileResource;->getValue()I

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    const/4 v12, 0x1

    .line 218
    move-object/from16 v19, v13

    .line 219
    .line 220
    const/4 v13, 0x0

    .line 221
    move-object/from16 v20, v3

    .line 222
    .line 223
    const/4 v3, 0x0

    .line 224
    move-object/from16 p8, v14

    .line 225
    .line 226
    move-wide/from16 v14, v17

    .line 227
    .line 228
    move-object/from16 v17, v0

    .line 229
    .line 230
    move-object/from16 v0, v19

    .line 231
    .line 232
    invoke-direct/range {v2 .. v13}, Lcom/zykj/study/bean/OssTokenReq;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {p3 .. p3}, Lcom/zykj/study/bean/OssFileResource;->getName()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    new-instance v4, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v6, "/"

    .line 248
    .line 249
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v4, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    const-string v4, "0"

    .line 266
    .line 267
    invoke-static {v7, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-eqz v4, :cond_3

    .line 272
    .line 273
    const-string v4, "yyyyMMdd"

    .line 274
    .line 275
    invoke-static {v4}, Lcom/blankj/utilcode/util/f0;->d(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    invoke-static {v9, v10, v4}, Lcom/blankj/utilcode/util/f0;->e(JLjava/text/DateFormat;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    goto :goto_2

    .line 284
    :cond_3
    move-object v4, v7

    .line 285
    :goto_2
    sget-object v12, Lcom/zykj/study/bean/OssFileResource$Log;->INSTANCE:Lcom/zykj/study/bean/OssFileResource$Log;

    .line 286
    .line 287
    move-object/from16 v13, p3

    .line 288
    .line 289
    invoke-static {v13, v12}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v12

    .line 293
    if-eqz v12, :cond_4

    .line 294
    .line 295
    const-string v12, ""

    .line 296
    .line 297
    move-object/from16 v19, v0

    .line 298
    .line 299
    goto :goto_3

    .line 300
    :cond_4
    sget-object v12, Lcom/zykj/study/bean/OssFileType$File;->INSTANCE:Lcom/zykj/study/bean/OssFileType$File;

    .line 301
    .line 302
    move-object/from16 v19, v0

    .line 303
    .line 304
    move-object/from16 v0, p1

    .line 305
    .line 306
    invoke-static {v0, v12}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v12

    .line 310
    if-eqz v12, :cond_5

    .line 311
    .line 312
    new-instance v12, Ljava/lang/StringBuilder;

    .line 313
    .line 314
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v12

    .line 327
    goto :goto_3

    .line 328
    :cond_5
    move-object v12, v8

    .line 329
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-static {v0, v6}, Lg8/c0;->z0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    :try_start_1
    sget-object v0, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 358
    .line 359
    iget-object v0, v1, Lcom/zykj/study/viewmodels/OssTokenViewModel;->a:Lt4/k;

    .line 360
    .line 361
    invoke-static/range {p1 .. p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    move-object/from16 v18, v3

    .line 366
    .line 367
    move-object/from16 v3, v17

    .line 368
    .line 369
    iput-object v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->a:Ljava/lang/Object;

    .line 370
    .line 371
    invoke-static {v5}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    iput-object v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->b:Ljava/lang/Object;

    .line 376
    .line 377
    invoke-static {v13}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    iput-object v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->c:Ljava/lang/Object;

    .line 382
    .line 383
    invoke-static {v7}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    iput-object v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->d:Ljava/lang/Object;

    .line 388
    .line 389
    invoke-static {v8}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    iput-object v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->e:Ljava/lang/Object;

    .line 394
    .line 395
    invoke-static/range {v19 .. v19}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    iput-object v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->f:Ljava/lang/Object;

    .line 400
    .line 401
    invoke-static/range {v20 .. v20}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    iput-object v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->g:Ljava/lang/Object;

    .line 406
    .line 407
    invoke-static/range {v16 .. v16}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    iput-object v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->h:Ljava/lang/Object;

    .line 412
    .line 413
    invoke-static {v11}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    iput-object v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->i:Ljava/lang/Object;

    .line 418
    .line 419
    invoke-static {v2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    iput-object v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->j:Ljava/lang/Object;

    .line 424
    .line 425
    invoke-static/range {v18 .. v18}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    iput-object v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->k:Ljava/lang/Object;

    .line 430
    .line 431
    invoke-static {v4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    iput-object v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->l:Ljava/lang/Object;

    .line 436
    .line 437
    invoke-static {v12}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    iput-object v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->m:Ljava/lang/Object;

    .line 442
    .line 443
    iput-object v6, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->n:Ljava/lang/Object;

    .line 444
    .line 445
    iput-wide v9, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->o:J

    .line 446
    .line 447
    iput-wide v14, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->p:J

    .line 448
    .line 449
    const/4 v1, 0x0

    .line 450
    iput v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->q:I

    .line 451
    .line 452
    const/4 v1, 0x1

    .line 453
    iput v1, v3, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->t:I

    .line 454
    .line 455
    invoke-virtual {v0, v2, v3}, Lt4/k;->a(Lcom/zykj/study/bean/OssTokenReq;Lm7/c;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 459
    move-object/from16 v0, p8

    .line 460
    .line 461
    if-ne v2, v0, :cond_6

    .line 462
    .line 463
    return-object v0

    .line 464
    :cond_6
    move-object v3, v6

    .line 465
    :goto_4
    :try_start_2
    check-cast v2, Lcom/zykj/download/OssToken;

    .line 466
    .line 467
    invoke-static {v2}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 471
    goto :goto_6

    .line 472
    :catchall_1
    move-exception v0

    .line 473
    move-object v3, v6

    .line 474
    :goto_5
    sget-object v1, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 475
    .line 476
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    invoke-static {v0}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    :goto_6
    invoke-static {v0}, Lkotlin/Result;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    if-eqz v1, :cond_7

    .line 489
    .line 490
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 491
    .line 492
    .line 493
    :cond_7
    invoke-static {v0}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    const/4 v2, 0x0

    .line 498
    if-eqz v1, :cond_8

    .line 499
    .line 500
    move-object v0, v2

    .line 501
    :cond_8
    check-cast v0, Lcom/zykj/download/OssToken;

    .line 502
    .line 503
    if-nez v0, :cond_9

    .line 504
    .line 505
    return-object v2

    .line 506
    :cond_9
    new-instance v1, Lcom/zykj/study/bean/OssData;

    .line 507
    .line 508
    invoke-direct {v1, v0, v3}, Lcom/zykj/study/bean/OssData;-><init>(Lcom/zykj/download/OssToken;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    return-object v1
.end method
