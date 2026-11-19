.class public final Lcom/xuexiang/xui/widget/searchview/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/d;->a:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    sget p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->t:I

    .line 2
    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/d;->a:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    .line 4
    .line 5
    iget-object p2, p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-static {p2}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-lez p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->a()V

    .line 20
    .line 21
    .line 22
    iget-object p1, p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    const/4 p1, 0x1

    .line 29
    return p1
.end method
