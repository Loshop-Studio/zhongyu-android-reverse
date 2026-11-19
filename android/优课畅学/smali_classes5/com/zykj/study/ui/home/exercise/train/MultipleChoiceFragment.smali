.class public final Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;
.super Lcom/zykj/study/ui/home/exercise/train/Hilt_MultipleChoiceFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/exercise/train/Hilt_MultipleChoiceFragment<",
        "Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public final h:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/Hilt_MultipleChoiceFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$a;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$a;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    sget v0, Lcom/zykj/study/R$id;->nav_answer_graph:I

    .line 23
    .line 24
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$1;

    .line 25
    .line 26
    invoke-direct {v1, p0, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$1;-><init>(Landroidx/fragment/app/Fragment;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$2;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$2;-><init>(Lh7/d;)V

    .line 36
    .line 37
    .line 38
    const-class v2, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$3;

    .line 45
    .line 46
    invoke-direct {v3, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$3;-><init>(Lh7/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$4;

    .line 50
    .line 51
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v2, v1, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->g:Lh7/d;

    .line 59
    .line 60
    new-instance v0, Lx4/b0;

    .line 61
    .line 62
    invoke-direct {v0, p0}, Lx4/b0;-><init>(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 66
    .line 67
    new-instance v2, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$viewModels$default$1;

    .line 68
    .line 69
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-class v1, Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 77
    .line 78
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    new-instance v2, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$viewModels$default$2;

    .line 83
    .line 84
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 85
    .line 86
    .line 87
    new-instance v3, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$viewModels$default$3;

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 91
    .line 92
    .line 93
    new-instance v4, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$viewModels$default$4;

    .line 94
    .line 95
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 96
    .line 97
    .line 98
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->h:Lh7/d;

    .line 103
    .line 104
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->m(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->l(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method private final k()Lcom/zykj/study/viewmodels/WebViewControlViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->h:Lh7/d;

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

.method public static final l(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;)Lh7/p;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/study/utils/ChoiceList;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/study/utils/ChoiceList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceBinding;

    .line 11
    .line 12
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceBinding;->answerChoice:Lcom/zykj/study/databinding/ViewEditChoiceBinding;

    .line 13
    .line 14
    iget-object v1, v1, Lcom/zykj/study/databinding/ViewEditChoiceBinding;->recycler:Lcom/zykj/study/view/MultipleChoiceView;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/zykj/study/view/MultipleChoiceView;->c()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 47
    .line 48
    const-string v0, "\u8bf7\u9009\u62e9\u7b54\u6848"

    .line 49
    .line 50
    invoke-static {p0, v0}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->k()Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/WebViewControlViewModel;->d()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->j()Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1, v0}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;->i(Lcom/zykj/study/utils/ChoiceList;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    sget-object v0, Lcom/zykj/study/ui/home/exercise/train/i;->a:Lcom/zykj/study/ui/home/exercise/train/i$b;

    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/train/i$b;->b()Landroidx/navigation/NavDirections;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    sget-object v0, Lcom/zykj/study/ui/home/exercise/train/i;->a:Lcom/zykj/study/ui/home/exercise/train/i$b;

    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceBinding;

    .line 94
    .line 95
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceBinding;->answerChoice:Lcom/zykj/study/databinding/ViewEditChoiceBinding;

    .line 96
    .line 97
    iget-object v1, v1, Lcom/zykj/study/databinding/ViewEditChoiceBinding;->recycler:Lcom/zykj/study/view/MultipleChoiceView;

    .line 98
    .line 99
    invoke-virtual {v1}, Lcom/zykj/study/view/MultipleChoiceView;->c()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const/4 v2, 0x0

    .line 104
    new-array v2, v2, [Ljava/lang/String;

    .line 105
    .line 106
    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, [Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Lcom/zykj/study/ui/home/exercise/train/i$b;->a([Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 121
    .line 122
    .line 123
    :goto_1
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 124
    .line 125
    return-object p0
.end method

.method public static final m(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "requireParentFragment(...)"

    .line 10
    .line 11
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method


# virtual methods
.method public final i()Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$initData$1;->c:I

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
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->j()Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->i()Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragmentArgs;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragmentArgs;->a()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    invoke-virtual {p1, v0, v1}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->e(J)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->j()Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->i()Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragmentArgs;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragmentArgs;->b()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->f(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->j()Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->i()Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragmentArgs;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragmentArgs;->c()Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->h(Lcom/zykj/study/bean/exercise/QuestionBean;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->j()Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->i()Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragmentArgs;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragmentArgs;->d()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->g(Z)V

    .line 120
    .line 121
    .line 122
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 123
    .line 124
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->k()Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/WebViewControlViewModel;->b()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceBinding;

    .line 13
    .line 14
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceBinding;->answerChoice:Lcom/zykj/study/databinding/ViewEditChoiceBinding;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/zykj/study/databinding/ViewEditChoiceBinding;->recycler:Lcom/zykj/study/view/MultipleChoiceView;

    .line 17
    .line 18
    sget-object p2, Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;->a:Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lcom/zykj/study/view/MultipleChoiceView;->setJudgingStatus(Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->j()Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->c()Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getExtra()Lcom/zykj/study/bean/exercise/QuestionExtra;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/zykj/study/bean/exercise/QuestionExtra;->getOptions()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lcom/zykj/study/view/MultipleChoiceView;->setOptionList(Ljava/util/List;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->j()Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->c()Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getStandardAnswerList()Lcom/zykj/study/utils/ChoiceList;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p1, p2}, Lcom/zykj/study/view/MultipleChoiceView;->setRightOptionList(Ljava/util/List;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceBinding;

    .line 66
    .line 67
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceBinding;->btnSubmit:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 68
    .line 69
    const-string p2, "btnSubmit"

    .line 70
    .line 71
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance p2, Lx4/c0;

    .line 75
    .line 76
    invoke-direct {p2, p0}, Lx4/c0;-><init>(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1, p2}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 80
    .line 81
    .line 82
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 83
    .line 84
    return-object p1
.end method

.method public final j()Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_exercise_train_multiple_choice:I

    .line 2
    .line 3
    return v0
.end method
