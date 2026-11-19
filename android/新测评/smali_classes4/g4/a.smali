.class public final Lg4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/b;


# instance fields
.field public final a:Lk4/b;

.field public final b:Lcom/zykj/blackboard/bean/BoardConfig;

.field public final c:Lj4/a;

.field public final d:Lv4/d;

.field public final e:Lx4/c;

.field public final f:Ln4/f;

.field public g:Lg4/c;

.field public final h:Lg4/e;

.field public i:Lc5/f;

.field public j:Lc5/e;

.field public k:Lc5/d;

.field public l:Ljava/util/ArrayList;

.field public m:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lk4/b;Lcom/zykj/blackboard/bean/BoardConfig;Lj4/a;Lv4/d;Lx4/c;Ln4/f;)V
    .locals 1

    const-string v0, "graphControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "boardConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrixAdapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceLoader"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg4/a;->a:Lk4/b;

    .line 3
    iput-object p2, p0, Lg4/a;->b:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 4
    iput-object p3, p0, Lg4/a;->c:Lj4/a;

    .line 5
    iput-object p4, p0, Lg4/a;->d:Lv4/d;

    .line 6
    iput-object p5, p0, Lg4/a;->e:Lx4/c;

    .line 7
    iput-object p6, p0, Lg4/a;->f:Ln4/f;

    .line 8
    new-instance p1, Lg4/e;

    invoke-direct {p1}, Lg4/e;-><init>()V

    iput-object p1, p0, Lg4/a;->h:Lg4/e;

    .line 9
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lg4/a;->l:Ljava/util/ArrayList;

    .line 10
    invoke-virtual {p1, p0}, Lg4/e;->d(Lg4/b;)V

    return-void
.end method

.method public synthetic constructor <init>(Lk4/b;Lcom/zykj/blackboard/bean/BoardConfig;Lj4/a;Lv4/d;Lx4/c;Ln4/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x10

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_1

    move-object p7, v0

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p7, p6

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p7}, Lg4/a;-><init>(Lk4/b;Lcom/zykj/blackboard/bean/BoardConfig;Lj4/a;Lv4/d;Lx4/c;Ln4/f;)V

    return-void
.end method


