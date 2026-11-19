# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/zykj/study/ui/home/find/FindFragment;
.super Lcom/zykj/study/ui/home/find/Hilt_FindFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/find/Hilt_FindFragment<",
        "Lcom/zykj/study/databinding/FragmentFindBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/Hilt_FindFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/study/ui/home/find/FindFragment$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/find/FindFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/find/FindFragment$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/FindFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/study/viewmodels/MicroCodeViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/study/ui/home/find/FindFragment$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/FindFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/study/ui/home/find/FindFragment$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/find/FindFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/study/ui/home/find/FindFragment$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/find/FindFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/FindFragment;->f:Lh7/d;

    .line 47
    .line 48
    new-instance v0, Lcom/zykj/study/ui/home/find/CourseFragment;

    .line 49
    .line 50
    invoke-direct {v0}, Lcom/zykj/study/ui/home/find/CourseFragment;-><init>()V

    .line 51
    .line 52
    .line 53
    filled-new-array {v0}, [Lcom/zykj/study/ui/home/find/CourseFragment;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Li7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/FindFragment;->g:Ljava/util/List;

    .line 62
    .line 63
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/find/FindFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/FindFragment;->q(Lcom/zykj/study/ui/home/find/FindFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/find/FindFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/FindFragment;->r(Lcom/zykj/study/ui/home/find/FindFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/find/FindFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/FindFragment;->s(Lcom/zykj/study/ui/home/find/FindFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/find/FindFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/FindFragment;->t(Lcom/zykj/study/ui/home/find/FindFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/find/FindFragment;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/find/FindFragment;->o(Lcom/zykj/study/ui/home/find/FindFragment;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static final synthetic l(Lcom/zykj/study/ui/home/find/FindFragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/find/FindFragment;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lcom/zykj/study/ui/home/find/FindFragment;)Lcom/zykj/study/viewmodels/MicroCodeViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/FindFragment;->n()Lcom/zykj/study/viewmodels/MicroCodeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public static final o(Lcom/zykj/study/ui/home/find/FindFragment;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "bundle"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    const-string p1, "qr_code_text"

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance p2, Lcom/google/gson/Gson;

    .line 18
    .line 19
    invoke-direct {p2}, Lcom/google/gson/Gson;-><init>()V

    .line 20
    .line 21
    .line 22
    const-class v0, Lcom/zykj/study/bean/ScanResult;

    .line 23
    .line 24
    invoke-virtual {p2, p1, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lcom/zykj/study/bean/ScanResult;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/study/bean/ScanResult;->getCodeType()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    const/4 v0, 0x1

    .line 35
    if-ne p2, v0, :cond_0

    .line 36
    .line 37
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v4, Lcom/zykj/study/ui/home/find/FindFragment$initData$2$1;

    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    invoke-direct {v4, p0, p1, p2}, Lcom/zykj/study/ui/home/find/FindFragment$initData$2$1;-><init>(Lcom/zykj/study/ui/home/find/FindFragment;Lcom/zykj/study/bean/ScanResult;Lm7/c;)V

    .line 45
    .line 46
    .line 47
    const/4 v5, 0x3

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v2, 0x0

    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void

    .line 55
    :catch_0
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 56
    .line 57
    sget p2, Lcom/zykj/study/R$string;->scan_study_qr_code:I

    .line 58
    .line 59
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const-string p2, "getString(...)"

    .line 64
    .line 65
    invoke-static {p0, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1, p0}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public static final q(Lcom/zykj/study/ui/home/find/FindFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object p1, Lh5/c;->b:Lh5/c;

    .line 2
    .line 3
    new-instance v0, Ly4/s;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ly4/s;-><init>(Lcom/zykj/study/ui/home/find/FindFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lh5/c;->a(Lx7/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final r(Lcom/zykj/study/ui/home/find/FindFragment;)Lh7/p;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lv4/c;->a:Lv4/c$h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/c$h;->h()Landroidx/navigation/NavDirections;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final s(Lcom/zykj/study/ui/home/find/FindFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object p1, Lh5/c;->b:Lh5/c;

    .line 2
    .line 3
    new-instance v0, Ly4/r;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ly4/r;-><init>(Lcom/zykj/study/ui/home/find/FindFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lh5/c;->a(Lx7/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final t(Lcom/zykj/study/ui/home/find/FindFragment;)Lh7/p;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lv4/c;->a:Lv4/c$h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/c$h;->f()Landroidx/navigation/NavDirections;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 15
    .line 16
    return-object p0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/find/FindFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/find/FindFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/find/FindFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/find/FindFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/find/FindFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/find/FindFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/find/FindFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/find/FindFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/find/FindFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/find/FindFragment$initData$1;->c:I

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eqz p1, :cond_4

    .line 67
    .line 68
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    new-instance v0, Ly4/o;

    .line 75
    .line 76
    invoke-direct {v0, p0}, Ly4/o;-><init>(Lcom/zykj/study/ui/home/find/FindFragment;)V

    .line 77
    .line 78
    .line 79
    const-string v1, "qr_code_key"

    .line 80
    .line 81
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 85
    .line 86
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
    check-cast p1, Lcom/zykj/study/databinding/FragmentFindBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/FindFragment;->n()Lcom/zykj/study/viewmodels/MicroCodeViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentFindBinding;->setMicroViewModel(Lcom/zykj/study/viewmodels/MicroCodeViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/study/databinding/FragmentFindBinding;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentFindBinding;->tvSearch:Landroid/widget/TextView;

    .line 21
    .line 22
    new-instance p2, Ly4/p;

    .line 23
    .line 24
    invoke-direct {p2, p0}, Ly4/p;-><init>(Lcom/zykj/study/ui/home/find/FindFragment;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lcom/zykj/study/databinding/FragmentFindBinding;

    .line 35
    .line 36
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentFindBinding;->ivScan:Landroid/widget/ImageView;

    .line 37
    .line 38
    new-instance p2, Ly4/q;

    .line 39
    .line 40
    invoke-direct {p2, p0}, Ly4/q;-><init>(Lcom/zykj/study/ui/home/find/FindFragment;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/FindFragment;->p()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string p2, "getViewLifecycleOwner(...)"

    .line 54
    .line 55
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance p2, Lcom/zykj/study/ui/home/find/FindFragment$initView$4;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-direct {p2, p0, v0}, Lcom/zykj/study/ui/home/find/FindFragment$initView$4;-><init>(Lcom/zykj/study/ui/home/find/FindFragment;Lm7/c;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p2}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 69
    .line 70
    .line 71
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 72
    .line 73
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_find:I

    .line 2
    .line 3
    return v0
.end method

.method public final n()Lcom/zykj/study/viewmodels/MicroCodeViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/FindFragment;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/MicroCodeViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final p()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentFindBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentFindBinding;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->newTab()Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "newTab(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Landroid/text/Editable$Factory;->getInstance()Landroid/text/Editable$Factory;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget v2, Lcom/zykj/study/R$string;->all_course:I

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Landroid/text/Editable$Factory;->newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->setText(Ljava/lang/CharSequence;)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lcom/zykj/study/databinding/FragmentFindBinding;

    .line 40
    .line 41
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentFindBinding;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Lcom/google/android/material/tabs/TabLayout;->addTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
