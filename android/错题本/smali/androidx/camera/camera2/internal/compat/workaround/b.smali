.class public final synthetic Landroidx/camera/camera2/internal/compat/workaround/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/arch/core/util/Function;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/camera2/internal/compat/workaround/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/camera2/internal/compat/workaround/b;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/camera/video/internal/encoder/VideoEncoderConfig;

    invoke-static {p1}, Landroidx/camera/video/internal/encoder/VideoEncoderInfoImpl;->a(Landroidx/camera/video/internal/encoder/VideoEncoderConfig;)Landroidx/camera/video/internal/encoder/VideoEncoderInfo;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance v0, Landroidx/camera/core/processing/DefaultSurfaceProcessor;

    check-cast p1, Landroidx/camera/core/DynamicRange;

    invoke-direct {v0, p1}, Landroidx/camera/core/processing/DefaultSurfaceProcessor;-><init>(Landroidx/camera/core/DynamicRange;)V

    return-object v0

    :pswitch_1
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Landroidx/camera/core/ImageCapture;->a(Ljava/util/List;)Ljava/lang/Void;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Landroidx/camera/camera2/internal/compat/workaround/RequestMonitor;->b(Ljava/util/List;)Ljava/lang/Void;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
