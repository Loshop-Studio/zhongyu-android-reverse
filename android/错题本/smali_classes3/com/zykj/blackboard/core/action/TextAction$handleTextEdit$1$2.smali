.class final Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


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
        "Lr6/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "Ld6/s;",
        "invoke",
        "(Ljava/lang/String;)V",
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
.field final synthetic $textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

.field final synthetic this$0:Lcom/zykj/blackboard/core/action/TextAction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/TextAction;Lcom/zykj/blackboard/core/graph/group/TextGraph;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->invoke(Ljava/lang/String;)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    new-instance v2, Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 5
    invoke-static {v0, p1, v1, v2}, Lcom/zykj/blackboard/core/action/TextAction;->access$calculateRectF(Lcom/zykj/blackboard/core/action/TextAction;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeOriginalRectF(Landroid/graphics/RectF;)V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setContent(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-static {p1, v0}, Lcom/zykj/blackboard/core/action/TextAction;->access$buildSelectedRectF(Lcom/zykj/blackboard/core/action/TextAction;Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 10
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/TextAction;->getSelectedRectF()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/TextAction;->getSelectedRectFMatrix()Landroid/graphics/Matrix;

    move-result-object v2

    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-static {p1}, Lcom/zykj/blackboard/core/action/TextAction;->access$getSelectedRectFPaint$p(Lcom/zykj/blackboard/core/action/TextAction;)Landroid/graphics/Paint;

    move-result-object v3

    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-static {p1}, Lcom/zykj/blackboard/core/action/TextAction;->access$getIconWidth$p(Lcom/zykj/blackboard/core/action/TextAction;)F

    move-result v4

    const/4 v5, 0x0

    invoke-interface/range {v0 .. v5}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->select(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V

    .line 11
    :cond_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->drawGraphInActive(Ljava/util/List;)V

    :cond_2
    return-void
.end method
