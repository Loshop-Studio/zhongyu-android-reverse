.class public final Ls9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/blackboard/core/canvas/control/DrawControl;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/control/DrawControl;)V
    .locals 1

    .line 1
    const-string v0, "drawControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ls9/d;->a:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(FFFF)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls9/d;->a:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->C(FFFF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V
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
    iget-object v1, p0, Ls9/d;->a:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

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
    invoke-virtual/range {v1 .. v7}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->B(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final c(Lba/c;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 9

    .line 1
    const-string v0, "rootGraph"

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
    iget-object v1, p0, Ls9/d;->a:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 32
    .line 33
    move-object v2, p1

    .line 34
    move-object v3, p2

    .line 35
    move-object v4, p3

    .line 36
    move-object v5, p4

    .line 37
    move-object v6, p5

    .line 38
    move-object v7, p6

    .line 39
    move-object/from16 v8, p7

    .line 40
    .line 41
    invoke-virtual/range {v1 .. v8}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->D(Lba/c;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final d(Lba/c;Lba/c;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 10

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "textGraph"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "selectRectF"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "matrix"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "selectFunctionRectF"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "functionRectF"

    .line 27
    .line 28
    move-object/from16 v7, p6

    .line 29
    .line 30
    invoke-static {v7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "typeList"

    .line 34
    .line 35
    move-object/from16 v8, p7

    .line 36
    .line 37
    invoke-static {v8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Ls9/d;->a:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 41
    .line 42
    move-object v2, p1

    .line 43
    move-object v3, p2

    .line 44
    move-object v4, p3

    .line 45
    move-object v5, p4

    .line 46
    move-object v6, p5

    .line 47
    move-object/from16 v9, p8

    .line 48
    .line 49
    invoke-virtual/range {v1 .. v9}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->E(Lba/c;Lba/c;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final e(Lba/c;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 9

    .line 1
    const-string v0, "textGraph"

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
    iget-object v1, p0, Ls9/d;->a:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 32
    .line 33
    move-object v2, p1

    .line 34
    move-object v3, p2

    .line 35
    move-object v4, p3

    .line 36
    move-object v5, p4

    .line 37
    move-object v6, p5

    .line 38
    move-object v7, p6

    .line 39
    move-object/from16 v8, p7

    .line 40
    .line 41
    invoke-virtual/range {v1 .. v8}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->F(Lba/c;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
