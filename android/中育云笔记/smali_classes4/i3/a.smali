.class public final synthetic Li3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

.field public final synthetic d:Landroid/widget/TextView;

.field public final synthetic e:Landroid/widget/TextView;

.field public final synthetic f:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/a;->c:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    iput-object p2, p0, Li3/a;->d:Landroid/widget/TextView;

    iput-object p3, p0, Li3/a;->e:Landroid/widget/TextView;

    iput-object p4, p0, Li3/a;->f:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Li3/a;->c:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    iget-object v1, p0, Li3/a;->d:Landroid/widget/TextView;

    iget-object v2, p0, Li3/a;->e:Landroid/widget/TextView;

    iget-object v3, p0, Li3/a;->f:Landroid/view/View;

    check-cast p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->d(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;)V

    return-void
.end method
