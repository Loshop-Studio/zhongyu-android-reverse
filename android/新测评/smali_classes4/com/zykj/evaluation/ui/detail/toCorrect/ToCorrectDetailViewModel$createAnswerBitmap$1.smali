.class final Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->P0(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel"
    f = "ToCorrectDetailViewModel.kt"
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
        0x0
    }
    l = {
        0x31d
    }
    m = "createAnswerBitmap"
    n = {
        "uuid",
        "question",
        "answer",
        "comment",
        "imageLoader",
        "$this$mapNotNull$iv",
        "$this$mapNotNullTo$iv$iv",
        "destination$iv$iv",
        "$this$forEach$iv$iv$iv",
        "element$iv$iv$iv",
        "element$iv$iv",
        "url",
        "$i$f$mapNotNull",
        "$i$f$mapNotNullTo",
        "$i$f$forEach",
        "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv",
        "$i$a$-mapNotNull-ToCorrectDetailViewModel$createAnswerBitmap$3",
        "isComment"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "L$10",
        "L$11",
        "L$12",
        "I$0",
        "I$1",
        "I$2",
        "I$3",
        "I$4",
        "Z$0"
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

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:Z

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

.field public v:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->u:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->t:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->v:I

    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->u:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->P0(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
