# RE note 本类字节码直接引用的读写或显示接口包括WebView。
.class public final Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;
.super Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseHistoryStudentFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseHistoryStudentFragment<",
        "Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public i:Lcom/zykj/study/adapter/MicroAdapter;

.field public final j:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseHistoryStudentFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$c;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$c;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$1;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 28
    .line 29
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$2;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v2, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$3;

    .line 45
    .line 46
    invoke-direct {v3, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$4;

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-direct {v4, v5, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 53
    .line 54
    .line 55
    new-instance v6, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$5;

    .line 56
    .line 57
    invoke-direct {v6, p0, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v6}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->g:Lh7/d;

    .line 65
    .line 66
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$6;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$6;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 69
    .line 70
    .line 71
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$7;

    .line 72
    .line 73
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$7;-><init>(Lx7/a;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-class v1, Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 81
    .line 82
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$8;

    .line 87
    .line 88
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$8;-><init>(Lh7/d;)V

    .line 89
    .line 90
    .line 91
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$9;

    .line 92
    .line 93
    invoke-direct {v3, v5, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$9;-><init>(Lx7/a;Lh7/d;)V

    .line 94
    .line 95
    .line 96
    new-instance v4, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$10;

    .line 97
    .line 98
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$10;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->h:Lh7/d;

    .line 106
    .line 107
    new-instance v0, Lw4/s;

    .line 108
    .line 109
    invoke-direct {v0, p0}, Lw4/s;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->j:Lh7/d;

    .line 117
    .line 118
    return-void
.end method

.method public static final A(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)Lh7/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/bean/exercise/QuestionBean;->getAnswerEx()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/zykj/study/ui/home/exercise/c;->a:Lcom/zykj/study/ui/home/exercise/c$b;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/exercise/c$b;->b(Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1, p0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 21
    .line 22
    return-object p0
.end method

.method public static final B(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/SelectModel;I)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p2}, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;->u(I)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 14
    .line 15
    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->A(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->x(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$adapterDataObserver$2$1;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->q(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$adapterDataObserver$2$1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/SelectModel;I)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->B(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/SelectModel;I)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/exercise/QuestionGroupBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->y(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/exercise/QuestionGroupBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->w(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/study/bean/exercise/QuestionGroupBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->z(Lcom/zykj/study/bean/exercise/QuestionGroupBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->t()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic o(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic p(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)Lcom/zykj/study/adapter/MicroAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->i:Lcom/zykj/study/adapter/MicroAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final q(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$adapterDataObserver$2$1;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$adapterDataObserver$2$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$adapterDataObserver$2$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final r(Landroidx/recyclerview/widget/RecyclerView;)V
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

.method private final v()Lcom/zykj/study/viewmodels/WebViewControlViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->h:Lh7/d;

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

.method public static final w(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
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
    sget-object v0, Lcom/zykj/study/ui/home/exercise/c;->a:Lcom/zykj/study/ui/home/exercise/c$b;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/MicroBean;->getUrl()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lcom/zykj/study/ui/home/exercise/c$b;->a(Ljava/lang/String;)Landroidx/navigation/NavDirections;

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

.method public static final x(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1}, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;->u(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 19
    .line 20
    return-object p0
.end method

.method public static final y(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/exercise/QuestionGroupBean;)Lh7/p;
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionGroupBean;->getRounds()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/zykj/study/bean/exercise/RoundBean;

    .line 10
    .line 11
    if-eqz v0, :cond_c

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/study/bean/exercise/RoundBean;->getQuestions()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_c

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->multipleChoiceView:Lcom/zykj/study/view/MultipleChoiceAnimationView;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/zykj/study/view/MultipleChoiceAnimationView;->b()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 35
    .line 36
    iget-object v1, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->multipleChoiceView:Lcom/zykj/study/view/MultipleChoiceAnimationView;

    .line 37
    .line 38
    new-instance v2, Ld8/f;

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const/4 v4, 0x1

    .line 45
    invoke-direct {v2, v4, v3}, Ld8/f;-><init>(II)V

    .line 46
    .line 47
    .line 48
    new-instance v3, Ljava/util/ArrayList;

    .line 49
    .line 50
    const/16 v5, 0xa

    .line 51
    .line 52
    invoke-static {v2, v5}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_0

    .line 68
    .line 69
    move-object v6, v2

    .line 70
    check-cast v6, Li7/m0;

    .line 71
    .line 72
    invoke-virtual {v6}, Li7/m0;->nextInt()I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    invoke-static {v3}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v1, v2}, Lcom/zykj/study/view/MultipleChoiceAnimationView;->setOptionList(Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 104
    .line 105
    if-eqz v1, :cond_1

    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 112
    .line 113
    iget-object v2, v2, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->multipleChoiceView:Lcom/zykj/study/view/MultipleChoiceAnimationView;

    .line 114
    .line 115
    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {v2, v1}, Lcom/zykj/study/view/MultipleChoiceAnimationView;->setSelectedIndex(I)V

    .line 120
    .line 121
    .line 122
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->t()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;->a()Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getQuestions()Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    new-instance v2, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_5

    .line 148
    .line 149
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    move-object v6, v3

    .line 154
    check-cast v6, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    if-eqz v8, :cond_4

    .line 165
    .line 166
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    move-object v9, v8

    .line 171
    check-cast v9, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 172
    .line 173
    invoke-virtual {v9}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    invoke-virtual {v6}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v10

    .line 181
    invoke-static {v9, v10}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    if-eqz v9, :cond_3

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_4
    const/4 v8, 0x0

    .line 189
    :goto_2
    if-eqz v8, :cond_2

    .line 190
    .line 191
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_5
    invoke-static {v2}, Li7/f0;->c1(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    new-instance v1, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_7

    .line 213
    .line 214
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    move-object v3, v2

    .line 219
    check-cast v3, Li7/j0;

    .line 220
    .line 221
    invoke-virtual {v3}, Li7/j0;->b()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    check-cast v3, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 226
    .line 227
    invoke-virtual {v3}, Lcom/zykj/study/bean/exercise/QuestionBean;->getStatus()Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    sget-object v6, Lcom/zykj/study/bean/exercise/QuestionStatus;->UN_ANSWERED:Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 232
    .line 233
    if-eq v3, v6, :cond_6

    .line 234
    .line 235
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 240
    .line 241
    invoke-static {v1, v5}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 246
    .line 247
    .line 248
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_8

    .line 257
    .line 258
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    check-cast v3, Li7/j0;

    .line 263
    .line 264
    invoke-virtual {v3}, Li7/j0;->a()I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    add-int/2addr v3, v4

    .line 269
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_8
    invoke-static {v0}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    check-cast v2, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 286
    .line 287
    iget-object v2, v2, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->multipleChoiceView:Lcom/zykj/study/view/MultipleChoiceAnimationView;

    .line 288
    .line 289
    invoke-virtual {v2, v0}, Lcom/zykj/study/view/MultipleChoiceAnimationView;->setAnswerList(Ljava/util/List;)V

    .line 290
    .line 291
    .line 292
    new-instance v0, Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    :cond_9
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-eqz v2, :cond_a

    .line 306
    .line 307
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    move-object v3, v2

    .line 312
    check-cast v3, Li7/j0;

    .line 313
    .line 314
    invoke-virtual {v3}, Li7/j0;->b()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    check-cast v3, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 319
    .line 320
    invoke-virtual {v3}, Lcom/zykj/study/bean/exercise/QuestionBean;->getCorrect()Z

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    if-eqz v3, :cond_9

    .line 325
    .line 326
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_a
    new-instance v1, Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-static {v0, v5}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 337
    .line 338
    .line 339
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    if-eqz v2, :cond_b

    .line 348
    .line 349
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    check-cast v2, Li7/j0;

    .line 354
    .line 355
    invoke-virtual {v2}, Li7/j0;->a()I

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    add-int/2addr v2, v4

    .line 360
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_b
    invoke-static {v1}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    check-cast v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 377
    .line 378
    iget-object v1, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->multipleChoiceView:Lcom/zykj/study/view/MultipleChoiceAnimationView;

    .line 379
    .line 380
    invoke-virtual {v1, v0}, Lcom/zykj/study/view/MultipleChoiceAnimationView;->setRightOptionList(Ljava/util/List;)V

    .line 381
    .line 382
    .line 383
    :cond_c
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    new-instance v2, Lw4/v;

    .line 396
    .line 397
    invoke-direct {v2, p1, p0}, Lw4/v;-><init>(Lcom/zykj/study/bean/exercise/QuestionGroupBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)V

    .line 398
    .line 399
    .line 400
    new-instance p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$b;

    .line 401
    .line 402
    invoke-direct {p0, v2}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$b;-><init>(Lx7/l;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0, v1, p0}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 406
    .line 407
    .line 408
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 409
    .line 410
    return-object p0
.end method

.method public static final z(Lcom/zykj/study/bean/exercise/QuestionGroupBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/bean/exercise/QuestionGroupBean;->getRounds()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/zykj/study/bean/exercise/RoundBean;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p0, :cond_b

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/study/bean/exercise/RoundBean;->getQuestions()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_b

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    move-object v2, v1

    .line 35
    check-cast v2, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v1, v0

    .line 53
    :goto_0
    check-cast v1, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 54
    .line 55
    if-eqz v1, :cond_b

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 62
    .line 63
    iget-object p0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 64
    .line 65
    iget-object p0, p0, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webView:Lcom/zykj/study/view/CustomWebView;

    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->fetchAdaptContent()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const-string v2, "text/html; charset=UTF-8"

    .line 72
    .line 73
    invoke-virtual {p0, v1, v2, v0}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 81
    .line 82
    iget-object p0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 83
    .line 84
    iget-object p0, p0, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webViewCorrectAnswer:Lcom/zykj/study/view/CustomWebView;

    .line 85
    .line 86
    invoke-virtual {p2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getAdaptStandardAnswerStr()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {p0, v1, v2, v0}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 98
    .line 99
    iget-object p0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 100
    .line 101
    iget-object p0, p0, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webViewAnalysis:Lcom/zykj/study/view/CustomWebView;

    .line 102
    .line 103
    invoke-virtual {p2}, Lcom/zykj/study/bean/exercise/QuestionBean;->fetchAdaptAnalysis()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {p0, v1, v2, v0}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getQuestionType()Lcom/zykj/study/bean/exercise/QuestionType;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-nez p0, :cond_2

    .line 115
    .line 116
    const/4 p0, -0x1

    .line 117
    goto :goto_1

    .line 118
    :cond_2
    sget-object v1, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$a;->a:[I

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    aget p0, v1, p0

    .line 125
    .line 126
    :goto_1
    const/4 v1, 0x1

    .line 127
    if-eq p0, v1, :cond_8

    .line 128
    .line 129
    const/4 v1, 0x2

    .line 130
    if-eq p0, v1, :cond_3

    .line 131
    .line 132
    const/4 v1, 0x3

    .line 133
    if-eq p0, v1, :cond_3

    .line 134
    .line 135
    goto/16 :goto_4

    .line 136
    .line 137
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    check-cast p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 142
    .line 143
    iget-object p0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 144
    .line 145
    iget-object p0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->viewChoice:Lcom/zykj/study/databinding/ViewChoiceBinding;

    .line 146
    .line 147
    iget-object p0, p0, Lcom/zykj/study/databinding/ViewChoiceBinding;->recycler:Lcom/zykj/study/view/MultipleChoiceView;

    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/zykj/study/view/MultipleChoiceView;->b()V

    .line 150
    .line 151
    .line 152
    sget-object v1, Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;->e:Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;

    .line 153
    .line 154
    invoke-virtual {p0, v1}, Lcom/zykj/study/view/MultipleChoiceView;->setJudgingStatus(Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getExtra()Lcom/zykj/study/bean/exercise/QuestionExtra;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    if-eqz v1, :cond_4

    .line 162
    .line 163
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionExtra;->getOptions()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-eqz v1, :cond_4

    .line 168
    .line 169
    invoke-virtual {p0, v1}, Lcom/zykj/study/view/MultipleChoiceView;->setOptionList(Ljava/util/List;)V

    .line 170
    .line 171
    .line 172
    :cond_4
    invoke-virtual {p2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getStandardAnswerList()Lcom/zykj/study/utils/ChoiceList;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {p0, v1}, Lcom/zykj/study/view/MultipleChoiceView;->setRightOptionList(Ljava/util/List;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->t()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;->a()Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-virtual {p0}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getQuestions()Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_6

    .line 200
    .line 201
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    move-object v2, v1

    .line 206
    check-cast v2, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 207
    .line 208
    invoke-virtual {v2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {p2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-eqz v2, :cond_5

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_6
    move-object v1, v0

    .line 224
    :goto_2
    check-cast v1, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 225
    .line 226
    if-nez v1, :cond_7

    .line 227
    .line 228
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    check-cast p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 233
    .line 234
    iget-object p0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 235
    .line 236
    iget-object p0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->viewChoice:Lcom/zykj/study/databinding/ViewChoiceBinding;

    .line 237
    .line 238
    iget-object p0, p0, Lcom/zykj/study/databinding/ViewChoiceBinding;->recycler:Lcom/zykj/study/view/MultipleChoiceView;

    .line 239
    .line 240
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {p0, v1}, Lcom/zykj/study/view/MultipleChoiceView;->setAnswerList(Ljava/util/List;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_4

    .line 248
    .line 249
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    check-cast p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 254
    .line 255
    iget-object p0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 256
    .line 257
    iget-object p0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->viewChoice:Lcom/zykj/study/databinding/ViewChoiceBinding;

    .line 258
    .line 259
    iget-object p0, p0, Lcom/zykj/study/databinding/ViewChoiceBinding;->recycler:Lcom/zykj/study/view/MultipleChoiceView;

    .line 260
    .line 261
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getAnswerSubmit()Lcom/zykj/study/utils/ChoiceList;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {p0, v1}, Lcom/zykj/study/view/MultipleChoiceView;->setAnswerList(Ljava/util/List;)V

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_8
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->t()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;->a()Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-virtual {p0}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getQuestions()Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-eqz v1, :cond_a

    .line 290
    .line 291
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    move-object v2, v1

    .line 296
    check-cast v2, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 297
    .line 298
    invoke-virtual {v2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-virtual {p2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    if-eqz v2, :cond_9

    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_a
    move-object v1, v0

    .line 314
    :goto_3
    check-cast v1, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 315
    .line 316
    if-eqz v1, :cond_b

    .line 317
    .line 318
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    invoke-static {p0}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getAnswerEx()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {p0, v2}, Lcom/bumptech/glide/h;->u(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    check-cast v2, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 339
    .line 340
    iget-object v2, v2, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 341
    .line 342
    iget-object v2, v2, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->myAnswerMicro:Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

    .line 343
    .line 344
    iget-object v2, v2, Lcom/zykj/study/databinding/ViewAnswerMicroBinding;->ivSnapshot:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 345
    .line 346
    invoke-virtual {p0, v2}, Lcom/bumptech/glide/g;->w0(Landroid/widget/ImageView;)Le0/j;

    .line 347
    .line 348
    .line 349
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    check-cast p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 354
    .line 355
    iget-object p0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 356
    .line 357
    iget-object p0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->myAnswerMicro:Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

    .line 358
    .line 359
    iget-object p0, p0, Lcom/zykj/study/databinding/ViewAnswerMicroBinding;->ivSnapshot:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 360
    .line 361
    const-string v2, "ivSnapshot"

    .line 362
    .line 363
    invoke-static {p0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    new-instance v2, Lw4/w;

    .line 367
    .line 368
    invoke-direct {v2, v1, p1}, Lw4/w;-><init>(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)V

    .line 369
    .line 370
    .line 371
    invoke-static {p0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 372
    .line 373
    .line 374
    :cond_b
    :goto_4
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    const-string v1, "getViewLifecycleOwner(...)"

    .line 379
    .line 380
    invoke-static {p0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    new-instance v5, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$initView$4$2$3;

    .line 388
    .line 389
    invoke-direct {v5, p1, p2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$initView$4$2$3;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/exercise/QuestionBean;Lm7/c;)V

    .line 390
    .line 391
    .line 392
    const/4 v6, 0x3

    .line 393
    const/4 v7, 0x0

    .line 394
    const/4 v3, 0x0

    .line 395
    const/4 v4, 0x0

    .line 396
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 397
    .line 398
    .line 399
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 400
    .line 401
    return-object p0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$initData$1;->c:I

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
    new-instance v0, Lw4/q;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lw4/q;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, v0}, Lcom/zykj/study/adapter/MicroAdapter;-><init>(Lx7/l;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->i:Lcom/zykj/study/adapter/MicroAdapter;

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->t()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;->a()Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;->v(Lcom/zykj/study/bean/exercise/ExerciseBean;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->t()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;->b()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;->w(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    new-instance v0, Lw4/r;

    .line 113
    .line 114
    invoke-direct {v0, p0}, Lw4/r;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)V

    .line 115
    .line 116
    .line 117
    new-instance v1, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$b;

    .line 118
    .line 119
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$b;-><init>(Lx7/l;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 123
    .line 124
    .line 125
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 126
    .line 127
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
    check-cast p1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 10
    .line 11
    iget-object p1, p1, Lcom/zykj/study/databinding/ViewMicroBinding;->includeChartDetails:Lcom/zykj/study/databinding/LayoutChartDetailsBinding;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutChartDetailsBinding;->parentLayout:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 14
    .line 15
    const-string p2, "parentLayout"

    .line 16
    .line 17
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/16 p2, 0x8

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->setEntity(Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->v()Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->setWebViewControlViewModel(Lcom/zykj/study/viewmodels/WebViewControlViewModel;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 56
    .line 57
    invoke-static {}, Lcom/zykj/lib/login/proto/UserBean;->newBuilder()Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p2}, Lcom/zykj/lib/login/proto/UserBean$Builder;->getRole()Lcom/zykj/lib/login/proto/RoleType;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    sget-object v0, Lcom/zykj/lib/login/proto/RoleType;->Teacher:Lcom/zykj/lib/login/proto/RoleType;

    .line 66
    .line 67
    if-ne p2, v0, :cond_0

    .line 68
    .line 69
    const/4 p2, 0x1

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const/4 p2, 0x0

    .line 72
    :goto_0
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->setIsTeacher(Z)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->v()Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/WebViewControlViewModel;->c()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 87
    .line 88
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 89
    .line 90
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 91
    .line 92
    iget-object p1, p1, Lcom/zykj/study/databinding/ViewMicroBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 93
    .line 94
    iget-object p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->i:Lcom/zykj/study/adapter/MicroAdapter;

    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    const-string v1, "microAdapter"

    .line 98
    .line 99
    if-nez p2, :cond_1

    .line 100
    .line 101
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    move-object p2, v0

    .line 105
    :cond_1
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 106
    .line 107
    .line 108
    iget-object p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->i:Lcom/zykj/study/adapter/MicroAdapter;

    .line 109
    .line 110
    if-nez p2, :cond_2

    .line 111
    .line 112
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    move-object v0, p2

    .line 117
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->s()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$adapterDataObserver$2$1;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 122
    .line 123
    .line 124
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->r(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 135
    .line 136
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 137
    .line 138
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webView:Lcom/zykj/study/view/CustomWebView;

    .line 139
    .line 140
    sget-object p2, Le5/e;->a:Le5/e;

    .line 141
    .line 142
    invoke-virtual {p2}, Le5/e;->d()Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {p1, v0}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2}, Le5/e;->a()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {p1, v0}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2}, Le5/e;->b()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-static {p2}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-virtual {p1, p2}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->u()Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;->s()Landroidx/lifecycle/MutableLiveData;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    new-instance v0, Lw4/t;

    .line 180
    .line 181
    invoke-direct {v0, p0}, Lw4/t;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)V

    .line 182
    .line 183
    .line 184
    new-instance v1, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$b;

    .line 185
    .line 186
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$b;-><init>(Lx7/l;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;

    .line 197
    .line 198
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->multipleChoiceView:Lcom/zykj/study/view/MultipleChoiceAnimationView;

    .line 199
    .line 200
    new-instance p2, Lw4/u;

    .line 201
    .line 202
    invoke-direct {p2, p0}, Lw4/u;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, p2}, Lcom/zykj/study/view/MultipleChoiceAnimationView;->setItemClickListener(Lx7/p;)V

    .line 206
    .line 207
    .line 208
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 209
    .line 210
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->item_exercise_student_history:I

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
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->i:Lcom/zykj/study/adapter/MicroAdapter;

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
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->s()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$adapterDataObserver$2$1;

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

.method public final s()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$adapterDataObserver$2$1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->j:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment$adapterDataObserver$2$1;

    .line 8
    .line 9
    return-object v0
.end method

.method public final t()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final u()Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 8
    .line 9
    return-object v0
.end method
