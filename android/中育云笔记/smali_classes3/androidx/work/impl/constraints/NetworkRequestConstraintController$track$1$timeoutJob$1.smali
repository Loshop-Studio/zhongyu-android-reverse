.class final Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


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
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1"
    f = "WorkConstraintsTracker.kt"
    l = {
        0x95
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $$this$callbackFlow:Lud/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lud/j;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Landroidx/work/impl/constraints/NetworkRequestConstraintController;


# direct methods
.method public constructor <init>(Landroidx/work/impl/constraints/NetworkRequestConstraintController;Lud/j;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/impl/constraints/NetworkRequestConstraintController;",
            "Lud/j;",
            "Lvc/c<",
            "-",
            "Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;->this$0:Landroidx/work/impl/constraints/NetworkRequestConstraintController;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;->$$this$callbackFlow:Lud/j;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;->this$0:Landroidx/work/impl/constraints/NetworkRequestConstraintController;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;->$$this$callbackFlow:Lud/j;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;-><init>(Landroidx/work/impl/constraints/NetworkRequestConstraintController;Lud/j;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;->this$0:Landroidx/work/impl/constraints/NetworkRequestConstraintController;

    .line 28
    .line 29
    invoke-static {p1}, Landroidx/work/impl/constraints/NetworkRequestConstraintController;->access$getTimeoutMs$p(Landroidx/work/impl/constraints/NetworkRequestConstraintController;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    iput v2, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;->label:I

    .line 34
    .line 35
    invoke-static {v3, v4, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {}, Landroidx/work/impl/constraints/WorkConstraintsTrackerKt;->access$getTAG$p()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v2, "NetworkRequestConstraintController didn\'t receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after "

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;->this$0:Landroidx/work/impl/constraints/NetworkRequestConstraintController;

    .line 61
    .line 62
    invoke-static {v2}, Landroidx/work/impl/constraints/NetworkRequestConstraintController;->access$getTimeoutMs$p(Landroidx/work/impl/constraints/NetworkRequestConstraintController;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v2, " ms"

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {p1, v0, v1}, Landroidx/work/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;->$$this$callbackFlow:Lud/j;

    .line 82
    .line 83
    new-instance v0, Landroidx/work/impl/constraints/ConstraintsState$ConstraintsNotMet;

    .line 84
    .line 85
    const/4 v1, 0x7

    .line 86
    invoke-direct {v0, v1}, Landroidx/work/impl/constraints/ConstraintsState$ConstraintsNotMet;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-interface {p1, v0}, Lkotlinx/coroutines/channels/f;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 93
    .line 94
    return-object p1
.end method
