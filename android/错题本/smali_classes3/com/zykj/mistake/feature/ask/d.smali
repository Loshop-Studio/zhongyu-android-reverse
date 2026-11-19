.class public final synthetic Lcom/zykj/mistake/feature/ask/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/c0;


# static fields
.field public static final a:Lcom/zykj/mistake/feature/ask/d;

.field private static final descriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/ask/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/feature/ask/d;->a:Lcom/zykj/mistake/feature/ask/d;

    .line 7
    .line 8
    new-instance v1, Lm7/a1;

    .line 9
    .line 10
    const-string v2, "com.zykj.mistake.feature.ask.MistakeAskMaterialContract.Bundle"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lm7/a1;-><init>(Ljava/lang/String;Lm7/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "groups"

    .line 17
    .line 18
    invoke-virtual {v1, v0, v3}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lcom/zykj/mistake/feature/ask/d;->descriptor:Lk7/g;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final childSerializers()[Li7/b;
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/ask/f;->b:[Ld6/e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v1, v1, [Li7/b;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aget-object v0, v0, v2

    .line 8
    .line 9
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    aput-object v0, v1, v2

    .line 14
    .line 15
    return-object v1
.end method

.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 9

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/mistake/feature/ask/d;->descriptor:Lk7/g;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ll7/e;->beginStructure(Lk7/g;)Ll7/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v1, Lcom/zykj/mistake/feature/ask/f;->b:[Ld6/e;

    .line 13
    .line 14
    invoke-interface {p1}, Ll7/c;->decodeSequentially()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    aget-object v1, v1, v4

    .line 24
    .line 25
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Li7/a;

    .line 30
    .line 31
    invoke-interface {p1, v0, v4, v1, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/util/List;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    move v2, v3

    .line 39
    move v6, v4

    .line 40
    :goto_0
    if-eqz v2, :cond_3

    .line 41
    .line 42
    invoke-interface {p1, v0}, Ll7/c;->decodeElementIndex(Lk7/g;)I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    const/4 v8, -0x1

    .line 47
    if-eq v7, v8, :cond_2

    .line 48
    .line 49
    if-nez v7, :cond_1

    .line 50
    .line 51
    aget-object v6, v1, v4

    .line 52
    .line 53
    invoke-interface {v6}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Li7/a;

    .line 58
    .line 59
    invoke-interface {p1, v0, v4, v6, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Ljava/util/List;

    .line 64
    .line 65
    move v6, v3

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    new-instance p1, Lkotlinx/serialization/UnknownFieldException;

    .line 68
    .line 69
    invoke-direct {p1, v7}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_2
    move v2, v4

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    move-object v1, v5

    .line 76
    move v3, v6

    .line 77
    :goto_1
    invoke-interface {p1, v0}, Ll7/c;->endStructure(Lk7/g;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Lcom/zykj/mistake/feature/ask/f;

    .line 81
    .line 82
    invoke-direct {p1, v3, v1}, Lcom/zykj/mistake/feature/ask/f;-><init>(ILjava/util/List;)V

    .line 83
    .line 84
    .line 85
    return-object p1
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/ask/d;->descriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Lcom/zykj/mistake/feature/ask/f;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p2, Lcom/zykj/mistake/feature/ask/f;->a:Ljava/util/List;

    .line 9
    .line 10
    sget-object v0, Lcom/zykj/mistake/feature/ask/d;->descriptor:Lk7/g;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ll7/f;->beginStructure(Lk7/g;)Ll7/d;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v1, Lcom/zykj/mistake/feature/ask/f;->b:[Ld6/e;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-interface {p1, v0, v2}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 27
    .line 28
    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    :goto_0
    aget-object v1, v1, v2

    .line 35
    .line 36
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Li7/e;

    .line 41
    .line 42
    invoke-interface {p1, v0, v2, v1, p2}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-interface {p1, v0}, Ll7/d;->endStructure(Lk7/g;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final typeParametersSerializers()[Li7/b;
    .locals 1

    .line 1
    sget-object v0, Lm7/y0;->b:[Li7/b;

    .line 2
    .line 3
    return-object v0
.end method
