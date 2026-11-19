.class Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$GestureListener;,
        Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;,
        Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnMultiTouchListener;,
        Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;,
        Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;
    }
.end annotation


# static fields
.field private static final INVALID_POINTER_ID:I = -0x1


# instance fields
.field private deleteView:Landroid/view/View;

.field private isTranslateEnabled:Z

.field private location:[I

.field private mActivePointerId:I

.field private final mGestureListener:Landroid/view/GestureDetector;

.field private mIsTextPinchZoomable:Z

.field private mOnGestureControl:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;

.field private mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

.field private mPrevX:F

.field private mPrevY:F

.field private mScaleGestureDetector:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;

.field private onMultiTouchListener:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnMultiTouchListener;

.field private outRect:Landroid/graphics/Rect;

.field private photoEditImageView:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/widget/RelativeLayout;Landroid/widget/ImageView;ZLcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x1

    .line 2
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->isTranslateEnabled:Z

    const/4 p2, -0x1

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mActivePointerId:I

    const/4 p2, 0x2

    new-array p2, p2, [I

    .line 4
    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->location:[I

    .line 5
    iput-boolean p4, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mIsTextPinchZoomable:Z

    .line 6
    new-instance p2, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;

    new-instance p4, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;

    const/4 v0, 0x0

    invoke-direct {p4, p0, v0}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$ScaleGestureListener;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$1;)V

    invoke-direct {p2, p4}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mScaleGestureDetector:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;

    .line 7
    new-instance p2, Landroid/view/GestureDetector;

    new-instance p4, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$GestureListener;

    invoke-direct {p4, p0, v0}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$GestureListener;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$1;)V

    invoke-direct {p2, p4}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mGestureListener:Landroid/view/GestureDetector;

    .line 8
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->deleteView:Landroid/view/View;

    .line 9
    iput-object p3, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->photoEditImageView:Landroid/widget/ImageView;

    .line 10
    iput-object p5, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    if-eqz p1, :cond_0

    .line 11
    new-instance p2, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p4

    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result p5

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    invoke-direct {p2, p3, p4, p5, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->outRect:Landroid/graphics/Rect;

    goto :goto_0

    .line 13
    :cond_0
    new-instance p1, Landroid/graphics/Rect;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p2, p2, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->outRect:Landroid/graphics/Rect;

    :goto_0
    return-void
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mIsTextPinchZoomable:Z

    return p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->isTranslateEnabled:Z

    return p0
.end method

.method static synthetic access$500(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->move(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;)V

    return-void
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mOnGestureControl:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;

    return-object p0
.end method

.method private static adjustAngle(F)F
    .locals 2

    const/high16 v0, 0x43b40000    # 360.0f

    const/high16 v1, 0x43340000    # 180.0f

    cmpl-float v1, p0, v1

    if-lez v1, :cond_0

    sub-float/2addr p0, v0

    goto :goto_0

    :cond_0
    const/high16 v1, -0x3ccc0000    # -180.0f

    cmpg-float v1, p0, v1

    if-gez v1, :cond_1

    add-float/2addr p0, v0

    :cond_1
    :goto_0
    return p0
.end method

.method private static adjustTranslation(Landroid/view/View;FF)V
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x1

    aput p2, v0, p1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapVectors([F)V

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    move-result p2

    aget v1, v0, v1

    add-float/2addr p2, v1

    invoke-virtual {p0, p2}, Landroid/view/View;->setTranslationX(F)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    move-result p2

    aget p1, v0, p1

    add-float/2addr p2, p1

    invoke-virtual {p0, p2}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method private static computeRenderOffset(Landroid/view/View;FF)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPivotX()F

    move-result v0

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getPivotY()F

    move-result v0

    cmpl-float v0, v0, p2

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x2

    new-array v1, v0, [F

    .line 2
    fill-array-data v1, :array_0

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 4
    invoke-virtual {p0, p1}, Landroid/view/View;->setPivotX(F)V

    .line 5
    invoke-virtual {p0, p2}, Landroid/view/View;->setPivotY(F)V

    new-array p1, v0, [F

    .line 6
    fill-array-data p1, :array_1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    const/4 p2, 0x0

    aget v0, p1, p2

    aget p2, v1, p2

    sub-float/2addr v0, p2

    const/4 p2, 0x1

    aget p1, p1, p2

    aget p2, v1, p2

    sub-float/2addr p1, p2

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    move-result p2

    sub-float/2addr p2, v0

    invoke-virtual {p0, p2}, Landroid/view/View;->setTranslationX(F)V

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    move-result p2

    sub-float/2addr p2, p1

    invoke-virtual {p0, p2}, Landroid/view/View;->setTranslationY(F)V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method private firePhotoEditorSDKListener(Landroid/view/View;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    instance-of v0, v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-interface {v1, p1}, Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;->onStartViewChangeListener(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-interface {v1, p1}, Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;->onStopViewChangeListener(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private isViewInBounds(Landroid/view/View;II)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->outRect:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->location:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->outRect:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->location:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    const/4 v2, 0x1

    aget v0, v0, v2

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Rect;->offset(II)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->outRect:Landroid/graphics/Rect;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Rect;->contains(II)Z

    move-result p1

    return p1
.end method

.method private static move(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;)V
    .locals 3

    .line 1
    iget v0, p1, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->pivotX:F

    iget v1, p1, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->pivotY:F

    invoke-static {p0, v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->computeRenderOffset(Landroid/view/View;FF)V

    .line 2
    iget v0, p1, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->deltaX:F

    iget v1, p1, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->deltaY:F

    invoke-static {p0, v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->adjustTranslation(Landroid/view/View;FF)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result v0

    iget v1, p1, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->deltaScale:F

    mul-float v0, v0, v1

    .line 4
    iget v1, p1, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->minimumScale:F

    iget v2, p1, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->maximumScale:F

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleX(F)V

    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleY(F)V

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getRotation()F

    move-result v0

    iget p1, p1, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$TransformInfo;->deltaAngle:F

    add-float/2addr v0, p1

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->adjustAngle(F)F

    move-result p1

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->setRotation(F)V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mScaleGestureDetector:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;

    invoke-virtual {v0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->onTouchEvent(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mGestureListener:Landroid/view/GestureDetector;

    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->isTranslateEnabled:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 4
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    float-to-int v2, v2

    .line 6
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    float-to-int v3, v3

    .line 7
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    and-int/2addr v4, v0

    const/4 v5, 0x0

    if-eqz v4, :cond_9

    const/16 v6, 0x8

    const/4 v7, -0x1

    if-eq v4, v1, :cond_5

    const/4 v2, 0x2

    if-eq v4, v2, :cond_4

    const/4 p1, 0x3

    if-eq v4, p1, :cond_3

    const/4 p1, 0x6

    if-eq v4, p1, :cond_1

    goto/16 :goto_1

    :cond_1
    const p1, 0xff00

    and-int/2addr p1, v0

    shr-int/2addr p1, v6

    .line 8
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    .line 9
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mActivePointerId:I

    if-ne v0, v2, :cond_b

    if-nez p1, :cond_2

    const/4 v5, 0x1

    .line 10
    :cond_2
    invoke-virtual {p2, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mPrevX:F

    .line 11
    invoke-virtual {p2, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mPrevY:F

    .line 12
    invoke-virtual {p2, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mActivePointerId:I

    goto/16 :goto_1

    .line 13
    :cond_3
    iput v7, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mActivePointerId:I

    goto/16 :goto_1

    .line 14
    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mActivePointerId:I

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-eq v0, v7, :cond_b

    .line 15
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    .line 16
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p2

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mScaleGestureDetector:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_b

    .line 18
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mPrevX:F

    sub-float/2addr v2, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mPrevY:F

    sub-float/2addr p2, v0

    invoke-static {p1, v2, p2}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->adjustTranslation(Landroid/view/View;FF)V

    goto :goto_1

    .line 19
    :cond_5
    iput v7, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mActivePointerId:I

    .line 20
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->deleteView:Landroid/view/View;

    if-eqz p2, :cond_6

    invoke-direct {p0, p2, v2, v3}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->isViewInBounds(Landroid/view/View;II)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 21
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->onMultiTouchListener:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnMultiTouchListener;

    if-eqz p2, :cond_7

    .line 22
    invoke-interface {p2, p1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnMultiTouchListener;->onRemoveViewListener(Landroid/view/View;)V

    goto :goto_0

    .line 23
    :cond_6
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->photoEditImageView:Landroid/widget/ImageView;

    invoke-direct {p0, p2, v2, v3}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->isViewInBounds(Landroid/view/View;II)Z

    move-result p2

    if-nez p2, :cond_7

    .line 24
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 25
    :cond_7
    :goto_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->deleteView:Landroid/view/View;

    if-eqz p2, :cond_8

    .line 26
    invoke-virtual {p2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 27
    :cond_8
    invoke-direct {p0, p1, v5}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->firePhotoEditorSDKListener(Landroid/view/View;Z)V

    goto :goto_1

    .line 28
    :cond_9
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mPrevX:F

    .line 29
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mPrevY:F

    .line 30
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 31
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 32
    invoke-virtual {p2, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mActivePointerId:I

    .line 33
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->deleteView:Landroid/view/View;

    if-eqz p2, :cond_a

    .line 34
    invoke-virtual {p2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 35
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->bringToFront()V

    .line 36
    invoke-direct {p0, p1, v1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->firePhotoEditorSDKListener(Landroid/view/View;Z)V

    :cond_b
    :goto_1
    return v1
.end method

.method setOnGestureControl(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->mOnGestureControl:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;

    return-void
.end method

.method setOnMultiTouchListener(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnMultiTouchListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->onMultiTouchListener:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnMultiTouchListener;

    return-void
.end method
