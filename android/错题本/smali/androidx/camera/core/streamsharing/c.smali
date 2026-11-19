.class public final synthetic Landroidx/camera/core/streamsharing/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/utils/futures/AsyncFunction;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Le1/a;


# direct methods
.method public synthetic constructor <init>(Le1/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/core/streamsharing/c;->a:I

    iput-object p1, p0, Landroidx/camera/core/streamsharing/c;->b:Le1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Le1/a;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/streamsharing/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/streamsharing/c;->b:Le1/a;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, Landroidx/camera/core/streamsharing/VirtualCameraControl;->b(Le1/a;Ljava/lang/Void;)Le1/a;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/streamsharing/c;->b:Le1/a;

    check-cast p1, Landroidx/camera/core/imagecapture/CameraCapturePipeline;

    invoke-static {v0, p1}, Landroidx/camera/core/streamsharing/VirtualCameraControl;->c(Le1/a;Landroidx/camera/core/imagecapture/CameraCapturePipeline;)Le1/a;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
