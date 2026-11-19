.class final Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "path",
        "url"
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
    c = "com.zykj.mistake.service.UploadFolderIntentService$onHandleIntent$1$1"
    f = "UploadFolderIntentService.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x68
    }
    m = "invokeSuspend"
    n = {
        "path",
        "url"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $resp:Lcom/zykj/mistake/entity/resp/GeneratorResp;

.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/entity/resp/GeneratorResp;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/entity/resp/GeneratorResp;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;->$resp:Lcom/zykj/mistake/entity/resp/GeneratorResp;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Lh6/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;->invoke(Ljava/lang/String;Ljava/lang/String;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Ljava/lang/String;Lh6/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lh6/c<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;

    iget-object v1, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;->$resp:Lcom/zykj/mistake/entity/resp/GeneratorResp;

    invoke-direct {v0, v1, p3}, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;-><init>(Lcom/zykj/mistake/entity/resp/GeneratorResp;Lh6/c;)V

    iput-object p1, v0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;->L$1:Ljava/lang/Object;

    sget-object p1, Ld6/s;->a:Ld6/s;

    invoke-virtual {v0, p1}, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;->L$1:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 10
    .line 11
    iget v3, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;->label:I

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    if-ne v3, v4, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;->$resp:Lcom/zykj/mistake/entity/resp/GeneratorResp;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/GeneratorResp;->getResult()Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    iput-object v3, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    iput-object v3, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;->L$1:Ljava/lang/Object;

    .line 46
    .line 47
    iput v4, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;->label:I

    .line 48
    .line 49
    sget-object v3, Lcom/zykj/mistake/utils/l;->a:Lcom/zykj/mistake/utils/l;

    .line 50
    .line 51
    invoke-virtual {v3, v0, v1, p1, p0}, Lcom/zykj/mistake/utils/l;->a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v2, :cond_2

    .line 56
    .line 57
    return-object v2

    .line 58
    :cond_2
    return-object p1
.end method
