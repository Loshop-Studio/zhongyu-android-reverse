.class public final Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/FlowCollector;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/FlowCollector;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2;->a:Lkotlinx/coroutines/flow/FlowCollector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;->b:I

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
    iput v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;->b:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;->b:I

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
    iget-object p1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lkotlinx/coroutines/flow/FlowCollector;

    .line 41
    .line 42
    iget-object p1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;

    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2;->a:Lkotlinx/coroutines/flow/FlowCollector;

    .line 62
    .line 63
    move-object v2, p1

    .line 64
    check-cast v2, Lcom/zykj/http/bean/HeaderBean;

    .line 65
    .line 66
    invoke-virtual {v2}, Lcom/zykj/http/bean/HeaderBean;->getServerUrl()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-nez v2, :cond_3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iput-object v2, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;->c:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iput-object v2, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;->d:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iput-object v2, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;->f:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iput-object v2, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;->g:Ljava/lang/Object;

    .line 96
    .line 97
    const/4 v2, 0x0

    .line 98
    iput v2, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;->h:I

    .line 99
    .line 100
    iput v3, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1;->b:I

    .line 101
    .line 102
    invoke-interface {p2, p1, v0}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v1, :cond_4

    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_4
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p1
.end method