# virtual methods
.method public a()Lk4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/a;->a:Lk4/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;)V
    .locals 7

    .line 1
    const-string v0, "originMatrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lastMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrixList"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lg4/a;->e:Lx4/c;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    move-object v2, p1

    .line 31
    move-object v3, p2

    .line 32
    move-object v4, p3

    .line 33
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->z(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public c(Ljava/util/List;Ljava/util/List;)V
    .locals 4

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrixList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lg4/a;->e:Lx4/c;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v2, 0xa

    .line 24
    .line 25
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Lq4/c;

    .line 47
    .line 48
    invoke-interface {v2}, Lq4/c;->h()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    invoke-virtual {v0, v1, p2, v2, v3}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->L(Ljava/util/List;Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void
.end method

.method public d()Lc5/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/a;->j:Lc5/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Lc5/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/a;->i:Lc5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public f(Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;Ljava/lang/String;)Lq4/a;
    .locals 9

    .line 1
    const-string v0, "graphType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "paint"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "parentGraphId"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "graphId"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lg4/a;->e:Lx4/c;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    move-object v3, p1

    .line 41
    move-object v4, p2

    .line 42
    move-object v5, p3

    .line 43
    move-object v2, p4

    .line 44
    move-object v6, p5

    .line 45
    invoke-virtual/range {v1 .. v8}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->C(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->M([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object p2, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->a:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 60
    .line 61
    const-string p3, "graphData"

    .line 62
    .line 63
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p3, p0, Lg4/a;->d:Lv4/d;

    .line 67
    .line 68
    invoke-virtual {p2, p1, p3}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lv4/d;)Lq4/a;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :cond_0
    const/4 p1, 0x0

    .line 74
    return-object p1
.end method

.method public g(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V
    .locals 3

    .line 1
    const-string v0, "eventList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lg4/a;->e:Lx4/c;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->U(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public h()Lj4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/a;->c:Lj4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public i(Lq4/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;)V
    .locals 15

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    move-object/from16 v2, p7

    .line 6
    .line 7
    const-string v3, "graph"

    .line 8
    .line 9
    move-object/from16 v4, p1

    .line 10
    .line 11
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v3, "graphEnum"

    .line 15
    .line 16
    move-object/from16 v6, p2

    .line 17
    .line 18
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Lg4/a;->e:Lx4/c;

    .line 22
    .line 23
    if-eqz v3, :cond_5

    .line 24
    .line 25
    invoke-virtual {v3}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_5

    .line 30
    .line 31
    invoke-interface {v4}, Lq4/c;->getId()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz p3, :cond_0

    .line 37
    .line 38
    invoke-static/range {p3 .. p3}, Le5/l;->c(Landroid/graphics/RectF;)Lcom/zykj/board/EzyRectF$RectF;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v7, v4

    .line 44
    :goto_0
    if-eqz v0, :cond_1

    .line 45
    .line 46
    const/high16 v8, 0x3f800000    # 1.0f

    .line 47
    .line 48
    const/4 v9, 0x0

    .line 49
    invoke-static {v0, v8, v9}, Le5/l;->a(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v9, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v9, v4

    .line 56
    :goto_1
    if-eqz v1, :cond_3

    .line 57
    .line 58
    new-instance v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    const/16 v8, 0xa

    .line 61
    .line 62
    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_2

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    check-cast v8, Landroid/graphics/PointF;

    .line 84
    .line 85
    invoke-static {v8}, Le5/l;->b(Landroid/graphics/PointF;)Lcom/zykj/board/EzyPointF$PointF;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-interface {v0, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    move-object v10, v0

    .line 94
    goto :goto_3

    .line 95
    :cond_3
    move-object v10, v4

    .line 96
    :goto_3
    if-eqz v2, :cond_4

    .line 97
    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    invoke-static {v2, v0, v1}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    :cond_4
    move-object v11, v4

    .line 107
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 108
    .line 109
    .line 110
    move-result-wide v13

    .line 111
    move-object/from16 v8, p4

    .line 112
    .line 113
    move-object/from16 v12, p8

    .line 114
    .line 115
    move-object v4, v3

    .line 116
    invoke-virtual/range {v4 .. v14}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->Q(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 117
    .line 118
    .line 119
    :cond_5
    return-void
.end method

.method public j()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/a;->m:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Lcom/zykj/blackboard/bean/BoardConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/a;->b:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()V
    .locals 4

    .line 1
    iget-object v0, p0, Lg4/a;->a:Lk4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk4/b;->n()Lq4/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lg4/a;->f:Ln4/f;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lq4/a;

    .line 14
    .line 15
    iget-object v2, p0, Lg4/a;->a:Lk4/b;

    .line 16
    .line 17
    invoke-virtual {v2}, Lk4/b;->getBackgroundColor()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p0, Lg4/a;->a:Lk4/b;

    .line 22
    .line 23
    invoke-virtual {v3}, Lk4/b;->J()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v1, v0, v2, v3}, Ln4/f;->c(Lq4/a;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public m(Ljava/lang/String;)Lq4/c;
    .locals 7

    .line 1
    const-string v0, "parentGraphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4/a;->e:Lx4/c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sget-object v3, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->c:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 17
    .line 18
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->q()Lcom/zykj/board/EzyRectF$RectF$b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/zykj/board/EzyRectF$RectF$b;->c()Lcom/zykj/board/EzyRectF$RectF;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const-string v0, "newBuilder().build()"

    .line 27
    .line 28
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    move-object v2, p1

    .line 36
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->B(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->M([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object v0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->a:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 51
    .line 52
    const-string v1, "graphData"

    .line 53
    .line 54
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lg4/a;->d:Lv4/d;

    .line 58
    .line 59
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lv4/d;)Lq4/a;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    iget-object v1, p0, Lg4/a;->a:Lk4/b;

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->F()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v1, p1, v0}, Lk4/b;->y(Ljava/lang/String;Lq4/c;)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_0
    const/4 p1, 0x0

    .line 76
    return-object p1
.end method

.method public n(Ljava/util/List;J)V
    .locals 4

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4/a;->e:Lx4/c;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lq4/c;

    .line 42
    .line 43
    invoke-interface {v3}, Lq4/c;->h()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v0, v1, p2, p3}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->a0(Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_3

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, Lq4/c;

    .line 73
    .line 74
    iget-object p3, p0, Lg4/a;->l:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/4 v1, 0x0

    .line 81
    :goto_1
    if-ge v1, v0, :cond_2

    .line 82
    .line 83
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    check-cast v2, Lc5/c;

    .line 90
    .line 91
    invoke-interface {v2, p2}, Lc5/c;->a(Lq4/c;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    return-void
.end method

.method public o()Lc5/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/a;->k:Lc5/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public p(FFFFLandroid/graphics/Paint;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 11

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    const-string v2, "paint"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "content"

    .line 11
    .line 12
    move-object/from16 v8, p6

    .line 13
    .line 14
    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lg4/a;->a:Lk4/b;

    .line 18
    .line 19
    invoke-virtual {v2}, Lk4/b;->b()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Lg4/a;->e:Lx4/c;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    const/high16 v2, 0x3f800000    # 1.0f

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static {v0, v2, v5}, Le5/l;->a(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    move v5, p1

    .line 47
    move v6, p2

    .line 48
    invoke-virtual/range {v3 .. v10}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->N(Ljava/lang/String;FFLcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->M([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    sget-object p2, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->a:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 63
    .line 64
    const-string v0, "graphData"

    .line 65
    .line 66
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lg4/a;->d:Lv4/d;

    .line 70
    .line 71
    invoke-virtual {p2, p1, v0}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lv4/d;)Lq4/a;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p1, :cond_0

    .line 76
    .line 77
    const/4 p2, 0x2

    .line 78
    new-array p2, p2, [F

    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    aput p3, p2, v0

    .line 82
    .line 83
    const/4 p3, 0x1

    .line 84
    aput p4, p2, p3

    .line 85
    .line 86
    invoke-virtual {p0}, Lg4/a;->h()Lj4/a;

    .line 87
    .line 88
    .line 89
    move-result-object p4

    .line 90
    invoke-virtual {p4}, Lj4/a;->b()Landroid/graphics/Matrix;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    invoke-static {p4}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 95
    .line 96
    .line 97
    move-result-object p4

    .line 98
    invoke-virtual {p4, p2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 99
    .line 100
    .line 101
    new-instance p4, Landroid/graphics/Matrix;

    .line 102
    .line 103
    invoke-direct {p4}, Landroid/graphics/Matrix;-><init>()V

    .line 104
    .line 105
    .line 106
    aget v0, p2, v0

    .line 107
    .line 108
    aget p2, p2, p3

    .line 109
    .line 110
    invoke-virtual {p4, v0, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 111
    .line 112
    .line 113
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    invoke-static {p4, v2, v3}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    filled-new-array {p3}, [Lcom/zykj/board/EzyMatrix$Matrix;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    invoke-virtual {p0, p2, p3}, Lg4/a;->c(Ljava/util/List;Ljava/util/List;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, p4}, Lq4/a;->e(Landroid/graphics/Matrix;)V

    .line 137
    .line 138
    .line 139
    if-eqz v1, :cond_0

    .line 140
    .line 141
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_0
    return-void
.end method

.method public q()Lv4/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/a;->d:Lv4/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public r(FFFFILjava/util/List;Landroid/graphics/Paint;Lkotlin/jvm/functions/Function1;)V
    .locals 12

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    move-object/from16 v1, p8

    .line 4
    .line 5
    const-string v2, "pointList"

    .line 6
    .line 7
    move-object/from16 v8, p6

    .line 8
    .line 9
    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "paint"

    .line 13
    .line 14
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lg4/a;->a:Lk4/b;

    .line 18
    .line 19
    invoke-virtual {v2}, Lk4/b;->b()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Lg4/a;->e:Lx4/c;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    const/high16 v2, 0x3f800000    # 1.0f

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static {v0, v2, v5}, Le5/l;->a(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide v10

    .line 46
    move v5, p1

    .line 47
    move v6, p2

    .line 48
    move/from16 v7, p5

    .line 49
    .line 50
    invoke-virtual/range {v3 .. v11}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->J(Ljava/lang/String;FFILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->M([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object p2, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->a:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 65
    .line 66
    const-string v0, "graphData"

    .line 67
    .line 68
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lg4/a;->d:Lv4/d;

    .line 72
    .line 73
    invoke-virtual {p2, p1, v0}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lv4/d;)Lq4/a;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_0

    .line 78
    .line 79
    const/4 p2, 0x2

    .line 80
    new-array p2, p2, [F

    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    aput p3, p2, v0

    .line 84
    .line 85
    const/4 p3, 0x1

    .line 86
    aput p4, p2, p3

    .line 87
    .line 88
    invoke-virtual {p0}, Lg4/a;->h()Lj4/a;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2}, Lj4/a;->b()Landroid/graphics/Matrix;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {v2}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2, p2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 101
    .line 102
    .line 103
    new-instance v2, Landroid/graphics/Matrix;

    .line 104
    .line 105
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 106
    .line 107
    .line 108
    aget v0, p2, v0

    .line 109
    .line 110
    aget p2, p2, p3

    .line 111
    .line 112
    invoke-virtual {v2, v0, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 113
    .line 114
    .line 115
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 120
    .line 121
    .line 122
    move-result-wide v3

    .line 123
    invoke-static {v2, v3, v4}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    filled-new-array {p3}, [Lcom/zykj/board/EzyMatrix$Matrix;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object p3

    .line 135
    invoke-virtual {p0, p2, p3}, Lg4/a;->c(Ljava/util/List;Ljava/util/List;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v2}, Lq4/a;->e(Landroid/graphics/Matrix;)V

    .line 139
    .line 140
    .line 141
    if-eqz v1, :cond_0

    .line 142
    .line 143
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :cond_0
    return-void
.end method

.method public final s()Lg4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/a;->h:Lg4/e;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lg4/e;->c(Lg4/b;)Lg4/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final t()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/a;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Lg4/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/a;->h:Lg4/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v(Lg4/c;Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->T(Landroid/view/MotionEvent;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final w(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Le5/i;->a:Le5/i;

    .line 7
    .line 8
    iget-object v1, p0, Lg4/a;->c:Lj4/a;

    .line 9
    .line 10
    invoke-virtual {v1}, Lj4/a;->b()Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, p1, v1}, Le5/i;->b(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getAction()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_5

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    if-eq v1, v2, :cond_3

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    if-eq v1, v2, :cond_2

    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    if-eq v1, v2, :cond_1

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    if-eq v1, v2, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object v1, p0, Lg4/a;->g:Lg4/c;

    .line 42
    .line 43
    if-eqz v1, :cond_6

    .line 44
    .line 45
    invoke-interface {v1, v0}, Lg4/c;->c(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v1, p0, Lg4/a;->g:Lg4/c;

    .line 50
    .line 51
    if-eqz v1, :cond_6

    .line 52
    .line 53
    invoke-interface {v1, v0}, Lg4/c;->a(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iget-object v1, p0, Lg4/a;->g:Lg4/c;

    .line 58
    .line 59
    if-eqz v1, :cond_6

    .line 60
    .line 61
    invoke-interface {v1, v0}, Lg4/c;->d(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    iget-object v1, p0, Lg4/a;->g:Lg4/c;

    .line 66
    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    invoke-interface {v1, v0}, Lg4/c;->b(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    iget-object v0, p0, Lg4/a;->g:Lg4/c;

    .line 73
    .line 74
    invoke-virtual {p0, v0, p1}, Lg4/a;->v(Lg4/c;Landroid/view/MotionEvent;)V

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    iput-object v0, p0, Lg4/a;->g:Lg4/c;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    iget-object v1, p0, Lg4/a;->h:Lg4/e;

    .line 82
    .line 83
    invoke-virtual {v1, p0}, Lg4/e;->b(Lg4/b;)Lg4/c;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iput-object v1, p0, Lg4/a;->g:Lg4/c;

    .line 88
    .line 89
    if-eqz v1, :cond_6

    .line 90
    .line 91
    invoke-interface {v1, v0}, Lg4/c;->e(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 92
    .line 93
    .line 94
    :cond_6
    :goto_0
    iget-object v0, p0, Lg4/a;->g:Lg4/c;

    .line 95
    .line 96
    invoke-virtual {p0, v0, p1}, Lg4/a;->v(Lg4/c;Landroid/view/MotionEvent;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final x(Lc5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg4/a;->k:Lc5/d;

    .line 2
    .line 3
    return-void
.end method

.method public final y(Lc5/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg4/a;->j:Lc5/e;

    .line 2
    .line 3
    return-void
.end method

.method public final z(Lc5/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg4/a;->i:Lc5/f;

    .line 2
    .line 3
    return-void
.end method
