.class public final Ll4/m;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/dialog/WebViewShotDialog;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/dialog/WebViewShotDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll4/m;->a:Lcom/zykj/mistake/dialog/WebViewShotDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p2, "javascript:function setTop(){document.querySelector(\'.toolBar\').style.display=\"none\";document.getElementsByTagName(\"body\")[0].style.paddingBottom=0;document.getElementsByTagName(\"html\")[0].style.paddingBottom=0;}setTop();"

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, Ll4/m;->a:Lcom/zykj/mistake/dialog/WebViewShotDialog;

    .line 9
    .line 10
    iget-boolean p2, p1, Lcom/zykj/mistake/dialog/WebViewShotDialog;->h:Z

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->e:Landroid/widget/TextView;

    .line 21
    .line 22
    const-string p2, "\u52a0\u8f7d\u5931\u8d25"

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 33
    .line 34
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->e:Landroid/widget/TextView;

    .line 35
    .line 36
    const/16 p2, 0x8

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Ll4/m;->a:Lcom/zykj/mistake/dialog/WebViewShotDialog;

    .line 5
    .line 6
    const/4 p4, 0x1

    .line 7
    iput-boolean p4, p3, Lcom/zykj/mistake/dialog/WebViewShotDialog;->h:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string p4, "file:///android_asset/error.html?code="

    .line 14
    .line 15
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method
