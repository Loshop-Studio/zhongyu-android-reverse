.class public final Lb/d/a/b/b$a$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/d/a/b/b$a$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lb/d/a/b/b$a$a;

.field public final synthetic c:Lb/d/a/d/c/a;


# direct methods
.method public constructor <init>(Lb/d/a/b/b$a$a;Lb/d/a/d/c/a;)V
    .locals 0

    iput-object p1, p0, Lb/d/a/b/b$a$a$a;->b:Lb/d/a/b/b$a$a;

    iput-object p2, p0, Lb/d/a/b/b$a$a$a;->c:Lb/d/a/d/c/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb/d/a/b/b$a$a$a;->b:Lb/d/a/b/b$a$a;

    iget-object v0, v0, Lb/d/a/b/b$a$a;->c:Ld/f/a/b;

    iget-object v1, p0, Lb/d/a/b/b$a$a$a;->c:Lb/d/a/d/c/a;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ld/f/a/b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-static {}, Ld/f/b/d;->k()V

    const/4 v0, 0x0

    throw v0
.end method
