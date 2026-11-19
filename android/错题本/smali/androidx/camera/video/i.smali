.class public final synthetic Landroidx/camera/video/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/video/i;->a:I

    iput p1, p0, Landroidx/camera/video/i;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/video/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Landroidx/camera/video/i;->b:I

    check-cast p1, Landroidx/camera/video/VideoSpec$Builder;

    invoke-static {v0, p1}, Landroidx/camera/video/Recorder$Builder;->d(ILandroidx/camera/video/VideoSpec$Builder;)V

    return-void

    :pswitch_0
    iget v0, p0, Landroidx/camera/video/i;->b:I

    check-cast p1, Landroidx/camera/video/AudioSpec$Builder;

    invoke-static {v0, p1}, Landroidx/camera/video/Recorder$Builder;->b(ILandroidx/camera/video/AudioSpec$Builder;)V

    return-void

    :pswitch_1
    iget v0, p0, Landroidx/camera/video/i;->b:I

    check-cast p1, Landroidx/camera/video/VideoSpec$Builder;

    invoke-static {v0, p1}, Landroidx/camera/video/Recorder$Builder;->c(ILandroidx/camera/video/VideoSpec$Builder;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
