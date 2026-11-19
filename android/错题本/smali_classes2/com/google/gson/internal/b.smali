.class public final Lcom/google/gson/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/gson/internal/b;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 3
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/gson/internal/b;->c:Ljava/lang/Object;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/gson/internal/b;->d:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;ZLjava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/gson/internal/b;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/google/gson/internal/b;->c:Ljava/lang/Object;

    .line 7
    iput-boolean p2, p0, Lcom/google/gson/internal/b;->b:Z

    .line 8
    iput-object p3, p0, Lcom/google/gson/internal/b;->d:Ljava/util/List;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isInterface(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "Interfaces can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: "

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Abstract classes can\'t be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: "

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, "\nSee "

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, "r8-abstract-class"

    .line 48
    .line 49
    const-string v1, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_1
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method


# virtual methods
.method public b(Lr0/b;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/google/gson/internal/b;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lcom/google/gson/internal/b;->d:Ljava/util/List;

    .line 14
    .line 15
    check-cast v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    .line 28
    .line 29
    check-cast p1, Lcom/bumptech/glide/request/a;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/bumptech/glide/request/a;->c()V

    .line 32
    .line 33
    .line 34
    :cond_3
    return v0
.end method

.method public c(Lk1/a;Z)Lcom/google/gson/internal/k;
    .locals 9

    .line 1
    iget-object v0, p1, Lk1/a;->b:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    iget-object p1, p1, Lk1/a;->a:Ljava/lang/Class;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/gson/internal/b;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-nez v2, :cond_1a

    .line 14
    .line 15
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_19

    .line 20
    .line 21
    const-class v1, Ljava/util/EnumSet;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x1

    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    new-instance v1, Lcom/google/gson/internal/a;

    .line 33
    .line 34
    invoke-direct {v1, v3, v0}, Lcom/google/gson/internal/a;-><init>(ILjava/lang/reflect/Type;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-class v1, Ljava/util/EnumMap;

    .line 39
    .line 40
    if-ne p1, v1, :cond_1

    .line 41
    .line 42
    new-instance v1, Lcom/google/gson/internal/a;

    .line 43
    .line 44
    invoke-direct {v1, v2, v0}, Lcom/google/gson/internal/a;-><init>(ILjava/lang/reflect/Type;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object v1, v4

    .line 49
    :goto_0
    if-eqz v1, :cond_2

    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_2
    iget-object v1, p0, Lcom/google/gson/internal/b;->d:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v1}, Lcom/google/gson/internal/e;->f(Ljava/util/List;)Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    :catch_0
    move-object v6, v4

    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :cond_3
    :try_start_0
    invoke-virtual {p1, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 72
    .line 73
    .line 74
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    sget-object v6, Lcom/google/gson/ReflectionAccessFilter$FilterResult;->ALLOW:Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 76
    .line 77
    if-eq v1, v6, :cond_5

    .line 78
    .line 79
    sget-object v7, Lcom/google/gson/internal/n;->a:Lcom/google/gson/internal/n;

    .line 80
    .line 81
    invoke-virtual {v7, v4, v5}, Lcom/google/gson/internal/n;->a(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eqz v7, :cond_4

    .line 86
    .line 87
    sget-object v7, Lcom/google/gson/ReflectionAccessFilter$FilterResult;->BLOCK_ALL:Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 88
    .line 89
    if-ne v1, v7, :cond_5

    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-eqz v7, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v6, "Unable to invoke no-args constructor of "

    .line 105
    .line 106
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v6, "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."

    .line 113
    .line 114
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    new-instance v6, Landroidx/constraintlayout/core/state/a;

    .line 122
    .line 123
    const/4 v7, 0x2

    .line 124
    invoke-direct {v6, v5, v7}, Landroidx/constraintlayout/core/state/a;-><init>(Ljava/lang/String;I)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    :goto_1
    if-ne v1, v6, :cond_6

    .line 129
    .line 130
    sget-object v6, Li1/c;->a:Lv7/d;

    .line 131
    .line 132
    :try_start_1
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 133
    .line 134
    .line 135
    move-object v6, v4

    .line 136
    goto :goto_2

    .line 137
    :catch_1
    move-exception v6

    .line 138
    new-instance v7, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v8, "Failed making constructor \'"

    .line 141
    .line 142
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v5}, Li1/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v8, "\' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "

    .line 153
    .line 154
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-static {v6}, Li1/c;->e(Ljava/lang/Exception;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    :goto_2
    if-eqz v6, :cond_6

    .line 176
    .line 177
    new-instance v5, Landroidx/constraintlayout/core/state/a;

    .line 178
    .line 179
    const/4 v7, 0x3

    .line 180
    invoke-direct {v5, v6, v7}, Landroidx/constraintlayout/core/state/a;-><init>(Ljava/lang/String;I)V

    .line 181
    .line 182
    .line 183
    move-object v6, v5

    .line 184
    goto :goto_3

    .line 185
    :cond_6
    new-instance v6, Landroidx/camera/core/impl/d;

    .line 186
    .line 187
    const/16 v7, 0xa

    .line 188
    .line 189
    invoke-direct {v6, v5, v7}, Landroidx/camera/core/impl/d;-><init>(Ljava/lang/Object;I)V

    .line 190
    .line 191
    .line 192
    :goto_3
    if-eqz v6, :cond_7

    .line 193
    .line 194
    return-object v6

    .line 195
    :cond_7
    const-class v5, Ljava/util/Collection;

    .line 196
    .line 197
    invoke-virtual {v5, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-eqz v5, :cond_b

    .line 202
    .line 203
    const-class v0, Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_8

    .line 210
    .line 211
    new-instance v4, Landroidx/compose/ui/graphics/colorspace/a;

    .line 212
    .line 213
    const/16 v0, 0x19

    .line 214
    .line 215
    invoke-direct {v4, v0}, Landroidx/compose/ui/graphics/colorspace/a;-><init>(I)V

    .line 216
    .line 217
    .line 218
    goto/16 :goto_6

    .line 219
    .line 220
    :cond_8
    const-class v0, Ljava/util/LinkedHashSet;

    .line 221
    .line 222
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_9

    .line 227
    .line 228
    new-instance v4, Landroidx/compose/ui/graphics/colorspace/a;

    .line 229
    .line 230
    const/16 v0, 0x1a

    .line 231
    .line 232
    invoke-direct {v4, v0}, Landroidx/compose/ui/graphics/colorspace/a;-><init>(I)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_6

    .line 236
    .line 237
    :cond_9
    const-class v0, Ljava/util/TreeSet;

    .line 238
    .line 239
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_a

    .line 244
    .line 245
    new-instance v4, Landroidx/compose/ui/graphics/colorspace/a;

    .line 246
    .line 247
    const/16 v0, 0x1b

    .line 248
    .line 249
    invoke-direct {v4, v0}, Landroidx/compose/ui/graphics/colorspace/a;-><init>(I)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_6

    .line 253
    .line 254
    :cond_a
    const-class v0, Ljava/util/ArrayDeque;

    .line 255
    .line 256
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_12

    .line 261
    .line 262
    new-instance v4, Landroidx/compose/ui/graphics/colorspace/a;

    .line 263
    .line 264
    const/16 v0, 0x1c

    .line 265
    .line 266
    invoke-direct {v4, v0}, Landroidx/compose/ui/graphics/colorspace/a;-><init>(I)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_6

    .line 270
    .line 271
    :cond_b
    const-class v5, Ljava/util/Map;

    .line 272
    .line 273
    invoke-virtual {v5, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    if-eqz v5, :cond_12

    .line 278
    .line 279
    const-class v5, Lcom/google/gson/internal/LinkedTreeMap;

    .line 280
    .line 281
    invoke-virtual {p1, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-eqz v5, :cond_e

    .line 286
    .line 287
    instance-of v5, v0, Ljava/lang/reflect/ParameterizedType;

    .line 288
    .line 289
    if-nez v5, :cond_c

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_c
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 293
    .line 294
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    array-length v5, v0

    .line 299
    if-nez v5, :cond_d

    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_d
    aget-object v0, v0, v2

    .line 303
    .line 304
    invoke-static {v0}, Lcom/google/gson/internal/e;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    const-class v2, Ljava/lang/String;

    .line 309
    .line 310
    if-ne v0, v2, :cond_e

    .line 311
    .line 312
    :goto_4
    new-instance v4, Landroidx/compose/ui/graphics/colorspace/a;

    .line 313
    .line 314
    const/16 v0, 0x14

    .line 315
    .line 316
    invoke-direct {v4, v0}, Landroidx/compose/ui/graphics/colorspace/a;-><init>(I)V

    .line 317
    .line 318
    .line 319
    goto :goto_6

    .line 320
    :cond_e
    :goto_5
    const-class v0, Ljava/util/LinkedHashMap;

    .line 321
    .line 322
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    if-eqz v0, :cond_f

    .line 327
    .line 328
    new-instance v4, Landroidx/compose/ui/graphics/colorspace/a;

    .line 329
    .line 330
    const/16 v0, 0x15

    .line 331
    .line 332
    invoke-direct {v4, v0}, Landroidx/compose/ui/graphics/colorspace/a;-><init>(I)V

    .line 333
    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_f
    const-class v0, Ljava/util/TreeMap;

    .line 337
    .line 338
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-eqz v0, :cond_10

    .line 343
    .line 344
    new-instance v4, Landroidx/compose/ui/graphics/colorspace/a;

    .line 345
    .line 346
    const/16 v0, 0x16

    .line 347
    .line 348
    invoke-direct {v4, v0}, Landroidx/compose/ui/graphics/colorspace/a;-><init>(I)V

    .line 349
    .line 350
    .line 351
    goto :goto_6

    .line 352
    :cond_10
    const-class v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 353
    .line 354
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-eqz v0, :cond_11

    .line 359
    .line 360
    new-instance v4, Landroidx/compose/ui/graphics/colorspace/a;

    .line 361
    .line 362
    const/16 v0, 0x17

    .line 363
    .line 364
    invoke-direct {v4, v0}, Landroidx/compose/ui/graphics/colorspace/a;-><init>(I)V

    .line 365
    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_11
    const-class v0, Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 369
    .line 370
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-eqz v0, :cond_12

    .line 375
    .line 376
    new-instance v4, Landroidx/compose/ui/graphics/colorspace/a;

    .line 377
    .line 378
    const/16 v0, 0x18

    .line 379
    .line 380
    invoke-direct {v4, v0}, Landroidx/compose/ui/graphics/colorspace/a;-><init>(I)V

    .line 381
    .line 382
    .line 383
    :cond_12
    :goto_6
    if-eqz v4, :cond_13

    .line 384
    .line 385
    return-object v4

    .line 386
    :cond_13
    invoke-static {p1}, Lcom/google/gson/internal/b;->a(Ljava/lang/Class;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    if-eqz v0, :cond_14

    .line 391
    .line 392
    new-instance p1, Landroidx/constraintlayout/core/state/a;

    .line 393
    .line 394
    invoke-direct {p1, v0, v3}, Landroidx/constraintlayout/core/state/a;-><init>(Ljava/lang/String;I)V

    .line 395
    .line 396
    .line 397
    return-object p1

    .line 398
    :cond_14
    const-string v0, "Unable to create instance of "

    .line 399
    .line 400
    if-nez p2, :cond_15

    .line 401
    .line 402
    new-instance p2, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    const-string p1, "; Register an InstanceCreator or a TypeAdapter for this type."

    .line 411
    .line 412
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object p1

    .line 419
    new-instance p2, Landroidx/constraintlayout/core/state/a;

    .line 420
    .line 421
    const/4 v0, 0x4

    .line 422
    invoke-direct {p2, p1, v0}, Landroidx/constraintlayout/core/state/a;-><init>(Ljava/lang/String;I)V

    .line 423
    .line 424
    .line 425
    return-object p2

    .line 426
    :cond_15
    sget-object p2, Lcom/google/gson/ReflectionAccessFilter$FilterResult;->ALLOW:Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 427
    .line 428
    if-eq v1, p2, :cond_16

    .line 429
    .line 430
    new-instance p2, Ljava/lang/StringBuilder;

    .line 431
    .line 432
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    const-string p1, "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."

    .line 439
    .line 440
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    new-instance p2, Landroidx/constraintlayout/core/state/a;

    .line 448
    .line 449
    const/4 v0, 0x5

    .line 450
    invoke-direct {p2, p1, v0}, Landroidx/constraintlayout/core/state/a;-><init>(Ljava/lang/String;I)V

    .line 451
    .line 452
    .line 453
    return-object p2

    .line 454
    :cond_16
    iget-boolean p2, p0, Lcom/google/gson/internal/b;->b:Z

    .line 455
    .line 456
    if-eqz p2, :cond_17

    .line 457
    .line 458
    new-instance p2, Landroidx/camera/core/impl/d;

    .line 459
    .line 460
    const/16 v0, 0xb

    .line 461
    .line 462
    invoke-direct {p2, p1, v0}, Landroidx/camera/core/impl/d;-><init>(Ljava/lang/Object;I)V

    .line 463
    .line 464
    .line 465
    goto :goto_7

    .line 466
    :cond_17
    new-instance p2, Ljava/lang/StringBuilder;

    .line 467
    .line 468
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    const-string v0, "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."

    .line 475
    .line 476
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object p2

    .line 483
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    array-length p1, p1

    .line 488
    if-nez p1, :cond_18

    .line 489
    .line 490
    const-string p1, " Or adjust your R8 configuration to keep the no-args constructor of the class."

    .line 491
    .line 492
    invoke-static {p2, p1}, Landroid/support/v4/media/f;->C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object p2

    .line 496
    :cond_18
    new-instance p1, Landroidx/constraintlayout/core/state/a;

    .line 497
    .line 498
    const/4 v0, 0x6

    .line 499
    invoke-direct {p1, p2, v0}, Landroidx/constraintlayout/core/state/a;-><init>(Ljava/lang/String;I)V

    .line 500
    .line 501
    .line 502
    move-object p2, p1

    .line 503
    :goto_7
    return-object p2

    .line 504
    :cond_19
    new-instance p1, Ljava/lang/ClassCastException;

    .line 505
    .line 506
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 507
    .line 508
    .line 509
    throw p1

    .line 510
    :cond_1a
    new-instance p1, Ljava/lang/ClassCastException;

    .line 511
    .line 512
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 513
    .line 514
    .line 515
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/gson/internal/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string/jumbo v1, "{numRequests="

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/gson/internal/b;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/util/Set;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", isPaused="

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-boolean v1, p0, Lcom/google/gson/internal/b;->b:Z

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string/jumbo v1, "}"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :pswitch_0
    iget-object v0, p0, Lcom/google/gson/internal/b;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/util/Map;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
