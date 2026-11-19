# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class final Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->v(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.zykj.evaluation.ui.sheet.AnswerSheetPageKt$AnswerSheetPage$2$1"
    f = "AnswerSheetPage.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->d:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->b:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->d:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->b:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    :try_start_0
    new-instance p1, Lcom/google/gson/Gson;

    .line 33
    .line 34
    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->c:Ljava/lang/String;

    .line 38
    .line 39
    const-class v1, Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;

    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catch_0
    move-exception p1

    .line 49
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->c:Ljava/lang/String;

    .line 54
    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v2, "AnswerSheetPage\u9875\u9762JSON\u89e3\u6790\u5931\u8d25: "

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p1, ",\u539f\u59cb\u6570\u636e: "

    .line 69
    .line 70
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const/4 p1, 0x0

    .line 88
    :goto_0
    if-eqz p1, :cond_1

    .line 89
    .line 90
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;->d:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->H(Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;)Z

    .line 93
    .line 94
    .line 95
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 99
    .line 100
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 101
    .line 102
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1
.end method
