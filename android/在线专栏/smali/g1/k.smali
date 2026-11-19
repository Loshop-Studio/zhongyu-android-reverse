.class public abstract Lg1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field private final a:Landroidx/work/impl/utils/futures/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/work/impl/utils/futures/d<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Landroidx/work/impl/utils/futures/d;->s()Landroidx/work/impl/utils/futures/d;

    move-result-object v0

    iput-object v0, p0, Lg1/k;->a:Landroidx/work/impl/utils/futures/d;

    return-void
.end method

.method public static a(Ly0/i;Lx0/x;)Lg1/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/i;",
            "Lx0/x;",
            ")",
            "Lg1/k<",
            "Ljava/util/List<",
            "Lx0/v;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lg1/k$a;

    invoke-direct {v0, p0, p1}, Lg1/k$a;-><init>(Ly0/i;Lx0/x;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lg1/k;->a:Landroidx/work/impl/utils/futures/d;

    return-object v0
.end method

.method abstract c()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public run()V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lg1/k;->c()Ljava/lang/Object;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lg1/k;->a:Landroidx/work/impl/utils/futures/d;

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/d;->o(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 3
    iget-object v1, p0, Lg1/k;->a:Landroidx/work/impl/utils/futures/d;

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/d;->p(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method
