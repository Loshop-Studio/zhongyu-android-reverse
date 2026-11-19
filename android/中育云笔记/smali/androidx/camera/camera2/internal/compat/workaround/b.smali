.class public final synthetic Landroidx/camera/camera2/internal/compat/workaround/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor;

.field public final synthetic d:Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor$RequestCompleteListener;

.field public final synthetic e:Lcom/google/common/util/concurrent/ListenableFuture;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor;Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor$RequestCompleteListener;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/compat/workaround/b;->c:Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor;

    iput-object p2, p0, Landroidx/camera/camera2/internal/compat/workaround/b;->d:Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor$RequestCompleteListener;

    iput-object p3, p0, Landroidx/camera/camera2/internal/compat/workaround/b;->e:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/workaround/b;->c:Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor;

    iget-object v1, p0, Landroidx/camera/camera2/internal/compat/workaround/b;->d:Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor$RequestCompleteListener;

    iget-object v2, p0, Landroidx/camera/camera2/internal/compat/workaround/b;->e:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {v0, v1, v2}, Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor;->a(Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor;Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor$RequestCompleteListener;Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method
