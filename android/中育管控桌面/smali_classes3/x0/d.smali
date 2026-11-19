.class public Lx0/d;
.super Lx0/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx0/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static l0(Lf0/g;)Lx0/d;
    .locals 1

    .line 1
    new-instance v0, Lx0/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lx0/d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lx0/a;->h0(Lf0/g;)Lx0/a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lx0/d;

    .line 11
    .line 12
    return-object p0
.end method

.method public static m0(Ljava/lang/Class;)Lx0/d;
    .locals 1

    .line 1
    new-instance v0, Lx0/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lx0/d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lx0/a;->i(Ljava/lang/Class;)Lx0/a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lx0/d;

    .line 11
    .line 12
    return-object p0
.end method

.method public static n0(Lh0/c;)Lx0/d;
    .locals 1

    .line 1
    new-instance v0, Lx0/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lx0/d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lx0/a;->j(Lh0/c;)Lx0/a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lx0/d;

    .line 11
    .line 12
    return-object p0
.end method

.method public static o0(Lf0/b;)Lx0/d;
    .locals 1

    .line 1
    new-instance v0, Lx0/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lx0/d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lx0/a;->d0(Lf0/b;)Lx0/a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lx0/d;

    .line 11
    .line 12
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lx0/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lx0/a;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lx0/a;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method
