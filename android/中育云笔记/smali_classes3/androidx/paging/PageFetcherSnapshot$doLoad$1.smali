.class final Landroidx/paging/PageFetcherSnapshot$doLoad$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/PageFetcherSnapshot;->doLoad(Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.paging.PageFetcherSnapshot"
    f = "PageFetcherSnapshot.kt"
    l = {
        0x2b7,
        0x2c3,
        0x1a8,
        0x1b1,
        0x2d9,
        0x303,
        0x1e6,
        0x319,
        0x1fe,
        0x218,
        0x325
    }
    m = "doLoad"
    v = 0x1
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

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
            "Landroidx/paging/PageFetcherSnapshot$doLoad$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->this$0:Landroidx/paging/PageFetcherSnapshot;

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

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->this$0:Landroidx/paging/PageFetcherSnapshot;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Landroidx/paging/PageFetcherSnapshot;->access$doLoad(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
