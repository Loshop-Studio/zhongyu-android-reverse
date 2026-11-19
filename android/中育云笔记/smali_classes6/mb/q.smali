.class public final synthetic Lmb/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

.field public final synthetic d:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmb/q;->c:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    iput-object p2, p0, Lmb/q;->d:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lmb/q;->c:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    iget-object v1, p0, Lmb/q;->d:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    invoke-static {v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->w(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method
