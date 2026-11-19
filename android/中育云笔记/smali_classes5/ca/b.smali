.class public final Lca/b;
.super Lcom/zykj/blackboard/core/graph/group/GroupGraph;
.source "SourceFile"


# instance fields
.field public final r:Lga/d;

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/Integer;

.field public final u:Landroid/graphics/Path;

.field public v:Ljava/util/List;

.field public w:Ljava/lang/Integer;

.field public x:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Lga/d;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "outRectF"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2, p4, p5}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, Lca/b;->r:Lga/d;

    .line 15
    .line 16
    iput-object p4, p0, Lca/b;->s:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p5, p0, Lca/b;->t:Ljava/lang/Integer;

    .line 19
    .line 20
    new-instance p1, Landroid/graphics/Path;

    .line 21
    .line 22
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lca/b;->u:Landroid/graphics/Path;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final E()Ljava/util/List;
    .locals 7

    .line 1
    iget-object v0, p0, Lca/b;->w:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lca/b;->v:Ljava/util/List;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Lca/b;->H()V

    .line 10
    .line 11
    .line 12
    :cond_1
    iget-object v0, p0, Lca/b;->w:Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz v0, :cond_6

    .line 15
    .line 16
    iget-object v0, p0, Lca/b;->v:Ljava/util/List;

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lca/b;->w:Ljava/lang/Integer;

    .line 27
    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, 0x1

    .line 36
    if-ne v1, v2, :cond_5

    .line 37
    .line 38
    iget-object v1, p0, Lca/b;->v:Ljava/util/List;

    .line 39
    .line 40
    if-eqz v1, :cond_5

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v2, 0x3

    .line 47
    if-ne v1, v2, :cond_5

    .line 48
    .line 49
    new-instance v1, Landroid/graphics/PointF;

    .line 50
    .line 51
    invoke-virtual {p0}, Lba/a;->g()Landroid/graphics/RectF;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 56
    .line 57
    invoke-virtual {p0}, Lba/a;->g()Landroid/graphics/RectF;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 62
    .line 63
    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 64
    .line 65
    .line 66
    new-instance v2, Landroid/graphics/PointF;

    .line 67
    .line 68
    invoke-virtual {p0}, Lba/a;->g()Landroid/graphics/RectF;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 73
    .line 74
    invoke-virtual {p0}, Lba/a;->g()Landroid/graphics/RectF;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 79
    .line 80
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 81
    .line 82
    .line 83
    iget-object v3, p0, Lca/b;->v:Ljava/util/List;

    .line 84
    .line 85
    if-eqz v3, :cond_5

    .line 86
    .line 87
    check-cast v3, Ljava/lang/Iterable;

    .line 88
    .line 89
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    :cond_4
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_5

    .line 98
    .line 99
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    check-cast v4, Landroid/graphics/PointF;

    .line 104
    .line 105
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-nez v5, :cond_4

    .line 110
    .line 111
    invoke-static {v4, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-nez v5, :cond_4

    .line 116
    .line 117
    new-instance v5, Landroid/graphics/PointF;

    .line 118
    .line 119
    iget v6, v4, Landroid/graphics/PointF;->x:F

    .line 120
    .line 121
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 122
    .line 123
    invoke-direct {v5, v6, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_5
    :goto_1
    return-object v0

    .line 131
    :cond_6
    :goto_2
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    return-object v0
.end method

.method public final F()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lca/b;->x:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lca/b;->v:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()V
    .locals 5

    .line 1
    iget-object v0, p0, Lca/b;->r:Lga/d;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Lca/b;->w()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lca/b;->x()Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-interface {v0, v1, v2}, Lga/d;->d(Ljava/lang/String;I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iget-object v1, p0, Lca/b;->w:Ljava/lang/Integer;

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->p()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, p0, Lca/b;->w:Ljava/lang/Integer;

    .line 42
    .line 43
    :cond_0
    iget-object v1, p0, Lca/b;->v:Ljava/util/List;

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPointsList()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v2, "it.pointsList"

    .line 52
    .line 53
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    check-cast v1, Ljava/lang/Iterable;

    .line 57
    .line 58
    new-instance v2, Ljava/util/ArrayList;

    .line 59
    .line 60
    const/16 v3, 0xa

    .line 61
    .line 62
    invoke-static {v1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_1

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Lcom/zykj/board/EzyPointF$PointF;

    .line 84
    .line 85
    const-string v4, "it"

    .line 86
    .line 87
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v3}, Lna/m;->e(Lcom/zykj/board/EzyPointF$PointF;)Landroid/graphics/PointF;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {p0, v2}, Lca/b;->J(Ljava/util/List;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    iget-object v1, p0, Lca/b;->x:Landroid/graphics/Paint;

    .line 102
    .line 103
    if-nez v1, :cond_3

    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->r()Lcom/zykj/board/EzyPaint$Paint;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-string v1, "it.paint"

    .line 110
    .line 111
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Lna/m;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 121
    .line 122
    .line 123
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v0}, Lca/b;->I(Landroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    :cond_3
    return-void
.end method

.method public final I(Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lca/b;->x:Landroid/graphics/Paint;

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

.method public final J(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lca/b;->v:Ljava/util/List;

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
    new-instance v0, Lca/b;

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
    iget-object v3, p0, Lca/b;->r:Lga/d;

    .line 17
    .line 18
    invoke-virtual {p0}, Lca/b;->w()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {p0}, Lca/b;->x()Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-direct/range {v0 .. v5}, Lca/b;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lga/d;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lca/b;->w:Ljava/lang/Integer;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, v0, Lca/b;->w:Ljava/lang/Integer;

    .line 42
    .line 43
    :cond_0
    iget-object v1, p0, Lca/b;->v:Ljava/util/List;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    check-cast v1, Ljava/lang/Iterable;

    .line 48
    .line 49
    new-instance v2, Ljava/util/ArrayList;

    .line 50
    .line 51
    const/16 v3, 0xa

    .line 52
    .line 53
    invoke-static {v1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Landroid/graphics/PointF;

    .line 75
    .line 76
    new-instance v4, Landroid/graphics/PointF;

    .line 77
    .line 78
    iget v5, v3, Landroid/graphics/PointF;->x:F

    .line 79
    .line 80
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 81
    .line 82
    invoke-direct {v4, v5, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    invoke-virtual {v0, v2}, Lca/b;->J(Ljava/util/List;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    iget-object v1, p0, Lca/b;->x:Landroid/graphics/Paint;

    .line 93
    .line 94
    if-eqz v1, :cond_3

    .line 95
    .line 96
    new-instance v2, Landroid/graphics/Paint;

    .line 97
    .line 98
    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2}, Lca/b;->I(Landroid/graphics/Paint;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    invoke-virtual {p0}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, Lba/a;->u(Landroid/graphics/Matrix;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lba/a;->t()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_4

    .line 124
    .line 125
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, Lba/c;

    .line 130
    .line 131
    invoke-interface {v2}, Lba/c;->c()Lba/a;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->s(Lba/c;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
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
    iget-object v1, p0, Lca/b;->x:Landroid/graphics/Paint;

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
    iget-object v1, p0, Lca/b;->v:Ljava/util/List;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Iterable;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Landroid/graphics/PointF;

    .line 40
    .line 41
    invoke-static {v2}, Lna/m;->b(Landroid/graphics/PointF;)Lcom/zykj/board/EzyPointF$PointF;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->e(Lcom/zykj/board/EzyPointF$PointF;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    return-object v0
.end method

.method public graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->j:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public j(Landroid/graphics/Matrix;)Landroid/graphics/RectF;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p0}, Lba/a;->g()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/graphics/Matrix;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 20
    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lca/b;->x:Landroid/graphics/Paint;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/4 v1, 0x2

    .line 39
    int-to-float v1, v1

    .line 40
    div-float/2addr p1, v1

    .line 41
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 42
    .line 43
    sub-float/2addr v1, p1

    .line 44
    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 45
    .line 46
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 47
    .line 48
    sub-float/2addr v1, p1

    .line 49
    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 50
    .line 51
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 52
    .line 53
    add-float/2addr v1, p1

    .line 54
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 55
    .line 56
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 57
    .line 58
    add-float/2addr v1, p1

    .line 59
    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 60
    .line 61
    :cond_1
    return-object v0
.end method

.method public m(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 5

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
    iget-object v0, p0, Lca/b;->w:Ljava/lang/Integer;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lca/b;->v:Ljava/util/List;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lca/b;->x:Landroid/graphics/Paint;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lca/b;->H()V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->A()Landroid/graphics/Matrix;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->A()Landroid/graphics/Matrix;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->A()Landroid/graphics/Matrix;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, Lca/b;->x:Landroid/graphics/Paint;

    .line 52
    .line 53
    if-eqz p2, :cond_9

    .line 54
    .line 55
    iget-object v0, p0, Lca/b;->u:Landroid/graphics/Path;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lca/b;->w:Ljava/lang/Integer;

    .line 61
    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    iget-object v0, p0, Lca/b;->u:Landroid/graphics/Path;

    .line 72
    .line 73
    invoke-virtual {p0}, Lba/a;->g()Landroid/graphics/RectF;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sget-object v2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 78
    .line 79
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->addOval(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    :goto_0
    if-nez v0, :cond_4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/4 v1, 0x1

    .line 91
    if-ne v0, v1, :cond_8

    .line 92
    .line 93
    iget-object v0, p0, Lca/b;->v:Ljava/util/List;

    .line 94
    .line 95
    if-eqz v0, :cond_7

    .line 96
    .line 97
    check-cast v0, Ljava/lang/Iterable;

    .line 98
    .line 99
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const/4 v1, 0x0

    .line 104
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_7

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    add-int/lit8 v3, v1, 0x1

    .line 115
    .line 116
    if-gez v1, :cond_5

    .line 117
    .line 118
    invoke-static {}, Lrc/w;->w()V

    .line 119
    .line 120
    .line 121
    :cond_5
    check-cast v2, Landroid/graphics/PointF;

    .line 122
    .line 123
    if-nez v1, :cond_6

    .line 124
    .line 125
    iget-object v1, p0, Lca/b;->u:Landroid/graphics/Path;

    .line 126
    .line 127
    iget v4, v2, Landroid/graphics/PointF;->x:F

    .line 128
    .line 129
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 130
    .line 131
    invoke-virtual {v1, v4, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_6
    iget-object v1, p0, Lca/b;->u:Landroid/graphics/Path;

    .line 136
    .line 137
    iget v4, v2, Landroid/graphics/PointF;->x:F

    .line 138
    .line 139
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 140
    .line 141
    invoke-virtual {v1, v4, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 142
    .line 143
    .line 144
    :goto_2
    move v1, v3

    .line 145
    goto :goto_1

    .line 146
    :cond_7
    iget-object v0, p0, Lca/b;->u:Landroid/graphics/Path;

    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 149
    .line 150
    .line 151
    :cond_8
    :goto_3
    iget-object v0, p0, Lca/b;->u:Landroid/graphics/Path;

    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->A()Landroid/graphics/Matrix;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v0, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lca/b;->u:Landroid/graphics/Path;

    .line 161
    .line 162
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 163
    .line 164
    .line 165
    :cond_9
    return-void
.end method

.method public p(Landroid/graphics/RectF;)V
    .locals 3

    .line 1
    const-string v0, "newRectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {p0}, Lba/a;->g()Landroid/graphics/RectF;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->p(Landroid/graphics/RectF;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lca/b;->w:Ljava/lang/Integer;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, Lca/b;->v:Ljava/util/List;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lca/b;->H()V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v1, p0, Lca/b;->w:Ljava/lang/Integer;

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v2, 0x1

    .line 39
    if-ne v1, v2, :cond_3

    .line 40
    .line 41
    new-instance v1, Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v2, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    .line 47
    .line 48
    invoke-virtual {v1, v0, p1, v2}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lca/b;->v:Ljava/util/List;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    check-cast p1, Ljava/lang/Iterable;

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Landroid/graphics/PointF;

    .line 72
    .line 73
    sget-object v2, Lna/o;->a:Lna/o;

    .line 74
    .line 75
    invoke-virtual {v2, v0, v1}, Lna/o;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v0, v2}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    :goto_1
    return-void
.end method

.method public w()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lca/b;->s:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lca/b;->t:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method
