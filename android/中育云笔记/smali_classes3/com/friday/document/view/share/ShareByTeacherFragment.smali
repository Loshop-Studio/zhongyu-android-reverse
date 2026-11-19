.class public final Lcom/friday/document/view/share/ShareByTeacherFragment;
.super Lcom/friday/document/view/share/Hilt_ShareByTeacherFragment;
.source "SourceFile"

# interfaces
.implements Lj2/i;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/share/Hilt_ShareByTeacherFragment<",
        "Lcom/friday/document/databinding/FragmentShareByTeacherBinding;",
        ">;",
        "Lj2/i;"
    }
.end annotation


# instance fields
.field public final i:Lqc/d;

.field public final j:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/share/Hilt_ShareByTeacherFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/document/view/share/ShareByTeacherFragment$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/document/view/share/ShareByTeacherFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->e:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/friday/document/view/share/ShareByTeacherFragment$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/friday/document/view/share/ShareByTeacherFragment$special$$inlined$viewModels$default$2;-><init>(Lhd/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/friday/document/view/share/ShareByTeacherFragment$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/friday/document/view/share/ShareByTeacherFragment$special$$inlined$viewModels$default$3;-><init>(Lqc/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/friday/document/view/share/ShareByTeacherFragment$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/friday/document/view/share/ShareByTeacherFragment$special$$inlined$viewModels$default$4;-><init>(Lhd/a;Lqc/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/friday/document/view/share/ShareByTeacherFragment$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/friday/document/view/share/ShareByTeacherFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lqc/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/friday/document/view/share/ShareByTeacherFragment;->i:Lqc/d;

    .line 47
    .line 48
    new-instance v0, Lx2/g;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lx2/g;-><init>(Lcom/friday/document/view/share/ShareByTeacherFragment;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lcom/friday/document/view/share/ShareByTeacherFragment;->j:Lqc/d;

    .line 58
    .line 59
    return-void
.end method

.method public static final C(Lcom/friday/document/view/share/ShareByTeacherFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->G()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final D(Lcom/friday/document/view/share/ShareByTeacherFragment;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getBackStackEntryCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v1

    .line 15
    :goto_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;

    .line 20
    .line 21
    iget-object v2, v2, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->e:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 22
    .line 23
    const/16 v3, 0x8

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    move v4, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v4, v1

    .line 30
    :goto_1
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;

    .line 38
    .line 39
    iget-object p0, p0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->d:Landroidx/fragment/app/FragmentContainerView;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move v1, v3

    .line 45
    :goto_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static final E(Lcom/friday/document/view/share/ShareByTeacherFragment;)Lcom/friday/document/adapter/TeacherListShareAdapter;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/document/adapter/TeacherListShareAdapter;

    .line 2
    .line 3
    new-instance v1, Lx2/j;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lx2/j;-><init>(Lcom/friday/document/view/share/ShareByTeacherFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/friday/document/adapter/TeacherListShareAdapter;-><init>(Lhd/l;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final F(Lcom/friday/document/view/share/ShareByTeacherFragment;Lcom/friday/document/model/TchByCloudEntity;)Lqc/q;
    .locals 3

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->B()Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->l(Lcom/friday/document/model/TchByCloudEntity;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/friday/document/view/share/ShareTeacherFileFragment;->q:Lcom/friday/document/view/share/ShareTeacherFileFragment$a;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/friday/document/model/TchByCloudEntity;->getTeacherId()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    invoke-virtual {p1}, Lcom/friday/document/model/TchByCloudEntity;->getTeacherName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, v1, v2, p1}, Lcom/friday/document/view/share/ShareTeacherFileFragment$a;->a(JLjava/lang/String;)Lcom/friday/document/view/share/ShareTeacherFileFragment;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget v0, Lcom/friday/document/R$id;->file_list_container:I

    .line 36
    .line 37
    invoke-virtual {p0, v0, p1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const/4 p1, 0x0

    .line 42
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 47
    .line 48
    .line 49
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 50
    .line 51
    return-object p0
.end method

.method private final H(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 8
    .line 9
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-direct {p0, p1}, Lcom/friday/document/view/share/ShareByTeacherFragment;->I(Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/ShareByTeacherFragment;->J(Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final I(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const-string v1, "rvShare"

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
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->c:Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v2, "getRoot(...)"

    .line 32
    .line 33
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->c:Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 49
    .line 50
    const-string v3, "imgNoNetwork"

    .line 51
    .line 52
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    if-nez p1, :cond_0

    .line 56
    .line 57
    move v1, v2

    .line 58
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;

    .line 66
    .line 67
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->c:Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;->e:Landroid/widget/TextView;

    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    const-string p1, "\u6682\u65e0\u6570\u636e"

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    sget p1, Lcom/friday/document/R$string;->no_network:I

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string v1, "getString(...)"

    .line 83
    .line 84
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method private final initObserver()V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const-string v6, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {v1, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->B()Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->k()Lvd/u;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    sget-object v2, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    .line 19
    .line 20
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    new-instance v0, Lcom/friday/document/view/share/ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$1;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    move-object/from16 v5, p0

    .line 28
    .line 29
    invoke-direct/range {v0 .. v5}, Lcom/friday/document/view/share/ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lvd/c;Lvc/c;Lcom/friday/document/view/share/ShareByTeacherFragment;)V

    .line 30
    .line 31
    .line 32
    const/4 v11, 0x3

    .line 33
    const/4 v12, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    move-object v10, v0

    .line 37
    invoke-static/range {v7 .. v12}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 38
    .line 39
    .line 40
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-static {v8, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {p0 .. p0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->B()Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->m()Lvd/u;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    invoke-static {v8}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v7, Lcom/friday/document/view/share/ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$2;

    .line 60
    .line 61
    const/4 v11, 0x0

    .line 62
    move-object/from16 v12, p0

    .line 63
    .line 64
    move-object v9, v2

    .line 65
    invoke-direct/range {v7 .. v12}, Lcom/friday/document/view/share/ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$2;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lvd/c;Lvc/c;Lcom/friday/document/view/share/ShareByTeacherFragment;)V

    .line 66
    .line 67
    .line 68
    const/4 v15, 0x3

    .line 69
    const/16 v16, 0x0

    .line 70
    .line 71
    const/4 v12, 0x0

    .line 72
    const/4 v13, 0x0

    .line 73
    move-object v11, v0

    .line 74
    move-object v14, v7

    .line 75
    invoke-static/range {v11 .. v16}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public static synthetic r(Lcom/friday/document/view/share/ShareByTeacherFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->C(Lcom/friday/document/view/share/ShareByTeacherFragment;)V

    return-void
.end method

.method public static synthetic s(Lcom/friday/document/view/share/ShareByTeacherFragment;)Lcom/friday/document/adapter/TeacherListShareAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->E(Lcom/friday/document/view/share/ShareByTeacherFragment;)Lcom/friday/document/adapter/TeacherListShareAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/friday/document/view/share/ShareByTeacherFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->D(Lcom/friday/document/view/share/ShareByTeacherFragment;)V

    return-void
.end method

.method public static synthetic u(Lcom/friday/document/view/share/ShareByTeacherFragment;Lcom/friday/document/model/TchByCloudEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/share/ShareByTeacherFragment;->F(Lcom/friday/document/view/share/ShareByTeacherFragment;Lcom/friday/document/model/TchByCloudEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v(Lcom/friday/document/view/share/ShareByTeacherFragment;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/ShareByTeacherFragment;->y(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic w(Lcom/friday/document/view/share/ShareByTeacherFragment;)Lcom/friday/document/databinding/FragmentShareByTeacherBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic x(Lcom/friday/document/view/share/ShareByTeacherFragment;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/friday/document/view/share/ShareByTeacherFragment;->H(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic z(Lcom/friday/document/view/share/ShareByTeacherFragment;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/ShareByTeacherFragment;->y(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final A()Lcom/friday/document/adapter/TeacherListShareAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/ShareByTeacherFragment;->j:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/adapter/TeacherListShareAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final B()Lcom/friday/document/viewmodel/ShareByTeacherViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/ShareByTeacherFragment;->i:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final G()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/share/ShareByTeacherFragment$reloadData$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/document/view/share/ShareByTeacherFragment$reloadData$1;-><init>(Lcom/friday/document/view/share/ShareByTeacherFragment;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final J(Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->c:Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "getRoot(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 30
    .line 31
    const-string v1, "rvShare"

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->A()Lcom/friday/document/adapter/TeacherListShareAdapter;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->fragment_share_by_teacher:I

    .line 2
    .line 3
    return v0
.end method

.method public final initClick()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->e:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 8
    .line 9
    new-instance v1, Lx2/i;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lx2/i;-><init>(Lcom/friday/document/view/share/ShareByTeacherFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public initData()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->initObserver()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->initClick()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public initView()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseFragment;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/friday/document/view/share/Hilt_ShareByTeacherFragment;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->A()Lcom/friday/document/adapter/TeacherListShareAdapter;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lx2/h;

    .line 44
    .line 45
    invoke-direct {v1, p0}, Lx2/h;-><init>(Lcom/friday/document/view/share/ShareByTeacherFragment;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->addOnBackStackChangedListener(Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public l()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget v1, Lcom/friday/document/R$id;->file_list_container:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    instance-of v1, v0, Lj2/i;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast v0, Lj2/i;

    .line 23
    .line 24
    invoke-interface {v0}, Lj2/i;->l()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const/4 v0, 0x1

    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-static {p0, v2, v0, v1}, Lcom/friday/document/view/share/ShareByTeacherFragment;->z(Lcom/friday/document/view/share/ShareByTeacherFragment;ZILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {p0, v2, v0, v1}, Lcom/friday/document/view/share/ShareByTeacherFragment;->z(Lcom/friday/document/view/share/ShareByTeacherFragment;ZILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final y(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->B()Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->i(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
