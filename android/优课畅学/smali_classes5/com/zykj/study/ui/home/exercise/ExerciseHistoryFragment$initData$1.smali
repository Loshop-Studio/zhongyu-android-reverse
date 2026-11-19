.class final Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->B(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.exercise.ExerciseHistoryFragment"
    f = "ExerciseHistoryFragment.kt"
    l = {
        0x30,
        0x39
    }
    m = "initData$suspendImpl"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

.field public d:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->c:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

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
    .locals 1

    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->b:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->d:I

    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->c:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    invoke-static {p1, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->B(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
