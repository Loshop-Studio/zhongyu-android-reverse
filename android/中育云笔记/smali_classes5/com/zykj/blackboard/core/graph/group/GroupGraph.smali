.class public Lcom/zykj/blackboard/core/graph/group/GroupGraph;
.super Lda/a;
.source "SourceFile"

# interfaces
.implements Lca/c;


# instance fields
.field public i:Ljava/lang/String;

.field public j:Ljava/lang/Integer;

.field public k:Z

.field public final l:Landroid/graphics/RectF;

.field public m:Landroid/graphics/Bitmap;

.field public n:Landroid/graphics/Matrix;

.field public final o:Landroid/graphics/Matrix;

.field public p:F

.field public q:F


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outRectF"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lda/a;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 3
    iput-object p3, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->i:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->j:Ljava/lang/Integer;

    .line 5
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 6
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->n:Landroid/graphics/Matrix;

    .line 7
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->o:Landroid/graphics/Matrix;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public static final synthetic y(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final A()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->n:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 18
    .line 19
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 20
    .line 21
    iget v1, v1, Landroid/graphics/RectF;->top:F

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final C(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method public final D(ZLandroid/graphics/Matrix;Lhd/l;)V
    .locals 8

    .line 1
    invoke-virtual {p0, p2}, Lba/a;->j(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 8
    .line 9
    .line 10
    if-nez p1, :cond_4

    .line 11
    .line 12
    new-instance p1, Landroid/graphics/RectF;

    .line 13
    .line 14
    iget v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->p:F

    .line 15
    .line 16
    iget v1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->q:F

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {p1, v2, v2, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/graphics/RectF;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_4

    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const/4 v0, 0x0

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    cmpg-float p1, p1, v2

    .line 44
    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    cmpg-float p1, p1, v2

    .line 55
    .line 56
    if-nez p1, :cond_4

    .line 57
    .line 58
    :goto_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 63
    .line 64
    .line 65
    :cond_1
    iput-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 66
    .line 67
    return-void

    .line 68
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 69
    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 73
    .line 74
    .line 75
    :cond_3
    iput-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 76
    .line 77
    return-void

    .line 78
    :cond_4
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    float-to-int p1, p1

    .line 85
    add-int/lit8 p1, p1, 0x1

    .line 86
    .line 87
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    float-to-int v0, v0

    .line 94
    add-int/lit8 v0, v0, 0x1

    .line 95
    .line 96
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 97
    .line 98
    invoke-static {p1, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 103
    .line 104
    if-eqz p1, :cond_6

    .line 105
    .line 106
    new-instance v1, Landroid/graphics/Canvas;

    .line 107
    .line 108
    invoke-direct {v1, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 115
    .line 116
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 117
    .line 118
    neg-float v0, v0

    .line 119
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 120
    .line 121
    neg-float p1, p1

    .line 122
    invoke-virtual {v1, v0, p1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v1, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lba/a;->t()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Lba/c;

    .line 147
    .line 148
    const-string v2, "it"

    .line 149
    .line 150
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    const/16 v6, 0x18

    .line 154
    .line 155
    const/4 v7, 0x0

    .line 156
    const/4 v4, 0x0

    .line 157
    const/4 v5, 0x0

    .line 158
    move-object v2, p2

    .line 159
    move-object v3, p3

    .line 160
    invoke-static/range {v0 .. v7}, Lba/b$a;->a(Lba/b;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lhd/l;ZZILjava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_5
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 165
    .line 166
    .line 167
    :cond_6
    return-void
.end method

.method public c()Lba/a;
    .locals 7

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

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
    const/16 v5, 0xc

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/n;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lba/a;->u(Landroid/graphics/Matrix;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lba/a;->t()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lba/c;

    .line 50
    .line 51
    invoke-interface {v2}, Lba/c;->c()Lba/a;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->s(Lba/c;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-object v0
.end method

.method public e(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lba/a;->e(Landroid/graphics/Matrix;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 11
    .line 12
    return-void
.end method

.method public graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->e:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public i(Lba/c;)V
    .locals 1

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lba/a;->i(Lba/c;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 11
    .line 12
    return-void
.end method

.method public l(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method public m(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "matrix"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public o(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lhd/l;ZZ)V
    .locals 2

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
    if-eqz p3, :cond_0

    .line 12
    .line 13
    invoke-interface {p3, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p0}, Lba/a;->d()Landroid/graphics/RectF;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Lba/a;->t()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 51
    .line 52
    .line 53
    :cond_1
    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->o:Landroid/graphics/Matrix;

    .line 58
    .line 59
    invoke-static {v0, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/4 v1, 0x1

    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->o:Landroid/graphics/Matrix;

    .line 67
    .line 68
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 69
    .line 70
    .line 71
    iput-boolean v1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 72
    .line 73
    :cond_3
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-ne v0, v1, :cond_4

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 87
    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    if-eqz p5, :cond_7

    .line 91
    .line 92
    :cond_5
    :goto_0
    if-eqz p4, :cond_6

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    int-to-float p4, p4

    .line 99
    iput p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->p:F

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 102
    .line 103
    .line 104
    move-result p4

    .line 105
    int-to-float p4, p4

    .line 106
    iput p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->q:F

    .line 107
    .line 108
    :cond_6
    invoke-virtual {p0, p5, p2, p3}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->D(ZLandroid/graphics/Matrix;Lhd/l;)V

    .line 109
    .line 110
    .line 111
    const/4 p2, 0x0

    .line 112
    iput-boolean p2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 113
    .line 114
    :cond_7
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->B(Landroid/graphics/Canvas;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public onDestroy()V
    .locals 3

    .line 1
    invoke-super {p0}, Lba/a;->onDestroy()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lna/b;->a:Lna/b;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    filled-new-array {v1}, [Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/blackboard/core/graph/group/GroupGraph$onDestroy$1;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$onDestroy$1;-><init>(Lcom/zykj/blackboard/core/graph/group/GroupGraph;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lna/b;->a([Landroid/graphics/Bitmap;Lhd/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public p(Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    const-string v0, "newRectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lba/a;->g()Landroid/graphics/RectF;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lba/a;->v()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 18
    .line 19
    return-void
.end method

.method public s(Lba/c;)V
    .locals 1

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lba/a;->s(Lba/c;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 11
    .line 12
    return-void
.end method

.method public w()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->j:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public z(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "newMatrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lba/a;->v()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 18
    .line 19
    return-void
.end method
