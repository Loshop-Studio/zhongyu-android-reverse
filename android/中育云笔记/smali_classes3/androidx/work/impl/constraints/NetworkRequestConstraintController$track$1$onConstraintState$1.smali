.class final Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$onConstraintState$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $$this$callbackFlow:Lud/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lud/j;"
        }
    .end annotation
.end field

.field final synthetic $timeoutJob:Lkotlinx/coroutines/g;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/g;Lud/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/g;",
            "Lud/j;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$onConstraintState$1;->$timeoutJob:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$onConstraintState$1;->$$this$callbackFlow:Lud/j;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/work/impl/constraints/ConstraintsState;

    invoke-virtual {p0, p1}, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$onConstraintState$1;->invoke(Landroidx/work/impl/constraints/ConstraintsState;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/work/impl/constraints/ConstraintsState;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$onConstraintState$1;->$timeoutJob:Lkotlinx/coroutines/g;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 3
    iget-object v0, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$onConstraintState$1;->$$this$callbackFlow:Lud/j;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/f;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
