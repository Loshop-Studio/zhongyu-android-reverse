.class final Landroidx/compose/ui/platform/BoundsHelperApi28Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/BoundsHelper;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1c
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c3\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/platform/BoundsHelperApi28Impl;",
        "Landroidx/compose/ui/platform/BoundsHelper;",
        "()V",
        "currentWindowBounds",
        "Landroid/graphics/Rect;",
        "activity",
        "Landroid/app/Activity;",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
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
    const-string/jumbo v4, "windowConfiguration"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 32
    .line 33
    .line 34
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    const-string/jumbo v4, "null cannot be cast to non-null type android.graphics.Rect"

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const-string v6, "getBounds"

    .line 46
    .line 47
    invoke-virtual {v3, v6, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    check-cast v1, Landroid/graphics/Rect;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 61
    .line 62
    .line 63
    goto :goto_4

    .line 64
    :catch_0
    move-exception v1

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    const-string v6, "getAppBounds"

    .line 71
    .line 72
    invoke-virtual {v3, v6, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v3, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    check-cast v1, Landroid/graphics/Rect;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 86
    .line 87
    .line 88
    goto :goto_4

    .line 89
    :goto_0
    instance-of v3, v1, Ljava/lang/NoSuchFieldException;

    .line 90
    .line 91
    if-eqz v3, :cond_1

    .line 92
    .line 93
    move v3, v2

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    instance-of v3, v1, Ljava/lang/NoSuchMethodException;

    .line 96
    .line 97
    :goto_1
    if-eqz v3, :cond_2

    .line 98
    .line 99
    move v3, v2

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    instance-of v3, v1, Ljava/lang/IllegalAccessException;

    .line 102
    .line 103
    :goto_2
    if-eqz v3, :cond_3

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_3
    instance-of v2, v1, Ljava/lang/reflect/InvocationTargetException;

    .line 107
    .line 108
    :goto_3
    if-eqz v2, :cond_c

    .line 109
    .line 110
    invoke-static {p1, v0}, Landroidx/compose/ui/platform/AndroidWindowInfo_androidKt;->access$getRectSizeFromDisplay(Landroid/app/Activity;Landroid/graphics/Rect;)V

    .line 111
    .line 112
    .line 113
    :goto_4
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    new-instance v2, Landroid/graphics/Point;

    .line 122
    .line 123
    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v2}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    const/4 v4, 0x0

    .line 134
    if-nez v3, :cond_6

    .line 135
    .line 136
    invoke-static {p1}, Landroidx/compose/ui/platform/AndroidWindowInfo_androidKt;->access$getNavigationBarHeight(Landroid/content/Context;)I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    .line 141
    .line 142
    add-int v6, v5, v3

    .line 143
    .line 144
    iget v7, v2, Landroid/graphics/Point;->y:I

    .line 145
    .line 146
    if-ne v6, v7, :cond_4

    .line 147
    .line 148
    add-int/2addr v5, v3

    .line 149
    iput v5, v0, Landroid/graphics/Rect;->bottom:I

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_4
    iget v5, v0, Landroid/graphics/Rect;->right:I

    .line 153
    .line 154
    add-int v6, v5, v3

    .line 155
    .line 156
    iget v7, v2, Landroid/graphics/Point;->x:I

    .line 157
    .line 158
    if-ne v6, v7, :cond_5

    .line 159
    .line 160
    add-int/2addr v5, v3

    .line 161
    iput v5, v0, Landroid/graphics/Rect;->right:I

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_5
    iget v5, v0, Landroid/graphics/Rect;->left:I

    .line 165
    .line 166
    if-ne v5, v3, :cond_6

    .line 167
    .line 168
    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 169
    .line 170
    :cond_6
    :goto_5
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    iget v5, v2, Landroid/graphics/Point;->x:I

    .line 175
    .line 176
    if-lt v3, v5, :cond_7

    .line 177
    .line 178
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    iget v5, v2, Landroid/graphics/Point;->y:I

    .line 183
    .line 184
    if-ge v3, v5, :cond_b

    .line 185
    .line 186
    :cond_7
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-nez p1, :cond_b

    .line 191
    .line 192
    invoke-static {v1}, Landroidx/compose/ui/platform/AndroidWindowInfo_androidKt;->access$getCutoutForDisplay(Landroid/view/Display;)Landroid/view/DisplayCutout;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-eqz p1, :cond_b

    .line 197
    .line 198
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetLeft()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-ne v1, v3, :cond_8

    .line 205
    .line 206
    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 207
    .line 208
    :cond_8
    iget v1, v2, Landroid/graphics/Point;->x:I

    .line 209
    .line 210
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 211
    .line 212
    sub-int/2addr v1, v3

    .line 213
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-ne v1, v3, :cond_9

    .line 218
    .line 219
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 220
    .line 221
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    add-int/2addr v1, v3

    .line 226
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 227
    .line 228
    :cond_9
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 229
    .line 230
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetTop()I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-ne v1, v3, :cond_a

    .line 235
    .line 236
    iput v4, v0, Landroid/graphics/Rect;->top:I

    .line 237
    .line 238
    :cond_a
    iget v1, v2, Landroid/graphics/Point;->y:I

    .line 239
    .line 240
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 241
    .line 242
    sub-int/2addr v1, v2

    .line 243
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-ne v1, v2, :cond_b

    .line 248
    .line 249
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 250
    .line 251
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    add-int/2addr v1, p1

    .line 256
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 257
    .line 258
    :cond_b
    return-object v0

    .line 259
    :cond_c
    throw v1
.end method
