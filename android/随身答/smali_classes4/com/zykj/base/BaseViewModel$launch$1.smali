.class final Lcom/zykj/base/BaseViewModel$launch$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/base/BaseViewModel;->launch(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;
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
    c = "com.zykj.base.BaseViewModel$launch$1"
    f = "BaseViewModel.kt"
    i = {}
    l = {
        0x1f,
        0x23,
        0x2b,
        0x27,
        0x2b,
        0x2b
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

    iput-object p1, p0, Lcom/zykj/base/BaseViewModel$launch$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    iput-object p2, p0, Lcom/zykj/base/BaseViewModel$launch$1;->d:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, Lcom/zykj/base/BaseViewModel$launch$1;->e:Lcom/zykj/base/BaseViewModel;

    iput-object p4, p0, Lcom/zykj/base/BaseViewModel$launch$1;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcom/zykj/base/BaseViewModel$launch$1;

    iget-object v1, p0, Lcom/zykj/base/BaseViewModel$launch$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    iget-object v2, p0, Lcom/zykj/base/BaseViewModel$launch$1;->d:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launch$1;->e:Lcom/zykj/base/BaseViewModel;

    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launch$1;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel$launch$1;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/base/BaseViewModel$launch$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/base/BaseViewModel$launch$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/base/BaseViewModel$launch$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/base/BaseViewModel$launch$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/base/BaseViewModel$launch$1;->b:I

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
    iget-object v0, p0, Lcom/zykj/base/BaseViewModel$launch$1;->a:Ljava/lang/Object;

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v1, Lcom/zykj/base/BaseViewModel$launch$1$1;

    .line 59
    .line 60
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launch$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 61
    .line 62
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launch$1$1;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 63
    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    iput v3, p0, Lcom/zykj/base/BaseViewModel$launch$1;->b:I

    .line 67
    .line 68
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_0

    .line 73
    .line 74
    goto :goto_6

    .line 75
    :cond_0
    :goto_0
    :try_start_2
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v1, Lcom/zykj/base/BaseViewModel$launch$1$2;

    .line 80
    .line 81
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launch$1;->d:Lkotlin/jvm/functions/Function2;

    .line 82
    .line 83
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launch$1$2;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    .line 84
    .line 85
    .line 86
    const/4 v3, 0x2

    .line 87
    iput v3, p0, Lcom/zykj/base/BaseViewModel$launch$1;->b:I

    .line 88
    .line 89
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 93
    if-ne p1, v0, :cond_1

    .line 94
    .line 95
    goto :goto_6

    .line 96
    :cond_1
    :goto_1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    new-instance v1, Lcom/zykj/base/BaseViewModel$launch$1$4;

    .line 101
    .line 102
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launch$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 103
    .line 104
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launch$1$4;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 105
    .line 106
    .line 107
    const/4 v2, 0x3

    .line 108
    iput v2, p0, Lcom/zykj/base/BaseViewModel$launch$1;->b:I

    .line 109
    .line 110
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-ne p1, v0, :cond_3

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :goto_2
    :try_start_3
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    new-instance v3, Lcom/zykj/base/BaseViewModel$launch$1$3;

    .line 122
    .line 123
    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launch$1;->e:Lcom/zykj/base/BaseViewModel;

    .line 124
    .line 125
    iget-object v5, p0, Lcom/zykj/base/BaseViewModel$launch$1;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 126
    .line 127
    invoke-direct {v3, v4, p1, v5, v2}, Lcom/zykj/base/BaseViewModel$launch$1$3;-><init>(Lcom/zykj/base/BaseViewModel;Ljava/lang/Throwable;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 128
    .line 129
    .line 130
    const/4 p1, 0x4

    .line 131
    iput p1, p0, Lcom/zykj/base/BaseViewModel$launch$1;->b:I

    .line 132
    .line 133
    invoke-static {v1, v3, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 137
    if-ne p1, v0, :cond_2

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_2
    :goto_3
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    new-instance v1, Lcom/zykj/base/BaseViewModel$launch$1$4;

    .line 145
    .line 146
    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launch$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 147
    .line 148
    invoke-direct {v1, v3, v2}, Lcom/zykj/base/BaseViewModel$launch$1$4;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 149
    .line 150
    .line 151
    const/4 v2, 0x5

    .line 152
    iput v2, p0, Lcom/zykj/base/BaseViewModel$launch$1;->b:I

    .line 153
    .line 154
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-ne p1, v0, :cond_3

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_3
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 162
    .line 163
    return-object p1

    .line 164
    :goto_5
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    new-instance v3, Lcom/zykj/base/BaseViewModel$launch$1$4;

    .line 169
    .line 170
    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launch$1;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 171
    .line 172
    invoke-direct {v3, v4, v2}, Lcom/zykj/base/BaseViewModel$launch$1$4;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    .line 173
    .line 174
    .line 175
    iput-object p1, p0, Lcom/zykj/base/BaseViewModel$launch$1;->a:Ljava/lang/Object;

    .line 176
    .line 177
    const/4 v2, 0x6

    .line 178
    iput v2, p0, Lcom/zykj/base/BaseViewModel$launch$1;->b:I

    .line 179
    .line 180
    invoke-static {v1, v3, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    if-ne v1, v0, :cond_4

    .line 185
    .line 186
    :goto_6
    return-object v0

    .line 187
    :cond_4
    move-object v0, p1

    .line 188
    :goto_7
    throw v0

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
