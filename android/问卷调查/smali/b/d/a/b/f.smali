.class public final Lb/d/a/b/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lb/d/a/b/b$a;

.field public final synthetic c:Lb/d/a/c/a;


# direct methods
.method public constructor <init>(Lb/d/a/b/b$a;Lb/d/a/c/a;)V
    .locals 0

    iput-object p1, p0, Lb/d/a/b/f;->b:Lb/d/a/b/b$a;

    iput-object p2, p0, Lb/d/a/b/f;->c:Lb/d/a/c/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb/d/a/b/f;->b:Lb/d/a/b/b$a;

    .line 1
    iget-object v0, v0, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lb/d/a/b/f;->c:Lb/d/a/c/a;

    invoke-interface {v0, v1}, Lb/d/a/d/b;->a(Lb/d/a/d/a;)V

    :cond_0
    return-void
.end method
