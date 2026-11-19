.class public final Lf/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf/g;
.implements Ljava/nio/channels/ReadableByteChannel;
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;
.implements Ljava/nio/channels/WritableByteChannel;
.implements Ljava/lang/Cloneable;
.implements Ljava/nio/channels/ByteChannel;


# instance fields
.field public b:Lf/d;

.field public c:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lf/a;J)J
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    const-string v4, "sink"

    invoke-static {v1, v4}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-ltz v6, :cond_0

    move v6, v7

    goto :goto_0

    :cond_0
    move v6, v8

    :goto_0
    if-eqz v6, :cond_13

    .line 1
    iget-wide v9, v0, Lf/a;->c:J

    cmp-long v6, v9, v4

    if-nez v6, :cond_1

    const-wide/16 v1, -0x1

    goto/16 :goto_c

    :cond_1
    cmp-long v6, v2, v9

    if-lez v6, :cond_2

    move-wide v2, v9

    :cond_2
    const-string v6, "source"

    .line 2
    invoke-static {v0, v6}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq v0, v1, :cond_3

    move v6, v7

    goto :goto_1

    :cond_3
    move v6, v8

    :goto_1
    if-eqz v6, :cond_12

    .line 3
    iget-wide v11, v0, Lf/a;->c:J

    const-wide/16 v13, 0x0

    move-wide v15, v2

    .line 4
    invoke-static/range {v11 .. v16}, Lb/c/a/a;->g(JJJ)V

    move-wide v9, v2

    :goto_2
    cmp-long v6, v9, v4

    if-lez v6, :cond_11

    iget-object v6, v0, Lf/a;->b:Lf/d;

    invoke-static {v6}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget v6, v6, Lf/d;->c:I

    iget-object v11, v0, Lf/a;->b:Lf/d;

    invoke-static {v11}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget v11, v11, Lf/d;->b:I

    sub-int/2addr v6, v11

    int-to-long v11, v6

    cmp-long v6, v9, v11

    const/16 v11, 0x2000

    if-gez v6, :cond_a

    iget-object v6, v1, Lf/a;->b:Lf/d;

    if-eqz v6, :cond_4

    invoke-static {v6}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget-object v6, v6, Lf/d;->g:Lf/d;

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    :goto_3
    if-eqz v6, :cond_6

    iget-boolean v12, v6, Lf/d;->e:Z

    if-eqz v12, :cond_6

    iget v12, v6, Lf/d;->c:I

    int-to-long v12, v12

    add-long/2addr v12, v9

    iget-boolean v14, v6, Lf/d;->d:Z

    if-eqz v14, :cond_5

    move v14, v8

    goto :goto_4

    :cond_5
    iget v14, v6, Lf/d;->b:I

    :goto_4
    int-to-long v14, v14

    sub-long/2addr v12, v14

    int-to-long v14, v11

    cmp-long v12, v12, v14

    if-gtz v12, :cond_6

    iget-object v4, v0, Lf/a;->b:Lf/d;

    invoke-static {v4}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    long-to-int v5, v9

    invoke-virtual {v4, v6, v5}, Lf/d;->d(Lf/d;I)V

    .line 5
    iget-wide v4, v0, Lf/a;->c:J

    sub-long/2addr v4, v9

    .line 6
    iput-wide v4, v0, Lf/a;->c:J

    .line 7
    iget-wide v4, v1, Lf/a;->c:J

    add-long/2addr v4, v9

    .line 8
    iput-wide v4, v1, Lf/a;->c:J

    goto/16 :goto_b

    .line 9
    :cond_6
    iget-object v6, v0, Lf/a;->b:Lf/d;

    invoke-static {v6}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    long-to-int v12, v9

    if-lez v12, :cond_7

    .line 10
    iget v13, v6, Lf/d;->c:I

    iget v14, v6, Lf/d;->b:I

    sub-int/2addr v13, v14

    if-gt v12, v13, :cond_7

    move v13, v7

    goto :goto_5

    :cond_7
    move v13, v8

    :goto_5
    if-eqz v13, :cond_9

    const/16 v13, 0x400

    if-lt v12, v13, :cond_8

    invoke-virtual {v6}, Lf/d;->c()Lf/d;

    move-result-object v13

    goto :goto_6

    :cond_8
    invoke-static {}, Lf/e;->b()Lf/d;

    move-result-object v13

    iget-object v14, v6, Lf/d;->a:[B

    iget-object v15, v13, Lf/d;->a:[B

    const/16 v16, 0x0

    iget v4, v6, Lf/d;->b:I

    add-int v18, v4, v12

    const/16 v19, 0x2

    move/from16 v17, v4

    invoke-static/range {v14 .. v19}, Ld/e/e;->b([B[BIIII)[B

    :goto_6
    iget v4, v13, Lf/d;->b:I

    add-int/2addr v4, v12

    iput v4, v13, Lf/d;->c:I

    iget v4, v6, Lf/d;->b:I

    add-int/2addr v4, v12

    iput v4, v6, Lf/d;->b:I

    iget-object v4, v6, Lf/d;->g:Lf/d;

    invoke-static {v4}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v13}, Lf/d;->b(Lf/d;)Lf/d;

    .line 11
    iput-object v13, v0, Lf/a;->b:Lf/d;

    goto :goto_7

    .line 12
    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "byteCount out of range"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 13
    :cond_a
    :goto_7
    iget-object v4, v0, Lf/a;->b:Lf/d;

    invoke-static {v4}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget v5, v4, Lf/d;->c:I

    iget v6, v4, Lf/d;->b:I

    sub-int/2addr v5, v6

    int-to-long v5, v5

    invoke-virtual {v4}, Lf/d;->a()Lf/d;

    move-result-object v12

    iput-object v12, v0, Lf/a;->b:Lf/d;

    iget-object v12, v1, Lf/a;->b:Lf/d;

    if-nez v12, :cond_b

    iput-object v4, v1, Lf/a;->b:Lf/d;

    iput-object v4, v4, Lf/d;->g:Lf/d;

    iput-object v4, v4, Lf/d;->f:Lf/d;

    goto :goto_a

    :cond_b
    invoke-static {v12}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget-object v12, v12, Lf/d;->g:Lf/d;

    invoke-static {v12}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    invoke-virtual {v12, v4}, Lf/d;->b(Lf/d;)Lf/d;

    .line 14
    iget-object v12, v4, Lf/d;->g:Lf/d;

    if-eq v12, v4, :cond_c

    move v13, v7

    goto :goto_8

    :cond_c
    move v13, v8

    :goto_8
    if-eqz v13, :cond_10

    invoke-static {v12}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget-boolean v12, v12, Lf/d;->e:Z

    if-nez v12, :cond_d

    goto :goto_a

    :cond_d
    iget v12, v4, Lf/d;->c:I

    iget v13, v4, Lf/d;->b:I

    sub-int/2addr v12, v13

    iget-object v13, v4, Lf/d;->g:Lf/d;

    invoke-static {v13}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget v13, v13, Lf/d;->c:I

    sub-int/2addr v11, v13

    iget-object v13, v4, Lf/d;->g:Lf/d;

    invoke-static {v13}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget-boolean v13, v13, Lf/d;->d:Z

    if-eqz v13, :cond_e

    move v13, v8

    goto :goto_9

    :cond_e
    iget-object v13, v4, Lf/d;->g:Lf/d;

    invoke-static {v13}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget v13, v13, Lf/d;->b:I

    :goto_9
    add-int/2addr v11, v13

    if-le v12, v11, :cond_f

    goto :goto_a

    :cond_f
    iget-object v11, v4, Lf/d;->g:Lf/d;

    invoke-static {v11}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v11, v12}, Lf/d;->d(Lf/d;I)V

    invoke-virtual {v4}, Lf/d;->a()Lf/d;

    invoke-static {v4}, Lf/e;->a(Lf/d;)V

    .line 15
    :goto_a
    iget-wide v11, v0, Lf/a;->c:J

    sub-long/2addr v11, v5

    .line 16
    iput-wide v11, v0, Lf/a;->c:J

    .line 17
    iget-wide v11, v1, Lf/a;->c:J

    add-long/2addr v11, v5

    .line 18
    iput-wide v11, v1, Lf/a;->c:J

    sub-long/2addr v9, v5

    const-wide/16 v4, 0x0

    goto/16 :goto_2

    .line 19
    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "cannot compact"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_11
    :goto_b
    move-wide v1, v2

    :goto_c
    return-wide v1

    .line 20
    :cond_12
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "source == this"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 21
    :cond_13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "byteCount < 0: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public b()B
    .locals 9

    .line 1
    iget-wide v0, p0, Lf/a;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lf/a;->b:Lf/d;

    invoke-static {v0}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget v1, v0, Lf/d;->b:I

    iget v2, v0, Lf/d;->c:I

    iget-object v3, v0, Lf/d;->a:[B

    add-int/lit8 v4, v1, 0x1

    aget-byte v1, v3, v1

    .line 3
    iget-wide v5, p0, Lf/a;->c:J

    const-wide/16 v7, 0x1

    sub-long/2addr v5, v7

    .line 4
    iput-wide v5, p0, Lf/a;->c:J

    if-ne v4, v2, :cond_0

    .line 5
    invoke-virtual {v0}, Lf/d;->a()Lf/d;

    move-result-object v2

    iput-object v2, p0, Lf/a;->b:Lf/d;

    invoke-static {v0}, Lf/e;->a(Lf/d;)V

    goto :goto_0

    :cond_0
    iput v4, v0, Lf/d;->b:I

    :goto_0
    return v1

    :cond_1
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public final c(I)Lf/d;
    .locals 3

    const/16 v0, 0x2000

    const/4 v1, 0x1

    if-lt p1, v1, :cond_0

    if-gt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    iget-object v1, p0, Lf/a;->b:Lf/d;

    if-nez v1, :cond_1

    invoke-static {}, Lf/e;->b()Lf/d;

    move-result-object p1

    iput-object p1, p0, Lf/a;->b:Lf/d;

    iput-object p1, p1, Lf/d;->g:Lf/d;

    iput-object p1, p1, Lf/d;->f:Lf/d;

    goto :goto_2

    :cond_1
    invoke-static {v1}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget-object v1, v1, Lf/d;->g:Lf/d;

    invoke-static {v1}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget v2, v1, Lf/d;->c:I

    add-int/2addr v2, p1

    if-gt v2, v0, :cond_3

    iget-boolean p1, v1, Lf/d;->e:Z

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move-object p1, v1

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, Lf/e;->b()Lf/d;

    move-result-object p1

    invoke-virtual {v1, p1}, Lf/d;->b(Lf/d;)Lf/d;

    :goto_2
    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unexpected capacity"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public clone()Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lf/a;

    invoke-direct {v0}, Lf/a;-><init>()V

    .line 2
    iget-wide v1, p0, Lf/a;->c:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v1, p0, Lf/a;->b:Lf/d;

    invoke-static {v1}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lf/d;->c()Lf/d;

    move-result-object v2

    iput-object v2, v0, Lf/a;->b:Lf/d;

    iput-object v2, v2, Lf/d;->g:Lf/d;

    iput-object v2, v2, Lf/d;->f:Lf/d;

    iget-object v3, v1, Lf/d;->f:Lf/d;

    :goto_0
    if-eq v3, v1, :cond_1

    iget-object v4, v2, Lf/d;->g:Lf/d;

    invoke-static {v4}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    invoke-static {v3}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lf/d;->c()Lf/d;

    move-result-object v5

    invoke-virtual {v4, v5}, Lf/d;->b(Lf/d;)Lf/d;

    iget-object v3, v3, Lf/d;->f:Lf/d;

    goto :goto_0

    .line 4
    :cond_1
    iget-wide v1, p0, Lf/a;->c:J

    .line 5
    iput-wide v1, v0, Lf/a;->c:J

    :goto_1
    return-object v0
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public d(Lf/g;)J
    .locals 6

    const-string v0, "source"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    :goto_0
    const/16 v2, 0x2000

    int-to-long v2, v2

    move-object v4, p1

    check-cast v4, Lf/a;

    invoke-virtual {v4, p0, v2, v3}, Lf/a;->a(Lf/a;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-nez v4, :cond_0

    return-wide v0

    :cond_0
    add-long/2addr v0, v2

    goto :goto_0
.end method

.method public e(I)Lf/a;
    .locals 5

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lf/a;->c(I)Lf/d;

    move-result-object v0

    iget-object v1, v0, Lf/d;->a:[B

    iget v2, v0, Lf/d;->c:I

    add-int/lit8 v3, v2, 0x1

    ushr-int/lit8 v4, p1, 0x18

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    add-int/lit8 v2, v3, 0x1

    ushr-int/lit8 v4, p1, 0x10

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    add-int/lit8 v3, v2, 0x1

    ushr-int/lit8 v4, p1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    add-int/lit8 v2, v3, 0x1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v1, v3

    iput v2, v0, Lf/d;->c:I

    .line 1
    iget-wide v0, p0, Lf/a;->c:J

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    .line 2
    iput-wide v0, p0, Lf/a;->c:J

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    :cond_0
    :goto_0
    move v2, v3

    goto/16 :goto_3

    :cond_1
    instance-of v4, v1, Lf/a;

    if-nez v4, :cond_2

    goto/16 :goto_3

    .line 1
    :cond_2
    iget-wide v4, v0, Lf/a;->c:J

    .line 2
    check-cast v1, Lf/a;

    .line 3
    iget-wide v6, v1, Lf/a;->c:J

    cmp-long v6, v4, v6

    if-eqz v6, :cond_3

    goto :goto_3

    :cond_3
    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-nez v4, :cond_4

    goto :goto_0

    .line 4
    :cond_4
    iget-object v4, v0, Lf/a;->b:Lf/d;

    invoke-static {v4}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget-object v1, v1, Lf/a;->b:Lf/d;

    invoke-static {v1}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget v5, v4, Lf/d;->b:I

    iget v8, v1, Lf/d;->b:I

    move-wide v9, v6

    .line 5
    :goto_1
    iget-wide v11, v0, Lf/a;->c:J

    cmp-long v11, v9, v11

    if-gez v11, :cond_0

    .line 6
    iget v11, v4, Lf/d;->c:I

    sub-int/2addr v11, v5

    iget v12, v1, Lf/d;->c:I

    sub-int/2addr v12, v8

    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v11

    int-to-long v11, v11

    move-wide v13, v6

    :goto_2
    cmp-long v15, v13, v11

    if-gez v15, :cond_6

    iget-object v15, v4, Lf/d;->a:[B

    add-int/lit8 v16, v5, 0x1

    aget-byte v5, v15, v5

    iget-object v15, v1, Lf/d;->a:[B

    add-int/lit8 v17, v8, 0x1

    aget-byte v8, v15, v8

    if-eq v5, v8, :cond_5

    goto :goto_3

    :cond_5
    const-wide/16 v18, 0x1

    add-long v13, v13, v18

    move/from16 v5, v16

    move/from16 v8, v17

    goto :goto_2

    :cond_6
    iget v13, v4, Lf/d;->c:I

    if-ne v5, v13, :cond_7

    iget-object v4, v4, Lf/d;->f:Lf/d;

    invoke-static {v4}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget v5, v4, Lf/d;->b:I

    :cond_7
    iget v13, v1, Lf/d;->c:I

    if-ne v8, v13, :cond_8

    iget-object v1, v1, Lf/d;->f:Lf/d;

    invoke-static {v1}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget v8, v1, Lf/d;->b:I

    :cond_8
    add-long/2addr v9, v11

    goto :goto_1

    :goto_3
    return v2
.end method

.method public flush()V
    .locals 0

    return-void
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lf/a;->b:Lf/d;

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    :cond_0
    iget v2, v0, Lf/d;->b:I

    iget v3, v0, Lf/d;->c:I

    :goto_0
    if-ge v2, v3, :cond_1

    mul-int/lit8 v1, v1, 0x1f

    iget-object v4, v0, Lf/d;->a:[B

    aget-byte v4, v4, v2

    add-int/2addr v1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lf/d;->f:Lf/d;

    invoke-static {v0}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget-object v2, p0, Lf/a;->b:Lf/d;

    if-ne v0, v2, :cond_0

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public isOpen()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 6

    const-string v0, "sink"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf/a;->b:Lf/d;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    iget v2, v0, Lf/d;->c:I

    iget v3, v0, Lf/d;->b:I

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, v0, Lf/d;->a:[B

    iget v3, v0, Lf/d;->b:I

    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    iget p1, v0, Lf/d;->b:I

    add-int/2addr p1, v1

    iput p1, v0, Lf/d;->b:I

    iget-wide v2, p0, Lf/a;->c:J

    int-to-long v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lf/a;->c:J

    iget v2, v0, Lf/d;->c:I

    if-ne p1, v2, :cond_0

    invoke-virtual {v0}, Lf/d;->a()Lf/d;

    move-result-object p1

    iput-object p1, p0, Lf/a;->b:Lf/d;

    invoke-static {v0}, Lf/e;->a(Lf/d;)V

    :cond_0
    return v1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    .line 1
    iget-wide v0, p0, Lf/a;->c:J

    const v2, 0x7fffffff

    int-to-long v2, v2

    cmp-long v2, v0, v2

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-gtz v2, :cond_0

    move v2, v7

    goto :goto_0

    :cond_0
    move v2, v6

    :goto_0
    if-eqz v2, :cond_5

    long-to-int v8, v0

    if-nez v8, :cond_1

    .line 2
    sget-object v0, Lf/b;->e:Lf/b;

    goto :goto_3

    :cond_1
    const-wide/16 v2, 0x0

    int-to-long v4, v8

    invoke-static/range {v0 .. v5}, Lb/c/a/a;->g(JJJ)V

    iget-object v0, p0, Lf/a;->b:Lf/d;

    move v1, v6

    move v2, v1

    :goto_1
    if-ge v1, v8, :cond_3

    invoke-static {v0}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget v3, v0, Lf/d;->c:I

    iget v4, v0, Lf/d;->b:I

    if-eq v3, v4, :cond_2

    sub-int/2addr v3, v4

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    iget-object v0, v0, Lf/d;->f:Lf/d;

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "s.limit == s.pos"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_3
    new-array v0, v2, [[B

    mul-int/lit8 v1, v2, 0x2

    new-array v1, v1, [I

    iget-object v3, p0, Lf/a;->b:Lf/d;

    move v4, v6

    :goto_2
    if-ge v6, v8, :cond_4

    invoke-static {v3}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget-object v5, v3, Lf/d;->a:[B

    aput-object v5, v0, v4

    iget v5, v3, Lf/d;->c:I

    iget v9, v3, Lf/d;->b:I

    sub-int/2addr v5, v9

    add-int/2addr v6, v5

    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    move-result v5

    aput v5, v1, v4

    add-int v5, v4, v2

    iget v9, v3, Lf/d;->b:I

    aput v9, v1, v5

    iput-boolean v7, v3, Lf/d;->d:Z

    add-int/2addr v4, v7

    iget-object v3, v3, Lf/d;->f:Lf/d;

    goto :goto_2

    :cond_4
    new-instance v2, Lf/f;

    invoke-direct {v2, v0, v1}, Lf/f;-><init>([[B[I)V

    move-object v0, v2

    .line 3
    :goto_3
    invoke-virtual {v0}, Lf/b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_5
    const-string v0, "size > Int.MAX_VALUE: "

    .line 4
    invoke-static {v0}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 5
    iget-wide v1, p0, Lf/a;->c:J

    .line 6
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 6

    const-string v0, "source"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    move v1, v0

    :goto_0
    if-lez v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lf/a;->c(I)Lf/d;

    move-result-object v2

    iget v3, v2, Lf/d;->c:I

    rsub-int v3, v3, 0x2000

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-object v4, v2, Lf/d;->a:[B

    iget v5, v2, Lf/d;->c:I

    invoke-virtual {p1, v4, v5, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr v1, v3

    iget v4, v2, Lf/d;->c:I

    add-int/2addr v4, v3

    iput v4, v2, Lf/d;->c:I

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lf/a;->c:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Lf/a;->c:J

    return v0
.end method
