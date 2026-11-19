.class final Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)Ljava/lang/String;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.service.UploadIntentService$onHandleIntent$resultUrl$1"
    f = "UploadIntentService.kt"
    i = {}
    l = {
        0x6f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $localPath:Ljava/lang/String;

.field final synthetic $objectKey:Ljava/lang/String;

.field final synthetic $resp:Lcom/zykj/mistake/entity/resp/GeneratorResp;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/entity/resp/GeneratorResp;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/zykj/mistake/entity/resp/GeneratorResp;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->$localPath:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->$objectKey:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->$resp:Lcom/zykj/mistake/entity/resp/GeneratorResp;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->$localPath:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->$objectKey:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->$resp:Lcom/zykj/mistake/entity/resp/GeneratorResp;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/entity/resp/GeneratorResp;Lh6/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->$localPath:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->$objectKey:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->$resp:Lcom/zykj/mistake/entity/resp/GeneratorResp;

    .line 30
    .line 31
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/GeneratorResp;->getResult()Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iput v2, p0, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;->label:I

    .line 39
    .line 40
    sget-object v2, Lcom/zykj/mistake/utils/l;->a:Lcom/zykj/mistake/utils/l;

    .line 41
    .line 42
    invoke-virtual {v2, p1, v1, v3, p0}, Lcom/zykj/mistake/utils/l;->a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    return-object p1
.end method
