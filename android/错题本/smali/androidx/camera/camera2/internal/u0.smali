.class public final synthetic Landroidx/camera/camera2/internal/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/utils/futures/AsyncFunction;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/ProcessingCaptureSession;Landroidx/camera/core/impl/SessionConfig;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/SynchronizedCaptureSession$Opener;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Landroidx/camera/camera2/internal/u0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/u0;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/camera/camera2/internal/u0;->d:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/camera2/internal/u0;->b:Landroid/hardware/camera2/CameraDevice;

    iput-object p4, p0, Landroidx/camera/camera2/internal/u0;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/SynchronizedCaptureSessionImpl;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/compat/params/SessionConfigurationCompat;Ljava/util/List;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Landroidx/camera/camera2/internal/u0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/u0;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/camera/camera2/internal/u0;->b:Landroid/hardware/camera2/CameraDevice;

    iput-object p3, p0, Landroidx/camera/camera2/internal/u0;->d:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/camera/camera2/internal/u0;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Le1/a;
    .locals 4

    .line 1
    iget v0, p0, Landroidx/camera/camera2/internal/u0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/u0;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/camera2/internal/SynchronizedCaptureSessionImpl;

    iget-object v1, p0, Landroidx/camera/camera2/internal/u0;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/camera2/internal/compat/params/SessionConfigurationCompat;

    iget-object v2, p0, Landroidx/camera/camera2/internal/u0;->e:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    check-cast p1, Ljava/util/List;

    iget-object v3, p0, Landroidx/camera/camera2/internal/u0;->b:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v0, v3, v1, v2, p1}, Landroidx/camera/camera2/internal/SynchronizedCaptureSessionImpl;->g(Landroidx/camera/camera2/internal/SynchronizedCaptureSessionImpl;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/compat/params/SessionConfigurationCompat;Ljava/util/List;Ljava/util/List;)Le1/a;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/u0;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;

    iget-object v1, p0, Landroidx/camera/camera2/internal/u0;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/SessionConfig;

    iget-object v2, p0, Landroidx/camera/camera2/internal/u0;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/camera/camera2/internal/SynchronizedCaptureSession$Opener;

    check-cast p1, Ljava/util/List;

    iget-object v3, p0, Landroidx/camera/camera2/internal/u0;->b:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v0, v1, v3, v2, p1}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->d(Landroidx/camera/camera2/internal/ProcessingCaptureSession;Landroidx/camera/core/impl/SessionConfig;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/SynchronizedCaptureSession$Opener;Ljava/util/List;)Le1/a;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
