.class public abstract Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;
    }
.end annotation


# instance fields
.field protected mBackground:Landroid/graphics/drawable/Drawable;

.field private mContext:Landroid/content/Context;

.field private mDismissListener:Landroid/widget/PopupWindow$OnDismissListener;

.field private mNeedCacheSize:Z

.field private mPopupWindow:Landroid/widget/PopupWindow;

.field protected mRootView:Landroid/view/View;

.field private mRootViewWrapper:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

.field protected mScreenSize:Landroid/graphics/Point;

.field protected mWindowHeight:I

.field protected mWindowManager:Landroid/view/WindowManager;

.field protected mWindowWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mBackground:Landroid/graphics/drawable/Drawable;

    .line 3
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mScreenSize:Landroid/graphics/Point;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowHeight:I

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowWidth:I

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mNeedCacheSize:Z

    .line 7
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mContext:Landroid/content/Context;

    .line 8
    new-instance v0, Landroid/widget/PopupWindow;

    invoke-direct {v0, p1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    .line 9
    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$1;-><init>(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    const-string v0, "window"

    .line 10
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowManager:Landroid/view/WindowManager;

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;)Landroid/widget/PopupWindow;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;)Landroid/widget/PopupWindow$OnDismissListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mDismissListener:Landroid/widget/PopupWindow$OnDismissListener;

    return-object p0
.end method

.method private measureWindowSize()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mRootView:Landroid/view/View;

    const/4 v1, -0x2

    invoke-virtual {v0, v1, v1}, Landroid/view/View;->measure(II)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mRootView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowWidth:I

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mRootView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowHeight:I

    return-void
.end method

.method private preShow()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mRootViewWrapper:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->onPreShow()V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mBackground:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mRootViewWrapper:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    return-void

    .line 12
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "setContentView was not called with a view to display."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public getPopupWindow()Landroid/widget/PopupWindow;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method public isShowing()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method protected onDismiss()V
    .locals 0

    return-void
.end method

.method protected onPreShow()V
    .locals 0

    return-void
.end method

.method protected abstract onShow(Landroid/view/View;)Landroid/graphics/Point;
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mBackground:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setContentView(I)V
    .locals 2

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mContext:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mContext:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;-><init>(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mRootViewWrapper:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

    .line 2
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mRootView:Landroid/view/View;

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mRootViewWrapper:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mRootViewWrapper:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

    invoke-virtual {p1, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$3;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$3;-><init>(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;)V

    invoke-virtual {p1, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setContentView was not called with a view to display."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setNeedCacheSize(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mNeedCacheSize:Z

    return-void
.end method

.method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mDismissListener:Landroid/widget/PopupWindow$OnDismissListener;

    return-object p0
.end method

.method public final show(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->show(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public final show(Landroid/view/View;Landroid/view/View;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->preShow()V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowManager:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mScreenSize:Landroid/graphics/Point;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowWidth:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowHeight:I

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mNeedCacheSize:Z

    if-nez v0, :cond_1

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->measureWindowSize()V

    .line 7
    :cond_1
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->onShow(Landroid/view/View;)Landroid/graphics/Point;

    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mPopupWindow:Landroid/widget/PopupWindow;

    const/4 v2, 0x0

    iget v3, v0, Landroid/graphics/Point;->x:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-virtual {v1, p1, v2, v3, v0}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 9
    new-instance p1, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$2;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$2;-><init>(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method
