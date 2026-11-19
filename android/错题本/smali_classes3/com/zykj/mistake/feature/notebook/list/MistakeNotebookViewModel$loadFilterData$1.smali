.class final Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;
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
    c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$loadFilterData$1"
    f = "MistakeNotebookViewModel.kt"
    i = {}
    l = {
        0x28a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeNotebookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,845:1\n1563#2:846\n1634#2,3:847\n1563#2:850\n1634#2,3:851\n230#3,5:854\n*S KotlinDebug\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1\n*L\n652#1:846\n652#1:847,3\n658#1:850\n658#1:851,3\n666#1:854,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $openDrawer:Z

.field final synthetic $showError:Z

.field final synthetic $showLoading:Z

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;


# direct methods
.method public constructor <init>(ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;ZZLh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;",
            "ZZ",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->$showLoading:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->$openDrawer:Z

    .line 6
    .line 7
    iput-boolean p4, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->$showError:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 11
    .line 12
    .line 13
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
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->$showLoading:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->$openDrawer:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->$showError:Z

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;-><init>(ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;ZZLh6/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->label:I

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
    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->$showLoading:Z

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 40
    .line 41
    sget-object v4, Lcom/zykj/mistake/feature/notebook/list/w;->a:Lcom/zykj/mistake/feature/notebook/list/w;

    .line 42
    .line 43
    invoke-virtual {v2, v4}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1$1;

    .line 47
    .line 48
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    invoke-direct {v2, v4, v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lh6/c;)V

    .line 52
    .line 53
    .line 54
    iput v3, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->label:I

    .line 55
    .line 56
    invoke-static {v2, v0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-ne v2, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    move-object v1, v2

    .line 64
    :goto_0
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 65
    .line 66
    iget-boolean v3, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->$openDrawer:Z

    .line 67
    .line 68
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_7

    .line 73
    .line 74
    move-object v4, v1

    .line 75
    check-cast v4, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;

    .line 76
    .line 77
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;->getTopics()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    new-instance v6, Ljava/util/ArrayList;

    .line 86
    .line 87
    const/16 v7, 0xa

    .line 88
    .line 89
    invoke-static {v5, v7}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eqz v8, :cond_4

    .line 105
    .line 106
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    check-cast v8, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;

    .line 111
    .line 112
    new-instance v9, Lp4/a;

    .line 113
    .line 114
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->getTopicId()J

    .line 115
    .line 116
    .line 117
    move-result-wide v10

    .line 118
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;->getTopicName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    invoke-direct {v9, v10, v11, v8}, Lp4/a;-><init>(JLjava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;->getTags()Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    new-instance v5, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-static {v4, v7}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_5

    .line 155
    .line 156
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    check-cast v7, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 161
    .line 162
    new-instance v8, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 163
    .line 164
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 169
    .line 170
    .line 171
    move-result-wide v10

    .line 172
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getBindItemsCount()I

    .line 173
    .line 174
    .line 175
    move-result v12

    .line 176
    const/4 v13, -0x1

    .line 177
    invoke-direct/range {v8 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JII)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_5
    iget-object v4, v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 185
    .line 186
    :goto_3
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    move-object/from16 v16, v6

    .line 191
    .line 192
    move-object v6, v7

    .line 193
    check-cast v6, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 194
    .line 195
    const/16 v29, 0x0

    .line 196
    .line 197
    const v30, 0x1ffcbff

    .line 198
    .line 199
    .line 200
    move-object v8, v7

    .line 201
    const/4 v7, 0x0

    .line 202
    move-object v9, v8

    .line 203
    const/4 v8, 0x0

    .line 204
    move-object v10, v9

    .line 205
    const/4 v9, 0x0

    .line 206
    move-object v11, v10

    .line 207
    const/4 v10, 0x0

    .line 208
    move-object v12, v11

    .line 209
    const/4 v11, 0x0

    .line 210
    move-object v13, v12

    .line 211
    const/4 v12, 0x0

    .line 212
    move-object v14, v13

    .line 213
    const/4 v13, 0x0

    .line 214
    move-object v15, v14

    .line 215
    const/4 v14, 0x0

    .line 216
    move-object/from16 v17, v15

    .line 217
    .line 218
    const/4 v15, 0x0

    .line 219
    move-object/from16 v18, v17

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const/16 v19, 0x0

    .line 224
    .line 225
    const/16 v20, 0x0

    .line 226
    .line 227
    const/16 v21, 0x0

    .line 228
    .line 229
    const/16 v22, 0x0

    .line 230
    .line 231
    const/16 v23, 0x0

    .line 232
    .line 233
    const/16 v24, 0x0

    .line 234
    .line 235
    const/16 v25, 0x0

    .line 236
    .line 237
    const/16 v26, 0x0

    .line 238
    .line 239
    const/16 v27, 0x0

    .line 240
    .line 241
    const/16 v28, 0x0

    .line 242
    .line 243
    move-object/from16 v31, v18

    .line 244
    .line 245
    move-object/from16 v18, v5

    .line 246
    .line 247
    move-object/from16 v5, v31

    .line 248
    .line 249
    invoke-static/range {v6 .. v30}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    move-object/from16 v7, v16

    .line 254
    .line 255
    move-object/from16 v8, v18

    .line 256
    .line 257
    invoke-virtual {v4, v5, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-eqz v5, :cond_6

    .line 262
    .line 263
    if-eqz v3, :cond_7

    .line 264
    .line 265
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/p;

    .line 266
    .line 267
    invoke-direct {v3, v7, v8}, Lcom/zykj/mistake/feature/notebook/list/p;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 271
    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_6
    move-object v6, v7

    .line 275
    move-object v5, v8

    .line 276
    goto :goto_3

    .line 277
    :cond_7
    :goto_4
    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->$showError:Z

    .line 278
    .line 279
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 280
    .line 281
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    if-eqz v1, :cond_9

    .line 286
    .line 287
    if-eqz v2, :cond_9

    .line 288
    .line 289
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 290
    .line 291
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    if-nez v1, :cond_8

    .line 296
    .line 297
    const-string v1, ""

    .line 298
    .line 299
    :cond_8
    invoke-direct {v2, v1}, Lcom/zykj/mistake/feature/notebook/list/x;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v3, v2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 303
    .line 304
    .line 305
    :cond_9
    iget-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->$showLoading:Z

    .line 306
    .line 307
    if-eqz v1, :cond_a

    .line 308
    .line 309
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 310
    .line 311
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/o;->a:Lcom/zykj/mistake/feature/notebook/list/o;

    .line 312
    .line 313
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 314
    .line 315
    .line 316
    :cond_a
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 317
    .line 318
    return-object v1
.end method
