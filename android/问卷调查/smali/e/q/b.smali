.class public final Le/q/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[B

.field public static final b:Ld/i/c;

.field public static final c:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 18

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Le/q/b;->a:[B

    new-array v2, v0, [Ljava/lang/String;

    invoke-static {v2}, Le/m;->a([Ljava/lang/String;)Le/m;

    const-string v2, "$this$toResponseBody"

    .line 1
    invoke-static {v1, v2}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "source"

    .line 2
    invoke-static {v1, v2}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {v1, v2}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v9, v0

    move-wide v3, v9

    move-wide v5, v9

    move-wide v7, v9

    invoke-static/range {v3 .. v8}, Lb/c/a/a;->g(JJJ)V

    .line 4
    array-length v2, v1

    const-string v3, "$this$toRequestBody"

    .line 5
    invoke-static {v1, v3}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v1

    int-to-long v3, v1

    int-to-long v1, v2

    or-long v5, v9, v1

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    if-ltz v5, :cond_1a

    cmp-long v5, v9, v3

    if-gtz v5, :cond_1a

    sub-long/2addr v3, v9

    cmp-long v1, v3, v1

    if-ltz v1, :cond_1a

    .line 6
    sget-object v1, Lf/c;->b:Lf/c$a;

    const/4 v2, 0x5

    new-array v3, v2, [Lf/b;

    sget-object v4, Lf/b;->f:Lf/b;

    const-string v4, "efbbbf"

    invoke-static {v4}, Lf/b;->a(Ljava/lang/String;)Lf/b;

    move-result-object v4

    aput-object v4, v3, v0

    const-string v4, "feff"

    invoke-static {v4}, Lf/b;->a(Ljava/lang/String;)Lf/b;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    const-string v4, "fffe"

    invoke-static {v4}, Lf/b;->a(Ljava/lang/String;)Lf/b;

    move-result-object v4

    const/4 v6, 0x2

    aput-object v4, v3, v6

    const/4 v4, 0x3

    const-string v6, "0000ffff"

    invoke-static {v6}, Lf/b;->a(Ljava/lang/String;)Lf/b;

    move-result-object v6

    aput-object v6, v3, v4

    const/4 v4, 0x4

    const-string v6, "ffff0000"

    invoke-static {v6}, Lf/b;->a(Ljava/lang/String;)Lf/b;

    move-result-object v6

    aput-object v6, v3, v4

    const-string v4, "byteStrings"

    .line 7
    invoke-static {v3, v4}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "$this$toMutableList"

    .line 8
    invoke-static {v3, v4}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v14, Ljava/util/ArrayList;

    const-string v4, "$this$asCollection"

    .line 9
    invoke-static {v3, v4}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ld/e/c;

    invoke-direct {v4, v3, v0}, Ld/e/c;-><init>([Ljava/lang/Object;Z)V

    .line 10
    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v4, "$this$sort"

    .line 11
    invoke-static {v14, v4}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-le v4, v5, :cond_0

    invoke-static {v14}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 12
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    move v6, v0

    :goto_0
    const/4 v9, -0x1

    if-ge v6, v2, :cond_1

    aget-object v10, v3, v6

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    new-array v6, v0, [Ljava/lang/Integer;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    const-string v6, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {v4, v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v4, [Ljava/lang/Integer;

    array-length v6, v4

    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/Integer;

    invoke-static {v4}, Ld/e/e;->d([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    move v6, v0

    move v9, v6

    :goto_1
    if-ge v6, v2, :cond_a

    aget-object v10, v3, v6

    add-int/lit8 v11, v9, 0x1

    .line 13
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v12

    const-string v13, "$this$binarySearch"

    .line 14
    invoke-static {v14, v13}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v13

    const-string v15, ")."

    if-ltz v12, :cond_9

    if-gt v12, v13, :cond_8

    add-int/lit8 v12, v12, -0x1

    move v13, v0

    :goto_2
    if-gt v13, v12, :cond_6

    add-int v15, v13, v12

    ushr-int v5, v15, v5

    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Comparable;

    if-ne v15, v10, :cond_2

    move v15, v0

    goto :goto_3

    :cond_2
    if-nez v15, :cond_3

    const/4 v15, -0x1

    goto :goto_3

    :cond_3
    if-nez v10, :cond_4

    const/4 v15, 0x1

    goto :goto_3

    .line 15
    :cond_4
    invoke-interface {v15, v10}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v15

    :goto_3
    if-gez v15, :cond_5

    add-int/lit8 v13, v5, 0x1

    goto :goto_4

    :cond_5
    if-lez v15, :cond_7

    add-int/lit8 v5, v5, -0x1

    move v12, v5

    :goto_4
    const/4 v5, 0x1

    goto :goto_2

    :cond_6
    add-int/lit8 v13, v13, 0x1

    neg-int v5, v13

    .line 16
    :cond_7
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v4, v5, v9}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    const/4 v5, 0x1

    move v9, v11

    goto :goto_1

    .line 17
    :cond_8
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "toIndex ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") is greater than size ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fromIndex ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") is greater than toIndex ("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 18
    :cond_a
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf/b;

    .line 19
    invoke-virtual {v5}, Lf/b;->b()I

    move-result v5

    if-lez v5, :cond_b

    const/4 v5, 0x1

    goto :goto_5

    :cond_b
    move v5, v0

    :goto_5
    if-eqz v5, :cond_19

    move v5, v0

    .line 20
    :goto_6
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v6

    const-string v15, "prefix"

    if-ge v5, v6, :cond_11

    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf/b;

    add-int/lit8 v9, v5, 0x1

    move v10, v9

    :goto_7
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v10, v11, :cond_10

    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lf/b;

    .line 21
    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v15}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {v6}, Lf/b;->b()I

    move-result v12

    .line 23
    invoke-virtual {v11, v0, v6, v0, v12}, Lf/b;->f(ILf/b;II)Z

    move-result v12

    if-nez v12, :cond_c

    goto :goto_9

    .line 24
    :cond_c
    invoke-virtual {v11}, Lf/b;->b()I

    move-result v12

    invoke-virtual {v6}, Lf/b;->b()I

    move-result v13

    if-eq v12, v13, :cond_d

    const/4 v12, 0x1

    goto :goto_8

    :cond_d
    move v12, v0

    :goto_8
    if-eqz v12, :cond_f

    .line 25
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    if-le v11, v12, :cond_e

    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-interface {v4, v10}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_7

    :cond_e
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "duplicate option: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    :goto_9
    move v5, v9

    goto :goto_6

    :cond_11
    new-instance v0, Lf/a;

    invoke-direct {v0}, Lf/a;-><init>()V

    const-wide/16 v10, 0x0

    const/4 v13, 0x0

    const/4 v5, 0x0

    .line 26
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v16

    move-object v9, v1

    move-object v12, v0

    move-object v6, v15

    move v15, v5

    move-object/from16 v17, v4

    invoke-virtual/range {v9 .. v17}, Lf/c$a;->a(JLf/a;ILjava/util/List;IILjava/util/List;)V

    .line 27
    invoke-virtual {v1, v0}, Lf/c$a;->b(Lf/a;)J

    move-result-wide v4

    long-to-int v1, v4

    new-array v1, v1, [I

    const/4 v4, 0x0

    .line 28
    :goto_a
    iget-wide v9, v0, Lf/a;->c:J

    cmp-long v5, v9, v7

    if-nez v5, :cond_12

    const/4 v5, 0x1

    goto :goto_b

    :cond_12
    const/4 v5, 0x0

    :goto_b
    if-nez v5, :cond_16

    add-int/lit8 v5, v4, 0x1

    const-wide/16 v7, 0x4

    cmp-long v9, v9, v7

    if-ltz v9, :cond_15

    .line 29
    iget-object v9, v0, Lf/a;->b:Lf/d;

    invoke-static {v9}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget v10, v9, Lf/d;->b:I

    iget v11, v9, Lf/d;->c:I

    sub-int v12, v11, v10

    int-to-long v12, v12

    cmp-long v12, v12, v7

    if-gez v12, :cond_13

    invoke-virtual {v0}, Lf/a;->b()B

    move-result v7

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v7, v7, 0x18

    invoke-virtual {v0}, Lf/a;->b()B

    move-result v8

    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v8, v8, 0x10

    or-int/2addr v7, v8

    invoke-virtual {v0}, Lf/a;->b()B

    move-result v8

    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v8, v8, 0x8

    or-int/2addr v7, v8

    invoke-virtual {v0}, Lf/a;->b()B

    move-result v8

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v7, v8

    goto :goto_d

    :cond_13
    iget-object v12, v9, Lf/d;->a:[B

    add-int/lit8 v13, v10, 0x1

    aget-byte v10, v12, v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x18

    add-int/lit8 v14, v13, 0x1

    aget-byte v13, v12, v13

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v13, v13, 0x10

    or-int/2addr v10, v13

    add-int/lit8 v13, v14, 0x1

    aget-byte v14, v12, v14

    and-int/lit16 v14, v14, 0xff

    shl-int/lit8 v14, v14, 0x8

    or-int/2addr v10, v14

    add-int/lit8 v14, v13, 0x1

    aget-byte v12, v12, v13

    and-int/lit16 v12, v12, 0xff

    or-int/2addr v10, v12

    .line 30
    iget-wide v12, v0, Lf/a;->c:J

    sub-long/2addr v12, v7

    .line 31
    iput-wide v12, v0, Lf/a;->c:J

    if-ne v14, v11, :cond_14

    .line 32
    invoke-virtual {v9}, Lf/d;->a()Lf/d;

    move-result-object v7

    iput-object v7, v0, Lf/a;->b:Lf/d;

    invoke-static {v9}, Lf/e;->a(Lf/d;)V

    goto :goto_c

    :cond_14
    iput v14, v9, Lf/d;->b:I

    :goto_c
    move v7, v10

    .line 33
    :goto_d
    aput v7, v1, v4

    const-wide/16 v7, 0x0

    move v4, v5

    goto/16 :goto_a

    .line 34
    :cond_15
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 35
    :cond_16
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "java.util.Arrays.copyOf(this, size)"

    invoke-static {v0, v1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Lf/b;

    const-string v0, "GMT"

    .line 36
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {v0}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    new-instance v0, Ld/i/c;

    const-string v1, "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"

    invoke-direct {v0, v1}, Ld/i/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Le/q/b;->b:Ld/i/c;

    const-class v0, Le/n;

    const-class v0, Le/n;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "OkHttpClient::class.java.name"

    invoke-static {v0, v1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "okhttp3."

    const-string v2, "$this$removePrefix"

    .line 37
    invoke-static {v0, v2}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v6}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$this$startsWith"

    .line 38
    invoke-static {v0, v2}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v6}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2}, Ld/i/g;->l(Ljava/lang/String;Ljava/lang/String;ZI)Z

    move-result v3

    if-eqz v3, :cond_17

    .line 39
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "(this as java.lang.String).substring(startIndex)"

    invoke-static {v0, v1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_17
    const-string v1, "Client"

    const-string v3, "$this$removeSuffix"

    .line 40
    invoke-static {v0, v3}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "suffix"

    invoke-static {v1, v3}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "$this$endsWith"

    .line 41
    invoke-static {v0, v4}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2}, Ld/i/g;->c(Ljava/lang/String;Ljava/lang/String;ZI)Z

    move-result v2

    if-eqz v2, :cond_18

    .line 42
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v2, v1

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    :cond_18
    sput-object v0, Le/q/b;->c:Ljava/lang/String;

    return-void

    .line 44
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "the empty byte string is not a supported option"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_1a
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw v0
.end method

.method public static final varargs a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "format"

    invoke-static {p0, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "java.lang.String.format(locale, format, *args)"

    invoke-static {p0, p1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final varargs b([Ljava/lang/Object;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    const-string v0, "elements"

    invoke-static {p0, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    array-length v1, p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    .line 1
    invoke-static {p0, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    if-lez v0, :cond_0

    const-string v0, "$this$asList"

    .line 2
    invoke-static {p0, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const-string v0, "ArraysUtilJVM.asList(this)"

    .line 4
    invoke-static {p0, v0}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    sget-object p0, Ld/e/g;->b:Ld/e/g;

    .line 6
    :goto_0
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    const-string v0, "Collections.unmodifiable\u2026istOf(*elements.clone()))"

    invoke-static {p0, v0}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
