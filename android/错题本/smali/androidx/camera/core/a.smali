.class public final synthetic Landroidx/camera/core/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/core/a;->a:I

    iput-object p2, p0, Landroidx/camera/core/a;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/core/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/core/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/Preview;

    iget-object v1, p0, Landroidx/camera/core/a;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/CameraInternal;

    invoke-static {v0, v1}, Landroidx/camera/core/Preview;->b(Landroidx/camera/core/Preview;Landroidx/camera/core/impl/CameraInternal;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/Preview$SurfaceProvider;

    iget-object v1, p0, Landroidx/camera/core/a;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/SurfaceRequest;

    invoke-static {v0, v1}, Landroidx/camera/core/Preview;->c(Landroidx/camera/core/Preview$SurfaceProvider;Landroidx/camera/core/SurfaceRequest;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/core/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/MetadataImageReader;

    iget-object v1, p0, Landroidx/camera/core/a;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/ImageReaderProxy$OnImageAvailableListener;

    invoke-static {v0, v1}, Landroidx/camera/core/MetadataImageReader;->a(Landroidx/camera/core/MetadataImageReader;Landroidx/camera/core/impl/ImageReaderProxy$OnImageAvailableListener;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/core/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/SafeCloseImageReaderProxy;

    iget-object v1, p0, Landroidx/camera/core/a;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/SafeCloseImageReaderProxy;

    invoke-static {v0, v1}, Landroidx/camera/core/ImageAnalysis;->b(Landroidx/camera/core/SafeCloseImageReaderProxy;Landroidx/camera/core/SafeCloseImageReaderProxy;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/camera/core/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/CameraX;

    iget-object v1, p0, Landroidx/camera/core/a;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    invoke-static {v1, v0}, Landroidx/camera/core/CameraX;->b(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Landroidx/camera/core/CameraX;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Landroidx/camera/core/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/AndroidImageReaderProxy;

    iget-object v1, p0, Landroidx/camera/core/a;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/ImageReaderProxy$OnImageAvailableListener;

    invoke-static {v0, v1}, Landroidx/camera/core/AndroidImageReaderProxy;->b(Landroidx/camera/core/AndroidImageReaderProxy;Landroidx/camera/core/impl/ImageReaderProxy$OnImageAvailableListener;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
