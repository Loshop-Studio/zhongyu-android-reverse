.class final Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/repository/ExerciseRepository;->l(JILjava/lang/String;ZLjava/lang/String;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.repository.ExerciseRepository"
    f = "ExerciseRepository.kt"
    l = {
        0x2f
    }
    m = "updateAnswerMicroResult"
.end annotation


# instance fields
.field public a:J

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Z

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcom/zykj/study/repository/ExerciseRepository;

.field public h:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/repository/ExerciseRepository;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->g:Lcom/zykj/study/repository/ExerciseRepository;

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
    .locals 8

    iput-object p1, p0, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->f:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->h:I

    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->g:Lcom/zykj/study/repository/ExerciseRepository;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v7, p0

    invoke-virtual/range {v0 .. v7}, Lcom/zykj/study/repository/ExerciseRepository;->l(JILjava/lang/String;ZLjava/lang/String;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
