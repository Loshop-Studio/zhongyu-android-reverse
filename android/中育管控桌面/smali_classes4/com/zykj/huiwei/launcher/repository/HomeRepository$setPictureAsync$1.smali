.class final Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/repository/HomeRepository;->i(J)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/flow/FlowCollector<",
        "-",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/flow/FlowCollector;",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.huiwei.launcher.repository.HomeRepository$setPictureAsync$1"
    f = "HomeRepository.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x4e,
        0x4f
    }
    m = "invokeSuspend"
    n = {
        "$this$flow",
        "$this$flow"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

.field public final synthetic d:J


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/repository/HomeRepository;JLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->c:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    iput-wide p2, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->d:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4

    new-instance v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->c:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    iget-wide v2, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->d:J

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;-><init>(Lcom/zykj/huiwei/launcher/repository/HomeRepository;JLkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/flow/FlowCollector;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/flow/FlowCollector;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->a:I

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eq v2, v4, :cond_1

    .line 16
    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->c:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/repository/HomeRepository;->a(Lcom/zykj/huiwei/launcher/repository/HomeRepository;)Lcom/zykj/huiwei/launcher/api/HomeService;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v2, Lcom/zykj/huiwei/launcher/bean/req/AvatarSetReq;

    .line 45
    .line 46
    iget-wide v5, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->d:J

    .line 47
    .line 48
    invoke-direct {v2, v5, v6}, Lcom/zykj/huiwei/launcher/bean/req/AvatarSetReq;-><init>(J)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->b:Ljava/lang/Object;

    .line 52
    .line 53
    iput v4, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->a:I

    .line 54
    .line 55
    invoke-interface {p1, v2, p0}, Lcom/zykj/huiwei/launcher/api/HomeService;->setPictureAsync(Lcom/zykj/huiwei/launcher/bean/req/AvatarSetReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_0
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 63
    .line 64
    invoke-static {p1}, La3/a;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iput-object v2, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->b:Ljava/lang/Object;

    .line 76
    .line 77
    iput v3, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;->a:I

    .line 78
    .line 79
    invoke-interface {v0, p1, p0}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v1, :cond_4

    .line 84
    .line 85
    :goto_1
    return-object v1

    .line 86
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p1
.end method
