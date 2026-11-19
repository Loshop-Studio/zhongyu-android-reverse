.class public final Lb/d/a/b/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lb/d/a/b/b$a$b;


# direct methods
.method public constructor <init>(Lb/d/a/b/b$a$b;)V
    .locals 0

    iput-object p1, p0, Lb/d/a/b/c;->b:Lb/d/a/b/b$a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lb/d/a/b/c;->b:Lb/d/a/b/b$a$b;

    iget-object v0, v0, Lb/d/a/b/b$a$b;->b:Lb/d/a/b/b$a;

    .line 1
    iget-object v0, v0, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lb/d/a/d/b;->d()Lb/d/a/d/c/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lb/d/a/b/c;->b:Lb/d/a/b/b$a$b;

    iget-object v1, v1, Lb/d/a/b/b$a$b;->b:Lb/d/a/b/b$a;

    .line 3
    iget-object v1, v1, Lb/d/a/b/b$a;->j:Landroid/os/Handler;

    .line 4
    new-instance v2, Lb/d/a/b/c$a;

    invoke-direct {v2, p0, v0}, Lb/d/a/b/c$a;-><init>(Lb/d/a/b/c;Lb/d/a/d/c/a;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
