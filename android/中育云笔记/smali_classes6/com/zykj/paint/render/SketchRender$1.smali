.class Lcom/zykj/paint/render/SketchRender$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/paint/render/SketchRender;->init(Lcom/zykj/paint/render/MapViewer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/paint/render/SketchRender;

.field final synthetic val$mapViewer:Lcom/zykj/paint/render/MapViewer;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/SketchRender;Lcom/zykj/paint/render/MapViewer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchRender$1;->this$0:Lcom/zykj/paint/render/SketchRender;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/paint/render/SketchRender$1;->val$mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchRender$1;->val$mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/paint/render/SketchRender$1;->this$0:Lcom/zykj/paint/render/SketchRender;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/zykj/paint/render/SketchRender$1;->val$mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iput v1, v0, Lcom/zykj/paint/render/SketchRender;->width:I

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/paint/render/SketchRender$1;->this$0:Lcom/zykj/paint/render/SketchRender;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/paint/render/SketchRender$1;->val$mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput v1, v0, Lcom/zykj/paint/render/SketchRender;->height:I

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v1, "width="

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lcom/zykj/paint/render/SketchRender$1;->this$0:Lcom/zykj/paint/render/SketchRender;

    .line 41
    .line 42
    iget v1, v1, Lcom/zykj/paint/render/SketchRender;->width:I

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ",height="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/zykj/paint/render/SketchRender$1;->this$0:Lcom/zykj/paint/render/SketchRender;

    .line 53
    .line 54
    iget v1, v1, Lcom/zykj/paint/render/SketchRender;->height:I

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "SketchRender"

    .line 64
    .line 65
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/zykj/paint/render/SketchRender$1;->this$0:Lcom/zykj/paint/render/SketchRender;

    .line 69
    .line 70
    iget v1, v0, Lcom/zykj/paint/render/SketchRender;->width:I

    .line 71
    .line 72
    iget v2, v0, Lcom/zykj/paint/render/SketchRender;->height:I

    .line 73
    .line 74
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 75
    .line 76
    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iput-object v1, v0, Lcom/zykj/paint/render/SketchRender;->mBitmap:Landroid/graphics/Bitmap;

    .line 81
    .line 82
    iget-object v0, p0, Lcom/zykj/paint/render/SketchRender$1;->this$0:Lcom/zykj/paint/render/SketchRender;

    .line 83
    .line 84
    iget v1, v0, Lcom/zykj/paint/render/SketchRender;->width:I

    .line 85
    .line 86
    iget v2, v0, Lcom/zykj/paint/render/SketchRender;->height:I

    .line 87
    .line 88
    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iput-object v1, v0, Lcom/zykj/paint/render/SketchRender;->mScreenBitmap:Landroid/graphics/Bitmap;

    .line 93
    .line 94
    iget-object v0, p0, Lcom/zykj/paint/render/SketchRender$1;->this$0:Lcom/zykj/paint/render/SketchRender;

    .line 95
    .line 96
    new-instance v1, Landroid/graphics/Canvas;

    .line 97
    .line 98
    iget-object v2, p0, Lcom/zykj/paint/render/SketchRender$1;->this$0:Lcom/zykj/paint/render/SketchRender;

    .line 99
    .line 100
    iget-object v2, v2, Lcom/zykj/paint/render/SketchRender;->mBitmap:Landroid/graphics/Bitmap;

    .line 101
    .line 102
    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 103
    .line 104
    .line 105
    iput-object v1, v0, Lcom/zykj/paint/render/SketchRender;->mCanvas:Landroid/graphics/Canvas;

    .line 106
    .line 107
    iget-object v0, p0, Lcom/zykj/paint/render/SketchRender$1;->this$0:Lcom/zykj/paint/render/SketchRender;

    .line 108
    .line 109
    new-instance v1, Landroid/graphics/Canvas;

    .line 110
    .line 111
    iget-object v2, p0, Lcom/zykj/paint/render/SketchRender$1;->this$0:Lcom/zykj/paint/render/SketchRender;

    .line 112
    .line 113
    iget-object v2, v2, Lcom/zykj/paint/render/SketchRender;->mScreenBitmap:Landroid/graphics/Bitmap;

    .line 114
    .line 115
    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 116
    .line 117
    .line 118
    iput-object v1, v0, Lcom/zykj/paint/render/SketchRender;->mScreenCanvas:Landroid/graphics/Canvas;

    .line 119
    .line 120
    return-void
.end method
