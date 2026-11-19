.class public final Lcom/zykj/study/repository/SearchHistoryRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/study/data/SearchHistoryEntityDao;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/data/SearchHistoryEntityDao;)V
    .locals 1

    .line 1
    const-string v0, "searchHistoryDao"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/repository/SearchHistoryRepository;->a:Lcom/zykj/study/data/SearchHistoryEntityDao;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/repository/SearchHistoryRepository;)Lcom/zykj/study/data/SearchHistoryEntityDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/repository/SearchHistoryRepository;->a:Lcom/zykj/study/data/SearchHistoryEntityDao;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/SearchHistoryRepository;->a:Lcom/zykj/study/data/SearchHistoryEntityDao;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcom/zykj/study/data/SearchHistoryEntityDao;->deleteAll(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 15
    .line 16
    return-object p1
.end method

.method public final c(Lcom/zykj/study/data/SearchHistoryEntity;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/SearchHistoryRepository;->a:Lcom/zykj/study/data/SearchHistoryEntityDao;

    .line 2
    .line 3
    filled-new-array {p1}, [Lcom/zykj/study/data/SearchHistoryEntity;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1, p2}, Lcom/zykj/study/data/SearchHistoryEntityDao;->delete([Lcom/zykj/study/data/SearchHistoryEntity;Lm7/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 19
    .line 20
    return-object p1
.end method

.method public final d(Ljava/lang/String;)Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    const-string v0, "userId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/repository/SearchHistoryRepository;->a:Lcom/zykj/study/data/SearchHistoryEntityDao;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/zykj/study/data/SearchHistoryEntityDao;->getHistoryList(Ljava/lang/String;)Landroidx/lifecycle/LiveData;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, Lg8/c0;->W0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-static {}, Li8/i0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v1, p0, p2, p1, v2}, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;-><init>(Lcom/zykj/study/repository/SearchHistoryRepository;Ljava/lang/String;Ljava/lang/String;Lm7/c;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1, p3}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-ne p1, p2, :cond_1

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 40
    .line 41
    return-object p1
.end method
