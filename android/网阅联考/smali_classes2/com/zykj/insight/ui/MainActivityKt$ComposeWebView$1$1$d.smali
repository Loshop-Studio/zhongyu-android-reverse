.class public final Lcom/zykj/insight/ui/MainActivityKt$ComposeWebView$1$1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/insight/ui/MainActivityKt$ComposeWebView$1$1;->a(Landroid/content/Context;)Landroid/webkit/WebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/insight/ui/MainActivityKt$ComposeWebView$1$1$d;->a:Landroid/webkit/WebView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const/4 p1, 0x1

    .line 2
    const/4 v0, 0x0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    move p3, p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p3, v0

    .line 14
    :goto_0
    if-eqz p3, :cond_1

    .line 15
    .line 16
    const/4 p3, 0x4

    .line 17
    if-ne p2, p3, :cond_1

    .line 18
    .line 19
    iget-object p2, p0, Lcom/zykj/insight/ui/MainActivityKt$ComposeWebView$1$1$d;->a:Landroid/webkit/WebView;

    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/webkit/WebView;->canGoBack()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget-object p2, p0, Lcom/zykj/insight/ui/MainActivityKt$ComposeWebView$1$1$d;->a:Landroid/webkit/WebView;

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/webkit/WebView;->goBack()V

    .line 30
    .line 31
    .line 32
    return p1

    .line 33
    :cond_1
    return v0
.end method
