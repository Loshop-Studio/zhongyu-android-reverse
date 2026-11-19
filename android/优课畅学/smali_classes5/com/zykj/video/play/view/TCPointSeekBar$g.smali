.class public Lcom/zykj/video/play/view/TCPointSeekBar$g;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/video/play/view/TCPointSeekBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field public a:I

.field public b:Landroid/graphics/Paint;

.field public c:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar$g;->a:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/video/play/view/TCPointSeekBar$g;->a()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$g;->b:Landroid/graphics/Paint;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$g;->b:Landroid/graphics/Paint;

    .line 13
    .line 14
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar$g;->a:I

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Landroid/graphics/RectF;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$g;->c:Landroid/graphics/RectF;

    .line 25
    .line 26
    return-void
.end method

.method public b(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar$g;->a:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$g;->b:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c(FFFF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$g;->c:Landroid/graphics/RectF;

    .line 2
    .line 3
    iput p1, v0, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    iput p2, v0, Landroid/graphics/RectF;->top:F

    .line 6
    .line 7
    iput p3, v0, Landroid/graphics/RectF;->right:F

    .line 8
    .line 9
    iput p4, v0, Landroid/graphics/RectF;->bottom:F

    .line 10
    .line 11
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar$g;->c:Landroid/graphics/RectF;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar$g;->b:Landroid/graphics/Paint;

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
