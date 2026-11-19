.class public final Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.submit.SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2"
    f = "SubmitNoStemWork.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x32
    }
    m = "emit"
    n = {
        "value",
        "$completion",
        "value",
        "$this$map_u24lambda_u245",
        "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0"
    }
.end annotation


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public b:I

.field public c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->d:Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->a:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->b:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->b:I

    iget-object p1, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1;->d:Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
