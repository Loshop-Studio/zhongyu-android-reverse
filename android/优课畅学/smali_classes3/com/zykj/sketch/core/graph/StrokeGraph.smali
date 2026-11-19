.class public final Lcom/zykj/sketch/core/graph/StrokeGraph;
.super Lcom/zykj/sketch/core/graph/WritingGroupGraph;
.source "SourceFile"


# instance fields
.field private actionControl:Lcom/zykj/sketch/core/listener/IControl;

.field private final fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private tempMatrix:Landroid/graphics/Matrix;

.field private tempPath:Landroid/graphics/Path;

.field private tempSize:I


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;)V
    .locals 1

    .line 1
    const-string v0, "actionControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    new-instance p1, Landroid/graphics/Path;

    .line 19
    .line 20
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->tempPath:Landroid/graphics/Path;

    .line 24
    .line 25
    return-void
.end method

.method private final isIntersect(Landroid/graphics/RectF;Landroid/graphics/Path;Landroid/graphics/RectF;Landroid/graphics/Path;)Z
    .locals 8

    .line 20
    invoke-virtual {p0, p1, p3}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;->crossLine(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    .line 22
    new-instance v1, Landroid/graphics/Region;

    .line 23
    new-instance v2, Landroid/graphics/Rect;

    .line 24
    iget v3, p1, Landroid/graphics/RectF;->left:F

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    .line 25
    iget v4, p1, Landroid/graphics/RectF;->top:F

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-float v4, v4

    float-to-int v4, v4

    .line 26
    iget v5, p1, Landroid/graphics/RectF;->right:F

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v5, v5

    float-to-int v5, v5

    .line 27
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    float-to-double v6, p1

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float p1, v6

    float-to-int p1, p1

    .line 28
    invoke-direct {v2, v3, v4, v5, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 29
    invoke-direct {v1, v2}, Landroid/graphics/Region;-><init>(Landroid/graphics/Rect;)V

    .line 30
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 31
    new-instance p1, Landroid/graphics/Region;

    invoke-direct {p1}, Landroid/graphics/Region;-><init>()V

    .line 32
    new-instance p2, Landroid/graphics/Region;

    .line 33
    new-instance v1, Landroid/graphics/Rect;

    .line 34
    iget v2, p3, Landroid/graphics/RectF;->left:F

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v2, v2

    .line 35
    iget v3, p3, Landroid/graphics/RectF;->top:F

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    .line 36
    iget v4, p3, Landroid/graphics/RectF;->right:F

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-float v4, v4

    float-to-int v4, v4

    .line 37
    iget p3, p3, Landroid/graphics/RectF;->bottom:F

    float-to-double v5, p3

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float p3, v5

    float-to-int p3, p3

    .line 38
    invoke-direct {v1, v2, v3, v4, p3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 39
    invoke-direct {p2, v1}, Landroid/graphics/Region;-><init>(Landroid/graphics/Rect;)V

    .line 40
    invoke-virtual {p1, p4, p2}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 41
    sget-object p2, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final addFPPoint(Landroid/graphics/PointF;)V
    .locals 1

    .line 1
    const-string v0, "point"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final addPoint(FF)V
    .locals 1

    .line 2
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/core/graph/StrokeGraph;->addPoint(Landroid/graphics/PointF;)V

    return-void
.end method

.method public final addPoint(Landroid/graphics/PointF;)V
    .locals 2

    const-string v0, "point"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-static {p0, p1, v1}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public findGraph(FFF)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFF)",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/graph/Graph;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public final getActionControl()Lcom/zykj/sketch/core/listener/IControl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getSnapshotBuild()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$Touch;->newBuilder()Lcom/zykj/sketch/GraphSnapshot$Touch$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$PointF;->newBuilder()Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget v5, v3, Landroid/graphics/PointF;->x:F

    .line 32
    .line 33
    invoke-virtual {v4, v5}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->setX(F)Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 38
    .line 39
    invoke-virtual {v4, v3}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->setY(F)Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v1, v3}, Lcom/zykj/sketch/GraphSnapshot$Touch$Builder;->addPointF(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/GraphSnapshot$Touch$Builder;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$Touch$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$Touch;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setExtra(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "builder.build()"

    .line 67
    .line 68
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v0
.end method

.method public graphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphType;->STROKE_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isIntersect(FFF)Z
    .locals 14

    .line 42
    invoke-virtual/range {p0 .. p3}, Lcom/zykj/sketch/core/graph/Graph;->isInRect(FFF)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 43
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getFP2WPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    move-result-object v2

    invoke-static {p0, v0, v2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->pointsConvertPoints(Lcom/zykj/sketch/core/graph/Graph;Ljava/util/List;Landroid/graphics/Matrix;)Ljava/util/List;

    move-result-object v0

    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_0

    invoke-static {}, Li7/v;->w()V

    :cond_0
    check-cast v4, Landroid/graphics/PointF;

    const/4 v6, 0x1

    if-nez v3, :cond_1

    .line 45
    iget v9, v4, Landroid/graphics/PointF;->x:F

    iget v10, v4, Landroid/graphics/PointF;->y:F

    const/16 v12, 0x10

    const/4 v13, 0x0

    const/4 v11, 0x0

    move v7, p1

    move/from16 v8, p2

    invoke-static/range {v7 .. v13}, Lcom/zykj/sketch/extensions/ExtensionsKt;->getDistance$default(FFFFLandroid/graphics/Matrix;ILjava/lang/Object;)F

    move-result v3

    cmpg-float v3, v3, p3

    if-gtz v3, :cond_2

    return v6

    :cond_1
    if-gt v6, v3, :cond_2

    .line 46
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    if-gt v3, v7, :cond_2

    .line 47
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v5, v3, :cond_2

    .line 48
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 49
    iget v7, v4, Landroid/graphics/PointF;->x:F

    .line 50
    iget v8, v4, Landroid/graphics/PointF;->y:F

    .line 51
    iget v9, v3, Landroid/graphics/PointF;->x:F

    .line 52
    iget v10, v3, Landroid/graphics/PointF;->y:F

    move v11, p1

    move/from16 v12, p2

    .line 53
    invoke-static/range {v7 .. v12}, Lcom/zykj/sketch/extensions/ExtensionsKt;->pointToLine(FFFFFF)F

    move-result v3

    cmpg-float v3, v3, p3

    if-gtz v3, :cond_2

    return v6

    :cond_2
    move v3, v5

    goto :goto_0

    :cond_3
    return v1
.end method

.method public final isIntersect(Landroid/graphics/Path;)Z
    .locals 8

    const-string v0, "touchPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 3
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v2

    const/4 v3, 0x4

    if-ge v2, v3, :cond_0

    .line 4
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-static {v2}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/PointF;

    .line 5
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 6
    iget-object v4, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 7
    new-instance v4, Landroid/graphics/PointF;

    iget v5, v2, Landroid/graphics/PointF;->x:F

    const/4 v6, 0x2

    int-to-float v6, v6

    sub-float/2addr v5, v6

    iget v7, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v7, v6

    invoke-direct {v4, v5, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    new-instance v4, Landroid/graphics/PointF;

    iget v5, v2, Landroid/graphics/PointF;->x:F

    add-float/2addr v5, v6

    iget v7, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v7, v6

    invoke-direct {v4, v5, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    new-instance v4, Landroid/graphics/PointF;

    iget v5, v2, Landroid/graphics/PointF;->x:F

    add-float/2addr v5, v6

    iget v7, v2, Landroid/graphics/PointF;->y:F

    add-float/2addr v7, v6

    invoke-direct {v4, v5, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    new-instance v4, Landroid/graphics/PointF;

    iget v5, v2, Landroid/graphics/PointF;->x:F

    sub-float/2addr v5, v6

    iget v7, v2, Landroid/graphics/PointF;->y:F

    add-float/2addr v7, v6

    invoke-direct {v4, v5, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    new-instance v4, Landroid/graphics/PointF;

    iget v5, v2, Landroid/graphics/PointF;->x:F

    iget v2, v2, Landroid/graphics/PointF;->y:F

    invoke-direct {v4, v5, v2}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getFP2WPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    move-result-object v2

    invoke-static {p0, v3, v2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->pointsConvertPoints(Lcom/zykj/sketch/core/graph/Graph;Ljava/util/List;Landroid/graphics/Matrix;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;->createPath(Ljava/util/List;)Landroid/graphics/Path;

    move-result-object v2

    .line 13
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 14
    invoke-virtual {v2, v3, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 15
    invoke-direct {p0, v0, p1, v3, v2}, Lcom/zykj/sketch/core/graph/StrokeGraph;->isIntersect(Landroid/graphics/RectF;Landroid/graphics/Path;Landroid/graphics/RectF;Landroid/graphics/Path;)Z

    move-result p1

    return p1

    .line 16
    :cond_0
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getFP2WPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    move-result-object v3

    invoke-static {p0, v2, v3}, Lcom/zykj/sketch/core/graph/GraphExtKt;->pointsConvertPoints(Lcom/zykj/sketch/core/graph/Graph;Ljava/util/List;Landroid/graphics/Matrix;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;->createPath(Ljava/util/List;)Landroid/graphics/Path;

    move-result-object v2

    .line 17
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 18
    invoke-virtual {v2, v3, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 19
    invoke-direct {p0, v0, p1, v3, v2}, Lcom/zykj/sketch/core/graph/StrokeGraph;->isIntersect(Landroid/graphics/RectF;Landroid/graphics/Path;Landroid/graphics/RectF;Landroid/graphics/Path;)Z

    move-result p1

    return p1
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/zykj/sketch/core/graph/Graph;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onMeasure()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_5

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroid/graphics/PointF;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Landroid/graphics/RectF;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 41
    .line 42
    iput v3, v2, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget v3, v1, Landroid/graphics/PointF;->y:F

    .line 49
    .line 50
    iput v3, v2, Landroid/graphics/RectF;->top:F

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    int-to-float v4, v4

    .line 60
    add-float/2addr v3, v4

    .line 61
    iput v3, v2, Landroid/graphics/RectF;->right:F

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    iget v3, v1, Landroid/graphics/PointF;->y:F

    .line 68
    .line 69
    add-float/2addr v3, v4

    .line 70
    iput v3, v2, Landroid/graphics/RectF;->bottom:F

    .line 71
    .line 72
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 77
    .line 78
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 79
    .line 80
    cmpl-float v2, v2, v3

    .line 81
    .line 82
    if-lez v2, :cond_2

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 89
    .line 90
    iput v3, v2, Landroid/graphics/RectF;->left:F

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 98
    .line 99
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 100
    .line 101
    cmpg-float v2, v2, v3

    .line 102
    .line 103
    if-gez v2, :cond_3

    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 110
    .line 111
    iput v3, v2, Landroid/graphics/RectF;->right:F

    .line 112
    .line 113
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 118
    .line 119
    iget v3, v1, Landroid/graphics/PointF;->y:F

    .line 120
    .line 121
    cmpl-float v2, v2, v3

    .line 122
    .line 123
    if-lez v2, :cond_4

    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 130
    .line 131
    iput v1, v2, Landroid/graphics/RectF;->top:F

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 139
    .line 140
    iget v3, v1, Landroid/graphics/PointF;->y:F

    .line 141
    .line 142
    cmpg-float v2, v2, v3

    .line 143
    .line 144
    if-gez v2, :cond_0

    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 151
    .line 152
    iput v1, v2, Landroid/graphics/RectF;->bottom:F

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_5
    new-instance v0, Landroid/graphics/PointF;

    .line 157
    .line 158
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 169
    .line 170
    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/core/graph/Graph;->setChildExtendMatrix(Landroid/graphics/PointF;)V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public render(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getFP2WPRendMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x2

    .line 25
    if-ge v1, v2, :cond_0

    .line 26
    .line 27
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "fPointList[0]"

    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    check-cast v1, Landroid/graphics/PointF;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 46
    .line 47
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {p1, v1, v0, v2}, Landroid/graphics/Canvas;->drawPoint(FFLandroid/graphics/Paint;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->tempMatrix:Landroid/graphics/Matrix;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    iget v1, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->tempSize:I

    .line 66
    .line 67
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-ne v1, v2, :cond_1

    .line 74
    .line 75
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->tempPath:Landroid/graphics/Path;

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_1
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 86
    .line 87
    invoke-static {p0, v1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->pointConvertPath(Lcom/zykj/sketch/core/graph/Graph;Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Path;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iput-object v1, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->tempPath:Landroid/graphics/Path;

    .line 92
    .line 93
    iput-object v0, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->tempMatrix:Landroid/graphics/Matrix;

    .line 94
    .line 95
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->fPointList:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iput v0, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->tempSize:I

    .line 102
    .line 103
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->tempPath:Landroid/graphics/Path;

    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final setActionControl(Lcom/zykj/sketch/core/listener/IControl;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/StrokeGraph;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 7
    .line 8
    return-void
.end method
