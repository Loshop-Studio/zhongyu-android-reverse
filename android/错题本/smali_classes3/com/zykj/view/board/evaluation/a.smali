.class public final synthetic Lcom/zykj/view/board/evaluation/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

.field public final synthetic c:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/view/board/evaluation/a;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/evaluation/a;->b:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    iput-object p2, p0, Lcom/zykj/view/board/evaluation/a;->c:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/board/evaluation/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/evaluation/a;->b:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    iget-object v1, p0, Lcom/zykj/view/board/evaluation/a;->c:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    invoke-static {v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/a;->b:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    iget-object v1, p0, Lcom/zykj/view/board/evaluation/a;->c:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    invoke-static {v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->t(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
