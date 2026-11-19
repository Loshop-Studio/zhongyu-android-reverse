.class public final synthetic Lcom/zykj/mistake/feature/ask/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/c0;


# static fields
.field public static final a:Lcom/zykj/mistake/feature/ask/a0;

.field private static final descriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/ask/a0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/feature/ask/a0;->a:Lcom/zykj/mistake/feature/ask/a0;

    .line 7
    .line 8
    new-instance v1, Lm7/a1;

    .line 9
    .line 10
    const-string v2, "com.zykj.mistake.feature.ask.MistakeAskMaterialContract.TextAnswerPayload"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lm7/a1;-><init>(Ljava/lang/String;Lm7/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "index"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "answers"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "comments"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "isOriginal"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "isShowAnswer"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    sput-object v1, Lcom/zykj/mistake/feature/ask/a0;->descriptor:Lk7/g;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final childSerializers()[Li7/b;
    .locals 4

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/ask/c0;->f:[Ld6/e;

    .line 2
    .line 3
    const/4 v1, 0x5

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
    aget-object v3, v0, v2

    .line 13
    .line 14
    invoke-interface {v3}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    aput-object v3, v1, v2

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    aget-object v0, v0, v2

    .line 22
    .line 23
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    aput-object v0, v1, v2

    .line 28
    .line 29
    sget-object v0, Lm7/g;->a:Lm7/g;

    .line 30
    .line 31
    const/4 v2, 0x3

    .line 32
    aput-object v0, v1, v2

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    aput-object v0, v1, v2

    .line 36
    .line 37
    return-object v1
.end method

.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 22

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
    sget-object v1, Lcom/zykj/mistake/feature/ask/a0;->descriptor:Lk7/g;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Ll7/e;->beginStructure(Lk7/g;)Ll7/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v2, Lcom/zykj/mistake/feature/ask/c0;->f:[Ld6/e;

    .line 15
    .line 16
    invoke-interface {v0}, Ll7/c;->decodeSequentially()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x3

    .line 21
    const/4 v5, 0x4

    .line 22
    const/4 v6, 0x2

    .line 23
    const/4 v7, 0x1

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v9, 0x0

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-interface {v0, v1, v8}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    aget-object v8, v2, v7

    .line 33
    .line 34
    invoke-interface {v8}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    check-cast v8, Li7/a;

    .line 39
    .line 40
    invoke-interface {v0, v1, v7, v8, v9}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    check-cast v7, Ljava/util/List;

    .line 45
    .line 46
    aget-object v2, v2, v6

    .line 47
    .line 48
    invoke-interface {v2}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Li7/a;

    .line 53
    .line 54
    invoke-interface {v0, v1, v6, v2, v9}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v0, v1, v4}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-interface {v0, v1, v5}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    const/16 v6, 0x1f

    .line 69
    .line 70
    move-object/from16 v19, v2

    .line 71
    .line 72
    move-object/from16 v17, v3

    .line 73
    .line 74
    move/from16 v20, v4

    .line 75
    .line 76
    move/from16 v21, v5

    .line 77
    .line 78
    move/from16 v16, v6

    .line 79
    .line 80
    move-object/from16 v18, v7

    .line 81
    .line 82
    goto/16 :goto_2

    .line 83
    .line 84
    :cond_0
    move v14, v7

    .line 85
    move v3, v8

    .line 86
    move v10, v3

    .line 87
    move-object v11, v9

    .line 88
    move-object v12, v11

    .line 89
    move-object v13, v12

    .line 90
    move v9, v10

    .line 91
    :goto_0
    if-eqz v14, :cond_7

    .line 92
    .line 93
    invoke-interface {v0, v1}, Ll7/c;->decodeElementIndex(Lk7/g;)I

    .line 94
    .line 95
    .line 96
    move-result v15

    .line 97
    const/4 v8, -0x1

    .line 98
    if-eq v15, v8, :cond_6

    .line 99
    .line 100
    if-eqz v15, :cond_5

    .line 101
    .line 102
    if-eq v15, v7, :cond_4

    .line 103
    .line 104
    if-eq v15, v6, :cond_3

    .line 105
    .line 106
    if-eq v15, v4, :cond_2

    .line 107
    .line 108
    if-ne v15, v5, :cond_1

    .line 109
    .line 110
    invoke-interface {v0, v1, v5}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    or-int/lit8 v10, v10, 0x10

    .line 115
    .line 116
    :goto_1
    const/4 v8, 0x0

    .line 117
    goto :goto_0

    .line 118
    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 119
    .line 120
    invoke-direct {v0, v15}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 121
    .line 122
    .line 123
    throw v0

    .line 124
    :cond_2
    invoke-interface {v0, v1, v4}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    or-int/lit8 v10, v10, 0x8

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_3
    aget-object v8, v2, v6

    .line 132
    .line 133
    invoke-interface {v8}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    check-cast v8, Li7/a;

    .line 138
    .line 139
    invoke-interface {v0, v1, v6, v8, v13}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    move-object v13, v8

    .line 144
    check-cast v13, Ljava/util/List;

    .line 145
    .line 146
    or-int/lit8 v10, v10, 0x4

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_4
    aget-object v8, v2, v7

    .line 150
    .line 151
    invoke-interface {v8}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    check-cast v8, Li7/a;

    .line 156
    .line 157
    invoke-interface {v0, v1, v7, v8, v12}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    move-object v12, v8

    .line 162
    check-cast v12, Ljava/util/List;

    .line 163
    .line 164
    or-int/lit8 v10, v10, 0x2

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_5
    const/4 v8, 0x0

    .line 168
    invoke-interface {v0, v1, v8}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    or-int/lit8 v10, v10, 0x1

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_6
    const/4 v8, 0x0

    .line 176
    move v14, v8

    .line 177
    goto :goto_0

    .line 178
    :cond_7
    move/from16 v20, v3

    .line 179
    .line 180
    move/from16 v21, v9

    .line 181
    .line 182
    move/from16 v16, v10

    .line 183
    .line 184
    move-object/from16 v17, v11

    .line 185
    .line 186
    move-object/from16 v18, v12

    .line 187
    .line 188
    move-object/from16 v19, v13

    .line 189
    .line 190
    :goto_2
    invoke-interface {v0, v1}, Ll7/c;->endStructure(Lk7/g;)V

    .line 191
    .line 192
    .line 193
    new-instance v15, Lcom/zykj/mistake/feature/ask/c0;

    .line 194
    .line 195
    invoke-direct/range {v15 .. v21}, Lcom/zykj/mistake/feature/ask/c0;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/util/List;ZZ)V

    .line 196
    .line 197
    .line 198
    return-object v15
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/ask/a0;->descriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p2, Lcom/zykj/mistake/feature/ask/c0;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/zykj/mistake/feature/ask/a0;->descriptor:Lk7/g;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Ll7/f;->beginStructure(Lk7/g;)Ll7/d;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v1, Lcom/zykj/mistake/feature/ask/c0;->f:[Ld6/e;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iget-object v3, p2, Lcom/zykj/mistake/feature/ask/c0;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-interface {p1, v0, v2, v3}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    aget-object v3, v1, v2

    .line 24
    .line 25
    invoke-interface {v3}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Li7/e;

    .line 30
    .line 31
    iget-object v4, p2, Lcom/zykj/mistake/feature/ask/c0;->b:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p1, v0, v2, v3, v4}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    aget-object v1, v1, v2

    .line 38
    .line 39
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Li7/e;

    .line 44
    .line 45
    iget-object v3, p2, Lcom/zykj/mistake/feature/ask/c0;->c:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {p1, v0, v2, v1, v3}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x3

    .line 51
    iget-boolean v2, p2, Lcom/zykj/mistake/feature/ask/c0;->d:Z

    .line 52
    .line 53
    invoke-interface {p1, v0, v1, v2}, Ll7/d;->encodeBooleanElement(Lk7/g;IZ)V

    .line 54
    .line 55
    .line 56
    const/4 v1, 0x4

    .line 57
    iget-boolean p2, p2, Lcom/zykj/mistake/feature/ask/c0;->e:Z

    .line 58
    .line 59
    invoke-interface {p1, v0, v1, p2}, Ll7/d;->encodeBooleanElement(Lk7/g;IZ)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, v0}, Ll7/d;->endStructure(Lk7/g;)V

    .line 63
    .line 64
    .line 65
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
