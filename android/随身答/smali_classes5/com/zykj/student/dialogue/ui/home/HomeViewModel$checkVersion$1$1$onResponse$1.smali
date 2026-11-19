.class final Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1;->b(Ll8/e;Ll8/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
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
    c = "com.zykj.student.dialogue.ui.home.HomeViewModel$checkVersion$1$1$onResponse$1"
    f = "HomeViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x7e
    }
    m = "invokeSuspend"
    n = {
        "json",
        "$this$invokeSuspend_u24lambda_u240",
        "fromJson",
        "$i$a$-apply-HomeViewModel$checkVersion$1$1$onResponse$1$1",
        "appVersionCode"
    }
    s = {
        "L$0",
        "L$2",
        "L$3",
        "I$0",
        "I$1"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public g:I

.field public final synthetic h:Ll8/y;

.field public final synthetic i:Lcom/zykj/student/dialogue/ui/home/HomeViewModel;


# direct methods
.method public constructor <init>(Ll8/y;Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->h:Ll8/y;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->i:Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->h:Ll8/y;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->i:Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;-><init>(Ll8/y;Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->g:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/zykj/student/dialogue/bean/resp/VersionUpdate;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/lang/String;

    .line 27
    .line 28
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto :goto_3

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto :goto_2

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->h:Ll8/y;

    .line 46
    .line 47
    invoke-virtual {p1}, Ll8/y;->a()Ll8/z;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Ll8/z;->string()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/4 p1, 0x0

    .line 59
    :goto_0
    if-eqz p1, :cond_4

    .line 60
    .line 61
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->i:Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 62
    .line 63
    :try_start_1
    const-class v3, Lcom/zykj/student/dialogue/bean/resp/VersionUpdate;

    .line 64
    .line 65
    invoke-static {p1, v3}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Lcom/zykj/student/dialogue/bean/resp/VersionUpdate;

    .line 70
    .line 71
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionCode()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-virtual {v3}, Lcom/zykj/student/dialogue/bean/resp/VersionUpdate;->getResult()Lcom/zykj/student/dialogue/bean/resp/VersionResult;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    const/4 v6, 0x0

    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    invoke-virtual {v5}, Lcom/zykj/student/dialogue/bean/resp/VersionResult;->getVersionCode()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move v5, v6

    .line 88
    :goto_1
    if-le v5, v4, :cond_4

    .line 89
    .line 90
    invoke-static {v1}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->q(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v3}, Lcom/zykj/student/dialogue/bean/resp/VersionUpdate;->getResult()Lcom/zykj/student/dialogue/bean/resp/VersionResult;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    iput-object v7, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->a:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->b:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->c:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->d:Ljava/lang/Object;

    .line 117
    .line 118
    iput v6, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->e:I

    .line 119
    .line 120
    iput v4, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->f:I

    .line 121
    .line 122
    iput v2, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1$1$onResponse$1;->g:I

    .line 123
    .line 124
    invoke-interface {v1, v5, p0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 128
    if-ne p1, v0, :cond_4

    .line 129
    .line 130
    return-object v0

    .line 131
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 132
    .line 133
    .line 134
    :cond_4
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p1
.end method
