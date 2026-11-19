.class public final Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;
.super Lcom/zykj/cloudhelper/fragment/Hilt_StoreNoteFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/cloudhelper/fragment/Hilt_StoreNoteFragment<",
        "Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final m:Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$a;

.field public static final n:I


# instance fields
.field public j:Lua/a;

.field public final k:Lqc/d;

.field public final l:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->m:Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->n:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/Hilt_StoreNoteFragment;-><init>()V

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
    new-instance v1, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->k:Lqc/d;

    .line 31
    .line 32
    new-instance v0, Lva/f;

    .line 33
    .line 34
    invoke-direct {v0}, Lva/f;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->l:Lqc/d;

    .line 42
    .line 43
    return-void
.end method

.method public static synthetic A(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Lcom/friday/common/entity/NoteBean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->O(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Lcom/friday/common/entity/NoteBean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->L(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->K(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->V()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic E(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->S(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic F(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Ljava/util/LinkedHashMap;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->M(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Ljava/util/LinkedHashMap;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->P(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->T(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V

    return-void
.end method

.method private final J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->k:Lqc/d;

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

.method public static final K(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p0, "\u6587\u4ef6\u5b58\u50a8\u5931\u8d25"

    .line 22
    .line 23
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 27
    .line 28
    return-object p0
.end method

.method public static final L(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const-string p0, "\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 12
    .line 13
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final M(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Ljava/util/LinkedHashMap;)Lqc/q;
    .locals 4

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
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->I()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x2

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {p0, p1, v0, v2, v3}, Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;->t(Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;Ljava/util/LinkedHashMap;ZILjava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/util/Collection;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->setList(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->I()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ln1/b;

    .line 39
    .line 40
    const-string v1, "null cannot be cast to non-null type com.zykj.cloudhelper.entity.NoteHelperNode"

    .line 41
    .line 42
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    check-cast p1, Lua/a;

    .line 46
    .line 47
    iput-object p1, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->j:Lua/a;

    .line 48
    .line 49
    invoke-virtual {p1}, Lua/a;->a()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :cond_1
    if-nez v3, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->I()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    const/16 p1, 0x6e

    .line 77
    .line 78
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const/4 v1, 0x1

    .line 83
    invoke-virtual {p0, v0, v1, v1, p1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->C(IZZLjava/lang/Object;)I

    .line 84
    .line 85
    .line 86
    :cond_3
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 87
    .line 88
    return-object p0
.end method

.method public static final N(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 3

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
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->I()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

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
    if-eqz p2, :cond_4

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
    if-eqz v0, :cond_4

    .line 40
    .line 41
    invoke-virtual {p1}, Lua/a;->a()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 v0, 0x0

    .line 57
    :goto_0
    const/4 v1, 0x1

    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->I()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/16 v2, 0x6e

    .line 72
    .line 73
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v0, p3, v1, v1, v2}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->C(IZZLjava/lang/Object;)I

    .line 78
    .line 79
    .line 80
    :cond_2
    iget-object p3, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->j:Lua/a;

    .line 81
    .line 82
    if-eqz p3, :cond_3

    .line 83
    .line 84
    invoke-virtual {p3}, Lua/a;->d()Lcom/friday/common/entity/NoteBean;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    if-eqz p3, :cond_3

    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    invoke-virtual {p3, v0}, Lcom/friday/common/entity/NoteBean;->setSelected(Z)V

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {p2, v1}, Lcom/friday/common/entity/NoteBean;->setSelected(Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->I()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->j:Lua/a;

    .line 105
    .line 106
    :cond_4
    return-void
.end method

.method public static final O(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Lcom/friday/common/entity/NoteBean;)Lqc/q;
    .locals 7

    .line 1
    const-string v0, "\u521b\u5efa\u5931\u8d25"

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->j:Lua/a;

    .line 6
    .line 7
    if-eqz v1, :cond_4

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p1, v0}, Lcom/friday/common/entity/NoteBean;->setSelected(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lua/a;->d()Lcom/friday/common/entity/NoteBean;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Lcom/friday/common/entity/NoteBean;->setSelected(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v1}, Lua/a;->a()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v2, 0x0

    .line 39
    :goto_0
    new-instance v4, Lua/a;

    .line 40
    .line 41
    new-instance v5, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lua/a;->e()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    add-int/2addr v6, v0

    .line 51
    invoke-direct {v4, v5, p1, v6}, Lua/a;-><init>(Ljava/util/List;Lcom/friday/common/entity/NoteBean;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->I()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1, v1, v3, v4}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->F(Ln1/b;ILn1/b;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->I()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 66
    .line 67
    .line 68
    if-nez v2, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-nez p1, :cond_3

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->I()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->I()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemPosition(Ljava/lang/Object;)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    const/16 v2, 0x6e

    .line 90
    .line 91
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {p1, v1, v0, v0, v2}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->C(IZZLjava/lang/Object;)I

    .line 96
    .line 97
    .line 98
    :cond_3
    :goto_1
    iput-object v4, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->j:Lua/a;

    .line 99
    .line 100
    const-string p0, "\u521b\u5efa\u6210\u529f"

    .line 101
    .line 102
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    :goto_2
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 114
    .line 115
    return-object p0
.end method

.method public static final P(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Ljava/lang/String;)Lqc/q;
    .locals 3

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_2

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object p0, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->j:Lua/a;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lua/a;->d()Lcom/friday/common/entity/NoteBean;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/friday/common/entity/NoteBean;->getFileId()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    :cond_0
    const-string p0, "0"

    .line 31
    .line 32
    :cond_1
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->t()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    invoke-virtual {v0, p1, p0, v1, v2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->j(Ljava/lang/String;Ljava/lang/String;J)V

    .line 43
    .line 44
    .line 45
    :cond_2
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 46
    .line 47
    return-object p0
.end method

.method public static final Q(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->c:Lcom/zykj/view/widget/LimitEditText;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    new-instance p1, Lkotlin/text/Regex;

    .line 24
    .line 25
    const-string v0, "^([\\u4e00-\\u9fa5a-zA-Z0-9\"\\s\\.\\/\\\u201c\\\u201d\\_\\\uff08\\\uff09\\(\\)\\\u3010\\\u3011])+$"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->c:Lcom/zykj/view/widget/LimitEditText;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1, v0}, Lkotlin/text/Regex;->g(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_0

    .line 51
    .line 52
    sget p0, Lcom/friday/common/R$string;->name_content_rule:I

    .line 53
    .line 54
    invoke-static {p0}, Lz1/b;->h(I)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 63
    .line 64
    iget-object p1, p1, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 65
    .line 66
    const/16 v0, 0x8

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 76
    .line 77
    iget-object p1, p1, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->e:Landroid/widget/HorizontalScrollView;

    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 88
    .line 89
    iget-object p1, p1, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->l:Landroid/widget/TextView;

    .line 90
    .line 91
    const-string v2, "\u9009\u62e9\u6587\u4ef6\u5939\u76ee\u5f55\uff0c\u5c06\u6587\u4ef6\u50a8\u5b58\u5230\u4e91\u7b14\u8bb0"

    .line 92
    .line 93
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 101
    .line 102
    iget-object p1, p1, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->o:Landroid/widget/TextView;

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 112
    .line 113
    iget-object p1, p1, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->h:Landroid/widget/LinearLayout;

    .line 114
    .line 115
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 127
    .line 128
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->c:Lcom/zykj/view/widget/LimitEditText;

    .line 129
    .line 130
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v0}, Lqd/c0;->e1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {p1, v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->x(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-static {p0}, Lcom/blankj/utilcode/util/KeyboardUtils;->hideSoftInput(Landroid/app/Activity;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_1
    const-string p0, "\u6587\u4ef6\u540d\u4e0d\u80fd\u4e3a\u7a7a"

    .line 158
    .line 159
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public static final R(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->c:Lcom/zykj/view/widget/LimitEditText;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Landroid/text/Editable;->clear()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public static final S(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const-string p0, "\u7f51\u7edc\u4e0d\u4f73"

    .line 16
    .line 17
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p1, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;

    .line 22
    .line 23
    invoke-direct {p1}, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string v0, "getChildFragmentManager(...)"

    .line 31
    .line 32
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-class v0, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, p0, v0}, Lcom/friday/common/base/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static final T(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V
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

.method public static final U(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const-string p0, "\u7f51\u7edc\u4e0d\u4f73"

    .line 16
    .line 17
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->r()Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->j:Lua/a;

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Lua/a;->d()Lcom/friday/common/entity/NoteBean;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0, p1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->u(Lcom/friday/common/entity/NoteBean;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    const-string p0, "\u8bf7\u9009\u62e9\u6587\u4ef6\u5939"

    .line 54
    .line 55
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    const-string p0, "\u627e\u4e0d\u5230\u5fae\u8bfe\u6587\u4ef6"

    .line 60
    .line 61
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static final V()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic w(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->Q(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic x(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->R(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic y(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->U(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic z(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->N(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method


# virtual methods
.method public final I()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->l:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/cloudhelper/R$layout;->fragment_store_note:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v1, "uri"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/net/Uri;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->w(Landroid/net/Uri;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const-string v1, "ossUrl"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1, v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->v(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->l:Landroid/widget/TextView;

    .line 52
    .line 53
    const-string v1, "\u4e3a\u50a8\u5b58\u7684\u6587\u4ef6\u547d\u540d"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 63
    .line 64
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 65
    .line 66
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->I()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 83
    .line 84
    .line 85
    new-instance v1, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    const/4 v3, 0x1

    .line 92
    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    sget v4, Lcom/zykj/cloudhelper/R$drawable;->shape_item_divider:I

    .line 100
    .line 101
    invoke-static {v2, v4}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 119
    .line 120
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->o:Landroid/widget/TextView;

    .line 121
    .line 122
    new-instance v1, Lva/i;

    .line 123
    .line 124
    invoke-direct {v1, p0}, Lva/i;-><init>(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 135
    .line 136
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->f:Landroid/widget/ImageView;

    .line 137
    .line 138
    new-instance v1, Lva/k;

    .line 139
    .line 140
    invoke-direct {v1, p0}, Lva/k;-><init>(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 151
    .line 152
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->m:Landroid/widget/TextView;

    .line 153
    .line 154
    new-instance v1, Lva/l;

    .line 155
    .line 156
    invoke-direct {v1, p0}, Lva/l;-><init>(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 167
    .line 168
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->k:Landroid/widget/TextView;

    .line 169
    .line 170
    new-instance v1, Lva/m;

    .line 171
    .line 172
    invoke-direct {v1, p0}, Lva/m;-><init>(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;

    .line 183
    .line 184
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/FragmentStoreNoteBinding;->n:Landroid/widget/TextView;

    .line 185
    .line 186
    new-instance v1, Lva/n;

    .line 187
    .line 188
    invoke-direct {v1, p0}, Lva/n;-><init>(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->t()Landroidx/lifecycle/MutableLiveData;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    new-instance v2, Lva/o;

    .line 207
    .line 208
    invoke-direct {v2, p0}, Lva/o;-><init>(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;)V

    .line 209
    .line 210
    .line 211
    new-instance v4, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$b;

    .line 212
    .line 213
    invoke-direct {v4, v2}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$b;-><init>(Lhd/l;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v1, v4}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 217
    .line 218
    .line 219
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->o()Landroidx/lifecycle/MutableLiveData;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    new-instance v2, Lva/p;

    .line 232
    .line 233
    invoke-direct {v2, p0}, Lva/p;-><init>(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;)V

    .line 234
    .line 235
    .line 236
    new-instance v4, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$b;

    .line 237
    .line 238
    invoke-direct {v4, v2}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$b;-><init>(Lhd/l;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v1, v4}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 242
    .line 243
    .line 244
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    new-instance v2, Lva/q;

    .line 257
    .line 258
    invoke-direct {v2, p0}, Lva/q;-><init>(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;)V

    .line 259
    .line 260
    .line 261
    new-instance v4, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$b;

    .line 262
    .line 263
    invoke-direct {v4, v2}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$b;-><init>(Lhd/l;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v1, v4}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->I()Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    new-instance v1, Lva/g;

    .line 274
    .line 275
    invoke-direct {v1, p0}, Lva/g;-><init>(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lo1/d;)V

    .line 279
    .line 280
    .line 281
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->q()Landroidx/lifecycle/MutableLiveData;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    new-instance v2, Lva/h;

    .line 294
    .line 295
    invoke-direct {v2, p0}, Lva/h;-><init>(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;)V

    .line 296
    .line 297
    .line 298
    new-instance v4, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$b;

    .line 299
    .line 300
    invoke-direct {v4, v2}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$b;-><init>(Lhd/l;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v1, v4}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 304
    .line 305
    .line 306
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->p()Landroidx/lifecycle/MutableLiveData;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    new-instance v2, Lva/j;

    .line 319
    .line 320
    invoke-direct {v2, p0}, Lva/j;-><init>(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;)V

    .line 321
    .line 322
    .line 323
    new-instance v4, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$b;

    .line 324
    .line 325
    invoke-direct {v4, v2}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$b;-><init>(Lhd/l;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0, v1, v4}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0, v3}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 332
    .line 333
    .line 334
    invoke-direct {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->J()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    const/4 v1, 0x0

    .line 339
    const/4 v2, 0x0

    .line 340
    invoke-static {v0, v1, v3, v2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->m(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;ZILjava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    return-void
.end method
