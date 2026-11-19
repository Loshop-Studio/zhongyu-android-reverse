.class public final Lcom/friday/user/view/UserFragment;
.super Lcom/friday/user/view/Hilt_UserFragment;
.source "SourceFile"

# interfaces
.implements Lj2/j;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/user/view/Hilt_UserFragment<",
        "Lcom/friday/user/databinding/UserFragmentBinding;",
        ">;",
        "Lj2/j;"
    }
.end annotation


# instance fields
.field public i:Lcom/friday/user/view/PersonalInfoFragment;

.field public j:Lcom/friday/user/view/AboutFragment;

.field public k:Lcom/friday/user/view/HelpFragment;

.field public final l:Lqc/d;

.field public m:Ljava/util/ArrayList;

.field public n:Ljava/util/ArrayList;

.field public o:Lcom/friday/user/adapter/UserViewPageAdapter;

.field public final p:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/friday/user/view/Hilt_UserFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh4/r;

    .line 5
    .line 6
    invoke-direct {v0}, Lh4/r;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/friday/user/view/UserFragment;->l:Lqc/d;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/friday/user/view/UserFragment;->m:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/friday/user/view/UserFragment;->n:Ljava/util/ArrayList;

    .line 28
    .line 29
    const-class v0, Lcom/friday/user/viewmodel/UserViewModel;

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Lcom/friday/user/view/UserFragment$special$$inlined$activityViewModels$default$1;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Lcom/friday/user/view/UserFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 38
    .line 39
    .line 40
    new-instance v2, Lcom/friday/user/view/UserFragment$special$$inlined$activityViewModels$default$2;

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-direct {v2, v3, p0}, Lcom/friday/user/view/UserFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 44
    .line 45
    .line 46
    new-instance v3, Lcom/friday/user/view/UserFragment$special$$inlined$activityViewModels$default$3;

    .line 47
    .line 48
    invoke-direct {v3, p0}, Lcom/friday/user/view/UserFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lcom/friday/user/view/UserFragment;->p:Lqc/d;

    .line 56
    .line 57
    return-void
.end method

