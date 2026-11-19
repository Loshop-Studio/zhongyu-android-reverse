.class public Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;
.super Lcom/zykj/view/databinding/ViewFragmentBoardBinding;
.source "SourceFile"


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private mDirtyFlags:J

.field private final mboundView0:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

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
    const/16 v2, 0xa

    .line 21
    .line 22
    const/16 v3, 0xb

    .line 23
    .line 24
    const/4 v4, 0x4

    .line 25
    filled-new-array {v4, v2, v3}, [I

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sget v3, Lcom/zykj/view/R$layout;->view_include_menu:I

    .line 30
    .line 31
    sget v4, Lcom/zykj/view/R$layout;->view_item_sketch_record:I

    .line 32
    .line 33
    sget v5, Lcom/zykj/view/R$layout;->view_item_sketch_record_audio:I

    .line 34
    .line 35
    filled-new-array {v3, v4, v5}, [I

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 41
    .line 42
    .line 43
    const-string v1, "view_include_background_color"

    .line 44
    .line 45
    const-string v2, "view_include_select_type"

    .line 46
    .line 47
    const-string v3, "view_include_pen"

    .line 48
    .line 49
    const-string v4, "view_include_eraser"

    .line 50
    .line 51
    const-string v5, "view_include_image_add"

    .line 52
    .line 53
    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const/16 v2, 0x8

    .line 58
    .line 59
    const/16 v3, 0x9

    .line 60
    .line 61
    const/4 v4, 0x5

    .line 62
    const/4 v5, 0x6

    .line 63
    const/4 v6, 0x7

    .line 64
    filled-new-array {v4, v5, v6, v2, v3}, [I

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    sget v3, Lcom/zykj/view/R$layout;->view_include_pen:I

    .line 69
    .line 70
    sget v4, Lcom/zykj/view/R$layout;->view_include_eraser:I

    .line 71
    .line 72
    sget v5, Lcom/zykj/view/R$layout;->view_include_image_add:I

    .line 73
    .line 74
    sget v6, Lcom/zykj/view/R$layout;->view_include_background_color:I

    .line 75
    .line 76
    sget v7, Lcom/zykj/view/R$layout;->view_include_select_type:I

    .line 77
    .line 78
    filled-new-array {v3, v4, v5, v6, v7}, [I

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const/4 v4, 0x2

    .line 83
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 84
    .line 85
    .line 86
    new-instance v0, Landroid/util/SparseIntArray;

    .line 87
    .line 88
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 89
    .line 90
    .line 91
    sput-object v0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 92
    .line 93
    sget v1, Lcom/zykj/view/R$id;->fl_sketch_board_touch:I

    .line 94
    .line 95
    const/16 v2, 0xc

    .line 96
    .line 97
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 98
    .line 99
    .line 100
    sget v1, Lcom/zykj/view/R$id;->sketch_view:I

    .line 101
    .line 102
    const/16 v2, 0xd

    .line 103
    .line 104
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 105
    .line 106
    .line 107
    sget v1, Lcom/zykj/view/R$id;->iv_back:I

    .line 108
    .line 109
    const/16 v2, 0xe

    .line 110
    .line 111
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 112
    .line 113
    .line 114
    sget v1, Lcom/zykj/view/R$id;->iv_expansion:I

    .line 115
    .line 116
    const/16 v2, 0xf

    .line 117
    .line 118
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 119
    .line 120
    .line 121
    sget v1, Lcom/zykj/view/R$id;->sketch_progress_vertical:I

    .line 122
    .line 123
    const/16 v2, 0x10

    .line 124
    .line 125
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 126
    .line 127
    .line 128
    sget v1, Lcom/zykj/view/R$id;->sketch_progress_horizontal:I

    .line 129
    .line 130
    const/16 v2, 0x11

    .line 131
    .line 132
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 133
    .line 134
    .line 135
    sget v1, Lcom/zykj/view/R$id;->loadingLayout:I

    .line 136
    .line 137
    const/16 v2, 0x12

    .line 138
    .line 139
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 140
    .line 141
    .line 142
    sget v1, Lcom/zykj/view/R$id;->tvLoadingTips:I

    .line 143
    .line 144
    const/16 v2, 0x13

    .line 145
    .line 146
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3
    .param p1    # Landroidx/databinding/DataBindingComponent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x14

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 23

    const/4 v0, 0x1

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/zykj/view/widget/SketchBoardTouchFrameLayout;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Lcom/zykj/view/databinding/ViewIncludePenBinding;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v15, v0

    check-cast v15, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v0, 0x12

    aget-object v0, p3, v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/widget/FrameLayout;

    const/16 v0, 0x11

    aget-object v0, p3, v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/zykj/view/widget/SketchProgressView;

    const/16 v0, 0x10

    aget-object v0, p3, v0

    move-object/from16 v19, v0

    check-cast v19, Lcom/zykj/view/widget/SketchProgressView;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object/from16 v21, v0

    check-cast v21, Landroid/widget/FrameLayout;

    const/16 v0, 0x13

    aget-object v0, p3, v0

    move-object/from16 v22, v0

    check-cast v22, Landroid/widget/TextView;

    const/16 v3, 0x8

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v22}, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/view/widget/customColor/CustomColorFrameLayout;Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;Lcom/zykj/view/widget/SketchBoardTouchFrameLayout;Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Lcom/zykj/view/databinding/ViewIncludeEraserBinding;Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;Lcom/zykj/view/databinding/ViewIncludeMenuBinding;Lcom/zykj/view/databinding/ViewIncludePenBinding;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/FrameLayout;Lcom/zykj/view/widget/SketchProgressView;Lcom/zykj/view/widget/SketchProgressView;Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Landroid/widget/FrameLayout;Landroid/widget/TextView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flBoardCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 6
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeBackground:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 7
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeCommit:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 8
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeEraser:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 9
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeGraph:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 10
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeMenu:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 11
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includePen:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 12
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeRecord:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 13
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeSelect:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 v1, 0x0

    .line 14
    aget-object v1, p3, v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mboundView0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 15
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->toolPanel:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 17
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 18
    invoke-virtual {v0}, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeIncludeBackground(Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;I)Z
    .locals 2

    .line 1
    sget p1, Lcom/zykj/view/BR;->_all:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    const-wide/16 v0, 0x8

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

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

.method private onChangeIncludeCommit(Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;I)Z
    .locals 2

    .line 1
    sget p1, Lcom/zykj/view/BR;->_all:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    const-wide/16 v0, 0x4

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

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

.method private onChangeIncludeEraser(Lcom/zykj/view/databinding/ViewIncludeEraserBinding;I)Z
    .locals 2

    .line 1
    sget p1, Lcom/zykj/view/BR;->_all:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    const-wide/16 v0, 0x40

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

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

.method private onChangeIncludeGraph(Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;I)Z
    .locals 2

    .line 1
    sget p1, Lcom/zykj/view/BR;->_all:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

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

.method private onChangeIncludeMenu(Lcom/zykj/view/databinding/ViewIncludeMenuBinding;I)Z
    .locals 2

    .line 1
    sget p1, Lcom/zykj/view/BR;->_all:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    const-wide/16 v0, 0x20

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

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

.method private onChangeIncludePen(Lcom/zykj/view/databinding/ViewIncludePenBinding;I)Z
    .locals 2

    .line 1
    sget p1, Lcom/zykj/view/BR;->_all:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    const-wide/16 v0, 0x80

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

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

.method private onChangeIncludeRecord(Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;I)Z
    .locals 2

    .line 1
    sget p1, Lcom/zykj/view/BR;->_all:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    const-wide/16 v0, 0x2

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

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

.method private onChangeIncludeSelect(Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;I)Z
    .locals 2

    .line 1
    sget p1, Lcom/zykj/view/BR;->_all:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    const-wide/16 v0, 0x10

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

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
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    const-wide/16 v4, 0x100

    .line 10
    .line 11
    and-long/2addr v0, v4

    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flBoardCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 17
    .line 18
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/zykj/view/utils/ExtKt;->setLight(Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;Ljava/lang/Boolean;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 24
    .line 25
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lcom/zykj/view/utils/ExtKt;->setLight(Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;Ljava/lang/Boolean;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeMenu:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 31
    .line 32
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includePen:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 36
    .line 37
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeEraser:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 41
    .line 42
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeGraph:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 46
    .line 47
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeBackground:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 51
    .line 52
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeSelect:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    .line 56
    .line 57
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeCommit:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 61
    .line 62
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeRecord:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 66
    .line 67
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeMenu:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includePen:Lcom/zykj/view/databinding/ViewIncludePenBinding;

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeEraser:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeGraph:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeBackground:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeSelect:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeCommit:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeRecord:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_8

    .line 86
    .line 87
    return v1

    .line 88
    :cond_8
    const/4 v0, 0x0

    .line 89
    return v0

    .line 90
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x100

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeMenu:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includePen:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeEraser:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeGraph:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeBackground:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeSelect:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeCommit:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeRecord:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
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
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->onChangeIncludePen(Lcom/zykj/view/databinding/ViewIncludePenBinding;I)Z

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
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->onChangeIncludeEraser(Lcom/zykj/view/databinding/ViewIncludeEraserBinding;I)Z

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
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->onChangeIncludeMenu(Lcom/zykj/view/databinding/ViewIncludeMenuBinding;I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :pswitch_3
    check-cast p2, Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    .line 28
    .line 29
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->onChangeIncludeSelect(Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :pswitch_4
    check-cast p2, Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 35
    .line 36
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->onChangeIncludeBackground(Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :pswitch_5
    check-cast p2, Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 42
    .line 43
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->onChangeIncludeCommit(Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :pswitch_6
    check-cast p2, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 49
    .line 50
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->onChangeIncludeRecord(Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;I)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :pswitch_7
    check-cast p2, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 56
    .line 57
    invoke-direct {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentBoardBindingImpl;->onChangeIncludeGraph(Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;I)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    return p1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
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
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeMenu:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includePen:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeEraser:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeGraph:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeBackground:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeSelect:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeCommit:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeRecord:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 p1, 0x1

    return p1
.end method
