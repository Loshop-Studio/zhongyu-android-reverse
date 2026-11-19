.class public final Lge/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lge/o2;


# instance fields
.field public final a:Lhd/l;

.field public final b:Lge/v;


# direct methods
.method public constructor <init>(Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "compute"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lge/t;->a:Lhd/l;

    .line 10
    .line 11
    new-instance p1, Lge/v;

    .line 12
    .line 13
    invoke-direct {p1}, Lge/v;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lge/t;->b:Lge/v;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(Lod/c;)Lce/b;
    .locals 2

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lge/t;->b:Lge/v;

    .line 7
    .line 8
    invoke-static {p1}, Lgd/a;->a(Lod/c;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v0, v1}, Lge/s;->a(Lge/v;Ljava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "get(...)"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast v0, Lge/j1;

    .line 22
    .line 23
    iget-object v1, v0, Lge/j1;->a:Ljava/lang/ref/SoftReference;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v1, Lge/t$a;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, Lge/t$a;-><init>(Lge/t;Lod/c;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lge/j1;->a(Lhd/a;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :goto_0
    check-cast v1, Lge/m;

    .line 42
    .line 43
    iget-object p1, v1, Lge/m;->a:Lce/b;

    .line 44
    .line 45
    return-object p1
.end method

.method public final b()Lhd/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lge/t;->a:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method
