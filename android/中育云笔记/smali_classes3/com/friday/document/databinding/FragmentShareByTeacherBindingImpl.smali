.class public Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;
.super Lcom/friday/document/databinding/FragmentShareByTeacherBinding;
.source "SourceFile"


# static fields
.field public static final i:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final j:Landroid/util/SparseIntArray;


# instance fields
.field public final g:Landroid/widget/FrameLayout;

.field public h:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;->i:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 8
    .line 9
    const-string v1, "layout_empty_no_share"

    .line 10
    .line 11
    filled-new-array {v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x2

    .line 16
    filled-new-array {v2}, [I

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget v3, Lcom/friday/document/R$layout;->layout_empty_no_share:I

    .line 21
    .line 22
    filled-new-array {v3}, [I

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/4 v4, 0x1

    .line 27
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Landroid/util/SparseIntArray;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;->j:Landroid/util/SparseIntArray;

    .line 36
    .line 37
    sget v1, Lcom/friday/document/R$id;->rv_share:I

    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 41
    .line 42
    .line 43
    sget v1, Lcom/friday/document/R$id;->file_list_container:I

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;->i:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;->j:Landroid/util/SparseIntArray;

    const/4 v2, 0x5

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 9

    const/4 v0, 0x2

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroidx/fragment/app/FragmentContainerView;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v4, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/friday/document/databinding/LayoutEmptyNoShareBinding;Landroidx/fragment/app/FragmentContainerView;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Landroidx/recyclerview/widget/RecyclerView;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;->h:J

    .line 4
    iget-object p1, v1, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->c:Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 p1, 0x0

    .line 5
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, v1, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;->g:Landroid/widget/FrameLayout;

    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-object p1, v1, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->e:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 9
    invoke-virtual {p0}, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;I)Z
    .locals 2

    .line 1
    sget p1, Ln2/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;->h:J

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;->h:J

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public executeBindings()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;->h:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->c:Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;->h:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    iget-object v0, p0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->c:Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0

    .line 27
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x2

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;->h:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->c:Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method public onFieldChange(ILjava/lang/Object;I)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    check-cast p2, Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    .line 6
    .line 7
    invoke-virtual {p0, p2, p3}, Lcom/friday/document/databinding/FragmentShareByTeacherBindingImpl;->a(Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->c:Lcom/friday/document/databinding/LayoutEmptyNoShareBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
