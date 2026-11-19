.class public final synthetic Lcom/zykj/view/board/evaluation/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/board/evaluation/c;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/c;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    invoke-static {v0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->n(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
