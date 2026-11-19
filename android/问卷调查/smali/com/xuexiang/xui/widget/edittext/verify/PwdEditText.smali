.class public Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;
.super Landroidx/appcompat/widget/AppCompatEditText;
.source ""


# instance fields
.field public b:Lb/c/a/e/e/b/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1
    new-instance p1, Lb/c/a/e/e/b/a;

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Lb/c/a/e/e/b/a;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->b:Lb/c/a/e/e/b/a;

    return-void
.end method


# virtual methods
.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->b:Lb/c/a/e/e/b/a;

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->setTarget(Landroid/view/inputmethod/InputConnection;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->b:Lb/c/a/e/e/b/a;

    return-object p1
.end method

.method public setBackSpaceListener(Lb/c/a/e/e/b/a$a;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->b:Lb/c/a/e/e/b/a;

    .line 1
    iput-object p1, v0, Lb/c/a/e/e/b/a;->a:Lb/c/a/e/e/b/a$a;

    return-void
.end method
