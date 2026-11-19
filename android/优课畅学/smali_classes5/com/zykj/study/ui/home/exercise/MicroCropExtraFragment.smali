# RE note 本类字节码直接引用的读写或显示接口包括WebView。
.class public final Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;
.super Lcom/zykj/study/ui/home/exercise/Hilt_MicroCropExtraFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/exercise/Hilt_MicroCropExtraFragment<",
        "Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final i:Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment$a;

.field public static final j:I


# instance fields
.field public final f:Lh7/d;

.field public g:Lx7/l;

.field public h:Lx7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->i:Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->j:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/Hilt_MicroCropExtraFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zykj/study/viewmodels/MicroExtraViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->f:Lh7/d;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->o(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->l(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->m(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->n(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;Landroid/view/View;)V

    return-void
.end method

.method private final k()Lcom/zykj/study/viewmodels/MicroExtraViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->f:Lh7/d;

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

.method public static final l(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->h:Lx7/a;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p1}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final m(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;->webView:Lcom/zykj/study/view/CustomX5WebView;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/blankj/utilcode/util/m;->d(Landroid/view/View;)Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-instance v1, Ljava/io/File;

    .line 34
    .line 35
    const-string v2, "temp.jpg"

    .line 36
    .line 37
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 41
    .line 42
    invoke-static {p1, v1, v0}, Lcom/blankj/utilcode/util/m;->b(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->g:Lx7/l;

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    invoke-interface {p1, v1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    const-string p1, "IMAGE_PATH"

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {p1, v0}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v0, "RESULT_IMAGE_PATH_KEY"

    .line 72
    .line 73
    invoke-static {p0, v0, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 81
    .line 82
    .line 83
    :cond_3
    :goto_0
    return-void
.end method

.method public static final n(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;->webView:Lcom/zykj/study/view/CustomX5WebView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/webkit/WebView;->zoomIn()Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final o(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;->webView:Lcom/zykj/study/view/CustomX5WebView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/webkit/WebView;->zoomOut()Z

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->p()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;

    .line 9
    .line 10
    new-instance p2, Lw4/b1;

    .line 11
    .line 12
    invoke-direct {p2, p0}, Lw4/b1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;->setCloseListener(Landroid/view/View$OnClickListener;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;

    .line 23
    .line 24
    new-instance p2, Lw4/c1;

    .line 25
    .line 26
    invoke-direct {p2, p0}, Lw4/c1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;->setTailoringListener(Landroid/view/View$OnClickListener;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;

    .line 37
    .line 38
    new-instance p2, Lw4/d1;

    .line 39
    .line 40
    invoke-direct {p2, p0}, Lw4/d1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;->setEnlargeListener(Landroid/view/View$OnClickListener;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;

    .line 51
    .line 52
    new-instance p2, Lw4/e1;

    .line 53
    .line 54
    invoke-direct {p2, p0}, Lw4/e1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;->setNarrowListener(Landroid/view/View$OnClickListener;)V

    .line 58
    .line 59
    .line 60
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 61
    .line 62
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_micro_crop_extra:I

    .line 2
    .line 3
    return v0
.end method

.method public final p()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;->webView:Lcom/zykj/study/view/CustomX5WebView;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;->webView:Lcom/zykj/study/view/CustomX5WebView;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;->webView:Lcom/zykj/study/view/CustomX5WebView;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;->webView:Lcom/zykj/study/view/CustomX5WebView;

    .line 47
    .line 48
    sget-object v1, Le5/e;->a:Le5/e;

    .line 49
    .line 50
    invoke-virtual {v1}, Le5/e;->d()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v0, v2}, Lcom/zykj/study/view/CustomX5WebView;->g(Ljava/util/List;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Le5/e;->a()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v0, v2}, Lcom/zykj/study/view/CustomX5WebView;->g(Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Le5/e;->b()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Lcom/zykj/study/view/CustomX5WebView;->g(Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->k()Lcom/zykj/study/viewmodels/MicroExtraViewModel;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/MicroExtraViewModel;->a()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;

    .line 90
    .line 91
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentMicroCropExtraBinding;->webView:Lcom/zykj/study/view/CustomX5WebView;

    .line 92
    .line 93
    const-string v2, "text/html; charset=UTF-8"

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    invoke-virtual {v1, v0, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_0
    return-void
.end method

.method public final q(Lx7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->h:Lx7/a;

    .line 2
    .line 3
    return-void
.end method

.method public final r(Lx7/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->g:Lx7/l;

    .line 2
    .line 3
    return-void
.end method
