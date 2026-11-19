.class final Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/home/HomeViewModel;->D(Lcom/zykj/evaluation/ui/home/a;)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/util/List<",
        "+",
        "Lcom/zykj/evaluation/bean/TaskInfo;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/zykj/evaluation/bean/TaskInfo;",
        "skipCount",
        "",
        "maxResultCount"
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
    c = "com.zykj.evaluation.ui.home.HomeViewModel$buildDataInfo$1$1"
    f = "HomeViewModel.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x1aa
    }
    m = "invokeSuspend"
    n = {
        "skipCount",
        "maxResultCount"
    }
    s = {
        "I$0",
        "I$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:723\n1563#3:719\n1634#3,3:720\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1\n*L\n438#1:716,3\n438#1:723,2\n440#1:719\n440#1:720,3\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:I

.field public synthetic c:I

.field public final synthetic d:Lcom/zykj/evaluation/ui/home/HomeViewModel;

.field public final synthetic e:Lcom/zykj/evaluation/ui/home/a;

.field public final synthetic f:Lcom/zykj/evaluation/bean/GetTaskListReq;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lcom/zykj/evaluation/ui/home/a;Lcom/zykj/evaluation/bean/GetTaskListReq;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->d:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->e:Lcom/zykj/evaluation/ui/home/a;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->f:Lcom/zykj/evaluation/bean/GetTaskListReq;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->d:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->e:Lcom/zykj/evaluation/ui/home/a;

    iget-object v3, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->f:Lcom/zykj/evaluation/bean/GetTaskListReq;

    invoke-direct {v0, v1, v2, v3, p3}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lcom/zykj/evaluation/ui/home/a;Lcom/zykj/evaluation/bean/GetTaskListReq;Lkotlin/coroutines/Continuation;)V

    iput p1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->b:I

    iput p2, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->c:I

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->a(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v3, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->b:I

    .line 4
    .line 5
    iget v4, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->c:I

    .line 6
    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v14

    .line 11
    iget v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->a:I

    .line 12
    .line 13
    const/4 v15, 0x1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-ne v1, v15, :cond_0

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->d:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 36
    .line 37
    invoke-static {v1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->q(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lp5/j;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v2, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->e:Lcom/zykj/evaluation/ui/home/a;

    .line 42
    .line 43
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/home/a;->b()Lcom/zykj/evaluation/bean/TaskListType;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskListType;->getType()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    move-object v5, v1

    .line 52
    iget-object v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->f:Lcom/zykj/evaluation/bean/GetTaskListReq;

    .line 53
    .line 54
    const/16 v12, 0x3f8

    .line 55
    .line 56
    const/4 v13, 0x0

    .line 57
    move-object v6, v5

    .line 58
    const/4 v5, 0x0

    .line 59
    move-object v7, v6

    .line 60
    const/4 v6, 0x0

    .line 61
    move-object v8, v7

    .line 62
    const/4 v7, 0x0

    .line 63
    move-object v9, v8

    .line 64
    const/4 v8, 0x0

    .line 65
    move-object v10, v9

    .line 66
    const/4 v9, 0x0

    .line 67
    move-object v11, v10

    .line 68
    const/4 v10, 0x0

    .line 69
    move-object/from16 v16, v11

    .line 70
    .line 71
    const/4 v11, 0x0

    .line 72
    move-object/from16 v17, v16

    .line 73
    .line 74
    invoke-static/range {v1 .. v13}, Lcom/zykj/evaluation/bean/GetTaskListReq;->copy$default(Lcom/zykj/evaluation/bean/GetTaskListReq;IIILjava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/GetTaskListReq;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput v3, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->b:I

    .line 79
    .line 80
    iput v4, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->c:I

    .line 81
    .line 82
    iput v15, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->a:I

    .line 83
    .line 84
    move-object/from16 v5, v17

    .line 85
    .line 86
    invoke-interface {v5, v1, v0}, Lp5/j;->t(Lcom/zykj/evaluation/bean/GetTaskListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-ne v1, v14, :cond_2

    .line 91
    .line 92
    return-object v14

    .line 93
    :cond_2
    :goto_0
    check-cast v1, Lcom/zykj/http/bean/ApiResp;

    .line 94
    .line 95
    invoke-static {v1}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lcom/zykj/evaluation/bean/GetTaskListResponse;

    .line 100
    .line 101
    if-nez v1, :cond_3

    .line 102
    .line 103
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    return-object v1

    .line 108
    :cond_3
    if-nez v3, :cond_8

    .line 109
    .line 110
    iget-object v2, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->d:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 111
    .line 112
    invoke-static {v2}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->v(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    iget-object v3, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$1$1;->e:Lcom/zykj/evaluation/ui/home/a;

    .line 117
    .line 118
    :cond_4
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    move-object v5, v4

    .line 123
    check-cast v5, Lcom/zykj/evaluation/ui/home/HomeViewState;

    .line 124
    .line 125
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/home/HomeViewState;->getPageTitleList()Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    new-instance v9, Ljava/util/ArrayList;

    .line 130
    .line 131
    const/16 v7, 0xa

    .line 132
    .line 133
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    invoke-direct {v9, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-eqz v7, :cond_7

    .line 149
    .line 150
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    move-object v10, v7

    .line 155
    check-cast v10, Ls6/c1;

    .line 156
    .line 157
    invoke-virtual {v10}, Ls6/c1;->e()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-virtual {v3}, Lcom/zykj/evaluation/ui/home/a;->a()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    if-eqz v7, :cond_6

    .line 170
    .line 171
    invoke-virtual {v10}, Ls6/c1;->e()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    sget-object v8, Lcom/zykj/evaluation/ui/home/a$d;->c:Lcom/zykj/evaluation/ui/home/a$d;

    .line 176
    .line 177
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/home/a;->a()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-nez v7, :cond_5

    .line 186
    .line 187
    invoke-virtual {v10}, Ls6/c1;->e()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    sget-object v8, Lcom/zykj/evaluation/ui/home/a$b;->c:Lcom/zykj/evaluation/ui/home/a$b;

    .line 192
    .line 193
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/home/a;->a()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v7

    .line 201
    if-eqz v7, :cond_6

    .line 202
    .line 203
    :cond_5
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/GetTaskListResponse;->getTotalCount()I

    .line 204
    .line 205
    .line 206
    move-result v11

    .line 207
    const/4 v14, 0x6

    .line 208
    const/4 v15, 0x0

    .line 209
    const/4 v12, 0x0

    .line 210
    const/4 v13, 0x0

    .line 211
    invoke-static/range {v10 .. v15}, Ls6/c1;->b(Ls6/c1;ILjava/lang/String;Lkotlinx/coroutines/flow/Flow;ILjava/lang/Object;)Ls6/c1;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    :cond_6
    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_7
    const/4 v10, 0x7

    .line 220
    const/4 v11, 0x0

    .line 221
    const/4 v6, 0x0

    .line 222
    const/4 v7, 0x0

    .line 223
    const/4 v8, 0x0

    .line 224
    invoke-static/range {v5 .. v11}, Lcom/zykj/evaluation/ui/home/HomeViewState;->copy$default(Lcom/zykj/evaluation/ui/home/HomeViewState;Ls6/d1;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/home/HomeViewState;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-interface {v2, v4, v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_4

    .line 233
    .line 234
    :cond_8
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/GetTaskListResponse;->getItems()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    return-object v1
.end method
