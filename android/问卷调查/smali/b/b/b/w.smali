.class public Lb/b/b/w;
.super Lb/b/b/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb/b/b/x<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lb/b/b/x;


# direct methods
.method public constructor <init>(Lb/b/b/x;)V
    .locals 0

    iput-object p1, p0, Lb/b/b/w;->a:Lb/b/b/x;

    invoke-direct {p0}, Lb/b/b/x;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/c0/a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/c0/a;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lb/b/b/c0/a;->v()Lb/b/b/c0/b;

    move-result-object v0

    sget-object v1, Lb/b/b/c0/b;->j:Lb/b/b/c0/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lb/b/b/c0/a;->r()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lb/b/b/w;->a:Lb/b/b/x;

    invoke-virtual {v0, p1}, Lb/b/b/x;->a(Lb/b/b/c0/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lb/b/b/c0/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/c0/c;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lb/b/b/c0/c;->h()Lb/b/b/c0/c;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb/b/b/w;->a:Lb/b/b/x;

    invoke-virtual {v0, p1, p2}, Lb/b/b/x;->b(Lb/b/b/c0/c;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
