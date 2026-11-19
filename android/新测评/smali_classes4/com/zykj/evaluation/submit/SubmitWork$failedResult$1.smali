.class final Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/submit/SubmitWork;->i(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.evaluation.submit.SubmitWork"
    f = "SubmitWork.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3
    }
    l = {
        0xaf,
        0xb6,
        0xc0,
        0xc5
    }
    m = "failedResult"
    n = {
        "key",
        "extra",
        "key",
        "extra",
        "key",
        "extra",
        "key",
        "extra"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/evaluation/submit/SubmitWork;

.field public e:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/submit/SubmitWork;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->d:Lcom/zykj/evaluation/submit/SubmitWork;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->c:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->e:I

    iget-object p1, p0, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->d:Lcom/zykj/evaluation/submit/SubmitWork;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/zykj/evaluation/submit/SubmitWork;->b(Lcom/zykj/evaluation/submit/SubmitWork;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
