.class final Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->J0(Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.ui.detail.todo.TodoDetailViewModel"
    f = "TodoDetailViewModel.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4
    }
    l = {
        0x196,
        0x1a1,
        0x1ac,
        0x1dd,
        0x215
    }
    m = "commitAnswer"
    n = {
        "draftFunctions",
        "draftFunctions",
        "questionUpload",
        "draftUploadData",
        "draftFunctions",
        "questionUpload",
        "draftUploadData",
        "it",
        "$i$a$-let-TodoDetailViewModel$commitAnswer$3",
        "draftFunctions",
        "questionUpload",
        "draftUploadData",
        "uploadQuestion",
        "requestList",
        "hasSyncedAnswer",
        "isUntouchedSyncedPage",
        "$i$a$-let-TodoDetailViewModel$commitAnswer$5",
        "draftFunctions",
        "questionUpload",
        "draftUploadData",
        "answerMap",
        "localAnswerUploadDataList",
        "answerUploadDataList",
        "requestList",
        "hasSyncedAnswer",
        "isUntouchedSyncedPage"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "I$0",
        "I$1",
        "I$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "I$0",
        "I$1"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:I

.field public i:I

.field public j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

.field public m:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->l:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->k:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->m:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->m:I

    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->l:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->B0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
