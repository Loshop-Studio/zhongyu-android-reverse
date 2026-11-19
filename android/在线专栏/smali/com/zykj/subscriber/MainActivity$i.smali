.class public final Lcom/zykj/subscriber/MainActivity$i;
.super Landroid/webkit/WebChromeClient;
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

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$i;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/webkit/JsResult;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/zykj/subscriber/MainActivity$i;->e(Landroid/webkit/JsResult;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static synthetic b(Landroid/webkit/JsResult;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/zykj/subscriber/MainActivity$i;->f(Landroid/webkit/JsResult;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static synthetic c(Landroid/webkit/JsResult;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/zykj/subscriber/MainActivity$i;->d(Landroid/webkit/JsResult;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method private static final d(Landroid/webkit/JsResult;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 1

    const-string v0, "dialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$noName_1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    if-nez p0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/webkit/JsResult;->confirm()V

    :goto_0
    return-void
.end method

.method private static final e(Landroid/webkit/JsResult;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 1

    const-string v0, "dialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$noName_1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    if-nez p0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/webkit/JsResult;->confirm()V

    :goto_0
    return-void
.end method

.method private static final f(Landroid/webkit/JsResult;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 1

    const-string v0, "dialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$noName_1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    if-nez p0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/webkit/JsResult;->cancel()V

    :goto_0
    return-void
.end method


# virtual methods
.method public onConsoleMessage(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Ljava/lang/String;ILjava/lang/String;)V

    .line 2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "onConsoleMessage"

    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onHideCustomView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    .line 2
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity$i;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {v0}, Lcom/zykj/subscriber/MainActivity;->t(Lcom/zykj/subscriber/MainActivity;)V

    return-void
.end method

.method public onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 0
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Landroid/webkit/JsResult;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    iget-object p2, p0, Lcom/zykj/subscriber/MainActivity$i;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-direct {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string p2, "\u63d0\u793a"

    .line 2
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->title(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 3
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->content(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    const-string p2, "\u786e\u8ba4"

    .line 4
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->positiveText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 5
    new-instance p2, Lc2/m;

    invoke-direct {p2, p4}, Lc2/m;-><init>(Landroid/webkit/JsResult;)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->onPositive(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$SingleButtonCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->show()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    const/4 p1, 0x1

    return p1
.end method

.method public onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 0
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Landroid/webkit/JsResult;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    iget-object p2, p0, Lcom/zykj/subscriber/MainActivity$i;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-direct {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string p2, "\u63d0\u793a"

    .line 2
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->title(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 3
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->content(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 4
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->cancelable(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    const-string p2, "\u786e\u8ba4"

    .line 5
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->positiveText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    const-string p2, "\u53d6\u6d88"

    .line 6
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->negativeText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 7
    new-instance p2, Lc2/k;

    invoke-direct {p2, p4}, Lc2/k;-><init>(Landroid/webkit/JsResult;)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->onPositive(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$SingleButtonCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 8
    new-instance p2, Lc2/l;

    invoke-direct {p2, p4}, Lc2/l;-><init>(Landroid/webkit/JsResult;)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->onNegative(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$SingleButtonCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->show()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    const/4 p1, 0x1

    return p1
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 0
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/16 p1, 0x64

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$i;->a:Lcom/zykj/subscriber/MainActivity;

    sget p2, Lc2/u;->j:I

    invoke-virtual {p1, p2}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    :cond_0
    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/webkit/WebChromeClient$CustomViewCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity$i;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    .line 3
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity$i;->a:Lcom/zykj/subscriber/MainActivity;

    sget v1, Lc2/u;->n:I

    invoke-virtual {v0, v1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity$i;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {v0}, Lcom/zykj/subscriber/MainActivity;->s(Lcom/zykj/subscriber/MainActivity;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-interface {p2}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    :goto_0
    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity$i;->a:Lcom/zykj/subscriber/MainActivity;

    sget v1, Lc2/u;->m:I

    invoke-virtual {v0, v1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 7
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity$i;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {v0, p1}, Lcom/zykj/subscriber/MainActivity;->E(Lcom/zykj/subscriber/MainActivity;Landroid/view/View;)V

    .line 8
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$i;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {p1, p2}, Lcom/zykj/subscriber/MainActivity;->F(Lcom/zykj/subscriber/MainActivity;Landroid/webkit/WebChromeClient$CustomViewCallback;)V

    .line 9
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$i;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-virtual {p1, v1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method
