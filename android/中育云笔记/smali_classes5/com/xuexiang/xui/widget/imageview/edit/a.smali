.class public abstract Lcom/xuexiang/xui/widget/imageview/edit/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/opengl/GLSurfaceView;Ljavax/microedition/khronos/opengles/GL10;)Landroid/graphics/Bitmap;
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    mul-int p0, v3, v4

    .line 10
    .line 11
    new-array v8, p0, [I

    .line 12
    .line 13
    new-array p0, p0, [I

    .line 14
    .line 15
    invoke-static {v8}, Ljava/nio/IntBuffer;->wrap([I)Ljava/nio/IntBuffer;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    const/4 v9, 0x0

    .line 20
    invoke-virtual {v7, v9}, Ljava/nio/IntBuffer;->position(I)Ljava/nio/Buffer;

    .line 21
    .line 22
    .line 23
    const/16 v5, 0x1908

    .line 24
    .line 25
    const/16 v6, 0x1401

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    const/4 v2, 0x0

    .line 29
    move-object v0, p1

    .line 30
    :try_start_0
    invoke-interface/range {v0 .. v7}, Ljavax/microedition/khronos/opengles/GL10;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    .line 31
    .line 32
    .line 33
    move p1, v9

    .line 34
    :goto_0
    if-ge p1, v4, :cond_1

    .line 35
    .line 36
    mul-int v0, p1, v3

    .line 37
    .line 38
    sub-int v1, v4, p1

    .line 39
    .line 40
    add-int/lit8 v1, v1, -0x1

    .line 41
    .line 42
    mul-int/2addr v1, v3

    .line 43
    move v2, v9

    .line 44
    :goto_1
    if-ge v2, v3, :cond_0

    .line 45
    .line 46
    add-int v5, v0, v2

    .line 47
    .line 48
    aget v5, v8, v5

    .line 49
    .line 50
    shr-int/lit8 v6, v5, 0x10

    .line 51
    .line 52
    and-int/lit16 v6, v6, 0xff

    .line 53
    .line 54
    shl-int/lit8 v7, v5, 0x10

    .line 55
    .line 56
    const/high16 v10, 0xff0000

    .line 57
    .line 58
    and-int/2addr v7, v10

    .line 59
    const v10, -0xff0100

    .line 60
    .line 61
    .line 62
    and-int/2addr v5, v10

    .line 63
    or-int/2addr v5, v7

    .line 64
    or-int/2addr v5, v6

    .line 65
    add-int v6, v1, v2

    .line 66
    .line 67
    aput v5, p0, v6
    :try_end_0
    .catch Landroid/opengl/GLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 76
    .line 77
    invoke-static {p0, v3, v4, p1}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :catch_0
    const/4 p0, 0x0

    .line 83
    return-object p0
.end method
