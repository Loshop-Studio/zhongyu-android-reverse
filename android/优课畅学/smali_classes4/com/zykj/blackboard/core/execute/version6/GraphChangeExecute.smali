.class public final Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/execute/CommandExecute;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/zykj/blackboard/core/execute/CommandExecute<",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;",
        ">;"
    }
.end annotation


# instance fields
.field private final graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

.field private final sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V
    .locals 1

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphControl"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;J)Lcom/zykj/blackboard/core/execute/PlayThread;
    .locals 0

    const-string p2, "data"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic asyncExecute(Ljava/lang/Object;J)Lcom/zykj/blackboard/core/execute/PlayThread;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1
.end method

.method public execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V
    .locals 8

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 4
    invoke-interface {v1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->v()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "data.paint"

    if-eqz v2, :cond_a

    .line 5
    instance-of v0, v1, Lcom/zykj/blackboard/core/graph/group/IChangeField;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasOutRect()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    move-object v0, v1

    check-cast v0, Lcom/zykj/blackboard/core/graph/group/IChangeField;

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->w()Lcom/zykj/board/EzyRectF$RectF;

    move-result-object v2

    const-string v4, "data.outRect"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertRectF(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/zykj/blackboard/core/graph/group/IChangeField;->changeOriginalRectF(Landroid/graphics/RectF;)V

    .line 7
    :cond_1
    instance-of v0, v1, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getContent()Ljava/lang/String;

    move-result-object v0

    const-string v2, "data.content"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 9
    move-object v0, v1

    check-cast v0, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getContent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setContent(Ljava/lang/String;)V

    .line 10
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->B()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 11
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->x()Lcom/zykj/board/EzyPaint$Paint;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertPaint(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setPaint(Landroid/graphics/Paint;)V

    goto/16 :goto_1

    .line 12
    :cond_3
    instance-of v0, v1, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;

    if-eqz v0, :cond_6

    .line 13
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->z()Ljava/util/List;

    move-result-object v0

    const-string v2, "data.pointsList"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 14
    move-object v0, v1

    check-cast v0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->z()Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    new-instance v2, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v4, v5}, Li7/w;->x(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 17
    check-cast v5, Lcom/zykj/board/EzyPointF$PointF;

    .line 18
    const-string v6, "it"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertPointF(Lcom/zykj/board/EzyPointF$PointF;)Landroid/graphics/PointF;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->setPointList(Ljava/util/List;)V

    .line 19
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->B()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 20
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->x()Lcom/zykj/board/EzyPaint$Paint;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertPaint(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->setPaint(Landroid/graphics/Paint;)V

    goto :goto_1

    .line 21
    :cond_6
    instance-of v0, v1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    if-eqz v0, :cond_9

    .line 22
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->C()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 23
    move-object v0, v1

    check-cast v0, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->A()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v2

    const-string v3, "data.renderMatrix"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeRenderMatrix(Landroid/graphics/Matrix;)V

    .line 24
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->t()Ljava/lang/String;

    move-result-object v0

    const-string v2, "data.filePath"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 25
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    invoke-interface {v0}, Lcom/zykj/blackboard/core/loader/SourceLoader;->path()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 26
    sget-object v2, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    sget-object v3, Lcom/zykj/blackboard/enums/DocumentType;->IMAGE:Lcom/zykj/blackboard/enums/DocumentType;

    invoke-virtual {v2, v0, v3}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;->getResPath(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    goto/16 :goto_3

    .line 27
    :cond_8
    new-instance v2, Ljava/io/File;

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->t()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    .line 28
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    const-string v0, "absolutePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lcom/zykj/blackboard/core/graph/group/ImageGraph;->updateFilePath(Ljava/lang/String;)V

    .line 29
    :cond_9
    :goto_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    return-void

    .line 30
    :cond_a
    instance-of v2, v1, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    if-eqz v2, :cond_0

    .line 31
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/Graph;->getChildGraph()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v2

    .line 32
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 33
    invoke-interface {v5}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->v()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    instance-of v5, v5, Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;

    if-eqz v5, :cond_b

    goto :goto_2

    :cond_c
    const/4 v4, 0x0

    .line 34
    :goto_2
    check-cast v4, Lcom/zykj/blackboard/core/graph/IGraph;

    if-eqz v4, :cond_0

    .line 35
    check-cast v4, Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;

    .line 36
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->B()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 37
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->x()Lcom/zykj/board/EzyPaint$Paint;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertPaint(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->x()Lcom/zykj/board/EzyPaint$Paint;

    move-result-object v2

    invoke-virtual {v2}, Lcom/zykj/board/EzyPaint$Paint;->j()F

    move-result v2

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->x()Lcom/zykj/board/EzyPaint$Paint;

    move-result-object p1

    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->k()F

    move-result p1

    invoke-virtual {v4, v0, v2, p1}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->setPaint(Landroid/graphics/Paint;FF)V

    :cond_d
    const/4 p1, 0x1

    .line 38
    invoke-virtual {v1, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeUpdate(Z)V

    .line 39
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    :cond_e
    :goto_3
    return-void
.end method

.method public bridge synthetic execute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V

    return-void
.end method
