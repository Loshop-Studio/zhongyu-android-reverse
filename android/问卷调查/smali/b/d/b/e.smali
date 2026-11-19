.class public final Lb/d/b/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic b:Lcom/zykj/satisfaction/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/satisfaction/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lb/d/b/e;->b:Lcom/zykj/satisfaction/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    const/4 p1, 0x1

    const/4 v0, 0x0

    if-nez p3, :cond_1

    :cond_0
    move p3, v0

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p3

    if-nez p3, :cond_0

    move p3, p1

    :goto_0
    if-eqz p3, :cond_4

    const/4 p3, 0x4

    if-ne p2, p3, :cond_4

    iget-object p2, p0, Lb/d/b/e;->b:Lcom/zykj/satisfaction/MainActivity;

    .line 1
    iget-object p2, p2, Lcom/zykj/satisfaction/MainActivity;->p:Lb/d/b/h/a;

    const/4 p3, 0x0

    const-string v1, "binding"

    if-eqz p2, :cond_3

    .line 2
    iget-object p2, p2, Lb/d/b/h/a;->b:Landroid/webkit/WebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p0, Lb/d/b/e;->b:Lcom/zykj/satisfaction/MainActivity;

    .line 3
    iget-object p2, p2, Lcom/zykj/satisfaction/MainActivity;->p:Lb/d/b/h/a;

    if-eqz p2, :cond_2

    .line 4
    iget-object p2, p2, Lb/d/b/h/a;->b:Landroid/webkit/WebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->goBack()V

    return p1

    :cond_2
    invoke-static {v1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw p3

    :cond_3
    invoke-static {v1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw p3

    :cond_4
    return v0
.end method
