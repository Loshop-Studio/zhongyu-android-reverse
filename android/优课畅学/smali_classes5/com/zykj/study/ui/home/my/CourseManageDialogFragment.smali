.class public final Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_CourseManageDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_CourseManageDialogFragment<",
        "Lcom/zykj/study/databinding/DialogCourseManageBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public final h:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_CourseManageDialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$a;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$a;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$special$$inlined$viewModels$default$1;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 28
    .line 29
    new-instance v2, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$special$$inlined$viewModels$default$2;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v1, Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v2, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$special$$inlined$viewModels$default$3;

    .line 45
    .line 46
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$special$$inlined$viewModels$default$4;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 53
    .line 54
    .line 55
    new-instance v4, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$special$$inlined$viewModels$default$5;

    .line 56
    .line 57
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->g:Lh7/d;

    .line 65
    .line 66
    new-instance v0, Lb5/q;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lb5/q;-><init>(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->h:Lh7/d;

    .line 76
    .line 77
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;)Lcom/zykj/study/adapter/CourseManageAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->n(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;)Lcom/zykj/study/adapter/CourseManageAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;JZ)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->p(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;JZ)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;JZ)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->q(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;JZ)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->u(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;JZ)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->o(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;JZ)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;)Lcom/zykj/study/adapter/CourseManageAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->s()Lcom/zykj/study/adapter/CourseManageAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic m(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;)Lcom/zykj/study/viewmodels/CourseManageVewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->t()Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final n(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;)Lcom/zykj/study/adapter/CourseManageAdapter;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/study/adapter/CourseManageAdapter;

    .line 2
    .line 3
    new-instance v1, Lb5/s;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lb5/s;-><init>(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lb5/t;

    .line 9
    .line 10
    invoke-direct {v2, p0}, Lb5/t;-><init>(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Lb5/u;

    .line 14
    .line 15
    invoke-direct {v3, p0}, Lb5/u;-><init>(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/study/adapter/CourseManageAdapter;-><init>(Lx7/p;Lx7/p;Lx7/p;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final o(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;JZ)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->t()Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->i(JZ)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 9
    .line 10
    return-object p0
.end method

.method public static final p(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;JZ)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->t()Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->j(JZ)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 9
    .line 10
    return-object p0
.end method

.method public static final q(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;JZ)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->t()Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->l(JZ)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 9
    .line 10
    return-object p0
.end method

.method public static final u(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->t()Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->r()Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;->a()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-virtual {p1, v0, v1}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->h(J)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 17
    .line 18
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/DialogCourseManageBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogCourseManageBinding;->ivClose:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    new-instance p2, Lb5/r;

    .line 10
    .line 11
    invoke-direct {p2, p0}, Lb5/r;-><init>(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/zykj/study/databinding/DialogCourseManageBinding;

    .line 22
    .line 23
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogCourseManageBinding;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->s()Lcom/zykj/study/adapter/CourseManageAdapter;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string p2, "getViewLifecycleOwner(...)"

    .line 37
    .line 38
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v3, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$initView$3;

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    invoke-direct {v3, p0, p1}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment$initView$3;-><init>(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;Lm7/c;)V

    .line 49
    .line 50
    .line 51
    const/4 v4, 0x3

    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v1, 0x0

    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 56
    .line 57
    .line 58
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 59
    .line 60
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->dialog_course_manage:I

    .line 2
    .line 3
    return v0
.end method

.method public final r()Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final s()Lcom/zykj/study/adapter/CourseManageAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->h:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/adapter/CourseManageAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final t()Lcom/zykj/study/viewmodels/CourseManageVewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 8
    .line 9
    return-object v0
.end method
