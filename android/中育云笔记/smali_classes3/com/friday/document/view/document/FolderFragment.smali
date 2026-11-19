.class public final Lcom/friday/document/view/document/FolderFragment;
.super Lcom/friday/document/view/document/Hilt_FolderFragment;
.source "SourceFile"

# interfaces
.implements Lj2/f;
.implements Lv2/x;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/document/Hilt_FolderFragment<",
        "Lcom/friday/document/viewmodel/FolderViewModel;",
        "Lcom/friday/document/adapter/DocumentAdapter;",
        "Lcom/friday/document/databinding/FolderFragmentBinding;",
        ">;",
        "Lj2/f;",
        "Lv2/x;"
    }
.end annotation


# instance fields
.field public final k:Ljava/util/Stack;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/document/Hilt_FolderFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/Stack;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/friday/document/view/document/FolderFragment;->k:Ljava/util/Stack;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic R(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/document/model/FolderLevelEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/FolderFragment;->q0(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/document/model/FolderLevelEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lcom/friday/document/view/document/FolderFragment;Ljava/util/List;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/FolderFragment;->k0(Lcom/friday/document/view/document/FolderFragment;Ljava/util/List;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lcom/friday/document/view/document/FolderFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/FolderFragment;->r0(Lcom/friday/document/view/document/FolderFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic U(Lcom/friday/document/view/document/FolderFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/FolderFragment;->n0(Lcom/friday/document/view/document/FolderFragment;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/FolderFragment;->o0(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)V

    return-void
.end method

.method public static synthetic W(Lcom/friday/document/view/document/FolderFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/document/databinding/PopSortBinding;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/document/view/document/FolderFragment;->s0(Lcom/friday/document/view/document/FolderFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/document/databinding/PopSortBinding;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/FolderFragment;->h0(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/UpdateSpecifiedItem;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/FolderFragment;->p0(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/UpdateSpecifiedItem;)V

    return-void
.end method

.method public static synthetic Z(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/FolderFragment;->m0(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Lcom/friday/document/view/document/FolderFragment;Landroid/widget/PopupWindow;Lcom/friday/document/databinding/PopSortBinding;Landroid/widget/RadioGroup;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/document/view/document/FolderFragment;->t0(Lcom/friday/document/view/document/FolderFragment;Landroid/widget/PopupWindow;Lcom/friday/document/databinding/PopSortBinding;Landroid/widget/RadioGroup;I)V

    return-void
.end method

.method public static final synthetic b0(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/view/document/FolderFragment;->f0(Lcom/friday/common/entity/FileEntity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic c0(Lcom/friday/document/view/document/FolderFragment;)Lcom/friday/document/view/document/FileListFragment;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/FolderFragment;->l0()Lcom/friday/document/view/document/FileListFragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d0(Lcom/friday/document/view/document/FolderFragment;)Ljava/util/Stack;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/view/document/FolderFragment;->k:Ljava/util/Stack;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e0(Lcom/friday/document/view/document/FolderFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/FolderFragment;->v0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final h0(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/FolderViewModel;->H0(Lcom/friday/common/entity/FileEntity;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method

.method private final initObserver()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->F()Landroidx/lifecycle/LiveData;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Lv2/o;

    .line 16
    .line 17
    invoke-direct {v2, p0}, Lv2/o;-><init>(Lcom/friday/document/view/document/FolderFragment;)V

    .line 18
    .line 19
    .line 20
    new-instance v3, Lcom/friday/document/view/document/FolderFragment$a;

    .line 21
    .line 22
    invoke-direct {v3, v2}, Lcom/friday/document/view/document/FolderFragment$a;-><init>(Lhd/l;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->j0()Landroidx/lifecycle/MutableLiveData;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v2, Lv2/p;

    .line 43
    .line 44
    invoke-direct {v2, p0}, Lv2/p;-><init>(Lcom/friday/document/view/document/FolderFragment;)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Lcom/friday/document/view/document/FolderFragment$a;

    .line 48
    .line 49
    invoke-direct {v3, v2}, Lcom/friday/document/view/document/FolderFragment$a;-><init>(Lhd/l;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 53
    .line 54
    .line 55
    const-string v0, "SearchToDetailPath"

    .line 56
    .line 57
    const-class v1, Lcom/friday/common/entity/FileEntity;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    new-instance v2, Lv2/q;

    .line 68
    .line 69
    invoke-direct {v2, p0}, Lv2/q;-><init>(Lcom/friday/document/view/document/FolderFragment;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v0, v1, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 73
    .line 74
    .line 75
    const-string v0, "UpdateSelectedNote"

    .line 76
    .line 77
    const-class v1, Lcom/friday/common/entity/UpdateSpecifiedItem;

    .line 78
    .line 79
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v1, Lv2/r;

    .line 84
    .line 85
    invoke-direct {v1, p0}, Lv2/r;-><init>(Lcom/friday/document/view/document/FolderFragment;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v1, "getViewLifecycleOwner(...)"

    .line 96
    .line 97
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    new-instance v5, Lcom/friday/document/view/document/FolderFragment$initObserver$5;

    .line 105
    .line 106
    const/4 v0, 0x0

    .line 107
    invoke-direct {v5, p0, v0}, Lcom/friday/document/view/document/FolderFragment$initObserver$5;-><init>(Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V

    .line 108
    .line 109
    .line 110
    const/4 v6, 0x3

    .line 111
    const/4 v7, 0x0

    .line 112
    const/4 v3, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    new-instance v6, Lcom/friday/document/view/document/FolderFragment$initObserver$6;

    .line 129
    .line 130
    invoke-direct {v6, p0, v0}, Lcom/friday/document/view/document/FolderFragment$initObserver$6;-><init>(Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V

    .line 131
    .line 132
    .line 133
    const/4 v7, 0x3

    .line 134
    const/4 v8, 0x0

    .line 135
    const/4 v5, 0x0

    .line 136
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 144
    .line 145
    invoke-virtual {v2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->E()Landroidx/lifecycle/LiveData;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    new-instance v4, Lv2/s;

    .line 154
    .line 155
    invoke-direct {v4, p0}, Lv2/s;-><init>(Lcom/friday/document/view/document/FolderFragment;)V

    .line 156
    .line 157
    .line 158
    new-instance v5, Lcom/friday/document/view/document/FolderFragment$a;

    .line 159
    .line 160
    invoke-direct {v5, v4}, Lcom/friday/document/view/document/FolderFragment$a;-><init>(Lhd/l;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v3, v5}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    new-instance v6, Lcom/friday/document/view/document/FolderFragment$initObserver$8;

    .line 178
    .line 179
    invoke-direct {v6, p0, v0}, Lcom/friday/document/view/document/FolderFragment$initObserver$8;-><init>(Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V

    .line 180
    .line 181
    .line 182
    const/4 v4, 0x0

    .line 183
    const/4 v5, 0x0

    .line 184
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public static final k0(Lcom/friday/document/view/document/FolderFragment;Ljava/util/List;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->n0(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final m0(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0x30

    .line 15
    .line 16
    if-eq v1, v2, :cond_6

    .line 17
    .line 18
    const/16 v2, 0x31

    .line 19
    .line 20
    if-eq v1, v2, :cond_4

    .line 21
    .line 22
    const/16 v2, 0x36

    .line 23
    .line 24
    if-eq v1, v2, :cond_2

    .line 25
    .line 26
    const/16 v2, 0x621

    .line 27
    .line 28
    if-eq v1, v2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const-string v1, "12"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_5

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const-string v1, "6"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-virtual {p0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->A(Lcom/friday/common/entity/FileEntity;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/friday/document/view/document/FolderFragment;->l0()Lcom/friday/document/view/document/FileListFragment;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isResumed()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_8

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/friday/document/view/document/FileListFragment;->y()Landroidx/recyclerview/widget/RecyclerView;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p0, v0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->N(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    const-string v1, "1"

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_5

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    invoke-virtual {p0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->z(Lcom/friday/common/entity/FileEntity;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/friday/document/view/document/FolderFragment;->l0()Lcom/friday/document/view/document/FileListFragment;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isResumed()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_8

    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/friday/document/view/document/FileListFragment;->y()Landroidx/recyclerview/widget/RecyclerView;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p0, v0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->N(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_6
    const-string v1, "0"

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_7

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_7
    invoke-virtual {p0, p1}, Lcom/friday/document/view/document/FolderFragment;->i0(Lcom/friday/common/entity/FileEntity;)V

    .line 118
    .line 119
    .line 120
    :cond_8
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 121
    .line 122
    return-object p0
.end method

.method public static final n0(Lcom/friday/document/view/document/FolderFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/friday/document/view/document/FolderFragment;->u0()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/friday/document/view/document/FolderFragment;->l0()Lcom/friday/document/view/document/FileListFragment;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Lcom/friday/document/view/document/FileListFragment;->z()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 24
    .line 25
    return-object p0
.end method

.method public static final o0(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final p0(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/UpdateSpecifiedItem;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/friday/common/entity/UpdateSpecifiedItem;->getFromPage()Lcom/friday/common/entity/FromPage;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/friday/common/entity/FromPage;->FROM_FOLDER:Lcom/friday/common/entity/FromPage;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/friday/common/entity/UpdateSpecifiedItem;->getFileId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->s0(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static final q0(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/document/model/FolderLevelEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/FolderFragment;->u0()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final r0(Lcom/friday/document/view/document/FolderFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->q0()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final s0(Lcom/friday/document/view/document/FolderFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/document/databinding/PopSortBinding;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "popupWindow"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "binding"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p3, Lcom/friday/document/databinding/PopSortBinding;->e:Landroid/widget/RadioGroup;

    .line 17
    .line 18
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->j()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p3, Lcom/friday/document/databinding/PopSortBinding;->c:Landroid/widget/RadioButton;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, p3, Lcom/friday/document/databinding/PopSortBinding;->d:Landroid/widget/RadioButton;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/RadioGroup;->check(I)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lv2/u;

    .line 47
    .line 48
    invoke-direct {v0, p0, p2, p3}, Lv2/u;-><init>(Lcom/friday/document/view/document/FolderFragment;Landroid/widget/PopupWindow;Lcom/friday/document/databinding/PopSortBinding;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 55
    .line 56
    return-object p0
.end method

.method public static final t0(Lcom/friday/document/view/document/FolderFragment;Landroid/widget/PopupWindow;Lcom/friday/document/databinding/PopSortBinding;Landroid/widget/RadioGroup;I)V
    .locals 7

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    move-object v2, p0

    .line 9
    move-object v3, p1

    .line 10
    move-object v5, p2

    .line 11
    move v4, p4

    .line 12
    invoke-direct/range {v1 .. v6}, Lcom/friday/document/view/document/FolderFragment$onClick$batchWindow$1$1$1$1;-><init>(Lcom/friday/document/view/document/FolderFragment;Landroid/widget/PopupWindow;ILcom/friday/document/databinding/PopSortBinding;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x3

    .line 16
    const/4 v5, 0x0

    .line 17
    move-object v3, v1

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public a(Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/friday/document/viewmodel/FolderViewModel;->J0(Lvc/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public b(Lcom/friday/common/entity/FileEntity;)V
    .locals 2

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->w0(ZLcom/friday/common/entity/FileEntity;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public c()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->y()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public e(Lcom/friday/document/adapter/a;Lcom/friday/common/entity/FileEntity;)V
    .locals 11

    .line 1
    const-string v0, "option"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/friday/document/adapter/a$d;->b:Lcom/friday/document/adapter/a$d;

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p0, p1, v0, p2}, Lcom/friday/document/view/document/BaseDocumentFragment;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    sget-object v0, Lcom/friday/document/adapter/a$c;->b:Lcom/friday/document/adapter/a$c;

    .line 36
    .line 37
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isConnected()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-string p1, "requireActivity(...)"

    .line 56
    .line 57
    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const/16 v9, 0xf8

    .line 69
    .line 70
    const/4 v10, 0x0

    .line 71
    const/4 v4, 0x0

    .line 72
    const/4 v5, 0x0

    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v8, 0x0

    .line 76
    invoke-static/range {v0 .. v10}, Lcom/friday/common/helper/c;->b(Lcom/friday/common/helper/c;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;ZZLjava/util/ArrayList;ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_1
    const-string p1, "\u5f53\u524d\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8fde\u63a5\u540e\u518d\u6b21\u5c1d\u8bd5"

    .line 81
    .line 82
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    sget-object v0, Lcom/friday/document/adapter/a$b;->b:Lcom/friday/document/adapter/a$b;

    .line 87
    .line 88
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    const-string p1, "\u8bf7\u7b49\u5f85\u7b14\u8bb0\u540c\u6b65\u5b8c\u6210\u540e\u518d\u5220\u9664"

    .line 101
    .line 102
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_3
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p1}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p0, p1}, Lcom/friday/document/view/document/FolderFragment;->j0(Ljava/util/List;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_4
    sget-object v0, Lcom/friday/document/adapter/a$f;->b:Lcom/friday/document/adapter/a$f;

    .line 119
    .line 120
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    invoke-virtual {p0, p2}, Lcom/friday/document/view/document/FolderFragment;->g0(Lcom/friday/common/entity/FileEntity;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_5
    sget-object v0, Lcom/friday/document/adapter/a$e;->b:Lcom/friday/document/adapter/a$e;

    .line 131
    .line 132
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 143
    .line 144
    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/FolderViewModel;->O0(Lcom/friday/common/entity/FileEntity;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_6
    sget-object v0, Lcom/friday/document/adapter/a$a;->b:Lcom/friday/document/adapter/a$a;

    .line 149
    .line 150
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_8

    .line 155
    .line 156
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    check-cast p1, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 161
    .line 162
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->h0()Landroidx/lifecycle/LiveData;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-eqz p1, :cond_7

    .line 177
    .line 178
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    check-cast p1, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 183
    .line 184
    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->z0(Lcom/friday/common/entity/FileEntity;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_7
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 193
    .line 194
    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->t0(Lcom/friday/common/entity/FileEntity;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 199
    .line 200
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 201
    .line 202
    .line 203
    throw p1
.end method

.method public f()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->y0()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->y()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final f0(Lcom/friday/common/entity/FileEntity;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->s(Lcom/friday/common/entity/FileEntity;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final g0(Lcom/friday/common/entity/FileEntity;)V
    .locals 5

    .line 1
    new-instance v0, Lpb/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireContext(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v0, v1, v4, v2, v3}, Lpb/d;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/n;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lv2/v;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lv2/v;-><init>(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)V

    .line 21
    .line 22
    .line 23
    const-string p1, "\u5373\u5c06\u5220\u9664\u8be5\u7b14\u8bb0\u6587\u4ef6\uff0c\u5e76\u4ece\u670d\u52a1\u5668\u91cd\u65b0\u83b7\u53d6\u3002\u672a\u6210\u529f\u540c\u6b65\u5230\u670d\u52a1\u5668\u7684\u6587\u4ef6\u5185\u5bb9\u5c06\u65e0\u6cd5\u627e\u56de\u3002"

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v0, p1, v2, v1, v2}, Lpb/d;->g(Ljava/lang/String;ZLhd/a;Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->folder_fragment:I

    .line 2
    .line 3
    return v0
.end method

.method public final i0(Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/view/document/FolderFragment;->f0(Lcom/friday/common/entity/FileEntity;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->y()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public initData()V
    .locals 4

    .line 1
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireActivity(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 13
    .line 14
    .line 15
    const-class v1, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/friday/document/view/document/BaseDocumentFragment;->P(Lcom/friday/document/viewmodel/BaseFileViewModel;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/friday/document/view/document/FolderFragment;->k:Ljava/util/Stack;

    .line 27
    .line 28
    new-instance v1, Lcom/friday/document/view/document/FileListFragment;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 35
    .line 36
    const-string v3, "0"

    .line 37
    .line 38
    invoke-direct {v1, p0, v2, v3}, Lcom/friday/document/view/document/FileListFragment;-><init>(Lv2/x;Lcom/friday/document/viewmodel/FolderViewModel;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->F()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/friday/document/view/document/FolderFragment;->initView()V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Lcom/friday/document/view/document/FolderFragment;->initObserver()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public initView()V
    .locals 8

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseFragment;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->h0()Landroidx/lifecycle/LiveData;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Lcom/friday/document/databinding/FolderFragmentBinding;->a(Landroidx/lifecycle/LiveData;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->i0()Landroidx/lifecycle/LiveData;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Lcom/friday/document/databinding/FolderFragmentBinding;->c(Landroidx/lifecycle/LiveData;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget v1, Lcom/friday/document/R$id;->fragment_list:I

    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/friday/document/view/document/FolderFragment;->l0()Lcom/friday/document/view/document/FileListFragment;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    sget v1, Lcom/friday/document/R$id;->fragment_preview:I

    .line 85
    .line 86
    new-instance v2, Lcom/friday/document/view/FolderPreviewFragment;

    .line 87
    .line 88
    invoke-direct {v2}, Lcom/friday/document/view/FolderPreviewFragment;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 103
    .line 104
    iget-object v0, v0, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 105
    .line 106
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 107
    .line 108
    new-instance v1, Lv2/n;

    .line 109
    .line 110
    invoke-direct {v1, p0}, Lv2/n;-><init>(Lcom/friday/document/view/document/FolderFragment;)V

    .line 111
    .line 112
    .line 113
    const-wide/16 v2, 0x1f4

    .line 114
    .line 115
    invoke-static {v0, v2, v3, v1}, Lcom/blankj/utilcode/util/ClickUtils;->applySingleDebouncing(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 123
    .line 124
    iget-object v0, v0, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 125
    .line 126
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->f:Landroidx/appcompat/widget/AppCompatImageView;

    .line 127
    .line 128
    const-string v1, "ivSearch"

    .line 129
    .line 130
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 138
    .line 139
    iget-object v1, v1, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 140
    .line 141
    iget-object v1, v1, Lcom/friday/document/databinding/LayoutFileFolderBinding;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 142
    .line 143
    const-string v2, "ivMore"

    .line 144
    .line 145
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    check-cast v2, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 153
    .line 154
    iget-object v2, v2, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 155
    .line 156
    iget-object v2, v2, Lcom/friday/document/databinding/LayoutFileFolderBinding;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 157
    .line 158
    const-string v3, "ivSync"

    .line 159
    .line 160
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const/4 v3, 0x3

    .line 164
    new-array v4, v3, [Landroid/view/View;

    .line 165
    .line 166
    const/4 v5, 0x0

    .line 167
    aput-object v0, v4, v5

    .line 168
    .line 169
    const/4 v0, 0x1

    .line 170
    aput-object v1, v4, v0

    .line 171
    .line 172
    const/4 v1, 0x2

    .line 173
    aput-object v2, v4, v1

    .line 174
    .line 175
    invoke-virtual {p0, v4}, Lcom/friday/common/base/BaseFragment;->setClickListener([Landroid/view/View;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    check-cast v2, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 183
    .line 184
    iget-object v2, v2, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 185
    .line 186
    iget-object v2, v2, Lcom/friday/document/databinding/LayoutFileFolderBinding;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 187
    .line 188
    const-string v4, "tvMove"

    .line 189
    .line 190
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    check-cast v4, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 198
    .line 199
    iget-object v4, v4, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 200
    .line 201
    iget-object v4, v4, Lcom/friday/document/databinding/LayoutFileFolderBinding;->j:Landroidx/appcompat/widget/AppCompatTextView;

    .line 202
    .line 203
    const-string v6, "tvDelete"

    .line 204
    .line 205
    invoke-static {v4, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    check-cast v6, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 213
    .line 214
    iget-object v6, v6, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 215
    .line 216
    iget-object v6, v6, Lcom/friday/document/databinding/LayoutFileFolderBinding;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 217
    .line 218
    const-string v7, "tvCancel"

    .line 219
    .line 220
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    new-array v3, v3, [Landroid/view/View;

    .line 224
    .line 225
    aput-object v2, v3, v5

    .line 226
    .line 227
    aput-object v4, v3, v0

    .line 228
    .line 229
    aput-object v6, v3, v1

    .line 230
    .line 231
    invoke-virtual {p0, v3}, Lcom/friday/common/base/BaseFragment;->setClickListener([Landroid/view/View;)V

    .line 232
    .line 233
    .line 234
    return-void
.end method

.method public j()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v0, v3, v1, v2, v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->x0(Lcom/friday/document/viewmodel/BaseFileViewModel;ZLcom/friday/common/entity/FileEntity;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final j0(Ljava/util/List;)V
    .locals 5

    .line 1
    new-instance v0, Lpb/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireContext(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v0, v1, v4, v2, v3}, Lpb/d;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/n;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lv2/t;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lv2/t;-><init>(Lcom/friday/document/view/document/FolderFragment;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    const-string p1, "\u5185\u5bb9\u5c06\u88ab\u5220\u9664\uff0c\u53ef\u5728\u56de\u6536\u7ad9\u4e2d\u6062\u590d"

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v0, p1, v2, v1, v2}, Lpb/d;->g(Ljava/lang/String;ZLhd/a;Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final l0()Lcom/friday/document/view/document/FileListFragment;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/document/FolderFragment;->k:Ljava/util/Stack;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "peek(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/friday/document/view/document/FileListFragment;

    .line 13
    .line 14
    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/friday/common/base/BaseFragment;->onClick(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-instance v5, Lcom/friday/document/view/document/FolderFragment$onClick$1;

    .line 31
    .line 32
    invoke-direct {v5, p0, v1}, Lcom/friday/document/view/document/FolderFragment$onClick$1;-><init>(Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V

    .line 33
    .line 34
    .line 35
    const/4 v6, 0x3

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 48
    .line 49
    iget-object v0, v0, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->f:Landroidx/appcompat/widget/AppCompatImageView;

    .line 52
    .line 53
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    sget-object p1, Lk2/v;->a:Lk2/v$a;

    .line 60
    .line 61
    const-string v0, "Search"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sget-object p1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/friday/common/helper/c;->n()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 77
    .line 78
    iget-object v0, v0, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 79
    .line 80
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 81
    .line 82
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    new-instance v0, Lm2/a$a;

    .line 89
    .line 90
    new-instance v1, Lm2/a;

    .line 91
    .line 92
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const-string v3, "requireContext(...)"

    .line 97
    .line 98
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v1, v2}, Lm2/a;-><init>(Landroid/content/Context;)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v0, v1}, Lm2/a$a;-><init>(Lm2/a;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v1}, Lcom/friday/document/databinding/PopSortBinding;->a(Landroid/view/LayoutInflater;)Lcom/friday/document/databinding/PopSortBinding;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const-string v2, "inflate(...)"

    .line 116
    .line 117
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lm2/a$a;->b(Landroidx/databinding/ViewDataBinding;)Lm2/a$a;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const/4 v1, -0x2

    .line 125
    invoke-virtual {v0, v1, v1}, Lm2/a$a;->e(II)Lm2/a$a;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const/4 v1, 0x1

    .line 130
    invoke-virtual {v0, v1}, Lm2/a$a;->d(Z)Lm2/a$a;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    new-instance v1, Lv2/m;

    .line 135
    .line 136
    invoke-direct {v1, p0}, Lv2/m;-><init>(Lcom/friday/document/view/document/FolderFragment;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1}, Lm2/a$a;->c(Lhd/q;)Lm2/a$a;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Lm2/a$a;->a()Lm2/a;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const/16 v1, 0x50

    .line 148
    .line 149
    const/4 v2, 0x0

    .line 150
    invoke-virtual {v0, p1, v2, v2, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_2
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 159
    .line 160
    iget-object v0, v0, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 161
    .line 162
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 163
    .line 164
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_3

    .line 169
    .line 170
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    const-string v0, "getViewLifecycleOwner(...)"

    .line 175
    .line 176
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    new-instance v5, Lcom/friday/document/view/document/FolderFragment$onClick$2;

    .line 184
    .line 185
    invoke-direct {v5, p0, v1}, Lcom/friday/document/view/document/FolderFragment$onClick$2;-><init>(Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V

    .line 186
    .line 187
    .line 188
    const/4 v6, 0x3

    .line 189
    const/4 v7, 0x0

    .line 190
    const/4 v3, 0x0

    .line 191
    const/4 v4, 0x0

    .line 192
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_3
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 201
    .line 202
    iget-object v0, v0, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 203
    .line 204
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->j:Landroidx/appcompat/widget/AppCompatTextView;

    .line 205
    .line 206
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_8

    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    check-cast p1, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 217
    .line 218
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->V()Lvd/u;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-interface {p1}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    check-cast p1, Ljava/util/List;

    .line 227
    .line 228
    check-cast p1, Ljava/lang/Iterable;

    .line 229
    .line 230
    instance-of v0, p1, Ljava/util/Collection;

    .line 231
    .line 232
    if-eqz v0, :cond_4

    .line 233
    .line 234
    move-object v0, p1

    .line 235
    check-cast v0, Ljava/util/Collection;

    .line 236
    .line 237
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_4

    .line 242
    .line 243
    goto :goto_0

    .line 244
    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-eqz v1, :cond_6

    .line 253
    .line 254
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 259
    .line 260
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_5

    .line 265
    .line 266
    const-string p1, "\u5b58\u5728\u672a\u540c\u6b65\u7684\u7b14\u8bb0\uff0c\u8bf7\u7b49\u5f85\u7b14\u8bb0\u540c\u6b65\u5b8c\u6210\u540e\u518d\u5220\u9664"

    .line 267
    .line 268
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :cond_6
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 273
    .line 274
    const/16 v1, 0xa

    .line 275
    .line 276
    invoke-static {p1, v1}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 281
    .line 282
    .line 283
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-eqz v1, :cond_7

    .line 292
    .line 293
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 298
    .line 299
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    goto :goto_1

    .line 307
    :cond_7
    invoke-virtual {p0, v0}, Lcom/friday/document/view/document/FolderFragment;->j0(Ljava/util/List;)V

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :cond_8
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    check-cast v0, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 316
    .line 317
    iget-object v0, v0, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 318
    .line 319
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 320
    .line 321
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    if-eqz p1, :cond_9

    .line 326
    .line 327
    invoke-virtual {p0}, Lcom/friday/document/view/document/FolderFragment;->j()V

    .line 328
    .line 329
    .line 330
    :cond_9
    return-void
.end method

.method public onResume()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v3, Lcom/friday/document/view/document/FolderFragment$onResume$1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v3, p0, v1}, Lcom/friday/document/view/document/FolderFragment$onResume$1;-><init>(Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x3

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/friday/document/view/document/FolderFragment;->u0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final u0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->g0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 22
    .line 23
    const/16 v1, 0x8

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileFolderBinding;->k:Landroidx/appcompat/widget/AppCompatTextView;

    .line 37
    .line 38
    sget v1, Lcom/friday/document/R$string;->folder:I

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->p0()Lcom/friday/document/model/FolderLevelEntity;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 63
    .line 64
    iget-object v1, v1, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 65
    .line 66
    iget-object v1, v1, Lcom/friday/document/databinding/LayoutFileFolderBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Lcom/friday/document/databinding/FolderFragmentBinding;

    .line 77
    .line 78
    iget-object v1, v1, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 79
    .line 80
    iget-object v1, v1, Lcom/friday/document/databinding/LayoutFileFolderBinding;->k:Landroidx/appcompat/widget/AppCompatTextView;

    .line 81
    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/friday/document/model/FolderLevelEntity;->getFileName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const/4 v0, 0x0

    .line 90
    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final v0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/FolderViewModel;->P0()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
