.class public final Le7/o0$b;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le7/o0;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Le7/o0;


# direct methods
.method public constructor <init>(Le7/o0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le7/o0$b;->a:Le7/o0;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Le7/o0;Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Le7/o0$b;->b(Le7/o0;Landroid/webkit/WebView;)V

    return-void
.end method

.method public static final b(Le7/o0;Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le7/o0;->getPageFinishListener()Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p2, "javascript:function setTop(){var toolBar = document.querySelector(\'.toolBar\');if(toolBar != null) toolBar.style.display=\"none\";document.querySelector(\"head\").innerHTML = document.querySelector(\'head\').innerHTML + \'<style lang=\"en\" type=\"text/css\">   body,html {       padding-bottom: 10px;   }</style>\';}setTop();"

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p2, p0, Le7/o0$b;->a:Le7/o0;

    .line 9
    .line 10
    new-instance v0, Le7/p0;

    .line 11
    .line 12
    invoke-direct {v0, p2, p1}, Le7/p0;-><init>(Le7/o0;Landroid/webkit/WebView;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v1, 0xc8

    .line 16
    .line 17
    invoke-virtual {p2, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const/4 p3, -0x8

    .line 5
    if-eq p2, p3, :cond_1

    .line 6
    .line 7
    const/4 p3, -0x6

    .line 8
    if-eq p2, p3, :cond_1

    .line 9
    .line 10
    const/4 p3, -0x2

    .line 11
    if-eq p2, p3, :cond_1

    .line 12
    .line 13
    const/4 p3, -0x1

    .line 14
    if-eq p2, p3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-eqz p1, :cond_2

    .line 18
    .line 19
    const-string p2, "file:///android_asset/error.html?code=\u7f51\u7edc\u672a\u8fde\u63a5"

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    if-eqz p1, :cond_2

    .line 26
    .line 27
    new-instance p3, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string p4, "file:///android_asset/error.html?code="

    .line 33
    .line 34
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Le7/o0$b;->a:Le7/o0;

    .line 4
    .line 5
    invoke-static {p1}, Le7/o0;->d(Le7/o0;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x2

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {p2, p1, v2, v0, v1}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x1

    .line 18
    return p1
.end method
