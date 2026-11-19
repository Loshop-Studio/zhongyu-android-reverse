.class public final Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;
.super Lcom/zykj/mistake/base/BaseMVPFragment;
.source "SourceFile"

# interfaces
.implements Lj4/a;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/base/BaseMVPFragment<",
        "Lcom/zykj/mistake/presenter/MainPresenter;",
        "Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;",
        ">;",
        "Lj4/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;",
        "Lcom/zykj/mistake/base/BaseMVPFragment;",
        "Lcom/zykj/mistake/presenter/MainPresenter;",
        "Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;",
        "Lj4/a;",
        "",
        "<init>",
        "()V",
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


# instance fields
.field public d:Z

.field public final e:Ljava/util/ArrayList;

.field public f:Lcom/zykj/mistake/adapter/MainLessonAdapter;

.field public g:Ll4/e;

.field public final h:Lh4/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/base/BaseMVPFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->d:Z

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->e:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance v0, Lh4/c;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, p0, v1}, Lh4/c;-><init>(Landroid/content/ComponentCallbacks;I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->h:Lh4/c;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/mistake/R$layout;->fragment_mistake_notebook:I

    .line 2
    .line 3
    return v0
.end method

.method public final g(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;->d:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 8
    .line 9
    sget v0, Lcom/zykj/mistake/R$color;->colorPrimary:I

    .line 10
    .line 11
    filled-new-array {v0}, [I

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeResources([I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;->d:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 25
    .line 26
    new-instance v0, Landroidx/camera/core/impl/d;

    .line 27
    .line 28
    const/16 v1, 0x10

    .line 29
    .line 30
    invoke-direct {v0, p0, v1}, Landroidx/camera/core/impl/d;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Lcom/zykj/mistake/adapter/MainLessonAdapter;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "requireContext(...)"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->e:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {p1, v0, v1, p0}, Lcom/zykj/mistake/adapter/MainLessonAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->f:Lcom/zykj/mistake/adapter/MainLessonAdapter;

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;

    .line 59
    .line 60
    iget-object p1, p1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 61
    .line 62
    iget-object v0, p0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->f:Lcom/zykj/mistake/adapter/MainLessonAdapter;

    .line 63
    .line 64
    if-eqz v0, :cond_0

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;

    .line 74
    .line 75
    iget-object p1, p1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;->a:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 76
    .line 77
    new-instance v0, Landroidx/navigation/j;

    .line 78
    .line 79
    const/4 v1, 0x6

    .line 80
    invoke-direct {v0, p0, v1}, Landroidx/navigation/j;-><init>(Ljava/lang/Object;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    .line 85
    .line 86
    new-instance p1, Ll4/e;

    .line 87
    .line 88
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v1, "requireActivity(...)"

    .line 93
    .line 94
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    sget v1, Lcom/zykj/mistake/R$style;->AppTheme_Dialog:I

    .line 98
    .line 99
    invoke-direct {p1, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Lcom/zykj/view/board/play/b;

    .line 103
    .line 104
    const/16 v1, 0xa

    .line 105
    .line 106
    invoke-direct {v0, v1}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 107
    .line 108
    .line 109
    iput-object v0, p1, Ll4/e;->a:Lr6/a;

    .line 110
    .line 111
    iput-object p1, p0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->g:Ll4/e;

    .line 112
    .line 113
    return-void

    .line 114
    :cond_0
    const-string p1, "mMistakeAdapter"

    .line 115
    .line 116
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    const/4 p1, 0x0

    .line 120
    throw p1
.end method

.method public final i()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcom/zykj/mistake/presenter/MainPresenter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->h:Lh4/c;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient;->registerListener(Lc4/a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/mistake/base/BaseMVPFragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->h:Lh4/c;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient;->unRegisterListener(Lc4/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    .line 5
    .line 6
    new-instance v1, Lq4/b;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, p0, v2}, Lq4/b;-><init>(Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient;->getServerInfo(Lr6/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
