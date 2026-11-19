.class final Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
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
    c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$saveBitmap$1$1"
    f = "MistakeViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

.field public final synthetic c:I

.field public final synthetic d:Landroid/graphics/Bitmap;

.field public final synthetic e:J


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;ILandroid/graphics/Bitmap;JLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iput p2, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->c:I

    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->d:Landroid/graphics/Bitmap;

    iput-wide p4, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->e:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7

    new-instance v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iget v2, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->c:I

    iget-object v3, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->d:Landroid/graphics/Bitmap;

    iget-wide v4, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->e:J

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;-><init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;ILandroid/graphics/Bitmap;JLkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->q(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lg7/e;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    const-string p1, "mPathManager"

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    :cond_0
    iget-object v2, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 30
    .line 31
    invoke-static {v2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->r(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    iget v4, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->c:I

    .line 36
    .line 37
    invoke-virtual {p1, v2, v3, v4}, Lg7/e;->o(JI)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object v2, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->d:Landroid/graphics/Bitmap;

    .line 42
    .line 43
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    invoke-static {v2, p1, v3, v4}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    sub-long v0, v3, v0

    .line 55
    .line 56
    iget-wide v5, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;->e:J

    .line 57
    .line 58
    sub-long/2addr v3, v5

    .line 59
    new-instance v5, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v6, "\n                \u4fdd\u5b58\u73af\u8282\u65e5\u5fd7:\n                - \u5b58\u50a8\u8def\u5f84: "

    .line 65
    .line 66
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v6, "\n                - \u538b\u7f29\u53ca\u5199\u5165\u8017\u65f6: "

    .line 73
    .line 74
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v0, " ms\n                - \u6574\u4e2a\u6d41\u7a0b\u603b\u8017\u65f6: "

    .line 81
    .line 82
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v0, " ms\n                - \u662f\u5426\u4fdd\u5b58\u6210\u529f: "

    .line 89
    .line 90
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v0, "\n            "

    .line 97
    .line 98
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v0}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-string v1, "\u5f00\u59cb\u5904\u7406\u56fe\u7247,ImageTrace"

    .line 110
    .line 111
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    if-eqz v2, :cond_1

    .line 119
    .line 120
    return-object p1

    .line 121
    :cond_1
    const-string p1, ""

    .line 122
    .line 123
    return-object p1

    .line 124
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 125
    .line 126
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 127
    .line 128
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p1
.end method
