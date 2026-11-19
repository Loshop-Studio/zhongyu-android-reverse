.class public final synthetic Ls7/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

.field public final synthetic b:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls7/v;->a:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    iput-object p2, p0, Ls7/v;->b:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ls7/v;->a:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    iget-object v1, p0, Ls7/v;->b:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    invoke-static {v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method
