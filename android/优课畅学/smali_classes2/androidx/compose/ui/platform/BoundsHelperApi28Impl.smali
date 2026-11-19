.class final Landroidx/compose/ui/platform/BoundsHelperApi28Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/BoundsHelper;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1c
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/platform/BoundsHelperApi28Impl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/BoundsHelperApi28Impl;

    invoke-direct {v0}, Landroidx/compose/ui/platform/BoundsHelperApi28Impl;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/BoundsHelperApi28Impl;->INSTANCE:Landroidx/compose/ui/platform/BoundsHelperApi28Impl;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public currentWindowBounds(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BanUncheckedReflection",
            "BlockedPrivateApi"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x1

    .line 15
    :try_start_0
    const-class v3, Landroid/content/res/Configuration;

    .line 16
    .line 17
    const-string v4, "windowConfiguration"

    .line 18
    .line 19
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 31
    .line 32
    .line 33
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    const-string v4, "null cannot be cast to non-null type android.graphics.Rect"

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const-string v6, "getBounds"

    .line 44
    .line 45
    invoke-virtual {v3, v6, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    check-cast v1, Landroid/graphics/Rect;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 59
    .line 60
    .line 61
    goto :goto_4

    .line 62
    :catch_0
    move-exception v1

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const-string v6, "getAppBounds"

    .line 69
    .line 70
    invoke-virtual {v3, v6, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    check-cast v1, Landroid/graphics/Rect;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 84
    .line 85
    .line 86
    goto :goto_4

    .line 87
    :goto_0
    instance-of v3, v1, Ljava/lang/NoSuchFieldException;

    .line 88
    .line 89
    if-eqz v3, :cond_1

    .line 90
    .line 91
    move v3, v2

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    instance-of v3, v1, Ljava/lang/NoSuchMethodException;

    .line 94
    .line 95
    :goto_1
    if-eqz v3, :cond_2

    .line 96
    .line 97
    move v3, v2

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    instance-of v3, v1, Ljava/lang/IllegalAccessException;

    .line 100
    .line 101
    :goto_2
    if-eqz v3, :cond_3

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_3
    instance-of v2, v1, Ljava/lang/reflect/InvocationTargetException;

    .line 105
    .line 106
    :goto_3
    if-eqz v2, :cond_c

    .line 107
    .line 108
    invoke-static {p1, v0}, Landroidx/compose/ui/platform/AndroidWindowInfo_androidKt;->access$getRectSizeFromDisplay(Landroid/app/Activity;Landroid/graphics/Rect;)V

    .line 109
    .line 110
    .line 111
    :goto_4
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    new-instance v2, Landroid/graphics/Point;

    .line 120
    .line 121
    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v2}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    const/4 v4, 0x0

    .line 132
    if-nez v3, :cond_6

    .line 133
    .line 134
    invoke-static {p1}, Landroidx/compose/ui/platform/AndroidWindowInfo_androidKt;->access$getNavigationBarHeight(Landroid/content/Context;)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    .line 139
    .line 140
    add-int v6, v5, v3

    .line 141
    .line 142
    iget v7, v2, Landroid/graphics/Point;->y:I

    .line 143
    .line 144
    if-ne v6, v7, :cond_4

    .line 145
    .line 146
    add-int/2addr v5, v3

    .line 147
    iput v5, v0, Landroid/graphics/Rect;->bottom:I

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_4
    iget v5, v0, Landroid/graphics/Rect;->right:I

    .line 151
    .line 152
    add-int v6, v5, v3

    .line 153
    .line 154
    iget v7, v2, Landroid/graphics/Point;->x:I

    .line 155
    .line 156
    if-ne v6, v7, :cond_5

    .line 157
    .line 158
    add-int/2addr v5, v3

    .line 159
    iput v5, v0, Landroid/graphics/Rect;->right:I

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_5
    iget v5, v0, Landroid/graphics/Rect;->left:I

    .line 163
    .line 164
    if-ne v5, v3, :cond_6

    .line 165
    .line 166
    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 167
    .line 168
    :cond_6
    :goto_5
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    iget v5, v2, Landroid/graphics/Point;->x:I

    .line 173
    .line 174
    if-lt v3, v5, :cond_7

    .line 175
    .line 176
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    iget v5, v2, Landroid/graphics/Point;->y:I

    .line 181
    .line 182
    if-ge v3, v5, :cond_b

    .line 183
    .line 184
    :cond_7
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-nez p1, :cond_b

    .line 189
    .line 190
    invoke-static {v1}, Landroidx/compose/ui/platform/AndroidWindowInfo_androidKt;->access$getCutoutForDisplay(Landroid/view/Display;)Landroid/view/DisplayCutout;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    if-eqz p1, :cond_b

    .line 195
    .line 196
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 197
    .line 198
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetLeft()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-ne v1, v3, :cond_8

    .line 203
    .line 204
    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 205
    .line 206
    :cond_8
    iget v1, v2, Landroid/graphics/Point;->x:I

    .line 207
    .line 208
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 209
    .line 210
    sub-int/2addr v1, v3

    .line 211
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-ne v1, v3, :cond_9

    .line 216
    .line 217
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 218
    .line 219
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    add-int/2addr v1, v3

    .line 224
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 225
    .line 226
    :cond_9
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 227
    .line 228
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetTop()I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-ne v1, v3, :cond_a

    .line 233
    .line 234
    iput v4, v0, Landroid/graphics/Rect;->top:I

    .line 235
    .line 236
    :cond_a
    iget v1, v2, Landroid/graphics/Point;->y:I

    .line 237
    .line 238
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 239
    .line 240
    sub-int/2addr v1, v2

    .line 241
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-ne v1, v2, :cond_b

    .line 246
    .line 247
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 248
    .line 249
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    add-int/2addr v1, p1

    .line 254
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 255
    .line 256
    :cond_b
    return-object v0

    .line 257
    :cond_c
    throw v1
.end method
