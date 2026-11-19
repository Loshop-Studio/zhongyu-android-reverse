.class public Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;
.super Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;
.source "SourceFile"


# static fields
.field public static final j:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final k:Landroid/util/SparseIntArray;


# instance fields
.field public final h:Landroid/widget/FrameLayout;

.field public i:J


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->j:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 8
    .line 9
    const-string v1, "layout_confirm_time_up"

    .line 10
    .line 11
    const-string v2, "layout_confirm_end_class"

    .line 12
    .line 13
    const-string v3, "layout_random"

    .line 14
    .line 15
    const-string v4, "layout_subjective_list"

    .line 16
    .line 17
    const-string v5, "layout_subjective_detail"

    .line 18
    .line 19
    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x4

    .line 24
    const/4 v3, 0x5

    .line 25
    const/4 v4, 0x1

    .line 26
    const/4 v5, 0x2

    .line 27
    const/4 v6, 0x3

    .line 28
    filled-new-array {v4, v5, v6, v2, v3}, [I

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget v3, Lcom/friday/lecture/R$layout;->layout_random:I

    .line 33
    .line 34
    sget v4, Lcom/friday/lecture/R$layout;->layout_subjective_list:I

    .line 35
    .line 36
    sget v5, Lcom/friday/lecture/R$layout;->layout_subjective_detail:I

    .line 37
    .line 38
    sget v6, Lcom/friday/lecture/R$layout;->layout_confirm_time_up:I

    .line 39
    .line 40
    sget v7, Lcom/friday/lecture/R$layout;->layout_confirm_end_class:I

    .line 41
    .line 42
    filled-new-array {v3, v4, v5, v6, v7}, [I

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    sput-object v0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->k:Landroid/util/SparseIntArray;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->j:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->k:Landroid/util/SparseIntArray;

    const/4 v2, 0x6

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 10

    const/4 v0, 0x3

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/friday/lecture/databinding/LayoutSubjectiveDetailBinding;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/friday/lecture/databinding/LayoutConfirmEndClassBinding;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/friday/lecture/databinding/LayoutSubjectiveListBinding;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/friday/lecture/databinding/LayoutRandomBinding;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBinding;

    const/4 v4, 0x5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/friday/lecture/databinding/LayoutSubjectiveDetailBinding;Lcom/friday/lecture/databinding/LayoutConfirmEndClassBinding;Lcom/friday/lecture/databinding/LayoutSubjectiveListBinding;Lcom/friday/lecture/databinding/LayoutRandomBinding;Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBinding;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

    .line 4
    iget-object p1, v1, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->c:Lcom/friday/lecture/databinding/LayoutSubjectiveDetailBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 5
    iget-object p1, v1, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->d:Lcom/friday/lecture/databinding/LayoutConfirmEndClassBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 6
    iget-object p1, v1, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->e:Lcom/friday/lecture/databinding/LayoutSubjectiveListBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 7
    iget-object p1, v1, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->f:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 8
    iget-object p1, v1, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->g:Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 p1, 0x0

    .line 9
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, v1, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->h:Landroid/widget/FrameLayout;

    const/4 p2, 0x0

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 12
    invoke-virtual {p0}, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->invalidateAll()V

    return-void
.end method

.method private k(Lcom/friday/lecture/databinding/LayoutRandomBinding;I)Z
    .locals 2

    .line 1
    sget p1, La3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

    .line 7
    .line 8
    const-wide/16 v0, 0x8

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

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
.method public final a(Lcom/friday/lecture/databinding/LayoutSubjectiveDetailBinding;I)Z
    .locals 2

    .line 1
    sget p1, La3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

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

.method public final c(Lcom/friday/lecture/databinding/LayoutConfirmEndClassBinding;I)Z
    .locals 2

    .line 1
    sget p1, La3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

    .line 7
    .line 8
    const-wide/16 v0, 0x4

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

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
    iput-wide v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->f:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->e:Lcom/friday/lecture/databinding/LayoutSubjectiveListBinding;

    .line 13
    .line 14
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->c:Lcom/friday/lecture/databinding/LayoutSubjectiveDetailBinding;

    .line 18
    .line 19
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->g:Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBinding;

    .line 23
    .line 24
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->d:Lcom/friday/lecture/databinding/LayoutConfirmEndClassBinding;

    .line 28
    .line 29
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw v0
.end method

.method public final g(Lcom/friday/lecture/databinding/LayoutSubjectiveListBinding;I)Z
    .locals 2

    .line 1
    sget p1, La3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

    .line 7
    .line 8
    const-wide/16 v0, 0x2

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

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
    iget-wide v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

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
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->f:Lcom/friday/lecture/databinding/LayoutRandomBinding;

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
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->e:Lcom/friday/lecture/databinding/LayoutSubjectiveListBinding;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    return v1

    .line 34
    :cond_2
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->c:Lcom/friday/lecture/databinding/LayoutSubjectiveDetailBinding;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    return v1

    .line 43
    :cond_3
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->g:Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBinding;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    return v1

    .line 52
    :cond_4
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->d:Lcom/friday/lecture/databinding/LayoutConfirmEndClassBinding;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    return v1

    .line 61
    :cond_5
    const/4 v0, 0x0

    .line 62
    return v0

    .line 63
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x20

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->f:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->e:Lcom/friday/lecture/databinding/LayoutSubjectiveListBinding;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->c:Lcom/friday/lecture/databinding/LayoutSubjectiveDetailBinding;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->g:Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBinding;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->d:Lcom/friday/lecture/databinding/LayoutConfirmEndClassBinding;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw v0
.end method

.method public final m(Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBinding;I)Z
    .locals 2

    .line 1
    sget p1, La3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

    .line 7
    .line 8
    const-wide/16 v0, 0x10

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->i:J

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
    if-eqz p1, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_3

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_0
    check-cast p2, Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBinding;

    .line 18
    .line 19
    invoke-virtual {p0, p2, p3}, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->m(Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBinding;I)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_1
    check-cast p2, Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 25
    .line 26
    invoke-direct {p0, p2, p3}, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->k(Lcom/friday/lecture/databinding/LayoutRandomBinding;I)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_2
    check-cast p2, Lcom/friday/lecture/databinding/LayoutConfirmEndClassBinding;

    .line 32
    .line 33
    invoke-virtual {p0, p2, p3}, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->c(Lcom/friday/lecture/databinding/LayoutConfirmEndClassBinding;I)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_3
    check-cast p2, Lcom/friday/lecture/databinding/LayoutSubjectiveListBinding;

    .line 39
    .line 40
    invoke-virtual {p0, p2, p3}, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->g(Lcom/friday/lecture/databinding/LayoutSubjectiveListBinding;I)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :cond_4
    check-cast p2, Lcom/friday/lecture/databinding/LayoutSubjectiveDetailBinding;

    .line 46
    .line 47
    invoke-virtual {p0, p2, p3}, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBindingImpl;->a(Lcom/friday/lecture/databinding/LayoutSubjectiveDetailBinding;I)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    return p1
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->f:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->e:Lcom/friday/lecture/databinding/LayoutSubjectiveListBinding;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->c:Lcom/friday/lecture/databinding/LayoutSubjectiveDetailBinding;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->g:Lcom/friday/lecture/databinding/LayoutConfirmTimeUpBinding;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowSubjectiveAnswerBinding;->d:Lcom/friday/lecture/databinding/LayoutConfirmEndClassBinding;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
