.class public final synthetic Lu4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/c0;


# static fields
.field public static final a:Lu4/a;

.field private static final descriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lu4/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu4/a;->a:Lu4/a;

    .line 7
    .line 8
    new-instance v1, Lm7/a1;

    .line 9
    .line 10
    const-string v2, "com.zykj.mistake.navigation.args.CollectionDetailRouteArgs"

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lm7/a1;-><init>(Ljava/lang/String;Lm7/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "collectionId"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "title"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "currentCount"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "entryMode"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lu4/a;->descriptor:Lk7/g;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final childSerializers()[Li7/b;
    .locals 4

    .line 1
    sget-object v0, Lu4/c;->e:[Ld6/e;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    new-array v1, v1, [Li7/b;

    .line 5
    .line 6
    sget-object v2, Lm7/m1;->a:Lm7/m1;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    aput-object v2, v1, v3

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    sget-object v3, Lm7/j0;->a:Lm7/j0;

    .line 16
    .line 17
    aput-object v3, v1, v2

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    aget-object v0, v0, v2

    .line 21
    .line 22
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    aput-object v0, v1, v2

    .line 27
    .line 28
    return-object v1
.end method

.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "decoder"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lu4/a;->descriptor:Lk7/g;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Ll7/e;->beginStructure(Lk7/g;)Ll7/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v2, Lu4/c;->e:[Ld6/e;

    .line 15
    .line 16
    invoke-interface {v0}, Ll7/c;->decodeSequentially()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x2

    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x1

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, v1, v7}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v0, v1, v6}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-interface {v0, v1, v4}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    aget-object v2, v2, v5

    .line 40
    .line 41
    invoke-interface {v2}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Li7/a;

    .line 46
    .line 47
    invoke-interface {v0, v1, v5, v2, v8}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 52
    .line 53
    const/16 v5, 0xf

    .line 54
    .line 55
    move-object/from16 v18, v2

    .line 56
    .line 57
    move-object v15, v3

    .line 58
    move/from16 v17, v4

    .line 59
    .line 60
    move v14, v5

    .line 61
    move-object/from16 v16, v6

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    move v12, v6

    .line 65
    move v3, v7

    .line 66
    move-object v9, v8

    .line 67
    move-object v10, v9

    .line 68
    move-object v11, v10

    .line 69
    move v8, v3

    .line 70
    :goto_0
    if-eqz v12, :cond_6

    .line 71
    .line 72
    invoke-interface {v0, v1}, Ll7/c;->decodeElementIndex(Lk7/g;)I

    .line 73
    .line 74
    .line 75
    move-result v13

    .line 76
    const/4 v14, -0x1

    .line 77
    if-eq v13, v14, :cond_5

    .line 78
    .line 79
    if-eqz v13, :cond_4

    .line 80
    .line 81
    if-eq v13, v6, :cond_3

    .line 82
    .line 83
    if-eq v13, v4, :cond_2

    .line 84
    .line 85
    if-ne v13, v5, :cond_1

    .line 86
    .line 87
    aget-object v13, v2, v5

    .line 88
    .line 89
    invoke-interface {v13}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v13

    .line 93
    check-cast v13, Li7/a;

    .line 94
    .line 95
    invoke-interface {v0, v1, v5, v13, v11}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    check-cast v11, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 100
    .line 101
    or-int/lit8 v8, v8, 0x8

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 105
    .line 106
    invoke-direct {v0, v13}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 107
    .line 108
    .line 109
    throw v0

    .line 110
    :cond_2
    invoke-interface {v0, v1, v4}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    or-int/lit8 v8, v8, 0x4

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    invoke-interface {v0, v1, v6}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    or-int/lit8 v8, v8, 0x2

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_4
    invoke-interface {v0, v1, v7}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    or-int/lit8 v8, v8, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_5
    move v12, v7

    .line 132
    goto :goto_0

    .line 133
    :cond_6
    move/from16 v17, v3

    .line 134
    .line 135
    move v14, v8

    .line 136
    move-object v15, v9

    .line 137
    move-object/from16 v16, v10

    .line 138
    .line 139
    move-object/from16 v18, v11

    .line 140
    .line 141
    :goto_1
    invoke-interface {v0, v1}, Ll7/c;->endStructure(Lk7/g;)V

    .line 142
    .line 143
    .line 144
    new-instance v13, Lu4/c;

    .line 145
    .line 146
    invoke-direct/range {v13 .. v18}, Lu4/c;-><init>(ILjava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;)V

    .line 147
    .line 148
    .line 149
    return-object v13
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Lu4/a;->descriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p2, Lu4/c;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p2, Lu4/c;->d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 9
    .line 10
    iget v1, p2, Lu4/c;->c:I

    .line 11
    .line 12
    iget-object v2, p2, Lu4/c;->b:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p2, p2, Lu4/c;->a:Ljava/lang/String;

    .line 15
    .line 16
    sget-object v3, Lu4/a;->descriptor:Lk7/g;

    .line 17
    .line 18
    invoke-interface {p1, v3}, Ll7/f;->beginStructure(Lk7/g;)Ll7/d;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v4, Lu4/c;->e:[Ld6/e;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-interface {p1, v3, v5}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string v6, ""

    .line 33
    .line 34
    invoke-static {p2, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-nez v6, :cond_1

    .line 39
    .line 40
    :goto_0
    invoke-interface {p1, v3, v5, p2}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    const/4 p2, 0x1

    .line 44
    invoke-interface {p1, v3, p2}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const-string v5, "\u9519\u9898\u96c6"

    .line 52
    .line 53
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-nez v5, :cond_3

    .line 58
    .line 59
    :goto_1
    invoke-interface {p1, v3, p2, v2}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    const/4 p2, 0x2

    .line 63
    invoke-interface {p1, v3, p2}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    if-eqz v1, :cond_5

    .line 71
    .line 72
    :goto_2
    invoke-interface {p1, v3, p2, v1}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 73
    .line 74
    .line 75
    :cond_5
    const/4 p2, 0x3

    .line 76
    invoke-interface {p1, v3, p2}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_6

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_6
    sget-object v1, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;->EXISTING:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 84
    .line 85
    if-eq v0, v1, :cond_7

    .line 86
    .line 87
    :goto_3
    aget-object v1, v4, p2

    .line 88
    .line 89
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Li7/e;

    .line 94
    .line 95
    invoke-interface {p1, v3, p2, v1, v0}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_7
    invoke-interface {p1, v3}, Ll7/d;->endStructure(Lk7/g;)V

    .line 99
    .line 100
    .line 101
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
