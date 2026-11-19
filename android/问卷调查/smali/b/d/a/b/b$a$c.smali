.class public final Lb/d/a/b/b$a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/d/a/b/b$a;->b(Ld/f/a/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lb/d/a/b/b$a;

.field public final synthetic c:Ld/f/a/b;


# direct methods
.method public constructor <init>(Lb/d/a/b/b$a;Ld/f/a/b;)V
    .locals 0

    iput-object p1, p0, Lb/d/a/b/b$a$c;->b:Lb/d/a/b/b$a;

    iput-object p2, p0, Lb/d/a/b/b$a$c;->c:Ld/f/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lb/d/a/b/b$a$c;->b:Lb/d/a/b/b$a;

    .line 1
    iget-object v0, v0, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lb/d/a/d/b;->c()Lb/d/a/d/c/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lb/d/a/b/b$a$c;->b:Lb/d/a/b/b$a;

    .line 3
    iget-object v1, v1, Lb/d/a/b/b$a;->j:Landroid/os/Handler;

    .line 4
    new-instance v2, Lb/d/a/b/b$a$c$a;

    invoke-direct {v2, p0, v0}, Lb/d/a/b/b$a$c$a;-><init>(Lb/d/a/b/b$a$c;Lb/d/a/d/c/c;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
