# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class final Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.ui.sheet.composition.CompositionViewModel$commit$1$1"
    f = "CompositionViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCompositionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,171:1\n13472#2,2:172\n13472#2,2:174\n13472#2,2:176\n*S KotlinDebug\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1\n*L\n124#1:172,2\n148#1:174,2\n161#1:176,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;->b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;->b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;-><init>(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Landroid/graphics/BitmapFactory$Options;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;->b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 20
    .line 21
    invoke-static {v1}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->Z(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)[Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    array-length v2, v1

    .line 26
    const/4 v3, 0x0

    .line 27
    move v4, v3

    .line 28
    move v5, v4

    .line 29
    move v6, v5

    .line 30
    :goto_0
    if-ge v4, v2, :cond_1

    .line 31
    .line 32
    aget-object v7, v1, v4

    .line 33
    .line 34
    invoke-static {v7, p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 35
    .line 36
    .line 37
    iget v7, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 38
    .line 39
    if-le v7, v5, :cond_0

    .line 40
    .line 41
    move v5, v7

    .line 42
    :cond_0
    iget v7, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 43
    .line 44
    add-int/2addr v6, v7

    .line 45
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    if-eqz v5, :cond_7

    .line 49
    .line 50
    if-nez v6, :cond_2

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_2
    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 54
    .line 55
    invoke-static {v5, v6, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v2, "createBitmap(...)"

    .line 60
    .line 61
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    new-instance v2, Landroid/graphics/Canvas;

    .line 65
    .line 66
    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 67
    .line 68
    .line 69
    iput-boolean v3, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 70
    .line 71
    new-instance v4, Landroid/graphics/Paint;

    .line 72
    .line 73
    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;->b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 80
    .line 81
    invoke-static {v0}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->Z(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)[Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    array-length v5, v0

    .line 86
    move v6, v3

    .line 87
    move v7, v6

    .line 88
    :goto_1
    if-ge v6, v5, :cond_3

    .line 89
    .line 90
    aget-object v8, v0, v6

    .line 91
    .line 92
    invoke-static {v8, p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    const/4 v9, 0x0

    .line 97
    int-to-float v10, v7

    .line 98
    invoke-virtual {v2, v8, v9, v10, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 99
    .line 100
    .line 101
    iget v9, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 102
    .line 103
    add-int/2addr v7, v9

    .line 104
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v6, v6, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;->b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->c0()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    .line 117
    .line 118
    invoke-static {v1, p1, v0}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Z

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1$1;->b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 122
    .line 123
    invoke-static {p1}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->Z(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)[Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    array-length v0, p1

    .line 128
    :goto_2
    if-ge v3, v0, :cond_6

    .line 129
    .line 130
    aget-object v1, p1, v3

    .line 131
    .line 132
    if-eqz v1, :cond_5

    .line 133
    .line 134
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-nez v2, :cond_4

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_4
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    :cond_5
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p1

    .line 150
    :cond_7
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p1

    .line 153
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 156
    .line 157
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw p1
.end method
