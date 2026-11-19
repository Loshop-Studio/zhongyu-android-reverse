.class public final Lcoil3/network/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/g;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ls/l;

.field public final c:Ld6/e;

.field public final d:Ld6/e;

.field public final e:Ld6/e;

.field public final f:Lcoil3/network/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ls/l;Ld6/e;Ld6/e;Ld6/e;Lcoil3/network/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/network/j;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/network/j;->b:Ls/l;

    .line 7
    .line 8
    iput-object p3, p0, Lcoil3/network/j;->c:Ld6/e;

    .line 9
    .line 10
    iput-object p4, p0, Lcoil3/network/j;->d:Ld6/e;

    .line 11
    .line 12
    iput-object p5, p0, Lcoil3/network/j;->e:Ld6/e;

    .line 13
    .line 14
    iput-object p6, p0, Lcoil3/network/j;->f:Lcoil3/network/e;

    .line 15
    .line 16
    return-void
.end method

.method public static final b(Lcoil3/network/j;Lcoil3/network/n;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lcoil3/network/NetworkFetcher$toImageSource$1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p2

    .line 9
    check-cast v0, Lcoil3/network/NetworkFetcher$toImageSource$1;

    .line 10
    .line 11
    iget v1, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->label:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->label:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lcoil3/network/NetworkFetcher$toImageSource$1;

    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcoil3/network/NetworkFetcher$toImageSource$1;-><init>(Lcoil3/network/j;Lh6/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p2, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v2, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->label:I

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lokio/Buffer;

    .line 42
    .line 43
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance p2, Lokio/Buffer;

    .line 59
    .line 60
    invoke-direct {p2}, Lokio/Buffer;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p2, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, v0, Lcoil3/network/NetworkFetcher$toImageSource$1;->label:I

    .line 66
    .line 67
    iget-object p1, p1, Lcoil3/network/n;->a:Lokio/BufferedSource;

    .line 68
    .line 69
    invoke-interface {p1, p2}, Lokio/BufferedSource;->readAll(Lokio/Sink;)J

    .line 70
    .line 71
    .line 72
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 73
    .line 74
    if-ne p1, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    move-object p1, p2

    .line 78
    :goto_1
    invoke-virtual {p0}, Lcoil3/network/j;->e()Lokio/FileSystem;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance p2, Lcoil3/decode/r;

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-direct {p2, p1, p0, v0}, Lcoil3/decode/r;-><init>(Lokio/BufferedSource;Lokio/FileSystem;La/a;)V

    .line 86
    .line 87
    .line 88
    return-object p2
.end method

.method public static final c(Lcoil3/network/j;Lcoil3/disk/i;Lcoil3/network/m;Lcoil3/network/m;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v5, v4, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    move-object v5, v4

    .line 19
    check-cast v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;

    .line 20
    .line 21
    iget v6, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->label:I

    .line 22
    .line 23
    const/high16 v7, -0x80000000

    .line 24
    .line 25
    and-int v8, v6, v7

    .line 26
    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    sub-int/2addr v6, v7

    .line 30
    iput v6, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->label:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;

    .line 34
    .line 35
    invoke-direct {v5, v1, v4}, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;-><init>(Lcoil3/network/j;Lh6/c;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v4, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->result:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object v6, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 41
    .line 42
    iget v7, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->label:I

    .line 43
    .line 44
    const/4 v8, 0x2

    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v10, 0x1

    .line 47
    const/4 v11, 0x0

    .line 48
    if-eqz v7, :cond_3

    .line 49
    .line 50
    if-eq v7, v10, :cond_2

    .line 51
    .line 52
    if-ne v7, v8, :cond_1

    .line 53
    .line 54
    iget-object v0, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->L$2:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v1, v0

    .line 57
    check-cast v1, Lcoil3/disk/h;

    .line 58
    .line 59
    iget-object v0, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->L$1:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v2, v0

    .line 62
    check-cast v2, Lcoil3/network/m;

    .line 63
    .line 64
    iget-object v0, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v3, v0

    .line 67
    check-cast v3, Lcoil3/network/m;

    .line 68
    .line 69
    :try_start_0
    invoke-static {v4}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    move-object/from16 p4, v11

    .line 73
    .line 74
    goto/16 :goto_e

    .line 75
    .line 76
    :catch_0
    move-exception v0

    .line 77
    goto/16 :goto_10

    .line 78
    .line 79
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_2
    iget-object v0, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->L$1:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Lcoil3/network/m;

    .line 90
    .line 91
    iget-object v2, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->L$0:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Lcoil3/disk/i;

    .line 94
    .line 95
    invoke-static {v4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-object v3, v0

    .line 99
    move-object v0, v2

    .line 100
    move-object/from16 p4, v11

    .line 101
    .line 102
    goto/16 :goto_4

    .line 103
    .line 104
    :cond_3
    invoke-static {v4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object v4, v1, Lcoil3/network/j;->b:Ls/l;

    .line 108
    .line 109
    iget-object v4, v4, Ls/l;->h:Lcoil3/request/CachePolicy;

    .line 110
    .line 111
    invoke-virtual {v4}, Lcoil3/request/CachePolicy;->getWriteEnabled()Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-nez v4, :cond_5

    .line 116
    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    :try_start_1
    invoke-static {v0}, Landroidx/compose/material3/c;->t(Ljava/lang/AutoCloseable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 120
    .line 121
    .line 122
    :catch_1
    return-object v11

    .line 123
    :catch_2
    move-exception v0

    .line 124
    throw v0

    .line 125
    :cond_4
    move-object/from16 p4, v11

    .line 126
    .line 127
    goto/16 :goto_6

    .line 128
    .line 129
    :cond_5
    iget-object v4, v1, Lcoil3/network/j;->e:Ld6/e;

    .line 130
    .line 131
    invoke-interface {v4}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    check-cast v4, Lcoil3/network/c;

    .line 136
    .line 137
    iput-object v0, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->L$0:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object v3, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->L$1:Ljava/lang/Object;

    .line 140
    .line 141
    iput v10, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->label:I

    .line 142
    .line 143
    check-cast v4, Lcoil3/network/internal/a;

    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget v4, v3, Lcoil3/network/m;->a:I

    .line 149
    .line 150
    const/16 v7, 0x130

    .line 151
    .line 152
    if-ne v4, v7, :cond_8

    .line 153
    .line 154
    if-eqz v2, :cond_8

    .line 155
    .line 156
    iget-object v2, v2, Lcoil3/network/m;->d:Lcoil3/network/k;

    .line 157
    .line 158
    iget-object v4, v3, Lcoil3/network/m;->d:Lcoil3/network/k;

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    iget-object v2, v2, Lcoil3/network/k;->a:Ljava/util/Map;

    .line 164
    .line 165
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 166
    .line 167
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    check-cast v2, Ljava/lang/Iterable;

    .line 175
    .line 176
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    if-eqz v12, :cond_6

    .line 185
    .line 186
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    check-cast v12, Ljava/util/Map$Entry;

    .line 191
    .line 192
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    check-cast v12, Ljava/util/Collection;

    .line 201
    .line 202
    invoke-static {v12}, Lkotlin/collections/t;->E0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 203
    .line 204
    .line 205
    move-result-object v12

    .line 206
    invoke-interface {v7, v13, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_6
    iget-object v2, v4, Lcoil3/network/k;->a:Ljava/util/Map;

    .line 211
    .line 212
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-eqz v4, :cond_7

    .line 225
    .line 226
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    check-cast v4, Ljava/util/Map$Entry;

    .line 231
    .line 232
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v12

    .line 236
    check-cast v12, Ljava/lang/String;

    .line 237
    .line 238
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    check-cast v4, Ljava/util/List;

    .line 243
    .line 244
    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 245
    .line 246
    invoke-virtual {v12, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v12

    .line 250
    const-string/jumbo v13, "toLowerCase(...)"

    .line 251
    .line 252
    .line 253
    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v4}, Lkotlin/collections/t;->E0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-interface {v7, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_7
    new-instance v2, Lcoil3/network/k;

    .line 265
    .line 266
    invoke-static {v7}, Lkotlin/collections/e0;->J(Ljava/util/Map;)Ljava/util/Map;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    invoke-direct {v2, v4}, Lcoil3/network/k;-><init>(Ljava/util/Map;)V

    .line 271
    .line 272
    .line 273
    new-instance v4, Lcoil3/network/b;

    .line 274
    .line 275
    iget v14, v3, Lcoil3/network/m;->a:I

    .line 276
    .line 277
    iget-wide v12, v3, Lcoil3/network/m;->b:J

    .line 278
    .line 279
    move-object/from16 p4, v11

    .line 280
    .line 281
    move-wide v15, v12

    .line 282
    iget-wide v11, v3, Lcoil3/network/m;->c:J

    .line 283
    .line 284
    iget-object v7, v3, Lcoil3/network/m;->f:Ljava/lang/Object;

    .line 285
    .line 286
    new-instance v13, Lcoil3/network/m;

    .line 287
    .line 288
    const/16 v20, 0x0

    .line 289
    .line 290
    move-object/from16 v19, v2

    .line 291
    .line 292
    move-object/from16 v21, v7

    .line 293
    .line 294
    move-wide/from16 v17, v11

    .line 295
    .line 296
    invoke-direct/range {v13 .. v21}, Lcoil3/network/m;-><init>(IJJLcoil3/network/k;Lcoil3/network/n;Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-direct {v4, v13}, Lcoil3/network/b;-><init>(Lcoil3/network/m;)V

    .line 300
    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_8
    move-object/from16 p4, v11

    .line 304
    .line 305
    new-instance v2, Lcoil3/network/b;

    .line 306
    .line 307
    invoke-direct {v2, v3}, Lcoil3/network/b;-><init>(Lcoil3/network/m;)V

    .line 308
    .line 309
    .line 310
    move-object v4, v2

    .line 311
    :goto_3
    if-ne v4, v6, :cond_9

    .line 312
    .line 313
    goto/16 :goto_f

    .line 314
    .line 315
    :cond_9
    :goto_4
    check-cast v4, Lcoil3/network/b;

    .line 316
    .line 317
    iget-object v2, v4, Lcoil3/network/b;->a:Lcoil3/network/m;

    .line 318
    .line 319
    if-nez v2, :cond_a

    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_a
    if-eqz v0, :cond_b

    .line 323
    .line 324
    iget-object v0, v0, Lcoil3/disk/i;->a:Lcoil3/disk/d;

    .line 325
    .line 326
    iget-object v4, v0, Lcoil3/disk/d;->c:Lcoil3/disk/f;

    .line 327
    .line 328
    iget-object v7, v4, Lcoil3/disk/f;->h:Ljava/lang/Object;

    .line 329
    .line 330
    monitor-enter v7

    .line 331
    :try_start_2
    invoke-virtual {v0}, Lcoil3/disk/d;->close()V

    .line 332
    .line 333
    .line 334
    iget-object v0, v0, Lcoil3/disk/d;->a:Lcoil3/disk/c;

    .line 335
    .line 336
    iget-object v0, v0, Lcoil3/disk/c;->a:Ljava/lang/String;

    .line 337
    .line 338
    invoke-virtual {v4, v0}, Lcoil3/disk/f;->b(Ljava/lang/String;)Lcoil3/disk/b;

    .line 339
    .line 340
    .line 341
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 342
    monitor-exit v7

    .line 343
    if-eqz v0, :cond_d

    .line 344
    .line 345
    new-instance v4, Lcoil3/disk/h;

    .line 346
    .line 347
    invoke-direct {v4, v0}, Lcoil3/disk/h;-><init>(Lcoil3/disk/b;)V

    .line 348
    .line 349
    .line 350
    goto :goto_5

    .line 351
    :catchall_0
    move-exception v0

    .line 352
    monitor-exit v7

    .line 353
    throw v0

    .line 354
    :cond_b
    iget-object v0, v1, Lcoil3/network/j;->d:Ld6/e;

    .line 355
    .line 356
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    check-cast v0, Lcoil3/disk/a;

    .line 361
    .line 362
    if-eqz v0, :cond_d

    .line 363
    .line 364
    iget-object v4, v1, Lcoil3/network/j;->b:Ls/l;

    .line 365
    .line 366
    iget-object v4, v4, Ls/l;->e:Ljava/lang/String;

    .line 367
    .line 368
    if-nez v4, :cond_c

    .line 369
    .line 370
    iget-object v4, v1, Lcoil3/network/j;->a:Ljava/lang/String;

    .line 371
    .line 372
    :cond_c
    check-cast v0, Lcoil3/disk/j;

    .line 373
    .line 374
    iget-object v0, v0, Lcoil3/disk/j;->b:Lcoil3/disk/f;

    .line 375
    .line 376
    sget-object v7, Lokio/ByteString;->Companion:Lokio/ByteString$Companion;

    .line 377
    .line 378
    invoke-virtual {v7, v4}, Lokio/ByteString$Companion;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    invoke-virtual {v4}, Lokio/ByteString;->sha256()Lokio/ByteString;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    invoke-virtual {v4}, Lokio/ByteString;->hex()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    invoke-virtual {v0, v4}, Lcoil3/disk/f;->b(Ljava/lang/String;)Lcoil3/disk/b;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    if-eqz v0, :cond_d

    .line 395
    .line 396
    new-instance v4, Lcoil3/disk/h;

    .line 397
    .line 398
    invoke-direct {v4, v0}, Lcoil3/disk/h;-><init>(Lcoil3/disk/b;)V

    .line 399
    .line 400
    .line 401
    goto :goto_5

    .line 402
    :cond_d
    move-object/from16 v4, p4

    .line 403
    .line 404
    :goto_5
    if-nez v4, :cond_e

    .line 405
    .line 406
    :goto_6
    return-object p4

    .line 407
    :cond_e
    :try_start_3
    invoke-virtual {v1}, Lcoil3/network/j;->e()Lokio/FileSystem;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    iget-object v7, v4, Lcoil3/disk/h;->a:Lcoil3/disk/b;

    .line 412
    .line 413
    invoke-virtual {v7, v9}, Lcoil3/disk/b;->c(I)Lokio/Path;

    .line 414
    .line 415
    .line 416
    move-result-object v7

    .line 417
    invoke-virtual {v0, v7, v9}, Lokio/FileSystem;->sink(Lokio/Path;Z)Lokio/Sink;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 422
    .line 423
    .line 424
    move-result-object v7
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 425
    :try_start_4
    invoke-static {v2, v7}, Lh4/a;->t(Lcoil3/network/m;Lokio/BufferedSink;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 426
    .line 427
    .line 428
    :try_start_5
    invoke-interface {v7}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 429
    .line 430
    .line 431
    move-object/from16 v0, p4

    .line 432
    .line 433
    goto :goto_8

    .line 434
    :catchall_1
    move-exception v0

    .line 435
    goto :goto_8

    .line 436
    :catchall_2
    move-exception v0

    .line 437
    move-object v11, v0

    .line 438
    if-eqz v7, :cond_f

    .line 439
    .line 440
    :try_start_6
    invoke-interface {v7}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 441
    .line 442
    .line 443
    goto :goto_7

    .line 444
    :catchall_3
    move-exception v0

    .line 445
    :try_start_7
    invoke-static {v11, v0}, Lkotlin/collections/u;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 446
    .line 447
    .line 448
    goto :goto_7

    .line 449
    :catch_3
    move-exception v0

    .line 450
    move-object v1, v4

    .line 451
    goto/16 :goto_10

    .line 452
    .line 453
    :cond_f
    :goto_7
    move-object v0, v11

    .line 454
    :goto_8
    if-nez v0, :cond_15

    .line 455
    .line 456
    iget-object v0, v2, Lcoil3/network/m;->e:Lcoil3/network/n;

    .line 457
    .line 458
    if-eqz v0, :cond_13

    .line 459
    .line 460
    invoke-virtual {v1}, Lcoil3/network/j;->e()Lokio/FileSystem;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    iget-object v7, v4, Lcoil3/disk/h;->a:Lcoil3/disk/b;

    .line 465
    .line 466
    invoke-virtual {v7, v10}, Lcoil3/disk/b;->c(I)Lokio/Path;

    .line 467
    .line 468
    .line 469
    move-result-object v7

    .line 470
    iput-object v3, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->L$0:Ljava/lang/Object;

    .line 471
    .line 472
    iput-object v2, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->L$1:Ljava/lang/Object;

    .line 473
    .line 474
    iput-object v4, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->L$2:Ljava/lang/Object;

    .line 475
    .line 476
    iput v8, v5, Lcoil3/network/NetworkFetcher$writeToDiskCache$1;->label:I

    .line 477
    .line 478
    iget-object v0, v0, Lcoil3/network/n;->a:Lokio/BufferedSource;

    .line 479
    .line 480
    invoke-virtual {v1, v7, v9}, Lokio/FileSystem;->sink(Lokio/Path;Z)Lokio/Sink;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    invoke-static {v1}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 485
    .line 486
    .line 487
    move-result-object v1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 488
    :try_start_8
    invoke-interface {v0, v1}, Lokio/BufferedSource;->readAll(Lokio/Sink;)J

    .line 489
    .line 490
    .line 491
    move-result-wide v7

    .line 492
    new-instance v0, Ljava/lang/Long;

    .line 493
    .line 494
    invoke-direct {v0, v7, v8}, Ljava/lang/Long;-><init>(J)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 495
    .line 496
    .line 497
    if-eqz v1, :cond_10

    .line 498
    .line 499
    :try_start_9
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 500
    .line 501
    .line 502
    goto :goto_9

    .line 503
    :catchall_4
    move-exception v0

    .line 504
    goto :goto_d

    .line 505
    :cond_10
    :goto_9
    move-object/from16 v0, p4

    .line 506
    .line 507
    goto :goto_d

    .line 508
    :goto_a
    move-object v5, v0

    .line 509
    goto :goto_b

    .line 510
    :catchall_5
    move-exception v0

    .line 511
    goto :goto_a

    .line 512
    :goto_b
    if-eqz v1, :cond_11

    .line 513
    .line 514
    :try_start_a
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 515
    .line 516
    .line 517
    goto :goto_c

    .line 518
    :catchall_6
    move-exception v0

    .line 519
    :try_start_b
    invoke-static {v5, v0}, Lkotlin/collections/u;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 520
    .line 521
    .line 522
    :cond_11
    :goto_c
    move-object v0, v5

    .line 523
    :goto_d
    if-nez v0, :cond_12

    .line 524
    .line 525
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 526
    .line 527
    if-ne v0, v6, :cond_13

    .line 528
    .line 529
    goto :goto_f

    .line 530
    :cond_12
    throw v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3

    .line 531
    :cond_13
    move-object v1, v4

    .line 532
    :goto_e
    :try_start_c
    iget-object v0, v1, Lcoil3/disk/h;->a:Lcoil3/disk/b;

    .line 533
    .line 534
    iget-object v4, v0, Lcoil3/disk/b;->d:Ljava/lang/AutoCloseable;

    .line 535
    .line 536
    check-cast v4, Lcoil3/disk/f;

    .line 537
    .line 538
    iget-object v5, v4, Lcoil3/disk/f;->h:Ljava/lang/Object;

    .line 539
    .line 540
    monitor-enter v5
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    .line 541
    :try_start_d
    invoke-virtual {v0, v10}, Lcoil3/disk/b;->b(Z)V

    .line 542
    .line 543
    .line 544
    iget-object v0, v0, Lcoil3/disk/b;->c:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast v0, Lcoil3/disk/c;

    .line 547
    .line 548
    iget-object v0, v0, Lcoil3/disk/c;->a:Ljava/lang/String;

    .line 549
    .line 550
    invoke-virtual {v4, v0}, Lcoil3/disk/f;->c(Ljava/lang/String;)Lcoil3/disk/d;

    .line 551
    .line 552
    .line 553
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 554
    :try_start_e
    monitor-exit v5

    .line 555
    if-eqz v0, :cond_14

    .line 556
    .line 557
    new-instance v4, Lcoil3/disk/i;

    .line 558
    .line 559
    invoke-direct {v4, v0}, Lcoil3/disk/i;-><init>(Lcoil3/disk/d;)V

    .line 560
    .line 561
    .line 562
    move-object v6, v4

    .line 563
    goto :goto_f

    .line 564
    :cond_14
    move-object/from16 v6, p4

    .line 565
    .line 566
    :goto_f
    return-object v6

    .line 567
    :catchall_7
    move-exception v0

    .line 568
    monitor-exit v5

    .line 569
    throw v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    .line 570
    :cond_15
    :try_start_f
    throw v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3

    .line 571
    :goto_10
    :try_start_10
    iget-object v1, v1, Lcoil3/disk/h;->a:Lcoil3/disk/b;

    .line 572
    .line 573
    invoke-virtual {v1, v9}, Lcoil3/disk/b;->b(Z)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_4

    .line 574
    .line 575
    .line 576
    :catch_4
    iget-object v1, v3, Lcoil3/network/m;->e:Lcoil3/network/n;

    .line 577
    .line 578
    if-eqz v1, :cond_16

    .line 579
    .line 580
    :try_start_11
    invoke-static {v1}, Landroidx/compose/material3/c;->t(Ljava/lang/AutoCloseable;)V
    :try_end_11
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_5
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_6

    .line 581
    .line 582
    .line 583
    goto :goto_11

    .line 584
    :catch_5
    move-exception v0

    .line 585
    throw v0

    .line 586
    :catch_6
    :cond_16
    :goto_11
    iget-object v1, v2, Lcoil3/network/m;->e:Lcoil3/network/n;

    .line 587
    .line 588
    if-eqz v1, :cond_17

    .line 589
    .line 590
    :try_start_12
    invoke-static {v1}, Landroidx/compose/material3/c;->t(Ljava/lang/AutoCloseable;)V
    :try_end_12
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_12} :catch_7
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_8

    .line 591
    .line 592
    .line 593
    goto :goto_12

    .line 594
    :catch_7
    move-exception v0

    .line 595
    throw v0

    .line 596
    :catch_8
    :cond_17
    :goto_12
    throw v0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const-string/jumbo v1, "text/plain"

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p1, v1, v2}, Lkotlin/text/w;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    :cond_0
    invoke-static {p0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    :goto_0
    move-object v1, v0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/16 v1, 0x23

    .line 23
    .line 24
    invoke-static {p0, v1}, Lkotlin/text/p;->h0(Ljava/lang/String;C)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/16 v1, 0x3f

    .line 29
    .line 30
    invoke-static {p0, v1}, Lkotlin/text/p;->h0(Ljava/lang/String;C)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const/16 v1, 0x2f

    .line 35
    .line 36
    invoke-static {v1, p0, p0}, Lkotlin/text/p;->e0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const/16 v1, 0x2e

    .line 41
    .line 42
    const-string v2, ""

    .line 43
    .line 44
    invoke-static {v1, p0, v2}, Lkotlin/text/p;->e0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string/jumbo v1, "toLowerCase(...)"

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    sget-object v1, Lcoil3/util/i;->a:Ljava/util/Map;

    .line 68
    .line 69
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ljava/lang/String;

    .line 74
    .line 75
    if-nez v1, :cond_3

    .line 76
    .line 77
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1, p0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    .line 86
    .line 87
    return-object v1

    .line 88
    :cond_4
    if-eqz p1, :cond_5

    .line 89
    .line 90
    const/16 p0, 0x3b

    .line 91
    .line 92
    invoke-static {p1, p0}, Lkotlin/text/p;->f0(Ljava/lang/String;C)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_5
    return-object v0
.end method


# virtual methods
.method public final a(Lh6/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v1, v0, Lcoil3/network/NetworkFetcher$fetch$1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lcoil3/network/NetworkFetcher$fetch$1;

    .line 11
    .line 12
    iget v3, v1, Lcoil3/network/NetworkFetcher$fetch$1;->label:I

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
    iput v3, v1, Lcoil3/network/NetworkFetcher$fetch$1;->label:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Lcoil3/network/NetworkFetcher$fetch$1;

    .line 26
    .line 27
    invoke-direct {v1, v2, v0}, Lcoil3/network/NetworkFetcher$fetch$1;-><init>(Lcoil3/network/j;Lh6/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v6, Lcoil3/network/NetworkFetcher$fetch$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v7, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v1, v6, Lcoil3/network/NetworkFetcher$fetch$1;->label:I

    .line 36
    .line 37
    iget-object v3, v2, Lcoil3/network/j;->a:Ljava/lang/String;

    .line 38
    .line 39
    const/4 v8, 0x3

    .line 40
    const/4 v9, 0x2

    .line 41
    const/4 v4, 0x1

    .line 42
    const/4 v10, 0x0

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    if-eq v1, v4, :cond_3

    .line 46
    .line 47
    if-eq v1, v9, :cond_2

    .line 48
    .line 49
    if-ne v1, v8, :cond_1

    .line 50
    .line 51
    iget-object v1, v6, Lcoil3/network/NetworkFetcher$fetch$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 54
    .line 55
    :try_start_0
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :catch_0
    move-exception v0

    .line 61
    goto/16 :goto_9

    .line 62
    .line 63
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0

    .line 71
    :cond_2
    iget-object v1, v6, Lcoil3/network/NetworkFetcher$fetch$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 74
    .line 75
    :try_start_1
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 76
    .line 77
    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :cond_3
    iget-object v1, v6, Lcoil3/network/NetworkFetcher$fetch$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 83
    .line 84
    iget-object v4, v6, Lcoil3/network/NetworkFetcher$fetch$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 87
    .line 88
    :try_start_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 89
    .line 90
    .line 91
    move-object v15, v4

    .line 92
    move-object v4, v1

    .line 93
    move-object v1, v15

    .line 94
    goto/16 :goto_4

    .line 95
    .line 96
    :catch_1
    move-exception v0

    .line 97
    move-object v1, v4

    .line 98
    goto/16 :goto_9

    .line 99
    .line 100
    :cond_4
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 104
    .line 105
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 106
    .line 107
    .line 108
    iget-object v0, v2, Lcoil3/network/j;->b:Ls/l;

    .line 109
    .line 110
    iget-object v5, v0, Ls/l;->h:Lcoil3/request/CachePolicy;

    .line 111
    .line 112
    invoke-virtual {v5}, Lcoil3/request/CachePolicy;->getReadEnabled()Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_6

    .line 117
    .line 118
    iget-object v5, v2, Lcoil3/network/j;->d:Ld6/e;

    .line 119
    .line 120
    invoke-interface {v5}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    check-cast v5, Lcoil3/disk/a;

    .line 125
    .line 126
    if-eqz v5, :cond_6

    .line 127
    .line 128
    iget-object v0, v0, Ls/l;->e:Ljava/lang/String;

    .line 129
    .line 130
    if-nez v0, :cond_5

    .line 131
    .line 132
    move-object v0, v3

    .line 133
    :cond_5
    check-cast v5, Lcoil3/disk/j;

    .line 134
    .line 135
    iget-object v5, v5, Lcoil3/disk/j;->b:Lcoil3/disk/f;

    .line 136
    .line 137
    sget-object v11, Lokio/ByteString;->Companion:Lokio/ByteString$Companion;

    .line 138
    .line 139
    invoke-virtual {v11, v0}, Lokio/ByteString$Companion;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Lokio/ByteString;->sha256()Lokio/ByteString;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Lokio/ByteString;->hex()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v5, v0}, Lcoil3/disk/f;->c(Ljava/lang/String;)Lcoil3/disk/d;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-eqz v0, :cond_6

    .line 156
    .line 157
    new-instance v5, Lcoil3/disk/i;

    .line 158
    .line 159
    invoke-direct {v5, v0}, Lcoil3/disk/i;-><init>(Lcoil3/disk/d;)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_6
    move-object v5, v10

    .line 164
    :goto_2
    iput-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 165
    .line 166
    :try_start_3
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 167
    .line 168
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 169
    .line 170
    .line 171
    iget-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 172
    .line 173
    if-eqz v5, :cond_c

    .line 174
    .line 175
    invoke-virtual {v2}, Lcoil3/network/j;->e()Lokio/FileSystem;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    iget-object v11, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v11, Lcoil3/disk/i;

    .line 182
    .line 183
    iget-object v11, v11, Lcoil3/disk/i;->a:Lcoil3/disk/d;

    .line 184
    .line 185
    iget-boolean v12, v11, Lcoil3/disk/d;->b:Z

    .line 186
    .line 187
    if-nez v12, :cond_b

    .line 188
    .line 189
    iget-object v11, v11, Lcoil3/disk/d;->a:Lcoil3/disk/c;

    .line 190
    .line 191
    iget-object v11, v11, Lcoil3/disk/c;->c:Ljava/util/ArrayList;

    .line 192
    .line 193
    const/4 v12, 0x0

    .line 194
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    check-cast v11, Lokio/Path;

    .line 199
    .line 200
    invoke-virtual {v5, v11}, Lokio/FileSystem;->metadata(Lokio/Path;)Lokio/FileMetadata;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    invoke-virtual {v5}, Lokio/FileMetadata;->getSize()Ljava/lang/Long;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    if-nez v5, :cond_7

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_7
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 212
    .line 213
    .line 214
    move-result-wide v11

    .line 215
    const-wide/16 v13, 0x0

    .line 216
    .line 217
    cmp-long v5, v11, v13

    .line 218
    .line 219
    if-nez v5, :cond_8

    .line 220
    .line 221
    new-instance v0, Ln/k;

    .line 222
    .line 223
    iget-object v4, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v4, Lcoil3/disk/i;

    .line 226
    .line 227
    invoke-virtual {v2, v4}, Lcoil3/network/j;->h(Lcoil3/disk/i;)Lcoil3/decode/o;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-static {v3, v10}, Lcoil3/network/j;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    sget-object v5, Lcoil3/decode/DataSource;->DISK:Lcoil3/decode/DataSource;

    .line 236
    .line 237
    invoke-direct {v0, v4, v3, v5}, Ln/k;-><init>(Lcoil3/decode/p;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 238
    .line 239
    .line 240
    return-object v0

    .line 241
    :cond_8
    :goto_3
    iget-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v5, Lcoil3/disk/i;

    .line 244
    .line 245
    invoke-virtual {v2, v5}, Lcoil3/network/j;->i(Lcoil3/disk/i;)Lcoil3/network/m;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    iput-object v5, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 250
    .line 251
    if-eqz v5, :cond_c

    .line 252
    .line 253
    iget-object v5, v2, Lcoil3/network/j;->e:Ld6/e;

    .line 254
    .line 255
    invoke-interface {v5}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    check-cast v5, Lcoil3/network/c;

    .line 260
    .line 261
    iget-object v11, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v11, Lcoil3/network/m;

    .line 264
    .line 265
    invoke-virtual {v2}, Lcoil3/network/j;->g()Lcoil3/network/l;

    .line 266
    .line 267
    .line 268
    iput-object v1, v6, Lcoil3/network/NetworkFetcher$fetch$1;->L$0:Ljava/lang/Object;

    .line 269
    .line 270
    iput-object v0, v6, Lcoil3/network/NetworkFetcher$fetch$1;->L$1:Ljava/lang/Object;

    .line 271
    .line 272
    iput v4, v6, Lcoil3/network/NetworkFetcher$fetch$1;->label:I

    .line 273
    .line 274
    check-cast v5, Lcoil3/network/internal/a;

    .line 275
    .line 276
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    new-instance v4, Lcoil3/network/a;

    .line 280
    .line 281
    invoke-direct {v4, v11}, Lcoil3/network/a;-><init>(Lcoil3/network/m;)V

    .line 282
    .line 283
    .line 284
    if-ne v4, v7, :cond_9

    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_9
    move-object v15, v4

    .line 288
    move-object v4, v0

    .line 289
    move-object v0, v15

    .line 290
    :goto_4
    check-cast v0, Lcoil3/network/a;

    .line 291
    .line 292
    iget-object v5, v0, Lcoil3/network/a;->a:Lcoil3/network/m;

    .line 293
    .line 294
    if-eqz v5, :cond_a

    .line 295
    .line 296
    new-instance v4, Ln/k;

    .line 297
    .line 298
    iget-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v5, Lcoil3/disk/i;

    .line 301
    .line 302
    invoke-virtual {v2, v5}, Lcoil3/network/j;->h(Lcoil3/disk/i;)Lcoil3/decode/o;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    iget-object v0, v0, Lcoil3/network/a;->a:Lcoil3/network/m;

    .line 307
    .line 308
    iget-object v0, v0, Lcoil3/network/m;->d:Lcoil3/network/k;

    .line 309
    .line 310
    invoke-virtual {v0}, Lcoil3/network/k;->a()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-static {v3, v0}, Lcoil3/network/j;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    sget-object v3, Lcoil3/decode/DataSource;->DISK:Lcoil3/decode/DataSource;

    .line 319
    .line 320
    invoke-direct {v4, v5, v0, v3}, Ln/k;-><init>(Lcoil3/decode/p;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 321
    .line 322
    .line 323
    return-object v4

    .line 324
    :cond_a
    move-object v3, v4

    .line 325
    goto :goto_5

    .line 326
    :cond_b
    const-string/jumbo v0, "snapshot is closed"

    .line 327
    .line 328
    .line 329
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 330
    .line 331
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    throw v3

    .line 335
    :cond_c
    move-object v3, v0

    .line 336
    :goto_5
    invoke-virtual {v2}, Lcoil3/network/j;->g()Lcoil3/network/l;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    new-instance v0, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;

    .line 341
    .line 342
    const/4 v5, 0x0

    .line 343
    invoke-direct/range {v0 .. v5}, Lcoil3/network/NetworkFetcher$fetch$fetchResult$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/network/j;Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/network/l;Lh6/c;)V

    .line 344
    .line 345
    .line 346
    iput-object v1, v6, Lcoil3/network/NetworkFetcher$fetch$1;->L$0:Ljava/lang/Object;

    .line 347
    .line 348
    iput-object v10, v6, Lcoil3/network/NetworkFetcher$fetch$1;->L$1:Ljava/lang/Object;

    .line 349
    .line 350
    iput v9, v6, Lcoil3/network/NetworkFetcher$fetch$1;->label:I

    .line 351
    .line 352
    invoke-virtual {v2, v4, v0, v6}, Lcoil3/network/j;->d(Lcoil3/network/l;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-ne v0, v7, :cond_d

    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_d
    :goto_6
    check-cast v0, Ln/k;

    .line 360
    .line 361
    if-nez v0, :cond_f

    .line 362
    .line 363
    invoke-virtual {v2}, Lcoil3/network/j;->g()Lcoil3/network/l;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    new-instance v3, Lcoil3/network/NetworkFetcher$fetch$2;

    .line 368
    .line 369
    invoke-direct {v3, v2, v10}, Lcoil3/network/NetworkFetcher$fetch$2;-><init>(Lcoil3/network/j;Lh6/c;)V

    .line 370
    .line 371
    .line 372
    iput-object v1, v6, Lcoil3/network/NetworkFetcher$fetch$1;->L$0:Ljava/lang/Object;

    .line 373
    .line 374
    iput v8, v6, Lcoil3/network/NetworkFetcher$fetch$1;->label:I

    .line 375
    .line 376
    invoke-virtual {v2, v0, v3, v6}, Lcoil3/network/j;->d(Lcoil3/network/l;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    if-ne v0, v7, :cond_e

    .line 381
    .line 382
    :goto_7
    return-object v7

    .line 383
    :cond_e
    :goto_8
    check-cast v0, Ln/k;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 384
    .line 385
    :cond_f
    return-object v0

    .line 386
    :goto_9
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v1, Lcoil3/disk/i;

    .line 389
    .line 390
    if-eqz v1, :cond_10

    .line 391
    .line 392
    :try_start_4
    invoke-static {v1}, Landroidx/compose/material3/c;->t(Ljava/lang/AutoCloseable;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 393
    .line 394
    .line 395
    goto :goto_a

    .line 396
    :catch_2
    move-exception v0

    .line 397
    throw v0

    .line 398
    :catch_3
    :cond_10
    :goto_a
    throw v0
.end method

.method public final d(Lcoil3/network/l;Lr6/e;Lh6/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil3/network/j;->b:Ls/l;

    .line 2
    .line 3
    iget-object v0, v0, Ls/l;->i:Lcoil3/request/CachePolicy;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcoil3/request/CachePolicy;->getReadEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, Landroid/os/NetworkOnMainThreadException;

    .line 27
    .line 28
    invoke-direct {p1}, Landroid/os/NetworkOnMainThreadException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    :goto_0
    iget-object v0, p0, Lcoil3/network/j;->c:Ld6/e;

    .line 33
    .line 34
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcoil3/network/okhttp/internal/a;

    .line 39
    .line 40
    new-instance v1, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct {v1, p2, v2}, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;-><init>(Lr6/e;Lh6/c;)V

    .line 44
    .line 45
    .line 46
    iget-object p2, v0, Lcoil3/network/okhttp/internal/a;->a:Lokhttp3/z;

    .line 47
    .line 48
    check-cast p3, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 49
    .line 50
    invoke-static {p2, p1, v1, p3}, Lcoil3/network/okhttp/internal/a;->a(Lokhttp3/z;Lcoil3/network/l;Lr6/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method

.method public final e()Lokio/FileSystem;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/network/j;->d:Ld6/e;

    .line 2
    .line 3
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcoil3/disk/a;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast v0, Lcoil3/disk/j;

    .line 12
    .line 13
    iget-object v0, v0, Lcoil3/disk/j;->a:Lokio/FileSystem;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcoil3/network/j;->b:Ls/l;

    .line 20
    .line 21
    iget-object v0, v0, Ls/l;->f:Lokio/FileSystem;

    .line 22
    .line 23
    return-object v0
.end method

.method public final g()Lcoil3/network/l;
    .locals 5

    .line 1
    sget-object v0, Lcoil3/network/h;->b:Lo2/a;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/network/j;->b:Ls/l;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcoil3/network/k;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v2, Lo2/a;

    .line 15
    .line 16
    invoke-direct {v2, v0}, Lo2/a;-><init>(Lcoil3/network/k;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Ls/l;->h:Lcoil3/request/CachePolicy;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcoil3/request/CachePolicy;->getReadEnabled()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    iget-object v4, v1, Ls/l;->i:Lcoil3/request/CachePolicy;

    .line 26
    .line 27
    invoke-virtual {v4}, Lcoil3/request/CachePolicy;->getReadEnabled()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    iget-object v4, p0, Lcoil3/network/j;->f:Lcoil3/network/e;

    .line 34
    .line 35
    invoke-interface {v4}, Lcoil3/network/e;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v4, 0x0

    .line 44
    :goto_0
    if-nez v4, :cond_1

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    const-string v0, "only-if-cached, max-stale=2147483647"

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Lo2/a;->B(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    if-eqz v4, :cond_3

    .line 55
    .line 56
    if-nez v3, :cond_3

    .line 57
    .line 58
    invoke-virtual {v0}, Lcoil3/request/CachePolicy;->getWriteEnabled()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    const-string v0, "no-cache"

    .line 65
    .line 66
    invoke-virtual {v2, v0}, Lo2/a;->B(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const-string v0, "no-cache, no-store"

    .line 71
    .line 72
    invoke-virtual {v2, v0}, Lo2/a;->B(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    if-nez v4, :cond_4

    .line 77
    .line 78
    if-nez v3, :cond_4

    .line 79
    .line 80
    const-string v0, "no-cache, only-if-cached"

    .line 81
    .line 82
    invoke-virtual {v2, v0}, Lo2/a;->B(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_4
    :goto_1
    new-instance v0, Lcoil3/network/l;

    .line 86
    .line 87
    sget-object v3, Lcoil3/network/h;->a:Lo2/a;

    .line 88
    .line 89
    invoke-static {v1, v3}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Ljava/lang/String;

    .line 94
    .line 95
    new-instance v4, Lcoil3/network/k;

    .line 96
    .line 97
    iget-object v2, v2, Lo2/a;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 100
    .line 101
    invoke-static {v2}, Lkotlin/collections/e0;->J(Ljava/util/Map;)Ljava/util/Map;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-direct {v4, v2}, Lcoil3/network/k;-><init>(Ljava/util/Map;)V

    .line 106
    .line 107
    .line 108
    sget-object v2, Lcoil3/network/h;->c:Lo2/a;

    .line 109
    .line 110
    invoke-static {v1, v2}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    if-nez v2, :cond_5

    .line 115
    .line 116
    iget-object v1, v1, Ls/l;->j:Lcoil3/j;

    .line 117
    .line 118
    iget-object v2, p0, Lcoil3/network/j;->a:Ljava/lang/String;

    .line 119
    .line 120
    invoke-direct {v0, v2, v3, v4, v1}, Lcoil3/network/l;-><init>(Ljava/lang/String;Ljava/lang/String;Lcoil3/network/k;Lcoil3/j;)V

    .line 121
    .line 122
    .line 123
    return-object v0

    .line 124
    :cond_5
    new-instance v0, Ljava/lang/ClassCastException;

    .line 125
    .line 126
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 127
    .line 128
    .line 129
    throw v0
.end method

.method public final h(Lcoil3/disk/i;)Lcoil3/decode/o;
    .locals 4

    .line 1
    iget-object v0, p1, Lcoil3/disk/i;->a:Lcoil3/disk/d;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcoil3/disk/d;->b:Z

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Lcoil3/disk/d;->a:Lcoil3/disk/c;

    .line 8
    .line 9
    iget-object v0, v0, Lcoil3/disk/c;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lokio/Path;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcoil3/network/j;->e()Lokio/FileSystem;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lcoil3/network/j;->b:Ls/l;

    .line 23
    .line 24
    iget-object v2, v2, Ls/l;->e:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, Lcoil3/network/j;->a:Ljava/lang/String;

    .line 29
    .line 30
    :cond_0
    const/16 v3, 0x10

    .line 31
    .line 32
    invoke-static {v0, v1, v2, p1, v3}, Lcoil3/network/g;->a(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Lcoil3/disk/i;I)Lcoil3/decode/o;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string/jumbo v0, "snapshot is closed"

    .line 40
    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method public final i(Lcoil3/disk/i;)Lcoil3/network/m;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcoil3/network/j;->e()Lokio/FileSystem;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object p1, p1, Lcoil3/disk/i;->a:Lcoil3/disk/d;

    .line 7
    .line 8
    iget-boolean v2, p1, Lcoil3/disk/d;->b:Z

    .line 9
    .line 10
    if-nez v2, :cond_2

    .line 11
    .line 12
    iget-object p1, p1, Lcoil3/disk/d;->a:Lcoil3/disk/c;

    .line 13
    .line 14
    iget-object p1, p1, Lcoil3/disk/c;->c:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lokio/Path;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lokio/FileSystem;->source(Lokio/Path;)Lokio/Source;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :try_start_1
    invoke-static {p1}, Lh4/a;->m(Lokio/BufferedSource;)Lcoil3/network/m;

    .line 32
    .line 33
    .line 34
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    .line 37
    .line 38
    move-object p1, v0

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :catchall_1
    move-exception v1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_2
    move-exception p1

    .line 50
    :try_start_4
    invoke-static {v1, p1}, Lkotlin/collections/u;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    :goto_0
    move-object p1, v1

    .line 54
    move-object v1, v0

    .line 55
    :goto_1
    if-nez p1, :cond_1

    .line 56
    .line 57
    return-object v1

    .line 58
    :cond_1
    throw p1

    .line 59
    :cond_2
    const-string/jumbo p1, "snapshot is closed"

    .line 60
    .line 61
    .line 62
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 68
    :catch_0
    return-object v0
.end method
