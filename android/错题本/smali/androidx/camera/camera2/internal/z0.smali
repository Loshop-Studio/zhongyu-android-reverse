.class public final synthetic Landroidx/camera/camera2/internal/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/camera2/internal/VideoUsageControl;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/VideoUsageControl;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/camera2/internal/z0;->a:I

    iput-object p1, p0, Landroidx/camera/camera2/internal/z0;->b:Landroidx/camera/camera2/internal/VideoUsageControl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/camera2/internal/z0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/z0;->b:Landroidx/camera/camera2/internal/VideoUsageControl;

    invoke-static {v0}, Landroidx/camera/camera2/internal/VideoUsageControl;->c(Landroidx/camera/camera2/internal/VideoUsageControl;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/z0;->b:Landroidx/camera/camera2/internal/VideoUsageControl;

    invoke-static {v0}, Landroidx/camera/camera2/internal/VideoUsageControl;->b(Landroidx/camera/camera2/internal/VideoUsageControl;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/z0;->b:Landroidx/camera/camera2/internal/VideoUsageControl;

    invoke-static {v0}, Landroidx/camera/camera2/internal/VideoUsageControl;->a(Landroidx/camera/camera2/internal/VideoUsageControl;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
