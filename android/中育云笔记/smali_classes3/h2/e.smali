.class public final Lh2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/StringBuffer;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "toString(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    new-instance v0, Lkotlin/text/Regex;

    .line 11
    .line 12
    const-string v1, "%(?![0-9a-fA-F]{2})"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "%25"

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Lkotlin/text/Regex;->m(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, Lkotlin/text/Regex;

    .line 24
    .line 25
    const-string v1, "\\+"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v1, "%2B"

    .line 31
    .line 32
    invoke-virtual {v0, p1, v1}, Lkotlin/text/Regex;->m(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v0, "utf-8"

    .line 37
    .line 38
    invoke-static {p1, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "decode(...)"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :catch_0
    move-exception v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 50
    .line 51
    .line 52
    return-object p1
.end method

.method public intercept(Lje/s$a;)Lje/y;
    .locals 11

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lje/s$a;->request()Lje/w;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "UTF-8"

    .line 11
    .line 12
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, Lje/w;->g()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "getDefault(...)"

    .line 25
    .line 26
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "toLowerCase(...)"

    .line 34
    .line 35
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Lqd/c0;->e1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0}, Lje/w;->j()Lje/r;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5}, Lje/r;->r()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v5}, Lje/r;->i()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {v5}, Lje/r;->n()I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    invoke-virtual {v5}, Lje/r;->d()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    new-instance v10, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v6, "://"

    .line 75
    .line 76
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v6, ":"

    .line 83
    .line 84
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-static {v6}, Lqd/c0;->e1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    const-string v7, "get"

    .line 106
    .line 107
    invoke-static {v2, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    if-nez v7, :cond_4

    .line 112
    .line 113
    const-string v7, "delete"

    .line 114
    .line 115
    invoke-static {v2, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-eqz v7, :cond_0

    .line 120
    .line 121
    goto/16 :goto_2

    .line 122
    .line 123
    :cond_0
    invoke-virtual {v0}, Lje/w;->a()Lje/x;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    if-eqz v5, :cond_5

    .line 128
    .line 129
    invoke-virtual {v5}, Lje/x;->contentType()Lje/t;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    if-eqz v6, :cond_1

    .line 134
    .line 135
    invoke-virtual {v6, v1}, Lje/t;->c(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v6}, Lje/t;->i()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    invoke-static {v8, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-static {v4, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const-string v3, "multipart"

    .line 158
    .line 159
    invoke-static {v4, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_1

    .line 164
    .line 165
    invoke-interface {p1, v0}, Lje/s$a;->a(Lje/w;)Lje/y;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    return-object p1

    .line 170
    :cond_1
    :try_start_0
    new-instance v3, Lokio/Buffer;

    .line 171
    .line 172
    invoke-direct {v3}, Lokio/Buffer;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v3}, Lje/x;->writeTo(Lokio/BufferedSink;)V

    .line 176
    .line 177
    .line 178
    new-instance v4, Ljava/lang/StringBuffer;

    .line 179
    .line 180
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v1}, Lokio/Buffer;->readString(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-direct {v4, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, v4}, Lh2/e;->a(Ljava/lang/StringBuffer;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-static {}, Lh2/b;->b()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-static {v1, v3}, Lh2/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    sget-object v3, Lje/x;->Companion:Lje/x$a;

    .line 203
    .line 204
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3, v1, v6}, Lje/x$a;->b(Ljava/lang/String;Lje/t;)Lje/x;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-virtual {v0}, Lje/w;->h()Lje/w$a;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    const-string v4, "post"

    .line 216
    .line 217
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-eqz v4, :cond_2

    .line 222
    .line 223
    invoke-virtual {v3, v1}, Lje/w$a;->k(Lje/x;)Lje/w$a;

    .line 224
    .line 225
    .line 226
    goto :goto_0

    .line 227
    :catch_0
    move-exception v1

    .line 228
    goto :goto_1

    .line 229
    :cond_2
    const-string v4, "put"

    .line 230
    .line 231
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-eqz v2, :cond_3

    .line 236
    .line 237
    invoke-virtual {v3, v1}, Lje/w$a;->l(Lje/x;)Lje/w$a;

    .line 238
    .line 239
    .line 240
    :cond_3
    :goto_0
    invoke-virtual {v3}, Lje/w$a;->b()Lje/w;

    .line 241
    .line 242
    .line 243
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 244
    goto :goto_3

    .line 245
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 248
    .line 249
    .line 250
    const-string v3, "\u52a0\u5bc6\u5f02\u5e38====\u300b"

    .line 251
    .line 252
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    const-string v2, "-----"

    .line 263
    .line 264
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 265
    .line 266
    .line 267
    invoke-interface {p1, v0}, Lje/s$a;->a(Lje/w;)Lje/y;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    return-object p1

    .line 272
    :cond_4
    :goto_2
    invoke-virtual {v5}, Lje/r;->f()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    if-eqz v1, :cond_5

    .line 277
    .line 278
    :try_start_1
    invoke-virtual {v0}, Lje/w;->j()Lje/r;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-virtual {v1}, Lje/r;->f()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-static {}, Lh2/b;->b()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    invoke-static {v1, v2}, Lh2/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    new-instance v2, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    const-string v3, "?"

    .line 303
    .line 304
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-virtual {v0}, Lje/w;->h()Lje/w$a;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-virtual {v2, v1}, Lje/w$a;->p(Ljava/lang/String;)Lje/w$a;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-virtual {v1}, Lje/w$a;->b()Lje/w;

    .line 323
    .line 324
    .line 325
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 326
    goto :goto_3

    .line 327
    :catch_1
    move-exception v1

    .line 328
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 329
    .line 330
    .line 331
    invoke-interface {p1, v0}, Lje/s$a;->a(Lje/w;)Lje/y;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    return-object p1

    .line 336
    :cond_5
    :goto_3
    invoke-interface {p1, v0}, Lje/s$a;->a(Lje/w;)Lje/y;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    return-object p1
.end method
