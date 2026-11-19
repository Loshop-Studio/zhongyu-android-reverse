.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;
.super Lt9/a;
.source "SourceFile"


# instance fields
.field public final s:Ljava/util/ArrayList;

.field public final t:Ljava/util/ArrayList;

.field public final u:Landroid/graphics/RectF;

.field public final v:Landroid/graphics/RectF;

.field public final w:Ljava/util/ArrayList;

.field public x:F


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
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->s:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->t:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance p1, Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->u:Landroid/graphics/RectF;

    .line 29
    .line 30
    new-instance p1, Landroid/graphics/RectF;

    .line 31
    .line 32
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Landroid/graphics/RectF;

    .line 36
    .line 37
    new-instance p1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->w:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->a0()V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->Z()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static final synthetic S(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->V(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic T(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->b0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final U()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->p()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Lt9/a;->t()Landroid/graphics/RectF;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p0}, Lt9/a;->m()Landroid/graphics/RectF;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0, v0, v1, v2}, Lt9/a;->k(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p0, v0}, Lt9/a;->J(Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->R()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private final W()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method private final Z()V
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
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->s:Ljava/util/ArrayList;

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
    iget-object v11, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->t:Ljava/util/ArrayList;

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Landroid/graphics/RectF;

    .line 134
    .line 135
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1}, Lq9/b;->E()F

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    const/high16 v2, 0x41c00000    # 24.0f

    .line 144
    .line 145
    sub-float/2addr v1, v2

    .line 146
    div-float/2addr v1, v3

    .line 147
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-virtual {v4}, Lq9/b;->E()F

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    sub-float/2addr v4, v2

    .line 156
    div-float/2addr v4, v3

    .line 157
    add-float/2addr v4, v2

    .line 158
    const/high16 v5, 0x42000000    # 32.0f

    .line 159
    .line 160
    const/high16 v8, 0x42600000    # 56.0f

    .line 161
    .line 162
    invoke-virtual {v0, v5, v1, v8, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->u:Landroid/graphics/RectF;

    .line 166
    .line 167
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v1}, Lq9/b;->E()F

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    sub-float/2addr v1, v2

    .line 176
    div-float/2addr v1, v3

    .line 177
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    invoke-virtual {v4}, Lq9/b;->E()F

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    sub-float/2addr v4, v2

    .line 186
    div-float/2addr v4, v3

    .line 187
    add-float/2addr v4, v2

    .line 188
    const/high16 v2, 0x42f40000    # 122.0f

    .line 189
    .line 190
    const/high16 v5, 0x43120000    # 146.0f

    .line 191
    .line 192
    invoke-virtual {v0, v2, v1, v5, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0}, Lq9/b;->E()F

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    const/high16 v1, 0x42180000    # 38.0f

    .line 204
    .line 205
    sub-float/2addr v0, v1

    .line 206
    div-float/2addr v0, v3

    .line 207
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v2}, Lq9/b;->E()F

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    sub-float/2addr v2, v1

    .line 216
    div-float/2addr v2, v3

    .line 217
    add-float/2addr v2, v1

    .line 218
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v3}, Lq9/b;->I()Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    :goto_2
    if-ge v7, v3, :cond_3

    .line 231
    .line 232
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->w:Ljava/util/ArrayList;

    .line 233
    .line 234
    new-instance v5, Landroid/graphics/RectF;

    .line 235
    .line 236
    const/high16 v8, 0x42740000    # 61.0f

    .line 237
    .line 238
    int-to-float v9, v7

    .line 239
    mul-float/2addr v9, v8

    .line 240
    add-float/2addr v9, v6

    .line 241
    add-float v8, v9, v1

    .line 242
    .line 243
    invoke-direct {v5, v9, v0, v8, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    add-int/lit8 v7, v7, 0x1

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_3
    return-void
.end method

.method private final a0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->s:Ljava/util/ArrayList;

    .line 7
    .line 8
    new-instance v1, Ls9/c$f;

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->W()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v3}, Lq9/b;->I()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-direct {v1, v2, v3}, Ls9/c$f;-><init>(ZI)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->s:Ljava/util/ArrayList;

    .line 40
    .line 41
    sget-object v1, Ls9/c$a;->c:Ls9/c$a;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public A(FF)Z
    .locals 11

    .line 1
    invoke-super {p0, p1, p2}, Lt9/a;->A(FF)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lt9/a;->e()Ls9/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    sget-object v1, Ls9/b$c$c;->a:Ls9/b$c$c;

    .line 14
    .line 15
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return p1

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->X(F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->b0()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->U()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lba/c;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Lt9/a;->l()Lv9/c;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    move-object v2, p1

    .line 49
    check-cast v2, Lca/d;

    .line 50
    .line 51
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->f()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    const/16 v9, 0x40

    .line 72
    .line 73
    const/4 v10, 0x0

    .line 74
    const/4 v8, 0x0

    .line 75
    invoke-static/range {v1 .. v10}, Lv9/c$a;->d(Lv9/c;Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    return v0
.end method

.method public F(FF)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lt9/d;->e()Landroid/graphics/RectF;

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->s:Ljava/util/ArrayList;

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
    instance-of v6, v6, Ls9/c$f;

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
    invoke-virtual {v0}, Lt9/d;->f()Landroid/graphics/RectF;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    sget-object p1, Ls9/b$i$a;->a:Ls9/b$i$a;

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 100
    .line 101
    .line 102
    return v2

    .line 103
    :cond_4
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Lt9/d;->g()Landroid/graphics/RectF;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_5

    .line 116
    .line 117
    sget-object p1, Ls9/b$i$b;->a:Ls9/b$i$b;

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 120
    .line 121
    .line 122
    return v2

    .line 123
    :cond_5
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    move v3, v1

    .line 136
    :goto_1
    if-ge v3, v0, :cond_7

    .line 137
    .line 138
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v4}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    check-cast v4, Landroid/graphics/RectF;

    .line 151
    .line 152
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_6

    .line 157
    .line 158
    new-instance p1, Ls9/b$a;

    .line 159
    .line 160
    invoke-direct {p1, v3}, Ls9/b$a;-><init>(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 164
    .line 165
    .line 166
    return v2

    .line 167
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_7
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    const/4 v3, 0x2

    .line 179
    new-array v4, v3, [F

    .line 180
    .line 181
    aput p1, v4, v1

    .line 182
    .line 183
    aput p2, v4, v2

    .line 184
    .line 185
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 186
    .line 187
    .line 188
    aget p1, v4, v1

    .line 189
    .line 190
    aget p2, v4, v2

    .line 191
    .line 192
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {v4}, Lq9/b;->H()F

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    new-instance v4, Landroid/graphics/RectF;

    .line 205
    .line 206
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 211
    .line 212
    int-to-float v3, v3

    .line 213
    div-float/2addr v0, v3

    .line 214
    sub-float/2addr v5, v0

    .line 215
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    sub-float/2addr v3, v0

    .line 224
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    iget v6, v6, Landroid/graphics/RectF;->right:F

    .line 229
    .line 230
    add-float/2addr v6, v0

    .line 231
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerY()F

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    add-float/2addr v7, v0

    .line 240
    invoke-direct {v4, v5, v3, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 241
    .line 242
    .line 243
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->W()Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_8

    .line 248
    .line 249
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-eqz v0, :cond_8

    .line 254
    .line 255
    sget-object p1, Ls9/b$c$c;->a:Ls9/b$c$c;

    .line 256
    .line 257
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 258
    .line 259
    .line 260
    return v2

    .line 261
    :cond_8
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    if-eqz p1, :cond_9

    .line 270
    .line 271
    sget-object p1, Ls9/b$b;->a:Ls9/b$b;

    .line 272
    .line 273
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 274
    .line 275
    .line 276
    return v2

    .line 277
    :cond_9
    sget-object p1, Ls9/b$f;->a:Ls9/b$f;

    .line 278
    .line 279
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 280
    .line 281
    .line 282
    return v1
.end method

.method public H()V
    .locals 0

    .line 1
    invoke-super {p0}, Lt9/a;->H()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->a0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public L(Ljava/util/List;)V
    .locals 5

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->s:Ljava/util/ArrayList;

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
    :cond_0
    if-ge v2, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    move-object v4, v3

    .line 25
    check-cast v4, Ls9/c;

    .line 26
    .line 27
    instance-of v4, v4, Ls9/c$f;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v3, 0x0

    .line 33
    :goto_0
    check-cast v3, Ls9/c;

    .line 34
    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    check-cast v3, Ls9/c$f;

    .line 38
    .line 39
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->W()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {v3, v0}, Ls9/c$f;->g(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ls9/c$f;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const v1, 0x7fffffff

    .line 51
    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-static {p1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v0, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.TextGraph"

    .line 60
    .line 61
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    check-cast p1, Lca/d;

    .line 65
    .line 66
    invoke-virtual {p1}, Lca/d;->F()Landroid/graphics/Paint;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    :cond_2
    invoke-virtual {v3, v1}, Ls9/c$f;->f(I)V

    .line 77
    .line 78
    .line 79
    :cond_3
    return-void
.end method

.method public R()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lt9/d;->e()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 14
    .line 15
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->t:Ljava/util/ArrayList;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Landroid/graphics/RectF;

    .line 23
    .line 24
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 25
    .line 26
    add-float/2addr v2, v3

    .line 27
    const/high16 v3, 0x41700000    # 15.0f

    .line 28
    .line 29
    sub-float/2addr v2, v3

    .line 30
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 35
    .line 36
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    iget v6, v6, Landroid/graphics/RectF;->left:F

    .line 41
    .line 42
    iget-object v7, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->t:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    check-cast v7, Landroid/graphics/RectF;

    .line 49
    .line 50
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 51
    .line 52
    add-float/2addr v6, v7

    .line 53
    add-float/2addr v6, v3

    .line 54
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 59
    .line 60
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-virtual {v8}, Lq9/b;->E()F

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    add-float/2addr v7, v8

    .line 69
    invoke-virtual {v1, v2, v5, v6, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 81
    .line 82
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->t:Ljava/util/ArrayList;

    .line 83
    .line 84
    const/4 v6, 0x1

    .line 85
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    check-cast v5, Landroid/graphics/RectF;

    .line 90
    .line 91
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 92
    .line 93
    add-float/2addr v2, v5

    .line 94
    sub-float/2addr v2, v3

    .line 95
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 100
    .line 101
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 106
    .line 107
    iget-object v8, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->t:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    check-cast v6, Landroid/graphics/RectF;

    .line 114
    .line 115
    iget v6, v6, Landroid/graphics/RectF;->right:F

    .line 116
    .line 117
    add-float/2addr v7, v6

    .line 118
    add-float/2addr v7, v3

    .line 119
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 124
    .line 125
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-virtual {v6}, Lq9/b;->E()F

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    add-float/2addr v3, v6

    .line 134
    invoke-virtual {v1, v2, v5, v7, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Lt9/d;->g()Landroid/graphics/RectF;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 146
    .line 147
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Landroid/graphics/RectF;

    .line 148
    .line 149
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 150
    .line 151
    add-float/2addr v2, v3

    .line 152
    const/high16 v3, 0x42000000    # 32.0f

    .line 153
    .line 154
    sub-float/2addr v2, v3

    .line 155
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 160
    .line 161
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {v6}, Lq9/b;->E()F

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    add-float/2addr v5, v6

    .line 170
    const/high16 v6, 0x41500000    # 13.0f

    .line 171
    .line 172
    add-float/2addr v5, v6

    .line 173
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 178
    .line 179
    iget-object v8, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Landroid/graphics/RectF;

    .line 180
    .line 181
    iget v8, v8, Landroid/graphics/RectF;->right:F

    .line 182
    .line 183
    add-float/2addr v7, v8

    .line 184
    add-float/2addr v7, v3

    .line 185
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    iget v8, v8, Landroid/graphics/RectF;->top:F

    .line 190
    .line 191
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    invoke-virtual {v9}, Lq9/b;->E()F

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    const/4 v10, 0x2

    .line 200
    int-to-float v10, v10

    .line 201
    mul-float/2addr v9, v10

    .line 202
    add-float/2addr v8, v9

    .line 203
    add-float/2addr v8, v6

    .line 204
    invoke-virtual {v1, v2, v5, v7, v8}, Landroid/graphics/RectF;->set(FFFF)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Lt9/d;->f()Landroid/graphics/RectF;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 216
    .line 217
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->u:Landroid/graphics/RectF;

    .line 218
    .line 219
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 220
    .line 221
    add-float/2addr v2, v5

    .line 222
    sub-float/2addr v2, v3

    .line 223
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 228
    .line 229
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-virtual {v7}, Lq9/b;->E()F

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    add-float/2addr v5, v7

    .line 238
    add-float/2addr v5, v6

    .line 239
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 244
    .line 245
    iget-object v8, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->u:Landroid/graphics/RectF;

    .line 246
    .line 247
    iget v8, v8, Landroid/graphics/RectF;->right:F

    .line 248
    .line 249
    add-float/2addr v7, v8

    .line 250
    add-float/2addr v7, v3

    .line 251
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 256
    .line 257
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    invoke-virtual {v8}, Lq9/b;->E()F

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    mul-float/2addr v8, v10

    .line 266
    add-float/2addr v3, v8

    .line 267
    add-float/2addr v3, v6

    .line 268
    invoke-virtual {v1, v2, v5, v7, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 276
    .line 277
    .line 278
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->w:Ljava/util/ArrayList;

    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    move v3, v4

    .line 285
    :goto_0
    if-ge v3, v2, :cond_0

    .line 286
    .line 287
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    add-int/lit8 v3, v3, 0x1

    .line 292
    .line 293
    check-cast v5, Landroid/graphics/RectF;

    .line 294
    .line 295
    invoke-virtual {v0}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    new-instance v8, Landroid/graphics/RectF;

    .line 300
    .line 301
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    iget v9, v9, Landroid/graphics/RectF;->left:F

    .line 306
    .line 307
    iget v11, v5, Landroid/graphics/RectF;->left:F

    .line 308
    .line 309
    add-float/2addr v9, v11

    .line 310
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 311
    .line 312
    .line 313
    move-result-object v11

    .line 314
    iget v11, v11, Landroid/graphics/RectF;->top:F

    .line 315
    .line 316
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 317
    .line 318
    .line 319
    move-result-object v12

    .line 320
    invoke-virtual {v12}, Lq9/b;->E()F

    .line 321
    .line 322
    .line 323
    move-result v12

    .line 324
    add-float/2addr v12, v6

    .line 325
    mul-float/2addr v12, v10

    .line 326
    add-float/2addr v11, v12

    .line 327
    iget v12, v5, Landroid/graphics/RectF;->top:F

    .line 328
    .line 329
    add-float/2addr v11, v12

    .line 330
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 331
    .line 332
    .line 333
    move-result-object v12

    .line 334
    iget v12, v12, Landroid/graphics/RectF;->left:F

    .line 335
    .line 336
    iget v13, v5, Landroid/graphics/RectF;->right:F

    .line 337
    .line 338
    add-float/2addr v12, v13

    .line 339
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 340
    .line 341
    .line 342
    move-result-object v13

    .line 343
    iget v13, v13, Landroid/graphics/RectF;->top:F

    .line 344
    .line 345
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 346
    .line 347
    .line 348
    move-result-object v14

    .line 349
    invoke-virtual {v14}, Lq9/b;->E()F

    .line 350
    .line 351
    .line 352
    move-result v14

    .line 353
    add-float/2addr v14, v6

    .line 354
    mul-float/2addr v14, v10

    .line 355
    add-float/2addr v13, v14

    .line 356
    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    .line 357
    .line 358
    add-float/2addr v13, v5

    .line 359
    invoke-direct {v8, v9, v11, v12, v13}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    goto :goto_0

    .line 366
    :cond_0
    invoke-virtual {p0}, Lt9/a;->G()Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-nez v1, :cond_1

    .line 371
    .line 372
    invoke-virtual {v0}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 377
    .line 378
    invoke-virtual {v0}, Lt9/d;->e()Landroid/graphics/RectF;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 383
    .line 384
    sub-float/2addr v1, v2

    .line 385
    const/high16 v2, 0x41800000    # 16.0f

    .line 386
    .line 387
    add-float/2addr v1, v2

    .line 388
    invoke-virtual {v0}, Lt9/d;->e()Landroid/graphics/RectF;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    sub-float/2addr v3, v1

    .line 401
    const/4 v5, 0x0

    .line 402
    invoke-virtual {v2, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    sub-float/2addr v3, v1

    .line 418
    invoke-virtual {v2, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0}, Lt9/d;->f()Landroid/graphics/RectF;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 426
    .line 427
    invoke-virtual {v0}, Lt9/d;->g()Landroid/graphics/RectF;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 432
    .line 433
    sub-float/2addr v1, v2

    .line 434
    invoke-virtual {v0}, Lt9/d;->g()Landroid/graphics/RectF;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 443
    .line 444
    .line 445
    move-result v3

    .line 446
    sub-float/2addr v3, v1

    .line 447
    invoke-virtual {v2, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Lt9/d;->f()Landroid/graphics/RectF;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 455
    .line 456
    .line 457
    move-result-object v3

    .line 458
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 459
    .line 460
    .line 461
    move-result v3

    .line 462
    sub-float/2addr v3, v1

    .line 463
    invoke-virtual {v2, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    invoke-static {v1}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    check-cast v1, Landroid/graphics/RectF;

    .line 475
    .line 476
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 477
    .line 478
    invoke-virtual {v0}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    invoke-static {v2}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    check-cast v2, Landroid/graphics/RectF;

    .line 487
    .line 488
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 489
    .line 490
    sub-float/2addr v1, v2

    .line 491
    const/high16 v2, 0x42380000    # 46.0f

    .line 492
    .line 493
    add-float/2addr v1, v2

    .line 494
    invoke-virtual {v0}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    :goto_1
    if-ge v4, v2, :cond_1

    .line 503
    .line 504
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    add-int/lit8 v4, v4, 0x1

    .line 509
    .line 510
    check-cast v3, Landroid/graphics/RectF;

    .line 511
    .line 512
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 513
    .line 514
    .line 515
    move-result-object v6

    .line 516
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 517
    .line 518
    .line 519
    move-result v6

    .line 520
    sub-float/2addr v6, v1

    .line 521
    invoke-virtual {v3, v6, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 522
    .line 523
    .line 524
    goto :goto_1

    .line 525
    :cond_1
    return-void
.end method

.method public final V(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 12
    .line 13
    sub-float/2addr v0, v1

    .line 14
    sget-object v1, Lna/t;->a:Lna/t;

    .line 15
    .line 16
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v1, p1, p2, v2}, Lna/t;->a(Ljava/lang/String;Landroid/graphics/Paint;F)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    int-to-float p1, p1

    .line 29
    mul-float/2addr v0, p1

    .line 30
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Lq9/b;->f()Landroid/graphics/RectF;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    cmpl-float p1, v0, p1

    .line 43
    .line 44
    if-lez p1, :cond_0

    .line 45
    .line 46
    iget p1, p3, Landroid/graphics/RectF;->top:F

    .line 47
    .line 48
    add-float/2addr v0, p1

    .line 49
    iput v0, p3, Landroid/graphics/RectF;->bottom:F

    .line 50
    .line 51
    return-object p3

    .line 52
    :cond_0
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lq9/b;->f()Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iget p2, p3, Landroid/graphics/RectF;->top:F

    .line 65
    .line 66
    add-float/2addr p1, p2

    .line 67
    iput p1, p3, Landroid/graphics/RectF;->bottom:F

    .line 68
    .line 69
    return-object p3
.end method

.method public final X(F)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lt9/a;->h()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-float/2addr p1, v0

    .line 6
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lba/c;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    check-cast v0, Lca/d;

    .line 19
    .line 20
    new-instance v1, Landroid/graphics/Matrix;

    .line 21
    .line 22
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lt9/a;->o()Lu9/a;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 41
    .line 42
    .line 43
    iget v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->x:F

    .line 44
    .line 45
    add-float/2addr v2, p1

    .line 46
    invoke-virtual {v0}, Lca/d;->F()Landroid/graphics/Paint;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lca/d;->E()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v3}, Lqd/e0;->g1(Ljava/lang/CharSequence;)C

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3}, Lq9/b;->H()F

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    const/4 v4, 0x2

    .line 85
    int-to-float v4, v4

    .line 86
    mul-float/2addr v3, v4

    .line 87
    cmpg-float v3, v2, v3

    .line 88
    .line 89
    if-lez v3, :cond_1

    .line 90
    .line 91
    cmpg-float p1, v2, p1

    .line 92
    .line 93
    if-gtz p1, :cond_0

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-static {v1}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1, v2}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    new-instance v1, Landroid/graphics/RectF;

    .line 105
    .line 106
    invoke-virtual {v0}, Lba/a;->g()Landroid/graphics/RectF;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-direct {v1, v2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 111
    .line 112
    .line 113
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 114
    .line 115
    add-float/2addr v2, p1

    .line 116
    iput v2, v1, Landroid/graphics/RectF;->right:F

    .line 117
    .line 118
    invoke-virtual {v0}, Lca/d;->E()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lca/d;->F()Landroid/graphics/Paint;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, p1, v2, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->V(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->p(Landroid/graphics/RectF;)V

    .line 137
    .line 138
    .line 139
    :cond_1
    :goto_0
    return-void
.end method

.method public final Y(F)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "TextFunction:TextSize -> offset:"

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v3, " list: "

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, Ljava/util/ArrayList;

    .line 28
    .line 29
    const/16 v5, 0xa

    .line 30
    .line 31
    invoke-static {v3, v5}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    const/4 v6, 0x0

    .line 43
    move v7, v6

    .line 44
    :goto_0
    if-ge v7, v5, :cond_0

    .line 45
    .line 46
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    add-int/lit8 v7, v7, 0x1

    .line 51
    .line 52
    check-cast v8, Lba/c;

    .line 53
    .line 54
    invoke-interface {v8}, Lba/c;->getId()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    move v4, v6

    .line 85
    :cond_1
    :goto_1
    if-ge v4, v3, :cond_7

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    add-int/lit8 v4, v4, 0x1

    .line 92
    .line 93
    move-object v8, v5

    .line 94
    check-cast v8, Lba/c;

    .line 95
    .line 96
    instance-of v5, v8, Lca/d;

    .line 97
    .line 98
    if-eqz v5, :cond_1

    .line 99
    .line 100
    move-object v5, v8

    .line 101
    check-cast v5, Lca/d;

    .line 102
    .line 103
    invoke-virtual {v5}, Lca/d;->F()Landroid/graphics/Paint;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    if-eqz v7, :cond_1

    .line 108
    .line 109
    new-instance v9, Landroid/graphics/Matrix;

    .line 110
    .line 111
    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-interface {v8}, Lba/c;->b()Landroid/graphics/Matrix;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-virtual {v9, v10}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lt9/a;->o()Lu9/a;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    invoke-virtual {v10}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-virtual {v9, v10}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7}, Landroid/graphics/Paint;->getTextSize()F

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    invoke-virtual {v9, v10}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    add-float/2addr v10, v1

    .line 141
    const/4 v11, 0x0

    .line 142
    cmpg-float v12, v1, v11

    .line 143
    .line 144
    if-gez v12, :cond_2

    .line 145
    .line 146
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    invoke-virtual {v12}, Lq9/b;->d()F

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    cmpg-float v12, v10, v12

    .line 155
    .line 156
    if-ltz v12, :cond_1

    .line 157
    .line 158
    :cond_2
    cmpl-float v11, v1, v11

    .line 159
    .line 160
    if-lez v11, :cond_3

    .line 161
    .line 162
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    invoke-virtual {v11}, Lq9/b;->c()F

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    cmpl-float v11, v10, v11

    .line 171
    .line 172
    if-lez v11, :cond_3

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_3
    invoke-static {v9}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-virtual {v9, v10}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    invoke-virtual {v7, v9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5, v7}, Lca/d;->H(Landroid/graphics/Paint;)V

    .line 187
    .line 188
    .line 189
    new-instance v9, Landroid/graphics/RectF;

    .line 190
    .line 191
    invoke-interface {v8}, Lba/c;->g()Landroid/graphics/RectF;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-direct {v9, v11}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5}, Lca/d;->E()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v11

    .line 202
    const-string v12, ""

    .line 203
    .line 204
    if-nez v11, :cond_4

    .line 205
    .line 206
    move-object v11, v12

    .line 207
    :cond_4
    invoke-virtual {v5}, Lca/d;->F()Landroid/graphics/Paint;

    .line 208
    .line 209
    .line 210
    move-result-object v13

    .line 211
    invoke-static {v13}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v11, v13, v9}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->V(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5, v9}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->p(Landroid/graphics/RectF;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    invoke-interface {v11}, Lr9/b;->d()Lma/e;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    if-eqz v11, :cond_5

    .line 229
    .line 230
    invoke-interface {v11, v10}, Lma/e;->a(F)V

    .line 231
    .line 232
    .line 233
    :cond_5
    invoke-virtual {v0}, Lt9/a;->l()Lv9/c;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    invoke-interface {v8}, Lba/c;->getId()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    invoke-virtual {v5}, Lca/d;->E()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    if-nez v5, :cond_6

    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_6
    move-object v12, v5

    .line 249
    :goto_2
    invoke-interface {v8}, Lba/c;->g()Landroid/graphics/RectF;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-interface {v10, v11, v12, v7, v5}, Lv9/c;->C(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    move-object v10, v9

    .line 261
    sget-object v9, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->i:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 262
    .line 263
    new-instance v12, Landroid/graphics/Paint;

    .line 264
    .line 265
    invoke-direct {v12, v7}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 266
    .line 267
    .line 268
    const/16 v16, 0xe8

    .line 269
    .line 270
    const/16 v17, 0x0

    .line 271
    .line 272
    const/4 v11, 0x0

    .line 273
    const/4 v13, 0x0

    .line 274
    const/4 v14, 0x0

    .line 275
    const/4 v15, 0x0

    .line 276
    move-object v7, v5

    .line 277
    invoke-static/range {v7 .. v17}, Lr9/b$a;->a(Lr9/b;Lba/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_1

    .line 281
    .line 282
    :cond_7
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-interface {v1}, Lr9/b;->l()V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->b0()V

    .line 290
    .line 291
    .line 292
    const/4 v1, 0x0

    .line 293
    const/4 v2, 0x1

    .line 294
    invoke-static {v0, v6, v2, v1}, Lt9/a;->Q(Lt9/a;ZILjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    return-void
.end method

.method public final b0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    check-cast v3, Lba/c;

    .line 26
    .line 27
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {p0}, Lt9/a;->o()Lu9/a;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-interface {v3, v5}, Lba/c;->j(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v4, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p0}, Lt9/a;->u()Landroid/graphics/Matrix;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public f()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Landroid/graphics/RectF;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->t:Ljava/util/ArrayList;

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
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->w:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {v1}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/graphics/RectF;

    .line 24
    .line 25
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 26
    .line 27
    const/high16 v2, 0x41b80000    # 23.0f

    .line 28
    .line 29
    add-float/2addr v1, v2

    .line 30
    const/high16 v2, 0x43320000    # 178.0f

    .line 31
    .line 32
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Lq9/b;->E()F

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/4 v2, 0x3

    .line 49
    int-to-float v2, v2

    .line 50
    mul-float/2addr v1, v2

    .line 51
    const/high16 v2, 0x41d00000    # 26.0f

    .line 52
    .line 53
    add-float/2addr v1, v2

    .line 54
    new-instance v2, Landroid/graphics/RectF;

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {v2, v3, v3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 58
    .line 59
    .line 60
    return-object v2
.end method

.method public w(FF)Z
    .locals 20

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
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x1

    .line 19
    if-eqz v3, :cond_5

    .line 20
    .line 21
    invoke-virtual {v0}, Lt9/a;->e()Ls9/b;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function"

    .line 26
    .line 27
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast v1, Ls9/b$d;

    .line 31
    .line 32
    invoke-virtual {v1}, Ls9/b$d;->a()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-eq v1, v5, :cond_1

    .line 39
    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_1
    invoke-virtual {v0}, Lt9/a;->l()Lv9/c;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v1, v2}, Lv9/c;->p(Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lt9/a;->l()Lv9/c;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Lv9/c;->e()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    invoke-interface {v1, v2, v3, v4}, Lr9/b;->o(Ljava/util/List;J)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-interface {v1}, Lr9/b;->l()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->H()V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_2

    .line 86
    .line 87
    :cond_2
    iget-object v1, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->s:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    move v6, v2

    .line 94
    :cond_3
    if-ge v6, v3, :cond_4

    .line 95
    .line 96
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    add-int/lit8 v6, v6, 0x1

    .line 101
    .line 102
    move-object v8, v7

    .line 103
    check-cast v8, Ls9/c;

    .line 104
    .line 105
    instance-of v8, v8, Ls9/c$f;

    .line 106
    .line 107
    if-eqz v8, :cond_3

    .line 108
    .line 109
    move-object v4, v7

    .line 110
    :cond_4
    check-cast v4, Ls9/c;

    .line 111
    .line 112
    if-eqz v4, :cond_f

    .line 113
    .line 114
    invoke-virtual {v4}, Ls9/c;->b()Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    xor-int/2addr v1, v5

    .line 119
    invoke-virtual {v4, v1}, Ls9/c;->c(Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v2}, Lt9/a;->P(Z)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_2

    .line 126
    .line 127
    :cond_5
    instance-of v3, v1, Ls9/b$i$a;

    .line 128
    .line 129
    if-eqz v3, :cond_6

    .line 130
    .line 131
    const/high16 v1, 0x40800000    # 4.0f

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->Y(F)V

    .line 134
    .line 135
    .line 136
    goto/16 :goto_2

    .line 137
    .line 138
    :cond_6
    instance-of v3, v1, Ls9/b$i$b;

    .line 139
    .line 140
    if-eqz v3, :cond_7

    .line 141
    .line 142
    const/high16 v1, -0x3f800000    # -4.0f

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->Y(F)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_2

    .line 148
    .line 149
    :cond_7
    instance-of v1, v1, Ls9/b$a;

    .line 150
    .line 151
    if-eqz v1, :cond_f

    .line 152
    .line 153
    invoke-virtual {v0}, Lt9/a;->e()Ls9/b;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color"

    .line 158
    .line 159
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    check-cast v1, Ls9/b$a;

    .line 163
    .line 164
    invoke-virtual {v1}, Ls9/b$a;->a()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v3}, Lq9/b;->I()Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    check-cast v1, Ljava/lang/Number;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    move v7, v2

    .line 195
    :cond_8
    :goto_0
    if-ge v7, v6, :cond_9

    .line 196
    .line 197
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    add-int/lit8 v7, v7, 0x1

    .line 202
    .line 203
    move-object v10, v8

    .line 204
    check-cast v10, Lba/c;

    .line 205
    .line 206
    instance-of v8, v10, Lca/d;

    .line 207
    .line 208
    if-eqz v8, :cond_8

    .line 209
    .line 210
    move-object v8, v10

    .line 211
    check-cast v8, Lca/d;

    .line 212
    .line 213
    invoke-virtual {v8}, Lca/d;->F()Landroid/graphics/Paint;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    if-eqz v9, :cond_8

    .line 218
    .line 219
    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v8, v9}, Lca/d;->H(Landroid/graphics/Paint;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    sget-object v11, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->i:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 230
    .line 231
    new-instance v14, Landroid/graphics/Paint;

    .line 232
    .line 233
    invoke-direct {v14, v9}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 234
    .line 235
    .line 236
    const/16 v18, 0xec

    .line 237
    .line 238
    const/16 v19, 0x0

    .line 239
    .line 240
    const/4 v12, 0x0

    .line 241
    const/4 v13, 0x0

    .line 242
    const/4 v15, 0x0

    .line 243
    const/16 v16, 0x0

    .line 244
    .line 245
    const/16 v17, 0x0

    .line 246
    .line 247
    move-object v9, v8

    .line 248
    invoke-static/range {v9 .. v19}, Lr9/b$a;->a(Lr9/b;Lba/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    goto :goto_0

    .line 252
    :cond_9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    const-string v6, "TextFunction:TextColor -> color:"

    .line 258
    .line 259
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const-string v6, " list: "

    .line 266
    .line 267
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    new-instance v7, Ljava/util/ArrayList;

    .line 275
    .line 276
    const/16 v8, 0xa

    .line 277
    .line 278
    invoke-static {v6, v8}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 286
    .line 287
    .line 288
    move-result v8

    .line 289
    move v9, v2

    .line 290
    :goto_1
    if-ge v9, v8, :cond_a

    .line 291
    .line 292
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v10

    .line 296
    add-int/lit8 v9, v9, 0x1

    .line 297
    .line 298
    check-cast v10, Lba/c;

    .line 299
    .line 300
    invoke-interface {v10}, Lba/c;->getId()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    invoke-interface {v7, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    goto :goto_1

    .line 308
    :cond_a
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    invoke-interface {v3}, Lr9/b;->d()Lma/e;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    if-eqz v3, :cond_b

    .line 331
    .line 332
    invoke-interface {v3, v1}, Lma/e;->d(I)V

    .line 333
    .line 334
    .line 335
    :cond_b
    invoke-virtual {v0}, Lt9/a;->l()Lv9/c;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-interface {v3}, Lv9/c;->g()V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    invoke-interface {v3}, Lr9/b;->l()V

    .line 347
    .line 348
    .line 349
    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->s:Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    move v7, v2

    .line 356
    :cond_c
    if-ge v7, v6, :cond_d

    .line 357
    .line 358
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    add-int/lit8 v7, v7, 0x1

    .line 363
    .line 364
    move-object v9, v8

    .line 365
    check-cast v9, Ls9/c;

    .line 366
    .line 367
    instance-of v9, v9, Ls9/c$f;

    .line 368
    .line 369
    if-eqz v9, :cond_c

    .line 370
    .line 371
    move-object v4, v8

    .line 372
    :cond_d
    check-cast v4, Ls9/c;

    .line 373
    .line 374
    if-eqz v4, :cond_e

    .line 375
    .line 376
    check-cast v4, Ls9/c$f;

    .line 377
    .line 378
    invoke-virtual {v4, v1}, Ls9/c$f;->f(I)V

    .line 379
    .line 380
    .line 381
    :cond_e
    invoke-virtual {v0, v2}, Lt9/a;->P(Z)V

    .line 382
    .line 383
    .line 384
    :cond_f
    :goto_2
    return v5
.end method

.method public x(FF)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lt9/a;->e()Ls9/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object p2, Ls9/b$b;->a:Ls9/b$b;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 p2, 0x0

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lba/c;

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    check-cast p1, Lca/d;

    .line 27
    .line 28
    invoke-virtual {p1}, Lca/d;->E()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    const-string p2, ""

    .line 35
    .line 36
    :cond_0
    new-instance v0, Landroid/graphics/RectF;

    .line 37
    .line 38
    invoke-virtual {p1}, Lba/a;->g()Landroid/graphics/RectF;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lq9/b;->K()Lma/j;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    new-instance v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$1;

    .line 56
    .line 57
    invoke-direct {v2, p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$1;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Lca/d;)V

    .line 58
    .line 59
    .line 60
    new-instance v3, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;

    .line 61
    .line 62
    invoke-direct {v3, p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Lca/d;)V

    .line 63
    .line 64
    .line 65
    new-instance v4, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;

    .line 66
    .line 67
    invoke-direct {v4, p1, p2, v0, p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;-><init>(Lca/d;Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1, p2, v2, v3, v4}, Lma/j;->a(Ljava/lang/String;Lhd/l;Lhd/l;Lhd/a;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    const/4 p1, 0x1

    .line 74
    return p1

    .line 75
    :cond_2
    return p2
.end method

.method public y(FF)Z
    .locals 12

    .line 1
    invoke-super {p0, p1, p2}, Lt9/a;->y(FF)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lt9/a;->e()Ls9/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    sget-object v1, Ls9/b$c$c;->a:Ls9/b$c$c;

    .line 14
    .line 15
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return p1

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->X(F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->b0()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->U()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    move-object v2, p1

    .line 41
    check-cast v2, Lba/c;

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, Lt9/a;->l()Lv9/c;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->f()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    const/16 v10, 0x20

    .line 70
    .line 71
    const/4 v11, 0x0

    .line 72
    const/4 v9, 0x0

    .line 73
    invoke-static/range {v3 .. v11}, Lv9/c$a;->b(Lv9/c;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lt9/a;->n()Lr9/b;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sget-object v3, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->i:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 81
    .line 82
    invoke-interface {v2}, Lba/c;->g()Landroid/graphics/RectF;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    const/16 v10, 0xf8

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    const/4 v6, 0x0

    .line 90
    const/4 v7, 0x0

    .line 91
    const/4 v8, 0x0

    .line 92
    invoke-static/range {v1 .. v11}, Lr9/b$a;->a(Lr9/b;Lba/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    invoke-virtual {p0}, Lt9/a;->n()Lr9/b;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-interface {p1}, Lr9/b;->l()V

    .line 100
    .line 101
    .line 102
    return v0
.end method

.method public z(FF)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Lt9/a;->e()Ls9/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object p2, Ls9/b$c$c;->a:Ls9/b$c$c;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lba/c;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    check-cast p1, Lca/d;

    .line 26
    .line 27
    new-instance p2, Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lt9/a;->o()Lu9/a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lba/a;->g()Landroid/graphics/RectF;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->x:F

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->b0()V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->U()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Lba/c;

    .line 79
    .line 80
    if-eqz p1, :cond_1

    .line 81
    .line 82
    invoke-virtual {p0}, Lt9/a;->l()Lv9/c;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    move-object v1, p1

    .line 87
    check-cast v1, Lca/d;

    .line 88
    .line 89
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->f()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    const/16 v8, 0x40

    .line 110
    .line 111
    const/4 v9, 0x0

    .line 112
    const/4 v7, 0x0

    .line 113
    invoke-static/range {v0 .. v9}, Lv9/c$a;->c(Lv9/c;Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_0
    const/4 p1, 0x0

    .line 118
    return p1

    .line 119
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 120
    return p1
.end method
