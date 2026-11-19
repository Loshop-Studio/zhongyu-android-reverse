.class public final synthetic Lp4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/c0;


# static fields
.field public static final a:Lp4/g;

.field private static final descriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lp4/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp4/g;->a:Lp4/g;

    .line 7
    .line 8
    new-instance v1, Lm7/a1;

    .line 9
    .line 10
    const-string v2, "com.zykj.mistake.feature.mistake.model.MistakeTagUiState"

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lm7/a1;-><init>(Ljava/lang/String;Lm7/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "text"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "type"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "tagId"

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    sput-object v1, Lp4/g;->descriptor:Lk7/g;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final childSerializers()[Li7/b;
    .locals 4

    .line 1
    sget-object v0, Lp4/i;->d:[Ld6/e;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    new-array v1, v1, [Li7/b;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    sget-object v3, Lm7/m1;->a:Lm7/m1;

    .line 8
    .line 9
    aput-object v3, v1, v2

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aget-object v0, v0, v2

    .line 13
    .line 14
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    aput-object v0, v1, v2

    .line 19
    .line 20
    sget-object v0, Lm7/j0;->a:Lm7/j0;

    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/collections/u;->v(Li7/b;)Li7/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v2, 0x2

    .line 27
    aput-object v0, v1, v2

    .line 28
    .line 29
    return-object v1
.end method

.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 12

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lp4/g;->descriptor:Lk7/g;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ll7/e;->beginStructure(Lk7/g;)Ll7/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v1, Lp4/i;->d:[Ld6/e;

    .line 13
    .line 14
    invoke-interface {p1}, Ll7/c;->decodeSequentially()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x2

    .line 19
    const/4 v4, 0x1

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {p1, v0, v5}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    aget-object v1, v1, v4

    .line 29
    .line 30
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Li7/a;

    .line 35
    .line 36
    invoke-interface {p1, v0, v4, v1, v6}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 41
    .line 42
    sget-object v4, Lm7/j0;->a:Lm7/j0;

    .line 43
    .line 44
    invoke-interface {p1, v0, v3, v4, v6}, Ll7/c;->decodeNullableSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ljava/lang/Integer;

    .line 49
    .line 50
    const/4 v4, 0x7

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    move v9, v4

    .line 53
    move v2, v5

    .line 54
    move-object v7, v6

    .line 55
    move-object v8, v7

    .line 56
    :goto_0
    if-eqz v9, :cond_5

    .line 57
    .line 58
    invoke-interface {p1, v0}, Ll7/c;->decodeElementIndex(Lk7/g;)I

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    const/4 v11, -0x1

    .line 63
    if-eq v10, v11, :cond_4

    .line 64
    .line 65
    if-eqz v10, :cond_3

    .line 66
    .line 67
    if-eq v10, v4, :cond_2

    .line 68
    .line 69
    if-ne v10, v3, :cond_1

    .line 70
    .line 71
    sget-object v10, Lm7/j0;->a:Lm7/j0;

    .line 72
    .line 73
    invoke-interface {p1, v0, v3, v10, v8}, Ll7/c;->decodeNullableSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    check-cast v8, Ljava/lang/Integer;

    .line 78
    .line 79
    or-int/lit8 v2, v2, 0x4

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    new-instance p1, Lkotlinx/serialization/UnknownFieldException;

    .line 83
    .line 84
    invoke-direct {p1, v10}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_2
    aget-object v10, v1, v4

    .line 89
    .line 90
    invoke-interface {v10}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    check-cast v10, Li7/a;

    .line 95
    .line 96
    invoke-interface {p1, v0, v4, v10, v7}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    check-cast v7, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 101
    .line 102
    or-int/lit8 v2, v2, 0x2

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    invoke-interface {p1, v0, v5}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    or-int/lit8 v2, v2, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    move v9, v5

    .line 113
    goto :goto_0

    .line 114
    :cond_5
    move v4, v2

    .line 115
    move-object v2, v6

    .line 116
    move-object v1, v7

    .line 117
    move-object v3, v8

    .line 118
    :goto_1
    invoke-interface {p1, v0}, Ll7/c;->endStructure(Lk7/g;)V

    .line 119
    .line 120
    .line 121
    new-instance p1, Lp4/i;

    .line 122
    .line 123
    invoke-direct {p1, v4, v2, v1, v3}, Lp4/i;-><init>(ILjava/lang/String;Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;Ljava/lang/Integer;)V

    .line 124
    .line 125
    .line 126
    return-object p1
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Lp4/g;->descriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p2, Lp4/i;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lp4/g;->descriptor:Lk7/g;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Ll7/f;->beginStructure(Lk7/g;)Ll7/d;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v1, Lp4/i;->d:[Ld6/e;

    .line 15
    .line 16
    iget-object v2, p2, Lp4/i;->a:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v3, p2, Lp4/i;->c:Ljava/lang/Integer;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-interface {p1, v0, v4, v2}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    aget-object v1, v1, v2

    .line 26
    .line 27
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Li7/e;

    .line 32
    .line 33
    iget-object p2, p2, Lp4/i;->b:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 34
    .line 35
    invoke-interface {p1, v0, v2, v1, p2}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const/4 p2, 0x2

    .line 39
    invoke-interface {p1, v0, p2}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    if-eqz v3, :cond_1

    .line 47
    .line 48
    :goto_0
    sget-object v1, Lm7/j0;->a:Lm7/j0;

    .line 49
    .line 50
    invoke-interface {p1, v0, p2, v1, v3}, Ll7/d;->encodeNullableSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-interface {p1, v0}, Ll7/d;->endStructure(Lk7/g;)V

    .line 54
    .line 55
    .line 56
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
