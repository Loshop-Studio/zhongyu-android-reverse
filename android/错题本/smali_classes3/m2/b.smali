.class public final Lm2/b;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "SourceFile"


# instance fields
.field public a:Lm2/a;


# virtual methods
.method public final deleteSurroundingText(II)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm2/b;->a:Lm2/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lo2/a;

    .line 6
    .line 7
    iget-object p1, v0, Lo2/a;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->a(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method public final sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x43

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lm2/b;->a:Lm2/a;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast v0, Lo2/a;

    .line 20
    .line 21
    iget-object p1, v0, Lo2/a;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->a(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method
