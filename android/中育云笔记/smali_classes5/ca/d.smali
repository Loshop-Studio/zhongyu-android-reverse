.class public final Lca/d;
.super Lcom/zykj/blackboard/core/graph/group/GroupGraph;
.source "SourceFile"


# instance fields
.field public final r:Lga/d;

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/Integer;

.field public u:Ljava/lang/String;

.field public v:Landroid/graphics/Paint;

.field public w:Landroid/graphics/Matrix;

.field public x:Landroid/graphics/Path;

.field public y:F


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Lga/d;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outRectF"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p4, p5}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 3
    iput-object p3, p0, Lca/d;->r:Lga/d;

    .line 4
    iput-object p4, p0, Lca/d;->s:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lca/d;->t:Ljava/lang/Integer;

    .line 6
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lca/d;->w:Landroid/graphics/Matrix;

    .line 7
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lca/d;->x:Landroid/graphics/Path;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Lga/d;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_2

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p6, p5

    goto :goto_0

    .line 1
    :goto_1
    invoke-direct/range {p1 .. p6}, Lca/d;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lga/d;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public final E()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lca/d;->u:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lca/d;->v:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lca/d;->u:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->C(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final H(Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lca/d;->v:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->C(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public c()Lba/a;
    .locals 6

    .line 1
    new-instance v0, Lca/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lba/a;->getId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {p0}, Lba/a;->g()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-direct {v2, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, Lca/d;->r:Lga/d;

    .line 17
    .line 18
    invoke-virtual {p0}, Lca/d;->w()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {p0}, Lca/d;->x()Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-direct/range {v0 .. v5}, Lca/d;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lga/d;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lca/d;->u:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lca/d;->G(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lca/d;->v:Landroid/graphics/Paint;

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    new-instance v2, Landroid/graphics/Paint;

    .line 39
    .line 40
    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Lca/d;->H(Landroid/graphics/Paint;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {p0}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Lba/a;->u(Landroid/graphics/Matrix;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lba/a;->t()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Lba/c;

    .line 72
    .line 73
    invoke-interface {v2}, Lba/c;->c()Lba/a;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->s(Lba/c;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    return-object v0
.end method

.method public getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 4

    .line 1
    invoke-super {p0}, Lda/a;->getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lca/d;->v:Landroid/graphics/Paint;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/high16 v2, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v1, v2, v3}, Lna/m;->a(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->R(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, Lca/d;->u:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->J(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 24
    .line 25
    .line 26
    :cond_1
    return-object v0
.end method

.method public graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->i:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public m(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 8

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lca/d;->u:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lca/d;->v:Landroid/graphics/Paint;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lca/d;->r:Lga/d;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Lca/d;->w()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lca/d;->x()Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-interface {v0, v1, v2}, Lga/d;->c(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TextSource$TextInfo;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-object v1, p0, Lca/d;->u:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->getContent()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p0, v1}, Lca/d;->G(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-object v1, p0, Lca/d;->v:Landroid/graphics/Paint;

    .line 59
    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->m()Lcom/zykj/board/EzyPaint$Paint;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "it.paint"

    .line 67
    .line 68
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lna/m;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p0, v0}, Lca/d;->H(Landroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    iget-object v0, p0, Lca/d;->w:Landroid/graphics/Matrix;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lca/d;->w:Landroid/graphics/Matrix;

    .line 84
    .line 85
    invoke-virtual {p0}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lca/d;->w:Landroid/graphics/Matrix;

    .line 93
    .line 94
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Lca/d;->v:Landroid/graphics/Paint;

    .line 98
    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    iget p2, p2, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 106
    .line 107
    neg-float p2, p2

    .line 108
    iput p2, p0, Lca/d;->y:F

    .line 109
    .line 110
    sget-object p2, Lna/t;->a:Lna/t;

    .line 111
    .line 112
    iget-object v0, p0, Lca/d;->u:Ljava/lang/String;

    .line 113
    .line 114
    if-nez v0, :cond_3

    .line 115
    .line 116
    const-string v0, ""

    .line 117
    .line 118
    :cond_3
    invoke-virtual {p0}, Lba/a;->g()Landroid/graphics/RectF;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-virtual {p2, v0, v1, v2}, Lna/t;->a(Ljava/lang/String;Landroid/graphics/Paint;F)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    check-cast p2, Ljava/lang/Iterable;

    .line 131
    .line 132
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_4

    .line 141
    .line 142
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    move-object v2, v0

    .line 147
    check-cast v2, Ljava/lang/String;

    .line 148
    .line 149
    iget-object v0, p0, Lca/d;->x:Landroid/graphics/Path;

    .line 150
    .line 151
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    iget v6, p0, Lca/d;->y:F

    .line 159
    .line 160
    iget-object v7, p0, Lca/d;->x:Landroid/graphics/Path;

    .line 161
    .line 162
    const/4 v3, 0x0

    .line 163
    const/4 v5, 0x0

    .line 164
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    .line 165
    .line 166
    .line 167
    iget-object v0, p0, Lca/d;->x:Landroid/graphics/Path;

    .line 168
    .line 169
    iget-object v2, p0, Lca/d;->w:Landroid/graphics/Matrix;

    .line 170
    .line 171
    invoke-virtual {v0, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Lca/d;->x:Landroid/graphics/Path;

    .line 175
    .line 176
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 177
    .line 178
    .line 179
    iget v0, p0, Lca/d;->y:F

    .line 180
    .line 181
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 186
    .line 187
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    iget v3, v3, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 192
    .line 193
    sub-float/2addr v2, v3

    .line 194
    add-float/2addr v0, v2

    .line 195
    iput v0, p0, Lca/d;->y:F

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_4
    return-void
.end method

.method public w()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lca/d;->s:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lca/d;->t:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method
