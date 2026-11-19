.class final Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->X(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.ui.guide.noStem.NoStemViewModel"
    f = "NoStemViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x144
    }
    m = "loadFailedUuids"
    n = {
        "userId",
        "taskId",
        "state"
    }
    s = {
        "J$0",
        "J$1",
        "I$0"
    }
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

.field public f:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;->e:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;->f:I

    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;->e:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const-wide/16 v1, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->K(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
