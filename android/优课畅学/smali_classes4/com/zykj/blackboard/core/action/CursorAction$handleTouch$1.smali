.class final Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/CursorAction;->handleTouch(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/a;"
    }
.end annotation


# instance fields
.field final synthetic $event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

.field final synthetic this$0:Lcom/zykj/blackboard/core/action/CursorAction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/CursorAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->invoke()V

    sget-object v0, Lh7/p;->a:Lh7/p;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/CursorAction;->access$getTempPath$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/Path;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/CursorAction;->access$getTempPointF$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/PointF;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    move-result v1

    iget-object v2, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PointF;->set(FF)V

    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    move-result-object v0

    const-string v1, "event.pointerPropertiesList"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getToolType()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_1

    if-eq v0, v2, :cond_0

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    .line 7
    sget-object v4, Lcom/zykj/blackboard/utils/PointUtils;->INSTANCE:Lcom/zykj/blackboard/utils/PointUtils;

    invoke-virtual {v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    move-result v5

    invoke-virtual {v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    move-result v1

    invoke-virtual {v4, v5, v1, v0}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v1

    .line 8
    iget v5, v1, Landroid/graphics/PointF;->y:F

    invoke-static {v3}, Lcom/zykj/blackboard/core/action/CursorAction;->access$getOffsetForFinger$p(Lcom/zykj/blackboard/core/action/CursorAction;)F

    move-result v6

    sub-float/2addr v5, v6

    iput v5, v1, Landroid/graphics/PointF;->y:F

    .line 9
    invoke-static {v3}, Lcom/zykj/blackboard/core/action/CursorAction;->access$getTempPointF$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/PointF;

    move-result-object v3

    invoke-static {v0}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v4, v1, v0}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->r()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-static {v1}, Lcom/zykj/blackboard/core/action/CursorAction;->access$getTempPointF$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/PointF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/PointF;->x:F

    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->B(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-static {v1}, Lcom/zykj/blackboard/core/action/CursorAction;->access$getTempPointF$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/PointF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->C(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    const-string v1, "event.toBuilder().setX(t\u2026etY(tempPointF.y).build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    :goto_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-static {v1}, Lcom/zykj/blackboard/core/action/CursorAction;->access$getTempPath$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/Path;

    move-result-object v1

    .line 12
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-static {v3}, Lcom/zykj/blackboard/core/action/CursorAction;->access$getTempPointF$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/PointF;

    move-result-object v3

    iget v3, v3, Landroid/graphics/PointF;->x:F

    .line 13
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-static {v4}, Lcom/zykj/blackboard/core/action/CursorAction;->access$getTempPointF$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/PointF;

    move-result-object v4

    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 14
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-virtual {v5}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {v5}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    move-result-object v5

    if-nez v5, :cond_4

    :cond_3
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    :cond_4
    iget-object v6, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-static {v6}, Lcom/zykj/blackboard/core/action/CursorAction;->access$getMPaint$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/Paint;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v6

    int-to-float v2, v2

    div-float/2addr v6, v2

    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->mapRadius(F)F

    move-result v2

    .line 15
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 16
    invoke-virtual {v1, v3, v4, v2, v5}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 17
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v2, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-static {v2}, Lcom/zykj/blackboard/core/action/CursorAction;->access$getTempPath$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/Path;

    move-result-object v2

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-static {v3}, Lcom/zykj/blackboard/core/action/CursorAction;->access$getMPaint$p(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/Paint;

    move-result-object v3

    iget-object v4, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-virtual {v4}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    move-result-object v4

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    :goto_1
    invoke-interface {v1, v2, v3, v4}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 18
    :cond_6
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;->this$0:Lcom/zykj/blackboard/core/action/CursorAction;

    invoke-static {v1}, Lcom/zykj/blackboard/core/action/CursorAction;->access$getEventList$p(Lcom/zykj/blackboard/core/action/CursorAction;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
