.class public abstract Lcom/xuexiang/xui/utils/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/graphics/Canvas;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/xuexiang/xui/utils/d;->a:Landroid/graphics/Canvas;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, -0x1

    .line 24
    if-lez v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-gtz v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eq v3, v1, :cond_2

    .line 46
    .line 47
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 51
    .line 52
    :goto_0
    invoke-static {v0, v2, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    goto :goto_3

    .line 57
    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eq v0, v1, :cond_4

    .line 62
    .line 63
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 67
    .line 68
    :goto_2
    const/4 v1, 0x1

    .line 69
    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    :goto_3
    new-instance v1, Landroid/graphics/Canvas;

    .line 74
    .line 75
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    const/4 v4, 0x0

    .line 87
    invoke-virtual {p0, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 91
    .line 92
    .line 93
    return-object v0
.end method

.method public static b(Landroid/content/Context;I)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/xuexiang/xui/utils/f;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/xuexiang/xui/utils/d;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
