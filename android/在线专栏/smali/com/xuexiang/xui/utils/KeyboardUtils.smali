.class public Lcom/xuexiang/xui/utils/KeyboardUtils;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;
    }
.end annotation


# static fields
.field private static sListenerMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;",
            "Lcom/xuexiang/xui/utils/KeyboardUtils;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mCallback:Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;

.field private mRootView:Landroid/view/ViewGroup;

.field private prevValue:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/xuexiang/xui/utils/KeyboardUtils;->sListenerMap:Ljava/util/HashMap;

    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/utils/KeyboardUtils;->prevValue:Ljava/lang/Boolean;

    .line 3
    iput-object p2, p0, Lcom/xuexiang/xui/utils/KeyboardUtils;->mCallback:Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;

    .line 4
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/xuexiang/xui/utils/KeyboardUtils;->mRootView:Landroid/view/ViewGroup;

    .line 5
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method private constructor <init>(Landroid/view/ViewGroup;Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/utils/KeyboardUtils;->prevValue:Ljava/lang/Boolean;

    .line 8
    iput-object p2, p0, Lcom/xuexiang/xui/utils/KeyboardUtils;->mCallback:Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;

    .line 9
    iput-object p1, p0, Lcom/xuexiang/xui/utils/KeyboardUtils;->mRootView:Landroid/view/ViewGroup;

    .line 10
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public static addKeyboardToggleListener(Landroid/app/Activity;Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/xuexiang/xui/utils/KeyboardUtils;->removeKeyboardToggleListener(Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;)V

    .line 2
    sget-object v0, Lcom/xuexiang/xui/utils/KeyboardUtils;->sListenerMap:Ljava/util/HashMap;

    new-instance v1, Lcom/xuexiang/xui/utils/KeyboardUtils;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/utils/KeyboardUtils;-><init>(Landroid/app/Activity;Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static addKeyboardToggleListener(Landroid/view/ViewGroup;Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;)V
    .locals 2

    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/utils/KeyboardUtils;->removeKeyboardToggleListener(Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;)V

    .line 4
    sget-object v0, Lcom/xuexiang/xui/utils/KeyboardUtils;->sListenerMap:Ljava/util/HashMap;

    new-instance v1, Lcom/xuexiang/xui/utils/KeyboardUtils;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/utils/KeyboardUtils;-><init>(Landroid/view/ViewGroup;Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static dispatchTouchEvent(Landroid/view/MotionEvent;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/xuexiang/xui/utils/KeyboardUtils;->dispatchTouchEvent(Landroid/view/MotionEvent;Landroid/view/Window;)V

    return-void
.end method

.method public static dispatchTouchEvent(Landroid/view/MotionEvent;Landroid/app/Dialog;)V
    .locals 0

    .line 2
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/xuexiang/xui/utils/KeyboardUtils;->dispatchTouchEvent(Landroid/view/MotionEvent;Landroid/view/Window;)V

    return-void
.end method

.method public static dispatchTouchEvent(Landroid/view/MotionEvent;Landroid/view/Window;)V
    .locals 1

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 4
    invoke-static {p1, p0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->isShouldHideKeyboard(Landroid/view/Window;Landroid/view/MotionEvent;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 5
    invoke-virtual {p1}, Landroid/view/Window;->getCurrentFocus()Landroid/view/View;

    move-result-object p0

    invoke-static {p0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->hideSoftInputClearFocus(Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private static findTouchEditText(Landroid/view/ViewGroup;Landroid/view/MotionEvent;)Landroid/view/View;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 1
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_5

    .line 2
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 3
    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    invoke-static {v2, p1}, Lcom/xuexiang/xui/utils/KeyboardUtils;->isTouchView(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    .line 5
    :cond_2
    instance-of v3, v2, Landroid/widget/EditText;

    if-eqz v3, :cond_3

    return-object v2

    .line 6
    :cond_3
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_4

    .line 7
    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, p1}, Lcom/xuexiang/xui/utils/KeyboardUtils;->findTouchEditText(Landroid/view/ViewGroup;Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    return-object v0
.end method

.method public static fixSoftInputLeaks(Landroid/content/Context;)V
    .locals 7

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "input_method"

    .line 1
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x3

    const-string v2, "mCurRootView"

    const-string v3, "mServedView"

    const-string v4, "mNextServedView"

    .line 2
    filled-new-array {v2, v3, v4}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_5

    .line 3
    aget-object v4, v2, v3

    .line 4
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 5
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->isAccessible()Z

    move-result v5

    if-nez v5, :cond_2

    const/4 v5, 0x1

    .line 6
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 7
    :cond_2
    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 8
    instance-of v6, v5, Landroid/view/View;

    if-nez v6, :cond_3

    goto :goto_1

    .line 9
    :cond_3
    check-cast v5, Landroid/view/View;

    .line 10
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    if-ne v5, p0, :cond_4

    const/4 v5, 0x0

    .line 11
    invoke-virtual {v4, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_4
    return-void

    :catchall_0
    move-exception v4

    .line 12
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public static forceCloseKeyboard(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void
.end method

.method public static hideSoftInput(Landroid/app/Dialog;)V
    .locals 2

    .line 5
    invoke-virtual {p0}, Landroid/app/Dialog;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 6
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 8
    :cond_0
    invoke-static {v0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->hideSoftInput(Landroid/view/View;)V

    return-void
.end method

.method public static hideSoftInput(Landroid/content/DialogInterface;)V
    .locals 1

    .line 3
    instance-of v0, p0, Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 4
    check-cast p0, Landroid/app/Dialog;

    invoke-static {p0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->hideSoftInput(Landroid/app/Dialog;)V

    :cond_0
    return-void
.end method

.method public static hideSoftInput(Landroid/view/View;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-nez v0, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void
.end method

.method public static hideSoftInputClearFocus(Landroid/view/View;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-nez v0, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 3
    instance-of v0, p0, Landroid/widget/EditText;

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->clearFocus()V

    :cond_2
    return-void
.end method

.method public static isShouldHideKeyboard(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/widget/EditText;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    invoke-static {p0, p1}, Lcom/xuexiang/xui/utils/KeyboardUtils;->isTouchView(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static isShouldHideKeyboard(Landroid/view/Window;Landroid/view/MotionEvent;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->isSoftInputShow(Landroid/view/Window;)Z

    move-result v1

    if-nez v1, :cond_1

    return v0

    .line 4
    :cond_1
    invoke-virtual {p0}, Landroid/view/Window;->getCurrentFocus()Landroid/view/View;

    move-result-object v1

    instance-of v1, v1, Landroid/widget/EditText;

    if-nez v1, :cond_2

    return v0

    .line 5
    :cond_2
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    .line 6
    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_3

    .line 7
    check-cast p0, Landroid/view/ViewGroup;

    invoke-static {p0, p1}, Lcom/xuexiang/xui/utils/KeyboardUtils;->findTouchEditText(Landroid/view/ViewGroup;Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object p0

    if-nez p0, :cond_3

    const/4 v0, 0x1

    :cond_3
    :goto_0
    return v0
.end method

.method public static isSoftInputShow(Landroid/app/Activity;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->isSoftInputShow(Landroid/view/Window;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isSoftInputShow(Landroid/view/ViewGroup;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    .line 5
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 6
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 7
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/xuexiang/xui/utils/DensityUtils;->getNavigationBarHeight(Landroid/content/Context;)I

    move-result p0

    sub-int/2addr v1, p0

    if-lez v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public static isSoftInputShow(Landroid/view/Window;)Z
    .locals 1

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    invoke-static {p0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->isSoftInputShow(Landroid/view/ViewGroup;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static isTouchView(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 1
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v2, v1, v0

    const/4 v3, 0x1

    aget v1, v1, v3

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    add-int/2addr v4, v2

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    add-int/2addr p0, v1

    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    int-to-float v1, v1

    cmpl-float v1, v5, v1

    if-ltz v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    int-to-float p0, p0

    cmpg-float p0, v1, p0

    if-gtz p0, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p0

    int-to-float v1, v2

    cmpl-float p0, p0, v1

    if-ltz p0, :cond_1

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p0

    int-to-float p1, v4

    cmpg-float p0, p0, p1

    if-gtz p0, :cond_1

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method

.method public static onDisableBackKeyDown(I)Z
    .locals 1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static removeAllKeyboardToggleListeners()V
    .locals 3

    .line 1
    sget-object v0, Lcom/xuexiang/xui/utils/KeyboardUtils;->sListenerMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;

    .line 2
    sget-object v2, Lcom/xuexiang/xui/utils/KeyboardUtils;->sListenerMap:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/utils/KeyboardUtils;

    if-eqz v1, :cond_0

    .line 3
    invoke-direct {v1}, Lcom/xuexiang/xui/utils/KeyboardUtils;->removeListener()V

    goto :goto_0

    .line 4
    :cond_1
    sget-object v0, Lcom/xuexiang/xui/utils/KeyboardUtils;->sListenerMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public static removeKeyboardToggleListener(Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/utils/KeyboardUtils;->sListenerMap:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    sget-object v0, Lcom/xuexiang/xui/utils/KeyboardUtils;->sListenerMap:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/utils/KeyboardUtils;

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {v0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->removeListener()V

    .line 4
    :cond_0
    sget-object v0, Lcom/xuexiang/xui/utils/KeyboardUtils;->sListenerMap:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private removeListener()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/xuexiang/xui/utils/KeyboardUtils;->mCallback:Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/utils/KeyboardUtils;->mRootView:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public static setSoftInputAdjustNothing(Landroid/app/Activity;)V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const/16 v0, 0x32

    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    return-void
.end method

.method public static setSoftInputAdjustPan(Landroid/app/Activity;)V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    return-void
.end method

.method public static setSoftInputAdjustResize(Landroid/app/Activity;)V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    return-void
.end method

.method public static showSoftInput(Landroid/widget/EditText;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x2

    .line 2
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    return-void
.end method

.method public static showSoftInputForce(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->isSoftInputShow(Landroid/app/Activity;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 2
    invoke-static {}, Lcom/xuexiang/xui/utils/KeyboardUtils;->toggleSoftInput()V

    :cond_0
    return-void
.end method

.method public static toggleKeyboardVisibility(Landroid/content/Context;)V
    .locals 2

    const-string v0, "input_method"

    .line 1
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    return-void
.end method

.method public static toggleSoftInput()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/utils/KeyboardUtils;->mRootView:Landroid/view/ViewGroup;

    invoke-static {v0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->isSoftInputShow(Landroid/view/ViewGroup;)Z

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/utils/KeyboardUtils;->mCallback:Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/xuexiang/xui/utils/KeyboardUtils;->prevValue:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v0, v1, :cond_1

    .line 3
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/xuexiang/xui/utils/KeyboardUtils;->prevValue:Ljava/lang/Boolean;

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/utils/KeyboardUtils;->mCallback:Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;

    invoke-interface {v1, v0}, Lcom/xuexiang/xui/utils/KeyboardUtils$SoftKeyboardToggleListener;->onToggleSoftKeyboard(Z)V

    :cond_1
    return-void
.end method
