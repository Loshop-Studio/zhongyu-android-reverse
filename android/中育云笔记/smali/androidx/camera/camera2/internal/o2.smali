.class public final synthetic Landroidx/camera/camera2/internal/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Landroidx/camera/camera2/internal/FocusMeteringControl;

.field public final synthetic d:Z

.field public final synthetic e:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/FocusMeteringControl;ZLandroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/o2;->c:Landroidx/camera/camera2/internal/FocusMeteringControl;

    iput-boolean p2, p0, Landroidx/camera/camera2/internal/o2;->d:Z

    iput-object p3, p0, Landroidx/camera/camera2/internal/o2;->e:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/o2;->c:Landroidx/camera/camera2/internal/FocusMeteringControl;

    iget-boolean v1, p0, Landroidx/camera/camera2/internal/o2;->d:Z

    iget-object v2, p0, Landroidx/camera/camera2/internal/o2;->e:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    invoke-static {v0, v1, v2}, Landroidx/camera/camera2/internal/FocusMeteringControl;->b(Landroidx/camera/camera2/internal/FocusMeteringControl;ZLandroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    return-void
.end method
