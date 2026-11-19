.class public abstract Ly8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Landroid/graphics/Paint; = null

.field public static b:Landroid/graphics/Paint; = null

.field public static c:Landroid/graphics/RectF; = null

.field public static d:Z = true

.field public static e:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly8/d;->a:Landroid/graphics/Paint;

    .line 7
    .line 8
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 9
    .line 10
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 11
    .line 12
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 16
    .line 17
    .line 18
    sget-object v0, Ly8/d;->a:Landroid/graphics/Paint;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Landroid/graphics/RectF;

    .line 25
    .line 26
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, Ly8/d;->c:Landroid/graphics/RectF;

    .line 30
    .line 31
    return-void
.end method

.method public static a(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    sget-boolean v0, Ly8/d;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-boolean v0, Ly8/d;->e:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 11
    .line 12
    invoke-virtual {p0, v1, v0}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    sget-object v0, Ly8/d;->c:Landroid/graphics/RectF;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/Canvas;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-float v1, v1

    .line 27
    invoke-virtual {p0}, Landroid/graphics/Canvas;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    int-to-float v2, v2

    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Ly8/d;->c:Landroid/graphics/RectF;

    .line 37
    .line 38
    invoke-static {p0, v0}, Ly8/d;->c(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static b(Landroid/graphics/Canvas;FFFF)V
    .locals 1

    .line 1
    sget-object v0, Ly8/d;->c:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Ly8/d;->c:Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-static {p0, p1}, Ly8/d;->c(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static c(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    cmpg-float v0, v0, v1

    .line 7
    .line 8
    if-lez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    cmpg-float v0, v0, v1

    .line 15
    .line 16
    if-gtz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v0, Ly8/d;->a:Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public static d(Landroid/graphics/Canvas;Ljava/lang/String;)V
    .locals 5

    .line 1
    sget-object v0, Ly8/d;->b:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ly8/d;->b:Landroid/graphics/Paint;

    .line 11
    .line 12
    const/high16 v1, -0x10000

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Ly8/d;->b:Landroid/graphics/Paint;

    .line 18
    .line 19
    const/high16 v1, 0x41f00000    # 30.0f

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Canvas;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/lit8 v1, v0, -0x32

    .line 29
    .line 30
    add-int/lit8 v0, v0, -0x64

    .line 31
    .line 32
    int-to-float v0, v0

    .line 33
    sget-object v2, Ly8/d;->b:Landroid/graphics/Paint;

    .line 34
    .line 35
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/high16 v3, 0x41a00000    # 20.0f

    .line 40
    .line 41
    add-float/2addr v2, v3

    .line 42
    float-to-int v2, v2

    .line 43
    int-to-float v2, v2

    .line 44
    invoke-virtual {p0}, Landroid/graphics/Canvas;->getHeight()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    int-to-float v3, v3

    .line 49
    const/high16 v4, 0x41200000    # 10.0f

    .line 50
    .line 51
    invoke-static {p0, v4, v0, v2, v3}, Ly8/d;->b(Landroid/graphics/Canvas;FFFF)V

    .line 52
    .line 53
    .line 54
    int-to-float v0, v1

    .line 55
    sget-object v1, Ly8/d;->b:Landroid/graphics/Paint;

    .line 56
    .line 57
    invoke-virtual {p0, p1, v4, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static e(ZZ)V
    .locals 0

    .line 1
    sput-boolean p0, Ly8/d;->d:Z

    .line 2
    .line 3
    sput-boolean p1, Ly8/d;->e:Z

    .line 4
    .line 5
    return-void
.end method
