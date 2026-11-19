.class public final synthetic Lcom/zykj/student/dialogue/ui/ask/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/a;->a:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/ask/a;->a:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->a(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
