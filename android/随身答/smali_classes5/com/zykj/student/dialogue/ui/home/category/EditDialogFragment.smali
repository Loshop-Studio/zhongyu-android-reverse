.class public final Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;
.super Lcom/zykj/student/dialogue/ui/home/category/Hilt_EditDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/student/dialogue/ui/home/category/Hilt_EditDialogFragment<",
        "Lcom/zykj/student/dialogue/databinding/DialogueDialogEditBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0094@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0004R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;",
        "Lcom/zykj/base/BaseDialogFragment;",
        "Lcom/zykj/student/dialogue/databinding/DialogueDialogEditBinding;",
        "<init>",
        "()V",
        "",
        "onStart",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "",
        "layoutId",
        "()I",
        "initView",
        "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onDestroy",
        "Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;",
        "f",
        "Landroidx/navigation/NavArgsLazy;",
        "h",
        "()Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;",
        "args",
        "Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;",
        "g",
        "Lkotlin/Lazy;",
        "i",
        "()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;",
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
        "SMAP\nEditDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditDialogFragment.kt\ncom/zykj/student/dialogue/ui/home/category/EditDialogFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,65:1\n42#2,3:66\n172#3,9:69\n*S KotlinDebug\n*F\n+ 1 EditDialogFragment.kt\ncom/zykj/student/dialogue/ui/home/category/EditDialogFragment\n*L\n21#1:66,3\n22#1:69,9\n*E\n"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/home/category/Hilt_EditDialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment$a;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment$a;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    const-class v0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment$special$$inlined$activityViewModels$default$1;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment$special$$inlined$activityViewModels$default$2;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v2, v3, p0}, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment$special$$inlined$activityViewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/fragment/app/Fragment;)V

    .line 37
    .line 38
    .line 39
    new-instance v3, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment$special$$inlined$activityViewModels$default$3;

    .line 40
    .line 41
    invoke-direct {v3, p0}, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;->g:Lkotlin/Lazy;

    .line 49
    .line 50
    return-void
.end method

.method public static final synthetic g(Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;)Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;->i()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final h()Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final i()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;->g:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;->i()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;->h()Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2}, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;->a()[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p2}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->D(Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string p2, "getViewLifecycleOwner(...)"

    .line 25
    .line 26
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v3, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment$initView$2;

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-direct {v3, p0, p1}, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment$initView$2;-><init>(Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;Lkotlin/coroutines/Continuation;)V

    .line 37
    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v1, 0x0

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 44
    .line 45
    .line 46
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/student/dialogue/R$layout;->dialogue_dialog_edit:I

    .line 2
    .line 3
    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/zykj/base/BaseDialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;->i()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->A(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;->i()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->y()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "KEY_REFRESH_TAB"

    .line 17
    .line 18
    invoke-static {p0, v1, v0}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 22
    .line 23
    .line 24
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
    const/16 v1, 0x3e8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/Window;->setType(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget v2, Lcom/zykj/base/R$dimen;->view_216:I

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    float-to-int v1, v1

    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget v3, Lcom/zykj/base/R$dimen;->view_234:I

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    float-to-int v2, v2

    .line 40
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

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
    const/4 v1, 0x1

    .line 50
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    .line 58
    .line 59
    .line 60
    return-void
.end method
