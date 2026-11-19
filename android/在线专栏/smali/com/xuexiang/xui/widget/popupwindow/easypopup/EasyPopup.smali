.class public Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$OnAttachedWindowListener;
    }
.end annotation


# static fields
.field private static final DEFAULT_DIM:F = 0.7f


# instance fields
.field protected isBackgroundDim:Z

.field private isOnlyGetWH:Z

.field private mAnchorView:Landroid/view/View;

.field protected mAnimationStyle:I

.field protected mContentView:Landroid/view/View;

.field private mContext:Landroid/content/Context;

.field protected mDimColor:I

.field protected mDimValue:F

.field protected mDimView:Landroid/view/ViewGroup;

.field protected mEnterTransition:Landroid/transition/Transition;

.field protected mExitTransition:Landroid/transition/Transition;

.field private mFocusAndOutsideEnable:Z

.field protected mFocusable:Z

.field protected mHeight:I

.field private mHorizontalGravity:I

.field private mIsShow:Z

.field protected mLayoutId:I

.field private mOffsetX:I

.field private mOffsetY:I

.field private mOnAttachedWindowListener:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$OnAttachedWindowListener;

.field private mOnDismissListener:Landroid/widget/PopupWindow$OnDismissListener;

.field private final mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field protected mOutsideTouchable:Z

.field private mPopupWindow:Landroid/widget/PopupWindow;

.field private mVerticalGravity:I

.field protected mWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mFocusable:Z

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOutsideTouchable:Z

    const v1, 0x3f333333    # 0.7f

    .line 4
    iput v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mDimValue:F

    const/high16 v1, -0x1000000

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mDimColor:I

    const/4 v1, 0x2

    .line 6
    iput v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mVerticalGravity:I

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mHorizontalGravity:I

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->isOnlyGetWH:Z

    .line 9
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;-><init>(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 10
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mContext:Landroid/content/Context;

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)Landroid/widget/PopupWindow;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$OnAttachedWindowListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOnAttachedWindowListener:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$OnAttachedWindowListener;

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->isOnlyGetWH:Z

    return p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->removeGlobalLayoutListener()V

    return-void
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mAnchorView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mVerticalGravity:I

    return p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mHorizontalGravity:I

    return p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetX:I

    return p0
.end method

