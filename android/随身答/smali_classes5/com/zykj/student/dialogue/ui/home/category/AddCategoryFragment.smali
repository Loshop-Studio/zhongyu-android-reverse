.class public final Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;
.super Lcom/zykj/student/dialogue/ui/home/category/Hilt_AddCategoryFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/student/dialogue/ui/home/category/Hilt_AddCategoryFragment<",
        "Lcom/zykj/student/dialogue/databinding/DialogueFragmentEditNewBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0094@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;",
        "Lcom/zykj/base/BaseFragment;",
        "Lcom/zykj/student/dialogue/databinding/DialogueFragmentEditNewBinding;",
        "<init>",
        "()V",
        "",
        "layoutId",
        "()I",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "initView",
        "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;",
        "f",
        "Lkotlin/Lazy;",
        "j",
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
        "SMAP\nAddCategoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddCategoryFragment.kt\ncom/zykj/student/dialogue/ui/home/category/AddCategoryFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,53:1\n172#2,9:54\n*S KotlinDebug\n*F\n+ 1 AddCategoryFragment.kt\ncom/zykj/student/dialogue/ui/home/category/AddCategoryFragment\n*L\n21#1:54,9\n*E\n"
    }
.end annotation


# instance fields
.field public final f:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/home/category/Hilt_AddCategoryFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment$special$$inlined$activityViewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;->f:Lkotlin/Lazy;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic g(Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;->l(Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;->k(Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;)Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;->j()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final j()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;->f:Lkotlin/Lazy;

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

.method public static final k(Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentEditNewBinding;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentEditNewBinding;->b:Landroid/widget/EditText;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "getText(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 34
    .line 35
    const-string p1, "\u5206\u7c7b\u4e0d\u80fd\u4e3a\u7a7a"

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lcom/zykj/base/utils/XToastUtils;->warning(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_0
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;->j()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentEditNewBinding;

    .line 56
    .line 57
    iget-object p0, p0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentEditNewBinding;->b:Landroid/widget/EditText;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p1, p0}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->r(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0
.end method

.method public static final l(Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentEditNewBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentEditNewBinding;->a:Landroid/widget/TextView;

    .line 8
    .line 9
    const-string p2, "cvSave"

    .line 10
    .line 11
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance p2, Lt6/a;

    .line 15
    .line 16
    invoke-direct {p2, p0}, Lt6/a;-><init>(Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "getViewLifecycleOwner(...)"

    .line 27
    .line 28
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v3, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment$initView$3;

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    invoke-direct {v3, p0, p1}, Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment$initView$3;-><init>(Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;Lkotlin/coroutines/Continuation;)V

    .line 39
    .line 40
    .line 41
    const/4 v4, 0x3

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v1, 0x0

    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentEditNewBinding;

    .line 53
    .line 54
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentEditNewBinding;->c:Landroid/widget/ImageView;

    .line 55
    .line 56
    const-string p2, "ivBack"

    .line 57
    .line 58
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance p2, Lt6/b;

    .line 62
    .line 63
    invoke-direct {p2, p0}, Lt6/b;-><init>(Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1, p2}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 67
    .line 68
    .line 69
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/student/dialogue/R$layout;->dialogue_fragment_edit_new:I

    .line 2
    .line 3
    return v0
.end method
