.class public final Lcom/friday/main/view/FullScreenPreviewActivity;
.super Lcom/friday/main/view/Hilt_FullScreenPreviewActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/main/NotePreviewActivity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/main/view/Hilt_FullScreenPreviewActivity<",
        "Lcom/friday/main/databinding/FullScreenActivityBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final g:Lqc/d;

.field public final h:Lqc/d;

.field public i:Lcom/friday/common/entity/FileEntity;

.field public j:Ljava/lang/String;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/main/view/Hilt_FullScreenPreviewActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/main/view/FullScreenPreviewActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/main/view/FullScreenPreviewActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/friday/main/view/FullScreenPreviewActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/friday/main/view/FullScreenPreviewActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/friday/main/view/FullScreenPreviewActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/friday/main/view/FullScreenPreviewActivity$special$$inlined$viewModels$default$3;-><init>(Lhd/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->g:Lqc/d;

    .line 32
    .line 33
    new-instance v0, Lv3/t0;

    .line 34
    .line 35
    invoke-direct {v0}, Lv3/t0;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->h:Lqc/d;

    .line 43
    .line 44
    const-string v0, ""

    .line 45
    .line 46
    iput-object v0, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->j:Ljava/lang/String;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    iput-boolean v1, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->l:Z

    .line 50
    .line 51
    iput-object v0, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->n:Ljava/lang/String;

    .line 52
    .line 53
    return-void
.end method

.method public static synthetic N(Lcom/friday/main/view/FullScreenPreviewActivity;Ljava/util/List;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/FullScreenPreviewActivity;->a0(Lcom/friday/main/view/FullScreenPreviewActivity;Ljava/util/List;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lcom/friday/main/view/FullScreenPreviewActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/FullScreenPreviewActivity;->Z(Lcom/friday/main/view/FullScreenPreviewActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lcom/friday/main/view/FullScreenPreviewActivity;Ljava/util/List;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/FullScreenPreviewActivity;->b0(Lcom/friday/main/view/FullScreenPreviewActivity;Ljava/util/List;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lcom/friday/main/view/FullScreenPreviewActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/FullScreenPreviewActivity;->d0(Lcom/friday/main/view/FullScreenPreviewActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic R(Lcom/friday/main/view/FullScreenPreviewActivity;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/FullScreenPreviewActivity;->c0(Lcom/friday/main/view/FullScreenPreviewActivity;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    return-void
.end method

.method public static synthetic S(Lcom/friday/main/view/FullScreenPreviewActivity;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/main/view/FullScreenPreviewActivity;->e0(Lcom/friday/main/view/FullScreenPreviewActivity;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T()Lcom/friday/main/adapter/FullScreenPreviewAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/main/view/FullScreenPreviewActivity;->W()Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic U(Lcom/friday/main/view/FullScreenPreviewActivity;)Lcom/friday/common/entity/FileEntity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->i:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic V(Lcom/friday/main/view/FullScreenPreviewActivity;)Lcom/friday/main/viewmodel/FullScreenViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->Y()Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final W()Lcom/friday/main/adapter/FullScreenPreviewAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/main/adapter/FullScreenPreviewAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final Z(Lcom/friday/main/view/FullScreenPreviewActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iput-object p1, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->i:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/friday/main/databinding/FullScreenActivityBinding;->n:Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/friday/main/view/FullScreenPreviewActivity;->f0(Lcom/friday/common/entity/FileEntity;)V

    .line 21
    .line 22
    .line 23
    iget-boolean v0, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->m:Z

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->Y()Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0, p1}, Lcom/friday/main/viewmodel/FullScreenViewModel;->l(Lcom/friday/common/entity/FileEntity;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->Y()Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0, p1}, Lcom/friday/main/viewmodel/FullScreenViewModel;->k(Lcom/friday/common/entity/FileEntity;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 43
    .line 44
    return-object p0
.end method

.method public static final a0(Lcom/friday/main/view/FullScreenPreviewActivity;Ljava/util/List;)Lqc/q;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/Collection;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->X()Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {p1}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v1, 0x2

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {v0, p1, v2, v1, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setDiffNewData$default(Lcom/chad/library/adapter/base/BaseQuickAdapter;Ljava/util/List;Ljava/lang/Runnable;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->X()Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 33
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 37
    .line 38
    return-object p0
.end method

.method public static final b0(Lcom/friday/main/view/FullScreenPreviewActivity;Ljava/util/List;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->X()Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p1, Ljava/util/Collection;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final c0(Lcom/friday/main/view/FullScreenPreviewActivity;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->X()Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/friday/main/adapter/FullScreenPreviewAdapter;->l()V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    invoke-virtual {p1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final d0(Lcom/friday/main/view/FullScreenPreviewActivity;Landroid/view/View;)V
    .locals 14

    .line 1
    iget-object p1, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->i:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-boolean p0, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->m:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/16 v5, 0x8

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static/range {v0 .. v6}, Lcom/friday/common/helper/c;->h(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    sget-object v7, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    const/16 v12, 0x8

    .line 46
    .line 47
    const/4 v13, 0x0

    .line 48
    const/4 v11, 0x0

    .line 49
    invoke-static/range {v7 .. v13}, Lcom/friday/common/helper/c;->j(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public static final e0(Lcom/friday/main/view/FullScreenPreviewActivity;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;)Lqc/q;
    .locals 5

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
    const-string p1, "dataBinding"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-boolean p1, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->l:Z

    .line 17
    .line 18
    const/16 v0, 0x8

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    iget-object p1, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->i:Lcom/friday/common/entity/FileEntity;

    .line 23
    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    iget-object v1, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->f:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v4, "\u4fee\u6539\u65f6\u95f4\uff1a"

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->e:Landroid/widget/TextView;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getCreateTime()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v4, "\u521b\u5efa\u65f6\u95f4\uff1a"

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->syncUncompleted()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    iget-object v0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->d:Landroid/widget/LinearLayout;

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->h:Landroid/widget/TextView;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->isFailedState()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_0

    .line 100
    .line 101
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->c:Landroid/widget/ImageView;

    .line 102
    .line 103
    sget p1, Lcom/friday/main/R$drawable;->icon_sync_failed:I

    .line 104
    .line 105
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 106
    .line 107
    .line 108
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->g:Landroid/widget/TextView;

    .line 109
    .line 110
    const-string p1, "\u6587\u4ef6\u540c\u6b65\u5931\u8d25"

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->g:Landroid/widget/TextView;

    .line 116
    .line 117
    const/high16 p1, -0x10000

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    iget-object p1, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->c:Landroid/widget/ImageView;

    .line 124
    .line 125
    sget v0, Lcom/friday/main/R$drawable;->icon_to_be_synced:I

    .line 126
    .line 127
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->g:Landroid/widget/TextView;

    .line 131
    .line 132
    const-string v0, "\u6587\u4ef6\u7b49\u5f85\u540c\u6b65"

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->g:Landroid/widget/TextView;

    .line 138
    .line 139
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    sget p3, Lcom/friday/main/R$color;->app_l_dark:I

    .line 144
    .line 145
    invoke-static {p0, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_1
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->d:Landroid/widget/LinearLayout;

    .line 154
    .line 155
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 156
    .line 157
    .line 158
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->h:Landroid/widget/TextView;

    .line 159
    .line 160
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 161
    .line 162
    .line 163
    :goto_0
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->dismiss()V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_2
    iget-object p1, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->f:Landroid/widget/TextView;

    .line 168
    .line 169
    iget-object p0, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->n:Ljava/lang/String;

    .line 170
    .line 171
    new-instance v1, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    const-string v2, "\u6536\u5230\u5206\u4eab\uff1a"

    .line 177
    .line 178
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->e:Landroid/widget/TextView;

    .line 192
    .line 193
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->dismiss()V

    .line 197
    .line 198
    .line 199
    :cond_3
    :goto_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 200
    .line 201
    return-object p0
.end method


# virtual methods
.method public final X()Lcom/friday/main/adapter/FullScreenPreviewAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->h:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final Y()Lcom/friday/main/viewmodel/FullScreenViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->g:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final f0(Lcom/friday/common/entity/FileEntity;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->syncUncompleted()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/friday/main/databinding/FullScreenActivityBinding;->g:Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget v1, Lcom/friday/main/R$drawable;->ic_error_note_info:I

    .line 20
    .line 21
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 34
    .line 35
    iget-object p1, p1, Lcom/friday/main/databinding/FullScreenActivityBinding;->g:Landroid/widget/ImageView;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget v1, Lcom/friday/main/R$mipmap;->icon_note_info:I

    .line 42
    .line 43
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/full_screen_activity (0x7f0c0069), APK res/pF1.xml
    sget v0, Lcom/friday/main/R$layout;->full_screen_activity:I

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
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->initView()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->initDataSource()V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->l:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->Y()Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->j:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/friday/main/viewmodel/FullScreenViewModel;->j(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->Y()Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->j:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/friday/main/viewmodel/FullScreenViewModel;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public initDataSource()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->initDataSource()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->Y()Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/FullScreenViewModel;->i()Landroidx/lifecycle/MutableLiveData;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lv3/u0;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lv3/u0;-><init>(Lcom/friday/main/view/FullScreenPreviewActivity;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lcom/friday/main/view/FullScreenPreviewActivity$a;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Lcom/friday/main/view/FullScreenPreviewActivity$a;-><init>(Lhd/l;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->Y()Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/FullScreenViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Lv3/v0;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Lv3/v0;-><init>(Lcom/friday/main/view/FullScreenPreviewActivity;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lcom/friday/main/view/FullScreenPreviewActivity$a;

    .line 39
    .line 40
    invoke-direct {v2, v1}, Lcom/friday/main/view/FullScreenPreviewActivity$a;-><init>(Lhd/l;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->Y()Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/FullScreenViewModel;->m()Landroidx/lifecycle/LiveData;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Lv3/w0;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lv3/w0;-><init>(Lcom/friday/main/view/FullScreenPreviewActivity;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Lcom/friday/main/view/FullScreenPreviewActivity$a;

    .line 60
    .line 61
    invoke-direct {v2, v1}, Lcom/friday/main/view/FullScreenPreviewActivity$a;-><init>(Lhd/l;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public initView()V
    .locals 9

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->initView()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->k:Z

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/friday/main/databinding/FullScreenActivityBinding;->e:Landroid/widget/ImageView;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-boolean v0, p0, Lcom/friday/main/view/FullScreenPreviewActivity;->l:Z

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/friday/main/databinding/FullScreenActivityBinding;->d:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 41
    .line 42
    iget-object v0, v0, Lcom/friday/main/databinding/FullScreenActivityBinding;->f:Landroid/widget/ImageView;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 53
    .line 54
    iget-object v0, v0, Lcom/friday/main/databinding/FullScreenActivityBinding;->e:Landroid/widget/ImageView;

    .line 55
    .line 56
    sget v2, Lcom/friday/main/R$mipmap;->icon_full_screen:I

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 66
    .line 67
    iget-object v0, v0, Lcom/friday/main/databinding/FullScreenActivityBinding;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    .line 69
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 70
    .line 71
    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 75
    .line 76
    .line 77
    const/4 v2, 0x1

    .line 78
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->X()Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 93
    .line 94
    iget-object v0, v0, Lcom/friday/main/databinding/FullScreenActivityBinding;->k:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 95
    .line 96
    new-instance v3, Lv3/s0;

    .line 97
    .line 98
    invoke-direct {v3, p0, v0}, Lv3/s0;-><init>(Lcom/friday/main/view/FullScreenPreviewActivity;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->X()Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    new-instance v3, Lcom/friday/main/adapter/FullScreenPreviewAdapter$FullScreenPreviewDiff;

    .line 109
    .line 110
    invoke-direct {v3}, Lcom/friday/main/adapter/FullScreenPreviewAdapter$FullScreenPreviewDiff;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setDiffCallback(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 121
    .line 122
    iget-object v0, v0, Lcom/friday/main/databinding/FullScreenActivityBinding;->f:Landroid/widget/ImageView;

    .line 123
    .line 124
    const-string v3, "ivFinish"

    .line 125
    .line 126
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    check-cast v3, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 134
    .line 135
    iget-object v3, v3, Lcom/friday/main/databinding/FullScreenActivityBinding;->e:Landroid/widget/ImageView;

    .line 136
    .line 137
    const-string v4, "ivCancelFullScreen"

    .line 138
    .line 139
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    check-cast v4, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 147
    .line 148
    iget-object v4, v4, Lcom/friday/main/databinding/FullScreenActivityBinding;->i:Landroid/widget/ImageView;

    .line 149
    .line 150
    const-string v5, "ivNoteRename"

    .line 151
    .line 152
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    check-cast v5, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 160
    .line 161
    iget-object v5, v5, Lcom/friday/main/databinding/FullScreenActivityBinding;->h:Landroid/widget/ImageView;

    .line 162
    .line 163
    const-string v6, "ivNoteLabel"

    .line 164
    .line 165
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    check-cast v6, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 173
    .line 174
    iget-object v6, v6, Lcom/friday/main/databinding/FullScreenActivityBinding;->g:Landroid/widget/ImageView;

    .line 175
    .line 176
    const-string v7, "ivNoteInfo"

    .line 177
    .line 178
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    check-cast v7, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 186
    .line 187
    iget-object v7, v7, Lcom/friday/main/databinding/FullScreenActivityBinding;->d:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 188
    .line 189
    const-string v8, "fabEdit"

    .line 190
    .line 191
    invoke-static {v7, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    const/4 v8, 0x6

    .line 195
    new-array v8, v8, [Landroid/view/View;

    .line 196
    .line 197
    aput-object v0, v8, v1

    .line 198
    .line 199
    aput-object v3, v8, v2

    .line 200
    .line 201
    const/4 v0, 0x2

    .line 202
    aput-object v4, v8, v0

    .line 203
    .line 204
    const/4 v0, 0x3

    .line 205
    aput-object v5, v8, v0

    .line 206
    .line 207
    const/4 v0, 0x4

    .line 208
    aput-object v6, v8, v0

    .line 209
    .line 210
    const/4 v0, 0x5

    .line 211
    aput-object v7, v8, v0

    .line 212
    .line 213
    invoke-virtual {p0, v8}, Lcom/friday/common/base/BaseActivity;->setClickListener([Landroid/view/View;)V

    .line 214
    .line 215
    .line 216
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/friday/common/base/BaseActivity;->onClick(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/friday/main/databinding/FullScreenActivityBinding;->f:Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_3

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/friday/main/databinding/FullScreenActivityBinding;->e:Landroid/widget/ImageView;

    .line 30
    .line 31
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/friday/main/databinding/FullScreenActivityBinding;->g:Landroid/widget/ImageView;

    .line 45
    .line 46
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    new-instance v0, Lm2/a$a;

    .line 53
    .line 54
    new-instance v1, Lm2/a;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lm2/a;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v1}, Lm2/a$a;-><init>(Lm2/a;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v1}, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->a(Landroid/view/LayoutInflater;)Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const-string v2, "inflate(...)"

    .line 71
    .line 72
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lm2/a$a;->b(Landroidx/databinding/ViewDataBinding;)Lm2/a$a;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    sget v2, Lcom/friday/main/R$dimen;->view_168:I

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    float-to-int v1, v1

    .line 90
    const/4 v2, -0x2

    .line 91
    invoke-virtual {v0, v1, v2}, Lm2/a$a;->e(II)Lm2/a$a;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const/4 v1, 0x1

    .line 96
    invoke-virtual {v0, v1}, Lm2/a$a;->d(Z)Lm2/a$a;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v1, Lv3/x0;

    .line 101
    .line 102
    invoke-direct {v1, p0}, Lv3/x0;-><init>(Lcom/friday/main/view/FullScreenPreviewActivity;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Lm2/a$a;->c(Lhd/q;)Lm2/a$a;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Lm2/a$a;->a()Lm2/a;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const/16 v1, 0x50

    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    invoke-virtual {v0, p1, v2, v2, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Lcom/friday/main/databinding/FullScreenActivityBinding;

    .line 125
    .line 126
    iget-object v0, v0, Lcom/friday/main/databinding/FullScreenActivityBinding;->d:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 127
    .line 128
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_2

    .line 133
    .line 134
    new-instance v0, Lv3/y0;

    .line 135
    .line 136
    invoke-direct {v0, p0}, Lv3/y0;-><init>(Lcom/friday/main/view/FullScreenPreviewActivity;)V

    .line 137
    .line 138
    .line 139
    const-wide/16 v1, 0x1f4

    .line 140
    .line 141
    invoke-static {p1, v1, v2, v0}, Lcom/blankj/utilcode/util/ClickUtils;->applyGlobalDebouncing(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 142
    .line 143
    .line 144
    :cond_2
    return-void

    .line 145
    :cond_3
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public onResume()V
    .locals 7

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/main/view/FullScreenPreviewActivity;->X()Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/friday/main/adapter/FullScreenPreviewAdapter;->j()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v4, Lcom/friday/main/view/FullScreenPreviewActivity$onResume$1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p0, v0}, Lcom/friday/main/view/FullScreenPreviewActivity$onResume$1;-><init>(Lcom/friday/main/view/FullScreenPreviewActivity;Lvc/c;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 26
    .line 27
    .line 28
    return-void
.end method
