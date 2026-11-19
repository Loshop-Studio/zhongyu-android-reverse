.class public abstract Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/constraintlayout/widget/Guideline;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/Guideline;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->a:Landroidx/constraintlayout/widget/Guideline;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->b:Landroid/widget/TextView;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->c:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->d:Landroid/widget/TextView;

    .line 11
    .line 12
    return-void
.end method

.method public static a(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->b(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static b(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;
    .locals 3

    .line 1
    sget v0, Lcom/zykj/view/R$layout;->view_dialog_common_tip:I

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
    check-cast p0, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 10
    .line 11
    return-object p0
.end method
