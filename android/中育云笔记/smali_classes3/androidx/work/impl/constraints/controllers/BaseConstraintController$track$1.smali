.class final Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/constraints/controllers/BaseConstraintController;->track(Landroidx/work/Constraints;)Lvd/c;
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
    c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1"
    f = "ContraintControllers.kt"
    l = {
        0x3f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/work/impl/constraints/controllers/BaseConstraintController;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/work/impl/constraints/controllers/BaseConstraintController<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/work/impl/constraints/controllers/BaseConstraintController;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/impl/constraints/controllers/BaseConstraintController<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;->this$0:Landroidx/work/impl/constraints/controllers/BaseConstraintController;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
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
    new-instance v0, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;->this$0:Landroidx/work/impl/constraints/controllers/BaseConstraintController;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;-><init>(Landroidx/work/impl/constraints/controllers/BaseConstraintController;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lud/j;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;->invoke(Lud/j;Lvc/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;->label:I

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
    iget-object p1, p0, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lud/j;

    .line 30
    .line 31
    new-instance v1, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1$listener$1;

    .line 32
    .line 33
    iget-object v3, p0, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;->this$0:Landroidx/work/impl/constraints/controllers/BaseConstraintController;

    .line 34
    .line 35
    invoke-direct {v1, v3, p1}, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1$listener$1;-><init>(Landroidx/work/impl/constraints/controllers/BaseConstraintController;Lud/j;)V

    .line 36
    .line 37
    .line 38
    iget-object v3, p0, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;->this$0:Landroidx/work/impl/constraints/controllers/BaseConstraintController;

    .line 39
    .line 40
    invoke-static {v3}, Landroidx/work/impl/constraints/controllers/BaseConstraintController;->access$getTracker$p(Landroidx/work/impl/constraints/controllers/BaseConstraintController;)Landroidx/work/impl/constraints/trackers/ConstraintTracker;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3, v1}, Landroidx/work/impl/constraints/trackers/ConstraintTracker;->addListener(Landroidx/work/impl/constraints/ConstraintListener;)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1$1;

    .line 48
    .line 49
    iget-object v4, p0, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;->this$0:Landroidx/work/impl/constraints/controllers/BaseConstraintController;

    .line 50
    .line 51
    invoke-direct {v3, v4, v1}, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1$1;-><init>(Landroidx/work/impl/constraints/controllers/BaseConstraintController;Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1$listener$1;)V

    .line 52
    .line 53
    .line 54
    iput v2, p0, Landroidx/work/impl/constraints/controllers/BaseConstraintController$track$1;->label:I

    .line 55
    .line 56
    invoke-static {p1, v3, p0}, Lkotlinx/coroutines/channels/ProduceKt;->a(Lud/j;Lhd/a;Lvc/c;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v0, :cond_2

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 64
    .line 65
    return-object p1
.end method
