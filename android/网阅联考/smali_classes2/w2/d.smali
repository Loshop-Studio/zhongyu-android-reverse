.class public final Lw2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lokhttp3/internal/connection/RouteSelector$b;

.field public b:Lokhttp3/internal/connection/RouteSelector;

.field public c:I

.field public d:I

.field public e:I

.field public f:Lr2/c0;

.field public final g:Lw2/g;

.field public final h:Lr2/a;

.field public final i:Lw2/e;

.field public final j:Lr2/q;


# direct methods
.method public constructor <init>(Lw2/g;Lr2/a;Lw2/e;Lr2/q;)V
    .locals 1

    .line 1
    const-string v0, "connectionPool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "address"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "call"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "eventListener"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lw2/d;->g:Lw2/g;

    .line 25
    .line 26
    iput-object p2, p0, Lw2/d;->h:Lr2/a;

    .line 27
    .line 28
    iput-object p3, p0, Lw2/d;->i:Lw2/e;

    .line 29
    .line 30
    iput-object p4, p0, Lw2/d;->j:Lr2/q;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a(Lr2/x;Lx2/g;)Lx2/d;
    .locals 8

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "chain"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p2}, Lx2/g;->e()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {p2}, Lx2/g;->g()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {p2}, Lx2/g;->i()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {p1}, Lr2/x;->v()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {p1}, Lr2/x;->B()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    invoke-virtual {p2}, Lx2/g;->h()Lr2/y;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lr2/y;->g()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "GET"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    xor-int/lit8 v7, v0, 0x1

    .line 46
    .line 47
    move-object v1, p0

    .line 48
    invoke-virtual/range {v1 .. v7}, Lw2/d;->c(IIIIZZ)Lokhttp3/internal/connection/RealConnection;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p1, p2}, Lokhttp3/internal/connection/RealConnection;->w(Lr2/x;Lx2/g;)Lx2/d;

    .line 53
    .line 54
    .line 55
    move-result-object p1
    :try_end_0
    .catch Lokhttp3/internal/connection/RouteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    return-object p1

    .line 57
    :catch_0
    move-exception p1

    .line 58
    invoke-virtual {p0, p1}, Lw2/d;->h(Ljava/io/IOException;)V

    .line 59
    .line 60
    .line 61
    new-instance p2, Lokhttp3/internal/connection/RouteException;

    .line 62
    .line 63
    invoke-direct {p2, p1}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    .line 64
    .line 65
    .line 66
    throw p2

    .line 67
    :catch_1
    move-exception p1

    .line 68
    invoke-virtual {p1}, Lokhttp3/internal/connection/RouteException;->c()Ljava/io/IOException;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p0, p2}, Lw2/d;->h(Ljava/io/IOException;)V

    .line 73
    .line 74
    .line 75
    throw p1
.end method

