.class final Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/constraints/NetworkRequestConstraintController;->track(Landroidx/work/Constraints;)Lvd/c;
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
    c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1"
    f = "WorkConstraintsTracker.kt"
    l = {
        0xb2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $constraints:Landroidx/work/Constraints;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/work/impl/constraints/NetworkRequestConstraintController;


# direct methods
.method public constructor <init>(Landroidx/work/Constraints;Landroidx/work/impl/constraints/NetworkRequestConstraintController;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/Constraints;",
            "Landroidx/work/impl/constraints/NetworkRequestConstraintController;",
            "Lvc/c<",
            "-",
            "Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->$constraints:Landroidx/work/Constraints;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->this$0:Landroidx/work/impl/constraints/NetworkRequestConstraintController;

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
    .locals 3
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
    new-instance v0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->$constraints:Landroidx/work/Constraints;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->this$0:Landroidx/work/impl/constraints/NetworkRequestConstraintController;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;-><init>(Landroidx/work/Constraints;Landroidx/work/impl/constraints/NetworkRequestConstraintController;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lud/j;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->invoke(Lud/j;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lud/j;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud/j;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->label:I

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
    goto :goto_1

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
    iget-object p1, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v3, p1

    .line 30
    check-cast v3, Lud/j;

    .line 31
    .line 32
    iget-object p1, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->$constraints:Landroidx/work/Constraints;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/work/Constraints;->getRequiredNetworkRequest()Landroid/net/NetworkRequest;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v1, 0x0

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    invoke-interface {v3}, Lud/j;->getChannel()Lkotlinx/coroutines/channels/f;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1, v1, v2, v1}, Lkotlinx/coroutines/channels/f$a;->a(Lkotlinx/coroutines/channels/f;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_2
    new-instance v6, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;

    .line 52
    .line 53
    iget-object v4, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->this$0:Landroidx/work/impl/constraints/NetworkRequestConstraintController;

    .line 54
    .line 55
    invoke-direct {v6, v4, v3, v1}, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$timeoutJob$1;-><init>(Landroidx/work/impl/constraints/NetworkRequestConstraintController;Lud/j;Lvc/c;)V

    .line 56
    .line 57
    .line 58
    const/4 v7, 0x3

    .line 59
    const/4 v8, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v4, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$onConstraintState$1;

    .line 67
    .line 68
    invoke-direct {v4, v1, v3}, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$onConstraintState$1;-><init>(Lkotlinx/coroutines/g;Lud/j;)V

    .line 69
    .line 70
    .line 71
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v5, 0x1e

    .line 74
    .line 75
    if-lt v1, v5, :cond_3

    .line 76
    .line 77
    sget-object v1, Landroidx/work/impl/constraints/SharedNetworkCallback;->INSTANCE:Landroidx/work/impl/constraints/SharedNetworkCallback;

    .line 78
    .line 79
    iget-object v5, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->this$0:Landroidx/work/impl/constraints/NetworkRequestConstraintController;

    .line 80
    .line 81
    invoke-static {v5}, Landroidx/work/impl/constraints/NetworkRequestConstraintController;->access$getConnManager$p(Landroidx/work/impl/constraints/NetworkRequestConstraintController;)Landroid/net/ConnectivityManager;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v1, v5, p1, v4}, Landroidx/work/impl/constraints/SharedNetworkCallback;->addCallback(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lhd/l;)Lhd/a;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    goto :goto_0

    .line 90
    :cond_3
    sget-object v1, Landroidx/work/impl/constraints/IndividualNetworkCallback;->Companion:Landroidx/work/impl/constraints/IndividualNetworkCallback$Companion;

    .line 91
    .line 92
    iget-object v5, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->this$0:Landroidx/work/impl/constraints/NetworkRequestConstraintController;

    .line 93
    .line 94
    invoke-static {v5}, Landroidx/work/impl/constraints/NetworkRequestConstraintController;->access$getConnManager$p(Landroidx/work/impl/constraints/NetworkRequestConstraintController;)Landroid/net/ConnectivityManager;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {v1, v5, p1, v4}, Landroidx/work/impl/constraints/IndividualNetworkCallback$Companion;->addCallback(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lhd/l;)Lhd/a;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    :goto_0
    new-instance v1, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$1;

    .line 103
    .line 104
    invoke-direct {v1, p1}, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$1;-><init>(Lhd/a;)V

    .line 105
    .line 106
    .line 107
    iput v2, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->label:I

    .line 108
    .line 109
    invoke-static {v3, v1, p0}, Lkotlinx/coroutines/channels/ProduceKt;->a(Lud/j;Lhd/a;Lvc/c;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p1, v0, :cond_4

    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_4
    :goto_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 117
    .line 118
    return-object p1
.end method
