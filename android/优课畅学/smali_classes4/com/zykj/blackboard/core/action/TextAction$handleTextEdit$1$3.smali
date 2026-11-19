.class final Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


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
        "Lx7/l;"
    }
.end annotation


# instance fields
.field final synthetic $isNewGraph:Z

.field final synthetic $pointF:Landroid/graphics/PointF;

.field final synthetic $textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

.field final synthetic this$0:Lcom/zykj/blackboard/core/action/TextAction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/TextAction;ZLcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/PointF;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    iput-boolean p2, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->$isNewGraph:Z

    iput-object p3, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    iput-object p4, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->$pointF:Landroid/graphics/PointF;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->invoke(Ljava/lang/String;)V

    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    iget-boolean v2, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->$isNewGraph:Z

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->$textGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    move-result-object v3

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->$pointF:Landroid/graphics/PointF;

    iget v4, v0, Landroid/graphics/PointF;->x:F

    iget v5, v0, Landroid/graphics/PointF;->y:F

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/action/TextAction;->access$handleTextConfirm(Lcom/zykj/blackboard/core/action/TextAction;ZLandroid/graphics/RectF;FFLjava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->this$0:Lcom/zykj/blackboard/core/action/TextAction;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/zykj/blackboard/core/action/TextAction;->access$setHandingEdit$p(Lcom/zykj/blackboard/core/action/TextAction;Z)V

    return-void
.end method
