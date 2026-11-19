.class final Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->y(JLjava/lang/String;)V
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
    c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$createOrUpdateTag$1"
    f = "MistakeViewModel.kt"
    i = {}
    l = {
        0xa2
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,585:1\n230#2,3:586\n233#2,2:591\n1869#3,2:589\n*S KotlinDebug\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1\n*L\n165#1:586,3\n165#1:591,2\n169#1:589,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;JLjava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iput-wide p2, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->c:J

    iput-object p4, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->d:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iget-wide v2, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->c:J

    iget-object v4, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->d:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;-><init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;JLjava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->a:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    move-object/from16 v2, p1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 32
    .line 33
    invoke-static {v2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->t(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lp5/j;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v4, Lcom/zykj/evaluation/bean/CreateTagReq;

    .line 38
    .line 39
    iget-wide v5, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->c:J

    .line 40
    .line 41
    invoke-static {v5, v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    iget-object v6, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->d:Ljava/lang/String;

    .line 46
    .line 47
    invoke-direct {v4, v5, v6}, Lcom/zykj/evaluation/bean/CreateTagReq;-><init>(Ljava/lang/Long;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->a:I

    .line 51
    .line 52
    invoke-interface {v2, v4, v0}, Lp5/j;->q(Lcom/zykj/evaluation/bean/CreateTagReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-ne v2, v1, :cond_2

    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_2
    :goto_0
    check-cast v2, Lcom/zykj/http/bean/ApiResp;

    .line 60
    .line 61
    invoke-static {v2}, Lo5/g;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 66
    .line 67
    iget-object v7, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;->d:Ljava/lang/String;

    .line 68
    .line 69
    check-cast v1, Ljava/lang/Number;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v11

    .line 75
    invoke-static {v2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->u(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :cond_3
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    move-object v14, v13

    .line 84
    check-cast v14, Lz5/l1;

    .line 85
    .line 86
    new-instance v15, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v14}, Lz5/l1;->e()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v16

    .line 99
    move v4, v3

    .line 100
    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_5

    .line 105
    .line 106
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    check-cast v5, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 111
    .line 112
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 113
    .line 114
    .line 115
    move-result-wide v8

    .line 116
    cmp-long v6, v8, v11

    .line 117
    .line 118
    if-nez v6, :cond_4

    .line 119
    .line 120
    const/4 v9, 0x5

    .line 121
    const/4 v10, 0x0

    .line 122
    move-object v4, v5

    .line 123
    const-wide/16 v5, 0x0

    .line 124
    .line 125
    const/4 v8, 0x0

    .line 126
    invoke-static/range {v4 .. v10}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    const/4 v4, 0x0

    .line 134
    goto :goto_1

    .line 135
    :cond_4
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    if-eqz v4, :cond_6

    .line 140
    .line 141
    new-instance v4, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 142
    .line 143
    const/4 v5, 0x0

    .line 144
    invoke-static {v2, v5, v3, v5}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->w(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Ljava/util/List;ILjava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    xor-int/2addr v5, v3

    .line 149
    invoke-direct {v4, v11, v12, v7, v5}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;-><init>(JLjava/lang/String;Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v15, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_6
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 156
    .line 157
    const/16 v27, 0x5ff

    .line 158
    .line 159
    const/16 v28, 0x0

    .line 160
    .line 161
    move-object/from16 v25, v15

    .line 162
    .line 163
    const/4 v15, 0x0

    .line 164
    const-wide/16 v16, 0x0

    .line 165
    .line 166
    const/16 v18, 0x0

    .line 167
    .line 168
    const/16 v19, 0x0

    .line 169
    .line 170
    const/16 v20, 0x0

    .line 171
    .line 172
    const/16 v21, 0x0

    .line 173
    .line 174
    const/16 v22, 0x0

    .line 175
    .line 176
    const/16 v23, 0x0

    .line 177
    .line 178
    const/16 v24, 0x0

    .line 179
    .line 180
    const/16 v26, 0x0

    .line 181
    .line 182
    invoke-static/range {v14 .. v28}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-interface {v1, v13, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-eqz v4, :cond_3

    .line 191
    .line 192
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 193
    .line 194
    return-object v1
.end method
