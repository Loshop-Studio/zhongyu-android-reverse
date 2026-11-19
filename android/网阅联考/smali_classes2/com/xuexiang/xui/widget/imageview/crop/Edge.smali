.class public final enum Lcom/xuexiang/xui/widget/imageview/crop/Edge;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/imageview/crop/Edge;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public static final enum c:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public static final enum d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public static final enum e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public static final synthetic f:[Lcom/xuexiang/xui/widget/imageview/crop/Edge;


# instance fields
.field public a:F


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    const-string v1, "LEFT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 10
    .line 11
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 12
    .line 13
    const-string v3, "TOP"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->c:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 20
    .line 21
    new-instance v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 22
    .line 23
    const-string v5, "RIGHT"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 30
    .line 31
    new-instance v5, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 32
    .line 33
    const-string v7, "BOTTOM"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    new-array v7, v7, [Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 43
    .line 44
    aput-object v0, v7, v2

    .line 45
    .line 46
    aput-object v1, v7, v4

    .line 47
    .line 48
    aput-object v3, v7, v6

    .line 49
    .line 50
    aput-object v5, v7, v8

    .line 51
    .line 52
    sput-object v7, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->f:[Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(FLandroid/graphics/Rect;FF)F
    .locals 3

    .line 1
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 2
    .line 3
    int-to-float v0, p1

    .line 4
    sub-float/2addr v0, p0

    .line 5
    cmpg-float p2, v0, p2

    .line 6
    .line 7
    if-gez p2, :cond_0

    .line 8
    .line 9
    int-to-float p0, p1

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->c:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/high16 v0, 0x42200000    # 40.0f

    .line 18
    .line 19
    add-float/2addr p2, v0

    .line 20
    cmpg-float p2, p0, p2

    .line 21
    .line 22
    const/high16 v1, -0x800000    # Float.NEGATIVE_INFINITY

    .line 23
    .line 24
    if-gtz p2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    add-float/2addr p2, v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move p2, v1

    .line 33
    :goto_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    sub-float v2, p0, v2

    .line 38
    .line 39
    mul-float/2addr v2, p3

    .line 40
    cmpg-float v2, v2, v0

    .line 41
    .line 42
    if-gtz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    div-float/2addr v0, p3

    .line 49
    add-float v1, p1, v0

    .line 50
    .line 51
    :cond_2
    invoke-static {v1, p2}, Ljava/lang/Math;->max(FF)F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    :goto_1
    return p0
.end method

.method public static d(FLandroid/graphics/Rect;FF)F
    .locals 3

    .line 1
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 2
    .line 3
    int-to-float v0, p1

    .line 4
    sub-float v0, p0, v0

    .line 5
    .line 6
    cmpg-float p2, v0, p2

    .line 7
    .line 8
    if-gez p2, :cond_0

    .line 9
    .line 10
    int-to-float p0, p1

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const/high16 v0, 0x42200000    # 40.0f

    .line 19
    .line 20
    sub-float/2addr p2, v0

    .line 21
    cmpl-float p2, p0, p2

    .line 22
    .line 23
    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 24
    .line 25
    if-ltz p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    sub-float/2addr p2, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move p2, v1

    .line 34
    :goto_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    sub-float/2addr v2, p0

    .line 39
    div-float/2addr v2, p3

    .line 40
    cmpg-float v2, v2, v0

    .line 41
    .line 42
    if-gtz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    mul-float/2addr p3, v0

    .line 49
    sub-float v1, p1, p3

    .line 50
    .line 51
    :cond_2
    invoke-static {p2, v1}, Ljava/lang/Math;->min(FF)F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    :goto_1
    return p0
.end method

.method public static e(FLandroid/graphics/Rect;FF)F
    .locals 3

    .line 1
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 2
    .line 3
    int-to-float v0, p1

    .line 4
    sub-float/2addr v0, p0

    .line 5
    cmpg-float p2, v0, p2

    .line 6
    .line 7
    if-gez p2, :cond_0

    .line 8
    .line 9
    int-to-float p0, p1

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/high16 v0, 0x42200000    # 40.0f

    .line 18
    .line 19
    add-float/2addr p2, v0

    .line 20
    cmpg-float p2, p0, p2

    .line 21
    .line 22
    const/high16 v1, -0x800000    # Float.NEGATIVE_INFINITY

    .line 23
    .line 24
    if-gtz p2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    add-float/2addr p2, v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move p2, v1

    .line 33
    :goto_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    sub-float v2, p0, v2

    .line 38
    .line 39
    div-float/2addr v2, p3

    .line 40
    cmpg-float v2, v2, v0

    .line 41
    .line 42
    if-gtz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    mul-float/2addr p3, v0

    .line 49
    add-float v1, p1, p3

    .line 50
    .line 51
    :cond_2
    invoke-static {p2, v1}, Ljava/lang/Math;->max(FF)F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    :goto_1
    return p0
.end method

.method public static f(FLandroid/graphics/Rect;FF)F
    .locals 3

    .line 1
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 2
    .line 3
    int-to-float v0, p1

    .line 4
    sub-float v0, p0, v0

    .line 5
    .line 6
    cmpg-float p2, v0, p2

    .line 7
    .line 8
    if-gez p2, :cond_0

    .line 9
    .line 10
    int-to-float p0, p1

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const/high16 v0, 0x42200000    # 40.0f

    .line 19
    .line 20
    sub-float/2addr p2, v0

    .line 21
    cmpl-float p2, p0, p2

    .line 22
    .line 23
    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 24
    .line 25
    if-ltz p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    sub-float/2addr p2, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move p2, v1

    .line 34
    :goto_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    sub-float/2addr v2, p0

    .line 39
    mul-float/2addr v2, p3

    .line 40
    cmpg-float v2, v2, v0

    .line 41
    .line 42
    if-gtz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    div-float/2addr v0, p3

    .line 49
    sub-float v1, p1, v0

    .line 50
    .line 51
    :cond_2
    invoke-static {p2, v1}, Ljava/lang/Math;->min(FF)F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    :goto_1
    return p0
.end method

.method public static h()F
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->c:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-float/2addr v0, v1

    .line 14
    return v0
.end method

.method public static i()F
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-float/2addr v0, v1

    .line 14
    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/imageview/crop/Edge;
    .locals 1

    .line 1
    const-class v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/imageview/crop/Edge;
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->f:[Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/imageview/crop/Edge;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public b(F)V
    .locals 6

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->c:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Edge$a;->a:[I

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    aget v4, v4, v5

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    if-eq v4, v5, :cond_3

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    if-eq v4, v5, :cond_2

    .line 38
    .line 39
    const/4 v5, 0x3

    .line 40
    if-eq v4, v5, :cond_1

    .line 41
    .line 42
    const/4 v3, 0x4

    .line 43
    if-eq v4, v3, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {v0, v1, v2, p1}, Lv0/a;->c(FFFF)F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-static {v0, v1, v3, p1}, Lv0/a;->f(FFFF)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-static {v0, v2, v3, p1}, Lv0/a;->g(FFFF)F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-static {v1, v2, v3, p1}, Lv0/a;->e(FFFF)F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 72
    .line 73
    :goto_0
    return-void
.end method

.method public c(FFLandroid/graphics/Rect;FF)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x4

    .line 19
    if-eq v0, p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {p2, p3, p4, p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a(FLandroid/graphics/Rect;FF)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p1, p3, p4, p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e(FLandroid/graphics/Rect;FF)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static {p2, p3, p4, p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->f(FLandroid/graphics/Rect;FF)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    invoke-static {p1, p3, p4, p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d(FLandroid/graphics/Rect;FF)F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 48
    .line 49
    :goto_0
    return-void
.end method

.method public g()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 2
    .line 3
    return v0
.end method

.method public j(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Landroid/graphics/Rect;F)Z
    .locals 8

    .line 1
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->o(Landroid/graphics/Rect;)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge$a;->a:[I

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    aget v1, v1, v2

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-eq v1, v2, :cond_6

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-eq v1, v3, :cond_4

    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    if-eq v1, v3, :cond_2

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    if-eq v1, v3, :cond_0

    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 36
    .line 37
    int-to-float v3, p1

    .line 38
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    sub-float v5, p1, v0

    .line 45
    .line 46
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->c:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-static {v3, v2, v5, p3}, Lv0/a;->c(FFFF)F

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    move-object v1, p0

    .line 57
    move-object v6, p2

    .line 58
    invoke-virtual/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->k(FFFFLandroid/graphics/Rect;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    return p1

    .line 63
    :cond_1
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 64
    .line 65
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_8

    .line 70
    .line 71
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 72
    .line 73
    int-to-float v6, p1

    .line 74
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    sub-float v4, p1, v0

    .line 79
    .line 80
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->c:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-static {v4, v3, v6, p3}, Lv0/a;->c(FFFF)F

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    move-object v2, p0

    .line 91
    move-object v7, p2

    .line 92
    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->k(FFFFLandroid/graphics/Rect;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    return p1

    .line 97
    :cond_2
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->c:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 98
    .line 99
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_3

    .line 104
    .line 105
    iget p1, p2, Landroid/graphics/Rect;->top:I

    .line 106
    .line 107
    int-to-float v2, p1

    .line 108
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    sub-float v4, p1, v0

    .line 115
    .line 116
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-static {v3, v2, v4, p3}, Lv0/a;->f(FFFF)F

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    move-object v1, p0

    .line 127
    move-object v6, p2

    .line 128
    invoke-virtual/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->k(FFFFLandroid/graphics/Rect;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    return p1

    .line 133
    :cond_3
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 134
    .line 135
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    .line 142
    .line 143
    int-to-float v5, p1

    .line 144
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    sub-float v3, p1, v0

    .line 149
    .line 150
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 151
    .line 152
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    invoke-static {v4, v3, v5, p3}, Lv0/a;->f(FFFF)F

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    move-object v2, p0

    .line 161
    move-object v7, p2

    .line 162
    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->k(FFFFLandroid/graphics/Rect;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    return p1

    .line 167
    :cond_4
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 168
    .line 169
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-eqz v3, :cond_5

    .line 174
    .line 175
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 176
    .line 177
    int-to-float v3, p1

    .line 178
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 179
    .line 180
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    sub-float v5, p1, v0

    .line 185
    .line 186
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 187
    .line 188
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    invoke-static {v3, v5, v4, p3}, Lv0/a;->g(FFFF)F

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    move-object v1, p0

    .line 197
    move-object v6, p2

    .line 198
    invoke-virtual/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->k(FFFFLandroid/graphics/Rect;)Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    return p1

    .line 203
    :cond_5
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 204
    .line 205
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_8

    .line 210
    .line 211
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 212
    .line 213
    int-to-float v6, p1

    .line 214
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    sub-float v4, p1, v0

    .line 219
    .line 220
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 221
    .line 222
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    invoke-static {v4, v6, v5, p3}, Lv0/a;->g(FFFF)F

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    move-object v2, p0

    .line 231
    move-object v7, p2

    .line 232
    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->k(FFFFLandroid/graphics/Rect;)Z

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    return p1

    .line 237
    :cond_6
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->c:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 238
    .line 239
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-eqz v3, :cond_7

    .line 244
    .line 245
    iget p1, p2, Landroid/graphics/Rect;->top:I

    .line 246
    .line 247
    int-to-float v2, p1

    .line 248
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 249
    .line 250
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    sub-float v4, p1, v0

    .line 255
    .line 256
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 257
    .line 258
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    invoke-static {v2, v5, v4, p3}, Lv0/a;->e(FFFF)F

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    move-object v1, p0

    .line 267
    move-object v6, p2

    .line 268
    invoke-virtual/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->k(FFFFLandroid/graphics/Rect;)Z

    .line 269
    .line 270
    .line 271
    move-result p1

    .line 272
    return p1

    .line 273
    :cond_7
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 274
    .line 275
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    if-eqz p1, :cond_8

    .line 280
    .line 281
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    .line 282
    .line 283
    int-to-float v5, p1

    .line 284
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    sub-float v3, p1, v0

    .line 289
    .line 290
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 291
    .line 292
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g()F

    .line 293
    .line 294
    .line 295
    move-result v6

    .line 296
    invoke-static {v3, v6, v5, p3}, Lv0/a;->e(FFFF)F

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    move-object v2, p0

    .line 301
    move-object v7, p2

    .line 302
    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->k(FFFFLandroid/graphics/Rect;)Z

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    return p1

    .line 307
    :cond_8
    :goto_0
    return v2
.end method

.method public final k(FFFFLandroid/graphics/Rect;)Z
    .locals 1

    .line 1
    iget v0, p5, Landroid/graphics/Rect;->top:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    cmpg-float p1, p1, v0

    .line 5
    .line 6
    if-ltz p1, :cond_1

    .line 7
    .line 8
    iget p1, p5, Landroid/graphics/Rect;->left:I

    .line 9
    .line 10
    int-to-float p1, p1

    .line 11
    cmpg-float p1, p2, p1

    .line 12
    .line 13
    if-ltz p1, :cond_1

    .line 14
    .line 15
    iget p1, p5, Landroid/graphics/Rect;->bottom:I

    .line 16
    .line 17
    int-to-float p1, p1

    .line 18
    cmpl-float p1, p3, p1

    .line 19
    .line 20
    if-gtz p1, :cond_1

    .line 21
    .line 22
    iget p1, p5, Landroid/graphics/Rect;->right:I

    .line 23
    .line 24
    int-to-float p1, p1

    .line 25
    cmpl-float p1, p4, p1

    .line 26
    .line 27
    if-lez p1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 33
    :goto_1
    return p1
.end method

.method public l(Landroid/graphics/Rect;F)Z
    .locals 4

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eq v0, v1, :cond_3

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v0, v3, :cond_2

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    if-eq v0, v3, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 24
    .line 25
    int-to-float p1, p1

    .line 26
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 27
    .line 28
    sub-float/2addr p1, v0

    .line 29
    cmpg-float p1, p1, p2

    .line 30
    .line 31
    if-gez p1, :cond_4

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 35
    .line 36
    int-to-float p1, p1

    .line 37
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 38
    .line 39
    sub-float/2addr p1, v0

    .line 40
    cmpg-float p1, p1, p2

    .line 41
    .line 42
    if-gez p1, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 46
    .line 47
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 48
    .line 49
    int-to-float p1, p1

    .line 50
    sub-float/2addr v0, p1

    .line 51
    cmpg-float p1, v0, p2

    .line 52
    .line 53
    if-gez p1, :cond_4

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 57
    .line 58
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 59
    .line 60
    int-to-float p1, p1

    .line 61
    sub-float/2addr v0, p1

    .line 62
    cmpg-float p1, v0, p2

    .line 63
    .line 64
    if-gez p1, :cond_4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    move v1, v2

    .line 68
    :goto_0
    move v2, v1

    .line 69
    :goto_1
    return v2
.end method

.method public m(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 2
    .line 3
    add-float/2addr v0, p1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 5
    .line 6
    return-void
.end method

.method public n(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 2
    .line 3
    return-void
.end method

.method public o(Landroid/graphics/Rect;)F
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 2
    .line 3
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge$a;->a:[I

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    aget v1, v1, v2

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v1, v2, :cond_3

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v1, v2, :cond_2

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    move p1, v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 35
    .line 36
    :goto_0
    int-to-float p1, p1

    .line 37
    :goto_1
    sub-float/2addr p1, v0

    .line 38
    return p1
.end method

.method public p(Landroid/graphics/Rect;)F
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 2
    .line 3
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge$a;->a:[I

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    aget v1, v1, v2

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v1, v2, :cond_3

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v1, v2, :cond_2

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 25
    .line 26
    int-to-float p1, p1

    .line 27
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 31
    .line 32
    int-to-float p1, p1

    .line 33
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 37
    .line 38
    int-to-float p1, p1

    .line 39
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 43
    .line 44
    int-to-float p1, p1

    .line 45
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 46
    .line 47
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:F

    .line 48
    .line 49
    sub-float/2addr p1, v0

    .line 50
    return p1
.end method
