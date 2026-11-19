.class public Lb/c/a/e/f/c/e/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lb/c/a/e/f/c/e/h;


# direct methods
.method public constructor <init>(Lb/c/a/e/f/c/e/h;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/f/c/e/a;->b:Lb/c/a/e/f/c/e/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lb/c/a/e/f/c/e/a;->b:Lb/c/a/e/f/c/e/h;

    .line 1
    iget-object p1, p1, Lb/c/a/e/f/c/e/h;->V:Lb/c/a/e/f/c/c/a;

    .line 2
    invoke-interface {p1}, Lb/c/a/e/f/c/c/a;->l()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    sget v0, Lb/c/a/e/f/c/e/h;->c0:I

    iget-object v0, p0, Lb/c/a/e/f/c/e/a;->b:Lb/c/a/e/f/c/e/h;

    .line 3
    sget v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;->p:I

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {v0}, La/k/b/m;->k()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "com.xuexiang.xui.widget.preview.KEY_URL"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    iget-object p1, v0, La/k/b/m;->u:La/k/b/z;

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p1, La/k/b/z;->c:Landroid/content/Context;

    .line 6
    sget-object v0, La/h/c/a;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p1, v1, v0}, La/h/c/a$a;->b(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " not attached to Activity"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method
