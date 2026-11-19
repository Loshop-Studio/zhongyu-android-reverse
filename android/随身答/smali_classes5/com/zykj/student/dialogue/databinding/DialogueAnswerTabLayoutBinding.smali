.class public abstract Lcom/zykj/student/dialogue/databinding/DialogueAnswerTabLayoutBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/appcompat/widget/AppCompatTextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/appcompat/widget/AppCompatTextView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/zykj/student/dialogue/databinding/DialogueAnswerTabLayoutBinding;->a:Landroidx/appcompat/widget/AppCompatTextView;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Landroid/view/LayoutInflater;)Lcom/zykj/student/dialogue/databinding/DialogueAnswerTabLayoutBinding;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lcom/zykj/student/dialogue/databinding/DialogueAnswerTabLayoutBinding;->c(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/student/dialogue/databinding/DialogueAnswerTabLayoutBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static c(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/student/dialogue/databinding/DialogueAnswerTabLayoutBinding;
    .locals 3

    .line 1
    sget v0, Lcom/zykj/student/dialogue/R$layout;->dialogue_answer_tab_layout:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/zykj/student/dialogue/databinding/DialogueAnswerTabLayoutBinding;

    .line 10
    .line 11
    return-object p0
.end method
