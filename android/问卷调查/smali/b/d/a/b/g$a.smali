.class public final Lb/d/a/b/g$a;
.super Ld/f/b/e;
.source ""

# interfaces
.implements Ld/f/a/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/d/a/b/g;->a()V
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
.field public final synthetic b:Lb/d/a/b/g;


# direct methods
.method public constructor <init>(Lb/d/a/b/g;)V
    .locals 0

    iput-object p1, p0, Lb/d/a/b/g$a;->b:Lb/d/a/b/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld/f/b/e;-><init>(I)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lb/d/a/d/c/a;

    const-string v0, "it"

    .line 1
    invoke-static {p1, v0}, Ld/f/b/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb/d/a/b/g$a;->b:Lb/d/a/b/g;

    iget-object v0, v0, Lb/d/a/b/g;->a:Lb/d/a/b/b$a;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lb/d/a/b/b$a;->g(Lb/d/a/b/b$a;Lb/d/a/d/c/a;Z)V

    .line 2
    sget-object p1, Ld/d;->a:Ld/d;

    return-object p1
.end method
