.class public final Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;
.super Lcom/zykj/huiwei/launcher/ui/fragment/applist/Hilt_LCAppFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0094@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000b\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;",
        "Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "initView",
        "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;",
        "j",
        "Lkotlin/Lazy;",
        "s",
        "()Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;",
        "viewModel",
        "Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;",
        "k",
        "r",
        "()Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;",
        "mainViewModel",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLCAppFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LCAppFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,45:1\n106#2,15:46\n172#2,9:61\n*S KotlinDebug\n*F\n+ 1 LCAppFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment\n*L\n18#1:46,15\n19#1:61,9\n*E\n"
    }
.end annotation


# instance fields
.field public final j:Lkotlin/Lazy;

.field public final k:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/Hilt_LCAppFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$viewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$viewModels$default$3;-><init>(Lkotlin/Lazy;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$viewModels$default$4;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/Lazy;)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v5, p0, v0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/Lazy;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v5}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;->j:Lkotlin/Lazy;

    .line 47
    .line 48
    const-class v0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$activityViewModels$default$1;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$activityViewModels$default$2;

    .line 60
    .line 61
    invoke-direct {v2, v4, p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$activityViewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/fragment/app/Fragment;)V

    .line 62
    .line 63
    .line 64
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$activityViewModels$default$3;

    .line 65
    .line 66
    invoke-direct {v3, p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;->k:Lkotlin/Lazy;

    .line 74
    .line 75
    return-void
.end method

.method public static final synthetic p(Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;)Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;->r()Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic q(Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;)Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;->s()Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final r()Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;->k:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$1;->d:I

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
    iput v1, v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$1;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$1;->d:I

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
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$1;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Landroid/os/Bundle;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    iput-object p2, v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$1;->a:Ljava/lang/Object;

    .line 62
    .line 63
    iput v3, v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$1;->d:I

    .line 64
    .line 65
    invoke-super {p0, p1, v0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v1, :cond_3

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->m()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance p2, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$2;

    .line 77
    .line 78
    invoke-direct {p2}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$2;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setDiffCallback(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const-string p2, "getViewLifecycleOwner(...)"

    .line 89
    .line 90
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$3;

    .line 98
    .line 99
    const/4 p1, 0x0

    .line 100
    invoke-direct {v3, p0, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$3;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;Lkotlin/coroutines/Continuation;)V

    .line 101
    .line 102
    .line 103
    const/4 v4, 0x3

    .line 104
    const/4 v5, 0x0

    .line 105
    const/4 v1, 0x0

    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$4;

    .line 122
    .line 123
    invoke-direct {v4, p0, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$4;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;Lkotlin/coroutines/Continuation;)V

    .line 124
    .line 125
    .line 126
    const/4 v5, 0x3

    .line 127
    const/4 v6, 0x0

    .line 128
    const/4 v3, 0x0

    .line 129
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 130
    .line 131
    .line 132
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p1
.end method

.method public final s()Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;->j:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;

    .line 8
    .line 9
    return-object v0
.end method
