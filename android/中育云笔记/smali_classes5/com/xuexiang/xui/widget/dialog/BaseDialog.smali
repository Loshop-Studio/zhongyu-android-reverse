.class public Lcom/xuexiang/xui/widget/dialog/BaseDialog;
.super Landroidx/appcompat/app/AppCompatDialog;
.source "SourceFile"


# instance fields
.field public c:Landroid/view/View;


# virtual methods
.method public findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->c:Landroid/view/View;

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
    invoke-static {p1, p0}, Lcom/xuexiang/xui/utils/e;->b(Landroid/view/MotionEvent;Landroid/app/Dialog;)V

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
