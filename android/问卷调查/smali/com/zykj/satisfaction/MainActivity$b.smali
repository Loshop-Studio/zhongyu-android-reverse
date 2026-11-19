# RE note 本类字节码直接引用的读写或显示接口包括WebView。
.class public final Lcom/zykj/satisfaction/MainActivity$b;
.super Ld/f/b/e;
.source ""

# interfaces
.implements Ld/f/a/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/satisfaction/MainActivity;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld/f/b/e;",
        "Ld/f/a/b<",
        "Lb/d/a/d/c/a;",
        "Ld/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/zykj/satisfaction/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/satisfaction/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/satisfaction/MainActivity$b;->b:Lcom/zykj/satisfaction/MainActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld/f/b/e;-><init>(I)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Lb/d/a/d/c/a;

    const-string v0, "serverInfo"

    .line 1
    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p1, Lb/d/a/d/c/a;->b:Lb/d/a/d/c/b;

    .line 3
    sget-object v1, Lb/d/a/d/c/b;->b:Lb/d/a/d/c/b;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/zykj/satisfaction/MainActivity$b;->b:Lcom/zykj/satisfaction/MainActivity;

    .line 4
    iput-object p1, v0, Lcom/zykj/satisfaction/MainActivity;->q:Lb/d/a/d/c/a;

    .line 5
    iget-object p1, p1, Lb/d/a/d/c/a;->d:Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, v0, Lcom/zykj/satisfaction/MainActivity;->o:Lb/d/b/i/f;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    const/16 v2, 0x8

    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/api/services/app/AppStore/CheckUpdateAsync?packageName="

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "com.zykj.satisfaction"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&version="

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "&appType="

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, v0, Lb/d/b/i/f;->a:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Lb/d/b/i/f;->a:Landroid/content/Context;

    const v3, 0x7f0f0068

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lb/d/b/i/f;->a:Landroid/content/Context;

    const v5, 0x7f0f0066

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v3, v4}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/ProgressDialog;

    move-result-object v1

    iput-object v1, v0, Lb/d/b/i/f;->c:Landroid/app/ProgressDialog;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    :cond_1
    new-instance v1, Lb/d/b/i/f$d;

    new-instance v3, Lb/d/b/i/c;

    invoke-direct {v3, v0}, Lb/d/b/i/c;-><init>(Lb/d/b/i/f;)V

    invoke-direct {v1, v3}, Lb/d/b/i/f$d;-><init>(Lb/d/b/i/f$c;)V

    iput-object v1, v0, Lb/d/b/i/f;->d:Lb/d/b/i/f$d;

    new-instance v1, Lb/d/b/i/d;

    invoke-direct {v1, v0, p1, v2}, Lb/d/b/i/d;-><init>(Lb/d/b/i/f;Ljava/lang/String;I)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 8
    :goto_0
    sget-object p1, Lb/d/a/b/b;->b:Lb/d/a/b/b;

    new-instance v0, Lb/d/b/f;

    iget-object v1, p0, Lcom/zykj/satisfaction/MainActivity$b;->b:Lcom/zykj/satisfaction/MainActivity;

    invoke-direct {v0, v1}, Lb/d/b/f;-><init>(Lcom/zykj/satisfaction/MainActivity;)V

    invoke-virtual {p1, v0}, Lb/d/a/b/b;->b(Ld/f/a/b;)V

    goto :goto_1

    :cond_2
    const-string p1, "updateVersionManager"

    invoke-static {p1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v2

    :cond_3
    iget-object p1, p0, Lcom/zykj/satisfaction/MainActivity$b;->b:Lcom/zykj/satisfaction/MainActivity;

    .line 9
    iget-object p1, p1, Lcom/zykj/satisfaction/MainActivity;->p:Lb/d/b/h/a;

    const-string v0, "binding"

    if-eqz p1, :cond_5

    .line 10
    iget-object p1, p1, Lb/d/b/h/a;->b:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->clearHistory()V

    iget-object p1, p0, Lcom/zykj/satisfaction/MainActivity$b;->b:Lcom/zykj/satisfaction/MainActivity;

    .line 11
    iget-object p1, p1, Lcom/zykj/satisfaction/MainActivity;->p:Lb/d/b/h/a;

    if-eqz p1, :cond_4

    .line 12
    iget-object p1, p1, Lb/d/b/h/a;->b:Landroid/webkit/WebView;

    const-string v0, "about:blank"

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 13
    :goto_1
    sget-object p1, Ld/d;->a:Ld/d;

    return-object p1

    .line 14
    :cond_4
    invoke-static {v0}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v0}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v2
.end method
