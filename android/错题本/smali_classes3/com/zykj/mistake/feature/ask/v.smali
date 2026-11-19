.class public final synthetic Lcom/zykj/mistake/feature/ask/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/c0;


# static fields
.field public static final a:Lcom/zykj/mistake/feature/ask/v;

.field private static final descriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/ask/v;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/feature/ask/v;->a:Lcom/zykj/mistake/feature/ask/v;

    .line 7
    .line 8
    new-instance v1, Lm7/a1;

    .line 9
    .line 10
    const-string v2, "com.zykj.mistake.feature.ask.MistakeAskMaterialContract.Item"

    .line 11
    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lm7/a1;-><init>(Ljava/lang/String;Lm7/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "id"

    .line 17
    .line 18
    const/4 v2, 0x0

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
    const-string v0, "sourceType"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "imageSource"

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "webUrl"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "textPayload"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    sput-object v1, Lcom/zykj/mistake/feature/ask/v;->descriptor:Lk7/g;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final childSerializers()[Li7/b;
    .locals 4

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/ask/x;->g:[Ld6/e;

    .line 2
    .line 3
    const/4 v1, 0x6

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
    const/4 v3, 0x2

    .line 15
    aget-object v0, v0, v3

    .line 16
    .line 17
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    aput-object v0, v1, v3

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    aput-object v2, v1, v0

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    aput-object v2, v1, v0

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/mistake/feature/ask/a0;->a:Lcom/zykj/mistake/feature/ask/a0;

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/collections/u;->v(Li7/b;)Li7/b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v2, 0x5

    .line 36
    aput-object v0, v1, v2

    .line 37
    .line 38
    return-object v1
.end method

.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 25

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
    sget-object v1, Lcom/zykj/mistake/feature/ask/v;->descriptor:Lk7/g;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Ll7/e;->beginStructure(Lk7/g;)Ll7/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v2, Lcom/zykj/mistake/feature/ask/x;->g:[Ld6/e;

    .line 15
    .line 16
    invoke-interface {v0}, Ll7/c;->decodeSequentially()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x5

    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x4

    .line 23
    const/4 v7, 0x2

    .line 24
    const/4 v8, 0x1

    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v10, 0x0

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-interface {v0, v1, v9}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {v0, v1, v8}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    aget-object v2, v2, v7

    .line 38
    .line 39
    invoke-interface {v2}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Li7/a;

    .line 44
    .line 45
    invoke-interface {v0, v1, v7, v2, v10}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 50
    .line 51
    invoke-interface {v0, v1, v5}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-interface {v0, v1, v6}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    sget-object v7, Lcom/zykj/mistake/feature/ask/a0;->a:Lcom/zykj/mistake/feature/ask/a0;

    .line 60
    .line 61
    invoke-interface {v0, v1, v4, v7, v10}, Ll7/c;->decodeNullableSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Lcom/zykj/mistake/feature/ask/c0;

    .line 66
    .line 67
    const/16 v7, 0x3f

    .line 68
    .line 69
    move-object/from16 v21, v2

    .line 70
    .line 71
    move-object/from16 v19, v3

    .line 72
    .line 73
    move-object/from16 v24, v4

    .line 74
    .line 75
    move-object/from16 v22, v5

    .line 76
    .line 77
    move-object/from16 v23, v6

    .line 78
    .line 79
    move/from16 v18, v7

    .line 80
    .line 81
    move-object/from16 v20, v8

    .line 82
    .line 83
    goto/16 :goto_2

    .line 84
    .line 85
    :cond_0
    move/from16 v16, v8

    .line 86
    .line 87
    move v3, v9

    .line 88
    move-object v11, v10

    .line 89
    move-object v12, v11

    .line 90
    move-object v13, v12

    .line 91
    move-object v14, v13

    .line 92
    move-object v15, v14

    .line 93
    :goto_0
    if-eqz v16, :cond_1

    .line 94
    .line 95
    invoke-interface {v0, v1}, Ll7/c;->decodeElementIndex(Lk7/g;)I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    packed-switch v9, :pswitch_data_0

    .line 100
    .line 101
    .line 102
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 103
    .line 104
    invoke-direct {v0, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 105
    .line 106
    .line 107
    throw v0

    .line 108
    :pswitch_0
    sget-object v9, Lcom/zykj/mistake/feature/ask/a0;->a:Lcom/zykj/mistake/feature/ask/a0;

    .line 109
    .line 110
    invoke-interface {v0, v1, v4, v9, v15}, Ll7/c;->decodeNullableSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    move-object v15, v9

    .line 115
    check-cast v15, Lcom/zykj/mistake/feature/ask/c0;

    .line 116
    .line 117
    or-int/lit8 v3, v3, 0x20

    .line 118
    .line 119
    :goto_1
    const/4 v9, 0x0

    .line 120
    goto :goto_0

    .line 121
    :pswitch_1
    invoke-interface {v0, v1, v6}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    or-int/lit8 v3, v3, 0x10

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :pswitch_2
    invoke-interface {v0, v1, v5}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    or-int/lit8 v3, v3, 0x8

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :pswitch_3
    aget-object v9, v2, v7

    .line 136
    .line 137
    invoke-interface {v9}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    check-cast v9, Li7/a;

    .line 142
    .line 143
    invoke-interface {v0, v1, v7, v9, v12}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    move-object v12, v9

    .line 148
    check-cast v12, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 149
    .line 150
    or-int/lit8 v3, v3, 0x4

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :pswitch_4
    invoke-interface {v0, v1, v8}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    or-int/lit8 v3, v3, 0x2

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :pswitch_5
    const/4 v9, 0x0

    .line 161
    invoke-interface {v0, v1, v9}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    or-int/lit8 v3, v3, 0x1

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :pswitch_6
    const/4 v9, 0x0

    .line 169
    move/from16 v16, v9

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_1
    move/from16 v18, v3

    .line 173
    .line 174
    move-object/from16 v19, v10

    .line 175
    .line 176
    move-object/from16 v20, v11

    .line 177
    .line 178
    move-object/from16 v21, v12

    .line 179
    .line 180
    move-object/from16 v22, v13

    .line 181
    .line 182
    move-object/from16 v23, v14

    .line 183
    .line 184
    move-object/from16 v24, v15

    .line 185
    .line 186
    :goto_2
    invoke-interface {v0, v1}, Ll7/c;->endStructure(Lk7/g;)V

    .line 187
    .line 188
    .line 189
    new-instance v17, Lcom/zykj/mistake/feature/ask/x;

    .line 190
    .line 191
    invoke-direct/range {v17 .. v24}, Lcom/zykj/mistake/feature/ask/x;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/c0;)V

    .line 192
    .line 193
    .line 194
    return-object v17

    .line 195
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/ask/v;->descriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p2, Lcom/zykj/mistake/feature/ask/x;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/zykj/mistake/feature/ask/v;->descriptor:Lk7/g;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Ll7/f;->beginStructure(Lk7/g;)Ll7/d;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v1, Lcom/zykj/mistake/feature/ask/x;->g:[Ld6/e;

    .line 15
    .line 16
    iget-object v2, p2, Lcom/zykj/mistake/feature/ask/x;->a:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v3, p2, Lcom/zykj/mistake/feature/ask/x;->f:Lcom/zykj/mistake/feature/ask/c0;

    .line 19
    .line 20
    iget-object v4, p2, Lcom/zykj/mistake/feature/ask/x;->e:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v5, p2, Lcom/zykj/mistake/feature/ask/x;->d:Ljava/lang/String;

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    invoke-interface {p1, v0, v6, v2}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    iget-object v6, p2, Lcom/zykj/mistake/feature/ask/x;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-interface {p1, v0, v2, v6}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    aget-object v1, v1, v2

    .line 36
    .line 37
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Li7/e;

    .line 42
    .line 43
    iget-object p2, p2, Lcom/zykj/mistake/feature/ask/x;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 44
    .line 45
    invoke-interface {p1, v0, v2, v1, p2}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const/4 p2, 0x3

    .line 49
    invoke-interface {p1, v0, p2}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const-string v2, ""

    .line 54
    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    :goto_0
    invoke-interface {p1, v0, p2, v5}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    const/4 p2, 0x4

    .line 68
    invoke-interface {p1, v0, p2}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_3

    .line 80
    .line 81
    :goto_1
    invoke-interface {p1, v0, p2, v4}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    const/4 p2, 0x5

    .line 85
    invoke-interface {p1, v0, p2}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    if-eqz v3, :cond_5

    .line 93
    .line 94
    :goto_2
    sget-object v1, Lcom/zykj/mistake/feature/ask/a0;->a:Lcom/zykj/mistake/feature/ask/a0;

    .line 95
    .line 96
    invoke-interface {p1, v0, p2, v1, v3}, Ll7/d;->encodeNullableSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_5
    invoke-interface {p1, v0}, Ll7/d;->endStructure(Lk7/g;)V

    .line 100
    .line 101
    .line 102
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
