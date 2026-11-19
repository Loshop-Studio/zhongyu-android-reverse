.class public Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection$BackspaceListener;
    }
.end annotation


# instance fields
.field private mBackspaceListener:Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection$BackspaceListener;


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/InputConnection;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    return-void
.end method


# virtual methods
.method public deleteSurroundingText(II)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection;->mBackspaceListener:Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection$BackspaceListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection$BackspaceListener;->onBackspace()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 3
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    move-result p1

    return p1
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x43

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection;->mBackspaceListener:Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection$BackspaceListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection$BackspaceListener;->onBackspace()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 3
    :cond_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public setBackspaceListener(Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection$BackspaceListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection;->mBackspaceListener:Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection$BackspaceListener;

    return-void
.end method