.method static synthetic access$800(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetY:I

    return p0
.end method

.method static synthetic access$900(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;IILandroid/view/View;IIII)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->updateLocation(IILandroid/view/View;IIII)V

    return-void
.end method

.method private addGlobalLayoutListener(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method private applyDim(Landroid/app/Activity;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 2
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mDimColor:I

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 3
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mDimValue:F

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float v1, v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 5
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p1

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/ViewGroupOverlay;->add(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private applyDim(Landroid/view/ViewGroup;)V
    .locals 4

    .line 7
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mDimColor:I

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 8
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 9
    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mDimValue:F

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float v1, v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 10
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p1

    .line 11
    invoke-virtual {p1, v0}, Landroid/view/ViewGroupOverlay;->add(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private calculateX(Landroid/view/View;III)I
    .locals 2

    const/4 v0, 0x2

    if-eqz p2, :cond_3

    const/4 v1, 0x1

    if-eq p2, v1, :cond_2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    goto :goto_2

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    sub-int/2addr p3, p1

    goto :goto_0

    .line 2
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    goto :goto_1

    :cond_2
    :goto_0
    sub-int/2addr p4, p3

    goto :goto_2

    .line 3
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    div-int/2addr p1, v0

    div-int/2addr p3, v0

    sub-int/2addr p1, p3

    :goto_1
    add-int/2addr p4, p1

    :goto_2
    return p4
.end method

.method private calculateY(Landroid/view/View;III)I
    .locals 1

    if-eqz p2, :cond_3

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-eq p2, v0, :cond_0

    const/4 p1, 0x4

    if-eq p2, p1, :cond_2

    goto :goto_1

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    goto :goto_0

    .line 2
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr p3, p1

    :cond_2
    sub-int/2addr p4, p3

    goto :goto_1

    .line 3
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    div-int/lit8 p3, p3, 0x2

    add-int/2addr p1, p3

    :goto_0
    sub-int/2addr p4, p1

    :goto_1
    return p4
.end method

.method private clearBackgroundDim()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->isBackgroundDim:Z

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mDimView:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->clearDim(Landroid/view/ViewGroup;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->getContentView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 6
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->clearDim(Landroid/app/Activity;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private clearDim(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/view/ViewGroupOverlay;->clear()V

    return-void
.end method

.method private clearDim(Landroid/view/ViewGroup;)V
    .locals 0

    .line 4
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/view/ViewGroupOverlay;->clear()V

    return-void
.end method

.method private handleBackgroundDim()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->isBackgroundDim:Z

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mDimView:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->applyDim(Landroid/view/ViewGroup;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->getContentView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 6
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->applyDim(Landroid/app/Activity;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private handleDismiss()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOnDismissListener:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_0
    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mIsShow:Z

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->removeGlobalLayoutListener()V

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->clearBackgroundDim()V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 8
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->onPopupWindowDismiss()V

    return-void
.end method

.method private removeGlobalLayoutListener()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->getContentView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    return-void
.end method

.method private updateLocation(IILandroid/view/View;IIII)V
    .locals 6

    .line 1
    invoke-direct {p0, p3, p5, p1, p6}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->calculateX(Landroid/view/View;III)I

    move-result v2

    .line 2
    invoke-direct {p0, p3, p4, p2, p7}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->calculateY(Landroid/view/View;III)I

    move-result v3

    .line 3
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "updateLocation: x="

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p5, ",y="

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lcom/xuexiang/xui/logs/UILog;->i(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    move-object v1, p3

    move v4, p1

    move v5, p2

    invoke-virtual/range {v0 .. v5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    return-void
.end method


# virtual methods
.method public createPopup()Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/widget/PopupWindow;

    invoke-direct {v0}, Landroid/widget/PopupWindow;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->onPopupWindowCreated(Landroid/widget/PopupWindow;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mContentView:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mLayoutId:I

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mLayoutId:I

    invoke-virtual {v0, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mContentView:Landroid/view/View;

    goto :goto_0

    .line 7
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The content view is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mContentView:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mWidth:I

    const/4 v2, -0x2

    if-eqz v0, :cond_3

    .line 10
    iget-object v3, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    goto :goto_1

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 12
    :goto_1
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mHeight:I

    if-eqz v0, :cond_4

    .line 13
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v2, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_2

    .line 14
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 15
    :goto_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mContentView:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->onPopupWindowViewCreated(Landroid/view/View;)V

    .line 16
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mAnimationStyle:I

    if-eqz v0, :cond_5

    .line 17
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v2, v0}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 18
    :cond_5
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mFocusAndOutsideEnable:Z

    const/4 v2, 0x0

    if-nez v0, :cond_6

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 20
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$1;-><init>(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$2;-><init>(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    goto :goto_3

    .line 26
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mFocusable:Z

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 27
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOutsideTouchable:Z

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 29
    :goto_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 30
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_8

    .line 31
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mEnterTransition:Landroid/transition/Transition;

    if-eqz v0, :cond_7

    .line 32
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setEnterTransition(Landroid/transition/Transition;)V

    .line 33
    :cond_7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mExitTransition:Landroid/transition/Transition;

    if-eqz v0, :cond_8

    .line 34
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setExitTransition(Landroid/transition/Transition;)V

    :cond_8
    return-object p0
.end method

.method public dismiss()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mIsShow:Z

    :cond_0
    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public getPopupWindow()Landroid/widget/PopupWindow;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method public getView(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->getContentView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public isShow()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mIsShow:Z

    return v0
.end method

.method public onDismiss()V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->handleDismiss()V

    return-void
.end method

.method protected onPopupWindowCreated(Landroid/widget/PopupWindow;)V
    .locals 0

    return-void
.end method

.method protected onPopupWindowDismiss()V
    .locals 0

    return-void
.end method

.method protected onPopupWindowViewCreated(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public setAnchorView(Landroid/view/View;)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(",
            "Landroid/view/View;",
            ")TT;"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mAnchorView:Landroid/view/View;

    return-object p0
.end method

.method public setAnimationStyle(I)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(I)TT;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mAnimationStyle:I

    return-object p0
.end method

.method public setBackgroundDimEnable(Z)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(Z)TT;"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->isBackgroundDim:Z

    return-object p0
.end method

.method public setContentView(I)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(I)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mContentView:Landroid/view/View;

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mLayoutId:I

    return-object p0
.end method

.method public setContentView(III)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(III)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mContentView:Landroid/view/View;

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mLayoutId:I

    .line 11
    iput p2, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mWidth:I

    .line 12
    iput p3, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mHeight:I

    return-object p0
.end method

.method public setContentView(Landroid/view/View;)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(",
            "Landroid/view/View;",
            ")TT;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mContentView:Landroid/view/View;

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mLayoutId:I

    return-object p0
.end method

.method public setContentView(Landroid/view/View;II)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(",
            "Landroid/view/View;",
            "II)TT;"
        }
    .end annotation

    .line 5
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mContentView:Landroid/view/View;

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mLayoutId:I

    .line 7
    iput p2, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mWidth:I

    .line 8
    iput p3, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mHeight:I

    return-object p0
.end method

.method public setDimColor(I)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(I)TT;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mDimColor:I

    return-object p0
.end method

.method public setDimValue(F)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(F)TT;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mDimValue:F

    return-object p0
.end method

.method public setDimView(Landroid/view/ViewGroup;)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(",
            "Landroid/view/ViewGroup;",
            ")TT;"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mDimView:Landroid/view/ViewGroup;

    return-object p0
.end method

.method public setEnterTransition(Landroid/transition/Transition;)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(",
            "Landroid/transition/Transition;",
            ")TT;"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mEnterTransition:Landroid/transition/Transition;

    return-object p0
.end method

.method public setExitTransition(Landroid/transition/Transition;)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(",
            "Landroid/transition/Transition;",
            ")TT;"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mExitTransition:Landroid/transition/Transition;

    return-object p0
.end method

.method public setFocusAndOutsideEnable(Z)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(Z)TT;"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mFocusAndOutsideEnable:Z

    return-object p0
.end method

.method public setFocusable(Z)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(Z)TT;"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mFocusable:Z

    return-object p0
.end method

.method public setHeight(I)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(I)TT;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mHeight:I

    return-object p0
.end method

.method public setHorizontalGravity(I)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(I)TT;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mHorizontalGravity:I

    return-object p0
.end method

.method public setOffsetX(I)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(I)TT;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetX:I

    return-object p0
.end method

.method public setOffsetY(I)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(I)TT;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetY:I

    return-object p0
.end method

.method public setOnAttachedWindowListener(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$OnAttachedWindowListener;)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$OnAttachedWindowListener;",
            ")TT;"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOnAttachedWindowListener:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$OnAttachedWindowListener;

    return-object p0
.end method

.method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(",
            "Landroid/widget/PopupWindow$OnDismissListener;",
            ")TT;"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOnDismissListener:Landroid/widget/PopupWindow$OnDismissListener;

    return-object p0
.end method

.method public setOutsideTouchable(Z)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(Z)TT;"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOutsideTouchable:Z

    return-object p0
.end method

.method public setVerticalGravity(I)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(I)TT;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mVerticalGravity:I

    return-object p0
.end method

.method public setWidth(I)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;",
            ">(I)TT;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mWidth:I

    return-object p0
.end method

.method public showAsDropDown()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mAnchorView:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetX:I

    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetY:I

    invoke-virtual {p0, v0, v1, v2}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->showAsDropDown(Landroid/view/View;II)V

    return-void
.end method

.method public showAsDropDown(Landroid/view/View;)V
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    .line 12
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->handleBackgroundDim()V

    .line 13
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mAnchorView:Landroid/view/View;

    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->isOnlyGetWH:Z

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->addGlobalLayoutListener(Landroid/view/View;)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public showAsDropDown(Landroid/view/View;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->isOnlyGetWH:Z

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->handleBackgroundDim()V

    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mAnchorView:Landroid/view/View;

    .line 7
    iput p2, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetX:I

    .line 8
    iput p3, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetY:I

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->addGlobalLayoutListener(Landroid/view/View;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1, p2, p3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    :cond_0
    return-void
.end method

.method public showAsDropDown(Landroid/view/View;III)V
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    .line 18
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->handleBackgroundDim()V

    .line 19
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mAnchorView:Landroid/view/View;

    .line 20
    iput p2, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetX:I

    .line 21
    iput p3, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetY:I

    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->isOnlyGetWH:Z

    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->addGlobalLayoutListener(Landroid/view/View;)V

    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-static {v0, p1, p2, p3, p4}, Landroidx/core/widget/j;->c(Landroid/widget/PopupWindow;Landroid/view/View;III)V

    :cond_0
    return-void
.end method

.method public showAtAnchorView()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mAnchorView:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mVerticalGravity:I

    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mHorizontalGravity:I

    invoke-virtual {p0, v0, v1, v2}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->showAtAnchorView(Landroid/view/View;II)V

    return-void
.end method

.method public showAtAnchorView(Landroid/view/View;II)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    .line 3
    invoke-virtual/range {v0 .. v5}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->showAtAnchorView(Landroid/view/View;IIII)V

    return-void
.end method

.method public showAtAnchorView(Landroid/view/View;IIII)V
    .locals 3

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mAnchorView:Landroid/view/View;

    .line 6
    iput p4, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetX:I

    .line 7
    iput p5, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetY:I

    .line 8
    iput p2, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mVerticalGravity:I

    .line 9
    iput p3, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mHorizontalGravity:I

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->isOnlyGetWH:Z

    .line 11
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->handleBackgroundDim()V

    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->getContentView()Landroid/view/View;

    move-result-object v1

    .line 13
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->addGlobalLayoutListener(Landroid/view/View;)V

    .line 14
    invoke-virtual {v1, v0, v0}, Landroid/view/View;->measure(II)V

    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 17
    invoke-direct {p0, p1, p3, v2, p4}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->calculateX(Landroid/view/View;III)I

    move-result p3

    .line 18
    invoke-direct {p0, p1, p2, v1, p5}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->calculateY(Landroid/view/View;III)I

    move-result p2

    .line 19
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "showAtAnchorView: w="

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p5, ",y="

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lcom/xuexiang/xui/logs/UILog;->i(Ljava/lang/String;)V

    .line 20
    iget-object p4, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-static {p4, p1, p3, p2, v0}, Landroidx/core/widget/j;->c(Landroid/widget/PopupWindow;Landroid/view/View;III)V

    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mIsShow:Z

    return-void
.end method

.method public showAtLocation(Landroid/view/View;III)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->handleBackgroundDim()V

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mAnchorView:Landroid/view/View;

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetX:I

    .line 5
    iput p4, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mOffsetY:I

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->isOnlyGetWH:Z

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->addGlobalLayoutListener(Landroid/view/View;)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    :cond_0
    return-void
.end method
