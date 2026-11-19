.class public Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;
.super Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;
.source "SourceFile"

# interfaces
.implements Ll3/a$a;


# static fields
.field public static final q:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final r:Landroid/util/SparseIntArray;


# instance fields
.field public final k:Landroid/widget/LinearLayout;

.field public final l:Lcom/zykj/base/view/ToastView;

.field public final m:Landroid/view/View$OnClickListener;

.field public n:Landroidx/databinding/InverseBindingListener;

.field public o:Landroidx/databinding/InverseBindingListener;

.field public p:J


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
    sput-object v0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->r:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    sget v1, Lcom/zykj/lib/login/R$id;->tv_title:I

    .line 9
    .line 10
    const/4 v2, 0x6

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 12
    .line 13
    .line 14
    sget v1, Lcom/zykj/lib/login/R$id;->tv_hint:I

    .line 15
    .line 16
    const/4 v2, 0x7

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 18
    .line 19
    .line 20
    sget v1, Lcom/zykj/lib/login/R$id;->ll_new_pwd:I

    .line 21
    .line 22
    const/16 v2, 0x8

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 25
    .line 26
    .line 27
    sget v1, Lcom/zykj/lib/login/R$id;->ll_check_pwd:I

    .line 28
    .line 29
    const/16 v2, 0x9

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->q:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->r:Landroid/util/SparseIntArray;

    const/16 v2, 0xa

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 13

    const/4 v0, 0x2

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/EditText;

    const/4 v0, 0x1

    aget-object v1, p3, v0

    move-object v6, v1

    check-cast v6, Landroid/widget/EditText;

    const/16 v1, 0x9

    aget-object v1, p3, v1

    move-object v7, v1

    check-cast v7, Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    aget-object v1, p3, v1

    move-object v8, v1

    check-cast v8, Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    aget-object v1, p3, v1

    move-object v9, v1

    check-cast v9, Lcom/zykj/base/view/LoadingDialogView;

    const/4 v1, 0x7

    aget-object v1, p3, v1

    move-object v10, v1

    check-cast v10, Landroid/widget/TextView;

    const/4 v1, 0x3

    aget-object v1, p3, v1

    move-object v11, v1

    check-cast v11, Landroid/widget/TextView;

    const/4 v1, 0x6

    aget-object v1, p3, v1

    move-object v12, v1

    check-cast v12, Landroid/widget/TextView;

    const/4 v4, 0x5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v12}, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/zykj/base/view/LoadingDialogView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 3
    new-instance p1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl$a;

    invoke-direct {p1, p0}, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl$a;-><init>(Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;)V

    iput-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->n:Landroidx/databinding/InverseBindingListener;

    .line 4
    new-instance p1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl$b;

    invoke-direct {p1, p0}, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl$b;-><init>(Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;)V

    iput-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->o:Landroidx/databinding/InverseBindingListener;

    const-wide/16 v4, -0x1

    .line 5
    iput-wide v4, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

    .line 6
    iget-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->a:Landroid/widget/EditText;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->b:Landroid/widget/EditText;

    invoke-virtual {p1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->e:Lcom/zykj/base/view/LoadingDialogView;

    invoke-virtual {p1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 9
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->k:Landroid/widget/LinearLayout;

    .line 10
    invoke-virtual {p1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 11
    aget-object p1, p3, p1

    check-cast p1, Lcom/zykj/base/view/ToastView;

    iput-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->l:Lcom/zykj/base/view/ToastView;

    .line 12
    invoke-virtual {p1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 13
    iget-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->g:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    invoke-virtual {p0, p2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 15
    new-instance p1, Ll3/a;

    invoke-direct {p1, p0, v0}, Ll3/a;-><init>(Ll3/a$a;I)V

    iput-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->m:Landroid/view/View$OnClickListener;

    .line 16
    invoke-virtual {p0}, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public final _internalCallbackOnClick(ILandroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->i:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->g()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public a(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->i:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

    .line 5
    .line 6
    const-wide/16 v2, 0x40

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

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
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

    .line 7
    .line 8
    const-wide/16 v0, 0x4

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

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
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

    .line 7
    .line 8
    const-wide/16 v0, 0x10

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

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
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->i:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 12
    .line 13
    const-wide/16 v6, 0xdf

    .line 14
    .line 15
    and-long/2addr v6, v2

    .line 16
    cmp-long v6, v6, v4

    .line 17
    .line 18
    const-wide/16 v11, 0xc4

    .line 19
    .line 20
    const-wide/16 v13, 0xc2

    .line 21
    .line 22
    const-wide/16 v15, 0xc1

    .line 23
    .line 24
    move-wide/from16 v17, v4

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v6, :cond_10

    .line 28
    .line 29
    and-long v5, v2, v15

    .line 30
    .line 31
    cmp-long v5, v5, v17

    .line 32
    .line 33
    if-eqz v5, :cond_1

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v5, v4

    .line 43
    :goto_0
    const/4 v6, 0x0

    .line 44
    invoke-virtual {v1, v6, v5}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 45
    .line 46
    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Ljava/lang/Boolean;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v5, v4

    .line 57
    :goto_1
    and-long v19, v2, v13

    .line 58
    .line 59
    cmp-long v6, v19, v17

    .line 60
    .line 61
    if-eqz v6, :cond_3

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    :goto_2
    const-wide/16 v19, 0xd0

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_2
    move-object v6, v4

    .line 73
    goto :goto_2

    .line 74
    :goto_3
    const/4 v7, 0x1

    .line 75
    invoke-virtual {v1, v7, v6}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 76
    .line 77
    .line 78
    if-eqz v6, :cond_4

    .line 79
    .line 80
    invoke-virtual {v6}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    check-cast v6, Ljava/lang/String;

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_3
    const-wide/16 v19, 0xd0

    .line 88
    .line 89
    :cond_4
    move-object v6, v4

    .line 90
    :goto_4
    and-long v7, v2, v11

    .line 91
    .line 92
    cmp-long v7, v7, v17

    .line 93
    .line 94
    if-eqz v7, :cond_a

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    :goto_5
    const-wide/16 v21, 0xc8

    .line 103
    .line 104
    goto :goto_6

    .line 105
    :cond_5
    move-object v8, v4

    .line 106
    goto :goto_5

    .line 107
    :goto_6
    const/4 v9, 0x2

    .line 108
    invoke-virtual {v1, v9, v8}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 109
    .line 110
    .line 111
    if-eqz v8, :cond_6

    .line 112
    .line 113
    invoke-virtual {v8}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    check-cast v8, Ljava/lang/Boolean;

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_6
    move-object v8, v4

    .line 121
    :goto_7
    invoke-static {v8}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v7, :cond_8

    .line 126
    .line 127
    if-eqz v8, :cond_7

    .line 128
    .line 129
    const-wide/16 v9, 0x200

    .line 130
    .line 131
    :goto_8
    or-long/2addr v2, v9

    .line 132
    goto :goto_9

    .line 133
    :cond_7
    const-wide/16 v9, 0x100

    .line 134
    .line 135
    goto :goto_8

    .line 136
    :cond_8
    :goto_9
    iget-object v7, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->g:Landroid/widget/TextView;

    .line 137
    .line 138
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    if-eqz v8, :cond_9

    .line 143
    .line 144
    sget v8, Lcom/zykj/lib/login/R$drawable;->login_shape_change_pwd_btn_bg:I

    .line 145
    .line 146
    :goto_a
    invoke-static {v7, v8}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    goto :goto_b

    .line 151
    :cond_9
    sget v8, Lcom/zykj/lib/login/R$drawable;->login_shape_change_pwd_btn_disable_bg:I

    .line 152
    .line 153
    goto :goto_a

    .line 154
    :cond_a
    const-wide/16 v21, 0xc8

    .line 155
    .line 156
    move-object v7, v4

    .line 157
    :goto_b
    and-long v8, v2, v21

    .line 158
    .line 159
    cmp-long v8, v8, v17

    .line 160
    .line 161
    if-eqz v8, :cond_c

    .line 162
    .line 163
    if-eqz v0, :cond_b

    .line 164
    .line 165
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    goto :goto_c

    .line 170
    :cond_b
    move-object v8, v4

    .line 171
    :goto_c
    const/4 v9, 0x3

    .line 172
    invoke-virtual {v1, v9, v8}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 173
    .line 174
    .line 175
    if-eqz v8, :cond_d

    .line 176
    .line 177
    invoke-virtual {v8}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    check-cast v9, Lcom/zykj/base/bean/toast/ToastMessage;

    .line 182
    .line 183
    goto :goto_d

    .line 184
    :cond_c
    move-object v8, v4

    .line 185
    :cond_d
    :goto_d
    and-long v9, v2, v19

    .line 186
    .line 187
    cmp-long v9, v9, v17

    .line 188
    .line 189
    if-eqz v9, :cond_f

    .line 190
    .line 191
    if-eqz v0, :cond_e

    .line 192
    .line 193
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    goto :goto_e

    .line 198
    :cond_e
    move-object v0, v4

    .line 199
    :goto_e
    const/4 v9, 0x4

    .line 200
    invoke-virtual {v1, v9, v0}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 201
    .line 202
    .line 203
    if-eqz v0, :cond_f

    .line 204
    .line 205
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, Ljava/lang/String;

    .line 210
    .line 211
    goto :goto_f

    .line 212
    :cond_f
    move-object v0, v4

    .line 213
    goto :goto_f

    .line 214
    :cond_10
    const-wide/16 v19, 0xd0

    .line 215
    .line 216
    const-wide/16 v21, 0xc8

    .line 217
    .line 218
    move-object v0, v4

    .line 219
    move-object v5, v0

    .line 220
    move-object v6, v5

    .line 221
    move-object v7, v6

    .line 222
    move-object v8, v7

    .line 223
    :goto_f
    and-long v9, v2, v19

    .line 224
    .line 225
    cmp-long v9, v9, v17

    .line 226
    .line 227
    if-eqz v9, :cond_11

    .line 228
    .line 229
    iget-object v9, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->a:Landroid/widget/EditText;

    .line 230
    .line 231
    invoke-static {v9, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 232
    .line 233
    .line 234
    :cond_11
    const-wide/16 v9, 0x80

    .line 235
    .line 236
    and-long/2addr v9, v2

    .line 237
    cmp-long v0, v9, v17

    .line 238
    .line 239
    if-eqz v0, :cond_12

    .line 240
    .line 241
    iget-object v0, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->a:Landroid/widget/EditText;

    .line 242
    .line 243
    iget-object v9, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->n:Landroidx/databinding/InverseBindingListener;

    .line 244
    .line 245
    invoke-static {v0, v4, v4, v4, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 246
    .line 247
    .line 248
    iget-object v0, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->b:Landroid/widget/EditText;

    .line 249
    .line 250
    iget-object v9, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->o:Landroidx/databinding/InverseBindingListener;

    .line 251
    .line 252
    invoke-static {v0, v4, v4, v4, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 253
    .line 254
    .line 255
    iget-object v0, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->g:Landroid/widget/TextView;

    .line 256
    .line 257
    iget-object v4, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->m:Landroid/view/View$OnClickListener;

    .line 258
    .line 259
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 260
    .line 261
    .line 262
    :cond_12
    and-long v9, v2, v13

    .line 263
    .line 264
    cmp-long v0, v9, v17

    .line 265
    .line 266
    if-eqz v0, :cond_13

    .line 267
    .line 268
    iget-object v0, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->b:Landroid/widget/EditText;

    .line 269
    .line 270
    invoke-static {v0, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 271
    .line 272
    .line 273
    :cond_13
    and-long v9, v2, v15

    .line 274
    .line 275
    cmp-long v0, v9, v17

    .line 276
    .line 277
    if-eqz v0, :cond_14

    .line 278
    .line 279
    iget-object v0, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->e:Lcom/zykj/base/view/LoadingDialogView;

    .line 280
    .line 281
    invoke-static {v0, v5}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 282
    .line 283
    .line 284
    :cond_14
    and-long v4, v2, v21

    .line 285
    .line 286
    cmp-long v0, v4, v17

    .line 287
    .line 288
    if-eqz v0, :cond_15

    .line 289
    .line 290
    iget-object v0, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->l:Lcom/zykj/base/view/ToastView;

    .line 291
    .line 292
    invoke-static {v0, v8}, Lcom/zykj/base/ext/BindingAdaptersKt;->bindLiveData(Lcom/zykj/base/view/ToastView;Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V

    .line 293
    .line 294
    .line 295
    :cond_15
    and-long/2addr v2, v11

    .line 296
    cmp-long v0, v2, v17

    .line 297
    .line 298
    if-eqz v0, :cond_16

    .line 299
    .line 300
    iget-object v0, v1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->g:Landroid/widget/TextView;

    .line 301
    .line 302
    invoke-static {v0, v7}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 303
    .line 304
    .line 305
    :cond_16
    return-void

    .line 306
    :catchall_0
    move-exception v0

    .line 307
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 308
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
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

    .line 7
    .line 8
    const-wide/16 v0, 0x2

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

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
    iget-wide v0, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

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

.method public i(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-void
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
    iput-wide v0, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

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

.method public final onChangeViewModelIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

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

.method public final onChangeViewModelToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

    .line 7
    .line 8
    const-wide/16 v0, 0x8

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->p:J

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
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 18
    .line 19
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->d(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_1
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 25
    .line 26
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->onChangeViewModelToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_2
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 32
    .line 33
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->b(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_3
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 39
    .line 40
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->h(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :cond_4
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 46
    .line 47
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->onChangeViewModelIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    return p1
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2

    .line 1
    sget v0, Lk3/a;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    check-cast p2, Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->i(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    sget v0, Lk3/a;->d:I

    .line 13
    .line 14
    if-ne v0, p1, :cond_1

    .line 15
    .line 16
    check-cast p2, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBindingImpl;->a(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;)V

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
