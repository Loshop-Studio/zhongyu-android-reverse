# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/viewmodels/SearchViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/repository/SearchHistoryRepository;

.field public final b:Lt4/g;

.field public final c:Landroidx/datastore/core/DataStore;

.field public final d:Landroidx/lifecycle/MutableLiveData;

.field public final e:Landroidx/lifecycle/MutableLiveData;

.field public final f:Ll8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/repository/SearchHistoryRepository;Lt4/g;Landroidx/datastore/core/DataStore;)V
    .locals 1

    .line 1
    const-string v0, "historyRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "repository"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "userDataStore"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->a:Lcom/zykj/study/repository/SearchHistoryRepository;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->b:Lt4/g;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->c:Landroidx/datastore/core/DataStore;

    .line 24
    .line 25
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 31
    .line 32
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 33
    .line 34
    const-string p2, ""

    .line 35
    .line 36
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 40
    .line 41
    invoke-static {p1}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Ll8/c;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance p2, Lcom/zykj/study/viewmodels/SearchViewModel$special$$inlined$flatMapLatest$1;

    .line 46
    .line 47
    const/4 p3, 0x0

    .line 48
    invoke-direct {p2, p3, p0}, Lcom/zykj/study/viewmodels/SearchViewModel$special$$inlined$flatMapLatest$1;-><init>(Lm7/c;Lcom/zykj/study/viewmodels/SearchViewModel;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p2}, Ll8/e;->U(Ll8/c;Lx7/q;)Ll8/c;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-static {p1, p2}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Ll8/c;Li8/b0;)Ll8/c;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->f:Ll8/c;

    .line 64
    .line 65
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/viewmodels/SearchViewModel;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/study/viewmodels/SearchViewModel;->i(Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final i(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/viewmodels/SearchViewModel$getUserId$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/viewmodels/SearchViewModel$getUserId$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/viewmodels/SearchViewModel$getUserId$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/viewmodels/SearchViewModel$getUserId$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/viewmodels/SearchViewModel$getUserId$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/viewmodels/SearchViewModel$getUserId$1;-><init>(Lcom/zykj/study/viewmodels/SearchViewModel;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/viewmodels/SearchViewModel$getUserId$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/viewmodels/SearchViewModel$getUserId$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->c:Landroidx/datastore/core/DataStore;

    .line 54
    .line 55
    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput v3, v0, Lcom/zykj/study/viewmodels/SearchViewModel$getUserId$1;->c:I

    .line 60
    .line 61
    invoke-static {p1, v0}, Ll8/e;->z(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    check-cast p1, Lcom/zykj/lib/login/proto/UserBean;

    .line 69
    .line 70
    if-eqz p1, :cond_5

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-nez p1, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    return-object p1

    .line 80
    :cond_5
    :goto_2
    const-string p1, ""

    .line 81
    .line 82
    return-object p1
.end method


# virtual methods
.method public final b()V
    .locals 6

    .line 1
    new-instance v3, Lcom/zykj/study/viewmodels/SearchViewModel$clearHistory$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v3, p0, v0}, Lcom/zykj/study/viewmodels/SearchViewModel$clearHistory$1;-><init>(Lcom/zykj/study/viewmodels/SearchViewModel;Lm7/c;)V

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    move-object v0, p0

    .line 12
    invoke-static/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel;->launch$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final c(Lcom/zykj/study/data/SearchHistoryEntity;)V
    .locals 7

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v4, Lcom/zykj/study/viewmodels/SearchViewModel$deleteHistory$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/study/viewmodels/SearchViewModel$deleteHistory$1;-><init>(Lcom/zykj/study/viewmodels/SearchViewModel;Lcom/zykj/study/data/SearchHistoryEntity;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x3

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    move-object v1, p0

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/zykj/base/BaseViewModel;->launch$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final d()Lcom/zykj/study/repository/SearchHistoryRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->a:Lcom/zykj/study/repository/SearchHistoryRepository;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lt4/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->b:Lt4/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ll8/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->f:Ll8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Landroidx/lifecycle/LiveData;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/SearchViewModel$initHistoryList$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/viewmodels/SearchViewModel$initHistoryList$1;-><init>(Lcom/zykj/study/viewmodels/SearchViewModel;Lm7/c;)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v1, v0, v2, v1}, Li8/f;->f(Lkotlin/coroutines/d;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/lifecycle/LiveData;

    .line 13
    .line 14
    return-object v0
.end method

.method public final k()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lg8/c0;->W0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lez v1, :cond_0

    .line 26
    .line 27
    iget-object v1, p0, Lcom/zykj/study/viewmodels/SearchViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lcom/zykj/study/viewmodels/SearchViewModel$search$1$1;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v5, p0, v0, v1}, Lcom/zykj/study/viewmodels/SearchViewModel$search$1$1;-><init>(Lcom/zykj/study/viewmodels/SearchViewModel;Ljava/lang/String;Lm7/c;)V

    .line 36
    .line 37
    .line 38
    const/4 v6, 0x3

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    move-object v2, p0

    .line 43
    invoke-static/range {v2 .. v7}, Lcom/zykj/base/BaseViewModel;->launch$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method
