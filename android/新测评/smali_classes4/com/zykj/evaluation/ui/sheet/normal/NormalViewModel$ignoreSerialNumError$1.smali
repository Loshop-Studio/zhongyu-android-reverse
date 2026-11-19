.class final Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->R0(Lkotlin/jvm/functions/Function0;)V
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
    c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel$ignoreSerialNumError$1"
    f = "NormalViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x31b
    }
    m = "invokeSuspend"
    n = {
        "it",
        "previewBitmap",
        "isPageError",
        "$i$a$-let-NormalViewModel$ignoreSerialNumError$1$1",
        "width"
    }
    s = {
        "L$0",
        "L$1",
        "Z$0",
        "I$0",
        "I$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNormalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,1441:1\n88#2:1442\n*S KotlinDebug\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1\n*L\n793#1:1442\n*E\n"
    }
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:I

.field public e:I

.field public f:I

.field public final synthetic g:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

.field public final synthetic h:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->g:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->h:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->g:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->h:Lkotlin/jvm/functions/Function0;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->f:I

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
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroid/graphics/Bitmap;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lb7/c1;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->g:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/a;->g()Lcom/zykj/evaluation/ui/sheet/b;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v1, "null cannot be cast to non-null type com.zykj.evaluation.ui.sheet.ScanResult.Failed"

    .line 47
    .line 48
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    check-cast p1, Lcom/zykj/evaluation/ui/sheet/b$c;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/b$c;->b()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    const/4 v1, 0x0

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->g:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    new-instance v7, Lcom/zykj/evaluation/ui/sheet/b$c;

    .line 67
    .line 68
    invoke-direct {v7, v1, v1, v2}, Lcom/zykj/evaluation/ui/sheet/b$c;-><init>(ZZZ)V

    .line 69
    .line 70
    .line 71
    const/16 v10, 0x37

    .line 72
    .line 73
    const/4 v11, 0x0

    .line 74
    const/4 v4, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x0

    .line 77
    const/4 v8, 0x0

    .line 78
    const/4 v9, 0x0

    .line 79
    invoke-static/range {v3 .. v11}, Lcom/zykj/evaluation/ui/sheet/a;->b(Lcom/zykj/evaluation/ui/sheet/a;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Ljava/util/List;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/sheet/a;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p1, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->X(Lcom/zykj/evaluation/ui/sheet/a;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    iget-object v3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->g:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 88
    .line 89
    invoke-virtual {v3}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    sget-object v8, Lcom/zykj/evaluation/ui/sheet/b$d;->b:Lcom/zykj/evaluation/ui/sheet/b$d;

    .line 94
    .line 95
    const/16 v11, 0x37

    .line 96
    .line 97
    const/4 v12, 0x0

    .line 98
    const/4 v5, 0x0

    .line 99
    const/4 v6, 0x0

    .line 100
    const/4 v7, 0x0

    .line 101
    const/4 v9, 0x0

    .line 102
    const/4 v10, 0x0

    .line 103
    invoke-static/range {v4 .. v12}, Lcom/zykj/evaluation/ui/sheet/a;->b(Lcom/zykj/evaluation/ui/sheet/a;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Ljava/util/List;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/sheet/a;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v3, v4}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->X(Lcom/zykj/evaluation/ui/sheet/a;)V

    .line 108
    .line 109
    .line 110
    iget-object v3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->g:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 111
    .line 112
    invoke-static {v3}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->g0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Lb7/c1;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    if-eqz v3, :cond_3

    .line 117
    .line 118
    iget-object v4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->g:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 119
    .line 120
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenHeight()I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenWidth()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    int-to-float v6, v5

    .line 133
    invoke-static {v4}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->b0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)F

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    mul-float/2addr v6, v7

    .line 138
    float-to-int v6, v6

    .line 139
    sget-object v7, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 140
    .line 141
    invoke-static {v5, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-virtual {v3}, Lb7/c1;->a()Landroid/graphics/Bitmap;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-virtual {v3}, Lb7/c1;->b()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    iput-object v3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->b:Ljava/lang/Object;

    .line 158
    .line 159
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    iput-object v3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->c:Ljava/lang/Object;

    .line 164
    .line 165
    iput-boolean p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->a:Z

    .line 166
    .line 167
    iput v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->d:I

    .line 168
    .line 169
    iput v5, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->e:I

    .line 170
    .line 171
    iput v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->f:I

    .line 172
    .line 173
    invoke-static {v4, v7, v8, v6, p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->m0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    if-ne p1, v0, :cond_3

    .line 178
    .line 179
    return-object v0

    .line 180
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;->h:Lkotlin/jvm/functions/Function0;

    .line 181
    .line 182
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 186
    .line 187
    return-object p1
.end method
