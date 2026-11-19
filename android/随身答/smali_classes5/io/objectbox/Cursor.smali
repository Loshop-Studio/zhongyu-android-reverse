.class public abstract Lio/objectbox/Cursor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Closeable;"
    }
.end annotation


# static fields
.field public static h:Z

.field public static i:Z


# instance fields
.field public final a:Lio/objectbox/Transaction;

.field public final b:J

.field public final c:Lio/objectbox/EntityInfo;

.field public final d:Lio/objectbox/BoxStore;

.field public final e:Z

.field public f:Z

.field public final g:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/EntityInfo;Lio/objectbox/BoxStore;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    iput-object p1, p0, Lio/objectbox/Cursor;->a:Lio/objectbox/Transaction;

    .line 7
    .line 8
    invoke-virtual {p1}, Lio/objectbox/Transaction;->isReadOnly()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput-boolean p1, p0, Lio/objectbox/Cursor;->e:Z

    .line 13
    .line 14
    iput-wide p2, p0, Lio/objectbox/Cursor;->b:J

    .line 15
    .line 16
    iput-object p4, p0, Lio/objectbox/Cursor;->c:Lio/objectbox/EntityInfo;

    .line 17
    .line 18
    iput-object p5, p0, Lio/objectbox/Cursor;->d:Lio/objectbox/BoxStore;

    .line 19
    .line 20
    invoke-interface {p4}, Lio/objectbox/EntityInfo;->d()[Lio/objectbox/Property;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    array-length p4, p1

    .line 25
    const/4 v0, 0x0

    .line 26
    :goto_0
    if-ge v0, p4, :cond_1

    .line 27
    .line 28
    aget-object v1, p1, v0

    .line 29
    .line 30
    invoke-virtual {v1}, Lio/objectbox/Property;->c()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    iget-object v2, v1, Lio/objectbox/Property;->h:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p0, v2}, Lio/objectbox/Cursor;->j(Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {v1, v2}, Lio/objectbox/Property;->g(I)V

    .line 43
    .line 44
    .line 45
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    sget-boolean p1, Lio/objectbox/Cursor;->h:Z

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    new-instance p1, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-direct {p1}, Ljava/lang/Throwable;-><init>()V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const/4 p1, 0x0

    .line 59
    :goto_1
    iput-object p1, p0, Lio/objectbox/Cursor;->g:Ljava/lang/Throwable;

    .line 60
    .line 61
    invoke-virtual {p0, p2, p3, p5}, Lio/objectbox/Cursor;->nativeSetBoxStoreForEntities(JLjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    const-string p2, "Transaction is null"

    .line 68
    .line 69
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1
.end method

.method public static native collect002033(JJIIJIJIFIFIFIDIDID)J
.end method

.method public static native collect004000(JJIIJIJIJIJ)J
.end method

.method public static native collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J
.end method

.method public static native collect400000(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)J
.end method

.method public static native collect430000(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BI[BI[B)J
.end method

.method public static native nativeDeleteEntity(JJ)Z
.end method

.method public static native nativeFirstEntity(J)Ljava/lang/Object;
.end method

.method public static native nativeGetEntity(JJ)Ljava/lang/Object;
.end method

.method public static native nativeLookupKeyUsingIndex(JILjava/lang/String;)J
.end method

.method public static native nativeNextEntity(J)Ljava/lang/Object;
.end method

.method public static native nativeSeek(JJ)Z
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/lang/Class;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lio/objectbox/relation/ToMany;

    .line 6
    .line 7
    invoke-virtual {p1}, Lio/objectbox/relation/ToMany;->w()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Lio/objectbox/Cursor;->l(Ljava/lang/Class;)Lio/objectbox/Cursor;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    :try_start_0
    invoke-virtual {p1, p0, p2}, Lio/objectbox/relation/ToMany;->v(Lio/objectbox/Cursor;Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p2}, Lio/objectbox/Cursor;->close()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    :try_start_2
    invoke-virtual {p2}, Lio/objectbox/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_2
    move-exception p2

    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    :goto_0
    throw v0

    .line 40
    :cond_1
    return-void
.end method

.method public c(J)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/objectbox/Cursor;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lio/objectbox/Cursor;->nativeDeleteEntity(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public declared-synchronized close()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/objectbox/Cursor;->f:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lio/objectbox/Cursor;->f:Z

    .line 8
    .line 9
    iget-object v0, p0, Lio/objectbox/Cursor;->a:Lio/objectbox/Transaction;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/objectbox/Transaction;->j()Lio/objectbox/BoxStore;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->isClosed()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-wide v0, p0, Lio/objectbox/Cursor;->b:J

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1}, Lio/objectbox/Cursor;->nativeDestroy(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw v0
.end method

.method public finalize()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/objectbox/Cursor;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Lio/objectbox/Cursor;->e:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-boolean v0, Lio/objectbox/Cursor;->i:Z

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    :cond_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 14
    .line 15
    const-string v1, "Cursor was not closed."

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lio/objectbox/Cursor;->g:Ljava/lang/Throwable;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 25
    .line 26
    const-string v1, "Cursor was initially created here:"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lio/objectbox/Cursor;->g:Ljava/lang/Throwable;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 34
    .line 35
    .line 36
    :cond_1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/io/PrintStream;->flush()V

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {p0}, Lio/objectbox/Cursor;->close()V

    .line 42
    .line 43
    .line 44
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 45
    .line 46
    .line 47
    :cond_3
    return-void
.end method

.method public g(J)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/objectbox/Cursor;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lio/objectbox/Cursor;->nativeGetEntity(JJ)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public h(ILio/objectbox/Property;J)Ljava/util/List;
    .locals 8

    .line 1
    :try_start_0
    iget-wide v2, p0, Lio/objectbox/Cursor;->b:J

    .line 2
    .line 3
    invoke-virtual {p2}, Lio/objectbox/Property;->a()I

    .line 4
    .line 5
    .line 6
    move-result v5

    .line 7
    move-object v1, p0

    .line 8
    move v4, p1

    .line 9
    move-wide v6, p3

    .line 10
    invoke-virtual/range {v1 .. v7}, Lio/objectbox/Cursor;->nativeGetBacklinkEntities(JIIJ)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object p1

    .line 15
    :catch_0
    move-exception v0

    .line 16
    move-object p1, v0

    .line 17
    new-instance p3, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    new-instance p4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v0, "Please check if the given property belongs to a valid @Relation: "

    .line 25
    .line 26
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-direct {p3, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    throw p3
.end method

.method public abstract i(Ljava/lang/Object;)J
.end method

.method public isClosed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/objectbox/Cursor;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public j(Ljava/lang/String;)I
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/objectbox/Cursor;->b:J

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1, p1}, Lio/objectbox/Cursor;->nativePropertyId(JLjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public k(IIJZ)Ljava/util/List;
    .locals 8

    .line 1
    iget-wide v1, p0, Lio/objectbox/Cursor;->b:J

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move v3, p1

    .line 5
    move v4, p2

    .line 6
    move-wide v5, p3

    .line 7
    move v7, p5

    .line 8
    invoke-virtual/range {v0 .. v7}, Lio/objectbox/Cursor;->nativeGetRelationEntities(JIIJZ)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public l(Ljava/lang/Class;)Lio/objectbox/Cursor;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->d:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/objectbox/BoxStore;->v(Ljava/lang/Class;)Lio/objectbox/EntityInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-wide v0, p0, Lio/objectbox/Cursor;->b:J

    .line 8
    .line 9
    invoke-interface {p1}, Lio/objectbox/EntityInfo;->j()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0, v0, v1, v2}, Lio/objectbox/Cursor;->nativeGetCursorFor(JI)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-interface {p1}, Lio/objectbox/EntityInfo;->i()Lc8/b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v2, p0, Lio/objectbox/Cursor;->a:Lio/objectbox/Transaction;

    .line 22
    .line 23
    iget-object v3, p0, Lio/objectbox/Cursor;->d:Lio/objectbox/BoxStore;

    .line 24
    .line 25
    invoke-interface {p1, v2, v0, v1, v3}, Lc8/b;->a(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)Lio/objectbox/Cursor;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method

.method public m()Lio/objectbox/Transaction;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->a:Lio/objectbox/Transaction;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/objectbox/Cursor;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public native nativeCount(JJ)J
.end method

.method public native nativeDeleteAll(J)V
.end method

.method public native nativeDestroy(J)V
.end method

.method public native nativeGetAllEntities(J)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end method

.method public native nativeGetBacklinkEntities(JIIJ)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JIIJ)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end method

.method public native nativeGetBacklinkIds(JIIJ)[J
.end method

.method public native nativeGetCursorFor(JI)J
.end method

.method public native nativeGetRelationEntities(JIIJZ)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JIIJZ)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end method

.method public native nativeGetRelationIds(JIIJZ)[J
.end method

.method public native nativeModifyRelations(JIJ[JZ)V
.end method

.method public native nativeModifyRelationsSingle(JIJJZ)V
.end method

.method public native nativePropertyId(JLjava/lang/String;)I
.end method

.method public native nativeRenew(J)J
.end method

.method public native nativeSetBoxStoreForEntities(JLjava/lang/Object;)V
.end method

.method public o(IJ[JZ)V
    .locals 8

    .line 1
    iget-wide v1, p0, Lio/objectbox/Cursor;->b:J

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move v3, p1

    .line 5
    move-wide v4, p2

    .line 6
    move-object v6, p4

    .line 7
    move v7, p5

    .line 8
    invoke-virtual/range {v0 .. v7}, Lio/objectbox/Cursor;->nativeModifyRelations(JIJ[JZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public abstract p(Ljava/lang/Object;)J
.end method

.method public q()V
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/objectbox/Cursor;->b:J

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lio/objectbox/Cursor;->nativeRenew(J)J

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Cursor "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-wide v1, p0, Lio/objectbox/Cursor;->b:J

    .line 12
    .line 13
    const/16 v3, 0x10

    .line 14
    .line 15
    invoke-static {v1, v2, v3}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lio/objectbox/Cursor;->isClosed()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    const-string v1, "(closed)"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v1, ""

    .line 32
    .line 33
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
.end method
