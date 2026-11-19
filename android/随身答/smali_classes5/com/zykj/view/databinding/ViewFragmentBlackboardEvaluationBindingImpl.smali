.class public Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;
.super Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;
.source "SourceFile"


# static fields
.field public static final y:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final z:Landroid/util/SparseIntArray;


# instance fields
.field public x:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->y:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 9
    .line 10
    const-string v1, "view_include_evaluation_pen"

    .line 11
    .line 12
    filled-new-array {v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x2

    .line 17
    filled-new-array {v2}, [I

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget v3, Lcom/zykj/view/R$layout;->view_include_evaluation_pen:I

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
    const-string v1, "view_include_evaluation_pen_proxy"

    .line 32
    .line 33
    filled-new-array {v1}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v2, 0x3

    .line 38
    filled-new-array {v2}, [I

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    sget v3, Lcom/zykj/view/R$layout;->view_include_evaluation_pen_proxy:I

    .line 43
    .line 44
    filled-new-array {v3}, [I

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const/4 v4, 0x1

    .line 49
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Landroid/util/SparseIntArray;

    .line 53
    .line 54
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->z:Landroid/util/SparseIntArray;

    .line 58
    .line 59
    sget v1, Lcom/zykj/view/R$id;->view_top:I

    .line 60
    .line 61
    const/4 v2, 0x4

    .line 62
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 63
    .line 64
    .line 65
    sget v1, Lcom/zykj/view/R$id;->sketch_view:I

    .line 66
    .line 67
    const/4 v2, 0x5

    .line 68
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 69
    .line 70
    .line 71
    sget v1, Lcom/zykj/view/R$id;->ll_evaluation_tools:I

    .line 72
    .line 73
    const/4 v2, 0x6

    .line 74
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 75
    .line 76
    .line 77
    sget v1, Lcom/zykj/view/R$id;->iv_withdraw:I

    .line 78
    .line 79
    const/4 v2, 0x7

    .line 80
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 81
    .line 82
    .line 83
    sget v1, Lcom/zykj/view/R$id;->iv_recover:I

    .line 84
    .line 85
    const/16 v2, 0x8

    .line 86
    .line 87
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 88
    .line 89
    .line 90
    sget v1, Lcom/zykj/view/R$id;->iv_select:I

    .line 91
    .line 92
    const/16 v2, 0x9

    .line 93
    .line 94
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 95
    .line 96
    .line 97
    sget v1, Lcom/zykj/view/R$id;->iv_touch:I

    .line 98
    .line 99
    const/16 v2, 0xa

    .line 100
    .line 101
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 102
    .line 103
    .line 104
    sget v1, Lcom/zykj/view/R$id;->iv_pen:I

    .line 105
    .line 106
    const/16 v2, 0xb

    .line 107
    .line 108
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 109
    .line 110
    .line 111
    sget v1, Lcom/zykj/view/R$id;->iv_line:I

    .line 112
    .line 113
    const/16 v2, 0xc

    .line 114
    .line 115
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 116
    .line 117
    .line 118
    sget v1, Lcom/zykj/view/R$id;->iv_dotted_line:I

    .line 119
    .line 120
    const/16 v2, 0xd

    .line 121
    .line 122
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 123
    .line 124
    .line 125
    sget v1, Lcom/zykj/view/R$id;->iv_eraser:I

    .line 126
    .line 127
    const/16 v2, 0xe

    .line 128
    .line 129
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 130
    .line 131
    .line 132
    sget v1, Lcom/zykj/view/R$id;->iv_camera:I

    .line 133
    .line 134
    const/16 v2, 0xf

    .line 135
    .line 136
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 137
    .line 138
    .line 139
    sget v1, Lcom/zykj/view/R$id;->iv_question:I

    .line 140
    .line 141
    const/16 v2, 0x10

    .line 142
    .line 143
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 144
    .line 145
    .line 146
    sget v1, Lcom/zykj/view/R$id;->iv_answer:I

    .line 147
    .line 148
    const/16 v2, 0x11

    .line 149
    .line 150
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 151
    .line 152
    .line 153
    sget v1, Lcom/zykj/view/R$id;->iv_text:I

    .line 154
    .line 155
    const/16 v2, 0x12

    .line 156
    .line 157
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 158
    .line 159
    .line 160
    sget v1, Lcom/zykj/view/R$id;->iv_delete:I

    .line 161
    .line 162
    const/16 v2, 0x13

    .line 163
    .line 164
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 165
    .line 166
    .line 167
    sget v1, Lcom/zykj/view/R$id;->iv_drag:I

    .line 168
    .line 169
    const/16 v2, 0x14

    .line 170
    .line 171
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 172
    .line 173
    .line 174
    sget v1, Lcom/zykj/view/R$id;->iv_eva_submit:I

    .line 175
    .line 176
    const/16 v2, 0x15

    .line 177
    .line 178
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 179
    .line 180
    .line 181
    sget v1, Lcom/zykj/view/R$id;->tv_hint:I

    .line 182
    .line 183
    const/16 v2, 0x16

    .line 184
    .line 185
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->y:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->z:Landroid/util/SparseIntArray;

    const/16 v2, 0x17

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 27

    const/4 v0, 0x1

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroid/widget/FrameLayout;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    const/16 v0, 0x11

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    const/16 v0, 0x13

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ImageView;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/ImageView;

    const/16 v0, 0x14

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/ImageView;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/ImageView;

    const/16 v0, 0x15

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/ImageView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Landroid/widget/ImageView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v15, v0

    check-cast v15, Landroid/widget/ImageView;

    const/16 v0, 0x10

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/widget/ImageView;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/widget/ImageView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object/from16 v18, v0

    check-cast v18, Landroid/widget/ImageView;

    const/16 v0, 0x12

    aget-object v0, p3, v0

    move-object/from16 v19, v0

    check-cast v19, Landroid/widget/ImageView;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object/from16 v20, v0

    check-cast v20, Landroid/widget/ImageView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object/from16 v21, v0

    check-cast v21, Landroid/widget/ImageView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object/from16 v22, v0

    check-cast v22, Landroid/widget/LinearLayout;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object/from16 v23, v0

    check-cast v23, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    const/16 v0, 0x16

    aget-object v0, p3, v0

    move-object/from16 v24, v0

    check-cast v24, Landroid/widget/TextView;

    const/4 v0, 0x0

    aget-object v0, p3, v0

    move-object/from16 v25, v0

    check-cast v25, Lcom/zykj/view/widget/TouchSwitchView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object/from16 v26, v0

    check-cast v26, Landroid/view/View;

    const/4 v3, 0x2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v26}, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/FrameLayout;Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Landroid/widget/TextView;Lcom/zykj/view/widget/TouchSwitchView;Landroid/view/View;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->x:J

    .line 4
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->a:Landroid/widget/FrameLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->b:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 6
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 7
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->v:Lcom/zykj/view/widget/TouchSwitchView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 8
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 9
    invoke-virtual {v0}, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->invalidateAll()V

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
    iput-wide v0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->x:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->b:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    .line 13
    .line 14
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->x:J

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->b:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

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
    const/4 v0, 0x0

    .line 35
    return v0

    .line 36
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
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
    iput-wide v0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->x:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->b:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v0
.end method

.method public final k(Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;I)Z
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
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->x:J

    .line 7
    .line 8
    const-wide/16 v0, 0x2

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->x:J

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
    check-cast p2, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    .line 9
    .line 10
    invoke-virtual {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->k(Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_1
    check-cast p2, Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 16
    .line 17
    invoke-virtual {p0, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->t(Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;I)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->b:Lcom/zykj/view/databinding/ViewIncludeEvaluationPenProxyBinding;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final t(Lcom/zykj/view/databinding/ViewIncludeEvaluationPenBinding;I)Z
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
    iget-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->x:J

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBindingImpl;->x:J

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
