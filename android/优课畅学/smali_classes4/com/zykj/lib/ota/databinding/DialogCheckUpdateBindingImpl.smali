.class public Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;
.super Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$d;,
        Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$a;,
        Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$b;,
        Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$c;
    }
.end annotation


# static fields
.field public static final v:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final w:Landroid/util/SparseIntArray;


# instance fields
.field public final o:Landroid/widget/FrameLayout;

.field public final p:Landroid/widget/TextView;

.field public q:Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$d;

.field public r:Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$a;

.field public s:Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$b;

.field public t:Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$c;

.field public u:J


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
    sput-object v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->w:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    sget v1, Lcom/zykj/lib/ota/R$id;->imageView:I

    .line 9
    .line 10
    const/16 v2, 0xb

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 13
    .line 14
    .line 15
    sget v1, Lcom/zykj/lib/ota/R$id;->textView:I

    .line 16
    .line 17
    const/16 v2, 0xc

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 20
    .line 21
    .line 22
    sget v1, Lcom/zykj/lib/ota/R$id;->nestedScrollView:I

    .line 23
    .line 24
    const/16 v2, 0xd

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 27
    .line 28
    .line 29
    sget v1, Lcom/zykj/lib/ota/R$id;->ll_button:I

    .line 30
    .line 31
    const/16 v2, 0xe

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->v:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->w:Landroid/util/SparseIntArray;

    const/16 v2, 0xf

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 17

    const/16 v0, 0xb

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroidx/core/widget/NestedScrollView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    const/4 v0, 0x7

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

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/widget/TextView;

    const/4 v3, 0x4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v16}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/LinearLayout;Landroidx/core/widget/NestedScrollView;Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

    const/4 v1, 0x0

    .line 4
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/FrameLayout;

    iput-object v1, v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->o:Landroid/widget/FrameLayout;

    const/4 v2, 0x0

    .line 5
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x2

    .line 6
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->p:Landroid/widget/TextView;

    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object v1, v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->d:Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    iget-object v1, v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->f:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object v1, v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    iget-object v1, v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 12
    iget-object v1, v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->i:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 13
    iget-object v1, v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->j:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object v1, v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->k:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    iget-object v1, v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->l:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    iget-object v1, v0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->m:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 17
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 18
    invoke-virtual {v0}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/lib/ota/viewmodel/VersionViewModel;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->n:Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

    .line 5
    .line 6
    const-wide/16 v2, 0x10

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    sget p1, Ls3/a;->d:I

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method

