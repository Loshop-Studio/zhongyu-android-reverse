.class public final Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog;
.super Lcom/zykj/huiwei/launcher/ui/dialog/Hilt_CustomerServiceDialog;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/huiwei/launcher/ui/dialog/Hilt_CustomerServiceDialog<",
        "Lcom/zykj/huiwei/launcher/databinding/HwDialogCustomerServiceBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0004J\u0019\u0010\u000c\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog;",
        "Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;",
        "Lcom/zykj/huiwei/launcher/databinding/HwDialogCustomerServiceBinding;",
        "<init>",
        "()V",
        "",
        "layoutId",
        "()I",
        "",
        "g",
        "Landroid/view/View;",
        "v",
        "onClick",
        "(Landroid/view/View;)V",
        "Lcom/zykj/huiwei/launcher/viewmodels/CustomerServiceViewModel;",
        "Lkotlin/Lazy;",
        "n",
        "()Lcom/zykj/huiwei/launcher/viewmodels/CustomerServiceViewModel;",
        "viewModel",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCustomerServiceDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerServiceDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,33:1\n106#2,15:34\n*S KotlinDebug\n*F\n+ 1 CustomerServiceDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog\n*L\n14#1:34,15\n*E\n"
    }
.end annotation


# instance fields
.field public final g:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/Hilt_CustomerServiceDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog$special$$inlined$viewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/huiwei/launcher/viewmodels/CustomerServiceViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog$special$$inlined$viewModels$default$3;-><init>(Lkotlin/Lazy;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog$special$$inlined$viewModels$default$4;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/Lazy;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/Lazy;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog;->g:Lkotlin/Lazy;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public g()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogCustomerServiceBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog;->n()Lcom/zykj/huiwei/launcher/viewmodels/CustomerServiceViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lcom/zykj/huiwei/launcher/databinding/HwDialogCustomerServiceBinding;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/CustomerServiceViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogCustomerServiceBinding;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lcom/zykj/huiwei/launcher/databinding/HwDialogCustomerServiceBinding;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0c003f

    return v0
.end method

.method public final n()Lcom/zykj/huiwei/launcher/viewmodels/CustomerServiceViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog;->g:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/CustomerServiceViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;->onClick(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const v0, 0x7f0901a9

    .line 24
    .line 25
    .line 26
    if-ne p1, v0, :cond_2

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 33
    .line 34
    .line 35
    :cond_2
    :goto_1
    return-void
.end method
