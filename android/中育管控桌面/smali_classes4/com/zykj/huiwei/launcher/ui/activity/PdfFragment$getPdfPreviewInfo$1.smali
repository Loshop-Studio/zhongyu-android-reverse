.class final Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;->o(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
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
    c = "com.zykj.huiwei.launcher.ui.activity.PdfFragment$getPdfPreviewInfo$1"
    f = "PdfFragment.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x9b
    }
    m = "invokeSuspend"
    n = {
        "$this$invokeSuspend_u24lambda_u240",
        "$i$a$-runCatching-PdfFragment$getPdfPreviewInfo$1$1"
    }
    s = {
        "L$0",
        "I$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public c:I

.field public final synthetic d:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->d:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    iput-object p2, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->e:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->f:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->d:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->f:Lkotlin/jvm/functions/Function2;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;-><init>(Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lt3/b;

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->d:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;->n(Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;)Lt3/b;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->e:Ljava/lang/String;

    .line 41
    .line 42
    :try_start_1
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 43
    .line 44
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    new-instance v5, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1$1$1;

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    invoke-direct {v5, p1, v1, v6}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1$1$1;-><init>(Lt3/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->a:Ljava/lang/Object;

    .line 59
    .line 60
    iput v3, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->b:I

    .line 61
    .line 62
    iput v2, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->c:I

    .line 63
    .line 64
    invoke-static {v4, v5, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v0, :cond_2

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_2
    :goto_0
    check-cast p1, Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;

    .line 72
    .line 73
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    goto :goto_2

    .line 78
    :goto_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 79
    .line 80
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :goto_2
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->f:Lkotlin/jvm/functions/Function2;

    .line 89
    .line 90
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/4 v2, 0x0

    .line 95
    if-eqz v1, :cond_5

    .line 96
    .line 97
    move-object v1, p1

    .line 98
    check-cast v1, Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;

    .line 99
    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;->getPageIndex()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    goto :goto_3

    .line 107
    :cond_3
    move v4, v3

    .line 108
    :goto_3
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    if-eqz v1, :cond_4

    .line 113
    .line 114
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;->getPageOffset()F

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    goto :goto_4

    .line 119
    :cond_4
    move v1, v2

    .line 120
    :goto_4
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-interface {v0, v4, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    :cond_5
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$getPdfPreviewInfo$1;->f:Lkotlin/jvm/functions/Function2;

    .line 128
    .line 129
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-eqz p1, :cond_6

    .line 134
    .line 135
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-interface {v0, p1, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :cond_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p1
.end method
