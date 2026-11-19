.class public Lc1/b;
.super Lc1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc1/c<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lh1/a;)V
    .locals 0

    invoke-static {p1, p2}, Ld1/g;->c(Landroid/content/Context;Lh1/a;)Ld1/g;

    move-result-object p1

    invoke-virtual {p1}, Ld1/g;->b()Ld1/b;

    move-result-object p1

    invoke-direct {p0, p1}, Lc1/c;-><init>(Ld1/d;)V

    return-void
.end method


# virtual methods
.method b(Lf1/r;)Z
    .locals 0

    iget-object p1, p1, Lf1/r;->j:Lx0/c;

    invoke-virtual {p1}, Lx0/c;->f()Z

    move-result p1

    return p1
.end method

.method bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lc1/b;->i(Ljava/lang/Boolean;)Z

    move-result p1

    return p1
.end method

.method i(Ljava/lang/Boolean;)Z
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
