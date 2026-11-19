.class final Lz1/b$b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b;->d(Lx2/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz1/b$b;

.field final synthetic b:Lx2/l;


# direct methods
.method constructor <init>(Lz1/b$b;Lx2/l;)V
    .locals 0

    iput-object p1, p0, Lz1/b$b$f;->a:Lz1/b$b;

    iput-object p2, p0, Lz1/b$b$f;->b:Lx2/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz1/b$b$f;->a:Lz1/b$b;

    invoke-virtual {v0}, Lz1/b$b;->s()Lb2/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lb2/b;->c()Lcom/zykj/message/server/bean/UserInfo;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lz1/b$b$f;->a:Lz1/b$b;

    invoke-static {v1}, Lz1/b$b;->n(Lz1/b$b;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lz1/b$b$f$a;

    invoke-direct {v2, p0, v0}, Lz1/b$b$f$a;-><init>(Lz1/b$b$f;Lcom/zykj/message/server/bean/UserInfo;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
