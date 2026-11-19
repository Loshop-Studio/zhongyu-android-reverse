.class final Lcom/zykj/blackboard/core/canvas/control/DrawControl$newTextHandleStart$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/canvas/control/DrawControl;->newTextHandleStart(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "childGraph",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "invoke",
        "(Lcom/zykj/blackboard/core/graph/IGraph;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $textGraph:Lcom/zykj/blackboard/core/graph/IGraph;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl$newTextHandleStart$1$1$1;->$textGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/zykj/blackboard/core/graph/IGraph;)Ljava/lang/Boolean;
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "childGraph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl$newTextHandleStart$1$1$1;->$textGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/graph/IGraph;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl$newTextHandleStart$1$1$1;->invoke(Lcom/zykj/blackboard/core/graph/IGraph;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
