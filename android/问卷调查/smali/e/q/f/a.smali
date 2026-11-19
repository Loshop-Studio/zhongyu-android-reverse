.class public final Le/q/f/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    sget-object v0, Lf/b;->f:Lf/b;

    const-string v0, "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"

    const-string v1, "$this$encodeUtf8"

    .line 1
    invoke-static {v0, v1}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf/b;

    const-string v2, "$this$asUtf8ToByteArray"

    .line 2
    invoke-static {v0, v2}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ld/i/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    const-string v3, "(this as java.lang.String).getBytes(charset)"

    invoke-static {v2, v3}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {v1, v2}, Lf/b;-><init>([B)V

    .line 4
    iput-object v0, v1, Lf/b;->c:Ljava/lang/String;

    const/16 v0, 0x40

    new-array v0, v0, [Ljava/lang/String;

    .line 5
    sput-object v0, Le/q/f/a;->a:[Ljava/lang/String;

    const/16 v0, 0x100

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/16 v4, 0x20

    const/4 v5, 0x1

    if-ge v3, v0, :cond_0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Integer.toBinaryString(it)"

    invoke-static {v6, v7}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v6, v5, v2

    const-string v6, "%8s"

    invoke-static {v6, v5}, Le/q/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x30

    const-string v7, "$this$replace"

    .line 6
    invoke-static {v5, v7}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v4, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    const-string v5, "(this as java.lang.Strin\u2026replace(oldChar, newChar)"

    invoke-static {v4, v5}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    sput-object v1, Le/q/f/a;->b:[Ljava/lang/String;

    sget-object v0, Le/q/f/a;->a:[Ljava/lang/String;

    const-string v1, ""

    aput-object v1, v0, v2

    const-string v1, "END_STREAM"

    aput-object v1, v0, v5

    new-array v1, v5, [I

    aput v5, v1, v2

    const-string v3, "PADDED"

    const/16 v6, 0x8

    aput-object v3, v0, v6

    move v0, v2

    :goto_1
    const-string v3, "|PADDED"

    if-ge v0, v5, :cond_1

    aget v7, v1, v0

    sget-object v8, Le/q/f/a;->a:[Ljava/lang/String;

    or-int/lit8 v9, v7, 0x8

    aget-object v7, v8, v7

    invoke-static {v7, v3}, Ld/f/b/d;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v8, v9

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    sget-object v0, Le/q/f/a;->a:[Ljava/lang/String;

    const/4 v7, 0x4

    const-string v8, "END_HEADERS"

    aput-object v8, v0, v7

    const-string v7, "PRIORITY"

    aput-object v7, v0, v4

    const/16 v4, 0x24

    const-string v7, "END_HEADERS|PRIORITY"

    aput-object v7, v0, v4

    const/4 v0, 0x3

    new-array v4, v0, [I

    fill-array-data v4, :array_0

    move v7, v2

    :goto_2
    if-ge v7, v0, :cond_3

    aget v8, v4, v7

    move v9, v2

    :goto_3
    if-ge v9, v5, :cond_2

    aget v10, v1, v9

    sget-object v11, Le/q/f/a;->a:[Ljava/lang/String;

    or-int v12, v10, v8

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v14, v11, v10

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "|"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v15, v11, v8

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v11, v12

    or-int/2addr v12, v6

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v10, v11, v10

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v10, v11, v8

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v11, v12

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_3
    sget-object v0, Le/q/f/a;->a:[Ljava/lang/String;

    array-length v0, v0

    :goto_4
    if-ge v2, v0, :cond_5

    sget-object v1, Le/q/f/a;->a:[Ljava/lang/String;

    aget-object v3, v1, v2

    if-nez v3, :cond_4

    sget-object v3, Le/q/f/a;->b:[Ljava/lang/String;

    aget-object v3, v3, v2

    aput-object v3, v1, v2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_5
    return-void

    nop

    :array_0
    .array-data 4
        0x4
        0x20
        0x24
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
