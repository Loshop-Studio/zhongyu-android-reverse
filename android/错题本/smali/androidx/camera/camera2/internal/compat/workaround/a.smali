.class public final synthetic Landroidx/camera/camera2/internal/compat/workaround/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor;

.field public final synthetic b:Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor$RequestCompleteListener;

.field public final synthetic c:Le1/a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor;Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor$RequestCompleteListener;Le1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/compat/workaround/a;->a:Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor;

    iput-object p2, p0, Landroidx/camera/camera2/internal/compat/workaround/a;->b:Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor$RequestCompleteListener;

    iput-object p3, p0, Landroidx/camera/camera2/internal/compat/workaround/a;->c:Le1/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/workaround/a;->b:Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor$RequestCompleteListener;

    iget-object v1, p0, Landroidx/camera/camera2/internal/compat/workaround/a;->c:Le1/a;

    iget-object v2, p0, Landroidx/camera/camera2/internal/compat/workaround/a;->a:Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor;

    invoke-static {v2, v0, v1}, Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor;->a(Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor;Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor$RequestCompleteListener;Le1/a;)V

    return-void
.end method
