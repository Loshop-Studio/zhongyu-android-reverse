.class public final Lge/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/b;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Ljava/util/List;

.field public final c:Lqc/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "serialName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "objectInstance"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lge/r1;->a:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iput-object p2, p0, Lge/r1;->b:Ljava/util/List;

    .line 21
    .line 22
    sget-object p2, Lkotlin/LazyThreadSafetyMode;->d:Lkotlin/LazyThreadSafetyMode;

    .line 23
    .line 24
    new-instance v0, Lge/p1;

    .line 25
    .line 26
    invoke-direct {v0, p1, p0}, Lge/p1;-><init>(Ljava/lang/String;Lge/r1;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p2, v0}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lge/r1;->c:Lqc/d;

    .line 34
    .line 35
    return-void
.end method

.method public static synthetic a(Lge/r1;Lee/a;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lge/r1;->d(Lge/r1;Lee/a;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Lge/r1;)Lee/f;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lge/r1;->c(Ljava/lang/String;Lge/r1;)Lee/f;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/lang/String;Lge/r1;)Lee/f;
    .locals 3

    .line 1
    sget-object v0, Lee/o$d;->a:Lee/o$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Lee/f;

    .line 5
    .line 6
    new-instance v2, Lge/q1;

    .line 7
    .line 8
    invoke-direct {v2, p1}, Lge/q1;-><init>(Lge/r1;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0, v1, v2}, Lee/m;->h(Ljava/lang/String;Lee/n;[Lee/f;Lhd/l;)Lee/f;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final d(Lge/r1;Lee/a;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "$this$buildSerialDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lge/r1;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Lee/a;->h(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public deserialize(Lfe/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lge/r1;->getDescriptor()Lee/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Lfe/e;->beginStructure(Lee/f;)Lfe/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Lfe/c;->decodeSequentially()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lge/r1;->getDescriptor()Lee/f;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {p1, v1}, Lfe/c;->decodeElementIndex(Lee/f;)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, -0x1

    .line 30
    if-ne v1, v2, :cond_1

    .line 31
    .line 32
    :goto_0
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 33
    .line 34
    invoke-interface {p1, v0}, Lfe/c;->endStructure(Lee/f;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lge/r1;->a:Ljava/lang/Object;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    new-instance p1, Lkotlinx/serialization/SerializationException;

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v2, "Unexpected index "

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method

.method public getDescriptor()Lee/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lge/r1;->c:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lee/f;

    .line 8
    .line 9
    return-object v0
.end method

.method public serialize(Lfe/f;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lge/r1;->getDescriptor()Lee/f;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p1, p2}, Lfe/f;->beginStructure(Lee/f;)Lfe/d;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0}, Lge/r1;->getDescriptor()Lee/f;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p1, p2}, Lfe/d;->endStructure(Lee/f;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
