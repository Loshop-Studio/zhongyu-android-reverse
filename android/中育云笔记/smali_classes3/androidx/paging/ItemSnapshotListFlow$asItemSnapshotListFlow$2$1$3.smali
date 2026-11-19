.class final Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lvd/d;"
    }
.end annotation


# instance fields
.field final synthetic $$this$channelFlow:Lud/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lud/j;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lud/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud/j;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$3;->$$this$channelFlow:Lud/j;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final emit(Landroidx/paging/PageStore;Lvc/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageStore<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$3;->$$this$channelFlow:Lud/j;

    invoke-virtual {p1}, Landroidx/paging/PageStore;->snapshot()Landroidx/paging/ItemSnapshotList;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/channels/f;->send(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/paging/PageStore;

    invoke-virtual {p0, p1, p2}, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$3;->emit(Landroidx/paging/PageStore;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
