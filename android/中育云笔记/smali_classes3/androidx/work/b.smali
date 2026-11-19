.class public final synthetic Landroidx/work/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;


# instance fields
.field public final synthetic a:Lkotlin/coroutines/d;

.field public final synthetic b:Lkotlinx/coroutines/CoroutineStart;

.field public final synthetic c:Lhd/p;


# direct methods
.method public synthetic constructor <init>(Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/b;->a:Lkotlin/coroutines/d;

    iput-object p2, p0, Landroidx/work/b;->b:Lkotlinx/coroutines/CoroutineStart;

    iput-object p3, p0, Landroidx/work/b;->c:Lhd/p;

    return-void
.end method


# virtual methods
.method public final attachCompleter(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/b;->a:Lkotlin/coroutines/d;

    iget-object v1, p0, Landroidx/work/b;->b:Lkotlinx/coroutines/CoroutineStart;

    iget-object v2, p0, Landroidx/work/b;->c:Lhd/p;

    invoke-static {v0, v1, v2, p1}, Landroidx/work/ListenableFutureKt;->b(Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
