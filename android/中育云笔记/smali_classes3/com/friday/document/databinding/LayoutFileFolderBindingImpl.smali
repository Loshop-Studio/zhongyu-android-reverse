.class public Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;
.super Lcom/friday/document/databinding/LayoutFileFolderBinding;
.source "SourceFile"


# static fields
.field public static final r:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final s:Landroid/util/SparseIntArray;


# instance fields
.field public final o:Landroidx/appcompat/widget/LinearLayoutCompat;

.field public final p:Landroidx/appcompat/widget/LinearLayoutCompat;

.field public q:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->s:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    sget v1, Lcom/friday/document/R$id;->iv_back:I

    .line 9
    .line 10
    const/4 v2, 0x5

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 12
    .line 13
    .line 14
    sget v1, Lcom/friday/document/R$id;->tv_model_name:I

    .line 15
    .line 16
    const/4 v2, 0x6

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 18
    .line 19
    .line 20
    sget v1, Lcom/friday/document/R$id;->iv_search:I

    .line 21
    .line 22
    const/4 v2, 0x7

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 24
    .line 25
    .line 26
    sget v1, Lcom/friday/document/R$id;->iv_more:I

    .line 27
    .line 28
    const/16 v2, 0x8

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 31
    .line 32
    .line 33
    sget v1, Lcom/friday/document/R$id;->iv_sync:I

    .line 34
    .line 35
    const/16 v2, 0x9

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 38
    .line 39
    .line 40
    sget v1, Lcom/friday/document/R$id;->tv_cancel:I

    .line 41
    .line 42
    const/16 v2, 0xa

    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 45
    .line 46
    .line 47
    sget v1, Lcom/friday/document/R$id;->fragment_list:I

    .line 48
    .line 49
    const/16 v2, 0xb

    .line 50
    .line 51
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->r:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->s:Landroid/util/SparseIntArray;

    const/16 v2, 0xc

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;[Ljava/lang/Object;)V
    .locals 16

    move-object/from16 v14, p2

    const/4 v15, 0x0

    .line 2
    aget-object v2, v14, v15

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroidx/fragment/app/FragmentContainerView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroidx/appcompat/widget/AppCompatImageView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroidx/appcompat/widget/AppCompatImageView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroidx/appcompat/widget/LinearLayoutCompat;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v3, 0x2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v13}, Lcom/friday/document/databinding/LayoutFileFolderBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/fragment/app/FragmentContainerView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/LinearLayoutCompat;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->q:J

    .line 4
    aget-object v1, p3, v15

    check-cast v1, Landroidx/appcompat/widget/LinearLayoutCompat;

    iput-object v1, v0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->o:Landroidx/appcompat/widget/LinearLayoutCompat;

    const/4 v2, 0x0

    .line 5
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 6
    aget-object v1, p3, v1

    check-cast v1, Landroidx/appcompat/widget/LinearLayoutCompat;

    iput-object v1, v0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->p:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object v1, v0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->h:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    iget-object v1, v0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->j:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object v1, v0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->l:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {v0, v14}, Landroidx/databinding/ViewDataBinding;->setRootTag([Landroid/view/View;)V

    .line 12
    invoke-virtual {v0}, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->invalidateAll()V

    return-void
.end method

.method private g(Landroidx/lifecycle/LiveData;I)Z
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
    iget-wide p1, p0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->q:J

    .line 7
    .line 8
    const-wide/16 v0, 0x2

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->q:J

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

.method private k(Landroidx/lifecycle/LiveData;I)Z
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
    iget-wide p1, p0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->q:J

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->q:J

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
    iput-object p1, p0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->m:Landroidx/lifecycle/LiveData;

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-wide v0, p0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->q:J

    .line 9
    .line 10
    const-wide/16 v2, 0x2

    .line 11
    .line 12
    or-long/2addr v0, v2

    .line 13
    iput-wide v0, p0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->q:J

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
    iput-object p1, p0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->n:Landroidx/lifecycle/LiveData;

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-wide v0, p0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->q:J

    .line 9
    .line 10
    const-wide/16 v2, 0x1

    .line 11
    .line 12
    or-long/2addr v0, v2

    .line 13
    iput-wide v0, p0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->q:J

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
    .locals 12

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->q:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->q:J

    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object v4, p0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->n:Landroidx/lifecycle/LiveData;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->m:Landroidx/lifecycle/LiveData;

    .line 12
    .line 13
    const-wide/16 v6, 0x5

    .line 14
    .line 15
    and-long/2addr v6, v0

    .line 16
    cmp-long v6, v6, v2

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    if-eqz v6, :cond_1

    .line 21
    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Ljava/lang/Boolean;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v4, v7

    .line 32
    :goto_0
    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v4, v8

    .line 38
    :goto_1
    const-wide/16 v9, 0x6

    .line 39
    .line 40
    and-long/2addr v0, v9

    .line 41
    cmp-long v0, v0, v2

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v7, v1

    .line 52
    check-cast v7, Ljava/lang/Boolean;

    .line 53
    .line 54
    :cond_2
    invoke-static {v7}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    xor-int/lit8 v1, v8, 0x1

    .line 59
    .line 60
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    move v11, v8

    .line 69
    move v8, v1

    .line 70
    move v1, v11

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    move v1, v8

    .line 73
    :goto_2
    if-eqz v0, :cond_4

    .line 74
    .line 75
    iget-object v0, p0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->p:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 76
    .line 77
    invoke-static {v0, v8}, Lk2/l;->a(Landroid/view/View;Z)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->h:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 81
    .line 82
    invoke-static {v0, v1}, Lk2/l;->a(Landroid/view/View;Z)V

    .line 83
    .line 84
    .line 85
    :cond_4
    if-eqz v6, :cond_5

    .line 86
    .line 87
    iget-object v0, p0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->j:Landroidx/appcompat/widget/AppCompatTextView;

    .line 88
    .line 89
    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 93
    .line 94
    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 95
    .line 96
    .line 97
    :cond_5
    return-void

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->q:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    monitor-exit p0

    .line 12
    return v0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit p0

    .line 16
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x4

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->q:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v0
.end method

.method public onFieldChange(ILjava/lang/Object;I)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1

    .line 8
    :cond_0
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 9
    .line 10
    invoke-direct {p0, p2, p3}, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->g(Landroidx/lifecycle/LiveData;I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_1
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 16
    .line 17
    invoke-direct {p0, p2, p3}, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->k(Landroidx/lifecycle/LiveData;I)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
    invoke-virtual {p0, p2}, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->c(Landroidx/lifecycle/LiveData;)V

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
    invoke-virtual {p0, p2}, Lcom/friday/document/databinding/LayoutFileFolderBindingImpl;->a(Landroidx/lifecycle/LiveData;)V

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
