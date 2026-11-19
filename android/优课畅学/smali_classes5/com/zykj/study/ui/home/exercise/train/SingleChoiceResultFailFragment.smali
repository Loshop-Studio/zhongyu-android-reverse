.class public final Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;
.super Lcom/zykj/study/ui/home/exercise/train/Hilt_SingleChoiceResultFailFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/exercise/train/Hilt_SingleChoiceResultFailFragment<",
        "Lcom/zykj/study/databinding/FragmentExerciseTrainSingleChoiceResultFailBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

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
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/Hilt_SingleChoiceResultFailFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$a;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$a;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    sget v0, Lcom/zykj/study/R$id;->nav_answer_graph:I

    .line 23
    .line 24
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$special$$inlined$hiltNavGraphViewModels$1;

    .line 25
    .line 26
    invoke-direct {v1, p0, v0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$special$$inlined$hiltNavGraphViewModels$1;-><init>(Landroidx/fragment/app/Fragment;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$special$$inlined$hiltNavGraphViewModels$2;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$special$$inlined$hiltNavGraphViewModels$2;-><init>(Lh7/d;)V

    .line 36
    .line 37
    .line 38
    const-class v2, Lcom/zykj/study/viewmodels/TrainSingleChoiceViewModel;

    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$special$$inlined$hiltNavGraphViewModels$3;

    .line 45
    .line 46
    invoke-direct {v3, v0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$special$$inlined$hiltNavGraphViewModels$3;-><init>(Lh7/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$special$$inlined$hiltNavGraphViewModels$4;

    .line 50
    .line 51
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$special$$inlined$hiltNavGraphViewModels$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v2, v1, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->g:Lh7/d;

    .line 59
    .line 60
    new-instance v0, Lx4/s0;

    .line 61
    .line 62
    invoke-direct {v0, p0}, Lx4/s0;-><init>(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->i:Lh7/d;

    .line 70
    .line 71
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->r(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;)Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->l(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;)Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->t(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;)Lcom/zykj/study/adapter/MicroAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->h:Lcom/zykj/study/adapter/MicroAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->s(Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final l(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;)Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final m(Landroidx/recyclerview/widget/RecyclerView;)V
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

.method private final p()Lcom/zykj/study/viewmodels/TrainSingleChoiceViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/TrainSingleChoiceViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final q(Lcom/zykj/study/bean/exercise/QuestionBean;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseTrainSingleChoiceResultFailBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseTrainSingleChoiceResultFailBinding;->answerChoice:Lcom/zykj/study/databinding/ViewEditChoiceBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/study/databinding/ViewEditChoiceBinding;->recycler:Lcom/zykj/study/view/MultipleChoiceView;

    .line 10
    .line 11
    sget-object v1, Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;->b:Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;

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
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceView;->setRightOptionList(Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->o()Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragmentArgs;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragmentArgs;->a()[Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Li7/p;->g([Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, p1}, Lcom/zykj/study/view/MultipleChoiceView;->setAnswerList(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static final r(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
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
    sget-object v0, Lcom/zykj/study/ui/home/exercise/train/m;->a:Lcom/zykj/study/ui/home/exercise/train/m$a;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/MicroBean;->getUrl()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lcom/zykj/study/ui/home/exercise/train/m$a;->a(Ljava/lang/String;)Landroidx/navigation/NavDirections;

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

.method private final s(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initMicro$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initMicro$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initMicro$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initMicro$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initMicro$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initMicro$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initMicro$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initMicro$1;->c:I

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
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->p()Lcom/zykj/study/viewmodels/TrainSingleChoiceViewModel;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initMicro$1;->c:I

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
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->h:Lcom/zykj/study/adapter/MicroAdapter;

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

.method public static final t(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;)Lh7/p;
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
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;->c:I

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
    new-instance v0, Lx4/t0;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lx4/t0;-><init>(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, v0}, Lcom/zykj/study/adapter/MicroAdapter;-><init>(Lx7/l;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->h:Lcom/zykj/study/adapter/MicroAdapter;

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
    instance-of v0, p2, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;->f:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;->f:I

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
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 41
    .line 42
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;->a:Ljava/lang/Object;

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
    check-cast p2, Lcom/zykj/study/databinding/FragmentExerciseTrainSingleChoiceResultFailBinding;

    .line 66
    .line 67
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentExerciseTrainSingleChoiceResultFailBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 68
    .line 69
    iget-object p2, p2, Lcom/zykj/study/databinding/ViewMicroBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 70
    .line 71
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->h:Lcom/zykj/study/adapter/MicroAdapter;

    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    const-string v5, "microAdapter"

    .line 75
    .line 76
    if-nez v2, :cond_3

    .line 77
    .line 78
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    move-object v2, v4

    .line 82
    :cond_3
    invoke-virtual {p2, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 83
    .line 84
    .line 85
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->h:Lcom/zykj/study/adapter/MicroAdapter;

    .line 86
    .line 87
    if-nez v2, :cond_4

    .line 88
    .line 89
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    move-object v4, v2

    .line 94
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->n()Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-direct {p0, p2}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->m(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->p()Lcom/zykj/study/viewmodels/TrainSingleChoiceViewModel;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->c()Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-direct {p0, p2}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->q(Lcom/zykj/study/bean/exercise/QuestionBean;)V

    .line 116
    .line 117
    .line 118
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;->a:Ljava/lang/Object;

    .line 123
    .line 124
    invoke-static {p2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iput-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;->b:Ljava/lang/Object;

    .line 129
    .line 130
    const/4 p1, 0x0

    .line 131
    iput p1, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;->c:I

    .line 132
    .line 133
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initView$1;->f:I

    .line 134
    .line 135
    invoke-direct {p0, v0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->s(Lm7/c;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-ne p1, v1, :cond_5

    .line 140
    .line 141
    return-object v1

    .line 142
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainSingleChoiceResultFailBinding;

    .line 147
    .line 148
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainSingleChoiceResultFailBinding;->btnRevision:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 149
    .line 150
    const-string p2, "btnRevision"

    .line 151
    .line 152
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    new-instance p2, Lx4/r0;

    .line 156
    .line 157
    invoke-direct {p2, p0}, Lx4/r0;-><init>(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;)V

    .line 158
    .line 159
    .line 160
    invoke-static {p1, p2}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 161
    .line 162
    .line 163
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 164
    .line 165
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_exercise_train_single_choice_result_fail:I

    .line 2
    .line 3
    return v0
.end method

.method public final n()Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->i:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;

    .line 8
    .line 9
    return-object v0
.end method

.method public final o()Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public onDestroyView()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->h:Lcom/zykj/study/adapter/MicroAdapter;

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
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->n()Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;

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
