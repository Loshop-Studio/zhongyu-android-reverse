.class public final Lcom/zykj/study/ui/home/my/TeacherFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_TeacherFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_TeacherFragment<",
        "Lcom/zykj/study/databinding/FragmentTeacherBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public i:Lcom/zykj/study/adapter/MyTeachCourseAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_TeacherFragment;-><init>()V

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
    new-instance v1, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v4, p0}, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment;->f:Lh7/d;

    .line 31
    .line 32
    const-class v0, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$activityViewModels$default$4;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$activityViewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$activityViewModels$default$5;

    .line 44
    .line 45
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$activityViewModels$default$5;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 46
    .line 47
    .line 48
    new-instance v4, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$activityViewModels$default$6;

    .line 49
    .line 50
    invoke-direct {v4, p0}, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$activityViewModels$default$6;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment;->g:Lh7/d;

    .line 58
    .line 59
    new-instance v0, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$viewModels$default$1;

    .line 60
    .line 61
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 62
    .line 63
    .line 64
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 65
    .line 66
    new-instance v2, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$viewModels$default$2;

    .line 67
    .line 68
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-class v1, Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;

    .line 76
    .line 77
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    new-instance v2, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$viewModels$default$3;

    .line 82
    .line 83
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 84
    .line 85
    .line 86
    new-instance v4, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$viewModels$default$4;

    .line 87
    .line 88
    invoke-direct {v4, v3, v0}, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 89
    .line 90
    .line 91
    new-instance v3, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$viewModels$default$5;

    .line 92
    .line 93
    invoke-direct {v3, p0, v0}, Lcom/zykj/study/ui/home/my/TeacherFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v1, v2, v4, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment;->h:Lh7/d;

    .line 101
    .line 102
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/TeacherFragment;->u(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/TeacherFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/TeacherFragment;->v(Lcom/zykj/study/ui/home/my/TeacherFragment;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/TeacherFragment;->z(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/my/TeacherFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/TeacherFragment;->x(Lcom/zykj/study/ui/home/my/TeacherFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/my/TeacherFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/TeacherFragment;->w(Lcom/zykj/study/ui/home/my/TeacherFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic l(Lcom/zykj/study/ui/home/my/TeacherFragment;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/study/ui/home/my/TeacherFragment;->q(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic m(Lcom/zykj/study/ui/home/my/TeacherFragment;)Lcom/zykj/study/adapter/MyTeachCourseAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment;->i:Lcom/zykj/study/adapter/MyTeachCourseAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/study/ui/home/my/TeacherFragment;)Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/TeacherFragment;->s()Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic o(Lcom/zykj/study/ui/home/my/TeacherFragment;)Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/TeacherFragment;->t()Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic p(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/TeacherFragment;->y(Lcom/zykj/study/bean/course/CourseDetailsBean;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final q(Landroidx/recyclerview/widget/RecyclerView;)V
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

.method private final r()Lcom/zykj/study/viewmodels/DictViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment;->f:Lh7/d;

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

.method private final t()Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final u(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)Lh7/p;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "requireActivity(...)"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget v0, Lcom/zykj/study/R$id;->nav_host_fragment:I

    .line 16
    .line 17
    invoke-static {p0, v0}, Landroidx/navigation/Navigation;->findNavController(Landroid/app/Activity;I)Landroidx/navigation/NavController;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object v0, Lv4/c;->a:Lv4/c$h;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseDetailsBean;->getSuperviseId()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1, p1}, Lv4/c$h;->i(ILcom/zykj/study/bean/course/CourseBean;)Landroidx/navigation/NavDirections;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 35
    .line 36
    return-object p0
.end method

.method public static final v(Lcom/zykj/study/ui/home/my/TeacherFragment;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment;->i:Lcom/zykj/study/adapter/MyTeachCourseAdapter;

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

.method public static final w(Lcom/zykj/study/ui/home/my/TeacherFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string p1, "requireActivity(...)"

    .line 6
    .line 7
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget p1, Lcom/zykj/study/R$id;->nav_host_fragment:I

    .line 11
    .line 12
    invoke-static {p0, p1}, Landroidx/navigation/Navigation;->findNavController(Landroid/app/Activity;I)Landroidx/navigation/NavController;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget p1, Lcom/zykj/study/R$id;->action_homeFragment_to_teachCourseAddFragment:I

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final x(Lcom/zykj/study/ui/home/my/TeacherFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment;->i:Lcom/zykj/study/adapter/MyTeachCourseAdapter;

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

.method public static final z(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
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
    new-instance v3, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-direct {v3, p0, p1, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;Lm7/c;)V

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
    instance-of v0, p1, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$1;->c:I

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
    new-instance p1, Lcom/zykj/study/adapter/MyTeachCourseAdapter;

    .line 63
    .line 64
    new-instance v0, Lb5/q5;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lb5/q5;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/TeacherFragment;->r()Lcom/zykj/study/viewmodels/DictViewModel;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-direct {p1, v0, v1}, Lcom/zykj/study/adapter/MyTeachCourseAdapter;-><init>(Lx7/l;Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/TeacherFragment;->i:Lcom/zykj/study/adapter/MyTeachCourseAdapter;

    .line 77
    .line 78
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance v0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$3;

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$3;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lm7/c;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 89
    .line 90
    .line 91
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    new-instance v0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;

    .line 96
    .line 97
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lm7/c;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 101
    .line 102
    .line 103
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 104
    .line 105
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
    check-cast p1, Lcom/zykj/study/databinding/FragmentTeacherBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/TeacherFragment;->s()Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentTeacherBinding;->setEntity(Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string p2, "getViewLifecycleOwner(...)"

    .line 19
    .line 20
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v3, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$2;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-direct {v3, p0, p1}, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$2;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lm7/c;)V

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    new-instance v0, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;

    .line 52
    .line 53
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lm7/c;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lcom/zykj/study/databinding/FragmentTeacherBinding;

    .line 64
    .line 65
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentTeacherBinding;->sfCourse:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 66
    .line 67
    new-instance p2, Lb5/n5;

    .line 68
    .line 69
    invoke-direct {p2, p0}, Lb5/n5;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lcom/zykj/study/databinding/FragmentTeacherBinding;

    .line 80
    .line 81
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentTeacherBinding;->btnCreate:Landroid/widget/TextView;

    .line 82
    .line 83
    new-instance p2, Lb5/o5;

    .line 84
    .line 85
    invoke-direct {p2, p0}, Lb5/o5;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, Lcom/zykj/study/databinding/FragmentTeacherBinding;

    .line 96
    .line 97
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentTeacherBinding;->msCourse:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 98
    .line 99
    new-instance p2, Lb5/p5;

    .line 100
    .line 101
    invoke-direct {p2, p0}, Lb5/p5;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->setOnRetryClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    .line 106
    .line 107
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 108
    .line 109
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_teacher:I

    .line 2
    .line 3
    return v0
.end method

.method public final s()Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment;->h:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final y(Lcom/zykj/study/bean/course/CourseDetailsBean;)V
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
    sget v1, Lcom/zykj/study/R$string;->is_remove_course:I

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
    new-instance v1, Lb5/r5;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, Lb5/r5;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)V

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
