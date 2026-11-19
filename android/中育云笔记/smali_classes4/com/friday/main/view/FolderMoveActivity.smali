.class public final Lcom/friday/main/view/FolderMoveActivity;
.super Lcom/friday/main/view/Hilt_FolderMoveActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/main/FolderMoveActivity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/main/view/Hilt_FolderMoveActivity<",
        "Lcom/friday/main/databinding/FolderMoveActivityBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public g:Ljava/lang/String;

.field public h:Ljava/util/ArrayList;

.field public i:Ljava/lang/String;

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Ljava/util/ArrayList;

.field public final n:Lqc/d;

.field public final o:Lqc/d;

.field public final p:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/main/view/Hilt_FolderMoveActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/friday/main/view/FolderMoveActivity;->g:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lcom/friday/main/view/FolderMoveActivity;->h:Ljava/util/ArrayList;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/friday/main/view/FolderMoveActivity;->i:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/friday/main/view/FolderMoveActivity;->m:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance v0, Lcom/friday/main/view/FolderMoveActivity$special$$inlined$viewModels$default$1;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lcom/friday/main/view/FolderMoveActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 30
    .line 31
    const-class v2, Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 32
    .line 33
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v3, Lcom/friday/main/view/FolderMoveActivity$special$$inlined$viewModels$default$2;

    .line 38
    .line 39
    invoke-direct {v3, p0}, Lcom/friday/main/view/FolderMoveActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 40
    .line 41
    .line 42
    new-instance v4, Lcom/friday/main/view/FolderMoveActivity$special$$inlined$viewModels$default$3;

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    invoke-direct {v4, v5, p0}, Lcom/friday/main/view/FolderMoveActivity$special$$inlined$viewModels$default$3;-><init>(Lhd/a;Landroidx/activity/ComponentActivity;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lcom/friday/main/view/FolderMoveActivity;->n:Lqc/d;

    .line 52
    .line 53
    new-instance v0, Lv3/l0;

    .line 54
    .line 55
    invoke-direct {v0}, Lv3/l0;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Lcom/friday/main/view/FolderMoveActivity;->o:Lqc/d;

    .line 63
    .line 64
    new-instance v0, Lv3/m0;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lv3/m0;-><init>(Lcom/friday/main/view/FolderMoveActivity;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lcom/friday/main/view/FolderMoveActivity;->p:Lqc/d;

    .line 74
    .line 75
    return-void
.end method

.method public static synthetic N()Lcom/friday/main/adapter/PathNameAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/main/view/FolderMoveActivity;->h0()Lcom/friday/main/adapter/PathNameAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic O(Lcom/friday/main/view/FolderMoveActivity;)Lcom/friday/main/adapter/FolderMoveAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/main/view/FolderMoveActivity;->X(Lcom/friday/main/view/FolderMoveActivity;)Lcom/friday/main/adapter/FolderMoveAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lcom/friday/main/view/FolderMoveActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/main/view/FolderMoveActivity;->e0(Lcom/friday/main/view/FolderMoveActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic Q(Lcom/friday/main/view/FolderMoveActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/FolderMoveActivity;->f0(Lcom/friday/main/view/FolderMoveActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic R(Lcom/friday/main/view/FolderMoveActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/main/view/FolderMoveActivity;->c0(Lcom/friday/main/view/FolderMoveActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic S(Lcom/friday/main/view/FolderMoveActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/FolderMoveActivity;->d0(Lcom/friday/main/view/FolderMoveActivity;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic T(Lcom/friday/main/view/FolderMoveActivity;)Lcom/friday/main/adapter/FolderMoveAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic U(Lcom/friday/main/view/FolderMoveActivity;)Lcom/friday/main/databinding/FolderMoveActivityBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/main/databinding/FolderMoveActivityBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic V(Lcom/friday/main/view/FolderMoveActivity;)Lcom/friday/main/viewmodel/FolderMoveViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic W(Lcom/friday/main/view/FolderMoveActivity;)Lcom/friday/main/adapter/PathNameAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->a0()Lcom/friday/main/adapter/PathNameAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final X(Lcom/friday/main/view/FolderMoveActivity;)Lcom/friday/main/adapter/FolderMoveAdapter;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/main/adapter/FolderMoveAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/friday/main/model/FileDiffCallback;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/friday/main/model/FileDiffCallback;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setDiffCallback(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroid/widget/TextView;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    const/high16 p0, 0x41800000    # 16.0f

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 26
    .line 27
    .line 28
    sget p0, Lcom/friday/main/R$string;->no_content:I

    .line 29
    .line 30
    invoke-static {p0}, Lz1/b;->f(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    sget p0, Lcom/friday/main/R$color;->app_l_dark:I

    .line 38
    .line 39
    invoke-static {p0}, Lz1/b;->a(I)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 44
    .line 45
    .line 46
    const/16 p0, 0x11

    .line 47
    .line 48
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setGravity(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setEmptyView(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method public static final c0(Lcom/friday/main/view/FolderMoveActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

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
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const-string p3, "0"

    .line 24
    .line 25
    invoke-static {p2, p3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    const/4 p3, 0x0

    .line 36
    invoke-virtual {p2, p3}, Lcom/friday/main/adapter/FolderMoveAdapter;->l(Lcom/friday/common/entity/FileEntity;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p2, p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->K(Lcom/friday/common/entity/FileEntity;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Lcom/friday/main/view/FolderMoveActivity;->g0(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p2}, Lcom/friday/main/adapter/FolderMoveAdapter;->k()Lcom/friday/common/entity/FileEntity;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_1

    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getCached()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-nez p2, :cond_2

    .line 74
    .line 75
    const-string p0, "\u8be5\u7b14\u8bb0\u672a\u4e0b\u8f7d\uff0c\u65e0\u6cd5\u9009\u4e2d"

    .line 76
    .line 77
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    invoke-virtual {p3}, Lcom/friday/main/adapter/FolderMoveAdapter;->k()Lcom/friday/common/entity/FileEntity;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    invoke-virtual {p2, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemPosition(Ljava/lang/Object;)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    invoke-virtual {p3, p1}, Lcom/friday/main/adapter/FolderMoveAdapter;->l(Lcom/friday/common/entity/FileEntity;)V

    .line 102
    .line 103
    .line 104
    if-ltz p2, :cond_3

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    invoke-virtual {p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    if-ge p2, p3, :cond_3

    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 121
    .line 122
    .line 123
    :cond_3
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemPosition(Ljava/lang/Object;)I

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    invoke-virtual {p2, p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public static final d0(Lcom/friday/main/view/FolderMoveActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final e0(Lcom/friday/main/view/FolderMoveActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

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
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->a0()Lcom/friday/main/adapter/PathNameAdapter;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const/4 p3, 0x0

    .line 24
    invoke-virtual {p2, p3}, Lcom/friday/main/adapter/FolderMoveAdapter;->l(Lcom/friday/common/entity/FileEntity;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2, p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->K(Lcom/friday/common/entity/FileEntity;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Lcom/friday/main/view/FolderMoveActivity;->g0(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static final f0(Lcom/friday/main/view/FolderMoveActivity;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isConnected()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const-string p0, "\u5f53\u524d\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8fde\u63a5\u540e\u518d\u6b21\u5c1d\u8bd5"

    .line 8
    .line 9
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-boolean p1, p0, Lcom/friday/main/view/FolderMoveActivity;->l:Z

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->z()Lvd/u;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/util/List;

    .line 38
    .line 39
    invoke-static {v0}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object p0, p0, Lcom/friday/main/view/FolderMoveActivity;->g:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p1, v0, p0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->J(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    iget-boolean p1, p0, Lcom/friday/main/view/FolderMoveActivity;->j:Z

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lcom/friday/main/adapter/FolderMoveAdapter;->k()Lcom/friday/common/entity/FileEntity;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-nez p1, :cond_2

    .line 68
    .line 69
    const-string p0, "\u8bf7\u5148\u9009\u4e2d\u4e00\u4e2a\u76ee\u6807\u7b14\u8bb0"

    .line 70
    .line 71
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object v0, p0, Lcom/friday/main/view/FolderMoveActivity;->m:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Lcom/friday/main/adapter/FolderMoveAdapter;->k()Lcom/friday/common/entity/FileEntity;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v0, p0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->s(Ljava/util/List;Lcom/friday/common/entity/FileEntity;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->z()Lvd/u;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-interface {p1}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Ljava/util/List;

    .line 109
    .line 110
    invoke-static {p1}, Lrc/g0;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 115
    .line 116
    if-eqz p1, :cond_4

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    goto :goto_0

    .line 123
    :cond_4
    const/4 p1, 0x0

    .line 124
    :goto_0
    iget-object v1, p0, Lcom/friday/main/view/FolderMoveActivity;->i:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_5

    .line 131
    .line 132
    const-string p0, "\u6587\u4ef6\u4e0d\u53ef\u4ee5\u79fb\u52a8\u5230\u4ed6\u5f53\u524d\u6240\u5904\u7684\u4f4d\u7f6e"

    .line 133
    .line 134
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_5
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, Lcom/friday/main/view/FolderMoveActivity;->g:Ljava/lang/String;

    .line 142
    .line 143
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-lez p1, :cond_6

    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->z()Lvd/u;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-interface {v0}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Ljava/util/List;

    .line 166
    .line 167
    invoke-static {v0}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 172
    .line 173
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    iget-object p0, p0, Lcom/friday/main/view/FolderMoveActivity;->g:Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {p1, v0, p0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->G(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_6
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->z()Lvd/u;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-interface {v0}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, Ljava/util/List;

    .line 200
    .line 201
    invoke-static {v0}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 206
    .line 207
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    iget-object p0, p0, Lcom/friday/main/view/FolderMoveActivity;->h:Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-virtual {p1, v0, p0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->H(Ljava/lang/String;Ljava/util/List;)V

    .line 214
    .line 215
    .line 216
    return-void
.end method

.method public static final h0()Lcom/friday/main/adapter/PathNameAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/main/adapter/PathNameAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/main/adapter/PathNameAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final Y()Lcom/friday/main/adapter/FolderMoveAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/FolderMoveActivity;->p:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/FolderMoveActivity;->n:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final a0()Lcom/friday/main/adapter/PathNameAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/FolderMoveActivity;->o:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/main/adapter/PathNameAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final b0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    new-instance v1, Lv3/o0;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lv3/o0;-><init>(Lcom/friday/main/view/FolderMoveActivity;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 24
    .line 25
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v1, p0, v2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->a0()Lcom/friday/main/adapter/PathNameAdapter;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->a0()Lcom/friday/main/adapter/PathNameAdapter;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v2, Lv3/p0;

    .line 50
    .line 51
    invoke-direct {v2, p0}, Lv3/p0;-><init>(Lcom/friday/main/view/FolderMoveActivity;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lo1/d;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;

    .line 62
    .line 63
    iget-object v0, v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 64
    .line 65
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 75
    .line 76
    .line 77
    new-instance v2, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-direct {v2, v3, v1}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    sget v3, Lcom/friday/main/R$drawable;->shape_ground:I

    .line 91
    .line 92
    invoke-static {v1, v3}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-eqz v1, :cond_0

    .line 97
    .line 98
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 99
    .line 100
    .line 101
    :cond_0
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Y()Lcom/friday/main/adapter/FolderMoveAdapter;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    new-instance v1, Lv3/q0;

    .line 116
    .line 117
    invoke-direct {v1, p0}, Lv3/q0;-><init>(Lcom/friday/main/view/FolderMoveActivity;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lo1/d;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public final g0(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/FolderMoveActivity;->g:Ljava/lang/String;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-boolean v1, p0, Lcom/friday/main/view/FolderMoveActivity;->k:Z

    .line 14
    .line 15
    iget-boolean v2, p0, Lcom/friday/main/view/FolderMoveActivity;->j:Z

    .line 16
    .line 17
    iget-object v3, p0, Lcom/friday/main/view/FolderMoveActivity;->g:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->y(ZZLjava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0, p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->x(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/folder_move_activity (0x7f0c0056), APK res/F_.xml
    sget v0, Lcom/friday/main/R$layout;->folder_move_activity:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/alibaba/android/arouter/launcher/ARouter;->inject(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/friday/main/view/FolderMoveActivity;->l:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;->g:Landroid/widget/TextView;

    .line 19
    .line 20
    const-string v1, "\u6062\u590d\u5230\u6b64\u5904"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;->h:Landroid/widget/TextView;

    .line 32
    .line 33
    const-string v1, "\u6062\u590d"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-boolean v0, p0, Lcom/friday/main/view/FolderMoveActivity;->j:Z

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;

    .line 48
    .line 49
    iget-object v0, v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;->g:Landroid/widget/TextView;

    .line 50
    .line 51
    const-string v1, "\u590d\u5236\u5230\u6b64\u7b14\u8bb0"

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;

    .line 61
    .line 62
    iget-object v0, v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;->h:Landroid/widget/TextView;

    .line 63
    .line 64
    const-string v1, "\u8de8\u7b14\u8bb0\u590d\u5236"

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;

    .line 75
    .line 76
    iget-object v0, v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;->g:Landroid/widget/TextView;

    .line 77
    .line 78
    sget v1, Lcom/friday/main/R$string;->move_to_here:I

    .line 79
    .line 80
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;

    .line 92
    .line 93
    iget-object v0, v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;->h:Landroid/widget/TextView;

    .line 94
    .line 95
    sget v1, Lcom/friday/main/R$string;->move:I

    .line 96
    .line 97
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    .line 103
    .line 104
    :goto_0
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->initView()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->initDataSource()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->Z()Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v1, p0, Lcom/friday/main/view/FolderMoveActivity;->i:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->v(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public initDataSource()V
    .locals 13

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->initDataSource()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/main/view/FolderMoveActivity;->i:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/friday/main/view/FolderMoveActivity;->g0(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v4, Lcom/friday/main/view/FolderMoveActivity$initDataSource$1;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {v4, p0, v0}, Lcom/friday/main/view/FolderMoveActivity$initDataSource$1;-><init>(Lcom/friday/main/view/FolderMoveActivity;Lvc/c;)V

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
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    new-instance v10, Lcom/friday/main/view/FolderMoveActivity$initDataSource$2;

    .line 31
    .line 32
    invoke-direct {v10, p0, v0}, Lcom/friday/main/view/FolderMoveActivity$initDataSource$2;-><init>(Lcom/friday/main/view/FolderMoveActivity;Lvc/c;)V

    .line 33
    .line 34
    .line 35
    const/4 v11, 0x3

    .line 36
    const/4 v12, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x0

    .line 39
    invoke-static/range {v7 .. v12}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    new-instance v4, Lcom/friday/main/view/FolderMoveActivity$initDataSource$3;

    .line 47
    .line 48
    invoke-direct {v4, p0, v0}, Lcom/friday/main/view/FolderMoveActivity$initDataSource$3;-><init>(Lcom/friday/main/view/FolderMoveActivity;Lvc/c;)V

    .line 49
    .line 50
    .line 51
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    new-instance v10, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4;

    .line 59
    .line 60
    invoke-direct {v10, p0, v0}, Lcom/friday/main/view/FolderMoveActivity$initDataSource$4;-><init>(Lcom/friday/main/view/FolderMoveActivity;Lvc/c;)V

    .line 61
    .line 62
    .line 63
    invoke-static/range {v7 .. v12}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-instance v4, Lcom/friday/main/view/FolderMoveActivity$initDataSource$5;

    .line 71
    .line 72
    invoke-direct {v4, p0, v0}, Lcom/friday/main/view/FolderMoveActivity$initDataSource$5;-><init>(Lcom/friday/main/view/FolderMoveActivity;Lvc/c;)V

    .line 73
    .line 74
    .line 75
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public initView()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;->f:Landroidx/appcompat/widget/Toolbar;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/friday/main/databinding/FolderMoveActivityBinding;->g:Landroid/widget/TextView;

    .line 32
    .line 33
    const-string v1, "tvConfirm"

    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lv3/n0;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Lv3/n0;-><init>(Lcom/friday/main/view/FolderMoveActivity;)V

    .line 41
    .line 42
    .line 43
    const-wide/16 v2, 0x7d0

    .line 44
    .line 45
    invoke-static {v0, v2, v3, v1}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/friday/main/view/FolderMoveActivity;->b0()V

    .line 49
    .line 50
    .line 51
    return-void
.end method
