.class public final Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/SearchViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lj2/d;Lu3/b;Lcom/friday/common/dao/ResourceDao;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/q;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.main.viewmodel.SearchViewModel$special$$inlined$flatMapLatest$1"
    f = "SearchViewModel.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/friday/main/viewmodel/SearchViewModel;


# direct methods
.method public constructor <init>(Lvc/c;Lcom/friday/main/viewmodel/SearchViewModel;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->f:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 2
    .line 3
    const/4 p2, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvd/d;

    check-cast p3, Lvc/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->invoke(Lvd/d;Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvd/d;Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 2

    .line 2
    new-instance v0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;

    iget-object v1, p0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->f:Lcom/friday/main/viewmodel/SearchViewModel;

    invoke-direct {v0, p3, v1}, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;-><init>(Lvc/c;Lcom/friday/main/viewmodel/SearchViewModel;)V

    iput-object p1, v0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->d:Ljava/lang/Object;

    iput-object p2, v0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->e:Ljava/lang/Object;

    sget-object p1, Lqc/q;->a:Lqc/q;

    invoke-virtual {v0, p1}, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->c:I

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
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lvd/d;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lvd/d;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->e:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v3, v1

    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    new-instance v4, Landroidx/paging/Pager;

    .line 41
    .line 42
    new-instance v5, Landroidx/paging/PagingConfig;

    .line 43
    .line 44
    const/16 v12, 0x3c

    .line 45
    .line 46
    const/4 v13, 0x0

    .line 47
    const/16 v6, 0x14

    .line 48
    .line 49
    const/4 v7, 0x1

    .line 50
    const/4 v8, 0x0

    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v10, 0x0

    .line 53
    const/4 v11, 0x0

    .line 54
    invoke-direct/range {v5 .. v13}, Landroidx/paging/PagingConfig;-><init>(IIZIIIILkotlin/jvm/internal/n;)V

    .line 55
    .line 56
    .line 57
    new-instance v7, Lcom/friday/main/viewmodel/SearchViewModel$a;

    .line 58
    .line 59
    iget-object v6, p0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->f:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 60
    .line 61
    invoke-direct {v7, v3, v6}, Lcom/friday/main/viewmodel/SearchViewModel$a;-><init>(Ljava/lang/String;Lcom/friday/main/viewmodel/SearchViewModel;)V

    .line 62
    .line 63
    .line 64
    const/4 v8, 0x2

    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-direct/range {v4 .. v9}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lhd/a;ILkotlin/jvm/internal/n;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Landroidx/paging/Pager;->getFlow()Lvd/c;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    new-instance v4, Lcom/friday/main/viewmodel/SearchViewModel$dataFlow$lambda$1$$inlined$map$1;

    .line 75
    .line 76
    iget-object v5, p0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->f:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 77
    .line 78
    invoke-direct {v4, v3, v5}, Lcom/friday/main/viewmodel/SearchViewModel$dataFlow$lambda$1$$inlined$map$1;-><init>(Lvd/c;Lcom/friday/main/viewmodel/SearchViewModel;)V

    .line 79
    .line 80
    .line 81
    iget-object v3, p0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->f:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 82
    .line 83
    invoke-static {v3}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {v4, v3}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Lvd/c;Lsd/i0;)Lvd/c;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    iput-object v4, p0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->d:Ljava/lang/Object;

    .line 96
    .line 97
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iput-object v1, p0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->e:Ljava/lang/Object;

    .line 102
    .line 103
    iput v2, p0, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;->c:I

    .line 104
    .line 105
    invoke-static {p1, v3, p0}, Lvd/e;->t(Lvd/d;Lvd/c;Lvc/c;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, v0, :cond_2

    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 113
    .line 114
    return-object p1
.end method
