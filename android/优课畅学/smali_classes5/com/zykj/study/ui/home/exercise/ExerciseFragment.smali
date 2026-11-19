.class public final Lcom/zykj/study/ui/home/exercise/ExerciseFragment;
.super Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseFragment<",
        "Lcom/zykj/study/databinding/FragmentExerciseBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Landroidx/navigation/NavArgsLazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/study/viewmodels/ExerciseViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->f:Lh7/d;

    .line 47
    .line 48
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 49
    .line 50
    const-class v1, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$b;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$b;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->g:Landroidx/navigation/NavArgsLazy;

    .line 65
    .line 66
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->o(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Lcom/zykj/base/bean/toast/ToastMessage;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->q(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Lcom/zykj/base/bean/toast/ToastMessage;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->n(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Lcom/zykj/study/bean/exercise/ExerciseBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->p(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Lcom/zykj/study/bean/exercise/ExerciseBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->l()Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final n(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final o(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->m()Lcom/zykj/study/viewmodels/ExerciseViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->l()Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->b()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->l()Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->a()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->l()Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->c()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-virtual {p1, v0, v1, p0}, Lcom/zykj/study/viewmodels/ExerciseViewModel;->a(III)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static final p(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Lcom/zykj/study/bean/exercise/ExerciseBean;)Lh7/p;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/zykj/study/databinding/FragmentExerciseBinding;

    .line 8
    .line 9
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentExerciseBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->i()V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "getViewLifecycleOwner(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v1, p1, p0, v2}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;-><init>(Lcom/zykj/study/bean/exercise/ExerciseBean;Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Lm7/c;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->m()Lcom/zykj/study/viewmodels/ExerciseViewModel;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, Lw4/d;

    .line 52
    .line 53
    invoke-direct {v1, p0}, Lw4/d;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;)V

    .line 54
    .line 55
    .line 56
    new-instance p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$a;

    .line 57
    .line 58
    invoke-direct {p0, v1}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$a;-><init>(Lx7/l;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0, p0}, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 65
    .line 66
    return-object p0
.end method

.method public static final q(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Lcom/zykj/base/bean/toast/ToastMessage;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/zykj/study/databinding/FragmentExerciseBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentExerciseBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->i()V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 13
    .line 14
    return-object p0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initData$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initData$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initData$1;->c:I

    .line 54
    .line 55
    invoke-super {p0, v0}, Lcom/zykj/base/BaseFragment;->initData(Lm7/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->m()Lcom/zykj/study/viewmodels/ExerciseViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->l()Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->b()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->l()Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->a()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->l()Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->c()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-virtual {p1, v0, v1, v2}, Lcom/zykj/study/viewmodels/ExerciseViewModel;->a(III)V

    .line 91
    .line 92
    .line 93
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 94
    .line 95
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->m()Lcom/zykj/study/viewmodels/ExerciseViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentExerciseBinding;->setEntity(Lcom/zykj/study/viewmodels/ExerciseViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseBinding;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 21
    .line 22
    sget p2, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    sget v0, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 37
    .line 38
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    sget v0, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 51
    .line 52
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    int-to-float p2, p2

    .line 57
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p2, Lw4/a;

    .line 62
    .line 63
    invoke-direct {p2, p0}, Lw4/a;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseBinding;

    .line 74
    .line 75
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 76
    .line 77
    new-instance p2, Lw4/b;

    .line 78
    .line 79
    invoke-direct {p2, p0}, Lw4/b;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->setOnRetryClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->m()Lcom/zykj/study/viewmodels/ExerciseViewModel;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    new-instance v0, Lw4/c;

    .line 98
    .line 99
    invoke-direct {v0, p0}, Lw4/c;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;)V

    .line 100
    .line 101
    .line 102
    new-instance v1, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$a;

    .line 103
    .line 104
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$a;-><init>(Lx7/l;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 108
    .line 109
    .line 110
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 111
    .line 112
    return-object p1
.end method

.method public final l()Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->g:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_exercise:I

    .line 2
    .line 3
    return v0
.end method

.method public final m()Lcom/zykj/study/viewmodels/ExerciseViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/ExerciseViewModel;

    .line 8
    .line 9
    return-object v0
.end method
