.class public final Lkotlinx/coroutines/flow/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkotlinx/coroutines/flow/i;->a:I

    iput-object p1, p0, Lkotlinx/coroutines/flow/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(Lkotlinx/coroutines/flow/g;Lh6/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lkotlinx/coroutines/flow/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 7
    .line 8
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lkotlinx/coroutines/flow/i;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lkotlinx/coroutines/flow/f;

    .line 14
    .line 15
    new-instance v2, Lkotlinx/coroutines/flow/k;

    .line 16
    .line 17
    invoke-direct {v2, v0, p1}, Lkotlinx/coroutines/flow/k;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lkotlinx/coroutines/flow/g;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, v2, p2}, Lkotlinx/coroutines/flow/f;->collect(Lkotlinx/coroutines/flow/g;Lh6/c;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object p2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 25
    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 30
    .line 31
    :goto_0
    return-object p1

    .line 32
    :pswitch_0
    iget-object v0, p0, Lkotlinx/coroutines/flow/i;->b:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-interface {p1, v0, p2}, Lkotlinx/coroutines/flow/g;->emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object p2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 39
    .line 40
    if-ne p1, p2, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 44
    .line 45
    :goto_1
    return-object p1

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
