.class public Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;
.super Landroidx/appcompat/widget/AppCompatEditText;
.source "SourceFile"


# instance fields
.field private mInputConnection:Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->init()V

    return-void
.end method

.method private init()V
    .locals 3

    new-instance v0, Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->mInputConnection:Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection;

    return-void
.end method


# virtual methods
.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->mInputConnection:Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection;

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->setTarget(Landroid/view/inputmethod/InputConnection;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->mInputConnection:Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection;

    return-object p1
.end method

.method public setBackSpaceListener(Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection$BackspaceListener;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->mInputConnection:Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection;->setBackspaceListener(Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection$BackspaceListener;)V

    return-void
.end method
