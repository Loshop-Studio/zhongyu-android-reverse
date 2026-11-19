.class public final synthetic Landroidx/camera/camera2/internal/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/FocusMeteringControl;

.field public final synthetic b:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

.field public final synthetic c:Landroidx/camera/core/FocusMeteringAction;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(JLandroidx/camera/camera2/internal/FocusMeteringControl;Landroidx/camera/core/FocusMeteringAction;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Landroidx/camera/camera2/internal/o0;->a:Landroidx/camera/camera2/internal/FocusMeteringControl;

    iput-object p5, p0, Landroidx/camera/camera2/internal/o0;->b:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    iput-object p4, p0, Landroidx/camera/camera2/internal/o0;->c:Landroidx/camera/core/FocusMeteringAction;

    iput-wide p1, p0, Landroidx/camera/camera2/internal/o0;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/o0;->c:Landroidx/camera/core/FocusMeteringAction;

    iget-wide v1, p0, Landroidx/camera/camera2/internal/o0;->d:J

    iget-object v3, p0, Landroidx/camera/camera2/internal/o0;->a:Landroidx/camera/camera2/internal/FocusMeteringControl;

    iget-object v4, p0, Landroidx/camera/camera2/internal/o0;->b:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    invoke-static {v1, v2, v3, v0, v4}, Landroidx/camera/camera2/internal/FocusMeteringControl;->o(JLandroidx/camera/camera2/internal/FocusMeteringControl;Landroidx/camera/core/FocusMeteringAction;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    return-void
.end method
