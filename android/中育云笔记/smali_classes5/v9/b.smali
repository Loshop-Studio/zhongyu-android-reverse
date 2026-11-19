.class public final Lv9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv9/c;


# instance fields
.field public final a:Lu9/a;

.field public final b:Lw9/h;

.field public final c:Lq9/b;

.field public d:Lba/c;

.field public e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

.field public f:Landroid/graphics/RectF;

.field public g:Landroid/graphics/Matrix;

.field public h:Z

.field public i:Landroid/graphics/Paint;

.field public j:F

.field public k:Z

.field public l:I

.field public final m:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

.field public n:Lhd/l;

.field public final o:Ls9/d;


# direct methods
.method public constructor <init>(Lu9/a;Lw9/h;Lq9/b;)V
    .locals 7

    .line 1
    const-string v0, "matrixAdapter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "renderLayer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "boardConfig"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lv9/b;->a:Lu9/a;

    .line 20
    .line 21
    iput-object p2, p0, Lv9/b;->b:Lw9/h;

    .line 22
    .line 23
    iput-object p3, p0, Lv9/b;->c:Lq9/b;

    .line 24
    .line 25
    new-instance v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 26
    .line 27
    invoke-direct {v0, p3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;-><init>(Lq9/b;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 31
    .line 32
    new-instance p3, Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p3, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 38
    .line 39
    const/4 p3, 0x1

    .line 40
    iput-boolean p3, p0, Lv9/b;->h:Z

    .line 41
    .line 42
    iput-boolean p3, p0, Lv9/b;->k:Z

    .line 43
    .line 44
    new-instance v0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 45
    .line 46
    const/16 v5, 0xf

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v1, 0x0

    .line 50
    const/4 v2, 0x0

    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;FILkotlin/jvm/internal/n;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lv9/b;->m:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 57
    .line 58
    invoke-virtual {p2}, Lw9/h;->e()Landroid/graphics/Rect;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-virtual {p1, p3}, Lu9/a;->l(Landroid/graphics/Rect;)V

    .line 63
    .line 64
    .line 65
    iget-object p3, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 66
    .line 67
    invoke-virtual {p3, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->O(Lu9/a;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->P(Lw9/h;)V

    .line 73
    .line 74
    .line 75
    new-instance p1, Ls9/d;

    .line 76
    .line 77
    iget-object p2, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ls9/d;-><init>(Lcom/zykj/blackboard/core/canvas/control/DrawControl;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lv9/b;->o:Ls9/d;

    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public A(Lca/d;)V
    .locals 5

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "GraphControl:textHandleStart"

    .line 7
    .line 8
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, Lv9/b;->k:Z

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    iget-object v1, p0, Lv9/b;->f:Landroid/graphics/RectF;

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iget-boolean v2, p0, Lv9/b;->h:Z

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    sget-object v2, Lna/q;->a:Lna/q;

    .line 33
    .line 34
    iget-object v3, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 35
    .line 36
    iget v4, p0, Lv9/b;->j:F

    .line 37
    .line 38
    invoke-virtual {v2, v1, v3, v4}, Lna/q;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget-object v2, Lna/q;->a:Lna/q;

    .line 44
    .line 45
    iget-object v3, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 46
    .line 47
    iget v4, p0, Lv9/b;->j:F

    .line 48
    .line 49
    invoke-virtual {v2, v1, v3, v4}, Lna/q;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 v1, 0x0

    .line 55
    :goto_0
    iget-object v2, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 56
    .line 57
    iget-object v3, p0, Lv9/b;->i:Landroid/graphics/Paint;

    .line 58
    .line 59
    invoke-virtual {v2, v0, p1, v1, v3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->S(Lba/c;Lca/d;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    return-void
.end method

.method public B(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->u(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public C(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V
    .locals 5

    .line 1
    const-string v0, "graphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "content"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "paint"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "originRectF"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "GraphControl:changeTextGraph -> graphId: "

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-interface {v0}, Lba/c;->f()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    check-cast v0, Ljava/lang/Iterable;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lba/c;

    .line 72
    .line 73
    invoke-interface {v1}, Lba/c;->getId()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_0

    .line 82
    .line 83
    instance-of v2, v1, Lca/d;

    .line 84
    .line 85
    if-eqz v2, :cond_0

    .line 86
    .line 87
    check-cast v1, Lca/d;

    .line 88
    .line 89
    invoke-virtual {v1, p2}, Lca/d;->G(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, p3}, Lca/d;->H(Landroid/graphics/Paint;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, p4}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->p(Landroid/graphics/RectF;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lv9/b;->I()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_0

    .line 103
    .line 104
    iget-object v1, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 105
    .line 106
    new-instance v2, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    iget-object v3, p0, Lv9/b;->d:Lba/c;

    .line 112
    .line 113
    if-eqz v3, :cond_1

    .line 114
    .line 115
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :cond_1
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->s(Ljava/util/List;)V

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Lv9/b;->f:Landroid/graphics/RectF;

    .line 122
    .line 123
    if-eqz v1, :cond_0

    .line 124
    .line 125
    iget-boolean v2, p0, Lv9/b;->h:Z

    .line 126
    .line 127
    if-eqz v2, :cond_2

    .line 128
    .line 129
    sget-object v2, Lna/q;->a:Lna/q;

    .line 130
    .line 131
    iget-object v3, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 132
    .line 133
    iget v4, p0, Lv9/b;->j:F

    .line 134
    .line 135
    invoke-virtual {v2, v1, v3, v4}, Lna/q;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    goto :goto_1

    .line 140
    :cond_2
    sget-object v2, Lna/q;->a:Lna/q;

    .line 141
    .line 142
    iget-object v3, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 143
    .line 144
    iget v4, p0, Lv9/b;->j:F

    .line 145
    .line 146
    invoke-virtual {v2, v1, v3, v4}, Lna/q;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    :goto_1
    iget-object v2, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 151
    .line 152
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->L()V

    .line 153
    .line 154
    .line 155
    iget-object v2, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 156
    .line 157
    iget-object v3, p0, Lv9/b;->i:Landroid/graphics/Paint;

    .line 158
    .line 159
    invoke-virtual {v2, v1, v3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->K(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 160
    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_3
    return-void
.end method

.method public D(Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    const-string v0, "GraphControl:cameraChangeEnd"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lv9/b;->a:Lu9/a;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lu9/a;->a(Landroid/graphics/Matrix;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-boolean p1, p0, Lv9/b;->k:Z

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object p1, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->g(Lba/c;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    return-void
.end method

.method public E(Lba/c;)V
    .locals 4

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "GraphControl:init -> "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lba/c;->getId()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ": "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Lba/c;->f()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/Iterable;

    .line 33
    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    const/16 v3, 0xa

    .line 37
    .line 38
    invoke-static {v1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Lba/c;

    .line 60
    .line 61
    invoke-interface {v3}, Lba/c;->getId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Lv9/b;->d:Lba/c;

    .line 84
    .line 85
    return-void
.end method

.method public F(FFFF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv9/b;->o:Ls9/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Ls9/d;->a(FFFF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public G()Landroid/graphics/RectF;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->x()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public H(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 9

    .line 1
    const-string v0, "groupGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "selectRectF"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrix"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "selectFunctionRectF"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "functionRectF"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "typeList"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, Lv9/b;->o:Ls9/d;

    .line 36
    .line 37
    move-object v2, p1

    .line 38
    move-object v3, p2

    .line 39
    move-object v4, p3

    .line 40
    move-object v5, p4

    .line 41
    move-object v6, p5

    .line 42
    move-object v7, p6

    .line 43
    move-object/from16 v8, p7

    .line 44
    .line 45
    invoke-virtual/range {v1 .. v8}, Ls9/d;->e(Lba/c;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method public I()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv9/b;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public J(Lba/c;Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "graph"

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
    invoke-interface {p1, p2}, Lba/d;->e(Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public K()Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv9/b;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->l(Lba/c;)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public L()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->v()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public M()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->w()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public N()I
    .locals 1

    .line 1
    iget v0, p0, Lv9/b;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public O()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lv9/b;->m:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public P()I
    .locals 3

    .line 1
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-interface {v0}, Lba/c;->f()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast v0, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lba/c;

    .line 29
    .line 30
    instance-of v2, v2, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return v1
.end method

.method public Q()V
    .locals 1

    .line 1
    const-string v0, "GraphControl:release"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lba/c;->onDestroy()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->G()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public R()V
    .locals 1

    .line 1
    const-string v0, "GraphControl:reset"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lv9/b;->S()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Lba/c;->onDestroy()V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lv9/b;->d:Lba/c;

    .line 22
    .line 23
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->I()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget v0, p0, Lv9/b;->l:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lv9/b;->d(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv9/b;->m:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lv9/b;->s(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public T()Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv9/b;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->J(Lba/c;)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public U(I)V
    .locals 1

    .line 1
    iput p1, p0, Lv9/b;->l:I

    .line 2
    .line 3
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->M(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public V(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 2

    .line 1
    const-string v0, "backgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv9/b;->m:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->c()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->g(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->a()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->e(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->b()F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->f(F)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->N(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final W(Lhd/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv9/b;->n:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public X(Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->x()Landroid/graphics/RectF;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public Y()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1

    .line 1
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lba/c;->getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public Z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    iget-object v1, p0, Lv9/b;->a:Lu9/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->W(Landroid/graphics/Matrix;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public a(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V
    .locals 2

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "GraphControl:addImageGraph -> graphId:"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lba/a;->getId()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-interface {v0, p1}, Lba/d;->a(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, Lv9/b;->g()V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lba/c;->getId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->A()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public d(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "GraphControl:updateBackground -> color:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->M(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv9/b;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lv9/b;->f:Landroid/graphics/RectF;

    .line 8
    .line 9
    iget-object v0, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->L()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public f(Ljava/lang/String;Lba/c;)V
    .locals 2

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "GraphControl:addGraph -> ["

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Lba/c;->graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "] parentId:"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", graphId:"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-interface {p2}, Lba/c;->getId()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    invoke-static {p1}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 64
    .line 65
    if-nez v0, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-interface {v0, p1}, Lba/c;->n(Ljava/lang/String;)Lba/a;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lba/a;->s(Lba/c;)V

    .line 77
    .line 78
    .line 79
    iget-boolean p1, p0, Lv9/b;->k:Z

    .line 80
    .line 81
    if-nez p1, :cond_2

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    iget-object p1, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->f(Lba/c;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    :goto_0
    iput-object p2, p0, Lv9/b;->d:Lba/c;

    .line 91
    .line 92
    iget-boolean p1, p0, Lv9/b;->k:Z

    .line 93
    .line 94
    if-nez p1, :cond_5

    .line 95
    .line 96
    :cond_4
    :goto_1
    return-void

    .line 97
    :cond_5
    iget-object p1, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 98
    .line 99
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->f(Lba/c;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public declared-synchronized g()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lv9/b;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "GraphControl:reDrawFixView -> cameraMatrix="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lv9/b;->a:Lu9/a;

    .line 19
    .line 20
    invoke-virtual {v1}, Lu9/a;->d()Landroid/graphics/Matrix;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 39
    .line 40
    new-instance v1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lv9/b;->d:Lba/c;

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->s(Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    .line 58
    monitor-exit p0

    .line 59
    return-void

    .line 60
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    throw v0
.end method

.method public h(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 10

    .line 1
    const-string v0, "groupGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "selectRectF"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrix"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "selectFunctionRectF"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "functionRectF"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "typeList"

    .line 27
    .line 28
    move-object/from16 v8, p6

    .line 29
    .line 30
    invoke-static {v8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lv9/b;->d:Lba/c;

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Lv9/b;->o:Ls9/d;

    .line 38
    .line 39
    move-object v3, p1

    .line 40
    move-object v4, p2

    .line 41
    move-object v5, p3

    .line 42
    move-object v6, p4

    .line 43
    move-object v7, p5

    .line 44
    move-object/from16 v9, p7

    .line 45
    .line 46
    invoke-virtual/range {v1 .. v9}, Ls9/d;->d(Lba/c;Lba/c;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public i(Lca/d;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lv9/b;->k:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    if-eqz p2, :cond_2

    .line 12
    .line 13
    iput-object p2, p0, Lv9/b;->f:Landroid/graphics/RectF;

    .line 14
    .line 15
    iget-object v0, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-virtual {v0, p3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 18
    .line 19
    .line 20
    iget-boolean p3, p0, Lv9/b;->h:Z

    .line 21
    .line 22
    if-eqz p3, :cond_1

    .line 23
    .line 24
    sget-object p3, Lna/q;->a:Lna/q;

    .line 25
    .line 26
    iget-object v0, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 27
    .line 28
    iget v1, p0, Lv9/b;->j:F

    .line 29
    .line 30
    invoke-virtual {p3, p2, v0, v1}, Lna/q;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    sget-object p3, Lna/q;->a:Lna/q;

    .line 36
    .line 37
    iget-object v0, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 38
    .line 39
    iget v1, p0, Lv9/b;->j:F

    .line 40
    .line 41
    invoke-virtual {p3, p2, v0, v1}, Lna/q;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 p2, 0x0

    .line 47
    :goto_0
    iget-object p3, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 48
    .line 49
    iget-object v0, p0, Lv9/b;->i:Landroid/graphics/Paint;

    .line 50
    .line 51
    invoke-virtual {p3, p1, p2, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->Q(Lca/d;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public j(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lv9/b;->I()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->r(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public k(Ljava/util/List;Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "matrix"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean p1, p0, Lv9/b;->k:Z

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p1, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lv9/b;->a:Lu9/a;

    .line 24
    .line 25
    invoke-virtual {v1}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 37
    .line 38
    .line 39
    iget-object p2, p0, Lv9/b;->a:Lu9/a;

    .line 40
    .line 41
    invoke-virtual {p2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->T(Landroid/graphics/Matrix;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public l(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lv9/b;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method public m(Landroid/graphics/RectF;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lv9/b;->k:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :cond_1
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->H(Landroid/graphics/RectF;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public n()Lba/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()V
    .locals 2

    .line 1
    const-string v0, "GraphControl:cameraChangeStart "

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, Lv9/b;->k:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->h(Lba/c;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public p(Ljava/util/List;)V
    .locals 6

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "GraphControl:delete -> root:"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Lba/c;->getId()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, ": "

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move-object v2, p1

    .line 41
    check-cast v2, Ljava/lang/Iterable;

    .line 42
    .line 43
    new-instance v3, Ljava/util/ArrayList;

    .line 44
    .line 45
    const/16 v4, 0xa

    .line 46
    .line 47
    invoke-static {v2, v4}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_2

    .line 63
    .line 64
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v5, Lba/c;

    .line 69
    .line 70
    invoke-interface {v5}, Lba/c;->getId()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, p1}, Lba/c;->k(Ljava/util/List;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_4

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Lba/c;

    .line 110
    .line 111
    iget-object v2, p0, Lv9/b;->n:Lhd/l;

    .line 112
    .line 113
    if-eqz v2, :cond_3

    .line 114
    .line 115
    invoke-interface {v2, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    iget-boolean p1, p0, Lv9/b;->k:Z

    .line 120
    .line 121
    if-nez p1, :cond_5

    .line 122
    .line 123
    :goto_2
    return-void

    .line 124
    :cond_5
    iget-object p1, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->m(Lba/c;)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public q()Landroid/graphics/RectF;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lv9/b;->b:Lw9/h;

    .line 4
    .line 5
    invoke-virtual {v1}, Lw9/h;->e()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public r(Landroid/graphics/Matrix;)V
    .locals 3

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lv9/b;->k:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 16
    .line 17
    new-instance v1, Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lv9/b;->a:Lu9/a;

    .line 23
    .line 24
    invoke-virtual {v2}, Lu9/a;->e()Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lv9/b;->a:Lu9/a;

    .line 39
    .line 40
    invoke-virtual {p1}, Lu9/a;->e()Landroid/graphics/Matrix;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->i(Landroid/graphics/Matrix;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void
.end method

.method public s(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 1

    .line 1
    const-string v0, "backgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->N(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public t(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 8

    .line 1
    const-string v0, "selectRectF"

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
    const-string v0, "selectFunctionRectF"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "functionRectF"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "typeList"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lv9/b;->o:Ls9/d;

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    move-object v3, p2

    .line 30
    move-object v4, p3

    .line 31
    move-object v5, p4

    .line 32
    move-object v6, p5

    .line 33
    move-object v7, p6

    .line 34
    invoke-virtual/range {v1 .. v7}, Ls9/d;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public u(Lca/d;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "GraphControl:textHandleEnd"

    .line 7
    .line 8
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-boolean p1, p0, Lv9/b;->k:Z

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object p1, p0, Lv9/b;->d:Lba/c;

    .line 21
    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    iput-object p2, p0, Lv9/b;->f:Landroid/graphics/RectF;

    .line 27
    .line 28
    iget-object v0, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-virtual {v0, p3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 31
    .line 32
    .line 33
    iget-boolean p3, p0, Lv9/b;->h:Z

    .line 34
    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    sget-object p3, Lna/q;->a:Lna/q;

    .line 38
    .line 39
    iget-object v0, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 40
    .line 41
    iget v1, p0, Lv9/b;->j:F

    .line 42
    .line 43
    invoke-virtual {p3, p2, v0, v1}, Lna/q;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    sget-object p3, Lna/q;->a:Lna/q;

    .line 49
    .line 50
    iget-object v0, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 51
    .line 52
    iget v1, p0, Lv9/b;->j:F

    .line 53
    .line 54
    invoke-virtual {p3, p2, v0, v1}, Lna/q;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 p2, 0x0

    .line 60
    :goto_0
    iget-object p3, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 61
    .line 62
    iget-object v0, p0, Lv9/b;->i:Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-virtual {p3, p1, p2, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->R(Lba/c;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_1
    return-void
.end method

.method public v(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 9

    .line 1
    const-string v0, "selectRectF"

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
    const-string v0, "selectFunctionRectF"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "functionRectF"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "typeList"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lv9/b;->d:Lba/c;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    iget-object v1, p0, Lv9/b;->o:Ls9/d;

    .line 31
    .line 32
    move-object v3, p1

    .line 33
    move-object v4, p2

    .line 34
    move-object v5, p3

    .line 35
    move-object v6, p4

    .line 36
    move-object v7, p5

    .line 37
    move-object v8, p6

    .line 38
    invoke-virtual/range {v1 .. v8}, Ls9/d;->c(Lba/c;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public w(Ljava/lang/String;Landroid/graphics/RectF;Landroid/graphics/Matrix;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "graphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "originRectF"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "renderMatrix"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "filePath"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "GraphControl:changeImageGraph -> graphId: "

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-interface {v0}, Lba/c;->f()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    check-cast v0, Ljava/lang/Iterable;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lba/c;

    .line 72
    .line 73
    invoke-interface {v1}, Lba/c;->getId()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_0

    .line 82
    .line 83
    instance-of v2, v1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 84
    .line 85
    if-eqz v2, :cond_0

    .line 86
    .line 87
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 88
    .line 89
    invoke-virtual {v1, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->p(Landroid/graphics/RectF;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, p3}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->z(Landroid/graphics/Matrix;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, p4}, Lcom/zykj/blackboard/core/graph/group/ImageGraph;->K(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lv9/b;->I()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_0

    .line 103
    .line 104
    iget-object v1, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 105
    .line 106
    new-instance v2, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    iget-object v3, p0, Lv9/b;->d:Lba/c;

    .line 112
    .line 113
    if-eqz v3, :cond_1

    .line 114
    .line 115
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :cond_1
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->s(Ljava/util/List;)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_2
    return-void
.end method

.method public x(Ljava/util/List;)V
    .locals 5

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "GraphControl:translationStart -> graph:"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-object v1, p1

    .line 17
    check-cast v1, Ljava/lang/Iterable;

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/16 v3, 0xa

    .line 22
    .line 23
    invoke-static {v1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Lba/c;

    .line 45
    .line 46
    invoke-interface {v3}, Lba/c;->getId()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-boolean v0, p0, Lv9/b;->k:Z

    .line 69
    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_1
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    iget-object v1, p0, Lv9/b;->f:Landroid/graphics/RectF;

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    iget-boolean v2, p0, Lv9/b;->h:Z

    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    sget-object v2, Lna/q;->a:Lna/q;

    .line 86
    .line 87
    iget-object v3, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 88
    .line 89
    iget v4, p0, Lv9/b;->j:F

    .line 90
    .line 91
    invoke-virtual {v2, v1, v3, v4}, Lna/q;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    sget-object v2, Lna/q;->a:Lna/q;

    .line 97
    .line 98
    iget-object v3, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 99
    .line 100
    iget v4, p0, Lv9/b;->j:F

    .line 101
    .line 102
    invoke-virtual {v2, v1, v3, v4}, Lna/q;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    const/4 v1, 0x0

    .line 108
    :goto_1
    iget-object v2, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 109
    .line 110
    iget-object v3, p0, Lv9/b;->i:Landroid/graphics/Paint;

    .line 111
    .line 112
    invoke-virtual {v2, v0, p1, v1, v3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->V(Lba/c;Ljava/util/List;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_2
    return-void
.end method

.method public y(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V
    .locals 1

    .line 1
    const-string v0, "rectF"

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
    iget-boolean v0, p0, Lv9/b;->k:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iput-object p1, p0, Lv9/b;->f:Landroid/graphics/RectF;

    .line 17
    .line 18
    iput-object p3, p0, Lv9/b;->i:Landroid/graphics/Paint;

    .line 19
    .line 20
    iput p4, p0, Lv9/b;->j:F

    .line 21
    .line 22
    iget-object v0, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 25
    .line 26
    .line 27
    iput-boolean p5, p0, Lv9/b;->h:Z

    .line 28
    .line 29
    iget-object v0, p0, Lv9/b;->d:Lba/c;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    if-eqz p5, :cond_1

    .line 34
    .line 35
    sget-object p5, Lna/q;->a:Lna/q;

    .line 36
    .line 37
    invoke-virtual {p5, p1, p2, p4}, Lna/q;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    sget-object p5, Lna/q;->a:Lna/q;

    .line 43
    .line 44
    invoke-virtual {p5, p1, p2, p4}, Lna/q;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_0
    iget-object p2, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 49
    .line 50
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->L()V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 54
    .line 55
    invoke-virtual {p2, p1, p3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->K(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_1
    return-void
.end method

.method public z(Ljava/util/List;Landroid/graphics/Matrix;)V
    .locals 4

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "GraphControl:translationEnd -> matrix:"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, " graph:"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    check-cast p1, Ljava/lang/Iterable;

    .line 25
    .line 26
    new-instance v1, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/16 v2, 0xa

    .line 29
    .line 30
    invoke-static {p1, v2}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lba/c;

    .line 52
    .line 53
    invoke-interface {v3}, Lba/c;->getId()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lba/c;

    .line 90
    .line 91
    new-instance v1, Landroid/graphics/Matrix;

    .line 92
    .line 93
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 94
    .line 95
    .line 96
    if-eqz p2, :cond_1

    .line 97
    .line 98
    invoke-virtual {v1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 99
    .line 100
    .line 101
    :cond_1
    sget-object v2, Lqc/q;->a:Lqc/q;

    .line 102
    .line 103
    invoke-virtual {p0, v0, v1}, Lv9/b;->J(Lba/c;Landroid/graphics/Matrix;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    iget-boolean p1, p0, Lv9/b;->k:Z

    .line 108
    .line 109
    if-nez p1, :cond_3

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_3
    iget-object p1, p0, Lv9/b;->f:Landroid/graphics/RectF;

    .line 113
    .line 114
    if-eqz p1, :cond_5

    .line 115
    .line 116
    iget-object p1, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 117
    .line 118
    new-instance v0, Landroid/graphics/Matrix;

    .line 119
    .line 120
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 121
    .line 122
    .line 123
    if-eqz p2, :cond_4

    .line 124
    .line 125
    iget-object v1, p0, Lv9/b;->a:Lu9/a;

    .line 126
    .line 127
    invoke-virtual {v1}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-static {v1}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 139
    .line 140
    .line 141
    iget-object p2, p0, Lv9/b;->a:Lu9/a;

    .line 142
    .line 143
    invoke-virtual {p2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 148
    .line 149
    .line 150
    :cond_4
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 151
    .line 152
    .line 153
    :cond_5
    iget-object p1, p0, Lv9/b;->d:Lba/c;

    .line 154
    .line 155
    if-eqz p1, :cond_8

    .line 156
    .line 157
    iget-object p2, p0, Lv9/b;->f:Landroid/graphics/RectF;

    .line 158
    .line 159
    if-eqz p2, :cond_7

    .line 160
    .line 161
    iget-boolean v0, p0, Lv9/b;->h:Z

    .line 162
    .line 163
    if-eqz v0, :cond_6

    .line 164
    .line 165
    sget-object v0, Lna/q;->a:Lna/q;

    .line 166
    .line 167
    iget-object v1, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 168
    .line 169
    iget v2, p0, Lv9/b;->j:F

    .line 170
    .line 171
    invoke-virtual {v0, p2, v1, v2}, Lna/q;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    goto :goto_2

    .line 176
    :cond_6
    sget-object v0, Lna/q;->a:Lna/q;

    .line 177
    .line 178
    iget-object v1, p0, Lv9/b;->g:Landroid/graphics/Matrix;

    .line 179
    .line 180
    iget v2, p0, Lv9/b;->j:F

    .line 181
    .line 182
    invoke-virtual {v0, p2, v1, v2}, Lna/q;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    goto :goto_2

    .line 187
    :cond_7
    const/4 p2, 0x0

    .line 188
    :goto_2
    iget-object v0, p0, Lv9/b;->e:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 189
    .line 190
    iget-object v1, p0, Lv9/b;->i:Landroid/graphics/Paint;

    .line 191
    .line 192
    invoke-virtual {v0, p1, p2, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->U(Lba/c;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 193
    .line 194
    .line 195
    :cond_8
    :goto_3
    return-void
.end method
