.class public interface abstract Lkotlinx/coroutines/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/d$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/g$a;,
        Lkotlinx/coroutines/g$b;
    }
.end annotation


# static fields
.field public static final b0:Lkotlinx/coroutines/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lkotlinx/coroutines/g$b;->c:Lkotlinx/coroutines/g$b;

    sput-object v0, Lkotlinx/coroutines/g;->b0:Lkotlinx/coroutines/g$b;

    return-void
.end method


# virtual methods
.method public abstract A(Lhd/l;)Lsd/t0;
.end method

.method public abstract cancel(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract f()Lpd/g;
.end method

.method public abstract g()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract isActive()Z
.end method

.method public abstract isCancelled()Z
.end method

.method public abstract isCompleted()Z
.end method

.method public abstract start()Z
.end method

.method public abstract t(ZZLhd/l;)Lsd/t0;
.end method

.method public abstract v(Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract y(Lsd/r;)Lsd/p;
.end method
