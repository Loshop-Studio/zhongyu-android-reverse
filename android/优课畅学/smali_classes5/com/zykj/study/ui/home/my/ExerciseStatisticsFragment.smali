.class public final Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_ExerciseStatisticsFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_ExerciseStatisticsFragment<",
        "Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public h:Lp4/y;

.field public final i:Ljava/util/List;

.field public final j:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_ExerciseStatisticsFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$b;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$b;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    const-class v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$special$$inlined$activityViewModels$default$1;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$special$$inlined$activityViewModels$default$2;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 37
    .line 38
    .line 39
    new-instance v3, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$special$$inlined$activityViewModels$default$3;

    .line 40
    .line 41
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->g:Lh7/d;

    .line 49
    .line 50
    new-instance v0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;

    .line 51
    .line 52
    invoke-direct {v0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;

    .line 56
    .line 57
    invoke-direct {v1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;-><init>()V

    .line 58
    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    new-array v2, v2, [Landroidx/fragment/app/Fragment;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    aput-object v0, v2, v3

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    aput-object v1, v2, v0

    .line 68
    .line 69
    invoke-static {v2}, Li7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->i:Ljava/util/List;

    .line 74
    .line 75
    new-instance v0, Lb5/a1;

    .line 76
    .line 77
    invoke-direct {v0, p0}, Lb5/a1;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->j:Lh7/d;

    .line 85
    .line 86
    return-void
.end method

.method public static final A(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Lcom/zykj/study/bean/teach/QuizScore;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    const-string p2, "<unused var>"

    .line 2
    .line 3
    invoke-static {p3, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/QuizScore;->getSuperviseGroups()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-interface {p3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-virtual {p2, p3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/QuizScore;->getSuperviseGroups()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getId()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {p0, p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->c(I)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static final B(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final C(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Landroid/view/View;)V
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

.method public static final D(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)Lcom/zykj/study/adapter/TitleListAdapter;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/adapter/TitleListAdapter;

    .line 2
    .line 3
    new-instance v1, Lb5/c1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lb5/c1;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/study/adapter/TitleListAdapter;-><init>(Lx7/p;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final E(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;ILcom/zykj/study/bean/teach/GetQuizDetailBean;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->e(ILcom/zykj/study/bean/teach/GetQuizDetailBean;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 14
    .line 15
    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->C(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Lcom/zykj/study/bean/teach/QuizScore;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->A(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Lcom/zykj/study/bean/teach/QuizScore;Lm1/c;Lm1/a;I)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->B(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)Lcom/zykj/study/adapter/TitleListAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->D(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)Lcom/zykj/study/adapter/TitleListAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Lcom/zykj/study/bean/teach/QuizScore;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->y(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Lcom/zykj/study/bean/teach/QuizScore;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->z(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->w(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;ILcom/zykj/study/bean/teach/GetQuizDetailBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->E(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;ILcom/zykj/study/bean/teach/GetQuizDetailBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)Lcom/zykj/study/adapter/TitleListAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->t()Lcom/zykj/study/adapter/TitleListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic p(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic q(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->F(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->g:Lh7/d;

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

.method private final v()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->tvCourseGroupName:Landroid/widget/TextView;

    .line 8
    .line 9
    new-instance v1, Lb5/d1;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lb5/d1;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final w(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->h:Lp4/y;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lp4/y;->v(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private final x()V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->p()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lb5/b1;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lb5/b1;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$a;

    .line 15
    .line 16
    invoke-direct {v2, v1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$a;-><init>(Lx7/l;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "getViewLifecycleOwner(...)"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v5, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$initObserver$2;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-direct {v5, p0, v0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$initObserver$2;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Lm7/c;)V

    .line 39
    .line 40
    .line 41
    const/4 v6, 0x3

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static final y(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Lcom/zykj/study/bean/teach/QuizScore;)Lh7/p;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

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
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/QuizScore;->getTitle()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->t(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget v2, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget v2, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    int-to-float v1, v1

    .line 52
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v1, Lb5/e1;

    .line 57
    .line 58
    invoke-direct {v1, p0}, Lb5/e1;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/QuizScore;->getSuperviseGroups()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_0

    .line 73
    .line 74
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/QuizScore;->getSuperviseGroups()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {v1}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-string v1, "requireContext(...)"

    .line 98
    .line 99
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/QuizScore;->getSuperviseGroups()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    new-instance v2, Ljava/util/ArrayList;

    .line 107
    .line 108
    const/16 v3, 0xa

    .line 109
    .line 110
    invoke-static {v1, v3}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_1

    .line 126
    .line 127
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    check-cast v3, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 132
    .line 133
    new-instance v4, Lm1/a;

    .line 134
    .line 135
    invoke-virtual {v3}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getName()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-direct {v4, v3}, Lm1/a;-><init>(Ljava/lang/CharSequence;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_1
    invoke-static {v2}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    new-instance v2, Lp4/y;

    .line 151
    .line 152
    invoke-direct {v2, v0, v1}, Lp4/y;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sget v1, Lcom/zykj/lib/ui/R$dimen;->view_100:I

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    new-instance v1, Lb5/f1;

    .line 166
    .line 167
    invoke-direct {v1, p0, p1}, Lb5/f1;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Lcom/zykj/study/bean/teach/QuizScore;)V

    .line 168
    .line 169
    .line 170
    const/4 p1, 0x0

    .line 171
    invoke-virtual {v2, v0, p1, v1}, Lp2/d;->z(IILp2/d$b;)Lp2/d;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    check-cast p1, Lp4/y;

    .line 176
    .line 177
    const/4 v0, 0x1

    .line 178
    invoke-virtual {p1, v0}, Lp2/d;->B(Z)Lp2/d;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    check-cast p1, Lp4/y;

    .line 183
    .line 184
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->h:Lp4/y;

    .line 185
    .line 186
    if-eqz p1, :cond_2

    .line 187
    .line 188
    const/4 v0, 0x2

    .line 189
    invoke-virtual {p1, v0}, Lp2/c;->s(I)Lp2/c;

    .line 190
    .line 191
    .line 192
    :cond_2
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->h:Lp4/y;

    .line 193
    .line 194
    if-eqz p1, :cond_3

    .line 195
    .line 196
    new-instance v0, Lb5/g1;

    .line 197
    .line 198
    invoke-direct {v0, p0}, Lb5/g1;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, v0}, Lp2/a;->n(Landroid/widget/PopupWindow$OnDismissListener;)Lp2/a;

    .line 202
    .line 203
    .line 204
    :cond_3
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 205
    .line 206
    return-object p0
.end method

.method public static final z(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Landroid/view/View;)V
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


# virtual methods
.method public final F(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/zykj/study/R$color;->divider:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget v2, Lcom/zykj/study/R$color;->transparent:I

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;

    .line 28
    .line 29
    iget-object v2, v2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->tvAllCondition:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;

    .line 40
    .line 41
    iget-object v2, v2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->tvAllCondition:Landroid/widget/TextView;

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 44
    .line 45
    .line 46
    :goto_0
    const/4 v2, 0x1

    .line 47
    if-ne p1, v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;

    .line 54
    .line 55
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->tvDoProblem:Landroid/widget/TextView;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;

    .line 66
    .line 67
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->tvDoProblem:Landroid/widget/TextView;

    .line 68
    .line 69
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->setViewModel(Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->z()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->r()V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->x()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->v()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;

    .line 35
    .line 36
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 37
    .line 38
    sget p2, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 39
    .line 40
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->p()Landroidx/lifecycle/MutableLiveData;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Lcom/zykj/study/bean/teach/QuizScore;

    .line 61
    .line 62
    if-eqz p2, :cond_0

    .line 63
    .line 64
    invoke-virtual {p2}, Lcom/zykj/study/bean/teach/QuizScore;->getTitle()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-nez p2, :cond_1

    .line 69
    .line 70
    :cond_0
    const-string p2, ""

    .line 71
    .line 72
    :cond_1
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->t(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    sget v0, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 81
    .line 82
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    sget v0, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 95
    .line 96
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    int-to-float p2, p2

    .line 101
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    new-instance p2, Lb5/z0;

    .line 106
    .line 107
    invoke-direct {p2, p0}, Lb5/z0;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;

    .line 118
    .line 119
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->viewPager:Landroidx/viewpager2/widget/ViewPager2;

    .line 120
    .line 121
    const/4 p2, 0x0

    .line 122
    invoke-virtual {p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 123
    .line 124
    .line 125
    const/4 p2, 0x2

    .line 126
    invoke-virtual {p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 127
    .line 128
    .line 129
    new-instance p2, Lcom/zykj/study/adapter/HomeFragmentAdapter;

    .line 130
    .line 131
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const-string v1, "getChildFragmentManager(...)"

    .line 136
    .line 137
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    const-string v2, "<get-lifecycle>(...)"

    .line 145
    .line 146
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->i:Ljava/util/List;

    .line 150
    .line 151
    invoke-direct {p2, v0, v1, v2}, Lcom/zykj/study/adapter/HomeFragmentAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;Ljava/util/List;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;

    .line 162
    .line 163
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->rv:Landroidx/recyclerview/widget/RecyclerView;

    .line 164
    .line 165
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 166
    .line 167
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 175
    .line 176
    .line 177
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 178
    .line 179
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->t()Lcom/zykj/study/adapter/TitleListAdapter;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 194
    .line 195
    .line 196
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 197
    .line 198
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_exercise_statistics:I

    .line 2
    .line 3
    return v0
.end method

.method public final r()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->s()Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->a()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->A(I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->s()Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->b()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->C(I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->s()Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->c()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {v0, v1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->D(I)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->s()Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->c()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->s()Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->b()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v0, v1, v2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->y(II)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->s()Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->c()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->s()Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->b()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v0, v1, v2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->v(II)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final s()Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final t()Lcom/zykj/study/adapter/TitleListAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->j:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/adapter/TitleListAdapter;

    .line 8
    .line 9
    return-object v0
.end method
