.class public Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;
.super Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;
.source "SourceFile"


# static fields
.field public static final p:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final q:Landroid/util/SparseIntArray;


# instance fields
.field public final n:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public o:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

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
    sput-object v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->p:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 9
    .line 10
    const-string v1, "view_item_sketch_record"

    .line 11
    .line 12
    const-string v2, "view_item_sketch_record_audio"

    .line 13
    .line 14
    const-string v3, "view_include_menu"

    .line 15
    .line 16
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x7

    .line 21
    const/16 v3, 0x8

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    filled-new-array {v4, v2, v3}, [I

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget v3, Lcom/zykj/view/R$layout;->view_include_menu:I

    .line 29
    .line 30
    sget v4, Lcom/zykj/view/R$layout;->view_item_sketch_record:I

    .line 31
    .line 32
    sget v5, Lcom/zykj/view/R$layout;->view_item_sketch_record_audio:I

    .line 33
    .line 34
    filled-new-array {v3, v4, v5}, [I

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 40
    .line 41
    .line 42
    const-string v1, "view_include_image_add"

    .line 43
    .line 44
    const-string v2, "view_include_background_color"

    .line 45
    .line 46
    const-string v3, "view_include_pen"

    .line 47
    .line 48
    const-string v4, "view_include_eraser"

    .line 49
    .line 50
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const/4 v2, 0x5

    .line 55
    const/4 v3, 0x6

    .line 56
    const/4 v4, 0x3

    .line 57
    const/4 v5, 0x4

    .line 58
    filled-new-array {v4, v5, v2, v3}, [I

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    sget v3, Lcom/zykj/view/R$layout;->view_include_pen:I

    .line 63
    .line 64
    sget v4, Lcom/zykj/view/R$layout;->view_include_eraser:I

    .line 65
    .line 66
    sget v5, Lcom/zykj/view/R$layout;->view_include_image_add:I

    .line 67
    .line 68
    sget v6, Lcom/zykj/view/R$layout;->view_include_background_color:I

    .line 69
    .line 70
    filled-new-array {v3, v4, v5, v6}, [I

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const/4 v4, 0x1

    .line 75
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Landroid/util/SparseIntArray;

    .line 79
    .line 80
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->q:Landroid/util/SparseIntArray;

    .line 84
    .line 85
    sget v1, Lcom/zykj/view/R$id;->sketch_view:I

    .line 86
    .line 87
    const/16 v2, 0x9

    .line 88
    .line 89
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 90
    .line 91
    .line 92
    sget v1, Lcom/zykj/view/R$id;->iv_back:I

    .line 93
    .line 94
    const/16 v2, 0xa

    .line 95
    .line 96
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 97
    .line 98
    .line 99
    sget v1, Lcom/zykj/view/R$id;->iv_expansion:I

    .line 100
    .line 101
    const/16 v2, 0xb

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 104
    .line 105
    .line 106
    sget v1, Lcom/zykj/view/R$id;->sketch_progress_vertical:I

    .line 107
    .line 108
    const/16 v2, 0xc

    .line 109
    .line 110
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 111
    .line 112
    .line 113
    sget v1, Lcom/zykj/view/R$id;->sketch_progress_horizontal:I

    .line 114
    .line 115
    const/16 v2, 0xd

    .line 116
    .line 117
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->p:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->q:Landroid/util/SparseIntArray;

    const/16 v2, 0xe

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 17

    const/4 v0, 0x6

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lcom/zykj/view/databinding/ViewIncludePenBinding;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Lcom/zykj/view/widget/SketchProgressView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Lcom/zykj/view/widget/SketchProgressView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v15, v0

    check-cast v15, Lcom/zykj/view/simpleBoard/SimpleBoardView;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/widget/FrameLayout;

    const/4 v3, 0x7

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v16}, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Lcom/zykj/view/databinding/ViewIncludeEraserBinding;Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;Lcom/zykj/view/databinding/ViewIncludeMenuBinding;Lcom/zykj/view/databinding/ViewIncludePenBinding;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Lcom/zykj/view/widget/SketchProgressView;Lcom/zykj/view/widget/SketchProgressView;Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/widget/FrameLayout;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

    .line 4
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->a:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 5
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 6
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 7
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->d:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 8
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->e:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 9
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->f:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 10
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->g:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 v1, 0x0

    .line 11
    aget-object v1, p3, v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->n:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v2, 0x0

    .line 12
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 13
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->m:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 14
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 15
    invoke-virtual {v0}, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->invalidateAll()V

    return-void
.end method

.method private k(Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;I)Z
    .locals 2

    .line 1
    sget p1, La7/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

    .line 7
    .line 8
    const-wide/16 v0, 0x8

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

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

.method private t(Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;I)Z
    .locals 2

    .line 1
    sget p1, La7/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

    .line 7
    .line 8
    const-wide/16 v0, 0x4

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

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

.method private u(Lcom/zykj/view/databinding/ViewIncludeEraserBinding;I)Z
    .locals 2

    .line 1
    sget p1, La7/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

    .line 7
    .line 8
    const-wide/16 v0, 0x20

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

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

.method private v(Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;I)Z
    .locals 2

    .line 1
    sget p1, La7/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

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

.method private w(Lcom/zykj/view/databinding/ViewIncludeMenuBinding;I)Z
    .locals 2

    .line 1
    sget p1, La7/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

    .line 7
    .line 8
    const-wide/16 v0, 0x10

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

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

.method private x(Lcom/zykj/view/databinding/ViewIncludePenBinding;I)Z
    .locals 2

    .line 1
    sget p1, La7/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

    .line 7
    .line 8
    const-wide/16 v0, 0x40

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

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

.method private y(Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;I)Z
    .locals 2

    .line 1
    sget p1, La7/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

    .line 7
    .line 8
    const-wide/16 v0, 0x2

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

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
.method public executeBindings()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->e:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->f:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 13
    .line 14
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 18
    .line 19
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->d:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 23
    .line 24
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->a:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 28
    .line 29
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 33
    .line 34
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->g:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 38
    .line 39
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->e:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->f:Lcom/zykj/view/databinding/ViewIncludePenBinding;

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->d:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->a:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    return v1

    .line 70
    :cond_6
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->g:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_7

    .line 77
    .line 78
    return v1

    .line 79
    :cond_7
    const/4 v0, 0x0

    .line 80
    return v0

    .line 81
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x80

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->o:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->e:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->f:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->d:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->a:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->g:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw v0
.end method

.method public onFieldChange(ILjava/lang/Object;I)Z
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return p1

    .line 6
    :pswitch_0
    check-cast p2, Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 7
    .line 8
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->x(Lcom/zykj/view/databinding/ViewIncludePenBinding;I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :pswitch_1
    check-cast p2, Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 14
    .line 15
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->u(Lcom/zykj/view/databinding/ViewIncludeEraserBinding;I)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :pswitch_2
    check-cast p2, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 21
    .line 22
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->w(Lcom/zykj/view/databinding/ViewIncludeMenuBinding;I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :pswitch_3
    check-cast p2, Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 28
    .line 29
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->k(Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :pswitch_4
    check-cast p2, Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 35
    .line 36
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->t(Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :pswitch_5
    check-cast p2, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 42
    .line 43
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->y(Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :pswitch_6
    check-cast p2, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 49
    .line 50
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentSimpleBindingImpl;->v(Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;I)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->e:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->f:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->d:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->a:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->g:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
