.class final Landroidx/paging/SingleRunner$runInIsolation$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/SingleRunner;->runInIsolation(ILhd/l;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.paging.SingleRunner"
    f = "SingleRunner.kt"
    l = {
        0x2b
    }
    m = "runInIsolation"
    v = 0x1
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/paging/SingleRunner;


# direct methods
.method public constructor <init>(Landroidx/paging/SingleRunner;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/SingleRunner;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/SingleRunner$runInIsolation$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/SingleRunner$runInIsolation$1;->this$0:Landroidx/paging/SingleRunner;

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
    .locals 2

    iput-object p1, p0, Landroidx/paging/SingleRunner$runInIsolation$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/paging/SingleRunner$runInIsolation$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/paging/SingleRunner$runInIsolation$1;->label:I

    iget-object p1, p0, Landroidx/paging/SingleRunner$runInIsolation$1;->this$0:Landroidx/paging/SingleRunner;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p0}, Landroidx/paging/SingleRunner;->runInIsolation(ILhd/l;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
