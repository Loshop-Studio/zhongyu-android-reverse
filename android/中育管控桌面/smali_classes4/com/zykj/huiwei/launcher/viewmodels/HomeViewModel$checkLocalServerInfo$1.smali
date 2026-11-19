# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->w()V
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
    c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$checkLocalServerInfo$1"
    f = "HomeViewModel.kt"
    i = {
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x155,
        0x15c,
        0x161
    }
    m = "invokeSuspend"
    n = {
        "serverBean",
        "schoolCode",
        "serverBean",
        "schoolCode",
        "loginUrlResp",
        "responseWebServerUrl"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "L$3"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->f:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->f:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->e:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v5, :cond_2

    .line 14
    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/lang/String;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_6

    .line 39
    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Lcom/zykj/huiwei/launcher/proto/a;

    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->f:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 68
    .line 69
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->l(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/datastore/core/DataStore;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput v5, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->e:I

    .line 78
    .line 79
    invoke-static {p1, p0}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v0, :cond_4

    .line 84
    .line 85
    goto/16 :goto_5

    .line 86
    .line 87
    :cond_4
    :goto_0
    check-cast p1, Lcom/zykj/huiwei/launcher/proto/a;

    .line 88
    .line 89
    if-nez p1, :cond_5

    .line 90
    .line 91
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/proto/a;->getWebServerUrl()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const-string v6, "getWebServerUrl(...)"

    .line 99
    .line 100
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_d

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/proto/a;->getSchoolCode()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-lez v6, :cond_6

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_6
    move-object v1, v4

    .line 124
    :goto_1
    if-nez v1, :cond_7

    .line 125
    .line 126
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p1

    .line 129
    :cond_7
    iget-object v6, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->f:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 130
    .line 131
    invoke-static {v6}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->h(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Lw3/b;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    iput-object v7, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->a:Ljava/lang/Object;

    .line 140
    .line 141
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    iput-object v7, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->b:Ljava/lang/Object;

    .line 146
    .line 147
    iput v3, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->e:I

    .line 148
    .line 149
    invoke-virtual {v6, v1, p0}, Lw3/b;->a(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    if-ne v3, v0, :cond_8

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_8
    move-object v8, v3

    .line 157
    move-object v3, p1

    .line 158
    move-object p1, v8

    .line 159
    :goto_2
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 160
    .line 161
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;->getWebServer()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    if-eqz v6, :cond_a

    .line 166
    .line 167
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    if-nez v7, :cond_9

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_9
    const/4 v5, 0x0

    .line 175
    :cond_a
    :goto_3
    if-nez v5, :cond_b

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_b
    move-object v6, v4

    .line 179
    :goto_4
    if-nez v6, :cond_c

    .line 180
    .line 181
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p1

    .line 184
    :cond_c
    iget-object v5, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->f:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 185
    .line 186
    invoke-static {v5}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->l(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/datastore/core/DataStore;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    new-instance v7, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1$1;

    .line 191
    .line 192
    invoke-direct {v7, v6, v4}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    iput-object v3, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->a:Ljava/lang/Object;

    .line 200
    .line 201
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    iput-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->b:Ljava/lang/Object;

    .line 206
    .line 207
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->c:Ljava/lang/Object;

    .line 212
    .line 213
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->d:Ljava/lang/Object;

    .line 218
    .line 219
    iput v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;->e:I

    .line 220
    .line 221
    invoke-interface {v5, v7, p0}, Landroidx/datastore/core/DataStore;->updateData(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    if-ne p1, v0, :cond_d

    .line 226
    .line 227
    :goto_5
    return-object v0

    .line 228
    :cond_d
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 229
    .line 230
    return-object p1
.end method
