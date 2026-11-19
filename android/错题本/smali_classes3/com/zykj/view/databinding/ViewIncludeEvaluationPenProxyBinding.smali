.class public abstract Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final rbEvalProxyBlack:Lcom/zykj/view/widget/radio/NormalColorRadioButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rbEvalProxyBlue:Lcom/zykj/view/widget/radio/NormalColorRadioButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rbEvalProxyRed:Lcom/zykj/view/widget/radio/NormalColorRadioButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rgPenColorProxy:Landroid/widget/RadioGroup;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/view/widget/radio/NormalColorRadioButton;Lcom/zykj/view/widget/radio/NormalColorRadioButton;Lcom/zykj/view/widget/radio/NormalColorRadioButton;Landroid/widget/RadioGroup;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;->rbEvalProxyBlack:Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;->rbEvalProxyBlue:Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;->rbEvalProxyRed:Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;->rgPenColorProxy:Landroid/widget/RadioGroup;

    .line 11
    .line 12
    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    sget v0, Lcom/zykj/view/R$layout;->view_include_evaluation_pen_proxy:I

    invoke-static {p1, p0, v0}, Landroidx/databinding/ViewDataBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 3
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    sget v0, Lcom/zykj/view/R$layout;->view_include_evaluation_pen_proxy:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;
    .locals 3
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    sget v0, Lcom/zykj/view/R$layout;->view_include_evaluation_pen_proxy:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    return-object p0
.end method
