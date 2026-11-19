.class public final Lcom/friday/document/view/preview/NotePreviewFragment;
.super Lcom/friday/common/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lw2/b;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/view/preview/NotePreviewFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/common/base/BaseFragment<",
        "Lcom/friday/document/databinding/FragmentPreviewNoteBinding;",
        ">;",
        "Lw2/b;"
    }
.end annotation


# static fields
.field public static final e:Lcom/friday/document/view/preview/NotePreviewFragment$a;

.field public static final f:I


# instance fields
.field public final d:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/document/view/preview/NotePreviewFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/document/view/preview/NotePreviewFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/document/view/preview/NotePreviewFragment;->e:Lcom/friday/document/view/preview/NotePreviewFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/document/view/preview/NotePreviewFragment;->f:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/common/base/BaseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw2/e;

    .line 5
    .line 6
    invoke-direct {v0}, Lw2/e;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/friday/document/view/preview/NotePreviewFragment;->d:Lqc/d;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic q(Lcom/friday/document/view/preview/NotePreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/preview/NotePreviewFragment;->w(Lcom/friday/document/view/preview/NotePreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    return-void
.end method

.method public static synthetic r()Lcom/friday/document/adapter/PreviewAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/document/view/preview/NotePreviewFragment;->y()Lcom/friday/document/adapter/PreviewAdapter;

    move-result-object v0

    return-object v0
.end method

.method private final s()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-string v1, "fileId"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    :cond_1
    :goto_0
    const-string v0, ""

    .line 18
    .line 19
    return-object v0
.end method

.method private final v()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-string v1, "shareTime"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    :cond_1
    :goto_0
    const-string v0, ""

    .line 18
    .line 19
    return-object v0
.end method

.method public static final w(Lcom/friday/document/view/preview/NotePreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/preview/NotePreviewFragment;->u()Lcom/friday/document/adapter/PreviewAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/friday/document/adapter/PreviewAdapter;->d()V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    invoke-virtual {p1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final y()Lcom/friday/document/adapter/PreviewAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/adapter/PreviewAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/document/adapter/PreviewAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->fragment_preview_note:I

    .line 2
    .line 3
    return v0
.end method

.method public i()V
    .locals 6

    .line 1
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/friday/document/view/preview/NotePreviewFragment;->s()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/friday/document/view/preview/NotePreviewFragment;->x()Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    invoke-direct {p0}, Lcom/friday/document/view/preview/NotePreviewFragment;->v()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual/range {v0 .. v5}, Lcom/friday/common/helper/c;->k(Ljava/lang/String;ZZZLjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public initData()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/preview/NotePreviewFragment;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/document/view/preview/NotePreviewFragment;->u()Lcom/friday/document/adapter/PreviewAdapter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lcom/friday/document/view/preview/NotePreviewFragment;->t()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public initView()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentPreviewNoteBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentPreviewNoteBinding;->c:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 8
    .line 9
    new-instance v1, Lw2/d;

    .line 10
    .line 11
    invoke-direct {v1, p0, v0}, Lw2/d;-><init>(Lcom/friday/document/view/preview/NotePreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/friday/document/databinding/FragmentPreviewNoteBinding;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentPreviewNoteBinding;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 24
    .line 25
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

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
    invoke-virtual {p0}, Lcom/friday/document/view/preview/NotePreviewFragment;->u()Lcom/friday/document/adapter/PreviewAdapter;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public needHideLoadingOnDestroy()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final t()Ljava/util/List;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-string v1, "pathArray"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    array-length v2, v0

    .line 18
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    array-length v2, v0

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    if-ge v3, v2, :cond_0

    .line 24
    .line 25
    aget-object v4, v0, v3

    .line 26
    .line 27
    new-instance v5, Ljava/io/File;

    .line 28
    .line 29
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v1

    .line 39
    :cond_1
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
.end method

.method public final u()Lcom/friday/document/adapter/PreviewAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/preview/NotePreviewFragment;->d:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/adapter/PreviewAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final x()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v2, "isNewNote"

    .line 9
    .line 10
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0

    .line 15
    :cond_0
    return v1
.end method
