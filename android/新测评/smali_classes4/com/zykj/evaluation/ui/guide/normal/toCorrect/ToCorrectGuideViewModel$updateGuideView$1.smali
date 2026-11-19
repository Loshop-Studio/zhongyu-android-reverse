.class final Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->Y(Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.ui.guide.normal.toCorrect.ToCorrectGuideViewModel"
    f = "ToCorrectGuideViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x53
    }
    m = "updateGuideView"
    n = {
        "guideTaskInfo"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;

.field public d:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;->c:Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;->b:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;->d:I

    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;->c:Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->Y(Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
