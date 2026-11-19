.class final Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/PagingDataPresenter$collectFrom$2$1;->emit(Landroidx/paging/PageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0008\u0008\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2"
    f = "PagingDataPresenter.kt"
    i = {}
    l = {
        0x8d,
        0x9e,
        0xaa,
        0xad,
        0xe1,
        0xe4
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPagingDataPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter$collectFrom$2$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,553:1\n1726#2,3:554\n1855#2,2:557\n*S KotlinDebug\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter$collectFrom$2$1$2\n*L\n201#1:554,3\n254#1:557,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $event:Landroidx/paging/PageEvent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PageEvent<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $pagingData:Landroidx/paging/PagingData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingData<",
            "TT;>;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Landroidx/paging/PagingDataPresenter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingDataPresenter<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/PageEvent;Landroidx/paging/PagingDataPresenter;Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent<",
            "TT;>;",
            "Landroidx/paging/PagingDataPresenter<",
            "TT;>;",
            "Landroidx/paging/PagingData<",
            "TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    iput-object p2, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    iput-object p3, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$pagingData:Landroidx/paging/PagingData;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;

    iget-object v0, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    iget-object v1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    iget-object v2, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$pagingData:Landroidx/paging/PagingData;

    invoke-direct {p1, v0, v1, v2, p2}, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;-><init>(Landroidx/paging/PageEvent;Landroidx/paging/PagingDataPresenter;Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object v9, p0

    .line 24
    goto/16 :goto_b

    .line 25
    .line 26
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object v9, p0

    .line 30
    goto/16 :goto_9

    .line 31
    .line 32
    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object v9, p0

    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :pswitch_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v9, p0

    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :pswitch_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v9, p0

    .line 48
    goto/16 :goto_c

    .line 49
    .line 50
    :pswitch_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 54
    .line 55
    instance-of v1, p1, Landroidx/paging/PageEvent$StaticList;

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    iget-object v4, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 60
    .line 61
    new-instance p1, Landroidx/paging/TransformablePage;

    .line 62
    .line 63
    iget-object v1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 64
    .line 65
    check-cast v1, Landroidx/paging/PageEvent$StaticList;

    .line 66
    .line 67
    invoke-virtual {v1}, Landroidx/paging/PageEvent$StaticList;->getData()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-direct {p1, v3, v1}, Landroidx/paging/TransformablePage;-><init>(ILjava/util/List;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 79
    .line 80
    check-cast p1, Landroidx/paging/PageEvent$StaticList;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getSourceLoadStates()Landroidx/paging/LoadStates;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-nez p1, :cond_1

    .line 87
    .line 88
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 89
    .line 90
    check-cast p1, Landroidx/paging/PageEvent$StaticList;

    .line 91
    .line 92
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-eqz p1, :cond_0

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    move v8, v3

    .line 100
    goto :goto_1

    .line 101
    :cond_1
    :goto_0
    move v8, v2

    .line 102
    :goto_1
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 103
    .line 104
    check-cast p1, Landroidx/paging/PageEvent$StaticList;

    .line 105
    .line 106
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getSourceLoadStates()Landroidx/paging/LoadStates;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 111
    .line 112
    check-cast p1, Landroidx/paging/PageEvent$StaticList;

    .line 113
    .line 114
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$pagingData:Landroidx/paging/PagingData;

    .line 119
    .line 120
    invoke-virtual {p1}, Landroidx/paging/PagingData;->getHintReceiver$paging_common_release()Landroidx/paging/HintReceiver;

    .line 121
    .line 122
    .line 123
    move-result-object v11

    .line 124
    iput v2, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    .line 125
    .line 126
    const/4 v6, 0x0

    .line 127
    const/4 v7, 0x0

    .line 128
    move-object v12, p0

    .line 129
    invoke-static/range {v4 .. v12}, Landroidx/paging/PagingDataPresenter;->access$presentNewList(Landroidx/paging/PagingDataPresenter;Ljava/util/List;IIZLandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/HintReceiver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    move-object v9, v12

    .line 134
    if-ne p1, v0, :cond_16

    .line 135
    .line 136
    goto/16 :goto_a

    .line 137
    .line 138
    :cond_2
    move-object v9, p0

    .line 139
    instance-of v1, p1, Landroidx/paging/PageEvent$Insert;

    .line 140
    .line 141
    if-eqz v1, :cond_3

    .line 142
    .line 143
    check-cast p1, Landroidx/paging/PageEvent$Insert;

    .line 144
    .line 145
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    sget-object v1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 150
    .line 151
    if-ne p1, v1, :cond_3

    .line 152
    .line 153
    iget-object v1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 154
    .line 155
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 156
    .line 157
    check-cast p1, Landroidx/paging/PageEvent$Insert;

    .line 158
    .line 159
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 164
    .line 165
    check-cast p1, Landroidx/paging/PageEvent$Insert;

    .line 166
    .line 167
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersBefore()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 172
    .line 173
    check-cast p1, Landroidx/paging/PageEvent$Insert;

    .line 174
    .line 175
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersAfter()I

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 180
    .line 181
    check-cast p1, Landroidx/paging/PageEvent$Insert;

    .line 182
    .line 183
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 188
    .line 189
    check-cast p1, Landroidx/paging/PageEvent$Insert;

    .line 190
    .line 191
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$pagingData:Landroidx/paging/PagingData;

    .line 196
    .line 197
    invoke-virtual {p1}, Landroidx/paging/PagingData;->getHintReceiver$paging_common_release()Landroidx/paging/HintReceiver;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    const/4 p1, 0x2

    .line 202
    iput p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    .line 203
    .line 204
    const/4 v5, 0x1

    .line 205
    invoke-static/range {v1 .. v9}, Landroidx/paging/PagingDataPresenter;->access$presentNewList(Landroidx/paging/PagingDataPresenter;Ljava/util/List;IIZLandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/HintReceiver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    if-ne p1, v0, :cond_16

    .line 210
    .line 211
    goto/16 :goto_a

    .line 212
    .line 213
    :cond_3
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 214
    .line 215
    instance-of v1, p1, Landroidx/paging/PageEvent$Insert;

    .line 216
    .line 217
    if-eqz v1, :cond_12

    .line 218
    .line 219
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 220
    .line 221
    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getInGetItem$p(Landroidx/paging/PagingDataPresenter;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    check-cast p1, Ljava/lang/Boolean;

    .line 230
    .line 231
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    if-eqz p1, :cond_4

    .line 236
    .line 237
    const/4 p1, 0x3

    .line 238
    iput p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    .line 239
    .line 240
    invoke-static {p0}, Lkotlinx/coroutines/YieldKt;->yield(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    if-ne p1, v0, :cond_4

    .line 245
    .line 246
    goto/16 :goto_a

    .line 247
    .line 248
    :cond_4
    :goto_2
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 249
    .line 250
    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getPageStore$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/PageStore;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    iget-object v4, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 255
    .line 256
    invoke-virtual {v1, v4}, Landroidx/paging/PageStore;->processEvent(Landroidx/paging/PageEvent;)Landroidx/paging/PagingDataEvent;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    const/4 v4, 0x4

    .line 261
    iput v4, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    .line 262
    .line 263
    invoke-virtual {p1, v1, p0}, Landroidx/paging/PagingDataPresenter;->presentPagingDataEvent(Landroidx/paging/PagingDataEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    if-ne p1, v0, :cond_5

    .line 268
    .line 269
    goto/16 :goto_a

    .line 270
    .line 271
    :cond_5
    :goto_3
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 272
    .line 273
    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getCombinedLoadStatesCollection$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/MutableCombinedLoadStateCollection;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 278
    .line 279
    check-cast v0, Landroidx/paging/PageEvent$Insert;

    .line 280
    .line 281
    invoke-virtual {v0}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    iget-object v1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 286
    .line 287
    check-cast v1, Landroidx/paging/PageEvent$Insert;

    .line 288
    .line 289
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {p1, v0, v1}, Landroidx/paging/MutableCombinedLoadStateCollection;->set(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    .line 294
    .line 295
    .line 296
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 297
    .line 298
    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getCombinedLoadStatesCollection$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/MutableCombinedLoadStateCollection;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-virtual {p1}, Landroidx/paging/MutableCombinedLoadStateCollection;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    check-cast p1, Landroidx/paging/CombinedLoadStates;

    .line 311
    .line 312
    if-eqz p1, :cond_6

    .line 313
    .line 314
    invoke-virtual {p1}, Landroidx/paging/CombinedLoadStates;->getSource()Landroidx/paging/LoadStates;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    goto :goto_4

    .line 319
    :cond_6
    const/4 p1, 0x0

    .line 320
    :goto_4
    if-eqz p1, :cond_11

    .line 321
    .line 322
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {v0}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-virtual {p1}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    iget-object v1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 339
    .line 340
    check-cast v1, Landroidx/paging/PageEvent$Insert;

    .line 341
    .line 342
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    sget-object v4, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 347
    .line 348
    if-ne v1, v4, :cond_7

    .line 349
    .line 350
    if-nez v0, :cond_8

    .line 351
    .line 352
    :cond_7
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 353
    .line 354
    check-cast v0, Landroidx/paging/PageEvent$Insert;

    .line 355
    .line 356
    invoke-virtual {v0}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    sget-object v1, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 361
    .line 362
    if-ne v0, v1, :cond_9

    .line 363
    .line 364
    if-nez p1, :cond_8

    .line 365
    .line 366
    goto :goto_5

    .line 367
    :cond_8
    move p1, v3

    .line 368
    goto :goto_6

    .line 369
    :cond_9
    :goto_5
    move p1, v2

    .line 370
    :goto_6
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 371
    .line 372
    check-cast v0, Landroidx/paging/PageEvent$Insert;

    .line 373
    .line 374
    invoke-virtual {v0}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    if-eqz v0, :cond_a

    .line 379
    .line 380
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-eqz v1, :cond_a

    .line 385
    .line 386
    goto :goto_7

    .line 387
    :cond_a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-eqz v1, :cond_c

    .line 396
    .line 397
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    check-cast v1, Landroidx/paging/TransformablePage;

    .line 402
    .line 403
    invoke-virtual {v1}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    if-nez v1, :cond_b

    .line 412
    .line 413
    move v2, v3

    .line 414
    :cond_c
    :goto_7
    if-nez p1, :cond_d

    .line 415
    .line 416
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 417
    .line 418
    invoke-static {p1, v3}, Landroidx/paging/PagingDataPresenter;->access$setLastAccessedIndexUnfulfilled$p(Landroidx/paging/PagingDataPresenter;Z)V

    .line 419
    .line 420
    .line 421
    goto/16 :goto_c

    .line 422
    .line 423
    :cond_d
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 424
    .line 425
    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getLastAccessedIndexUnfulfilled$p(Landroidx/paging/PagingDataPresenter;)Z

    .line 426
    .line 427
    .line 428
    move-result p1

    .line 429
    if-nez p1, :cond_e

    .line 430
    .line 431
    if-eqz v2, :cond_16

    .line 432
    .line 433
    :cond_e
    if-nez v2, :cond_10

    .line 434
    .line 435
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 436
    .line 437
    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getLastAccessedIndex$p(Landroidx/paging/PagingDataPresenter;)I

    .line 438
    .line 439
    .line 440
    move-result p1

    .line 441
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 442
    .line 443
    invoke-static {v0}, Landroidx/paging/PagingDataPresenter;->access$getPageStore$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/PageStore;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-lt p1, v0, :cond_10

    .line 452
    .line 453
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 454
    .line 455
    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getLastAccessedIndex$p(Landroidx/paging/PagingDataPresenter;)I

    .line 456
    .line 457
    .line 458
    move-result p1

    .line 459
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 460
    .line 461
    invoke-static {v0}, Landroidx/paging/PagingDataPresenter;->access$getPageStore$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/PageStore;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-virtual {v0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    iget-object v1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 470
    .line 471
    invoke-static {v1}, Landroidx/paging/PagingDataPresenter;->access$getPageStore$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/PageStore;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-virtual {v1}, Landroidx/paging/PageStore;->getDataCount()I

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    add-int/2addr v0, v1

    .line 480
    if-le p1, v0, :cond_f

    .line 481
    .line 482
    goto :goto_8

    .line 483
    :cond_f
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 484
    .line 485
    invoke-static {p1, v3}, Landroidx/paging/PagingDataPresenter;->access$setLastAccessedIndexUnfulfilled$p(Landroidx/paging/PagingDataPresenter;Z)V

    .line 486
    .line 487
    .line 488
    goto/16 :goto_c

    .line 489
    .line 490
    :cond_10
    :goto_8
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 491
    .line 492
    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getHintReceiver$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/HintReceiver;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    if-eqz p1, :cond_16

    .line 497
    .line 498
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 499
    .line 500
    invoke-static {v0}, Landroidx/paging/PagingDataPresenter;->access$getPageStore$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/PageStore;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    iget-object v1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 505
    .line 506
    invoke-static {v1}, Landroidx/paging/PagingDataPresenter;->access$getLastAccessedIndex$p(Landroidx/paging/PagingDataPresenter;)I

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    invoke-virtual {v0, v1}, Landroidx/paging/PageStore;->accessHintForPresenterIndex(I)Landroidx/paging/ViewportHint$Access;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-interface {p1, v0}, Landroidx/paging/HintReceiver;->accessHint(Landroidx/paging/ViewportHint;)V

    .line 515
    .line 516
    .line 517
    goto/16 :goto_c

    .line 518
    .line 519
    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 520
    .line 521
    const-string v0, "PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event."

    .line 522
    .line 523
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    throw p1

    .line 527
    :cond_12
    instance-of v1, p1, Landroidx/paging/PageEvent$Drop;

    .line 528
    .line 529
    if-eqz v1, :cond_15

    .line 530
    .line 531
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 532
    .line 533
    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getInGetItem$p(Landroidx/paging/PagingDataPresenter;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 534
    .line 535
    .line 536
    move-result-object p1

    .line 537
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    check-cast p1, Ljava/lang/Boolean;

    .line 542
    .line 543
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 544
    .line 545
    .line 546
    move-result p1

    .line 547
    if-eqz p1, :cond_13

    .line 548
    .line 549
    const/4 p1, 0x5

    .line 550
    iput p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    .line 551
    .line 552
    invoke-static {p0}, Lkotlinx/coroutines/YieldKt;->yield(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object p1

    .line 556
    if-ne p1, v0, :cond_13

    .line 557
    .line 558
    goto :goto_a

    .line 559
    :cond_13
    :goto_9
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 560
    .line 561
    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getPageStore$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/PageStore;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    iget-object v2, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 566
    .line 567
    invoke-virtual {v1, v2}, Landroidx/paging/PageStore;->processEvent(Landroidx/paging/PageEvent;)Landroidx/paging/PagingDataEvent;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    const/4 v2, 0x6

    .line 572
    iput v2, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    .line 573
    .line 574
    invoke-virtual {p1, v1, p0}, Landroidx/paging/PagingDataPresenter;->presentPagingDataEvent(Landroidx/paging/PagingDataEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object p1

    .line 578
    if-ne p1, v0, :cond_14

    .line 579
    .line 580
    :goto_a
    return-object v0

    .line 581
    :cond_14
    :goto_b
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 582
    .line 583
    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getCombinedLoadStatesCollection$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/MutableCombinedLoadStateCollection;

    .line 584
    .line 585
    .line 586
    move-result-object p1

    .line 587
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 588
    .line 589
    check-cast v0, Landroidx/paging/PageEvent$Drop;

    .line 590
    .line 591
    invoke-virtual {v0}, Landroidx/paging/PageEvent$Drop;->getLoadType()Landroidx/paging/LoadType;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    sget-object v1, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    .line 596
    .line 597
    invoke-virtual {v1}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common_release()Landroidx/paging/LoadState$NotLoading;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    invoke-virtual {p1, v0, v3, v1}, Landroidx/paging/MutableCombinedLoadStateCollection;->set(Landroidx/paging/LoadType;ZLandroidx/paging/LoadState;)V

    .line 602
    .line 603
    .line 604
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 605
    .line 606
    invoke-static {p1, v3}, Landroidx/paging/PagingDataPresenter;->access$setLastAccessedIndexUnfulfilled$p(Landroidx/paging/PagingDataPresenter;Z)V

    .line 607
    .line 608
    .line 609
    goto :goto_c

    .line 610
    :cond_15
    instance-of p1, p1, Landroidx/paging/PageEvent$LoadStateUpdate;

    .line 611
    .line 612
    if-eqz p1, :cond_16

    .line 613
    .line 614
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 615
    .line 616
    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getCombinedLoadStatesCollection$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/MutableCombinedLoadStateCollection;

    .line 617
    .line 618
    .line 619
    move-result-object p1

    .line 620
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 621
    .line 622
    check-cast v0, Landroidx/paging/PageEvent$LoadStateUpdate;

    .line 623
    .line 624
    invoke-virtual {v0}, Landroidx/paging/PageEvent$LoadStateUpdate;->getSource()Landroidx/paging/LoadStates;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    iget-object v1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 629
    .line 630
    check-cast v1, Landroidx/paging/PageEvent$LoadStateUpdate;

    .line 631
    .line 632
    invoke-virtual {v1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    invoke-virtual {p1, v0, v1}, Landroidx/paging/MutableCombinedLoadStateCollection;->set(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    .line 637
    .line 638
    .line 639
    :cond_16
    :goto_c
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 640
    .line 641
    instance-of v0, p1, Landroidx/paging/PageEvent$Insert;

    .line 642
    .line 643
    if-nez v0, :cond_17

    .line 644
    .line 645
    instance-of v0, p1, Landroidx/paging/PageEvent$Drop;

    .line 646
    .line 647
    if-nez v0, :cond_17

    .line 648
    .line 649
    instance-of p1, p1, Landroidx/paging/PageEvent$StaticList;

    .line 650
    .line 651
    if-eqz p1, :cond_18

    .line 652
    .line 653
    :cond_17
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 654
    .line 655
    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getOnPagesUpdatedListeners$p(Landroidx/paging/PagingDataPresenter;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 656
    .line 657
    .line 658
    move-result-object p1

    .line 659
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 660
    .line 661
    .line 662
    move-result-object p1

    .line 663
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 664
    .line 665
    .line 666
    move-result v0

    .line 667
    if-eqz v0, :cond_18

    .line 668
    .line 669
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 674
    .line 675
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    goto :goto_d

    .line 679
    :cond_18
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 680
    .line 681
    return-object p1

    .line 682
    nop

    .line 683
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
