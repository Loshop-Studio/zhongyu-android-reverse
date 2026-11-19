.class final Lcom/zykj/blackboard/core/canvas/control/DrawControl$textHandleStart$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/canvas/control/DrawControl;->textHandleStart(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/l;"
    }
.end annotation


# instance fields
.field final synthetic $graph:Lcom/zykj/blackboard/core/graph/group/TextGraph;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl$textHandleStart$1$1$1;->$graph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/zykj/blackboard/core/graph/IGraph;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "childGraph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl$textHandleStart$1$1$1;->$graph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/graph/IGraph;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl$textHandleStart$1$1$1;->invoke(Lcom/zykj/blackboard/core/graph/IGraph;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
