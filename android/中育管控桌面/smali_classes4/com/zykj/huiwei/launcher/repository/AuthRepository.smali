.class public final Lcom/zykj/huiwei/launcher/repository/AuthRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/api/AuthService;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/huiwei/launcher/api/AuthService;)V
    .locals 1

    .line 1
    const-string v0, "authService"

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/repository/AuthRepository;->a:Lcom/zykj/huiwei/launcher/api/AuthService;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Lcom/zykj/huiwei/launcher/repository/AuthRepository$token$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/repository/AuthRepository$token$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/huiwei/launcher/repository/AuthRepository$token$1;->e:I

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
    iput v1, v0, Lcom/zykj/huiwei/launcher/repository/AuthRepository$token$1;->e:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/AuthRepository$token$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, Lcom/zykj/huiwei/launcher/repository/AuthRepository$token$1;-><init>(Lcom/zykj/huiwei/launcher/repository/AuthRepository;Lkotlin/coroutines/Continuation;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v6, Lcom/zykj/huiwei/launcher/repository/AuthRepository$token$1;->c:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v6, Lcom/zykj/huiwei/launcher/repository/AuthRepository$token$1;->e:I

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-object p1, v6, Lcom/zykj/huiwei/launcher/repository/AuthRepository$token$1;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;

    .line 43
    .line 44
    iget-object p1, v6, Lcom/zykj/huiwei/launcher/repository/AuthRepository$token$1;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/repository/AuthRepository;->a:Lcom/zykj/huiwei/launcher/api/AuthService;

    .line 64
    .line 65
    new-instance p3, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v3, "/api/TokenAuth/Login"

    .line 74
    .line 75
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, v6, Lcom/zykj/huiwei/launcher/repository/AuthRepository$token$1;->a:Ljava/lang/Object;

    .line 87
    .line 88
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, v6, Lcom/zykj/huiwei/launcher/repository/AuthRepository$token$1;->b:Ljava/lang/Object;

    .line 93
    .line 94
    iput v2, v6, Lcom/zykj/huiwei/launcher/repository/AuthRepository$token$1;->e:I

    .line 95
    .line 96
    const-string v4, "com.zykj.manage"

    .line 97
    .line 98
    const/16 v5, 0x2732

    .line 99
    .line 100
    move-object v3, p2

    .line 101
    move-object v2, p3

    .line 102
    invoke-interface/range {v1 .. v6}, Lcom/zykj/huiwei/launcher/api/AuthService;->getToken(Ljava/lang/String;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    if-ne p3, v0, :cond_3

    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_3
    :goto_2
    check-cast p3, Lcom/zykj/http/bean/ApiResp;

    .line 110
    .line 111
    invoke-static {p3}, La3/a;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    return-object p1
.end method
