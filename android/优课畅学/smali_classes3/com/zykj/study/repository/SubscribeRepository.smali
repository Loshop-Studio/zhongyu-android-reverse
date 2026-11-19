.class public final Lcom/zykj/study/repository/SubscribeRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lo4/i;

.field public b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lo4/i;)V
    .locals 1

    .line 1
    const-string v0, "subscribeApi"

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
    iput-object p1, p0, Lcom/zykj/study/repository/SubscribeRepository;->a:Lo4/i;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lcom/zykj/study/repository/SubscribeRepository;I)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/repository/SubscribeRepository;->g(Lcom/zykj/study/repository/SubscribeRepository;I)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/study/repository/SubscribeRepository;Lcom/zykj/study/bean/FreeSubscribeReq;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/repository/SubscribeRepository;->f(Lcom/zykj/study/repository/SubscribeRepository;Lcom/zykj/study/bean/FreeSubscribeReq;)Landroidx/paging/PagingSource;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/zykj/study/repository/SubscribeRepository;Lcom/zykj/study/bean/FreeSubscribeReq;)Landroidx/paging/PagingSource;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/study/repository/FreeSubscribeSource;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/repository/SubscribeRepository;->a:Lo4/i;

    .line 4
    .line 5
    new-instance v2, Lt4/i;

    .line 6
    .line 7
    invoke-direct {v2, p0}, Lt4/i;-><init>(Lcom/zykj/study/repository/SubscribeRepository;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, p1, v2}, Lcom/zykj/study/repository/FreeSubscribeSource;-><init>(Lo4/i;Lcom/zykj/study/bean/FreeSubscribeReq;Lx7/l;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static final g(Lcom/zykj/study/repository/SubscribeRepository;I)Lh7/p;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/repository/SubscribeRepository;->b:I

    .line 2
    .line 3
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 4
    .line 5
    return-object p0
.end method


# virtual methods
.method public final c(Lcom/zykj/study/bean/DeleteSubBatchReq;Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/zykj/study/repository/SubscribeRepository$deleteBatchSubscribe$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/repository/SubscribeRepository$deleteBatchSubscribe$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteBatchSubscribe$1;->d:I

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
    iput v1, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteBatchSubscribe$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/SubscribeRepository$deleteBatchSubscribe$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/repository/SubscribeRepository$deleteBatchSubscribe$1;-><init>(Lcom/zykj/study/repository/SubscribeRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteBatchSubscribe$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteBatchSubscribe$1;->d:I

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
    iget-object p1, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteBatchSubscribe$1;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lcom/zykj/study/bean/DeleteSubBatchReq;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lcom/zykj/study/repository/SubscribeRepository;->a:Lo4/i;

    .line 58
    .line 59
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iput-object v2, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteBatchSubscribe$1;->a:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteBatchSubscribe$1;->d:I

    .line 66
    .line 67
    invoke-interface {p2, p1, v0}, Lo4/i;->b(Lcom/zykj/study/bean/DeleteSubBatchReq;Lm7/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    invoke-static {v3}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1
.end method

.method public final d(Lcom/zykj/study/bean/DeleteSubSingReq;Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/zykj/study/repository/SubscribeRepository$deleteSingSubscribe$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/repository/SubscribeRepository$deleteSingSubscribe$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteSingSubscribe$1;->d:I

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
    iput v1, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteSingSubscribe$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/SubscribeRepository$deleteSingSubscribe$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/repository/SubscribeRepository$deleteSingSubscribe$1;-><init>(Lcom/zykj/study/repository/SubscribeRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteSingSubscribe$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteSingSubscribe$1;->d:I

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
    iget-object p1, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteSingSubscribe$1;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lcom/zykj/study/bean/DeleteSubSingReq;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lcom/zykj/study/repository/SubscribeRepository;->a:Lo4/i;

    .line 58
    .line 59
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iput-object v2, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteSingSubscribe$1;->a:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, v0, Lcom/zykj/study/repository/SubscribeRepository$deleteSingSubscribe$1;->d:I

    .line 66
    .line 67
    invoke-interface {p2, p1, v0}, Lo4/i;->f(Lcom/zykj/study/bean/DeleteSubSingReq;Lm7/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    invoke-static {v3}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1
.end method

.method public final e(Lcom/zykj/study/bean/FreeSubscribeReq;)Ll8/c;
    .locals 11

    .line 1
    const-string v0, "req"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/paging/Pager;

    .line 7
    .line 8
    new-instance v2, Landroidx/paging/PagingConfig;

    .line 9
    .line 10
    const/16 v9, 0x3e

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    const/16 v3, 0x14

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    invoke-direct/range {v2 .. v10}, Landroidx/paging/PagingConfig;-><init>(IIZIIIILkotlin/jvm/internal/n;)V

    .line 21
    .line 22
    .line 23
    new-instance v4, Lt4/h;

    .line 24
    .line 25
    invoke-direct {v4, p0, p1}, Lt4/h;-><init>(Lcom/zykj/study/repository/SubscribeRepository;Lcom/zykj/study/bean/FreeSubscribeReq;)V

    .line 26
    .line 27
    .line 28
    const/4 v5, 0x2

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct/range {v1 .. v6}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lx7/a;ILkotlin/jvm/internal/n;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Landroidx/paging/Pager;->getFlow()Ll8/c;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public final h(JLm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/SubscribeRepository;->a:Lo4/i;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lo4/i;->a(JLm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final i(JLm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/SubscribeRepository;->a:Lo4/i;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lo4/i;->e(JLm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final j(JLm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/SubscribeRepository;->a:Lo4/i;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lo4/i;->c(JLm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final k()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/repository/SubscribeRepository;->b:I

    .line 2
    .line 3
    return v0
.end method
