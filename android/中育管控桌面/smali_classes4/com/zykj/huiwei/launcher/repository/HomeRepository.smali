.class public final Lcom/zykj/huiwei/launcher/repository/HomeRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/api/HomeService;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/huiwei/launcher/api/HomeService;)V
    .locals 1

    .line 1
    const-string v0, "homeService"

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository;->a:Lcom/zykj/huiwei/launcher/api/HomeService;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/huiwei/launcher/repository/HomeRepository;)Lcom/zykj/huiwei/launcher/api/HomeService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository;->a:Lcom/zykj/huiwei/launcher/api/HomeService;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b()Lkotlinx/coroutines/flow/Flow;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getAllProfilesAsync$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getAllProfilesAsync$1;-><init>(Lcom/zykj/huiwei/launcher/repository/HomeRepository;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final c(I)Lkotlinx/coroutines/flow/Flow;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;-><init>(Lcom/zykj/huiwei/launcher/repository/HomeRepository;ILkotlin/coroutines/Continuation;)V

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

.method public final d()Lkotlinx/coroutines/flow/Flow;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getTodoTasksList$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getTodoTasksList$1;-><init>(Lcom/zykj/huiwei/launcher/repository/HomeRepository;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final e(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getUserPasswordStrength$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getUserPasswordStrength$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getUserPasswordStrength$1;->c:I

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
    iput v1, v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getUserPasswordStrength$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getUserPasswordStrength$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getUserPasswordStrength$1;-><init>(Lcom/zykj/huiwei/launcher/repository/HomeRepository;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getUserPasswordStrength$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getUserPasswordStrength$1;->c:I

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
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository;->a:Lcom/zykj/huiwei/launcher/api/HomeService;

    .line 54
    .line 55
    iput v3, v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getUserPasswordStrength$1;->c:I

    .line 56
    .line 57
    const-string v2, "UserPasswordStrength"

    .line 58
    .line 59
    invoke-interface {p1, v2, v0}, Lcom/zykj/huiwei/launcher/api/HomeService;->getSystemSettings(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getResult()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/SystemSettingsBean;

    .line 73
    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/SystemSettingsBean;->getUserPasswordStrength()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    :cond_4
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "sp_id_weather"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/d0;->b(Ljava/lang/String;)Lcom/blankj/utilcode/util/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "SP_KEY_WEATHER_CITY"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/d0;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "getString(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final g(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
    .locals 2

    .line 1
    const-string v0, "location"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getWeatherInfo$1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getWeatherInfo$1;-><init>(Lcom/zykj/huiwei/launcher/repository/HomeRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final h(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "city"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sp_id_weather"

    .line 7
    .line 8
    invoke-static {v0}, Lcom/blankj/utilcode/util/d0;->b(Ljava/lang/String;)Lcom/blankj/utilcode/util/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "SP_KEY_WEATHER_CITY"

    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Lcom/blankj/utilcode/util/d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final i(J)Lkotlinx/coroutines/flow/Flow;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$setPictureAsync$1;-><init>(Lcom/zykj/huiwei/launcher/repository/HomeRepository;JLkotlin/coroutines/Continuation;)V

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
