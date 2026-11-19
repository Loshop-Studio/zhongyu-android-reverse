.class public Lf3/p1;
.super Lf3/t1;
.source "SourceFile"

# interfaces
.implements Lf3/w;


# instance fields
.field private final b:Z


# direct methods
.method public constructor <init>(Lf3/m1;)V
    .locals 1
    .param p1    # Lf3/m1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lf3/t1;-><init>(Z)V

    .line 2
    invoke-virtual {p0, p1}, Lf3/t1;->R(Lf3/m1;)V

    .line 3
    invoke-direct {p0}, Lf3/p1;->t0()Z

    move-result p1

    iput-boolean p1, p0, Lf3/p1;->b:Z

    return-void
.end method

.method private final t0()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lf3/t1;->N()Lf3/q;

    move-result-object v0

    instance-of v1, v0, Lf3/r;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lf3/r;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, Lf3/s1;->t()Lf3/t1;

    move-result-object v0

    .line 2
    :goto_1
    invoke-virtual {v0}, Lf3/t1;->K()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    return v0

    .line 3
    :cond_2
    invoke-virtual {v0}, Lf3/t1;->N()Lf3/q;

    move-result-object v0

    instance-of v3, v0, Lf3/r;

    if-eqz v3, :cond_3

    check-cast v0, Lf3/r;

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    if-nez v0, :cond_4

    return v1

    :cond_4
    invoke-virtual {v0}, Lf3/s1;->t()Lf3/t1;

    move-result-object v0

    goto :goto_1
.end method


# virtual methods
.method public K()Z
    .locals 1

    iget-boolean v0, p0, Lf3/p1;->b:Z

    return v0
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
