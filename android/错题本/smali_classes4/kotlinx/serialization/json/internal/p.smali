.class public final Lkotlinx/serialization/json/internal/p;
.super Lkotlinx/serialization/json/internal/n;
.source "SourceFile"


# instance fields
.field public final j:Ln7/u;

.field public final k:Ljava/util/List;

.field public final l:I

.field public m:I


# direct methods
.method public constructor <init>(Ln7/b;Ln7/u;)V
    .locals 2

    .line 1
    const-string v0, "json"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/16 v1, 0xc

    .line 13
    .line 14
    invoke-direct {p0, p1, p2, v0, v1}, Lkotlinx/serialization/json/internal/n;-><init>(Ln7/b;Ln7/u;Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lkotlinx/serialization/json/internal/p;->j:Ln7/u;

    .line 18
    .line 19
    iget-object p1, p2, Ln7/u;->a:Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/lang/Iterable;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/collections/t;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lkotlinx/serialization/json/internal/p;->k:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    mul-int/lit8 p1, p1, 0x2

    .line 38
    .line 39
    iput p1, p0, Lkotlinx/serialization/json/internal/p;->l:I

    .line 40
    .line 41
    const/4 p1, -0x1

    .line 42
    iput p1, p0, Lkotlinx/serialization/json/internal/p;->m:I

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Ln7/j;
    .locals 2

    .line 1
    const-string v0, "tag"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lkotlinx/serialization/json/internal/p;->m:I

    .line 7
    .line 8
    rem-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Ln7/k;->a:Lm7/f0;

    .line 13
    .line 14
    new-instance v0, Ln7/p;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, p1, v1}, Ln7/p;-><init>(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    iget-object v0, p0, Lkotlinx/serialization/json/internal/p;->j:Ln7/u;

    .line 22
    .line 23
    invoke-static {v0, p1}, Lkotlin/collections/e0;->B(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ln7/j;

    .line 28
    .line 29
    return-object p1
.end method

.method public final decodeElementIndex(Lk7/g;)I
    .locals 1

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lkotlinx/serialization/json/internal/p;->m:I

    .line 7
    .line 8
    iget v0, p0, Lkotlinx/serialization/json/internal/p;->l:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    if-ge p1, v0, :cond_0

    .line 13
    .line 14
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    iput p1, p0, Lkotlinx/serialization/json/internal/p;->m:I

    .line 17
    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, -0x1

    .line 20
    return p1
.end method

.method public final endStructure(Lk7/g;)V
    .locals 1

    .line 1
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final o(Lk7/g;I)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    div-int/lit8 p2, p2, 0x2

    .line 7
    .line 8
    iget-object p1, p0, Lkotlinx/serialization/json/internal/p;->k:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/lang/String;

    .line 15
    .line 16
    return-object p1
.end method

.method public final q()Ln7/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/p;->j:Ln7/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Ln7/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/p;->j:Ln7/u;

    .line 2
    .line 3
    return-object v0
.end method
