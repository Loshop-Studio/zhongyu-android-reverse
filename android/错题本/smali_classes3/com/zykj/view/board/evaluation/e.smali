.class public final synthetic Lcom/zykj/view/board/evaluation/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/view/board/evaluation/e;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/evaluation/e;->b:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/evaluation/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/evaluation/e;->b:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->z(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/evaluation/e;->b:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->k(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/e;->b:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->G(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/e;->b:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->C(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/Throwable;)Ld6/s;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
