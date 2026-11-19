.class final Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->r(Ljava/lang/String;Z)V
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
    c = "com.zykj.student.dialogue.ui.ask.SearchQuestionViewModel$updateLocalCollectState$1"
    f = "SearchQuestionViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSearchQuestionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n230#2,3:111\n233#2,2:118\n1563#3:114\n1634#3,3:115\n*S KotlinDebug\n*F\n+ 1 SearchQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1\n*L\n85#1:111,3\n85#1:118,2\n86#1:114\n86#1:115,3\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;->b:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;->c:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;->d:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;->b:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;->c:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;->d:Z

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;-><init>(Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;->a:I

    .line 7
    .line 8
    if-nez v1, :cond_4

    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;->b:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    .line 14
    .line 15
    invoke-static {v1}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->n(Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-boolean v13, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;->d:Z

    .line 22
    .line 23
    :goto_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    move-object v4, v3

    .line 28
    check-cast v4, Lm6/k0;

    .line 29
    .line 30
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 31
    .line 32
    invoke-virtual {v4}, Lm6/k0;->b()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-static {v5}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    move-object v5, v6

    .line 47
    :cond_0
    check-cast v5, Ljava/lang/Iterable;

    .line 48
    .line 49
    new-instance v6, Ljava/util/ArrayList;

    .line 50
    .line 51
    const/16 v7, 0xa

    .line 52
    .line 53
    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v17

    .line 64
    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 75
    .line 76
    invoke-virtual {v5}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;->getId()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_1

    .line 85
    .line 86
    const/16 v15, 0x5ff

    .line 87
    .line 88
    const/16 v16, 0x0

    .line 89
    .line 90
    move-object v7, v4

    .line 91
    const/4 v4, 0x0

    .line 92
    move-object v8, v3

    .line 93
    move-object v3, v5

    .line 94
    const/4 v5, 0x0

    .line 95
    move-object v9, v6

    .line 96
    const/4 v6, 0x0

    .line 97
    move-object v10, v7

    .line 98
    const/4 v7, 0x0

    .line 99
    move-object v11, v8

    .line 100
    const/4 v8, 0x0

    .line 101
    move-object v12, v9

    .line 102
    const/4 v9, 0x0

    .line 103
    move-object v14, v10

    .line 104
    const/4 v10, 0x0

    .line 105
    move-object/from16 v18, v11

    .line 106
    .line 107
    const/4 v11, 0x0

    .line 108
    move-object/from16 v19, v12

    .line 109
    .line 110
    const/4 v12, 0x0

    .line 111
    move-object/from16 v20, v14

    .line 112
    .line 113
    const/4 v14, 0x0

    .line 114
    move-object/from16 v0, v19

    .line 115
    .line 116
    move-object/from16 v19, v18

    .line 117
    .line 118
    move-object/from16 v18, v2

    .line 119
    .line 120
    move-object/from16 v2, v20

    .line 121
    .line 122
    invoke-static/range {v3 .. v16}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;->copy$default(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    goto :goto_2

    .line 127
    :cond_1
    move-object/from16 v18, v2

    .line 128
    .line 129
    move-object/from16 v19, v3

    .line 130
    .line 131
    move-object v2, v4

    .line 132
    move-object v3, v5

    .line 133
    move-object v0, v6

    .line 134
    :goto_2
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-object v6, v0

    .line 138
    move-object v4, v2

    .line 139
    move-object/from16 v2, v18

    .line 140
    .line 141
    move-object/from16 v3, v19

    .line 142
    .line 143
    move-object/from16 v0, p0

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_2
    move-object/from16 v18, v2

    .line 147
    .line 148
    move-object/from16 v19, v3

    .line 149
    .line 150
    move-object v2, v4

    .line 151
    move-object v0, v6

    .line 152
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v2, v0}, Lm6/k0;->a(Ljava/lang/Object;)Lm6/k0;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    move-object/from16 v8, v19

    .line 161
    .line 162
    invoke-interface {v1, v8, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_3

    .line 167
    .line 168
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 169
    .line 170
    return-object v0

    .line 171
    :cond_3
    move-object/from16 v0, p0

    .line 172
    .line 173
    move-object/from16 v2, v18

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 178
    .line 179
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 180
    .line 181
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v0
.end method
