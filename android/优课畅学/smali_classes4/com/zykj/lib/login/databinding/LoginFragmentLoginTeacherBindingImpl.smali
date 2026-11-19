.class public Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;
.super Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;
.source "SourceFile"

# interfaces
.implements Ll3/a$a;


# static fields
.field public static final q:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final r:Landroid/util/SparseIntArray;


# instance fields
.field public final i:Lcom/zykj/base/view/LoadingDialogView;

.field public final j:Lcom/zykj/base/view/ToastView;

.field public final k:Landroid/view/View$OnClickListener;

.field public l:Landroidx/databinding/InverseBindingListener;

.field public m:Landroidx/databinding/InverseBindingListener;

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
    sput-object v0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->r:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    sget v1, Lcom/zykj/lib/login/R$id;->ic_login:I

    .line 9
    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->q:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->r:Landroid/util/SparseIntArray;

    const/16 v2, 0x9

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 12

    const/4 v0, 0x4

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/EditText;

    const/4 v0, 0x1

    aget-object v1, p3, v0

    move-object v7, v1

    check-cast v7, Landroid/widget/EditText;

    const/4 v1, 0x2

    aget-object v1, p3, v1

    move-object v8, v1

    check-cast v8, Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v1, p3, v1

    move-object v9, v1

    check-cast v9, Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    aget-object v1, p3, v1

    move-object v10, v1

    check-cast v10, Landroid/widget/ImageView;

    const/4 v1, 0x5

    aget-object v1, p3, v1

    move-object v11, v1

    check-cast v11, Lcom/zykj/policy/ui/PolicyCheckView;

    const/4 v4, 0x6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v11}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/TextView;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Lcom/zykj/policy/ui/PolicyCheckView;)V

    .line 3
    new-instance p1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl$a;

    invoke-direct {p1, p0}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl$a;-><init>(Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;)V

    iput-object p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->l:Landroidx/databinding/InverseBindingListener;

    .line 4
    new-instance p1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl$b;

    invoke-direct {p1, p0}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl$b;-><init>(Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;)V

    iput-object p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->m:Landroidx/databinding/InverseBindingListener;

    .line 5
    new-instance p1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl$c;

    invoke-direct {p1, p0}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl$c;-><init>(Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;)V

    iput-object p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->n:Landroidx/databinding/InverseBindingListener;

    .line 6
    new-instance p1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl$d;

    invoke-direct {p1, p0}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl$d;-><init>(Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;)V

    iput-object p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->o:Landroidx/databinding/InverseBindingListener;

    const-wide/16 p1, -0x1

    .line 7
    iput-wide p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

    .line 8
    iget-object p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->a:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    iget-object p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->b:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->c:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    iget-object p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->d:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 12
    iget-object p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x6

    .line 13
    aget-object p1, p3, p1

    check-cast p1, Lcom/zykj/base/view/LoadingDialogView;

    iput-object p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->i:Lcom/zykj/base/view/LoadingDialogView;

    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x7

    .line 15
    aget-object p1, p3, p1

    check-cast p1, Lcom/zykj/base/view/ToastView;

    iput-object p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->j:Lcom/zykj/base/view/ToastView;

    .line 16
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 17
    iget-object p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->g:Lcom/zykj/policy/ui/PolicyCheckView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 19
    new-instance p1, Ll3/a;

    invoke-direct {p1, p0, v0}, Ll3/a;-><init>(Ll3/a$a;I)V

    iput-object p1, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->k:Landroid/view/View$OnClickListener;

    .line 20
    invoke-virtual {p0}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public final _internalCallbackOnClick(ILandroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->h:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->m()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public a(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->h:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

    .line 5
    .line 6
    const-wide/16 v2, 0x40

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    sget p1, Lk3/a;->b:I

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
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

    .line 7
    .line 8
    const-wide/16 v0, 0x20

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

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

.method public final d(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

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
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->h:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

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
    if-eqz v6, :cond_10

    .line 31
    .line 32
    and-long v21, v2, v17

    .line 33
    .line 34
    cmp-long v6, v21, v19

    .line 35
    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

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
    check-cast v6, Ljava/lang/Boolean;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v6, v5

    .line 59
    :goto_1
    and-long v21, v2, v15

    .line 60
    .line 61
    cmp-long v21, v21, v19

    .line 62
    .line 63
    if-eqz v21, :cond_3

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 68
    .line 69
    .line 70
    move-result-object v21

    .line 71
    move-object/from16 v4, v21

    .line 72
    .line 73
    :goto_2
    const-wide/16 v22, 0xe0

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_2
    move-object v4, v5

    .line 77
    goto :goto_2

    .line 78
    :goto_3
    const/4 v7, 0x1

    .line 79
    invoke-virtual {v1, v7, v4}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 80
    .line 81
    .line 82
    if-eqz v4, :cond_4

    .line 83
    .line 84
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_3
    const-wide/16 v22, 0xe0

    .line 92
    .line 93
    :cond_4
    move-object v4, v5

    .line 94
    :goto_4
    and-long v7, v2, v13

    .line 95
    .line 96
    cmp-long v7, v7, v19

    .line 97
    .line 98
    if-eqz v7, :cond_6

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    goto :goto_5

    .line 107
    :cond_5
    move-object v7, v5

    .line 108
    :goto_5
    const/4 v8, 0x2

    .line 109
    invoke-virtual {v1, v8, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 110
    .line 111
    .line 112
    if-eqz v7, :cond_7

    .line 113
    .line 114
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    check-cast v8, Lcom/zykj/base/bean/toast/ToastMessage;

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_6
    move-object v7, v5

    .line 122
    :cond_7
    :goto_6
    and-long v24, v2, v11

    .line 123
    .line 124
    cmp-long v8, v24, v19

    .line 125
    .line 126
    if-eqz v8, :cond_9

    .line 127
    .line 128
    if-eqz v0, :cond_8

    .line 129
    .line 130
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->i()Landroidx/lifecycle/MutableLiveData;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    :goto_7
    const-wide/16 v24, 0xd0

    .line 135
    .line 136
    goto :goto_8

    .line 137
    :cond_8
    move-object v8, v5

    .line 138
    goto :goto_7

    .line 139
    :goto_8
    const/4 v9, 0x3

    .line 140
    invoke-virtual {v1, v9, v8}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 141
    .line 142
    .line 143
    if-eqz v8, :cond_a

    .line 144
    .line 145
    invoke-virtual {v8}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    check-cast v8, Ljava/lang/String;

    .line 150
    .line 151
    goto :goto_9

    .line 152
    :cond_9
    const-wide/16 v24, 0xd0

    .line 153
    .line 154
    :cond_a
    move-object v8, v5

    .line 155
    :goto_9
    and-long v9, v2, v24

    .line 156
    .line 157
    cmp-long v9, v9, v19

    .line 158
    .line 159
    if-eqz v9, :cond_c

    .line 160
    .line 161
    if-eqz v0, :cond_b

    .line 162
    .line 163
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    goto :goto_a

    .line 168
    :cond_b
    move-object v9, v5

    .line 169
    :goto_a
    const/4 v10, 0x4

    .line 170
    invoke-virtual {v1, v10, v9}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 171
    .line 172
    .line 173
    if-eqz v9, :cond_c

    .line 174
    .line 175
    invoke-virtual {v9}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    check-cast v9, Ljava/lang/String;

    .line 180
    .line 181
    goto :goto_b

    .line 182
    :cond_c
    move-object v9, v5

    .line 183
    :goto_b
    and-long v26, v2, v22

    .line 184
    .line 185
    cmp-long v10, v26, v19

    .line 186
    .line 187
    if-eqz v10, :cond_f

    .line 188
    .line 189
    if-eqz v0, :cond_d

    .line 190
    .line 191
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    goto :goto_c

    .line 196
    :cond_d
    move-object v0, v5

    .line 197
    :goto_c
    const/4 v10, 0x5

    .line 198
    invoke-virtual {v1, v10, v0}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 199
    .line 200
    .line 201
    if-eqz v0, :cond_e

    .line 202
    .line 203
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, Ljava/lang/Boolean;

    .line 208
    .line 209
    goto :goto_d

    .line 210
    :cond_e
    move-object v0, v5

    .line 211
    :goto_d
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    goto :goto_f

    .line 216
    :cond_f
    :goto_e
    const/4 v0, 0x0

    .line 217
    goto :goto_f

    .line 218
    :cond_10
    const-wide/16 v22, 0xe0

    .line 219
    .line 220
    const-wide/16 v24, 0xd0

    .line 221
    .line 222
    move-object v4, v5

    .line 223
    move-object v6, v4

    .line 224
    move-object v7, v6

    .line 225
    move-object v8, v7

    .line 226
    move-object v9, v8

    .line 227
    goto :goto_e

    .line 228
    :goto_f
    const-wide/16 v26, 0x80

    .line 229
    .line 230
    and-long v26, v2, v26

    .line 231
    .line 232
    cmp-long v10, v26, v19

    .line 233
    .line 234
    if-eqz v10, :cond_11

    .line 235
    .line 236
    iget-object v10, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->a:Landroid/widget/TextView;

    .line 237
    .line 238
    move-wide/from16 v26, v11

    .line 239
    .line 240
    iget-object v11, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->k:Landroid/view/View$OnClickListener;

    .line 241
    .line 242
    invoke-virtual {v10, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 243
    .line 244
    .line 245
    iget-object v10, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->b:Landroid/widget/EditText;

    .line 246
    .line 247
    iget-object v11, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->l:Landroidx/databinding/InverseBindingListener;

    .line 248
    .line 249
    invoke-static {v10, v5, v5, v5, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 250
    .line 251
    .line 252
    iget-object v10, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->c:Landroid/widget/EditText;

    .line 253
    .line 254
    iget-object v11, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->m:Landroidx/databinding/InverseBindingListener;

    .line 255
    .line 256
    invoke-static {v10, v5, v5, v5, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 257
    .line 258
    .line 259
    iget-object v10, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->d:Landroid/widget/EditText;

    .line 260
    .line 261
    iget-object v11, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->n:Landroidx/databinding/InverseBindingListener;

    .line 262
    .line 263
    invoke-static {v10, v5, v5, v5, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 264
    .line 265
    .line 266
    iget-object v10, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->g:Lcom/zykj/policy/ui/PolicyCheckView;

    .line 267
    .line 268
    iget-object v11, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->o:Landroidx/databinding/InverseBindingListener;

    .line 269
    .line 270
    invoke-static {v10, v5, v11}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setListeners(Landroid/widget/CompoundButton;Landroid/widget/CompoundButton$OnCheckedChangeListener;Landroidx/databinding/InverseBindingListener;)V

    .line 271
    .line 272
    .line 273
    goto :goto_10

    .line 274
    :cond_11
    move-wide/from16 v26, v11

    .line 275
    .line 276
    :goto_10
    and-long v10, v2, v24

    .line 277
    .line 278
    cmp-long v5, v10, v19

    .line 279
    .line 280
    if-eqz v5, :cond_12

    .line 281
    .line 282
    iget-object v5, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->b:Landroid/widget/EditText;

    .line 283
    .line 284
    invoke-static {v5, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 285
    .line 286
    .line 287
    :cond_12
    and-long v9, v2, v15

    .line 288
    .line 289
    cmp-long v5, v9, v19

    .line 290
    .line 291
    if-eqz v5, :cond_13

    .line 292
    .line 293
    iget-object v5, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->c:Landroid/widget/EditText;

    .line 294
    .line 295
    invoke-static {v5, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 296
    .line 297
    .line 298
    :cond_13
    and-long v4, v2, v26

    .line 299
    .line 300
    cmp-long v4, v4, v19

    .line 301
    .line 302
    if-eqz v4, :cond_14

    .line 303
    .line 304
    iget-object v4, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->d:Landroid/widget/EditText;

    .line 305
    .line 306
    invoke-static {v4, v8}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 307
    .line 308
    .line 309
    :cond_14
    and-long v4, v2, v17

    .line 310
    .line 311
    cmp-long v4, v4, v19

    .line 312
    .line 313
    if-eqz v4, :cond_15

    .line 314
    .line 315
    iget-object v4, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->i:Lcom/zykj/base/view/LoadingDialogView;

    .line 316
    .line 317
    invoke-static {v4, v6}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 318
    .line 319
    .line 320
    :cond_15
    and-long v4, v2, v13

    .line 321
    .line 322
    cmp-long v4, v4, v19

    .line 323
    .line 324
    if-eqz v4, :cond_16

    .line 325
    .line 326
    iget-object v4, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->j:Lcom/zykj/base/view/ToastView;

    .line 327
    .line 328
    invoke-static {v4, v7}, Lcom/zykj/base/ext/BindingAdaptersKt;->bindLiveData(Lcom/zykj/base/view/ToastView;Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V

    .line 329
    .line 330
    .line 331
    :cond_16
    and-long v2, v2, v22

    .line 332
    .line 333
    cmp-long v2, v2, v19

    .line 334
    .line 335
    if-eqz v2, :cond_17

    .line 336
    .line 337
    iget-object v2, v1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->g:Lcom/zykj/policy/ui/PolicyCheckView;

    .line 338
    .line 339
    invoke-static {v2, v0}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setChecked(Landroid/widget/CompoundButton;Z)V

    .line 340
    .line 341
    .line 342
    :cond_17
    return-void

    .line 343
    :catchall_0
    move-exception v0

    .line 344
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 345
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
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

    .line 7
    .line 8
    const-wide/16 v0, 0x10

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

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
    iget-wide v0, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

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
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

    .line 7
    .line 8
    const-wide/16 v0, 0x2

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

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
    iput-wide v0, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

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

.method public final j(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

    .line 7
    .line 8
    const-wide/16 v0, 0x4

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

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

.method public final k(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

    .line 7
    .line 8
    const-wide/16 v0, 0x8

    .line 9
    .line 10
    or-long/2addr p1, v0

    .line 11
    iput-wide p1, p0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->p:J

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
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->b(Landroidx/lifecycle/MutableLiveData;I)Z

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
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->h(Landroidx/lifecycle/MutableLiveData;I)Z

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
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->k(Landroidx/lifecycle/MutableLiveData;I)Z

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
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->j(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :cond_4
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->i(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :cond_5
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 56
    .line 57
    invoke-virtual {p0, p2, p3}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->d(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

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
    sget v0, Lk3/a;->b:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBindingImpl;->a(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;)V

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
