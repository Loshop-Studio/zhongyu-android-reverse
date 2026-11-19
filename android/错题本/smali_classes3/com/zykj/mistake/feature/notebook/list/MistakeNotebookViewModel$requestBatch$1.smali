.class final Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;
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
    c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$requestBatch$1"
    f = "MistakeNotebookViewModel.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x2ed
    }
    m = "invokeSuspend"
    n = {
        "error",
        "request"
    }
    s = {
        "L$0",
        "L$2"
    }
.end annotation


# instance fields
.field final synthetic $onSuccess:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field final synthetic $requests:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lr6/c;",
            ">;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/util/List;Lr6/a;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;",
            "Ljava/util/List<",
            "+",
            "Lr6/c;",
            ">;",
            "Lr6/a;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->$requests:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->$onSuccess:Lr6/a;

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
    new-instance p1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->$requests:Ljava/util/List;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->$onSuccess:Lr6/a;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/util/List;Lr6/a;Lh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->L$2:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lr6/c;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->L$1:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ljava/util/Iterator;

    .line 18
    .line 19
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->L$0:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Ljava/lang/Throwable;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Lkotlin/Result;

    .line 27
    .line 28
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 45
    .line 46
    sget-object v1, Lcom/zykj/mistake/feature/notebook/list/w;->a:Lcom/zykj/mistake/feature/notebook/list/w;

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->$requests:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    move-object v1, p1

    .line 58
    move-object p1, v3

    .line 59
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lr6/c;

    .line 70
    .line 71
    iput-object v3, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->L$1:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v3, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->L$2:Ljava/lang/Object;

    .line 76
    .line 77
    iput v2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->label:I

    .line 78
    .line 79
    invoke-static {p1, p0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v0, :cond_3

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_3
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    :cond_4
    if-nez p1, :cond_5

    .line 93
    .line 94
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->$onSuccess:Lr6/a;

    .line 95
    .line 96
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 101
    .line 102
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-nez p1, :cond_6

    .line 109
    .line 110
    const-string p1, ""

    .line 111
    .line 112
    :cond_6
    invoke-direct {v1, p1}, Lcom/zykj/mistake/feature/notebook/list/x;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 116
    .line 117
    .line 118
    :goto_1
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 119
    .line 120
    sget-object v0, Lcom/zykj/mistake/feature/notebook/list/o;->a:Lcom/zykj/mistake/feature/notebook/list/o;

    .line 121
    .line 122
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 123
    .line 124
    .line 125
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 126
    .line 127
    return-object p1
.end method
