.class public Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;
.super Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;
.source "SourceFile"

# interfaces
.implements Ll3/a$a;


# static fields
.field public static final r:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final s:Landroid/util/SparseIntArray;


# instance fields
.field public final l:Landroid/widget/LinearLayout;

.field public final m:Lcom/zykj/base/view/LoadingDialogView;

.field public final n:Lcom/zykj/base/view/ToastView;

.field public final o:Landroid/view/View$OnClickListener;

.field public p:Landroidx/databinding/InverseBindingListener;

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
    sput-object v0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->s:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    sget v1, Lcom/zykj/lib/login/R$id;->iv_close:I

    .line 9
    .line 10
    const/16 v2, 0x9

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 13
    .line 14
    .line 15
    sget v1, Lcom/zykj/lib/login/R$id;->tv_title:I

    .line 16
    .line 17
    const/16 v2, 0xa

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 20
    .line 21
    .line 22
    sget v1, Lcom/zykj/lib/login/R$id;->barrier:I

    .line 23
    .line 24
    const/16 v2, 0xb

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 27
    .line 28
    .line 29
    sget v1, Lcom/zykj/lib/login/R$id;->verify_code_barrier:I

    .line 30
    .line 31
    const/16 v2, 0xc

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
    sget-object v0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->r:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->s:Landroid/util/SparseIntArray;

    const/16 v2, 0xd

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 15

    const/16 v0, 0xb

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/constraintlayout/widget/Barrier;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/EditText;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    const/4 v0, 0x1

    aget-object v1, p3, v0

    move-object v10, v1

    check-cast v10, Landroid/widget/TextView;

    const/4 v1, 0x2

    aget-object v1, p3, v1

    move-object v11, v1

    check-cast v11, Landroid/widget/TextView;

    const/4 v1, 0x5

    aget-object v1, p3, v1

    move-object v12, v1

    check-cast v12, Landroid/widget/TextView;

    const/16 v1, 0xa

    aget-object v1, p3, v1

    move-object v13, v1

    check-cast v13, Landroid/widget/TextView;

    const/16 v1, 0xc

    aget-object v1, p3, v1

    move-object v14, v1

    check-cast v14, Landroidx/constraintlayout/widget/Barrier;

    const/4 v4, 0x6

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v1 .. v14}, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/Barrier;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/Barrier;)V

    .line 3
    new-instance v2, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl$a;

    invoke-direct {v2, p0}, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl$a;-><init>(Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;)V

    iput-object v2, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->p:Landroidx/databinding/InverseBindingListener;

    const-wide/16 v2, -0x1

    .line 4
    iput-wide v2, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

    .line 5
    iget-object v2, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->b:Landroid/widget/EditText;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 6
    iget-object v2, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v2, 0x0

    .line 7
    aget-object v2, p3, v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->l:Landroid/widget/LinearLayout;

    .line 8
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v2, 0x7

    .line 9
    aget-object v2, p3, v2

    check-cast v2, Lcom/zykj/base/view/LoadingDialogView;

    iput-object v2, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->m:Lcom/zykj/base/view/LoadingDialogView;

    .line 10
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/16 v2, 0x8

    .line 11
    aget-object v2, p3, v2

    check-cast v2, Lcom/zykj/base/view/ToastView;

    iput-object v2, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->n:Lcom/zykj/base/view/ToastView;

    .line 12
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 13
    iget-object v2, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->e:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object v2, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->f:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    iget-object v2, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->g:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    iget-object v2, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->h:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v3, p2

    .line 17
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 18
    new-instance v2, Ll3/a;

    invoke-direct {v2, p0, v0}, Ll3/a;-><init>(Ll3/a$a;I)V

    iput-object v2, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->o:Landroid/view/View$OnClickListener;

    .line 19
    invoke-virtual {p0}, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
    .locals 2

    .line 1
    sget p1, Lk3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

    .line 7
    .line 8
    const-wide/16 v0, 0x2

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

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

