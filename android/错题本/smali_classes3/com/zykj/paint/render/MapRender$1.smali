.class Lcom/zykj/paint/render/MapRender$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/paint/render/MapRender;->init(Lcom/zykj/paint/render/MapViewer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/paint/render/MapRender;

.field final synthetic val$mapViewer:Lcom/zykj/paint/render/MapViewer;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/MapRender;Lcom/zykj/paint/render/MapViewer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/MapRender$1;->this$0:Lcom/zykj/paint/render/MapRender;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/paint/render/MapRender$1;->val$mapViewer:Lcom/zykj/paint/render/MapViewer;

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
    iget-object v0, p0, Lcom/zykj/paint/render/MapRender$1;->val$mapViewer:Lcom/zykj/paint/render/MapViewer;

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
    iget-object v0, p0, Lcom/zykj/paint/render/MapRender$1;->this$0:Lcom/zykj/paint/render/MapRender;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/zykj/paint/render/MapRender$1;->val$mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iput v1, v0, Lcom/zykj/paint/render/MapRender;->width:I

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/paint/render/MapRender$1;->this$0:Lcom/zykj/paint/render/MapRender;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/paint/render/MapRender$1;->val$mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput v1, v0, Lcom/zykj/paint/render/MapRender;->height:I

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "width="

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lcom/zykj/paint/render/MapRender$1;->this$0:Lcom/zykj/paint/render/MapRender;

    .line 38
    .line 39
    iget v1, v1, Lcom/zykj/paint/render/MapRender;->width:I

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ",height="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lcom/zykj/paint/render/MapRender$1;->this$0:Lcom/zykj/paint/render/MapRender;

    .line 50
    .line 51
    iget v1, v1, Lcom/zykj/paint/render/MapRender;->height:I

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "MapRender"

    .line 61
    .line 62
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/zykj/paint/render/MapRender$1;->this$0:Lcom/zykj/paint/render/MapRender;

    .line 66
    .line 67
    iget v1, v0, Lcom/zykj/paint/render/MapRender;->width:I

    .line 68
    .line 69
    iget v2, v0, Lcom/zykj/paint/render/MapRender;->height:I

    .line 70
    .line 71
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 72
    .line 73
    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, v0, Lcom/zykj/paint/render/MapRender;->mBitmap:Landroid/graphics/Bitmap;

    .line 78
    .line 79
    iget-object v0, p0, Lcom/zykj/paint/render/MapRender$1;->this$0:Lcom/zykj/paint/render/MapRender;

    .line 80
    .line 81
    iget v1, v0, Lcom/zykj/paint/render/MapRender;->width:I

    .line 82
    .line 83
    iget v2, v0, Lcom/zykj/paint/render/MapRender;->height:I

    .line 84
    .line 85
    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iput-object v1, v0, Lcom/zykj/paint/render/MapRender;->mScreenBitmap:Landroid/graphics/Bitmap;

    .line 90
    .line 91
    iget-object v0, p0, Lcom/zykj/paint/render/MapRender$1;->this$0:Lcom/zykj/paint/render/MapRender;

    .line 92
    .line 93
    new-instance v1, Landroid/graphics/Canvas;

    .line 94
    .line 95
    iget-object v2, p0, Lcom/zykj/paint/render/MapRender$1;->this$0:Lcom/zykj/paint/render/MapRender;

    .line 96
    .line 97
    iget-object v2, v2, Lcom/zykj/paint/render/MapRender;->mBitmap:Landroid/graphics/Bitmap;

    .line 98
    .line 99
    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 100
    .line 101
    .line 102
    iput-object v1, v0, Lcom/zykj/paint/render/MapRender;->mCanvas:Landroid/graphics/Canvas;

    .line 103
    .line 104
    iget-object v0, p0, Lcom/zykj/paint/render/MapRender$1;->this$0:Lcom/zykj/paint/render/MapRender;

    .line 105
    .line 106
    new-instance v1, Landroid/graphics/Canvas;

    .line 107
    .line 108
    iget-object v2, p0, Lcom/zykj/paint/render/MapRender$1;->this$0:Lcom/zykj/paint/render/MapRender;

    .line 109
    .line 110
    iget-object v2, v2, Lcom/zykj/paint/render/MapRender;->mScreenBitmap:Landroid/graphics/Bitmap;

    .line 111
    .line 112
    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 113
    .line 114
    .line 115
    iput-object v1, v0, Lcom/zykj/paint/render/MapRender;->mScreenCanvas:Landroid/graphics/Canvas;

    .line 116
    .line 117
    return-void
.end method
