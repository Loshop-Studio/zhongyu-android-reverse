.class public final Lcom/zykj/study/ui/home/find/MicroCodeFragment;
.super Lcom/zykj/study/ui/home/find/Hilt_MicroCodeFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/find/Hilt_MicroCodeFragment<",
        "Lcom/zykj/study/databinding/FragmentMicroBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public final i:Landroidx/activity/result/ActivityResultLauncher;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/Hilt_MicroCodeFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/find/MicroCodeFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/find/MicroCodeFragment$b;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$b;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$1;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 28
    .line 29
    new-instance v2, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$2;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v2, Lcom/zykj/study/viewmodels/OssTokenViewModel;

    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$3;

    .line 45
    .line 46
    invoke-direct {v3, v0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$4;

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-direct {v4, v5, v0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 53
    .line 54
    .line 55
    new-instance v6, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$5;

    .line 56
    .line 57
    invoke-direct {v6, p0, v0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v6}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->g:Lh7/d;

    .line 65
    .line 66
    new-instance v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$6;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$6;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 69
    .line 70
    .line 71
    new-instance v2, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$7;

    .line 72
    .line 73
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$7;-><init>(Lx7/a;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-class v1, Lcom/zykj/study/viewmodels/MicroCodeViewModel;

    .line 81
    .line 82
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    new-instance v2, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$8;

    .line 87
    .line 88
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$8;-><init>(Lh7/d;)V

    .line 89
    .line 90
    .line 91
    new-instance v3, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$9;

    .line 92
    .line 93
    invoke-direct {v3, v5, v0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$9;-><init>(Lx7/a;Lh7/d;)V

    .line 94
    .line 95
    .line 96
    new-instance v4, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$10;

    .line 97
    .line 98
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$special$$inlined$viewModels$default$10;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->h:Lh7/d;

    .line 106
    .line 107
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    .line 108
    .line 109
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 110
    .line 111
    .line 112
    new-instance v1, Ly4/u;

    .line 113
    .line 114
    invoke-direct {v1}, Ly4/u;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const-string v1, "registerForActivityResult(...)"

    .line 122
    .line 123
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->i:Landroidx/activity/result/ActivityResultLauncher;

    .line 127
    .line 128
    return-void
.end method

.method private static final A(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method private final B(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$startUpload$1;-><init>(Ljava/lang/String;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private final D(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicroThumbnail$1;

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    move-object v5, p0

    .line 9
    move-object v2, p1

    .line 10
    move-object v6, p2

    .line 11
    move-object v3, p3

    .line 12
    move-object v4, p4

    .line 13
    invoke-direct/range {v1 .. v7}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicroThumbnail$1;-><init>(Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lm7/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    const/4 v5, 0x0

    .line 18
    move-object v3, v1

    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static synthetic g(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->A(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->z(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->y(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->w(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Landroid/view/View;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->x(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Landroid/view/View;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->s(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic m(Lcom/zykj/study/ui/home/find/MicroCodeFragment;)Lcom/zykj/study/ui/home/find/MicroCodeFragmentArgs;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->t()Lcom/zykj/study/ui/home/find/MicroCodeFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/study/ui/home/find/MicroCodeFragment;)Lcom/zykj/study/viewmodels/MicroCodeViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->u()Lcom/zykj/study/viewmodels/MicroCodeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic o(Lcom/zykj/study/ui/home/find/MicroCodeFragment;)Lcom/zykj/study/viewmodels/OssTokenViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->v()Lcom/zykj/study/viewmodels/OssTokenViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic p(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->B(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic q(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->C(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic r(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->D(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final s(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;-><init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private final u()Lcom/zykj/study/viewmodels/MicroCodeViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->h:Lh7/d;

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

.method private final v()Lcom/zykj/study/viewmodels/OssTokenViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/OssTokenViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final w(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 1

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
    const-string p1, "RESULT_KEY_ACTION"

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    const v0, -0x3a52d697

    .line 24
    .line 25
    .line 26
    if-eq p2, v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string p2, "RESULT_VALUE_ACTION_CROP"

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    sget-object p1, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->t()Lcom/zykj/study/ui/home/find/MicroCodeFragmentArgs;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragmentArgs;->b()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p1, p2, p0}, Lcom/zykj/blackboard/utils/BoardBox;->clearLocalData(Ljava/lang/String;Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 55
    .line 56
    return-object p0
.end method

.method public static final x(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Landroid/view/View;)Lh7/p;
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
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 11
    .line 12
    .line 13
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final y(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;)Lh7/p;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v0, Lcom/zykj/study/ui/home/find/k;->a:Lcom/zykj/study/ui/home/find/k$c;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/zykj/study/ui/home/find/k$c;->b(Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 20
    .line 21
    return-object p0
.end method

.method public static final z(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;)Lh7/p;
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lcom/zykj/study/ui/home/find/k;->a:Lcom/zykj/study/ui/home/find/k$c;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->t()Lcom/zykj/study/ui/home/find/MicroCodeFragmentArgs;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroCodeFragmentArgs;->b()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v1, "REQUEST_KEY_CROP"

    .line 16
    .line 17
    invoke-virtual {v0, v1, p0}, Lcom/zykj/study/ui/home/find/k$c;->a(Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 25
    .line 26
    return-object p0
.end method


# virtual methods
.method public final C(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p2, p1, v1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;-><init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Ljava/lang/String;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initData$1;->c:I

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
    new-instance p1, Ly4/v;

    .line 63
    .line 64
    invoke-direct {p1, p0}, Ly4/v;-><init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;)V

    .line 65
    .line 66
    .line 67
    const-string v0, "REQUEST_KEY_CROP"

    .line 68
    .line 69
    invoke-static {p0, v0, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lx7/p;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->i:Landroidx/activity/result/ActivityResultLauncher;

    .line 73
    .line 74
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 80
    .line 81
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/view/board/board/BoardFragment;->f:Lcom/zykj/view/board/board/BoardFragment$a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->t()Lcom/zykj/study/ui/home/find/MicroCodeFragmentArgs;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Lcom/zykj/study/ui/home/find/MicroCodeFragmentArgs;->b()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v13, Lcom/zykj/view/board/board/g$a;->c:Lcom/zykj/view/board/board/g$a;

    .line 14
    .line 15
    new-instance v3, Lcom/zykj/view/board/board/d;

    .line 16
    .line 17
    const/16 v14, 0x10a

    .line 18
    .line 19
    const/4 v15, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x1

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x1

    .line 25
    const/4 v9, 0x1

    .line 26
    const/4 v10, 0x1

    .line 27
    const/4 v11, 0x1

    .line 28
    const/4 v12, 0x0

    .line 29
    invoke-direct/range {v3 .. v15}, Lcom/zykj/view/board/board/d;-><init>(ZZZZZZZZZLcom/zykj/view/board/board/g;ILkotlin/jvm/internal/n;)V

    .line 30
    .line 31
    .line 32
    new-instance v4, Lp5/b1;

    .line 33
    .line 34
    const/16 v11, 0x21

    .line 35
    .line 36
    const/4 v12, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x1

    .line 40
    const/4 v8, 0x5

    .line 41
    const/4 v9, 0x5

    .line 42
    const/4 v10, 0x0

    .line 43
    invoke-direct/range {v4 .. v12}, Lp5/b1;-><init>(Lcom/zykj/view/utils/ZoomPointSolution;ZZIIZILkotlin/jvm/internal/n;)V

    .line 44
    .line 45
    .line 46
    new-instance v5, Lp5/a;

    .line 47
    .line 48
    new-instance v7, Ly4/w;

    .line 49
    .line 50
    invoke-direct {v7, v0}, Ly4/w;-><init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;)V

    .line 51
    .line 52
    .line 53
    new-instance v8, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    invoke-direct {v8, v0, v6}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;-><init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Lm7/c;)V

    .line 57
    .line 58
    .line 59
    new-instance v9, Ly4/x;

    .line 60
    .line 61
    invoke-direct {v9, v0}, Ly4/x;-><init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;)V

    .line 62
    .line 63
    .line 64
    new-instance v12, Ly4/y;

    .line 65
    .line 66
    invoke-direct {v12, v0}, Ly4/y;-><init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;)V

    .line 67
    .line 68
    .line 69
    const/16 v19, 0x1fb1

    .line 70
    .line 71
    const/16 v20, 0x0

    .line 72
    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v10, 0x0

    .line 75
    const/4 v11, 0x0

    .line 76
    const/4 v13, 0x0

    .line 77
    const/4 v14, 0x0

    .line 78
    const/16 v16, 0x0

    .line 79
    .line 80
    const/16 v17, 0x0

    .line 81
    .line 82
    const/16 v18, 0x0

    .line 83
    .line 84
    invoke-direct/range {v5 .. v20}, Lp5/a;-><init>(ZLx7/l;Lx7/p;Lx7/l;Lx7/l;Lx7/l;Lx7/l;Lx7/a;Lx7/a;Lx7/l;Lx7/l;Lx7/l;Lx7/l;ILkotlin/jvm/internal/n;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/zykj/view/board/board/BoardFragment$a;->a(Ljava/lang/String;Lcom/zykj/view/board/board/d;Lp5/b1;Lp5/a;)Lcom/zykj/view/board/board/BoardFragment;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    sget v3, Lcom/zykj/study/R$id;->container:I

    .line 100
    .line 101
    const-string v4, "black_fragment"

    .line 102
    .line 103
    invoke-virtual {v2, v3, v1, v4}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    .line 108
    .line 109
    .line 110
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 111
    .line 112
    return-object v1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_micro:I

    .line 2
    .line 3
    return v0
.end method

.method public final t()Lcom/zykj/study/ui/home/find/MicroCodeFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/find/MicroCodeFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method
