.class public final Lcom/friday/document/view/document/RecycleBinFragment;
.super Lcom/friday/document/view/document/Hilt_RecycleBinFragment;
.source "SourceFile"

# interfaces
.implements Lj2/h;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/document/Hilt_RecycleBinFragment<",
        "Lcom/friday/document/viewmodel/RecycleBinViewModel;",
        "Lcom/friday/document/adapter/RecycleBinAdapter;",
        "Lcom/friday/document/databinding/FragmentRecycleBinBinding;",
        ">;",
        "Lj2/h;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/document/Hilt_RecycleBinFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic R(Lcom/friday/document/view/document/RecycleBinFragment;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/RecycleBinFragment;->d0(Lcom/friday/document/view/document/RecycleBinFragment;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lcom/friday/document/view/document/RecycleBinFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/RecycleBinFragment;->a0(Lcom/friday/document/view/document/RecycleBinFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lcom/friday/document/view/document/RecycleBinFragment;Landroidx/paging/CombinedLoadStates;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/RecycleBinFragment;->f0(Lcom/friday/document/view/document/RecycleBinFragment;Landroidx/paging/CombinedLoadStates;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U(Lcom/friday/document/view/document/RecycleBinFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/RecycleBinFragment;->b0(Lcom/friday/document/view/document/RecycleBinFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V(Lcom/friday/document/view/document/RecycleBinFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/view/document/RecycleBinFragment;->e0(Lcom/friday/document/view/document/RecycleBinFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W(Lcom/friday/document/view/document/RecycleBinFragment;Lcom/friday/document/adapter/c;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/view/document/RecycleBinFragment;->Z(Lcom/friday/document/view/document/RecycleBinFragment;Lcom/friday/document/adapter/c;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(Lcom/friday/document/view/document/RecycleBinFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/RecycleBinFragment;->c0(Lcom/friday/document/view/document/RecycleBinFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    return-void
.end method

