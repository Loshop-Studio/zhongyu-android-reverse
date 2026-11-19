# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public abstract Lcom/zykj/blackboard/core/graph/Graph;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/graph/IGraph;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00042\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJE\u0010#\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010\'\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\'\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008(\u0010)J)\u0010.\u001a\u0004\u0018\u00010\u00012\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*H\u0016\u00a2\u0006\u0004\u0008.\u0010/J5\u00102\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u000100H\u0016\u00a2\u0006\u0004\u00082\u00103J%\u00105\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u00042\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u000100H\u0016\u00a2\u0006\u0004\u00085\u00106J\'\u00107\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*H\u0016\u00a2\u0006\u0004\u00087\u00108J\'\u00109\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*H\u0016\u00a2\u0006\u0004\u00089\u00108J\u001d\u0010;\u001a\u00020\r2\u000c\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u000100H\u0016\u00a2\u0006\u0004\u0008;\u0010<J\u0017\u0010=\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\u0008=\u0010\u000fJ\u0017\u0010?\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020>H\u0016\u00a2\u0006\u0004\u0008?\u0010@J\u0017\u0010A\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\u0008A\u0010\u000fJ\u0015\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u00010BH\u0016\u00a2\u0006\u0004\u0008C\u0010DJ\u000f\u0010E\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008E\u0010\u001aJ\u000f\u0010G\u001a\u00020FH\u0016\u00a2\u0006\u0004\u0008G\u0010HJ\u000f\u0010J\u001a\u00020IH\u0016\u00a2\u0006\u0004\u0008J\u0010KJ\u000f\u0010L\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008L\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u001e\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010B8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u0014\u0010S\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0014\u0010U\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010N\u00a8\u0006V"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/graph/Graph;",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "",
        "id",
        "Landroid/graphics/RectF;",
        "originalRectF",
        "<init>",
        "(Ljava/lang/String;Landroid/graphics/RectF;)V",
        "getId",
        "()Ljava/lang/String;",
        "getParent",
        "()Lcom/zykj/blackboard/core/graph/IGraph;",
        "graph",
        "Ld6/s;",
        "setParent",
        "(Lcom/zykj/blackboard/core/graph/IGraph;)V",
        "getOriginalRectF",
        "()Landroid/graphics/RectF;",
        "getRenderRectF",
        "Landroid/graphics/Matrix;",
        "getRenderMatrix",
        "()Landroid/graphics/Matrix;",
        "adapterMatrix",
        "getMinOutRectF",
        "(Landroid/graphics/Matrix;)Landroid/graphics/RectF;",
        "updateRenderRectF",
        "()V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "matrix",
        "Lkotlin/Function1;",
        "",
        "interceptRendVoid",
        "isScreenCanvas",
        "isComplete",
        "onDraw",
        "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;ZZ)V",
        "concatMatrix",
        "(Landroid/graphics/Matrix;)V",
        "initMatrix",
        "findById",
        "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;",
        "",
        "x",
        "y",
        "offset",
        "findByPoint",
        "(FFF)Lcom/zykj/blackboard/core/graph/IGraph;",
        "",
        "list",
        "findGraphListByPoint",
        "(FFFLjava/util/List;)Z",
        "rectF",
        "findByRectF",
        "(Landroid/graphics/RectF;Ljava/util/List;)Z",
        "isInRect",
        "(FFF)Z",
        "isCollide",
        "graphList",
        "deleteGraphList",
        "(Ljava/util/List;)V",
        "addGraph",
        "Lcom/zykj/blackboard/core/graph/group/ImageGraph;",
        "addImageGraph",
        "(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V",
        "removeGraph",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "getChildGraph",
        "()Ljava/util/concurrent/CopyOnWriteArrayList;",
        "onDestroy",
        "Lcom/zykj/board/d0;",
        "getSnapshot",
        "()Lcom/zykj/board/d0;",
        "Lcom/zykj/board/q;",
        "getGraphData",
        "()Lcom/zykj/board/q;",
        "toString",
        "Ljava/lang/String;",
        "Landroid/graphics/RectF;",
        "parentGraph",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "childGraph",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "renderMatrix",
        "Landroid/graphics/Matrix;",
        "renderRectF",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final originalRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private parentGraph:Lcom/zykj/blackboard/core/graph/IGraph;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final renderMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final renderRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "originalRectF"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/Graph;->id:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/blackboard/core/graph/Graph;->originalRectF:Landroid/graphics/RectF;

    .line 17
    .line 18
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/Matrix;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/Graph;->renderMatrix:Landroid/graphics/Matrix;

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/RectF;

    .line 33
    .line 34
    invoke-direct {p1, p2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/Graph;->renderRectF:Landroid/graphics/RectF;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public addGraph(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-interface {p1, p0}, Lcom/zykj/blackboard/core/graph/IGraph;->setParent(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public addImageGraph(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V
    .locals 4
    .param p1    # Lcom/zykj/blackboard/core/graph/group/ImageGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, -0x1

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 30
    .line 31
    instance-of v2, v2, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v1, v3

    .line 41
    :goto_0
    if-ne v1, v3, :cond_2

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_3
    :goto_1
    invoke-virtual {p1, p0}, Lcom/zykj/blackboard/core/graph/Graph;->setParent(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public concatMatrix(Landroid/graphics/Matrix;)V
    .locals 2
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->renderMatrix:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 30
    .line 31
    invoke-interface {v1, p1}, Lcom/zykj/blackboard/core/graph/IGraphChange;->concatMatrix(Landroid/graphics/Matrix;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->updateRenderRectF()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public deleteGraphList(Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 21
    .line 22
    invoke-interface {v1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/Graph;->id:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/Graph;->parentGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    invoke-interface {p1, p0}, Lcom/zykj/blackboard/core/graph/IGraphChange;->removeGraph(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 61
    .line 62
    invoke-interface {v1, p1}, Lcom/zykj/blackboard/core/graph/IGraph;->deleteGraphList(Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return-void
.end method

.method public findById(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 36
    .line 37
    invoke-interface {v1, p1}, Lcom/zykj/blackboard/core/graph/IGraph;->findById(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    return-object p1
.end method

.method public findByPoint(FFF)Lcom/zykj/blackboard/core/graph/IGraph;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    xor-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sub-int/2addr v0, v1

    .line 23
    :goto_0
    const/4 v1, -0x1

    .line 24
    if-ge v1, v0, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 36
    .line 37
    invoke-interface {v1, p1, p2, p3}, Lcom/zykj/blackboard/core/graph/IGraph;->findByPoint(FFF)Lcom/zykj/blackboard/core/graph/IGraph;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/graph/Graph;->isInRect(FFF)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_2
    const/4 p1, 0x0

    .line 55
    return-object p1
.end method

.method public findByRectF(Landroid/graphics/RectF;Ljava/util/List;)Z
    .locals 7
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    xor-int/2addr v0, v2

    .line 22
    if-ne v0, v2, :cond_4

    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v0, v1

    .line 34
    :goto_0
    add-int/lit8 v3, v0, -0x1

    .line 35
    .line 36
    move v5, v1

    .line 37
    move v4, v3

    .line 38
    :goto_1
    const/4 v6, -0x1

    .line 39
    if-ge v6, v4, :cond_2

    .line 40
    .line 41
    iget-object v6, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 42
    .line 43
    if-eqz v6, :cond_1

    .line 44
    .line 45
    invoke-virtual {v6, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 50
    .line 51
    if-eqz v6, :cond_1

    .line 52
    .line 53
    invoke-interface {v6, p1, p2}, Lcom/zykj/blackboard/core/graph/IGraph;->findByRectF(Landroid/graphics/RectF;Ljava/util/List;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-ne v6, v2, :cond_1

    .line 58
    .line 59
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    :cond_1
    add-int/lit8 v4, v4, -0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    if-ne v5, v0, :cond_5

    .line 65
    .line 66
    :goto_2
    if-ge v6, v3, :cond_3

    .line 67
    .line 68
    invoke-static {p2}, Lkotlin/collections/u;->u(Ljava/util/List;)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-interface {p2, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    add-int/lit8 v3, v3, -0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    return v2

    .line 82
    :cond_4
    const/4 v0, 0x0

    .line 83
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/graph/Graph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0, p1}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    return v2

    .line 97
    :cond_5
    return v1
.end method

.method public findGraphListByPoint(FFFLjava/util/List;)Z
    .locals 7
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFF",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    if-ne v0, v2, :cond_3

    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/lit8 v3, v0, -0x1

    .line 29
    .line 30
    move v5, v1

    .line 31
    move v4, v3

    .line 32
    :goto_0
    const/4 v6, -0x1

    .line 33
    if-ge v6, v4, :cond_1

    .line 34
    .line 35
    iget-object v6, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 36
    .line 37
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 45
    .line 46
    invoke-interface {v6, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/graph/IGraph;->findGraphListByPoint(FFFLjava/util/List;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_0

    .line 51
    .line 52
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    :cond_0
    add-int/lit8 v4, v4, -0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    if-ne v5, v0, :cond_4

    .line 58
    .line 59
    :goto_1
    if-ge v6, v3, :cond_2

    .line 60
    .line 61
    invoke-static {p4}, Lkotlin/collections/u;->u(Ljava/util/List;)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-interface {p4, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    add-int/lit8 v3, v3, -0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-interface {p4, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    return v2

    .line 75
    :cond_3
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/graph/Graph;->isInRect(FFF)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    invoke-interface {p4, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    return v2

    .line 85
    :cond_4
    return v1
.end method

.method public bridge synthetic getChildGraph()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getChildGraph()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getChildGraph()Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    :cond_0
    return-object v0
.end method

.method public getGraphData()Lcom/zykj/board/q;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->newBuilder()Lcom/zykj/board/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->k(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Lcom/zykj/blackboard/core/graph/IGraph;->graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->j(Lcom/zykj/board/EzyGraphEnum$GraphEnum;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->newBuilder()Lb4/b1;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/Graph;->originalRectF:Landroid/graphics/RectF;

    .line 24
    .line 25
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lb4/b1;->j(F)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/Graph;->originalRectF:Landroid/graphics/RectF;

    .line 31
    .line 32
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lb4/b1;->l(F)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/Graph;->originalRectF:Landroid/graphics/RectF;

    .line 38
    .line 39
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lb4/b1;->k(F)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/Graph;->originalRectF:Landroid/graphics/RectF;

    .line 45
    .line 46
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lb4/b1;->i(F)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lb4/b1;->c()Lcom/zykj/board/EzyRectF$RectF;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->l(Lcom/zykj/board/EzyRectF$RectF;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/Graph;->parentGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    invoke-interface {v1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Lcom/zykj/board/q;->m(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_0
    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;
    .locals 3
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/Graph;->originalRectF:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/Graph;->renderMatrix:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    if-eqz v1, :cond_1

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
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 45
    .line 46
    invoke-interface {v2, p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0, v2}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-object v0
.end method

.method public getOriginalRectF()Landroid/graphics/RectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->originalRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public getParent()Lcom/zykj/blackboard/core/graph/IGraph;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->parentGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRenderMatrix()Landroid/graphics/Matrix;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->renderMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRenderRectF()Landroid/graphics/RectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->renderRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSnapshot()Lcom/zykj/board/d0;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->newBuilder()Lcom/zykj/board/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lcom/zykj/board/d0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    iget v1, v0, Lcom/zykj/board/d0;->a:I

    .line 18
    .line 19
    or-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    iput v1, v0, Lcom/zykj/board/d0;->a:I

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Lcom/zykj/blackboard/core/graph/IGraph;->graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget v2, v0, Lcom/zykj/board/d0;->a:I

    .line 34
    .line 35
    or-int/lit8 v2, v2, 0x2

    .line 36
    .line 37
    iput v2, v0, Lcom/zykj/board/d0;->a:I

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->getNumber()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    iput v1, v0, Lcom/zykj/board/d0;->c:I

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->newBuilder()Lb4/b1;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/Graph;->originalRectF:Landroid/graphics/RectF;

    .line 53
    .line 54
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Lb4/b1;->j(F)V

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/Graph;->originalRectF:Landroid/graphics/RectF;

    .line 60
    .line 61
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Lb4/b1;->l(F)V

    .line 64
    .line 65
    .line 66
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/Graph;->originalRectF:Landroid/graphics/RectF;

    .line 67
    .line 68
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Lb4/b1;->k(F)V

    .line 71
    .line 72
    .line 73
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/Graph;->originalRectF:Landroid/graphics/RectF;

    .line 74
    .line 75
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Lb4/b1;->i(F)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Lb4/b1;->c()Lcom/zykj/board/EzyRectF$RectF;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-object v2, v0, Lcom/zykj/board/d0;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 85
    .line 86
    if-nez v2, :cond_0

    .line 87
    .line 88
    iput-object v1, v0, Lcom/zykj/board/d0;->d:Lcom/zykj/board/EzyRectF$RectF;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    invoke-virtual {v2, v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 92
    .line 93
    .line 94
    :goto_0
    iget v1, v0, Lcom/zykj/board/d0;->a:I

    .line 95
    .line 96
    or-int/lit8 v1, v1, 0x4

    .line 97
    .line 98
    iput v1, v0, Lcom/zykj/board/d0;->a:I

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 101
    .line 102
    .line 103
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/Graph;->renderMatrix:Landroid/graphics/Matrix;

    .line 104
    .line 105
    const-wide/16 v2, 0x0

    .line 106
    .line 107
    invoke-static {v1, v2, v3}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v2, v0, Lcom/zykj/board/d0;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 112
    .line 113
    if-nez v2, :cond_1

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iput-object v1, v0, Lcom/zykj/board/d0;->f:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    invoke-virtual {v2, v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 122
    .line 123
    .line 124
    :goto_1
    iget v1, v0, Lcom/zykj/board/d0;->a:I

    .line 125
    .line 126
    or-int/lit8 v1, v1, 0x8

    .line 127
    .line 128
    iput v1, v0, Lcom/zykj/board/d0;->a:I

    .line 129
    .line 130
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 131
    .line 132
    .line 133
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 134
    .line 135
    if-eqz v1, :cond_3

    .line 136
    .line 137
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_3

    .line 146
    .line 147
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 152
    .line 153
    invoke-interface {v2}, Lcom/zykj/blackboard/core/graph/IGraph;->getSnapshot()Lcom/zykj/board/d0;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    iget-object v3, v0, Lcom/zykj/board/d0;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 158
    .line 159
    if-nez v3, :cond_2

    .line 160
    .line 161
    invoke-virtual {v0}, Lcom/zykj/board/d0;->ensureChildGraphIsMutable()V

    .line 162
    .line 163
    .line 164
    iget-object v3, v0, Lcom/zykj/board/d0;->h:Ljava/util/List;

    .line 165
    .line 166
    invoke-virtual {v2}, Lcom/zykj/board/d0;->c()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_2
    invoke-virtual {v2}, Lcom/zykj/board/d0;->c()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v3, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_3
    return-object v0
.end method

.method public initMatrix(Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->renderMatrix:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->updateRenderRectF()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public isCollide(FFF)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p3, v0

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderRectF()Landroid/graphics/RectF;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sub-float v1, p1, p3

    .line 11
    .line 12
    sub-float v2, p2, p3

    .line 13
    .line 14
    add-float/2addr p1, p3

    .line 15
    add-float/2addr p2, p3

    .line 16
    invoke-virtual {v0, v1, v2, p1, p2}, Landroid/graphics/RectF;->intersects(FFFF)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderRectF()Landroid/graphics/RectF;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-virtual {p3, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method

.method public isInRect(FFF)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p3, v0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/graph/Graph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sub-float v1, p1, p3

    .line 12
    .line 13
    sub-float v2, p2, p3

    .line 14
    .line 15
    add-float/2addr p1, p3

    .line 16
    add-float/2addr p2, p3

    .line 17
    invoke-virtual {v0, v1, v2, p1, p2}, Landroid/graphics/RectF;->intersects(FFFF)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_0
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/graph/Graph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p3, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 20
    .line 21
    invoke-interface {v1}, Lcom/zykj/blackboard/core/graph/IGraph;->onDestroy()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 30
    .line 31
    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->parentGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 36
    .line 37
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;ZZ)V
    .locals 8
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "Lr6/c;",
            "ZZ)V"
        }
    .end annotation

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    invoke-interface {p3, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
    const/4 v1, 0x1

    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-interface {p0, p1, p2}, Lcom/zykj/blackboard/core/graph/IDraw;->render(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    move-object v2, v1

    .line 49
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 50
    .line 51
    move-object v3, p1

    .line 52
    move-object v4, p2

    .line 53
    move-object v5, p3

    .line 54
    move v6, p4

    .line 55
    move v7, p5

    .line 56
    invoke-interface/range {v2 .. v7}, Lcom/zykj/blackboard/core/graph/IDraw;->onDraw(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;ZZ)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    return-void
.end method

.method public removeGraph(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->onDestroy()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setParent(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/Graph;->parentGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/Graph;->id:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, "  type = "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Lcom/zykj/blackboard/core/graph/IGraph;->graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, " outRect = "

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/Graph;->originalRectF:Landroid/graphics/RectF;

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v2, " matrix = "

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/Graph;->renderMatrix:Landroid/graphics/Matrix;

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, " \r\n"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/Graph;->childGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 61
    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 79
    .line 80
    new-instance v4, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v5, "child= "

    .line 83
    .line 84
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v1, "buffer.toString()"

    .line 106
    .line 107
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object v0
.end method

.method public updateRenderRectF()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/Graph;->renderRectF:Landroid/graphics/RectF;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
