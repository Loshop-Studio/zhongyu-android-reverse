.class public Le9/b$b;
.super Le9/b$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public c:La9/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Le9/b$d;-><init>(Le9/b$a;)V

    .line 2
    new-instance v0, La9/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, La9/d;-><init>(I)V

    iput-object v0, p0, Le9/b$b;->c:La9/d;

    return-void
.end method

.method public synthetic constructor <init>(Le9/b$a;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Le9/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lz8/c;Lz8/m;Le9/b$f;)V
    .locals 18

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
    goto/16 :goto_8

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v2}, Lz8/c;->v()Z

    .line 16
    .line 17
    .line 18
    move-result v9

    .line 19
    if-eqz v9, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2}, Lz8/c;->l()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/high16 v1, -0x40800000    # -1.0f

    .line 27
    .line 28
    :goto_0
    const/4 v10, 0x1

    .line 29
    const/4 v11, 0x0

    .line 30
    if-nez v9, :cond_2

    .line 31
    .line 32
    iget-object v3, v0, Le9/b$b;->c:La9/d;

    .line 33
    .line 34
    invoke-virtual {v3}, La9/d;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    move v3, v10

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v3, v11

    .line 43
    :goto_1
    const/4 v12, 0x0

    .line 44
    cmpg-float v4, v1, v12

    .line 45
    .line 46
    if-gez v4, :cond_3

    .line 47
    .line 48
    invoke-interface/range {p2 .. p2}, Lz8/m;->getHeight()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    int-to-float v1, v1

    .line 53
    iget v4, v2, Lz8/c;->p:F

    .line 54
    .line 55
    sub-float/2addr v1, v4

    .line 56
    :cond_3
    const/4 v13, 0x0

    .line 57
    if-nez v9, :cond_d

    .line 58
    .line 59
    iput-boolean v11, v0, Le9/b$c;->b:Z

    .line 60
    .line 61
    iget-object v4, v0, Le9/b$b;->c:La9/d;

    .line 62
    .line 63
    invoke-virtual {v4}, La9/d;->iterator()Lz8/k;

    .line 64
    .line 65
    .line 66
    move-result-object v14

    .line 67
    move v15, v1

    .line 68
    move v1, v11

    .line 69
    move-object v4, v13

    .line 70
    :goto_2
    iget-boolean v5, v0, Le9/b$c;->b:Z

    .line 71
    .line 72
    if-nez v5, :cond_9

    .line 73
    .line 74
    invoke-interface {v14}, Lz8/k;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_9

    .line 79
    .line 80
    add-int/lit8 v16, v1, 0x1

    .line 81
    .line 82
    invoke-interface {v14}, Lz8/k;->next()Lz8/c;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-ne v1, v2, :cond_4

    .line 87
    .line 88
    move-object v5, v4

    .line 89
    move v7, v11

    .line 90
    goto :goto_5

    .line 91
    :cond_4
    if-nez v4, :cond_6

    .line 92
    .line 93
    invoke-virtual {v1}, Lz8/c;->d()F

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    invoke-interface/range {p2 .. p2}, Lz8/m;->getHeight()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    int-to-float v5, v5

    .line 102
    cmpl-float v4, v4, v5

    .line 103
    .line 104
    if-eqz v4, :cond_5

    .line 105
    .line 106
    move-object v5, v1

    .line 107
    move v7, v3

    .line 108
    goto :goto_5

    .line 109
    :cond_5
    move-object/from16 v17, v1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    move-object/from16 v17, v4

    .line 113
    .line 114
    :goto_3
    cmpg-float v4, v15, v12

    .line 115
    .line 116
    if-gez v4, :cond_7

    .line 117
    .line 118
    move v7, v3

    .line 119
    :goto_4
    move-object/from16 v5, v17

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_7
    invoke-virtual {v2}, Lz8/c;->f()J

    .line 123
    .line 124
    .line 125
    move-result-wide v4

    .line 126
    invoke-virtual {v2}, Lz8/c;->k()Lz8/e;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    iget-wide v6, v3, Lz8/e;->a:J

    .line 131
    .line 132
    move-object v3, v2

    .line 133
    move-object v2, v1

    .line 134
    move-object/from16 v1, p2

    .line 135
    .line 136
    invoke-static/range {v1 .. v7}, Lf9/b;->h(Lz8/m;Lz8/c;Lz8/c;JJ)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    move-object v1, v2

    .line 141
    move-object v2, v3

    .line 142
    if-nez v4, :cond_8

    .line 143
    .line 144
    move-object v13, v1

    .line 145
    move v7, v4

    .line 146
    goto :goto_4

    .line 147
    :cond_8
    invoke-virtual {v1}, Lz8/c;->l()F

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    iget v3, v2, Lz8/c;->p:F

    .line 152
    .line 153
    sub-float v15, v1, v3

    .line 154
    .line 155
    move v3, v4

    .line 156
    move/from16 v1, v16

    .line 157
    .line 158
    move-object/from16 v4, v17

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_9
    move/from16 v16, v1

    .line 162
    .line 163
    move v7, v3

    .line 164
    move-object v5, v4

    .line 165
    :goto_5
    const/4 v1, 0x0

    .line 166
    const/4 v6, 0x0

    .line 167
    move-object/from16 v3, p2

    .line 168
    .line 169
    move v4, v15

    .line 170
    invoke-virtual/range {v0 .. v6}, Le9/b$b;->b(ZLz8/c;Lz8/m;FLz8/c;Lz8/c;)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_a

    .line 175
    .line 176
    invoke-interface/range {p2 .. p2}, Lz8/m;->getHeight()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    int-to-float v3, v3

    .line 181
    iget v4, v2, Lz8/c;->p:F

    .line 182
    .line 183
    sub-float/2addr v3, v4

    .line 184
    move v11, v1

    .line 185
    move v1, v3

    .line 186
    move v3, v10

    .line 187
    goto :goto_7

    .line 188
    :cond_a
    cmpl-float v3, v4, v12

    .line 189
    .line 190
    if-ltz v3, :cond_b

    .line 191
    .line 192
    move v10, v11

    .line 193
    goto :goto_6

    .line 194
    :cond_b
    move v10, v7

    .line 195
    :goto_6
    if-eqz v13, :cond_c

    .line 196
    .line 197
    add-int/lit8 v3, v16, -0x1

    .line 198
    .line 199
    move v11, v10

    .line 200
    move v10, v3

    .line 201
    move v3, v11

    .line 202
    move v11, v1

    .line 203
    move v1, v4

    .line 204
    goto :goto_7

    .line 205
    :cond_c
    move v11, v1

    .line 206
    move v1, v4

    .line 207
    move v3, v10

    .line 208
    move/from16 v10, v16

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_d
    move v10, v11

    .line 212
    :goto_7
    if-eqz v8, :cond_e

    .line 213
    .line 214
    invoke-interface {v8, v2, v1, v10, v3}, Le9/b$f;->a(Lz8/c;FIZ)Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-eqz v3, :cond_e

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_e
    if-eqz v11, :cond_f

    .line 222
    .line 223
    invoke-virtual {v0}, Le9/b$b;->clear()V

    .line 224
    .line 225
    .line 226
    :cond_f
    invoke-virtual {v2}, Lz8/c;->g()F

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    move-object/from16 v4, p2

    .line 231
    .line 232
    invoke-virtual {v2, v4, v3, v1}, Lz8/c;->y(Lz8/m;FF)V

    .line 233
    .line 234
    .line 235
    if-nez v9, :cond_10

    .line 236
    .line 237
    iget-object v1, v0, Le9/b$b;->c:La9/d;

    .line 238
    .line 239
    invoke-virtual {v1, v13}, La9/d;->b(Lz8/c;)Z

    .line 240
    .line 241
    .line 242
    iget-object v1, v0, Le9/b$b;->c:La9/d;

    .line 243
    .line 244
    invoke-virtual {v1, v2}, La9/d;->e(Lz8/c;)Z

    .line 245
    .line 246
    .line 247
    :cond_10
    :goto_8
    return-void
.end method

.method public b(ZLz8/c;Lz8/m;FLz8/c;Lz8/c;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    cmpg-float p1, p4, p1

    .line 3
    .line 4
    if-ltz p1, :cond_1

    .line 5
    .line 6
    if-eqz p5, :cond_0

    .line 7
    .line 8
    invoke-virtual {p5}, Lz8/c;->d()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-interface {p3}, Lz8/m;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    int-to-float p2, p2

    .line 17
    cmpl-float p1, p1, p2

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1

    .line 24
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 25
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
    iget-object v0, p0, Le9/b$b;->c:La9/d;

    .line 5
    .line 6
    invoke-virtual {v0}, La9/d;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
