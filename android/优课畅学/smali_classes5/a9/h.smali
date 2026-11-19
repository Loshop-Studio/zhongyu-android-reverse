.class public La9/h;
.super La9/b;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La9/h;->a:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, La9/b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(Lz8/c;Landroid/graphics/Canvas;FFZLa9/a$a;)V
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v7, p5

    .line 4
    .line 5
    move-object/from16 v8, p6

    .line 6
    .line 7
    iget v0, v1, Lz8/c;->m:I

    .line 8
    .line 9
    int-to-float v2, v0

    .line 10
    add-float v2, p3, v2

    .line 11
    .line 12
    int-to-float v0, v0

    .line 13
    add-float v0, p4, v0

    .line 14
    .line 15
    iget v3, v1, Lz8/c;->l:I

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    const/high16 v3, 0x40800000    # 4.0f

    .line 20
    .line 21
    add-float/2addr v2, v3

    .line 22
    add-float/2addr v0, v3

    .line 23
    :cond_0
    move v9, v0

    .line 24
    move v10, v2

    .line 25
    invoke-virtual {v8, v7}, La9/a$a;->e(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v8, v1, v7}, La9/a$a;->g(Lz8/c;Z)Landroid/text/TextPaint;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual/range {p0 .. p4}, La9/h;->f(Lz8/c;Landroid/graphics/Canvas;FF)V

    .line 33
    .line 34
    .line 35
    iget-object v11, v1, Lz8/c;->d:[Ljava/lang/String;

    .line 36
    .line 37
    const/4 v12, 0x1

    .line 38
    const/4 v13, 0x0

    .line 39
    if-eqz v11, :cond_9

    .line 40
    .line 41
    array-length v0, v11

    .line 42
    if-ne v0, v12, :cond_3

    .line 43
    .line 44
    invoke-virtual {v8, v1}, La9/a$a;->j(Lz8/c;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {v8, v1, v6, v12}, La9/a$a;->c(Lz8/c;Landroid/graphics/Paint;Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6}, Landroid/graphics/Paint;->ascent()F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    sub-float v0, v9, v0

    .line 58
    .line 59
    iget-boolean v2, v8, La9/a$a;->s:Z

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    iget v2, v8, La9/a$a;->k:F

    .line 64
    .line 65
    add-float/2addr v2, v10

    .line 66
    iget v3, v8, La9/a$a;->l:F

    .line 67
    .line 68
    add-float/2addr v0, v3

    .line 69
    move v4, v2

    .line 70
    :goto_0
    move v5, v0

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move v4, v10

    .line 73
    goto :goto_0

    .line 74
    :goto_1
    aget-object v2, v11, v13

    .line 75
    .line 76
    move-object/from16 v0, p0

    .line 77
    .line 78
    move-object/from16 v3, p2

    .line 79
    .line 80
    invoke-virtual/range {v0 .. v6}, La9/h;->g(Lz8/c;Ljava/lang/String;Landroid/graphics/Canvas;FFLandroid/graphics/Paint;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-virtual {v8, v1, v6, v13}, La9/a$a;->c(Lz8/c;Landroid/graphics/Paint;Z)V

    .line 84
    .line 85
    .line 86
    aget-object v2, v11, v13

    .line 87
    .line 88
    invoke-virtual {v6}, Landroid/graphics/Paint;->ascent()F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    sub-float v5, v9, v0

    .line 93
    .line 94
    move-object/from16 v0, p0

    .line 95
    .line 96
    move-object/from16 v3, p2

    .line 97
    .line 98
    move v4, v10

    .line 99
    invoke-virtual/range {v0 .. v7}, La9/h;->h(Lz8/c;Ljava/lang/String;Landroid/graphics/Canvas;FFLandroid/text/TextPaint;Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_3
    iget v0, v1, Lz8/c;->p:F

    .line 104
    .line 105
    iget v2, v1, Lz8/c;->m:I

    .line 106
    .line 107
    mul-int/lit8 v2, v2, 0x2

    .line 108
    .line 109
    int-to-float v2, v2

    .line 110
    sub-float/2addr v0, v2

    .line 111
    array-length v2, v11

    .line 112
    int-to-float v2, v2

    .line 113
    div-float v14, v0, v2

    .line 114
    .line 115
    move v15, v13

    .line 116
    :goto_2
    array-length v0, v11

    .line 117
    if-ge v15, v0, :cond_8

    .line 118
    .line 119
    aget-object v0, v11, v15

    .line 120
    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_4

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_4
    invoke-virtual {v8, v1}, La9/a$a;->j(Lz8/c;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_6

    .line 135
    .line 136
    invoke-virtual {v8, v1, v6, v12}, La9/a$a;->c(Lz8/c;Landroid/graphics/Paint;Z)V

    .line 137
    .line 138
    .line 139
    int-to-float v0, v15

    .line 140
    mul-float/2addr v0, v14

    .line 141
    add-float/2addr v0, v9

    .line 142
    invoke-virtual {v6}, Landroid/graphics/Paint;->ascent()F

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    sub-float/2addr v0, v2

    .line 147
    iget-boolean v2, v8, La9/a$a;->s:Z

    .line 148
    .line 149
    if-eqz v2, :cond_5

    .line 150
    .line 151
    iget v2, v8, La9/a$a;->k:F

    .line 152
    .line 153
    add-float/2addr v2, v10

    .line 154
    iget v3, v8, La9/a$a;->l:F

    .line 155
    .line 156
    add-float/2addr v0, v3

    .line 157
    move v4, v2

    .line 158
    :goto_3
    move v5, v0

    .line 159
    goto :goto_4

    .line 160
    :cond_5
    move v4, v10

    .line 161
    goto :goto_3

    .line 162
    :goto_4
    aget-object v2, v11, v15

    .line 163
    .line 164
    move-object/from16 v0, p0

    .line 165
    .line 166
    move-object/from16 v3, p2

    .line 167
    .line 168
    invoke-virtual/range {v0 .. v6}, La9/h;->g(Lz8/c;Ljava/lang/String;Landroid/graphics/Canvas;FFLandroid/graphics/Paint;)V

    .line 169
    .line 170
    .line 171
    :cond_6
    invoke-virtual {v8, v1, v6, v13}, La9/a$a;->c(Lz8/c;Landroid/graphics/Paint;Z)V

    .line 172
    .line 173
    .line 174
    aget-object v2, v11, v15

    .line 175
    .line 176
    int-to-float v0, v15

    .line 177
    mul-float/2addr v0, v14

    .line 178
    add-float/2addr v0, v9

    .line 179
    invoke-virtual {v6}, Landroid/graphics/Paint;->ascent()F

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    sub-float v5, v0, v3

    .line 184
    .line 185
    move-object/from16 v0, p0

    .line 186
    .line 187
    move-object/from16 v3, p2

    .line 188
    .line 189
    move/from16 v7, p5

    .line 190
    .line 191
    move v4, v10

    .line 192
    invoke-virtual/range {v0 .. v7}, La9/h;->h(Lz8/c;Ljava/lang/String;Landroid/graphics/Canvas;FFLandroid/text/TextPaint;Z)V

    .line 193
    .line 194
    .line 195
    :cond_7
    :goto_5
    add-int/lit8 v15, v15, 0x1

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_8
    :goto_6
    move-object v6, v1

    .line 199
    goto :goto_9

    .line 200
    :cond_9
    invoke-virtual {v8, v1}, La9/a$a;->j(Lz8/c;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_b

    .line 205
    .line 206
    invoke-virtual {v8, v1, v6, v12}, La9/a$a;->c(Lz8/c;Landroid/graphics/Paint;Z)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v6}, Landroid/graphics/Paint;->ascent()F

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    sub-float v0, v9, v0

    .line 214
    .line 215
    iget-boolean v2, v8, La9/a$a;->s:Z

    .line 216
    .line 217
    if-eqz v2, :cond_a

    .line 218
    .line 219
    iget v2, v8, La9/a$a;->k:F

    .line 220
    .line 221
    add-float/2addr v2, v10

    .line 222
    iget v3, v8, La9/a$a;->l:F

    .line 223
    .line 224
    add-float/2addr v0, v3

    .line 225
    move v4, v2

    .line 226
    :goto_7
    move v5, v0

    .line 227
    goto :goto_8

    .line 228
    :cond_a
    move v4, v10

    .line 229
    goto :goto_7

    .line 230
    :goto_8
    const/4 v2, 0x0

    .line 231
    move-object/from16 v0, p0

    .line 232
    .line 233
    move-object/from16 v3, p2

    .line 234
    .line 235
    invoke-virtual/range {v0 .. v6}, La9/h;->g(Lz8/c;Ljava/lang/String;Landroid/graphics/Canvas;FFLandroid/graphics/Paint;)V

    .line 236
    .line 237
    .line 238
    :cond_b
    invoke-virtual {v8, v1, v6, v13}, La9/a$a;->c(Lz8/c;Landroid/graphics/Paint;Z)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6}, Landroid/graphics/Paint;->ascent()F

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    sub-float v5, v9, v0

    .line 246
    .line 247
    const/4 v2, 0x0

    .line 248
    move-object/from16 v0, p0

    .line 249
    .line 250
    move-object/from16 v3, p2

    .line 251
    .line 252
    move/from16 v7, p5

    .line 253
    .line 254
    move v4, v10

    .line 255
    invoke-virtual/range {v0 .. v7}, La9/h;->h(Lz8/c;Ljava/lang/String;Landroid/graphics/Canvas;FFLandroid/text/TextPaint;Z)V

    .line 256
    .line 257
    .line 258
    goto :goto_6

    .line 259
    :goto_9
    iget v0, v6, Lz8/c;->j:I

    .line 260
    .line 261
    if-eqz v0, :cond_c

    .line 262
    .line 263
    invoke-virtual {v8, v6}, La9/a$a;->i(Lz8/c;)Landroid/graphics/Paint;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    iget v0, v6, Lz8/c;->p:F

    .line 268
    .line 269
    add-float v0, p4, v0

    .line 270
    .line 271
    iget v1, v8, La9/a$a;->h:I

    .line 272
    .line 273
    int-to-float v1, v1

    .line 274
    sub-float v2, v0, v1

    .line 275
    .line 276
    iget v0, v6, Lz8/c;->o:F

    .line 277
    .line 278
    add-float v3, p3, v0

    .line 279
    .line 280
    move v4, v2

    .line 281
    move-object/from16 v0, p2

    .line 282
    .line 283
    move/from16 v1, p3

    .line 284
    .line 285
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 286
    .line 287
    .line 288
    :cond_c
    iget v0, v6, Lz8/c;->l:I

    .line 289
    .line 290
    if-eqz v0, :cond_d

    .line 291
    .line 292
    invoke-virtual {v8, v6}, La9/a$a;->f(Lz8/c;)Landroid/graphics/Paint;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    iget v0, v6, Lz8/c;->o:F

    .line 297
    .line 298
    add-float v3, p3, v0

    .line 299
    .line 300
    iget v0, v6, Lz8/c;->p:F

    .line 301
    .line 302
    add-float v4, p4, v0

    .line 303
    .line 304
    move-object/from16 v0, p2

    .line 305
    .line 306
    move/from16 v1, p3

    .line 307
    .line 308
    move/from16 v2, p4

    .line 309
    .line 310
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 311
    .line 312
    .line 313
    :cond_d
    return-void
.end method

.method public c(Lz8/c;Landroid/text/TextPaint;Z)V
    .locals 6

    .line 1
    const/4 p3, 0x0

    .line 2
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, p1, Lz8/c;->d:[Ljava/lang/String;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p1, Lz8/c;->c:Ljava/lang/CharSequence;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    invoke-virtual {p0, p1, p2}, La9/h;->i(Lz8/c;Landroid/graphics/Paint;)Ljava/lang/Float;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    iput p3, p1, Lz8/c;->o:F

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iput p2, p1, Lz8/c;->p:F

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    invoke-virtual {p0, p1, p2}, La9/h;->i(Lz8/c;Landroid/graphics/Paint;)Ljava/lang/Float;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v1, p1, Lz8/c;->d:[Ljava/lang/String;

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    const/4 v3, 0x0

    .line 44
    :goto_1
    if-ge v3, v2, :cond_3

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-lez v5, :cond_2

    .line 53
    .line 54
    invoke-virtual {p2, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-static {v4, p3}, Ljava/lang/Math;->max(FF)F

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    iput p3, p1, Lz8/c;->o:F

    .line 66
    .line 67
    iget-object p2, p1, Lz8/c;->d:[Ljava/lang/String;

    .line 68
    .line 69
    array-length p2, p2

    .line 70
    int-to-float p2, p2

    .line 71
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    mul-float/2addr p2, p3

    .line 76
    iput p2, p1, Lz8/c;->p:F

    .line 77
    .line 78
    return-void
.end method

.method public f(Lz8/c;Landroid/graphics/Canvas;FF)V
    .locals 0

    .line 1
    return-void
.end method

.method public g(Lz8/c;Ljava/lang/String;Landroid/graphics/Canvas;FFLandroid/graphics/Paint;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p3, p2, p4, p5, p6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object p1, p1, Lz8/c;->c:Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p3, p1, p4, p5, p6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public h(Lz8/c;Ljava/lang/String;Landroid/graphics/Canvas;FFLandroid/text/TextPaint;Z)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p3, p2, p4, p5, p6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object p1, p1, Lz8/c;->c:Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p3, p1, p4, p5, p6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public i(Lz8/c;Landroid/graphics/Paint;)Ljava/lang/Float;
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Paint;->getTextSize()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, La9/h;->a:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Float;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget v1, p2, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 24
    .line 25
    iget v2, p2, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 26
    .line 27
    sub-float/2addr v1, v2

    .line 28
    iget p2, p2, Landroid/graphics/Paint$FontMetrics;->leading:F

    .line 29
    .line 30
    add-float/2addr v1, p2

    .line 31
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-object p2

    .line 39
    :cond_0
    return-object v1
.end method
