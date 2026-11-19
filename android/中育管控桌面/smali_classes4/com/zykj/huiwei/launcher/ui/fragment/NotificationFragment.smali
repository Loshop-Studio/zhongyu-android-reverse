.class public final Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;
.super Lcom/zykj/huiwei/launcher/ui/fragment/Hilt_NotificationFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/huiwei/launcher/ui/fragment/Hilt_NotificationFragment<",
        "Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 $2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000e\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\r8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000f\u001a\u0004\u0008\u0013\u0010\u0010R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006&"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;",
        "Lcom/zykj/huiwei/launcher/base/CommonFragment;",
        "Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;",
        "<init>",
        "()V",
        "",
        "layoutId",
        "()I",
        "",
        "f",
        "initData",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "w",
        "",
        "i",
        "Z",
        "()Z",
        "isLightStatusBars",
        "j",
        "h",
        "isLightNavigationBars",
        "Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;",
        "k",
        "Lkotlin/Lazy;",
        "x",
        "()Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;",
        "viewModel",
        "",
        "",
        "l",
        "Ljava/util/List;",
        "readMessageIdList",
        "Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;",
        "m",
        "Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;",
        "adapter",
        "n",
        "a",
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
        "SMAP\nNotificationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/NotificationFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,129:1\n106#2,15:130\n*S KotlinDebug\n*F\n+ 1 NotificationFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/NotificationFragment\n*L\n35#1:130,15\n*E\n"
    }
.end annotation


# static fields
.field public static final n:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$a;

.field public static final o:I


# instance fields
.field public final i:Z

.field public final j:Z

.field public final k:Lkotlin/Lazy;

.field public final l:Ljava/util/List;

.field public m:Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->n:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->o:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/Hilt_NotificationFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->i:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->j:Z

    .line 8
    .line 9
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$special$$inlined$viewModels$default$1;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 15
    .line 16
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$special$$inlined$viewModels$default$2;

    .line 17
    .line 18
    invoke-direct {v2, v0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$special$$inlined$viewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-class v1, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 26
    .line 27
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$special$$inlined$viewModels$default$3;

    .line 32
    .line 33
    invoke-direct {v2, v0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$special$$inlined$viewModels$default$3;-><init>(Lkotlin/Lazy;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$special$$inlined$viewModels$default$4;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-direct {v3, v4, v0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$special$$inlined$viewModels$default$4;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/Lazy;)V

    .line 40
    .line 41
    .line 42
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$special$$inlined$viewModels$default$5;

    .line 43
    .line 44
    invoke-direct {v4, p0, v0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/Lazy;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->k:Lkotlin/Lazy;

    .line 52
    .line 53
    new-instance v0, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->l:Ljava/util/List;

    .line 59
    .line 60
    return-void
.end method

.method public static final A(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->m:Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "adapter"

    .line 6
    .line 7
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

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

.method public static final B(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Landroidx/paging/CombinedLoadStates;)Lkotlin/Unit;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;->refreshLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/paging/CombinedLoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    instance-of v1, v1, Landroidx/paging/LoadState$Loading;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/paging/CombinedLoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v0, p1, Landroidx/paging/LoadState$Loading;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->x()Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    instance-of v0, p1, Landroidx/paging/LoadState$NotLoading;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->x()Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    instance-of p1, p1, Landroidx/paging/LoadState$Error;

    .line 64
    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->x()Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 84
    .line 85
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 86
    .line 87
    .line 88
    throw p0
.end method

.method public static final C(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_2

    .line 6
    .line 7
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->m:Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const-string p1, "adapter"

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    move-object p1, v0

    .line 18
    :cond_0
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->getItemCount()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;

    .line 29
    .line 30
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;->rvNotification:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const v1, 0x7f0c0051

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const v0, 0x7f09038e

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Landroid/widget/TextView;

    .line 55
    .line 56
    const/16 v1, 0x8

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;

    .line 66
    .line 67
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;->statusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 68
    .line 69
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 70
    .line 71
    const/4 v1, -0x1

    .line 72
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->e(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;

    .line 84
    .line 85
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;->statusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->c()V

    .line 88
    .line 89
    .line 90
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->z(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic q(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->A(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;)V

    return-void
.end method

.method public static synthetic r(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Landroidx/paging/CombinedLoadStates;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->B(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Landroidx/paging/CombinedLoadStates;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->y(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->C(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Ljava/lang/Boolean;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;)Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->m:Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic v(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;)Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->x()Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final x()Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->k:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final y(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "$this$addCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->w()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final z(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->w()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public f()V
    .locals 11

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->l:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->m:Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;->titleBar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 17
    .line 18
    new-instance v1, Lf4/h0;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lf4/h0;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->h(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;->refreshLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 33
    .line 34
    new-instance v1, Lf4/i0;

    .line 35
    .line 36
    invoke-direct {v1, p0}, Lf4/i0;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;->rvNotification:Landroidx/recyclerview/widget/RecyclerView;

    .line 49
    .line 50
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->m:Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;

    .line 51
    .line 52
    const-string v2, "adapter"

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    if-nez v1, :cond_0

    .line 56
    .line 57
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    move-object v1, v3

    .line 61
    :cond_0
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->m:Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    move-object v0, v3

    .line 72
    :cond_1
    new-instance v1, Lf4/j0;

    .line 73
    .line 74
    invoke-direct {v1, p0}, Lf4/j0;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroidx/paging/PagingDataAdapter;->addLoadStateListener(Lkotlin/jvm/functions/Function1;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->x()Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    new-instance v2, Lf4/k0;

    .line 93
    .line 94
    invoke-direct {v2, p0}, Lf4/k0;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;)V

    .line 95
    .line 96
    .line 97
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$b;

    .line 98
    .line 99
    invoke-direct {v4, v2}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1, v4}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    new-instance v8, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$initView$5;

    .line 110
    .line 111
    invoke-direct {v8, p0, v3}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$initView$5;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Lkotlin/coroutines/Continuation;)V

    .line 112
    .line 113
    .line 114
    const/4 v9, 0x3

    .line 115
    const/4 v10, 0x0

    .line 116
    const/4 v6, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public initData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$initData$1;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$initData$1;->c:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment$initData$1;->c:I

    .line 54
    .line 55
    invoke-super {p0, v0}, Lcom/zykj/base/BaseFragment;->initData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v3, Lf4/l0;

    .line 71
    .line 72
    invoke-direct {v3, p0}, Lf4/l0;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;)V

    .line 73
    .line 74
    .line 75
    const/4 v4, 0x2

    .line 76
    const/4 v5, 0x0

    .line 77
    const/4 v2, 0x0

    .line 78
    move-object v1, p0

    .line 79
    invoke-static/range {v0 .. v5}, Landroidx/activity/OnBackPressedDispatcherKt;->addCallback$default(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/activity/OnBackPressedCallback;

    .line 80
    .line 81
    .line 82
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0c0048

    return v0
.end method

.method public final w()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->l:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->l:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toLongArray(Ljava/util/Collection;)[J

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "BUNDLE_KEY_READ_ID"

    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 23
    .line 24
    .line 25
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 26
    .line 27
    const-string v1, "REQUEST_KEY"

    .line 28
    .line 29
    invoke-static {p0, v1, v0}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 37
    .line 38
    .line 39
    return-void
.end method
