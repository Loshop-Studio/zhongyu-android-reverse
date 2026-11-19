.class public final Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final charSequenceArrayDescriptor:Lu8/f;

.field private static final charSequenceListDescriptor:Lu8/f;

.field private static final nullablePolymorphicSparseParcelableArrayDescriptor:Lu8/f;

.field private static final parcelableArrayDescriptor:Lu8/f;

.field private static final parcelableListDescriptor:Lu8/f;

.field private static final polymorphicCharSequenceArrayDescriptor:Lu8/f;

.field private static final polymorphicCharSequenceDescriptor:Lu8/f;

.field private static final polymorphicCharSequenceListDescriptor:Lu8/f;

.field private static final polymorphicIBinderDescriptor:Lu8/f;

.field private static final polymorphicJavaSerializableDescriptor:Lu8/f;

.field private static final polymorphicParcelableArrayDescriptor:Lu8/f;

.field private static final polymorphicParcelableDescriptor:Lu8/f;

.field private static final polymorphicParcelableListDescriptor:Lu8/f;

.field private static final polymorphicSparseParcelableArrayDescriptor:Lu8/f;

.field private static final sparseParcelableArrayDescriptor:Lu8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ls8/f;

    .line 2
    .line 3
    const-class v1, Ljava/lang/CharSequence;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v2}, Ls8/f;-><init>(Le8/c;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ls8/f;->getDescriptor()Lu8/f;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicCharSequenceDescriptor:Lu8/f;

    .line 17
    .line 18
    new-instance v0, Ls8/f;

    .line 19
    .line 20
    const-class v2, Landroid/os/Parcelable;

    .line 21
    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v0, v3}, Ls8/f;-><init>(Le8/c;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ls8/f;->getDescriptor()Lu8/f;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicParcelableDescriptor:Lu8/f;

    .line 34
    .line 35
    new-instance v0, Ls8/f;

    .line 36
    .line 37
    const-class v3, Ljava/io/Serializable;

    .line 38
    .line 39
    invoke-static {v3}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-direct {v0, v3}, Ls8/f;-><init>(Le8/c;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ls8/f;->getDescriptor()Lu8/f;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicJavaSerializableDescriptor:Lu8/f;

    .line 51
    .line 52
    new-instance v0, Ls8/f;

    .line 53
    .line 54
    const-class v3, Landroid/os/IBinder;

    .line 55
    .line 56
    invoke-static {v3}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-direct {v0, v3}, Ls8/f;-><init>(Le8/c;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ls8/f;->getDescriptor()Lu8/f;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicIBinderDescriptor:Lu8/f;

    .line 68
    .line 69
    sget-object v0, Landroidx/savedstate/serialization/serializers/DefaultParcelableSerializer;->INSTANCE:Landroidx/savedstate/serialization/serializers/DefaultParcelableSerializer;

    .line 70
    .line 71
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {v3, v0}, Lt8/a;->a(Le8/c;Ls8/b;)Ls8/b;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-interface {v3}, Ls8/b;->getDescriptor()Lu8/f;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    sput-object v3, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->parcelableArrayDescriptor:Lu8/f;

    .line 84
    .line 85
    new-instance v3, Ls8/f;

    .line 86
    .line 87
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-direct {v3, v4}, Ls8/f;-><init>(Le8/c;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-static {v4, v3}, Lt8/a;->a(Le8/c;Ls8/b;)Ls8/b;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-interface {v3}, Ls8/b;->getDescriptor()Lu8/f;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    sput-object v3, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicParcelableArrayDescriptor:Lu8/f;

    .line 107
    .line 108
    invoke-static {v0}, Lt8/a;->h(Ls8/b;)Ls8/b;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-interface {v3}, Ls8/b;->getDescriptor()Lu8/f;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    sput-object v3, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->parcelableListDescriptor:Lu8/f;

    .line 117
    .line 118
    new-instance v3, Ls8/f;

    .line 119
    .line 120
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-direct {v3, v4}, Ls8/f;-><init>(Le8/c;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v3}, Lt8/a;->h(Ls8/b;)Ls8/b;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-interface {v3}, Ls8/b;->getDescriptor()Lu8/f;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    sput-object v3, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicParcelableListDescriptor:Lu8/f;

    .line 136
    .line 137
    sget-object v3, Landroidx/savedstate/serialization/serializers/CharSequenceSerializer;->INSTANCE:Landroidx/savedstate/serialization/serializers/CharSequenceSerializer;

    .line 138
    .line 139
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-static {v4, v3}, Lt8/a;->a(Le8/c;Ls8/b;)Ls8/b;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-interface {v4}, Ls8/b;->getDescriptor()Lu8/f;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    sput-object v4, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->charSequenceArrayDescriptor:Lu8/f;

    .line 152
    .line 153
    new-instance v4, Ls8/f;

    .line 154
    .line 155
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-direct {v4, v5}, Ls8/f;-><init>(Le8/c;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-static {v5, v4}, Lt8/a;->a(Le8/c;Ls8/b;)Ls8/b;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-interface {v4}, Ls8/b;->getDescriptor()Lu8/f;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    sput-object v4, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicCharSequenceArrayDescriptor:Lu8/f;

    .line 175
    .line 176
    invoke-static {v3}, Lt8/a;->h(Ls8/b;)Ls8/b;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-interface {v3}, Ls8/b;->getDescriptor()Lu8/f;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    sput-object v3, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->charSequenceListDescriptor:Lu8/f;

    .line 185
    .line 186
    new-instance v3, Ls8/f;

    .line 187
    .line 188
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-direct {v3, v1}, Ls8/f;-><init>(Le8/c;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v3}, Lt8/a;->h(Ls8/b;)Ls8/b;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-interface {v1}, Ls8/b;->getDescriptor()Lu8/f;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    sput-object v1, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicCharSequenceListDescriptor:Lu8/f;

    .line 204
    .line 205
    new-instance v1, Landroidx/savedstate/serialization/serializers/SparseArraySerializer;

    .line 206
    .line 207
    invoke-direct {v1, v0}, Landroidx/savedstate/serialization/serializers/SparseArraySerializer;-><init>(Ls8/b;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Landroidx/savedstate/serialization/serializers/SparseArraySerializer;->getDescriptor()Lu8/f;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    sput-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->sparseParcelableArrayDescriptor:Lu8/f;

    .line 215
    .line 216
    new-instance v0, Landroidx/savedstate/serialization/serializers/SparseArraySerializer;

    .line 217
    .line 218
    new-instance v1, Ls8/f;

    .line 219
    .line 220
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-direct {v1, v3}, Ls8/f;-><init>(Le8/c;)V

    .line 225
    .line 226
    .line 227
    invoke-direct {v0, v1}, Landroidx/savedstate/serialization/serializers/SparseArraySerializer;-><init>(Ls8/b;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Landroidx/savedstate/serialization/serializers/SparseArraySerializer;->getDescriptor()Lu8/f;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    sput-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicSparseParcelableArrayDescriptor:Lu8/f;

    .line 235
    .line 236
    new-instance v0, Landroidx/savedstate/serialization/serializers/SparseArraySerializer;

    .line 237
    .line 238
    new-instance v1, Ls8/f;

    .line 239
    .line 240
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-direct {v1, v2}, Ls8/f;-><init>(Le8/c;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v1}, Lt8/a;->s(Ls8/b;)Ls8/b;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-direct {v0, v1}, Landroidx/savedstate/serialization/serializers/SparseArraySerializer;-><init>(Ls8/b;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Landroidx/savedstate/serialization/serializers/SparseArraySerializer;->getDescriptor()Lu8/f;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    sput-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->nullablePolymorphicSparseParcelableArrayDescriptor:Lu8/f;

    .line 259
    .line 260
    return-void
.end method

.method public static final getCharSequenceArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->charSequenceArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getCharSequenceArrayDescriptor$annotations()V
    .locals 0

    return-void
.end method

.method public static final getCharSequenceListDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->charSequenceListDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getNullablePolymorphicSparseParcelableArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->nullablePolymorphicSparseParcelableArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getParcelableArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->parcelableArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getParcelableArrayDescriptor$annotations()V
    .locals 0

    return-void
.end method

.method public static final getParcelableListDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->parcelableListDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getPolymorphicCharSequenceArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicCharSequenceArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getPolymorphicCharSequenceArrayDescriptor$annotations()V
    .locals 0

    return-void
.end method

.method public static final getPolymorphicCharSequenceDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicCharSequenceDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getPolymorphicCharSequenceListDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicCharSequenceListDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getPolymorphicIBinderDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicIBinderDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getPolymorphicJavaSerializableDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicJavaSerializableDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getPolymorphicParcelableArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicParcelableArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getPolymorphicParcelableArrayDescriptor$annotations()V
    .locals 0

    return-void
.end method

.method public static final getPolymorphicParcelableDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicParcelableDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getPolymorphicParcelableListDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicParcelableListDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getPolymorphicSparseParcelableArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->polymorphicSparseParcelableArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getSparseParcelableArrayDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Landroidx/savedstate/serialization/SavedStateCodecUtils_androidKt;->sparseParcelableArrayDescriptor:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method