.method private final A()Lcom/friday/user/viewmodel/UserViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/user/view/UserFragment;->p:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/user/viewmodel/UserViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final D(Lcom/friday/user/view/UserFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final G(Lcom/friday/user/view/UserFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    if-eqz p3, :cond_3

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    if-eq p3, p1, :cond_3

    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    if-eq p3, p2, :cond_3

    .line 16
    .line 17
    const/4 p2, 0x3

    .line 18
    const-string v0, "getChildFragmentManager(...)"

    .line 19
    .line 20
    if-eq p3, p2, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x4

    .line 23
    if-eq p3, p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    sget-object p1, Lcom/friday/common/widget/dialog/a;->a:Lcom/friday/common/widget/dialog/a;

    .line 33
    .line 34
    new-instance p2, Lh4/v;

    .line 35
    .line 36
    invoke-direct {p2, p0}, Lh4/v;-><init>(Lcom/friday/user/view/UserFragment;)V

    .line 37
    .line 38
    .line 39
    const/4 p3, 0x0

    .line 40
    invoke-virtual {p1, p3, p2}, Lcom/friday/common/widget/dialog/a;->s(ZLhd/a;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string p2, "exit"

    .line 52
    .line 53
    invoke-virtual {p1, p0, p2}, Lcom/friday/common/widget/dialog/BaseDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    if-eqz p2, :cond_2

    .line 62
    .line 63
    sget-object p2, Lcom/friday/common/widget/dialog/a;->a:Lcom/friday/common/widget/dialog/a;

    .line 64
    .line 65
    new-instance p3, Lh4/u;

    .line 66
    .line 67
    invoke-direct {p3, p0}, Lh4/u;-><init>(Lcom/friday/user/view/UserFragment;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p1, p3}, Lcom/friday/common/widget/dialog/a;->s(ZLhd/a;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string p2, "delete"

    .line 82
    .line 83
    invoke-virtual {p1, p0, p2}, Lcom/friday/common/widget/dialog/BaseDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    :goto_0
    return-void

    .line 87
    :cond_3
    invoke-virtual {p0}, Lcom/friday/user/view/UserFragment;->C()Lcom/friday/user/adapter/UserMenuAdapter;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {p0, p1, p3}, Lcom/friday/user/view/UserFragment;->E(Ljava/lang/String;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/friday/user/view/UserFragment;->C()Lcom/friday/user/adapter/UserMenuAdapter;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p0, p3}, Lcom/friday/user/adapter/UserMenuAdapter;->j(I)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public static final H(Lcom/friday/user/view/UserFragment;)Lqc/q;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    sget-object v0, Lk2/v;->a:Lk2/v$a;

    .line 6
    .line 7
    const-string v1, "CacheClear"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "ClearCache"

    .line 13
    .line 14
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/friday/user/view/UserFragment;->A()Lcom/friday/user/viewmodel/UserViewModel;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Lcom/friday/user/viewmodel/UserViewModel;->m()V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 30
    .line 31
    return-object p0
.end method

.method public static final I(Lcom/friday/user/view/UserFragment;)Lqc/q;
    .locals 3

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Lcom/friday/common/helper/b;->i()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v1, v2}, Lcom/friday/common/helper/b;->z(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, ""

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/friday/common/helper/b;->A(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 34
    .line 35
    .line 36
    :cond_0
    sget-object p0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/friday/common/helper/c;->f()V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 42
    .line 43
    return-object p0
.end method

.method public static final K()Lcom/friday/user/adapter/UserMenuAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/user/adapter/UserMenuAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/user/adapter/UserMenuAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic r(Lcom/friday/user/view/UserFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/user/view/UserFragment;->D(Lcom/friday/user/view/UserFragment;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/friday/user/view/UserFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/user/view/UserFragment;->I(Lcom/friday/user/view/UserFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/friday/user/view/UserFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/user/view/UserFragment;->H(Lcom/friday/user/view/UserFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u()Lcom/friday/user/adapter/UserMenuAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/user/view/UserFragment;->K()Lcom/friday/user/adapter/UserMenuAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic v(Lcom/friday/user/view/UserFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/user/view/UserFragment;->G(Lcom/friday/user/view/UserFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static final synthetic w(Lcom/friday/user/view/UserFragment;)Lcom/friday/user/adapter/UserMenuAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/user/view/UserFragment;->C()Lcom/friday/user/adapter/UserMenuAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic x(Lcom/friday/user/view/UserFragment;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/user/view/UserFragment;->E(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final B()Lcom/friday/user/view/PersonalInfoFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/user/view/UserFragment;->i:Lcom/friday/user/view/PersonalInfoFragment;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "personalInfoFragment"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final C()Lcom/friday/user/adapter/UserMenuAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/user/view/UserFragment;->l:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/user/adapter/UserMenuAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final E(Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/user/databinding/UserFragmentBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/user/databinding/UserFragmentBinding;->f:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/friday/user/view/UserFragment;->A()Lcom/friday/user/viewmodel/UserViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/friday/user/viewmodel/UserViewModel;->o()V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/friday/user/databinding/UserFragmentBinding;

    .line 26
    .line 27
    iget-object p1, p1, Lcom/friday/user/databinding/UserFragmentBinding;->h:Lcom/friday/common/widget/FridayNoTouchViewPager;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lcom/friday/common/widget/FridayNoTouchViewPager;->setCurrentItem(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lcom/friday/user/databinding/UserFragmentBinding;

    .line 37
    .line 38
    iget-object p1, p1, Lcom/friday/user/databinding/UserFragmentBinding;->g:Landroid/view/View;

    .line 39
    .line 40
    const/16 p2, 0x8

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lcom/friday/user/databinding/UserFragmentBinding;

    .line 50
    .line 51
    iget-object p1, p1, Lcom/friday/user/databinding/UserFragmentBinding;->c:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final F()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/user/databinding/UserFragmentBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/user/databinding/UserFragmentBinding;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->o()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x1

    .line 32
    const/4 v3, 0x0

    .line 33
    if-ne v1, v2, :cond_0

    .line 34
    .line 35
    sget v1, Lcom/friday/user/R$array;->student_menu:I

    .line 36
    .line 37
    invoke-static {v1}, Lz1/b;->g(I)[Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    array-length v2, v1

    .line 42
    :goto_0
    if-ge v3, v2, :cond_1

    .line 43
    .line 44
    aget-object v4, v1, v3

    .line 45
    .line 46
    iget-object v5, p0, Lcom/friday/user/view/UserFragment;->m:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget v1, Lcom/friday/user/R$array;->mine_menu:I

    .line 55
    .line 56
    invoke-static {v1}, Lz1/b;->g(I)[Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    array-length v2, v1

    .line 61
    :goto_1
    if-ge v3, v2, :cond_1

    .line 62
    .line 63
    aget-object v4, v1, v3

    .line 64
    .line 65
    iget-object v5, p0, Lcom/friday/user/view/UserFragment;->m:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual {p0}, Lcom/friday/user/view/UserFragment;->C()Lcom/friday/user/adapter/UserMenuAdapter;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v2, p0, Lcom/friday/user/view/UserFragment;->m:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/friday/user/view/UserFragment;->J()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/friday/user/view/UserFragment;->C()Lcom/friday/user/adapter/UserMenuAdapter;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    new-instance v2, Lh4/t;

    .line 90
    .line 91
    invoke-direct {v2, p0}, Lh4/t;-><init>(Lcom/friday/user/view/UserFragment;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lo1/d;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/friday/user/view/UserFragment;->C()Lcom/friday/user/adapter/UserMenuAdapter;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final J()V
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/user/adapter/UserViewPageAdapter;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getChildFragmentManager(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lcom/friday/user/view/UserFragment;->n:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lcom/friday/user/adapter/UserViewPageAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/friday/user/view/UserFragment;->o:Lcom/friday/user/adapter/UserViewPageAdapter;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/friday/user/databinding/UserFragmentBinding;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/friday/user/databinding/UserFragmentBinding;->h:Lcom/friday/common/widget/FridayNoTouchViewPager;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/friday/user/view/UserFragment;->o:Lcom/friday/user/adapter/UserViewPageAdapter;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lfr/castorflex/android/verticalviewpager/VerticalViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/user/R$layout;->user_fragment:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseFragment;->initView()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/user/view/UserFragment;->n:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/user/view/UserFragment;->n:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/friday/user/view/UserFragment;->B()Lcom/friday/user/view/PersonalInfoFragment;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/friday/user/view/UserFragment;->n:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/friday/user/view/UserFragment;->y()Lcom/friday/user/view/AboutFragment;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/friday/user/view/UserFragment;->n:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/friday/user/view/UserFragment;->z()Lcom/friday/user/view/HelpFragment;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/friday/user/view/UserFragment;->F()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/friday/user/view/UserFragment;->initDataSource()V

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, Lcom/friday/user/view/UserFragment$initData$1;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-direct {v1, p0, v2}, Lcom/friday/user/view/UserFragment$initData$1;-><init>(Lcom/friday/user/view/UserFragment;Lvc/c;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lhd/p;)Lkotlinx/coroutines/g;

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public initDataSource()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseFragment;->initDataSource()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/user/view/UserFragment;->A()Lcom/friday/user/viewmodel/UserViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/friday/user/viewmodel/UserViewModel;->r()Landroidx/lifecycle/MutableLiveData;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Lh4/s;

    .line 17
    .line 18
    invoke-direct {v2, p0}, Lh4/s;-><init>(Lcom/friday/user/view/UserFragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/friday/user/view/UserFragment$a;

    .line 22
    .line 23
    invoke-direct {v3, v2}, Lcom/friday/user/view/UserFragment$a;-><init>(Lhd/l;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final y()Lcom/friday/user/view/AboutFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/user/view/UserFragment;->j:Lcom/friday/user/view/AboutFragment;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "aboutFragment"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final z()Lcom/friday/user/view/HelpFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/user/view/UserFragment;->k:Lcom/friday/user/view/HelpFragment;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "helpFragment"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method
