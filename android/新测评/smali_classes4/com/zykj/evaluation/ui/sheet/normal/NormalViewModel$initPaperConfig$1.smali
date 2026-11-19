.class final Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->W0(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x10a,
        0x10d
    }
    m = "initPaperConfig"
    n = {
        "address",
        "localConfigPath",
        "testPaperId",
        "$i$a$-ifEmpty-NormalViewModel$initPaperConfig$2",
        "$i$a$-runCatching-NormalViewModel$initPaperConfig$2$1",
        "address",
        "localConfigPath",
        "testPaperId",
        "$i$a$-ifEmpty-NormalViewModel$initPaperConfig$2"
    }
    s = {
        "L$0",
        "L$1",
        "J$0",
        "I$0",
        "I$1",
        "L$0",
        "L$1",
        "J$0",
        "I$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:J

.field public e:I

.field public f:I

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

.field public i:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->h:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->g:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->i:I

    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->h:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2, p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->q0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
