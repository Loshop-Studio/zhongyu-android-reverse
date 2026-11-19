.class public final Lkotlinx/coroutines/flow/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/f;

.field public final synthetic b:Lkotlinx/coroutines/flow/f;

.field public final synthetic c:Lr6/f;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/m0;Lkotlinx/coroutines/flow/m0;Lr6/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/v;->a:Lkotlinx/coroutines/flow/f;

    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/flow/v;->b:Lkotlinx/coroutines/flow/f;

    .line 7
    .line 8
    iput-object p3, p0, Lkotlinx/coroutines/flow/v;->c:Lr6/f;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final collect(Lkotlinx/coroutines/flow/g;Lh6/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lkotlinx/coroutines/flow/v;->a:Lkotlinx/coroutines/flow/f;

    .line 6
    .line 7
    aput-object v2, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iget-object v2, p0, Lkotlinx/coroutines/flow/v;->b:Lkotlinx/coroutines/flow/f;

    .line 11
    .line 12
    aput-object v2, v0, v1

    .line 13
    .line 14
    new-instance v1, Lkotlinx/coroutines/flow/FlowKt__ZipKt$combine$1$1;

    .line 15
    .line 16
    iget-object v2, p0, Lkotlinx/coroutines/flow/v;->c:Lr6/f;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v1, v2, v3}, Lkotlinx/coroutines/flow/FlowKt__ZipKt$combine$1$1;-><init>(Lr6/f;Lh6/c;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0, v1, p2}, Lkotlinx/coroutines/flow/internal/b;->a(Lkotlinx/coroutines/flow/g;[Lkotlinx/coroutines/flow/f;Lr6/f;Lh6/c;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object p2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    if-ne p1, p2, :cond_0

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 32
    .line 33
    return-object p1
.end method
