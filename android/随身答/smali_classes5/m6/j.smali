.class public final synthetic Lm6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

.field public final synthetic c:Landroidx/compose/ui/platform/ComposeView;


# direct methods
.method public synthetic constructor <init>(ZLcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;Landroidx/compose/ui/platform/ComposeView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm6/j;->a:Z

    iput-object p2, p0, Lm6/j;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    iput-object p3, p0, Lm6/j;->c:Landroidx/compose/ui/platform/ComposeView;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lm6/j;->a:Z

    iget-object v1, p0, Lm6/j;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    iget-object v2, p0, Lm6/j;->c:Landroidx/compose/ui/platform/ComposeView;

    invoke-static {v0, v1, v2}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;->n(ZLcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;Landroidx/compose/ui/platform/ComposeView;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
