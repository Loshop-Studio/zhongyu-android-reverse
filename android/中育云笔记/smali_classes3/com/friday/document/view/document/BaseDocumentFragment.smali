.class public abstract Lcom/friday/document/view/document/BaseDocumentFragment;
.super Lcom/friday/common/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VM:",
        "Lcom/friday/document/viewmodel/BaseFileViewModel;",
        "A:",
        "Landroidx/paging/PagingDataAdapter<",
        "Lcom/friday/document/adapter/MultiModeFileEntity;",
        "*>;Binding:",
        "Landroidx/databinding/ViewDataBinding;",
        ">",
        "Lcom/friday/common/base/BaseFragment<",
        "TBinding;>;"
    }
.end annotation


# instance fields
.field public d:Lcom/friday/document/viewmodel/BaseFileViewModel;

.field public e:Landroidx/paging/PagingDataAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/base/BaseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final C(Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "newName"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->r0(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 33
    .line 34
    return-object p0
.end method

.method public static final G(Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p1, v2, v0, v1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->x0(Lcom/friday/document/viewmodel/BaseFileViewModel;ZLcom/friday/common/entity/FileEntity;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->y()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final H(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/document/BaseDocumentFragment$initBaseObserver$2$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/friday/document/view/document/BaseDocumentFragment$initBaseObserver$2$1;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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

.method public static final I(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->v()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object p0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, p1}, Lcom/friday/common/helper/c;->m(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object v0, Lk2/x;->a:Lk2/x$a;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "requireContext(...)"

    .line 32
    .line 33
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v2, "cn.wps.moffice_eng"

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lk2/x$a;->c(Landroid/content/Context;Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v0, p1}, Lk2/x$a;->b(Ljava/lang/String;)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance p1, Lcom/friday/common/widget/dialog/WPSDownloadDialog;

    .line 57
    .line 58
    invoke-direct {p1}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string v0, "getChildFragmentManager(...)"

    .line 66
    .line 67
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-class v0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p1, p0, v0}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->y()V

    .line 81
    .line 82
    .line 83
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 84
    .line 85
    return-object p0
.end method

.method public static final J(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->t0(Lcom/friday/common/entity/FileEntity;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final K(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/document/BaseDocumentFragment$initBaseObserver$5$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/friday/document/view/document/BaseDocumentFragment$initBaseObserver$5$1;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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

.method public static final L(Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->t0(Lcom/friday/common/entity/FileEntity;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final moveToPosition(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/lit8 v2, v2, -0x1

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-lt p2, v1, :cond_3

    .line 28
    .line 29
    if-le p2, v2, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    sub-int/2addr p2, v1

    .line 33
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-virtual {p1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    return-void

    .line 47
    :cond_3
    :goto_1
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static synthetic q(Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->L(Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic r(Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->G(Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic s(Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/document/view/document/BaseDocumentFragment;->C(Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->I(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->K(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->J(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->H(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic x(Lcom/friday/document/view/document/BaseDocumentFragment;Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/friday/document/view/document/BaseDocumentFragment;->moveToPosition(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final A(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/friday/document/view/document/BaseDocumentFragment$clickTxt$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/document/view/document/BaseDocumentFragment$clickTxt$1;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "type"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "name"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/16 v1, 0x30

    .line 21
    .line 22
    if-eq v0, v1, :cond_4

    .line 23
    .line 24
    const/16 v1, 0x31

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    const/16 v1, 0x620

    .line 29
    .line 30
    if-eq v0, v1, :cond_2

    .line 31
    .line 32
    const/16 v1, 0x621

    .line 33
    .line 34
    if-eq v0, v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string v0, "12"

    .line 38
    .line 39
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    :cond_1
    move-object v1, p3

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const-string v0, "11"

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const-string v0, "1"

    .line 57
    .line 58
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    const-string v0, "0"

    .line 66
    .line 67
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_1

    .line 72
    .line 73
    :cond_5
    :goto_0
    const/4 v5, 0x6

    .line 74
    const/4 v6, 0x0

    .line 75
    const-string v2, "."

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    const/4 v4, 0x0

    .line 79
    move-object v1, p3

    .line 80
    invoke-static/range {v1 .. v6}, Lqd/c0;->l0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    goto :goto_2

    .line 85
    :goto_1
    const/4 p3, 0x0

    .line 86
    :goto_2
    if-lez p3, :cond_6

    .line 87
    .line 88
    const-string p3, "."

    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    const/4 v2, 0x2

    .line 92
    invoke-static {v1, p3, v0, v2, v0}, Lqd/c0;->d1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v1, p3, v0, v2, v0}, Lqd/c0;->W0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    move-object v0, p3

    .line 116
    move-object p3, v3

    .line 117
    goto :goto_3

    .line 118
    :cond_6
    const-string p3, ""

    .line 119
    .line 120
    move-object v0, p3

    .line 121
    move-object p3, v1

    .line 122
    :goto_3
    sget-object v1, Lcom/friday/common/widget/dialog/a;->a:Lcom/friday/common/widget/dialog/a;

    .line 123
    .line 124
    new-instance v2, Lv2/g;

    .line 125
    .line 126
    invoke-direct {v2, p0, p1, v0}, Lv2/g;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, p2, p3, v2}, Lcom/friday/common/widget/dialog/a;->L(Ljava/lang/String;Ljava/lang/String;Lhd/l;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    const-string p3, "rename"

    .line 141
    .line 142
    invoke-virtual {p1, p2, p3}, Lcom/friday/common/widget/dialog/BaseDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public final D()Landroidx/paging/PagingDataAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/document/BaseDocumentFragment;->e:Landroidx/paging/PagingDataAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "mAdapter"

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

.method public final E()Lcom/friday/document/viewmodel/BaseFileViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/document/BaseDocumentFragment;->d:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "mViewModel"

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

.method public final F()V
    .locals 8

    .line 1
    const-string v0, "MoveFileSuccess"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Lv2/a;

    .line 12
    .line 13
    invoke-direct {v2, p0}, Lv2/a;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->f0()Landroidx/lifecycle/MutableLiveData;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, Lv2/b;

    .line 32
    .line 33
    invoke-direct {v2, p0}, Lv2/b;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Lcom/friday/document/view/document/BaseDocumentFragment$a;

    .line 37
    .line 38
    invoke-direct {v3, v2}, Lcom/friday/document/view/document/BaseDocumentFragment$a;-><init>(Lhd/l;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->J()Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v2, Lv2/c;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lv2/c;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;)V

    .line 59
    .line 60
    .line 61
    new-instance v3, Lcom/friday/document/view/document/BaseDocumentFragment$a;

    .line 62
    .line 63
    invoke-direct {v3, v2}, Lcom/friday/document/view/document/BaseDocumentFragment$a;-><init>(Lhd/l;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->T()Landroidx/lifecycle/MutableLiveData;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    new-instance v2, Lv2/d;

    .line 82
    .line 83
    invoke-direct {v2, p0}, Lv2/d;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;)V

    .line 84
    .line 85
    .line 86
    new-instance v3, Lcom/friday/document/view/document/BaseDocumentFragment$a;

    .line 87
    .line 88
    invoke-direct {v3, v2}, Lcom/friday/document/view/document/BaseDocumentFragment$a;-><init>(Lhd/l;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->e0()Landroidx/lifecycle/MutableLiveData;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    new-instance v2, Lv2/e;

    .line 107
    .line 108
    invoke-direct {v2, p0}, Lv2/e;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;)V

    .line 109
    .line 110
    .line 111
    new-instance v3, Lcom/friday/document/view/document/BaseDocumentFragment$a;

    .line 112
    .line 113
    invoke-direct {v3, v2}, Lcom/friday/document/view/document/BaseDocumentFragment$a;-><init>(Lhd/l;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-string v1, "getViewLifecycleOwner(...)"

    .line 124
    .line 125
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    new-instance v5, Lcom/friday/document/view/document/BaseDocumentFragment$initBaseObserver$6;

    .line 133
    .line 134
    const/4 v0, 0x0

    .line 135
    invoke-direct {v5, p0, v0}, Lcom/friday/document/view/document/BaseDocumentFragment$initBaseObserver$6;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;Lvc/c;)V

    .line 136
    .line 137
    .line 138
    const/4 v6, 0x3

    .line 139
    const/4 v7, 0x0

    .line 140
    const/4 v3, 0x0

    .line 141
    const/4 v4, 0x0

    .line 142
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 143
    .line 144
    .line 145
    const-string v0, "ClearCache"

    .line 146
    .line 147
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    new-instance v2, Lv2/f;

    .line 156
    .line 157
    invoke-direct {v2, p0}, Lv2/f;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v0, v1, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public final M()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/friday/document/view/document/BaseDocumentFragment$registerAdapterRemoveObserver$1;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final N(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "recyclerView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileId"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p1, p0, p2, v2}, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;-><init>(Landroidx/recyclerview/widget/RecyclerView;Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/String;Lvc/c;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lhd/p;)Lkotlinx/coroutines/g;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final O(Landroidx/paging/PagingDataAdapter;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/document/view/document/BaseDocumentFragment;->e:Landroidx/paging/PagingDataAdapter;

    .line 7
    .line 8
    return-void
.end method

.method public final P(Lcom/friday/document/viewmodel/BaseFileViewModel;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/document/view/document/BaseDocumentFragment;->d:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 7
    .line 8
    return-void
.end method

.method public final y()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->t0(Lcom/friday/common/entity/FileEntity;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final z(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/document/view/document/BaseDocumentFragment$clickNote$1;-><init>(Lcom/friday/document/view/document/BaseDocumentFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method
