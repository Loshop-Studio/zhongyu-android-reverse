.class public Lcom/shuyu/gsyvideoplayer/render/view/GSYSurfaceView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shuyu/gsyvideoplayer/render/view/GSYSurfaceView;->c(Ll7/e;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ll7/e;

.field public final synthetic b:Landroid/graphics/Bitmap;

.field public final synthetic c:Landroid/os/HandlerThread;

.field public final synthetic d:Lcom/shuyu/gsyvideoplayer/render/view/GSYSurfaceView;


# direct methods
.method public constructor <init>(Lcom/shuyu/gsyvideoplayer/render/view/GSYSurfaceView;Ll7/e;Landroid/graphics/Bitmap;Landroid/os/HandlerThread;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYSurfaceView$a;->d:Lcom/shuyu/gsyvideoplayer/render/view/GSYSurfaceView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYSurfaceView$a;->a:Ll7/e;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYSurfaceView$a;->b:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYSurfaceView$a;->c:Landroid/os/HandlerThread;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onPixelCopyFinished(I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYSurfaceView$a;->a:Ll7/e;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYSurfaceView$a;->b:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Ll7/e;->a(Landroid/graphics/Bitmap;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYSurfaceView$a;->c:Landroid/os/HandlerThread;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
