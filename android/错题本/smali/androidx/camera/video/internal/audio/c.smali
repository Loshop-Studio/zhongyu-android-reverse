.class public final synthetic Landroidx/camera/video/internal/audio/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/video/internal/audio/AudioSource;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/audio/AudioSource;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/video/internal/audio/c;->a:I

    iput-object p1, p0, Landroidx/camera/video/internal/audio/c;->b:Landroidx/camera/video/internal/audio/AudioSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/video/internal/audio/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/internal/audio/c;->b:Landroidx/camera/video/internal/audio/AudioSource;

    invoke-static {v0}, Landroidx/camera/video/internal/audio/AudioSource;->l(Landroidx/camera/video/internal/audio/AudioSource;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/internal/audio/c;->b:Landroidx/camera/video/internal/audio/AudioSource;

    invoke-static {v0}, Landroidx/camera/video/internal/audio/AudioSource;->g(Landroidx/camera/video/internal/audio/AudioSource;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
