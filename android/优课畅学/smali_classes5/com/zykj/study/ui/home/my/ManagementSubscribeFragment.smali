# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_ManagementSubscribeFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_ManagementSubscribeFragment<",
        "Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final p:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$a;

.field public static final q:I


# instance fields
.field public final f:Lh7/d;

.field public final g:Lh7/d;

.field public final h:Lcom/zykj/study/adapter/FreeSubscribeAdapter;

.field public i:Ln4/o0;

.field public j:Lcom/zykj/study/adapter/SubscribeTabListAdapter;

.field public final k:Landroidx/lifecycle/MutableLiveData;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:I

.field public o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->p:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->q:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_ManagementSubscribeFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v4, p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->f:Lh7/d;

    .line 31
    .line 32
    const-class v0, Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$special$$inlined$activityViewModels$default$4;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$special$$inlined$activityViewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$special$$inlined$activityViewModels$default$5;

    .line 44
    .line 45
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$special$$inlined$activityViewModels$default$5;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 46
    .line 47
    .line 48
    new-instance v3, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$special$$inlined$activityViewModels$default$6;

    .line 49
    .line 50
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$special$$inlined$activityViewModels$default$6;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->g:Lh7/d;

    .line 58
    .line 59
    new-instance v0, Lcom/zykj/study/adapter/FreeSubscribeAdapter;

    .line 60
    .line 61
    invoke-direct {v0}, Lcom/zykj/study/adapter/FreeSubscribeAdapter;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->h:Lcom/zykj/study/adapter/FreeSubscribeAdapter;

    .line 65
    .line 66
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 67
    .line 68
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->k:Landroidx/lifecycle/MutableLiveData;

    .line 72
    .line 73
    const-string v0, ""

    .line 74
    .line 75
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->l:Ljava/lang/String;

    .line 76
    .line 77
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->m:Ljava/lang/String;

    .line 78
    .line 79
    return-void
.end method

