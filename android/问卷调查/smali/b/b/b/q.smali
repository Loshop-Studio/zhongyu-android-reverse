.class public final Lb/b/b/q;
.super Lb/b/b/n;
.source ""


# instance fields
.field public final a:Lb/b/b/a0/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/b/a0/s<",
            "Ljava/lang/String;",
            "Lb/b/b/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lb/b/b/n;-><init>()V

    new-instance v0, Lb/b/b/a0/s;

    invoke-direct {v0}, Lb/b/b/a0/s;-><init>()V

    iput-object v0, p0, Lb/b/b/q;->a:Lb/b/b/a0/s;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Lb/b/b/q;

    if-eqz v0, :cond_0

    check-cast p1, Lb/b/b/q;

    iget-object p1, p1, Lb/b/b/q;->a:Lb/b/b/a0/s;

    iget-object v0, p0, Lb/b/b/q;->a:Lb/b/b/a0/s;

    invoke-virtual {p1, v0}, Ljava/util/AbstractMap;->equals(Ljava/lang/Object;)Z

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

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lb/b/b/q;->a:Lb/b/b/a0/s;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->hashCode()I

    move-result v0

    return v0
.end method
