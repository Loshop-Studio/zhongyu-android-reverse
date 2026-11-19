.class public final Lb/d/b/c;
.super Landroid/webkit/WebViewClient;
.source ""


# instance fields
.field public final synthetic a:Lcom/zykj/satisfaction/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/satisfaction/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lb/d/b/c;->a:Lcom/zykj/satisfaction/MainActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "onReceivedError -> errorCode: "

    invoke-static {p2, p1}, Ld/f/b/d;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "OkHttp"

    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 4

    iget-object p1, p0, Lb/d/b/c;->a:Lcom/zykj/satisfaction/MainActivity;

    invoke-static {p2}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "url"

    invoke-static {p2, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x3f

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p2, v0, v1, v2}, Ld/i/g;->a(Ljava/lang/CharSequence;CZI)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x6

    invoke-static {p2, v0, v1, v1, v3}, Ld/i/g;->h(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    const-string v0, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {p2, v0}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p1, Lcom/zykj/satisfaction/MainActivity;->t:Ljava/util/List;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2, v0, v1, v2}, Ld/i/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZI)Z

    move-result v0

    if-eqz v0, :cond_1

    move v1, v3

    :cond_2
    xor-int/lit8 p1, v1, 0x1

    return p1
.end method
