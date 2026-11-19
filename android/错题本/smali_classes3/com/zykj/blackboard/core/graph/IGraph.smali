.class public interface abstract Lcom/zykj/blackboard/core/graph/IGraph;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/graph/IGraphChange;
.implements Lcom/zykj/blackboard/core/graph/IDraw;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008f\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0000H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0008H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0000H&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0015\u0010\u0011J\u0019\u0010\u0017\u001a\u00020\u000f2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0012H&\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J)\u0010\u001d\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H&\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ5\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001fH&\u00a2\u0006\u0004\u0008\"\u0010#J%\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020\u000f2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001fH&\u00a2\u0006\u0004\u0008%\u0010&J\'\u0010\'\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H&\u00a2\u0006\u0004\u0008\'\u0010(J\'\u0010)\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H&\u00a2\u0006\u0004\u0008)\u0010(J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020\u0003H&\u00a2\u0006\u0004\u0008,\u0010-J\u000f\u0010/\u001a\u00020.H&\u00a2\u0006\u0004\u0008/\u00100J\u000f\u00102\u001a\u000201H&\u00a2\u0006\u0004\u00082\u00103J\u000f\u00104\u001a\u00020+H&\u00a2\u0006\u0004\u00084\u00105J\u000f\u00107\u001a\u000206H&\u00a2\u0006\u0004\u00087\u00108J\u001d\u0010:\u001a\u00020\u000c2\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001fH&\u00a2\u0006\u0004\u0008:\u0010;J\u000f\u0010<\u001a\u00020\u000cH&\u00a2\u0006\u0004\u0008<\u0010=\u00a8\u0006>"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "Lcom/zykj/blackboard/core/graph/IGraphChange;",
        "Lcom/zykj/blackboard/core/graph/IDraw;",
        "",
        "getId",
        "()Ljava/lang/String;",
        "getParent",
        "()Lcom/zykj/blackboard/core/graph/IGraph;",
        "",
        "getChildGraph",
        "()Ljava/util/List;",
        "graph",
        "Ld6/s;",
        "setParent",
        "(Lcom/zykj/blackboard/core/graph/IGraph;)V",
        "Landroid/graphics/RectF;",
        "getOriginalRectF",
        "()Landroid/graphics/RectF;",
        "Landroid/graphics/Matrix;",
        "getRenderMatrix",
        "()Landroid/graphics/Matrix;",
        "getRenderRectF",
        "adapterMatrix",
        "getMinOutRectF",
        "(Landroid/graphics/Matrix;)Landroid/graphics/RectF;",
        "",
        "x",
        "y",
        "offset",
        "findByPoint",
        "(FFF)Lcom/zykj/blackboard/core/graph/IGraph;",
        "",
        "list",
        "",
        "findGraphListByPoint",
        "(FFFLjava/util/List;)Z",
        "rectF",
        "findByRectF",
        "(Landroid/graphics/RectF;Ljava/util/List;)Z",
        "isInRect",
        "(FFF)Z",
        "isCollide",
        "id",
        "Lcom/zykj/blackboard/core/graph/Graph;",
        "findById",
        "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;",
        "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
        "graphType",
        "()Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
        "Lcom/zykj/board/d0;",
        "getSnapshot",
        "()Lcom/zykj/board/d0;",
        "copy",
        "()Lcom/zykj/blackboard/core/graph/Graph;",
        "Lcom/zykj/board/q;",
        "getGraphData",
        "()Lcom/zykj/board/q;",
        "graphList",
        "deleteGraphList",
        "(Ljava/util/List;)V",
        "onDestroy",
        "()V",
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


# virtual methods
.method public abstract copy()Lcom/zykj/blackboard/core/graph/Graph;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract deleteGraphList(Ljava/util/List;)V
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
.end method

.method public abstract findById(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract findByPoint(FFF)Lcom/zykj/blackboard/core/graph/IGraph;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract findByRectF(Landroid/graphics/RectF;Ljava/util/List;)Z
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
.end method

.method public abstract findGraphListByPoint(FFFLjava/util/List;)Z
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
.end method

.method public abstract getChildGraph()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getGraphData()Lcom/zykj/board/q;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getId()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getOriginalRectF()Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getParent()Lcom/zykj/blackboard/core/graph/IGraph;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getRenderMatrix()Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getRenderRectF()Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getSnapshot()Lcom/zykj/board/d0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract isCollide(FFF)Z
.end method

.method public abstract isInRect(FFF)Z
.end method

.method public abstract onDestroy()V
.end method

.method public abstract setParent(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
