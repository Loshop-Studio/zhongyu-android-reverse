.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
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
        "Lcom/zykj/mistake/network/ApiResp;"
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
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$syncToNewCollection$2"
    f = "MistakeDetailNewViewModel.kt"
    i = {}
    l = {
        0x59e
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $collection:Lcom/zykj/mistake/data/c;

.field final synthetic $itemId:I

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/data/c;ILh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "Lcom/zykj/mistake/data/c;",
            "I",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->$collection:Lcom/zykj/mistake/data/c;

    .line 4
    .line 5
    iput p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->$itemId:I

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Lh6/c;)Lh6/c;
    .locals 4
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
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->$collection:Lcom/zykj/mistake/data/c;

    .line 6
    .line 7
    iget v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->$itemId:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/data/c;ILh6/c;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Lh6/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->create(Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;

    sget-object v0, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lh6/c;

    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->invoke(Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->label:I

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
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->a:Lcom/zykj/mistake/data/a;

    .line 28
    .line 29
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->$collection:Lcom/zykj/mistake/data/c;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/zykj/mistake/data/c;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->$itemId:I

    .line 38
    .line 39
    new-instance v1, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->$collection:Lcom/zykj/mistake/data/c;

    .line 49
    .line 50
    invoke-static {p1}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    sget-object v7, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 55
    .line 56
    iput v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$syncToNewCollection$2;->label:I

    .line 57
    .line 58
    move-object v8, p0

    .line 59
    invoke-virtual/range {v3 .. v8}, Lcom/zykj/mistake/data/a;->c(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v0, :cond_2

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_2
    return-object p1
.end method
