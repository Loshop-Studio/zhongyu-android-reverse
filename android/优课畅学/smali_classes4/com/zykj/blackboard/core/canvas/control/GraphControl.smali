.class public final Lcom/zykj/blackboard/core/canvas/control/GraphControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/canvas/control/IGraphControl;


# instance fields
.field private final boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

.field private defaultBackgroundColor:I

.field private final defaultBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

.field private deleteCallback:Lx7/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/l;"
        }
    .end annotation
.end field

.field private drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

.field private iconWidth:F

.field private isDraw:Z

.field private isSelectAction:Z

.field private matrix:Landroid/graphics/Matrix;

.field private final matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

.field private final newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

.field private paint:Landroid/graphics/Paint;

.field private final renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

.field private rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

.field private selectedRectF:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/bean/BoardConfig;)V
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
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 24
    .line 25
    new-instance v0, Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 26
    .line 27
    invoke-direct {v0, p3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;-><init>(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 31
    .line 32
    new-instance p3, Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 38
    .line 39
    const/4 p3, 0x1

    .line 40
    iput-boolean p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 41
    .line 42
    iput-boolean p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

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
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 57
    .line 58
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getRenderRect()Landroid/graphics/Rect;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-virtual {p1, p3}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->setVisibleRectF(Landroid/graphics/Rect;)V

    .line 63
    .line 64
    .line 65
    iget-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 66
    .line 67
    invoke-virtual {p3, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->setMatrixAdapter(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->setRenderLayer(Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V

    .line 73
    .line 74
    .line 75
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

    .line 76
    .line 77
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 78
    .line 79
    invoke-direct {p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;-><init>(Lcom/zykj/blackboard/core/canvas/control/DrawControl;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

    .line 83
    .line 84
    return-void
.end method

.method private final resetBackground()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundColor:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundColor(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public addGraph(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V
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
    invoke-interface {p2}, Lcom/zykj/blackboard/core/graph/IGraph;->graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

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
    invoke-interface {p2}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

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
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    invoke-static {p1}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

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
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/graph/IGraph;->findById(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/graph/Graph;->addGraph(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 77
    .line 78
    .line 79
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 80
    .line 81
    if-nez p1, :cond_2

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->add(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    :goto_0
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 91
    .line 92
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

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
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 98
    .line 99
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->add(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public addImageGraph(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V
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
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

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
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/graph/IGraphChange;->addImageGraph(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public cameraChangeEnd(Landroid/graphics/Matrix;)V
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
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->cameraMatrixConcat(Landroid/graphics/Matrix;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraChangeEnd(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    return-void
.end method

.method public cameraChangeStart()V
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
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraChangeStart(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public cameraChanging(Landroid/graphics/Matrix;)V
    .locals 3

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 16
    .line 17
    new-instance v1, Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

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
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraChanging(Landroid/graphics/Matrix;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void
.end method

.method public changeImageGraph(Ljava/lang/String;Landroid/graphics/RectF;Landroid/graphics/Matrix;Ljava/lang/String;)V
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
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 70
    .line 71
    invoke-interface {v1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_0

    .line 80
    .line 81
    instance-of v2, v1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 82
    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 86
    .line 87
    invoke-virtual {v1, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeOriginalRectF(Landroid/graphics/RectF;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, p3}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeRenderMatrix(Landroid/graphics/Matrix;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, p4}, Lcom/zykj/blackboard/core/graph/group/ImageGraph;->updateFilePath(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_0

    .line 101
    .line 102
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 103
    .line 104
    new-instance v2, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 110
    .line 111
    if-eqz v3, :cond_1

    .line 112
    .line 113
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :cond_1
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawGraphInFix(Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_2
    return-void
.end method

.method public changeTextGraph(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V
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
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 70
    .line 71
    invoke-interface {v1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_0

    .line 80
    .line 81
    instance-of v2, v1, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 82
    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 86
    .line 87
    invoke-virtual {v1, p2}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setContent(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, p3}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setPaint(Landroid/graphics/Paint;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, p4}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeOriginalRectF(Landroid/graphics/RectF;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_0

    .line 101
    .line 102
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 103
    .line 104
    new-instance v2, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 110
    .line 111
    if-eqz v3, :cond_1

    .line 112
    .line 113
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :cond_1
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawGraphInFix(Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 120
    .line 121
    if-eqz v1, :cond_0

    .line 122
    .line 123
    iget-boolean v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 124
    .line 125
    if-eqz v2, :cond_2

    .line 126
    .line 127
    sget-object v2, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 128
    .line 129
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 130
    .line 131
    iget v4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 132
    .line 133
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    goto :goto_1

    .line 138
    :cond_2
    sget-object v2, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 139
    .line 140
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 141
    .line 142
    iget v4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 143
    .line 144
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    :goto_1
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 149
    .line 150
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->selectCancel()V

    .line 151
    .line 152
    .line 153
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 154
    .line 155
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 156
    .line 157
    invoke-virtual {v2, v1, v3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->select(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_3
    return-void
.end method

.method public concatMatrix(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Matrix;)V
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
    invoke-interface {p1, p2}, Lcom/zykj/blackboard/core/graph/IGraphChange;->concatMatrix(Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public contentThumbnail()Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->contentThumbnail(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;

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

.method public delete(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

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
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

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
    new-instance v2, Ljava/util/ArrayList;

    .line 41
    .line 42
    const/16 v3, 0xa

    .line 43
    .line 44
    invoke-static {p1, v3}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 66
    .line 67
    invoke-interface {v4}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {v1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/graph/IGraph;->deleteGraphList(Ljava/util/List;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_4

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 107
    .line 108
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->deleteCallback:Lx7/l;

    .line 109
    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    invoke-interface {v2, v1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 117
    .line 118
    if-nez p1, :cond_5

    .line 119
    .line 120
    :goto_2
    return-void

    .line 121
    :cond_5
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->delete(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public drawGraphInActive(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawGraphInActive(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getBackgroundColor()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getDefaultBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundColor:I

    .line 2
    .line 3
    return v0
.end method

.method public getDefaultBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDeleteCallback()Lx7/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->deleteCallback:Lx7/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public getImageGraphCount()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 27
    .line 28
    instance-of v2, v2, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return v1
.end method

.method public getOldPageRectF()Landroid/graphics/RectF;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getOldPageRectF()Landroid/graphics/RectF;

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

.method public getPageRectF()Landroid/graphics/RectF;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getRenderRect()Landroid/graphics/Rect;

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

.method public getRenderRectF()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getRenderRectF()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public init(Lcom/zykj/blackboard/core/graph/IGraph;)V
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
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

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
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, Ljava/util/ArrayList;

    .line 33
    .line 34
    const/16 v3, 0xa

    .line 35
    .line 36
    invoke-static {v1, v3}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 58
    .line 59
    invoke-interface {v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 82
    .line 83
    return-void
.end method

.method public isDraw(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    return-void
.end method

.method public isDraw()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    return v0
.end method

.method public minScreenShot(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;
    .locals 10

    .line 1
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 6
    .line 7
    move v2, p1

    .line 8
    move v3, p2

    .line 9
    move v4, p3

    .line 10
    move v5, p4

    .line 11
    move v6, p5

    .line 12
    move/from16 v7, p6

    .line 13
    .line 14
    move/from16 v8, p7

    .line 15
    .line 16
    move-object/from16 v9, p8

    .line 17
    .line 18
    invoke-virtual/range {v0 .. v9}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getMinScreenShot(Lcom/zykj/blackboard/core/graph/IGraph;IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return-object p1
.end method

.method public newChangeHandleEnd(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

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
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

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
    invoke-virtual/range {v1 .. v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;->newChangeHandleEnd(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public newChangeHandleStart(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/group/GroupGraph;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

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
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

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
    invoke-virtual/range {v1 .. v9}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;->newChangeHandleStart(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public newChangeHandling(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/group/GroupGraph;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

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
    invoke-virtual/range {v1 .. v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;->newChangeHandling(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method public newSelect(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

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
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

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
    invoke-virtual/range {v1 .. v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;->drawNewSelectRectF(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public newSelecting(FFFF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->newSelectGraphControl:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;->drawNewSelectRectF(FFFF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public declared-synchronized reDrawFixView()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z
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
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

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
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 39
    .line 40
    new-instance v1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

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
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->drawGraphInFix(Ljava/util/List;)V
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

.method public refresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->refresh()Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public registerRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->registerRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public release()V
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
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->onDestroy()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->release()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public renderRectF(Landroid/graphics/RectF;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

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
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->renderRectFInFix(Landroid/graphics/RectF;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public reset()V
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
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->resetBackground()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->onDestroy()V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->reset()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public resetCamera()V
    .locals 2

    .line 1
    const-string v0, "GraphControl:resetCamera"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->resetCamera()V

    .line 17
    .line 18
    .line 19
    iget-boolean v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->cameraChangeEnd(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    return-object v0
.end method

.method public rootGraphId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

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

.method public screenshot()Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->screenshot(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;

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

.method public select(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V
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
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 19
    .line 20
    iput p4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 25
    .line 26
    .line 27
    iput-boolean p5, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    if-eqz p5, :cond_1

    .line 34
    .line 35
    sget-object p5, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 36
    .line 37
    invoke-virtual {p5, p1, p2, p4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    sget-object p5, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 43
    .line 44
    invoke-virtual {p5, p1, p2, p4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_0
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 49
    .line 50
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->selectCancel()V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 54
    .line 55
    invoke-virtual {p2, p1, p3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->select(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_1
    return-void
.end method

.method public selectCancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

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
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->selectCancel()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setDefaultBackgroundColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundColor:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->setBackgroundColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setDefaultBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 2

    .line 1
    const-string v0, "backgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->defaultBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineType()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineType(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineColor()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineColor(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineSpace()F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineSpace(F)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->setBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final setDeleteCallback(Lx7/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->deleteCallback:Lx7/l;

    .line 2
    .line 3
    return-void
.end method

.method public setGraphMatrix(Ljava/lang/String;Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    const-string v0, "graphId"

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "GraphControl:setGraphMatrix -> graphId:"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/graph/IGraph;->findById(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/graph/Graph;->initMatrix(Landroid/graphics/Matrix;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public setOldPageRectF(Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->getOldPageRectF()Landroid/graphics/RectF;

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

.method public snapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

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

.method public textHandle(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

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
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-virtual {v0, p3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 18
    .line 19
    .line 20
    iget-boolean p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 21
    .line 22
    if-eqz p3, :cond_1

    .line 23
    .line 24
    sget-object p3, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 27
    .line 28
    iget v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 29
    .line 30
    invoke-virtual {p3, p2, v0, v1}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    sget-object p3, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 38
    .line 39
    iget v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 40
    .line 41
    invoke-virtual {p3, p2, v0, v1}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

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
    iget-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 48
    .line 49
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 50
    .line 51
    invoke-virtual {p3, p1, p2, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->textHandle(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public textHandleEnd(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
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
    invoke-static {p1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 21
    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-virtual {v0, p3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 31
    .line 32
    .line 33
    iget-boolean p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 34
    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    sget-object p3, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 40
    .line 41
    iget v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 42
    .line 43
    invoke-virtual {p3, p2, v0, v1}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    sget-object p3, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 51
    .line 52
    iget v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 53
    .line 54
    invoke-virtual {p3, p2, v0, v1}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

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
    iget-object p3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 61
    .line 62
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-virtual {p3, p1, p2, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->textHandleEnd(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_1
    return-void
.end method

.method public textHandleStart(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V
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
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iget-boolean v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    sget-object v2, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 33
    .line 34
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 35
    .line 36
    iget v4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 37
    .line 38
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget-object v2, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 44
    .line 45
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 46
    .line 47
    iget v4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 48
    .line 49
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

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
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 56
    .line 57
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 58
    .line 59
    invoke-virtual {v2, v0, p1, v1, v3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->textHandleStart(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    return-void
.end method

.method public translation(Ljava/util/List;Landroid/graphics/Matrix;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;",
            "Landroid/graphics/Matrix;",
            ")V"
        }
    .end annotation

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
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

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
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 40
    .line 41
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->transGraph(Landroid/graphics/Matrix;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public translationEnd(Ljava/util/List;Landroid/graphics/Matrix;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;",
            "Landroid/graphics/Matrix;",
            ")V"
        }
    .end annotation

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
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v2, 0xa

    .line 27
    .line 28
    invoke-static {p1, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 50
    .line 51
    invoke-interface {v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 88
    .line 89
    new-instance v1, Landroid/graphics/Matrix;

    .line 90
    .line 91
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 92
    .line 93
    .line 94
    if-eqz p2, :cond_1

    .line 95
    .line 96
    invoke-virtual {v1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 97
    .line 98
    .line 99
    :cond_1
    sget-object v2, Lh7/p;->a:Lh7/p;

    .line 100
    .line 101
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->concatMatrix(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Matrix;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 106
    .line 107
    if-nez p1, :cond_3

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 111
    .line 112
    if-eqz p1, :cond_5

    .line 113
    .line 114
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 115
    .line 116
    new-instance v0, Landroid/graphics/Matrix;

    .line 117
    .line 118
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 119
    .line 120
    .line 121
    if-eqz p2, :cond_4

    .line 122
    .line 123
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-static {v1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 137
    .line 138
    .line 139
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 140
    .line 141
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 146
    .line 147
    .line 148
    :cond_4
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 149
    .line 150
    .line 151
    :cond_5
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 152
    .line 153
    if-eqz p1, :cond_8

    .line 154
    .line 155
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 156
    .line 157
    if-eqz p2, :cond_7

    .line 158
    .line 159
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 160
    .line 161
    if-eqz v0, :cond_6

    .line 162
    .line 163
    sget-object v0, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 164
    .line 165
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 166
    .line 167
    iget v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 168
    .line 169
    invoke-virtual {v0, p2, v1, v2}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    goto :goto_2

    .line 174
    :cond_6
    sget-object v0, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 175
    .line 176
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 177
    .line 178
    iget v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 179
    .line 180
    invoke-virtual {v0, p2, v1, v2}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    goto :goto_2

    .line 185
    :cond_7
    const/4 p2, 0x0

    .line 186
    :goto_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 187
    .line 188
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 189
    .line 190
    invoke-virtual {v0, p1, p2, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->transGraphEnd(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 191
    .line 192
    .line 193
    :cond_8
    :goto_3
    return-void
.end method

.method public translationStart(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

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
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-static {p1, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

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
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 42
    .line 43
    invoke-interface {v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw:Z

    .line 66
    .line 67
    if-nez v0, :cond_1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->selectedRectF:Landroid/graphics/RectF;

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    iget-boolean v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isSelectAction:Z

    .line 79
    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    sget-object v2, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 83
    .line 84
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 85
    .line 86
    iget v4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 87
    .line 88
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    sget-object v2, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    .line 94
    .line 95
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrix:Landroid/graphics/Matrix;

    .line 96
    .line 97
    iget v4, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->iconWidth:F

    .line 98
    .line 99
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/utils/RectBoardUtils;->getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    const/4 v1, 0x0

    .line 105
    :goto_1
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 106
    .line 107
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->paint:Landroid/graphics/Paint;

    .line 108
    .line 109
    invoke-virtual {v2, v0, p1, v1, v3}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->transGraphStart(Lcom/zykj/blackboard/core/graph/IGraph;Ljava/util/List;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    :goto_2
    return-void
.end method

.method public unRegisterRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->unRegisterRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public updateBackgroundColor(I)V
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
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->setBackgroundColor(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public updateBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 1

    .line 1
    const-string v0, "backgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->setBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public updateBackgroundMatrix()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->drawControl:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->updateBackgroundMatrix(Landroid/graphics/Matrix;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
