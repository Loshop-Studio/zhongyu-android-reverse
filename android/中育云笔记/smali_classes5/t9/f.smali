.class public final Lt9/f;
.super Lt9/a;
.source "SourceFile"


# instance fields
.field public s:Z

.field public final t:Ljava/util/ArrayList;

.field public final u:Ljava/util/ArrayList;

.field public final v:Ljava/util/ArrayList;

.field public final w:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lr9/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lt9/a;-><init>(Lr9/b;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lt9/f;->t:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lt9/f;->u:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lt9/f;->v:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lt9/f;->w:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p0}, Lt9/f;->T()V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Lt9/f;->S()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private final S()V
    .locals 14

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x41c80000    # 25.0f

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 27
    .line 28
    sub-float/2addr v1, v2

    .line 29
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Lq9/b;->E()F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    sub-float/2addr v2, v1

    .line 38
    const/4 v3, 0x2

    .line 39
    int-to-float v3, v3

    .line 40
    div-float/2addr v2, v3

    .line 41
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Lq9/b;->E()F

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    sub-float/2addr v4, v1

    .line 50
    div-float/2addr v4, v3

    .line 51
    add-float/2addr v4, v1

    .line 52
    iget-object v1, p0, Lt9/f;->t:Ljava/util/ArrayList;

    .line 53
    .line 54
    new-instance v5, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    const/4 v7, 0x0

    .line 64
    move v8, v7

    .line 65
    :cond_0
    :goto_0
    if-ge v8, v6, :cond_1

    .line 66
    .line 67
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    add-int/lit8 v8, v8, 0x1

    .line 72
    .line 73
    move-object v10, v9

    .line 74
    check-cast v10, Ls9/c;

    .line 75
    .line 76
    invoke-virtual {v10}, Ls9/c;->a()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-lez v10, :cond_0

    .line 85
    .line 86
    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/high16 v6, 0x41b80000    # 23.0f

    .line 95
    .line 96
    move v8, v6

    .line 97
    move v9, v7

    .line 98
    :goto_1
    if-ge v9, v1, :cond_2

    .line 99
    .line 100
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    add-int/lit8 v9, v9, 0x1

    .line 105
    .line 106
    check-cast v10, Ls9/c;

    .line 107
    .line 108
    invoke-virtual {v10}, Ls9/c;->a()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    iget-object v11, p0, Lt9/f;->u:Ljava/util/ArrayList;

    .line 117
    .line 118
    new-instance v12, Landroid/graphics/RectF;

    .line 119
    .line 120
    add-float v13, v8, v10

    .line 121
    .line 122
    invoke-direct {v12, v8, v2, v13, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    const/high16 v11, 0x41f00000    # 30.0f

    .line 129
    .line 130
    add-float/2addr v10, v11

    .line 131
    add-float/2addr v8, v10

    .line 132
    goto :goto_1

    .line 133
    :cond_2
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Lq9/b;->J()Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    const/high16 v1, 0x41800000    # 16.0f

    .line 146
    .line 147
    move v2, v7

    .line 148
    :goto_2
    if-ge v2, v0, :cond_3

    .line 149
    .line 150
    int-to-float v4, v2

    .line 151
    const/high16 v5, 0x40400000    # 3.0f

    .line 152
    .line 153
    mul-float/2addr v4, v5

    .line 154
    const/high16 v5, 0x41000000    # 8.0f

    .line 155
    .line 156
    add-float/2addr v4, v5

    .line 157
    div-float/2addr v4, v3

    .line 158
    const/high16 v5, 0x41980000    # 19.0f

    .line 159
    .line 160
    add-float/2addr v4, v5

    .line 161
    add-float/2addr v1, v4

    .line 162
    iget-object v5, p0, Lt9/f;->v:Ljava/util/ArrayList;

    .line 163
    .line 164
    new-instance v8, Landroid/graphics/PointF;

    .line 165
    .line 166
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    invoke-virtual {v9}, Lq9/b;->E()F

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    div-float/2addr v9, v3

    .line 175
    invoke-direct {v8, v1, v9}, Landroid/graphics/PointF;-><init>(FF)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    add-float/2addr v1, v4

    .line 182
    add-int/lit8 v2, v2, 0x1

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_3
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v0}, Lq9/b;->E()F

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    const/high16 v1, 0x42180000    # 38.0f

    .line 194
    .line 195
    sub-float/2addr v0, v1

    .line 196
    div-float/2addr v0, v3

    .line 197
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-virtual {v2}, Lq9/b;->E()F

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    sub-float/2addr v2, v1

    .line 206
    div-float/2addr v2, v3

    .line 207
    add-float/2addr v2, v1

    .line 208
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v3}, Lq9/b;->I()Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    :goto_3
    if-ge v7, v3, :cond_4

    .line 221
    .line 222
    iget-object v4, p0, Lt9/f;->w:Ljava/util/ArrayList;

    .line 223
    .line 224
    new-instance v5, Landroid/graphics/RectF;

    .line 225
    .line 226
    const/high16 v8, 0x42740000    # 61.0f

    .line 227
    .line 228
    int-to-float v9, v7

    .line 229
    mul-float/2addr v9, v8

    .line 230
    add-float/2addr v9, v6

    .line 231
    add-float v8, v9, v1

    .line 232
    .line 233
    invoke-direct {v5, v9, v0, v8, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    add-int/lit8 v7, v7, 0x1

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_4
    return-void
.end method

.method private final T()V
    .locals 5

    .line 1
    iget-object v0, p0, Lt9/f;->t:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt9/f;->t:Ljava/util/ArrayList;

    .line 7
    .line 8
    sget-object v1, Ls9/c$d;->c:Ls9/c$d;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lt9/f;->t:Ljava/util/ArrayList;

    .line 14
    .line 15
    sget-object v1, Ls9/c$e;->c:Ls9/c$e;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lt9/f;->t:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v1, Ls9/c$g;

    .line 23
    .line 24
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Lq9/b;->J()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Lq9/b;->I()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-direct {v1, v3, v2, v4}, Ls9/c$g;-><init>(ZFI)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lt9/f;->t:Ljava/util/ArrayList;

    .line 68
    .line 69
    sget-object v1, Ls9/c$a;->c:Ls9/c$a;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public F(FF)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lt9/d;->h()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance p1, Ls9/b$d;

    .line 18
    .line 19
    invoke-direct {p1, v1}, Ls9/b$d;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance p1, Ls9/b$d;

    .line 41
    .line 42
    invoke-direct {p1, v2}, Ls9/b$d;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 46
    .line 47
    .line 48
    return v2

    .line 49
    :cond_1
    iget-object v0, p0, Lt9/f;->t:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    move v4, v1

    .line 56
    :cond_2
    if-ge v4, v3, :cond_3

    .line 57
    .line 58
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    add-int/lit8 v4, v4, 0x1

    .line 63
    .line 64
    move-object v6, v5

    .line 65
    check-cast v6, Ls9/c;

    .line 66
    .line 67
    instance-of v6, v6, Ls9/c$g;

    .line 68
    .line 69
    if-eqz v6, :cond_2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const/4 v5, 0x0

    .line 73
    :goto_0
    check-cast v5, Ls9/c;

    .line 74
    .line 75
    if-eqz v5, :cond_7

    .line 76
    .line 77
    invoke-virtual {v5}, Ls9/c;->b()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ne v0, v2, :cond_7

    .line 82
    .line 83
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lt9/d;->i()Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    move v3, v1

    .line 96
    :goto_1
    if-ge v3, v0, :cond_5

    .line 97
    .line 98
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v4}, Lt9/d;->i()Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Landroid/graphics/RectF;

    .line 111
    .line 112
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_4

    .line 117
    .line 118
    new-instance p1, Ls9/b$j;

    .line 119
    .line 120
    invoke-direct {p1, v3}, Ls9/b$j;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 124
    .line 125
    .line 126
    return v2

    .line 127
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_5
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    move v3, v1

    .line 143
    :goto_2
    if-ge v3, v0, :cond_7

    .line 144
    .line 145
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-virtual {v4}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    check-cast v4, Landroid/graphics/RectF;

    .line 158
    .line 159
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-eqz v4, :cond_6

    .line 164
    .line 165
    new-instance p1, Ls9/b$a;

    .line 166
    .line 167
    invoke-direct {p1, v3}, Ls9/b$a;-><init>(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 171
    .line 172
    .line 173
    return v2

    .line 174
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_7
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v0}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const/4 v3, 0x2

    .line 186
    new-array v4, v3, [F

    .line 187
    .line 188
    aput p1, v4, v1

    .line 189
    .line 190
    aput p2, v4, v2

    .line 191
    .line 192
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 193
    .line 194
    .line 195
    aget p1, v4, v1

    .line 196
    .line 197
    aget p2, v4, v2

    .line 198
    .line 199
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {v4}, Lq9/b;->H()F

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    new-instance v4, Landroid/graphics/RectF;

    .line 212
    .line 213
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    int-to-float v3, v3

    .line 222
    div-float v6, v0, v3

    .line 223
    .line 224
    sub-float/2addr v5, v6

    .line 225
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 230
    .line 231
    const/4 v8, 0x5

    .line 232
    int-to-float v8, v8

    .line 233
    mul-float/2addr v8, v0

    .line 234
    div-float/2addr v8, v3

    .line 235
    sub-float/2addr v7, v8

    .line 236
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    add-float/2addr v8, v6

    .line 245
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 250
    .line 251
    const/4 v10, 0x3

    .line 252
    int-to-float v10, v10

    .line 253
    mul-float/2addr v0, v10

    .line 254
    div-float/2addr v0, v3

    .line 255
    sub-float/2addr v9, v0

    .line 256
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_8

    .line 264
    .line 265
    sget-object p1, Ls9/b$g;->a:Ls9/b$g;

    .line 266
    .line 267
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 268
    .line 269
    .line 270
    return v2

    .line 271
    :cond_8
    new-instance v0, Landroid/graphics/RectF;

    .line 272
    .line 273
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 278
    .line 279
    sub-float/2addr v3, v6

    .line 280
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 285
    .line 286
    sub-float/2addr v4, v6

    .line 287
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 292
    .line 293
    add-float/2addr v5, v6

    .line 294
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    .line 299
    .line 300
    add-float/2addr v7, v6

    .line 301
    invoke-direct {v0, v3, v4, v5, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eqz v0, :cond_9

    .line 309
    .line 310
    sget-object p1, Ls9/b$h;->a:Ls9/b$h;

    .line 311
    .line 312
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 313
    .line 314
    .line 315
    return v2

    .line 316
    :cond_9
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 321
    .line 322
    .line 323
    move-result p1

    .line 324
    if-eqz p1, :cond_a

    .line 325
    .line 326
    sget-object p1, Ls9/b$b;->a:Ls9/b$b;

    .line 327
    .line 328
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 329
    .line 330
    .line 331
    return v2

    .line 332
    :cond_a
    sget-object p1, Ls9/b$f;->a:Ls9/b$f;

    .line 333
    .line 334
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 335
    .line 336
    .line 337
    return v1
.end method

.method public H()V
    .locals 0

    .line 1
    invoke-super {p0}, Lt9/a;->H()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lt9/f;->T()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public L(Ljava/util/List;)V
    .locals 11

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lt9/a;->L(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lt9/f;->t:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :cond_0
    const/4 v4, 0x0

    .line 18
    if-ge v3, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    move-object v6, v5

    .line 27
    check-cast v6, Ls9/c;

    .line 28
    .line 29
    instance-of v6, v6, Ls9/c$g;

    .line 30
    .line 31
    if-eqz v6, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v5, v4

    .line 35
    :goto_0
    check-cast v5, Ls9/c;

    .line 36
    .line 37
    if-eqz v5, :cond_d

    .line 38
    .line 39
    check-cast p1, Ljava/lang/Iterable;

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 v0, 0x1

    .line 46
    move-object v1, v4

    .line 47
    move-object v3, v1

    .line 48
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_b

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Lba/c;

    .line 59
    .line 60
    invoke-interface {v6}, Lba/c;->f()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    check-cast v6, Ljava/lang/Iterable;

    .line 65
    .line 66
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    :cond_3
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_2

    .line 75
    .line 76
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    check-cast v7, Lba/c;

    .line 81
    .line 82
    instance-of v8, v7, Lea/c;

    .line 83
    .line 84
    if-eqz v8, :cond_a

    .line 85
    .line 86
    check-cast v7, Lea/c;

    .line 87
    .line 88
    invoke-virtual {v7}, Lea/c;->z()Landroid/graphics/Paint;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    if-eqz v7, :cond_9

    .line 93
    .line 94
    if-nez v3, :cond_4

    .line 95
    .line 96
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v7}, Landroid/graphics/Paint;->getColor()I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    move-object v10, v3

    .line 113
    move-object v3, v1

    .line 114
    move-object v1, v10

    .line 115
    goto :goto_3

    .line 116
    :cond_4
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    invoke-static {v3, v8}, Lkotlin/jvm/internal/u;->a(Ljava/lang/Float;F)Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-nez v8, :cond_5

    .line 125
    .line 126
    const/high16 v3, -0x40800000    # -1.0f

    .line 127
    .line 128
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    :cond_5
    invoke-virtual {v7}, Landroid/graphics/Paint;->getColor()I

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-nez v1, :cond_6

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    if-eq v9, v8, :cond_7

    .line 144
    .line 145
    :goto_2
    const v1, 0x7fffffff

    .line 146
    .line 147
    .line 148
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    :cond_7
    :goto_3
    invoke-virtual {v7}, Landroid/graphics/Paint;->getColor()I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    invoke-static {v7}, Landroid/graphics/Color;->alpha(I)I

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    const/16 v8, 0xff

    .line 161
    .line 162
    if-ne v7, v8, :cond_8

    .line 163
    .line 164
    move v0, v2

    .line 165
    :cond_8
    sget-object v7, Lqc/q;->a:Lqc/q;

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_9
    move-object v7, v4

    .line 169
    :goto_4
    if-nez v7, :cond_3

    .line 170
    .line 171
    :cond_a
    move v0, v2

    .line 172
    goto :goto_1

    .line 173
    :cond_b
    check-cast v5, Ls9/c$g;

    .line 174
    .line 175
    invoke-virtual {v5, v0}, Ls9/c$g;->h(Z)V

    .line 176
    .line 177
    .line 178
    if-eqz v1, :cond_c

    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    invoke-virtual {v5, p1}, Ls9/c$g;->g(I)V

    .line 185
    .line 186
    .line 187
    :cond_c
    if-eqz v3, :cond_d

    .line 188
    .line 189
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    invoke-virtual {v5, p1}, Ls9/c$g;->i(F)V

    .line 194
    .line 195
    .line 196
    :cond_d
    return-void
.end method

.method public R()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lt9/a;->j()Lt9/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lt9/d;->h()Landroid/graphics/RectF;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 16
    .line 17
    iget-object v4, v0, Lt9/f;->u:Ljava/util/ArrayList;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Landroid/graphics/RectF;

    .line 25
    .line 26
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 27
    .line 28
    add-float/2addr v3, v4

    .line 29
    const/high16 v4, 0x41700000    # 15.0f

    .line 30
    .line 31
    sub-float/2addr v3, v4

    .line 32
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 37
    .line 38
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    iget-object v8, v0, Lt9/f;->u:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    check-cast v8, Landroid/graphics/RectF;

    .line 51
    .line 52
    iget v8, v8, Landroid/graphics/RectF;->right:F

    .line 53
    .line 54
    add-float/2addr v7, v8

    .line 55
    add-float/2addr v7, v4

    .line 56
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    iget v8, v8, Landroid/graphics/RectF;->top:F

    .line 61
    .line 62
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v9}, Lq9/b;->E()F

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    add-float/2addr v8, v9

    .line 71
    invoke-virtual {v2, v3, v6, v7, v8}, Landroid/graphics/RectF;->set(FFFF)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 83
    .line 84
    iget-object v6, v0, Lt9/f;->u:Ljava/util/ArrayList;

    .line 85
    .line 86
    const/4 v7, 0x1

    .line 87
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Landroid/graphics/RectF;

    .line 92
    .line 93
    iget v6, v6, Landroid/graphics/RectF;->left:F

    .line 94
    .line 95
    add-float/2addr v3, v6

    .line 96
    sub-float/2addr v3, v4

    .line 97
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 102
    .line 103
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    iget v8, v8, Landroid/graphics/RectF;->left:F

    .line 108
    .line 109
    iget-object v9, v0, Lt9/f;->u:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    check-cast v7, Landroid/graphics/RectF;

    .line 116
    .line 117
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 118
    .line 119
    add-float/2addr v8, v7

    .line 120
    add-float/2addr v8, v4

    .line 121
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 126
    .line 127
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v7}, Lq9/b;->E()F

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    add-float/2addr v4, v7

    .line 136
    invoke-virtual {v2, v3, v6, v8, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Lt9/d;->i()Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 144
    .line 145
    .line 146
    iget-object v2, v0, Lt9/f;->v:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    move v4, v5

    .line 153
    move v6, v4

    .line 154
    :goto_0
    const/4 v7, 0x2

    .line 155
    const/high16 v8, 0x41500000    # 13.0f

    .line 156
    .line 157
    if-ge v6, v3, :cond_1

    .line 158
    .line 159
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    add-int/lit8 v6, v6, 0x1

    .line 164
    .line 165
    add-int/lit8 v10, v4, 0x1

    .line 166
    .line 167
    if-gez v4, :cond_0

    .line 168
    .line 169
    invoke-static {}, Lrc/w;->w()V

    .line 170
    .line 171
    .line 172
    :cond_0
    check-cast v9, Landroid/graphics/PointF;

    .line 173
    .line 174
    invoke-virtual {v1}, Lt9/d;->i()Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    move-result-object v11

    .line 178
    new-instance v12, Landroid/graphics/RectF;

    .line 179
    .line 180
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 181
    .line 182
    .line 183
    move-result-object v13

    .line 184
    iget v13, v13, Landroid/graphics/RectF;->left:F

    .line 185
    .line 186
    iget v14, v9, Landroid/graphics/PointF;->x:F

    .line 187
    .line 188
    add-float/2addr v13, v14

    .line 189
    int-to-float v4, v4

    .line 190
    const/high16 v14, 0x40400000    # 3.0f

    .line 191
    .line 192
    mul-float/2addr v4, v14

    .line 193
    const/high16 v14, 0x41000000    # 8.0f

    .line 194
    .line 195
    add-float/2addr v4, v14

    .line 196
    int-to-float v7, v7

    .line 197
    div-float/2addr v4, v7

    .line 198
    sub-float/2addr v13, v4

    .line 199
    const/high16 v14, 0x41980000    # 19.0f

    .line 200
    .line 201
    sub-float/2addr v13, v14

    .line 202
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 203
    .line 204
    .line 205
    move-result-object v15

    .line 206
    iget v15, v15, Landroid/graphics/RectF;->top:F

    .line 207
    .line 208
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 209
    .line 210
    .line 211
    move-result-object v16

    .line 212
    invoke-virtual/range {v16 .. v16}, Lq9/b;->E()F

    .line 213
    .line 214
    .line 215
    move-result v16

    .line 216
    add-float v15, v15, v16

    .line 217
    .line 218
    add-float/2addr v15, v8

    .line 219
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 224
    .line 225
    iget v9, v9, Landroid/graphics/PointF;->x:F

    .line 226
    .line 227
    add-float/2addr v5, v9

    .line 228
    add-float/2addr v5, v4

    .line 229
    add-float/2addr v5, v14

    .line 230
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 235
    .line 236
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    invoke-virtual {v9}, Lq9/b;->E()F

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    mul-float/2addr v9, v7

    .line 245
    add-float/2addr v4, v9

    .line 246
    add-float/2addr v4, v8

    .line 247
    invoke-direct {v12, v13, v15, v5, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move v4, v10

    .line 254
    const/4 v5, 0x0

    .line 255
    goto :goto_0

    .line 256
    :cond_1
    invoke-virtual {v1}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 261
    .line 262
    .line 263
    iget-object v2, v0, Lt9/f;->w:Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    const/4 v4, 0x0

    .line 270
    :goto_1
    if-ge v4, v3, :cond_2

    .line 271
    .line 272
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    add-int/lit8 v4, v4, 0x1

    .line 277
    .line 278
    check-cast v5, Landroid/graphics/RectF;

    .line 279
    .line 280
    invoke-virtual {v1}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    new-instance v9, Landroid/graphics/RectF;

    .line 285
    .line 286
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 287
    .line 288
    .line 289
    move-result-object v10

    .line 290
    iget v10, v10, Landroid/graphics/RectF;->left:F

    .line 291
    .line 292
    iget v11, v5, Landroid/graphics/RectF;->left:F

    .line 293
    .line 294
    add-float/2addr v10, v11

    .line 295
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    iget v11, v11, Landroid/graphics/RectF;->top:F

    .line 300
    .line 301
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 302
    .line 303
    .line 304
    move-result-object v12

    .line 305
    invoke-virtual {v12}, Lq9/b;->E()F

    .line 306
    .line 307
    .line 308
    move-result v12

    .line 309
    add-float/2addr v12, v8

    .line 310
    int-to-float v13, v7

    .line 311
    mul-float/2addr v12, v13

    .line 312
    add-float/2addr v11, v12

    .line 313
    iget v12, v5, Landroid/graphics/RectF;->top:F

    .line 314
    .line 315
    add-float/2addr v11, v12

    .line 316
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 317
    .line 318
    .line 319
    move-result-object v12

    .line 320
    iget v12, v12, Landroid/graphics/RectF;->left:F

    .line 321
    .line 322
    iget v14, v5, Landroid/graphics/RectF;->right:F

    .line 323
    .line 324
    add-float/2addr v12, v14

    .line 325
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 326
    .line 327
    .line 328
    move-result-object v14

    .line 329
    iget v14, v14, Landroid/graphics/RectF;->top:F

    .line 330
    .line 331
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 332
    .line 333
    .line 334
    move-result-object v15

    .line 335
    invoke-virtual {v15}, Lq9/b;->E()F

    .line 336
    .line 337
    .line 338
    move-result v15

    .line 339
    add-float/2addr v15, v8

    .line 340
    mul-float/2addr v15, v13

    .line 341
    add-float/2addr v14, v15

    .line 342
    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    .line 343
    .line 344
    add-float/2addr v14, v5

    .line 345
    invoke-direct {v9, v10, v11, v12, v14}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    goto :goto_1

    .line 352
    :cond_2
    invoke-virtual {v0}, Lt9/a;->G()Z

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    if-nez v2, :cond_4

    .line 357
    .line 358
    invoke-virtual {v1}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 363
    .line 364
    invoke-virtual {v1}, Lt9/d;->h()Landroid/graphics/RectF;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 369
    .line 370
    sub-float/2addr v2, v3

    .line 371
    const/high16 v3, 0x41800000    # 16.0f

    .line 372
    .line 373
    add-float/2addr v2, v3

    .line 374
    invoke-virtual {v1}, Lt9/d;->h()Landroid/graphics/RectF;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 383
    .line 384
    .line 385
    move-result v4

    .line 386
    sub-float/2addr v4, v2

    .line 387
    const/4 v5, 0x0

    .line 388
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    sub-float/2addr v4, v2

    .line 404
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v1}, Lt9/d;->i()Ljava/util/ArrayList;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    invoke-static {v2}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    check-cast v2, Landroid/graphics/RectF;

    .line 416
    .line 417
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 418
    .line 419
    invoke-virtual {v1}, Lt9/d;->i()Ljava/util/ArrayList;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    invoke-static {v3}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    check-cast v3, Landroid/graphics/RectF;

    .line 428
    .line 429
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 430
    .line 431
    sub-float/2addr v2, v3

    .line 432
    const/high16 v3, 0x42000000    # 32.0f

    .line 433
    .line 434
    add-float/2addr v2, v3

    .line 435
    invoke-virtual {v1}, Lt9/d;->i()Ljava/util/ArrayList;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 440
    .line 441
    .line 442
    move-result v4

    .line 443
    const/4 v6, 0x0

    .line 444
    :goto_2
    if-ge v6, v4, :cond_3

    .line 445
    .line 446
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v7

    .line 450
    add-int/lit8 v6, v6, 0x1

    .line 451
    .line 452
    check-cast v7, Landroid/graphics/RectF;

    .line 453
    .line 454
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 455
    .line 456
    .line 457
    move-result-object v8

    .line 458
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    .line 459
    .line 460
    .line 461
    move-result v8

    .line 462
    sub-float/2addr v8, v2

    .line 463
    invoke-virtual {v7, v8, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 464
    .line 465
    .line 466
    goto :goto_2

    .line 467
    :cond_3
    invoke-virtual {v1}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    invoke-static {v2}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    check-cast v2, Landroid/graphics/RectF;

    .line 476
    .line 477
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 478
    .line 479
    invoke-virtual {v1}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    invoke-static {v3}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    check-cast v3, Landroid/graphics/RectF;

    .line 488
    .line 489
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 490
    .line 491
    sub-float/2addr v2, v3

    .line 492
    const/high16 v3, 0x42380000    # 46.0f

    .line 493
    .line 494
    add-float/2addr v2, v3

    .line 495
    invoke-virtual {v1}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 500
    .line 501
    .line 502
    move-result v3

    .line 503
    const/4 v4, 0x0

    .line 504
    :goto_3
    if-ge v4, v3, :cond_4

    .line 505
    .line 506
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v6

    .line 510
    add-int/lit8 v4, v4, 0x1

    .line 511
    .line 512
    check-cast v6, Landroid/graphics/RectF;

    .line 513
    .line 514
    invoke-virtual {v0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 515
    .line 516
    .line 517
    move-result-object v7

    .line 518
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    sub-float/2addr v7, v2

    .line 523
    invoke-virtual {v6, v7, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 524
    .line 525
    .line 526
    goto :goto_3

    .line 527
    :cond_4
    return-void
.end method

.method public final U(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lt9/f;->s:Z

    .line 2
    .line 3
    return-void
.end method

.method public f()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/f;->t:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Landroid/graphics/RectF;
    .locals 5

    .line 1
    iget-object v0, p0, Lt9/f;->u:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/RectF;

    .line 8
    .line 9
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 10
    .line 11
    const/high16 v1, 0x41700000    # 15.0f

    .line 12
    .line 13
    add-float/2addr v0, v1

    .line 14
    const/high16 v1, 0x41000000    # 8.0f

    .line 15
    .line 16
    add-float/2addr v0, v1

    .line 17
    iget-object v2, p0, Lt9/f;->v:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {v2}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/graphics/PointF;

    .line 24
    .line 25
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 26
    .line 27
    iget-object v3, p0, Lt9/f;->v:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    add-int/lit8 v3, v3, -0x1

    .line 34
    .line 35
    int-to-float v3, v3

    .line 36
    const/high16 v4, 0x40400000    # 3.0f

    .line 37
    .line 38
    mul-float/2addr v3, v4

    .line 39
    add-float/2addr v2, v3

    .line 40
    add-float/2addr v2, v1

    .line 41
    const/high16 v1, 0x41800000    # 16.0f

    .line 42
    .line 43
    add-float/2addr v2, v1

    .line 44
    iget-object v1, p0, Lt9/f;->w:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-static {v1}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Landroid/graphics/RectF;

    .line 51
    .line 52
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 53
    .line 54
    const/high16 v3, 0x41b80000    # 23.0f

    .line 55
    .line 56
    add-float/2addr v1, v3

    .line 57
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Lq9/b;->E()F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/4 v2, 0x3

    .line 74
    int-to-float v2, v2

    .line 75
    mul-float/2addr v1, v2

    .line 76
    const/high16 v2, 0x41d00000    # 26.0f

    .line 77
    .line 78
    add-float/2addr v1, v2

    .line 79
    new-instance v2, Landroid/graphics/RectF;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    invoke-direct {v2, v3, v3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 83
    .line 84
    .line 85
    return-object v2
.end method

.method public w(FF)Z
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p2}, Lt9/a;->w(FF)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    invoke-virtual {v0}, Lt9/a;->e()Ls9/b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    instance-of v3, v1, Ls9/b$d;

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    if-eqz v3, :cond_6

    .line 19
    .line 20
    invoke-virtual {v0}, Lt9/a;->e()Ls9/b;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function"

    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast v1, Ls9/b$d;

    .line 30
    .line 31
    invoke-virtual {v1}, Ls9/b$d;->a()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-eq v1, v5, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {v0}, Lt9/a;->l()Lv9/c;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v1, v2}, Lv9/c;->p(Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lt9/a;->l()Lv9/c;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v1}, Lv9/c;->e()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 67
    .line 68
    .line 69
    move-result-wide v3

    .line 70
    invoke-interface {v1, v2, v3, v4}, Lr9/b;->o(Ljava/util/List;J)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v1}, Lr9/b;->l()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lt9/f;->H()V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    iget-object v1, v0, Lt9/f;->t:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    move v6, v2

    .line 91
    :cond_3
    if-ge v6, v3, :cond_4

    .line 92
    .line 93
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    add-int/lit8 v6, v6, 0x1

    .line 98
    .line 99
    move-object v8, v7

    .line 100
    check-cast v8, Ls9/c;

    .line 101
    .line 102
    instance-of v8, v8, Ls9/c$g;

    .line 103
    .line 104
    if-eqz v8, :cond_3

    .line 105
    .line 106
    move-object v4, v7

    .line 107
    goto :goto_0

    .line 108
    :cond_4
    const/4 v4, 0x0

    .line 109
    :goto_0
    check-cast v4, Ls9/c;

    .line 110
    .line 111
    if-eqz v4, :cond_5

    .line 112
    .line 113
    invoke-virtual {v4}, Ls9/c;->b()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    xor-int/2addr v1, v5

    .line 118
    invoke-virtual {v4, v1}, Ls9/c;->c(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v2}, Lt9/a;->P(Z)V

    .line 122
    .line 123
    .line 124
    :cond_5
    :goto_1
    return v5

    .line 125
    :cond_6
    instance-of v3, v1, Ls9/b$j;

    .line 126
    .line 127
    const/16 v6, 0xa

    .line 128
    .line 129
    const-string v7, " list: "

    .line 130
    .line 131
    if-eqz v3, :cond_10

    .line 132
    .line 133
    invoke-virtual {v0}, Lt9/a;->e()Ls9/b;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.WriteSize"

    .line 138
    .line 139
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    check-cast v1, Ls9/b$j;

    .line 143
    .line 144
    invoke-virtual {v1}, Ls9/b$j;->a()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    iget-boolean v3, v0, Lt9/f;->s:Z

    .line 149
    .line 150
    if-eqz v3, :cond_7

    .line 151
    .line 152
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v3}, Lq9/b;->G()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    check-cast v1, Ljava/lang/Number;

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    goto :goto_2

    .line 171
    :cond_7
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-virtual {v3}, Lq9/b;->J()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Ljava/lang/Number;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    :goto_2
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    move v9, v2

    .line 198
    :cond_8
    if-ge v9, v8, :cond_b

    .line 199
    .line 200
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    add-int/lit8 v9, v9, 0x1

    .line 205
    .line 206
    check-cast v10, Lba/c;

    .line 207
    .line 208
    invoke-interface {v10}, Lba/c;->f()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    check-cast v11, Ljava/lang/Iterable;

    .line 213
    .line 214
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    :cond_9
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    if-eqz v12, :cond_8

    .line 223
    .line 224
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    move-object v14, v12

    .line 229
    check-cast v14, Lba/c;

    .line 230
    .line 231
    instance-of v12, v14, Lea/c;

    .line 232
    .line 233
    if-eqz v12, :cond_a

    .line 234
    .line 235
    move-object v12, v14

    .line 236
    check-cast v12, Lea/c;

    .line 237
    .line 238
    invoke-virtual {v12}, Lea/c;->z()Landroid/graphics/Paint;

    .line 239
    .line 240
    .line 241
    move-result-object v12

    .line 242
    if-eqz v12, :cond_a

    .line 243
    .line 244
    invoke-virtual {v12, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 248
    .line 249
    .line 250
    move-result-object v13

    .line 251
    sget-object v15, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->g:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 252
    .line 253
    new-instance v4, Landroid/graphics/Paint;

    .line 254
    .line 255
    invoke-direct {v4, v12}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 256
    .line 257
    .line 258
    const/16 v22, 0xec

    .line 259
    .line 260
    const/16 v23, 0x0

    .line 261
    .line 262
    const/16 v16, 0x0

    .line 263
    .line 264
    const/16 v17, 0x0

    .line 265
    .line 266
    const/16 v19, 0x0

    .line 267
    .line 268
    const/16 v20, 0x0

    .line 269
    .line 270
    const/16 v21, 0x0

    .line 271
    .line 272
    move-object/from16 v18, v4

    .line 273
    .line 274
    invoke-static/range {v13 .. v23}, Lr9/b$a;->a(Lr9/b;Lba/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :cond_a
    instance-of v4, v10, Lca/c;

    .line 278
    .line 279
    if-eqz v4, :cond_9

    .line 280
    .line 281
    move-object v4, v10

    .line 282
    check-cast v4, Lca/c;

    .line 283
    .line 284
    invoke-interface {v4, v5}, Lca/c;->l(Z)V

    .line 285
    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    const-string v4, "WriteFunction:WriteSize -> size:"

    .line 294
    .line 295
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    new-instance v7, Ljava/util/ArrayList;

    .line 309
    .line 310
    invoke-static {v4, v6}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 311
    .line 312
    .line 313
    move-result v6

    .line 314
    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    move v8, v2

    .line 322
    :goto_4
    if-ge v8, v6, :cond_c

    .line 323
    .line 324
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    add-int/lit8 v8, v8, 0x1

    .line 329
    .line 330
    check-cast v9, Lba/c;

    .line 331
    .line 332
    invoke-interface {v9}, Lba/c;->getId()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    goto :goto_4

    .line 340
    :cond_c
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Lt9/a;->l()Lv9/c;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-interface {v3}, Lv9/c;->g()V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    invoke-interface {v3}, Lr9/b;->l()V

    .line 366
    .line 367
    .line 368
    iget-object v3, v0, Lt9/f;->t:Ljava/util/ArrayList;

    .line 369
    .line 370
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    move v6, v2

    .line 375
    :cond_d
    if-ge v6, v4, :cond_e

    .line 376
    .line 377
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    add-int/lit8 v6, v6, 0x1

    .line 382
    .line 383
    move-object v8, v7

    .line 384
    check-cast v8, Ls9/c;

    .line 385
    .line 386
    instance-of v8, v8, Ls9/c$g;

    .line 387
    .line 388
    if-eqz v8, :cond_d

    .line 389
    .line 390
    move-object v4, v7

    .line 391
    goto :goto_5

    .line 392
    :cond_e
    const/4 v4, 0x0

    .line 393
    :goto_5
    check-cast v4, Ls9/c;

    .line 394
    .line 395
    if-eqz v4, :cond_f

    .line 396
    .line 397
    check-cast v4, Ls9/c$g;

    .line 398
    .line 399
    invoke-virtual {v4, v1}, Ls9/c$g;->i(F)V

    .line 400
    .line 401
    .line 402
    :cond_f
    invoke-virtual {v0, v2}, Lt9/a;->P(Z)V

    .line 403
    .line 404
    .line 405
    return v5

    .line 406
    :cond_10
    instance-of v1, v1, Ls9/b$a;

    .line 407
    .line 408
    if-eqz v1, :cond_1a

    .line 409
    .line 410
    invoke-virtual {v0}, Lt9/a;->e()Ls9/b;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color"

    .line 415
    .line 416
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    check-cast v1, Ls9/b$a;

    .line 420
    .line 421
    invoke-virtual {v1}, Ls9/b$a;->a()I

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    invoke-virtual {v3}, Lq9/b;->I()Ljava/util/List;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    check-cast v1, Ljava/lang/Number;

    .line 438
    .line 439
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    iget-boolean v3, v0, Lt9/f;->s:Z

    .line 444
    .line 445
    if-eqz v3, :cond_11

    .line 446
    .line 447
    const v3, 0xffffff

    .line 448
    .line 449
    .line 450
    and-int/2addr v1, v3

    .line 451
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    invoke-virtual {v3}, Lq9/b;->v()F

    .line 456
    .line 457
    .line 458
    move-result v3

    .line 459
    const/16 v4, 0xff

    .line 460
    .line 461
    int-to-float v4, v4

    .line 462
    mul-float/2addr v3, v4

    .line 463
    float-to-int v3, v3

    .line 464
    shl-int/lit8 v3, v3, 0x18

    .line 465
    .line 466
    or-int/2addr v1, v3

    .line 467
    :cond_11
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    move v8, v2

    .line 476
    :cond_12
    :goto_6
    if-ge v8, v4, :cond_15

    .line 477
    .line 478
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v9

    .line 482
    add-int/lit8 v8, v8, 0x1

    .line 483
    .line 484
    check-cast v9, Lba/c;

    .line 485
    .line 486
    invoke-interface {v9}, Lba/c;->f()Ljava/util/List;

    .line 487
    .line 488
    .line 489
    move-result-object v10

    .line 490
    check-cast v10, Ljava/lang/Iterable;

    .line 491
    .line 492
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 493
    .line 494
    .line 495
    move-result-object v10

    .line 496
    :cond_13
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 497
    .line 498
    .line 499
    move-result v11

    .line 500
    if-eqz v11, :cond_14

    .line 501
    .line 502
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v11

    .line 506
    move-object v13, v11

    .line 507
    check-cast v13, Lba/c;

    .line 508
    .line 509
    instance-of v11, v13, Lea/c;

    .line 510
    .line 511
    if-eqz v11, :cond_13

    .line 512
    .line 513
    move-object v11, v13

    .line 514
    check-cast v11, Lea/c;

    .line 515
    .line 516
    invoke-virtual {v11}, Lea/c;->z()Landroid/graphics/Paint;

    .line 517
    .line 518
    .line 519
    move-result-object v11

    .line 520
    if-eqz v11, :cond_13

    .line 521
    .line 522
    invoke-virtual {v11, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 526
    .line 527
    .line 528
    move-result-object v12

    .line 529
    sget-object v14, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->g:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 530
    .line 531
    new-instance v15, Landroid/graphics/Paint;

    .line 532
    .line 533
    invoke-direct {v15, v11}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 534
    .line 535
    .line 536
    const/16 v21, 0xec

    .line 537
    .line 538
    const/16 v22, 0x0

    .line 539
    .line 540
    move-object/from16 v17, v15

    .line 541
    .line 542
    const/4 v15, 0x0

    .line 543
    const/16 v16, 0x0

    .line 544
    .line 545
    const/16 v18, 0x0

    .line 546
    .line 547
    const/16 v19, 0x0

    .line 548
    .line 549
    const/16 v20, 0x0

    .line 550
    .line 551
    invoke-static/range {v12 .. v22}, Lr9/b$a;->a(Lr9/b;Lba/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    goto :goto_7

    .line 555
    :cond_14
    instance-of v10, v9, Lca/c;

    .line 556
    .line 557
    if-eqz v10, :cond_12

    .line 558
    .line 559
    check-cast v9, Lca/c;

    .line 560
    .line 561
    invoke-interface {v9, v5}, Lca/c;->l(Z)V

    .line 562
    .line 563
    .line 564
    goto :goto_6

    .line 565
    :cond_15
    new-instance v3, Ljava/lang/StringBuilder;

    .line 566
    .line 567
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 568
    .line 569
    .line 570
    const-string v4, "WriteFunction:Color -> color:"

    .line 571
    .line 572
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 582
    .line 583
    .line 584
    move-result-object v4

    .line 585
    new-instance v7, Ljava/util/ArrayList;

    .line 586
    .line 587
    invoke-static {v4, v6}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 588
    .line 589
    .line 590
    move-result v6

    .line 591
    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 595
    .line 596
    .line 597
    move-result v6

    .line 598
    move v8, v2

    .line 599
    :goto_8
    if-ge v8, v6, :cond_16

    .line 600
    .line 601
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v9

    .line 605
    add-int/lit8 v8, v8, 0x1

    .line 606
    .line 607
    check-cast v9, Lba/c;

    .line 608
    .line 609
    invoke-interface {v9}, Lba/c;->getId()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v9

    .line 613
    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    goto :goto_8

    .line 617
    :cond_16
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v0}, Lt9/a;->l()Lv9/c;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    invoke-interface {v3}, Lv9/c;->g()V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    invoke-interface {v3}, Lr9/b;->l()V

    .line 643
    .line 644
    .line 645
    iget-object v3, v0, Lt9/f;->t:Ljava/util/ArrayList;

    .line 646
    .line 647
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 648
    .line 649
    .line 650
    move-result v4

    .line 651
    move v6, v2

    .line 652
    :cond_17
    if-ge v6, v4, :cond_18

    .line 653
    .line 654
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v7

    .line 658
    add-int/lit8 v6, v6, 0x1

    .line 659
    .line 660
    move-object v8, v7

    .line 661
    check-cast v8, Ls9/c;

    .line 662
    .line 663
    instance-of v8, v8, Ls9/c$g;

    .line 664
    .line 665
    if-eqz v8, :cond_17

    .line 666
    .line 667
    move-object v4, v7

    .line 668
    goto :goto_9

    .line 669
    :cond_18
    const/4 v4, 0x0

    .line 670
    :goto_9
    check-cast v4, Ls9/c;

    .line 671
    .line 672
    if-eqz v4, :cond_19

    .line 673
    .line 674
    check-cast v4, Ls9/c$g;

    .line 675
    .line 676
    invoke-virtual {v4, v1}, Ls9/c$g;->g(I)V

    .line 677
    .line 678
    .line 679
    :cond_19
    invoke-virtual {v0, v2}, Lt9/a;->P(Z)V

    .line 680
    .line 681
    .line 682
    return v5

    .line 683
    :cond_1a
    return v2
.end method
