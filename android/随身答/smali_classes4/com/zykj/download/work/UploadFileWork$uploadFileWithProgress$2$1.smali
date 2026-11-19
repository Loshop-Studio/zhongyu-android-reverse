.class final Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2$1"
    f = "UploadFileWork.kt"
    i = {}
    l = {
        0x47,
        0x49
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic d:Lcom/zykj/download/work/UploadFileWork;

.field public final synthetic e:Lkotlinx/coroutines/Job;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/download/work/UploadFileWork;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->d:Lcom/zykj/download/work/UploadFileWork;

    iput-object p3, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->e:Lkotlinx/coroutines/Job;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;

    iget-object v0, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->d:Lcom/zykj/download/work/UploadFileWork;

    iget-object v2, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->e:Lkotlinx/coroutines/Job;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/download/work/UploadFileWork;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->b:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 40
    .line 41
    iget-object p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->d:Lcom/zykj/download/work/UploadFileWork;

    .line 42
    .line 43
    iput-object v1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->a:Ljava/lang/Object;

    .line 44
    .line 45
    iput v4, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->b:I

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Lcom/zykj/download/work/UploadFileWork;->uploadFile(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v0, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    :goto_0
    iput-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 55
    .line 56
    iput-object v3, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->a:Ljava/lang/Object;

    .line 57
    .line 58
    iput v2, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->b:I

    .line 59
    .line 60
    const-wide/16 v1, 0x1f4

    .line 61
    .line 62
    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v0, :cond_4

    .line 67
    .line 68
    :goto_1
    return-object v0

    .line 69
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2$1;->e:Lkotlinx/coroutines/Job;

    .line 70
    .line 71
    invoke-static {p1, v3, v4, v3}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p1
.end method
