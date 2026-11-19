.class public interface abstract Lkotlinx/coroutines/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/d$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/n$a;,
        Lkotlinx/coroutines/n$b;
    }
.end annotation


# static fields
.field public static final c0:Lkotlinx/coroutines/n$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lkotlinx/coroutines/n$b;->a:Lkotlinx/coroutines/n$b;

    sput-object v0, Lkotlinx/coroutines/n;->c0:Lkotlinx/coroutines/n$b;

    return-void
.end method


# virtual methods
.method public abstract cancel(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract d()Lf8/g;
.end method

.method public abstract e()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract getParent()Lkotlinx/coroutines/n;
.end method

.method public abstract isActive()Z
.end method

.method public abstract isCancelled()Z
.end method

.method public abstract k(Lx7/l;)Li8/k0;
.end method

.method public abstract l()Z
.end method

.method public abstract n(Lm7/c;)Ljava/lang/Object;
.end method

.method public abstract p(ZZLx7/l;)Li8/k0;
.end method

.method public abstract s(Li8/q;)Li8/o;
.end method

.method public abstract start()Z
.end method
