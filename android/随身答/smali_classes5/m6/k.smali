.class public final synthetic Lm6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

.field public final synthetic c:Landroidx/compose/ui/platform/ComposeView;

.field public final synthetic d:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(ZLcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;Landroidx/compose/ui/platform/ComposeView;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm6/k;->a:Z

    iput-object p2, p0, Lm6/k;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    iput-object p3, p0, Lm6/k;->c:Landroidx/compose/ui/platform/ComposeView;

    iput-object p4, p0, Lm6/k;->d:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lm6/k;->a:Z

    iget-object v1, p0, Lm6/k;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    iget-object v2, p0, Lm6/k;->c:Landroidx/compose/ui/platform/ComposeView;

    iget-object v3, p0, Lm6/k;->d:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;->k(ZLcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;Landroidx/compose/ui/platform/ComposeView;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
