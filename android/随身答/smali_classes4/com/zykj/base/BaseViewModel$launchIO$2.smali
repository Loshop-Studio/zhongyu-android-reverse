.class final Lcom/zykj/base/BaseViewModel$launchIO$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/base/BaseViewModel;->launchIO(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.base.BaseViewModel$launchIO$2"
    f = "BaseViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x62,
        0x66,
        0x6c,
        0x68,
        0x6c,
        0x6c
    }
    m = "invokeSuspend"
    n = {
        "$this$withContext"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;

.field public final synthetic d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

.field public final synthetic e:Lcom/zykj/base/BaseViewModel;

.field public final synthetic f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->c:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    iput-object p3, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->e:Lcom/zykj/base/BaseViewModel;

    iput-object p4, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcom/zykj/base/BaseViewModel$launchIO$2;

    iget-object v1, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->c:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->e:Lcom/zykj/base/BaseViewModel;

    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel$launchIO$2;-><init>(Lkotlin/jvm/functions/Function2;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/base/BaseViewModel$launchIO$2;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/base/BaseViewModel$launchIO$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/base/BaseViewModel$launchIO$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/base/BaseViewModel$launchIO$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/base/BaseViewModel$launchIO$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->a:I

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
    iget-object v0, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->b:Ljava/lang/Object;

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
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :pswitch_3
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_1
    move-exception p1

    .line 46
    goto :goto_2

    .line 47
    :pswitch_4
    iget-object v1, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    .line 50
    .line 51
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
    iget-object p1, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->b:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v1, p1

    .line 61
    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    .line 62
    .line 63
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance v3, Lcom/zykj/base/BaseViewModel$launchIO$2$1;

    .line 68
    .line 69
    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 70
    .line 71
    invoke-direct {v3, v4, v2}, Lcom/zykj/base/BaseViewModel$launchIO$2$1;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->b:Ljava/lang/Object;

    .line 75
    .line 76
    const/4 v4, 0x1

    .line 77
    iput v4, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->a:I

    .line 78
    .line 79
    invoke-static {p1, v3, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v0, :cond_0

    .line 84
    .line 85
    goto :goto_6

    .line 86
    :cond_0
    :goto_0
    :try_start_2
    iget-object p1, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->c:Lkotlin/jvm/functions/Function2;

    .line 87
    .line 88
    iput-object v2, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->b:Ljava/lang/Object;

    .line 89
    .line 90
    const/4 v3, 0x2

    .line 91
    iput v3, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->a:I

    .line 92
    .line 93
    invoke-interface {p1, v1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    if-ne p1, v0, :cond_1

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_1
    :goto_1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance v1, Lcom/zykj/base/BaseViewModel$launchIO$2$3;

    .line 105
    .line 106
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 107
    .line 108
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launchIO$2$3;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 109
    .line 110
    .line 111
    const/4 v2, 0x3

    .line 112
    iput v2, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->a:I

    .line 113
    .line 114
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-ne p1, v0, :cond_3

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :goto_2
    :try_start_3
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    new-instance v3, Lcom/zykj/base/BaseViewModel$launchIO$2$2;

    .line 126
    .line 127
    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->e:Lcom/zykj/base/BaseViewModel;

    .line 128
    .line 129
    iget-object v5, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 130
    .line 131
    invoke-direct {v3, v4, p1, v5, v2}, Lcom/zykj/base/BaseViewModel$launchIO$2$2;-><init>(Lcom/zykj/base/BaseViewModel;Ljava/lang/Throwable;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 132
    .line 133
    .line 134
    iput-object v2, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->b:Ljava/lang/Object;

    .line 135
    .line 136
    const/4 p1, 0x4

    .line 137
    iput p1, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->a:I

    .line 138
    .line 139
    invoke-static {v1, v3, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 143
    if-ne p1, v0, :cond_2

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_2
    :goto_3
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance v1, Lcom/zykj/base/BaseViewModel$launchIO$2$3;

    .line 151
    .line 152
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 153
    .line 154
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launchIO$2$3;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 155
    .line 156
    .line 157
    const/4 v2, 0x5

    .line 158
    iput v2, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->a:I

    .line 159
    .line 160
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    if-ne p1, v0, :cond_3

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_3
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p1

    .line 170
    :goto_5
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    new-instance v3, Lcom/zykj/base/BaseViewModel$launchIO$2$3;

    .line 175
    .line 176
    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->d:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 177
    .line 178
    invoke-direct {v3, v4, v2}, Lcom/zykj/base/BaseViewModel$launchIO$2$3;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 179
    .line 180
    .line 181
    iput-object p1, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->b:Ljava/lang/Object;

    .line 182
    .line 183
    const/4 v2, 0x6

    .line 184
    iput v2, p0, Lcom/zykj/base/BaseViewModel$launchIO$2;->a:I

    .line 185
    .line 186
    invoke-static {v1, v3, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    if-ne v1, v0, :cond_4

    .line 191
    .line 192
    :goto_6
    return-object v0

    .line 193
    :cond_4
    move-object v0, p1

    .line 194
    :goto_7
    throw v0

    .line 195
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
