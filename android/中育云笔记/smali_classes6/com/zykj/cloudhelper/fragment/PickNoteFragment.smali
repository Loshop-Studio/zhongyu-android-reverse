.class public final Lcom/zykj/cloudhelper/fragment/PickNoteFragment;
.super Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/cloudhelper/fragment/PickNoteFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/cloudhelper/fragment/BaseNoteFragment<",
        "Lcom/zykj/cloudhelper/databinding/FragmentPickNoteBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final i:Lcom/zykj/cloudhelper/fragment/PickNoteFragment$a;

.field public static final j:I


# instance fields
.field public e:Lua/a;

.field public final f:Lqc/d;

.field public final g:Lqc/d;

.field public h:Lua/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->i:Lcom/zykj/cloudhelper/fragment/PickNoteFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->j:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/cloudhelper/fragment/PickNoteFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/cloudhelper/fragment/PickNoteFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/zykj/cloudhelper/fragment/PickNoteFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->f:Lqc/d;

    .line 31
    .line 32
    new-instance v0, Lva/e;

    .line 33
    .line 34
    invoke-direct {v0}, Lva/e;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->g:Lqc/d;

    .line 42
    .line 43
    return-void
.end method

.method private final B()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->f:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final C(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;Ljava/util/LinkedHashMap;)Lqc/q;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const-string p0, "\u6682\u65e0\u6570\u636e"

    .line 8
    .line 9
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->A()Lcom/zykj/cloudhelper/adapter/NotePickAdapter;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {p0, p1, v2}, Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;->s(Ljava/util/LinkedHashMap;Z)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/util/Collection;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->setList(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->A()Lcom/zykj/cloudhelper/adapter/NotePickAdapter;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Ln1/b;

    .line 38
    .line 39
    const-string v1, "null cannot be cast to non-null type com.zykj.cloudhelper.entity.NoteHelperNode"

    .line 40
    .line 41
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    check-cast p1, Lua/a;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->e:Lua/a;

    .line 47
    .line 48
    invoke-virtual {p1}, Lua/a;->a()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/4 p1, 0x0

    .line 64
    :goto_0
    if-nez p1, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->A()Lcom/zykj/cloudhelper/adapter/NotePickAdapter;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const/16 p1, 0x6e

    .line 78
    .line 79
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p0, v0, v2, v2, p1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->C(IZZLjava/lang/Object;)I

    .line 84
    .line 85
    .line 86
    :cond_3
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 87
    .line 88
    return-object p0
.end method

.method public static final D(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->h:Lua/a;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    new-array p0, p0, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string p1, "\u8bf7\u9009\u62e9\u5fae\u8bfe\u6587\u4ef6"

    .line 9
    .line 10
    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    :goto_0
    iget-object v0, p0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->h:Lua/a;

    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lua/a;->d()Lcom/friday/common/entity/NoteBean;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lcom/friday/common/entity/NoteBean;->getFullMicroLessonOssUrl()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, p0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->h:Lua/a;

    .line 40
    .line 41
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lua/a;->d()Lcom/friday/common/entity/NoteBean;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Lcom/friday/common/entity/NoteBean;->getMicroCoverOssUrl()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    const-string v2, "ossUrl"

    .line 55
    .line 56
    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    :cond_2
    if-eqz p1, :cond_3

    .line 60
    .line 61
    const-string v0, "microCoverOssUrl"

    .line 62
    .line 63
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    const/4 v1, -0x1

    .line 73
    invoke-virtual {v0, v1, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-eqz p0, :cond_5

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 83
    .line 84
    .line 85
    :cond_5
    return-void
.end method

.method public static final E(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static final F(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 4

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
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->A()Lcom/zykj/cloudhelper/adapter/NotePickAdapter;

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
    check-cast p1, Ln1/b;

    .line 18
    .line 19
    instance-of p2, p1, Lua/a;

    .line 20
    .line 21
    if-eqz p2, :cond_6

    .line 22
    .line 23
    check-cast p1, Lua/a;

    .line 24
    .line 25
    invoke-virtual {p1}, Lua/a;->d()Lcom/friday/common/entity/NoteBean;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2}, Lcom/friday/common/entity/NoteBean;->getType()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "0"

    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x1

    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    invoke-virtual {p1}, Lua/a;->a()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/4 v0, 0x0

    .line 59
    :goto_0
    if-nez v0, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->A()Lcom/zykj/cloudhelper/adapter/NotePickAdapter;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const/16 v3, 0x6e

    .line 73
    .line 74
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v0, p3, v2, v2, v3}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->C(IZZLjava/lang/Object;)I

    .line 79
    .line 80
    .line 81
    :cond_2
    iget-object p3, p0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->e:Lua/a;

    .line 82
    .line 83
    if-eqz p3, :cond_3

    .line 84
    .line 85
    invoke-virtual {p3}, Lua/a;->d()Lcom/friday/common/entity/NoteBean;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    if-eqz p3, :cond_3

    .line 90
    .line 91
    invoke-virtual {p3, v1}, Lcom/friday/common/entity/NoteBean;->setSelected(Z)V

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {p2, v2}, Lcom/friday/common/entity/NoteBean;->setSelected(Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->A()Lcom/zykj/cloudhelper/adapter/NotePickAdapter;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->e:Lua/a;

    .line 105
    .line 106
    return-void

    .line 107
    :cond_4
    iget-object p3, p0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->h:Lua/a;

    .line 108
    .line 109
    if-eqz p3, :cond_5

    .line 110
    .line 111
    invoke-virtual {p3}, Lua/a;->d()Lcom/friday/common/entity/NoteBean;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    if-eqz p3, :cond_5

    .line 116
    .line 117
    invoke-virtual {p3, v1}, Lcom/friday/common/entity/NoteBean;->setSelected(Z)V

    .line 118
    .line 119
    .line 120
    :cond_5
    invoke-virtual {p2, v2}, Lcom/friday/common/entity/NoteBean;->setSelected(Z)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->A()Lcom/zykj/cloudhelper/adapter/NotePickAdapter;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 128
    .line 129
    .line 130
    iput-object p1, p0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->h:Lua/a;

    .line 131
    .line 132
    :cond_6
    return-void
.end method

.method public static final G()Lcom/zykj/cloudhelper/adapter/NotePickAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/cloudhelper/adapter/NotePickAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/cloudhelper/adapter/NotePickAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic v(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->F(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic w()Lcom/zykj/cloudhelper/adapter/NotePickAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->G()Lcom/zykj/cloudhelper/adapter/NotePickAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic x(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->E(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic y(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;Ljava/util/LinkedHashMap;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->C(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;Ljava/util/LinkedHashMap;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->D(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final A()Lcom/zykj/cloudhelper/adapter/NotePickAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->g:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/cloudhelper/adapter/NotePickAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/cloudhelper/R$layout;->fragment_pick_note:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/cloudhelper/databinding/FragmentPickNoteBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/FragmentPickNoteBinding;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->A()Lcom/zykj/cloudhelper/adapter/NotePickAdapter;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    sget v4, Lcom/zykj/cloudhelper/R$drawable;->shape_item_divider:I

    .line 43
    .line 44
    invoke-static {v2, v4}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->B()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    new-instance v2, Lva/a;

    .line 70
    .line 71
    invoke-direct {v2, p0}, Lva/a;-><init>(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;)V

    .line 72
    .line 73
    .line 74
    new-instance v4, Lcom/zykj/cloudhelper/fragment/PickNoteFragment$b;

    .line 75
    .line 76
    invoke-direct {v4, v2}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment$b;-><init>(Lhd/l;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1, v4}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Lcom/zykj/cloudhelper/databinding/FragmentPickNoteBinding;

    .line 87
    .line 88
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/FragmentPickNoteBinding;->e:Landroid/widget/TextView;

    .line 89
    .line 90
    const-string v1, "tvEnsure"

    .line 91
    .line 92
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v1, Lva/b;

    .line 96
    .line 97
    invoke-direct {v1, p0}, Lva/b;-><init>(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;)V

    .line 98
    .line 99
    .line 100
    const-wide/16 v4, 0x3e8

    .line 101
    .line 102
    invoke-static {v0, v4, v5, v1}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Lcom/zykj/cloudhelper/databinding/FragmentPickNoteBinding;

    .line 110
    .line 111
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/FragmentPickNoteBinding;->d:Landroid/widget/TextView;

    .line 112
    .line 113
    new-instance v1, Lva/c;

    .line 114
    .line 115
    invoke-direct {v1, p0}, Lva/c;-><init>(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->A()Lcom/zykj/cloudhelper/adapter/NotePickAdapter;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    new-instance v1, Lva/d;

    .line 126
    .line 127
    invoke-direct {v1, p0}, Lva/d;-><init>(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lo1/d;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v3}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 134
    .line 135
    .line 136
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->B()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0, v3}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->l(Z)V

    .line 141
    .line 142
    .line 143
    return-void
.end method
