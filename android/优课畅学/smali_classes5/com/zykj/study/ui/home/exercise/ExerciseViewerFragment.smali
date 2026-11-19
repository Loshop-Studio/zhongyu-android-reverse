# RE note 本类字节码直接引用的读写或显示接口包括WebView。
.class public final Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;
.super Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseViewerFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseViewerFragment<",
        "Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public final i:Lh7/d;

.field public j:Lcom/zykj/study/adapter/MicroEditAdapter;

.field public k:Lcom/zykj/study/adapter/MicroViewAdapter;

.field public final l:Lh7/d;

.field public final m:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseViewerFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$b;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$b;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$1;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 28
    .line 29
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$2;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v2, Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$3;

    .line 45
    .line 46
    invoke-direct {v3, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$4;

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-direct {v4, v5, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 53
    .line 54
    .line 55
    new-instance v6, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$5;

    .line 56
    .line 57
    invoke-direct {v6, p0, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v6}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->g:Lh7/d;

    .line 65
    .line 66
    const-class v0, Lcom/zykj/study/viewmodels/MicroExtraViewModel;

    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$activityViewModels$default$1;

    .line 73
    .line 74
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 75
    .line 76
    .line 77
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$activityViewModels$default$2;

    .line 78
    .line 79
    invoke-direct {v3, v5, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 80
    .line 81
    .line 82
    new-instance v4, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$activityViewModels$default$3;

    .line 83
    .line 84
    invoke-direct {v4, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v0, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->h:Lh7/d;

    .line 92
    .line 93
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$6;

    .line 94
    .line 95
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$6;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 96
    .line 97
    .line 98
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$7;

    .line 99
    .line 100
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$7;-><init>(Lx7/a;)V

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
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$8;

    .line 114
    .line 115
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$8;-><init>(Lh7/d;)V

    .line 116
    .line 117
    .line 118
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$9;

    .line 119
    .line 120
    invoke-direct {v3, v5, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$9;-><init>(Lx7/a;Lh7/d;)V

    .line 121
    .line 122
    .line 123
    new-instance v4, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$10;

    .line 124
    .line 125
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$special$$inlined$viewModels$default$10;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 126
    .line 127
    .line 128
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->i:Lh7/d;

    .line 133
    .line 134
    new-instance v0, Lw4/x0;

    .line 135
    .line 136
    invoke-direct {v0, p0}, Lw4/x0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->l:Lh7/d;

    .line 144
    .line 145
    new-instance v0, Lw4/y0;

    .line 146
    .line 147
    invoke-direct {v0, p0}, Lw4/y0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->m:Lh7/d;

    .line 155
    .line 156
    return-void
.end method

.method public static final synthetic A(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->a0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final B(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$adapterDataObserver$2$1;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$adapterDataObserver$2$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$adapterDataObserver$2$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final C(Landroidx/recyclerview/widget/RecyclerView;)V
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

.method public static final D(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lcom/zykj/study/adapter/ChartBarAdapter;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/adapter/ChartBarAdapter;

    .line 2
    .line 3
    new-instance v1, Lw4/o0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lw4/o0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/study/adapter/ChartBarAdapter;-><init>(Lx7/l;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final E(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/teach/ChoiceChartData;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "entity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->I()Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->b(Lcom/zykj/study/bean/teach/ChoiceChartData;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 14
    .line 15
    return-object p0
.end method

.method private final K()Lcom/zykj/study/viewmodels/WebViewControlViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->i:Lh7/d;

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

.method public static final L(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Ljava/util/List;)Lh7/p;
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 12
    .line 13
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/study/view/MultipleStatusView;->h()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->I()Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->G()Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->b()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;->v(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 39
    .line 40
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/zykj/study/view/MultipleStatusView;->f()V

    .line 43
    .line 44
    .line 45
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 46
    .line 47
    return-object p0
.end method

.method public static final M(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
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
    sget-object v0, Lcom/zykj/study/ui/home/exercise/e;->a:Lcom/zykj/study/ui/home/exercise/e$c;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/MicroBean;->getUrl()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lcom/zykj/study/ui/home/exercise/e$c;->b(Ljava/lang/String;)Landroidx/navigation/NavDirections;

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

.method public static final N(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->I()Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->G()Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->a()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v1, v0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->Y(ILjava/lang/String;Lcom/zykj/study/bean/exercise/MicroBean;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 38
    .line 39
    return-object p0
.end method

.method public static final O(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lh7/p;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->I()Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

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
    check-cast v0, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->J()Lcom/zykj/study/viewmodels/MicroExtraViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0}, Lcom/zykj/study/bean/exercise/QuestionBean;->getContent()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Lcom/zykj/study/viewmodels/MicroExtraViewModel;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget-object v2, Lcom/zykj/study/ui/home/exercise/e;->a:Lcom/zykj/study/ui/home/exercise/e$c;

    .line 33
    .line 34
    new-instance v3, Ljava/io/File;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-nez v4, :cond_1

    .line 51
    .line 52
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const-string v4, "getAbsolutePath(...)"

    .line 80
    .line 81
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->G()Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->a()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-virtual {v0}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v2, v3, p0, v0}, Lcom/zykj/study/ui/home/exercise/e$c;->a(Ljava/lang/String;ILjava/lang/String;)Landroidx/navigation/NavDirections;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {v1, p0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 104
    .line 105
    return-object p0
.end method

.method public static final P(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
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
    sget-object v0, Lcom/zykj/study/ui/home/exercise/e;->a:Lcom/zykj/study/ui/home/exercise/e$c;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/MicroBean;->getUrl()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lcom/zykj/study/ui/home/exercise/e$c;->b(Ljava/lang/String;)Landroidx/navigation/NavDirections;

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

.method public static final Q(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->a0()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final S(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Ljava/lang/String;)Lh7/p;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->t(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget v0, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget v1, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 28
    .line 29
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget v1, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    int-to-float v0, v0

    .line 48
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v0, Lw4/q0;

    .line 53
    .line 54
    invoke-direct {v0, p0}, Lw4/q0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 58
    .line 59
    .line 60
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 61
    .line 62
    return-object p0
.end method

.method public static final T(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Landroid/view/View;)V
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

.method public static final U(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webView:Lcom/zykj/study/view/CustomWebView;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->fetchAdaptContent()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "text/html; charset=UTF-8"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webViewCorrectAnswer:Lcom/zykj/study/view/CustomWebView;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getAdaptStandardAnswerStr()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webViewAnalysis:Lcom/zykj/study/view/CustomWebView;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->fetchAdaptAnalysis()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, p1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->a0()V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 59
    .line 60
    return-object p0
.end method

.method public static final V(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->j()V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 13
    .line 14
    return-object p0
.end method

.method private final W()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/zykj/study/databinding/ViewMicroBinding;->includeChartDetails:Lcom/zykj/study/databinding/LayoutChartDetailsBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutChartDetailsBinding;->recyclerViewChart:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->H()Lcom/zykj/study/adapter/ChartBarAdapter;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v1, v2, v3, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static final X(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Landroid/view/View;)V
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

.method public static final Z(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;ILjava/lang/String;Lcom/zykj/study/bean/exercise/MicroBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 6

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    const-string p5, "getViewLifecycleOwner(...)"

    .line 14
    .line 15
    invoke-static {p4, p5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p4}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;

    .line 23
    .line 24
    const/4 p5, 0x0

    .line 25
    move-object p4, p3

    .line 26
    move-object p3, p2

    .line 27
    move p2, p1

    .line 28
    move-object p1, p0

    .line 29
    move-object p0, v3

    .line 30
    invoke-direct/range {p0 .. p5}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;ILjava/lang/String;Lcom/zykj/study/bean/exercise/MicroBean;Lm7/c;)V

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v1, 0x0

    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->Q(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->T(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$adapterDataObserver$2$1;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->B(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$adapterDataObserver$2$1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->N(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/teach/ChoiceChartData;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->E(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/teach/ChoiceChartData;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->U(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->S(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->X(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->P(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->L(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->M(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lcom/zykj/study/adapter/ChartBarAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->D(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lcom/zykj/study/adapter/ChartBarAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->O(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->V(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Ljava/lang/Integer;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;ILjava/lang/String;Lcom/zykj/study/bean/exercise/MicroBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->Z(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;ILjava/lang/String;Lcom/zykj/study/bean/exercise/MicroBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static final synthetic v(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->G()Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic w(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lcom/zykj/study/adapter/ChartBarAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->H()Lcom/zykj/study/adapter/ChartBarAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic x(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->I()Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic y(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lcom/zykj/study/adapter/MicroEditAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->j:Lcom/zykj/study/adapter/MicroEditAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic z(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lcom/zykj/study/adapter/MicroViewAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->k:Lcom/zykj/study/adapter/MicroViewAdapter;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final F()Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$adapterDataObserver$2$1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->l:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$adapterDataObserver$2$1;

    .line 8
    .line 9
    return-object v0
.end method

.method public final G()Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final H()Lcom/zykj/study/adapter/ChartBarAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->m:Lh7/d;

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

.method public final I()Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final J()Lcom/zykj/study/viewmodels/MicroExtraViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->h:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/MicroExtraViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final R()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->I()Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;->t()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lw4/z0;

    .line 14
    .line 15
    invoke-direct {v2, p0}, Lw4/z0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$a;

    .line 19
    .line 20
    invoke-direct {v3, v2}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$a;-><init>(Lx7/l;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->I()Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Lw4/m0;

    .line 39
    .line 40
    invoke-direct {v2, p0}, Lw4/m0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 41
    .line 42
    .line 43
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$a;

    .line 44
    .line 45
    invoke-direct {v3, v2}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$a;-><init>(Lx7/l;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->I()Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    new-instance v2, Lw4/n0;

    .line 64
    .line 65
    invoke-direct {v2, p0}, Lw4/n0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 66
    .line 67
    .line 68
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$a;

    .line 69
    .line 70
    invoke-direct {v3, v2}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$a;-><init>(Lx7/l;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, "getViewLifecycleOwner(...)"

    .line 81
    .line 82
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    new-instance v5, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4;

    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    invoke-direct {v5, p0, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lm7/c;)V

    .line 93
    .line 94
    .line 95
    const/4 v6, 0x3

    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v3, 0x0

    .line 98
    const/4 v4, 0x0

    .line 99
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    new-instance v6, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$5;

    .line 114
    .line 115
    invoke-direct {v6, p0, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$5;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lm7/c;)V

    .line 116
    .line 117
    .line 118
    const/4 v7, 0x3

    .line 119
    const/4 v8, 0x0

    .line 120
    const/4 v5, 0x0

    .line 121
    invoke-static/range {v3 .. v8}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public final Y(ILjava/lang/String;Lcom/zykj/study/bean/exercise/MicroBean;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sget v1, Lcom/zykj/study/R$string;->is_delete_exercise_micro:I

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget v1, Lcom/zykj/study/R$string;->cancel:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget v1, Lcom/zykj/study/R$string;->sure:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Lw4/p0;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1, p2, p3}, Lw4/p0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;ILjava/lang/String;Lcom/zykj/study/bean/exercise/MicroBean;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final a0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->I()Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

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
    check-cast v0, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "getViewLifecycleOwner(...)"

    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    new-instance v6, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$updateMicroList$1$1;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v6, p0, v0, v1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$updateMicroList$1$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/exercise/QuestionBean;Lm7/c;)V

    .line 34
    .line 35
    .line 36
    const/4 v7, 0x3

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-static/range {v3 .. v8}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initData$1;->c:I

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
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->I()Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->G()Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->a()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;->u(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->I()Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v0, Lw4/r0;

    .line 86
    .line 87
    invoke-direct {v0, p0}, Lw4/r0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 88
    .line 89
    .line 90
    new-instance v1, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$a;

    .line 91
    .line 92
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$a;-><init>(Lx7/l;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 96
    .line 97
    .line 98
    new-instance p1, Lcom/zykj/study/adapter/MicroEditAdapter;

    .line 99
    .line 100
    new-instance v0, Lw4/s0;

    .line 101
    .line 102
    invoke-direct {v0, p0}, Lw4/s0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 103
    .line 104
    .line 105
    new-instance v1, Lw4/t0;

    .line 106
    .line 107
    invoke-direct {v1, p0}, Lw4/t0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 108
    .line 109
    .line 110
    new-instance v2, Lw4/u0;

    .line 111
    .line 112
    invoke-direct {v2, p0}, Lw4/u0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 113
    .line 114
    .line 115
    invoke-direct {p1, v0, v1, v2}, Lcom/zykj/study/adapter/MicroEditAdapter;-><init>(Lx7/l;Lx7/l;Lx7/a;)V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->j:Lcom/zykj/study/adapter/MicroEditAdapter;

    .line 119
    .line 120
    new-instance p1, Lcom/zykj/study/adapter/MicroViewAdapter;

    .line 121
    .line 122
    new-instance v0, Lw4/v0;

    .line 123
    .line 124
    invoke-direct {v0, p0}, Lw4/v0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p1, v0}, Lcom/zykj/study/adapter/MicroViewAdapter;-><init>(Lx7/l;)V

    .line 128
    .line 129
    .line 130
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->k:Lcom/zykj/study/adapter/MicroViewAdapter;

    .line 131
    .line 132
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1}, Landroidx/navigation/NavController;->getCurrentBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-eqz p1, :cond_4

    .line 141
    .line 142
    invoke-virtual {p1}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-eqz p1, :cond_4

    .line 147
    .line 148
    const-string v0, "result_zip_url"

    .line 149
    .line 150
    invoke-virtual {p1, v0}, Landroidx/lifecycle/SavedStateHandle;->getLiveData(Ljava/lang/String;)Landroidx/lifecycle/MutableLiveData;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-eqz p1, :cond_4

    .line 155
    .line 156
    new-instance v0, Lw4/w0;

    .line 157
    .line 158
    invoke-direct {v0, p0}, Lw4/w0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 159
    .line 160
    .line 161
    new-instance v1, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$a;

    .line 162
    .line 163
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$a;-><init>(Lx7/l;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 167
    .line 168
    .line 169
    :cond_4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 170
    .line 171
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->W()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->R()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->I()Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->setEntity(Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 25
    .line 26
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->K()Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->setWebViewControlViewModel(Lcom/zykj/study/viewmodels/WebViewControlViewModel;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->K()Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/WebViewControlViewModel;->c()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 47
    .line 48
    sget p2, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 49
    .line 50
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    sget v0, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 63
    .line 64
    invoke-static {p2, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    sget v0, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 77
    .line 78
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    int-to-float p2, p2

    .line 83
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance p2, Lw4/l0;

    .line 88
    .line 89
    invoke-direct {p2, p0}, Lw4/l0;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 100
    .line 101
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;

    .line 102
    .line 103
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 104
    .line 105
    iget-object p1, p1, Lcom/zykj/study/databinding/ViewMicroBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->G()Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p2}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->c()Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    const/4 v0, 0x0

    .line 116
    if-eqz p2, :cond_1

    .line 117
    .line 118
    iget-object p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->j:Lcom/zykj/study/adapter/MicroEditAdapter;

    .line 119
    .line 120
    if-nez p2, :cond_0

    .line 121
    .line 122
    const-string p2, "microEditAdapter"

    .line 123
    .line 124
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_0
    move-object v0, p2

    .line 129
    goto :goto_1

    .line 130
    :cond_1
    iget-object p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->k:Lcom/zykj/study/adapter/MicroViewAdapter;

    .line 131
    .line 132
    if-nez p2, :cond_2

    .line 133
    .line 134
    const-string p2, "microViewAdapter"

    .line 135
    .line 136
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_2
    move-object v0, p2

    .line 141
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->F()Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$adapterDataObserver$2$1;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 146
    .line 147
    .line 148
    :goto_1
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 149
    .line 150
    .line 151
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-direct {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->C(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 162
    .line 163
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 164
    .line 165
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webView:Lcom/zykj/study/view/CustomWebView;

    .line 166
    .line 167
    sget-object p2, Le5/e;->a:Le5/e;

    .line 168
    .line 169
    invoke-virtual {p2}, Le5/e;->d()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {p1, v0}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2}, Le5/e;->a()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {p1, v0}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2}, Le5/e;->b()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-static {v0}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {p1, v0}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 199
    .line 200
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 201
    .line 202
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webViewAnalysis:Lcom/zykj/study/view/CustomWebView;

    .line 203
    .line 204
    invoke-virtual {p2}, Le5/e;->d()Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {p1, v0}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p2}, Le5/e;->a()Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {p1, v0}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2}, Le5/e;->b()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {p1, v0}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 234
    .line 235
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 236
    .line 237
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webViewCorrectAnswer:Lcom/zykj/study/view/CustomWebView;

    .line 238
    .line 239
    invoke-virtual {p2}, Le5/e;->d()Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {p1, v0}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p2}, Le5/e;->a()Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {p1, v0}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p2}, Le5/e;->b()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    invoke-static {p2}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-virtual {p1, p2}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 262
    .line 263
    .line 264
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 265
    .line 266
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_exercise_viewer:I

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
    :try_start_0
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->k:Lcom/zykj/study/adapter/MicroViewAdapter;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "microViewAdapter"

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->F()Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$adapterDataObserver$2$1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :catch_0
    return-void
.end method
