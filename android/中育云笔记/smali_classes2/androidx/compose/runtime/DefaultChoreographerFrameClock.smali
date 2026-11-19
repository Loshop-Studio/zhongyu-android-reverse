.class final Landroidx/compose/runtime/DefaultChoreographerFrameClock;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/MonotonicFrameClock;


# static fields
.field public static final INSTANCE:Landroidx/compose/runtime/DefaultChoreographerFrameClock;

.field private static final choreographer:Landroid/view/Choreographer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/runtime/DefaultChoreographerFrameClock;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/runtime/DefaultChoreographerFrameClock;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/runtime/DefaultChoreographerFrameClock;->INSTANCE:Landroidx/compose/runtime/DefaultChoreographerFrameClock;

    .line 7
    .line 8
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lsd/t1;->i()Lsd/t1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Landroidx/compose/runtime/DefaultChoreographerFrameClock$choreographer$1;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, v2}, Landroidx/compose/runtime/DefaultChoreographerFrameClock$choreographer$1;-><init>(Lvc/c;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lsd/f;->e(Lkotlin/coroutines/d;Lhd/p;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/view/Choreographer;

    .line 27
    .line 28
    sput-object v0, Landroidx/compose/runtime/DefaultChoreographerFrameClock;->choreographer:Landroid/view/Choreographer;

    .line 29
    .line 30
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getChoreographer$p()Landroid/view/Choreographer;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/runtime/DefaultChoreographerFrameClock;->choreographer:Landroid/view/Choreographer;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public fold(Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lhd/p;",
            ")TR;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/MonotonicFrameClock$DefaultImpls;->fold(Landroidx/compose/runtime/MonotonicFrameClock;Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lkotlin/coroutines/d$b;",
            ">(",
            "Lkotlin/coroutines/d$c;",
            ")TE;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/runtime/MonotonicFrameClock$DefaultImpls;->get(Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public minusKey(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d$c;",
            ")",
            "Lkotlin/coroutines/d;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/runtime/MonotonicFrameClock$DefaultImpls;->minusKey(Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public plus(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/runtime/MonotonicFrameClock$DefaultImpls;->plus(Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public withFrameNanos(Lhd/l;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/l;",
            "Lvc/c<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlinx/coroutines/c;

    .line 2
    .line 3
    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/c;-><init>(Lvc/c;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->F()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1;

    .line 15
    .line 16
    invoke-direct {v1, v0, p1}, Landroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1;-><init>(Lsd/j;Lhd/l;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Landroidx/compose/runtime/DefaultChoreographerFrameClock;->access$getChoreographer$p()Landroid/view/Choreographer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Landroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$1;

    .line 27
    .line 28
    invoke-direct {p1, v1}, Landroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$1;-><init>(Landroid/view/Choreographer$FrameCallback;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, p1}, Lsd/j;->u(Lhd/l;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->x()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-ne p1, v0, :cond_0

    .line 43
    .line 44
    invoke-static {p2}, Lxc/f;->c(Lvc/c;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-object p1
.end method
