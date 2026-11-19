.class public final synthetic Lm6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm6/w;->a:Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm6/w;->a:Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lm6/d0;->g(Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