.method public static final C(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroidx/paging/CombinedLoadStates;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/paging/CombinedLoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    instance-of v0, p1, Landroidx/paging/LoadState$Loading;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->k:Landroidx/lifecycle/MutableLiveData;

    .line 15
    .line 16
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    instance-of v0, p1, Landroidx/paging/LoadState$NotLoading;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->k:Landroidx/lifecycle/MutableLiveData;

    .line 27
    .line 28
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    instance-of p1, p1, Landroidx/paging/LoadState$Error;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->k:Landroidx/lifecycle/MutableLiveData;

    .line 39
    .line 40
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 49
    .line 50
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p0
.end method

.method public static final D(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/Boolean;)Lh7/p;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_a

    .line 6
    .line 7
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->h:Lcom/zykj/study/adapter/FreeSubscribeAdapter;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->getItemCount()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/16 v0, 0x8

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez p1, :cond_8

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->e()Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lcom/zykj/study/bean/FreeSubscribeReq;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v2, v1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :goto_0
    move v2, v3

    .line 43
    :goto_1
    invoke-virtual {p1}, Lcom/zykj/study/bean/FreeSubscribeReq;->getRoleType()Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    move v4, v3

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move v4, v1

    .line 52
    :goto_2
    and-int/2addr v2, v4

    .line 53
    invoke-virtual {p1}, Lcom/zykj/study/bean/FreeSubscribeReq;->getLearnDateTimeStart()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    if-eqz v4, :cond_4

    .line 58
    .line 59
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_3

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    move v4, v1

    .line 67
    goto :goto_4

    .line 68
    :cond_4
    :goto_3
    move v4, v3

    .line 69
    :goto_4
    and-int/2addr v2, v4

    .line 70
    invoke-virtual {p1}, Lcom/zykj/study/bean/FreeSubscribeReq;->getLearnDateTimeEnd()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p1, :cond_6

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_5

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_5
    move v3, v1

    .line 84
    :cond_6
    :goto_5
    and-int p1, v2, v3

    .line 85
    .line 86
    if-eqz p1, :cond_7

    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 93
    .line 94
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 95
    .line 96
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 108
    .line 109
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberListEmpty:Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;

    .line 110
    .line 111
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 124
    .line 125
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 126
    .line 127
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 139
    .line 140
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberListEmpty:Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;

    .line 141
    .line 142
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 154
    .line 155
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 156
    .line 157
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->rvFreeSubscriberList:Landroidx/recyclerview/widget/RecyclerView;

    .line 158
    .line 159
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 167
    .line 168
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 169
    .line 170
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->llSearchEmpty:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 171
    .line 172
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 173
    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_8
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 181
    .line 182
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 183
    .line 184
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 196
    .line 197
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberListEmpty:Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;

    .line 198
    .line 199
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 211
    .line 212
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 213
    .line 214
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->llSearchEmpty:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 215
    .line 216
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 224
    .line 225
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 226
    .line 227
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->rvFreeSubscriberList:Landroidx/recyclerview/widget/RecyclerView;

    .line 228
    .line 229
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 230
    .line 231
    .line 232
    :goto_6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->l()V

    .line 237
    .line 238
    .line 239
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->j:Lcom/zykj/study/adapter/SubscribeTabListAdapter;

    .line 240
    .line 241
    if-nez p1, :cond_9

    .line 242
    .line 243
    const-string p1, "subscribeTabListAdapter"

    .line 244
    .line 245
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    const/4 p1, 0x0

    .line 249
    :cond_9
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 250
    .line 251
    .line 252
    iget-boolean p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->o:Z

    .line 253
    .line 254
    if-eqz p1, :cond_a

    .line 255
    .line 256
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 261
    .line 262
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 263
    .line 264
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->rvFreeSubscriberList:Landroidx/recyclerview/widget/RecyclerView;

    .line 265
    .line 266
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 267
    .line 268
    .line 269
    iput-boolean v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->o:Z

    .line 270
    .line 271
    :cond_a
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 272
    .line 273
    return-object p0
.end method

.method public static final F(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 7

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "bundle"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "START_DATE"

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "null"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const-string v2, ""

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    move-object v0, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->l:Ljava/lang/String;

    .line 42
    .line 43
    const-string v0, "END_DATE"

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v3, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    :goto_1
    iput-object v2, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->m:Ljava/lang/String;

    .line 69
    .line 70
    new-instance v1, Ljava/lang/StringBuffer;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const/4 v3, 0x0

    .line 80
    const-string v4, "substring(...)"

    .line 81
    .line 82
    const/16 v5, 0xa

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_2

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_2
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    invoke-virtual {p1, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    move-object p1, v3

    .line 109
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string p1, "~"

    .line 118
    .line 119
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_4
    :goto_3
    const-string p1, "\u4e0d\u9650  ~"

    .line 131
    .line 132
    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 133
    .line 134
    .line 135
    :goto_4
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-eqz p1, :cond_7

    .line 140
    .line 141
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-nez p1, :cond_5

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_5
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-eqz p1, :cond_6

    .line 153
    .line 154
    invoke-virtual {p1, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :cond_6
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 162
    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_7
    :goto_5
    const-string p1, "  \u4e0d\u9650"

    .line 166
    .line 167
    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 168
    .line 169
    .line 170
    :goto_6
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    check-cast p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 175
    .line 176
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 177
    .line 178
    iget-object p0, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->tvDateSelect:Landroidx/appcompat/widget/AppCompatTextView;

    .line 179
    .line 180
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 184
    .line 185
    return-object p0
.end method

.method public static final G(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 6

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "bundle"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "accountId"

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-lez p2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    const-string v0, "courseId"

    .line 32
    .line 33
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v3, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$2$1$1$1;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {v3, p0, p2, p1, v1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$2$1$1$1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;ILjava/lang/String;Lm7/c;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    const/4 v5, 0x0

    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 51
    .line 52
    .line 53
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 54
    .line 55
    return-object p0
.end method

.method public static final H(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 7

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v4, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-direct {v4, p0, p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initFragmentListener$3$1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lm7/c;)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x3

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 24
    .line 25
    .line 26
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 27
    .line 28
    return-object p0
.end method

.method public static final I(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->e()Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->l:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/zykj/study/bean/FreeSubscribeReq;->setLearnDateTimeStart(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->e()Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->m:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/zykj/study/bean/FreeSubscribeReq;->setLearnDateTimeEnd(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->e()Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->n:I

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0}, Lcom/zykj/study/bean/FreeSubscribeReq;->setRoleType(Ljava/lang/Integer;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->e()Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 57
    .line 58
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 59
    .line 60
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->tvSearch:Landroidx/appcompat/widget/AppCompatEditText;

    .line 61
    .line 62
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p1, v0}, Lcom/zykj/study/bean/FreeSubscribeReq;->setName(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->h:Lcom/zykj/study/adapter/FreeSubscribeAdapter;

    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->refresh()V

    .line 76
    .line 77
    .line 78
    const/4 p1, 0x1

    .line 79
    iput-boolean p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->o:Z

    .line 80
    .line 81
    return-void
.end method

.method public static final J(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->spRoleSelect:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->v(Ljava/lang/Object;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 24
    .line 25
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 26
    .line 27
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->tvSearch:Landroidx/appcompat/widget/AppCompatEditText;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 40
    .line 41
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->tvDateSelect:Landroidx/appcompat/widget/AppCompatTextView;

    .line 42
    .line 43
    sget v2, Lcom/zykj/study/R$string;->free_subscriber_search_date:I

    .line 44
    .line 45
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->e()Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1, v1}, Lcom/zykj/study/bean/FreeSubscribeReq;->setName(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v1}, Lcom/zykj/study/bean/FreeSubscribeReq;->setLearnDateTimeEnd(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v1}, Lcom/zykj/study/bean/FreeSubscribeReq;->setLearnDateTimeStart(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v1}, Lcom/zykj/study/bean/FreeSubscribeReq;->setRoleType(Ljava/lang/Integer;)V

    .line 70
    .line 71
    .line 72
    const-string p1, ""

    .line 73
    .line 74
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->l:Ljava/lang/String;

    .line 75
    .line 76
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->m:Ljava/lang/String;

    .line 77
    .line 78
    iput v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->n:I

    .line 79
    .line 80
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->h:Lcom/zykj/study/adapter/FreeSubscribeAdapter;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->refresh()V

    .line 83
    .line 84
    .line 85
    const/4 p1, 0x1

    .line 86
    iput-boolean p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->o:Z

    .line 87
    .line 88
    return-void
.end method

.method public static final K(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object p1, Lh5/c;->b:Lh5/c;

    .line 2
    .line 3
    new-instance v0, Lb5/q1;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lb5/q1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lh5/c;->a(Lx7/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final L(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)Lh7/p;
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/study/ui/home/my/h;->a:Lcom/zykj/study/ui/home/my/h$d;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->l:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->m:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/zykj/study/ui/home/my/h$d;->a(Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 19
    .line 20
    return-object p0
.end method

.method public static final M(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;ILcom/zykj/study/bean/OtherSubscribe;)Lh7/p;
    .locals 7

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 11
    .line 12
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberListEmpty:Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getRoot(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v3, v0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 24
    .line 25
    invoke-virtual {v3}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v4, v0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 33
    .line 34
    invoke-virtual {v4}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {v4, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->otherCourseSubscriberList:Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    filled-new-array {v1, v3, v4, v0}, [Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p0, v0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->S([Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    if-eq p1, v0, :cond_0

    .line 61
    .line 62
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v4, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    invoke-direct {v4, p0, p2, p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lcom/zykj/study/bean/OtherSubscribe;Lm7/c;)V

    .line 70
    .line 71
    .line 72
    const/4 v5, 0x3

    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v2, 0x0

    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 84
    .line 85
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->otherCourseSubscriberList:Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const/4 p1, 0x0

    .line 92
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->T()V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->h:Lcom/zykj/study/adapter/FreeSubscribeAdapter;

    .line 101
    .line 102
    invoke-virtual {p0}, Landroidx/paging/PagingDataAdapter;->refresh()V

    .line 103
    .line 104
    .line 105
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 106
    .line 107
    return-object p0
.end method

.method public static final N(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->otherCourseSubscriberList:Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;->setPeople(Ljava/lang/Integer;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 13
    .line 14
    return-object p0
.end method

.method public static final O(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "\u5171"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, "\u4eba"

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    .line 29
    .line 30
    const/high16 v2, -0x10000

    .line 31
    .line 32
    invoke-direct {v1, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/4 v2, 0x1

    .line 40
    sub-int/2addr p1, v2

    .line 41
    const/16 v3, 0x21

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2, p1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 51
    .line 52
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 53
    .line 54
    iget-object p0, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->freeSubNumber:Landroidx/appcompat/widget/AppCompatTextView;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 60
    .line 61
    return-object p0
.end method

.method public static final P(Lcom/xuexiang/xui/widget/actionbar/TitleBar;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Landroidx/navigation/ViewKt;->findNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final Q(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 25
    .line 26
    sget p1, Lcom/zykj/study/R$string;->batch_delete_error_message:I

    .line 27
    .line 28
    invoke-static {p0, p1}, Le5/o;->c(Lcom/zykj/base/utils/XToastUtils;I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    :goto_0
    sget-object v0, Lcom/zykj/study/ui/home/my/h;->a:Lcom/zykj/study/ui/home/my/h$d;

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/my/h$d;->b(Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Landroidx/navigation/ViewKt;->findNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1, p0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static final R(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;IJLjava/lang/Object;)V
    .locals 0

    .line 1
    const-string p3, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p5, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput p2, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->n:I

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroidx/paging/CombinedLoadStates;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->C(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroidx/paging/CombinedLoadStates;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->Q(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->I(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->K(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->F(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;IJLjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->R(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;IJLjava/lang/Object;)V

    return-void
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;ILcom/zykj/study/bean/OtherSubscribe;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->M(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;ILcom/zykj/study/bean/OtherSubscribe;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->N(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/Integer;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->L(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->G(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->H(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->J(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic s(Lcom/xuexiang/xui/widget/actionbar/TitleBar;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->P(Lcom/xuexiang/xui/widget/actionbar/TitleBar;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic t(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->O(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/Integer;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/Boolean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->D(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/lang/Boolean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)Lcom/zykj/study/adapter/FreeSubscribeAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->h:Lcom/zykj/study/adapter/FreeSubscribeAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic w(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)Ln4/o0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->i:Ln4/o0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic x(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)Lcom/zykj/study/adapter/SubscribeTabListAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->j:Lcom/zykj/study/adapter/SubscribeTabListAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic y(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->o:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic z(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ln4/o0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->i:Ln4/o0;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final B()Lcom/zykj/lib/login/ui/main/LoginViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final E()V
    .locals 2

    .line 1
    new-instance v0, Lb5/r1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lb5/r1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "REQUEST_DATE"

    .line 7
    .line 8
    invoke-static {p0, v1, v0}, Landroidx/fragment/app/FragmentKt;->setFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lx7/p;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lb5/s1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lb5/s1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "DELETE_SUB_SING"

    .line 17
    .line 18
    invoke-static {p0, v1, v0}, Landroidx/fragment/app/FragmentKt;->setFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lx7/p;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lb5/t1;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lb5/t1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "DELETE_SUB_BATCH"

    .line 27
    .line 28
    invoke-static {p0, v1, v0}, Landroidx/fragment/app/FragmentKt;->setFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lx7/p;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final varargs S([Landroid/view/View;)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public final T()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v5, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {v5, p0, v0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lm7/c;)V

    .line 25
    .line 26
    .line 27
    const/4 v6, 0x3

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const-string v0, "courseId"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 18
    .line 19
    int-to-long v2, p1

    .line 20
    const/16 v10, 0x60

    .line 21
    .line 22
    const/4 v11, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    invoke-direct/range {v1 .. v11}, Lcom/zykj/study/bean/FreeSubscribeReq;-><init>(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/n;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->k(Lcom/zykj/study/bean/FreeSubscribeReq;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v5, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initData$3;

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    invoke-direct {v5, p0, p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initData$3;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lm7/c;)V

    .line 43
    .line 44
    .line 45
    const/4 v6, 0x3

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->h:Lcom/zykj/study/adapter/FreeSubscribeAdapter;

    .line 53
    .line 54
    new-instance v0, Lb5/c2;

    .line 55
    .line 56
    invoke-direct {v0, p0}, Lb5/c2;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroidx/paging/PagingDataAdapter;->addLoadStateListener(Lx7/l;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->k:Landroidx/lifecycle/MutableLiveData;

    .line 63
    .line 64
    new-instance v0, Lb5/p1;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lb5/p1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$b;

    .line 70
    .line 71
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$b;-><init>(Lx7/l;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->E()V

    .line 78
    .line 79
    .line 80
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 81
    .line 82
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->h:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->h:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget-wide v1, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->e:J

    .line 40
    .line 41
    iget v4, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->d:I

    .line 42
    .line 43
    iget-object p1, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, [Lcom/zykj/study/bean/OtherSubscribe;

    .line 46
    .line 47
    iget-object v5, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v5, [Lcom/zykj/study/bean/OtherSubscribe;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_1

    .line 59
    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    check-cast p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 76
    .line 77
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberListEmpty:Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;

    .line 78
    .line 79
    invoke-virtual {p2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const-string v2, "getRoot(...)"

    .line 84
    .line 85
    invoke-static {p2, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 93
    .line 94
    iget-object v5, v5, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 95
    .line 96
    invoke-virtual {v5}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-static {v5, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    check-cast v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 108
    .line 109
    iget-object v6, v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 110
    .line 111
    invoke-virtual {v6}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-static {v6, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    check-cast v7, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 123
    .line 124
    iget-object v7, v7, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->otherCourseSubscriberList:Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;

    .line 125
    .line 126
    invoke-virtual {v7}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-static {v7, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    filled-new-array {p2, v5, v6, v7}, [Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-virtual {p0, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->S([Landroid/view/View;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    new-instance v5, Lb5/o1;

    .line 153
    .line 154
    invoke-direct {v5, p0}, Lb5/o1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 155
    .line 156
    .line 157
    new-instance v6, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$b;

    .line 158
    .line 159
    invoke-direct {v6, v5}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$b;-><init>(Lx7/l;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2, v2, v6}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    check-cast p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 170
    .line 171
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->title:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 172
    .line 173
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    sget v5, Lcom/zykj/study/R$color;->text_sub_title:I

    .line 178
    .line 179
    invoke-static {v2, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    invoke-virtual {p2, v2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    sget v5, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 191
    .line 192
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-virtual {p2, v2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2, v4}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->l(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 200
    .line 201
    .line 202
    new-instance v2, Lb5/u1;

    .line 203
    .line 204
    invoke-direct {v2, p2}, Lb5/u1;-><init>(Lcom/xuexiang/xui/widget/actionbar/TitleBar;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2, v2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    check-cast p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 215
    .line 216
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 217
    .line 218
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->spRoleSelect:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 219
    .line 220
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    sget v5, Lcom/zykj/study/R$drawable;->free_search_bg:I

    .line 225
    .line 226
    invoke-static {v2, v5}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {p2, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    check-cast p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 238
    .line 239
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 240
    .line 241
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->btBatchDelete:Landroidx/appcompat/widget/AppCompatButton;

    .line 242
    .line 243
    new-instance v2, Lb5/v1;

    .line 244
    .line 245
    invoke-direct {v2, p0}, Lb5/v1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p2, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    check-cast p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 256
    .line 257
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 258
    .line 259
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->spRoleSelect:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 260
    .line 261
    new-instance v2, Lb5/w1;

    .line 262
    .line 263
    invoke-direct {v2, p0}, Lb5/w1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p2, v2}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->t(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$d;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    check-cast p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 274
    .line 275
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 276
    .line 277
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->btSearch:Landroidx/appcompat/widget/AppCompatButton;

    .line 278
    .line 279
    new-instance v2, Lb5/x1;

    .line 280
    .line 281
    invoke-direct {v2, p0}, Lb5/x1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p2, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    check-cast p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 292
    .line 293
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 294
    .line 295
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->btReset:Landroidx/appcompat/widget/AppCompatButton;

    .line 296
    .line 297
    new-instance v2, Lb5/y1;

    .line 298
    .line 299
    invoke-direct {v2, p0}, Lb5/y1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p2, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    check-cast p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 310
    .line 311
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 312
    .line 313
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->tvDateSelect:Landroidx/appcompat/widget/AppCompatTextView;

    .line 314
    .line 315
    new-instance v2, Lb5/z1;

    .line 316
    .line 317
    invoke-direct {v2, p0}, Lb5/z1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p2, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 324
    .line 325
    .line 326
    move-result-object p2

    .line 327
    check-cast p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 328
    .line 329
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 330
    .line 331
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->rvFreeSubscriberList:Landroidx/recyclerview/widget/RecyclerView;

    .line 332
    .line 333
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->h:Lcom/zykj/study/adapter/FreeSubscribeAdapter;

    .line 334
    .line 335
    invoke-virtual {p2, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 339
    .line 340
    .line 341
    move-result-object p2

    .line 342
    check-cast p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 343
    .line 344
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 345
    .line 346
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;->elvSelfGroupList:Landroid/widget/ExpandableListView;

    .line 347
    .line 348
    invoke-virtual {p2, v3}, Landroid/widget/ExpandableListView;->setGroupIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 349
    .line 350
    .line 351
    const/4 p2, 0x2

    .line 352
    new-array p2, p2, [Lcom/zykj/study/bean/OtherSubscribe;

    .line 353
    .line 354
    new-instance v2, Lcom/zykj/study/bean/OtherSubscribe;

    .line 355
    .line 356
    const-wide/16 v5, -0x2

    .line 357
    .line 358
    const-string v7, "\u81ea\u7531\u8ba2\u9605\u8005"

    .line 359
    .line 360
    invoke-direct {v2, v5, v6, v7}, Lcom/zykj/study/bean/OtherSubscribe;-><init>(JLjava/lang/String;)V

    .line 361
    .line 362
    .line 363
    const/4 v5, 0x0

    .line 364
    aput-object v2, p2, v5

    .line 365
    .line 366
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->B()Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-virtual {v2}, Lcom/zykj/lib/login/ui/main/LoginViewModel;->c()Landroidx/datastore/core/DataStore;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-interface {v2}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    iput-object p1, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->a:Ljava/lang/Object;

    .line 383
    .line 384
    iput-object p2, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->b:Ljava/lang/Object;

    .line 385
    .line 386
    iput-object p2, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->c:Ljava/lang/Object;

    .line 387
    .line 388
    iput v4, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->d:I

    .line 389
    .line 390
    const-wide/16 v5, -0x1

    .line 391
    .line 392
    iput-wide v5, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->e:J

    .line 393
    .line 394
    iput v4, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->h:I

    .line 395
    .line 396
    invoke-static {v2, v0}, Ll8/e;->z(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    if-ne p1, v1, :cond_3

    .line 401
    .line 402
    return-object v1

    .line 403
    :cond_3
    move-wide v1, v5

    .line 404
    move-object v5, p2

    .line 405
    move-object p2, p1

    .line 406
    move-object p1, v5

    .line 407
    :goto_1
    check-cast p2, Lcom/zykj/lib/login/proto/UserBean;

    .line 408
    .line 409
    if-eqz p2, :cond_4

    .line 410
    .line 411
    invoke-virtual {p2}, Lcom/zykj/lib/login/proto/UserBean;->getRealName()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object p2

    .line 415
    goto :goto_2

    .line 416
    :cond_4
    move-object p2, v3

    .line 417
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    const-string p2, "\u7684\u5b66\u5458 (\u81ea\u5df1)"

    .line 426
    .line 427
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object p2

    .line 434
    new-instance v0, Lcom/zykj/study/bean/OtherSubscribe;

    .line 435
    .line 436
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/study/bean/OtherSubscribe;-><init>(JLjava/lang/String;)V

    .line 437
    .line 438
    .line 439
    aput-object v0, p1, v4

    .line 440
    .line 441
    invoke-static {v5}, Li7/v;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    new-instance p2, Lcom/zykj/study/adapter/SubscribeTabListAdapter;

    .line 446
    .line 447
    new-instance v0, Lb5/a2;

    .line 448
    .line 449
    invoke-direct {v0, p0}, Lb5/a2;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 450
    .line 451
    .line 452
    invoke-direct {p2, p1, v0}, Lcom/zykj/study/adapter/SubscribeTabListAdapter;-><init>(Ljava/util/List;Lx7/p;)V

    .line 453
    .line 454
    .line 455
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->j:Lcom/zykj/study/adapter/SubscribeTabListAdapter;

    .line 456
    .line 457
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    new-instance v7, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;

    .line 462
    .line 463
    invoke-direct {v7, p0, p1, v3}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/util/ArrayList;Lm7/c;)V

    .line 464
    .line 465
    .line 466
    const/4 v8, 0x3

    .line 467
    const/4 v9, 0x0

    .line 468
    const/4 v5, 0x0

    .line 469
    const/4 v6, 0x0

    .line 470
    invoke-static/range {v4 .. v9}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 471
    .line 472
    .line 473
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    check-cast p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 478
    .line 479
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->subscribeTabList:Landroidx/recyclerview/widget/RecyclerView;

    .line 480
    .line 481
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->j:Lcom/zykj/study/adapter/SubscribeTabListAdapter;

    .line 482
    .line 483
    if-nez p2, :cond_5

    .line 484
    .line 485
    const-string p2, "subscribeTabListAdapter"

    .line 486
    .line 487
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    goto :goto_3

    .line 491
    :cond_5
    move-object v3, p2

    .line 492
    :goto_3
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 500
    .line 501
    .line 502
    move-result-object p1

    .line 503
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 504
    .line 505
    .line 506
    move-result-object p2

    .line 507
    new-instance v0, Lb5/b2;

    .line 508
    .line 509
    invoke-direct {v0, p0}, Lb5/b2;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V

    .line 510
    .line 511
    .line 512
    new-instance v1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$b;

    .line 513
    .line 514
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$b;-><init>(Lx7/l;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 518
    .line 519
    .line 520
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 521
    .line 522
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_management_subscribe:I

    .line 2
    .line 3
    return v0
.end method
