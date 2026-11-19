.class public final Lr4/d;
.super Lcom/zykj/blackboard/core/graph/group/GroupGraph;
.source "SourceFile"


# instance fields
.field public final s:Lv4/d;

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/Integer;

.field public v:Ljava/lang/String;

.field public w:Landroid/graphics/Paint;

.field public x:Landroid/graphics/Matrix;

.field public y:Landroid/graphics/Path;

.field public z:F


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Lv4/d;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outRectF"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p4, p5}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 3
    iput-object p3, p0, Lr4/d;->s:Lv4/d;

    .line 4
    iput-object p4, p0, Lr4/d;->t:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lr4/d;->u:Ljava/lang/Integer;

    .line 6
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lr4/d;->x:Landroid/graphics/Matrix;

    .line 7
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lr4/d;->y:Landroid/graphics/Path;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Lv4/d;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct/range {p1 .. p6}, Lr4/d;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lv4/d;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public final I()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/d;->v:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/d;->w:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public final K(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr4/d;->v:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->E(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final L(Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr4/d;->w:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->E(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public c()Lq4/a;
    .locals 6

    .line 1
    new-instance v0, Lr4/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lq4/a;->getId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {p0}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-direct {v2, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, Lr4/d;->s:Lv4/d;

    .line 17
    .line 18
    invoke-virtual {p0}, Lr4/d;->w()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {p0}, Lr4/d;->x()Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-direct/range {v0 .. v5}, Lr4/d;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lv4/d;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lr4/d;->v:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lr4/d;->K(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lr4/d;->w:Landroid/graphics/Paint;

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
    invoke-virtual {v0, v2}, Lr4/d;->L(Landroid/graphics/Paint;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {p0}, Lq4/a;->b()Landroid/graphics/Matrix;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Lq4/a;->u(Landroid/graphics/Matrix;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lq4/a;->t()Ljava/util/concurrent/CopyOnWriteArrayList;

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
    check-cast v2, Lq4/c;

    .line 72
    .line 73
    invoke-interface {v2}, Lq4/c;->c()Lq4/a;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->s(Lq4/c;)V

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
    invoke-super {p0}, Ls4/a;->getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lr4/d;->w:Landroid/graphics/Paint;

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
    invoke-static {v1, v2, v3}, Le5/l;->a(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->P(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, Lr4/d;->v:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->H(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 24
    .line 25
    .line 26
    :cond_1
    return-object v0
.end method

.method public graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->g:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lr4/d;->v:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lr4/d;->w:Landroid/graphics/Paint;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lr4/d;->s:Lv4/d;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Lr4/d;->w()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lr4/d;->x()Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-interface {v0, v1, v2}, Lv4/d;->c(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TextSource$TextInfo;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-object v1, p0, Lr4/d;->v:Ljava/lang/String;

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
    invoke-virtual {p0, v1}, Lr4/d;->K(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-object v1, p0, Lr4/d;->w:Landroid/graphics/Paint;

    .line 59
    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->r()Lcom/zykj/board/EzyPaint$Paint;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "it.paint"

    .line 67
    .line 68
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Le5/l;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p0, v0}, Lr4/d;->L(Landroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    iget-object v0, p0, Lr4/d;->x:Landroid/graphics/Matrix;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lr4/d;->x:Landroid/graphics/Matrix;

    .line 84
    .line 85
    invoke-virtual {p0}, Lq4/a;->b()Landroid/graphics/Matrix;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lr4/d;->x:Landroid/graphics/Matrix;

    .line 93
    .line 94
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Lr4/d;->w:Landroid/graphics/Paint;

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
    iput p2, p0, Lr4/d;->z:F

    .line 109
    .line 110
    sget-object p2, Le5/s;->a:Le5/s;

    .line 111
    .line 112
    iget-object v0, p0, Lr4/d;->v:Ljava/lang/String;

    .line 113
    .line 114
    if-nez v0, :cond_3

    .line 115
    .line 116
    const-string v0, ""

    .line 117
    .line 118
    :cond_3
    invoke-virtual {p0}, Lq4/a;->g()Landroid/graphics/RectF;

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
    invoke-virtual {p2, v0, v1, v2}, Le5/s;->a(Ljava/lang/String;Landroid/graphics/Paint;F)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_4

    .line 139
    .line 140
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    move-object v2, v0

    .line 145
    check-cast v2, Ljava/lang/String;

    .line 146
    .line 147
    iget-object v0, p0, Lr4/d;->y:Landroid/graphics/Path;

    .line 148
    .line 149
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    iget v6, p0, Lr4/d;->z:F

    .line 157
    .line 158
    iget-object v7, p0, Lr4/d;->y:Landroid/graphics/Path;

    .line 159
    .line 160
    const/4 v3, 0x0

    .line 161
    const/4 v5, 0x0

    .line 162
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lr4/d;->y:Landroid/graphics/Path;

    .line 166
    .line 167
    iget-object v2, p0, Lr4/d;->x:Landroid/graphics/Matrix;

    .line 168
    .line 169
    invoke-virtual {v0, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 170
    .line 171
    .line 172
    iget-object v0, p0, Lr4/d;->y:Landroid/graphics/Path;

    .line 173
    .line 174
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 175
    .line 176
    .line 177
    iget v0, p0, Lr4/d;->z:F

    .line 178
    .line 179
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 184
    .line 185
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    iget v3, v3, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 190
    .line 191
    sub-float/2addr v2, v3

    .line 192
    add-float/2addr v0, v2

    .line 193
    iput v0, p0, Lr4/d;->z:F

    .line 194
    .line 195
    goto :goto_0

    .line 196
    :cond_4
    return-void
.end method

.method public w()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/d;->t:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/d;->u:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method
