.class public Lcom/friday/document/databinding/DocumentFragmentBindingImpl;
.super Lcom/friday/document/databinding/DocumentFragmentBinding;
.source "SourceFile"


# static fields
.field public static final i:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final j:Landroid/util/SparseIntArray;


# instance fields
.field public final g:Landroidx/appcompat/widget/LinearLayoutCompat;

.field public h:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->i:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 8
    .line 9
    const-string v1, "layout_file_browser"

    .line 10
    .line 11
    filled-new-array {v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x1

    .line 16
    filled-new-array {v2}, [I

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget v3, Lcom/friday/document/R$layout;->layout_file_browser:I

    .line 21
    .line 22
    filled-new-array {v3}, [I

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/4 v4, 0x0

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
    sput-object v0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->j:Landroid/util/SparseIntArray;

    .line 36
    .line 37
    sget v1, Lcom/friday/document/R$id;->fragment_preview:I

    .line 38
    .line 39
    const/4 v2, 0x2

    .line 40
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->i:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->j:Landroid/util/SparseIntArray;

    const/4 v2, 0x3

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x2

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/FrameLayout;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    const/4 v4, 0x3

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/friday/document/databinding/DocumentFragmentBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/FrameLayout;Lcom/friday/document/databinding/LayoutFileBrowserBinding;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

    .line 4
    iget-object p1, v1, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 p1, 0x0

    .line 5
    aget-object p1, p3, p1

    check-cast p1, Landroidx/appcompat/widget/LinearLayoutCompat;

    iput-object p1, v1, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->g:Landroidx/appcompat/widget/LinearLayoutCompat;

    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 8
    invoke-virtual {p0}, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/lifecycle/LiveData;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0, p1}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lcom/friday/document/databinding/DocumentFragmentBinding;->e:Landroidx/lifecycle/LiveData;

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-wide v0, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

    .line 9
    .line 10
    const-wide/16 v2, 0x2

    .line 11
    .line 12
    or-long/2addr v0, v2

    .line 13
    iput-wide v0, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

    .line 14
    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    sget p1, Ln2/a;->b:I

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 19
    .line 20
    .line 21
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw p1
.end method

.method public c(Landroidx/lifecycle/LiveData;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lcom/friday/document/databinding/DocumentFragmentBinding;->f:Landroidx/lifecycle/LiveData;

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-wide v0, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

    .line 9
    .line 10
    const-wide/16 v2, 0x1

    .line 11
    .line 12
    or-long/2addr v0, v2

    .line 13
    iput-wide v0, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

    .line 14
    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    sget p1, Ln2/a;->c:I

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 19
    .line 20
    .line 21
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw p1
.end method

.method public executeBindings()V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object v4, p0, Lcom/friday/document/databinding/DocumentFragmentBinding;->f:Landroidx/lifecycle/LiveData;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/friday/document/databinding/DocumentFragmentBinding;->e:Landroidx/lifecycle/LiveData;

    .line 12
    .line 13
    const-wide/16 v6, 0x9

    .line 14
    .line 15
    and-long/2addr v6, v0

    .line 16
    cmp-long v6, v6, v2

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    check-cast v7, Ljava/lang/Boolean;

    .line 27
    .line 28
    :cond_0
    const-wide/16 v7, 0xa

    .line 29
    .line 30
    and-long/2addr v0, v7

    .line 31
    cmp-long v0, v0, v2

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/Boolean;

    .line 42
    .line 43
    :cond_1
    if-eqz v0, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 46
    .line 47
    invoke-virtual {v0, v5}, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->a(Landroidx/lifecycle/LiveData;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    if-eqz v6, :cond_3

    .line 51
    .line 52
    iget-object v0, p0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 53
    .line 54
    invoke-virtual {v0, v4}, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->c(Landroidx/lifecycle/LiveData;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v0, p0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 58
    .line 59
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw v0
.end method

.method public final g(Landroidx/lifecycle/LiveData;I)Z
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
    iget-wide p1, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

    .line 7
    .line 8
    const-wide/16 v0, 0x2

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

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

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

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
    iget-object v0, p0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

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
    const-wide/16 v0, 0x8

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

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

.method public final k(Landroidx/lifecycle/LiveData;I)Z
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
    iget-wide p1, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

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

.method public final m(Lcom/friday/document/databinding/LayoutFileBrowserBinding;I)Z
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
    iget-wide p1, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

    .line 7
    .line 8
    const-wide/16 v0, 0x4

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->h:J

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

.method public onFieldChange(ILjava/lang/Object;I)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    check-cast p2, Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 12
    .line 13
    invoke-virtual {p0, p2, p3}, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->m(Lcom/friday/document/databinding/LayoutFileBrowserBinding;I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_1
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 19
    .line 20
    invoke-virtual {p0, p2, p3}, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->g(Landroidx/lifecycle/LiveData;I)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :cond_2
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p3}, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->k(Landroidx/lifecycle/LiveData;I)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2

    .line 1
    sget v0, Ln2/a;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->c(Landroidx/lifecycle/LiveData;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    sget v0, Ln2/a;->b:I

    .line 13
    .line 14
    if-ne v0, p1, :cond_1

    .line 15
    .line 16
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Lcom/friday/document/databinding/DocumentFragmentBindingImpl;->a(Landroidx/lifecycle/LiveData;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
.end method
