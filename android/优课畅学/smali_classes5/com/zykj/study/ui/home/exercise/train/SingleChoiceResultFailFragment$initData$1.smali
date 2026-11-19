.class final Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->initData(Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.exercise.train.SingleChoiceResultFailFragment"
    f = "SingleChoiceResultFailFragment.kt"
    l = {
        0x28
    }
    m = "initData"
.end annotation


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;

.field public c:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;->b:Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;

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

    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;->a:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;->c:I

    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$initData$1;->b:Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;

    invoke-virtual {p1, p0}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->initData(Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
