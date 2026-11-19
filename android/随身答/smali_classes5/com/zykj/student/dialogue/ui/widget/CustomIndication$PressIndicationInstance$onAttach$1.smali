.class final Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;->onAttach()V
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
    c = "com.zykj.student.dialogue.ui.widget.CustomIndication$PressIndicationInstance$onAttach$1"
    f = "CustomIndication.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x29
    }
    m = "invokeSuspend"
    n = {
        "pressCount",
        "hoverCount",
        "focusCount"
    }
    s = {
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->e:Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->e:Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;

    invoke-direct {p1, v0, p2}, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;-><init>(Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->d:I

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
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lkotlin/jvm/internal/Ref$IntRef;

    .line 40
    .line 41
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    .line 45
    .line 46
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lkotlin/jvm/internal/Ref$IntRef;

    .line 50
    .line 51
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 52
    .line 53
    .line 54
    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->e:Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;

    .line 55
    .line 56
    invoke-static {v4}, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;->a(Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;)Landroidx/compose/foundation/interaction/InteractionSource;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-interface {v4}, Landroidx/compose/foundation/interaction/InteractionSource;->getInteractions()Lkotlinx/coroutines/flow/Flow;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    new-instance v5, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;

    .line 65
    .line 66
    iget-object v6, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->e:Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;

    .line 67
    .line 68
    invoke-direct {v5, p1, v1, v3, v6}, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->a:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->b:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->c:Ljava/lang/Object;

    .line 88
    .line 89
    iput v2, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->d:I

    .line 90
    .line 91
    invoke-interface {v4, v5, p0}, Lkotlinx/coroutines/flow/Flow;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-ne p1, v0, :cond_2

    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p1
.end method
