.class public final Lkotlinx/coroutines/flow/internal/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/g;


# instance fields
.field public final a:Lkotlinx/coroutines/channels/p;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/internal/o;->a:Lkotlinx/coroutines/channels/p;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/flow/internal/o;->a:Lkotlinx/coroutines/channels/p;

    .line 2
    .line 3
    invoke-interface {v0, p2, p1}, Lkotlinx/coroutines/channels/p;->q(Lh6/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 13
    .line 14
    return-object p1
.end method
