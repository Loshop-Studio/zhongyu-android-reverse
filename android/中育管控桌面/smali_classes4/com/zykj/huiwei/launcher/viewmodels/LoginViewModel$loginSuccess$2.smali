# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class final Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->w(Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/zykj/huiwei/launcher/proto/a;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/zykj/huiwei/launcher/proto/a;",
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
        "Lcom/zykj/huiwei/launcher/proto/a;",
        "it",
        "<anonymous>",
        "(Lcom/zykj/huiwei/launcher/proto/a;)Lcom/zykj/huiwei/launcher/proto/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel$loginSuccess$2"
    f = "LoginViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

.field public final synthetic d:Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->c:Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->d:Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/huiwei/launcher/proto/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->c:Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->d:Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;-><init>(Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/huiwei/launcher/proto/a;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->a(Lcom/zykj/huiwei/launcher/proto/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/zykj/huiwei/launcher/proto/a$b;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->c:Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;->getCode()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Lcom/zykj/huiwei/launcher/proto/a$b;->setSchoolCode(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/a$b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->c:Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;->getServer()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1, v0}, Lcom/zykj/huiwei/launcher/proto/a$b;->setServerUrl(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/a$b;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->c:Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;->getWebServer()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, ""

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    move-object v0, v1

    .line 52
    :cond_0
    invoke-virtual {p1, v0}, Lcom/zykj/huiwei/launcher/proto/a$b;->setWebServerUrl(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/a$b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->d:Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;->getAccessToken()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, v0}, Lcom/zykj/huiwei/launcher/proto/a$b;->setAccessToken(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/a$b;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->d:Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;->getRongCloudToken()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move-object v1, v0

    .line 76
    :goto_0
    invoke-virtual {p1, v1}, Lcom/zykj/huiwei/launcher/proto/a$b;->setImAccessToken(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/a$b;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;->d:Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;->getRefreshToken()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1, v0}, Lcom/zykj/huiwei/launcher/proto/a$b;->setRefreshToken(Ljava/lang/String;)Lcom/zykj/huiwei/launcher/proto/a$b;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string v0, "build(...)"

    .line 95
    .line 96
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object p1

    .line 100
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 101
    .line 102
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 103
    .line 104
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p1
.end method
