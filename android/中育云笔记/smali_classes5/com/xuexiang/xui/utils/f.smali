.class public abstract Lcom/xuexiang/xui/utils/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(IF)I
    .locals 4

    .line 1
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v1, v1

    .line 10
    mul-float/2addr v1, p1

    .line 11
    float-to-int v1, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    int-to-float v3, v3

    .line 22
    mul-float/2addr v3, p1

    .line 23
    float-to-int v3, v3

    .line 24
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    int-to-float p0, p0

    .line 33
    mul-float/2addr p0, p1

    .line 34
    float-to-int p0, p0

    .line 35
    invoke-static {p0, v2}, Ljava/lang/Math;->max(II)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-static {v0, v1, v3, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
.end method

.method public static b(I)Landroid/view/animation/Animation;
    .locals 1

    .line 1
    invoke-static {}, Ly7/b;->b()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static c(I)I
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/utils/f;->i()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getColor(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public static d(I)Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/utils/f;->i()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static e(I)I
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/utils/f;->i()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public static f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static h(I)[I
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/utils/f;->i()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getIntArray(I)[I

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static i()Landroid/content/res/Resources;
    .locals 1

    .line 1
    invoke-static {}, Ly7/b;->b()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static j(I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/utils/f;->i()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static k(I)[Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/utils/f;->i()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static l(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static m()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/utils/f;->i()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public static n(IF)I
    .locals 5

    .line 1
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    sub-float/2addr v1, p1

    .line 9
    mul-float/2addr v0, v1

    .line 10
    const/high16 v2, 0x437f0000    # 255.0f

    .line 11
    .line 12
    div-float/2addr v0, v2

    .line 13
    add-float/2addr v0, p1

    .line 14
    mul-float/2addr v0, v2

    .line 15
    float-to-int v0, v0

    .line 16
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    int-to-float v3, v3

    .line 21
    mul-float/2addr v3, v1

    .line 22
    div-float/2addr v3, v2

    .line 23
    add-float/2addr v3, p1

    .line 24
    mul-float/2addr v3, v2

    .line 25
    float-to-int v3, v3

    .line 26
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    int-to-float v4, v4

    .line 31
    mul-float/2addr v4, v1

    .line 32
    div-float/2addr v4, v2

    .line 33
    add-float/2addr v4, p1

    .line 34
    mul-float/2addr v4, v2

    .line 35
    float-to-int p1, v4

    .line 36
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p0, v0, v3, p1}, Landroid/graphics/Color;->argb(IIII)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0
.end method
