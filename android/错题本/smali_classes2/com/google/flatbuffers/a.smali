.class public final Lcom/google/flatbuffers/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/nio/ByteBuffer;

.field public b:I

.field public c:I

.field public d:[I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:I

.field public i:[I

.field public j:I

.field public k:I

.field public l:Z

.field public final m:Lc8/c;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lc8/c;->a:Lc8/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lc8/c;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lc8/c;->a:Lc8/c;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lc8/c;->a:Lc8/c;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput v1, p0, Lcom/google/flatbuffers/a;->c:I

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-object v1, p0, Lcom/google/flatbuffers/a;->d:[I

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    iput v1, p0, Lcom/google/flatbuffers/a;->e:I

    .line 25
    .line 26
    iput-boolean v1, p0, Lcom/google/flatbuffers/a;->f:Z

    .line 27
    .line 28
    iput-boolean v1, p0, Lcom/google/flatbuffers/a;->g:Z

    .line 29
    .line 30
    const/16 v2, 0x10

    .line 31
    .line 32
    new-array v2, v2, [I

    .line 33
    .line 34
    iput-object v2, p0, Lcom/google/flatbuffers/a;->i:[I

    .line 35
    .line 36
    iput v1, p0, Lcom/google/flatbuffers/a;->j:I

    .line 37
    .line 38
    iput v1, p0, Lcom/google/flatbuffers/a;->k:I

    .line 39
    .line 40
    iput-boolean v1, p0, Lcom/google/flatbuffers/a;->l:Z

    .line 41
    .line 42
    const/16 v1, 0x400

    .line 43
    .line 44
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput-object v1, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    iput-object v0, p0, Lcom/google/flatbuffers/a;->m:Lc8/c;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iput v0, p0, Lcom/google/flatbuffers/a;->b:I

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/flatbuffers/a;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    return-void

    .line 9
    :cond_1
    :goto_0
    const/4 v0, 0x4

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/a;->h(II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/a;->i(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/a;->k(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final b(II)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/flatbuffers/a;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    return-void

    .line 9
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-virtual {p0, v1, v0}, Lcom/google/flatbuffers/a;->h(II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/flatbuffers/a;->g()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    sub-int/2addr v0, p2

    .line 19
    add-int/2addr v0, v1

    .line 20
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/a;->i(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/a;->k(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final c(S)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    invoke-virtual {p0, v1, v0}, Lcom/google/flatbuffers/a;->h(II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    iget v2, p0, Lcom/google/flatbuffers/a;->b:I

    .line 9
    .line 10
    sub-int/2addr v2, v1

    .line 11
    iput v2, p0, Lcom/google/flatbuffers/a;->b:I

    .line 12
    .line 13
    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final d(II)V
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/flatbuffers/a;->g()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne p2, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/a;->k(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 14
    .line 15
    const-string p2, "FlatBuffers: struct must be serialized inline."

    .line 16
    .line 17
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :cond_1
    return-void
.end method

.method public final e(Ljava/lang/CharSequence;)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/flatbuffers/a;->m:Lc8/c;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    const/16 v5, 0x80

    .line 17
    .line 18
    if-ge v4, v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-ge v6, v5, :cond_0

    .line 25
    .line 26
    add-int/lit8 v4, v4, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v6, v2

    .line 30
    :goto_1
    const v7, 0xdfff

    .line 31
    .line 32
    .line 33
    const v8, 0xd800

    .line 34
    .line 35
    .line 36
    const/16 v9, 0x800

    .line 37
    .line 38
    const/4 v10, 0x1

    .line 39
    if-ge v4, v2, :cond_6

    .line 40
    .line 41
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    if-ge v11, v9, :cond_1

    .line 46
    .line 47
    rsub-int/lit8 v7, v11, 0x7f

    .line 48
    .line 49
    ushr-int/lit8 v7, v7, 0x1f

    .line 50
    .line 51
    add-int/2addr v6, v7

    .line 52
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    move v12, v3

    .line 60
    :goto_2
    if-ge v4, v11, :cond_5

    .line 61
    .line 62
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v13

    .line 66
    if-ge v13, v9, :cond_2

    .line 67
    .line 68
    rsub-int/lit8 v13, v13, 0x7f

    .line 69
    .line 70
    ushr-int/lit8 v13, v13, 0x1f

    .line 71
    .line 72
    add-int/2addr v12, v13

    .line 73
    goto :goto_3

    .line 74
    :cond_2
    add-int/lit8 v12, v12, 0x2

    .line 75
    .line 76
    if-gt v8, v13, :cond_4

    .line 77
    .line 78
    if-gt v13, v7, :cond_4

    .line 79
    .line 80
    invoke-static {v1, v4}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    const/high16 v14, 0x10000

    .line 85
    .line 86
    if-lt v13, v14, :cond_3

    .line 87
    .line 88
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    new-instance v1, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;

    .line 92
    .line 93
    invoke-direct {v1, v4, v11}, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;-><init>(II)V

    .line 94
    .line 95
    .line 96
    throw v1

    .line 97
    :cond_4
    :goto_3
    add-int/2addr v4, v10

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    add-int/2addr v6, v12

    .line 100
    :cond_6
    if-lt v6, v2, :cond_1f

    .line 101
    .line 102
    invoke-virtual {v0, v10, v3}, Lcom/google/flatbuffers/a;->h(II)V

    .line 103
    .line 104
    .line 105
    iget-object v2, v0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 106
    .line 107
    iget v4, v0, Lcom/google/flatbuffers/a;->b:I

    .line 108
    .line 109
    sub-int/2addr v4, v10

    .line 110
    iput v4, v0, Lcom/google/flatbuffers/a;->b:I

    .line 111
    .line 112
    invoke-virtual {v2, v4, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 113
    .line 114
    .line 115
    iget-boolean v2, v0, Lcom/google/flatbuffers/a;->f:Z

    .line 116
    .line 117
    if-nez v2, :cond_1e

    .line 118
    .line 119
    iput v6, v0, Lcom/google/flatbuffers/a;->k:I

    .line 120
    .line 121
    const/4 v2, 0x4

    .line 122
    invoke-virtual {v0, v2, v6}, Lcom/google/flatbuffers/a;->h(II)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v10, v6}, Lcom/google/flatbuffers/a;->h(II)V

    .line 126
    .line 127
    .line 128
    iput-boolean v10, v0, Lcom/google/flatbuffers/a;->f:Z

    .line 129
    .line 130
    iget-object v2, v0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 131
    .line 132
    iget v4, v0, Lcom/google/flatbuffers/a;->b:I

    .line 133
    .line 134
    sub-int/2addr v4, v6

    .line 135
    iput v4, v0, Lcom/google/flatbuffers/a;->b:I

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 138
    .line 139
    .line 140
    iget-object v2, v0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    const-string v6, " at index "

    .line 147
    .line 148
    const-string v11, "Failed writing "

    .line 149
    .line 150
    if-eqz v4, :cond_13

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 157
    .line 158
    .line 159
    move-result-object v12

    .line 160
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    add-int/2addr v13, v4

    .line 165
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 166
    .line 167
    .line 168
    move-result v14

    .line 169
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 170
    .line 171
    .line 172
    move-result v15

    .line 173
    add-int/2addr v14, v13

    .line 174
    move/from16 v16, v10

    .line 175
    .line 176
    move v10, v3

    .line 177
    :goto_4
    if-ge v10, v15, :cond_7

    .line 178
    .line 179
    add-int v3, v10, v13

    .line 180
    .line 181
    if-ge v3, v14, :cond_7

    .line 182
    .line 183
    invoke-interface {v1, v10}, Ljava/lang/CharSequence;->charAt(I)C

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    if-ge v7, v5, :cond_7

    .line 188
    .line 189
    int-to-byte v7, v7

    .line 190
    aput-byte v7, v12, v3

    .line 191
    .line 192
    add-int/lit8 v10, v10, 0x1

    .line 193
    .line 194
    const/4 v3, 0x0

    .line 195
    const v7, 0xdfff

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_7
    if-ne v10, v15, :cond_8

    .line 200
    .line 201
    add-int/2addr v13, v15

    .line 202
    goto/16 :goto_7

    .line 203
    .line 204
    :cond_8
    add-int/2addr v13, v10

    .line 205
    :goto_5
    if-ge v10, v15, :cond_12

    .line 206
    .line 207
    invoke-interface {v1, v10}, Ljava/lang/CharSequence;->charAt(I)C

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-ge v3, v5, :cond_9

    .line 212
    .line 213
    if-ge v13, v14, :cond_9

    .line 214
    .line 215
    add-int/lit8 v7, v13, 0x1

    .line 216
    .line 217
    int-to-byte v3, v3

    .line 218
    aput-byte v3, v12, v13

    .line 219
    .line 220
    move v13, v7

    .line 221
    goto/16 :goto_6

    .line 222
    .line 223
    :cond_9
    if-ge v3, v9, :cond_a

    .line 224
    .line 225
    add-int/lit8 v7, v14, -0x2

    .line 226
    .line 227
    if-gt v13, v7, :cond_a

    .line 228
    .line 229
    add-int/lit8 v7, v13, 0x1

    .line 230
    .line 231
    ushr-int/lit8 v9, v3, 0x6

    .line 232
    .line 233
    or-int/lit16 v9, v9, 0x3c0

    .line 234
    .line 235
    int-to-byte v9, v9

    .line 236
    aput-byte v9, v12, v13

    .line 237
    .line 238
    add-int/lit8 v13, v13, 0x2

    .line 239
    .line 240
    and-int/lit8 v3, v3, 0x3f

    .line 241
    .line 242
    or-int/2addr v3, v5

    .line 243
    int-to-byte v3, v3

    .line 244
    aput-byte v3, v12, v7

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_a
    if-lt v3, v8, :cond_b

    .line 248
    .line 249
    const v7, 0xdfff

    .line 250
    .line 251
    .line 252
    if-ge v7, v3, :cond_c

    .line 253
    .line 254
    :cond_b
    add-int/lit8 v7, v14, -0x3

    .line 255
    .line 256
    if-gt v13, v7, :cond_c

    .line 257
    .line 258
    add-int/lit8 v7, v13, 0x1

    .line 259
    .line 260
    ushr-int/lit8 v9, v3, 0xc

    .line 261
    .line 262
    or-int/lit16 v9, v9, 0x1e0

    .line 263
    .line 264
    int-to-byte v9, v9

    .line 265
    aput-byte v9, v12, v13

    .line 266
    .line 267
    add-int/lit8 v9, v13, 0x2

    .line 268
    .line 269
    ushr-int/lit8 v17, v3, 0x6

    .line 270
    .line 271
    and-int/lit8 v8, v17, 0x3f

    .line 272
    .line 273
    or-int/2addr v8, v5

    .line 274
    int-to-byte v8, v8

    .line 275
    aput-byte v8, v12, v7

    .line 276
    .line 277
    add-int/lit8 v13, v13, 0x3

    .line 278
    .line 279
    and-int/lit8 v3, v3, 0x3f

    .line 280
    .line 281
    or-int/2addr v3, v5

    .line 282
    int-to-byte v3, v3

    .line 283
    aput-byte v3, v12, v9

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_c
    add-int/lit8 v7, v14, -0x4

    .line 287
    .line 288
    if-gt v13, v7, :cond_f

    .line 289
    .line 290
    add-int/lit8 v7, v10, 0x1

    .line 291
    .line 292
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 293
    .line 294
    .line 295
    move-result v8

    .line 296
    if-eq v7, v8, :cond_e

    .line 297
    .line 298
    invoke-interface {v1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    invoke-static {v3, v8}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 303
    .line 304
    .line 305
    move-result v9

    .line 306
    if-eqz v9, :cond_d

    .line 307
    .line 308
    invoke-static {v3, v8}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    add-int/lit8 v8, v13, 0x1

    .line 313
    .line 314
    ushr-int/lit8 v9, v3, 0x12

    .line 315
    .line 316
    or-int/lit16 v9, v9, 0xf0

    .line 317
    .line 318
    int-to-byte v9, v9

    .line 319
    aput-byte v9, v12, v13

    .line 320
    .line 321
    add-int/lit8 v9, v13, 0x2

    .line 322
    .line 323
    ushr-int/lit8 v10, v3, 0xc

    .line 324
    .line 325
    and-int/lit8 v10, v10, 0x3f

    .line 326
    .line 327
    or-int/2addr v10, v5

    .line 328
    int-to-byte v10, v10

    .line 329
    aput-byte v10, v12, v8

    .line 330
    .line 331
    add-int/lit8 v8, v13, 0x3

    .line 332
    .line 333
    ushr-int/lit8 v10, v3, 0x6

    .line 334
    .line 335
    and-int/lit8 v10, v10, 0x3f

    .line 336
    .line 337
    or-int/2addr v10, v5

    .line 338
    int-to-byte v10, v10

    .line 339
    aput-byte v10, v12, v9

    .line 340
    .line 341
    add-int/lit8 v13, v13, 0x4

    .line 342
    .line 343
    and-int/lit8 v3, v3, 0x3f

    .line 344
    .line 345
    or-int/2addr v3, v5

    .line 346
    int-to-byte v3, v3

    .line 347
    aput-byte v3, v12, v8

    .line 348
    .line 349
    move v10, v7

    .line 350
    :goto_6
    add-int/lit8 v10, v10, 0x1

    .line 351
    .line 352
    const v8, 0xd800

    .line 353
    .line 354
    .line 355
    const/16 v9, 0x800

    .line 356
    .line 357
    goto/16 :goto_5

    .line 358
    .line 359
    :cond_d
    move v10, v7

    .line 360
    :cond_e
    new-instance v1, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;

    .line 361
    .line 362
    add-int/lit8 v10, v10, -0x1

    .line 363
    .line 364
    invoke-direct {v1, v10, v15}, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;-><init>(II)V

    .line 365
    .line 366
    .line 367
    throw v1

    .line 368
    :cond_f
    const v2, 0xd800

    .line 369
    .line 370
    .line 371
    if-gt v2, v3, :cond_11

    .line 372
    .line 373
    const v7, 0xdfff

    .line 374
    .line 375
    .line 376
    if-gt v3, v7, :cond_11

    .line 377
    .line 378
    add-int/lit8 v2, v10, 0x1

    .line 379
    .line 380
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    if-eq v2, v4, :cond_10

    .line 385
    .line 386
    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    invoke-static {v3, v1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    if-nez v1, :cond_11

    .line 395
    .line 396
    :cond_10
    new-instance v1, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;

    .line 397
    .line 398
    invoke-direct {v1, v10, v15}, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;-><init>(II)V

    .line 399
    .line 400
    .line 401
    throw v1

    .line 402
    :cond_11
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 403
    .line 404
    new-instance v2, Ljava/lang/StringBuilder;

    .line 405
    .line 406
    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-direct {v1, v2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    throw v1

    .line 426
    :cond_12
    :goto_7
    sub-int/2addr v13, v4

    .line 427
    invoke-virtual {v2, v13}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 428
    .line 429
    .line 430
    goto/16 :goto_e

    .line 431
    .line 432
    :cond_13
    move/from16 v16, v10

    .line 433
    .line 434
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    const/4 v7, 0x0

    .line 443
    :goto_8
    if-ge v7, v3, :cond_14

    .line 444
    .line 445
    :try_start_0
    invoke-interface {v1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 446
    .line 447
    .line 448
    move-result v8

    .line 449
    if-ge v8, v5, :cond_14

    .line 450
    .line 451
    add-int v9, v4, v7

    .line 452
    .line 453
    int-to-byte v8, v8

    .line 454
    invoke-virtual {v2, v9, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 455
    .line 456
    .line 457
    add-int/lit8 v7, v7, 0x1

    .line 458
    .line 459
    goto :goto_8

    .line 460
    :cond_14
    if-ne v7, v3, :cond_15

    .line 461
    .line 462
    add-int v3, v4, v7

    .line 463
    .line 464
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 465
    .line 466
    .line 467
    goto/16 :goto_e

    .line 468
    .line 469
    :cond_15
    add-int/2addr v4, v7

    .line 470
    :goto_9
    if-ge v7, v3, :cond_1c

    .line 471
    .line 472
    invoke-interface {v1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 473
    .line 474
    .line 475
    move-result v8

    .line 476
    if-ge v8, v5, :cond_16

    .line 477
    .line 478
    int-to-byte v8, v8

    .line 479
    invoke-virtual {v2, v4, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_5

    .line 480
    .line 481
    .line 482
    const/16 v9, 0x800

    .line 483
    .line 484
    :goto_a
    const v10, 0xd800

    .line 485
    .line 486
    .line 487
    const v12, 0xdfff

    .line 488
    .line 489
    .line 490
    goto/16 :goto_d

    .line 491
    .line 492
    :cond_16
    const/16 v9, 0x800

    .line 493
    .line 494
    if-ge v8, v9, :cond_17

    .line 495
    .line 496
    add-int/lit8 v10, v4, 0x1

    .line 497
    .line 498
    ushr-int/lit8 v12, v8, 0x6

    .line 499
    .line 500
    or-int/lit16 v12, v12, 0xc0

    .line 501
    .line 502
    int-to-byte v12, v12

    .line 503
    :try_start_1
    invoke-virtual {v2, v4, v12}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 504
    .line 505
    .line 506
    and-int/lit8 v4, v8, 0x3f

    .line 507
    .line 508
    or-int/2addr v4, v5

    .line 509
    int-to-byte v4, v4

    .line 510
    invoke-virtual {v2, v10, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 511
    .line 512
    .line 513
    move v4, v10

    .line 514
    goto :goto_a

    .line 515
    :catch_0
    move v4, v10

    .line 516
    goto/16 :goto_f

    .line 517
    .line 518
    :cond_17
    const v10, 0xd800

    .line 519
    .line 520
    .line 521
    const v12, 0xdfff

    .line 522
    .line 523
    .line 524
    if-lt v8, v10, :cond_1b

    .line 525
    .line 526
    if-ge v12, v8, :cond_18

    .line 527
    .line 528
    goto :goto_c

    .line 529
    :cond_18
    add-int/lit8 v13, v7, 0x1

    .line 530
    .line 531
    if-eq v13, v3, :cond_1a

    .line 532
    .line 533
    :try_start_2
    invoke-interface {v1, v13}, Ljava/lang/CharSequence;->charAt(I)C

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    invoke-static {v8, v7}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 538
    .line 539
    .line 540
    move-result v14

    .line 541
    if-eqz v14, :cond_19

    .line 542
    .line 543
    invoke-static {v8, v7}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 544
    .line 545
    .line 546
    move-result v7
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    .line 547
    add-int/lit8 v8, v4, 0x1

    .line 548
    .line 549
    ushr-int/lit8 v14, v7, 0x12

    .line 550
    .line 551
    or-int/lit16 v14, v14, 0xf0

    .line 552
    .line 553
    int-to-byte v14, v14

    .line 554
    :try_start_3
    invoke-virtual {v2, v4, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_3

    .line 555
    .line 556
    .line 557
    add-int/lit8 v14, v4, 0x2

    .line 558
    .line 559
    ushr-int/lit8 v15, v7, 0xc

    .line 560
    .line 561
    and-int/lit8 v15, v15, 0x3f

    .line 562
    .line 563
    or-int/2addr v15, v5

    .line 564
    int-to-byte v15, v15

    .line 565
    :try_start_4
    invoke-virtual {v2, v8, v15}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_2

    .line 566
    .line 567
    .line 568
    add-int/lit8 v4, v4, 0x3

    .line 569
    .line 570
    ushr-int/lit8 v8, v7, 0x6

    .line 571
    .line 572
    and-int/lit8 v8, v8, 0x3f

    .line 573
    .line 574
    or-int/2addr v8, v5

    .line 575
    int-to-byte v8, v8

    .line 576
    :try_start_5
    invoke-virtual {v2, v14, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 577
    .line 578
    .line 579
    and-int/lit8 v7, v7, 0x3f

    .line 580
    .line 581
    or-int/2addr v7, v5

    .line 582
    int-to-byte v7, v7

    .line 583
    invoke-virtual {v2, v4, v7}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_1

    .line 584
    .line 585
    .line 586
    move v7, v13

    .line 587
    goto :goto_d

    .line 588
    :catch_1
    :goto_b
    move v7, v13

    .line 589
    goto :goto_f

    .line 590
    :catch_2
    move v7, v13

    .line 591
    move v4, v14

    .line 592
    goto :goto_f

    .line 593
    :catch_3
    move v4, v8

    .line 594
    goto :goto_b

    .line 595
    :cond_19
    move v7, v13

    .line 596
    :cond_1a
    :try_start_6
    new-instance v5, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;

    .line 597
    .line 598
    invoke-direct {v5, v7, v3}, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;-><init>(II)V

    .line 599
    .line 600
    .line 601
    throw v5
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_5

    .line 602
    :cond_1b
    :goto_c
    add-int/lit8 v13, v4, 0x1

    .line 603
    .line 604
    ushr-int/lit8 v14, v8, 0xc

    .line 605
    .line 606
    or-int/lit16 v14, v14, 0xe0

    .line 607
    .line 608
    int-to-byte v14, v14

    .line 609
    :try_start_7
    invoke-virtual {v2, v4, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_7
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_4

    .line 610
    .line 611
    .line 612
    add-int/lit8 v4, v4, 0x2

    .line 613
    .line 614
    ushr-int/lit8 v14, v8, 0x6

    .line 615
    .line 616
    and-int/lit8 v14, v14, 0x3f

    .line 617
    .line 618
    or-int/2addr v14, v5

    .line 619
    int-to-byte v14, v14

    .line 620
    :try_start_8
    invoke-virtual {v2, v13, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 621
    .line 622
    .line 623
    and-int/lit8 v8, v8, 0x3f

    .line 624
    .line 625
    or-int/2addr v8, v5

    .line 626
    int-to-byte v8, v8

    .line 627
    invoke-virtual {v2, v4, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 628
    .line 629
    .line 630
    :goto_d
    add-int/lit8 v7, v7, 0x1

    .line 631
    .line 632
    add-int/lit8 v4, v4, 0x1

    .line 633
    .line 634
    goto/16 :goto_9

    .line 635
    .line 636
    :catch_4
    move v4, v13

    .line 637
    goto :goto_f

    .line 638
    :cond_1c
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_8
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_5

    .line 639
    .line 640
    .line 641
    :goto_e
    iget-boolean v1, v0, Lcom/google/flatbuffers/a;->f:Z

    .line 642
    .line 643
    if-eqz v1, :cond_1d

    .line 644
    .line 645
    const/4 v1, 0x0

    .line 646
    iput-boolean v1, v0, Lcom/google/flatbuffers/a;->f:Z

    .line 647
    .line 648
    iget v1, v0, Lcom/google/flatbuffers/a;->k:I

    .line 649
    .line 650
    invoke-virtual {v0, v1}, Lcom/google/flatbuffers/a;->i(I)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v0}, Lcom/google/flatbuffers/a;->g()I

    .line 654
    .line 655
    .line 656
    move-result v1

    .line 657
    return v1

    .line 658
    :cond_1d
    new-instance v1, Ljava/lang/AssertionError;

    .line 659
    .line 660
    const-string v2, "FlatBuffers: endVector called without startVector"

    .line 661
    .line 662
    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    throw v1

    .line 666
    :catch_5
    :goto_f
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 667
    .line 668
    .line 669
    move-result v3

    .line 670
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 671
    .line 672
    .line 673
    move-result v2

    .line 674
    sub-int/2addr v4, v2

    .line 675
    add-int/lit8 v4, v4, 0x1

    .line 676
    .line 677
    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    .line 678
    .line 679
    .line 680
    move-result v2

    .line 681
    add-int/2addr v2, v3

    .line 682
    new-instance v3, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 683
    .line 684
    new-instance v4, Ljava/lang/StringBuilder;

    .line 685
    .line 686
    invoke-direct {v4, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    invoke-interface {v1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 690
    .line 691
    .line 692
    move-result v1

    .line 693
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    invoke-direct {v3, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    throw v3

    .line 710
    :cond_1e
    new-instance v1, Ljava/lang/AssertionError;

    .line 711
    .line 712
    const-string v2, "FlatBuffers: object serialization must not be nested."

    .line 713
    .line 714
    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    throw v1

    .line 718
    :cond_1f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 719
    .line 720
    new-instance v2, Ljava/lang/StringBuilder;

    .line 721
    .line 722
    const-string v3, "UTF-8 length does not fit in int: "

    .line 723
    .line 724
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    int-to-long v3, v6

    .line 728
    const-wide v5, 0x100000000L

    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    add-long/2addr v3, v5

    .line 734
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    throw v1
.end method

.method public final f()I
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/flatbuffers/a;->d:[I

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/flatbuffers/a;->f:Z

    .line 6
    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/a;->h(II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/a;->i(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/flatbuffers/a;->g()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget v2, p0, Lcom/google/flatbuffers/a;->e:I

    .line 22
    .line 23
    add-int/lit8 v2, v2, -0x1

    .line 24
    .line 25
    :goto_0
    if-ltz v2, :cond_0

    .line 26
    .line 27
    iget-object v3, p0, Lcom/google/flatbuffers/a;->d:[I

    .line 28
    .line 29
    aget v3, v3, v2

    .line 30
    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    add-int/lit8 v2, v2, -0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v3, v2

    .line 37
    :goto_1
    if-ltz v3, :cond_2

    .line 38
    .line 39
    iget-object v4, p0, Lcom/google/flatbuffers/a;->d:[I

    .line 40
    .line 41
    aget v4, v4, v3

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    sub-int v4, v0, v4

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    move v4, v1

    .line 49
    :goto_2
    int-to-short v4, v4

    .line 50
    invoke-virtual {p0, v4}, Lcom/google/flatbuffers/a;->c(S)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v3, v3, -0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget v3, p0, Lcom/google/flatbuffers/a;->h:I

    .line 57
    .line 58
    sub-int v3, v0, v3

    .line 59
    .line 60
    int-to-short v3, v3

    .line 61
    invoke-virtual {p0, v3}, Lcom/google/flatbuffers/a;->c(S)V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v2, v2, 0x3

    .line 65
    .line 66
    const/4 v3, 0x2

    .line 67
    mul-int/2addr v2, v3

    .line 68
    int-to-short v2, v2

    .line 69
    invoke-virtual {p0, v2}, Lcom/google/flatbuffers/a;->c(S)V

    .line 70
    .line 71
    .line 72
    move v2, v1

    .line 73
    :goto_3
    iget v4, p0, Lcom/google/flatbuffers/a;->j:I

    .line 74
    .line 75
    if-ge v2, v4, :cond_6

    .line 76
    .line 77
    iget-object v4, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    iget-object v5, p0, Lcom/google/flatbuffers/a;->i:[I

    .line 84
    .line 85
    aget v5, v5, v2

    .line 86
    .line 87
    sub-int/2addr v4, v5

    .line 88
    iget v5, p0, Lcom/google/flatbuffers/a;->b:I

    .line 89
    .line 90
    iget-object v6, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    iget-object v7, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 97
    .line 98
    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-ne v6, v7, :cond_5

    .line 103
    .line 104
    move v7, v3

    .line 105
    :goto_4
    if-ge v7, v6, :cond_4

    .line 106
    .line 107
    iget-object v8, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    add-int v9, v4, v7

    .line 110
    .line 111
    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    iget-object v9, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 116
    .line 117
    add-int v10, v5, v7

    .line 118
    .line 119
    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    if-eq v8, v9, :cond_3

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_3
    add-int/lit8 v7, v7, 0x2

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_4
    iget-object v4, p0, Lcom/google/flatbuffers/a;->i:[I

    .line 130
    .line 131
    aget v2, v4, v2

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_5
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    move v2, v1

    .line 138
    :goto_6
    if-eqz v2, :cond_7

    .line 139
    .line 140
    iget-object v3, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    sub-int/2addr v3, v0

    .line 147
    iput v3, p0, Lcom/google/flatbuffers/a;->b:I

    .line 148
    .line 149
    iget-object v4, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 150
    .line 151
    sub-int/2addr v2, v0

    .line 152
    invoke-virtual {v4, v3, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 153
    .line 154
    .line 155
    goto :goto_7

    .line 156
    :cond_7
    iget v2, p0, Lcom/google/flatbuffers/a;->j:I

    .line 157
    .line 158
    iget-object v4, p0, Lcom/google/flatbuffers/a;->i:[I

    .line 159
    .line 160
    array-length v5, v4

    .line 161
    if-ne v2, v5, :cond_8

    .line 162
    .line 163
    mul-int/2addr v2, v3

    .line 164
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([II)[I

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    iput-object v2, p0, Lcom/google/flatbuffers/a;->i:[I

    .line 169
    .line 170
    :cond_8
    iget-object v2, p0, Lcom/google/flatbuffers/a;->i:[I

    .line 171
    .line 172
    iget v3, p0, Lcom/google/flatbuffers/a;->j:I

    .line 173
    .line 174
    add-int/lit8 v4, v3, 0x1

    .line 175
    .line 176
    iput v4, p0, Lcom/google/flatbuffers/a;->j:I

    .line 177
    .line 178
    invoke-virtual {p0}, Lcom/google/flatbuffers/a;->g()I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    aput v4, v2, v3

    .line 183
    .line 184
    iget-object v2, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    sub-int/2addr v3, v0

    .line 191
    invoke-virtual {p0}, Lcom/google/flatbuffers/a;->g()I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    sub-int/2addr v4, v0

    .line 196
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 197
    .line 198
    .line 199
    :goto_7
    iput-boolean v1, p0, Lcom/google/flatbuffers/a;->f:Z

    .line 200
    .line 201
    return v0

    .line 202
    :cond_9
    new-instance v0, Ljava/lang/AssertionError;

    .line 203
    .line 204
    const-string v1, "FlatBuffers: endTable called without startTable"

    .line 205
    .line 206
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    throw v0
.end method

.method public final g()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/google/flatbuffers/a;->b:I

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    return v0
.end method

.method public final h(II)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/google/flatbuffers/a;->c:I

    .line 2
    .line 3
    if-le p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/flatbuffers/a;->c:I

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lcom/google/flatbuffers/a;->b:I

    .line 14
    .line 15
    sub-int/2addr v0, v1

    .line 16
    add-int/2addr v0, p2

    .line 17
    not-int v0, v0

    .line 18
    const/4 v1, 0x1

    .line 19
    add-int/2addr v0, v1

    .line 20
    add-int/lit8 v2, p1, -0x1

    .line 21
    .line 22
    and-int/2addr v0, v2

    .line 23
    :goto_0
    iget v2, p0, Lcom/google/flatbuffers/a;->b:I

    .line 24
    .line 25
    add-int v3, v0, p1

    .line 26
    .line 27
    add-int/2addr v3, p2

    .line 28
    const/4 v4, 0x0

    .line 29
    if-ge v2, v3, :cond_3

    .line 30
    .line 31
    iget-object v2, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget-object v3, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    const/high16 v6, -0x40000000    # -2.0f

    .line 44
    .line 45
    and-int/2addr v6, v5

    .line 46
    if-nez v6, :cond_2

    .line 47
    .line 48
    if-nez v5, :cond_1

    .line 49
    .line 50
    move v6, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    shl-int/lit8 v6, v5, 0x1

    .line 53
    .line 54
    :goto_1
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 55
    .line 56
    .line 57
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 62
    .line 63
    invoke-virtual {v4, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v6}, Ljava/nio/Buffer;->capacity()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    sub-int/2addr v6, v5

    .line 76
    invoke-virtual {v4, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    .line 82
    iput-object v4, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    iget v3, p0, Lcom/google/flatbuffers/a;->b:I

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    sub-int/2addr v4, v2

    .line 91
    add-int/2addr v4, v3

    .line 92
    iput v4, p0, Lcom/google/flatbuffers/a;->b:I

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 96
    .line 97
    const-string p2, "FlatBuffers: cannot grow buffer beyond 2 gigabytes."

    .line 98
    .line 99
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_3
    move p1, v4

    .line 104
    :goto_2
    if-ge p1, v0, :cond_4

    .line 105
    .line 106
    iget-object p2, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 107
    .line 108
    iget v2, p0, Lcom/google/flatbuffers/a;->b:I

    .line 109
    .line 110
    sub-int/2addr v2, v1

    .line 111
    iput v2, p0, Lcom/google/flatbuffers/a;->b:I

    .line 112
    .line 113
    invoke-virtual {p2, v2, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 114
    .line 115
    .line 116
    add-int/lit8 p1, p1, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    return-void
.end method

.method public final i(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/flatbuffers/a;->b:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x4

    .line 6
    .line 7
    iput v1, p0, Lcom/google/flatbuffers/a;->b:I

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final j()[B
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/flatbuffers/a;->b:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, Lcom/google/flatbuffers/a;->b:I

    .line 10
    .line 11
    sub-int/2addr v1, v2

    .line 12
    iget-boolean v2, p0, Lcom/google/flatbuffers/a;->g:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    new-array v1, v1, [B

    .line 17
    .line 18
    iget-object v2, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 30
    .line 31
    const-string v1, "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method

.method public final k(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/flatbuffers/a;->d:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/flatbuffers/a;->g()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aput v1, v0, p1

    .line 8
    .line 9
    return-void
.end method

.method public final l(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/flatbuffers/a;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/flatbuffers/a;->d:[I

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    if-ge v0, p1, :cond_1

    .line 11
    .line 12
    :cond_0
    new-array v0, p1, [I

    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/flatbuffers/a;->d:[I

    .line 15
    .line 16
    :cond_1
    iput p1, p0, Lcom/google/flatbuffers/a;->e:I

    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/flatbuffers/a;->d:[I

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v0, v1, p1, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lcom/google/flatbuffers/a;->f:Z

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/google/flatbuffers/a;->g()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, Lcom/google/flatbuffers/a;->h:I

    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 35
    .line 36
    const-string v0, "FlatBuffers: object serialization must not be nested."

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method
