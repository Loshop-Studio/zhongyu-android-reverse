.class public Lx1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(Lu1/f;)Ls1/a$a;
    .locals 2

    .line 1
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lp1/d;->f()Lu1/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lu1/f;->k()Lcom/liulishuo/okdownload/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lu1/g;->f(Lcom/liulishuo/okdownload/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lp1/d;->k()Lp1/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lp1/d;->f()Lu1/g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lu1/g;->e()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lu1/f;->f()Ls1/a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1}, Ls1/a;->execute()Ls1/a$a;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method
