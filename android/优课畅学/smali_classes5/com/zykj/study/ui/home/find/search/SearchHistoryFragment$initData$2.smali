.class final Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->initData(Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.find.search.SearchHistoryFragment$initData$2"
    f = "SearchHistoryFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;->b:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;->d(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;Ljava/util/List;)Lh7/p;
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/zykj/study/databinding/FragmentSearchHistoryBinding;

    .line 12
    .line 13
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentSearchHistoryBinding;->statusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->f()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->i(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;)Lcom/zykj/study/adapter/SearchHistoryAdapter;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "historyAdapter"

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lcom/zykj/study/adapter/SearchHistoryAdapter;->k(Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lcom/zykj/study/databinding/FragmentSearchHistoryBinding;

    .line 42
    .line 43
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentSearchHistoryBinding;->statusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d()V

    .line 46
    .line 47
    .line 48
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 49
    .line 50
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;->b:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;-><init>(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;->b:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->j(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;)Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/SearchViewModel;->j()Landroidx/lifecycle/LiveData;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;->b:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, Lcom/zykj/study/ui/home/find/search/b;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/search/b;-><init>(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$a;

    .line 35
    .line 36
    invoke-direct {v0, v2}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$a;-><init>(Lx7/l;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1, v0}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method
