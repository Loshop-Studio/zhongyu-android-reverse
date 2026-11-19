.class public Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;
.super Landroidx/appcompat/widget/AppCompatEditText;
.source "SourceFile"


# instance fields
.field public final a:Lm2/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Lm2/b;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 3
    invoke-direct {p1, v0, v1}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->a:Lm2/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    new-instance p1, Lm2/b;

    const/4 p2, 0x0

    const/4 v0, 0x1

    .line 7
    invoke-direct {p1, p2, v0}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 8
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->a:Lm2/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 10
    new-instance p1, Lm2/b;

    const/4 p2, 0x0

    const/4 p3, 0x1

    .line 11
    invoke-direct {p1, p2, p3}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 12
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->a:Lm2/b;

    return-void
.end method


# virtual methods
.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->a:Lm2/b;

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->setTarget(Landroid/view/inputmethod/InputConnection;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->a:Lm2/b;

    .line 11
    .line 12
    return-object p1
.end method

.method public setBackSpaceListener(Lm2/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->a:Lm2/b;

    .line 2
    .line 3
    iput-object p1, v0, Lm2/b;->a:Lm2/a;

    .line 4
    .line 5
    return-void
.end method
