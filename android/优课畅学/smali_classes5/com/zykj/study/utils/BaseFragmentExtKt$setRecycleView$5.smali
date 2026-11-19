.class final Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/utils/BaseFragmentExtKt;->c(Lcom/zykj/base/BaseFragment;Landroidx/paging/PagingDataAdapter;Lx7/a;Lx7/a;Lx7/a;ZLm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.utils.BaseFragmentExtKt$setRecycleView$5"
    f = "BaseFragmentExt.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

.field public final synthetic d:Lcom/zykj/base/BaseFragment;

.field public final synthetic e:Landroidx/paging/PagingDataAdapter;

.field public final synthetic f:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

.field public final synthetic g:Z

.field public final synthetic h:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Lcom/zykj/base/BaseFragment;Landroidx/paging/PagingDataAdapter;Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;ZLandroidx/recyclerview/widget/RecyclerView;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->c:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->d:Lcom/zykj/base/BaseFragment;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->e:Landroidx/paging/PagingDataAdapter;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->f:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 8
    .line 9
    iput-boolean p5, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->g:Z

    .line 10
    .line 11
    iput-object p6, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final c(Landroidx/paging/CombinedLoadStates;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;

    .line 6
    .line 7
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 8

    .line 1
    new-instance v0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->c:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->d:Lcom/zykj/base/BaseFragment;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->e:Landroidx/paging/PagingDataAdapter;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->f:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 10
    .line 11
    iget-boolean v5, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->g:Z

    .line 12
    .line 13
    iget-object v6, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Lcom/zykj/base/BaseFragment;Landroidx/paging/PagingDataAdapter;Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;ZLandroidx/recyclerview/widget/RecyclerView;Lm7/c;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->b:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/paging/CombinedLoadStates;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->c(Landroidx/paging/CombinedLoadStates;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/paging/CombinedLoadStates;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_7

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->c:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/paging/CombinedLoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    instance-of v1, v1, Landroidx/paging/LoadState$Loading;

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v0}, Landroidx/paging/CombinedLoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    instance-of p1, p1, Landroidx/paging/LoadState$Error;

    .line 33
    .line 34
    const-string v1, "null cannot be cast to non-null type androidx.paging.LoadState.Error"

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/paging/CombinedLoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    check-cast p1, Landroidx/paging/LoadState$Error;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->d:Lcom/zykj/base/BaseFragment;

    .line 48
    .line 49
    iget-object v1, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->e:Landroidx/paging/PagingDataAdapter;

    .line 50
    .line 51
    iget-object v2, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->f:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 52
    .line 53
    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/utils/BaseFragmentExtKt;->a(Lcom/zykj/base/BaseFragment;Landroidx/paging/PagingDataAdapter;Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;Landroidx/paging/LoadState$Error;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_1
    invoke-virtual {v0}, Landroidx/paging/CombinedLoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    instance-of p1, p1, Landroidx/paging/LoadState$Error;

    .line 64
    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0}, Landroidx/paging/CombinedLoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    check-cast p1, Landroidx/paging/LoadState$Error;

    .line 75
    .line 76
    iget-object v0, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->d:Lcom/zykj/base/BaseFragment;

    .line 77
    .line 78
    iget-object v1, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->e:Landroidx/paging/PagingDataAdapter;

    .line 79
    .line 80
    iget-object v2, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->f:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 81
    .line 82
    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/utils/BaseFragmentExtKt;->a(Lcom/zykj/base/BaseFragment;Landroidx/paging/PagingDataAdapter;Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;Landroidx/paging/LoadState$Error;)V

    .line 83
    .line 84
    .line 85
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_2
    invoke-virtual {v0}, Landroidx/paging/CombinedLoadStates;->getSource()Landroidx/paging/LoadStates;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    instance-of p1, p1, Landroidx/paging/LoadState$Loading;

    .line 97
    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    iget-boolean p1, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->g:Z

    .line 101
    .line 102
    if-eqz p1, :cond_3

    .line 103
    .line 104
    iget-object p1, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->f:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 105
    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->l()V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    invoke-virtual {v0}, Landroidx/paging/CombinedLoadStates;->getSource()Landroidx/paging/LoadStates;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    instance-of p1, p1, Landroidx/paging/LoadState$NotLoading;

    .line 121
    .line 122
    if-eqz p1, :cond_6

    .line 123
    .line 124
    invoke-virtual {v0}, Landroidx/paging/CombinedLoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_6

    .line 133
    .line 134
    iget-object p1, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->e:Landroidx/paging/PagingDataAdapter;

    .line 135
    .line 136
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->getItemCount()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-lez p1, :cond_5

    .line 141
    .line 142
    iget-object p1, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->f:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 143
    .line 144
    if-eqz p1, :cond_4

    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d()V

    .line 147
    .line 148
    .line 149
    :cond_4
    iget-object p1, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 150
    .line 151
    if-eqz p1, :cond_6

    .line 152
    .line 153
    const/4 v0, 0x0

    .line 154
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 155
    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_5
    iget-object p1, p0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;->f:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 159
    .line 160
    if-eqz p1, :cond_6

    .line 161
    .line 162
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->f()V

    .line 163
    .line 164
    .line 165
    :cond_6
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 166
    .line 167
    return-object p1

    .line 168
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 171
    .line 172
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw p1
.end method
