.class public final synthetic Landroidx/camera/video/internal/audio/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/video/internal/audio/AudioSource;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/audio/AudioSource;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/camera/video/internal/audio/a;->a:I

    iput-object p1, p0, Landroidx/camera/video/internal/audio/a;->b:Landroidx/camera/video/internal/audio/AudioSource;

    iput-boolean p2, p0, Landroidx/camera/video/internal/audio/a;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/video/internal/audio/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/internal/audio/a;->b:Landroidx/camera/video/internal/audio/AudioSource;

    iget-boolean v1, p0, Landroidx/camera/video/internal/audio/a;->c:Z

    invoke-static {v0, v1}, Landroidx/camera/video/internal/audio/AudioSource;->k(Landroidx/camera/video/internal/audio/AudioSource;Z)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/internal/audio/a;->b:Landroidx/camera/video/internal/audio/AudioSource;

    iget-boolean v1, p0, Landroidx/camera/video/internal/audio/a;->c:Z

    invoke-static {v0, v1}, Landroidx/camera/video/internal/audio/AudioSource;->e(Landroidx/camera/video/internal/audio/AudioSource;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