.method public final b(IIIIZ)Lokhttp3/internal/connection/RealConnection;
    .locals 14

    .line 1
    move-object v1, p0

    .line 2
    iget-object v0, v1, Lw2/d;->i:Lw2/e;

    .line 3
    .line 4
    invoke-virtual {v0}, Lw2/e;->T()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_e

    .line 9
    .line 10
    iget-object v0, v1, Lw2/d;->i:Lw2/e;

    .line 11
    .line 12
    invoke-virtual {v0}, Lw2/e;->l()Lokhttp3/internal/connection/RealConnection;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v0, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v2, :cond_6

    .line 20
    .line 21
    monitor-enter v2

    .line 22
    :try_start_0
    invoke-virtual {v2}, Lokhttp3/internal/connection/RealConnection;->p()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-nez v5, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2}, Lokhttp3/internal/connection/RealConnection;->z()Lr2/c0;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v5}, Lr2/c0;->a()Lr2/a;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, Lr2/a;->l()Lr2/t;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {p0, v5}, Lw2/d;->g(Lr2/t;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object v5, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :goto_0
    iget-object v5, v1, Lw2/d;->i:Lw2/e;

    .line 50
    .line 51
    invoke-virtual {v5}, Lw2/e;->v()Ljava/net/Socket;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    :goto_1
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    monitor-exit v2

    .line 58
    iget-object v6, v1, Lw2/d;->i:Lw2/e;

    .line 59
    .line 60
    invoke-virtual {v6}, Lw2/e;->l()Lokhttp3/internal/connection/RealConnection;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    if-nez v5, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    move v0, v3

    .line 70
    :goto_2
    if-eqz v0, :cond_3

    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_3
    const-string v0, "Check failed."

    .line 74
    .line 75
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v2

    .line 85
    :cond_4
    if-eqz v5, :cond_5

    .line 86
    .line 87
    invoke-static {v5}, Ls2/b;->k(Ljava/net/Socket;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    iget-object v5, v1, Lw2/d;->j:Lr2/q;

    .line 91
    .line 92
    iget-object v6, v1, Lw2/d;->i:Lw2/e;

    .line 93
    .line 94
    invoke-virtual {v5, v6, v2}, Lr2/q;->k(Lr2/e;Lr2/i;)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    monitor-exit v2

    .line 100
    throw v0

    .line 101
    :cond_6
    :goto_3
    iput v3, v1, Lw2/d;->c:I

    .line 102
    .line 103
    iput v3, v1, Lw2/d;->d:I

    .line 104
    .line 105
    iput v3, v1, Lw2/d;->e:I

    .line 106
    .line 107
    iget-object v2, v1, Lw2/d;->g:Lw2/g;

    .line 108
    .line 109
    iget-object v5, v1, Lw2/d;->h:Lr2/a;

    .line 110
    .line 111
    iget-object v6, v1, Lw2/d;->i:Lw2/e;

    .line 112
    .line 113
    invoke-virtual {v2, v5, v6, v4, v3}, Lw2/g;->a(Lr2/a;Lw2/e;Ljava/util/List;Z)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_7

    .line 118
    .line 119
    iget-object v0, v1, Lw2/d;->i:Lw2/e;

    .line 120
    .line 121
    invoke-virtual {v0}, Lw2/e;->l()Lokhttp3/internal/connection/RealConnection;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-object v2, v1, Lw2/d;->j:Lr2/q;

    .line 129
    .line 130
    iget-object v3, v1, Lw2/d;->i:Lw2/e;

    .line 131
    .line 132
    invoke-virtual {v2, v3, v0}, Lr2/q;->j(Lr2/e;Lr2/i;)V

    .line 133
    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_7
    iget-object v2, v1, Lw2/d;->f:Lr2/c0;

    .line 137
    .line 138
    if-eqz v2, :cond_8

    .line 139
    .line 140
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iput-object v4, v1, Lw2/d;->f:Lr2/c0;

    .line 144
    .line 145
    :goto_4
    move-object v5, v4

    .line 146
    goto :goto_5

    .line 147
    :cond_8
    iget-object v2, v1, Lw2/d;->a:Lokhttp3/internal/connection/RouteSelector$b;

    .line 148
    .line 149
    if-eqz v2, :cond_9

    .line 150
    .line 151
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Lokhttp3/internal/connection/RouteSelector$b;->b()Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_9

    .line 159
    .line 160
    iget-object v2, v1, Lw2/d;->a:Lokhttp3/internal/connection/RouteSelector$b;

    .line 161
    .line 162
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Lokhttp3/internal/connection/RouteSelector$b;->c()Lr2/c0;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    goto :goto_4

    .line 170
    :cond_9
    iget-object v2, v1, Lw2/d;->b:Lokhttp3/internal/connection/RouteSelector;

    .line 171
    .line 172
    if-nez v2, :cond_a

    .line 173
    .line 174
    new-instance v2, Lokhttp3/internal/connection/RouteSelector;

    .line 175
    .line 176
    iget-object v5, v1, Lw2/d;->h:Lr2/a;

    .line 177
    .line 178
    iget-object v6, v1, Lw2/d;->i:Lw2/e;

    .line 179
    .line 180
    invoke-virtual {v6}, Lw2/e;->k()Lr2/x;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-virtual {v6}, Lr2/x;->r()Lw2/h;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    iget-object v7, v1, Lw2/d;->i:Lw2/e;

    .line 189
    .line 190
    iget-object v8, v1, Lw2/d;->j:Lr2/q;

    .line 191
    .line 192
    invoke-direct {v2, v5, v6, v7, v8}, Lokhttp3/internal/connection/RouteSelector;-><init>(Lr2/a;Lw2/h;Lr2/e;Lr2/q;)V

    .line 193
    .line 194
    .line 195
    iput-object v2, v1, Lw2/d;->b:Lokhttp3/internal/connection/RouteSelector;

    .line 196
    .line 197
    :cond_a
    invoke-virtual {v2}, Lokhttp3/internal/connection/RouteSelector;->d()Lokhttp3/internal/connection/RouteSelector$b;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    iput-object v2, v1, Lw2/d;->a:Lokhttp3/internal/connection/RouteSelector$b;

    .line 202
    .line 203
    invoke-virtual {v2}, Lokhttp3/internal/connection/RouteSelector$b;->a()Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    iget-object v6, v1, Lw2/d;->i:Lw2/e;

    .line 208
    .line 209
    invoke-virtual {v6}, Lw2/e;->T()Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    if-nez v6, :cond_d

    .line 214
    .line 215
    iget-object v6, v1, Lw2/d;->g:Lw2/g;

    .line 216
    .line 217
    iget-object v7, v1, Lw2/d;->h:Lr2/a;

    .line 218
    .line 219
    iget-object v8, v1, Lw2/d;->i:Lw2/e;

    .line 220
    .line 221
    invoke-virtual {v6, v7, v8, v5, v3}, Lw2/g;->a(Lr2/a;Lw2/e;Ljava/util/List;Z)Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-eqz v3, :cond_b

    .line 226
    .line 227
    iget-object v0, v1, Lw2/d;->i:Lw2/e;

    .line 228
    .line 229
    invoke-virtual {v0}, Lw2/e;->l()Lokhttp3/internal/connection/RealConnection;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    iget-object v2, v1, Lw2/d;->j:Lr2/q;

    .line 237
    .line 238
    iget-object v3, v1, Lw2/d;->i:Lw2/e;

    .line 239
    .line 240
    invoke-virtual {v2, v3, v0}, Lr2/q;->j(Lr2/e;Lr2/i;)V

    .line 241
    .line 242
    .line 243
    return-object v0

    .line 244
    :cond_b
    invoke-virtual {v2}, Lokhttp3/internal/connection/RouteSelector$b;->c()Lr2/c0;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    :goto_5
    new-instance v3, Lokhttp3/internal/connection/RealConnection;

    .line 249
    .line 250
    iget-object v6, v1, Lw2/d;->g:Lw2/g;

    .line 251
    .line 252
    invoke-direct {v3, v6, v2}, Lokhttp3/internal/connection/RealConnection;-><init>(Lw2/g;Lr2/c0;)V

    .line 253
    .line 254
    .line 255
    iget-object v6, v1, Lw2/d;->i:Lw2/e;

    .line 256
    .line 257
    invoke-virtual {v6, v3}, Lw2/e;->x(Lokhttp3/internal/connection/RealConnection;)V

    .line 258
    .line 259
    .line 260
    :try_start_1
    iget-object v12, v1, Lw2/d;->i:Lw2/e;

    .line 261
    .line 262
    iget-object v13, v1, Lw2/d;->j:Lr2/q;

    .line 263
    .line 264
    move-object v6, v3

    .line 265
    move v7, p1

    .line 266
    move/from16 v8, p2

    .line 267
    .line 268
    move/from16 v9, p3

    .line 269
    .line 270
    move/from16 v10, p4

    .line 271
    .line 272
    move/from16 v11, p5

    .line 273
    .line 274
    invoke-virtual/range {v6 .. v13}, Lokhttp3/internal/connection/RealConnection;->f(IIIIZLr2/e;Lr2/q;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 275
    .line 276
    .line 277
    iget-object v6, v1, Lw2/d;->i:Lw2/e;

    .line 278
    .line 279
    invoke-virtual {v6, v4}, Lw2/e;->x(Lokhttp3/internal/connection/RealConnection;)V

    .line 280
    .line 281
    .line 282
    iget-object v4, v1, Lw2/d;->i:Lw2/e;

    .line 283
    .line 284
    invoke-virtual {v4}, Lw2/e;->k()Lr2/x;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    invoke-virtual {v4}, Lr2/x;->r()Lw2/h;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    invoke-virtual {v3}, Lokhttp3/internal/connection/RealConnection;->z()Lr2/c0;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    invoke-virtual {v4, v6}, Lw2/h;->a(Lr2/c0;)V

    .line 297
    .line 298
    .line 299
    iget-object v4, v1, Lw2/d;->g:Lw2/g;

    .line 300
    .line 301
    iget-object v6, v1, Lw2/d;->h:Lr2/a;

    .line 302
    .line 303
    iget-object v7, v1, Lw2/d;->i:Lw2/e;

    .line 304
    .line 305
    invoke-virtual {v4, v6, v7, v5, v0}, Lw2/g;->a(Lr2/a;Lw2/e;Ljava/util/List;Z)Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-eqz v0, :cond_c

    .line 310
    .line 311
    iget-object v0, v1, Lw2/d;->i:Lw2/e;

    .line 312
    .line 313
    invoke-virtual {v0}, Lw2/e;->l()Lokhttp3/internal/connection/RealConnection;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    iput-object v2, v1, Lw2/d;->f:Lr2/c0;

    .line 321
    .line 322
    invoke-virtual {v3}, Lokhttp3/internal/connection/RealConnection;->D()Ljava/net/Socket;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-static {v2}, Ls2/b;->k(Ljava/net/Socket;)V

    .line 327
    .line 328
    .line 329
    iget-object v2, v1, Lw2/d;->j:Lr2/q;

    .line 330
    .line 331
    iget-object v3, v1, Lw2/d;->i:Lw2/e;

    .line 332
    .line 333
    invoke-virtual {v2, v3, v0}, Lr2/q;->j(Lr2/e;Lr2/i;)V

    .line 334
    .line 335
    .line 336
    return-object v0

    .line 337
    :cond_c
    monitor-enter v3

    .line 338
    :try_start_2
    iget-object v0, v1, Lw2/d;->g:Lw2/g;

    .line 339
    .line 340
    invoke-virtual {v0, v3}, Lw2/g;->e(Lokhttp3/internal/connection/RealConnection;)V

    .line 341
    .line 342
    .line 343
    iget-object v0, v1, Lw2/d;->i:Lw2/e;

    .line 344
    .line 345
    invoke-virtual {v0, v3}, Lw2/e;->d(Lokhttp3/internal/connection/RealConnection;)V

    .line 346
    .line 347
    .line 348
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 349
    .line 350
    monitor-exit v3

    .line 351
    iget-object v0, v1, Lw2/d;->j:Lr2/q;

    .line 352
    .line 353
    iget-object v2, v1, Lw2/d;->i:Lw2/e;

    .line 354
    .line 355
    invoke-virtual {v0, v2, v3}, Lr2/q;->j(Lr2/e;Lr2/i;)V

    .line 356
    .line 357
    .line 358
    return-object v3

    .line 359
    :catchall_1
    move-exception v0

    .line 360
    monitor-exit v3

    .line 361
    throw v0

    .line 362
    :catchall_2
    move-exception v0

    .line 363
    iget-object v2, v1, Lw2/d;->i:Lw2/e;

    .line 364
    .line 365
    invoke-virtual {v2, v4}, Lw2/e;->x(Lokhttp3/internal/connection/RealConnection;)V

    .line 366
    .line 367
    .line 368
    throw v0

    .line 369
    :cond_d
    new-instance v0, Ljava/io/IOException;

    .line 370
    .line 371
    const-string v2, "Canceled"

    .line 372
    .line 373
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw v0

    .line 377
    :cond_e
    new-instance v0, Ljava/io/IOException;

    .line 378
    .line 379
    const-string v2, "Canceled"

    .line 380
    .line 381
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw v0
.end method

.method public final c(IIIIZZ)Lokhttp3/internal/connection/RealConnection;
    .locals 2

    .line 1
    :goto_0
    invoke-virtual/range {p0 .. p5}, Lw2/d;->b(IIIIZ)Lokhttp3/internal/connection/RealConnection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p6}, Lokhttp3/internal/connection/RealConnection;->u(Z)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lokhttp3/internal/connection/RealConnection;->y()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lw2/d;->f:Lr2/c0;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iget-object v0, p0, Lw2/d;->a:Lokhttp3/internal/connection/RouteSelector$b;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Lokhttp3/internal/connection/RouteSelector$b;->b()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move v0, v1

    .line 31
    :goto_1
    if-eqz v0, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget-object v0, p0, Lw2/d;->b:Lokhttp3/internal/connection/RouteSelector;

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    invoke-virtual {v0}, Lokhttp3/internal/connection/RouteSelector;->b()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    :cond_4
    if-eqz v1, :cond_5

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_5
    new-instance p1, Ljava/io/IOException;

    .line 46
    .line 47
    const-string p2, "exhausted all routes"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public final d()Lr2/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lw2/d;->h:Lr2/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget v0, p0, Lw2/d;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lw2/d;->d:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lw2/d;->e:I

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_0
    iget-object v0, p0, Lw2/d;->f:Lr2/c0;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    invoke-virtual {p0}, Lw2/d;->f()Lr2/c0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iput-object v0, p0, Lw2/d;->f:Lr2/c0;

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    iget-object v0, p0, Lw2/d;->a:Lokhttp3/internal/connection/RouteSelector$b;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {v0}, Lokhttp3/internal/connection/RouteSelector$b;->b()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-ne v0, v1, :cond_3

    .line 39
    .line 40
    return v1

    .line 41
    :cond_3
    iget-object v0, p0, Lw2/d;->b:Lokhttp3/internal/connection/RouteSelector;

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    invoke-virtual {v0}, Lokhttp3/internal/connection/RouteSelector;->b()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    return v0

    .line 50
    :cond_4
    return v1
.end method

.method public final f()Lr2/c0;
    .locals 4

    .line 1
    iget v0, p0, Lw2/d;->c:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-gt v0, v2, :cond_3

    .line 6
    .line 7
    iget v0, p0, Lw2/d;->d:I

    .line 8
    .line 9
    if-gt v0, v2, :cond_3

    .line 10
    .line 11
    iget v0, p0, Lw2/d;->e:I

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lw2/d;->i:Lw2/e;

    .line 17
    .line 18
    invoke-virtual {v0}, Lw2/e;->l()Lokhttp3/internal/connection/RealConnection;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    monitor-enter v0

    .line 25
    :try_start_0
    invoke-virtual {v0}, Lokhttp3/internal/connection/RealConnection;->q()I

    .line 26
    .line 27
    .line 28
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-object v1

    .line 33
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Lokhttp3/internal/connection/RealConnection;->z()Lr2/c0;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Lr2/c0;->a()Lr2/a;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Lr2/a;->l()Lr2/t;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v3, p0, Lw2/d;->h:Lr2/a;

    .line 46
    .line 47
    invoke-virtual {v3}, Lr2/a;->l()Lr2/t;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v2, v3}, Ls2/b;->g(Lr2/t;Lr2/t;)Z

    .line 52
    .line 53
    .line 54
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    monitor-exit v0

    .line 58
    return-object v1

    .line 59
    :cond_2
    :try_start_2
    invoke-virtual {v0}, Lokhttp3/internal/connection/RealConnection;->z()Lr2/c0;

    .line 60
    .line 61
    .line 62
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    monitor-exit v0

    .line 64
    return-object v1

    .line 65
    :catchall_0
    move-exception v1

    .line 66
    monitor-exit v0

    .line 67
    throw v1

    .line 68
    :cond_3
    :goto_0
    return-object v1
.end method

.method public final g(Lr2/t;)Z
    .locals 3

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw2/d;->h:Lr2/a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lr2/a;->l()Lr2/t;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1}, Lr2/t;->n()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0}, Lr2/t;->n()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Lr2/t;->i()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v0}, Lr2/t;->i()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    :goto_0
    return p1
.end method

.method public final h(Ljava/io/IOException;)V
    .locals 2

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lw2/d;->f:Lr2/c0;

    .line 8
    .line 9
    instance-of v0, p1, Lokhttp3/internal/http2/StreamResetException;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, Lokhttp3/internal/http2/StreamResetException;

    .line 15
    .line 16
    iget-object v0, v0, Lokhttp3/internal/http2/StreamResetException;->a:Lokhttp3/internal/http2/ErrorCode;

    .line 17
    .line 18
    sget-object v1, Lokhttp3/internal/http2/ErrorCode;->i:Lokhttp3/internal/http2/ErrorCode;

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    iget p1, p0, Lw2/d;->c:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    iput p1, p0, Lw2/d;->c:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    instance-of p1, p1, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget p1, p0, Lw2/d;->d:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    iput p1, p0, Lw2/d;->d:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget p1, p0, Lw2/d;->e:I

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    iput p1, p0, Lw2/d;->e:I

    .line 45
    .line 46
    :goto_0
    return-void
.end method
