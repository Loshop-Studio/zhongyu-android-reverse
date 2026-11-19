.class public final Lkotlinx/coroutines/flow/DistinctFlowImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/c;


# instance fields
.field public final c:Lvd/c;

.field public final d:Lhd/l;

.field public final e:Lhd/p;


# direct methods
.method public constructor <init>(Lvd/c;Lhd/l;Lhd/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/DistinctFlowImpl;->c:Lvd/c;

    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/flow/DistinctFlowImpl;->d:Lhd/l;

    .line 7
    .line 8
    iput-object p3, p0, Lkotlinx/coroutines/flow/DistinctFlowImpl;->e:Lhd/p;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public collect(Lvd/d;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lwd/l;->a:Lxd/c0;

    .line 7
    .line 8
    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v1, p0, Lkotlinx/coroutines/flow/DistinctFlowImpl;->c:Lvd/c;

    .line 11
    .line 12
    new-instance v2, Lkotlinx/coroutines/flow/DistinctFlowImpl$collect$2;

    .line 13
    .line 14
    invoke-direct {v2, p0, v0, p1}, Lkotlinx/coroutines/flow/DistinctFlowImpl$collect$2;-><init>(Lkotlinx/coroutines/flow/DistinctFlowImpl;Lkotlin/jvm/internal/Ref$ObjectRef;Lvd/d;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v2, p2}, Lvd/c;->collect(Lvd/d;Lvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-ne p1, p2, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p1
.end method
