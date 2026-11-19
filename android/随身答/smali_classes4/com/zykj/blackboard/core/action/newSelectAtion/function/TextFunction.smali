.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;
.super Ly4/a;
.source "SourceFile"

# interfaces
.implements Ly4/f;


# instance fields
.field public A:F

.field public u:Ljava/lang/Integer;

.field public final v:Ljava/util/ArrayList;

.field public final w:Ljava/util/ArrayList;

.field public final x:Landroid/graphics/RectF;

.field public final y:Landroid/graphics/RectF;

.field public final z:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lw4/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Ly4/a;-><init>(Lw4/b;)V

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
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->w:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance p1, Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->x:Landroid/graphics/RectF;

    .line 29
    .line 30
    new-instance p1, Landroid/graphics/RectF;

    .line 31
    .line 32
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->y:Landroid/graphics/RectF;

    .line 36
    .line 37
    new-instance p1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->z:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->i0()V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->h0()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static final synthetic Y(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->b0(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic Z(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->l0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final a0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->s()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Ly4/a;->w()Landroid/graphics/RectF;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p0}, Ly4/a;->p()Landroid/graphics/RectF;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0}, Ly4/a;->x()Lkotlin/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {p0, v0, v1, v2, v3}, Ly4/a;->n(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Lkotlin/Pair;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0, v0}, Ly4/a;->N(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->X()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ly4/a;->W()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private final c0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lx4/d;->e(Ljava/util/List;)Lx4/c$f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lx4/c$f;->d()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method private final e0()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ly4/a;->u()Ljava/util/ArrayList;

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

.method private final h0()V
    .locals 12

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
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Lv4/b;->F()F

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
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Lv4/b;->F()F

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
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Ljava/util/ArrayList;

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
    check-cast v10, Lx4/c;

    .line 75
    .line 76
    invoke-virtual {v10}, Lx4/c;->a()Ljava/lang/String;

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
    :goto_1
    if-ge v7, v1, :cond_2

    .line 97
    .line 98
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    add-int/lit8 v7, v7, 0x1

    .line 103
    .line 104
    check-cast v8, Lx4/c;

    .line 105
    .line 106
    invoke-virtual {v8}, Lx4/c;->a()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    iget-object v9, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->w:Ljava/util/ArrayList;

    .line 115
    .line 116
    new-instance v10, Landroid/graphics/RectF;

    .line 117
    .line 118
    add-float v11, v6, v8

    .line 119
    .line 120
    invoke-direct {v10, v6, v2, v11, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    const/high16 v9, 0x41f00000    # 30.0f

    .line 127
    .line 128
    add-float/2addr v8, v9

    .line 129
    add-float/2addr v6, v8

    .line 130
    goto :goto_1

    .line 131
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->y:Landroid/graphics/RectF;

    .line 132
    .line 133
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1}, Lv4/b;->F()F

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    const/high16 v2, 0x41c00000    # 24.0f

    .line 142
    .line 143
    sub-float/2addr v1, v2

    .line 144
    div-float/2addr v1, v3

    .line 145
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-virtual {v4}, Lv4/b;->F()F

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    sub-float/2addr v4, v2

    .line 154
    div-float/2addr v4, v3

    .line 155
    add-float/2addr v4, v2

    .line 156
    const/high16 v5, 0x42000000    # 32.0f

    .line 157
    .line 158
    const/high16 v6, 0x42600000    # 56.0f

    .line 159
    .line 160
    invoke-virtual {v0, v5, v1, v6, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->x:Landroid/graphics/RectF;

    .line 164
    .line 165
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v1}, Lv4/b;->F()F

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    sub-float/2addr v1, v2

    .line 174
    div-float/2addr v1, v3

    .line 175
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-virtual {v4}, Lv4/b;->F()F

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    sub-float/2addr v4, v2

    .line 184
    div-float/2addr v4, v3

    .line 185
    add-float/2addr v4, v2

    .line 186
    const/high16 v2, 0x42f40000    # 122.0f

    .line 187
    .line 188
    const/high16 v3, 0x43120000    # 146.0f

    .line 189
    .line 190
    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 191
    .line 192
    .line 193
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->j0()V

    .line 194
    .line 195
    .line 196
    return-void
.end method

.method private final i0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Ljava/util/ArrayList;

    .line 7
    .line 8
    new-instance v1, Lx4/c$f;

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->e0()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v3}, Lv4/b;->I()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lx4/d;->a(Ljava/util/List;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v1, v2, v3}, Lx4/c$f;-><init>(ZLjava/util/List;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Ljava/util/ArrayList;

    .line 33
    .line 34
    sget-object v1, Lx4/c$a;->c:Lx4/c$a;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private final j0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->z:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lv4/b;->F()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/high16 v1, 0x42180000    # 38.0f

    .line 15
    .line 16
    sub-float/2addr v0, v1

    .line 17
    const/4 v2, 0x2

    .line 18
    int-to-float v2, v2

    .line 19
    div-float/2addr v0, v2

    .line 20
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Lv4/b;->F()F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-float/2addr v3, v1

    .line 29
    div-float/2addr v3, v2

    .line 30
    add-float/2addr v3, v1

    .line 31
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Lv4/b;->I()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Lx4/d;->a(Ljava/util/List;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v4, 0x0

    .line 48
    :goto_0
    if-ge v4, v2, :cond_0

    .line 49
    .line 50
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->z:Ljava/util/ArrayList;

    .line 51
    .line 52
    new-instance v6, Landroid/graphics/RectF;

    .line 53
    .line 54
    const/high16 v7, 0x42740000    # 61.0f

    .line 55
    .line 56
    int-to-float v8, v4

    .line 57
    mul-float/2addr v8, v7

    .line 58
    const/high16 v7, 0x41b80000    # 23.0f

    .line 59
    .line 60
    add-float/2addr v8, v7

    .line 61
    add-float v7, v8, v1

    .line 62
    .line 63
    invoke-direct {v6, v8, v0, v7, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    return-void
.end method


# virtual methods
.method public A(FF)Z
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Ly4/a;->A(FF)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return p2

    .line 9
    :cond_0
    invoke-virtual {p0}, Ly4/a;->g()Lx4/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of v0, p1, Lx4/b$d;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0}, Ly4/a;->g()Lx4/b;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, Lx4/b$d;

    .line 28
    .line 29
    invoke-virtual {p1}, Lx4/b$d;->a()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    if-eq p1, v1, :cond_1

    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Ly4/a;->o()La5/c;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0}, Ly4/a;->u()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-interface {p1, p2}, La5/c;->o(Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ly4/a;->o()La5/c;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1}, La5/c;->d()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ly4/a;->q()Lw4/b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p0}, Ly4/a;->u()Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    invoke-interface {p1, p2, v2, v3}, Lw4/b;->n(Ljava/util/List;J)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Ly4/a;->q()Lw4/b;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p1}, Lw4/b;->l()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->L()V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-static {p1}, Lx4/d;->e(Ljava/util/List;)Lx4/c$f;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_e

    .line 91
    .line 92
    invoke-virtual {p1}, Lx4/c;->b()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    xor-int/2addr v0, v1

    .line 97
    invoke-virtual {p1, v0}, Lx4/c;->c(Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p2}, Ly4/a;->U(Z)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_4

    .line 104
    .line 105
    :cond_3
    instance-of v0, p1, Lx4/b$j$a;

    .line 106
    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    const/high16 p1, 0x40800000    # 4.0f

    .line 110
    .line 111
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->g0(F)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_4

    .line 115
    .line 116
    :cond_4
    instance-of v0, p1, Lx4/b$j$b;

    .line 117
    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    const/high16 p1, -0x3f800000    # -4.0f

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->g0(F)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_4

    .line 126
    .line 127
    :cond_5
    instance-of p1, p1, Lx4/b$a;

    .line 128
    .line 129
    if-eqz p1, :cond_e

    .line 130
    .line 131
    invoke-virtual {p0}, Ly4/a;->g()Lx4/b;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    const-string v0, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color"

    .line 136
    .line 137
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    check-cast p1, Lx4/b$a;

    .line 141
    .line 142
    invoke-virtual {p1}, Lx4/b$a;->a()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->c0()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-nez v0, :cond_6

    .line 151
    .line 152
    return v1

    .line 153
    :cond_6
    new-instance v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;

    .line 154
    .line 155
    invoke-direct {v2, p0, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Ljava/util/List;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    instance-of v3, v3, Lx4/f$b;

    .line 163
    .line 164
    if-eqz v3, :cond_d

    .line 165
    .line 166
    invoke-static {v0}, Lx4/d;->c(Ljava/util/List;)Lx4/f$b;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    if-eqz p1, :cond_8

    .line 171
    .line 172
    invoke-virtual {p1}, Lx4/f$b;->e()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-ne v3, v1, :cond_8

    .line 177
    .line 178
    invoke-virtual {p1, p2}, Lx4/f$b;->f(Z)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Lv4/b;->G()Lt5/a;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-nez p1, :cond_7

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_7
    const/4 v0, 0x0

    .line 193
    invoke-interface {p1, v0}, Lt5/a;->d(Lkotlin/jvm/functions/Function1;)V

    .line 194
    .line 195
    .line 196
    :goto_0
    invoke-virtual {p0, p2}, Ly4/a;->U(Z)V

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_8
    if-nez p1, :cond_9

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_9
    invoke-virtual {p1, v1}, Lx4/f$b;->f(Z)V

    .line 204
    .line 205
    .line 206
    :goto_1
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p1}, Lv4/b;->G()Lt5/a;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    if-nez p1, :cond_a

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_a
    invoke-interface {p1, v2}, Lt5/a;->d(Lkotlin/jvm/functions/Function1;)V

    .line 218
    .line 219
    .line 220
    :goto_2
    invoke-static {v0}, Lx4/d;->c(Ljava/util/List;)Lx4/f$b;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    if-eqz p1, :cond_b

    .line 225
    .line 226
    invoke-virtual {p1}, Lx4/f;->a()I

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    goto :goto_3

    .line 231
    :cond_b
    move p1, p2

    .line 232
    :goto_3
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-virtual {v3}, Lv4/b;->G()Lt5/a;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    if-eqz v3, :cond_c

    .line 241
    .line 242
    invoke-interface {v3, p1}, Lt5/a;->c(I)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-ne v3, v1, :cond_c

    .line 247
    .line 248
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_c
    invoke-static {v0}, Lx4/d;->h(Ljava/util/List;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0, p2}, Ly4/a;->U(Z)V

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_d
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    check-cast p1, Lx4/f;

    .line 268
    .line 269
    invoke-virtual {p1}, Lx4/f;->a()I

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    :cond_e
    :goto_4
    return v1
