.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;"
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
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$createOrEditCustomTag$1$1"
    f = "MistakeDetailNewViewModel.kt"
    i = {}
    l = {
        0x917
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $id:J

.field final synthetic $name:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/lang/String;JLh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "Ljava/lang/String;",
            "J",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->$name:Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->$id:J

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Lh6/c;)Lh6/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->$name:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->$id:J

    .line 8
    .line 9
    move-object v5, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/lang/String;JLh6/c;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(Lh6/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->create(Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;

    sget-object v0, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lh6/c;

    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->invoke(Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->label:I

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
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 26
    .line 27
    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->b:Lo2/a;

    .line 28
    .line 29
    new-instance v1, Lcom/zykj/mistake/entity/req/CreateTagReq;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->$name:Ljava/lang/String;

    .line 32
    .line 33
    iget-wide v4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->$id:J

    .line 34
    .line 35
    invoke-direct {v1, v3, v4, v5}, Lcom/zykj/mistake/entity/req/CreateTagReq;-><init>(Ljava/lang/String;J)V

    .line 36
    .line 37
    .line 38
    iput v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$createOrEditCustomTag$1$1;->label:I

    .line 39
    .line 40
    iget-object p1, p1, Lo2/a;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lk4/a;

    .line 43
    .line 44
    iget-object p1, p1, Lk4/a;->a:Lr6/a;

    .line 45
    .line 46
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lcom/zykj/mistake/network/c;

    .line 51
    .line 52
    invoke-interface {p1, v1, p0}, Lcom/zykj/mistake/network/c;->j(Lcom/zykj/mistake/entity/req/CreateTagReq;Lh6/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_2

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_2
    return-object p1
.end method
