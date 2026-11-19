.class public abstract Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final c:Lcom/friday/lecture/databinding/LayoutBeforeStopAnswerBinding;

.field public final d:Landroid/widget/ImageView;

.field public final e:Lcom/friday/lecture/databinding/LayoutConfirmEndClassBinding;

.field public final f:Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBinding;

.field public final g:Landroid/view/View;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/friday/lecture/databinding/LayoutBeforeStopAnswerBinding;Landroid/widget/ImageView;Lcom/friday/lecture/databinding/LayoutConfirmEndClassBinding;Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBinding;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;->c:Lcom/friday/lecture/databinding/LayoutBeforeStopAnswerBinding;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;->d:Landroid/widget/ImageView;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;->e:Lcom/friday/lecture/databinding/LayoutConfirmEndClassBinding;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;->f:Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBinding;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;->g:Landroid/view/View;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Landroid/view/View;)Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;->c(Landroid/view/View;Ljava/lang/Object;)Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static c(Landroid/view/View;Ljava/lang/Object;)Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;
    .locals 1

    .line 1
    sget v0, Lcom/friday/lecture/R$layout;->window_view_objective_answer:I

    .line 2
    .line 3
    invoke-static {p1, p0, v0}, Landroidx/databinding/ViewDataBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/friday/lecture/databinding/WindowViewObjectiveAnswerBinding;

    .line 8
    .line 9
    return-object p0
.end method
