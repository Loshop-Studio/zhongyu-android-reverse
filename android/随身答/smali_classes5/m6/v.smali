.class public final synthetic Lm6/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;

.field public final synthetic b:Lkotlin/jvm/functions/Function2;

.field public final synthetic c:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm6/v;->a:Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;

    iput-object p2, p0, Lm6/v;->b:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, Lm6/v;->c:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lm6/v;->a:Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;

    iget-object v1, p0, Lm6/v;->b:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Lm6/v;->c:Landroidx/compose/runtime/State;

    invoke-static {v0, v1, v2}, Lm6/d0;->c(Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/State;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
