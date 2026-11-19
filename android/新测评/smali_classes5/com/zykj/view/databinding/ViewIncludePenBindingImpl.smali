.class public Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;
.super Lcom/zykj/view/databinding/ViewIncludePenBinding;
.source "SourceFile"


# static fields
.field public static final t:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final u:Landroid/util/SparseIntArray;


# instance fields
.field public final o:Landroidx/appcompat/widget/LinearLayoutCompat;

.field public final p:Lcom/zykj/view/widget/radio/NormalColorRadioButton;

.field public final q:Lcom/zykj/view/widget/radio/NormalColorRadioButton;

.field public final r:Lcom/zykj/view/widget/radio/NormalColorRadioButton;

.field public s:J


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
    sput-object v0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->u:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    sget v1, Lcom/zykj/view/R$id;->rg_pen_type:I

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 12
    .line 13
    .line 14
    sget v1, Lcom/zykj/view/R$id;->rb_pen_custom:I

    .line 15
    .line 16
    const/4 v2, 0x5

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 18
    .line 19
    .line 20
    sget v1, Lcom/zykj/view/R$id;->rb_pen_line:I

    .line 21
    .line 22
    const/4 v2, 0x6

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 24
    .line 25
    .line 26
    sget v1, Lcom/zykj/view/R$id;->rb_pen_dotted_line:I

    .line 27
    .line 28
    const/4 v2, 0x7

    .line 29
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 30
    .line 31
    .line 32
    sget v1, Lcom/zykj/view/R$id;->rb_pen_highlighter:I

    .line 33
    .line 34
    const/16 v2, 0x8

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 37
    .line 38
    .line 39
    sget v1, Lcom/zykj/view/R$id;->rb_pen_cursor:I

    .line 40
    .line 41
    const/16 v2, 0x9

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 44
    .line 45
    .line 46
    sget v1, Lcom/zykj/view/R$id;->view_line:I

    .line 47
    .line 48
    const/16 v2, 0xa

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 51
    .line 52
    .line 53
    sget v1, Lcom/zykj/view/R$id;->rg_pen_size:I

    .line 54
    .line 55
    const/16 v2, 0xb

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 58
    .line 59
    .line 60
    sget v1, Lcom/zykj/view/R$id;->rb_pen_size_little:I

    .line 61
    .line 62
    const/16 v2, 0xc

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 65
    .line 66
    .line 67
    sget v1, Lcom/zykj/view/R$id;->rb_pen_size_medium:I

    .line 68
    .line 69
    const/16 v2, 0xd

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 72
    .line 73
    .line 74
    sget v1, Lcom/zykj/view/R$id;->rb_pen_size_big:I

    .line 75
    .line 76
    const/16 v2, 0xe

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 79
    .line 80
    .line 81
    sget v1, Lcom/zykj/view/R$id;->view_line_2:I

    .line 82
    .line 83
    const/16 v2, 0xf

    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 86
    .line 87
    .line 88
    sget v1, Lcom/zykj/view/R$id;->rg_pen_color:I

    .line 89
    .line 90
    const/16 v2, 0x10

    .line 91
    .line 92
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 93
    .line 94
    .line 95
    sget v1, Lcom/zykj/view/R$id;->rb_custom_color:I

    .line 96
    .line 97
    const/16 v2, 0x11

    .line 98
    .line 99
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->t:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->u:Landroid/util/SparseIntArray;

    const/16 v2, 0x12

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 18

    const/16 v0, 0x11

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Lcom/zykj/view/widget/radio/CustomColorRadioButton;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RadioButton;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RadioButton;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/RadioButton;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/RadioButton;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/RadioButton;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/RadioButton;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/RadioButton;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/RadioButton;

    const/16 v0, 0x10

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/RadioGroup;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Landroid/widget/RadioGroup;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v15, v0

    check-cast v15, Landroid/widget/RadioGroup;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/view/View;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/view/View;

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v17}, Lcom/zykj/view/databinding/ViewIncludePenBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/view/widget/radio/CustomColorRadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;Landroid/view/View;Landroid/view/View;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->s:J

    const/4 v1, 0x0

    .line 4
    aget-object v1, p3, v1

    check-cast v1, Landroidx/appcompat/widget/LinearLayoutCompat;

    iput-object v1, v0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->o:Landroidx/appcompat/widget/LinearLayoutCompat;

    const/4 v2, 0x0

    .line 5
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 6
    aget-object v1, p3, v1

    check-cast v1, Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    iput-object v1, v0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->p:Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 7
    const-string v2, "#000000"

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x2

    .line 8
    aget-object v1, p3, v1

    check-cast v1, Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    iput-object v1, v0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->q:Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 9
    const-string v2, "#EEEEEE"

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x3

    .line 10
    aget-object v1, p3, v1

    check-cast v1, Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    iput-object v1, v0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->r:Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 11
    const-string v2, "#FF4931"

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 12
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 13
    invoke-virtual {v0}, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public executeBindings()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->s:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->s:J

    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    const-wide/16 v4, 0x1

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
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->p:Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 17
    .line 18
    const-string v1, "#000000"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lb8/c;->b(Lcom/zykj/view/widget/radio/CustomColorRadioButton;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->q:Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 24
    .line 25
    const-string v1, "#EEEEEE"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lb8/c;->b(Lcom/zykj/view/widget/radio/CustomColorRadioButton;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->r:Lcom/zykj/view/widget/radio/NormalColorRadioButton;

    .line 31
    .line 32
    const-string v1, "#FF4931"

    .line 33
    .line 34
    invoke-static {v0, v1}, Lb8/c;->b(Lcom/zykj/view/widget/radio/CustomColorRadioButton;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->s:J

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
    const-wide/16 v0, 0x1

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/view/databinding/ViewIncludePenBindingImpl;->s:J

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
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
