# RE note 本类字节码直接引用的读写或显示接口包括WebView。
.class public final Lcom/zykj/subscriber/MainActivity$j;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/MainActivity;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/zykj/subscriber/MainActivity;


# direct methods
.method constructor <init>(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$j;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 0
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    const-string p3, "doUpdateVisitedHistory -> "

    .line 2
    invoke-static {p3, p2}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "webUrl"

    invoke-static {p3, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object p2, p0, Lcom/zykj/subscriber/MainActivity$j;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {p2}, Lcom/zykj/subscriber/MainActivity;->x(Lcom/zykj/subscriber/MainActivity;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 4
    iget-object p2, p0, Lcom/zykj/subscriber/MainActivity$j;->a:Lcom/zykj/subscriber/MainActivity;

    const/4 p3, 0x0

    invoke-static {p2, p3}, Lcom/zykj/subscriber/MainActivity;->C(Lcom/zykj/subscriber/MainActivity;Z)V

    if-nez p1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->clearHistory()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 8
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$j;->a:Lcom/zykj/subscriber/MainActivity;

    sget v0, Lc2/u;->n:I

    invoke-virtual {p1, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    const-string v1, "\n                               (function () {\n                                  setInterval(function () {\n                                    var iframes = Array.prototype.slice.call(\n                                      document.querySelectorAll(\"iframe\")\n                                    );\n                                    var urls = [];\n                                    iframes.forEach(function (iframe) {\n                                      urls.push(iframe.getAttribute(\"src\"));\n                                    });\n                                    urls = urls.filter(function (url) {\n                                      if (url.charAt(0) === \"/\") return false;\n                                      return true;\n                                    });\n                                    if (window.JsToJava && window.JsToJava.checkUrls && urls.length) {\n                                      var data = window.JsToJava.checkUrls(JSON.stringify(urls));\n                                      var invalidUrls = JSON.parse(data);\n                                      for (var i = 0; i < invalidUrls.length; i++) {\n                                        var url = invalidUrls[i];\n                                        var frames = Array.prototype.slice.call(\n                                          document.querySelectorAll(\"iframe\")\n                                        );\n                                        var idx = frames.findIndex(function (item) {\n                                          return item.getAttribute(\"src\") === url;\n                                        });\n                                        if (idx > -1) {\n                                          frames[idx].remove();\n                                        }\n                                      }\n                                    }\n                                  }, 1000);\n                                })();\n                        "

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    if-nez p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$j;->a:Lcom/zykj/subscriber/MainActivity;

    .line 4
    invoke-static {p1, p2}, Lcom/zykj/subscriber/MainActivity;->A(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;)V

    .line 5
    sget-object v1, Lz1/b;->a:Lz1/b;

    const-string v3, "\u6d4f\u89c8\u5668"

    const-string v4, "com.zykj.subscriber"

    invoke-virtual {v1, p2, v3, v4}, Lz1/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    new-instance v1, Le3/j;

    const-string v3, "http(s)?://[\\w.:]+/"

    invoke-direct {v1, v3}, Le3/j;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, p2, v3, v4, v2}, Le3/j;->b(Le3/j;Ljava/lang/CharSequence;IILjava/lang/Object;)Le3/h;

    move-result-object v1

    if-nez v1, :cond_2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v3, "file:///android_asset"

    move-object v2, p2

    .line 7
    invoke-static/range {v2 .. v7}, Le3/l;->U(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-le v1, v2, :cond_1

    .line 8
    sget p2, Lc2/u;->b:I

    invoke-virtual {p1, p2}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    invoke-static {}, Landroid/text/Editable$Factory;->getInstance()Landroid/text/Editable$Factory;

    move-result-object v1

    const-string v2, "error"

    invoke-virtual {v1, v2}, Landroid/text/Editable$Factory;->newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    sget p2, Lc2/u;->f:I

    invoke-virtual {p1, p2}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 10
    sget p2, Lc2/u;->g:I

    invoke-virtual {p1, p2}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoForward()Z

    move-result p1

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    return-void

    .line 11
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$j;->a:Lcom/zykj/subscriber/MainActivity;

    sget v1, Lc2/u;->b:I

    invoke-virtual {p1, v1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$j;->a:Lcom/zykj/subscriber/MainActivity;

    sget p2, Lc2/u;->f:I

    invoke-virtual {p1, p2}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iget-object p2, p0, Lcom/zykj/subscriber/MainActivity$j;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-virtual {p2, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/webkit/WebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 13
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$j;->a:Lcom/zykj/subscriber/MainActivity;

    sget p2, Lc2/u;->g:I

    invoke-virtual {p1, p2}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iget-object p2, p0, Lcom/zykj/subscriber/MainActivity$j;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-virtual {p2, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/webkit/WebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->canGoForward()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setSelected(Z)V

    return-void

    .line 14
    :cond_2
    sget p2, Lc2/u;->b:I

    invoke-virtual {p1, p2}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 15
    invoke-static {}, Landroid/text/Editable$Factory;->getInstance()Landroid/text/Editable$Factory;

    move-result-object v2

    invoke-interface {v1}, Le3/h;->getValue()Ljava/lang/String;

    move-result-object v1

    const-string v3, "..."

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/text/Editable$Factory;->newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;

    move-result-object v1

    .line 16
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    sget p2, Lc2/u;->f:I

    invoke-virtual {p1, p2}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 18
    sget p2, Lc2/u;->g:I

    invoke-virtual {p1, p2}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoForward()Z

    move-result p1

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x8

    if-eq p2, p1, :cond_1

    const/4 p1, -0x6

    if-eq p2, p1, :cond_1

    const/4 p1, -0x2

    if-eq p2, p1, :cond_1

    const/4 p1, -0x1

    if-eq p2, p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$j;->a:Lcom/zykj/subscriber/MainActivity;

    sget p2, Lc2/u;->n:I

    invoke-virtual {p1, p2}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    const-string p2, "file:///android_asset/error.html?code=\u7f51\u7edc\u672a\u8fde\u63a5"

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$j;->a:Lcom/zykj/subscriber/MainActivity;

    sget p3, Lc2/u;->n:I

    invoke-virtual {p1, p3}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p3, "file:///android_asset/error.html?code="

    invoke-static {p3, p2}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 0
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/webkit/SslErrorHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/net/http/SslError;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->proceed()V

    :goto_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p1, "shouldOverrideUrlLoading -> "

    .line 1
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "OkHttp"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$j;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {p2}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Lcom/zykj/subscriber/MainActivity;->m(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
