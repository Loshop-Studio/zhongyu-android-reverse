.class final Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->q(Ljava/lang/String;)V
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
    c = "com.zykj.student.dialogue.ui.ask.SearchQuestionViewModel$searchQuestions$1"
    f = "SearchQuestionViewModel.kt"
    i = {}
    l = {
        0x3c
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSearchQuestionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,110:1\n1563#2:111\n1634#2,3:112\n230#3,5:115\n*S KotlinDebug\n*F\n+ 1 SearchQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1\n*L\n62#1:111\n62#1:112,3\n77#1:115,5\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;->b:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;->c:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;->b:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;->c:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;-><init>(Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;->a:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;->b:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->m(Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;)Lk6/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v1, Lkotlin/Pair;

    .line 34
    .line 35
    const-string v3, "imgUrl"

    .line 36
    .line 37
    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-direct {v1, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iput v2, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;->a:I

    .line 47
    .line 48
    invoke-interface {p1, v1, p0}, Lk6/g;->p(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_2

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    :goto_0
    check-cast p1, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 56
    .line 57
    invoke-static {p1}, Li6/c;->a(Lcom/zykj/student/dialogue/network/BaseResponse;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Ljava/lang/Iterable;

    .line 62
    .line 63
    new-instance v0, Ljava/util/ArrayList;

    .line 64
    .line 65
    const/16 v1, 0xa

    .line 66
    .line 67
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;

    .line 89
    .line 90
    new-instance v2, Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;->getCourseId()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;->getUpdateTime()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;->getSnapshot()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;->getSummary()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;->getAskUserName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;->getAskUserPhoto()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;->getClassName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;->getTopicName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;->getId()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;->isCollect()Z

    .line 129
    .line 130
    .line 131
    move-result v12

    .line 132
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;->getUpdateTime()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    invoke-direct/range {v2 .. v13}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_3
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;->b:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    .line 144
    .line 145
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->n(Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    :cond_4
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    move-object v2, v1

    .line 154
    check-cast v2, Lm6/k0;

    .line 155
    .line 156
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-virtual {v2, v3}, Lm6/k0;->a(Ljava/lang/Object;)Lm6/k0;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-interface {p1, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_4

    .line 169
    .line 170
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 171
    .line 172
    return-object p1
.end method
