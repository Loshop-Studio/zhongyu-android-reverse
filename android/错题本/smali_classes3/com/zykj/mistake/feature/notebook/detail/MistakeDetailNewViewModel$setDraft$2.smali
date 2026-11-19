.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;
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
        "Lcom/zykj/mistake/network/ApiResp;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)Lcom/zykj/mistake/network/ApiResp;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$setDraft$2"
    f = "MistakeDetailNewViewModel.kt"
    i = {}
    l = {
        0x24e
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $draftUrl:Ljava/lang/String;

.field final synthetic $itemId:J

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;JLjava/lang/String;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "J",
            "Ljava/lang/String;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->$itemId:J

    .line 4
    .line 5
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->$draftUrl:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 6
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
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 4
    .line 5
    iget-wide v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->$itemId:J

    .line 6
    .line 7
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->$draftUrl:Ljava/lang/String;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;JLjava/lang/String;Lh6/c;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->label:I

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
    check-cast p1, Lkotlin/Result;

    .line 14
    .line 15
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2$1;

    .line 32
    .line 33
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 34
    .line 35
    iget-wide v5, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->$itemId:J

    .line 36
    .line 37
    iget-object v7, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->$draftUrl:Ljava/lang/String;

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    invoke-direct/range {v3 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;JLjava/lang/String;Lh6/c;)V

    .line 41
    .line 42
    .line 43
    iput v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$setDraft$2;->label:I

    .line 44
    .line 45
    invoke-static {v3, p0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    :goto_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object p1
.end method
