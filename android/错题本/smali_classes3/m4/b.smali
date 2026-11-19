.class public final Lm4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/t;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm4/b;->a:I

    iput-object p1, p0, Lm4/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lokhttp3/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm4/b;->a:I

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm4/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public static c(Lokhttp3/i0;I)I
    .locals 1

    .line 1
    const-string v0, "Retry-After"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lokhttp3/i0;->a(Ljava/lang/String;Lokhttp3/i0;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    new-instance p1, Lkotlin/text/Regex;

    .line 11
    .line 12
    const-string v0, "\\d+"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "valueOf(header)"

    .line 28
    .line 29
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_1
    const p0, 0x7fffffff

    .line 38
    .line 39
    .line 40
    return p0
.end method


# virtual methods
.method public a(Lokhttp3/i0;Lokhttp3/internal/connection/d;)Lokhttp3/c0;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    iget-object v1, p2, Lokhttp3/internal/connection/d;->f:Lokhttp3/internal/connection/k;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, v1, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    :goto_0
    iget v2, p1, Lokhttp3/i0;->d:I

    .line 13
    .line 14
    iget-object v3, p1, Lokhttp3/i0;->a:Lokhttp3/c0;

    .line 15
    .line 16
    iget-object v4, v3, Lokhttp3/c0;->b:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    const/16 v7, 0x134

    .line 21
    .line 22
    const/16 v8, 0x133

    .line 23
    .line 24
    if-eq v2, v8, :cond_e

    .line 25
    .line 26
    if-eq v2, v7, :cond_e

    .line 27
    .line 28
    const/16 v9, 0x191

    .line 29
    .line 30
    if-eq v2, v9, :cond_d

    .line 31
    .line 32
    const/16 v9, 0x1a5

    .line 33
    .line 34
    if-eq v2, v9, :cond_a

    .line 35
    .line 36
    const/16 p2, 0x1f7

    .line 37
    .line 38
    if-eq v2, p2, :cond_8

    .line 39
    .line 40
    const/16 p2, 0x197

    .line 41
    .line 42
    if-eq v2, p2, :cond_6

    .line 43
    .line 44
    const/16 p2, 0x198

    .line 45
    .line 46
    if-eq v2, p2, :cond_1

    .line 47
    .line 48
    packed-switch v2, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :cond_1
    iget-object v1, p0, Lm4/b;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lokhttp3/z;

    .line 56
    .line 57
    iget-boolean v1, v1, Lokhttp3/z;->f:Z

    .line 58
    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :cond_2
    iget-object v1, v3, Lokhttp3/c0;->d:Lokhttp3/g0;

    .line 64
    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    invoke-virtual {v1}, Lokhttp3/g0;->isOneShot()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    goto/16 :goto_2

    .line 74
    .line 75
    :cond_3
    iget-object v1, p1, Lokhttp3/i0;->j:Lokhttp3/i0;

    .line 76
    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    iget v1, v1, Lokhttp3/i0;->d:I

    .line 80
    .line 81
    if-ne v1, p2, :cond_4

    .line 82
    .line 83
    goto/16 :goto_2

    .line 84
    .line 85
    :cond_4
    invoke-static {p1, v5}, Lm4/b;->c(Lokhttp3/i0;I)I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-lez p2, :cond_5

    .line 90
    .line 91
    goto/16 :goto_2

    .line 92
    .line 93
    :cond_5
    iget-object p1, p1, Lokhttp3/i0;->a:Lokhttp3/c0;

    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, v1, Lokhttp3/n0;->b:Ljava/net/Proxy;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 106
    .line 107
    if-ne p1, p2, :cond_7

    .line 108
    .line 109
    iget-object p1, p0, Lm4/b;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p1, Lokhttp3/z;

    .line 112
    .line 113
    iget-object p1, p1, Lokhttp3/z;->n:Lokhttp3/b;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_7
    new-instance p1, Ljava/net/ProtocolException;

    .line 120
    .line 121
    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 122
    .line 123
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1

    .line 127
    :cond_8
    iget-object v1, p1, Lokhttp3/i0;->j:Lokhttp3/i0;

    .line 128
    .line 129
    if-eqz v1, :cond_9

    .line 130
    .line 131
    iget v1, v1, Lokhttp3/i0;->d:I

    .line 132
    .line 133
    if-ne v1, p2, :cond_9

    .line 134
    .line 135
    goto/16 :goto_2

    .line 136
    .line 137
    :cond_9
    const p2, 0x7fffffff

    .line 138
    .line 139
    .line 140
    invoke-static {p1, p2}, Lm4/b;->c(Lokhttp3/i0;I)I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    if-nez p2, :cond_13

    .line 145
    .line 146
    iget-object p1, p1, Lokhttp3/i0;->a:Lokhttp3/c0;

    .line 147
    .line 148
    return-object p1

    .line 149
    :cond_a
    iget-object v1, v3, Lokhttp3/c0;->d:Lokhttp3/g0;

    .line 150
    .line 151
    if-eqz v1, :cond_b

    .line 152
    .line 153
    invoke-virtual {v1}, Lokhttp3/g0;->isOneShot()Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_b

    .line 158
    .line 159
    goto/16 :goto_2

    .line 160
    .line 161
    :cond_b
    if-eqz p2, :cond_13

    .line 162
    .line 163
    iget-object v1, p2, Lokhttp3/internal/connection/d;->b:Lokhttp3/internal/connection/e;

    .line 164
    .line 165
    iget-object v1, v1, Lokhttp3/internal/connection/e;->b:Lokhttp3/a;

    .line 166
    .line 167
    iget-object v1, v1, Lokhttp3/a;->i:Lokhttp3/r;

    .line 168
    .line 169
    iget-object v1, v1, Lokhttp3/r;->d:Ljava/lang/String;

    .line 170
    .line 171
    iget-object v2, p2, Lokhttp3/internal/connection/d;->f:Lokhttp3/internal/connection/k;

    .line 172
    .line 173
    iget-object v2, v2, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 174
    .line 175
    iget-object v2, v2, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 176
    .line 177
    iget-object v2, v2, Lokhttp3/a;->i:Lokhttp3/r;

    .line 178
    .line 179
    iget-object v2, v2, Lokhttp3/r;->d:Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_c

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_c
    iget-object p2, p2, Lokhttp3/internal/connection/d;->f:Lokhttp3/internal/connection/k;

    .line 189
    .line 190
    monitor-enter p2

    .line 191
    :try_start_0
    iput-boolean v6, p2, Lokhttp3/internal/connection/k;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    .line 193
    monitor-exit p2

    .line 194
    iget-object p1, p1, Lokhttp3/i0;->a:Lokhttp3/c0;

    .line 195
    .line 196
    return-object p1

    .line 197
    :catchall_0
    move-exception p1

    .line 198
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 199
    throw p1

    .line 200
    :cond_d
    iget-object p1, p0, Lm4/b;->b:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast p1, Lokhttp3/z;

    .line 203
    .line 204
    iget-object p1, p1, Lokhttp3/z;->g:Lokhttp3/b;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    return-object v0

    .line 210
    :cond_e
    :pswitch_0
    const-string p2, "PROPFIND"

    .line 211
    .line 212
    iget-object v1, p0, Lm4/b;->b:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v1, Lokhttp3/z;

    .line 215
    .line 216
    iget-boolean v2, v1, Lokhttp3/z;->h:Z

    .line 217
    .line 218
    if-nez v2, :cond_f

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_f
    const-string v2, "Location"

    .line 222
    .line 223
    invoke-static {v2, p1}, Lokhttp3/i0;->a(Ljava/lang/String;Lokhttp3/i0;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    iget-object v3, p1, Lokhttp3/i0;->a:Lokhttp3/c0;

    .line 228
    .line 229
    if-nez v2, :cond_10

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_10
    iget-object v9, v3, Lokhttp3/c0;->a:Lokhttp3/r;

    .line 233
    .line 234
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v9, v2}, Lokhttp3/r;->f(Ljava/lang/String;)Lcom/zykj/mistake/feature/notebook/detail/z4;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    if-eqz v2, :cond_11

    .line 242
    .line 243
    invoke-virtual {v2}, Lcom/zykj/mistake/feature/notebook/detail/z4;->a()Lokhttp3/r;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    goto :goto_1

    .line 248
    :cond_11
    move-object v2, v0

    .line 249
    :goto_1
    if-nez v2, :cond_12

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_12
    iget-object v9, v2, Lokhttp3/r;->a:Ljava/lang/String;

    .line 253
    .line 254
    iget-object v10, v3, Lokhttp3/c0;->a:Lokhttp3/r;

    .line 255
    .line 256
    iget-object v10, v10, Lokhttp3/r;->a:Ljava/lang/String;

    .line 257
    .line 258
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v9

    .line 262
    if-nez v9, :cond_14

    .line 263
    .line 264
    iget-boolean v1, v1, Lokhttp3/z;->i:Z

    .line 265
    .line 266
    if-nez v1, :cond_14

    .line 267
    .line 268
    :cond_13
    :goto_2
    return-object v0

    .line 269
    :cond_14
    invoke-virtual {v3}, Lokhttp3/c0;->a()Lokhttp3/b0;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-static {v4}, Lcoil3/network/g;->k(Ljava/lang/String;)Z

    .line 274
    .line 275
    .line 276
    move-result v9

    .line 277
    if-eqz v9, :cond_19

    .line 278
    .line 279
    iget p1, p1, Lokhttp3/i0;->d:I

    .line 280
    .line 281
    invoke-virtual {v4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    if-nez v9, :cond_15

    .line 286
    .line 287
    if-eq p1, v7, :cond_15

    .line 288
    .line 289
    if-ne p1, v8, :cond_16

    .line 290
    .line 291
    :cond_15
    move v5, v6

    .line 292
    :cond_16
    invoke-virtual {v4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result p2

    .line 296
    if-nez p2, :cond_17

    .line 297
    .line 298
    if-eq p1, v7, :cond_17

    .line 299
    .line 300
    if-eq p1, v8, :cond_17

    .line 301
    .line 302
    const-string p1, "GET"

    .line 303
    .line 304
    invoke-virtual {v1, p1, v0}, Lokhttp3/b0;->d(Ljava/lang/String;Lokhttp3/g0;)V

    .line 305
    .line 306
    .line 307
    goto :goto_3

    .line 308
    :cond_17
    if-eqz v5, :cond_18

    .line 309
    .line 310
    iget-object v0, v3, Lokhttp3/c0;->d:Lokhttp3/g0;

    .line 311
    .line 312
    :cond_18
    invoke-virtual {v1, v4, v0}, Lokhttp3/b0;->d(Ljava/lang/String;Lokhttp3/g0;)V

    .line 313
    .line 314
    .line 315
    :goto_3
    if-nez v5, :cond_19

    .line 316
    .line 317
    const-string p1, "Transfer-Encoding"

    .line 318
    .line 319
    iget-object p2, v1, Lokhttp3/b0;->c:Lkotlin/jvm/internal/o;

    .line 320
    .line 321
    invoke-virtual {p2, p1}, Lkotlin/jvm/internal/o;->i(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    const-string p1, "Content-Length"

    .line 325
    .line 326
    iget-object p2, v1, Lokhttp3/b0;->c:Lkotlin/jvm/internal/o;

    .line 327
    .line 328
    invoke-virtual {p2, p1}, Lkotlin/jvm/internal/o;->i(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    const-string p1, "Content-Type"

    .line 332
    .line 333
    iget-object p2, v1, Lokhttp3/b0;->c:Lkotlin/jvm/internal/o;

    .line 334
    .line 335
    invoke-virtual {p2, p1}, Lkotlin/jvm/internal/o;->i(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    :cond_19
    iget-object p1, v3, Lokhttp3/c0;->a:Lokhttp3/r;

    .line 339
    .line 340
    invoke-static {p1, v2}, Lp7/c;->a(Lokhttp3/r;Lokhttp3/r;)Z

    .line 341
    .line 342
    .line 343
    move-result p1

    .line 344
    if-nez p1, :cond_1a

    .line 345
    .line 346
    const-string p1, "Authorization"

    .line 347
    .line 348
    iget-object p2, v1, Lokhttp3/b0;->c:Lkotlin/jvm/internal/o;

    .line 349
    .line 350
    invoke-virtual {p2, p1}, Lkotlin/jvm/internal/o;->i(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    :cond_1a
    iput-object v2, v1, Lokhttp3/b0;->a:Lokhttp3/r;

    .line 354
    .line 355
    invoke-virtual {v1}, Lokhttp3/b0;->b()Lokhttp3/c0;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    return-object p1

    .line 360
    nop

    .line 361
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/io/IOException;Lokhttp3/internal/connection/i;Lokhttp3/c0;Z)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lm4/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lokhttp3/z;

    .line 4
    .line 5
    iget-boolean v0, v0, Lokhttp3/z;->f:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_5

    .line 11
    .line 12
    :cond_0
    if-eqz p4, :cond_2

    .line 13
    .line 14
    iget-object p3, p3, Lokhttp3/c0;->d:Lokhttp3/g0;

    .line 15
    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Lokhttp3/g0;->isOneShot()Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-nez p3, :cond_11

    .line 23
    .line 24
    :cond_1
    instance-of p3, p1, Ljava/io/FileNotFoundException;

    .line 25
    .line 26
    if-eqz p3, :cond_2

    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    instance-of p3, p1, Ljava/net/ProtocolException;

    .line 30
    .line 31
    if-eqz p3, :cond_3

    .line 32
    .line 33
    return v1

    .line 34
    :cond_3
    instance-of p3, p1, Ljava/io/InterruptedIOException;

    .line 35
    .line 36
    if-eqz p3, :cond_4

    .line 37
    .line 38
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    .line 39
    .line 40
    if-eqz p1, :cond_11

    .line 41
    .line 42
    if-nez p4, :cond_11

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    .line 46
    .line 47
    if-eqz p3, :cond_5

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    instance-of p3, p3, Ljava/security/cert/CertificateException;

    .line 54
    .line 55
    if-eqz p3, :cond_5

    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_5
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 60
    .line 61
    if-eqz p1, :cond_6

    .line 62
    .line 63
    return v1

    .line 64
    :cond_6
    :goto_0
    iget-object p1, p2, Lokhttp3/internal/connection/i;->g:Lokhttp3/internal/connection/e;

    .line 65
    .line 66
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget p2, p1, Lokhttp3/internal/connection/e;->f:I

    .line 70
    .line 71
    const/4 p3, 0x1

    .line 72
    if-nez p2, :cond_7

    .line 73
    .line 74
    iget p4, p1, Lokhttp3/internal/connection/e;->g:I

    .line 75
    .line 76
    if-nez p4, :cond_7

    .line 77
    .line 78
    iget p4, p1, Lokhttp3/internal/connection/e;->h:I

    .line 79
    .line 80
    if-nez p4, :cond_7

    .line 81
    .line 82
    move p1, v1

    .line 83
    goto :goto_4

    .line 84
    :cond_7
    iget-object p4, p1, Lokhttp3/internal/connection/e;->i:Lokhttp3/n0;

    .line 85
    .line 86
    if-eqz p4, :cond_8

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_8
    const/4 p4, 0x0

    .line 90
    if-gt p2, p3, :cond_d

    .line 91
    .line 92
    iget p2, p1, Lokhttp3/internal/connection/e;->g:I

    .line 93
    .line 94
    if-gt p2, p3, :cond_d

    .line 95
    .line 96
    iget p2, p1, Lokhttp3/internal/connection/e;->h:I

    .line 97
    .line 98
    if-lez p2, :cond_9

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_9
    iget-object p2, p1, Lokhttp3/internal/connection/e;->c:Lokhttp3/internal/connection/i;

    .line 102
    .line 103
    iget-object p2, p2, Lokhttp3/internal/connection/i;->h:Lokhttp3/internal/connection/k;

    .line 104
    .line 105
    if-nez p2, :cond_a

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_a
    monitor-enter p2

    .line 109
    :try_start_0
    iget v0, p2, Lokhttp3/internal/connection/k;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    if-eqz v0, :cond_b

    .line 112
    .line 113
    monitor-exit p2

    .line 114
    goto :goto_1

    .line 115
    :cond_b
    :try_start_1
    iget-object v0, p2, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;

    .line 116
    .line 117
    iget-object v0, v0, Lokhttp3/n0;->a:Lokhttp3/a;

    .line 118
    .line 119
    iget-object v0, v0, Lokhttp3/a;->i:Lokhttp3/r;

    .line 120
    .line 121
    iget-object v2, p1, Lokhttp3/internal/connection/e;->b:Lokhttp3/a;

    .line 122
    .line 123
    iget-object v2, v2, Lokhttp3/a;->i:Lokhttp3/r;

    .line 124
    .line 125
    invoke-static {v0, v2}, Lp7/c;->a(Lokhttp3/r;Lokhttp3/r;)Z

    .line 126
    .line 127
    .line 128
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    if-nez v0, :cond_c

    .line 130
    .line 131
    monitor-exit p2

    .line 132
    goto :goto_1

    .line 133
    :cond_c
    :try_start_2
    iget-object p4, p2, Lokhttp3/internal/connection/k;->b:Lokhttp3/n0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 134
    .line 135
    monitor-exit p2

    .line 136
    goto :goto_1

    .line 137
    :catchall_0
    move-exception p1

    .line 138
    monitor-exit p2

    .line 139
    throw p1

    .line 140
    :cond_d
    :goto_1
    if-eqz p4, :cond_e

    .line 141
    .line 142
    iput-object p4, p1, Lokhttp3/internal/connection/e;->i:Lokhttp3/n0;

    .line 143
    .line 144
    :goto_2
    move p1, p3

    .line 145
    goto :goto_4

    .line 146
    :cond_e
    iget-object p2, p1, Lokhttp3/internal/connection/e;->d:Ld2/c;

    .line 147
    .line 148
    if-eqz p2, :cond_f

    .line 149
    .line 150
    invoke-virtual {p2}, Ld2/c;->e()Z

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    if-ne p2, p3, :cond_f

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_f
    iget-object p1, p1, Lokhttp3/internal/connection/e;->e:Lokhttp3/internal/connection/n;

    .line 158
    .line 159
    if-nez p1, :cond_10

    .line 160
    .line 161
    :goto_3
    goto :goto_2

    .line 162
    :cond_10
    invoke-virtual {p1}, Lokhttp3/internal/connection/n;->a()Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    :goto_4
    if-nez p1, :cond_12

    .line 167
    .line 168
    :cond_11
    :goto_5
    return v1

    .line 169
    :cond_12
    return p3
.end method

.method public final intercept(Lokhttp3/s;)Lokhttp3/i0;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lm4/b;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p1

    .line 9
    .line 10
    check-cast v2, Ls7/e;

    .line 11
    .line 12
    iget-object v0, v2, Ls7/e;->e:Lokhttp3/c0;

    .line 13
    .line 14
    iget-object v3, v2, Ls7/e;->a:Lokhttp3/internal/connection/i;

    .line 15
    .line 16
    sget-object v4, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 17
    .line 18
    move-object v8, v4

    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x0

    .line 21
    move-object v4, v0

    .line 22
    :goto_0
    const/4 v0, 0x1

    .line 23
    :goto_1
    const-string v11, "request"

    .line 24
    .line 25
    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v11, v3, Lokhttp3/internal/connection/i;->j:Lokhttp3/internal/connection/d;

    .line 29
    .line 30
    if-nez v11, :cond_12

    .line 31
    .line 32
    monitor-enter v3

    .line 33
    :try_start_0
    iget-boolean v11, v3, Lokhttp3/internal/connection/i;->l:Z

    .line 34
    .line 35
    if-nez v11, :cond_11

    .line 36
    .line 37
    iget-boolean v11, v3, Lokhttp3/internal/connection/i;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    .line 39
    if-nez v11, :cond_10

    .line 40
    .line 41
    monitor-exit v3

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    new-instance v0, Lokhttp3/internal/connection/e;

    .line 45
    .line 46
    iget-object v11, v3, Lokhttp3/internal/connection/i;->c:Lokhttp3/internal/connection/m;

    .line 47
    .line 48
    iget-object v12, v4, Lokhttp3/c0;->a:Lokhttp3/r;

    .line 49
    .line 50
    iget-object v13, v3, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 51
    .line 52
    iget-boolean v14, v12, Lokhttp3/r;->j:Z

    .line 53
    .line 54
    if-eqz v14, :cond_1

    .line 55
    .line 56
    iget-object v14, v13, Lokhttp3/z;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 57
    .line 58
    if-eqz v14, :cond_0

    .line 59
    .line 60
    iget-object v15, v13, Lokhttp3/z;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 61
    .line 62
    iget-object v5, v13, Lokhttp3/z;->u:Lokhttp3/h;

    .line 63
    .line 64
    move-object/from16 v19, v5

    .line 65
    .line 66
    move-object/from16 v17, v14

    .line 67
    .line 68
    move-object/from16 v18, v15

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v2, "CLEARTEXT-only client"

    .line 74
    .line 75
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_1
    const/16 v17, 0x0

    .line 80
    .line 81
    const/16 v18, 0x0

    .line 82
    .line 83
    const/16 v19, 0x0

    .line 84
    .line 85
    :goto_2
    new-instance v5, Lokhttp3/a;

    .line 86
    .line 87
    iget-object v14, v12, Lokhttp3/r;->d:Ljava/lang/String;

    .line 88
    .line 89
    iget v12, v12, Lokhttp3/r;->e:I

    .line 90
    .line 91
    iget-object v15, v13, Lokhttp3/z;->k:Lokhttp3/b;

    .line 92
    .line 93
    iget-object v7, v13, Lokhttp3/z;->o:Ljavax/net/SocketFactory;

    .line 94
    .line 95
    iget-object v6, v13, Lokhttp3/z;->n:Lokhttp3/b;

    .line 96
    .line 97
    move-object/from16 v16, v5

    .line 98
    .line 99
    iget-object v5, v13, Lokhttp3/z;->l:Ljava/net/Proxy;

    .line 100
    .line 101
    move-object/from16 v21, v5

    .line 102
    .line 103
    iget-object v5, v13, Lokhttp3/z;->s:Ljava/util/List;

    .line 104
    .line 105
    move-object/from16 v22, v5

    .line 106
    .line 107
    iget-object v5, v13, Lokhttp3/z;->r:Ljava/util/List;

    .line 108
    .line 109
    iget-object v13, v13, Lokhttp3/z;->m:Ljava/net/ProxySelector;

    .line 110
    .line 111
    move-object/from16 v23, v5

    .line 112
    .line 113
    move-object/from16 v20, v6

    .line 114
    .line 115
    move-object/from16 v24, v13

    .line 116
    .line 117
    move-object v13, v14

    .line 118
    move v14, v12

    .line 119
    move-object/from16 v12, v16

    .line 120
    .line 121
    move-object/from16 v16, v7

    .line 122
    .line 123
    invoke-direct/range {v12 .. v24}, Lokhttp3/a;-><init>(Ljava/lang/String;ILokhttp3/b;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/h;Lokhttp3/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 124
    .line 125
    .line 126
    invoke-direct {v0, v11, v12, v3}, Lokhttp3/internal/connection/e;-><init>(Lokhttp3/internal/connection/m;Lokhttp3/a;Lokhttp3/internal/connection/i;)V

    .line 127
    .line 128
    .line 129
    iput-object v0, v3, Lokhttp3/internal/connection/i;->g:Lokhttp3/internal/connection/e;

    .line 130
    .line 131
    :cond_2
    :try_start_1
    iget-boolean v0, v3, Lokhttp3/internal/connection/i;->n:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    .line 133
    if-nez v0, :cond_f

    .line 134
    .line 135
    :try_start_2
    invoke-virtual {v2, v4}, Ls7/e;->b(Lokhttp3/c0;)Lokhttp3/i0;

    .line 136
    .line 137
    .line 138
    move-result-object v0
    :try_end_2
    .catch Lokhttp3/internal/connection/RouteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    if-eqz v9, :cond_4

    .line 140
    .line 141
    :try_start_3
    invoke-virtual {v0}, Lokhttp3/i0;->c()Lokhttp3/h0;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v9}, Lokhttp3/i0;->c()Lokhttp3/h0;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    const/4 v5, 0x0

    .line 150
    iput-object v5, v4, Lokhttp3/h0;->g:Lokhttp3/m0;

    .line 151
    .line 152
    invoke-virtual {v4}, Lokhttp3/h0;->a()Lokhttp3/i0;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    iget-object v6, v4, Lokhttp3/i0;->g:Lokhttp3/m0;

    .line 157
    .line 158
    if-nez v6, :cond_3

    .line 159
    .line 160
    iput-object v4, v0, Lokhttp3/h0;->j:Lokhttp3/i0;

    .line 161
    .line 162
    invoke-virtual {v0}, Lokhttp3/h0;->a()Lokhttp3/i0;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    :goto_3
    move-object v9, v0

    .line 167
    goto :goto_4

    .line 168
    :catchall_0
    move-exception v0

    .line 169
    const/4 v6, 0x1

    .line 170
    goto/16 :goto_9

    .line 171
    .line 172
    :cond_3
    const-string v0, "priorResponse.body != null"

    .line 173
    .line 174
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 175
    .line 176
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v2

    .line 180
    :cond_4
    const/4 v5, 0x0

    .line 181
    goto :goto_3

    .line 182
    :goto_4
    iget-object v0, v3, Lokhttp3/internal/connection/i;->j:Lokhttp3/internal/connection/d;

    .line 183
    .line 184
    invoke-virtual {v1, v9, v0}, Lm4/b;->a(Lokhttp3/i0;Lokhttp3/internal/connection/d;)Lokhttp3/c0;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    if-nez v4, :cond_7

    .line 189
    .line 190
    if-eqz v0, :cond_5

    .line 191
    .line 192
    iget-boolean v0, v0, Lokhttp3/internal/connection/d;->d:Z

    .line 193
    .line 194
    if-eqz v0, :cond_5

    .line 195
    .line 196
    iget-boolean v0, v3, Lokhttp3/internal/connection/i;->i:Z

    .line 197
    .line 198
    if-nez v0, :cond_6

    .line 199
    .line 200
    const/4 v2, 0x1

    .line 201
    iput-boolean v2, v3, Lokhttp3/internal/connection/i;->i:Z

    .line 202
    .line 203
    iget-object v0, v3, Lokhttp3/internal/connection/i;->d:Lokhttp3/internal/connection/h;

    .line 204
    .line 205
    invoke-virtual {v0}, Lokio/AsyncTimeout;->exit()Z

    .line 206
    .line 207
    .line 208
    :cond_5
    const/4 v6, 0x0

    .line 209
    goto :goto_5

    .line 210
    :cond_6
    const-string v0, "Check failed."

    .line 211
    .line 212
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 213
    .line 214
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 218
    :goto_5
    invoke-virtual {v3, v6}, Lokhttp3/internal/connection/i;->i(Z)V

    .line 219
    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_7
    const/4 v6, 0x0

    .line 223
    :try_start_4
    iget-object v0, v4, Lokhttp3/c0;->d:Lokhttp3/g0;

    .line 224
    .line 225
    if-eqz v0, :cond_8

    .line 226
    .line 227
    invoke-virtual {v0}, Lokhttp3/g0;->isOneShot()Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_8

    .line 232
    .line 233
    goto :goto_5

    .line 234
    :goto_6
    return-object v9

    .line 235
    :cond_8
    iget-object v0, v9, Lokhttp3/i0;->g:Lokhttp3/m0;

    .line 236
    .line 237
    if-eqz v0, :cond_9

    .line 238
    .line 239
    invoke-static {v0}, Lp7/c;->c(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 240
    .line 241
    .line 242
    :cond_9
    add-int/lit8 v10, v10, 0x1

    .line 243
    .line 244
    const/16 v0, 0x14

    .line 245
    .line 246
    if-gt v10, v0, :cond_a

    .line 247
    .line 248
    const/4 v6, 0x1

    .line 249
    invoke-virtual {v3, v6}, Lokhttp3/internal/connection/i;->i(Z)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_a
    :try_start_5
    new-instance v0, Ljava/net/ProtocolException;

    .line 255
    .line 256
    new-instance v2, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 259
    .line 260
    .line 261
    const-string v4, "Too many follow-up requests: "

    .line 262
    .line 263
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw v0

    .line 277
    :catch_0
    move-exception v0

    .line 278
    const/4 v5, 0x0

    .line 279
    instance-of v6, v0, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 280
    .line 281
    const/4 v7, 0x1

    .line 282
    xor-int/2addr v6, v7

    .line 283
    invoke-virtual {v1, v0, v3, v4, v6}, Lm4/b;->b(Ljava/io/IOException;Lokhttp3/internal/connection/i;Lokhttp3/c0;Z)Z

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    if-eqz v6, :cond_b

    .line 288
    .line 289
    invoke-static {v8, v0}, Lkotlin/collections/t;->s0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 290
    .line 291
    .line 292
    move-result-object v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 293
    invoke-virtual {v3, v7}, Lokhttp3/internal/connection/i;->i(Z)V

    .line 294
    .line 295
    .line 296
    const/4 v0, 0x0

    .line 297
    goto/16 :goto_1

    .line 298
    .line 299
    :cond_b
    :try_start_6
    const-string v2, "suppressed"

    .line 300
    .line 301
    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    if-eqz v4, :cond_c

    .line 313
    .line 314
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    check-cast v4, Ljava/lang/Exception;

    .line 319
    .line 320
    invoke-static {v0, v4}, Lkotlin/collections/u;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 321
    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_c
    throw v0

    .line 325
    :catch_1
    move-exception v0

    .line 326
    const/4 v5, 0x0

    .line 327
    invoke-virtual {v0}, Lokhttp3/internal/connection/RouteException;->getLastConnectException()Ljava/io/IOException;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    const/4 v7, 0x0

    .line 332
    invoke-virtual {v1, v6, v3, v4, v7}, Lm4/b;->b(Ljava/io/IOException;Lokhttp3/internal/connection/i;Lokhttp3/c0;Z)Z

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    if-eqz v6, :cond_d

    .line 337
    .line 338
    invoke-virtual {v0}, Lokhttp3/internal/connection/RouteException;->getFirstConnectException()Ljava/io/IOException;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-static {v8, v0}, Lkotlin/collections/t;->s0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 343
    .line 344
    .line 345
    move-result-object v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 346
    const/4 v6, 0x1

    .line 347
    invoke-virtual {v3, v6}, Lokhttp3/internal/connection/i;->i(Z)V

    .line 348
    .line 349
    .line 350
    move v0, v7

    .line 351
    goto/16 :goto_1

    .line 352
    .line 353
    :cond_d
    :try_start_7
    invoke-virtual {v0}, Lokhttp3/internal/connection/RouteException;->getFirstConnectException()Ljava/io/IOException;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    const-string v2, "<this>"

    .line 358
    .line 359
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    const-string v2, "suppressed"

    .line 363
    .line 364
    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    if-eqz v4, :cond_e

    .line 376
    .line 377
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    check-cast v4, Ljava/lang/Exception;

    .line 382
    .line 383
    invoke-static {v0, v4}, Lkotlin/collections/u;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 384
    .line 385
    .line 386
    goto :goto_8

    .line 387
    :cond_e
    throw v0

    .line 388
    :cond_f
    new-instance v0, Ljava/io/IOException;

    .line 389
    .line 390
    const-string v2, "Canceled"

    .line 391
    .line 392
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 396
    :goto_9
    invoke-virtual {v3, v6}, Lokhttp3/internal/connection/i;->i(Z)V

    .line 397
    .line 398
    .line 399
    throw v0

    .line 400
    :cond_10
    :try_start_8
    const-string v0, "Check failed."

    .line 401
    .line 402
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 403
    .line 404
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    throw v2

    .line 408
    :catchall_1
    move-exception v0

    .line 409
    goto :goto_a

    .line 410
    :cond_11
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 411
    .line 412
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 413
    .line 414
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 418
    :goto_a
    monitor-exit v3

    .line 419
    throw v0

    .line 420
    :cond_12
    const-string v0, "Check failed."

    .line 421
    .line 422
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 423
    .line 424
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    throw v2

    .line 428
    :pswitch_0
    const-string v0, "Content-Encoding"

    .line 429
    .line 430
    const-string v2, "User-Agent"

    .line 431
    .line 432
    iget-object v3, v1, Lm4/b;->b:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v3, Lokhttp3/b;

    .line 435
    .line 436
    const-string v4, "gzip"

    .line 437
    .line 438
    const-string v5, "Accept-Encoding"

    .line 439
    .line 440
    const-string v6, "Connection"

    .line 441
    .line 442
    const-string v7, "Host"

    .line 443
    .line 444
    const-string v8, "Transfer-Encoding"

    .line 445
    .line 446
    const-string v9, "Content-Type"

    .line 447
    .line 448
    const-string v10, "Content-Length"

    .line 449
    .line 450
    move-object/from16 v11, p1

    .line 451
    .line 452
    check-cast v11, Ls7/e;

    .line 453
    .line 454
    iget-object v12, v11, Ls7/e;->e:Lokhttp3/c0;

    .line 455
    .line 456
    invoke-virtual {v12}, Lokhttp3/c0;->a()Lokhttp3/b0;

    .line 457
    .line 458
    .line 459
    move-result-object v13

    .line 460
    iget-object v14, v12, Lokhttp3/c0;->c:Lokhttp3/q;

    .line 461
    .line 462
    iget-object v15, v12, Lokhttp3/c0;->a:Lokhttp3/r;

    .line 463
    .line 464
    iget-object v1, v12, Lokhttp3/c0;->d:Lokhttp3/g0;

    .line 465
    .line 466
    move-object/from16 v16, v0

    .line 467
    .line 468
    move-object/from16 v17, v1

    .line 469
    .line 470
    const-wide/16 v18, -0x1

    .line 471
    .line 472
    if-eqz v17, :cond_15

    .line 473
    .line 474
    invoke-virtual/range {v17 .. v17}, Lokhttp3/g0;->contentType()Lokhttp3/u;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    if-eqz v0, :cond_13

    .line 479
    .line 480
    iget-object v0, v0, Lokhttp3/u;->a:Ljava/lang/String;

    .line 481
    .line 482
    invoke-virtual {v13, v9, v0}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    :cond_13
    invoke-virtual/range {v17 .. v17}, Lokhttp3/g0;->contentLength()J

    .line 486
    .line 487
    .line 488
    move-result-wide v0

    .line 489
    cmp-long v17, v0, v18

    .line 490
    .line 491
    if-eqz v17, :cond_14

    .line 492
    .line 493
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v13, v10, v0}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    iget-object v0, v13, Lokhttp3/b0;->c:Lkotlin/jvm/internal/o;

    .line 501
    .line 502
    invoke-virtual {v0, v8}, Lkotlin/jvm/internal/o;->i(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    goto :goto_b

    .line 506
    :cond_14
    const-string v0, "chunked"

    .line 507
    .line 508
    invoke-virtual {v13, v8, v0}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    iget-object v0, v13, Lokhttp3/b0;->c:Lkotlin/jvm/internal/o;

    .line 512
    .line 513
    invoke-virtual {v0, v10}, Lkotlin/jvm/internal/o;->i(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    :cond_15
    :goto_b
    invoke-virtual {v14, v7}, Lokhttp3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    const/4 v1, 0x0

    .line 521
    if-nez v0, :cond_16

    .line 522
    .line 523
    invoke-static {v15, v1}, Lp7/c;->u(Lokhttp3/r;Z)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-virtual {v13, v7, v0}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    :cond_16
    invoke-virtual {v14, v6}, Lokhttp3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    if-nez v0, :cond_17

    .line 535
    .line 536
    const-string v0, "Keep-Alive"

    .line 537
    .line 538
    invoke-virtual {v13, v6, v0}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    :cond_17
    invoke-virtual {v14, v5}, Lokhttp3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    if-nez v0, :cond_18

    .line 546
    .line 547
    const-string v0, "Range"

    .line 548
    .line 549
    invoke-virtual {v14, v0}, Lokhttp3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    if-nez v0, :cond_18

    .line 554
    .line 555
    invoke-virtual {v13, v5, v4}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    const/4 v0, 0x1

    .line 559
    goto :goto_c

    .line 560
    :cond_18
    move v0, v1

    .line 561
    :goto_c
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    const-string v5, "url"

    .line 565
    .line 566
    invoke-static {v15, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    sget-object v5, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 570
    .line 571
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 572
    .line 573
    .line 574
    move-result v6

    .line 575
    if-nez v6, :cond_1c

    .line 576
    .line 577
    const-string v6, "Cookie"

    .line 578
    .line 579
    new-instance v7, Ljava/lang/StringBuilder;

    .line 580
    .line 581
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 582
    .line 583
    .line 584
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 585
    .line 586
    .line 587
    move-result-object v5

    .line 588
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 589
    .line 590
    .line 591
    move-result v8

    .line 592
    if-eqz v8, :cond_1b

    .line 593
    .line 594
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v8

    .line 598
    add-int/lit8 v17, v1, 0x1

    .line 599
    .line 600
    if-ltz v1, :cond_1a

    .line 601
    .line 602
    check-cast v8, Lokhttp3/m;

    .line 603
    .line 604
    if-lez v1, :cond_19

    .line 605
    .line 606
    const-string v1, "; "

    .line 607
    .line 608
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    :cond_19
    iget-object v1, v8, Lokhttp3/m;->a:Ljava/lang/String;

    .line 612
    .line 613
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    const/16 v1, 0x3d

    .line 617
    .line 618
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    iget-object v1, v8, Lokhttp3/m;->b:Ljava/lang/String;

    .line 622
    .line 623
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    move/from16 v1, v17

    .line 627
    .line 628
    goto :goto_d

    .line 629
    :cond_1a
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 630
    .line 631
    .line 632
    const/4 v0, 0x0

    .line 633
    throw v0

    .line 634
    :cond_1b
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v1

    .line 638
    const-string v5, "StringBuilder().apply(builderAction).toString()"

    .line 639
    .line 640
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v13, v6, v1}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    :cond_1c
    invoke-virtual {v14, v2}, Lokhttp3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    if-nez v1, :cond_1d

    .line 651
    .line 652
    const-string v1, "okhttp/4.12.0"

    .line 653
    .line 654
    invoke-virtual {v13, v2, v1}, Lokhttp3/b0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    :cond_1d
    invoke-virtual {v13}, Lokhttp3/b0;->b()Lokhttp3/c0;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    invoke-virtual {v11, v1}, Ls7/e;->b(Lokhttp3/c0;)Lokhttp3/i0;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    iget-object v2, v1, Lokhttp3/i0;->f:Lokhttp3/q;

    .line 666
    .line 667
    invoke-static {v3, v15, v2}, Ls7/d;->b(Lokhttp3/b;Lokhttp3/r;Lokhttp3/q;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v1}, Lokhttp3/i0;->c()Lokhttp3/h0;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    iput-object v12, v3, Lokhttp3/h0;->a:Lokhttp3/c0;

    .line 675
    .line 676
    if-eqz v0, :cond_1e

    .line 677
    .line 678
    move-object/from16 v0, v16

    .line 679
    .line 680
    invoke-static {v0, v1}, Lokhttp3/i0;->a(Ljava/lang/String;Lokhttp3/i0;)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 685
    .line 686
    .line 687
    move-result v4

    .line 688
    if-eqz v4, :cond_1e

    .line 689
    .line 690
    invoke-static {v1}, Ls7/d;->a(Lokhttp3/i0;)Z

    .line 691
    .line 692
    .line 693
    move-result v4

    .line 694
    if-eqz v4, :cond_1e

    .line 695
    .line 696
    iget-object v4, v1, Lokhttp3/i0;->g:Lokhttp3/m0;

    .line 697
    .line 698
    if-eqz v4, :cond_1e

    .line 699
    .line 700
    new-instance v5, Lokio/GzipSource;

    .line 701
    .line 702
    invoke-virtual {v4}, Lokhttp3/m0;->source()Lokio/BufferedSource;

    .line 703
    .line 704
    .line 705
    move-result-object v4

    .line 706
    invoke-direct {v5, v4}, Lokio/GzipSource;-><init>(Lokio/Source;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v2}, Lokhttp3/q;->c()Lkotlin/jvm/internal/o;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/o;->i(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v2, v10}, Lkotlin/jvm/internal/o;->i(Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v2}, Lkotlin/jvm/internal/o;->f()Lokhttp3/q;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    invoke-virtual {v0}, Lokhttp3/q;->c()Lkotlin/jvm/internal/o;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    iput-object v0, v3, Lokhttp3/h0;->f:Lkotlin/jvm/internal/o;

    .line 728
    .line 729
    invoke-static {v9, v1}, Lokhttp3/i0;->a(Ljava/lang/String;Lokhttp3/i0;)Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    new-instance v1, Lokhttp3/k0;

    .line 734
    .line 735
    invoke-static {v5}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    move-wide/from16 v4, v18

    .line 740
    .line 741
    invoke-direct {v1, v0, v4, v5, v2}, Lokhttp3/k0;-><init>(Ljava/lang/String;JLokio/BufferedSource;)V

    .line 742
    .line 743
    .line 744
    iput-object v1, v3, Lokhttp3/h0;->g:Lokhttp3/m0;

    .line 745
    .line 746
    :cond_1e
    invoke-virtual {v3}, Lokhttp3/h0;->a()Lokhttp3/i0;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    return-object v0

    .line 751
    :pswitch_1
    move-object/from16 v0, p1

    .line 752
    .line 753
    check-cast v0, Ls7/e;

    .line 754
    .line 755
    iget-object v1, v0, Ls7/e;->e:Lokhttp3/c0;

    .line 756
    .line 757
    invoke-virtual {v0, v1}, Ls7/e;->b(Lokhttp3/c0;)Lokhttp3/i0;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    iget-object v1, v0, Lokhttp3/i0;->g:Lokhttp3/m0;

    .line 762
    .line 763
    if-eqz v1, :cond_1f

    .line 764
    .line 765
    new-instance v2, Lm4/f;

    .line 766
    .line 767
    move-object/from16 v3, p0

    .line 768
    .line 769
    iget-object v4, v3, Lm4/b;->b:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v4, Lm4/d;

    .line 772
    .line 773
    invoke-direct {v2, v1, v4}, Lm4/f;-><init>(Lokhttp3/m0;Lm4/d;)V

    .line 774
    .line 775
    .line 776
    goto :goto_e

    .line 777
    :cond_1f
    move-object/from16 v3, p0

    .line 778
    .line 779
    const/4 v2, 0x0

    .line 780
    :goto_e
    invoke-virtual {v0}, Lokhttp3/i0;->c()Lokhttp3/h0;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    iput-object v2, v0, Lokhttp3/h0;->g:Lokhttp3/m0;

    .line 785
    .line 786
    invoke-virtual {v0}, Lokhttp3/h0;->a()Lokhttp3/i0;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
