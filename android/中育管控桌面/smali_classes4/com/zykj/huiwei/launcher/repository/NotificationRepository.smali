.class public final Lcom/zykj/huiwei/launcher/repository/NotificationRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/api/NotificationService;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/huiwei/launcher/api/NotificationService;)V
    .locals 1

    .line 1
    const-string v0, "notificationService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository;->a:Lcom/zykj/huiwei/launcher/api/NotificationService;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lcom/zykj/huiwei/launcher/repository/NotificationRepository;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/repository/NotificationRepository;->e(Lcom/zykj/huiwei/launcher/repository/NotificationRepository;)Landroidx/paging/PagingSource;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/huiwei/launcher/repository/NotificationRepository;)Lcom/zykj/huiwei/launcher/api/NotificationService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository;->a:Lcom/zykj/huiwei/launcher/api/NotificationService;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final e(Lcom/zykj/huiwei/launcher/repository/NotificationRepository;)Landroidx/paging/PagingSource;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository;->a:Lcom/zykj/huiwei/launcher/api/NotificationService;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-direct {v0, p0, v1, v2, v1}, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;-><init>(Lcom/zykj/huiwei/launcher/api/NotificationService;Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public final c(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository;->a:Lcom/zykj/huiwei/launcher/api/NotificationService;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/api/NotificationService;->getNotice(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final d()Lkotlinx/coroutines/flow/Flow;
    .locals 10

    .line 1
    new-instance v0, Landroidx/paging/Pager;

    .line 2
    .line 3
    new-instance v1, Landroidx/paging/PagingConfig;

    .line 4
    .line 5
    const/16 v8, 0x3e

    .line 6
    .line 7
    const/4 v9, 0x0

    .line 8
    const/16 v2, 0x14

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    invoke-direct/range {v1 .. v9}, Landroidx/paging/PagingConfig;-><init>(IIZIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lw3/c;

    .line 19
    .line 20
    invoke-direct {v3, p0}, Lw3/c;-><init>(Lcom/zykj/huiwei/launcher/repository/NotificationRepository;)V

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct/range {v0 .. v5}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/paging/Pager;->getFlow()Lkotlinx/coroutines/flow/Flow;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public final f(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/huiwei/launcher/repository/NotificationRepository$getUnReadCount$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository$getUnReadCount$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository$getUnReadCount$1;->c:I

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
    iput v1, v0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository$getUnReadCount$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository$getUnReadCount$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/huiwei/launcher/repository/NotificationRepository$getUnReadCount$1;-><init>(Lcom/zykj/huiwei/launcher/repository/NotificationRepository;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository$getUnReadCount$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository$getUnReadCount$1;->c:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository;->a:Lcom/zykj/huiwei/launcher/api/NotificationService;

    .line 54
    .line 55
    iput v3, v0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository$getUnReadCount$1;->c:I

    .line 56
    .line 57
    invoke-interface {p1, v0}, Lcom/zykj/huiwei/launcher/api/NotificationService;->getMyUnreadMessageCount(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v1, :cond_3

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    :goto_1
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 65
    .line 66
    invoke-static {p1}, La3/a;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1
.end method

.method public final g(J)Lkotlinx/coroutines/flow/Flow;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository$setMessageRead$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, Lcom/zykj/huiwei/launcher/repository/NotificationRepository$setMessageRead$1;-><init>(Lcom/zykj/huiwei/launcher/repository/NotificationRepository;JLkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
