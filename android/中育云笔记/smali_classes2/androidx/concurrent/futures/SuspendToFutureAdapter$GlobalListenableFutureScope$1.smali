.class public final Landroidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsd/i0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/concurrent/futures/SuspendToFutureAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final coroutineContext:Lkotlin/coroutines/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Landroidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1;->coroutineContext:Lkotlin/coroutines/d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getCoroutineContext()Lkotlin/coroutines/d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1;->coroutineContext:Lkotlin/coroutines/d;

    .line 2
    .line 3
    return-object v0
.end method
