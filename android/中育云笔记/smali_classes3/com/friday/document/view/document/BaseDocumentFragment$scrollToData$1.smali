.class final Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/BaseDocumentFragment;->N(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.view.document.BaseDocumentFragment$scrollToData$1"
    f = "BaseDocumentFragment.kt"
    l = {
        0xc5
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Landroidx/recyclerview/widget/RecyclerView;

.field public final synthetic e:Lcom/friday/document/view/document/BaseDocumentFragment;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->e:Lcom/friday/document/view/document/BaseDocumentFragment;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->f:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->e:Lcom/friday/document/view/document/BaseDocumentFragment;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->f:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;-><init>(Landroidx/recyclerview/widget/RecyclerView;Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput v2, p0, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->c:I

    .line 28
    .line 29
    const-wide/16 v1, 0x1f4

    .line 30
    .line 31
    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_3
    iget-object p1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 50
    .line 51
    iget-object v0, p0, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->e:Lcom/friday/document/view/document/BaseDocumentFragment;

    .line 52
    .line 53
    iget-object v1, p0, Lcom/friday/document/view/document/BaseDocumentFragment$scrollToData$1;->f:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const-string v3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    .line 60
    .line 61
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    check-cast v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 65
    .line 66
    invoke-virtual {v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    instance-of v5, v4, Landroidx/paging/PagingDataAdapter;

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    if-eqz v5, :cond_4

    .line 82
    .line 83
    check-cast v4, Landroidx/paging/PagingDataAdapter;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    move-object v4, v6

    .line 87
    :goto_1
    if-nez v4, :cond_5

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_5
    invoke-virtual {v4}, Landroidx/paging/PagingDataAdapter;->snapshot()Landroidx/paging/ItemSnapshotList;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    const/4 v5, 0x0

    .line 99
    move v7, v5

    .line 100
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eqz v8, :cond_8

    .line 105
    .line 106
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    check-cast v8, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 111
    .line 112
    if-eqz v8, :cond_6

    .line 113
    .line 114
    invoke-virtual {v8}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    if-eqz v8, :cond_6

    .line 119
    .line 120
    invoke-virtual {v8}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    goto :goto_3

    .line 125
    :cond_6
    move-object v8, v6

    .line 126
    :goto_3
    invoke-static {v8, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    if-eqz v8, :cond_7

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_8
    const/4 v7, -0x1

    .line 137
    :goto_4
    if-gt v3, v7, :cond_9

    .line 138
    .line 139
    if-gt v7, v2, :cond_9

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_9
    if-ltz v7, :cond_a

    .line 143
    .line 144
    move v5, v7

    .line 145
    :cond_a
    invoke-static {v0, p1, v5}, Lcom/friday/document/view/document/BaseDocumentFragment;->x(Lcom/friday/document/view/document/BaseDocumentFragment;Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 146
    .line 147
    .line 148
    :goto_5
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 149
    .line 150
    return-object p1
.end method
