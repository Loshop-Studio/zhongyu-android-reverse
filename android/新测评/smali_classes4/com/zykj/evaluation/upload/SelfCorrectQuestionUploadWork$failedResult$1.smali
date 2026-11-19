.class final Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->d(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork"
    f = "SelfCorrectQuestionUploadWork.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xe8
    }
    m = "failedResult"
    n = {
        "key",
        "extras"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;

.field public e:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->d:Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->c:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->e:I

    iget-object p1, p0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->d:Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->b(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
