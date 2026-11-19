.class public final synthetic Li3/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/u;->a:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li3/u;->a:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;

    invoke-static {v0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->l(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Landroid/animation/ValueAnimator;)V

    return-void
.end method
