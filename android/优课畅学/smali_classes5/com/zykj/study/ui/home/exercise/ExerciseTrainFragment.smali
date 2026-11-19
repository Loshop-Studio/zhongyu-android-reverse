.class public final Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;
.super Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseTrainFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseTrainFragment<",
        "Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final j:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$a;

.field public static final k:I


# instance fields
.field public final f:Lh7/d;

.field public final g:Landroidx/navigation/NavArgsLazy;

.field public final h:Lh7/d;

.field public final i:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->j:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->k:I

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseTrainFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v4, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->f:Lh7/d;

    .line 31
    .line 32
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 33
    .line 34
    const-class v1, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;

    .line 35
    .line 36
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$c;

    .line 41
    .line 42
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$c;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->g:Landroidx/navigation/NavArgsLazy;

    .line 49
    .line 50
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$1;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 56
    .line 57
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$2;

    .line 58
    .line 59
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-class v2, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    new-instance v4, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$3;

    .line 73
    .line 74
    invoke-direct {v4, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 75
    .line 76
    .line 77
    new-instance v5, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$4;

    .line 78
    .line 79
    invoke-direct {v5, v3, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 80
    .line 81
    .line 82
    new-instance v6, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$5;

    .line 83
    .line 84
    invoke-direct {v6, p0, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v2, v4, v5, v6}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->h:Lh7/d;

    .line 92
    .line 93
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$6;

    .line 94
    .line 95
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$6;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 96
    .line 97
    .line 98
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$7;

    .line 99
    .line 100
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$7;-><init>(Lx7/a;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-class v1, Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 108
    .line 109
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$8;

    .line 114
    .line 115
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$8;-><init>(Lh7/d;)V

    .line 116
    .line 117
    .line 118
    new-instance v4, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$9;

    .line 119
    .line 120
    invoke-direct {v4, v3, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$9;-><init>(Lx7/a;Lh7/d;)V

    .line 121
    .line 122
    .line 123
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$10;

    .line 124
    .line 125
    invoke-direct {v3, p0, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$special$$inlined$viewModels$default$10;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 126
    .line 127
    .line 128
    invoke-static {p0, v1, v2, v4, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->i:Lh7/d;

    .line 133
    .line 134
    return-void
.end method

.method private final A()Lcom/zykj/lib/login/ui/main/LoginViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final B()Lcom/zykj/study/viewmodels/WebViewControlViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->i:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final D(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->m()V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 9
    .line 10
    return-object p0
.end method

.method public static final E(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/base/bean/toast/ToastMessage;)Lh7/p;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initData$3$1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initData$3$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/base/bean/toast/ToastMessage;Lm7/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 21
    .line 22
    .line 23
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 24
    .line 25
    return-object p0
.end method

.method public static final G(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/study/bean/exercise/ExerciseBean;)Lh7/p;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getTitle()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const-string p1, ""

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->t(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget v0, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget v1, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget v1, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    int-to-float v0, v0

    .line 56
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v0, Lw4/a0;

    .line 61
    .line 62
    invoke-direct {v0, p0}, Lw4/a0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 73
    .line 74
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/zykj/study/view/MultipleStatusView;->f()V

    .line 77
    .line 78
    .line 79
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 80
    .line 81
    return-object p0
.end method

.method public static final H(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Landroid/view/View;)V
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

.method public static final I(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Landroid/view/View;)V
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

.method public static final J(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "$this$addCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "BlackboardEvaluationFragment"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->O()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 36
    .line 37
    return-object p0
.end method

.method public static final K(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v5, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v5, p0, p1, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/study/bean/exercise/QuestionBean;Lm7/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x3

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 25
    .line 26
    .line 27
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 28
    .line 29
    return-object p0
.end method

.method public static final L(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$4$1;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$4$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lm7/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static final M(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-direct {v4, p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lm7/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 25
    .line 26
    .line 27
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 28
    .line 29
    return-object p0
.end method

.method public static final N(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Ljava/lang/Boolean;)Lh7/p;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->getLeftText()Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    xor-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;->setEnabled(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->Q()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->C()V

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 36
    .line 37
    return-object p0
.end method

.method public static final R(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;F)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->P(F)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/base/bean/toast/ToastMessage;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->E(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/base/bean/toast/ToastMessage;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->H(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->D(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Ljava/lang/Boolean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->N(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Ljava/lang/Boolean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->I(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->L(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->K(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->M(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Ljava/lang/Integer;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;F)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->R(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;F)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->J(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->x(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/study/bean/exercise/ExerciseBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->G(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/study/bean/exercise/ExerciseBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->y()Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/lib/login/ui/main/LoginViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->A()Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final x(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->O()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 5
    .line 6
    return-object p0
.end method


# virtual methods
.method public final C()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->tvPageMovingProgress:Landroid/widget/TextView;

    .line 8
    .line 9
    const-string v1, "tvPageMovingProgress"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->w()Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v0}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final F()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 8
    .line 9
    sget v1, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget v2, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget v2, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    int-to-float v1, v1

    .line 44
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, Lw4/j0;

    .line 49
    .line 50
    invoke-direct {v1, p0}, Lw4/j0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->w()Landroidx/lifecycle/MutableLiveData;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    new-instance v2, Lw4/z;

    .line 69
    .line 70
    invoke-direct {v2, p0}, Lw4/z;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)V

    .line 71
    .line 72
    .line 73
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$b;

    .line 74
    .line 75
    invoke-direct {v3, v2}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$b;-><init>(Lx7/l;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final O()V
    .locals 4

    .line 1
    sget-object v0, Lh5/b;->a:Lh5/b$a;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireContext(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lh5/b$a;->b(Landroid/content/Context;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v3}, Lh5/b$a;->a(Landroid/content/Context;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->w()Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3, v2, v1, v0}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->G(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;II)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final P(F)V
    .locals 1

    .line 1
    const v0, 0x3d4ccccd    # 0.05f

    .line 2
    .line 3
    .line 4
    cmpg-float v0, p1, v0

    .line 5
    .line 6
    if-gez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 13
    .line 14
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->tvPageMovingProgress:Landroid/widget/TextView;

    .line 15
    .line 16
    sget v0, Lcom/zykj/study/R$string;->page_on_the_top:I

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const v0, 0x3f733333    # 0.95f

    .line 27
    .line 28
    .line 29
    cmpl-float p1, p1, v0

    .line 30
    .line 31
    if-ltz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->tvPageMovingProgress:Landroid/widget/TextView;

    .line 40
    .line 41
    sget v0, Lcom/zykj/study/R$string;->page_on_the_bottom:I

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->tvPageMovingProgress:Landroid/widget/TextView;

    .line 58
    .line 59
    sget v0, Lcom/zykj/study/R$string;->page_could_be_slide:I

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final Q()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->v()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->w()Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 25
    .line 26
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->tvPageMovingProgress:Landroid/widget/TextView;

    .line 27
    .line 28
    const-string v2, "tvPageMovingProgress"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Lw4/h0;

    .line 38
    .line 39
    invoke-direct {v1, p0}, Lw4/h0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->v0(Lx7/l;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget v2, Lcom/zykj/study/R$id;->frame_layout:I

    .line 54
    .line 55
    const-string v3, "BlackboardEvaluationFragment"

    .line 56
    .line 57
    invoke-virtual {v1, v2, v0, v3}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initData$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput v4, v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initData$1;->c:I

    .line 61
    .line 62
    invoke-super {p0, v0}, Lcom/zykj/base/BaseFragment;->initData(Lm7/c;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->y()Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;->b()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->y()Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v4}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;->a()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->y()Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {v5}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;->c()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initData$1;->c:I

    .line 98
    .line 99
    invoke-virtual {p1, v2, v4, v5, v0}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->J(IIILm7/c;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v1, :cond_5

    .line 104
    .line 105
    :goto_2
    return-object v1

    .line 106
    :cond_5
    :goto_3
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    new-instance v0, Lw4/f0;

    .line 115
    .line 116
    invoke-direct {v0, p0}, Lw4/f0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)V

    .line 117
    .line 118
    .line 119
    new-instance v1, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$b;

    .line 120
    .line 121
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$b;-><init>(Lx7/l;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->y()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    new-instance v0, Lw4/g0;

    .line 136
    .line 137
    invoke-direct {v0, p0}, Lw4/g0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)V

    .line 138
    .line 139
    .line 140
    new-instance v1, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$b;

    .line 141
    .line 142
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$b;-><init>(Lx7/l;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, p0, v1}, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 146
    .line 147
    .line 148
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 149
    .line 150
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->setEntity(Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->B()Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->setWebViewControlViewModel(Lcom/zykj/study/viewmodels/WebViewControlViewModel;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->F()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 35
    .line 36
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 37
    .line 38
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webView:Lcom/zykj/study/view/CustomWebView;

    .line 39
    .line 40
    const-string p2, "webView"

    .line 41
    .line 42
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 50
    .line 51
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 52
    .line 53
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webViewAnalysis:Lcom/zykj/study/view/CustomWebView;

    .line 54
    .line 55
    const-string v0, "webViewAnalysis"

    .line 56
    .line 57
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 65
    .line 66
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 67
    .line 68
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webViewCorrectAnswer:Lcom/zykj/study/view/CustomWebView;

    .line 69
    .line 70
    const-string v1, "webViewCorrectAnswer"

    .line 71
    .line 72
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    filled-new-array {p1, p2, v0}, [Lcom/zykj/study/view/CustomWebView;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->v([Lcom/zykj/study/view/CustomWebView;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-eqz p1, :cond_0

    .line 87
    .line 88
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_0

    .line 93
    .line 94
    new-instance v3, Lw4/y;

    .line 95
    .line 96
    invoke-direct {v3, p0}, Lw4/y;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)V

    .line 97
    .line 98
    .line 99
    const/4 v4, 0x2

    .line 100
    const/4 v5, 0x0

    .line 101
    const/4 v2, 0x0

    .line 102
    move-object v1, p0

    .line 103
    invoke-static/range {v0 .. v5}, Landroidx/activity/OnBackPressedDispatcherKt;->addCallback$default(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLx7/l;ILjava/lang/Object;)Landroidx/activity/OnBackPressedCallback;

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    move-object v1, p0

    .line 108
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    new-instance v0, Lw4/b0;

    .line 121
    .line 122
    invoke-direct {v0, p0}, Lw4/b0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)V

    .line 123
    .line 124
    .line 125
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$b;

    .line 126
    .line 127
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$b;-><init>(Lx7/l;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p2, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 138
    .line 139
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 140
    .line 141
    new-instance p2, Lw4/c0;

    .line 142
    .line 143
    invoke-direct {p2, p0}, Lw4/c0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, p2}, Lcom/zykj/study/view/MultipleStatusView;->setOnRetryClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->C()Landroidx/lifecycle/MutableLiveData;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    new-instance v0, Lw4/d0;

    .line 162
    .line 163
    invoke-direct {v0, p0}, Lw4/d0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)V

    .line 164
    .line 165
    .line 166
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$b;

    .line 167
    .line 168
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$b;-><init>(Lx7/l;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, p2, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    new-instance v0, Lw4/e0;

    .line 187
    .line 188
    invoke-direct {v0, p0}, Lw4/e0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)V

    .line 189
    .line 190
    .line 191
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$b;

    .line 192
    .line 193
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$b;-><init>(Lx7/l;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, p2, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 197
    .line 198
    .line 199
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 200
    .line 201
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_exercise_train:I

    .line 2
    .line 3
    return v0
.end method

.method public final varargs v([Lcom/zykj/study/view/CustomWebView;)V
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    sget-object v3, Le5/e;->a:Le5/e;

    .line 8
    .line 9
    invoke-virtual {v3}, Le5/e;->d()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v2, v4}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3}, Le5/e;->a()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v2, v4}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Le5/e;->b()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v3}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v2, v3}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method

.method public final w()Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;
    .locals 20

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "BlackboardEvaluationFragment"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    instance-of v1, v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    check-cast v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    sget-object v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->l:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->v()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    new-instance v2, Lr5/a;

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const/4 v3, 0x3

    .line 44
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    new-instance v10, Lw4/i0;

    .line 49
    .line 50
    move-object/from16 v3, p0

    .line 51
    .line 52
    invoke-direct {v10, v3}, Lw4/i0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)V

    .line 53
    .line 54
    .line 55
    const/16 v18, 0x7f31

    .line 56
    .line 57
    const/16 v19, 0x0

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x1

    .line 61
    const/4 v7, 0x0

    .line 62
    const/4 v8, 0x0

    .line 63
    const/high16 v9, 0x420c0000    # 35.0f

    .line 64
    .line 65
    const/4 v11, 0x0

    .line 66
    const/4 v12, 0x0

    .line 67
    const/4 v13, 0x0

    .line 68
    const/4 v14, 0x0

    .line 69
    const/4 v15, 0x0

    .line 70
    const/16 v16, 0x0

    .line 71
    .line 72
    const/16 v17, 0x0

    .line 73
    .line 74
    invoke-direct/range {v2 .. v19}, Lr5/a;-><init>(ZZLjava/lang/Integer;Ljava/lang/Integer;ZFFLx7/a;ZZZZFZLx7/a;ILkotlin/jvm/internal/n;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1, v2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;->a(Ljava/lang/String;Lr5/a;)Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0
.end method

.method public final y()Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->g:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final z()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->h:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 8
    .line 9
    return-object v0
.end method
