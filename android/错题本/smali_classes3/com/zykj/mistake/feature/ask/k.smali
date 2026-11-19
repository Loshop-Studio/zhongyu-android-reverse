.class public final synthetic Lcom/zykj/mistake/feature/ask/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/c0;


# static fields
.field public static final a:Lcom/zykj/mistake/feature/ask/k;

.field private static final descriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/ask/k;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/feature/ask/k;->a:Lcom/zykj/mistake/feature/ask/k;

    .line 7
    .line 8
    new-instance v1, Lm7/a1;

    .line 9
    .line 10
    const-string v2, "com.zykj.mistake.feature.ask.MistakeAskMaterialContract.Group"

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lm7/a1;-><init>(Ljava/lang/String;Lm7/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "type"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "items"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lcom/zykj/mistake/feature/ask/k;->descriptor:Lk7/g;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final childSerializers()[Li7/b;
    .locals 4

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/ask/m;->c:[Ld6/e;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v1, v1, [Li7/b;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-interface {v3}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    aput-object v3, v1, v2

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    aget-object v0, v0, v2

    .line 17
    .line 18
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    aput-object v0, v1, v2

    .line 23
    .line 24
    return-object v1
.end method

.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 10

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/mistake/feature/ask/k;->descriptor:Lk7/g;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ll7/e;->beginStructure(Lk7/g;)Ll7/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v1, Lcom/zykj/mistake/feature/ask/m;->c:[Ld6/e;

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
    aget-object v2, v1, v4

    .line 24
    .line 25
    invoke-interface {v2}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Li7/a;

    .line 30
    .line 31
    invoke-interface {p1, v0, v4, v2, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 36
    .line 37
    aget-object v1, v1, v3

    .line 38
    .line 39
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Li7/a;

    .line 44
    .line 45
    invoke-interface {p1, v0, v3, v1, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/util/List;

    .line 50
    .line 51
    const/4 v3, 0x3

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    move v7, v3

    .line 54
    move v2, v4

    .line 55
    move-object v6, v5

    .line 56
    :goto_0
    if-eqz v7, :cond_4

    .line 57
    .line 58
    invoke-interface {p1, v0}, Ll7/c;->decodeElementIndex(Lk7/g;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const/4 v9, -0x1

    .line 63
    if-eq v8, v9, :cond_3

    .line 64
    .line 65
    if-eqz v8, :cond_2

    .line 66
    .line 67
    if-ne v8, v3, :cond_1

    .line 68
    .line 69
    aget-object v8, v1, v3

    .line 70
    .line 71
    invoke-interface {v8}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    check-cast v8, Li7/a;

    .line 76
    .line 77
    invoke-interface {p1, v0, v3, v8, v6}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, Ljava/util/List;

    .line 82
    .line 83
    or-int/lit8 v2, v2, 0x2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    new-instance p1, Lkotlinx/serialization/UnknownFieldException;

    .line 87
    .line 88
    invoke-direct {p1, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_2
    aget-object v8, v1, v4

    .line 93
    .line 94
    invoke-interface {v8}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    check-cast v8, Li7/a;

    .line 99
    .line 100
    invoke-interface {p1, v0, v4, v8, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    check-cast v5, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 105
    .line 106
    or-int/lit8 v2, v2, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    move v7, v4

    .line 110
    goto :goto_0

    .line 111
    :cond_4
    move v3, v2

    .line 112
    move-object v2, v5

    .line 113
    move-object v1, v6

    .line 114
    :goto_1
    invoke-interface {p1, v0}, Ll7/c;->endStructure(Lk7/g;)V

    .line 115
    .line 116
    .line 117
    new-instance p1, Lcom/zykj/mistake/feature/ask/m;

    .line 118
    .line 119
    invoke-direct {p1, v3, v2, v1}, Lcom/zykj/mistake/feature/ask/m;-><init>(ILcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/util/List;)V

    .line 120
    .line 121
    .line 122
    return-object p1
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/ask/k;->descriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p2, Lcom/zykj/mistake/feature/ask/m;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/zykj/mistake/feature/ask/k;->descriptor:Lk7/g;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Ll7/f;->beginStructure(Lk7/g;)Ll7/d;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v1, Lcom/zykj/mistake/feature/ask/m;->c:[Ld6/e;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    aget-object v3, v1, v2

    .line 18
    .line 19
    invoke-interface {v3}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Li7/e;

    .line 24
    .line 25
    iget-object v4, p2, Lcom/zykj/mistake/feature/ask/m;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 26
    .line 27
    invoke-interface {p1, v0, v2, v3, v4}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    aget-object v1, v1, v2

    .line 32
    .line 33
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Li7/e;

    .line 38
    .line 39
    iget-object p2, p2, Lcom/zykj/mistake/feature/ask/m;->b:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {p1, v0, v2, v1, p2}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v0}, Ll7/d;->endStructure(Lk7/g;)V

    .line 45
    .line 46
    .line 47
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
