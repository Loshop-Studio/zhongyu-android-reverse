.class public final Lcom/zykj/study/ui/home/HomeFragment;
.super Lcom/zykj/study/ui/home/Hilt_HomeFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/Hilt_HomeFragment<",
        "Lcom/zykj/study/databinding/FragmentHomeBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public f:Lj1/a;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public final i:Ljava/util/List;

.field public final j:Ljava/util/List;

.field public final k:Ljava/util/List;

.field public final l:Ljava/util/List;

.field public final m:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/Hilt_HomeFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/study/viewmodels/HomeViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v5, p0, v0}, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v5}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->g:Lh7/d;

    .line 47
    .line 48
    const-class v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$activityViewModels$default$1;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$activityViewModels$default$2;

    .line 60
    .line 61
    invoke-direct {v2, v4, p0}, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 62
    .line 63
    .line 64
    new-instance v3, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$activityViewModels$default$3;

    .line 65
    .line 66
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/home/HomeFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->h:Lh7/d;

    .line 74
    .line 75
    new-instance v0, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->i:Ljava/util/List;

    .line 81
    .line 82
    new-instance v0, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->j:Ljava/util/List;

    .line 88
    .line 89
    new-instance v0, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->k:Ljava/util/List;

    .line 95
    .line 96
    new-instance v0, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->l:Ljava/util/List;

    .line 102
    .line 103
    new-instance v0, Lcom/zykj/study/ui/home/HomeFragment$connection$1;

    .line 104
    .line 105
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/HomeFragment$connection$1;-><init>(Lcom/zykj/study/ui/home/HomeFragment;)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->m:Landroid/content/ServiceConnection;

    .line 109
    .line 110
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/HomeFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/HomeFragment;->q(Lcom/zykj/study/ui/home/HomeFragment;Ljava/lang/Integer;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/HomeFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/HomeFragment;->s(Lcom/zykj/study/ui/home/HomeFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lcom/zykj/study/ui/home/HomeFragment;)Lcom/zykj/study/viewmodels/HomeViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/HomeFragment;->o()Lcom/zykj/study/viewmodels/HomeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic j(Lcom/zykj/study/ui/home/HomeFragment;)Lj1/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/HomeFragment;->f:Lj1/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lcom/zykj/study/ui/home/HomeFragment;Lj1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->f:Lj1/a;

    .line 2
    .line 3
    return-void
.end method

.method private final n()Lcom/zykj/study/viewmodels/DictViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->h:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final q(Lcom/zykj/study/ui/home/HomeFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->i:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/HomeFragment;->j:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/ui/home/HomeFragment;->k:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/study/ui/home/HomeFragment;->l:Ljava/util/List;

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    new-array v4, v4, [Ljava/util/List;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    aput-object v0, v4, v5

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    aput-object v1, v4, v0

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    aput-object v2, v4, v1

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v3, v4, v2

    .line 23
    .line 24
    invoke-virtual {p0, v5, v4}, Lcom/zykj/study/ui/home/HomeFragment;->t(Z[Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 32
    .line 33
    iget-object v3, v3, Lcom/zykj/study/databinding/FragmentHomeBinding;->viewPager:Landroidx/viewpager2/widget/ViewPager2;

    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-virtual {v3, v4, v5}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->i:Ljava/util/List;

    .line 52
    .line 53
    new-array v1, v0, [Ljava/util/List;

    .line 54
    .line 55
    aput-object p1, v1, v5

    .line 56
    .line 57
    invoke-virtual {p0, v0, v1}, Lcom/zykj/study/ui/home/HomeFragment;->t(Z[Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-ne v3, v0, :cond_1

    .line 66
    .line 67
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->j:Ljava/util/List;

    .line 68
    .line 69
    new-array v1, v0, [Ljava/util/List;

    .line 70
    .line 71
    aput-object p1, v1, v5

    .line 72
    .line 73
    invoke-virtual {p0, v0, v1}, Lcom/zykj/study/ui/home/HomeFragment;->t(Z[Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-ne v3, v1, :cond_2

    .line 82
    .line 83
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->k:Ljava/util/List;

    .line 84
    .line 85
    new-array v1, v0, [Ljava/util/List;

    .line 86
    .line 87
    aput-object p1, v1, v5

    .line 88
    .line 89
    invoke-virtual {p0, v0, v1}, Lcom/zykj/study/ui/home/HomeFragment;->t(Z[Ljava/util/List;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-ne p1, v2, :cond_3

    .line 98
    .line 99
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->l:Ljava/util/List;

    .line 100
    .line 101
    new-array v1, v0, [Ljava/util/List;

    .line 102
    .line 103
    aput-object p1, v1, v5

    .line 104
    .line 105
    invoke-virtual {p0, v0, v1}, Lcom/zykj/study/ui/home/HomeFragment;->t(Z[Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 109
    .line 110
    return-object p0
.end method

.method public static final s(Lcom/zykj/study/ui/home/HomeFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "$this$addCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 17
    .line 18
    return-object p0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/HomeFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/HomeFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/HomeFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/HomeFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/HomeFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/HomeFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/HomeFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/HomeFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/HomeFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/HomeFragment$initData$1;->c:I

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
    invoke-direct {p0}, Lcom/zykj/study/ui/home/HomeFragment;->n()Lcom/zykj/study/viewmodels/DictViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/DictViewModel;->n()V

    .line 67
    .line 68
    .line 69
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v3, Lcom/zykj/study/ui/home/HomeFragment$initData$2;

    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    invoke-direct {v3, p0, p1}, Lcom/zykj/study/ui/home/HomeFragment$initData$2;-><init>(Lcom/zykj/study/ui/home/HomeFragment;Lm7/c;)V

    .line 77
    .line 78
    .line 79
    const/4 v4, 0x3

    .line 80
    const/4 v5, 0x0

    .line 81
    const/4 v1, 0x0

    .line 82
    const/4 v2, 0x0

    .line 83
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 84
    .line 85
    .line 86
    sget-object p1, Le5/a;->a:Le5/a;

    .line 87
    .line 88
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v1, "requireContext(...)"

    .line 93
    .line 94
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, Le5/a;->b(Landroid/content/Context;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/HomeFragment;->l()V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/HomeFragment;->o()Lcom/zykj/study/viewmodels/HomeViewModel;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/HomeViewModel;->b()V

    .line 112
    .line 113
    .line 114
    :goto_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 115
    .line 116
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/HomeFragment;->o()Lcom/zykj/study/viewmodels/HomeViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentHomeBinding;->setViewModel(Lcom/zykj/study/viewmodels/HomeViewModel;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->i:Ljava/util/List;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 21
    .line 22
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentHomeBinding;->ivFind:Landroid/widget/ImageView;

    .line 23
    .line 24
    const-string v0, "ivFind"

    .line 25
    .line 26
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->i:Ljava/util/List;

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 39
    .line 40
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentHomeBinding;->tvFind:Landroid/widget/TextView;

    .line 41
    .line 42
    const-string v0, "tvFind"

    .line 43
    .line 44
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->i:Ljava/util/List;

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 57
    .line 58
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentHomeBinding;->llFind:Landroid/widget/LinearLayout;

    .line 59
    .line 60
    const-string v0, "llFind"

    .line 61
    .line 62
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->j:Ljava/util/List;

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    check-cast p2, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 75
    .line 76
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentHomeBinding;->ivStudy:Landroid/widget/ImageView;

    .line 77
    .line 78
    const-string v0, "ivStudy"

    .line 79
    .line 80
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->j:Ljava/util/List;

    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    check-cast p2, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 93
    .line 94
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentHomeBinding;->tvStudy:Landroid/widget/TextView;

    .line 95
    .line 96
    const-string v0, "tvStudy"

    .line 97
    .line 98
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->j:Ljava/util/List;

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    check-cast p2, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 111
    .line 112
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentHomeBinding;->llStudy:Landroid/widget/LinearLayout;

    .line 113
    .line 114
    const-string v0, "llStudy"

    .line 115
    .line 116
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->k:Ljava/util/List;

    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    check-cast p2, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 129
    .line 130
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentHomeBinding;->ivMessage:Landroid/widget/ImageView;

    .line 131
    .line 132
    const-string v0, "ivMessage"

    .line 133
    .line 134
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->k:Ljava/util/List;

    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    check-cast p2, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 147
    .line 148
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentHomeBinding;->tvMessage:Landroid/widget/TextView;

    .line 149
    .line 150
    const-string v0, "tvMessage"

    .line 151
    .line 152
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->k:Ljava/util/List;

    .line 159
    .line 160
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    check-cast p2, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 165
    .line 166
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentHomeBinding;->llMessage:Landroid/widget/LinearLayout;

    .line 167
    .line 168
    const-string v0, "llMessage"

    .line 169
    .line 170
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->l:Ljava/util/List;

    .line 177
    .line 178
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    check-cast p2, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 183
    .line 184
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentHomeBinding;->ivMy:Landroid/widget/ImageView;

    .line 185
    .line 186
    const-string v0, "ivMy"

    .line 187
    .line 188
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->l:Ljava/util/List;

    .line 195
    .line 196
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    check-cast p2, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 201
    .line 202
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentHomeBinding;->tvMy:Landroid/widget/TextView;

    .line 203
    .line 204
    const-string v0, "tvMy"

    .line 205
    .line 206
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment;->l:Ljava/util/List;

    .line 213
    .line 214
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    check-cast p2, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 219
    .line 220
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentHomeBinding;->llMy:Landroid/widget/LinearLayout;

    .line 221
    .line 222
    const-string v0, "llMy"

    .line 223
    .line 224
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    const-string p2, "getViewLifecycleOwner(...)"

    .line 235
    .line 236
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    new-instance p2, Lcom/zykj/study/ui/home/HomeFragment$initView$2;

    .line 244
    .line 245
    const/4 v0, 0x0

    .line 246
    invoke-direct {p2, p0, v0}, Lcom/zykj/study/ui/home/HomeFragment$initView$2;-><init>(Lcom/zykj/study/ui/home/HomeFragment;Lm7/c;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, p2}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/HomeFragment;->r()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/HomeFragment;->p()V

    .line 256
    .line 257
    .line 258
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 259
    .line 260
    return-object p1
.end method

.method public final l()V
    .locals 4

    .line 1
    sget-object v0, Le5/a;->a:Le5/a;

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
    invoke-virtual {v0, v1}, Le5/a;->b(Landroid/content/Context;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Landroid/content/Intent;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "cn.com.techvision.appstore"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    const-string v1, "cn.com.techvision.appstore.action.CHECK_UPDATE_SERVICE"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, Lcom/zykj/study/ui/home/HomeFragment;->m:Landroid/content/ServiceConnection;

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_home:I

    .line 2
    .line 3
    return v0
.end method

.method public final m()V
    .locals 3

    .line 1
    sget-object v0, Le5/a;->a:Le5/a;

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
    invoke-virtual {v0, v1}, Le5/a;->b(Landroid/content/Context;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lcom/zykj/study/ui/home/HomeFragment;->m:Landroid/content/ServiceConnection;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final o()Lcom/zykj/study/viewmodels/HomeViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/HomeViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/HomeFragment;->m()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onDestroyView()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->i:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->j:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->k:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment;->l:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/zykj/study/databinding/FragmentHomeBinding;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentHomeBinding;->viewPager:Landroidx/viewpager2/widget/ViewPager2;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final p()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/HomeFragment;->o()Lcom/zykj/study/viewmodels/HomeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/HomeViewModel;->d()Landroidx/lifecycle/MutableLiveData;

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
    new-instance v2, Lv4/a;

    .line 14
    .line 15
    invoke-direct {v2, p0}, Lv4/a;-><init>(Lcom/zykj/study/ui/home/HomeFragment;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lcom/zykj/study/ui/home/HomeFragment$a;

    .line 19
    .line 20
    invoke-direct {v3, v2}, Lcom/zykj/study/ui/home/HomeFragment$a;-><init>(Lx7/l;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final r()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v4, Lv4/b;

    .line 14
    .line 15
    invoke-direct {v4, p0}, Lv4/b;-><init>(Lcom/zykj/study/ui/home/HomeFragment;)V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    move-object v2, p0

    .line 22
    invoke-static/range {v1 .. v6}, Landroidx/activity/OnBackPressedDispatcherKt;->addCallback$default(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLx7/l;ILjava/lang/Object;)Landroidx/activity/OnBackPressedCallback;

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final varargs t(Z[Ljava/util/List;)V
    .locals 4

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    .line 5
    aget-object v2, p2, v1

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v3, p1}, Landroid/view/View;->setSelected(Z)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method
