.class public final synthetic Lr5/a0;
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

    iput-object p1, p0, Lr5/a0;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    iput-boolean p2, p0, Lr5/a0;->b:Z

    iput-boolean p3, p0, Lr5/a0;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr5/a0;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    iget-boolean v1, p0, Lr5/a0;->b:Z

    iget-boolean v2, p0, Lr5/a0;->c:Z

    invoke-static {v0, v1, v2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;->a(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;ZZ)V

    return-void
.end method
