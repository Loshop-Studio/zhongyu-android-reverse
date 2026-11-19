.class public final Le/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/f$a;
    }
.end annotation


# static fields
.field public static final e:[Le/d;

.field public static final f:[Le/d;

.field public static final g:Le/f;

.field public static final h:Le/f;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:[Ljava/lang/String;

.field public final d:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 20

    const/16 v0, 0x9

    new-array v1, v0, [Le/d;

    sget-object v2, Le/d;->p:Le/d;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v4, Le/d;->q:Le/d;

    const/4 v5, 0x1

    aput-object v4, v1, v5

    sget-object v6, Le/d;->r:Le/d;

    const/4 v7, 0x2

    aput-object v6, v1, v7

    sget-object v8, Le/d;->j:Le/d;

    const/4 v9, 0x3

    aput-object v8, v1, v9

    sget-object v10, Le/d;->l:Le/d;

    const/4 v11, 0x4

    aput-object v10, v1, v11

    sget-object v12, Le/d;->k:Le/d;

    const/4 v13, 0x5

    aput-object v12, v1, v13

    sget-object v14, Le/d;->m:Le/d;

    const/4 v15, 0x6

    aput-object v14, v1, v15

    sget-object v16, Le/d;->o:Le/d;

    const/16 v17, 0x7

    aput-object v16, v1, v17

    sget-object v18, Le/d;->n:Le/d;

    const/16 v19, 0x8

    aput-object v18, v1, v19

    sput-object v1, Le/f;->e:[Le/d;

    const/16 v0, 0x10

    new-array v0, v0, [Le/d;

    aput-object v2, v0, v3

    aput-object v4, v0, v5

    aput-object v6, v0, v7

    aput-object v8, v0, v9

    aput-object v10, v0, v11

    aput-object v12, v0, v13

    aput-object v14, v0, v15

    aput-object v16, v0, v17

    aput-object v18, v0, v19

    sget-object v2, Le/d;->h:Le/d;

    const/16 v4, 0x9

    aput-object v2, v0, v4

    sget-object v2, Le/d;->i:Le/d;

    const/16 v4, 0xa

    aput-object v2, v0, v4

    sget-object v2, Le/d;->f:Le/d;

    const/16 v4, 0xb

    aput-object v2, v0, v4

    sget-object v2, Le/d;->g:Le/d;

    const/16 v4, 0xc

    aput-object v2, v0, v4

    sget-object v2, Le/d;->d:Le/d;

    const/16 v4, 0xd

    aput-object v2, v0, v4

    sget-object v2, Le/d;->e:Le/d;

    const/16 v4, 0xe

    aput-object v2, v0, v4

    sget-object v2, Le/d;->c:Le/d;

    const/16 v4, 0xf

    aput-object v2, v0, v4

    sput-object v0, Le/f;->f:[Le/d;

    new-instance v2, Le/f$a;

    invoke-direct {v2, v5}, Le/f$a;-><init>(Z)V

    array-length v4, v1

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Le/d;

    invoke-virtual {v2, v1}, Le/f$a;->b([Le/d;)Le/f$a;

    new-array v1, v7, [Le/p;

    sget-object v4, Le/p;->c:Le/p;

    aput-object v4, v1, v3

    sget-object v6, Le/p;->d:Le/p;

    aput-object v6, v1, v5

    invoke-virtual {v2, v1}, Le/f$a;->d([Le/p;)Le/f$a;

    invoke-virtual {v2, v5}, Le/f$a;->c(Z)Le/f$a;

    invoke-virtual {v2}, Le/f$a;->a()Le/f;

    new-instance v1, Le/f$a;

    invoke-direct {v1, v5}, Le/f$a;-><init>(Z)V

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Le/d;

    invoke-virtual {v1, v2}, Le/f$a;->b([Le/d;)Le/f$a;

    new-array v2, v7, [Le/p;

    aput-object v4, v2, v3

    aput-object v6, v2, v5

    invoke-virtual {v1, v2}, Le/f$a;->d([Le/p;)Le/f$a;

    invoke-virtual {v1, v5}, Le/f$a;->c(Z)Le/f$a;

    invoke-virtual {v1}, Le/f$a;->a()Le/f;

    move-result-object v1

    sput-object v1, Le/f;->g:Le/f;

    new-instance v1, Le/f$a;

    invoke-direct {v1, v5}, Le/f$a;-><init>(Z)V

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/d;

    invoke-virtual {v1, v0}, Le/f$a;->b([Le/d;)Le/f$a;

    new-array v0, v11, [Le/p;

    aput-object v4, v0, v3

    aput-object v6, v0, v5

    sget-object v2, Le/p;->e:Le/p;

    aput-object v2, v0, v7

    sget-object v2, Le/p;->f:Le/p;

    aput-object v2, v0, v9

    invoke-virtual {v1, v0}, Le/f$a;->d([Le/p;)Le/f$a;

    invoke-virtual {v1, v5}, Le/f$a;->c(Z)Le/f$a;

    invoke-virtual {v1}, Le/f$a;->a()Le/f;

    .line 1
    new-instance v0, Le/f;

    const/4 v1, 0x0

    invoke-direct {v0, v3, v3, v1, v1}, Le/f;-><init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V

    .line 2
    sput-object v0, Le/f;->h:Le/f;

    return-void
.end method

.method public constructor <init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Le/f;->a:Z

    iput-boolean p2, p0, Le/f;->b:Z

    iput-object p3, p0, Le/f;->c:[Ljava/lang/String;

    iput-object p4, p0, Le/f;->d:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Le/f;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    iget-boolean v2, p0, Le/f;->a:Z

    check-cast p1, Le/f;

    iget-boolean v3, p1, Le/f;->a:Z

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    if-eqz v2, :cond_5

    iget-object v2, p0, Le/f;->c:[Ljava/lang/String;

    iget-object v3, p1, Le/f;->c:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Le/f;->d:[Ljava/lang/String;

    iget-object v3, p1, Le/f;->d:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Le/f;->b:Z

    iget-boolean p1, p1, Le/f;->b:Z

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Le/f;->a:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x20f

    iget-object v1, p0, Le/f;->c:[Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Le/f;->d:[Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Le/f;->b:Z

    xor-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    goto :goto_1

    :cond_2
    const/16 v0, 0x11

    :goto_1
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-boolean v0, p0, Le/f;->a:Z

    if-nez v0, :cond_0

    const-string v0, "ConnectionSpec()"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConnectionSpec("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "cipherSuites="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1
    iget-object v1, p0, Le/f;->c:[Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    new-instance v4, Ljava/util/ArrayList;

    array-length v5, v1

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    array-length v5, v1

    move v6, v2

    :goto_0
    if-ge v6, v5, :cond_3

    aget-object v7, v1, v6

    sget-object v8, Le/d;->s:Le/d$a;

    .line 2
    monitor-enter v8

    :try_start_0
    const-string v9, "javaName"

    invoke-static {v7, v9}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v9, Le/d;->b:Ljava/util/Map;

    .line 4
    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Le/d;

    if-nez v10, :cond_2

    invoke-virtual {v8, v7}, Le/d$a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Le/d;

    if-nez v10, :cond_1

    new-instance v10, Le/d;

    invoke-direct {v10, v7, v3}, Le/d;-><init>(Ljava/lang/String;Ld/f/b/c;)V

    :cond_1
    invoke-interface {v9, v7, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v8

    .line 5
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 6
    monitor-exit v8

    throw v0

    .line 7
    :cond_3
    invoke-static {v4}, Ld/e/e;->f(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_4
    move-object v1, v3

    :goto_1
    const-string v4, "[all enabled]"

    .line 8
    invoke-static {v1, v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "tlsVersions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    iget-object v1, p0, Le/f;->d:[Ljava/lang/String;

    if-eqz v1, :cond_9

    new-instance v3, Ljava/util/ArrayList;

    array-length v4, v1

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    array-length v4, v1

    :goto_2
    if-ge v2, v4, :cond_8

    aget-object v5, v1, v2

    const-string v6, "javaName"

    .line 10
    invoke-static {v5, v6}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    const v7, 0x4b88569

    if-eq v6, v7, :cond_6

    const v7, 0x4c38896

    if-eq v6, v7, :cond_5

    packed-switch v6, :pswitch_data_0

    goto :goto_4

    :pswitch_0
    const-string v6, "TLSv1.3"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    sget-object v5, Le/p;->c:Le/p;

    goto :goto_3

    :pswitch_1
    const-string v6, "TLSv1.2"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    sget-object v5, Le/p;->d:Le/p;

    goto :goto_3

    :pswitch_2
    const-string v6, "TLSv1.1"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    sget-object v5, Le/p;->e:Le/p;

    goto :goto_3

    :cond_5
    const-string v6, "TLSv1"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    sget-object v5, Le/p;->f:Le/p;

    goto :goto_3

    :cond_6
    const-string v6, "SSLv3"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    sget-object v5, Le/p;->g:Le/p;

    .line 11
    :goto_3
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 12
    :cond_7
    :goto_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unexpected TLS version: "

    invoke-static {v1, v5}, Lb/a/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 13
    :cond_8
    invoke-static {v3}, Ld/e/e;->f(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    :cond_9
    const-string v1, "[all enabled]"

    .line 14
    invoke-static {v3, v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "supportsTlsExtensions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Le/f;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1dfc3f27
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
