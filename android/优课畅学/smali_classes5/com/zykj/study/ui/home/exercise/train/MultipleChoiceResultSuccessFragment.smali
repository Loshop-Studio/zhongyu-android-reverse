.class public final Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;
.super Lcom/zykj/study/ui/home/exercise/train/Hilt_MultipleChoiceResultSuccessFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/exercise/train/Hilt_MultipleChoiceResultSuccessFragment<",
        "Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceResultSuccessBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Lh7/d;

.field public h:Lcom/zykj/study/adapter/MicroAdapter;

.field public final i:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/Hilt_MultipleChoiceResultSuccessFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx4/k0;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lx4/k0;-><init>(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$viewModels$default$1;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$viewModels$default$2;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$viewModels$default$3;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$viewModels$default$4;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->f:Lh7/d;

    .line 47
    .line 48
    sget v0, Lcom/zykj/study/R$id;->nav_answer_graph:I

    .line 49
    .line 50
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$1;

    .line 51
    .line 52
    invoke-direct {v1, p0, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$1;-><init>(Landroidx/fragment/app/Fragment;I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$2;

    .line 60
    .line 61
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$2;-><init>(Lh7/d;)V

    .line 62
    .line 63
    .line 64
    const-class v2, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 65
    .line 66
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    new-instance v3, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$3;

    .line 71
    .line 72
    invoke-direct {v3, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$3;-><init>(Lh7/d;)V

    .line 73
    .line 74
    .line 75
    new-instance v4, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$4;

    .line 76
    .line 77
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v2, v1, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->g:Lh7/d;

    .line 85
    .line 86
    new-instance v0, Lx4/l0;

    .line 87
    .line 88
    invoke-direct {v0, p0}, Lx4/l0;-><init>(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->i:Lh7/d;

    .line 96
    .line 97
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->u(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->x(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->n(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->w(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->p(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)Lcom/zykj/study/adapter/MicroAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->h:Lcom/zykj/study/adapter/MicroAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->v(Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final n(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final o(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/zykj/study/R$drawable;->divider:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v1, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public static final p(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
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

.method private final r()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->f:Lh7/d;

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

.method private final s()Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->g:Lh7/d;

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

.method private final t(Lcom/zykj/study/bean/exercise/QuestionBean;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceResultSuccessBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceResultSuccessBinding;->answerChoice:Lcom/zykj/study/databinding/ViewEditChoiceBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/study/databinding/ViewEditChoiceBinding;->recycler:Lcom/zykj/study/view/MultipleChoiceView;

    .line 10
    .line 11
    sget-object v1, Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;->c:Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/study/view/MultipleChoiceView;->setJudgingStatus(Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getExtra()Lcom/zykj/study/bean/exercise/QuestionExtra;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionExtra;->getOptions()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/zykj/study/view/MultipleChoiceView;->setOptionList(Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getStandardAnswerList()Lcom/zykj/study/utils/ChoiceList;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceView;->setRightOptionList(Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceView;->setAnswerList(Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static final u(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v0, Lcom/zykj/study/ui/home/exercise/train/k;->a:Lcom/zykj/study/ui/home/exercise/train/k$a;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/MicroBean;->getUrl()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lcom/zykj/study/ui/home/exercise/train/k$a;->a(Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 24
    .line 25
    return-object p0
.end method

.method private final v(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initMicro$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initMicro$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initMicro$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initMicro$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initMicro$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initMicro$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initMicro$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initMicro$1;->c:I

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
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->s()Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initMicro$1;->c:I

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;->l(Lm7/c;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 67
    .line 68
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->h:Lcom/zykj/study/adapter/MicroAdapter;

    .line 69
    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    const-string v0, "microAdapter"

    .line 73
    .line 74
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    :cond_4
    invoke-virtual {v0, p1}, Lcom/zykj/study/adapter/MicroAdapter;->h(Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 82
    .line 83
    return-object p1
.end method

.method public static final w(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)Lh7/p;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->r()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->k()V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/zykj/study/ui/home/exercise/train/n;->a:Lcom/zykj/study/ui/home/exercise/train/n$a;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/train/n$a;->a()Landroidx/navigation/NavDirections;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 22
    .line 23
    return-object p0
.end method

.method public static final x(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)Lh7/p;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->r()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->C()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 18
    .line 19
    return-object p0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initData$1;->c:I

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
    new-instance p1, Lcom/zykj/study/adapter/MicroAdapter;

    .line 63
    .line 64
    new-instance v0, Lx4/m0;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lx4/m0;-><init>(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, v0}, Lcom/zykj/study/adapter/MicroAdapter;-><init>(Lx7/l;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->h:Lcom/zykj/study/adapter/MicroAdapter;

    .line 73
    .line 74
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 75
    .line 76
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;->f:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;->f:I

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
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 41
    .line 42
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Landroid/os/Bundle;

    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    check-cast p2, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceResultSuccessBinding;

    .line 66
    .line 67
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->s()Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {p2, v2}, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceResultSuccessBinding;->setTrainViewModel(Lcom/zykj/study/viewmodels/BaseTrainViewModel;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    check-cast p2, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceResultSuccessBinding;

    .line 79
    .line 80
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceResultSuccessBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 81
    .line 82
    iget-object p2, p2, Lcom/zykj/study/databinding/ViewMicroBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 83
    .line 84
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->h:Lcom/zykj/study/adapter/MicroAdapter;

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    const-string v5, "microAdapter"

    .line 88
    .line 89
    if-nez v2, :cond_3

    .line 90
    .line 91
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    move-object v2, v4

    .line 95
    :cond_3
    invoke-virtual {p2, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 96
    .line 97
    .line 98
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->h:Lcom/zykj/study/adapter/MicroAdapter;

    .line 99
    .line 100
    if-nez v2, :cond_4

    .line 101
    .line 102
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    move-object v4, v2

    .line 107
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->q()Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-direct {p0, p2}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->o(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 118
    .line 119
    .line 120
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->s()Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->c()Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-direct {p0, p2}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->t(Lcom/zykj/study/bean/exercise/QuestionBean;)V

    .line 129
    .line 130
    .line 131
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;->a:Ljava/lang/Object;

    .line 136
    .line 137
    invoke-static {p2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;->b:Ljava/lang/Object;

    .line 142
    .line 143
    const/4 p1, 0x0

    .line 144
    iput p1, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;->c:I

    .line 145
    .line 146
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$initView$1;->f:I

    .line 147
    .line 148
    invoke-direct {p0, v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->v(Lm7/c;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-ne p1, v1, :cond_5

    .line 153
    .line 154
    return-object v1

    .line 155
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceResultSuccessBinding;

    .line 160
    .line 161
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceResultSuccessBinding;->editChoiceButton:Lcom/zykj/study/databinding/ViewEditChoiceButtonBinding;

    .line 162
    .line 163
    iget-object p1, p1, Lcom/zykj/study/databinding/ViewEditChoiceButtonBinding;->btnNext:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 164
    .line 165
    const-string p2, "btnNext"

    .line 166
    .line 167
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    new-instance p2, Lx4/i0;

    .line 171
    .line 172
    invoke-direct {p2, p0}, Lx4/i0;-><init>(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)V

    .line 173
    .line 174
    .line 175
    invoke-static {p1, p2}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceResultSuccessBinding;

    .line 183
    .line 184
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainMultipleChoiceResultSuccessBinding;->editChoiceButton:Lcom/zykj/study/databinding/ViewEditChoiceButtonBinding;

    .line 185
    .line 186
    iget-object p1, p1, Lcom/zykj/study/databinding/ViewEditChoiceButtonBinding;->btnComplete:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 187
    .line 188
    const-string p2, "btnComplete"

    .line 189
    .line 190
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    new-instance p2, Lx4/j0;

    .line 194
    .line 195
    invoke-direct {p2, p0}, Lx4/j0;-><init>(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;)V

    .line 196
    .line 197
    .line 198
    invoke-static {p1, p2}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 199
    .line 200
    .line 201
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 202
    .line 203
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_exercise_train_multiple_choice_result_success:I

    .line 2
    .line 3
    return v0
.end method

.method public onDestroyView()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->h:Lcom/zykj/study/adapter/MicroAdapter;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "microAdapter"

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->q()Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final q()Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;->i:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1;

    .line 8
    .line 9
    return-object v0
.end method
