.class public Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;
.super Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;
.source "SourceFile"


# static fields
.field public static final r:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final s:Landroid/util/SparseIntArray;


# instance fields
.field public final p:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public q:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;->r:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 9
    .line 10
    const-string v1, "layout_random"

    .line 11
    .line 12
    filled-new-array {v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    filled-new-array {v2}, [I

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget v3, Lcom/friday/lecture/R$layout;->layout_random:I

    .line 22
    .line 23
    filled-new-array {v3}, [I

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Landroid/util/SparseIntArray;

    .line 32
    .line 33
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;->s:Landroid/util/SparseIntArray;

    .line 37
    .line 38
    sget v1, Lcom/friday/lecture/R$id;->cl_online:I

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 42
    .line 43
    .line 44
    sget v1, Lcom/friday/lecture/R$id;->tv_online_count:I

    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 48
    .line 49
    .line 50
    sget v1, Lcom/friday/lecture/R$id;->tv_teacher_count:I

    .line 51
    .line 52
    const/4 v2, 0x4

    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 54
    .line 55
    .line 56
    sget v1, Lcom/friday/lecture/R$id;->tv_student_count:I

    .line 57
    .line 58
    const/4 v2, 0x5

    .line 59
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 60
    .line 61
    .line 62
    sget v1, Lcom/friday/lecture/R$id;->rv_student_list:I

    .line 63
    .line 64
    const/4 v2, 0x6

    .line 65
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 66
    .line 67
    .line 68
    sget v1, Lcom/friday/lecture/R$id;->cv_update_demo:I

    .line 69
    .line 70
    const/4 v2, 0x7

    .line 71
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 72
    .line 73
    .line 74
    sget v1, Lcom/friday/lecture/R$id;->tv_student_demo:I

    .line 75
    .line 76
    const/16 v2, 0x8

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 79
    .line 80
    .line 81
    sget v1, Lcom/friday/lecture/R$id;->tv_tips:I

    .line 82
    .line 83
    const/16 v2, 0x9

    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 86
    .line 87
    .line 88
    sget v1, Lcom/friday/lecture/R$id;->cl_in_demo:I

    .line 89
    .line 90
    const/16 v2, 0xa

    .line 91
    .line 92
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 93
    .line 94
    .line 95
    sget v1, Lcom/friday/lecture/R$id;->tv_in_demo_count:I

    .line 96
    .line 97
    const/16 v2, 0xb

    .line 98
    .line 99
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 100
    .line 101
    .line 102
    sget v1, Lcom/friday/lecture/R$id;->rv_in_demo:I

    .line 103
    .line 104
    const/16 v2, 0xc

    .line 105
    .line 106
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 107
    .line 108
    .line 109
    sget v1, Lcom/friday/lecture/R$id;->iv_close:I

    .line 110
    .line 111
    const/16 v2, 0xd

    .line 112
    .line 113
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;->r:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;->s:Landroid/util/SparseIntArray;

    const/16 v2, 0xe

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 17

    const/16 v0, 0xa

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroidx/cardview/widget/CardView;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/friday/lecture/databinding/LayoutRandomBinding;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/TextView;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Landroid/widget/TextView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v15, v0

    check-cast v15, Landroid/widget/TextView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/widget/TextView;

    const/4 v3, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v16}, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/cardview/widget/CardView;Landroid/widget/ImageView;Lcom/friday/lecture/databinding/LayoutRandomBinding;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;->q:J

    .line 4
    iget-object v1, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 v1, 0x0

    .line 5
    aget-object v1, p3, v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v1, v0, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;->p:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 7
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 8
    invoke-virtual {v0}, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public executeBindings()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;->q:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

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

.method public final g(Lcom/friday/lecture/databinding/LayoutRandomBinding;I)Z
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
    iget-wide p1, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;->q:J

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;->q:J

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
    iget-wide v0, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;->q:J

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
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

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
    iput-wide v0, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;->q:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

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
    check-cast p2, Lcom/friday/lecture/databinding/LayoutRandomBinding;

    .line 6
    .line 7
    invoke-virtual {p0, p2, p3}, Lcom/friday/lecture/databinding/WindowStudentDemoListBindingImpl;->g(Lcom/friday/lecture/databinding/LayoutRandomBinding;I)Z

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
    iget-object v0, p0, Lcom/friday/lecture/databinding/WindowStudentDemoListBinding;->g:Lcom/friday/lecture/databinding/LayoutRandomBinding;

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
