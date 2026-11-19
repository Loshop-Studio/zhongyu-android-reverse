.class final Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;
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
    c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$requestApi$2"
    f = "MistakeNotebookViewModel.kt"
    i = {}
    l = {
        0x30c
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $onSuccess:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $request:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $showLoading:Z

.field final synthetic $transform:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;


# direct methods
.method public constructor <init>(ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lr6/c;Lr6/c;Lr6/c;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->$showLoading:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->$request:Lr6/c;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->$transform:Lr6/c;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->$onSuccess:Lr6/c;

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
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->$showLoading:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->$request:Lr6/c;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->$transform:Lr6/c;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->$onSuccess:Lr6/c;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;-><init>(ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lr6/c;Lr6/c;Lr6/c;Lh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->label:I

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
    iget-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->$showLoading:Z

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 36
    .line 37
    sget-object v1, Lcom/zykj/mistake/feature/notebook/list/w;->a:Lcom/zykj/mistake/feature/notebook/list/w;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->$request:Lr6/c;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->$transform:Lr6/c;

    .line 45
    .line 46
    iput v2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->label:I

    .line 47
    .line 48
    invoke-static {p1, v1, p0}, Lcom/zykj/mistake/data/e;->b(Lr6/c;Lr6/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->$onSuccess:Lr6/c;

    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_4
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 67
    .line 68
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-eqz p1, :cond_6

    .line 73
    .line 74
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-nez p1, :cond_5

    .line 81
    .line 82
    const-string p1, ""

    .line 83
    .line 84
    :cond_5
    invoke-direct {v1, p1}, Lcom/zykj/mistake/feature/notebook/list/x;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    iget-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->$showLoading:Z

    .line 91
    .line 92
    if-eqz p1, :cond_7

    .line 93
    .line 94
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestApi$2;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 95
    .line 96
    sget-object v0, Lcom/zykj/mistake/feature/notebook/list/o;->a:Lcom/zykj/mistake/feature/notebook/list/o;

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 99
    .line 100
    .line 101
    :cond_7
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 102
    .line 103
    return-object p1
.end method
