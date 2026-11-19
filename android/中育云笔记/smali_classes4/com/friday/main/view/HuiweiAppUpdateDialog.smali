.class public final Lcom/friday/main/view/HuiweiAppUpdateDialog;
.super Lcom/friday/main/view/Hilt_HuiweiAppUpdateDialog;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/main/view/Hilt_HuiweiAppUpdateDialog<",
        "Lcom/friday/main/databinding/DialogVersionUpdateBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public k:Lhd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/main/view/Hilt_HuiweiAppUpdateDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r(Lcom/friday/main/view/HuiweiAppUpdateDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HuiweiAppUpdateDialog;->t(Lcom/friday/main/view/HuiweiAppUpdateDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic s(Lcom/friday/main/view/HuiweiAppUpdateDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/HuiweiAppUpdateDialog;->u(Lcom/friday/main/view/HuiweiAppUpdateDialog;Landroid/view/View;)V

    return-void
.end method

.method public static final t(Lcom/friday/main/view/HuiweiAppUpdateDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/friday/main/view/HuiweiAppUpdateDialog;->k:Lhd/a;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static final u(Lcom/friday/main/view/HuiweiAppUpdateDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/main/R$layout;->dialog_version_update:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->g:Landroid/widget/TextView;

    .line 8
    .line 9
    const-string v1, "tvUpdate"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lv3/v1;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Lv3/v1;-><init>(Lcom/friday/main/view/HuiweiAppUpdateDialog;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v2, 0x1f4

    .line 20
    .line 21
    invoke-static {v0, v2, v3, v1}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->c:Landroidx/cardview/widget/CardView;

    .line 31
    .line 32
    const-string v1, "cvCancel"

    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/16 v1, 0x8

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->e:Landroid/widget/TextView;

    .line 49
    .line 50
    new-instance v1, Lv3/w1;

    .line 51
    .line 52
    invoke-direct {v1, p0}, Lv3/w1;-><init>(Lcom/friday/main/view/HuiweiAppUpdateDialog;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    sget v0, Lcom/friday/main/R$style;->airPlayDialog:I

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/DialogFragment;->setStyle(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget v2, Lcom/friday/main/R$dimen;->view_189:I

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    float-to-int v1, v1

    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget v3, Lcom/friday/main/R$dimen;->view_140:I

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    float-to-int v2, v2

    .line 35
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 36
    .line 37
    .line 38
    const/16 v1, 0x11

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final v(Lhd/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/view/HuiweiAppUpdateDialog;->k:Lhd/a;

    .line 2
    .line 3
    return-void
.end method
