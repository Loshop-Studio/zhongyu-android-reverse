.class final Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;->load(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.paging.SimplePagerKt$simplePager$1$1"
    f = "SimplePager.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x1c,
        0x23
    }
    m = "load"
    n = {
        "params",
        "page",
        "$i$a$-runCatching-SimplePagerKt$simplePager$1$1$load$result$1",
        "params",
        "result",
        "$this$map$iv",
        "$this$mapTo$iv$iv",
        "destination$iv$iv",
        "item$iv$iv",
        "it",
        "page",
        "$i$f$map",
        "$i$f$mapTo",
        "$i$a$-map-SimplePagerKt$simplePager$1$1$load$2"
    }
    s = {
        "L$0",
        "I$0",
        "I$1",
        "L$0",
        "L$1",
        "L$2",
        "L$4",
        "L$5",
        "L$7",
        "L$8",
        "I$0",
        "I$1",
        "I$2",
        "I$3"
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

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;

.field public q:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->p:Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->o:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->q:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->q:I

    iget-object p1, p0, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->p:Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;->load(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
