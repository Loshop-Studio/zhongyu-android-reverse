.class final Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/TextAction;->handleTextEdit(FFZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/a;"
    }
.end annotation


# instance fields
.field final synthetic $textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

.field final synthetic this$0:Lcom/zykj/blackboard/core/action/TextAction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/graph/group/TextGraph;Lcom/zykj/blackboard/core/action/TextAction;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->invoke()V

    sget-object v0, Lh7/p;->a:Lh7/p;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-static {v1}, Lcom/zykj/blackboard/core/action/TextAction;->access$getTempContent$p(Lcom/zykj/blackboard/core/action/TextAction;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setContent(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/TextAction;->access$selectCancel(Lcom/zykj/blackboard/core/action/TextAction;)V

    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/action/TextAction;->access$setHandingEdit$p(Lcom/zykj/blackboard/core/action/TextAction;Z)V

    return-void
.end method
