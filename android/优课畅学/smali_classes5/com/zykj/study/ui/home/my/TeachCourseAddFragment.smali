.class public final Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_TeachCourseAddFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_TeachCourseAddFragment<",
        "Lcom/zykj/study/databinding/FragmentTeacherCourseAddBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Lh7/d;

.field public h:Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_TeachCourseAddFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v4, p0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->f:Lh7/d;

    .line 31
    .line 32
    new-instance v0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$viewModels$default$1;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 35
    .line 36
    .line 37
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 38
    .line 39
    new-instance v2, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$viewModels$default$2;

    .line 40
    .line 41
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-class v1, Lcom/zykj/study/viewmodels/MyCourseViewModel;

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    new-instance v2, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$viewModels$default$3;

    .line 55
    .line 56
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 57
    .line 58
    .line 59
    new-instance v4, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$viewModels$default$4;

    .line 60
    .line 61
    invoke-direct {v4, v3, v0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 62
    .line 63
    .line 64
    new-instance v3, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$viewModels$default$5;

    .line 65
    .line 66
    invoke-direct {v3, p0, v0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v1, v2, v4, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->g:Lh7/d;

    .line 74
    .line 75
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Lcom/zykj/study/data/MyCourseEntity;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->v(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Lcom/zykj/study/data/MyCourseEntity;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->r(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->s(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->t(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic k(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->o(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic l(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;)Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->h:Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;)Lcom/zykj/study/viewmodels/MyCourseViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->q()Lcom/zykj/study/viewmodels/MyCourseViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Lcom/zykj/study/data/MyCourseEntity;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->u(Lcom/zykj/study/data/MyCourseEntity;)V

    .line 2
    .line 3
    .line 4
    return-void
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
    const/4 v3, 0x1

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
    const/4 v3, 0x0

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

.method private final p()Lcom/zykj/study/viewmodels/DictViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->f:Lh7/d;

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

.method private final q()Lcom/zykj/study/viewmodels/MyCourseViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/MyCourseViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final r(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Landroid/view/View;)V
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

.method public static final s(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->h:Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "myCourseAdapter"

    .line 6
    .line 7
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/paging/PagingDataAdapter;->refresh()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final t(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->h:Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "myCourseAdapter"

    .line 6
    .line 7
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/paging/PagingDataAdapter;->refresh()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final v(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Lcom/zykj/study/data/MyCourseEntity;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 6

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const-string p3, "getViewLifecycleOwner(...)"

    .line 14
    .line 15
    invoke-static {p2, p3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v3, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$showAddTeachCourseHintDialog$1$1;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-direct {v3, p0, p1, p2}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$showAddTeachCourseHintDialog$1$1;-><init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Lcom/zykj/study/data/MyCourseEntity;Lm7/c;)V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x3

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$1;->c:I

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
    new-instance p1, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;

    .line 63
    .line 64
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->p()Lcom/zykj/study/viewmodels/DictViewModel;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {p1, v0}, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;-><init>(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->h:Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;

    .line 72
    .line 73
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$2;

    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$2;-><init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Lm7/c;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 84
    .line 85
    .line 86
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance v0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$3;

    .line 91
    .line 92
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$3;-><init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Lm7/c;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 96
    .line 97
    .line 98
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 99
    .line 100
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
    check-cast p1, Lcom/zykj/study/databinding/FragmentTeacherCourseAddBinding;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->q()Lcom/zykj/study/viewmodels/MyCourseViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentTeacherCourseAddBinding;->setEntity(Lcom/zykj/study/viewmodels/MyCourseViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/study/databinding/FragmentTeacherCourseAddBinding;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentTeacherCourseAddBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 21
    .line 22
    sget p2, Lcom/zykj/study/R$string;->add_my_course_to_teach:I

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->t(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    sget p2, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 33
    .line 34
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    sget v0, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 47
    .line 48
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    sget v0, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 61
    .line 62
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    int-to-float p2, p2

    .line 67
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance p2, Lb5/b5;

    .line 72
    .line 73
    invoke-direct {p2, p0}, Lb5/b5;-><init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    sget p2, Lcom/zykj/study/R$string;->sure:I

    .line 81
    .line 82
    new-instance v0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initView$3;

    .line 83
    .line 84
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initView$3;-><init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->a(Lcom/xuexiang/xui/widget/actionbar/TitleBar$a;)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string p2, "getViewLifecycleOwner(...)"

    .line 95
    .line 96
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    new-instance p2, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initView$4;

    .line 104
    .line 105
    const/4 v0, 0x0

    .line 106
    invoke-direct {p2, p0, v0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initView$4;-><init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Lm7/c;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p2}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Lcom/zykj/study/databinding/FragmentTeacherCourseAddBinding;

    .line 117
    .line 118
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentTeacherCourseAddBinding;->sfCourse:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 119
    .line 120
    new-instance p2, Lb5/c5;

    .line 121
    .line 122
    invoke-direct {p2, p0}, Lb5/c5;-><init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, Lcom/zykj/study/databinding/FragmentTeacherCourseAddBinding;

    .line 133
    .line 134
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentTeacherCourseAddBinding;->msCourse:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 135
    .line 136
    new-instance p2, Lb5/d5;

    .line 137
    .line 138
    invoke-direct {p2, p0}, Lb5/d5;-><init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->setOnRetryClickListener(Landroid/view/View$OnClickListener;)V

    .line 142
    .line 143
    .line 144
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 145
    .line 146
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_teacher_course_add:I

    .line 2
    .line 3
    return v0
.end method

.method public final u(Lcom/zykj/study/data/MyCourseEntity;)V
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
    sget v1, Lcom/zykj/study/R$string;->add_teach_course_hint:I

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
    sget v1, Lcom/zykj/study/R$string;->sure:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget v1, Lcom/zykj/study/R$string;->cancel:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Lb5/e5;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, Lb5/e5;-><init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Lcom/zykj/study/data/MyCourseEntity;)V

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
