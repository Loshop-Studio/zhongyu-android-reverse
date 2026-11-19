# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_StudentViewMemberFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_StudentViewMemberFragment<",
        "Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public g:Lcom/zykj/study/adapter/StudentViewMemberAdapter;

.field public h:Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;

.field public i:Lp4/v;

.field public j:Lcom/google/gson/Gson;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_StudentViewMemberFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb5/v4;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lb5/v4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$special$$inlined$viewModels$default$1;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$special$$inlined$viewModels$default$2;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$special$$inlined$viewModels$default$3;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$special$$inlined$viewModels$default$4;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->f:Lh7/d;

    .line 47
    .line 48
    new-instance v0, Lcom/google/gson/Gson;

    .line 49
    .line 50
    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->j:Lcom/google/gson/Gson;

    .line 54
    .line 55
    return-void
.end method

.method public static final B(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lm1/c;Lm1/a;I)V
    .locals 6

    .line 1
    const-string p1, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_1

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    if-eq p3, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->i:Lp4/v;

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Lp4/v;->D()Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->I(Lcom/zykj/study/bean/teach/SuperviseGroup;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->i:Lp4/v;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1}, Lp4/v;->D()Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    const-string p3, "getViewLifecycleOwner(...)"

    .line 41
    .line 42
    invoke-static {p2, p3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v3, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$initMenuPopup$1$1$1;

    .line 50
    .line 51
    const/4 p2, 0x0

    .line 52
    invoke-direct {v3, p0, p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$initMenuPopup$1$1$1;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;Lm7/c;)V

    .line 53
    .line 54
    .line 55
    const/4 v4, 0x3

    .line 56
    const/4 v5, 0x0

    .line 57
    const/4 v1, 0x0

    .line 58
    const/4 v2, 0x0

    .line 59
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_0
    return-void
.end method

.method public static final C(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Lcom/zykj/study/ui/home/my/StudentViewFragment;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Lcom/zykj/study/ui/home/my/StudentViewFragment;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentViewFragment;->o()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static final D(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p2, 0x3

    .line 2
    if-ne p1, p2, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Lcom/xuexiang/xui/utils/d;->e(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static final F(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->etSearch:Lcom/xuexiang/xui/widget/edittext/ClearEditText;

    .line 8
    .line 9
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/d;->f(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;

    .line 20
    .line 21
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->etSearch:Lcom/xuexiang/xui/widget/edittext/ClearEditText;

    .line 22
    .line 23
    invoke-static {p0}, Lcom/xuexiang/xui/utils/d;->e(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public static final G(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lcom/xuexiang/xui/utils/d;->h(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;

    .line 16
    .line 17
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->etSearch:Lcom/xuexiang/xui/widget/edittext/ClearEditText;

    .line 18
    .line 19
    invoke-static {p0}, Lcom/xuexiang/xui/utils/d;->e(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static final J(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
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
    new-instance v3, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$showRemoveGroupDialog$1$1;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-direct {v3, p0, p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$showRemoveGroupDialog$1$1;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;Lm7/c;)V

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

.method public static final K(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
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

.method public static synthetic g(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->B(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lm1/c;Lm1/a;I)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->z(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->J(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static synthetic j(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->D(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->w(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->y(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->K(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;Lcom/zykj/study/bean/teach/SuperviseGroup;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->v(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;Lcom/zykj/study/bean/teach/SuperviseGroup;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->C(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic p(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->F(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic q(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->G(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic r(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->x(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)Lcom/zykj/study/viewmodels/StudentViewViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->u()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;Lcom/zykj/study/bean/teach/SuperviseGroup;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->H(Landroid/view/View;Lcom/zykj/study/bean/teach/SuperviseGroup;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final u()Lcom/zykj/study/viewmodels/StudentViewViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->f:Lh7/d;

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

.method public static final v(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;Lcom/zykj/study/bean/teach/SuperviseGroup;)Lh7/p;
    .locals 3

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "getViewLifecycleOwner(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$initData$2$1;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v1, p0, p1, p2, v2}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$initData$2$1;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;Lcom/zykj/study/bean/teach/SuperviseGroup;Lm7/c;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 34
    .line 35
    return-object p0
.end method

.method public static final w(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;
    .locals 2

    .line 1
    const-string v0, "group"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "member"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->u()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;

    .line 20
    .line 21
    invoke-direct {v1, p1, p2}, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;-><init>(Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;

    .line 32
    .line 33
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->etSearch:Lcom/xuexiang/xui/widget/edittext/ClearEditText;

    .line 34
    .line 35
    invoke-static {p0}, Lcom/xuexiang/xui/utils/d;->e(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 39
    .line 40
    return-object p0
.end method

# RE I/O 写入 JSON（Gson.toJson）、读取 JSON（Gson.fromJson）。
.method public static final x(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Ljava/lang/String;)Lh7/p;
    .locals 13

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->u()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->g()Landroidx/lifecycle/MutableLiveData;

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
    if-eqz v0, :cond_1b

    .line 16
    .line 17
    const/16 v1, 0xa

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz p1, :cond_11

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    goto/16 :goto_8

    .line 30
    .line 31
    :cond_0
    iget-object v4, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->h:Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;

    .line 32
    .line 33
    if-eqz v4, :cond_1b

    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->e()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_1b

    .line 40
    .line 41
    new-instance v5, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    move-object v7, v6

    .line 61
    check-cast v7, Lcom/zykj/study/bean/SelectModel;

    .line 62
    .line 63
    invoke-virtual {v7}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_1

    .line 68
    .line 69
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iget-object v4, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->j:Lcom/google/gson/Gson;

    .line 74
    .line 75
    invoke-virtual {v4, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v4, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->j:Lcom/google/gson/Gson;

    .line 80
    .line 81
    const-class v6, [Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 82
    .line 83
    invoke-virtual {v4, v0, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v4, "fromJson(...)"

    .line 88
    .line 89
    invoke-static {v0, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    check-cast v0, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v0}, Li7/r;->A1([Ljava/lang/Object;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    new-instance v4, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-eqz v6, :cond_6

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    move-object v7, v6

    .line 118
    check-cast v7, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 119
    .line 120
    invoke-virtual {v7}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getMemberList()Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-static {v8}, Li7/f0;->X0(Ljava/util/Collection;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    new-instance v9, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    :cond_4
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    if-eqz v10, :cond_5

    .line 142
    .line 143
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    move-object v11, v10

    .line 148
    check-cast v11, Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 149
    .line 150
    invoke-virtual {v11}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getUserName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    const/4 v12, 0x2

    .line 155
    invoke-static {v11, p1, v2, v12, v3}, Lg8/c0;->S(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    if-eqz v11, :cond_4

    .line 160
    .line 161
    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    invoke-virtual {v7, v9}, Lcom/zykj/study/bean/teach/SuperviseGroup;->setMemberList(Ljava/util/List;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getMemberList()Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    if-nez v7, :cond_3

    .line 177
    .line 178
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-static {v4, v1}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_a

    .line 200
    .line 201
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 206
    .line 207
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-eqz v6, :cond_8

    .line 216
    .line 217
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    move-object v7, v6

    .line 222
    check-cast v7, Lcom/zykj/study/bean/SelectModel;

    .line 223
    .line 224
    invoke-virtual {v7}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    check-cast v7, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 229
    .line 230
    invoke-virtual {v7}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getId()I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    invoke-virtual {v1}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getId()I

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    if-ne v7, v8, :cond_7

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_8
    move-object v6, v3

    .line 242
    :goto_4
    check-cast v6, Lcom/zykj/study/bean/SelectModel;

    .line 243
    .line 244
    if-eqz v6, :cond_9

    .line 245
    .line 246
    invoke-virtual {v6}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    goto :goto_5

    .line 251
    :cond_9
    move v4, v2

    .line 252
    :goto_5
    new-instance v6, Lcom/zykj/study/bean/SelectModel;

    .line 253
    .line 254
    invoke-direct {v6, v4, v1}, Lcom/zykj/study/bean/SelectModel;-><init>(ZLjava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    invoke-interface {p1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_a
    invoke-static {p1}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_c

    .line 274
    .line 275
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    move-object v2, v1

    .line 280
    check-cast v2, Lcom/zykj/study/bean/SelectModel;

    .line 281
    .line 282
    invoke-virtual {v2}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    if-eqz v2, :cond_b

    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_c
    move-object v1, v3

    .line 290
    :goto_6
    check-cast v1, Lcom/zykj/study/bean/SelectModel;

    .line 291
    .line 292
    if-nez v1, :cond_d

    .line 293
    .line 294
    invoke-static {p1}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    check-cast v0, Lcom/zykj/study/bean/SelectModel;

    .line 299
    .line 300
    if-eqz v0, :cond_d

    .line 301
    .line 302
    const/4 v1, 0x1

    .line 303
    invoke-virtual {v0, v1}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 304
    .line 305
    .line 306
    :cond_d
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_e

    .line 311
    .line 312
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    check-cast v0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;

    .line 317
    .line 318
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 319
    .line 320
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->f()V

    .line 321
    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_e
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    check-cast v0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;

    .line 329
    .line 330
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 331
    .line 332
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d()V

    .line 333
    .line 334
    .line 335
    :goto_7
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->h:Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;

    .line 336
    .line 337
    if-eqz v0, :cond_f

    .line 338
    .line 339
    invoke-virtual {v0, p1}, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->j(Ljava/util/List;)V

    .line 340
    .line 341
    .line 342
    :cond_f
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->g:Lcom/zykj/study/adapter/StudentViewMemberAdapter;

    .line 343
    .line 344
    if-eqz p1, :cond_1b

    .line 345
    .line 346
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->u()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    check-cast p0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;

    .line 359
    .line 360
    if-eqz p0, :cond_10

    .line 361
    .line 362
    invoke-virtual {p0}, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->getSuperviseGroupMember()Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    :cond_10
    invoke-virtual {p1, v3}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->m(Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_d

    .line 370
    .line 371
    :cond_11
    :goto_8
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->h:Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;

    .line 372
    .line 373
    if-eqz p1, :cond_1a

    .line 374
    .line 375
    invoke-virtual {p1}, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->e()Ljava/util/List;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    if-eqz p1, :cond_1a

    .line 380
    .line 381
    new-instance v4, Ljava/util/ArrayList;

    .line 382
    .line 383
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 384
    .line 385
    .line 386
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    :cond_12
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result v5

    .line 394
    if-eqz v5, :cond_13

    .line 395
    .line 396
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    move-object v6, v5

    .line 401
    check-cast v6, Lcom/zykj/study/bean/SelectModel;

    .line 402
    .line 403
    invoke-virtual {v6}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    if-eqz v6, :cond_12

    .line 408
    .line 409
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    goto :goto_9

    .line 413
    :cond_13
    new-instance p1, Ljava/util/ArrayList;

    .line 414
    .line 415
    invoke-static {v0, v1}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 420
    .line 421
    .line 422
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    if-eqz v1, :cond_17

    .line 431
    .line 432
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    check-cast v1, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 437
    .line 438
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    :cond_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    if-eqz v6, :cond_15

    .line 447
    .line 448
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v6

    .line 452
    move-object v7, v6

    .line 453
    check-cast v7, Lcom/zykj/study/bean/SelectModel;

    .line 454
    .line 455
    invoke-virtual {v7}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v7

    .line 459
    check-cast v7, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 460
    .line 461
    invoke-virtual {v7}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getId()I

    .line 462
    .line 463
    .line 464
    move-result v7

    .line 465
    invoke-virtual {v1}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getId()I

    .line 466
    .line 467
    .line 468
    move-result v8

    .line 469
    if-ne v7, v8, :cond_14

    .line 470
    .line 471
    goto :goto_b

    .line 472
    :cond_15
    move-object v6, v3

    .line 473
    :goto_b
    check-cast v6, Lcom/zykj/study/bean/SelectModel;

    .line 474
    .line 475
    if-eqz v6, :cond_16

    .line 476
    .line 477
    invoke-virtual {v6}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 478
    .line 479
    .line 480
    move-result v5

    .line 481
    goto :goto_c

    .line 482
    :cond_16
    move v5, v2

    .line 483
    :goto_c
    new-instance v6, Lcom/zykj/study/bean/SelectModel;

    .line 484
    .line 485
    invoke-direct {v6, v5, v1}, Lcom/zykj/study/bean/SelectModel;-><init>(ZLjava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    invoke-interface {p1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    goto :goto_a

    .line 492
    :cond_17
    invoke-static {p1}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->g:Lcom/zykj/study/adapter/StudentViewMemberAdapter;

    .line 497
    .line 498
    if-eqz v0, :cond_18

    .line 499
    .line 500
    invoke-virtual {v0, p1}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->l(Ljava/util/List;)V

    .line 501
    .line 502
    .line 503
    :cond_18
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->g:Lcom/zykj/study/adapter/StudentViewMemberAdapter;

    .line 504
    .line 505
    if-eqz p1, :cond_1a

    .line 506
    .line 507
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->u()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    check-cast v0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;

    .line 520
    .line 521
    if-eqz v0, :cond_19

    .line 522
    .line 523
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->getSuperviseGroupMember()Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    :cond_19
    invoke-virtual {p1, v3}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->m(Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V

    .line 528
    .line 529
    .line 530
    :cond_1a
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->h:Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;

    .line 531
    .line 532
    if-eqz p0, :cond_1b

    .line 533
    .line 534
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object p1

    .line 538
    invoke-virtual {p0, p1}, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;->j(Ljava/util/List;)V

    .line 539
    .line 540
    .line 541
    :cond_1b
    :goto_d
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 542
    .line 543
    return-object p0
.end method

.method public static final y(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;
    .locals 2

    .line 1
    const-string v0, "group"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "member"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->u()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;

    .line 20
    .line 21
    invoke-direct {v1, p1, p2}, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;-><init>(Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;

    .line 32
    .line 33
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->etSearch:Lcom/xuexiang/xui/widget/edittext/ClearEditText;

    .line 34
    .line 35
    invoke-static {p0}, Lcom/xuexiang/xui/utils/d;->e(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 39
    .line 40
    return-object p0
.end method

.method public static final z(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Ljava/util/List;)Lh7/p;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->g:Lcom/zykj/study/adapter/StudentViewMemberAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->f()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v3, v2

    .line 31
    check-cast v3, Lcom/zykj/study/bean/SelectModel;

    .line 32
    .line 33
    invoke-virtual {v3}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Ljava/util/ArrayList;

    .line 47
    .line 48
    const/16 v2, 0xa

    .line 49
    .line 50
    invoke-static {p1, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_5

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    move-object v5, v4

    .line 88
    check-cast v5, Lcom/zykj/study/bean/SelectModel;

    .line 89
    .line 90
    invoke-virtual {v5}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 95
    .line 96
    invoke-virtual {v5}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getId()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-virtual {v2}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getId()I

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-ne v5, v6, :cond_2

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    const/4 v4, 0x0

    .line 108
    :goto_2
    check-cast v4, Lcom/zykj/study/bean/SelectModel;

    .line 109
    .line 110
    if-eqz v4, :cond_4

    .line 111
    .line 112
    invoke-virtual {v4}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    goto :goto_3

    .line 117
    :cond_4
    const/4 v3, 0x0

    .line 118
    :goto_3
    new-instance v4, Lcom/zykj/study/bean/SelectModel;

    .line 119
    .line 120
    invoke-direct {v4, v3, v2}, Lcom/zykj/study/bean/SelectModel;-><init>(ZLjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_5
    invoke-static {v0}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->g:Lcom/zykj/study/adapter/StudentViewMemberAdapter;

    .line 132
    .line 133
    if-eqz p0, :cond_6

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->l(Ljava/util/List;)V

    .line 136
    .line 137
    .line 138
    :cond_6
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 139
    .line 140
    return-object p0
.end method


# virtual methods
.method public final A()V
    .locals 5

    .line 1
    new-instance v0, Lp4/v;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireContext(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lm1/a;

    .line 13
    .line 14
    sget v3, Lcom/zykj/study/R$string;->refresh_member:I

    .line 15
    .line 16
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-direct {v2, v3}, Lm1/a;-><init>(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lm1/a;

    .line 24
    .line 25
    sget v4, Lcom/zykj/study/R$string;->remove_group_member:I

    .line 26
    .line 27
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-direct {v3, v4}, Lm1/a;-><init>(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    filled-new-array {v2, v3}, [Lm1/a;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2}, Li7/v;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-direct {v0, v1, v2}, Lp4/v;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget v2, Lcom/zykj/lib/ui/R$dimen;->view_70:I

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    new-instance v2, Lb5/y4;

    .line 56
    .line 57
    invoke-direct {v2, p0}, Lb5/y4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)V

    .line 58
    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    invoke-virtual {v0, v1, v3, v2}, Lp2/d;->z(IILp2/d$b;)Lp2/d;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lp4/v;

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    invoke-virtual {v0, v1}, Lp2/d;->B(Z)Lp2/d;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lp4/v;

    .line 73
    .line 74
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->i:Lp4/v;

    .line 75
    .line 76
    return-void
.end method

.method public final E(Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance v0, Lb5/z4;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lb5/z4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lb5/p4;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lb5/p4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final H(Landroid/view/View;Lcom/zykj/study/bean/teach/SuperviseGroup;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->i:Lp4/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Lp4/v;->E(Lcom/zykj/study/bean/teach/SuperviseGroup;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->i:Lp4/v;

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Lp4/v;->v(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
.end method

.method public final I(Lcom/zykj/study/bean/teach/SuperviseGroup;)V
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
    sget v1, Lcom/zykj/study/R$string;->hint:I

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->H(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->I(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget v1, Lcom/zykj/study/R$string;->remove_group_member_hint:I

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Lb5/q4;

    .line 37
    .line 38
    invoke-direct {v1, p0, p1}, Lb5/q4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget v0, Lcom/zykj/study/R$string;->sure:I

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget v0, Lcom/zykj/study/R$string;->cancel:I

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$initData$1;->c:I

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
    new-instance p1, Lcom/zykj/study/adapter/StudentViewMemberAdapter;

    .line 63
    .line 64
    new-instance v0, Lb5/o4;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lb5/o4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lb5/r4;

    .line 70
    .line 71
    invoke-direct {v1, p0}, Lb5/r4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p1, v0, v1}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;-><init>(Lx7/p;Lx7/p;)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->g:Lcom/zykj/study/adapter/StudentViewMemberAdapter;

    .line 78
    .line 79
    new-instance p1, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;

    .line 80
    .line 81
    new-instance v0, Lb5/s4;

    .line 82
    .line 83
    invoke-direct {v0, p0}, Lb5/s4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v0}, Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;-><init>(Lx7/p;)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->h:Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;

    .line 90
    .line 91
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->u()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    new-instance v0, Lb5/t4;

    .line 100
    .line 101
    invoke-direct {v0, p0}, Lb5/t4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$a;

    .line 105
    .line 106
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$a;-><init>(Lx7/l;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->u()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-instance v0, Lb5/u4;

    .line 121
    .line 122
    invoke-direct {v0, p0}, Lb5/u4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)V

    .line 123
    .line 124
    .line 125
    new-instance v1, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$a;

    .line 126
    .line 127
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment$a;-><init>(Lx7/l;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 131
    .line 132
    .line 133
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 134
    .line 135
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->u()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->setViewModel(Lcom/zykj/study/viewmodels/StudentViewViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->g:Lcom/zykj/study/adapter/StudentViewMemberAdapter;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->E(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->recyclerSearch:Landroidx/recyclerview/widget/RecyclerView;

    .line 40
    .line 41
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->h:Lcom/zykj/study/adapter/StudentViewMemberSearchAdapter;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->E(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->A()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;

    .line 60
    .line 61
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->btnCreate:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 62
    .line 63
    new-instance p2, Lb5/w4;

    .line 64
    .line 65
    invoke-direct {p2, p0}, Lb5/w4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;

    .line 76
    .line 77
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;->etSearch:Lcom/xuexiang/xui/widget/edittext/ClearEditText;

    .line 78
    .line 79
    new-instance p2, Lb5/x4;

    .line 80
    .line 81
    invoke-direct {p2}, Lb5/x4;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentViewMemberBinding;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const-string p2, "getRoot(...)"

    .line 98
    .line 99
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->E(Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 106
    .line 107
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_student_view_member:I

    .line 2
    .line 3
    return v0
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lcom/xuexiang/xui/utils/d;->h(Landroid/app/Activity;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lcom/xuexiang/xui/utils/d;->m()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
