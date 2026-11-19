.class public Landroidx/work/multiprocess/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/multiprocess/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private final a:Landroidx/work/multiprocess/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/work/multiprocess/c<",
            "TI;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "ListenableCallbackRbl"

    invoke-static {v0}, Lx0/n;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/multiprocess/c$a;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/multiprocess/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/multiprocess/c<",
            "TI;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/work/multiprocess/c$a;->a:Landroidx/work/multiprocess/c;

    return-void
.end method

.method public static a(Landroidx/work/multiprocess/b;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Landroidx/work/multiprocess/b;->u(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 2
    invoke-static {}, Lx0/n;->c()Lx0/n;

    move-result-object p1

    sget-object v0, Landroidx/work/multiprocess/c$a;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Throwable;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "Unable to notify failures in operation"

    invoke-virtual {p1, v0, p0, v1}, Lx0/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static b(Landroidx/work/multiprocess/b;[B)V
    .locals 3

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, Landroidx/work/multiprocess/b;->n([B)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 2
    invoke-static {}, Lx0/n;->c()Lx0/n;

    move-result-object p1

    sget-object v0, Landroidx/work/multiprocess/c$a;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Throwable;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "Unable to notify successful operation"

    invoke-virtual {p1, v0, p0, v1}, Lx0/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/work/multiprocess/c$a;->a:Landroidx/work/multiprocess/c;

    iget-object v0, v0, Landroidx/work/multiprocess/c;->c:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    .line 2
    iget-object v1, p0, Landroidx/work/multiprocess/c$a;->a:Landroidx/work/multiprocess/c;

    iget-object v2, v1, Landroidx/work/multiprocess/c;->b:Landroidx/work/multiprocess/b;

    invoke-virtual {v1, v0}, Landroidx/work/multiprocess/c;->b(Ljava/lang/Object;)[B

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/work/multiprocess/c$a;->b(Landroidx/work/multiprocess/b;[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 3
    iget-object v1, p0, Landroidx/work/multiprocess/c$a;->a:Landroidx/work/multiprocess/c;

    iget-object v1, v1, Landroidx/work/multiprocess/c;->b:Landroidx/work/multiprocess/b;

    invoke-static {v1, v0}, Landroidx/work/multiprocess/c$a;->a(Landroidx/work/multiprocess/b;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
