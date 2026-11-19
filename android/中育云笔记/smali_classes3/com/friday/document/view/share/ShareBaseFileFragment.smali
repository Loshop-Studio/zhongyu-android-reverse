.class public abstract Lcom/friday/document/view/share/ShareBaseFileFragment;
.super Lcom/friday/document/view/share/Hilt_ShareBaseFileFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/share/Hilt_ShareBaseFileFragment<",
        "Lcom/friday/document/databinding/FragmentShareFileBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Lqc/d;

.field public j:Lcom/friday/document/model/ShareFile;

.field public final k:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/share/Hilt_ShareBaseFileFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/friday/document/view/share/ShareBaseFileFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/document/view/share/ShareBaseFileFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/document/view/share/ShareBaseFileFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/document/view/share/ShareBaseFileFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/friday/document/view/share/ShareBaseFileFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/friday/document/view/share/ShareBaseFileFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/document/view/share/ShareBaseFileFragment;->i:Lqc/d;

    .line 31
    .line 32
    new-instance v0, Lx2/c;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lx2/c;-><init>(Lcom/friday/document/view/share/ShareBaseFileFragment;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/friday/document/view/share/ShareBaseFileFragment;->k:Lqc/d;

    .line 42
    .line 43
    return-void
.end method

.method public static final synthetic A(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->W(Lcom/friday/document/model/ShareFile;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final J(Lcom/friday/document/view/share/ShareBaseFileFragment;)Lcom/friday/document/adapter/ShareFileAdapter;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/document/adapter/ShareFileAdapter;

    .line 2
    .line 3
    new-instance v1, Lx2/d;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lx2/d;-><init>(Lcom/friday/document/view/share/ShareBaseFileFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/friday/document/adapter/ShareFileAdapter;-><init>(Lhd/l;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final K(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/model/ShareListEntity;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p1}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->N(Lcom/friday/document/model/ShareFile;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final O(Lcom/friday/document/view/share/ShareBaseFileFragment;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/view/share/ShareBaseFileFragment$setupRefreshLayout$1$1$1;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/friday/document/view/share/ShareBaseFileFragment$setupRefreshLayout$1$1$1;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->K(Lhd/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final T(Lcom/friday/document/view/share/ShareBaseFileFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/document/databinding/PopSortBinding;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "popupWindow"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "binding"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p3, Lcom/friday/document/databinding/PopSortBinding;->e:Landroid/widget/RadioGroup;

    .line 17
    .line 18
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->p()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p3, Lcom/friday/document/databinding/PopSortBinding;->c:Landroid/widget/RadioButton;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, p3, Lcom/friday/document/databinding/PopSortBinding;->d:Landroid/widget/RadioButton;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/RadioGroup;->check(I)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lx2/e;

    .line 47
    .line 48
    invoke-direct {v0, p0, p3, p2}, Lx2/e;-><init>(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/databinding/PopSortBinding;Landroid/widget/PopupWindow;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 55
    .line 56
    return-object p0
.end method

.method public static final U(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/databinding/PopSortBinding;Landroid/widget/PopupWindow;Landroid/widget/RadioGroup;I)V
    .locals 7

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/view/share/ShareBaseFileFragment$showIvMoreDialog$batchWindow$1$1$1$1;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    move-object v2, p0

    .line 9
    move-object v4, p1

    .line 10
    move-object v5, p2

    .line 11
    move v3, p4

    .line 12
    invoke-direct/range {v1 .. v6}, Lcom/friday/document/view/share/ShareBaseFileFragment$showIvMoreDialog$batchWindow$1$1$1$1;-><init>(Lcom/friday/document/view/share/ShareBaseFileFragment;ILcom/friday/document/databinding/PopSortBinding;Landroid/widget/PopupWindow;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x3

    .line 16
    const/4 v5, 0x0

    .line 17
    move-object v3, v1

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static synthetic r(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/databinding/PopSortBinding;Landroid/widget/PopupWindow;Landroid/widget/RadioGroup;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/document/view/share/ShareBaseFileFragment;->U(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/databinding/PopSortBinding;Landroid/widget/PopupWindow;Landroid/widget/RadioGroup;I)V

    return-void
.end method

.method public static synthetic s(Lcom/friday/document/view/share/ShareBaseFileFragment;)Lcom/friday/document/adapter/ShareFileAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->J(Lcom/friday/document/view/share/ShareBaseFileFragment;)Lcom/friday/document/adapter/ShareFileAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/model/ShareListEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->K(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/model/ShareListEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/friday/document/view/share/ShareBaseFileFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/document/databinding/PopSortBinding;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/document/view/share/ShareBaseFileFragment;->T(Lcom/friday/document/view/share/ShareBaseFileFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/document/databinding/PopSortBinding;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/friday/document/view/share/ShareBaseFileFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->O(Lcom/friday/document/view/share/ShareBaseFileFragment;)V

    return-void
.end method

.method public static final synthetic w(Lcom/friday/document/view/share/ShareBaseFileFragment;)Lcom/friday/document/databinding/FragmentShareFileBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic x(Lcom/friday/document/view/share/ShareBaseFileFragment;)Lcom/friday/document/adapter/ShareFileAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->D()Lcom/friday/document/adapter/ShareFileAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic y(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/model/ShareFile;Lcom/friday/document/view/share/SuspendCall;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/view/share/ShareBaseFileFragment;->G(Lcom/friday/document/model/ShareFile;Lcom/friday/document/view/share/SuspendCall;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic z(Lcom/friday/document/view/share/ShareBaseFileFragment;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->Q(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final B()Lcom/friday/document/viewmodel/ShareBaseViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/ShareBaseFileFragment;->i:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public C()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final D()Lcom/friday/document/adapter/ShareFileAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/ShareBaseFileFragment;->k:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/adapter/ShareFileAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public abstract E()Lcom/friday/document/viewmodel/ShareFileViewModel;
.end method

.method public final F()Lcom/friday/document/model/ShareFile;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/ShareBaseFileFragment;->j:Lcom/friday/document/model/ShareFile;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G(Lcom/friday/document/model/ShareFile;Lcom/friday/document/view/share/SuspendCall;I)V
    .locals 7

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/view/share/ShareBaseFileFragment$handleFileClick$1;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    move-object v3, p0

    .line 9
    move-object v5, p1

    .line 10
    move-object v2, p2

    .line 11
    move v4, p3

    .line 12
    invoke-direct/range {v1 .. v6}, Lcom/friday/document/view/share/ShareBaseFileFragment$handleFileClick$1;-><init>(Lcom/friday/document/view/share/SuspendCall;Lcom/friday/document/view/share/ShareBaseFileFragment;ILcom/friday/document/model/ShareFile;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x3

    .line 16
    const/4 v5, 0x0

    .line 17
    move-object v3, v1

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public abstract H()V
.end method

.method public abstract I()V
.end method

.method public final L()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareFileViewModel;->y()Lvd/u;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/friday/document/model/ShareFile;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v2}, Lcom/friday/document/viewmodel/ShareFileViewModel;->N(Lcom/friday/document/model/ShareFile;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->x()V

    .line 28
    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareFileViewModel;->O()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->P()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void

    .line 53
    :cond_1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareFileViewModel;->w()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final M(Lcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment;->j:Lcom/friday/document/model/ShareFile;

    .line 2
    .line 3
    return-void
.end method

.method public final N(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 1

    .line 1
    const-string v0, "refreshLayout"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Lcom/friday/document/R$color;->colorAccent:I

    .line 7
    .line 8
    invoke-static {v0}, Lz1/b;->a(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    filled-new-array {v0}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeColors([I)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lx2/b;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lx2/b;-><init>(Lcom/friday/document/view/share/ShareBaseFileFragment;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public abstract P()Z
.end method

.method public final Q(Ljava/util/List;)V
    .locals 0

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
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 8
    .line 9
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->R(Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->V()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final R(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const-string v1, "rvShare"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->c:Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v2, "getRoot(...)"

    .line 32
    .line 33
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->c:Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 49
    .line 50
    const-string v3, "imgNoNetwork"

    .line 51
    .line 52
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    if-nez p1, :cond_0

    .line 56
    .line 57
    move v1, v2

    .line 58
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 66
    .line 67
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->c:Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;->e:Landroid/widget/TextView;

    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    const-string p1, "\u6682\u65e0\u6570\u636e"

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    sget p1, Lcom/friday/document/R$string;->no_network:I

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string v1, "getString(...)"

    .line 83
    .line 84
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final S()V
    .locals 4

    .line 1
    new-instance v0, Lm2/a$a;

    .line 2
    .line 3
    new-instance v1, Lm2/a;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "requireContext(...)"

    .line 10
    .line 11
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Lm2/a;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Lm2/a$a;-><init>(Lm2/a;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Lcom/friday/document/databinding/PopSortBinding;->a(Landroid/view/LayoutInflater;)Lcom/friday/document/databinding/PopSortBinding;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "inflate(...)"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lm2/a$a;->b(Landroidx/databinding/ViewDataBinding;)Lm2/a$a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, -0x2

    .line 38
    invoke-virtual {v0, v1, v1}, Lm2/a$a;->e(II)Lm2/a$a;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {v0, v1}, Lm2/a$a;->d(Z)Lm2/a$a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, Lx2/a;

    .line 48
    .line 49
    invoke-direct {v1, p0}, Lx2/a;-><init>(Lcom/friday/document/view/share/ShareBaseFileFragment;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lm2/a$a;->c(Lhd/q;)Lm2/a$a;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lm2/a$a;->a()Lm2/a;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 65
    .line 66
    iget-object v1, v1, Lcom/friday/document/databinding/FragmentShareFileBinding;->e:Landroid/widget/ImageView;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    const/16 v3, 0x50

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2, v2, v3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final V()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->c:Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "getRoot(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 30
    .line 31
    const-string v1, "rvShare"

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final W(Lcom/friday/document/model/ShareFile;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->C()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 15
    .line 16
    iget-object v1, v1, Lcom/friday/document/databinding/FragmentShareFileBinding;->f:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->i:Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/friday/document/databinding/FragmentShareFileBinding;->f:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 40
    .line 41
    const/16 v0, 0x8

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 52
    .line 53
    iget-object v1, v1, Lcom/friday/document/databinding/FragmentShareFileBinding;->f:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 63
    .line 64
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->i:Landroid/widget/TextView;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public initData()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->initObserver()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->H()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final initObserver()V
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const-string v6, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {v1, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareFileViewModel;->z()Lvd/u;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    sget-object v9, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    .line 19
    .line 20
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 21
    .line 22
    .line 23
    move-result-object v10

    .line 24
    new-instance v0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    move-object/from16 v5, p0

    .line 28
    .line 29
    move-object v2, v9

    .line 30
    invoke-direct/range {v0 .. v5}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lvd/c;Lvc/c;Lcom/friday/document/view/share/ShareBaseFileFragment;)V

    .line 31
    .line 32
    .line 33
    const/4 v14, 0x3

    .line 34
    const/4 v15, 0x0

    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v12, 0x0

    .line 37
    move-object v13, v0

    .line 38
    invoke-static/range {v10 .. v15}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 39
    .line 40
    .line 41
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    invoke-static {v8, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {p0 .. p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareFileViewModel;->B()Lvd/u;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    invoke-static {v8}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v3, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2;

    .line 61
    .line 62
    move-object/from16 v12, p0

    .line 63
    .line 64
    move-object v7, v3

    .line 65
    invoke-direct/range {v7 .. v12}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lvd/c;Lvc/c;Lcom/friday/document/view/share/ShareBaseFileFragment;)V

    .line 66
    .line 67
    .line 68
    const/4 v4, 0x3

    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v1, 0x0

    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 73
    .line 74
    .line 75
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-static {v8, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual/range {p0 .. p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareFileViewModel;->y()Lvd/u;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    invoke-static {v8}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v3, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3;

    .line 95
    .line 96
    move-object v7, v3

    .line 97
    invoke-direct/range {v7 .. v12}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lvd/c;Lvc/c;Lcom/friday/document/view/share/ShareBaseFileFragment;)V

    .line 98
    .line 99
    .line 100
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    invoke-static {v8, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {p0 .. p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareBase;->g()Lvd/u;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-static {v8}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-instance v3, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$4;

    .line 123
    .line 124
    move-object v7, v3

    .line 125
    invoke-direct/range {v7 .. v12}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$4;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lvd/c;Lvc/c;Lcom/friday/document/view/share/ShareBaseFileFragment;)V

    .line 126
    .line 127
    .line 128
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    invoke-static {v8, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {p0 .. p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->B()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->A()Lvd/p;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    invoke-static {v8}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    new-instance v3, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5;

    .line 151
    .line 152
    move-object v7, v3

    .line 153
    invoke-direct/range {v7 .. v12}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lvd/c;Lvc/c;Lcom/friday/document/view/share/ShareBaseFileFragment;)V

    .line 154
    .line 155
    .line 156
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method public initView()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->d:Landroid/widget/ImageView;

    .line 8
    .line 9
    const-string v1, "ivBack"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 19
    .line 20
    iget-object v1, v1, Lcom/friday/document/databinding/FragmentShareFileBinding;->e:Landroid/widget/ImageView;

    .line 21
    .line 22
    const-string v2, "ivMore"

    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    new-array v2, v2, [Landroid/view/View;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    aput-object v0, v2, v3

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    aput-object v1, v2, v0

    .line 35
    .line 36
    invoke-virtual {p0, v2}, Lcom/friday/common/base/BaseFragment;->setClickListener([Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 44
    .line 45
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 46
    .line 47
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->D()Lcom/friday/document/adapter/ShareFileAdapter;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 64
    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 75
    .line 76
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->g:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 77
    .line 78
    const-string v1, "refreshLayout"

    .line 79
    .line 80
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->N(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/friday/common/base/BaseFragment;->onClick(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->d:Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->L()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->e:Landroid/widget/ImageView;

    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->S()V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method
