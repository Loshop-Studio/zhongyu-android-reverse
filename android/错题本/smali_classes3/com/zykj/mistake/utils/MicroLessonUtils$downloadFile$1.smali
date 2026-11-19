.class final Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;
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
    c = "com.zykj.mistake.utils.MicroLessonUtils$downloadFile$1"
    f = "MicroLessonUtils.kt"
    i = {
        0x0
    }
    l = {
        0x7f
    }
    m = "invokeSuspend"
    n = {
        "$this$launch"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $failCallback:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field final synthetic $successCallback:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field final synthetic $url:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/utils/h;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/mistake/utils/h;Lr6/a;Lr6/a;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/zykj/mistake/utils/h;",
            "Lr6/a;",
            "Lr6/a;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->$url:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->this$0:Lcom/zykj/mistake/utils/h;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->$successCallback:Lr6/a;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->$failCallback:Lr6/a;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 11
    .line 12
    .line 13
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
    new-instance v0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->$url:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->this$0:Lcom/zykj/mistake/utils/h;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->$successCallback:Lr6/a;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->$failCallback:Lr6/a;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;-><init>(Ljava/lang/String;Lcom/zykj/mistake/utils/h;Lr6/a;Lr6/a;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/v;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v2, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->label:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v4, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    check-cast p1, Lkotlin/Result;

    .line 19
    .line 20
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->$url:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v2, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->this$0:Lcom/zykj/mistake/utils/h;

    .line 39
    .line 40
    iget-object v2, v2, Lcom/zykj/mistake/utils/h;->a:Ljava/lang/String;

    .line 41
    .line 42
    new-instance v5, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1$result$1;

    .line 43
    .line 44
    invoke-direct {v5, v3}, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1$result$1;-><init>(Lh6/c;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    iput v4, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->label:I

    .line 50
    .line 51
    sget-object v0, Lcom/zykj/mistake/utils/j;->a:Lcom/zykj/mistake/utils/j;

    .line 52
    .line 53
    invoke-virtual {v0, p1, v2, v5, p0}, Lcom/zykj/mistake/utils/j;->a(Ljava/lang/String;Ljava/lang/String;Lr6/f;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v1, :cond_2

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_2
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move-object v3, p1

    .line 68
    :goto_1
    check-cast v3, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v3, :cond_5

    .line 71
    .line 72
    iget-object p1, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->this$0:Lcom/zykj/mistake/utils/h;

    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->$successCallback:Lr6/a;

    .line 75
    .line 76
    iget-object v1, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->$failCallback:Lr6/a;

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/zykj/mistake/utils/h;->c()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/zykj/mistake/utils/h;->e()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    iget-object p1, p0, Lcom/zykj/mistake/utils/MicroLessonUtils$downloadFile$1;->$failCallback:Lr6/a;

    .line 96
    .line 97
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    :goto_2
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 101
    .line 102
    return-object p1
.end method
