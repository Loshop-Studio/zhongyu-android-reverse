.class final Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/base/BaseViewModel;->e(Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V
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
    c = "com.zykj.student.dialogue.base.BaseViewModel$launchData$3"
    f = "BaseViewModel.kt"
    i = {
        0x0,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3
    }
    l = {
        0x4b,
        0x4c,
        0x50,
        0x53
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$launch",
        "$this$launch",
        "e",
        "it",
        "$i$a$-let-BaseViewModel$launchData$3$1",
        "$this$launch"
    }
    s = {
        "L$0",
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "L$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lkotlin/jvm/functions/Function2;

.field public final synthetic g:Lkotlin/jvm/functions/Function2;

.field public final synthetic h:Lkotlin/jvm/functions/Function3;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->f:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->g:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->h:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->i:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->j:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7

    new-instance v0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;

    iget-object v1, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->f:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->g:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->h:Lkotlin/jvm/functions/Function3;

    iget-object v4, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->i:Ljava/lang/String;

    iget-object v5, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->j:Lkotlin/jvm/functions/Function2;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->d:I

    .line 10
    .line 11
    const/4 v3, 0x4

    .line 12
    const/4 v4, 0x3

    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x1

    .line 15
    if-eqz v2, :cond_4

    .line 16
    .line 17
    if-eq v2, v6, :cond_3

    .line 18
    .line 19
    if-eq v2, v5, :cond_2

    .line 20
    .line 21
    if-eq v2, v4, :cond_1

    .line 22
    .line 23
    if-ne v2, v3, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    iget-object v2, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Lkotlin/jvm/functions/Function3;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/lang/Throwable;

    .line 45
    .line 46
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :try_start_1
    iget-object p1, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->f:Lkotlin/jvm/functions/Function2;

    .line 64
    .line 65
    iput-object v0, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    .line 66
    .line 67
    iput v6, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->d:I

    .line 68
    .line 69
    invoke-interface {p1, v0, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v1, :cond_5

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    :goto_0
    iget-object p1, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->g:Lkotlin/jvm/functions/Function2;

    .line 77
    .line 78
    iput-object v0, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    .line 79
    .line 80
    iput v5, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->d:I

    .line 81
    .line 82
    invoke-interface {p1, v0, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    if-ne p1, v1, :cond_7

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 90
    .line 91
    .line 92
    iget-object v2, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->h:Lkotlin/jvm/functions/Function3;

    .line 93
    .line 94
    if-eqz v2, :cond_6

    .line 95
    .line 96
    iput-object v0, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object p1, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->a:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iput-object v5, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->b:Ljava/lang/Object;

    .line 105
    .line 106
    const/4 v5, 0x0

    .line 107
    iput v5, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->c:I

    .line 108
    .line 109
    iput v4, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->d:I

    .line 110
    .line 111
    invoke-interface {v2, v0, p1, p0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-ne p1, v1, :cond_7

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    iget-object v2, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->i:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {p1, v2}, Li6/b;->f(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_7
    :goto_2
    iget-object p1, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->j:Lkotlin/jvm/functions/Function2;

    .line 124
    .line 125
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    iput-object v2, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    .line 130
    .line 131
    const/4 v2, 0x0

    .line 132
    iput-object v2, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->a:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v2, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->b:Ljava/lang/Object;

    .line 135
    .line 136
    iput v3, p0, Lcom/zykj/student/dialogue/base/BaseViewModel$launchData$3;->d:I

    .line 137
    .line 138
    invoke-interface {p1, v0, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-ne p1, v1, :cond_8

    .line 143
    .line 144
    :goto_3
    return-object v1

    .line 145
    :cond_8
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p1
.end method
