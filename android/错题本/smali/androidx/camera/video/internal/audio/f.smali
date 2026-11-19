.class public final synthetic Landroidx/camera/video/internal/audio/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Landroidx/camera/video/internal/audio/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/camera/video/internal/audio/f;->b:I

    iput-object p2, p0, Landroidx/camera/video/internal/audio/f;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p3, p0, Landroidx/camera/video/internal/audio/f;->a:I

    iput-object p1, p0, Landroidx/camera/video/internal/audio/f;->c:Ljava/lang/Object;

    iput p2, p0, Landroidx/camera/video/internal/audio/f;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/video/internal/audio/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/internal/audio/f;->c:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iget v1, p0, Landroidx/camera/video/internal/audio/f;->b:I

    invoke-static {v1, v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->o(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/internal/audio/f;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget v1, p0, Landroidx/camera/video/internal/audio/f;->b:I

    invoke-static {v0, v1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->b(Lcom/google/android/material/sidesheet/SideSheetBehavior;I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/video/internal/audio/f;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/core/content/res/ResourcesCompat$FontCallback;

    iget v1, p0, Landroidx/camera/video/internal/audio/f;->b:I

    invoke-static {v0, v1}, Landroidx/core/content/res/ResourcesCompat$FontCallback;->b(Landroidx/core/content/res/ResourcesCompat$FontCallback;I)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/f;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/audio/BufferedAudioStream;

    iget v1, p0, Landroidx/camera/video/internal/audio/f;->b:I

    invoke-static {v0, v1}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->d(Landroidx/camera/video/internal/audio/BufferedAudioStream;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
