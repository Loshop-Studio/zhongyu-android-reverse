.class public final synthetic Ls7/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls7/r;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ls7/r;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->E(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
