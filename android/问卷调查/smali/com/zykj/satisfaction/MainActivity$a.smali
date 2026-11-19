.class public final Lcom/zykj/satisfaction/MainActivity$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/satisfaction/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/satisfaction/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/satisfaction/MainActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/zykj/satisfaction/MainActivity$a;->a:Lcom/zykj/satisfaction/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final refreshToken()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "OkHttp"

    const-string v1, "\u7f51\u9875\u62a5\u9519\uff0c\u8c03\u7528refreshToken"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1
    sget-boolean v0, Lcom/zykj/satisfaction/MainActivity;->u:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/zykj/satisfaction/MainActivity;->u:Z

    .line 3
    sget-object v0, Lb/d/a/b/b;->b:Lb/d/a/b/b;

    new-instance v1, Lcom/zykj/satisfaction/MainActivity$a$a;

    iget-object v2, p0, Lcom/zykj/satisfaction/MainActivity$a;->a:Lcom/zykj/satisfaction/MainActivity;

    invoke-direct {v1, v2}, Lcom/zykj/satisfaction/MainActivity$a$a;-><init>(Lcom/zykj/satisfaction/MainActivity;)V

    invoke-virtual {v0, v1}, Lb/d/a/b/b;->d(Ld/f/a/b;)V

    :cond_0
    iget-object v0, p0, Lcom/zykj/satisfaction/MainActivity$a;->a:Lcom/zykj/satisfaction/MainActivity;

    .line 4
    iget-object v0, v0, Lcom/zykj/satisfaction/MainActivity;->p:Lb/d/b/h/a;

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, v0, Lb/d/b/h/a;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    return-void

    :cond_1
    const-string v0, "binding"

    invoke-static {v0}, Ld/f/b/d;->l(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
