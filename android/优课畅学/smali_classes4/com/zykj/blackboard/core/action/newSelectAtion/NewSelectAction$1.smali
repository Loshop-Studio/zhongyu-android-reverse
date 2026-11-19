.class final Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;-><init>()V
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
.field final synthetic this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction$1;->invoke()V

    sget-object v0, Lh7/p;->a:Lh7/p;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->access$getSelectGraphList$p(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->access$getSelectGraphMinOutRectFList$p(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->access$getFunctionManager$p(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;)Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->access$getFunctionManager$p(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;)Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "functionManager"

    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;->reset()V

    :cond_2
    return-void
.end method
