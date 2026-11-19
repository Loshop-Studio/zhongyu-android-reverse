.class public final Lb/d/b/f;
.super Ld/f/b/e;
.source ""

# interfaces
.implements Ld/f/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld/f/b/e;",
        "Ld/f/a/b<",
        "Lb/d/a/d/c/c;",
        "Ld/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/zykj/satisfaction/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/satisfaction/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lb/d/b/f;->b:Lcom/zykj/satisfaction/MainActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld/f/b/e;-><init>(I)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lb/d/a/d/c/c;

    const-string v0, "it"

    .line 1
    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb/d/b/f;->b:Lcom/zykj/satisfaction/MainActivity;

    .line 2
    iput-object p1, v0, Lcom/zykj/satisfaction/MainActivity;->r:Lb/d/a/d/c/c;

    .line 3
    invoke-static {v0}, Lcom/zykj/satisfaction/MainActivity;->v(Lcom/zykj/satisfaction/MainActivity;)V

    .line 4
    sget-object p1, Ld/d;->a:Ld/d;

    return-object p1
.end method
