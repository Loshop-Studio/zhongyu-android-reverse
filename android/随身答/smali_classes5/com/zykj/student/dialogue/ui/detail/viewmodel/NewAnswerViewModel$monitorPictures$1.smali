.class final Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->t(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel"
    f = "NewAnswerViewModel.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xac
    }
    m = "monitorPictures"
    n = {
        "imageUrls",
        "$i$a$-runCatching-NewAnswerViewModel$monitorPictures$2"
    }
    s = {
        "L$0",
        "I$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

.field public e:I


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;->d:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;->c:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;->e:I

    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;->d:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->t(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
