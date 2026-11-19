.class final Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/home/HomeViewModel;->D(Lcom/zykj/evaluation/ui/home/a;)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/paging/PagingData<",
        "Lt6/o0;",
        ">;",
        "Ljava/util/Map<",
        "Ljava/lang/Long;",
        "+",
        "Lt6/p0;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Landroidx/paging/PagingData<",
        "Lt6/o0;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Landroidx/paging/PagingData;",
        "Lt6/o0;",
        "pagingData",
        "",
        "",
        "Lt6/p0;",
        "map",
        "<anonymous>",
        "(Landroidx/paging/PagingData;Ljava/util/Map;)Landroidx/paging/PagingData;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.evaluation.ui.home.HomeViewModel$buildDataInfo$2"
    f = "HomeViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/evaluation/ui/home/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;->d:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/paging/PagingData;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;->d:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    invoke-direct {v0, v1, p3}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;->b:Ljava/lang/Object;

    iput-object p2, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;->c:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/paging/PagingData;

    check-cast p2, Ljava/util/Map;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;->a(Landroidx/paging/PagingData;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/paging/PagingData;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/Map;

    .line 8
    .line 9
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iget v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;->a:I

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;->d:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {p1, v2, v1, v3}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p1}, Landroidx/paging/PagingDataTransforms;->map(Landroidx/paging/PagingData;Lkotlin/jvm/functions/Function2;)Landroidx/paging/PagingData;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
.end method
