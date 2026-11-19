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
.field public a:Landroid/content/Context;

.field public b:Landroid/widget/PopupWindow;

.field public c:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

.field public d:Landroid/view/View;

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:Landroid/view/WindowManager;

.field public g:Landroid/widget/PopupWindow$OnDismissListener;

.field public h:Landroid/graphics/Point;

.field public i:I

.field public j:I

.field public k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->e:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Point;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->h:Landroid/graphics/Point;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->i:I

    .line 16
    .line 17
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->j:I

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->k:Z

    .line 21
    .line 22
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->a:Landroid/content/Context;

    .line 23
    .line 24
    new-instance v0, Landroid/widget/PopupWindow;

    .line 25
    .line 26
    invoke-direct {v0, p1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 30
    .line 31
    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$a;

    .line 32
    .line 33
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$a;-><init>(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 37
    .line 38
    .line 39
    const-string v0, "window"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Landroid/view/WindowManager;

    .line 46
    .line 47
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->f:Landroid/view/WindowManager;

    .line 48
    .line 49
    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;)Landroid/widget/PopupWindow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;)Landroid/widget/PopupWindow$OnDismissListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->g:Landroid/widget/PopupWindow$OnDismissListener;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Landroid/widget/PopupWindow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->d:Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-virtual {v0, v1, v1}, Landroid/view/View;->measure(II)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->d:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->j:I

    .line 14
    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->d:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->i:I

    .line 22
    .line 23
    return-void
.end method

.method public h(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    return-void
.end method

.method public i()V
    .locals 0

    .line 1
    return-void
.end method

.method public j()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract k(Landroid/view/View;)Landroid/graphics/Point;
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->c:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->j()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->e:Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 13
    .line 14
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 30
    .line 31
    const/4 v1, -0x2

    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 57
    .line 58
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->c:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string v1, "setContentView was not called with a view to display."

    .line 67
    .line 68
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0
.end method

.method public m(Landroid/view/View;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;-><init>(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->c:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

    .line 11
    .line 12
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 13
    .line 14
    const/4 v2, -0x2

    .line 15
    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->d:Landroid/view/View;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->c:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 29
    .line 30
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->c:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$RootView;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 36
    .line 37
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$c;

    .line 38
    .line 39
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$c;-><init>(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "setContentView was not called with a view to display."

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method

.method public final n(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->o(Landroid/view/View;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final o(Landroid/view/View;Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->f:Landroid/view/WindowManager;

    .line 5
    .line 6
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->h:Landroid/graphics/Point;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->j:I

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->i:I

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->k:Z

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->g()V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->k(Landroid/view/View;)Landroid/graphics/Point;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->b:Landroid/widget/PopupWindow;

    .line 35
    .line 36
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 37
    .line 38
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 42
    .line 43
    .line 44
    new-instance p1, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$b;

    .line 45
    .line 46
    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$b;-><init>(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
