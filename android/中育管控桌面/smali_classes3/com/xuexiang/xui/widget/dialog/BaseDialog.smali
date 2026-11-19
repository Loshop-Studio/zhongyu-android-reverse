.class public Lcom/xuexiang/xui/widget/dialog/BaseDialog;
.super Landroidx/appcompat/app/AppCompatDialog;
.source "SourceFile"


# instance fields
.field public a:Landroid/view/View;

.field public b:Z


# virtual methods
.method public b()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lcom/xuexiang/xui/utils/i;->a(Landroid/content/Context;)Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/xuexiang/xui/widget/dialog/BaseDialog$a;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/dialog/BaseDialog$a;-><init>(Lcom/xuexiang/xui/widget/dialog/BaseDialog;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/utils/f;->b(Landroid/app/Activity;Landroid/view/Window;Lcom/xuexiang/xui/utils/f$a;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->b()V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->b()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lcom/xuexiang/xui/utils/d;->a(Landroid/view/MotionEvent;Landroid/app/Dialog;)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/app/Dialog;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public show()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->b:Z

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->c(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
