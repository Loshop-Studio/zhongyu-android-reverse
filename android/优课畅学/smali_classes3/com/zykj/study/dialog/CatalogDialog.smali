.class public final Lcom/zykj/study/dialog/CatalogDialog;
.super Lcom/zykj/study/dialog/Hilt_CatalogDialog;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/dialog/CatalogDialog$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/dialog/Hilt_CatalogDialog<",
        "Lcom/zykj/study/databinding/DialogCatalogBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final i:Lcom/zykj/study/dialog/CatalogDialog$a;

.field public static final j:I


# instance fields
.field public final f:Lh7/d;

.field public final g:Lh7/d;

.field public final h:Landroidx/navigation/NavArgsLazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/dialog/CatalogDialog$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/dialog/CatalogDialog$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/dialog/CatalogDialog;->i:Lcom/zykj/study/dialog/CatalogDialog$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/dialog/CatalogDialog;->j:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/dialog/Hilt_CatalogDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v4, p0}, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/study/dialog/CatalogDialog;->f:Lh7/d;

    .line 31
    .line 32
    new-instance v0, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$viewModels$default$1;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 35
    .line 36
    .line 37
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 38
    .line 39
    new-instance v2, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$viewModels$default$2;

    .line 40
    .line 41
    invoke-direct {v2, v0}, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-class v1, Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    new-instance v2, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$viewModels$default$3;

    .line 55
    .line 56
    invoke-direct {v2, v0}, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 57
    .line 58
    .line 59
    new-instance v4, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$viewModels$default$4;

    .line 60
    .line 61
    invoke-direct {v4, v3, v0}, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 62
    .line 63
    .line 64
    new-instance v3, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$viewModels$default$5;

    .line 65
    .line 66
    invoke-direct {v3, p0, v0}, Lcom/zykj/study/dialog/CatalogDialog$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v1, v2, v4, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lcom/zykj/study/dialog/CatalogDialog;->g:Lh7/d;

    .line 74
    .line 75
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 76
    .line 77
    const-class v1, Lcom/zykj/study/dialog/CatalogDialogArgs;

    .line 78
    .line 79
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    new-instance v2, Lcom/zykj/study/dialog/CatalogDialog$c;

    .line 84
    .line 85
    invoke-direct {v2, p0}, Lcom/zykj/study/dialog/CatalogDialog$c;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lcom/zykj/study/dialog/CatalogDialog;->h:Landroidx/navigation/NavArgsLazy;

    .line 92
    .line 93
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/dialog/CatalogDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/dialog/CatalogDialog;->m(Lcom/zykj/study/dialog/CatalogDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/dialog/CatalogDialog;Ljava/lang/Integer;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/dialog/CatalogDialog;->n(Lcom/zykj/study/dialog/CatalogDialog;Ljava/lang/Integer;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lcom/zykj/study/dialog/CatalogDialog;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CatalogViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Integer;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 25
    .line 26
    sget p1, Lcom/zykj/study/R$string;->please_choice_subject:I

    .line 27
    .line 28
    invoke-static {p0, p1}, Le5/o;->c(Lcom/zykj/base/utils/XToastUtils;I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CatalogViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v0, "subject_id"

    .line 45
    .line 46
    invoke-static {v0, p1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p0, v0, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CatalogViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string v0, "period_id"

    .line 74
    .line 75
    invoke-static {v0, p1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p0, v0, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CatalogViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const-string v0, "grade_id"

    .line 103
    .line 104
    invoke-static {v0, p1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {p0, v0, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 117
    .line 118
    .line 119
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public static final n(Lcom/zykj/study/dialog/CatalogDialog;Ljava/lang/Integer;)Lh7/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/DialogCatalogBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogCatalogBinding;->recyclerViewGrade:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const-string v0, "recyclerViewGrade"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/study/dialog/CatalogDialog;->o(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 18
    .line 19
    return-object p0
.end method


# virtual methods
.method public final i()Lcom/zykj/study/dialog/CatalogDialogArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/dialog/CatalogDialog;->h:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/dialog/CatalogDialogArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/DialogCatalogBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/DialogCatalogBinding;->setEntity(Lcom/zykj/study/viewmodels/CatalogViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CatalogViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->i()Lcom/zykj/study/dialog/CatalogDialogArgs;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2}, Lcom/zykj/study/dialog/CatalogDialogArgs;->c()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-static {p2}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CatalogViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->i()Lcom/zykj/study/dialog/CatalogDialogArgs;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p2}, Lcom/zykj/study/dialog/CatalogDialogArgs;->b()I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    invoke-static {p2}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CatalogViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->i()Lcom/zykj/study/dialog/CatalogDialogArgs;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p2}, Lcom/zykj/study/dialog/CatalogDialogArgs;->a()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    invoke-static {p2}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-eqz p1, :cond_0

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p1, :cond_0

    .line 94
    .line 95
    const/16 p2, 0x50

    .line 96
    .line 97
    invoke-virtual {p1, p2}, Landroid/view/Window;->setGravity(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    const/4 v0, -0x1

    .line 105
    iput v0, p2, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 106
    .line 107
    const/4 v0, -0x2

    .line 108
    iput v0, p2, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 109
    .line 110
    invoke-virtual {p1, p2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 111
    .line 112
    .line 113
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Lcom/zykj/study/databinding/DialogCatalogBinding;

    .line 118
    .line 119
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogCatalogBinding;->tvSure:Landroid/widget/TextView;

    .line 120
    .line 121
    new-instance p2, Lp4/b;

    .line 122
    .line 123
    invoke-direct {p2, p0}, Lp4/b;-><init>(Lcom/zykj/study/dialog/CatalogDialog;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Lcom/zykj/study/databinding/DialogCatalogBinding;

    .line 134
    .line 135
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogCatalogBinding;->recyclerViewSubject:Landroidx/recyclerview/widget/RecyclerView;

    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->k()Lcom/zykj/study/viewmodels/DictViewModel;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/DictViewModel;->l()Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    const/4 v0, 0x0

    .line 146
    const/4 v1, 0x1

    .line 147
    const/16 v2, 0xa

    .line 148
    .line 149
    if-eqz p2, :cond_4

    .line 150
    .line 151
    new-instance v3, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-static {p2, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_3

    .line 169
    .line 170
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    check-cast v4, Lcom/zykj/study/data/SubjectEntity;

    .line 175
    .line 176
    new-instance v5, Lcom/zykj/study/bean/SelectModel;

    .line 177
    .line 178
    invoke-virtual {v4}, Lcom/zykj/study/data/SubjectEntity;->getId()I

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    invoke-virtual {v7}, Lcom/zykj/study/viewmodels/CatalogViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    check-cast v7, Ljava/lang/Integer;

    .line 195
    .line 196
    if-nez v7, :cond_1

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_1
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    if-ne v6, v7, :cond_2

    .line 204
    .line 205
    move v6, v1

    .line 206
    goto :goto_2

    .line 207
    :cond_2
    :goto_1
    move v6, v0

    .line 208
    :goto_2
    invoke-direct {v5, v6, v4}, Lcom/zykj/study/bean/SelectModel;-><init>(ZLjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto :goto_0

    .line 215
    :cond_3
    new-instance p2, Lcom/zykj/study/adapter/CatalogSubjectAdapter;

    .line 216
    .line 217
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-direct {p2, v4, v3}, Lcom/zykj/study/adapter/CatalogSubjectAdapter;-><init>(Lcom/zykj/study/viewmodels/CatalogViewModel;Ljava/util/List;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 225
    .line 226
    .line 227
    :cond_4
    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 228
    .line 229
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    const/16 v4, 0x8

    .line 234
    .line 235
    invoke-direct {p2, v3, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 239
    .line 240
    .line 241
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0, p1}, Lcom/zykj/study/dialog/CatalogDialog;->l(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    check-cast p1, Lcom/zykj/study/databinding/DialogCatalogBinding;

    .line 252
    .line 253
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogCatalogBinding;->recyclerViewPeriod:Landroidx/recyclerview/widget/RecyclerView;

    .line 254
    .line 255
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->k()Lcom/zykj/study/viewmodels/DictViewModel;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/DictViewModel;->j()Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    if-eqz p2, :cond_8

    .line 264
    .line 265
    new-instance v3, Ljava/util/ArrayList;

    .line 266
    .line 267
    invoke-static {p2, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 272
    .line 273
    .line 274
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    if-eqz v2, :cond_7

    .line 283
    .line 284
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    check-cast v2, Lcom/zykj/study/data/PeriodEntity;

    .line 289
    .line 290
    new-instance v5, Lcom/zykj/study/bean/SelectModel;

    .line 291
    .line 292
    invoke-virtual {v2}, Lcom/zykj/study/data/PeriodEntity;->getId()I

    .line 293
    .line 294
    .line 295
    move-result v6

    .line 296
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    invoke-virtual {v7}, Lcom/zykj/study/viewmodels/CatalogViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v7

    .line 308
    check-cast v7, Ljava/lang/Integer;

    .line 309
    .line 310
    if-nez v7, :cond_5

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_5
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    if-ne v6, v7, :cond_6

    .line 318
    .line 319
    move v6, v1

    .line 320
    goto :goto_5

    .line 321
    :cond_6
    :goto_4
    move v6, v0

    .line 322
    :goto_5
    invoke-direct {v5, v6, v2}, Lcom/zykj/study/bean/SelectModel;-><init>(ZLjava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    goto :goto_3

    .line 329
    :cond_7
    new-instance p2, Lcom/zykj/study/adapter/CatalogPeriodAdapter;

    .line 330
    .line 331
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-direct {p2, v0, v3}, Lcom/zykj/study/adapter/CatalogPeriodAdapter;-><init>(Lcom/zykj/study/viewmodels/CatalogViewModel;Ljava/util/List;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 339
    .line 340
    .line 341
    :cond_8
    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 342
    .line 343
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-direct {p2, v0, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 351
    .line 352
    .line 353
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {p0, p1}, Lcom/zykj/study/dialog/CatalogDialog;->l(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    check-cast p1, Lcom/zykj/study/databinding/DialogCatalogBinding;

    .line 364
    .line 365
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogCatalogBinding;->recyclerViewGrade:Landroidx/recyclerview/widget/RecyclerView;

    .line 366
    .line 367
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {p0, p1}, Lcom/zykj/study/dialog/CatalogDialog;->o(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 371
    .line 372
    .line 373
    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 374
    .line 375
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    const/4 v1, 0x6

    .line 380
    invoke-direct {p2, v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {p0, p1}, Lcom/zykj/study/dialog/CatalogDialog;->l(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CatalogViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 398
    .line 399
    .line 400
    move-result-object p2

    .line 401
    new-instance v0, Lp4/c;

    .line 402
    .line 403
    invoke-direct {v0, p0}, Lp4/c;-><init>(Lcom/zykj/study/dialog/CatalogDialog;)V

    .line 404
    .line 405
    .line 406
    new-instance v1, Lcom/zykj/study/dialog/CatalogDialog$b;

    .line 407
    .line 408
    invoke-direct {v1, v0}, Lcom/zykj/study/dialog/CatalogDialog$b;-><init>(Lx7/l;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 412
    .line 413
    .line 414
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 415
    .line 416
    return-object p1
.end method

.method public final j()Lcom/zykj/study/viewmodels/CatalogViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/dialog/CatalogDialog;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final k()Lcom/zykj/study/viewmodels/DictViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/dialog/CatalogDialog;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final l(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/zykj/study/R$drawable;->divider:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v1, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->dialog_catalog:I

    .line 2
    .line 3
    return v0
.end method

.method public final o(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->k()Lcom/zykj/study/viewmodels/DictViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/DictViewModel;->h()Ljava/util/List;

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
    if-eqz v2, :cond_2

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
    check-cast v3, Lcom/zykj/study/data/GradeEntity;

    .line 32
    .line 33
    invoke-virtual {v3}, Lcom/zykj/study/data/GradeEntity;->getParentId()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/CatalogViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Ljava/lang/Integer;

    .line 50
    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-ne v3, v4, :cond_0

    .line 59
    .line 60
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 65
    .line 66
    const/16 v2, 0xa

    .line 67
    .line 68
    invoke-static {v1, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_5

    .line 84
    .line 85
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Lcom/zykj/study/data/GradeEntity;

    .line 90
    .line 91
    new-instance v3, Lcom/zykj/study/bean/SelectModel;

    .line 92
    .line 93
    invoke-virtual {v2}, Lcom/zykj/study/data/GradeEntity;->getId()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v5}, Lcom/zykj/study/viewmodels/CatalogViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, Ljava/lang/Integer;

    .line 110
    .line 111
    if-nez v5, :cond_3

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-ne v4, v5, :cond_4

    .line 119
    .line 120
    const/4 v4, 0x1

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    :goto_2
    const/4 v4, 0x0

    .line 123
    :goto_3
    invoke-direct {v3, v4, v2}, Lcom/zykj/study/bean/SelectModel;-><init>(ZLjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_5
    new-instance v1, Lcom/zykj/study/adapter/CatalogGradeAdapter;

    .line 131
    .line 132
    invoke-virtual {p0}, Lcom/zykj/study/dialog/CatalogDialog;->j()Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-direct {v1, v2, v0}, Lcom/zykj/study/adapter/CatalogGradeAdapter;-><init>(Lcom/zykj/study/viewmodels/CatalogViewModel;Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    return-void
.end method
