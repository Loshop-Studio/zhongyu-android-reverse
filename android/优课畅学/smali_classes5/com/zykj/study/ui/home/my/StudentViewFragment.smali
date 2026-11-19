.class public final Lcom/zykj/study/ui/home/my/StudentViewFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_StudentViewFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_StudentViewFragment<",
        "Lcom/zykj/study/databinding/FragmentStudentViewBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_StudentViewFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb5/g4;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lb5/g4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewFragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$1;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v2, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 21
    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$2;

    .line 27
    .line 28
    invoke-direct {v3, v0}, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$3;

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-direct {v4, v5, v0}, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v6, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$4;

    .line 38
    .line 39
    invoke-direct {v6, p0, v0}, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v2, v3, v4, v6}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewFragment;->f:Lh7/d;

    .line 47
    .line 48
    new-instance v0, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$5;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$6;

    .line 54
    .line 55
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$6;-><init>(Lx7/a;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-class v1, Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 63
    .line 64
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    new-instance v2, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$7;

    .line 69
    .line 70
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$7;-><init>(Lh7/d;)V

    .line 71
    .line 72
    .line 73
    new-instance v3, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$8;

    .line 74
    .line 75
    invoke-direct {v3, v5, v0}, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$8;-><init>(Lx7/a;Lh7/d;)V

    .line 76
    .line 77
    .line 78
    new-instance v4, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$9;

    .line 79
    .line 80
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/my/StudentViewFragment$special$$inlined$viewModels$default$9;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewFragment;->g:Lh7/d;

    .line 88
    .line 89
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/StudentViewFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->t(Lcom/zykj/study/ui/home/my/StudentViewFragment;Ljava/lang/Integer;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/StudentViewFragment;Lcom/zykj/study/bean/course/CourseBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->u(Lcom/zykj/study/ui/home/my/StudentViewFragment;Lcom/zykj/study/bean/course/CourseBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->q(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/adapter/SuperviseGroupAddAdapter;Lcom/zykj/study/ui/home/my/StudentViewFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->p(Lcom/zykj/study/adapter/SuperviseGroupAddAdapter;Lcom/zykj/study/ui/home/my/StudentViewFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/my/StudentViewFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->w(Lcom/zykj/study/ui/home/my/StudentViewFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/my/StudentViewFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->x(Lcom/zykj/study/ui/home/my/StudentViewFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/my/StudentViewFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->v(Lcom/zykj/study/ui/home/my/StudentViewFragment;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/study/ui/home/my/StudentViewFragment;)Lcom/zykj/study/viewmodels/StudentViewViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->r()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final p(Lcom/zykj/study/adapter/SuperviseGroupAddAdapter;Lcom/zykj/study/ui/home/my/StudentViewFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 7

    .line 1
    const-string v0, "dialog"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "<unused var>"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/study/adapter/SuperviseGroupAddAdapter;->d()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    if-nez p3, :cond_2

    .line 20
    .line 21
    invoke-static {p0}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    if-nez p3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {p0}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lcom/zykj/study/bean/teach/CourseBindBean;

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    const-string v0, "getViewLifecycleOwner(...)"

    .line 41
    .line 42
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p3}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v4, Lcom/zykj/study/ui/home/my/StudentViewFragment$addSuperviseGroup$1$dialog$2$1$1$1;

    .line 50
    .line 51
    const/4 p3, 0x0

    .line 52
    invoke-direct {v4, p1, p0, p2, p3}, Lcom/zykj/study/ui/home/my/StudentViewFragment$addSuperviseGroup$1$dialog$2$1$1$1;-><init>(Lcom/zykj/study/ui/home/my/StudentViewFragment;Lcom/zykj/study/bean/teach/CourseBindBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lm7/c;)V

    .line 53
    .line 54
    .line 55
    const/4 v5, 0x3

    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v2, 0x0

    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void

    .line 63
    :cond_2
    :goto_0
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 64
    .line 65
    const-string p1, "\u8bf7\u9009\u62e9\u5b66\u5458\u7ec4"

    .line 66
    .line 67
    invoke-static {p0, p1}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static final q(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 1

    .line 1
    const-string v0, "dialog"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "<unused var>"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final r()Lcom/zykj/study/viewmodels/StudentViewViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final s()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewFragment;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final t(Lcom/zykj/study/ui/home/my/StudentViewFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->r()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Lcom/zykj/study/ui/home/my/StudentViewFragment$initData$2$1;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/my/StudentViewFragment$initData$2$1;-><init>(Lcom/zykj/study/ui/home/my/StudentViewFragment;Lm7/c;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 23
    .line 24
    .line 25
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 26
    .line 27
    return-object p0
.end method

.method public static final u(Lcom/zykj/study/ui/home/my/StudentViewFragment;Lcom/zykj/study/bean/course/CourseBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->r()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 13
    .line 14
    return-object p0
.end method

.method public static final v(Lcom/zykj/study/ui/home/my/StudentViewFragment;Ljava/util/List;)Lh7/p;
    .locals 3

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget v0, Lcom/zykj/study/R$layout;->layout_status_no_supervise_group:I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget v0, Lcom/zykj/study/R$id;->btn_create:I

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/widget/Button;

    .line 30
    .line 31
    new-instance v1, Lb5/k4;

    .line 32
    .line 33
    invoke-direct {v1, p0}, Lb5/k4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewFragment;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentViewBinding;

    .line 44
    .line 45
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudentViewBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 46
    .line 47
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 48
    .line 49
    const/4 v1, -0x1

    .line 50
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->h(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentViewBinding;

    .line 62
    .line 63
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudentViewBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d()V

    .line 66
    .line 67
    .line 68
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 69
    .line 70
    return-object p0
.end method

.method public static final w(Lcom/zykj/study/ui/home/my/StudentViewFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->o()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final x(Lcom/zykj/study/ui/home/my/StudentViewFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "requireParentFragment(...)"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/my/StudentViewFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/my/StudentViewFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/my/StudentViewFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/my/StudentViewFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/my/StudentViewFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/my/StudentViewFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/my/StudentViewFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/my/StudentViewFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/my/StudentViewFragment$initData$1;->c:I

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
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->s()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance v0, Lb5/i4;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Lb5/i4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewFragment;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lcom/zykj/study/ui/home/my/StudentViewFragment$a;

    .line 76
    .line 77
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/StudentViewFragment$a;-><init>(Lx7/l;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->s()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance v0, Lb5/j4;

    .line 92
    .line 93
    invoke-direct {v0, p0}, Lb5/j4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewFragment;)V

    .line 94
    .line 95
    .line 96
    new-instance v1, Lcom/zykj/study/ui/home/my/StudentViewFragment$a;

    .line 97
    .line 98
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/StudentViewFragment$a;-><init>(Lx7/l;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 102
    .line 103
    .line 104
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 105
    .line 106
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
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentViewBinding;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->r()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentStudentViewBinding;->setEntity(Lcom/zykj/study/viewmodels/StudentViewViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->r()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance v0, Lb5/h4;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lb5/h4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewFragment;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lcom/zykj/study/ui/home/my/StudentViewFragment$a;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/StudentViewFragment$a;-><init>(Lx7/l;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 40
    .line 41
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_student_view:I

    .line 2
    .line 3
    return v0
.end method

.method public final o()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->r()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->c()Landroidx/lifecycle/MutableLiveData;

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
    check-cast v0, Ljava/util/List;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/16 v2, 0xa

    .line 20
    .line 21
    invoke-static {v0, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/4 v5, 0x0

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Lcom/zykj/study/bean/teach/CourseBindBean;

    .line 44
    .line 45
    new-instance v6, Lcom/zykj/study/bean/SelectModel;

    .line 46
    .line 47
    invoke-direct {v6, v5, v4}, Lcom/zykj/study/bean/SelectModel;-><init>(ZLjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {v1}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v3, Lcom/zykj/study/adapter/SuperviseGroupAddAdapter;

    .line 59
    .line 60
    invoke-direct {v3, v1}, Lcom/zykj/study/adapter/SuperviseGroupAddAdapter;-><init>(Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    new-instance v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-direct {v1, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 70
    .line 71
    .line 72
    const-string v4, "\u9009\u62e9\u5b66\u5458\u7ec4"

    .line 73
    .line 74
    invoke-virtual {v1, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->H(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 79
    .line 80
    invoke-virtual {v1, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->I(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    new-instance v4, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-static {v0, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_1

    .line 102
    .line 103
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Lcom/zykj/study/bean/teach/CourseBindBean;

    .line 108
    .line 109
    invoke-virtual {v2}, Lcom/zykj/study/bean/teach/CourseBindBean;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-interface {v4, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    invoke-static {v4}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->q(Ljava/util/Collection;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->b(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 130
    .line 131
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    const/4 v4, 0x1

    .line 136
    invoke-direct {v1, v2, v4, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v3, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    new-instance v1, Lb5/l4;

    .line 144
    .line 145
    invoke-direct {v1, v3, p0}, Lb5/l4;-><init>(Lcom/zykj/study/adapter/SuperviseGroupAddAdapter;Lcom/zykj/study/ui/home/my/StudentViewFragment;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    new-instance v1, Lb5/m4;

    .line 153
    .line 154
    invoke-direct {v1}, Lb5/m4;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->v(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sget v1, Lcom/zykj/study/R$string;->sure:I

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    sget v1, Lcom/zykj/study/R$string;->cancel:I

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-eqz v0, :cond_3

    .line 182
    .line 183
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/Hilt_StudentViewFragment;->getContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    if-eqz v2, :cond_2

    .line 192
    .line 193
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    if-eqz v2, :cond_2

    .line 198
    .line 199
    sget v3, Lcom/zykj/lib/ui/R$dimen;->view_250:I

    .line 200
    .line 201
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    float-to-int v2, v2

    .line 206
    goto :goto_2

    .line 207
    :cond_2
    const/16 v2, 0xfa

    .line 208
    .line 209
    :goto_2
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 212
    .line 213
    .line 214
    :cond_3
    return-void
.end method
