.class public Le9/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/b$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:La9/d;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, La9/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La9/d;-><init>(I)V

    iput-object v0, p0, Le9/b$c;->a:La9/d;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Le9/b$c;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(Le9/b$a;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Le9/b$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lz8/c;Lz8/m;Le9/b$f;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    invoke-virtual {v2}, Lz8/c;->s()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_f

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v2}, Lz8/c;->v()Z

    .line 16
    .line 17
    .line 18
    move-result v9

    .line 19
    const/4 v10, 0x1

    .line 20
    const/4 v11, 0x0

    .line 21
    if-nez v9, :cond_1

    .line 22
    .line 23
    iget-object v1, v0, Le9/b$c;->a:La9/d;

    .line 24
    .line 25
    invoke-virtual {v1}, La9/d;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    move v1, v10

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v1, v11

    .line 34
    :goto_0
    const/4 v12, 0x0

    .line 35
    const/4 v13, 0x0

    .line 36
    if-nez v9, :cond_13

    .line 37
    .line 38
    iput-boolean v11, v0, Le9/b$c;->b:Z

    .line 39
    .line 40
    iget-object v3, v0, Le9/b$c;->a:La9/d;

    .line 41
    .line 42
    invoke-virtual {v3}, La9/d;->iterator()Lz8/k;

    .line 43
    .line 44
    .line 45
    move-result-object v14

    .line 46
    move v3, v11

    .line 47
    move-object v4, v13

    .line 48
    move-object v5, v4

    .line 49
    move-object v15, v5

    .line 50
    :goto_1
    iget-boolean v6, v0, Le9/b$c;->b:Z

    .line 51
    .line 52
    if-nez v6, :cond_8

    .line 53
    .line 54
    invoke-interface {v14}, Lz8/k;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_8

    .line 59
    .line 60
    add-int/lit8 v16, v3, 0x1

    .line 61
    .line 62
    invoke-interface {v14}, Lz8/k;->next()Lz8/c;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-ne v3, v2, :cond_2

    .line 67
    .line 68
    move-object v6, v2

    .line 69
    move-object/from16 v18, v5

    .line 70
    .line 71
    move v9, v10

    .line 72
    move v1, v11

    .line 73
    move v2, v1

    .line 74
    move-object v15, v13

    .line 75
    :goto_2
    move-object v5, v4

    .line 76
    goto/16 :goto_7

    .line 77
    .line 78
    :cond_2
    if-nez v4, :cond_3

    .line 79
    .line 80
    move-object/from16 v17, v3

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    move-object/from16 v17, v4

    .line 84
    .line 85
    :goto_3
    iget v4, v2, Lz8/c;->p:F

    .line 86
    .line 87
    invoke-virtual {v3}, Lz8/c;->l()F

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    add-float/2addr v4, v6

    .line 92
    invoke-interface/range {p2 .. p2}, Lz8/m;->getHeight()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    int-to-float v6, v6

    .line 97
    cmpl-float v4, v4, v6

    .line 98
    .line 99
    if-lez v4, :cond_4

    .line 100
    .line 101
    move-object v6, v2

    .line 102
    move-object/from16 v18, v5

    .line 103
    .line 104
    move v2, v10

    .line 105
    move-object v3, v13

    .line 106
    :goto_4
    move-object/from16 v5, v17

    .line 107
    .line 108
    goto :goto_7

    .line 109
    :cond_4
    if-nez v5, :cond_5

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_5
    invoke-virtual {v5}, Lz8/c;->i()F

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    invoke-virtual {v3}, Lz8/c;->i()F

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    cmpl-float v1, v1, v4

    .line 121
    .line 122
    if-ltz v1, :cond_6

    .line 123
    .line 124
    :goto_5
    move-object/from16 v18, v3

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_6
    move-object/from16 v18, v5

    .line 128
    .line 129
    :goto_6
    invoke-virtual {v2}, Lz8/c;->f()J

    .line 130
    .line 131
    .line 132
    move-result-wide v4

    .line 133
    invoke-virtual {v2}, Lz8/c;->k()Lz8/e;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-wide v6, v1, Lz8/e;->a:J

    .line 138
    .line 139
    move-object v1, v3

    .line 140
    move-object v3, v2

    .line 141
    move-object v2, v1

    .line 142
    move-object/from16 v1, p2

    .line 143
    .line 144
    invoke-static/range {v1 .. v7}, Lf9/b;->h(Lz8/m;Lz8/c;Lz8/c;JJ)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    move-object v6, v3

    .line 149
    if-nez v4, :cond_7

    .line 150
    .line 151
    move-object v3, v2

    .line 152
    move v1, v4

    .line 153
    move v2, v11

    .line 154
    goto :goto_4

    .line 155
    :cond_7
    move-object v15, v2

    .line 156
    move v1, v4

    .line 157
    move-object v2, v6

    .line 158
    move/from16 v3, v16

    .line 159
    .line 160
    move-object/from16 v4, v17

    .line 161
    .line 162
    move-object/from16 v5, v18

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_8
    move-object v6, v2

    .line 166
    move/from16 v16, v3

    .line 167
    .line 168
    move-object/from16 v18, v5

    .line 169
    .line 170
    move v2, v11

    .line 171
    move-object v3, v13

    .line 172
    goto :goto_2

    .line 173
    :goto_7
    if-eqz v3, :cond_b

    .line 174
    .line 175
    if-eqz v15, :cond_9

    .line 176
    .line 177
    invoke-virtual {v15}, Lz8/c;->d()F

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    goto :goto_8

    .line 182
    :cond_9
    invoke-virtual {v3}, Lz8/c;->l()F

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    :goto_8
    move v7, v1

    .line 187
    if-eq v3, v6, :cond_a

    .line 188
    .line 189
    move-object v13, v3

    .line 190
    :goto_9
    move v1, v10

    .line 191
    move v9, v11

    .line 192
    goto :goto_a

    .line 193
    :cond_a
    move v1, v10

    .line 194
    goto :goto_a

    .line 195
    :cond_b
    if-eqz v2, :cond_c

    .line 196
    .line 197
    if-eqz v18, :cond_c

    .line 198
    .line 199
    invoke-virtual/range {v18 .. v18}, Lz8/c;->l()F

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    move v7, v1

    .line 204
    move v1, v11

    .line 205
    move v9, v1

    .line 206
    goto :goto_a

    .line 207
    :cond_c
    if-eqz v15, :cond_d

    .line 208
    .line 209
    invoke-virtual {v15}, Lz8/c;->d()F

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    move v1, v10

    .line 214
    move v7, v11

    .line 215
    goto :goto_a

    .line 216
    :cond_d
    if-eqz v5, :cond_e

    .line 217
    .line 218
    invoke-virtual {v5}, Lz8/c;->l()F

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    move v7, v1

    .line 223
    move-object v13, v5

    .line 224
    goto :goto_9

    .line 225
    :cond_e
    move v7, v1

    .line 226
    move v1, v10

    .line 227
    move v4, v12

    .line 228
    :goto_a
    if-eqz v1, :cond_f

    .line 229
    .line 230
    move-object/from16 v3, p2

    .line 231
    .line 232
    move v1, v2

    .line 233
    move-object v2, v6

    .line 234
    move-object v6, v15

    .line 235
    invoke-virtual/range {v0 .. v6}, Le9/b$c;->b(ZLz8/c;Lz8/m;FLz8/c;Lz8/c;)Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    goto :goto_b

    .line 240
    :cond_f
    move-object v2, v6

    .line 241
    move v1, v11

    .line 242
    :goto_b
    if-eqz v1, :cond_10

    .line 243
    .line 244
    move v7, v10

    .line 245
    move v4, v12

    .line 246
    goto :goto_c

    .line 247
    :cond_10
    if-eqz v13, :cond_11

    .line 248
    .line 249
    add-int/lit8 v10, v16, -0x1

    .line 250
    .line 251
    goto :goto_c

    .line 252
    :cond_11
    move/from16 v10, v16

    .line 253
    .line 254
    :goto_c
    cmpl-float v3, v4, v12

    .line 255
    .line 256
    if-nez v3, :cond_12

    .line 257
    .line 258
    move v3, v1

    .line 259
    move v12, v4

    .line 260
    move v1, v7

    .line 261
    move v9, v11

    .line 262
    :goto_d
    move v11, v10

    .line 263
    goto :goto_e

    .line 264
    :cond_12
    move v3, v1

    .line 265
    move v12, v4

    .line 266
    move v1, v7

    .line 267
    goto :goto_d

    .line 268
    :cond_13
    move v3, v11

    .line 269
    :goto_e
    if-eqz v8, :cond_14

    .line 270
    .line 271
    invoke-interface {v8, v2, v12, v11, v1}, Le9/b$f;->a(Lz8/c;FIZ)Z

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    if-eqz v1, :cond_14

    .line 276
    .line 277
    goto :goto_f

    .line 278
    :cond_14
    if-eqz v3, :cond_15

    .line 279
    .line 280
    invoke-virtual {v0}, Le9/b$c;->clear()V

    .line 281
    .line 282
    .line 283
    :cond_15
    invoke-virtual {v2}, Lz8/c;->g()F

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    move-object/from16 v3, p2

    .line 288
    .line 289
    invoke-virtual {v2, v3, v1, v12}, Lz8/c;->y(Lz8/m;FF)V

    .line 290
    .line 291
    .line 292
    if-nez v9, :cond_16

    .line 293
    .line 294
    iget-object v1, v0, Le9/b$c;->a:La9/d;

    .line 295
    .line 296
    invoke-virtual {v1, v13}, La9/d;->b(Lz8/c;)Z

    .line 297
    .line 298
    .line 299
    iget-object v1, v0, Le9/b$c;->a:La9/d;

    .line 300
    .line 301
    invoke-virtual {v1, v2}, La9/d;->e(Lz8/c;)Z

    .line 302
    .line 303
    .line 304
    :cond_16
    :goto_f
    return-void
.end method

.method public b(ZLz8/c;Lz8/m;FLz8/c;Lz8/c;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    cmpg-float p6, p4, p1

    .line 3
    .line 4
    if-ltz p6, :cond_2

    .line 5
    .line 6
    if-eqz p5, :cond_0

    .line 7
    .line 8
    invoke-virtual {p5}, Lz8/c;->l()F

    .line 9
    .line 10
    .line 11
    move-result p5

    .line 12
    cmpl-float p1, p5, p1

    .line 13
    .line 14
    if-gtz p1, :cond_2

    .line 15
    .line 16
    :cond_0
    iget p1, p2, Lz8/c;->p:F

    .line 17
    .line 18
    add-float/2addr p4, p1

    .line 19
    invoke-interface {p3}, Lz8/m;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    int-to-float p1, p1

    .line 24
    cmpl-float p1, p4, p1

    .line 25
    .line 26
    if-lez p1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    return p1

    .line 31
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 32
    return p1
.end method

.method public clear()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le9/b$c;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Le9/b$c;->a:La9/d;

    .line 5
    .line 6
    invoke-virtual {v0}, La9/d;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
