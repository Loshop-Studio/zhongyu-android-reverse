.class public final synthetic Landroidx/camera/view/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/arch/core/util/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/view/a;->a:I

    iput-object p1, p0, Landroidx/camera/view/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/view/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/view/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/PreviewStreamStateObserver;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, Landroidx/camera/view/PreviewStreamStateObserver;->c(Landroidx/camera/view/PreviewStreamStateObserver;Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/view/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/CameraController;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/camera/view/CameraController;->setZoomRatio(F)Le1/a;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/view/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/CameraController;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/camera/view/CameraController;->setLinearZoom(F)Le1/a;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/view/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/CameraController;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/camera/view/CameraController;->enableTorch(Z)Le1/a;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Landroidx/camera/view/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/CameraController;

    check-cast p1, Landroidx/camera/view/ProcessCameraProviderWrapper;

    invoke-static {v0, p1}, Landroidx/camera/view/CameraController;->a(Landroidx/camera/view/CameraController;Landroidx/camera/view/ProcessCameraProviderWrapper;)Ljava/lang/Void;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
