.class public final synthetic Lcom/zykj/view/board/evaluation/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

.field public final synthetic b:Z

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/board/evaluation/g;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    iput-boolean p2, p0, Lcom/zykj/view/board/evaluation/g;->b:Z

    iput-boolean p3, p0, Lcom/zykj/view/board/evaluation/g;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/evaluation/g;->b:Z

    iget-boolean v1, p0, Lcom/zykj/view/board/evaluation/g;->c:Z

    iget-object v2, p0, Lcom/zykj/view/board/evaluation/g;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    invoke-static {v2, v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$2;->a(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;ZZ)V

    return-void
.end method
