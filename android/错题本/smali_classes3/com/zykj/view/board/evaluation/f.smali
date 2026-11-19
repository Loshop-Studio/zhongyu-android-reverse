.class public final synthetic Lcom/zykj/view/board/evaluation/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

.field public final synthetic b:Landroid/widget/RadioGroup;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/RadioGroup;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/board/evaluation/f;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    iput-object p2, p0, Lcom/zykj/view/board/evaluation/f;->b:Landroid/widget/RadioGroup;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/f;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    iget-object v1, p0, Lcom/zykj/view/board/evaluation/f;->b:Landroid/widget/RadioGroup;

    invoke-static {v0, v1, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;I)V

    return-void
.end method
