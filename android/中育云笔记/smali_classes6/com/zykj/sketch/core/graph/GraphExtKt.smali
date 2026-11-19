.class public final Lcom/zykj/sketch/core/graph/GraphExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final convert2FM(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graph"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrix"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->getMFatherGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->getChildExtendMatrix()Landroid/graphics/Matrix;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->inverts(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->inverts(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 42
    .line 43
    .line 44
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->convert2FM(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/Matrix;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public static final convert2WM(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graph"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrix"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->getMFatherGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->getChildExtendMatrix()Landroid/graphics/Matrix;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 34
    .line 35
    .line 36
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->convert2WM(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/Matrix;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public static final getFP2WPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p0, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->convert2WM(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final getFP2WPRendMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p0, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->convert2WM(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Lcom/zykj/sketch/core/listener/IControl;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static final getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p0, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->convert2FM(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final getWP2LPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->inverts(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final initPaint(Lcom/zykj/sketch/core/graph/Graph;IF)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 p2, 0x1

    .line 34
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setDither(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static final inverts(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pointF"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 5
    new-array v1, v0, [F

    .line 6
    iget v2, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    new-array v0, v0, [F

    const/4 v3, 0x0

    aput v2, v0, v3

    const/4 v2, 0x1

    aput p1, v0, v2

    invoke-virtual {p0, v1, v0}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 7
    new-instance p0, Landroid/graphics/PointF;

    aget p1, v1, v3

    aget v0, v1, v2

    invoke-direct {p0, p1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p0
.end method

.method public static final mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrix"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-static {p0, v0, p3}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object p0

    return-object p0
.end method

.method public static final mapPoint(Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "pointF"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "matrix"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x2

    .line 2
    new-array v0, p0, [F

    .line 3
    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    new-array p0, p0, [F

    const/4 v2, 0x0

    aput v1, p0, v2

    const/4 v1, 0x1

    aput p1, p0, v1

    invoke-virtual {p2, v0, p0}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 4
    new-instance p0, Landroid/graphics/PointF;

    aget p1, v0, v2

    aget p2, v0, v1

    invoke-direct {p0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p0
.end method

.method public static final maxWritingRenderOutRectF(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/RectF;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 9
    .line 10
    .line 11
    instance-of v1, p0, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Lcom/zykj/sketch/core/listener/IGraph;->onMeasure()V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getFP2WPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getOutRect()Landroid/graphics/RectF;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getChild()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/lang/Iterable;

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lcom/zykj/sketch/core/graph/Graph;

    .line 50
    .line 51
    invoke-static {v1}, Lcom/zykj/sketch/core/graph/GraphExtKt;->maxWritingRenderOutRectF(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/RectF;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-object v0
.end method

.method public static final pointConvertPath(Lcom/zykj/sketch/core/graph/Graph;Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Path;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/core/graph/Graph;",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;",
            "Landroid/graphics/Matrix;",
            ")",
            "Landroid/graphics/Path;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pointList"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrix"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroid/graphics/Path;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->pointsConvertPoints(Lcom/zykj/sketch/core/graph/Graph;Ljava/util/List;Landroid/graphics/Matrix;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    move-object p1, p0

    .line 26
    check-cast p1, Ljava/lang/Iterable;

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 p2, 0x0

    .line 33
    move v1, p2

    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Landroid/graphics/PointF;

    .line 45
    .line 46
    invoke-static {p0}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    iget p2, v2, Landroid/graphics/PointF;->x:F

    .line 57
    .line 58
    iget v1, v2, Landroid/graphics/PointF;->y:F

    .line 59
    .line 60
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 61
    .line 62
    .line 63
    iget p2, v2, Landroid/graphics/PointF;->x:F

    .line 64
    .line 65
    iget v1, v2, Landroid/graphics/PointF;->y:F

    .line 66
    .line 67
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_0
    invoke-static {p0}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    const/4 v4, 0x2

    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 83
    .line 84
    add-float/2addr v3, p2

    .line 85
    int-to-float v4, v4

    .line 86
    div-float/2addr v3, v4

    .line 87
    iget v5, v2, Landroid/graphics/PointF;->y:F

    .line 88
    .line 89
    add-float/2addr v5, v1

    .line 90
    div-float/2addr v5, v4

    .line 91
    invoke-virtual {v0, p2, v1, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 92
    .line 93
    .line 94
    iget p2, v2, Landroid/graphics/PointF;->x:F

    .line 95
    .line 96
    iget v1, v2, Landroid/graphics/PointF;->y:F

    .line 97
    .line 98
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 103
    .line 104
    add-float/2addr v3, p2

    .line 105
    int-to-float v4, v4

    .line 106
    div-float/2addr v3, v4

    .line 107
    iget v5, v2, Landroid/graphics/PointF;->y:F

    .line 108
    .line 109
    add-float/2addr v5, v1

    .line 110
    div-float/2addr v5, v4

    .line 111
    invoke-virtual {v0, p2, v1, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 112
    .line 113
    .line 114
    :goto_1
    iget p2, v2, Landroid/graphics/PointF;->x:F

    .line 115
    .line 116
    iget v1, v2, Landroid/graphics/PointF;->y:F

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 120
    .line 121
    .line 122
    return-object v0
.end method

.method public static synthetic pointConvertPath$default(Lcom/zykj/sketch/core/graph/Graph;Ljava/util/List;Landroid/graphics/Matrix;ILjava/lang/Object;)Landroid/graphics/Path;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    new-instance p2, Landroid/graphics/Matrix;

    .line 6
    .line 7
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->pointConvertPath(Lcom/zykj/sketch/core/graph/Graph;Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Path;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static final pointsConvertPoints(Lcom/zykj/sketch/core/graph/Graph;Ljava/util/List;Landroid/graphics/Matrix;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/core/graph/Graph;",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;",
            "Landroid/graphics/Matrix;",
            ")",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pointList"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrix"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Iterable;

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Landroid/graphics/PointF;

    .line 38
    .line 39
    invoke-static {p0, v1, p2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-object v0
.end method

.method public static final rectConvertPath(Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)Landroid/graphics/Path;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rectF"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrix"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroid/graphics/Path;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 19
    .line 20
    .line 21
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 22
    .line 23
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 24
    .line 25
    invoke-static {p0, v1, v2, p2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 30
    .line 31
    iget v3, v1, Landroid/graphics/PointF;->y:F

    .line 32
    .line 33
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 34
    .line 35
    .line 36
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 37
    .line 38
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 41
    .line 42
    .line 43
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 44
    .line 45
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 46
    .line 47
    invoke-static {p0, v1, v2, p2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 52
    .line 53
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 54
    .line 55
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 56
    .line 57
    .line 58
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 59
    .line 60
    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    .line 61
    .line 62
    invoke-static {p0, v1, v2, p2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 67
    .line 68
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 69
    .line 70
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 71
    .line 72
    .line 73
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 74
    .line 75
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 76
    .line 77
    invoke-static {p0, v1, p1, p2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iget p1, p0, Landroid/graphics/PointF;->x:F

    .line 82
    .line 83
    iget p0, p0, Landroid/graphics/PointF;->y:F

    .line 84
    .line 85
    invoke-virtual {v0, p1, p0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 89
    .line 90
    .line 91
    return-object v0
.end method
