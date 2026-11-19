.class Lcom/alibaba/fastjson/JSONPath$PropertySegment;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/fastjson/JSONPath$Segment;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson/JSONPath;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PropertySegment"
.end annotation


# instance fields
.field private final deep:Z

.field private final propertyName:Ljava/lang/String;

.field private final propertyNameHash:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyName:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->fnv1a_64(Ljava/lang/String;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyNameHash:J

    .line 11
    .line 12
    iput-boolean p2, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->deep:Z

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic access$100(Lcom/alibaba/fastjson/JSONPath$PropertySegment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->deep:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$400(Lcom/alibaba/fastjson/JSONPath$PropertySegment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public eval(Lcom/alibaba/fastjson/JSONPath;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean p2, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->deep:Z

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance p2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyName:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1, p3, v0, p2}, Lcom/alibaba/fastjson/JSONPath;->deepScan(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    return-object p2

    .line 16
    :cond_0
    iget-object p2, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyName:Ljava/lang/String;

    .line 17
    .line 18
    iget-wide v0, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyNameHash:J

    .line 19
    .line 20
    invoke-virtual {p1, p3, p2, v0, v1}, Lcom/alibaba/fastjson/JSONPath;->getPropertyValue(Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public extract(Lcom/alibaba/fastjson/JSONPath;Lcom/alibaba/fastjson/parser/DefaultJSONParser;Lcom/alibaba/fastjson/JSONPath$Context;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v1, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->lexer:Lcom/alibaba/fastjson/parser/JSONLexer;

    .line 8
    .line 9
    check-cast v3, Lcom/alibaba/fastjson/parser/JSONLexerBase;

    .line 10
    .line 11
    iget-boolean v4, v0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->deep:Z

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    iget-object v4, v2, Lcom/alibaba/fastjson/JSONPath$Context;->object:Ljava/lang/Object;

    .line 16
    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    new-instance v4, Lcom/alibaba/fastjson/JSONArray;

    .line 20
    .line 21
    invoke-direct {v4}, Lcom/alibaba/fastjson/JSONArray;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v4, v2, Lcom/alibaba/fastjson/JSONPath$Context;->object:Ljava/lang/Object;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v5, -0x1

    .line 31
    const/16 v6, 0xe

    .line 32
    .line 33
    const/4 v7, 0x4

    .line 34
    const/4 v8, 0x2

    .line 35
    const/4 v9, 0x3

    .line 36
    const/16 v10, 0x10

    .line 37
    .line 38
    if-ne v4, v6, :cond_f

    .line 39
    .line 40
    const-string v4, "*"

    .line 41
    .line 42
    iget-object v11, v0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyName:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :cond_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    .line 53
    .line 54
    .line 55
    iget-boolean v4, v0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->deep:Z

    .line 56
    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    iget-object v4, v2, Lcom/alibaba/fastjson/JSONPath$Context;->object:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Lcom/alibaba/fastjson/JSONArray;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    new-instance v4, Lcom/alibaba/fastjson/JSONArray;

    .line 65
    .line 66
    invoke-direct {v4}, Lcom/alibaba/fastjson/JSONArray;-><init>()V

    .line 67
    .line 68
    .line 69
    :goto_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    const/16 v12, 0xc

    .line 74
    .line 75
    const/4 v13, 0x0

    .line 76
    if-eq v11, v12, :cond_5

    .line 77
    .line 78
    if-eq v11, v6, :cond_3

    .line 79
    .line 80
    packed-switch v11, :pswitch_data_0

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :pswitch_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    iget-boolean v11, v0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->deep:Z

    .line 89
    .line 90
    if-eqz v11, :cond_4

    .line 91
    .line 92
    invoke-virtual/range {p0 .. p3}, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->extract(Lcom/alibaba/fastjson/JSONPath;Lcom/alibaba/fastjson/parser/DefaultJSONParser;Lcom/alibaba/fastjson/JSONPath$Context;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    invoke-virtual {v3, v13}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipObject(Z)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    iget-boolean v11, v0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->deep:Z

    .line 101
    .line 102
    if-eqz v11, :cond_6

    .line 103
    .line 104
    invoke-virtual/range {p0 .. p3}, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->extract(Lcom/alibaba/fastjson/JSONPath;Lcom/alibaba/fastjson/parser/DefaultJSONParser;Lcom/alibaba/fastjson/JSONPath$Context;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    iget-wide v14, v0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyNameHash:J

    .line 109
    .line 110
    invoke-virtual {v3, v14, v15, v11}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->seekObjectToField(JZ)I

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    if-ne v11, v9, :cond_a

    .line 115
    .line 116
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    if-eq v11, v8, :cond_8

    .line 121
    .line 122
    if-eq v11, v7, :cond_7

    .line 123
    .line 124
    invoke-virtual {v1}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->parse()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    goto :goto_1

    .line 129
    :cond_7
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->stringVal()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_8
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->integerValue()Ljava/lang/Number;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    .line 142
    .line 143
    .line 144
    :goto_1
    invoke-virtual {v4, v11}, Lcom/alibaba/fastjson/JSONArray;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    const/16 v12, 0xd

    .line 152
    .line 153
    if-ne v11, v12, :cond_9

    .line 154
    .line 155
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    .line 156
    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_9
    invoke-virtual {v3, v13}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipObject(Z)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_a
    if-ne v11, v5, :cond_b

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_b
    iget-boolean v11, v0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->deep:Z

    .line 167
    .line 168
    if-nez v11, :cond_e

    .line 169
    .line 170
    invoke-virtual {v3, v13}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->skipObject(Z)V

    .line 171
    .line 172
    .line 173
    :goto_2
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    .line 174
    .line 175
    .line 176
    move-result v11

    .line 177
    const/16 v12, 0xf

    .line 178
    .line 179
    if-ne v11, v12, :cond_c

    .line 180
    .line 181
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    .line 182
    .line 183
    .line 184
    iget-boolean v1, v0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->deep:Z

    .line 185
    .line 186
    if-nez v1, :cond_14

    .line 187
    .line 188
    invoke-virtual {v4}, Lcom/alibaba/fastjson/JSONArray;->size()I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-lez v1, :cond_14

    .line 193
    .line 194
    iput-object v4, v2, Lcom/alibaba/fastjson/JSONPath$Context;->object:Ljava/lang/Object;

    .line 195
    .line 196
    return-void

    .line 197
    :cond_c
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    if-ne v11, v10, :cond_d

    .line 202
    .line 203
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_d
    new-instance v1, Lcom/alibaba/fastjson/JSONException;

    .line 209
    .line 210
    new-instance v2, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const-string v4, "illegal json : "

    .line 216
    .line 217
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->info()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-direct {v1, v2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw v1

    .line 235
    :cond_e
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 236
    .line 237
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->info()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    throw v1

    .line 245
    :cond_f
    iget-boolean v4, v0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->deep:Z

    .line 246
    .line 247
    if-nez v4, :cond_13

    .line 248
    .line 249
    iget-wide v5, v0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyNameHash:J

    .line 250
    .line 251
    invoke-virtual {v3, v5, v6, v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->seekObjectToField(JZ)I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-ne v4, v9, :cond_14

    .line 256
    .line 257
    iget-boolean v4, v2, Lcom/alibaba/fastjson/JSONPath$Context;->eval:Z

    .line 258
    .line 259
    if-eqz v4, :cond_14

    .line 260
    .line 261
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-eq v4, v8, :cond_12

    .line 266
    .line 267
    if-eq v4, v9, :cond_11

    .line 268
    .line 269
    if-eq v4, v7, :cond_10

    .line 270
    .line 271
    invoke-virtual {v1}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->parse()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    goto :goto_3

    .line 276
    :cond_10
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->stringVal()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v3, v10}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    .line 281
    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_11
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->decimalValue()Ljava/math/BigDecimal;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-virtual {v3, v10}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    .line 289
    .line 290
    .line 291
    goto :goto_3

    .line 292
    :cond_12
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->integerValue()Ljava/lang/Number;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-virtual {v3, v10}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    .line 297
    .line 298
    .line 299
    :goto_3
    iget-boolean v3, v2, Lcom/alibaba/fastjson/JSONPath$Context;->eval:Z

    .line 300
    .line 301
    if-eqz v3, :cond_14

    .line 302
    .line 303
    iput-object v1, v2, Lcom/alibaba/fastjson/JSONPath$Context;->object:Ljava/lang/Object;

    .line 304
    .line 305
    return-void

    .line 306
    :cond_13
    :goto_4
    iget-wide v11, v0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyNameHash:J

    .line 307
    .line 308
    iget-boolean v4, v0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->deep:Z

    .line 309
    .line 310
    invoke-virtual {v3, v11, v12, v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->seekObjectToField(JZ)I

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    if-ne v4, v5, :cond_15

    .line 315
    .line 316
    :cond_14
    :goto_5
    return-void

    .line 317
    :cond_15
    if-ne v4, v9, :cond_1b

    .line 318
    .line 319
    iget-boolean v4, v2, Lcom/alibaba/fastjson/JSONPath$Context;->eval:Z

    .line 320
    .line 321
    if-eqz v4, :cond_13

    .line 322
    .line 323
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eq v4, v8, :cond_18

    .line 328
    .line 329
    if-eq v4, v9, :cond_17

    .line 330
    .line 331
    if-eq v4, v7, :cond_16

    .line 332
    .line 333
    invoke-virtual {v1}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->parse()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    goto :goto_6

    .line 338
    :cond_16
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->stringVal()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    invoke-virtual {v3, v10}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    .line 343
    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_17
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->decimalValue()Ljava/math/BigDecimal;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    invoke-virtual {v3, v10}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    .line 351
    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_18
    invoke-virtual {v3}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->integerValue()Ljava/lang/Number;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    invoke-virtual {v3, v10}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    .line 359
    .line 360
    .line 361
    :goto_6
    iget-boolean v6, v2, Lcom/alibaba/fastjson/JSONPath$Context;->eval:Z

    .line 362
    .line 363
    if-eqz v6, :cond_13

    .line 364
    .line 365
    iget-object v6, v2, Lcom/alibaba/fastjson/JSONPath$Context;->object:Ljava/lang/Object;

    .line 366
    .line 367
    instance-of v11, v6, Ljava/util/List;

    .line 368
    .line 369
    if-eqz v11, :cond_1a

    .line 370
    .line 371
    check-cast v6, Ljava/util/List;

    .line 372
    .line 373
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 374
    .line 375
    .line 376
    move-result v11

    .line 377
    if-nez v11, :cond_19

    .line 378
    .line 379
    instance-of v11, v4, Ljava/util/List;

    .line 380
    .line 381
    if-eqz v11, :cond_19

    .line 382
    .line 383
    iput-object v4, v2, Lcom/alibaba/fastjson/JSONPath$Context;->object:Ljava/lang/Object;

    .line 384
    .line 385
    goto :goto_4

    .line 386
    :cond_19
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    goto :goto_4

    .line 390
    :cond_1a
    iput-object v4, v2, Lcom/alibaba/fastjson/JSONPath$Context;->object:Ljava/lang/Object;

    .line 391
    .line 392
    goto :goto_4

    .line 393
    :cond_1b
    const/4 v6, 0x1

    .line 394
    if-eq v4, v6, :cond_1c

    .line 395
    .line 396
    if-ne v4, v8, :cond_13

    .line 397
    .line 398
    :cond_1c
    invoke-virtual/range {p0 .. p3}, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->extract(Lcom/alibaba/fastjson/JSONPath;Lcom/alibaba/fastjson/parser/DefaultJSONParser;Lcom/alibaba/fastjson/JSONPath$Context;)V

    .line 399
    .line 400
    .line 401
    goto :goto_4

    .line 402
    nop

    .line 403
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public remove(Lcom/alibaba/fastjson/JSONPath;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyName:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->deep:Z

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0, v1}, Lcom/alibaba/fastjson/JSONPath;->removePropertyValue(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public setValue(Lcom/alibaba/fastjson/JSONPath;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->deep:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v3, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyName:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v4, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyNameHash:J

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    move-object v2, p2

    .line 11
    move-object v6, p3

    .line 12
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson/JSONPath;->deepSet(Ljava/lang/Object;Ljava/lang/String;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    move-object v1, p1

    .line 17
    move-object v2, p2

    .line 18
    move-object v6, p3

    .line 19
    iget-object v8, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyName:Ljava/lang/String;

    .line 20
    .line 21
    iget-wide v9, p0, Lcom/alibaba/fastjson/JSONPath$PropertySegment;->propertyNameHash:J

    .line 22
    .line 23
    move-object v7, v2

    .line 24
    move-object v11, v6

    .line 25
    move-object v6, v1

    .line 26
    invoke-virtual/range {v6 .. v11}, Lcom/alibaba/fastjson/JSONPath;->setPropertyValue(Ljava/lang/Object;Ljava/lang/String;JLjava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method
