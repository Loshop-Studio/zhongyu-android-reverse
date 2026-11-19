.class final Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/TextAction;->handleTextConfirm(ZLandroid/graphics/RectF;FFLjava/lang/String;)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "it",
        "Ld6/s;",
        "invoke",
        "(Lcom/zykj/blackboard/core/graph/IGraph;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/blackboard/core/action/TextAction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/TextAction;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/graph/IGraph;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->invoke(Lcom/zykj/blackboard/core/graph/IGraph;)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 2
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->rootGraphId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1, p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->addGraph(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    check-cast p1, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-static {v0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->access$setSelectedGraph$p(Lcom/zykj/blackboard/core/action/TextAction;Lcom/zykj/blackboard/core/graph/group/TextGraph;)V

    .line 4
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/TextAction;->getSelectedGraph()Lcom/zykj/blackboard/core/graph/group/TextGraph;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lcom/zykj/blackboard/core/action/TextAction;->access$selectGraph(Lcom/zykj/blackboard/core/action/TextAction;Lcom/zykj/blackboard/core/graph/group/TextGraph;)V

    .line 5
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    :cond_2
    return-void
.end method
