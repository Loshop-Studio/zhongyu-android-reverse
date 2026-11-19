.class public final synthetic Li3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/r;->c:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li3/r;->c:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;

    check-cast p1, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    invoke-static {v0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->h(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;)V

    return-void
.end method
