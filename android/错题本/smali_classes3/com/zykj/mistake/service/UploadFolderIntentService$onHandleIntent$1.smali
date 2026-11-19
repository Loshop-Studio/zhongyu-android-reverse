.class final Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.service.UploadFolderIntentService$onHandleIntent$1"
    f = "UploadFolderIntentService.kt"
    i = {}
    l = {
        0x64
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $filePath:Ljava/lang/String;

.field final synthetic $imageUrlList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $jsonUrl:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $objectKey:Ljava/lang/String;

.field final synthetic $resp:Lcom/zykj/mistake/entity/resp/GeneratorResp;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/entity/resp/GeneratorResp;Ljava/util/ArrayList;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/zykj/mistake/entity/resp/GeneratorResp;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$jsonUrl:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$filePath:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$objectKey:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$resp:Lcom/zykj/mistake/entity/resp/GeneratorResp;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$imageUrlList:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 7
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
    new-instance v0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$jsonUrl:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$filePath:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$objectKey:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$resp:Lcom/zykj/mistake/entity/resp/GeneratorResp;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$imageUrlList:Ljava/util/ArrayList;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/entity/resp/GeneratorResp;Ljava/util/ArrayList;Lh6/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->label:I

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
    iget-object v0, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$jsonUrl:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 30
    .line 31
    iget-object v4, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$filePath:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v5, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$objectKey:Ljava/lang/String;

    .line 34
    .line 35
    new-instance v6, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$resp:Lcom/zykj/mistake/entity/resp/GeneratorResp;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {v6, v1, v3}, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1$1;-><init>(Lcom/zykj/mistake/entity/resp/GeneratorResp;Lh6/c;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->$imageUrlList:Ljava/util/ArrayList;

    .line 44
    .line 45
    new-instance v7, Landroidx/navigation/i;

    .line 46
    .line 47
    const/16 v3, 0x12

    .line 48
    .line 49
    invoke-direct {v7, v1, v3}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    iput v2, p0, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;->label:I

    .line 55
    .line 56
    sget-object v3, Lcom/zykj/mistake/utils/j;->a:Lcom/zykj/mistake/utils/j;

    .line 57
    .line 58
    move-object v8, p0

    .line 59
    invoke-virtual/range {v3 .. v8}, Lcom/zykj/mistake/utils/j;->d(Ljava/lang/String;Ljava/lang/String;Lr6/f;Landroidx/navigation/i;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-ne v1, v0, :cond_2

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_2
    move-object v0, p1

    .line 67
    move-object p1, v1

    .line 68
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 73
    .line 74
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_3
    new-instance p1, Ljava/lang/Exception;

    .line 78
    .line 79
    const-string v0, "Upload Failed"

    .line 80
    .line 81
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1
.end method