.method public static final synthetic Y(Lcom/friday/document/view/document/RecycleBinFragment;)Lcom/friday/document/databinding/FragmentRecycleBinBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/databinding/FragmentRecycleBinBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final Z(Lcom/friday/document/view/document/RecycleBinFragment;Lcom/friday/document/adapter/c;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "option"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "fileEntity"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Lcom/friday/document/adapter/c$c;->b:Lcom/friday/document/adapter/c$c;

    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    const-string v4, "\u5f53\u524d\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8fde\u63a5\u540e\u518d\u6b21\u5c1d\u8bd5"

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    sget-object v0, Lf2/c;->a:Lf2/c;

    .line 27
    .line 28
    invoke-virtual {v0}, Lf2/c;->e()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    sget-object v5, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 35
    .line 36
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const-string v0, "requireActivity(...)"

    .line 41
    .line 42
    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    const/16 v14, 0xb8

    .line 50
    .line 51
    const/4 v15, 0x0

    .line 52
    const-string v7, "0"

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v10, 0x0

    .line 56
    const/4 v11, 0x0

    .line 57
    const/4 v12, 0x1

    .line 58
    const/4 v13, 0x0

    .line 59
    invoke-static/range {v5 .. v15}, Lcom/friday/common/helper/c;->b(Lcom/friday/common/helper/c;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;ZZLjava/util/ArrayList;ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    new-array v0, v3, [Ljava/lang/Object;

    .line 64
    .line 65
    invoke-static {v4, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    sget-object v2, Lcom/friday/document/adapter/c$b;->b:Lcom/friday/document/adapter/c$b;

    .line 70
    .line 71
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    sget-object v0, Lf2/c;->a:Lf2/c;

    .line 78
    .line 79
    invoke-virtual {v0}, Lf2/c;->e()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    sget-object v0, Lcom/friday/common/widget/dialog/a;->a:Lcom/friday/common/widget/dialog/a;

    .line 86
    .line 87
    new-instance v2, Lv2/m0;

    .line 88
    .line 89
    move-object/from16 v3, p0

    .line 90
    .line 91
    invoke-direct {v2, v3, v1}, Lv2/m0;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;Lcom/friday/common/entity/FileEntity;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v2}, Lcom/friday/common/widget/dialog/a;->F(Lhd/a;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const-string v2, "getChildFragmentManager(...)"

    .line 103
    .line 104
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v0, v1, v2}, Lcom/friday/common/widget/dialog/BaseDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    new-array v0, v3, [Ljava/lang/Object;

    .line 120
    .line 121
    invoke-static {v4, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    move-object/from16 v3, p0

    .line 126
    .line 127
    sget-object v2, Lcom/friday/document/adapter/c$a;->b:Lcom/friday/document/adapter/c$a;

    .line 128
    .line 129
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_4

    .line 134
    .line 135
    invoke-virtual {v3}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->t0(Lcom/friday/common/entity/FileEntity;)V

    .line 142
    .line 143
    .line 144
    :goto_0
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 145
    .line 146
    return-object v0

    .line 147
    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 148
    .line 149
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 150
    .line 151
    .line 152
    throw v0
.end method

.method public static final a0(Lcom/friday/document/view/document/RecycleBinFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/RecycleBinViewModel;->K0(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 19
    .line 20
    return-object p0
.end method

.method public static final b0(Lcom/friday/document/view/document/RecycleBinFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/adapter/RecycleBinAdapter;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/friday/document/adapter/RecycleBinAdapter;->n()V

    .line 8
    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/16 v2, 0x31

    .line 24
    .line 25
    if-eq v1, v2, :cond_4

    .line 26
    .line 27
    const/16 v2, 0x36

    .line 28
    .line 29
    if-eq v1, v2, :cond_2

    .line 30
    .line 31
    const/16 v2, 0x621

    .line 32
    .line 33
    if-eq v1, v2, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const-string v1, "12"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_5

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const-string v1, "6"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {p0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->A(Lcom/friday/common/entity/FileEntity;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    const-string v1, "1"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_5

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_5
    invoke-virtual {p0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->z(Lcom/friday/common/entity/FileEntity;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Lcom/friday/document/databinding/FragmentRecycleBinBinding;

    .line 75
    .line 76
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentRecycleBinBinding;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 77
    .line 78
    const-string v1, "recyclerView"

    .line 79
    .line 80
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p0, v0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->N(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 91
    .line 92
    return-object p0
.end method

.method public static final c0(Lcom/friday/document/view/document/RecycleBinFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->y()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->isRefreshing()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->A0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static final d0(Lcom/friday/document/view/document/RecycleBinFragment;Landroid/view/View;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 7
    .line 8
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    sget-object p1, Lcom/friday/common/widget/dialog/a;->a:Lcom/friday/common/widget/dialog/a;

    .line 15
    .line 16
    new-instance v0, Lv2/o0;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lv2/o0;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/friday/common/widget/dialog/a;->F(Lhd/a;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, "getChildFragmentManager(...)"

    .line 30
    .line 31
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, p0, v0}, Lcom/friday/common/widget/dialog/BaseDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p0, 0x0

    .line 47
    new-array p0, p0, [Ljava/lang/Object;

    .line 48
    .line 49
    const-string p1, "\u5f53\u524d\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8fde\u63a5\u540e\u518d\u6b21\u5c1d\u8bd5"

    .line 50
    .line 51
    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 55
    .line 56
    return-object p0
.end method

.method public static final e0(Lcom/friday/document/view/document/RecycleBinFragment;)Lqc/q;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/friday/document/adapter/RecycleBinAdapter;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/paging/PagingDataAdapter;->snapshot()Landroidx/paging/ItemSnapshotList;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroidx/paging/ItemSnapshotList;->getItems()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/lang/Iterable;

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    const/16 v2, 0xa

    .line 26
    .line 27
    invoke-static {p0, v2}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v0, v1}, Lcom/friday/document/viewmodel/RecycleBinViewModel;->K0(Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 66
    .line 67
    return-object p0
.end method

.method public static final f0(Lcom/friday/document/view/document/RecycleBinFragment;Landroidx/paging/CombinedLoadStates;)Lqc/q;
    .locals 3

    .line 1
    const-string v0, "loadState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/friday/document/databinding/FragmentRecycleBinBinding;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentRecycleBinBinding;->c:Landroid/widget/TextView;

    .line 13
    .line 14
    const-string v1, "emptyView"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/paging/CombinedLoadStates;->getSource()Landroidx/paging/LoadStates;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    instance-of v1, v1, Landroidx/paging/LoadState$NotLoading;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/paging/CombinedLoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lcom/friday/document/adapter/RecycleBinAdapter;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroidx/paging/PagingDataAdapter;->getItemCount()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    const/4 p1, 0x1

    .line 53
    if-ge p0, p1, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move p1, v2

    .line 57
    :goto_0
    if-eqz p1, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/16 v2, 0x8

    .line 61
    .line 62
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 66
    .line 67
    return-object p0
.end method

.method private final initObserver()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v5, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v5, p0, v0}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$1;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;Lvc/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x3

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v6, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$2;

    .line 39
    .line 40
    invoke-direct {v6, p0, v0}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$2;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;Lvc/c;)V

    .line 41
    .line 42
    .line 43
    const/4 v7, 0x3

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    new-instance v6, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3;

    .line 61
    .line 62
    invoke-direct {v6, p0, v0}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$3;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;Lvc/c;)V

    .line 63
    .line 64
    .line 65
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    new-instance v6, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;

    .line 80
    .line 81
    invoke-direct {v6, p0, v0}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;Lvc/c;)V

    .line 82
    .line 83
    .line 84
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->F()Landroidx/lifecycle/LiveData;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    new-instance v2, Lv2/n0;

    .line 102
    .line 103
    invoke-direct {v2, p0}, Lv2/n0;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;)V

    .line 104
    .line 105
    .line 106
    new-instance v3, Lcom/friday/document/view/document/RecycleBinFragment$a;

    .line 107
    .line 108
    invoke-direct {v3, v2}, Lcom/friday/document/view/document/RecycleBinFragment$a;-><init>(Lhd/l;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->fragment_recycle_bin:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 3

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
    const-class v1, Lcom/friday/document/viewmodel/RecycleBinViewModel;

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
    new-instance v0, Lcom/friday/document/adapter/RecycleBinAdapter;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 33
    .line 34
    new-instance v2, Lv2/i0;

    .line 35
    .line 36
    invoke-direct {v2, p0}, Lv2/i0;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v1, v2}, Lcom/friday/document/adapter/RecycleBinAdapter;-><init>(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lhd/p;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lcom/friday/document/view/document/BaseDocumentFragment;->O(Landroidx/paging/PagingDataAdapter;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/RecycleBinViewModel;->H0()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->F()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/friday/document/view/document/RecycleBinFragment;->initView()V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, Lcom/friday/document/view/document/RecycleBinFragment;->initObserver()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public initView()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentRecycleBinBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentRecycleBinBinding;->i:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 8
    .line 9
    sget v1, Lcom/friday/document/R$color;->colorAccent:I

    .line 10
    .line 11
    invoke-static {v1}, Lz1/b;->a(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    filled-new-array {v1}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeColors([I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lv2/j0;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, Lv2/j0;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/friday/document/databinding/FragmentRecycleBinBinding;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentRecycleBinBinding;->e:Landroid/widget/ImageView;

    .line 37
    .line 38
    const-string v1, "ivClean"

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lv2/k0;

    .line 44
    .line 45
    invoke-direct {v1, p0}, Lv2/k0;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lgb/b;->e(Landroid/view/View;Lhd/l;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lcom/friday/document/databinding/FragmentRecycleBinBinding;

    .line 56
    .line 57
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentRecycleBinBinding;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 58
    .line 59
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 69
    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$1;

    .line 76
    .line 77
    invoke-direct {v1, v0}, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lcom/friday/document/adapter/RecycleBinAdapter;

    .line 95
    .line 96
    new-instance v1, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2;

    .line 97
    .line 98
    invoke-direct {v1, p0}, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Lcom/friday/document/adapter/RecycleBinAdapter;

    .line 109
    .line 110
    new-instance v1, Lv2/l0;

    .line 111
    .line 112
    invoke-direct {v1, p0}, Lv2/l0;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Landroidx/paging/PagingDataAdapter;->addLoadStateListener(Lhd/l;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sget v1, Lcom/friday/document/R$id;->preview_container:I

    .line 127
    .line 128
    new-instance v2, Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 129
    .line 130
    invoke-direct {v2}, Lcom/friday/document/view/RecycleBinPreviewFragment;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 138
    .line 139
    .line 140
    return-void
.end method
