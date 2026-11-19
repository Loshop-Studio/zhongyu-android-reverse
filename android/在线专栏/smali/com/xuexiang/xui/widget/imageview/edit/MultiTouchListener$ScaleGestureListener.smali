.class Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;
.super Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ScaleGestureListener"
.end annotation


# instance fields
.field private mPivotX:F

.field private mPivotY:F

.field private mPrevSpanVector:Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;

.field final synthetic this$0:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;


# direct methods
.method private constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    .line 2
    new-instance p1, Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;

    invoke-direct {p1}, Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->mPrevSpanVector:Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;

    return-void
.end method

.method synthetic constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)V

    return-void
.end method


# virtual methods
.method public onScale(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;)Z
    .locals 4

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$1;)V

    .line 2
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->getScaleFactor()F

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->deltaScale:F

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->mPrevSpanVector:Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;

    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->getCurrentSpanVector()Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;->getAngle(Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;)F

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->deltaAngle:F

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->access$400(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->getFocusX()F

    move-result v1

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->mPivotX:F

    sub-float/2addr v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->deltaX:F

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->access$400(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->getFocusY()F

    move-result p2

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->mPivotY:F

    sub-float v2, p2, v1

    :cond_1
    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->deltaY:F

    .line 6
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->mPivotX:F

    iput p2, v0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->pivotX:F

    .line 7
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->mPivotY:F

    iput p2, v0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->pivotY:F

    const/high16 p2, 0x3f000000    # 0.5f

    .line 8
    iput p2, v0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->minimumScale:F

    const/high16 p2, 0x41200000    # 10.0f

    .line 9
    iput p2, v0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->maximumScale:F

    .line 10
    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->access$500(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;)V

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->access$200(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public onScaleBegin(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->getFocusX()F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->mPivotX:F

    .line 2
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->getFocusY()F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->mPivotY:F

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->mPrevSpanVector:Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;

    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->getCurrentSpanVector()Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->access$200(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)Z

    move-result p1

    return p1
.end method
