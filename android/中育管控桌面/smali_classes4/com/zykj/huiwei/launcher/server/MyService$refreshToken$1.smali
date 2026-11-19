# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/server/MyService;->e(Lkotlin/jvm/functions/Function1;)V
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
    c = "com.zykj.huiwei.launcher.server.MyService$refreshToken$1"
    f = "MyService.kt"
    i = {
        0x1,
        0x1
    }
    l = {
        0x118,
        0x11c
    }
    m = "invokeSuspend"
    n = {
        "settings",
        "serverInfo"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public final synthetic d:Lcom/zykj/huiwei/launcher/server/MyService;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/server/MyService;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->d:Lcom/zykj/huiwei/launcher/server/MyService;

    iput-object p2, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->e:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->d:Lcom/zykj/huiwei/launcher/server/MyService;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->e:Lkotlin/jvm/functions/Function1;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;-><init>(Lcom/zykj/huiwei/launcher/server/MyService;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/zykj/message/server/bean/ServerInfo;

    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/d;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->d:Lcom/zykj/huiwei/launcher/server/MyService;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/server/MyService;->m()Landroidx/datastore/core/DataStore;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput v3, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->c:I

    .line 53
    .line 54
    invoke-static {p1, p0}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v0, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    :goto_0
    check-cast p1, Lcom/zykj/huiwei/launcher/proto/d;

    .line 62
    .line 63
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->d:Lcom/zykj/huiwei/launcher/server/MyService;

    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/server/MyService;->c()Lcom/zykj/message/server/bean/ServerInfo;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/proto/d;->getIsLoginSuccess()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_6

    .line 74
    .line 75
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->d:Lcom/zykj/huiwei/launcher/server/MyService;

    .line 76
    .line 77
    invoke-virtual {v3}, Lcom/zykj/huiwei/launcher/server/MyService;->k()Lq3/a;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v1}, Lcom/zykj/message/server/bean/ServerInfo;->a()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-nez v4, :cond_4

    .line 86
    .line 87
    const-string v4, ""

    .line 88
    .line 89
    :cond_4
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->a:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->b:Ljava/lang/Object;

    .line 100
    .line 101
    iput v2, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->c:I

    .line 102
    .line 103
    invoke-virtual {v3, v4, p0}, Lq3/a;->a(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v0, :cond_5

    .line 108
    .line 109
    :goto_1
    return-object v0

    .line 110
    :cond_5
    :goto_2
    :try_start_0
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->d:Lcom/zykj/huiwei/launcher/server/MyService;

    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/server/MyService;->c()Lcom/zykj/message/server/bean/ServerInfo;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->e:Lkotlin/jvm/functions/Function1;

    .line 117
    .line 118
    sget-object v1, Lcom/zykj/message/server/MessageManage;->a:Lcom/zykj/message/server/MessageManage;

    .line 119
    .line 120
    invoke-virtual {v1, p1}, Lcom/zykj/message/server/MessageManage;->c(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :catch_0
    move-exception p1

    .line 128
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    sget-object p1, Lcom/zykj/huiwei/launcher/server/MyService;->o:Lcom/zykj/huiwei/launcher/server/MyService$a;

    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/server/MyService$a;->a()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string v0, "refreshToken \u53ef\u80fd\u662f\u7a7a\u7684"

    .line 139
    .line 140
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->e:Lkotlin/jvm/functions/Function1;

    .line 144
    .line 145
    new-instance v0, Lcom/zykj/message/server/bean/ServerInfo;

    .line 146
    .line 147
    invoke-direct {v0}, Lcom/zykj/message/server/bean/ServerInfo;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/server/MyService$refreshToken$1;->d:Lcom/zykj/huiwei/launcher/server/MyService;

    .line 154
    .line 155
    sget-object v0, Lcom/zykj/huiwei/launcher/app/App;->Companion:Lcom/zykj/huiwei/launcher/app/App$a;

    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const v1, 0x7f110098

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    const-string v1, "getString(...)"

    .line 169
    .line 170
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-static {p1, v0}, Lcom/zykj/huiwei/launcher/server/MyService;->j(Lcom/zykj/huiwei/launcher/server/MyService;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 177
    .line 178
    return-object p1
.end method
