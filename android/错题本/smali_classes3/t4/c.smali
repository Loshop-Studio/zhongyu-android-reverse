.class public final Lt4/c;
.super Landroidx/navigation/NavType;
.source "SourceFile"


# instance fields
.field public final a:Li7/b;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Li7/b;)V
    .locals 1

    .line 1
    const-string v0, "serializer"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Landroidx/navigation/NavType;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lt4/c;->a:Li7/b;

    .line 11
    .line 12
    iput-object p1, p0, Lt4/c;->b:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v1, Lt4/i;->a:Ln7/o;

    .line 2
    .line 3
    iget-object v0, p0, Lt4/c;->a:Li7/b;

    .line 4
    .line 5
    move-object v6, v0

    .line 6
    check-cast v6, Li7/a;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v0, "deserializer"

    .line 12
    .line 13
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v3, Lkotlinx/serialization/json/internal/x;

    .line 17
    .line 18
    invoke-direct {v3, p1}, Lkotlinx/serialization/json/internal/x;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lkotlinx/serialization/json/internal/t;

    .line 22
    .line 23
    sget-object v2, Lkotlinx/serialization/json/internal/WriteMode;->OBJ:Lkotlinx/serialization/json/internal/WriteMode;

    .line 24
    .line 25
    invoke-interface {v6}, Li7/a;->getDescriptor()Lk7/g;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-direct/range {v0 .. v5}, Lkotlinx/serialization/json/internal/t;-><init>(Ln7/b;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/x;Lk7/g;Le7/r;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v6}, Lkotlinx/serialization/json/internal/t;->decodeSerializableValue(Li7/a;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v3}, Lkotlinx/serialization/json/internal/x;->e()B

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/16 v2, 0xa

    .line 42
    .line 43
    if-ne v1, v2, :cond_0

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v1, "Expected EOF after parsing, but had "

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget v1, v3, Lkotlinx/serialization/json/internal/x;->b:I

    .line 54
    .line 55
    add-int/lit8 v1, v1, -0x1

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p1, " instead"

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const/4 v0, 0x0

    .line 74
    const/4 v1, 0x6

    .line 75
    const/4 v2, 0x0

    .line 76
    invoke-static {v3, p1, v0, v2, v1}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    throw v2
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 7

    .line 1
    sget-object v0, Lt4/i;->a:Ln7/o;

    .line 2
    .line 3
    iget-object v1, p0, Lt4/c;->a:Li7/b;

    .line 4
    .line 5
    check-cast v1, Li7/e;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v2, "serializer"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Ld2/c;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v2, v3, v4}, Ld2/c;-><init>(IZ)V

    .line 20
    .line 21
    .line 22
    sget-object v3, Lkotlinx/serialization/json/internal/c;->c:Lkotlinx/serialization/json/internal/c;

    .line 23
    .line 24
    monitor-enter v3

    .line 25
    :try_start_0
    iget-object v4, v3, Lkotlinx/serialization/json/internal/d;->a:Lkotlin/collections/p;

    .line 26
    .line 27
    invoke-virtual {v4}, Lkotlin/collections/p;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/4 v6, 0x0

    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    move-object v4, v6

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v4}, Lkotlin/collections/p;->removeLast()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    :goto_0
    check-cast v4, [C

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    iget v5, v3, Lkotlinx/serialization/json/internal/d;->b:I

    .line 45
    .line 46
    array-length v6, v4

    .line 47
    sub-int/2addr v5, v6

    .line 48
    iput v5, v3, Lkotlinx/serialization/json/internal/d;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    move-object v6, v4

    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    monitor-exit v3

    .line 55
    if-nez v6, :cond_2

    .line 56
    .line 57
    const/16 v3, 0x80

    .line 58
    .line 59
    new-array v6, v3, [C

    .line 60
    .line 61
    :cond_2
    iput-object v6, v2, Ld2/c;->c:Ljava/lang/Object;

    .line 62
    .line 63
    :try_start_1
    invoke-static {v0, v2, v1, p1}, Lkotlinx/serialization/json/internal/j;->i(Ln7/b;Ld2/c;Li7/e;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Ld2/c;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    invoke-virtual {v2}, Ld2/c;->f()V

    .line 71
    .line 72
    .line 73
    return-object p1

    .line 74
    :catchall_1
    move-exception p1

    .line 75
    invoke-virtual {v2}, Ld2/c;->f()V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :goto_2
    monitor-exit v3

    .line 80
    throw p1
.end method

.method public final get(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "bundle"

    .line 2
    .line 3
    const-string v1, "key"

    .line 4
    .line 5
    invoke-static {p1, v0, p2, v1, p1}, Landroidx/compose/material3/c;->z(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1, p2}, Landroidx/savedstate/SavedStateReader;->getString-impl(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lt4/c;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lt4/c;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final parseValue(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lt4/c;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final put(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "bundle"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "key"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "value"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Landroidx/savedstate/SavedStateWriter;->constructor-impl(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p3}, Lt4/c;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-static {p1, p2, p3}, Landroidx/savedstate/SavedStateWriter;->putString-impl(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final serializeAsValue(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lt4/c;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "encode(...)"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method
