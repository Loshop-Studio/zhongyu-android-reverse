.class public final synthetic Lm6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

.field public final synthetic b:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm6/m;->a:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    iput-object p2, p0, Lm6/m;->b:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lm6/m;->a:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    iget-object v1, p0, Lm6/m;->b:Landroidx/compose/runtime/MutableState;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, v1, p1}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;->g(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;Landroidx/compose/runtime/MutableState;Ljava/lang/Boolean;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
