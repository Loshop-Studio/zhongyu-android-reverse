.class public final synthetic Landroidx/camera/camera2/interop/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/camera/camera2/interop/c;->a:I

    iput-object p1, p0, Landroidx/camera/camera2/interop/c;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Landroidx/camera/camera2/interop/c;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/camera2/interop/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/camera2/interop/c;->c:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iget-boolean v1, p0, Landroidx/camera/camera2/interop/c;->b:Z

    invoke-static {v0, v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->e(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/camera2/interop/c;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget-boolean v1, p0, Landroidx/camera/camera2/interop/c;->b:Z

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->b(Ljava/util/ArrayList;Z)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/camera2/interop/c;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    iget-boolean v1, p0, Landroidx/camera/camera2/interop/c;->b:Z

    invoke-static {v0, v1}, Lcom/google/android/material/internal/ViewUtils;->a(Landroid/view/View;Z)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/camera2/interop/c;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;

    iget-boolean v1, p0, Landroidx/camera/camera2/interop/c;->b:Z

    invoke-static {v0, v1}, Landroidx/camera/video/internal/audio/AudioStreamImpl;->a(Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;Z)V

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/camera/camera2/interop/c;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/camera2/interop/Camera2CameraControl;

    iget-boolean v1, p0, Landroidx/camera/camera2/interop/c;->b:Z

    invoke-static {v0, v1}, Landroidx/camera/camera2/interop/Camera2CameraControl;->e(Landroidx/camera/camera2/interop/Camera2CameraControl;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
