.class final Lcom/zykj/base/BaseViewModel$launchAsync$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/base/BaseViewModel;->launchAsync(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;
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
    c = "com.zykj.base.BaseViewModel$launchAsync$1"
    f = "BaseViewModel.kt"
    i = {
        0x3
    }
    l = {
        0x46,
        0x4a,
        0x52,
        0x4e,
        0x52,
        0x52
    }
    m = "invokeSuspend"
    n = {
        "e"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;

.field public final synthetic e:Lcom/zykj/base/BaseViewModel;

.field public final synthetic f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;


# direct methods
.method public constructor <init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    iput-object p2, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->d:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->e:Lcom/zykj/base/BaseViewModel;

    iput-object p4, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcom/zykj/base/BaseViewModel$launchAsync$1;

    iget-object v1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    iget-object v2, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->d:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->e:Lcom/zykj/base/BaseViewModel;

    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel$launchAsync$1;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/base/BaseViewModel$launchAsync$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/base/BaseViewModel$launchAsync$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/base/BaseViewModel$launchAsync$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/base/BaseViewModel$launchAsync$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->b:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/Throwable;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_7

    .line 27
    .line 28
    :pswitch_1
    iget-object v1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Ljava/lang/Throwable;

    .line 31
    .line 32
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :pswitch_3
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    goto :goto_2

    .line 51
    :pswitch_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v1, Lcom/zykj/base/BaseViewModel$launchAsync$1$1;

    .line 63
    .line 64
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 65
    .line 66
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$1;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 67
    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    iput v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->b:I

    .line 71
    .line 72
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v0, :cond_0

    .line 77
    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :cond_0
    :goto_0
    :try_start_2
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance v1, Lcom/zykj/base/BaseViewModel$launchAsync$1$2;

    .line 85
    .line 86
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->d:Lkotlin/jvm/functions/Function2;

    .line 87
    .line 88
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$2;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    .line 89
    .line 90
    .line 91
    const/4 v3, 0x2

    .line 92
    iput v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->b:I

    .line 93
    .line 94
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 98
    if-ne p1, v0, :cond_1

    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_1
    :goto_1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    new-instance v1, Lcom/zykj/base/BaseViewModel$launchAsync$1$4;

    .line 106
    .line 107
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 108
    .line 109
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$4;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 110
    .line 111
    .line 112
    const/4 v2, 0x3

    .line 113
    iput v2, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->b:I

    .line 114
    .line 115
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-ne p1, v0, :cond_3

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :goto_2
    :try_start_3
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    new-instance v3, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;

    .line 127
    .line 128
    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->e:Lcom/zykj/base/BaseViewModel;

    .line 129
    .line 130
    iget-object v5, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 131
    .line 132
    invoke-direct {v3, v4, p1, v5, v2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;-><init>(Lcom/zykj/base/BaseViewModel;Ljava/lang/Throwable;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 133
    .line 134
    .line 135
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iput-object p1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->a:Ljava/lang/Object;

    .line 140
    .line 141
    const/4 p1, 0x4

    .line 142
    iput p1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->b:I

    .line 143
    .line 144
    invoke-static {v1, v3, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 148
    if-ne p1, v0, :cond_2

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_2
    :goto_3
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    new-instance v1, Lcom/zykj/base/BaseViewModel$launchAsync$1$4;

    .line 156
    .line 157
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 158
    .line 159
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$4;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 160
    .line 161
    .line 162
    iput-object v2, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->a:Ljava/lang/Object;

    .line 163
    .line 164
    const/4 v2, 0x5

    .line 165
    iput v2, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->b:I

    .line 166
    .line 167
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    if-ne p1, v0, :cond_3

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_3
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 175
    .line 176
    return-object p1

    .line 177
    :goto_5
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    new-instance v3, Lcom/zykj/base/BaseViewModel$launchAsync$1$4;

    .line 182
    .line 183
    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 184
    .line 185
    invoke-direct {v3, v4, v2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$4;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 186
    .line 187
    .line 188
    iput-object p1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->a:Ljava/lang/Object;

    .line 189
    .line 190
    const/4 v2, 0x6

    .line 191
    iput v2, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->b:I

    .line 192
    .line 193
    invoke-static {v1, v3, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    if-ne v1, v0, :cond_4

    .line 198
    .line 199
    :goto_6
    return-object v0

    .line 200
    :cond_4
    move-object v0, p1

    .line 201
    :goto_7
    throw v0

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
