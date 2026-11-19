.class public final synthetic Lm6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

.field public final synthetic c:Landroidx/compose/ui/platform/ComposeView;


# direct methods
.method public synthetic constructor <init>(ZLcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;Landroidx/compose/ui/platform/ComposeView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm6/h;->a:Z

    iput-object p2, p0, Lm6/h;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    iput-object p3, p0, Lm6/h;->c:Landroidx/compose/ui/platform/ComposeView;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lm6/h;->a:Z

    iget-object v1, p0, Lm6/h;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    iget-object v2, p0, Lm6/h;->c:Landroidx/compose/ui/platform/ComposeView;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;->m(ZLcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;Landroidx/compose/ui/platform/ComposeView;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
