.class public final Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;
.super Lcom/zykj/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/base/BaseFragment<",
        "Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lh7/d;

.field public final b:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->a:Lh7/d;

    .line 31
    .line 32
    new-instance v0, Lb5/l1;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lb5/l1;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->b:Lh7/d;

    .line 42
    .line 43
    return-void
.end method

.method public static synthetic f(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;)Lcom/zykj/study/adapter/ChartBarAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->k(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;)Lcom/zykj/study/adapter/ChartBarAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;Landroid/view/View;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->p(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;Landroid/view/View;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;Lcom/zykj/study/bean/teach/ChoiceChartData;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->l(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;Lcom/zykj/study/bean/teach/ChoiceChartData;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;)Lcom/zykj/study/adapter/ChartBarAdapter;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->m()Lcom/zykj/study/adapter/ChartBarAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic j(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;)Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->n()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final k(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;)Lcom/zykj/study/adapter/ChartBarAdapter;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/adapter/ChartBarAdapter;

    .line 2
    .line 3
    new-instance v1, Lb5/n1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lb5/n1;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/study/adapter/ChartBarAdapter;-><init>(Lx7/l;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final l(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;Lcom/zykj/study/bean/teach/ChoiceChartData;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "entity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->n()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->b(Lcom/zykj/study/bean/teach/ChoiceChartData;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 14
    .line 15
    return-object p0
.end method

.method private final m()Lcom/zykj/study/adapter/ChartBarAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->b:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/adapter/ChartBarAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method private final n()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->a:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final p(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;Landroid/view/View;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lcom/zykj/study/dialog/ExerciseFinishDialog;->d:Lcom/zykj/study/dialog/ExerciseFinishDialog$a;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/study/dialog/ExerciseFinishDialog$a;->a()Lcom/zykj/study/dialog/ExerciseFinishDialog;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "finish_dialog_tag"

    .line 17
    .line 18
    invoke-virtual {p1, p0, v0}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 22
    .line 23
    return-object p0
.end method

.method private final q()V
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
    new-instance v5, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v5, p0, v0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;Lm7/c;)V

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
    return-void
.end method

.method private final r()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;->recyclerViewChart:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->m()Lcom/zykj/study/adapter/ChartBarAdapter;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v1, v2, v3, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->r()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->q()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;->o()V

    .line 8
    .line 9
    .line 10
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_exercise_statistics_single_detail:I

    .line 2
    .line 3
    return v0
.end method

.method public final o()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;->LinearLayoutFinishPerson:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    const-string v1, "LinearLayoutFinishPerson"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lb5/m1;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Lb5/m1;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Le5/c;->r(Landroid/view/View;Lx7/l;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
