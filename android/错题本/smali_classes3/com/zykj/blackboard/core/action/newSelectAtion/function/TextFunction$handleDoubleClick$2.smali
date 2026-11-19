.class final Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->handleDoubleClick(FF)Z
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

.field final synthetic this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Lcom/zykj/blackboard/core/graph/group/TextGraph;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->invoke(Ljava/lang/String;)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getContent()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 6
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    move-result-object v3

    .line 7
    invoke-interface {p1, v0, v1, v2, v3}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->changeTextGraph(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V

    .line 8
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-static {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->access$updateSelectedRectF(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;)V

    .line 9
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF$default(Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;ZILjava/lang/Object;)V

    .line 10
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 12
    sget-object v2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->TEXT_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 13
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    move-result-object v3

    .line 14
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getContent()Ljava/lang/String;

    move-result-object v4

    const/16 v9, 0xf0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 15
    invoke-static/range {v0 .. v10}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 16
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    return-void
.end method
