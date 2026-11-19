.class final Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel$requestCollections$2"
    f = "MistakeCollectionViewModel.kt"
    i = {}
    l = {
        0xd3
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeCollectionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n230#2,3:256\n233#2,2:263\n230#2,5:265\n1563#3:259\n1634#3,3:260\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2\n*L\n214#1:256,3\n214#1:263,2\n225#1:265,5\n217#1:259\n217#1:260,3\n*E\n"
    }
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;->this$0:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;->this$0:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;-><init>(Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;->label:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-ne v2, v4, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, Lkotlin/Result;

    .line 19
    .line 20
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2$1;

    .line 37
    .line 38
    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;->this$0:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 39
    .line 40
    invoke-direct {v2, v5, v3}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2$1;-><init>(Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lh6/c;)V

    .line 41
    .line 42
    .line 43
    iput v4, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;->label:I

    .line 44
    .line 45
    invoke-static {v2, v0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-ne v2, v1, :cond_2

    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_2
    move-object v1, v2

    .line 53
    :goto_0
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;->this$0:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 54
    .line 55
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const-string v5, ""

    .line 60
    .line 61
    if-eqz v4, :cond_8

    .line 62
    .line 63
    move-object v4, v1

    .line 64
    check-cast v4, Lcom/zykj/mistake/entity/resp/MistakeCollectionListResp;

    .line 65
    .line 66
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeCollectionListResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeCollectionListResult;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeCollectionListResult;->getItems()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    iget-object v2, v2, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->b:Lkotlinx/coroutines/flow/n0;

    .line 75
    .line 76
    :goto_1
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    move-object v8, v7

    .line 81
    check-cast v8, Lcom/zykj/mistake/feature/collection/list/v;

    .line 82
    .line 83
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeCollectionListResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeCollectionListResult;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/MistakeCollectionListResult;->getTotalCount()I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    new-instance v10, Ljava/util/ArrayList;

    .line 92
    .line 93
    const/16 v11, 0xa

    .line 94
    .line 95
    invoke-static {v6, v11}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    if-eqz v12, :cond_6

    .line 111
    .line 112
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v12

    .line 116
    check-cast v12, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;

    .line 117
    .line 118
    new-instance v13, Lcom/zykj/mistake/feature/collection/list/b;

    .line 119
    .line 120
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;->getId()I

    .line 121
    .line 122
    .line 123
    move-result v14

    .line 124
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v15

    .line 132
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;->getItemCount()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;->getCreationTime()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    if-eqz v12, :cond_4

    .line 141
    .line 142
    invoke-static {v12}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 143
    .line 144
    .line 145
    move-result v16

    .line 146
    if-nez v16, :cond_3

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_3
    const/4 v12, 0x0

    .line 150
    :goto_3
    if-nez v12, :cond_5

    .line 151
    .line 152
    :cond_4
    move-object/from16 p1, v1

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_5
    move-object/from16 p1, v1

    .line 156
    .line 157
    const-string v1, "T"

    .line 158
    .line 159
    invoke-static {v12, v1}, Lkotlin/text/p;->g0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    const-string v12, " "

    .line 164
    .line 165
    invoke-static {v1, v12}, Lkotlin/text/p;->g0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    goto :goto_5

    .line 170
    :goto_4
    move-object v1, v5

    .line 171
    :goto_5
    invoke-direct {v13, v3, v14, v15, v1}, Lcom/zykj/mistake/feature/collection/list/b;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-object/from16 v1, p1

    .line 178
    .line 179
    const/4 v3, 0x0

    .line 180
    goto :goto_2

    .line 181
    :cond_6
    move-object/from16 p1, v1

    .line 182
    .line 183
    const/16 v17, 0x0

    .line 184
    .line 185
    const/16 v18, 0xfc1

    .line 186
    .line 187
    const/4 v11, 0x0

    .line 188
    const/4 v12, 0x0

    .line 189
    const/4 v13, 0x0

    .line 190
    const/4 v14, 0x0

    .line 191
    const/4 v15, 0x0

    .line 192
    const/16 v16, 0x0

    .line 193
    .line 194
    invoke-static/range {v8 .. v18}, Lcom/zykj/mistake/feature/collection/list/v;->a(Lcom/zykj/mistake/feature/collection/list/v;ILjava/util/ArrayList;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;I)Lcom/zykj/mistake/feature/collection/list/v;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v2, v7, v1}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_7

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_7
    move-object/from16 v1, p1

    .line 206
    .line 207
    const/4 v3, 0x0

    .line 208
    goto/16 :goto_1

    .line 209
    .line 210
    :cond_8
    move-object/from16 p1, v1

    .line 211
    .line 212
    :goto_6
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;->this$0:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 213
    .line 214
    invoke-static/range {p1 .. p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    if-eqz v2, :cond_b

    .line 219
    .line 220
    iget-object v3, v1, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->b:Lkotlinx/coroutines/flow/n0;

    .line 221
    .line 222
    :cond_9
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    move-object v6, v4

    .line 227
    check-cast v6, Lcom/zykj/mistake/feature/collection/list/v;

    .line 228
    .line 229
    const/4 v15, 0x0

    .line 230
    const/16 v16, 0xfe7

    .line 231
    .line 232
    const/4 v7, 0x0

    .line 233
    const/4 v8, 0x0

    .line 234
    const/4 v9, 0x0

    .line 235
    const/4 v10, 0x0

    .line 236
    const/4 v11, 0x0

    .line 237
    const/4 v12, 0x0

    .line 238
    const/4 v13, 0x0

    .line 239
    const/4 v14, 0x0

    .line 240
    invoke-static/range {v6 .. v16}, Lcom/zykj/mistake/feature/collection/list/v;->a(Lcom/zykj/mistake/feature/collection/list/v;ILjava/util/ArrayList;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;I)Lcom/zykj/mistake/feature/collection/list/v;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    invoke-virtual {v3, v4, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    if-eqz v4, :cond_9

    .line 249
    .line 250
    new-instance v3, Lcom/zykj/mistake/feature/collection/list/f;

    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    if-nez v2, :cond_a

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_a
    move-object v5, v2

    .line 260
    :goto_7
    invoke-direct {v3, v5}, Lcom/zykj/mistake/feature/collection/list/f;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v3}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->c(Lcom/zykj/mistake/feature/collection/list/g;)V

    .line 264
    .line 265
    .line 266
    :cond_b
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 267
    .line 268
    return-object v1
.end method
