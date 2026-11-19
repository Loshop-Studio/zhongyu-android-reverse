.class public final synthetic Ld7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/g0;


# instance fields
.field public final synthetic a:Ld7/d;

.field public final synthetic b:Lkotlinx/coroutines/q1;


# direct methods
.method public synthetic constructor <init>(Ld7/d;Lkotlinx/coroutines/q1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/c;->a:Ld7/d;

    iput-object p2, p0, Ld7/c;->b:Lkotlinx/coroutines/q1;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Ld7/c;->b:Lkotlinx/coroutines/q1;

    .line 2
    .line 3
    iget-object v1, p0, Ld7/c;->a:Ld7/d;

    .line 4
    .line 5
    iget-object v1, v1, Ld7/d;->a:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
