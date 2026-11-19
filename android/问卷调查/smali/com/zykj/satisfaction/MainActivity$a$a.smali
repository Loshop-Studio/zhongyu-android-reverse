.class public final Lcom/zykj/satisfaction/MainActivity$a$a;
.super Ld/f/b/e;
.source ""

# interfaces
.implements Ld/f/a/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/satisfaction/MainActivity$a;->refreshToken()V
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

    iput-object p1, p0, Lcom/zykj/satisfaction/MainActivity$a$a;->b:Lcom/zykj/satisfaction/MainActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld/f/b/e;-><init>(I)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lb/d/a/d/c/a;

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object v0, p1, Lb/d/a/d/c/a;->d:Ljava/lang/String;

    if-nez v0, :cond_1

    :goto_0
    const-string v0, ""

    .line 2
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/zykj/satisfaction/MainActivity$a$a;->b:Lcom/zykj/satisfaction/MainActivity;

    .line 3
    iput-object p1, v0, Lcom/zykj/satisfaction/MainActivity;->q:Lb/d/a/d/c/a;

    const-string p1, "OkHttp"

    const-string v0, "\u7f51\u9875\u62a5\u9519\uff0c\u56de\u8c03\u8fd4\u56de"

    .line 4
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/zykj/satisfaction/MainActivity$a$a;->b:Lcom/zykj/satisfaction/MainActivity;

    new-instance v0, Lb/d/b/a;

    invoke-direct {v0, p1}, Lb/d/b/a;-><init>(Lcom/zykj/satisfaction/MainActivity;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 5
    :cond_3
    sget-object p1, Ld/d;->a:Ld/d;

    return-object p1
.end method
