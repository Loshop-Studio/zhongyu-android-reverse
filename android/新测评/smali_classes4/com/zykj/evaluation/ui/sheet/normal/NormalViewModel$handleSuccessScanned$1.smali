.class final Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->G(Lb7/c1;Lkotlin/jvm/functions/Function0;)V
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
    c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel$handleSuccessScanned$1"
    f = "NormalViewModel.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x2d7,
        0x2db
    }
    m = "invokeSuspend"
    n = {
        "previewBitmap",
        "width",
        "previewBitmap",
        "width"
    }
    s = {
        "L$0",
        "I$0",
        "L$0",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNormalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,1441:1\n88#2:1442\n*S KotlinDebug\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1\n*L\n724#1:1442\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:I

.field public final synthetic d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

.field public final synthetic e:Lb7/c1;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lb7/c1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->e:Lb7/c1;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->f:Lkotlin/jvm/functions/Function0;

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

    new-instance p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->e:Lb7/c1;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->f:Lkotlin/jvm/functions/Function0;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lb7/c1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/graphics/Bitmap;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    iget v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->a:I

    .line 33
    .line 34
    iget-object v3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Landroid/graphics/Bitmap;

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 46
    .line 47
    invoke-static {p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->d0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Lcom/zykj/evaluation/bean/PaperConfig;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 54
    .line 55
    const-string v0, "\u7b54\u9898\u5361\u914d\u7f6e\u52a0\u8f7d\u5931\u8d25\uff0c\u8bf7\u9000\u51fa\u91cd\u8bd5"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_3
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenHeight()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenWidth()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    int-to-float p1, v1

    .line 76
    iget-object v4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 77
    .line 78
    invoke-static {v4}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->b0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)F

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    mul-float/2addr p1, v4

    .line 83
    float-to-int p1, p1

    .line 84
    sget-object v4, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 85
    .line 86
    invoke-static {v1, p1, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object v4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 91
    .line 92
    invoke-static {v4}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->t0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_6

    .line 97
    .line 98
    iget-object v4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 99
    .line 100
    iget-object v5, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->e:Lb7/c1;

    .line 101
    .line 102
    invoke-virtual {v5}, Lb7/c1;->a()Landroid/graphics/Bitmap;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    iget-object v6, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->e:Lb7/c1;

    .line 107
    .line 108
    invoke-virtual {v6}, Lb7/c1;->b()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->b:Ljava/lang/Object;

    .line 113
    .line 114
    iput v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->a:I

    .line 115
    .line 116
    iput v3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->c:I

    .line 117
    .line 118
    invoke-static {v4, v5, v6, p1, p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->Z(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    if-ne v3, v0, :cond_4

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    move-object v7, v3

    .line 126
    move-object v3, p1

    .line 127
    move-object p1, v7

    .line 128
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-nez p1, :cond_5

    .line 135
    .line 136
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_5
    move-object p1, v3

    .line 140
    :cond_6
    iget-object v3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 141
    .line 142
    iget-object v4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->e:Lb7/c1;

    .line 143
    .line 144
    invoke-virtual {v4}, Lb7/c1;->a()Landroid/graphics/Bitmap;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    iget-object v5, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->e:Lb7/c1;

    .line 149
    .line 150
    invoke-virtual {v5}, Lb7/c1;->b()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    iput-object v6, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->b:Ljava/lang/Object;

    .line 159
    .line 160
    iput v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->a:I

    .line 161
    .line 162
    iput v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->c:I

    .line 163
    .line 164
    invoke-static {v3, v4, v5, p1, p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->m0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-ne p1, v0, :cond_7

    .line 169
    .line 170
    :goto_1
    return-object v0

    .line 171
    :cond_7
    :goto_2
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;->f:Lkotlin/jvm/functions/Function0;

    .line 172
    .line 173
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 177
    .line 178
    return-object p1
.end method
