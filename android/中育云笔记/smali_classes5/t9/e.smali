.class public final Lt9/e;
.super Lt9/a;
.source "SourceFile"


# instance fields
.field public final s:Ljava/util/ArrayList;

.field public final t:Ljava/util/ArrayList;

.field public final u:Ljava/util/ArrayList;

.field public v:F

.field public w:F

.field public final x:Landroid/graphics/PointF;

.field public final y:Landroid/graphics/PointF;


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
    iput-object p1, p0, Lt9/e;->s:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lt9/e;->t:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lt9/e;->u:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance p1, Landroid/graphics/PointF;

    .line 31
    .line 32
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lt9/e;->x:Landroid/graphics/PointF;

    .line 36
    .line 37
    new-instance p1, Landroid/graphics/PointF;

    .line 38
    .line 39
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lt9/e;->y:Landroid/graphics/PointF;

    .line 43
    .line 44
    invoke-direct {p0}, Lt9/e;->X()V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lt9/e;->W()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method private final W()V
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
    iget-object v1, p0, Lt9/e;->s:Ljava/util/ArrayList;

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
    iget-object v11, p0, Lt9/e;->t:Ljava/util/ArrayList;

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
    invoke-virtual {v0}, Lq9/b;->E()F

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    const/high16 v1, 0x42180000    # 38.0f

    .line 142
    .line 143
    sub-float/2addr v0, v1

    .line 144
    div-float/2addr v0, v3

    .line 145
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v2}, Lq9/b;->E()F

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    sub-float/2addr v2, v1

    .line 154
    div-float/2addr v2, v3

    .line 155
    add-float/2addr v2, v1

    .line 156
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-virtual {v3}, Lq9/b;->I()Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    :goto_2
    if-ge v7, v3, :cond_3

    .line 169
    .line 170
    iget-object v4, p0, Lt9/e;->u:Ljava/util/ArrayList;

    .line 171
    .line 172
    new-instance v5, Landroid/graphics/RectF;

    .line 173
    .line 174
    const/high16 v8, 0x42740000    # 61.0f

    .line 175
    .line 176
    int-to-float v9, v7

    .line 177
    mul-float/2addr v9, v8

    .line 178
    add-float/2addr v9, v6

    .line 179
    add-float v8, v9, v1

    .line 180
    .line 181
    invoke-direct {v5, v9, v0, v8, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    add-int/lit8 v7, v7, 0x1

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_3
    return-void
.end method

.method private final X()V
    .locals 5

    .line 1
    iget-object v0, p0, Lt9/e;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt9/e;->s:Ljava/util/ArrayList;

    .line 7
    .line 8
    sget-object v1, Ls9/c$d;->c:Ls9/c$d;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lt9/e;->s:Ljava/util/ArrayList;

    .line 14
    .line 15
    sget-object v1, Ls9/c$e;->c:Ls9/c$e;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lt9/e;->s:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v1, Ls9/c$b;

    .line 23
    .line 24
    invoke-virtual {p0}, Lt9/e;->T()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Lq9/b;->I()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-direct {v1, v2, v3}, Ls9/c$b;-><init>(ZI)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lt9/e;->s:Ljava/util/ArrayList;

    .line 54
    .line 55
    sget-object v1, Ls9/c$a;->c:Ls9/c$a;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public A(FF)Z
    .locals 12

    .line 1
    invoke-super {p0, p1, p2}, Lt9/a;->A(FF)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lt9/a;->e()Ls9/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v2, v0, Ls9/b$c;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Lt9/a;->e()Ls9/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame"

    .line 23
    .line 24
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v0, Ls9/b$c;

    .line 28
    .line 29
    invoke-virtual {p0, v0, p1, p2}, Lt9/e;->V(Ls9/b$c;FF)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lt9/e;->Y()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lt9/e;->S()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lt9/a;->v()Landroid/graphics/PointF;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    sget-object p2, Lna/o;->a:Lna/o;

    .line 45
    .line 46
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p2, p1, v0}, Lna/o;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    :cond_1
    move-object v11, v3

    .line 55
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lba/c;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Lt9/a;->l()Lv9/c;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    move-object v5, p1

    .line 72
    check-cast v5, Lca/b;

    .line 73
    .line 74
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-virtual {p0}, Lt9/e;->f()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    invoke-interface/range {v4 .. v11}, Lv9/c;->H(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    instance-of v0, v0, Ls9/b$e;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    invoke-virtual {p0, p1, p2}, Lt9/e;->U(FF)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lt9/a;->v()Landroid/graphics/PointF;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_3

    .line 110
    .line 111
    sget-object p2, Lna/o;->a:Lna/o;

    .line 112
    .line 113
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {p2, p1, v0}, Lna/o;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    :cond_3
    move-object v11, v3

    .line 122
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    check-cast p1, Lba/c;

    .line 131
    .line 132
    if-eqz p1, :cond_4

    .line 133
    .line 134
    invoke-virtual {p0}, Lt9/a;->l()Lv9/c;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    move-object v5, p1

    .line 139
    check-cast v5, Lca/b;

    .line 140
    .line 141
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    invoke-virtual {p0}, Lt9/e;->f()Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    invoke-interface/range {v4 .. v11}, Lv9/c;->H(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 162
    .line 163
    .line 164
    :cond_4
    :goto_0
    return v1

    .line 165
    :cond_5
    const/4 p1, 0x0

    .line 166
    return p1
.end method

.method public F(FF)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lt9/d;->c()Landroid/graphics/RectF;

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
    iget-object v0, p0, Lt9/e;->s:Ljava/util/ArrayList;

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
    instance-of v6, v6, Ls9/c$b;

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
    if-eqz v5, :cond_5

    .line 76
    .line 77
    invoke-virtual {v5}, Ls9/c;->b()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ne v0, v2, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lt9/d;->a()Ljava/util/ArrayList;

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
    invoke-virtual {v4}, Lt9/d;->a()Ljava/util/ArrayList;

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
    new-instance p1, Ls9/b$a;

    .line 119
    .line 120
    invoke-direct {p1, v3}, Ls9/b$a;-><init>(I)V

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
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const/4 v3, 0x2

    .line 139
    new-array v4, v3, [F

    .line 140
    .line 141
    aput p1, v4, v1

    .line 142
    .line 143
    aput p2, v4, v2

    .line 144
    .line 145
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 146
    .line 147
    .line 148
    aget p1, v4, v1

    .line 149
    .line 150
    aget p2, v4, v2

    .line 151
    .line 152
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4}, Lq9/b;->H()F

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-virtual {p0}, Lt9/e;->T()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_a

    .line 169
    .line 170
    invoke-virtual {p0}, Lt9/a;->v()Landroid/graphics/PointF;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    if-eqz v4, :cond_6

    .line 175
    .line 176
    new-instance v5, Landroid/graphics/RectF;

    .line 177
    .line 178
    iget v6, v4, Landroid/graphics/PointF;->x:F

    .line 179
    .line 180
    int-to-float v7, v3

    .line 181
    div-float v7, v0, v7

    .line 182
    .line 183
    sub-float v8, v6, v7

    .line 184
    .line 185
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 186
    .line 187
    sub-float v9, v4, v7

    .line 188
    .line 189
    add-float/2addr v6, v7

    .line 190
    add-float/2addr v4, v7

    .line 191
    invoke-direct {v5, v8, v9, v6, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v5, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-eqz v4, :cond_6

    .line 199
    .line 200
    sget-object p1, Ls9/b$e;->a:Ls9/b$e;

    .line 201
    .line 202
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 203
    .line 204
    .line 205
    return v2

    .line 206
    :cond_6
    new-instance v4, Landroid/graphics/RectF;

    .line 207
    .line 208
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 213
    .line 214
    int-to-float v6, v3

    .line 215
    div-float v6, v0, v6

    .line 216
    .line 217
    sub-float/2addr v5, v6

    .line 218
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerY()F

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    sub-float/2addr v7, v6

    .line 227
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    iget v8, v8, Landroid/graphics/RectF;->left:F

    .line 232
    .line 233
    add-float/2addr v8, v6

    .line 234
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    invoke-virtual {v9}, Landroid/graphics/RectF;->centerY()F

    .line 239
    .line 240
    .line 241
    move-result v9

    .line 242
    add-float/2addr v9, v6

    .line 243
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    if-eqz v4, :cond_7

    .line 251
    .line 252
    sget-object p1, Ls9/b$c$b;->a:Ls9/b$c$b;

    .line 253
    .line 254
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 255
    .line 256
    .line 257
    return v2

    .line 258
    :cond_7
    new-instance v4, Landroid/graphics/RectF;

    .line 259
    .line 260
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    sub-float/2addr v5, v6

    .line 269
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 274
    .line 275
    sub-float/2addr v7, v6

    .line 276
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 277
    .line 278
    .line 279
    move-result-object v8

    .line 280
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    .line 281
    .line 282
    .line 283
    move-result v8

    .line 284
    add-float/2addr v8, v6

    .line 285
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 290
    .line 291
    add-float/2addr v9, v6

    .line 292
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    if-eqz v4, :cond_8

    .line 300
    .line 301
    sget-object p1, Ls9/b$c$d;->a:Ls9/b$c$d;

    .line 302
    .line 303
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 304
    .line 305
    .line 306
    return v2

    .line 307
    :cond_8
    new-instance v4, Landroid/graphics/RectF;

    .line 308
    .line 309
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 314
    .line 315
    sub-float/2addr v5, v6

    .line 316
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerY()F

    .line 321
    .line 322
    .line 323
    move-result v7

    .line 324
    sub-float/2addr v7, v6

    .line 325
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    iget v8, v8, Landroid/graphics/RectF;->right:F

    .line 330
    .line 331
    add-float/2addr v8, v6

    .line 332
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    invoke-virtual {v9}, Landroid/graphics/RectF;->centerY()F

    .line 337
    .line 338
    .line 339
    move-result v9

    .line 340
    add-float/2addr v9, v6

    .line 341
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    if-eqz v4, :cond_9

    .line 349
    .line 350
    sget-object p1, Ls9/b$c$c;->a:Ls9/b$c$c;

    .line 351
    .line 352
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 353
    .line 354
    .line 355
    return v2

    .line 356
    :cond_9
    new-instance v4, Landroid/graphics/RectF;

    .line 357
    .line 358
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    sub-float/2addr v5, v6

    .line 367
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    .line 372
    .line 373
    sub-float/2addr v7, v6

    .line 374
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 375
    .line 376
    .line 377
    move-result-object v8

    .line 378
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    .line 379
    .line 380
    .line 381
    move-result v8

    .line 382
    add-float/2addr v8, v6

    .line 383
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 384
    .line 385
    .line 386
    move-result-object v9

    .line 387
    iget v9, v9, Landroid/graphics/RectF;->bottom:F

    .line 388
    .line 389
    add-float/2addr v9, v6

    .line 390
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    if-eqz v4, :cond_a

    .line 398
    .line 399
    sget-object p1, Ls9/b$c$a;->a:Ls9/b$c$a;

    .line 400
    .line 401
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 402
    .line 403
    .line 404
    return v2

    .line 405
    :cond_a
    new-instance v4, Landroid/graphics/RectF;

    .line 406
    .line 407
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    .line 412
    .line 413
    .line 414
    move-result v5

    .line 415
    int-to-float v3, v3

    .line 416
    div-float v6, v0, v3

    .line 417
    .line 418
    sub-float/2addr v5, v6

    .line 419
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 420
    .line 421
    .line 422
    move-result-object v7

    .line 423
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 424
    .line 425
    const/4 v8, 0x5

    .line 426
    int-to-float v8, v8

    .line 427
    mul-float/2addr v8, v0

    .line 428
    div-float/2addr v8, v3

    .line 429
    sub-float/2addr v7, v8

    .line 430
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    .line 435
    .line 436
    .line 437
    move-result v8

    .line 438
    add-float/2addr v8, v6

    .line 439
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 440
    .line 441
    .line 442
    move-result-object v9

    .line 443
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 444
    .line 445
    const/4 v10, 0x3

    .line 446
    int-to-float v10, v10

    .line 447
    mul-float/2addr v0, v10

    .line 448
    div-float/2addr v0, v3

    .line 449
    sub-float/2addr v9, v0

    .line 450
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 454
    .line 455
    .line 456
    move-result v0

    .line 457
    if-eqz v0, :cond_b

    .line 458
    .line 459
    sget-object p1, Ls9/b$g;->a:Ls9/b$g;

    .line 460
    .line 461
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 462
    .line 463
    .line 464
    return v2

    .line 465
    :cond_b
    new-instance v0, Landroid/graphics/RectF;

    .line 466
    .line 467
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 472
    .line 473
    sub-float/2addr v3, v6

    .line 474
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 479
    .line 480
    sub-float/2addr v4, v6

    .line 481
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 482
    .line 483
    .line 484
    move-result-object v5

    .line 485
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 486
    .line 487
    add-float/2addr v5, v6

    .line 488
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 489
    .line 490
    .line 491
    move-result-object v7

    .line 492
    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    .line 493
    .line 494
    add-float/2addr v7, v6

    .line 495
    invoke-direct {v0, v3, v4, v5, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    if-eqz v0, :cond_c

    .line 503
    .line 504
    sget-object p1, Ls9/b$h;->a:Ls9/b$h;

    .line 505
    .line 506
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 507
    .line 508
    .line 509
    return v2

    .line 510
    :cond_c
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 515
    .line 516
    .line 517
    move-result p1

    .line 518
    if-eqz p1, :cond_d

    .line 519
    .line 520
    sget-object p1, Ls9/b$b;->a:Ls9/b$b;

    .line 521
    .line 522
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 523
    .line 524
    .line 525
    return v2

    .line 526
    :cond_d
    sget-object p1, Ls9/b$f;->a:Ls9/b$f;

    .line 527
    .line 528
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 529
    .line 530
    .line 531
    return v1
.end method

.method public H()V
    .locals 0

    .line 1
    invoke-super {p0}, Lt9/a;->H()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lt9/e;->X()V

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
    iget-object v0, p0, Lt9/e;->s:Ljava/util/ArrayList;

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
    instance-of v4, v4, Ls9/c$b;

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
    check-cast v3, Ls9/c$b;

    .line 38
    .line 39
    invoke-virtual {p0}, Lt9/e;->T()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {v3, v0}, Ls9/c$b;->g(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ls9/c$b;->e()Z

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
    const-string v0, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.GeometryGraph"

    .line 60
    .line 61
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    check-cast p1, Lca/b;

    .line 65
    .line 66
    invoke-virtual {p1}, Lca/b;->F()Landroid/graphics/Paint;

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
    invoke-virtual {v3, v1}, Ls9/c$b;->f(I)V

    .line 77
    .line 78
    .line 79
    :cond_3
    return-void
.end method

.method public R()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lt9/d;->c()Landroid/graphics/RectF;

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
    iget-object v3, p0, Lt9/e;->t:Ljava/util/ArrayList;

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
    iget-object v7, p0, Lt9/e;->t:Ljava/util/ArrayList;

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
    iget-object v5, p0, Lt9/e;->t:Ljava/util/ArrayList;

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
    iget-object v8, p0, Lt9/e;->t:Ljava/util/ArrayList;

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
    invoke-virtual {v0}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 142
    .line 143
    .line 144
    iget-object v1, p0, Lt9/e;->u:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    move v3, v4

    .line 151
    :goto_0
    if-ge v3, v2, :cond_0

    .line 152
    .line 153
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    add-int/lit8 v3, v3, 0x1

    .line 158
    .line 159
    check-cast v5, Landroid/graphics/RectF;

    .line 160
    .line 161
    invoke-virtual {v0}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    new-instance v7, Landroid/graphics/RectF;

    .line 166
    .line 167
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    iget v8, v8, Landroid/graphics/RectF;->left:F

    .line 172
    .line 173
    iget v9, v5, Landroid/graphics/RectF;->left:F

    .line 174
    .line 175
    add-float/2addr v8, v9

    .line 176
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 181
    .line 182
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    invoke-virtual {v10}, Lq9/b;->E()F

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    const/high16 v11, 0x41500000    # 13.0f

    .line 191
    .line 192
    add-float/2addr v10, v11

    .line 193
    add-float/2addr v9, v10

    .line 194
    iget v10, v5, Landroid/graphics/RectF;->top:F

    .line 195
    .line 196
    add-float/2addr v9, v10

    .line 197
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    iget v10, v10, Landroid/graphics/RectF;->left:F

    .line 202
    .line 203
    iget v12, v5, Landroid/graphics/RectF;->right:F

    .line 204
    .line 205
    add-float/2addr v10, v12

    .line 206
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 207
    .line 208
    .line 209
    move-result-object v12

    .line 210
    iget v12, v12, Landroid/graphics/RectF;->top:F

    .line 211
    .line 212
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 213
    .line 214
    .line 215
    move-result-object v13

    .line 216
    invoke-virtual {v13}, Lq9/b;->E()F

    .line 217
    .line 218
    .line 219
    move-result v13

    .line 220
    add-float/2addr v13, v11

    .line 221
    add-float/2addr v12, v13

    .line 222
    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    .line 223
    .line 224
    add-float/2addr v12, v5

    .line 225
    invoke-direct {v7, v8, v9, v10, v12}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_0

    .line 232
    :cond_0
    invoke-virtual {p0}, Lt9/a;->G()Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-nez v1, :cond_1

    .line 237
    .line 238
    invoke-virtual {v0}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 243
    .line 244
    invoke-virtual {v0}, Lt9/d;->c()Landroid/graphics/RectF;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 249
    .line 250
    sub-float/2addr v1, v2

    .line 251
    const/high16 v2, 0x41800000    # 16.0f

    .line 252
    .line 253
    add-float/2addr v1, v2

    .line 254
    invoke-virtual {v0}, Lt9/d;->c()Landroid/graphics/RectF;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    sub-float/2addr v3, v1

    .line 267
    const/4 v5, 0x0

    .line 268
    invoke-virtual {v2, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    sub-float/2addr v3, v1

    .line 284
    invoke-virtual {v2, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-static {v1}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    check-cast v1, Landroid/graphics/RectF;

    .line 296
    .line 297
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 298
    .line 299
    invoke-virtual {v0}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-static {v2}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    check-cast v2, Landroid/graphics/RectF;

    .line 308
    .line 309
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 310
    .line 311
    sub-float/2addr v1, v2

    .line 312
    const/high16 v2, 0x42380000    # 46.0f

    .line 313
    .line 314
    add-float/2addr v1, v2

    .line 315
    invoke-virtual {v0}, Lt9/d;->a()Ljava/util/ArrayList;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    :goto_1
    if-ge v4, v2, :cond_1

    .line 324
    .line 325
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    add-int/lit8 v4, v4, 0x1

    .line 330
    .line 331
    check-cast v3, Landroid/graphics/RectF;

    .line 332
    .line 333
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    sub-float/2addr v6, v1

    .line 342
    invoke-virtual {v3, v6, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 343
    .line 344
    .line 345
    goto :goto_1

    .line 346
    :cond_1
    return-void
.end method

.method public final S()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lt9/e;->p()Landroid/graphics/RectF;

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
    invoke-virtual {p0}, Lt9/e;->R()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final T()Z
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

.method public final U(FF)V
    .locals 11

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lt9/e;->x:Landroid/graphics/PointF;

    .line 7
    .line 8
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 9
    .line 10
    iget v4, v1, Landroid/graphics/PointF;->y:F

    .line 11
    .line 12
    iget-object v1, p0, Lt9/e;->y:Landroid/graphics/PointF;

    .line 13
    .line 14
    iget v5, v1, Landroid/graphics/PointF;->x:F

    .line 15
    .line 16
    iget v6, v1, Landroid/graphics/PointF;->y:F

    .line 17
    .line 18
    move v7, v3

    .line 19
    move v8, v4

    .line 20
    move-object v2, p0

    .line 21
    move v9, p1

    .line 22
    move v10, p2

    .line 23
    invoke-virtual/range {v2 .. v10}, Lt9/e;->b(FFFFFFFF)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/4 p2, 0x0

    .line 28
    cmpg-float p2, p1, p2

    .line 29
    .line 30
    if-gez p2, :cond_0

    .line 31
    .line 32
    iget-object p1, v2, Lt9/e;->x:Landroid/graphics/PointF;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p2, v2, Lt9/e;->x:Landroid/graphics/PointF;

    .line 39
    .line 40
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 41
    .line 42
    iget-object v3, v2, Lt9/e;->y:Landroid/graphics/PointF;

    .line 43
    .line 44
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 45
    .line 46
    sub-float v5, v1, v4

    .line 47
    .line 48
    sub-float/2addr v1, v4

    .line 49
    mul-float/2addr v5, v1

    .line 50
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 51
    .line 52
    iget v1, v3, Landroid/graphics/PointF;->y:F

    .line 53
    .line 54
    sub-float v3, p2, v1

    .line 55
    .line 56
    sub-float/2addr p2, v1

    .line 57
    mul-float/2addr v3, p2

    .line 58
    add-float/2addr v5, v3

    .line 59
    float-to-double v3, v5

    .line 60
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    double-to-float p2, v3

    .line 65
    cmpl-float v1, p1, p2

    .line 66
    .line 67
    if-lez v1, :cond_1

    .line 68
    .line 69
    iget-object p1, v2, Lt9/e;->y:Landroid/graphics/PointF;

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    div-float/2addr p1, p2

    .line 76
    iget-object p2, v2, Lt9/e;->x:Landroid/graphics/PointF;

    .line 77
    .line 78
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 79
    .line 80
    iget-object v3, v2, Lt9/e;->y:Landroid/graphics/PointF;

    .line 81
    .line 82
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 83
    .line 84
    sub-float/2addr v4, v1

    .line 85
    mul-float/2addr v4, p1

    .line 86
    add-float/2addr v1, v4

    .line 87
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 88
    .line 89
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 90
    .line 91
    sub-float/2addr v3, p2

    .line 92
    mul-float/2addr v3, p1

    .line 93
    add-float/2addr p2, v3

    .line 94
    invoke-virtual {v0, v1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 95
    .line 96
    .line 97
    :goto_0
    sget-object p1, Lna/o;->a:Lna/o;

    .line 98
    .line 99
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p2}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p1, v0, p2}, Lna/o;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    check-cast p1, Lba/c;

    .line 123
    .line 124
    if-eqz p1, :cond_2

    .line 125
    .line 126
    check-cast p1, Lca/b;

    .line 127
    .line 128
    new-instance p2, Landroid/graphics/PointF;

    .line 129
    .line 130
    invoke-virtual {p1}, Lba/a;->g()Landroid/graphics/RectF;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 135
    .line 136
    invoke-virtual {p1}, Lba/a;->g()Landroid/graphics/RectF;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 141
    .line 142
    invoke-direct {p2, v1, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 143
    .line 144
    .line 145
    new-instance v1, Landroid/graphics/PointF;

    .line 146
    .line 147
    invoke-virtual {p1}, Lba/a;->g()Landroid/graphics/RectF;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 152
    .line 153
    invoke-virtual {p1}, Lba/a;->g()Landroid/graphics/RectF;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 158
    .line 159
    invoke-direct {v1, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 160
    .line 161
    .line 162
    filled-new-array {v0, p2, v1}, [Landroid/graphics/PointF;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-static {p2}, Lrc/w;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p1, p2}, Lca/b;->J(Ljava/util/List;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Lt9/a;->v()Landroid/graphics/PointF;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    if-eqz p1, :cond_2

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 180
    .line 181
    .line 182
    :cond_2
    return-void
.end method

.method public final V(Ls9/b$c;FF)V
    .locals 12

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
    if-eqz v0, :cond_e

    .line 12
    .line 13
    move-object v9, v0

    .line 14
    check-cast v9, Lca/b;

    .line 15
    .line 16
    new-instance v10, Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-direct {v10}, Landroid/graphics/Matrix;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v9}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lt9/a;->o()Lu9/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 37
    .line 38
    .line 39
    sget-object v0, Lna/o;->a:Lna/o;

    .line 40
    .line 41
    invoke-virtual {v9}, Lba/a;->g()Landroid/graphics/RectF;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 46
    .line 47
    invoke-virtual {v9}, Lba/a;->g()Landroid/graphics/RectF;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2, v10}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v9}, Lba/a;->g()Landroid/graphics/RectF;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 62
    .line 63
    invoke-virtual {v9}, Lba/a;->g()Landroid/graphics/RectF;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 68
    .line 69
    invoke-virtual {v0, v2, v3, v10}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v9}, Lba/a;->g()Landroid/graphics/RectF;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 78
    .line 79
    invoke-virtual {v9}, Lba/a;->g()Landroid/graphics/RectF;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 84
    .line 85
    invoke-virtual {v0, v3, v4, v10}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    instance-of v11, p1, Ls9/b$c$b;

    .line 90
    .line 91
    if-eqz v11, :cond_0

    .line 92
    .line 93
    iget v0, v2, Landroid/graphics/PointF;->x:F

    .line 94
    .line 95
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 96
    .line 97
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 98
    .line 99
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 100
    .line 101
    move v4, v1

    .line 102
    :goto_0
    move v1, v0

    .line 103
    goto :goto_1

    .line 104
    :cond_0
    instance-of v3, p1, Ls9/b$c$d;

    .line 105
    .line 106
    if-eqz v3, :cond_1

    .line 107
    .line 108
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 109
    .line 110
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 111
    .line 112
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 113
    .line 114
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 115
    .line 116
    move v4, v1

    .line 117
    move v1, v2

    .line 118
    move v2, v0

    .line 119
    goto :goto_1

    .line 120
    :cond_1
    instance-of v3, p1, Ls9/b$c$c;

    .line 121
    .line 122
    if-eqz v3, :cond_2

    .line 123
    .line 124
    iget v0, v1, Landroid/graphics/PointF;->x:F

    .line 125
    .line 126
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 127
    .line 128
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 129
    .line 130
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 131
    .line 132
    move v4, v2

    .line 133
    move v2, v1

    .line 134
    goto :goto_0

    .line 135
    :cond_2
    instance-of v2, p1, Ls9/b$c$a;

    .line 136
    .line 137
    if-eqz v2, :cond_d

    .line 138
    .line 139
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 140
    .line 141
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 142
    .line 143
    iget v3, v0, Landroid/graphics/PointF;->x:F

    .line 144
    .line 145
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 146
    .line 147
    move v4, v2

    .line 148
    move v2, v1

    .line 149
    move v1, v4

    .line 150
    move v4, v0

    .line 151
    :goto_1
    invoke-virtual {p0}, Lt9/a;->h()F

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    invoke-virtual {p0}, Lt9/a;->i()F

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    move-object v0, p0

    .line 160
    move v7, p2

    .line 161
    move v8, p3

    .line 162
    invoke-virtual/range {v0 .. v8}, Lt9/e;->b(FFFFFFFF)F

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    iget v2, p0, Lt9/e;->v:F

    .line 167
    .line 168
    iget v3, p0, Lt9/e;->w:F

    .line 169
    .line 170
    const/4 v4, 0x1

    .line 171
    if-eqz v11, :cond_3

    .line 172
    .line 173
    move v5, v4

    .line 174
    goto :goto_2

    .line 175
    :cond_3
    instance-of v5, p1, Ls9/b$c$c;

    .line 176
    .line 177
    :goto_2
    if-eqz v5, :cond_4

    .line 178
    .line 179
    add-float/2addr v2, v1

    .line 180
    goto :goto_4

    .line 181
    :cond_4
    instance-of v5, p1, Ls9/b$c$d;

    .line 182
    .line 183
    if-eqz v5, :cond_5

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_5
    instance-of v4, p1, Ls9/b$c$a;

    .line 187
    .line 188
    :goto_3
    if-eqz v4, :cond_6

    .line 189
    .line 190
    add-float/2addr v3, v1

    .line 191
    :cond_6
    :goto_4
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1}, Lq9/b;->H()F

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    const/4 v4, 0x2

    .line 200
    int-to-float v4, v4

    .line 201
    mul-float/2addr v1, v4

    .line 202
    cmpg-float v4, v2, v1

    .line 203
    .line 204
    if-gez v4, :cond_7

    .line 205
    .line 206
    move v2, v1

    .line 207
    :cond_7
    cmpg-float v4, v3, v1

    .line 208
    .line 209
    if-gez v4, :cond_8

    .line 210
    .line 211
    move v3, v1

    .line 212
    :cond_8
    invoke-static {v10}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    new-instance v3, Landroid/graphics/RectF;

    .line 225
    .line 226
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-direct {v3, v4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 231
    .line 232
    .line 233
    if-eqz v11, :cond_9

    .line 234
    .line 235
    iget v1, v3, Landroid/graphics/RectF;->right:F

    .line 236
    .line 237
    sub-float/2addr v1, v2

    .line 238
    iput v1, v3, Landroid/graphics/RectF;->left:F

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_9
    instance-of v4, p1, Ls9/b$c$d;

    .line 242
    .line 243
    if-eqz v4, :cond_a

    .line 244
    .line 245
    iget v2, v3, Landroid/graphics/RectF;->bottom:F

    .line 246
    .line 247
    sub-float/2addr v2, v1

    .line 248
    iput v2, v3, Landroid/graphics/RectF;->top:F

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_a
    instance-of v4, p1, Ls9/b$c$c;

    .line 252
    .line 253
    if-eqz v4, :cond_b

    .line 254
    .line 255
    iget v1, v3, Landroid/graphics/RectF;->left:F

    .line 256
    .line 257
    add-float/2addr v1, v2

    .line 258
    iput v1, v3, Landroid/graphics/RectF;->right:F

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_b
    instance-of v2, p1, Ls9/b$c$a;

    .line 262
    .line 263
    if-eqz v2, :cond_c

    .line 264
    .line 265
    iget v2, v3, Landroid/graphics/RectF;->top:F

    .line 266
    .line 267
    add-float/2addr v2, v1

    .line 268
    iput v2, v3, Landroid/graphics/RectF;->bottom:F

    .line 269
    .line 270
    :cond_c
    :goto_5
    invoke-virtual {v9, v3}, Lca/b;->p(Landroid/graphics/RectF;)V

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 275
    .line 276
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 277
    .line 278
    .line 279
    throw v1

    .line 280
    :cond_e
    return-void
.end method

.method public final Y()V
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
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lt9/a;->o()Lu9/a;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 47
    .line 48
    .line 49
    check-cast v0, Lca/b;

    .line 50
    .line 51
    invoke-virtual {v0}, Lca/b;->E()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Landroid/graphics/PointF;

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lt9/a;->O(Landroid/graphics/PointF;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void
.end method

.method public final a(FF)F
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_1

    .line 5
    .line 6
    cmpl-float p1, p2, v0

    .line 7
    .line 8
    if-lez p1, :cond_0

    .line 9
    .line 10
    const-wide p1, 0x4056800000000000L    # 90.0

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-wide p1, -0x3fa9800000000000L    # -90.0

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    double-to-float p1, p1

    .line 26
    return p1

    .line 27
    :cond_1
    cmpl-float v1, p1, v0

    .line 28
    .line 29
    if-lez v1, :cond_2

    .line 30
    .line 31
    move v1, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    const-wide v1, 0x4066800000000000L    # 180.0

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    double-to-float v1, v1

    .line 43
    :goto_1
    cmpl-float v0, p2, v0

    .line 44
    .line 45
    if-lez v0, :cond_3

    .line 46
    .line 47
    const/4 v0, -0x1

    .line 48
    goto :goto_2

    .line 49
    :cond_3
    const/4 v0, 0x1

    .line 50
    :goto_2
    div-float/2addr p2, p1

    .line 51
    float-to-double p1, p2

    .line 52
    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    double-to-float p1, p1

    .line 57
    int-to-float p2, v0

    .line 58
    mul-float/2addr v1, p2

    .line 59
    add-float/2addr v1, p1

    .line 60
    return v1
.end method

.method public final b(FFFFFFFF)F
    .locals 0

    .line 1
    sub-float/2addr p3, p1

    .line 2
    sub-float/2addr p4, p2

    .line 3
    invoke-virtual {p0, p3, p4}, Lt9/e;->a(FF)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sub-float/2addr p7, p5

    .line 8
    sub-float/2addr p8, p6

    .line 9
    invoke-virtual {p0, p7, p8}, Lt9/e;->a(FF)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    sub-float/2addr p1, p2

    .line 14
    mul-float/2addr p7, p7

    .line 15
    mul-float/2addr p8, p8

    .line 16
    add-float/2addr p7, p8

    .line 17
    float-to-double p2, p7

    .line 18
    invoke-static {p2, p3}, Ljava/lang/Math;->sqrt(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    double-to-float p2, p2

    .line 23
    float-to-double p3, p1

    .line 24
    invoke-static {p3, p4}, Ljava/lang/Math;->cos(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide p3

    .line 28
    double-to-float p1, p3

    .line 29
    mul-float/2addr p1, p2

    .line 30
    return p1
.end method

.method public f()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/e;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Landroid/graphics/RectF;
    .locals 4

    .line 1
    iget-object v0, p0, Lt9/e;->t:Ljava/util/ArrayList;

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
    iget-object v1, p0, Lt9/e;->u:Ljava/util/ArrayList;

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
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lq9/b;->E()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x2

    .line 43
    int-to-float v2, v2

    .line 44
    mul-float/2addr v1, v2

    .line 45
    const/high16 v2, 0x41500000    # 13.0f

    .line 46
    .line 47
    add-float/2addr v1, v2

    .line 48
    new-instance v2, Landroid/graphics/RectF;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v2, v3, v3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 52
    .line 53
    .line 54
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
    invoke-virtual {v0}, Lt9/e;->H()V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_2

    .line 86
    .line 87
    :cond_2
    iget-object v1, v0, Lt9/e;->s:Ljava/util/ArrayList;

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
    instance-of v8, v8, Ls9/c$b;

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
    if-eqz v4, :cond_c

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
    instance-of v1, v1, Ls9/b$a;

    .line 128
    .line 129
    if-eqz v1, :cond_c

    .line 130
    .line 131
    invoke-virtual {v0}, Lt9/a;->e()Ls9/b;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color"

    .line 136
    .line 137
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    check-cast v1, Ls9/b$a;

    .line 141
    .line 142
    invoke-virtual {v1}, Ls9/b$a;->a()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-virtual {v0}, Lt9/a;->d()Lq9/b;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v3}, Lq9/b;->I()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, Ljava/lang/Number;

    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    move v7, v2

    .line 173
    :cond_6
    :goto_0
    if-ge v7, v6, :cond_7

    .line 174
    .line 175
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    add-int/lit8 v7, v7, 0x1

    .line 180
    .line 181
    move-object v10, v8

    .line 182
    check-cast v10, Lba/c;

    .line 183
    .line 184
    instance-of v8, v10, Lca/b;

    .line 185
    .line 186
    if-eqz v8, :cond_6

    .line 187
    .line 188
    move-object v8, v10

    .line 189
    check-cast v8, Lca/b;

    .line 190
    .line 191
    invoke-virtual {v8}, Lca/b;->F()Landroid/graphics/Paint;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    if-eqz v9, :cond_6

    .line 196
    .line 197
    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v8, v9}, Lca/b;->I(Landroid/graphics/Paint;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    sget-object v11, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->j:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 208
    .line 209
    new-instance v14, Landroid/graphics/Paint;

    .line 210
    .line 211
    invoke-direct {v14, v9}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 212
    .line 213
    .line 214
    const/16 v18, 0xec

    .line 215
    .line 216
    const/16 v19, 0x0

    .line 217
    .line 218
    const/4 v12, 0x0

    .line 219
    const/4 v13, 0x0

    .line 220
    const/4 v15, 0x0

    .line 221
    const/16 v16, 0x0

    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    move-object v9, v8

    .line 226
    invoke-static/range {v9 .. v19}, Lr9/b$a;->a(Lr9/b;Lba/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    const-string v6, "GeometryFunction:color -> color:"

    .line 236
    .line 237
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string v6, " graphList: "

    .line 244
    .line 245
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    new-instance v7, Ljava/util/ArrayList;

    .line 253
    .line 254
    const/16 v8, 0xa

    .line 255
    .line 256
    invoke-static {v6, v8}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    move v9, v2

    .line 268
    :goto_1
    if-ge v9, v8, :cond_8

    .line 269
    .line 270
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    add-int/lit8 v9, v9, 0x1

    .line 275
    .line 276
    check-cast v10, Lba/c;

    .line 277
    .line 278
    invoke-interface {v10}, Lba/c;->getId()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    invoke-interface {v7, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_8
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Lt9/a;->l()Lv9/c;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-interface {v3}, Lv9/c;->g()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, Lt9/a;->n()Lr9/b;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    invoke-interface {v3}, Lr9/b;->l()V

    .line 312
    .line 313
    .line 314
    iget-object v3, v0, Lt9/e;->s:Ljava/util/ArrayList;

    .line 315
    .line 316
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    move v7, v2

    .line 321
    :cond_9
    if-ge v7, v6, :cond_a

    .line 322
    .line 323
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    add-int/lit8 v7, v7, 0x1

    .line 328
    .line 329
    move-object v9, v8

    .line 330
    check-cast v9, Ls9/c;

    .line 331
    .line 332
    instance-of v9, v9, Ls9/c$b;

    .line 333
    .line 334
    if-eqz v9, :cond_9

    .line 335
    .line 336
    move-object v4, v8

    .line 337
    :cond_a
    check-cast v4, Ls9/c;

    .line 338
    .line 339
    if-eqz v4, :cond_b

    .line 340
    .line 341
    check-cast v4, Ls9/c$b;

    .line 342
    .line 343
    invoke-virtual {v4, v1}, Ls9/c$b;->f(I)V

    .line 344
    .line 345
    .line 346
    :cond_b
    invoke-virtual {v0, v2}, Lt9/a;->P(Z)V

    .line 347
    .line 348
    .line 349
    :cond_c
    :goto_2
    return v5
.end method

.method public y(FF)Z
    .locals 22

    .line 1
    invoke-super/range {p0 .. p2}, Lt9/a;->y(FF)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lt9/a;->e()Ls9/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v2, v0, Ls9/b$c;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    invoke-virtual/range {p0 .. p0}, Lt9/a;->e()Ls9/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame"

    .line 23
    .line 24
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v0, Ls9/b$c;

    .line 28
    .line 29
    move-object/from16 v2, p0

    .line 30
    .line 31
    move/from16 v4, p1

    .line 32
    .line 33
    move/from16 v5, p2

    .line 34
    .line 35
    invoke-virtual {v2, v0, v4, v5}, Lt9/e;->V(Ls9/b$c;FF)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lt9/e;->Y()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lt9/e;->S()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Lt9/a;->v()Landroid/graphics/PointF;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    sget-object v3, Lna/o;->a:Lna/o;

    .line 51
    .line 52
    invoke-virtual {v2}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v3, v0, v4}, Lna/o;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    :cond_1
    move-object v10, v3

    .line 61
    invoke-virtual {v2}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    move-object v12, v0

    .line 70
    check-cast v12, Lba/c;

    .line 71
    .line 72
    if-eqz v12, :cond_2

    .line 73
    .line 74
    invoke-virtual {v2}, Lt9/a;->l()Lv9/c;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v2}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v2}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v2}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {v2}, Lt9/a;->j()Lt9/d;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    invoke-virtual {v2}, Lt9/e;->f()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    invoke-interface/range {v4 .. v10}, Lv9/c;->v(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Lt9/a;->n()Lr9/b;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    sget-object v13, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->j:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 106
    .line 107
    invoke-interface {v12}, Lba/c;->g()Landroid/graphics/RectF;

    .line 108
    .line 109
    .line 110
    move-result-object v14

    .line 111
    const/16 v20, 0xf8

    .line 112
    .line 113
    const/16 v21, 0x0

    .line 114
    .line 115
    const/4 v15, 0x0

    .line 116
    const/16 v16, 0x0

    .line 117
    .line 118
    const/16 v17, 0x0

    .line 119
    .line 120
    const/16 v18, 0x0

    .line 121
    .line 122
    const/16 v19, 0x0

    .line 123
    .line 124
    invoke-static/range {v11 .. v21}, Lr9/b$a;->a(Lr9/b;Lba/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_2
    invoke-virtual {v2}, Lt9/a;->n()Lr9/b;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-interface {v0}, Lr9/b;->l()V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_3
    move-object/from16 v2, p0

    .line 136
    .line 137
    move/from16 v4, p1

    .line 138
    .line 139
    move/from16 v5, p2

    .line 140
    .line 141
    instance-of v0, v0, Ls9/b$e;

    .line 142
    .line 143
    if-eqz v0, :cond_6

    .line 144
    .line 145
    invoke-virtual/range {p0 .. p2}, Lt9/e;->U(FF)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Lt9/a;->v()Landroid/graphics/PointF;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    if-eqz v0, :cond_4

    .line 153
    .line 154
    sget-object v3, Lna/o;->a:Lna/o;

    .line 155
    .line 156
    invoke-virtual {v2}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-virtual {v3, v0, v4}, Lna/o;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    :cond_4
    move-object v10, v3

    .line 165
    invoke-virtual {v2}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v0}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    move-object v12, v0

    .line 174
    check-cast v12, Lba/c;

    .line 175
    .line 176
    if-eqz v12, :cond_5

    .line 177
    .line 178
    invoke-virtual {v2}, Lt9/a;->l()Lv9/c;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v2}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-virtual {v2}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    invoke-virtual {v2}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-virtual {v2}, Lt9/a;->j()Lt9/d;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    invoke-virtual {v2}, Lt9/e;->f()Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    invoke-interface/range {v4 .. v10}, Lv9/c;->v(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Lt9/a;->n()Lr9/b;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    sget-object v13, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->j:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 210
    .line 211
    move-object v0, v12

    .line 212
    check-cast v0, Lca/b;

    .line 213
    .line 214
    invoke-virtual {v0}, Lca/b;->G()Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v17

    .line 218
    const/16 v20, 0xdc

    .line 219
    .line 220
    const/16 v21, 0x0

    .line 221
    .line 222
    const/4 v14, 0x0

    .line 223
    const/4 v15, 0x0

    .line 224
    const/16 v16, 0x0

    .line 225
    .line 226
    const/16 v18, 0x0

    .line 227
    .line 228
    const/16 v19, 0x0

    .line 229
    .line 230
    invoke-static/range {v11 .. v21}, Lr9/b$a;->a(Lr9/b;Lba/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_5
    invoke-virtual {v2}, Lt9/a;->n()Lr9/b;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-interface {v0}, Lr9/b;->l()V

    .line 238
    .line 239
    .line 240
    :goto_0
    return v1

    .line 241
    :cond_6
    const/4 v0, 0x0

    .line 242
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
    instance-of p2, p1, Ls9/b$c;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lba/c;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    check-cast p1, Lca/b;

    .line 24
    .line 25
    new-instance p2, Landroid/graphics/Matrix;

    .line 26
    .line 27
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lt9/a;->o()Lu9/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lba/a;->g()Landroid/graphics/RectF;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput v0, p0, Lt9/e;->v:F

    .line 61
    .line 62
    invoke-virtual {p1}, Lba/a;->g()Landroid/graphics/RectF;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    iput p2, p0, Lt9/e;->w:F

    .line 75
    .line 76
    new-instance p2, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v0, "GeometryFunction:changeFrame -> start graph:"

    .line 82
    .line 83
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lba/a;->getId()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lt9/e;->Y()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lt9/e;->S()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lt9/a;->v()Landroid/graphics/PointF;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz p1, :cond_0

    .line 115
    .line 116
    sget-object p2, Lna/o;->a:Lna/o;

    .line 117
    .line 118
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p2, p1, v0}, Lna/o;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    :cond_0
    move-object v9, v1

    .line 127
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Lba/c;

    .line 136
    .line 137
    if-eqz p1, :cond_5

    .line 138
    .line 139
    invoke-virtual {p0}, Lt9/a;->l()Lv9/c;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    move-object v3, p1

    .line 144
    check-cast v3, Lca/b;

    .line 145
    .line 146
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-virtual {p0}, Lt9/e;->f()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    invoke-interface/range {v2 .. v9}, Lv9/c;->h(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_1
    return v0

    .line 172
    :cond_2
    instance-of p1, p1, Ls9/b$e;

    .line 173
    .line 174
    if-eqz p1, :cond_5

    .line 175
    .line 176
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    check-cast p1, Lba/c;

    .line 185
    .line 186
    if-eqz p1, :cond_4

    .line 187
    .line 188
    check-cast p1, Lca/b;

    .line 189
    .line 190
    new-instance p2, Landroid/graphics/Matrix;

    .line 191
    .line 192
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Lt9/a;->o()Lu9/a;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 211
    .line 212
    .line 213
    iget-object v0, p0, Lt9/e;->x:Landroid/graphics/PointF;

    .line 214
    .line 215
    sget-object v2, Lna/o;->a:Lna/o;

    .line 216
    .line 217
    invoke-virtual {p1}, Lba/a;->g()Landroid/graphics/RectF;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 222
    .line 223
    invoke-virtual {p1}, Lba/a;->g()Landroid/graphics/RectF;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 228
    .line 229
    invoke-virtual {v2, v3, v4, p2}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-virtual {v0, v3}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 234
    .line 235
    .line 236
    iget-object v0, p0, Lt9/e;->y:Landroid/graphics/PointF;

    .line 237
    .line 238
    invoke-virtual {p1}, Lba/a;->g()Landroid/graphics/RectF;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 243
    .line 244
    invoke-virtual {p1}, Lba/a;->g()Landroid/graphics/RectF;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 249
    .line 250
    invoke-virtual {v2, v3, p1, p2}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0}, Lt9/a;->v()Landroid/graphics/PointF;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    if-eqz p1, :cond_3

    .line 262
    .line 263
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    invoke-virtual {v2, p1, p2}, Lna/o;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    :cond_3
    move-object v9, v1

    .line 272
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    check-cast p1, Lba/c;

    .line 281
    .line 282
    if-eqz p1, :cond_5

    .line 283
    .line 284
    invoke-virtual {p0}, Lt9/a;->l()Lv9/c;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    move-object v3, p1

    .line 289
    check-cast v3, Lca/b;

    .line 290
    .line 291
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    invoke-virtual {p0}, Lt9/e;->f()Ljava/util/List;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    invoke-interface/range {v2 .. v9}, Lv9/c;->h(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 312
    .line 313
    .line 314
    goto :goto_0

    .line 315
    :cond_4
    return v0

    .line 316
    :cond_5
    :goto_0
    const/4 p1, 0x1

    .line 317
    return p1
.end method
