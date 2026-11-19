.class final Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lt6/o0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lt6/o0;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lt6/o0;",
        "homeDataInfo",
        "<anonymous>",
        "(Lt6/o0;)Lt6/o0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.evaluation.ui.home.HomeViewModel$buildDataInfo$2$1"
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

.field public final synthetic c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

.field public final synthetic d:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;->d:Ljava/util/Map;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lt6/o0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;

    .line 6
    .line 7
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;->d:Ljava/util/Map;

    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt6/o0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;->a(Lt6/o0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt6/o0;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2$1;->d:Ljava/util/Map;

    .line 18
    .line 19
    invoke-static {p1, v0, v1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->m(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lt6/o0;Ljava/util/Map;)Lt6/o0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1
.end method
