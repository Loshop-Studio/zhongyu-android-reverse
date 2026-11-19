.class public Lb/c/a/e/e/b/a;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/c/a/e/e/b/a$a;
    }
.end annotation


# instance fields
.field public a:Lb/c/a/e/e/b/a$a;


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/InputConnection;Z)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    return-void
.end method


# virtual methods
.method public deleteSurroundingText(II)Z
    .locals 1

    iget-object v0, p0, Lb/c/a/e/e/b/a;->a:Lb/c/a/e/e/b/a$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lb/c/a/e/e/b/a$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    move-result p1

    return p1
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x43

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb/c/a/e/e/b/a;->a:Lb/c/a/e/e/b/a$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lb/c/a/e/e/b/a$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
