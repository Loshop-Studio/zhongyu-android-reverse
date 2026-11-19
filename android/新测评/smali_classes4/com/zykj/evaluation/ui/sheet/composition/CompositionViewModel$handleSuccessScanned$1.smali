.class final Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->G(Lb7/c1;Lkotlin/jvm/functions/Function0;)V
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
    c = "com.zykj.evaluation.ui.sheet.composition.CompositionViewModel$handleSuccessScanned$1"
    f = "CompositionViewModel.kt"
    i = {
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x4f,
        0x56,
        0x60
    }
    m = "invokeSuspend"
    n = {
        "previewBitmap",
        "resultPath",
        "previewBitmap",
        "resultPath",
        "newBitmap",
        "it",
        "$i$a$-let-CompositionViewModel$handleSuccessScanned$1$1"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCompositionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public final synthetic g:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

.field public final synthetic h:Lb7/c1;

.field public final synthetic i:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;Lb7/c1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->g:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->h:Lb7/c1;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->i:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->g:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->h:Lb7/c1;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->i:Lkotlin/jvm/functions/Function0;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;-><init>(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;Lb7/c1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->f:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v4, :cond_2

    .line 14
    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroid/graphics/Bitmap;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Ljava/lang/String;

    .line 30
    .line 31
    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Landroid/graphics/Bitmap;

    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    iget-object v3, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Landroid/graphics/Bitmap;

    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v1, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;

    .line 72
    .line 73
    iget-object v6, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->g:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 74
    .line 75
    iget-object v7, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->h:Lb7/c1;

    .line 76
    .line 77
    invoke-direct {v1, v6, v7, v5}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;-><init>(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;Lb7/c1;Lkotlin/coroutines/Continuation;)V

    .line 78
    .line 79
    .line 80
    iput v4, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->f:I

    .line 81
    .line 82
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v0, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    :goto_0
    check-cast p1, Landroid/graphics/Bitmap;

    .line 90
    .line 91
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->g:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 92
    .line 93
    invoke-static {v1}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->Y(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)Lg7/e;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, Lg7/e;->h()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    new-instance v6, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$newBitmap$1;

    .line 106
    .line 107
    invoke-direct {v6, p1, v1, v5}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$newBitmap$1;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    iput-object v7, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->a:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->b:Ljava/lang/Object;

    .line 117
    .line 118
    iput v3, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->f:I

    .line 119
    .line 120
    invoke-static {v4, v6, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-ne v3, v0, :cond_5

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    move-object v10, v3

    .line 128
    move-object v3, p1

    .line 129
    move-object p1, v10

    .line 130
    :goto_1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 131
    .line 132
    iget-object v4, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->g:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 133
    .line 134
    invoke-static {v4}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->Z(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)[Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    iget-object v6, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->g:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 139
    .line 140
    invoke-virtual {v6}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    aget-object v4, v4, v6

    .line 145
    .line 146
    if-eqz v4, :cond_7

    .line 147
    .line 148
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    new-instance v7, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$1$1;

    .line 153
    .line 154
    invoke-direct {v7, v4, v5}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$1$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    iput-object v3, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->a:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->b:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->c:Ljava/lang/Object;

    .line 166
    .line 167
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    iput-object v3, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->d:Ljava/lang/Object;

    .line 172
    .line 173
    const/4 v3, 0x0

    .line 174
    iput v3, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->e:I

    .line 175
    .line 176
    iput v2, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->f:I

    .line 177
    .line 178
    invoke-static {v6, v7, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    if-ne v2, v0, :cond_6

    .line 183
    .line 184
    :goto_2
    return-object v0

    .line 185
    :cond_6
    move-object v0, p1

    .line 186
    move-object p1, v2

    .line 187
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 194
    .line 195
    .line 196
    move-object p1, v0

    .line 197
    :cond_7
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->g:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 198
    .line 199
    invoke-static {v0}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->Z(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)[Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->g:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 204
    .line 205
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-eqz p1, :cond_8

    .line 210
    .line 211
    move-object v5, v1

    .line 212
    :cond_8
    aput-object v5, v0, v2

    .line 213
    .line 214
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->g:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 215
    .line 216
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    if-nez p1, :cond_9

    .line 221
    .line 222
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->h:Lb7/c1;

    .line 223
    .line 224
    invoke-virtual {p1}, Lb7/c1;->a()Landroid/graphics/Bitmap;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    :cond_9
    move-object v2, p1

    .line 229
    sget-object v5, Lcom/zykj/evaluation/ui/sheet/b$d;->b:Lcom/zykj/evaluation/ui/sheet/b$d;

    .line 230
    .line 231
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->g:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 232
    .line 233
    invoke-static {p1}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->b0(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)Z

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    const/16 v8, 0x16

    .line 238
    .line 239
    const/4 v9, 0x0

    .line 240
    const/4 v3, 0x0

    .line 241
    const/4 v4, 0x0

    .line 242
    const/4 v6, 0x0

    .line 243
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/ui/sheet/a;->b(Lcom/zykj/evaluation/ui/sheet/a;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Ljava/util/List;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/sheet/a;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-virtual {v0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->X(Lcom/zykj/evaluation/ui/sheet/a;)V

    .line 248
    .line 249
    .line 250
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->i:Lkotlin/jvm/functions/Function0;

    .line 251
    .line 252
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 256
    .line 257
    return-object p1
.end method