.end method

.method public B(FF)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ly4/a;->g()Lx4/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object p2, Lx4/b$b;->a:Lx4/b$b;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-virtual {p0}, Ly4/a;->u()Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lg5/c;

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    check-cast p1, Lh5/d;

    .line 27
    .line 28
    invoke-virtual {p1}, Lh5/d;->H()Ljava/lang/String;

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
    invoke-virtual {p1}, Lg5/a;->f()Landroid/graphics/RectF;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lv4/b;->O()Lt5/c;

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
    invoke-direct {v2, p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$1;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Lh5/d;)V

    .line 58
    .line 59
    .line 60
    new-instance v3, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;

    .line 61
    .line 62
    invoke-direct {v3, p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Lh5/d;)V

    .line 63
    .line 64
    .line 65
    new-instance v4, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;

    .line 66
    .line 67
    invoke-direct {v4, p1, p2, v0, p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;-><init>(Lh5/d;Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1, p2, v2, v3, v4}, Lt5/c;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

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

.method public C(FF)Z
    .locals 13

    .line 1
    invoke-super {p0, p1, p2}, Ly4/a;->C(FF)Z

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
    invoke-virtual {p0}, Ly4/a;->g()Lx4/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    sget-object v1, Lx4/b$c$c;->a:Lx4/b$c$c;

    .line 14
    .line 15
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->f0(F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->l0()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->a0()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ly4/a;->u()Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    move-object v2, p1

    .line 41
    check-cast v2, Lg5/c;

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, Ly4/a;->o()La5/c;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {p0}, Ly4/a;->v()Landroid/graphics/RectF;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {p0}, Ly4/a;->i()Landroid/graphics/Matrix;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {p0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {p0}, Ly4/a;->m()Ly4/e;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {p0}, Ly4/a;->l()Ly4/c;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->h()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    const/16 v11, 0x40

    .line 74
    .line 75
    const/4 v12, 0x0

    .line 76
    const/4 v10, 0x0

    .line 77
    invoke-static/range {v3 .. v12}, La5/c$a;->b(La5/c;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Ly4/e;Ly4/c;Ljava/util/List;Landroid/graphics/PointF;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Ly4/a;->q()Lw4/b;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    sget-object v3, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->g:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 85
    .line 86
    invoke-interface {v2}, Lg5/c;->f()Landroid/graphics/RectF;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    const/16 v10, 0xf8

    .line 91
    .line 92
    const/4 v11, 0x0

    .line 93
    const/4 v5, 0x0

    .line 94
    const/4 v6, 0x0

    .line 95
    const/4 v7, 0x0

    .line 96
    const/4 v8, 0x0

    .line 97
    const/4 v9, 0x0

    .line 98
    invoke-static/range {v1 .. v11}, Lw4/b$a;->a(Lw4/b;Lg5/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-virtual {p0}, Ly4/a;->q()Lw4/b;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {p1}, Lw4/b;->l()V

    .line 106
    .line 107
    .line 108
    return v0
.end method

.method public D(FF)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Ly4/a;->g()Lx4/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object p2, Lx4/b$c$c;->a:Lx4/b$c$c;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ly4/a;->u()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lg5/c;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    check-cast p1, Lh5/d;

    .line 26
    .line 27
    new-instance p2, Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lg5/a;->b()Landroid/graphics/Matrix;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ly4/a;->r()Lz4/a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lz4/a;->b()Landroid/graphics/Matrix;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lg5/a;->f()Landroid/graphics/RectF;

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
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->A:F

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->l0()V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->a0()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Ly4/a;->u()Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Lg5/c;

    .line 79
    .line 80
    if-eqz p1, :cond_1

    .line 81
    .line 82
    invoke-virtual {p0}, Ly4/a;->o()La5/c;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    move-object v1, p1

    .line 87
    check-cast v1, Lh5/d;

    .line 88
    .line 89
    invoke-virtual {p0}, Ly4/a;->v()Landroid/graphics/RectF;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {p0}, Ly4/a;->i()Landroid/graphics/Matrix;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {p0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {p0}, Ly4/a;->m()Ly4/e;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {p0}, Ly4/a;->l()Ly4/c;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->h()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    const/16 v9, 0x80

    .line 114
    .line 115
    const/4 v10, 0x0

    .line 116
    const/4 v8, 0x0

    .line 117
    invoke-static/range {v0 .. v10}, La5/c$a;->c(La5/c;Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Ly4/e;Ly4/c;Ljava/util/List;Landroid/graphics/PointF;ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_0
    const/4 p1, 0x0

    .line 122
    return p1

    .line 123
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 124
    return p1
.end method

.method public E(FF)Z
    .locals 12

    .line 1
    invoke-super {p0, p1, p2}, Ly4/a;->E(FF)Z

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
    invoke-virtual {p0}, Ly4/a;->g()Lx4/b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    sget-object v1, Lx4/b$c$c;->a:Lx4/b$c$c;

    .line 14
    .line 15
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->f0(F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->l0()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->a0()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ly4/a;->u()Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lg5/c;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Ly4/a;->o()La5/c;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    move-object v2, p1

    .line 49
    check-cast v2, Lh5/d;

    .line 50
    .line 51
    invoke-virtual {p0}, Ly4/a;->v()Landroid/graphics/RectF;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {p0}, Ly4/a;->i()Landroid/graphics/Matrix;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {p0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {p0}, Ly4/a;->m()Ly4/e;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {p0}, Ly4/a;->l()Ly4/c;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->h()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    const/16 v10, 0x80

    .line 76
    .line 77
    const/4 v11, 0x0

    .line 78
    const/4 v9, 0x0

    .line 79
    invoke-static/range {v1 .. v11}, La5/c$a;->d(La5/c;Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Ly4/e;Ly4/c;Ljava/util/List;Landroid/graphics/PointF;ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    return v0
.end method

.method public J(FF)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Ly4/a;->m()Ly4/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ly4/e;->f()Landroid/graphics/RectF;

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
    new-instance p1, Lx4/b$d;

    .line 18
    .line 19
    invoke-direct {p1, v1}, Lx4/b$d;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ly4/a;->M(Lx4/b;)V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    invoke-virtual {p0}, Ly4/a;->m()Ly4/e;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ly4/e;->c()Landroid/graphics/RectF;

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
    new-instance p1, Lx4/b$d;

    .line 41
    .line 42
    invoke-direct {p1, v2}, Lx4/b$d;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Ly4/a;->M(Lx4/b;)V

    .line 46
    .line 47
    .line 48
    return v2

    .line 49
    :cond_1
    invoke-virtual {p0}, Ly4/a;->l()Ly4/c;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ly4/c;->c()Landroid/graphics/RectF;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    sget-object p1, Lx4/b$e;->a:Lx4/b$e;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ly4/a;->M(Lx4/b;)V

    .line 66
    .line 67
    .line 68
    return v2

    .line 69
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-static {v0}, Lx4/d;->e(Ljava/util/List;)Lx4/c$f;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_a

    .line 76
    .line 77
    invoke-virtual {v0}, Lx4/c;->b()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ne v0, v2, :cond_a

    .line 82
    .line 83
    invoke-virtual {p0}, Ly4/a;->m()Ly4/e;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ly4/e;->g()Landroid/graphics/RectF;

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
    if-eqz v0, :cond_3

    .line 96
    .line 97
    sget-object p1, Lx4/b$j$a;->a:Lx4/b$j$a;

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Ly4/a;->M(Lx4/b;)V

    .line 100
    .line 101
    .line 102
    return v2

    .line 103
    :cond_3
    invoke-virtual {p0}, Ly4/a;->m()Ly4/e;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ly4/e;->h()Landroid/graphics/RectF;

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
    if-eqz v0, :cond_4

    .line 116
    .line 117
    sget-object p1, Lx4/b$j$b;->a:Lx4/b$j$b;

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Ly4/a;->M(Lx4/b;)V

    .line 120
    .line 121
    .line 122
    return v2

    .line 123
    :cond_4
    invoke-virtual {p0}, Ly4/a;->l()Ly4/c;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Ly4/c;->d()Landroid/graphics/RectF;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_5

    .line 136
    .line 137
    sget-object p1, Lx4/b$e;->a:Lx4/b$e;

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Ly4/a;->M(Lx4/b;)V

    .line 140
    .line 141
    .line 142
    return v2

    .line 143
    :cond_5
    invoke-virtual {p0}, Ly4/a;->m()Ly4/e;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ly4/e;->a()Ljava/util/ArrayList;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    move v3, v1

    .line 156
    :goto_0
    if-ge v3, v0, :cond_7

    .line 157
    .line 158
    invoke-virtual {p0}, Ly4/a;->m()Ly4/e;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v4}, Ly4/e;->a()Ljava/util/ArrayList;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    check-cast v4, Landroid/graphics/RectF;

    .line 171
    .line 172
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_6

    .line 177
    .line 178
    new-instance p1, Lx4/b$a;

    .line 179
    .line 180
    invoke-direct {p1, v3}, Lx4/b$a;-><init>(I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, p1}, Ly4/a;->M(Lx4/b;)V

    .line 184
    .line 185
    .line 186
    return v2

    .line 187
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_7
    invoke-virtual {p0}, Ly4/a;->l()Ly4/c;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v0}, Ly4/c;->a()Landroid/graphics/RectF;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_8

    .line 203
    .line 204
    sget-object p1, Lx4/b$e;->a:Lx4/b$e;

    .line 205
    .line 206
    invoke-virtual {p0, p1}, Ly4/a;->M(Lx4/b;)V

    .line 207
    .line 208
    .line 209
    return v2

    .line 210
    :cond_8
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->c0()Ljava/util/List;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-eqz v0, :cond_a

    .line 215
    .line 216
    invoke-static {v0}, Lx4/d;->c(Ljava/util/List;)Lx4/f$b;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-eqz v0, :cond_a

    .line 221
    .line 222
    invoke-virtual {v0}, Lx4/f$b;->e()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-ne v0, v2, :cond_a

    .line 227
    .line 228
    invoke-virtual {p0}, Ly4/a;->m()Ly4/e;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0}, Ly4/e;->b()Landroid/graphics/RectF;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_9

    .line 241
    .line 242
    sget-object p1, Lx4/b$e;->a:Lx4/b$e;

    .line 243
    .line 244
    invoke-virtual {p0, p1}, Ly4/a;->M(Lx4/b;)V

    .line 245
    .line 246
    .line 247
    return v2

    .line 248
    :cond_9
    invoke-virtual {p0}, Ly4/a;->l()Ly4/c;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Ly4/c;->b()Landroid/graphics/RectF;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_a

    .line 261
    .line 262
    sget-object p1, Lx4/b$e;->a:Lx4/b$e;

    .line 263
    .line 264
    invoke-virtual {p0, p1}, Ly4/a;->M(Lx4/b;)V

    .line 265
    .line 266
    .line 267
    return v2

    .line 268
    :cond_a
    invoke-virtual {p0}, Ly4/a;->i()Landroid/graphics/Matrix;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v0}, Lu5/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    const/4 v3, 0x2

    .line 277
    new-array v4, v3, [F

    .line 278
    .line 279
    aput p1, v4, v1

    .line 280
    .line 281
    aput p2, v4, v2

    .line 282
    .line 283
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 284
    .line 285
    .line 286
    aget p1, v4, v1

    .line 287
    .line 288
    aget p2, v4, v2

    .line 289
    .line 290
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    invoke-virtual {v4}, Lv4/b;->J()F

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    new-instance v4, Landroid/graphics/RectF;

    .line 303
    .line 304
    invoke-virtual {p0}, Ly4/a;->v()Landroid/graphics/RectF;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 309
    .line 310
    int-to-float v3, v3

    .line 311
    div-float/2addr v0, v3

    .line 312
    sub-float/2addr v5, v0

    .line 313
    invoke-virtual {p0}, Ly4/a;->v()Landroid/graphics/RectF;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    sub-float/2addr v3, v0

    .line 322
    invoke-virtual {p0}, Ly4/a;->v()Landroid/graphics/RectF;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    iget v6, v6, Landroid/graphics/RectF;->right:F

    .line 327
    .line 328
    add-float/2addr v6, v0

    .line 329
    invoke-virtual {p0}, Ly4/a;->v()Landroid/graphics/RectF;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerY()F

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    add-float/2addr v7, v0

    .line 338
    invoke-direct {v4, v5, v3, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 339
    .line 340
    .line 341
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->e0()Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    if-eqz v0, :cond_b

    .line 346
    .line 347
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-eqz v0, :cond_b

    .line 352
    .line 353
    sget-object p1, Lx4/b$c$c;->a:Lx4/b$c$c;

    .line 354
    .line 355
    invoke-virtual {p0, p1}, Ly4/a;->M(Lx4/b;)V

    .line 356
    .line 357
    .line 358
    return v2

    .line 359
    :cond_b
    invoke-virtual {p0}, Ly4/a;->v()Landroid/graphics/RectF;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 364
    .line 365
    .line 366
    move-result p1

    .line 367
    if-eqz p1, :cond_c

    .line 368
    .line 369
    sget-object p1, Lx4/b$b;->a:Lx4/b$b;

    .line 370
    .line 371
    invoke-virtual {p0, p1}, Ly4/a;->M(Lx4/b;)V

    .line 372
    .line 373
    .line 374
    return v2

    .line 375
    :cond_c
    sget-object p1, Lx4/b$g;->a:Lx4/b$g;

    .line 376
    .line 377
    invoke-virtual {p0, p1}, Ly4/a;->M(Lx4/b;)V

    .line 378
    .line 379
    .line 380
    return v1
.end method

.method public L()V
    .locals 2

    .line 1
    invoke-super {p0}, Ly4/a;->L()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->i0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lv4/b;->G()Lt5/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v0, v1}, Lt5/a;->d(Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->k0(Ljava/lang/Integer;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public P(Ljava/util/List;)V
    .locals 12

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ly4/a;->P(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {v0}, Lx4/d;->e(Ljava/util/List;)Lx4/c$f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_14

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->e0()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {v0, v1}, Lx4/c$f;->g(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lx4/c$f;->e()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v1, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.TextGraph"

    .line 36
    .line 37
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    check-cast p1, Lh5/d;

    .line 41
    .line 42
    invoke-virtual {p1}, Lh5/d;->I()Landroid/graphics/Paint;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move-object p1, v2

    .line 58
    :goto_0
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Lv4/b;->I()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v1}, Lx4/d;->a(Ljava/util/List;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-instance v3, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    const/4 v4, -0x1

    .line 76
    const/4 v5, 0x0

    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    :cond_1
    move v7, v4

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    move v7, v5

    .line 86
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-eqz v8, :cond_1

    .line 91
    .line 92
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    check-cast v8, Lx4/f;

    .line 97
    .line 98
    instance-of v9, v8, Lx4/f$b;

    .line 99
    .line 100
    if-nez v9, :cond_3

    .line 101
    .line 102
    invoke-virtual {v8}, Lx4/f;->a()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-ne v8, v9, :cond_3

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :goto_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    move v6, v5

    .line 121
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_11

    .line 126
    .line 127
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    add-int/lit8 v9, v6, 0x1

    .line 132
    .line 133
    if-gez v6, :cond_4

    .line 134
    .line 135
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 136
    .line 137
    .line 138
    :cond_4
    check-cast v8, Lx4/f;

    .line 139
    .line 140
    instance-of v10, v8, Lx4/f$b;

    .line 141
    .line 142
    const/4 v11, 0x1

    .line 143
    if-eqz v10, :cond_8

    .line 144
    .line 145
    if-eqz p1, :cond_6

    .line 146
    .line 147
    if-ne v7, v4, :cond_6

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-virtual {v8}, Lv4/b;->G()Lt5/a;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    if-eqz v8, :cond_5

    .line 162
    .line 163
    invoke-interface {v8, v6}, Lt5/a;->c(I)Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    goto :goto_4

    .line 168
    :cond_5
    move v6, v5

    .line 169
    :goto_4
    if-eqz v6, :cond_6

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_6
    move v11, v5

    .line 173
    :goto_5
    new-instance v6, Lx4/f$b;

    .line 174
    .line 175
    if-eqz v11, :cond_7

    .line 176
    .line 177
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    goto :goto_6

    .line 185
    :cond_7
    move v8, v5

    .line 186
    :goto_6
    invoke-direct {v6, v8, v11, v5}, Lx4/f$b;-><init>(IZZ)V

    .line 187
    .line 188
    .line 189
    goto :goto_c

    .line 190
    :cond_8
    instance-of v10, v8, Lx4/f$a;

    .line 191
    .line 192
    if-eqz v10, :cond_a

    .line 193
    .line 194
    new-instance v8, Lx4/f$a;

    .line 195
    .line 196
    if-ne v6, v7, :cond_9

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_9
    move v11, v5

    .line 200
    :goto_7
    invoke-direct {v8, v11}, Lx4/f$a;-><init>(Z)V

    .line 201
    .line 202
    .line 203
    :goto_8
    move-object v6, v8

    .line 204
    goto :goto_c

    .line 205
    :cond_a
    instance-of v10, v8, Lx4/f$e;

    .line 206
    .line 207
    if-eqz v10, :cond_c

    .line 208
    .line 209
    new-instance v8, Lx4/f$e;

    .line 210
    .line 211
    if-ne v6, v7, :cond_b

    .line 212
    .line 213
    goto :goto_9

    .line 214
    :cond_b
    move v11, v5

    .line 215
    :goto_9
    invoke-direct {v8, v11}, Lx4/f$e;-><init>(Z)V

    .line 216
    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_c
    instance-of v10, v8, Lx4/f$d;

    .line 220
    .line 221
    if-eqz v10, :cond_e

    .line 222
    .line 223
    new-instance v8, Lx4/f$d;

    .line 224
    .line 225
    if-ne v6, v7, :cond_d

    .line 226
    .line 227
    goto :goto_a

    .line 228
    :cond_d
    move v11, v5

    .line 229
    :goto_a
    invoke-direct {v8, v11}, Lx4/f$d;-><init>(Z)V

    .line 230
    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_e
    instance-of v10, v8, Lx4/f$c;

    .line 234
    .line 235
    if-eqz v10, :cond_10

    .line 236
    .line 237
    new-instance v10, Lx4/f$c;

    .line 238
    .line 239
    invoke-virtual {v8}, Lx4/f;->a()I

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    if-ne v6, v7, :cond_f

    .line 244
    .line 245
    goto :goto_b

    .line 246
    :cond_f
    move v11, v5

    .line 247
    :goto_b
    invoke-direct {v10, v8, v11}, Lx4/f$c;-><init>(IZ)V

    .line 248
    .line 249
    .line 250
    move-object v6, v10

    .line 251
    :goto_c
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move v6, v9

    .line 255
    goto/16 :goto_3

    .line 256
    .line 257
    :cond_10
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 258
    .line 259
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 260
    .line 261
    .line 262
    throw p1

    .line 263
    :cond_11
    invoke-virtual {v0, v3}, Lx4/c$f;->f(Ljava/util/List;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-virtual {p1}, Lv4/b;->G()Lt5/a;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    if-eqz p1, :cond_13

    .line 275
    .line 276
    invoke-virtual {v0}, Lx4/c$f;->d()Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-static {v0}, Lx4/d;->c(Ljava/util/List;)Lx4/f$b;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    if-eqz v0, :cond_12

    .line 285
    .line 286
    invoke-virtual {v0}, Lx4/f;->a()I

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    :cond_12
    invoke-interface {p1, v2}, Lt5/a;->a(Ljava/lang/Integer;)V

    .line 295
    .line 296
    .line 297
    :cond_13
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->j0()V

    .line 298
    .line 299
    .line 300
    :cond_14
    return-void
.end method

.method public X()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ly4/a;->m()Ly4/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ly4/e;->f()Landroid/graphics/RectF;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 16
    .line 17
    iget-object v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->w:Ljava/util/ArrayList;

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
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 37
    .line 38
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    iget-object v8, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->w:Ljava/util/ArrayList;

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
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    iget v8, v8, Landroid/graphics/RectF;->top:F

    .line 61
    .line 62
    invoke-virtual {v0}, Ly4/a;->f()Lv4/b;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v9}, Lv4/b;->F()F

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
    invoke-virtual {v1}, Ly4/e;->c()Landroid/graphics/RectF;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 83
    .line 84
    iget-object v6, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->w:Ljava/util/ArrayList;

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
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 102
    .line 103
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    iget v8, v8, Landroid/graphics/RectF;->left:F

    .line 108
    .line 109
    iget-object v9, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->w:Ljava/util/ArrayList;

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
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 126
    .line 127
    invoke-virtual {v0}, Ly4/a;->f()Lv4/b;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v7}, Lv4/b;->F()F

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
    invoke-virtual {v1}, Ly4/e;->h()Landroid/graphics/RectF;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 148
    .line 149
    iget-object v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->y:Landroid/graphics/RectF;

    .line 150
    .line 151
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 152
    .line 153
    add-float/2addr v3, v4

    .line 154
    const/high16 v4, 0x42000000    # 32.0f

    .line 155
    .line 156
    sub-float/2addr v3, v4

    .line 157
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 162
    .line 163
    invoke-virtual {v0}, Ly4/a;->f()Lv4/b;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    invoke-virtual {v7}, Lv4/b;->F()F

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    add-float/2addr v6, v7

    .line 172
    const/high16 v7, 0x41500000    # 13.0f

    .line 173
    .line 174
    add-float/2addr v6, v7

    .line 175
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    iget v8, v8, Landroid/graphics/RectF;->left:F

    .line 180
    .line 181
    iget-object v9, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->y:Landroid/graphics/RectF;

    .line 182
    .line 183
    iget v9, v9, Landroid/graphics/RectF;->right:F

    .line 184
    .line 185
    add-float/2addr v8, v9

    .line 186
    add-float/2addr v8, v4

    .line 187
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 192
    .line 193
    invoke-virtual {v0}, Ly4/a;->f()Lv4/b;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    invoke-virtual {v10}, Lv4/b;->F()F

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    const/4 v11, 0x2

    .line 202
    int-to-float v11, v11

    .line 203
    mul-float/2addr v10, v11

    .line 204
    add-float/2addr v9, v10

    .line 205
    add-float/2addr v9, v7

    .line 206
    invoke-virtual {v2, v3, v6, v8, v9}, Landroid/graphics/RectF;->set(FFFF)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Ly4/e;->g()Landroid/graphics/RectF;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 218
    .line 219
    iget-object v6, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->x:Landroid/graphics/RectF;

    .line 220
    .line 221
    iget v6, v6, Landroid/graphics/RectF;->left:F

    .line 222
    .line 223
    add-float/2addr v3, v6

    .line 224
    sub-float/2addr v3, v4

    .line 225
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 230
    .line 231
    invoke-virtual {v0}, Ly4/a;->f()Lv4/b;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-virtual {v8}, Lv4/b;->F()F

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    add-float/2addr v6, v8

    .line 240
    add-float/2addr v6, v7

    .line 241
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    iget v8, v8, Landroid/graphics/RectF;->left:F

    .line 246
    .line 247
    iget-object v9, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->x:Landroid/graphics/RectF;

    .line 248
    .line 249
    iget v9, v9, Landroid/graphics/RectF;->right:F

    .line 250
    .line 251
    add-float/2addr v8, v9

    .line 252
    add-float/2addr v8, v4

    .line 253
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 258
    .line 259
    invoke-virtual {v0}, Ly4/a;->f()Lv4/b;

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    invoke-virtual {v9}, Lv4/b;->F()F

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    mul-float/2addr v9, v11

    .line 268
    add-float/2addr v4, v9

    .line 269
    add-float/2addr v4, v7

    .line 270
    invoke-virtual {v2, v3, v6, v8, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1}, Ly4/e;->g()Landroid/graphics/RectF;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 278
    .line 279
    add-float/2addr v2, v7

    .line 280
    invoke-virtual {v1}, Ly4/e;->a()Ljava/util/ArrayList;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 285
    .line 286
    .line 287
    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->z:Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    move v6, v5

    .line 294
    :goto_0
    if-ge v6, v4, :cond_0

    .line 295
    .line 296
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    add-int/lit8 v6, v6, 0x1

    .line 301
    .line 302
    check-cast v8, Landroid/graphics/RectF;

    .line 303
    .line 304
    invoke-virtual {v1}, Ly4/e;->a()Ljava/util/ArrayList;

    .line 305
    .line 306
    .line 307
    move-result-object v9

    .line 308
    new-instance v10, Landroid/graphics/RectF;

    .line 309
    .line 310
    iget v12, v8, Landroid/graphics/RectF;->left:F

    .line 311
    .line 312
    add-float/2addr v12, v2

    .line 313
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 314
    .line 315
    .line 316
    move-result-object v13

    .line 317
    iget v13, v13, Landroid/graphics/RectF;->top:F

    .line 318
    .line 319
    invoke-virtual {v0}, Ly4/a;->f()Lv4/b;

    .line 320
    .line 321
    .line 322
    move-result-object v14

    .line 323
    invoke-virtual {v14}, Lv4/b;->F()F

    .line 324
    .line 325
    .line 326
    move-result v14

    .line 327
    add-float/2addr v13, v14

    .line 328
    add-float/2addr v13, v7

    .line 329
    iget v14, v8, Landroid/graphics/RectF;->top:F

    .line 330
    .line 331
    add-float/2addr v13, v14

    .line 332
    iget v14, v8, Landroid/graphics/RectF;->right:F

    .line 333
    .line 334
    add-float/2addr v14, v2

    .line 335
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 336
    .line 337
    .line 338
    move-result-object v15

    .line 339
    iget v15, v15, Landroid/graphics/RectF;->top:F

    .line 340
    .line 341
    invoke-virtual {v0}, Ly4/a;->f()Lv4/b;

    .line 342
    .line 343
    .line 344
    move-result-object v16

    .line 345
    invoke-virtual/range {v16 .. v16}, Lv4/b;->F()F

    .line 346
    .line 347
    .line 348
    move-result v16

    .line 349
    add-float v15, v15, v16

    .line 350
    .line 351
    add-float/2addr v15, v7

    .line 352
    iget v8, v8, Landroid/graphics/RectF;->bottom:F

    .line 353
    .line 354
    add-float/2addr v15, v8

    .line 355
    invoke-direct {v10, v12, v13, v14, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    goto :goto_0

    .line 362
    :cond_0
    invoke-virtual {v0}, Ly4/a;->m()Ly4/e;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-virtual {v2}, Ly4/e;->b()Landroid/graphics/RectF;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-virtual {v2}, Landroid/graphics/RectF;->setEmpty()V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0}, Ly4/a;->f()Lv4/b;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-virtual {v2}, Lv4/b;->G()Lt5/a;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    if-eqz v2, :cond_3

    .line 382
    .line 383
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->c0()Ljava/util/List;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    const/4 v4, 0x0

    .line 388
    if-eqz v3, :cond_1

    .line 389
    .line 390
    invoke-static {v3}, Lx4/d;->c(Ljava/util/List;)Lx4/f$b;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    goto :goto_1

    .line 395
    :cond_1
    move-object v3, v4

    .line 396
    :goto_1
    if-eqz v3, :cond_2

    .line 397
    .line 398
    goto :goto_2

    .line 399
    :cond_2
    move-object v2, v4

    .line 400
    :goto_2
    if-eqz v2, :cond_3

    .line 401
    .line 402
    invoke-virtual {v1}, Ly4/e;->b()Landroid/graphics/RectF;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 411
    .line 412
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 413
    .line 414
    .line 415
    move-result-object v6

    .line 416
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 417
    .line 418
    invoke-virtual {v0}, Ly4/a;->f()Lv4/b;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    invoke-virtual {v8}, Lv4/b;->F()F

    .line 423
    .line 424
    .line 425
    move-result v8

    .line 426
    add-float/2addr v8, v7

    .line 427
    mul-float/2addr v8, v11

    .line 428
    add-float/2addr v6, v8

    .line 429
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 430
    .line 431
    .line 432
    move-result-object v8

    .line 433
    iget v8, v8, Landroid/graphics/RectF;->left:F

    .line 434
    .line 435
    invoke-interface {v2}, Lt5/a;->getWidth()F

    .line 436
    .line 437
    .line 438
    move-result v9

    .line 439
    add-float/2addr v8, v9

    .line 440
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 441
    .line 442
    .line 443
    move-result-object v9

    .line 444
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 445
    .line 446
    invoke-virtual {v0}, Ly4/a;->f()Lv4/b;

    .line 447
    .line 448
    .line 449
    move-result-object v10

    .line 450
    invoke-virtual {v10}, Lv4/b;->F()F

    .line 451
    .line 452
    .line 453
    move-result v10

    .line 454
    add-float/2addr v10, v7

    .line 455
    mul-float/2addr v10, v11

    .line 456
    add-float/2addr v9, v10

    .line 457
    invoke-interface {v2}, Lt5/a;->getHeight()F

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    add-float/2addr v9, v2

    .line 462
    invoke-virtual {v3, v4, v6, v8, v9}, Landroid/graphics/RectF;->set(FFFF)V

    .line 463
    .line 464
    .line 465
    :cond_3
    invoke-virtual {v0}, Ly4/a;->K()Z

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    if-nez v2, :cond_5

    .line 470
    .line 471
    invoke-virtual {v1}, Ly4/e;->c()Landroid/graphics/RectF;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 476
    .line 477
    invoke-virtual {v1}, Ly4/e;->f()Landroid/graphics/RectF;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 482
    .line 483
    sub-float/2addr v2, v3

    .line 484
    const/high16 v3, 0x41800000    # 16.0f

    .line 485
    .line 486
    add-float/2addr v2, v3

    .line 487
    invoke-virtual {v1}, Ly4/e;->f()Landroid/graphics/RectF;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 492
    .line 493
    .line 494
    move-result-object v4

    .line 495
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    sub-float/2addr v4, v2

    .line 500
    const/4 v6, 0x0

    .line 501
    invoke-virtual {v3, v4, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v1}, Ly4/e;->c()Landroid/graphics/RectF;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 509
    .line 510
    .line 511
    move-result-object v4

    .line 512
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    sub-float/2addr v4, v2

    .line 517
    invoke-virtual {v3, v4, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v1}, Ly4/e;->g()Landroid/graphics/RectF;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 525
    .line 526
    invoke-virtual {v1}, Ly4/e;->h()Landroid/graphics/RectF;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 531
    .line 532
    sub-float/2addr v2, v3

    .line 533
    invoke-virtual {v1}, Ly4/e;->a()Ljava/util/ArrayList;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    check-cast v3, Landroid/graphics/RectF;

    .line 542
    .line 543
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 544
    .line 545
    invoke-virtual {v1}, Ly4/e;->a()Ljava/util/ArrayList;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    check-cast v4, Landroid/graphics/RectF;

    .line 554
    .line 555
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 556
    .line 557
    sub-float/2addr v3, v4

    .line 558
    const/high16 v4, 0x42380000    # 46.0f

    .line 559
    .line 560
    add-float/2addr v3, v4

    .line 561
    add-float/2addr v2, v7

    .line 562
    add-float/2addr v2, v3

    .line 563
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 564
    .line 565
    .line 566
    move-result-object v3

    .line 567
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 568
    .line 569
    .line 570
    move-result v3

    .line 571
    sub-float/2addr v3, v2

    .line 572
    invoke-virtual {v1}, Ly4/e;->h()Landroid/graphics/RectF;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    invoke-virtual {v2, v3, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v1}, Ly4/e;->g()Landroid/graphics/RectF;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    invoke-virtual {v2, v3, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v1}, Ly4/e;->a()Ljava/util/ArrayList;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 591
    .line 592
    .line 593
    move-result v4

    .line 594
    :goto_3
    if-ge v5, v4, :cond_4

    .line 595
    .line 596
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v7

    .line 600
    add-int/lit8 v5, v5, 0x1

    .line 601
    .line 602
    check-cast v7, Landroid/graphics/RectF;

    .line 603
    .line 604
    invoke-virtual {v7, v3, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 605
    .line 606
    .line 607
    goto :goto_3

    .line 608
    :cond_4
    invoke-virtual {v1}, Ly4/e;->b()Landroid/graphics/RectF;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    invoke-virtual {v1}, Ly4/e;->b()Landroid/graphics/RectF;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    invoke-virtual {v0}, Ly4/a;->t()Landroid/graphics/RectF;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 625
    .line 626
    .line 627
    move-result v3

    .line 628
    sub-float/2addr v3, v2

    .line 629
    invoke-virtual {v1, v3, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 630
    .line 631
    .line 632
    :cond_5
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lv4/b;->G()Lt5/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p0}, Ly4/a;->m()Ly4/e;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Ly4/e;->b()Landroid/graphics/RectF;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 29
    .line 30
    sub-float/2addr v1, v2

    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {p0}, Ly4/a;->m()Ly4/e;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ly4/e;->b()Landroid/graphics/RectF;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 44
    .line 45
    sub-float/2addr v2, v3

    .line 46
    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, p1}, Lt5/a;->dispatchTouchEvent(Landroid/view/MotionEvent;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lv4/b;->G()Lt5/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->d0()Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lt5/a;->b(Ljava/lang/Integer;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final b0(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;
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
    sget-object v1, Lu5/t;->a:Lu5/t;

    .line 15
    .line 16
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v1, p1, p2, v2}, Lu5/t;->a(Ljava/lang/String;Landroid/graphics/Paint;F)Ljava/util/List;

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
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Lv4/b;->f()Landroid/graphics/RectF;

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
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lv4/b;->f()Landroid/graphics/RectF;

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

.method public d0()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->u:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f0(F)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ly4/a;->j()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-float/2addr p1, v0

    .line 6
    invoke-virtual {p0}, Ly4/a;->u()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lg5/c;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    check-cast v0, Lh5/d;

    .line 19
    .line 20
    new-instance v1, Landroid/graphics/Matrix;

    .line 21
    .line 22
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lg5/a;->b()Landroid/graphics/Matrix;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ly4/a;->r()Lz4/a;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Lz4/a;->b()Landroid/graphics/Matrix;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 41
    .line 42
    .line 43
    iget v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->A:F

    .line 44
    .line 45
    add-float/2addr v2, p1

    .line 46
    invoke-virtual {v0}, Lh5/d;->I()Landroid/graphics/Paint;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lh5/d;->H()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v3}, Lkotlin/text/StringsKt;->first(Ljava/lang/CharSequence;)C

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
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3}, Lv4/b;->J()F

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
    invoke-static {v1}, Lu5/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

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
    invoke-virtual {v0}, Lg5/a;->f()Landroid/graphics/RectF;

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
    invoke-virtual {v0}, Lh5/d;->H()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lh5/d;->I()Landroid/graphics/Paint;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, p1, v2, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->b0(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->n(Landroid/graphics/RectF;)V

    .line 137
    .line 138
    .line 139
    :cond_1
    :goto_0
    return-void
.end method

.method public final g0(F)V
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
    invoke-virtual {v0}, Ly4/a;->u()Ljava/util/ArrayList;

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
    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

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
    check-cast v8, Lg5/c;

    .line 53
    .line 54
    invoke-interface {v8}, Lg5/c;->getId()Ljava/lang/String;

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
    invoke-virtual {v0}, Ly4/a;->u()Ljava/util/ArrayList;

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
    check-cast v8, Lg5/c;

    .line 95
    .line 96
    instance-of v5, v8, Lh5/d;

    .line 97
    .line 98
    if-eqz v5, :cond_1

    .line 99
    .line 100
    move-object v5, v8

    .line 101
    check-cast v5, Lh5/d;

    .line 102
    .line 103
    invoke-virtual {v5}, Lh5/d;->I()Landroid/graphics/Paint;

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
    invoke-interface {v8}, Lg5/c;->b()Landroid/graphics/Matrix;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-virtual {v9, v10}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ly4/a;->r()Lz4/a;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    invoke-virtual {v10}, Lz4/a;->b()Landroid/graphics/Matrix;

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
    invoke-virtual {v0}, Ly4/a;->f()Lv4/b;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    invoke-virtual {v12}, Lv4/b;->d()F

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
    invoke-virtual {v0}, Ly4/a;->f()Lv4/b;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    invoke-virtual {v11}, Lv4/b;->c()F

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
    invoke-static {v9}, Lu5/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

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
    invoke-virtual {v5, v7}, Lh5/d;->K(Landroid/graphics/Paint;)V

    .line 187
    .line 188
    .line 189
    new-instance v9, Landroid/graphics/RectF;

    .line 190
    .line 191
    invoke-interface {v8}, Lg5/c;->f()Landroid/graphics/RectF;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-direct {v9, v11}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5}, Lh5/d;->H()Ljava/lang/String;

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
    invoke-virtual {v5}, Lh5/d;->I()Landroid/graphics/Paint;

    .line 208
    .line 209
    .line 210
    move-result-object v13

    .line 211
    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v11, v13, v9}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->b0(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5, v9}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->n(Landroid/graphics/RectF;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Ly4/a;->q()Lw4/b;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    invoke-interface {v11}, Lw4/b;->e()Ls5/f;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    if-eqz v11, :cond_5

    .line 229
    .line 230
    invoke-interface {v11, v10}, Ls5/f;->a(F)V

    .line 231
    .line 232
    .line 233
    :cond_5
    invoke-virtual {v0}, Ly4/a;->o()La5/c;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    invoke-interface {v8}, Lg5/c;->getId()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    invoke-virtual {v5}, Lh5/d;->H()Ljava/lang/String;

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
    invoke-interface {v8}, Lg5/c;->f()Landroid/graphics/RectF;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-interface {v10, v11, v12, v7, v5}, La5/c;->C(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Ly4/a;->q()Lw4/b;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    move-object v10, v9

    .line 261
    sget-object v9, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->g:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

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
    invoke-static/range {v7 .. v17}, Lw4/b$a;->a(Lw4/b;Lg5/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_1

    .line 281
    .line 282
    :cond_7
    invoke-virtual {v0}, Ly4/a;->q()Lw4/b;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-interface {v1}, Lw4/b;->l()V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->l0()V

    .line 290
    .line 291
    .line 292
    const/4 v1, 0x0

    .line 293
    const/4 v2, 0x1

    .line 294
    invoke-static {v0, v6, v2, v1}, Ly4/a;->V(Ly4/a;ZILjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    return-void
.end method

.method public h()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->v:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public k0(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->u:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final l0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ly4/a;->v()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ly4/a;->u()Ljava/util/ArrayList;

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
    check-cast v3, Lg5/c;

    .line 26
    .line 27
    invoke-virtual {p0}, Ly4/a;->v()Landroid/graphics/RectF;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {p0}, Ly4/a;->r()Lz4/a;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Lz4/a;->b()Landroid/graphics/Matrix;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-interface {v3, v5}, Lg5/c;->i(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

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
    invoke-virtual {p0}, Ly4/a;->y()Landroid/graphics/Matrix;

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

.method public s()Landroid/graphics/RectF;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->w:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

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
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->z:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

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
    const/high16 v2, 0x433f0000    # 191.0f

    .line 31
    .line 32
    add-float/2addr v2, v1

    .line 33
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->c0()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v3, 0x0

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-static {v1}, Lx4/d;->c(Ljava/util/List;)Lx4/f$b;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v1, v3

    .line 46
    :goto_0
    if-eqz v1, :cond_1

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const/4 v1, 0x0

    .line 51
    :goto_1
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4}, Lv4/b;->G()Lt5/a;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    const/4 v5, 0x0

    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move-object v4, v3

    .line 66
    :goto_2
    if-eqz v4, :cond_3

    .line 67
    .line 68
    invoke-interface {v4}, Lt5/a;->getWidth()F

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    move v4, v5

    .line 74
    :goto_3
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v6}, Lv4/b;->G()Lt5/a;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    const/high16 v7, 0x41500000    # 13.0f

    .line 83
    .line 84
    if-eqz v6, :cond_5

    .line 85
    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    move-object v3, v6

    .line 89
    :cond_4
    if-eqz v3, :cond_5

    .line 90
    .line 91
    invoke-interface {v3}, Lt5/a;->getHeight()F

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    add-float/2addr v1, v7

    .line 96
    goto :goto_4

    .line 97
    :cond_5
    move v1, v5

    .line 98
    :goto_4
    new-instance v3, Lkotlin/Pair;

    .line 99
    .line 100
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {p0}, Ly4/a;->f()Lv4/b;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2}, Lv4/b;->F()F

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    const/4 v6, 0x2

    .line 117
    int-to-float v6, v6

    .line 118
    mul-float/2addr v2, v6

    .line 119
    add-float/2addr v2, v7

    .line 120
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-direct {v3, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v3}, Ly4/a;->R(Lkotlin/Pair;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Ly4/a;->x()Lkotlin/Pair;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    invoke-static {v0, v4}, Ljava/lang/Math;->max(FF)F

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-virtual {p0}, Ly4/a;->x()Lkotlin/Pair;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, Ljava/lang/Number;

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    add-float/2addr v2, v1

    .line 163
    new-instance v1, Landroid/graphics/RectF;

    .line 164
    .line 165
    invoke-direct {v1, v5, v5, v0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 166
    .line 167
    .line 168
    return-object v1
.end method
