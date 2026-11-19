.class final Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;->k(ILjava/lang/String;ZLjava/lang/String;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.TrainAnswerMicroViewModel"
    f = "TrainAnswerMicroViewModel.kt"
    l = {
        0x22
    }
    m = "uploadAnswerMicro"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Z

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;

.field public g:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->f:Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lm7/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->e:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->g:I

    iget-object v0, p0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel$uploadAnswerMicro$1;->f:Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;->k(ILjava/lang/String;ZLjava/lang/String;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
