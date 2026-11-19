.class final Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->O0(Ljava/util/Set;ILx6/j;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel"
    f = "NormalViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x514
    }
    m = "handleQuestionAnswer"
    n = {
        "changedIdSet",
        "pageQuestionAnswerData",
        "answerInfoMap",
        "questionList",
        "$this$forEach$iv",
        "element$iv",
        "questionAnswerInfo",
        "answerList",
        "$this$forEach$iv",
        "element$iv",
        "answer",
        "oldAnswerInfo",
        "bitmap",
        "resultPath",
        "pageIndex",
        "$i$f$forEach",
        "$i$a$-forEach-NormalViewModel$handleQuestionAnswer$2",
        "$i$f$forEach",
        "$i$a$-forEach-NormalViewModel$handleQuestionAnswer$2$1"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$6",
        "L$7",
        "L$8",
        "L$9",
        "L$11",
        "L$12",
        "L$13",
        "L$14",
        "L$15",
        "I$0",
        "I$1",
        "I$2",
        "I$3",
        "I$4"
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

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

.field public x:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->w:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->v:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->x:I

    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->w:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->l0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Ljava/util/Set;ILx6/j;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
