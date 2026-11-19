.class public final Lcom/zykj/study/ui/home/my/StudentExercisesFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_StudentExercisesFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/my/StudentExercisesFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_StudentExercisesFragment<",
        "Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public i:Lp4/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_StudentExercisesFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$c;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$c;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$viewModels$default$1;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 28
    .line 29
    new-instance v2, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$viewModels$default$2;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v1, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v2, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$viewModels$default$3;

    .line 45
    .line 46
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$viewModels$default$4;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 53
    .line 54
    .line 55
    new-instance v5, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$viewModels$default$5;

    .line 56
    .line 57
    invoke-direct {v5, p0, v0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v1, v2, v3, v5}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->g:Lh7/d;

    .line 65
    .line 66
    const-class v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v1, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$activityViewModels$default$1;

    .line 73
    .line 74
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 75
    .line 76
    .line 77
    new-instance v2, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$activityViewModels$default$2;

    .line 78
    .line 79
    invoke-direct {v2, v4, p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 80
    .line 81
    .line 82
    new-instance v3, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$activityViewModels$default$3;

    .line 83
    .line 84
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->h:Lh7/d;

    .line 92
    .line 93
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->v(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->s(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Lcom/zykj/study/bean/exercise/GroupStatistic;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->r(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Lcom/zykj/study/bean/exercise/GroupStatistic;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->u(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->t(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Lcom/zykj/study/bean/exercise/ExerciseBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->w(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Lcom/zykj/study/bean/exercise/ExerciseBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->z(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;)V

    return-void
.end method

.method public static synthetic n(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Ljava/util/List;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->y(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Ljava/util/List;Lm1/c;Lm1/a;I)V

    return-void
.end method

.method private final q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->h:Lh7/d;

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

.method public static final r(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Lcom/zykj/study/bean/exercise/GroupStatistic;)Lh7/p;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->tvUserName:Landroidx/appcompat/widget/AppCompatTextView;

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->k()Lcom/zykj/study/bean/teach/Member;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/zykj/study/bean/teach/Member;->getUserName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/GroupStatistic;->getQuestionGroups()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->p()Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 53
    .line 54
    return-object p0
.end method

.method public static final s(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->x(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final t(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Landroid/view/View;)V
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

.method public static final u(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->t()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->k()Lcom/zykj/study/bean/teach/Member;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->t()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 36
    .line 37
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->t()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Lcom/zykj/study/bean/teach/Member;

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->w(Lcom/zykj/study/bean/teach/Member;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static final v(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->t()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->k()Lcom/zykj/study/bean/teach/Member;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->t()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    add-int/lit8 v0, v0, -0x1

    .line 34
    .line 35
    if-ne p1, v0, :cond_0

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 40
    .line 41
    :goto_0
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->t()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Lcom/zykj/study/bean/teach/Member;

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->w(Lcom/zykj/study/bean/teach/Member;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static final w(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Lcom/zykj/study/bean/exercise/ExerciseBean;)Lh7/p;
    .locals 7

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
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 8
    .line 9
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 10
    .line 11
    sget p1, Lcom/zykj/study/R$layout;->layout_status_no_exercise:I

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/MultipleStatusView;->d(I)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getStatus()Lcom/zykj/study/bean/exercise/ExerciseType;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const/4 v0, -0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    sget-object v1, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$a;->a:[I

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    aget v0, v1, v0

    .line 34
    .line 35
    :goto_0
    const/4 v1, 0x1

    .line 36
    if-eq v0, v1, :cond_3

    .line 37
    .line 38
    const/4 v1, 0x2

    .line 39
    if-eq v0, v1, :cond_3

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getQuestions()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 56
    .line 57
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 58
    .line 59
    sget p1, Lcom/zykj/study/R$layout;->layout_status_exercise_on_going:I

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/MultipleStatusView;->d(I)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 72
    .line 73
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/zykj/study/view/MultipleStatusView;->f()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 83
    .line 84
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->fragmentStudentExercise:Landroidx/fragment/app/FragmentContainerView;

    .line 85
    .line 86
    const-string v0, "fragmentStudentExercise"

    .line 87
    .line 88
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-static {p0}, Landroidx/navigation/ViewKt;->findNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0}, Landroidx/navigation/NavController;->getNavInflater()Landroidx/navigation/NavInflater;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sget v1, Lcom/zykj/study/R$navigation;->nav_student_exercise:I

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroidx/navigation/NavInflater;->inflate(I)Landroidx/navigation/NavGraph;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sget-object v1, Lm4/l;->a:Lm4/l$c;

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getGroupId()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    const/4 v5, 0x4

    .line 112
    const/4 v6, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    move-object v2, p1

    .line 115
    invoke-static/range {v1 .. v6}, Lm4/l$c;->b(Lm4/l$c;Lcom/zykj/study/bean/exercise/ExerciseBean;IIILjava/lang/Object;)Landroidx/navigation/NavDirections;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-interface {p1}, Landroidx/navigation/NavDirections;->getArguments()Landroid/os/Bundle;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p0, v0, p1}, Landroidx/navigation/NavController;->setGraph(Landroidx/navigation/NavGraph;Landroid/os/Bundle;)V

    .line 124
    .line 125
    .line 126
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 127
    .line 128
    return-object p0

    .line 129
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 134
    .line 135
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 136
    .line 137
    sget p1, Lcom/zykj/study/R$layout;->layout_status_exercise_on_going:I

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/MultipleStatusView;->d(I)V

    .line 140
    .line 141
    .line 142
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 143
    .line 144
    return-object p0
.end method

.method public static final y(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Ljava/util/List;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    const-string p2, "<unused var>"

    .line 2
    .line 3
    invoke-static {p3, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->p()Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final z(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->p()Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->e()Landroidx/lifecycle/MutableLiveData;

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


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$initData$1;->c:I

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
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance v0, Lb5/t3;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Lb5/t3;-><init>(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$b;

    .line 76
    .line 77
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$b;-><init>(Lx7/l;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 81
    .line 82
    .line 83
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 84
    .line 85
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
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->p()Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->setViewModel(Lcom/zykj/study/viewmodels/StudentExercisesViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->o()Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->b()Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->setFromScore(Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 36
    .line 37
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->t()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    const/4 v0, 0x1

    .line 50
    if-le p2, v0, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 v0, 0x0

    .line 54
    :goto_0
    invoke-virtual {p1, v0}, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->setEnable(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 62
    .line 63
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->tvUserName:Landroidx/appcompat/widget/AppCompatTextView;

    .line 64
    .line 65
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->k()Lcom/zykj/study/bean/teach/Member;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p2}, Lcom/zykj/study/bean/teach/Member;->getUserName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 85
    .line 86
    new-instance p2, Lb5/u3;

    .line 87
    .line 88
    invoke-direct {p2, p0}, Lb5/u3;-><init>(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->setExamClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 99
    .line 100
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 101
    .line 102
    sget p2, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 103
    .line 104
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->o()Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {p2}, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->d()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->t(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    const/16 p2, 0x11

    .line 125
    .line 126
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->k(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    sget v0, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 135
    .line 136
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    sget v0, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 149
    .line 150
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    int-to-float p2, p2

    .line 155
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    new-instance p2, Lb5/v3;

    .line 160
    .line 161
    invoke-direct {p2, p0}, Lb5/v3;-><init>(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->p()Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->o()Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->c()I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->o()Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->a()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->o()Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->e()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->o()I

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->o()Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->b()Z

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->d(IILjava/lang/String;IZ)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 219
    .line 220
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->ivLast:Landroidx/appcompat/widget/AppCompatImageView;

    .line 221
    .line 222
    new-instance p2, Lb5/w3;

    .line 223
    .line 224
    invoke-direct {p2, p0}, Lb5/w3;-><init>(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    .line 235
    .line 236
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->ivNext:Landroidx/appcompat/widget/AppCompatImageView;

    .line 237
    .line 238
    new-instance p2, Lb5/x3;

    .line 239
    .line 240
    invoke-direct {p2, p0}, Lb5/x3;-><init>(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->p()Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    new-instance v0, Lb5/y3;

    .line 259
    .line 260
    invoke-direct {v0, p0}, Lb5/y3;-><init>(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;)V

    .line 261
    .line 262
    .line 263
    new-instance v1, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$b;

    .line 264
    .line 265
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment$b;-><init>(Lx7/l;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 269
    .line 270
    .line 271
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 272
    .line 273
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_student_exercises:I

    .line 2
    .line 3
    return v0
.end method

.method public final o()Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->q()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->t()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final p()Lcom/zykj/study/viewmodels/StudentExercisesViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final x(Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->p()Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/zykj/study/bean/exercise/GroupStatistic;

    .line 14
    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/study/bean/exercise/GroupStatistic;->getQuestionGroups()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_4

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "requireContext(...)"

    .line 34
    .line 35
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Ljava/util/ArrayList;

    .line 39
    .line 40
    const/16 v3, 0xa

    .line 41
    .line 42
    invoke-static {v0, v3}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 64
    .line 65
    new-instance v5, Lm1/a;

    .line 66
    .line 67
    invoke-virtual {v4}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getTitle()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    if-nez v4, :cond_0

    .line 72
    .line 73
    const-string v4, ""

    .line 74
    .line 75
    :cond_0
    invoke-direct {v5, v4}, Lm1/a;-><init>(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    new-instance v3, Lp4/t;

    .line 83
    .line 84
    invoke-direct {v3, v1, v2}, Lp4/t;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    sget v2, Lcom/zykj/lib/ui/R$dimen;->view_70:I

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    new-instance v2, Lb5/z3;

    .line 98
    .line 99
    invoke-direct {v2, p0, v0}, Lb5/z3;-><init>(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;Ljava/util/List;)V

    .line 100
    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    invoke-virtual {v3, v1, v0, v2}, Lp2/d;->z(IILp2/d$b;)Lp2/d;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lp4/t;

    .line 108
    .line 109
    const/4 v1, 0x1

    .line 110
    invoke-virtual {v0, v1}, Lp2/d;->B(Z)Lp2/d;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Lp4/t;

    .line 115
    .line 116
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->i:Lp4/t;

    .line 117
    .line 118
    if-eqz v0, :cond_2

    .line 119
    .line 120
    new-instance v1, Lb5/a4;

    .line 121
    .line 122
    invoke-direct {v1, p0}, Lb5/a4;-><init>(Lcom/zykj/study/ui/home/my/StudentExercisesFragment;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Lp2/a;->n(Landroid/widget/PopupWindow$OnDismissListener;)Lp2/a;

    .line 126
    .line 127
    .line 128
    :cond_2
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->i:Lp4/t;

    .line 129
    .line 130
    if-eqz v0, :cond_3

    .line 131
    .line 132
    invoke-virtual {v0, p1}, Lp4/t;->v(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragment;->p()Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 144
    .line 145
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_4
    return-void
.end method
