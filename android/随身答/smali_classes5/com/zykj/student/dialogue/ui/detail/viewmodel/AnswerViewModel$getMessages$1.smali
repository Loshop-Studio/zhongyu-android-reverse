.class final Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->D(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel"
    f = "AnswerViewModel.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0xd7,
        0xdc
    }
    m = "getMessages"
    n = {
        "selectLast",
        "$i$a$-runCatching-AnswerViewModel$getMessages$2",
        "baseResponse",
        "selectLast",
        "$i$a$-onSuccess-AnswerViewModel$getMessages$3"
    }
    s = {
        "Z$0",
        "I$0",
        "L$1",
        "Z$0",
        "I$0"
    }
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

.field public g:I


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->f:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->e:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->g:I

    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->f:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->D(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
