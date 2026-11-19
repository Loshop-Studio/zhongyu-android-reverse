.class public final synthetic Landroidx/camera/camera2/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/utils/futures/AsyncFunction;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/Camera2CameraControlImpl;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/d;->a:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    iput p2, p0, Landroidx/camera/camera2/internal/d;->b:I

    iput p3, p0, Landroidx/camera/camera2/internal/d;->c:I

    iput p4, p0, Landroidx/camera/camera2/internal/d;->d:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Le1/a;
    .locals 4

    .line 1
    iget v0, p0, Landroidx/camera/camera2/internal/d;->d:I

    check-cast p1, Ljava/lang/Void;

    iget-object v1, p0, Landroidx/camera/camera2/internal/d;->a:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    iget v2, p0, Landroidx/camera/camera2/internal/d;->b:I

    iget v3, p0, Landroidx/camera/camera2/internal/d;->c:I

    invoke-static {v1, v2, v3, v0, p1}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;->d(Landroidx/camera/camera2/internal/Camera2CameraControlImpl;IIILjava/lang/Void;)Le1/a;

    move-result-object p1

    return-object p1
.end method
