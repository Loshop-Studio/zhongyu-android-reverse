.class public Lc1/g;
.super Lc1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc1/c<",
        "Lb1/b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lh1/a;)V
    .locals 0

    invoke-static {p1, p2}, Ld1/g;->c(Landroid/content/Context;Lh1/a;)Ld1/g;

    move-result-object p1

    invoke-virtual {p1}, Ld1/g;->d()Ld1/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lc1/c;-><init>(Ld1/d;)V

    return-void
.end method


# virtual methods
.method b(Lf1/r;)Z
    .locals 1

    iget-object p1, p1, Lf1/r;->j:Lx0/c;

    invoke-virtual {p1}, Lx0/c;->b()Lx0/o;

    move-result-object p1

    sget-object v0, Lx0/o;->c:Lx0/o;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lb1/b;

    invoke-virtual {p0, p1}, Lc1/g;->i(Lb1/b;)Z

    move-result p1

    return p1
.end method

.method i(Lb1/b;)Z
    .locals 1

    invoke-virtual {p1}, Lb1/b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lb1/b;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
