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
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.base.BaseViewModel$launchAsync$1"
    f = "BaseViewModel.kt"
    i = {}
    l = {
        0x36,
        0x3a,
        0x42,
        0x3e,
        0x42,
        0x42
    }
    m = "invokeSuspend"
    n = {}
    s = {}
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

    new-instance p1, Lcom/zykj/base/BaseViewModel$launchAsync$1;

    iget-object v1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    iget-object v2, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->d:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->e:Lcom/zykj/base/BaseViewModel;

    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel$launchAsync$1;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    return-object p1
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
    goto/16 :goto_6

    .line 27
    .line 28
    :pswitch_1
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_3

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :pswitch_3
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_1
    move-exception p1

    .line 45
    goto :goto_2

    .line 46
    :pswitch_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v1, Lcom/zykj/base/BaseViewModel$launchAsync$1$1;

    .line 58
    .line 59
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 60
    .line 61
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$1;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 62
    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    iput v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->b:I

    .line 66
    .line 67
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v0, :cond_0

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_0
    :goto_0
    :try_start_2
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance v1, Lcom/zykj/base/BaseViewModel$launchAsync$1$2;

    .line 79
    .line 80
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->d:Lkotlin/jvm/functions/Function2;

    .line 81
    .line 82
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$2;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    .line 83
    .line 84
    .line 85
    const/4 v3, 0x2

    .line 86
    iput v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->b:I

    .line 87
    .line 88
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    if-ne p1, v0, :cond_1

    .line 93
    .line 94
    return-object v0

    .line 95
    :cond_1
    :goto_1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    new-instance v1, Lcom/zykj/base/BaseViewModel$launchAsync$1$4;

    .line 100
    .line 101
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 102
    .line 103
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$4;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 104
    .line 105
    .line 106
    const/4 v2, 0x3

    .line 107
    iput v2, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->b:I

    .line 108
    .line 109
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p1, v0, :cond_3

    .line 114
    .line 115
    return-object v0

    .line 116
    :goto_2
    :try_start_3
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    new-instance v3, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;

    .line 121
    .line 122
    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->e:Lcom/zykj/base/BaseViewModel;

    .line 123
    .line 124
    iget-object v5, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 125
    .line 126
    invoke-direct {v3, v4, p1, v5, v2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$3;-><init>(Lcom/zykj/base/BaseViewModel;Ljava/lang/Throwable;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 127
    .line 128
    .line 129
    const/4 p1, 0x4

    .line 130
    iput p1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->b:I

    .line 131
    .line 132
    invoke-static {v1, v3, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 136
    if-ne p1, v0, :cond_2

    .line 137
    .line 138
    return-object v0

    .line 139
    :cond_2
    :goto_3
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    new-instance v1, Lcom/zykj/base/BaseViewModel$launchAsync$1$4;

    .line 144
    .line 145
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 146
    .line 147
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$4;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 148
    .line 149
    .line 150
    const/4 v2, 0x5

    .line 151
    iput v2, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->b:I

    .line 152
    .line 153
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-ne p1, v0, :cond_3

    .line 158
    .line 159
    return-object v0

    .line 160
    :cond_3
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 161
    .line 162
    return-object p1

    .line 163
    :goto_5
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    new-instance v3, Lcom/zykj/base/BaseViewModel$launchAsync$1$4;

    .line 168
    .line 169
    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 170
    .line 171
    invoke-direct {v3, v4, v2}, Lcom/zykj/base/BaseViewModel$launchAsync$1$4;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 172
    .line 173
    .line 174
    iput-object p1, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->a:Ljava/lang/Object;

    .line 175
    .line 176
    const/4 v2, 0x6

    .line 177
    iput v2, p0, Lcom/zykj/base/BaseViewModel$launchAsync$1;->b:I

    .line 178
    .line 179
    invoke-static {v1, v3, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    if-ne v1, v0, :cond_4

    .line 184
    .line 185
    return-object v0

    .line 186
    :cond_4
    move-object v0, p1

    .line 187
    :goto_6
    throw v0

    .line 188
    nop

    .line 189
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
