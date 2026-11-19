.class public final synthetic Landroidx/camera/video/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/video/k;->a:I

    iput-object p1, p0, Landroidx/camera/video/k;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/video/k;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/k;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/QualitySelector;

    check-cast p1, Landroidx/camera/video/VideoSpec$Builder;

    invoke-static {v0, p1}, Landroidx/camera/video/Recorder$Builder;->a(Landroidx/camera/video/QualitySelector;Landroidx/camera/video/VideoSpec$Builder;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/k;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/Recorder;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Landroidx/camera/video/Recorder;->a(Landroidx/camera/video/Recorder;Landroid/net/Uri;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/video/k;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/VideoEncoderSession;

    check-cast p1, Landroidx/camera/core/SurfaceRequest$Result;

    invoke-static {v0, p1}, Landroidx/camera/video/VideoEncoderSession;->b(Landroidx/camera/video/VideoEncoderSession;Landroidx/camera/core/SurfaceRequest$Result;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/video/k;->b:Ljava/lang/Object;

    check-cast v0, Landroid/os/ParcelFileDescriptor;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Landroidx/camera/video/Recorder$RecordingRecord;->g(Landroid/os/ParcelFileDescriptor;Landroid/net/Uri;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/camera/video/k;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/MediaStoreOutputOptions;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Landroidx/camera/video/Recorder$RecordingRecord;->d(Landroidx/camera/video/MediaStoreOutputOptions;Landroid/net/Uri;)V

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
