.class public Ld0/d;
.super Ld0/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld0/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static l0(Ljava/lang/Class;)Ld0/d;
    .locals 1

    .line 1
    new-instance v0, Ld0/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ld0/d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ld0/a;->i(Ljava/lang/Class;)Ld0/a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ld0/d;

    .line 11
    .line 12
    return-object p0
.end method

.method public static m0(Ln/c;)Ld0/d;
    .locals 1

    .line 1
    new-instance v0, Ld0/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ld0/d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ld0/a;->j(Ln/c;)Ld0/a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ld0/d;

    .line 11
    .line 12
    return-object p0
.end method

.method public static n0(Ll/b;)Ld0/d;
    .locals 1

    .line 1
    new-instance v0, Ld0/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ld0/d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ld0/a;->d0(Ll/b;)Ld0/a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ld0/d;

    .line 11
    .line 12
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ld0/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Ld0/a;->equals(Ljava/lang/Object;)Z

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
    invoke-super {p0}, Ld0/a;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method
