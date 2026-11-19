.class public final Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;
.super Landroidx/recyclerview/widget/ListAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$PayloadsKey;,
        Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/ListAdapter<",
        "Lcom/zykj/student/dialogue/bean/resp/MessageResponse;",
        "Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000c\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;",
        "Landroidx/recyclerview/widget/ListAdapter;",
        "Lcom/zykj/student/dialogue/bean/resp/MessageResponse;",
        "Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;",
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;",
        "viewModel",
        "<init>",
        "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "e",
        "(Landroid/view/ViewGroup;I)Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;",
        "holder",
        "position",
        "",
        "",
        "payloads",
        "",
        "d",
        "(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;ILjava/util/List;)V",
        "g",
        "()V",
        "index",
        "c",
        "(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;I)V",
        "a",
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;",
        "TheViewHolder",
        "PayloadsKey",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDetailTabAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailTabAdapter.kt\ncom/zykj/student/dialogue/ui/detail/DetailTabAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,97:1\n1869#2,2:98\n1878#2,3:100\n257#3,2:103\n*S KotlinDebug\n*F\n+ 1 DetailTabAdapter.kt\ncom/zykj/student/dialogue/ui/detail/DetailTabAdapter\n*L\n63#1:98,2\n78#1:100,3\n89#1:103,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)V
    .locals 1

    .line 1
    const-string v0, "viewModel"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$1;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$1;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic b(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;->f(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static final f(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->K()Lkotlinx/coroutines/flow/StateFlow;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Lp6/k;

    .line 12
    .line 13
    invoke-virtual {p2}, Lp6/k;->p()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ne p2, v0, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 25
    .line 26
    new-instance p2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$c;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-direct {p2, p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$c;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->w(Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public c(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;I)V
    .locals 5

    .line 1
    const-string p2, "holder"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;->a()Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, v0, Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;->d:Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;->getUserName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, v0, Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;->a:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p2}, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;->isPrimary()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    sget v3, Lcom/zykj/student/dialogue/R$string;->dialogue_tag_public:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sget v3, Lcom/zykj/student/dialogue/R$string;->dialogue_tag_un_public:I

    .line 45
    .line 46
    :goto_0
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v0, Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;->b:Landroid/widget/TextView;

    .line 54
    .line 55
    const-string v2, "chipQuestion"

    .line 56
    .line 57
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const/4 v3, 0x1

    .line 65
    const/4 v4, 0x0

    .line 66
    if-nez v2, :cond_1

    .line 67
    .line 68
    move v2, v3

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move v2, v4

    .line 71
    :goto_1
    if-eqz v2, :cond_2

    .line 72
    .line 73
    move v2, v4

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    const/16 v2, 0x8

    .line 76
    .line 77
    :goto_2
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    iget-object v1, v0, Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;->e:Landroid/widget/TextView;

    .line 81
    .line 82
    invoke-virtual {p2}, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;->getSendTime()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, v0, Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 90
    .line 91
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 96
    .line 97
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->K()Lkotlinx/coroutines/flow/StateFlow;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Lp6/k;

    .line 106
    .line 107
    invoke-virtual {v2}, Lp6/k;->p()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-ne p1, v2, :cond_3

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    move v3, v4

    .line 115
    :goto_3
    invoke-virtual {v1, v3}, Landroid/view/View;->setSelected(Z)V

    .line 116
    .line 117
    .line 118
    iget-object p1, v0, Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;->a:Landroid/widget/TextView;

    .line 119
    .line 120
    invoke-virtual {p2}, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;->isPrimary()Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public d(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;ILjava/util/List;)V
    .locals 3

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "payloads"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;

    .line 30
    .line 31
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v2, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$PayloadsKey;->a:Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$PayloadsKey;

    .line 46
    .line 47
    if-ne v1, v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;->a()Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 54
    .line 55
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->K()Lkotlinx/coroutines/flow/StateFlow;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Lp6/k;

    .line 66
    .line 67
    invoke-virtual {v2}, Lp6/k;->p()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-ne p2, v2, :cond_2

    .line 72
    .line 73
    const/4 v2, 0x1

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const/4 v2, 0x0

    .line 76
    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;->a()Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;->a:Landroid/widget/TextView;

    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;->isPrimary()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    return-void
.end method

.method public e(Landroid/view/ViewGroup;I)Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;
    .locals 3

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v0, p1, v1}, Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "inflate(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p2, p1}, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;-><init>(Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 30
    .line 31
    new-instance v0, Lo6/v;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, Lo6/v;-><init>(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;)V

    .line 34
    .line 35
    .line 36
    const-wide/16 v1, 0x1f4

    .line 37
    .line 38
    invoke-static {p1, v1, v2, v0}, Lcom/blankj/utilcode/util/ClickUtils;->applyGlobalDebouncing(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 39
    .line 40
    .line 41
    return-object p2
.end method

.method public final g()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/ListAdapter;->getCurrentList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getCurrentList(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    add-int/lit8 v3, v1, 0x1

    .line 26
    .line 27
    if-gez v1, :cond_0

    .line 28
    .line 29
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 30
    .line 31
    .line 32
    :cond_0
    check-cast v2, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;

    .line 33
    .line 34
    sget-object v2, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$PayloadsKey;->a:Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$PayloadsKey;

    .line 35
    .line 36
    invoke-virtual {p0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move v1, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;->c(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;I)V

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;->d(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;ILjava/util/List;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;->e(Landroid/view/ViewGroup;I)Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
