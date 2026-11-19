.class public final Le/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ld/b<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final b:[Ljava/lang/String;


# direct methods
.method public constructor <init>([Ljava/lang/String;Ld/f/b/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/m;->b:[Ljava/lang/String;

    return-void
.end method

.method public static final varargs a([Ljava/lang/String;)Le/m;
    .locals 14

    const-string v0, "namesAndValues"

    invoke-static {p0, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    const/4 v1, 0x2

    rem-int/2addr v0, v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    if-eqz v0, :cond_1a

    invoke-virtual {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.Array<kotlin.String>"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, [Ljava/lang/String;

    array-length v0, p0

    move v4, v3

    :goto_1
    if-ge v4, v0, :cond_a

    aget-object v5, p0, v4

    if-eqz v5, :cond_1

    move v5, v2

    goto :goto_2

    :cond_1
    move v5, v3

    :goto_2
    if-eqz v5, :cond_9

    aget-object v5, p0, v4

    const-string v6, "null cannot be cast to non-null type kotlin.CharSequence"

    invoke-static {v5, v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v6, "$this$trim"

    .line 1
    invoke-static {v5, v6}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v2

    move v7, v3

    move v8, v7

    :goto_3
    if-gt v7, v6, :cond_8

    if-nez v8, :cond_2

    move v9, v7

    goto :goto_4

    :cond_2
    move v9, v6

    :goto_4
    invoke-virtual {v5, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    .line 2
    invoke-static {v9}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v10

    if-nez v10, :cond_4

    invoke-static {v9}, Ljava/lang/Character;->isSpaceChar(C)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_5

    :cond_3
    move v9, v3

    goto :goto_6

    :cond_4
    :goto_5
    move v9, v2

    :goto_6
    if-nez v8, :cond_6

    if-nez v9, :cond_5

    move v8, v2

    goto :goto_3

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_6
    if-nez v9, :cond_7

    goto :goto_7

    :cond_7
    add-int/lit8 v6, v6, -0x1

    goto :goto_3

    :cond_8
    :goto_7
    add-int/lit8 v6, v6, 0x1

    .line 3
    invoke-virtual {v5, v7, v6}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v5

    .line 4
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, p0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Headers cannot be null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    array-length v0, p0

    const/high16 v4, -0x80000000

    if-gt v0, v4, :cond_b

    .line 5
    sget-object v0, Ld/g/c;->f:Ld/g/c;

    .line 6
    sget-object v0, Ld/g/c;->e:Ld/g/c;

    goto :goto_8

    .line 7
    :cond_b
    new-instance v4, Ld/g/c;

    add-int/lit8 v0, v0, -0x1

    invoke-direct {v4, v3, v0}, Ld/g/c;-><init>(II)V

    move-object v0, v4

    :goto_8
    const-string v4, "$this$step"

    .line 8
    invoke-static {v0, v4}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "step"

    .line 9
    invoke-static {v4, v5}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iget v4, v0, Ld/g/a;->b:I

    .line 11
    iget v5, v0, Ld/g/a;->c:I

    .line 12
    iget v0, v0, Ld/g/a;->d:I

    if-lez v0, :cond_c

    move v0, v1

    goto :goto_9

    :cond_c
    const/4 v0, -0x2

    .line 13
    :goto_9
    new-instance v6, Ld/g/a;

    invoke-direct {v6, v4, v5, v0}, Ld/g/a;-><init>(III)V

    .line 14
    iget v0, v6, Ld/g/a;->c:I

    .line 15
    iget v5, v6, Ld/g/a;->d:I

    if-ltz v5, :cond_d

    if-gt v4, v0, :cond_19

    goto :goto_a

    :cond_d
    if-lt v4, v0, :cond_19

    .line 16
    :goto_a
    aget-object v6, p0, v4

    add-int/lit8 v7, v4, 0x1

    aget-object v7, p0, v7

    .line 17
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_e

    move v8, v2

    goto :goto_b

    :cond_e
    move v8, v3

    :goto_b
    if-eqz v8, :cond_18

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    move v9, v3

    :goto_c
    const/4 v10, 0x3

    const/16 v11, 0x7e

    if-ge v9, v8, :cond_12

    invoke-virtual {v6, v9}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/16 v13, 0x21

    if-le v13, v12, :cond_f

    goto :goto_d

    :cond_f
    if-lt v11, v12, :cond_10

    move v11, v2

    goto :goto_e

    :cond_10
    :goto_d
    move v11, v3

    :goto_e
    if-eqz v11, :cond_11

    add-int/lit8 v9, v9, 0x1

    goto :goto_c

    :cond_11
    new-array p0, v10, [Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p0, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p0, v2

    aput-object v6, p0, v1

    const-string v0, "Unexpected char %#04x at %d in header name: %s"

    invoke-static {v0, p0}, Le/q/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 18
    :cond_12
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    move v9, v3

    :goto_f
    if-ge v9, v8, :cond_17

    invoke-virtual {v7, v9}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/16 v13, 0x9

    if-eq v12, v13, :cond_15

    const/16 v13, 0x20

    if-le v13, v12, :cond_13

    goto :goto_10

    :cond_13
    if-lt v11, v12, :cond_14

    goto :goto_11

    :cond_14
    :goto_10
    move v13, v3

    goto :goto_12

    :cond_15
    :goto_11
    move v13, v2

    :goto_12
    if-eqz v13, :cond_16

    add-int/lit8 v9, v9, 0x1

    goto :goto_f

    :cond_16
    const/4 p0, 0x4

    new-array p0, p0, [Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p0, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p0, v2

    aput-object v6, p0, v1

    aput-object v7, p0, v10

    const-string v0, "Unexpected char %#04x at %d in %s value: %s"

    invoke-static {v0, p0}, Le/q/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    if-eq v4, v0, :cond_19

    add-int/2addr v4, v5

    goto/16 :goto_a

    .line 19
    :cond_18
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "name is empty"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 20
    :cond_19
    new-instance v0, Le/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/m;-><init>([Ljava/lang/String;Ld/f/b/c;)V

    return-object v0

    :cond_1a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expected alternating header names and values"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Le/m;

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/m;->b:[Ljava/lang/String;

    check-cast p1, Le/m;

    iget-object p1, p1, Le/m;->b:[Ljava/lang/String;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Le/m;->b:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ld/b<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/m;->b:[Ljava/lang/String;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    .line 2
    new-array v1, v0, [Ld/b;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 3
    iget-object v3, p0, Le/m;->b:[Ljava/lang/String;

    mul-int/lit8 v4, v2, 0x2

    aget-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    .line 4
    aget-object v3, v3, v4

    .line 5
    new-instance v4, Ld/b;

    invoke-direct {v4, v5, v3}, Ld/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    aput-object v4, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "array"

    .line 7
    invoke-static {v1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ld/f/b/a;

    invoke-direct {v0, v1}, Ld/f/b/a;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1
    iget-object v1, p0, Le/m;->b:[Ljava/lang/String;

    array-length v1, v1

    div-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 2
    iget-object v3, p0, Le/m;->b:[Ljava/lang/String;

    mul-int/lit8 v4, v2, 0x2

    aget-object v3, v3, v4

    .line 3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    iget-object v3, p0, Le/m;->b:[Ljava/lang/String;

    add-int/lit8 v4, v4, 0x1

    aget-object v3, v3, v4

    .line 5
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
