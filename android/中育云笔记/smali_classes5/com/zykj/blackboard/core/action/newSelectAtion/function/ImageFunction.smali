.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;
.super Lt9/a;
.source "SourceFile"


# instance fields
.field public final s:Ljava/util/ArrayList;

.field public final t:Ljava/util/ArrayList;


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
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->s:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->t:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->W()V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->V()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final synthetic S(Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->U()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic T(Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->X()V

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->p()Landroid/graphics/RectF;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->R()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private final V()V
    .locals 11

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
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->s:Ljava/util/ArrayList;

    .line 53
    .line 54
    new-instance v3, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    const/4 v6, 0x0

    .line 64
    move v7, v6

    .line 65
    :cond_0
    :goto_0
    if-ge v7, v5, :cond_1

    .line 66
    .line 67
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    add-int/lit8 v7, v7, 0x1

    .line 72
    .line 73
    move-object v9, v8

    .line 74
    check-cast v9, Ls9/c;

    .line 75
    .line 76
    invoke-virtual {v9}, Ls9/c;->a()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-lez v9, :cond_0

    .line 85
    .line 86
    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/high16 v5, 0x41b80000    # 23.0f

    .line 95
    .line 96
    :goto_1
    if-ge v6, v1, :cond_2

    .line 97
    .line 98
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    add-int/lit8 v6, v6, 0x1

    .line 103
    .line 104
    check-cast v7, Ls9/c;

    .line 105
    .line 106
    invoke-virtual {v7}, Ls9/c;->a()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    iget-object v8, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->t:Ljava/util/ArrayList;

    .line 115
    .line 116
    new-instance v9, Landroid/graphics/RectF;

    .line 117
    .line 118
    add-float v10, v5, v7

    .line 119
    .line 120
    invoke-direct {v9, v5, v2, v10, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    const/high16 v8, 0x41f00000    # 30.0f

    .line 127
    .line 128
    add-float/2addr v7, v8

    .line 129
    add-float/2addr v5, v7

    .line 130
    goto :goto_1

    .line 131
    :cond_2
    return-void
.end method

.method private final W()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->s:Ljava/util/ArrayList;

    .line 7
    .line 8
    sget-object v1, Ls9/c$d;->c:Ls9/c$d;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->s:Ljava/util/ArrayList;

    .line 14
    .line 15
    sget-object v1, Ls9/c$e;->c:Ls9/c$e;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->s:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v1, Ls9/c$c;

    .line 23
    .line 24
    invoke-direct {v1}, Ls9/c$c;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->s:Ljava/util/ArrayList;

    .line 31
    .line 32
    sget-object v1, Ls9/c$a;->c:Ls9/c$a;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private final X()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lba/c;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0}, Lba/c;->g()Landroid/graphics/RectF;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lt9/a;->u()Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Lba/c;->b()Landroid/graphics/Matrix;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lt9/a;->o()Lu9/a;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 47
    .line 48
    .line 49
    :cond_0
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
    invoke-virtual {v0}, Lt9/d;->d()Landroid/graphics/RectF;

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
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/4 v3, 0x2

    .line 58
    new-array v4, v3, [F

    .line 59
    .line 60
    aput p1, v4, v1

    .line 61
    .line 62
    aput p2, v4, v2

    .line 63
    .line 64
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 65
    .line 66
    .line 67
    aget p1, v4, v1

    .line 68
    .line 69
    aget p2, v4, v2

    .line 70
    .line 71
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4}, Lq9/b;->H()F

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    new-instance v4, Landroid/graphics/RectF;

    .line 84
    .line 85
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    int-to-float v3, v3

    .line 94
    div-float v6, v0, v3

    .line 95
    .line 96
    sub-float/2addr v5, v6

    .line 97
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 102
    .line 103
    const/4 v8, 0x5

    .line 104
    int-to-float v8, v8

    .line 105
    mul-float/2addr v8, v0

    .line 106
    div-float/2addr v8, v3

    .line 107
    sub-float/2addr v7, v8

    .line 108
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    add-float/2addr v8, v6

    .line 117
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 122
    .line 123
    const/4 v10, 0x3

    .line 124
    int-to-float v10, v10

    .line 125
    mul-float/2addr v0, v10

    .line 126
    div-float/2addr v0, v3

    .line 127
    sub-float/2addr v9, v0

    .line 128
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_2

    .line 136
    .line 137
    sget-object p1, Ls9/b$g;->a:Ls9/b$g;

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 140
    .line 141
    .line 142
    return v2

    .line 143
    :cond_2
    new-instance v0, Landroid/graphics/RectF;

    .line 144
    .line 145
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 150
    .line 151
    sub-float/2addr v3, v6

    .line 152
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 157
    .line 158
    sub-float/2addr v4, v6

    .line 159
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 164
    .line 165
    add-float/2addr v5, v6

    .line 166
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    .line 171
    .line 172
    add-float/2addr v7, v6

    .line 173
    invoke-direct {v0, v3, v4, v5, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_3

    .line 181
    .line 182
    sget-object p1, Ls9/b$h;->a:Ls9/b$h;

    .line 183
    .line 184
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 185
    .line 186
    .line 187
    return v2

    .line 188
    :cond_3
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    if-eqz p1, :cond_4

    .line 197
    .line 198
    sget-object p1, Ls9/b$b;->a:Ls9/b$b;

    .line 199
    .line 200
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 201
    .line 202
    .line 203
    return v2

    .line 204
    :cond_4
    sget-object p1, Ls9/b$f;->a:Ls9/b$f;

    .line 205
    .line 206
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 207
    .line 208
    .line 209
    return v1
.end method

.method public H()V
    .locals 0

    .line 1
    invoke-super {p0}, Lt9/a;->H()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->W()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public R()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lt9/d;->d()Landroid/graphics/RectF;

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
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->t:Ljava/util/ArrayList;

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
    iget-object v7, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->t:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Landroid/graphics/RectF;

    .line 49
    .line 50
    iget v4, v4, Landroid/graphics/RectF;->right:F

    .line 51
    .line 52
    add-float/2addr v6, v4

    .line 53
    add-float/2addr v6, v3

    .line 54
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 59
    .line 60
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    invoke-virtual {v7}, Lq9/b;->E()F

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    add-float/2addr v4, v7

    .line 69
    invoke-virtual {v1, v2, v5, v6, v4}, Landroid/graphics/RectF;->set(FFFF)V

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
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->t:Ljava/util/ArrayList;

    .line 83
    .line 84
    const/4 v5, 0x1

    .line 85
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, Landroid/graphics/RectF;

    .line 90
    .line 91
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 92
    .line 93
    add-float/2addr v2, v4

    .line 94
    sub-float/2addr v2, v3

    .line 95
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 100
    .line 101
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    iget v6, v6, Landroid/graphics/RectF;->left:F

    .line 106
    .line 107
    iget-object v7, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->t:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    check-cast v5, Landroid/graphics/RectF;

    .line 114
    .line 115
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 116
    .line 117
    add-float/2addr v6, v5

    .line 118
    add-float/2addr v6, v3

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
    move-result-object v5

    .line 129
    invoke-virtual {v5}, Lq9/b;->E()F

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    add-float/2addr v3, v5

    .line 134
    invoke-virtual {v1, v2, v4, v6, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Lt9/a;->G()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-nez v1, :cond_0

    .line 142
    .line 143
    invoke-virtual {v0}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 148
    .line 149
    invoke-virtual {v0}, Lt9/d;->d()Landroid/graphics/RectF;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 154
    .line 155
    sub-float/2addr v1, v2

    .line 156
    const/high16 v2, 0x41800000    # 16.0f

    .line 157
    .line 158
    add-float/2addr v1, v2

    .line 159
    invoke-virtual {v0}, Lt9/d;->d()Landroid/graphics/RectF;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    sub-float/2addr v3, v1

    .line 172
    const/4 v4, 0x0

    .line 173
    invoke-virtual {v2, v3, v4}, Landroid/graphics/RectF;->offset(FF)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    sub-float/2addr v2, v1

    .line 189
    invoke-virtual {v0, v2, v4}, Landroid/graphics/RectF;->offset(FF)V

    .line 190
    .line 191
    .line 192
    :cond_0
    return-void
.end method

.method public f()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Landroid/graphics/RectF;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->t:Ljava/util/ArrayList;

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
    new-instance v1, Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Lq9/b;->E()F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v1, v3, v3, v0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 29
    .line 30
    .line 31
    return-object v1
.end method

.method public w(FF)Z
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Lt9/a;->w(FF)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lt9/a;->e()Ls9/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of p1, p1, Ls9/b$d;

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    if-eqz p1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p0}, Lt9/a;->e()Ls9/b;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, Ls9/b$d;

    .line 28
    .line 29
    invoke-virtual {p1}, Ls9/b$d;->a()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    if-eq p1, p2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p0}, Lt9/a;->l()Lv9/c;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {p1, v0}, Lv9/c;->p(Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lt9/a;->l()Lv9/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p1}, Lv9/c;->e()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lt9/a;->n()Lr9/b;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide v1

    .line 68
    invoke-interface {p1, v0, v1, v2}, Lr9/b;->o(Ljava/util/List;J)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lt9/a;->n()Lr9/b;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-interface {p1}, Lr9/b;->l()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->H()V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    instance-of v0, p1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    check-cast p1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    const/4 p1, 0x0

    .line 98
    :goto_0
    if-nez p1, :cond_4

    .line 99
    .line 100
    return p2

    .line 101
    :cond_4
    invoke-virtual {p1}, Lca/a;->E()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    const-string v0, ""

    .line 108
    .line 109
    :cond_5
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1}, Lq9/b;->w()Lma/f;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    if-eqz v1, :cond_6

    .line 118
    .line 119
    new-instance v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1;

    .line 120
    .line 121
    invoke-direct {v2, p1, v0, p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1;-><init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Ljava/lang/String;Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;)V

    .line 122
    .line 123
    .line 124
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$2;->c:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$2;

    .line 125
    .line 126
    invoke-interface {v1, v0, v2, p1}, Lma/f;->a(Ljava/lang/String;Lhd/l;Lhd/a;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    :goto_1
    return p2
.end method
