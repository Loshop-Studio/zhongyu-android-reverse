.class final Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/PageFetcherSnapshot;->doInitialLoad(Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.paging.PageFetcherSnapshot"
    f = "PageFetcherSnapshot.kt"
    l = {
        0x2b6,
        0x12e,
        0x134,
        0x2cc,
        0x2e2,
        0x14f,
        0x2f8,
        0x30e,
        0x16b
    }
    m = "doInitialLoad"
    v = 0x1
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/paging/PageFetcherSnapshot;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PageFetcherSnapshot<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/PageFetcherSnapshot;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageFetcherSnapshot<",
            "TKey;TValue;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->this$0:Landroidx/paging/PageFetcherSnapshot;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->this$0:Landroidx/paging/PageFetcherSnapshot;

    invoke-static {p1, p0}, Landroidx/paging/PageFetcherSnapshot;->access$doInitialLoad(Landroidx/paging/PageFetcherSnapshot;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
