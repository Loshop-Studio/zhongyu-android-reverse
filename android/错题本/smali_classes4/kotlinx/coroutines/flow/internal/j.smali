.class public final Lkotlinx/coroutines/flow/internal/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh6/h;


# instance fields
.field public final synthetic a:Lh6/h;

.field public final b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lh6/h;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/internal/j;->a:Lh6/h;

    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/flow/internal/j;->b:Ljava/lang/Throwable;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/flow/internal/j;->a:Lh6/h;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lh6/h;->fold(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final get(Lh6/g;)Lh6/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/flow/internal/j;->a:Lh6/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lh6/h;->get(Lh6/g;)Lh6/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final minusKey(Lh6/g;)Lh6/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/flow/internal/j;->a:Lh6/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lh6/h;->minusKey(Lh6/g;)Lh6/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final plus(Lh6/h;)Lh6/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/flow/internal/j;->a:Lh6/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lh6/h;->plus(Lh6/h;)Lh6/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
