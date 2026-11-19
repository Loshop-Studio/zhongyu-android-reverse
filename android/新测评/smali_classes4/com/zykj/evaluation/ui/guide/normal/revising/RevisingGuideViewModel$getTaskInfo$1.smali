.class final Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;->S(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.ui.guide.normal.revising.RevisingGuideViewModel"
    f = "RevisingGuideViewModel.kt"
    i = {}
    l = {
        0x27
    }
    m = "getTaskInfo"
    n = {}
    s = {}
.end annotation


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;

.field public c:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;->b:Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;->a:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;->c:I

    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;->b:Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;

    invoke-virtual {p1, p0}, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;->S(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
