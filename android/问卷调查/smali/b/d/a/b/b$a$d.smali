.class public final Lb/d/a/b/b$a$d;
.super Ld/f/b/e;
.source ""

# interfaces
.implements Ld/f/a/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/d/a/b/b$a;->b(Ld/f/a/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld/f/b/e;",
        "Ld/f/a/a<",
        "Ld/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lb/d/a/b/b$a;

.field public final synthetic c:Ld/f/a/b;


# direct methods
.method public constructor <init>(Lb/d/a/b/b$a;Ld/f/a/b;)V
    .locals 0

    iput-object p1, p0, Lb/d/a/b/b$a$d;->b:Lb/d/a/b/b$a;

    iput-object p2, p0, Lb/d/a/b/b$a$d;->c:Ld/f/a/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld/f/b/e;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lb/d/a/b/d;

    invoke-direct {v1, p0}, Lb/d/a/b/d;-><init>(Lb/d/a/b/b$a$d;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 2
    sget-object v0, Ld/d;->a:Ld/d;

    return-object v0
.end method
