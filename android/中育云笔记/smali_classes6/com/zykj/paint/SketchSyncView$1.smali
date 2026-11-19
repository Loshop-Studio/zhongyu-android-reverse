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
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v1, "width="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 39
    .line 40
    invoke-static {v1}, Lcom/zykj/paint/SketchSyncView;->access$000(Lcom/zykj/paint/SketchSyncView;)I

    .line 41
    .line 42
    .line 43
    move-result v1

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
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 53
    .line 54
    invoke-static {v1}, Lcom/zykj/paint/SketchSyncView;->access$100(Lcom/zykj/paint/SketchSyncView;)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "SketchSyncView"

    .line 66
    .line 67
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 71
    .line 72
    invoke-static {v0}, Lcom/zykj/paint/SketchSyncView;->access$000(Lcom/zykj/paint/SketchSyncView;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 77
    .line 78
    invoke-static {v2}, Lcom/zykj/paint/SketchSyncView;->access$100(Lcom/zykj/paint/SketchSyncView;)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 83
    .line 84
    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v0, v1}, Lcom/zykj/paint/SketchSyncView;->access$202(Lcom/zykj/paint/SketchSyncView;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 92
    .line 93
    invoke-static {v0}, Lcom/zykj/paint/SketchSyncView;->access$000(Lcom/zykj/paint/SketchSyncView;)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 98
    .line 99
    invoke-static {v2}, Lcom/zykj/paint/SketchSyncView;->access$100(Lcom/zykj/paint/SketchSyncView;)I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {v0, v1}, Lcom/zykj/paint/SketchSyncView;->access$302(Lcom/zykj/paint/SketchSyncView;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 111
    .line 112
    new-instance v1, Landroid/graphics/Canvas;

    .line 113
    .line 114
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 115
    .line 116
    invoke-static {v2}, Lcom/zykj/paint/SketchSyncView;->access$200(Lcom/zykj/paint/SketchSyncView;)Landroid/graphics/Bitmap;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v0, v1}, Lcom/zykj/paint/SketchSyncView;->access$402(Lcom/zykj/paint/SketchSyncView;Landroid/graphics/Canvas;)Landroid/graphics/Canvas;

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 127
    .line 128
    new-instance v1, Landroid/graphics/Canvas;

    .line 129
    .line 130
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 131
    .line 132
    invoke-static {v2}, Lcom/zykj/paint/SketchSyncView;->access$300(Lcom/zykj/paint/SketchSyncView;)Landroid/graphics/Bitmap;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v0, v1}, Lcom/zykj/paint/SketchSyncView;->access$502(Lcom/zykj/paint/SketchSyncView;Landroid/graphics/Canvas;)Landroid/graphics/Canvas;

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView$1;->this$0:Lcom/zykj/paint/SketchSyncView;

    .line 143
    .line 144
    const/4 v1, 0x1

    .line 145
    invoke-static {v0, v1}, Lcom/zykj/paint/SketchSyncView;->access$602(Lcom/zykj/paint/SketchSyncView;Z)Z

    .line 146
    .line 147
    .line 148
    return-void
.end method
