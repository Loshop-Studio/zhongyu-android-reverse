.class Lcom/zykj/paint/SketchSyncView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/paint/SketchSyncView;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/paint/SketchSyncView;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/SketchSyncView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

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
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {v0, v1}, Lcom/zykj/paint/SketchSyncView;->access$002(Lcom/zykj/paint/SketchSyncView;I)I

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v0, v1}, Lcom/zykj/paint/SketchSyncView;->access$102(Lcom/zykj/paint/SketchSyncView;I)I

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "width="

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 36
    .line 37
    invoke-static {v1}, Lcom/zykj/paint/SketchSyncView;->access$000(Lcom/zykj/paint/SketchSyncView;)I

    .line 38
    .line 39
    .line 40
    move-result v1

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
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 50
    .line 51
    invoke-static {v1}, Lcom/zykj/paint/SketchSyncView;->access$100(Lcom/zykj/paint/SketchSyncView;)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "SketchSyncView"

    .line 63
    .line 64
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 68
    .line 69
    invoke-static {v0}, Lcom/zykj/paint/SketchSyncView;->access$000(Lcom/zykj/paint/SketchSyncView;)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 74
    .line 75
    invoke-static {v2}, Lcom/zykj/paint/SketchSyncView;->access$100(Lcom/zykj/paint/SketchSyncView;)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 80
    .line 81
    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v0, v1}, Lcom/zykj/paint/SketchSyncView;->access$202(Lcom/zykj/paint/SketchSyncView;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 89
    .line 90
    invoke-static {v0}, Lcom/zykj/paint/SketchSyncView;->access$000(Lcom/zykj/paint/SketchSyncView;)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 95
    .line 96
    invoke-static {v2}, Lcom/zykj/paint/SketchSyncView;->access$100(Lcom/zykj/paint/SketchSyncView;)I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v0, v1}, Lcom/zykj/paint/SketchSyncView;->access$302(Lcom/zykj/paint/SketchSyncView;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 108
    .line 109
    new-instance v1, Landroid/graphics/Canvas;

    .line 110
    .line 111
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 112
    .line 113
    invoke-static {v2}, Lcom/zykj/paint/SketchSyncView;->access$200(Lcom/zykj/paint/SketchSyncView;)Landroid/graphics/Bitmap;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v0, v1}, Lcom/zykj/paint/SketchSyncView;->access$402(Lcom/zykj/paint/SketchSyncView;Landroid/graphics/Canvas;)Landroid/graphics/Canvas;

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 124
    .line 125
    new-instance v1, Landroid/graphics/Canvas;

    .line 126
    .line 127
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 128
    .line 129
    invoke-static {v2}, Lcom/zykj/paint/SketchSyncView;->access$300(Lcom/zykj/paint/SketchSyncView;)Landroid/graphics/Bitmap;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v0, v1}, Lcom/zykj/paint/SketchSyncView;->access$502(Lcom/zykj/paint/SketchSyncView;Landroid/graphics/Canvas;)Landroid/graphics/Canvas;

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 140
    .line 141
    const/4 v1, 0x1

    .line 142
    invoke-static {v0, v1}, Lcom/zykj/paint/SketchSyncView;->access$602(Lcom/zykj/paint/SketchSyncView;Z)Z

    .line 143
    .line 144
    .line 145
    return-void
.end method
