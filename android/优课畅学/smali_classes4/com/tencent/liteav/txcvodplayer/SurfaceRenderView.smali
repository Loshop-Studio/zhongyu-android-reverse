.class public Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;
.super Landroid/view/SurfaceView;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/txcvodplayer/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView$b;,
        Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView$a;
    }
.end annotation


# instance fields
.field private a:Lcom/tencent/liteav/txcvodplayer/c;

.field private b:Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-direct {p0, p1}, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0, p1}, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->a(Landroid/content/Context;)V

    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/tencent/liteav/txcvodplayer/c;

    .line 2
    .line 3
    invoke-direct {p1, p0}, Lcom/tencent/liteav/txcvodplayer/c;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->a:Lcom/tencent/liteav/txcvodplayer/c;

    .line 7
    .line 8
    new-instance p1, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView$b;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView$b;-><init>(Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->b:Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView$b;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->b:Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView$b;

    .line 20
    .line 21
    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->setType(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public addRenderCallback(Lcom/tencent/liteav/txcvodplayer/a$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->b:Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView$b;->a(Lcom/tencent/liteav/txcvodplayer/a$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onMeasure(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->a:Lcom/tencent/liteav/txcvodplayer/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/txcvodplayer/c;->c(II)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->a:Lcom/tencent/liteav/txcvodplayer/c;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/c;->a()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->a:Lcom/tencent/liteav/txcvodplayer/c;

    .line 13
    .line 14
    invoke-virtual {p2}, Lcom/tencent/liteav/txcvodplayer/c;->b()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public removeRenderCallback(Lcom/tencent/liteav/txcvodplayer/a$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->b:Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView$b;->b(Lcom/tencent/liteav/txcvodplayer/a$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setAspectRatio(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->a:Lcom/tencent/liteav/txcvodplayer/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcvodplayer/c;->b(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setVideoRotation(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "SurfaceView doesn\'t support rotation ("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, ")!\n"

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, ""

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setVideoSampleAspectRatio(II)V
    .locals 1

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    if-lez p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->a:Lcom/tencent/liteav/txcvodplayer/c;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/txcvodplayer/c;->b(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setVideoSize(II)V
    .locals 1

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    if-lez p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/SurfaceRenderView;->a:Lcom/tencent/liteav/txcvodplayer/c;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/txcvodplayer/c;->a(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p1, p2}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public shouldWaitForResize()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