.method public final b(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2

    .line 1
    sget p1, Ls3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

    .line 7
    .line 8
    const-wide/16 v0, 0x8

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

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

.method public final d(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2

    .line 1
    sget p1, Ls3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

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
    .locals 45

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->n:Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 12
    .line 13
    const-wide/16 v6, 0x3f

    .line 14
    .line 15
    and-long/2addr v6, v2

    .line 16
    cmp-long v6, v6, v4

    .line 17
    .line 18
    const-wide/32 v15, 0x8200

    .line 19
    .line 20
    .line 21
    move-wide/from16 v17, v4

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    const-wide/16 v19, 0x2000

    .line 25
    .line 26
    const-wide/16 v21, 0x35

    .line 27
    .line 28
    const-wide/16 v23, 0x30

    .line 29
    .line 30
    const-wide/16 v25, 0x36

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    const/16 v27, 0x0

    .line 34
    .line 35
    const-wide/16 v28, 0x38

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    if-eqz v6, :cond_1d

    .line 39
    .line 40
    and-long v30, v2, v23

    .line 41
    .line 42
    cmp-long v6, v30, v17

    .line 43
    .line 44
    if-eqz v6, :cond_4

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    iget-object v6, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->q:Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$d;

    .line 49
    .line 50
    if-nez v6, :cond_0

    .line 51
    .line 52
    new-instance v6, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$d;

    .line 53
    .line 54
    invoke-direct {v6}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$d;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v6, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->q:Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$d;

    .line 58
    .line 59
    :cond_0
    invoke-virtual {v6, v0}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$d;->b(Lcom/zykj/lib/ota/viewmodel/VersionViewModel;)Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$d;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    iget-object v8, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->r:Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$a;

    .line 64
    .line 65
    if-nez v8, :cond_1

    .line 66
    .line 67
    new-instance v8, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$a;

    .line 68
    .line 69
    invoke-direct {v8}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$a;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v8, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->r:Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$a;

    .line 73
    .line 74
    :cond_1
    invoke-virtual {v8, v0}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$a;->b(Lcom/zykj/lib/ota/viewmodel/VersionViewModel;)Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$a;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    const-wide/16 v30, 0x32

    .line 79
    .line 80
    iget-object v9, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->s:Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$b;

    .line 81
    .line 82
    if-nez v9, :cond_2

    .line 83
    .line 84
    new-instance v9, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$b;

    .line 85
    .line 86
    invoke-direct {v9}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$b;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v9, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->s:Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$b;

    .line 90
    .line 91
    :cond_2
    invoke-virtual {v9, v0}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$b;->b(Lcom/zykj/lib/ota/viewmodel/VersionViewModel;)Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$b;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    iget-object v10, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->t:Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$c;

    .line 96
    .line 97
    if-nez v10, :cond_3

    .line 98
    .line 99
    new-instance v10, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$c;

    .line 100
    .line 101
    invoke-direct {v10}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$c;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v10, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->t:Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$c;

    .line 105
    .line 106
    :cond_3
    invoke-virtual {v10, v0}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$c;->b(Lcom/zykj/lib/ota/viewmodel/VersionViewModel;)Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$c;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    goto :goto_0

    .line 111
    :cond_4
    const-wide/16 v30, 0x32

    .line 112
    .line 113
    move-object/from16 v6, v27

    .line 114
    .line 115
    move-object v8, v6

    .line 116
    move-object v9, v8

    .line 117
    move-object v10, v9

    .line 118
    :goto_0
    and-long v32, v2, v21

    .line 119
    .line 120
    cmp-long v32, v32, v17

    .line 121
    .line 122
    if-eqz v32, :cond_9

    .line 123
    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    invoke-virtual {v0}, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 127
    .line 128
    .line 129
    move-result-object v33

    .line 130
    move-object/from16 v11, v33

    .line 131
    .line 132
    :goto_1
    const-wide/16 v33, 0x34

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    move-object/from16 v11, v27

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :goto_2
    invoke-virtual {v1, v7, v11}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 139
    .line 140
    .line 141
    if-eqz v11, :cond_6

    .line 142
    .line 143
    invoke-virtual {v11}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    check-cast v11, Ljava/lang/Boolean;

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    move-object/from16 v11, v27

    .line 151
    .line 152
    :goto_3
    invoke-static {v11}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    if-ne v11, v5, :cond_7

    .line 157
    .line 158
    move v11, v5

    .line 159
    goto :goto_4

    .line 160
    :cond_7
    move v11, v7

    .line 161
    :goto_4
    if-eqz v32, :cond_a

    .line 162
    .line 163
    if-eqz v11, :cond_8

    .line 164
    .line 165
    or-long v2, v2, v19

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_8
    const-wide/16 v35, 0x1000

    .line 169
    .line 170
    or-long v2, v2, v35

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_9
    const-wide/16 v33, 0x34

    .line 174
    .line 175
    move v11, v7

    .line 176
    :cond_a
    :goto_5
    and-long v35, v2, v25

    .line 177
    .line 178
    cmp-long v12, v35, v17

    .line 179
    .line 180
    if-eqz v12, :cond_19

    .line 181
    .line 182
    if-eqz v0, :cond_b

    .line 183
    .line 184
    invoke-virtual {v0}, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;->i()Landroidx/lifecycle/MutableLiveData;

    .line 185
    .line 186
    .line 187
    move-result-object v32

    .line 188
    invoke-virtual {v0}, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 189
    .line 190
    .line 191
    move-result-object v35

    .line 192
    move-object/from16 v7, v32

    .line 193
    .line 194
    move-object/from16 v13, v35

    .line 195
    .line 196
    :goto_6
    const-wide/16 v35, 0x4100

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_b
    move-object/from16 v7, v27

    .line 200
    .line 201
    move-object v13, v7

    .line 202
    goto :goto_6

    .line 203
    :goto_7
    invoke-virtual {v1, v5, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v4, v13}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 207
    .line 208
    .line 209
    if-eqz v7, :cond_c

    .line 210
    .line 211
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    check-cast v7, Lcom/zykj/lib/ota/bean/VersionInfo;

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_c
    move-object/from16 v7, v27

    .line 219
    .line 220
    :goto_8
    if-eqz v13, :cond_d

    .line 221
    .line 222
    invoke-virtual {v13}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v14

    .line 226
    check-cast v14, Ljava/lang/Boolean;

    .line 227
    .line 228
    goto :goto_9

    .line 229
    :cond_d
    move-object/from16 v14, v27

    .line 230
    .line 231
    :goto_9
    if-eqz v7, :cond_e

    .line 232
    .line 233
    invoke-virtual {v7}, Lcom/zykj/lib/ota/bean/VersionInfo;->getForceUpdate()Z

    .line 234
    .line 235
    .line 236
    move-result v37

    .line 237
    goto :goto_a

    .line 238
    :cond_e
    const/16 v37, 0x0

    .line 239
    .line 240
    :goto_a
    if-eqz v12, :cond_10

    .line 241
    .line 242
    if-eqz v37, :cond_f

    .line 243
    .line 244
    const-wide/16 v38, 0x80

    .line 245
    .line 246
    :goto_b
    or-long v2, v2, v38

    .line 247
    .line 248
    goto :goto_c

    .line 249
    :cond_f
    const-wide/16 v38, 0x40

    .line 250
    .line 251
    goto :goto_b

    .line 252
    :cond_10
    :goto_c
    invoke-static {v14}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 253
    .line 254
    .line 255
    move-result v12

    .line 256
    xor-int/lit8 v38, v37, 0x1

    .line 257
    .line 258
    if-ne v12, v5, :cond_11

    .line 259
    .line 260
    move/from16 v39, v5

    .line 261
    .line 262
    goto :goto_d

    .line 263
    :cond_11
    const/16 v39, 0x0

    .line 264
    .line 265
    :goto_d
    and-long v40, v2, v25

    .line 266
    .line 267
    cmp-long v40, v40, v17

    .line 268
    .line 269
    if-eqz v40, :cond_13

    .line 270
    .line 271
    if-nez v37, :cond_12

    .line 272
    .line 273
    const-wide/16 v40, 0x800

    .line 274
    .line 275
    :goto_e
    or-long v2, v2, v40

    .line 276
    .line 277
    goto :goto_f

    .line 278
    :cond_12
    const-wide/16 v40, 0x400

    .line 279
    .line 280
    goto :goto_e

    .line 281
    :cond_13
    :goto_f
    and-long v40, v2, v25

    .line 282
    .line 283
    cmp-long v40, v40, v17

    .line 284
    .line 285
    if-eqz v40, :cond_15

    .line 286
    .line 287
    if-eqz v39, :cond_14

    .line 288
    .line 289
    or-long/2addr v2, v15

    .line 290
    goto :goto_10

    .line 291
    :cond_14
    or-long v2, v2, v35

    .line 292
    .line 293
    :cond_15
    :goto_10
    and-long v40, v2, v33

    .line 294
    .line 295
    cmp-long v40, v40, v17

    .line 296
    .line 297
    if-eqz v40, :cond_16

    .line 298
    .line 299
    xor-int/2addr v12, v5

    .line 300
    goto :goto_11

    .line 301
    :cond_16
    const/4 v12, 0x0

    .line 302
    :goto_11
    and-long v40, v2, v30

    .line 303
    .line 304
    cmp-long v40, v40, v17

    .line 305
    .line 306
    if-eqz v40, :cond_18

    .line 307
    .line 308
    if-eqz v7, :cond_17

    .line 309
    .line 310
    invoke-virtual {v7}, Lcom/zykj/lib/ota/bean/VersionInfo;->getDescription()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v40

    .line 314
    invoke-virtual {v7}, Lcom/zykj/lib/ota/bean/VersionInfo;->getVersionName()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    :goto_12
    move-wide/from16 v41, v15

    .line 319
    .line 320
    goto :goto_13

    .line 321
    :cond_17
    move-object/from16 v7, v27

    .line 322
    .line 323
    move-object/from16 v40, v7

    .line 324
    .line 325
    goto :goto_12

    .line 326
    :goto_13
    iget-object v15, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->f:Landroid/widget/TextView;

    .line 327
    .line 328
    invoke-virtual {v15}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 329
    .line 330
    .line 331
    move-result-object v15

    .line 332
    sget v5, Lcom/zykj/lib/ota/R$string;->versionName:I

    .line 333
    .line 334
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    invoke-virtual {v15, v5, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    goto :goto_14

    .line 343
    :cond_18
    move-wide/from16 v41, v15

    .line 344
    .line 345
    move-object/from16 v5, v27

    .line 346
    .line 347
    move-object/from16 v40, v5

    .line 348
    .line 349
    goto :goto_14

    .line 350
    :cond_19
    move-wide/from16 v41, v15

    .line 351
    .line 352
    const-wide/16 v35, 0x4100

    .line 353
    .line 354
    move-object/from16 v5, v27

    .line 355
    .line 356
    move-object v13, v5

    .line 357
    move-object v14, v13

    .line 358
    move-object/from16 v40, v14

    .line 359
    .line 360
    const/4 v12, 0x0

    .line 361
    const/16 v37, 0x0

    .line 362
    .line 363
    const/16 v38, 0x0

    .line 364
    .line 365
    const/16 v39, 0x0

    .line 366
    .line 367
    :goto_14
    and-long v43, v2, v28

    .line 368
    .line 369
    cmp-long v7, v43, v17

    .line 370
    .line 371
    if-eqz v7, :cond_1c

    .line 372
    .line 373
    if-eqz v0, :cond_1a

    .line 374
    .line 375
    invoke-virtual {v0}, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    goto :goto_15

    .line 380
    :cond_1a
    move-object/from16 v7, v27

    .line 381
    .line 382
    :goto_15
    const/4 v15, 0x3

    .line 383
    invoke-virtual {v1, v15, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 384
    .line 385
    .line 386
    if-eqz v7, :cond_1b

    .line 387
    .line 388
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v7

    .line 392
    move-object/from16 v27, v7

    .line 393
    .line 394
    check-cast v27, Ljava/lang/Integer;

    .line 395
    .line 396
    :cond_1b
    move-object/from16 v7, v27

    .line 397
    .line 398
    new-instance v15, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    const-string v7, "%"

    .line 407
    .line 408
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v27

    .line 415
    :cond_1c
    move-object/from16 v7, v27

    .line 416
    .line 417
    move-object/from16 v27, v13

    .line 418
    .line 419
    move-object/from16 v13, v40

    .line 420
    .line 421
    goto :goto_16

    .line 422
    :cond_1d
    move-wide/from16 v41, v15

    .line 423
    .line 424
    const-wide/16 v30, 0x32

    .line 425
    .line 426
    const-wide/16 v33, 0x34

    .line 427
    .line 428
    const-wide/16 v35, 0x4100

    .line 429
    .line 430
    move-object/from16 v5, v27

    .line 431
    .line 432
    move-object v6, v5

    .line 433
    move-object v7, v6

    .line 434
    move-object v8, v7

    .line 435
    move-object v9, v8

    .line 436
    move-object v10, v9

    .line 437
    move-object v13, v10

    .line 438
    move-object v14, v13

    .line 439
    const/4 v11, 0x0

    .line 440
    const/4 v12, 0x0

    .line 441
    const/16 v37, 0x0

    .line 442
    .line 443
    const/16 v38, 0x0

    .line 444
    .line 445
    const/16 v39, 0x0

    .line 446
    .line 447
    :goto_16
    const-wide/16 v43, 0x2880

    .line 448
    .line 449
    and-long v43, v2, v43

    .line 450
    .line 451
    cmp-long v15, v43, v17

    .line 452
    .line 453
    if-eqz v15, :cond_24

    .line 454
    .line 455
    if-eqz v0, :cond_1e

    .line 456
    .line 457
    invoke-virtual {v0}, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 458
    .line 459
    .line 460
    move-result-object v27

    .line 461
    :cond_1e
    move-object/from16 v0, v27

    .line 462
    .line 463
    invoke-virtual {v1, v4, v0}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 464
    .line 465
    .line 466
    if-eqz v0, :cond_1f

    .line 467
    .line 468
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    move-object v14, v0

    .line 473
    check-cast v14, Ljava/lang/Boolean;

    .line 474
    .line 475
    :cond_1f
    invoke-static {v14}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 476
    .line 477
    .line 478
    move-result v0

    .line 479
    const-wide/16 v14, 0x880

    .line 480
    .line 481
    and-long/2addr v14, v2

    .line 482
    cmp-long v4, v14, v17

    .line 483
    .line 484
    if-eqz v4, :cond_20

    .line 485
    .line 486
    xor-int/lit8 v12, v0, 0x1

    .line 487
    .line 488
    :cond_20
    and-long v14, v2, v19

    .line 489
    .line 490
    cmp-long v4, v14, v17

    .line 491
    .line 492
    if-eqz v4, :cond_24

    .line 493
    .line 494
    const/4 v4, 0x1

    .line 495
    if-ne v0, v4, :cond_21

    .line 496
    .line 497
    goto :goto_17

    .line 498
    :cond_21
    const/4 v4, 0x0

    .line 499
    :goto_17
    and-long v14, v2, v25

    .line 500
    .line 501
    cmp-long v0, v14, v17

    .line 502
    .line 503
    if-eqz v0, :cond_22

    .line 504
    .line 505
    if-eqz v4, :cond_23

    .line 506
    .line 507
    or-long v2, v2, v41

    .line 508
    .line 509
    :cond_22
    :goto_18
    move/from16 v39, v4

    .line 510
    .line 511
    goto :goto_19

    .line 512
    :cond_23
    or-long v2, v2, v35

    .line 513
    .line 514
    goto :goto_18

    .line 515
    :cond_24
    :goto_19
    and-long v14, v2, v25

    .line 516
    .line 517
    cmp-long v0, v14, v17

    .line 518
    .line 519
    if-eqz v0, :cond_26

    .line 520
    .line 521
    if-eqz v37, :cond_25

    .line 522
    .line 523
    move v4, v12

    .line 524
    goto :goto_1a

    .line 525
    :cond_25
    const/4 v4, 0x0

    .line 526
    :goto_1a
    if-eqz v38, :cond_27

    .line 527
    .line 528
    move v14, v12

    .line 529
    goto :goto_1b

    .line 530
    :cond_26
    const/4 v4, 0x0

    .line 531
    :cond_27
    const/4 v14, 0x0

    .line 532
    :goto_1b
    and-long v15, v2, v21

    .line 533
    .line 534
    cmp-long v15, v15, v17

    .line 535
    .line 536
    if-eqz v15, :cond_28

    .line 537
    .line 538
    if-eqz v11, :cond_28

    .line 539
    .line 540
    move/from16 v11, v39

    .line 541
    .line 542
    goto :goto_1c

    .line 543
    :cond_28
    const/4 v11, 0x0

    .line 544
    :goto_1c
    if-eqz v0, :cond_2b

    .line 545
    .line 546
    if-eqz v39, :cond_29

    .line 547
    .line 548
    goto :goto_1d

    .line 549
    :cond_29
    const/16 v38, 0x0

    .line 550
    .line 551
    :goto_1d
    if-eqz v39, :cond_2a

    .line 552
    .line 553
    move/from16 v32, v37

    .line 554
    .line 555
    goto :goto_1e

    .line 556
    :cond_2a
    const/16 v32, 0x0

    .line 557
    .line 558
    goto :goto_1e

    .line 559
    :cond_2b
    const/16 v32, 0x0

    .line 560
    .line 561
    const/16 v38, 0x0

    .line 562
    .line 563
    :goto_1e
    and-long v19, v2, v30

    .line 564
    .line 565
    cmp-long v16, v19, v17

    .line 566
    .line 567
    if-eqz v16, :cond_2c

    .line 568
    .line 569
    move/from16 v16, v0

    .line 570
    .line 571
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->p:Landroid/widget/TextView;

    .line 572
    .line 573
    invoke-static {v0, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 574
    .line 575
    .line 576
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->f:Landroid/widget/TextView;

    .line 577
    .line 578
    invoke-static {v0, v5}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 579
    .line 580
    .line 581
    goto :goto_1f

    .line 582
    :cond_2c
    move/from16 v16, v0

    .line 583
    .line 584
    :goto_1f
    and-long v19, v2, v33

    .line 585
    .line 586
    cmp-long v0, v19, v17

    .line 587
    .line 588
    if-eqz v0, :cond_2d

    .line 589
    .line 590
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->d:Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;

    .line 591
    .line 592
    invoke-static/range {v39 .. v39}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 593
    .line 594
    .line 595
    move-result-object v5

    .line 596
    invoke-static {v0, v5}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 597
    .line 598
    .line 599
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->j:Landroid/widget/TextView;

    .line 600
    .line 601
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 602
    .line 603
    .line 604
    move-result-object v5

    .line 605
    invoke-static {v0, v5}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 606
    .line 607
    .line 608
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->l:Landroid/widget/TextView;

    .line 609
    .line 610
    invoke-static/range {v39 .. v39}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    invoke-static {v0, v5}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 615
    .line 616
    .line 617
    :cond_2d
    and-long v12, v2, v23

    .line 618
    .line 619
    cmp-long v0, v12, v17

    .line 620
    .line 621
    if-eqz v0, :cond_2e

    .line 622
    .line 623
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->g:Landroid/widget/TextView;

    .line 624
    .line 625
    invoke-static {v0, v8}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 626
    .line 627
    .line 628
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->h:Landroid/widget/TextView;

    .line 629
    .line 630
    invoke-static {v0, v9}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 631
    .line 632
    .line 633
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->i:Landroid/widget/TextView;

    .line 634
    .line 635
    invoke-static {v0, v9}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 636
    .line 637
    .line 638
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->j:Landroid/widget/TextView;

    .line 639
    .line 640
    invoke-static {v0, v6}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 641
    .line 642
    .line 643
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->k:Landroid/widget/TextView;

    .line 644
    .line 645
    invoke-static {v0, v8}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 646
    .line 647
    .line 648
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->m:Landroid/widget/TextView;

    .line 649
    .line 650
    invoke-static {v0, v10}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 651
    .line 652
    .line 653
    :cond_2e
    if-eqz v16, :cond_2f

    .line 654
    .line 655
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->g:Landroid/widget/TextView;

    .line 656
    .line 657
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 658
    .line 659
    .line 660
    move-result-object v5

    .line 661
    invoke-static {v0, v5}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 662
    .line 663
    .line 664
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->h:Landroid/widget/TextView;

    .line 665
    .line 666
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 667
    .line 668
    .line 669
    move-result-object v4

    .line 670
    invoke-static {v0, v4}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 671
    .line 672
    .line 673
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->i:Landroid/widget/TextView;

    .line 674
    .line 675
    invoke-static/range {v32 .. v32}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 676
    .line 677
    .line 678
    move-result-object v4

    .line 679
    invoke-static {v0, v4}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 680
    .line 681
    .line 682
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->k:Landroid/widget/TextView;

    .line 683
    .line 684
    invoke-static/range {v38 .. v38}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 685
    .line 686
    .line 687
    move-result-object v4

    .line 688
    invoke-static {v0, v4}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 689
    .line 690
    .line 691
    :cond_2f
    and-long v2, v2, v28

    .line 692
    .line 693
    cmp-long v0, v2, v17

    .line 694
    .line 695
    if-eqz v0, :cond_30

    .line 696
    .line 697
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->l:Landroid/widget/TextView;

    .line 698
    .line 699
    invoke-static {v0, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 700
    .line 701
    .line 702
    :cond_30
    if-eqz v15, :cond_31

    .line 703
    .line 704
    iget-object v0, v1, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBinding;->m:Landroid/widget/TextView;

    .line 705
    .line 706
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 711
    .line 712
    .line 713
    :cond_31
    return-void

    .line 714
    :catchall_0
    move-exception v0

    .line 715
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 716
    throw v0
.end method

.method public final h(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2

    .line 1
    sget p1, Ls3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

    .line 7
    .line 8
    const-wide/16 v0, 0x4

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

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
    iget-wide v0, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

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

.method public final i(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2

    .line 1
    sget p1, Ls3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

    .line 7
    .line 8
    const-wide/16 v0, 0x2

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

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

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x20

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->u:J

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
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_0
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 15
    .line 16
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->b(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_1
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->h(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_2
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 29
    .line 30
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->i(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :cond_3
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 36
    .line 37
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->d(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 1

    .line 1
    sget v0, Ls3/a;->d:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;->a(Lcom/zykj/lib/ota/viewmodel/VersionViewModel;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method
