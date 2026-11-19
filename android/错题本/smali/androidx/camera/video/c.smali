.class public final synthetic Landroidx/camera/video/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/video/Recorder;

.field public final synthetic c:Landroidx/camera/video/Recorder$RecordingRecord;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/camera/video/c;->a:I

    iput-object p1, p0, Landroidx/camera/video/c;->b:Landroidx/camera/video/Recorder;

    iput-object p2, p0, Landroidx/camera/video/c;->c:Landroidx/camera/video/Recorder$RecordingRecord;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/video/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/c;->b:Landroidx/camera/video/Recorder;

    iget-object v1, p0, Landroidx/camera/video/c;->c:Landroidx/camera/video/Recorder$RecordingRecord;

    invoke-static {v0, v1}, Landroidx/camera/video/Recorder;->b(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/c;->b:Landroidx/camera/video/Recorder;

    iget-object v1, p0, Landroidx/camera/video/c;->c:Landroidx/camera/video/Recorder$RecordingRecord;

    invoke-static {v0, v1}, Landroidx/camera/video/Recorder;->d(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
