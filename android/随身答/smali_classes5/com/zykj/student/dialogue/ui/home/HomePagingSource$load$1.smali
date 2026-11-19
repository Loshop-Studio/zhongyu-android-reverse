.class final Lcom/zykj/student/dialogue/ui/home/HomePagingSource$load$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomePagingSource;->load(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.student.dialogue.ui.home.HomePagingSource"
    f = "HomePagerViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x9b
    }
    m = "load"
    n = {
        "params",
        "page",
        "pageSize"
    }
    s = {
        "L$0",
        "I$0",
        "I$1"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/zykj/student/dialogue/ui/home/HomePagingSource;

.field public f:I


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomePagingSource;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagingSource$load$1;->e:Lcom/zykj/student/dialogue/ui/home/HomePagingSource;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagingSource$load$1;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagingSource$load$1;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagingSource$load$1;->f:I

    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagingSource$load$1;->e:Lcom/zykj/student/dialogue/ui/home/HomePagingSource;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/student/dialogue/ui/home/HomePagingSource;->load(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
