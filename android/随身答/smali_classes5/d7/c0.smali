.class public final synthetic Ld7/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/c0;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ld7/c0;->b:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ld7/c0;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld7/c0;->b:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;->e(Lkotlin/jvm/functions/Function1;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
