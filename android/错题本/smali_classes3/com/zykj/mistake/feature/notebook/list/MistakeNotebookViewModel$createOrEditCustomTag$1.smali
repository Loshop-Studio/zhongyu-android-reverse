.class final Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;
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
    c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$createOrEditCustomTag$1"
    f = "MistakeNotebookViewModel.kt"
    i = {}
    l = {
        0x2b3
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeNotebookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,845:1\n230#2,5:846\n230#2,3:856\n233#2,2:863\n1563#3:851\n1634#3,2:852\n1636#3:855\n1563#3:859\n1634#3,3:860\n1#4:854\n*S KotlinDebug\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1\n*L\n696#1:846,5\n715#1:856,3\n715#1:863,2\n708#1:851\n708#1:852,2\n708#1:855\n718#1:859\n718#1:860,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $id:J

.field final synthetic $name:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/lang/String;JLh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;",
            "Ljava/lang/String;",
            "J",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->$name:Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->$id:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 6
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
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->$name:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->$id:J

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/lang/String;JLh6/c;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->label:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, Lkotlin/Result;

    .line 18
    .line 19
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

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
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 36
    .line 37
    sget-object v4, Lcom/zykj/mistake/feature/notebook/list/w;->a:Lcom/zykj/mistake/feature/notebook/list/w;

    .line 38
    .line 39
    invoke-virtual {v2, v4}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 40
    .line 41
    .line 42
    new-instance v5, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1$1;

    .line 43
    .line 44
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 45
    .line 46
    iget-object v7, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->$name:Ljava/lang/String;

    .line 47
    .line 48
    iget-wide v8, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->$id:J

    .line 49
    .line 50
    const/4 v10, 0x0

    .line 51
    invoke-direct/range {v5 .. v10}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/lang/String;JLh6/c;)V

    .line 52
    .line 53
    .line 54
    iput v3, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->label:I

    .line 55
    .line 56
    invoke-static {v5, v0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-ne v2, v1, :cond_2

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_2
    move-object v1, v2

    .line 64
    :goto_0
    iget-wide v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->$id:J

    .line 65
    .line 66
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->$name:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v12, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 69
    .line 70
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_b

    .line 75
    .line 76
    move-object v4, v1

    .line 77
    check-cast v4, Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;

    .line 78
    .line 79
    const-wide/16 v6, 0x0

    .line 80
    .line 81
    cmp-long v6, v2, v6

    .line 82
    .line 83
    if-nez v6, :cond_5

    .line 84
    .line 85
    move-object v6, v4

    .line 86
    new-instance v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 87
    .line 88
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;->getResult()J

    .line 89
    .line 90
    .line 91
    move-result-wide v6

    .line 92
    const/16 v10, 0xc

    .line 93
    .line 94
    const/4 v11, 0x0

    .line 95
    const/4 v8, 0x0

    .line 96
    const/4 v9, 0x0

    .line 97
    invoke-direct/range {v4 .. v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v4}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object v3, v12, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 105
    .line 106
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 111
    .line 112
    iget-object v3, v3, Lcom/zykj/mistake/feature/notebook/list/e1;->l:Ljava/util/List;

    .line 113
    .line 114
    invoke-static {v2, v3}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 115
    .line 116
    .line 117
    move-result-object v24

    .line 118
    iget-object v5, v12, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 119
    .line 120
    :goto_1
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    move-object v13, v2

    .line 125
    check-cast v13, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 126
    .line 127
    iget-boolean v3, v13, Lcom/zykj/mistake/feature/notebook/list/e1;->n:Z

    .line 128
    .line 129
    iget-object v6, v13, Lcom/zykj/mistake/feature/notebook/list/e1;->m:Ljava/util/List;

    .line 130
    .line 131
    if-eqz v3, :cond_3

    .line 132
    .line 133
    invoke-static {v4}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-static {v3, v6}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    :cond_3
    move-object/from16 v25, v6

    .line 142
    .line 143
    const/16 v36, 0x0

    .line 144
    .line 145
    const v37, 0x1ffe7ff

    .line 146
    .line 147
    .line 148
    const/4 v14, 0x0

    .line 149
    const/4 v15, 0x0

    .line 150
    const/16 v16, 0x0

    .line 151
    .line 152
    const/16 v17, 0x0

    .line 153
    .line 154
    const/16 v18, 0x0

    .line 155
    .line 156
    const/16 v19, 0x0

    .line 157
    .line 158
    const/16 v20, 0x0

    .line 159
    .line 160
    const/16 v21, 0x0

    .line 161
    .line 162
    const/16 v22, 0x0

    .line 163
    .line 164
    const/16 v23, 0x0

    .line 165
    .line 166
    const/16 v26, 0x0

    .line 167
    .line 168
    const/16 v27, 0x0

    .line 169
    .line 170
    const/16 v28, 0x0

    .line 171
    .line 172
    const/16 v29, 0x0

    .line 173
    .line 174
    const/16 v30, 0x0

    .line 175
    .line 176
    const/16 v31, 0x0

    .line 177
    .line 178
    const/16 v32, 0x0

    .line 179
    .line 180
    const/16 v33, 0x0

    .line 181
    .line 182
    const/16 v34, 0x0

    .line 183
    .line 184
    const/16 v35, 0x0

    .line 185
    .line 186
    invoke-static/range {v13 .. v37}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    move-object/from16 v6, v24

    .line 191
    .line 192
    invoke-virtual {v5, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    if-eqz v2, :cond_4

    .line 197
    .line 198
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/t;

    .line 199
    .line 200
    invoke-direct {v2, v6}, Lcom/zykj/mistake/feature/notebook/list/t;-><init>(Ljava/util/List;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_5

    .line 207
    .line 208
    :cond_4
    move-object/from16 v24, v6

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_5
    move-object v7, v5

    .line 212
    iget-object v4, v12, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 213
    .line 214
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    check-cast v4, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 219
    .line 220
    iget-object v4, v4, Lcom/zykj/mistake/feature/notebook/list/e1;->l:Ljava/util/List;

    .line 221
    .line 222
    new-instance v5, Ljava/util/ArrayList;

    .line 223
    .line 224
    const/16 v6, 0xa

    .line 225
    .line 226
    invoke-static {v4, v6}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v8

    .line 241
    const/4 v9, -0x1

    .line 242
    if-eqz v8, :cond_7

    .line 243
    .line 244
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    check-cast v8, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 249
    .line 250
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 251
    .line 252
    .line 253
    move-result-wide v10

    .line 254
    cmp-long v10, v10, v2

    .line 255
    .line 256
    if-nez v10, :cond_6

    .line 257
    .line 258
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    if-ne v10, v9, :cond_6

    .line 263
    .line 264
    invoke-virtual {v8, v7}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->setName(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    :cond_6
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_7
    iget-object v4, v12, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 272
    .line 273
    :goto_3
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    move-object v13, v8

    .line 278
    check-cast v13, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 279
    .line 280
    iget-object v10, v13, Lcom/zykj/mistake/feature/notebook/list/e1;->m:Ljava/util/List;

    .line 281
    .line 282
    new-instance v11, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-static {v10, v6}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 285
    .line 286
    .line 287
    move-result v14

    .line 288
    invoke-direct {v11, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v14

    .line 299
    if-eqz v14, :cond_9

    .line 300
    .line 301
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v14

    .line 305
    check-cast v14, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 306
    .line 307
    invoke-virtual {v14}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 308
    .line 309
    .line 310
    move-result-wide v15

    .line 311
    cmp-long v15, v15, v2

    .line 312
    .line 313
    if-nez v15, :cond_8

    .line 314
    .line 315
    invoke-virtual {v14}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 316
    .line 317
    .line 318
    move-result v15

    .line 319
    if-ne v15, v9, :cond_8

    .line 320
    .line 321
    invoke-virtual {v14, v7}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->setName(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    :cond_8
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_9
    const/16 v36, 0x0

    .line 329
    .line 330
    const v37, 0x1ffe7ff

    .line 331
    .line 332
    .line 333
    const/4 v14, 0x0

    .line 334
    const/4 v15, 0x0

    .line 335
    const/16 v16, 0x0

    .line 336
    .line 337
    const/16 v17, 0x0

    .line 338
    .line 339
    const/16 v18, 0x0

    .line 340
    .line 341
    const/16 v19, 0x0

    .line 342
    .line 343
    const/16 v20, 0x0

    .line 344
    .line 345
    const/16 v21, 0x0

    .line 346
    .line 347
    const/16 v22, 0x0

    .line 348
    .line 349
    const/16 v23, 0x0

    .line 350
    .line 351
    const/16 v26, 0x0

    .line 352
    .line 353
    const/16 v27, 0x0

    .line 354
    .line 355
    const/16 v28, 0x0

    .line 356
    .line 357
    const/16 v29, 0x0

    .line 358
    .line 359
    const/16 v30, 0x0

    .line 360
    .line 361
    const/16 v31, 0x0

    .line 362
    .line 363
    const/16 v32, 0x0

    .line 364
    .line 365
    const/16 v33, 0x0

    .line 366
    .line 367
    const/16 v34, 0x0

    .line 368
    .line 369
    const/16 v35, 0x0

    .line 370
    .line 371
    move-object/from16 v24, v5

    .line 372
    .line 373
    move-object/from16 v25, v11

    .line 374
    .line 375
    invoke-static/range {v13 .. v37}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    move-object/from16 v10, v24

    .line 380
    .line 381
    invoke-virtual {v4, v8, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    if-eqz v5, :cond_a

    .line 386
    .line 387
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/t;

    .line 388
    .line 389
    invoke-direct {v2, v10}, Lcom/zykj/mistake/feature/notebook/list/t;-><init>(Ljava/util/List;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 393
    .line 394
    .line 395
    goto :goto_5

    .line 396
    :cond_a
    move-object v5, v10

    .line 397
    goto :goto_3

    .line 398
    :cond_b
    :goto_5
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 399
    .line 400
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    if-eqz v1, :cond_f

    .line 405
    .line 406
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    const-string v4, ""

    .line 414
    .line 415
    if-nez v3, :cond_c

    .line 416
    .line 417
    move-object v3, v4

    .line 418
    :cond_c
    const-string v5, "\u91cd\u590d"

    .line 419
    .line 420
    const/4 v6, 0x0

    .line 421
    invoke-static {v3, v5, v6}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    if-eqz v3, :cond_d

    .line 426
    .line 427
    sget-object v1, Lcom/zykj/mistake/feature/notebook/list/m;->a:Lcom/zykj/mistake/feature/notebook/list/m;

    .line 428
    .line 429
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 430
    .line 431
    .line 432
    goto :goto_7

    .line 433
    :cond_d
    sget-object v3, Lcom/zykj/mistake/feature/notebook/list/n;->a:Lcom/zykj/mistake/feature/notebook/list/n;

    .line 434
    .line 435
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 436
    .line 437
    .line 438
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 439
    .line 440
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    if-nez v1, :cond_e

    .line 445
    .line 446
    goto :goto_6

    .line 447
    :cond_e
    move-object v4, v1

    .line 448
    :goto_6
    invoke-direct {v3, v4}, Lcom/zykj/mistake/feature/notebook/list/x;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 452
    .line 453
    .line 454
    :cond_f
    :goto_7
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 455
    .line 456
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/o;->a:Lcom/zykj/mistake/feature/notebook/list/o;

    .line 457
    .line 458
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 459
    .line 460
    .line 461
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 462
    .line 463
    return-object v1
.end method
