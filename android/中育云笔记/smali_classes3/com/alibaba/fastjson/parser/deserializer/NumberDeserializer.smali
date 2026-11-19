.class public Lcom/alibaba/fastjson/parser/deserializer/NumberDeserializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;


# static fields
.field public static final instance:Lcom/alibaba/fastjson/parser/deserializer/NumberDeserializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson/parser/deserializer/NumberDeserializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson/parser/deserializer/NumberDeserializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/alibaba/fastjson/parser/deserializer/NumberDeserializer;->instance:Lcom/alibaba/fastjson/parser/deserializer/NumberDeserializer;

    .line 7
    .line 8
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
.method public deserialze(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/alibaba/fastjson/parser/DefaultJSONParser;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->lexer:Lcom/alibaba/fastjson/parser/JSONLexer;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->token()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x2

    .line 8
    const-class v3, Ljava/lang/Byte;

    .line 9
    .line 10
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 11
    .line 12
    const-class v5, Ljava/lang/Short;

    .line 13
    .line 14
    sget-object v6, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    const-class v8, Ljava/lang/Double;

    .line 19
    .line 20
    const/16 v9, 0x10

    .line 21
    .line 22
    if-ne v1, v2, :cond_9

    .line 23
    .line 24
    if-eq p2, v7, :cond_8

    .line 25
    .line 26
    if-ne p2, v8, :cond_0

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextToken(I)V

    .line 35
    .line 36
    .line 37
    const-string p1, "short overflow : "

    .line 38
    .line 39
    if-eq p2, v6, :cond_6

    .line 40
    .line 41
    if-ne p2, v5, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    if-eq p2, v4, :cond_4

    .line 45
    .line 46
    if-ne p2, v3, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const-wide/32 p1, -0x80000000

    .line 50
    .line 51
    .line 52
    cmp-long p1, v1, p1

    .line 53
    .line 54
    if-ltz p1, :cond_3

    .line 55
    .line 56
    const-wide/32 p1, 0x7fffffff

    .line 57
    .line 58
    .line 59
    cmp-long p1, v1, p1

    .line 60
    .line 61
    if-gtz p1, :cond_3

    .line 62
    .line 63
    long-to-int p1, v1

    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :cond_3
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_4
    :goto_0
    const-wide/16 p2, 0x7f

    .line 75
    .line 76
    cmp-long p2, v1, p2

    .line 77
    .line 78
    if-gtz p2, :cond_5

    .line 79
    .line 80
    const-wide/16 p2, -0x80

    .line 81
    .line 82
    cmp-long p2, v1, p2

    .line 83
    .line 84
    if-ltz p2, :cond_5

    .line 85
    .line 86
    long-to-int p1, v1

    .line 87
    int-to-byte p1, p1

    .line 88
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :cond_5
    new-instance p2, Lcom/alibaba/fastjson/JSONException;

    .line 94
    .line 95
    new-instance p3, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-direct {p2, p1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p2

    .line 114
    :cond_6
    :goto_1
    const-wide/16 p2, 0x7fff

    .line 115
    .line 116
    cmp-long p2, v1, p2

    .line 117
    .line 118
    if-gtz p2, :cond_7

    .line 119
    .line 120
    const-wide/16 p2, -0x8000

    .line 121
    .line 122
    cmp-long p2, v1, p2

    .line 123
    .line 124
    if-ltz p2, :cond_7

    .line 125
    .line 126
    long-to-int p1, v1

    .line 127
    int-to-short p1, p1

    .line 128
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    return-object p1

    .line 133
    :cond_7
    new-instance p2, Lcom/alibaba/fastjson/JSONException;

    .line 134
    .line 135
    new-instance p3, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-direct {p2, p1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p2

    .line 154
    :cond_8
    :goto_2
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->numberString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextToken(I)V

    .line 159
    .line 160
    .line 161
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 162
    .line 163
    .line 164
    move-result-wide p1

    .line 165
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    return-object p1

    .line 170
    :cond_9
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->token()I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    const/4 v2, 0x3

    .line 175
    if-ne v1, v2, :cond_11

    .line 176
    .line 177
    if-eq p2, v7, :cond_10

    .line 178
    .line 179
    if-ne p2, v8, :cond_a

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_a
    if-eq p2, v6, :cond_f

    .line 183
    .line 184
    if-ne p2, v5, :cond_b

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_b
    if-eq p2, v4, :cond_e

    .line 188
    .line 189
    if-ne p2, v3, :cond_c

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_c
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->decimalValue()Ljava/math/BigDecimal;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextToken(I)V

    .line 197
    .line 198
    .line 199
    sget-object p2, Lcom/alibaba/fastjson/parser/Feature;->UseBigDecimal:Lcom/alibaba/fastjson/parser/Feature;

    .line 200
    .line 201
    invoke-interface {v0, p2}, Lcom/alibaba/fastjson/parser/JSONLexer;->isEnabled(Lcom/alibaba/fastjson/parser/Feature;)Z

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    if-eqz p2, :cond_d

    .line 206
    .line 207
    return-object p1

    .line 208
    :cond_d
    invoke-virtual {p1}, Ljava/math/BigDecimal;->doubleValue()D

    .line 209
    .line 210
    .line 211
    move-result-wide p1

    .line 212
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    return-object p1

    .line 217
    :cond_e
    :goto_3
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->decimalValue()Ljava/math/BigDecimal;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextToken(I)V

    .line 222
    .line 223
    .line 224
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->byteValue(Ljava/math/BigDecimal;)B

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    return-object p1

    .line 233
    :cond_f
    :goto_4
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->decimalValue()Ljava/math/BigDecimal;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextToken(I)V

    .line 238
    .line 239
    .line 240
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->shortValue(Ljava/math/BigDecimal;)S

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    return-object p1

    .line 249
    :cond_10
    :goto_5
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->numberString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextToken(I)V

    .line 254
    .line 255
    .line 256
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 257
    .line 258
    .line 259
    move-result-wide p1

    .line 260
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    return-object p1

    .line 265
    :cond_11
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->token()I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    const/16 v2, 0x12

    .line 270
    .line 271
    const/4 v9, 0x0

    .line 272
    if-ne v1, v2, :cond_14

    .line 273
    .line 274
    const-string v1, "NaN"

    .line 275
    .line 276
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->stringVal()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eqz v1, :cond_14

    .line 285
    .line 286
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextToken()V

    .line 287
    .line 288
    .line 289
    if-ne p2, v8, :cond_12

    .line 290
    .line 291
    const-wide/high16 p1, 0x7ff8000000000000L    # Double.NaN

    .line 292
    .line 293
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    return-object p1

    .line 298
    :cond_12
    const-class p1, Ljava/lang/Float;

    .line 299
    .line 300
    if-ne p2, p1, :cond_13

    .line 301
    .line 302
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 303
    .line 304
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    return-object p1

    .line 309
    :cond_13
    return-object v9

    .line 310
    :cond_14
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->parse()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    if-nez p1, :cond_15

    .line 315
    .line 316
    return-object v9

    .line 317
    :cond_15
    if-eq p2, v7, :cond_1b

    .line 318
    .line 319
    if-ne p2, v8, :cond_16

    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_16
    if-eq p2, v6, :cond_1a

    .line 323
    .line 324
    if-ne p2, v5, :cond_17

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_17
    if-eq p2, v4, :cond_19

    .line 328
    .line 329
    if-ne p2, v3, :cond_18

    .line 330
    .line 331
    goto :goto_6

    .line 332
    :cond_18
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->castToBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    return-object p1

    .line 337
    :cond_19
    :goto_6
    :try_start_0
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->castToByte(Ljava/lang/Object;)Ljava/lang/Byte;

    .line 338
    .line 339
    .line 340
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 341
    return-object p1

    .line 342
    :catch_0
    move-exception p1

    .line 343
    new-instance p2, Lcom/alibaba/fastjson/JSONException;

    .line 344
    .line 345
    new-instance v0, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 348
    .line 349
    .line 350
    const-string v1, "parseByte error, field : "

    .line 351
    .line 352
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p3

    .line 362
    invoke-direct {p2, p3, p1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 363
    .line 364
    .line 365
    throw p2

    .line 366
    :cond_1a
    :goto_7
    :try_start_1
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->castToShort(Ljava/lang/Object;)Ljava/lang/Short;

    .line 367
    .line 368
    .line 369
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 370
    return-object p1

    .line 371
    :catch_1
    move-exception p1

    .line 372
    new-instance p2, Lcom/alibaba/fastjson/JSONException;

    .line 373
    .line 374
    new-instance v0, Ljava/lang/StringBuilder;

    .line 375
    .line 376
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 377
    .line 378
    .line 379
    const-string v1, "parseShort error, field : "

    .line 380
    .line 381
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object p3

    .line 391
    invoke-direct {p2, p3, p1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 392
    .line 393
    .line 394
    throw p2

    .line 395
    :cond_1b
    :goto_8
    :try_start_2
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->castToDouble(Ljava/lang/Object;)Ljava/lang/Double;

    .line 396
    .line 397
    .line 398
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 399
    return-object p1

    .line 400
    :catch_2
    move-exception p1

    .line 401
    new-instance p2, Lcom/alibaba/fastjson/JSONException;

    .line 402
    .line 403
    new-instance v0, Ljava/lang/StringBuilder;

    .line 404
    .line 405
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 406
    .line 407
    .line 408
    const-string v1, "parseDouble error, field : "

    .line 409
    .line 410
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object p3

    .line 420
    invoke-direct {p2, p3, p1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 421
    .line 422
    .line 423
    throw p2
.end method

.method public getFastMatchToken()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