.method private onChangeViewModelToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
    .locals 2

    .line 1
    sget p1, Lk3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

    .line 7
    .line 8
    const-wide/16 v0, 0x4

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

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
.method public final _internalCallbackOnClick(ILandroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->k:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->i()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public a(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->k:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

    .line 5
    .line 6
    const-wide/16 v2, 0x40

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    sget p1, Lk3/a;->d:I

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
    sget p1, Lk3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

    .line 7
    .line 8
    const-wide/16 v0, 0x20

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

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
    sget p1, Lk3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

    .line 7
    .line 8
    const-wide/16 v0, 0x8

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

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
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->k:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 12
    .line 13
    const-wide/16 v6, 0xff

    .line 14
    .line 15
    and-long/2addr v6, v2

    .line 16
    cmp-long v6, v6, v4

    .line 17
    .line 18
    const-wide/16 v11, 0xc8

    .line 19
    .line 20
    const-wide/16 v13, 0xc4

    .line 21
    .line 22
    const-wide/16 v15, 0xc2

    .line 23
    .line 24
    const-wide/16 v17, 0xc1

    .line 25
    .line 26
    move-wide/from16 v19, v4

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    if-eqz v6, :cond_15

    .line 31
    .line 32
    and-long v21, v2, v17

    .line 33
    .line 34
    cmp-long v6, v21, v19

    .line 35
    .line 36
    if-eqz v6, :cond_2

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v6, v5

    .line 46
    :goto_0
    invoke-virtual {v1, v4, v6}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 47
    .line 48
    .line 49
    if-eqz v6, :cond_1

    .line 50
    .line 51
    invoke-virtual {v6}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Ljava/lang/String;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v6, v5

    .line 59
    :goto_1
    iget-object v4, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->g:Landroid/widget/TextView;

    .line 60
    .line 61
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const-wide/16 v22, 0xe0

    .line 66
    .line 67
    sget v7, Lcom/zykj/lib/login/R$string;->dms_tip:I

    .line 68
    .line 69
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v4, v7, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    const-wide/16 v22, 0xe0

    .line 79
    .line 80
    move-object v4, v5

    .line 81
    :goto_2
    and-long v6, v2, v15

    .line 82
    .line 83
    cmp-long v6, v6, v19

    .line 84
    .line 85
    const/4 v7, 0x1

    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    goto :goto_3

    .line 95
    :cond_3
    move-object v6, v5

    .line 96
    :goto_3
    invoke-virtual {v1, v7, v6}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 97
    .line 98
    .line 99
    if-eqz v6, :cond_4

    .line 100
    .line 101
    invoke-virtual {v6}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    check-cast v6, Ljava/lang/Boolean;

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    move-object v6, v5

    .line 109
    :goto_4
    and-long v24, v2, v13

    .line 110
    .line 111
    cmp-long v8, v24, v19

    .line 112
    .line 113
    if-eqz v8, :cond_6

    .line 114
    .line 115
    if-eqz v0, :cond_5

    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    :goto_5
    move/from16 v24, v7

    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_5
    move-object v8, v5

    .line 125
    goto :goto_5

    .line 126
    :goto_6
    const/4 v7, 0x2

    .line 127
    invoke-virtual {v1, v7, v8}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 128
    .line 129
    .line 130
    if-eqz v8, :cond_7

    .line 131
    .line 132
    invoke-virtual {v8}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    check-cast v7, Lcom/zykj/base/bean/toast/ToastMessage;

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_6
    move/from16 v24, v7

    .line 140
    .line 141
    move-object v8, v5

    .line 142
    :cond_7
    :goto_7
    and-long v25, v2, v11

    .line 143
    .line 144
    cmp-long v7, v25, v19

    .line 145
    .line 146
    if-eqz v7, :cond_a

    .line 147
    .line 148
    if-eqz v0, :cond_8

    .line 149
    .line 150
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    :goto_8
    const-wide/16 v25, 0xd0

    .line 155
    .line 156
    goto :goto_9

    .line 157
    :cond_8
    move-object v7, v5

    .line 158
    goto :goto_8

    .line 159
    :goto_9
    const/4 v9, 0x3

    .line 160
    invoke-virtual {v1, v9, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 161
    .line 162
    .line 163
    if-eqz v7, :cond_9

    .line 164
    .line 165
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    check-cast v7, Ljava/lang/Boolean;

    .line 170
    .line 171
    goto :goto_a

    .line 172
    :cond_9
    move-object v7, v5

    .line 173
    :goto_a
    invoke-static {v7}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    xor-int/lit8 v9, v9, 0x1

    .line 178
    .line 179
    goto :goto_b

    .line 180
    :cond_a
    const-wide/16 v25, 0xd0

    .line 181
    .line 182
    move-object v7, v5

    .line 183
    const/4 v9, 0x0

    .line 184
    :goto_b
    and-long v27, v2, v25

    .line 185
    .line 186
    cmp-long v10, v27, v19

    .line 187
    .line 188
    if-eqz v10, :cond_11

    .line 189
    .line 190
    if-eqz v0, :cond_b

    .line 191
    .line 192
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 193
    .line 194
    .line 195
    move-result-object v24

    .line 196
    move-wide/from16 v27, v11

    .line 197
    .line 198
    move-object/from16 v11, v24

    .line 199
    .line 200
    goto :goto_c

    .line 201
    :cond_b
    move-wide/from16 v27, v11

    .line 202
    .line 203
    move-object v11, v5

    .line 204
    :goto_c
    const/4 v12, 0x4

    .line 205
    invoke-virtual {v1, v12, v11}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 206
    .line 207
    .line 208
    if-eqz v11, :cond_c

    .line 209
    .line 210
    invoke-virtual {v11}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    check-cast v11, Ljava/lang/String;

    .line 215
    .line 216
    goto :goto_d

    .line 217
    :cond_c
    move-object v11, v5

    .line 218
    :goto_d
    if-eqz v11, :cond_d

    .line 219
    .line 220
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 221
    .line 222
    .line 223
    move-result v12

    .line 224
    move/from16 v21, v12

    .line 225
    .line 226
    goto :goto_e

    .line 227
    :cond_d
    const/16 v21, 0x0

    .line 228
    .line 229
    :goto_e
    if-eqz v10, :cond_f

    .line 230
    .line 231
    if-eqz v21, :cond_e

    .line 232
    .line 233
    const-wide/16 v29, 0x200

    .line 234
    .line 235
    :goto_f
    or-long v2, v2, v29

    .line 236
    .line 237
    goto :goto_10

    .line 238
    :cond_e
    const-wide/16 v29, 0x100

    .line 239
    .line 240
    goto :goto_f

    .line 241
    :cond_f
    :goto_10
    iget-object v10, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->e:Landroid/widget/TextView;

    .line 242
    .line 243
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    if-eqz v21, :cond_10

    .line 248
    .line 249
    sget v12, Lcom/zykj/lib/login/R$drawable;->login_shape_send_sms_btn_disable_bg:I

    .line 250
    .line 251
    :goto_11
    invoke-static {v10, v12}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    goto :goto_12

    .line 256
    :cond_10
    sget v12, Lcom/zykj/lib/login/R$drawable;->login_shape_send_sms_btn_bg:I

    .line 257
    .line 258
    goto :goto_11

    .line 259
    :cond_11
    move-wide/from16 v27, v11

    .line 260
    .line 261
    move-object v10, v5

    .line 262
    move-object v11, v10

    .line 263
    :goto_12
    and-long v29, v2, v22

    .line 264
    .line 265
    cmp-long v12, v29, v19

    .line 266
    .line 267
    if-eqz v12, :cond_14

    .line 268
    .line 269
    if-eqz v0, :cond_12

    .line 270
    .line 271
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    goto :goto_13

    .line 276
    :cond_12
    move-object v0, v5

    .line 277
    :goto_13
    const/4 v12, 0x5

    .line 278
    invoke-virtual {v1, v12, v0}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 279
    .line 280
    .line 281
    if-eqz v0, :cond_13

    .line 282
    .line 283
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    check-cast v0, Ljava/lang/Integer;

    .line 288
    .line 289
    goto :goto_14

    .line 290
    :cond_13
    move-object v0, v5

    .line 291
    :goto_14
    iget-object v12, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->h:Landroid/widget/TextView;

    .line 292
    .line 293
    invoke-virtual {v12}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 294
    .line 295
    .line 296
    move-result-object v12

    .line 297
    move-wide/from16 v29, v13

    .line 298
    .line 299
    sget v13, Lcom/zykj/lib/login/R$string;->send_retry:I

    .line 300
    .line 301
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {v12, v13, v0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    move-object/from16 v31, v6

    .line 310
    .line 311
    move-object v6, v4

    .line 312
    move v4, v9

    .line 313
    move-object v9, v8

    .line 314
    move-object v8, v7

    .line 315
    move-object/from16 v7, v31

    .line 316
    .line 317
    goto :goto_15

    .line 318
    :cond_14
    move-wide/from16 v29, v13

    .line 319
    .line 320
    move-object v0, v6

    .line 321
    move-object v6, v4

    .line 322
    move v4, v9

    .line 323
    move-object v9, v8

    .line 324
    move-object v8, v7

    .line 325
    move-object v7, v0

    .line 326
    move-object v0, v5

    .line 327
    goto :goto_15

    .line 328
    :cond_15
    move-wide/from16 v27, v11

    .line 329
    .line 330
    move-wide/from16 v29, v13

    .line 331
    .line 332
    const-wide/16 v22, 0xe0

    .line 333
    .line 334
    const-wide/16 v25, 0xd0

    .line 335
    .line 336
    move-object v0, v5

    .line 337
    move-object v6, v0

    .line 338
    move-object v7, v6

    .line 339
    move-object v8, v7

    .line 340
    move-object v9, v8

    .line 341
    move-object v10, v9

    .line 342
    move-object v11, v10

    .line 343
    const/4 v4, 0x0

    .line 344
    :goto_15
    and-long v12, v2, v25

    .line 345
    .line 346
    cmp-long v12, v12, v19

    .line 347
    .line 348
    if-eqz v12, :cond_16

    .line 349
    .line 350
    iget-object v12, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->b:Landroid/widget/EditText;

    .line 351
    .line 352
    invoke-static {v12, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 353
    .line 354
    .line 355
    iget-object v11, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->e:Landroid/widget/TextView;

    .line 356
    .line 357
    invoke-static {v11, v10}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 358
    .line 359
    .line 360
    :cond_16
    const-wide/16 v10, 0x80

    .line 361
    .line 362
    and-long/2addr v10, v2

    .line 363
    cmp-long v10, v10, v19

    .line 364
    .line 365
    if-eqz v10, :cond_17

    .line 366
    .line 367
    iget-object v10, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->b:Landroid/widget/EditText;

    .line 368
    .line 369
    iget-object v11, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->p:Landroidx/databinding/InverseBindingListener;

    .line 370
    .line 371
    invoke-static {v10, v5, v5, v5, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 372
    .line 373
    .line 374
    iget-object v5, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->c:Landroid/widget/TextView;

    .line 375
    .line 376
    iget-object v10, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->o:Landroid/view/View$OnClickListener;

    .line 377
    .line 378
    invoke-virtual {v5, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 379
    .line 380
    .line 381
    :cond_17
    and-long v10, v2, v27

    .line 382
    .line 383
    cmp-long v5, v10, v19

    .line 384
    .line 385
    if-eqz v5, :cond_18

    .line 386
    .line 387
    iget-object v5, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->c:Landroid/widget/TextView;

    .line 388
    .line 389
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 390
    .line 391
    .line 392
    move-result-object v10

    .line 393
    invoke-static {v5, v10}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 394
    .line 395
    .line 396
    iget-object v5, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->f:Landroid/widget/TextView;

    .line 397
    .line 398
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    invoke-static {v5, v4}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 403
    .line 404
    .line 405
    iget-object v4, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->g:Landroid/widget/TextView;

    .line 406
    .line 407
    invoke-static {v4, v8}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 408
    .line 409
    .line 410
    iget-object v4, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->h:Landroid/widget/TextView;

    .line 411
    .line 412
    invoke-static {v4, v8}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 413
    .line 414
    .line 415
    :cond_18
    and-long v4, v2, v15

    .line 416
    .line 417
    cmp-long v4, v4, v19

    .line 418
    .line 419
    if-eqz v4, :cond_19

    .line 420
    .line 421
    iget-object v4, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->m:Lcom/zykj/base/view/LoadingDialogView;

    .line 422
    .line 423
    invoke-static {v4, v7}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 424
    .line 425
    .line 426
    :cond_19
    and-long v4, v2, v29

    .line 427
    .line 428
    cmp-long v4, v4, v19

    .line 429
    .line 430
    if-eqz v4, :cond_1a

    .line 431
    .line 432
    iget-object v4, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->n:Lcom/zykj/base/view/ToastView;

    .line 433
    .line 434
    invoke-static {v4, v9}, Lcom/zykj/base/ext/BindingAdaptersKt;->bindLiveData(Lcom/zykj/base/view/ToastView;Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V

    .line 435
    .line 436
    .line 437
    :cond_1a
    and-long v4, v2, v17

    .line 438
    .line 439
    cmp-long v4, v4, v19

    .line 440
    .line 441
    if-eqz v4, :cond_1b

    .line 442
    .line 443
    iget-object v4, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->g:Landroid/widget/TextView;

    .line 444
    .line 445
    invoke-static {v4, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 446
    .line 447
    .line 448
    :cond_1b
    and-long v2, v2, v22

    .line 449
    .line 450
    cmp-long v2, v2, v19

    .line 451
    .line 452
    if-eqz v2, :cond_1c

    .line 453
    .line 454
    iget-object v2, v1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->h:Landroid/widget/TextView;

    .line 455
    .line 456
    invoke-static {v2, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 457
    .line 458
    .line 459
    :cond_1c
    return-void

    .line 460
    :catchall_0
    move-exception v0

    .line 461
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 462
    throw v0
.end method

.method public final h(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2

    .line 1
    sget p1, Lk3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

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
    iget-wide v0, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

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
    sget p1, Lk3/a;->a:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

    .line 7
    .line 8
    const-wide/16 v0, 0x10

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

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
    const-wide/16 v0, 0x80

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->q:J

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
    if-eqz p1, :cond_5

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_4

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p1, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p1, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    if-eq p1, v0, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_0
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->b(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_1
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->i(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :cond_2
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 35
    .line 36
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->d(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :cond_3
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 42
    .line 43
    invoke-direct {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->onChangeViewModelToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :cond_4
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 49
    .line 50
    invoke-direct {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->onChangeViewModelIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :cond_5
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 56
    .line 57
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->h(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    return p1
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 1

    .line 1
    sget v0, Lk3/a;->d:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBindingImpl;->a(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;)V

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
