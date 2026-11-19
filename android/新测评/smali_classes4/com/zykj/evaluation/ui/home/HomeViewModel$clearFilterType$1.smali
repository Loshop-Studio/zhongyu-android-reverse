.class final Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/home/HomeViewModel;->I(Lcom/zykj/evaluation/ui/home/c;)V
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
    c = "com.zykj.evaluation.ui.home.HomeViewModel$clearFilterType$1"
    f = "HomeViewModel.kt"
    i = {}
    l = {
        0x111
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:726\n1563#3:719\n1634#3,3:720\n774#3:723\n865#3,2:724\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1\n*L\n263#1:716,3\n263#1:726,2\n265#1:719\n265#1:720,3\n267#1:723\n267#1:724,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/home/c;

.field public final synthetic c:Lcom/zykj/evaluation/ui/home/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/home/c;Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->b:Lcom/zykj/evaluation/ui/home/c;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->b:Lcom/zykj/evaluation/ui/home/c;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;-><init>(Lcom/zykj/evaluation/ui/home/c;Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->a:I

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
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->b:Lcom/zykj/evaluation/ui/home/c;

    .line 29
    .line 30
    instance-of v1, p1, Lcom/zykj/evaluation/ui/home/c$d;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 35
    .line 36
    sget-object v1, Lcom/zykj/evaluation/ui/home/c$d$a;->d:Lcom/zykj/evaluation/ui/home/c$d$a;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->F(Lcom/zykj/evaluation/ui/home/c;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    instance-of v1, p1, Lcom/zykj/evaluation/ui/home/c$b;

    .line 43
    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 47
    .line 48
    sget-object v1, Lcom/zykj/evaluation/ui/home/c$b$a;->d:Lcom/zykj/evaluation/ui/home/c$b$a;

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->F(Lcom/zykj/evaluation/ui/home/c;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    instance-of v1, p1, Lcom/zykj/evaluation/ui/home/c$a;

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 59
    .line 60
    sget-object v1, Lcom/zykj/evaluation/ui/home/c$a$d;->d:Lcom/zykj/evaluation/ui/home/c$a$d;

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->F(Lcom/zykj/evaluation/ui/home/c;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    instance-of v1, p1, Lcom/zykj/evaluation/ui/home/c$c;

    .line 67
    .line 68
    if-eqz v1, :cond_5

    .line 69
    .line 70
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 71
    .line 72
    sget-object v1, Lcom/zykj/evaluation/ui/home/c$c$c;->d:Lcom/zykj/evaluation/ui/home/c$c$c;

    .line 73
    .line 74
    invoke-virtual {p1, v1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->F(Lcom/zykj/evaluation/ui/home/c;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    instance-of p1, p1, Lcom/zykj/evaluation/ui/home/c$e;

    .line 79
    .line 80
    if-eqz p1, :cond_b

    .line 81
    .line 82
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 83
    .line 84
    sget-object v1, Lcom/zykj/evaluation/ui/home/c$e$d;->e:Lcom/zykj/evaluation/ui/home/c$e$d;

    .line 85
    .line 86
    invoke-virtual {p1, v1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->F(Lcom/zykj/evaluation/ui/home/c;)V

    .line 87
    .line 88
    .line 89
    :goto_0
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 90
    .line 91
    invoke-static {p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->v(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 96
    .line 97
    :cond_6
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    move-object v4, v3

    .line 102
    check-cast v4, Lcom/zykj/evaluation/ui/home/HomeViewState;

    .line 103
    .line 104
    invoke-static {v1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->u(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-interface {v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    check-cast v5, Lcom/zykj/evaluation/ui/home/HomeFilterState;

    .line 113
    .line 114
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/home/HomeFilterState;->getFilterDataList()Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    new-instance v6, Ljava/util/ArrayList;

    .line 119
    .line 120
    const/16 v7, 0xa

    .line 121
    .line 122
    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_7

    .line 138
    .line 139
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    check-cast v7, Ls6/d;

    .line 144
    .line 145
    new-instance v8, Lkotlin/Pair;

    .line 146
    .line 147
    invoke-virtual {v7}, Ls6/d;->e()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-virtual {v7}, Ls6/d;->g()Lcom/zykj/evaluation/ui/home/c;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-direct {v8, v9, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_7
    new-instance v5, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    const/4 v8, 0x0

    .line 172
    :cond_8
    :goto_2
    if-ge v8, v7, :cond_9

    .line 173
    .line 174
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    add-int/lit8 v8, v8, 0x1

    .line 179
    .line 180
    move-object v10, v9

    .line 181
    check-cast v10, Lkotlin/Pair;

    .line 182
    .line 183
    invoke-virtual {v10}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    check-cast v10, Ljava/lang/CharSequence;

    .line 188
    .line 189
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-lez v10, :cond_8

    .line 194
    .line 195
    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_9
    const/16 v9, 0xd

    .line 200
    .line 201
    const/4 v10, 0x0

    .line 202
    move-object v6, v5

    .line 203
    const/4 v5, 0x0

    .line 204
    const/4 v7, 0x0

    .line 205
    const/4 v8, 0x0

    .line 206
    invoke-static/range {v4 .. v10}, Lcom/zykj/evaluation/ui/home/HomeViewState;->copy$default(Lcom/zykj/evaluation/ui/home/HomeViewState;Ls6/d1;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/home/HomeViewState;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-interface {p1, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_6

    .line 215
    .line 216
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 217
    .line 218
    iput v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;->a:I

    .line 219
    .line 220
    invoke-static {p1, p0}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->B(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    if-ne p1, v0, :cond_a

    .line 225
    .line 226
    return-object v0

    .line 227
    :cond_a
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 228
    .line 229
    return-object p1

    .line 230
    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 231
    .line 232
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 233
    .line 234
    .line 235
    throw p1
.end method
