.class public final Lcom/friday/document/view/ManualSyncFileDialog;
.super Lcom/friday/document/view/Hilt_ManualSyncFileDialog;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/Hilt_ManualSyncFileDialog<",
        "Lcom/friday/document/databinding/DialogSyncFileBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final k:Lqc/d;

.field public final l:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/Hilt_ManualSyncFileDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/document/view/ManualSyncFileDialog$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/document/view/ManualSyncFileDialog$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->e:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/friday/document/view/ManualSyncFileDialog$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/friday/document/view/ManualSyncFileDialog$special$$inlined$viewModels$default$2;-><init>(Lhd/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/friday/document/view/ManualSyncFileDialog$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/friday/document/view/ManualSyncFileDialog$special$$inlined$viewModels$default$3;-><init>(Lqc/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/friday/document/view/ManualSyncFileDialog$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/friday/document/view/ManualSyncFileDialog$special$$inlined$viewModels$default$4;-><init>(Lhd/a;Lqc/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/friday/document/view/ManualSyncFileDialog$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/friday/document/view/ManualSyncFileDialog$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lqc/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/friday/document/view/ManualSyncFileDialog;->k:Lqc/d;

    .line 47
    .line 48
    new-instance v0, Lu2/n;

    .line 49
    .line 50
    invoke-direct {v0}, Lu2/n;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lcom/friday/document/view/ManualSyncFileDialog;->l:Lqc/d;

    .line 58
    .line 59
    return-void
.end method

.method public static final A(Lcom/friday/document/view/ManualSyncFileDialog;Ljava/util/List;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/ManualSyncFileDialog$initData$4$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/friday/document/view/ManualSyncFileDialog$initData$4$1;-><init>(Ljava/util/List;Lcom/friday/document/view/ManualSyncFileDialog;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final B()Lcom/friday/document/adapter/SyncFileAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/adapter/SyncFileAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/document/adapter/SyncFileAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic r(Lcom/friday/document/view/ManualSyncFileDialog;Ljava/util/List;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/ManualSyncFileDialog;->A(Lcom/friday/document/view/ManualSyncFileDialog;Ljava/util/List;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s()Lcom/friday/document/adapter/SyncFileAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/document/view/ManualSyncFileDialog;->B()Lcom/friday/document/adapter/SyncFileAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic t(Lcom/friday/document/view/ManualSyncFileDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/ManualSyncFileDialog;->z(Lcom/friday/document/view/ManualSyncFileDialog;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic u(Lcom/friday/document/view/ManualSyncFileDialog;)Lcom/friday/document/adapter/SyncFileAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/ManualSyncFileDialog;->x()Lcom/friday/document/adapter/SyncFileAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic v(Lcom/friday/document/view/ManualSyncFileDialog;)Lcom/friday/document/viewmodel/ManualSyncViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/ManualSyncFileDialog;->y()Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic w(Lcom/friday/document/view/ManualSyncFileDialog;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/ManualSyncFileDialog;->updateTitle()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final z(Lcom/friday/document/view/ManualSyncFileDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/ManualSyncFileDialog;->y()Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->k()Lcom/friday/document/service/FileManager;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lcom/friday/document/service/FileManager;->E()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->dialog_sync_file:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/ManualSyncFileDialog$initData$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/document/view/ManualSyncFileDialog$initData$1;-><init>(Lcom/friday/document/view/ManualSyncFileDialog;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/friday/document/databinding/DialogSyncFileBinding;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/friday/document/databinding/DialogSyncFileBinding;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 24
    .line 25
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/friday/document/view/ManualSyncFileDialog;->x()Lcom/friday/document/adapter/SyncFileAdapter;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/friday/document/view/ManualSyncFileDialog;->y()Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->h()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lcom/friday/document/databinding/DialogSyncFileBinding;

    .line 56
    .line 57
    iget-object v0, v0, Lcom/friday/document/databinding/DialogSyncFileBinding;->e:Landroid/widget/ImageView;

    .line 58
    .line 59
    new-instance v1, Lu2/l;

    .line 60
    .line 61
    invoke-direct {v1, p0}, Lu2/l;-><init>(Lcom/friday/document/view/ManualSyncFileDialog;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/friday/document/view/ManualSyncFileDialog;->y()Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->i()Landroidx/lifecycle/MutableLiveData;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v2, Lu2/m;

    .line 80
    .line 81
    invoke-direct {v2, p0}, Lu2/m;-><init>(Lcom/friday/document/view/ManualSyncFileDialog;)V

    .line 82
    .line 83
    .line 84
    new-instance v3, Lcom/friday/document/view/ManualSyncFileDialog$a;

    .line 85
    .line 86
    invoke-direct {v3, v2}, Lcom/friday/document/view/ManualSyncFileDialog$a;-><init>(Lhd/l;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 1
    new-instance v0, Landroid/util/DisplayMetrics;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sget v2, Lcom/friday/document/R$dimen;->view_351:I

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    float-to-int v1, v1

    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget v3, Lcom/friday/document/R$dimen;->view_180:I

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    float-to-int v2, v2

    .line 61
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const/4 v1, 0x0

    .line 69
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 70
    .line 71
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 82
    .line 83
    .line 84
    :cond_2
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final updateTitle()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/ManualSyncFileDialog;->x()Lcom/friday/document/adapter/SyncFileAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Ljava/lang/Iterable;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    move v4, v3

    .line 19
    move v5, v4

    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-eqz v6, :cond_4

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    check-cast v6, Lcom/friday/document/model/ManualSyncEntity;

    .line 31
    .line 32
    invoke-virtual {v6}, Lcom/friday/document/model/ManualSyncEntity;->getSyncState()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_3

    .line 37
    .line 38
    const/4 v7, 0x1

    .line 39
    if-eq v6, v7, :cond_2

    .line 40
    .line 41
    const/4 v7, 0x2

    .line 42
    if-eq v6, v7, :cond_1

    .line 43
    .line 44
    const/4 v7, 0x3

    .line 45
    if-eq v6, v7, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lcom/friday/document/databinding/DialogSyncFileBinding;

    .line 65
    .line 66
    iget-object v1, v1, Lcom/friday/document/databinding/DialogSyncFileBinding;->l:Landroid/widget/TextView;

    .line 67
    .line 68
    new-instance v6, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v7, "\u6210\u529f"

    .line 74
    .line 75
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lcom/friday/document/databinding/DialogSyncFileBinding;

    .line 93
    .line 94
    iget-object v1, v1, Lcom/friday/document/databinding/DialogSyncFileBinding;->g:Landroid/widget/TextView;

    .line 95
    .line 96
    new-instance v2, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string v6, "\u5931\u8d25"

    .line 102
    .line 103
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Lcom/friday/document/databinding/DialogSyncFileBinding;

    .line 121
    .line 122
    iget-object v1, v1, Lcom/friday/document/databinding/DialogSyncFileBinding;->j:Landroid/widget/TextView;

    .line 123
    .line 124
    add-int/2addr v4, v5

    .line 125
    new-instance v2, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v3, "\u5269\u4f59"

    .line 131
    .line 132
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    if-nez v4, :cond_5

    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Lcom/friday/document/databinding/DialogSyncFileBinding;

    .line 152
    .line 153
    iget-object v0, v0, Lcom/friday/document/databinding/DialogSyncFileBinding;->n:Landroid/widget/TextView;

    .line 154
    .line 155
    const-string v1, "\u540c\u6b65\u5df2\u5b8c\u6210"

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_5
    new-instance v1, Landroid/text/SpannableString;

    .line 162
    .line 163
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    sub-int/2addr v2, v5

    .line 168
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    new-instance v4, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    const-string v6, "\u540c\u6b65\u8fdb\u884c\u4e2d"

    .line 178
    .line 179
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v2, "/"

    .line 186
    .line 187
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-direct {v1, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 198
    .line 199
    .line 200
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    .line 201
    .line 202
    const-string v3, "#4797F3"

    .line 203
    .line 204
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    sub-int/2addr v0, v5

    .line 216
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    const/4 v3, 0x5

    .line 225
    add-int/2addr v0, v3

    .line 226
    const/16 v4, 0x21

    .line 227
    .line 228
    invoke-virtual {v1, v2, v3, v0, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    check-cast v0, Lcom/friday/document/databinding/DialogSyncFileBinding;

    .line 236
    .line 237
    iget-object v0, v0, Lcom/friday/document/databinding/DialogSyncFileBinding;->n:Landroid/widget/TextView;

    .line 238
    .line 239
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    .line 241
    .line 242
    return-void
.end method

.method public final x()Lcom/friday/document/adapter/SyncFileAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/ManualSyncFileDialog;->l:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/adapter/SyncFileAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final y()Lcom/friday/document/viewmodel/ManualSyncViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/ManualSyncFileDialog;->k:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 8
    .line 9
    return-object v0
.end method
