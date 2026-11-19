.class final Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/util/List<",
        "+",
        "Landroidx/work/WorkInfo;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "Landroidx/work/WorkInfo;"
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
    c = "com.zykj.student.dialogue.ui.detail.NewAnswerFragment$uploadFile$1$2"
    f = "NewAnswerFragment.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x154
    }
    m = "invokeSuspend"
    n = {
        "it",
        "workInfoList",
        "screenshotUrl",
        "contentUrl"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNewAnswerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewAnswerFragment.kt\ncom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n1869#2:401\n1788#2,4:402\n1870#2:406\n1761#2,3:407\n1788#2,4:410\n*S KotlinDebug\n*F\n+ 1 NewAnswerFragment.kt\ncom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2\n*L\n286#1:401\n307#1:402,4\n286#1:406\n317#1:407,3\n323#1:410,4\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

.field public final synthetic h:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/CoroutineScope;Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Ljava/util/LinkedHashSet;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->f:Lkotlinx/coroutines/CoroutineScope;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    iput-object p3, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->h:Ljava/util/LinkedHashSet;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4

    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->f:Lkotlinx/coroutines/CoroutineScope;

    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    iget-object v3, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->h:Ljava/util/LinkedHashSet;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;-><init>(Lkotlinx/coroutines/CoroutineScope;Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Ljava/util/LinkedHashSet;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->d:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ljava/util/List;

    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object v7, v0

    .line 32
    move-object v8, v1

    .line 33
    goto/16 :goto_a

    .line 34
    .line 35
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 50
    .line 51
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->t(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0, p1, v3, p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->e0(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    const/4 v4, 0x0

    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_3
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 75
    .line 76
    iget-object v5, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->h:Ljava/util/LinkedHashSet;

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    const-string v8, "SUCCESS_KEY"

    .line 87
    .line 88
    if-eqz v7, :cond_d

    .line 89
    .line 90
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, Landroidx/work/WorkInfo;

    .line 95
    .line 96
    invoke-virtual {v7}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    sget-object v10, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2$a;->a:[I

    .line 101
    .line 102
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    aget v9, v10, v9

    .line 107
    .line 108
    if-eq v9, v3, :cond_a

    .line 109
    .line 110
    const/4 v10, 0x2

    .line 111
    if-eq v9, v10, :cond_a

    .line 112
    .line 113
    const/4 v10, 0x3

    .line 114
    if-eq v9, v10, :cond_4

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_4
    invoke-virtual {v7}, Landroidx/work/WorkInfo;->getTags()Ljava/util/Set;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    const-string v10, "ADDED_IMAGE"

    .line 122
    .line 123
    invoke-interface {v9, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-eqz v9, :cond_5

    .line 128
    .line 129
    invoke-virtual {v7}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-virtual {v7, v8}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    if-eqz v7, :cond_5

    .line 138
    .line 139
    invoke-virtual {v5, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 144
    .line 145
    .line 146
    :cond_5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    if-eqz v7, :cond_6

    .line 151
    .line 152
    move v8, v4

    .line 153
    goto :goto_2

    .line 154
    :cond_6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    move v8, v4

    .line 159
    :cond_7
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    if-eqz v9, :cond_8

    .line 164
    .line 165
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    check-cast v9, Landroidx/work/WorkInfo;

    .line 170
    .line 171
    invoke-virtual {v9}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    sget-object v10, Landroidx/work/WorkInfo$State;->SUCCEEDED:Landroidx/work/WorkInfo$State;

    .line 176
    .line 177
    if-ne v9, v10, :cond_7

    .line 178
    .line 179
    add-int/lit8 v8, v8, 0x1

    .line 180
    .line 181
    if-gez v8, :cond_7

    .line 182
    .line 183
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_8
    :goto_2
    int-to-float v7, v8

    .line 188
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    int-to-float v8, v8

    .line 193
    div-float/2addr v7, v8

    .line 194
    const/16 v8, 0x64

    .line 195
    .line 196
    int-to-float v8, v8

    .line 197
    mul-float/2addr v7, v8

    .line 198
    float-to-int v7, v7

    .line 199
    invoke-static {v2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->C(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    if-nez v8, :cond_9

    .line 204
    .line 205
    const-string v8, "uploadDialog"

    .line 206
    .line 207
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    move-object v8, p1

    .line 211
    :cond_9
    invoke-virtual {v8, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t(I)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :cond_a
    invoke-static {v2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->t(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v7}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    const-string v8, "ERROR_KEY"

    .line 224
    .line 225
    invoke-virtual {v7, v8, v4}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    sget-object v8, Lcom/zykj/lib/error/code/ErrorCode;->OSS_CLIENT_SOCKET_TIME_OUT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 230
    .line 231
    invoke-virtual {v8}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-virtual {v8}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-ne v7, v8, :cond_c

    .line 240
    .line 241
    invoke-static {v2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->B(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    if-nez v7, :cond_b

    .line 246
    .line 247
    const-string v7, "timeoutDialog"

    .line 248
    .line 249
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    move-object v7, p1

    .line 253
    :cond_b
    invoke-virtual {v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->show()V

    .line 254
    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_c
    sget-object v7, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 259
    .line 260
    sget v8, Lcom/zykj/student/dialogue/R$string;->dialogue_image_upload_fail:I

    .line 261
    .line 262
    invoke-virtual {v2, v8}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    const-string v9, "getString(...)"

    .line 267
    .line 268
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v7, v8}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :cond_d
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    if-eqz v2, :cond_e

    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_e
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    :cond_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    if-eqz v5, :cond_11

    .line 292
    .line 293
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    check-cast v5, Landroidx/work/WorkInfo;

    .line 298
    .line 299
    invoke-virtual {v5}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    sget-object v7, Landroidx/work/WorkInfo$State;->FAILED:Landroidx/work/WorkInfo$State;

    .line 304
    .line 305
    if-eq v6, v7, :cond_10

    .line 306
    .line 307
    invoke-virtual {v5}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    sget-object v6, Landroidx/work/WorkInfo$State;->CANCELLED:Landroidx/work/WorkInfo$State;

    .line 312
    .line 313
    if-ne v5, v6, :cond_f

    .line 314
    .line 315
    :cond_10
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    return-object p1

    .line 320
    :cond_11
    :goto_3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    if-eqz v2, :cond_12

    .line 325
    .line 326
    move v5, v4

    .line 327
    goto :goto_5

    .line 328
    :cond_12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    move v5, v4

    .line 333
    :cond_13
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    if-eqz v6, :cond_14

    .line 338
    .line 339
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v6

    .line 343
    check-cast v6, Landroidx/work/WorkInfo;

    .line 344
    .line 345
    invoke-virtual {v6}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    sget-object v7, Landroidx/work/WorkInfo$State;->SUCCEEDED:Landroidx/work/WorkInfo$State;

    .line 350
    .line 351
    if-ne v6, v7, :cond_13

    .line 352
    .line 353
    add-int/lit8 v5, v5, 0x1

    .line 354
    .line 355
    if-gez v5, :cond_13

    .line 356
    .line 357
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    .line 358
    .line 359
    .line 360
    goto :goto_4

    .line 361
    :cond_14
    :goto_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    if-ne v5, v2, :cond_20

    .line 366
    .line 367
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    :cond_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    if-eqz v4, :cond_16

    .line 376
    .line 377
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    move-object v5, v4

    .line 382
    check-cast v5, Landroidx/work/WorkInfo;

    .line 383
    .line 384
    invoke-virtual {v5}, Landroidx/work/WorkInfo;->getTags()Ljava/util/Set;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    const-string v6, "SCREENSHOT"

    .line 389
    .line 390
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v5

    .line 394
    if-eqz v5, :cond_15

    .line 395
    .line 396
    goto :goto_6

    .line 397
    :cond_16
    move-object v4, p1

    .line 398
    :goto_6
    check-cast v4, Landroidx/work/WorkInfo;

    .line 399
    .line 400
    if-eqz v4, :cond_17

    .line 401
    .line 402
    invoke-virtual {v4}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    if-eqz v2, :cond_17

    .line 407
    .line 408
    invoke-virtual {v2, v8}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    goto :goto_7

    .line 413
    :cond_17
    move-object v2, p1

    .line 414
    :goto_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    :cond_18
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 419
    .line 420
    .line 421
    move-result v5

    .line 422
    if-eqz v5, :cond_19

    .line 423
    .line 424
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    move-object v6, v5

    .line 429
    check-cast v6, Landroidx/work/WorkInfo;

    .line 430
    .line 431
    invoke-virtual {v6}, Landroidx/work/WorkInfo;->getTags()Ljava/util/Set;

    .line 432
    .line 433
    .line 434
    move-result-object v6

    .line 435
    const-string v7, "ZIP"

    .line 436
    .line 437
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v6

    .line 441
    if-eqz v6, :cond_18

    .line 442
    .line 443
    goto :goto_8

    .line 444
    :cond_19
    move-object v5, p1

    .line 445
    :goto_8
    check-cast v5, Landroidx/work/WorkInfo;

    .line 446
    .line 447
    if-eqz v5, :cond_1a

    .line 448
    .line 449
    invoke-virtual {v5}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    if-eqz v4, :cond_1a

    .line 454
    .line 455
    invoke-virtual {v4, v8}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    goto :goto_9

    .line 460
    :cond_1a
    move-object v4, p1

    .line 461
    :goto_9
    if-eqz v2, :cond_1f

    .line 462
    .line 463
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 464
    .line 465
    .line 466
    move-result v5

    .line 467
    if-nez v5, :cond_1b

    .line 468
    .line 469
    goto/16 :goto_c

    .line 470
    .line 471
    :cond_1b
    if-eqz v4, :cond_1f

    .line 472
    .line 473
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 474
    .line 475
    .line 476
    move-result v5

    .line 477
    if-nez v5, :cond_1c

    .line 478
    .line 479
    goto :goto_c

    .line 480
    :cond_1c
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 481
    .line 482
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->z(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 483
    .line 484
    .line 485
    move-result-object p1

    .line 486
    iget-object v5, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->h:Ljava/util/LinkedHashSet;

    .line 487
    .line 488
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v6

    .line 492
    iput-object v6, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->e:Ljava/lang/Object;

    .line 493
    .line 494
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->a:Ljava/lang/Object;

    .line 499
    .line 500
    iput-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->b:Ljava/lang/Object;

    .line 501
    .line 502
    iput-object v4, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->c:Ljava/lang/Object;

    .line 503
    .line 504
    iput v3, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->d:I

    .line 505
    .line 506
    invoke-virtual {p1, v5, p0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->t(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    if-ne p1, v1, :cond_1d

    .line 511
    .line 512
    return-object v1

    .line 513
    :cond_1d
    move-object v8, v2

    .line 514
    move-object v7, v4

    .line 515
    :goto_a
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 516
    .line 517
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->x(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;

    .line 518
    .line 519
    .line 520
    move-result-object p1

    .line 521
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;->b()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object p1

    .line 525
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 526
    .line 527
    .line 528
    move-result p1

    .line 529
    if-eqz p1, :cond_1e

    .line 530
    .line 531
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 532
    .line 533
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->z(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 534
    .line 535
    .line 536
    move-result-object p1

    .line 537
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 538
    .line 539
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->x(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;->e()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-virtual {p1, v0, v7, v8}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    goto :goto_b

    .line 551
    :cond_1e
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 552
    .line 553
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->z(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 554
    .line 555
    .line 556
    move-result-object v5

    .line 557
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 558
    .line 559
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->x(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;

    .line 560
    .line 561
    .line 562
    move-result-object p1

    .line 563
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;->b()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v6

    .line 567
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 568
    .line 569
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->x(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;

    .line 570
    .line 571
    .line 572
    move-result-object p1

    .line 573
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;->a()[Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v9

    .line 577
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 578
    .line 579
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->x(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;

    .line 580
    .line 581
    .line 582
    move-result-object p1

    .line 583
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;->f()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v10

    .line 587
    invoke-virtual/range {v5 .. v10}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    :goto_b
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    return-object p1

    .line 595
    :cond_1f
    :goto_c
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 596
    .line 597
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->t(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)V

    .line 598
    .line 599
    .line 600
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;->g:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 601
    .line 602
    invoke-static {v0, p1, v3, p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->e0(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 606
    .line 607
    .line 608
    move-result-object p1

    .line 609
    return-object p1

    .line 610
    :cond_20
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 611
    .line 612
    .line 613
    move-result-object p1

    .line 614
    return-object p1
.end method
