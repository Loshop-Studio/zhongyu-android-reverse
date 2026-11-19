.class public Lb/b/b/a0/z/o$v;
.super Lb/b/b/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b/b/a0/z/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb/b/b/x<",
        "Ljava/util/BitSet;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/b/b/x;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/c0/a;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {p1}, Lb/b/b/c0/a;->a()V

    invoke-virtual {p1}, Lb/b/b/c0/a;->v()Lb/b/b/c0/b;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    sget-object v4, Lb/b/b/c0/b;->c:Lb/b/b/c0/b;

    if-eq v1, v4, :cond_5

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x5

    if-eq v4, v5, :cond_2

    const/4 v5, 0x6

    if-eq v4, v5, :cond_1

    const/4 v5, 0x7

    if-ne v4, v5, :cond_0

    invoke-virtual {p1}, Lb/b/b/c0/a;->l()Z

    move-result v1

    goto :goto_2

    :cond_0
    new-instance p1, Lb/b/b/v;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid bitset value type: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lb/b/b/v;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lb/b/b/c0/a;->n()I

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lb/b/b/c0/a;->t()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_3

    :goto_1
    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    move v1, v2

    :goto_2
    if-eqz v1, :cond_4

    invoke-virtual {v0, v3}, Ljava/util/BitSet;->set(I)V

    :cond_4
    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p1}, Lb/b/b/c0/a;->v()Lb/b/b/c0/b;

    move-result-object v1

    goto :goto_0

    :catch_0
    new-instance p1, Lb/b/b/v;

    const-string v0, "Error: Expecting: bitset number value (1, 0), Found: "

    invoke-static {v0, v1}, Lb/a/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lb/b/b/v;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-virtual {p1}, Lb/b/b/c0/a;->e()V

    return-object v0
.end method

.method public b(Lb/b/b/c0/c;Ljava/lang/Object;)V
    .locals 4

    check-cast p2, Ljava/util/BitSet;

    .line 1
    invoke-virtual {p1}, Lb/b/b/c0/c;->b()Lb/b/b/c0/c;

    invoke-virtual {p2}, Ljava/util/BitSet;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p1, v2, v3}, Lb/b/b/c0/c;->m(J)Lb/b/b/c0/c;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lb/b/b/c0/c;->e()Lb/b/b/c0/c;

    return-void
.end method
