.class public final enum Lb/c/a/e/f/a/c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb/c/a/e/f/a/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lb/c/a/e/f/a/c;

.field public static final enum d:Lb/c/a/e/f/a/c;

.field public static final enum e:Lb/c/a/e/f/a/c;

.field public static final enum f:Lb/c/a/e/f/a/c;

.field public static final synthetic g:[Lb/c/a/e/f/a/c;


# instance fields
.field public b:F


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lb/c/a/e/f/a/c;

    const-string v1, "LEFT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb/c/a/e/f/a/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/c/a/e/f/a/c;->c:Lb/c/a/e/f/a/c;

    new-instance v1, Lb/c/a/e/f/a/c;

    const-string v3, "TOP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lb/c/a/e/f/a/c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lb/c/a/e/f/a/c;->d:Lb/c/a/e/f/a/c;

    new-instance v3, Lb/c/a/e/f/a/c;

    const-string v5, "RIGHT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lb/c/a/e/f/a/c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lb/c/a/e/f/a/c;->e:Lb/c/a/e/f/a/c;

    new-instance v5, Lb/c/a/e/f/a/c;

    const-string v7, "BOTTOM"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lb/c/a/e/f/a/c;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lb/c/a/e/f/a/c;->f:Lb/c/a/e/f/a/c;

    const/4 v7, 0x4

    new-array v7, v7, [Lb/c/a/e/f/a/c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lb/c/a/e/f/a/c;->g:[Lb/c/a/e/f/a/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb/c/a/e/f/a/c;
    .locals 1

    const-class v0, Lb/c/a/e/f/a/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb/c/a/e/f/a/c;

    return-object p0
.end method

.method public static values()[Lb/c/a/e/f/a/c;
    .locals 1

    sget-object v0, Lb/c/a/e/f/a/c;->g:[Lb/c/a/e/f/a/c;

    invoke-virtual {v0}, [Lb/c/a/e/f/a/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/c/a/e/f/a/c;

    return-object v0
.end method


# virtual methods
.method public a(F)V
    .locals 6

    sget-object v0, Lb/c/a/e/f/a/c;->c:Lb/c/a/e/f/a/c;

    .line 1
    iget v0, v0, Lb/c/a/e/f/a/c;->b:F

    .line 2
    sget-object v1, Lb/c/a/e/f/a/c;->d:Lb/c/a/e/f/a/c;

    .line 3
    iget v1, v1, Lb/c/a/e/f/a/c;->b:F

    .line 4
    sget-object v2, Lb/c/a/e/f/a/c;->e:Lb/c/a/e/f/a/c;

    .line 5
    iget v2, v2, Lb/c/a/e/f/a/c;->b:F

    .line 6
    sget-object v3, Lb/c/a/e/f/a/c;->f:Lb/c/a/e/f/a/c;

    .line 7
    iget v3, v3, Lb/c/a/e/f/a/c;->b:F

    .line 8
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-eqz v4, :cond_3

    const/4 v5, 0x1

    if-eq v4, v5, :cond_2

    const/4 v5, 0x2

    if-eq v4, v5, :cond_1

    const/4 v3, 0x3

    if-eq v4, v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v0, v1, v2, p1}, Lb/c/a/a;->c(FFFF)F

    move-result p1

    goto :goto_0

    :cond_1
    invoke-static {v0, v1, v3, p1}, Lb/c/a/a;->e(FFFF)F

    move-result p1

    goto :goto_0

    :cond_2
    invoke-static {v0, v2, v3, p1}, Lb/c/a/a;->f(FFFF)F

    move-result p1

    goto :goto_0

    :cond_3
    invoke-static {v1, v2, v3, p1}, Lb/c/a/a;->d(FFFF)F

    move-result p1

    :goto_0
    iput p1, p0, Lb/c/a/e/f/a/c;->b:F

    :goto_1
    return-void
.end method

.method public b(FFLandroid/graphics/Rect;FF)V
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    const/high16 v2, 0x42200000    # 40.0f

    if-eqz v0, :cond_c

    const/4 v3, 0x1

    if-eq v0, v3, :cond_8

    const/4 v1, 0x2

    const/high16 v3, -0x800000    # Float.NEGATIVE_INFINITY

    if-eq v0, v1, :cond_4

    const/4 p1, 0x3

    if-eq v0, p1, :cond_0

    goto/16 :goto_6

    .line 1
    :cond_0
    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    sub-float p3, p1, p2

    cmpg-float p3, p3, p4

    if-gez p3, :cond_1

    goto/16 :goto_3

    :cond_1
    sget-object p1, Lb/c/a/e/f/a/c;->d:Lb/c/a/e/f/a/c;

    .line 2
    iget p1, p1, Lb/c/a/e/f/a/c;->b:F

    add-float p3, p1, v2

    cmpg-float p4, p2, p3

    if-gtz p4, :cond_2

    goto :goto_0

    :cond_2
    move p3, v3

    :goto_0
    sub-float p4, p2, p1

    mul-float/2addr p4, p5

    cmpg-float p4, p4, v2

    if-gtz p4, :cond_3

    div-float/2addr v2, p5

    add-float v3, v2, p1

    .line 3
    :cond_3
    invoke-static {v3, p3}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    goto :goto_3

    .line 4
    :cond_4
    iget p2, p3, Landroid/graphics/Rect;->right:I

    int-to-float p2, p2

    sub-float p3, p2, p1

    cmpg-float p3, p3, p4

    if-gez p3, :cond_5

    goto/16 :goto_5

    :cond_5
    sget-object p2, Lb/c/a/e/f/a/c;->c:Lb/c/a/e/f/a/c;

    .line 5
    iget p2, p2, Lb/c/a/e/f/a/c;->b:F

    add-float p3, p2, v2

    cmpg-float p4, p1, p3

    if-gtz p4, :cond_6

    goto :goto_1

    :cond_6
    move p3, v3

    :goto_1
    sub-float p4, p1, p2

    div-float/2addr p4, p5

    cmpg-float p4, p4, v2

    if-gtz p4, :cond_7

    mul-float/2addr p5, v2

    add-float v3, p5, p2

    .line 6
    :cond_7
    invoke-static {p3, v3}, Ljava/lang/Math;->max(FF)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    goto :goto_5

    .line 7
    :cond_8
    iget p1, p3, Landroid/graphics/Rect;->top:I

    int-to-float p1, p1

    sub-float p3, p2, p1

    cmpg-float p3, p3, p4

    if-gez p3, :cond_9

    goto :goto_3

    :cond_9
    sget-object p1, Lb/c/a/e/f/a/c;->f:Lb/c/a/e/f/a/c;

    .line 8
    iget p1, p1, Lb/c/a/e/f/a/c;->b:F

    sub-float p3, p1, v2

    cmpl-float p4, p2, p3

    if-ltz p4, :cond_a

    goto :goto_2

    :cond_a
    move p3, v1

    :goto_2
    sub-float p4, p1, p2

    mul-float/2addr p4, p5

    cmpg-float p4, p4, v2

    if-gtz p4, :cond_b

    div-float/2addr v2, p5

    sub-float v1, p1, v2

    .line 9
    :cond_b
    invoke-static {p3, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    .line 10
    :goto_3
    iput p1, p0, Lb/c/a/e/f/a/c;->b:F

    goto :goto_6

    .line 11
    :cond_c
    iget p2, p3, Landroid/graphics/Rect;->left:I

    int-to-float p2, p2

    sub-float p3, p1, p2

    cmpg-float p3, p3, p4

    if-gez p3, :cond_d

    goto :goto_5

    :cond_d
    sget-object p2, Lb/c/a/e/f/a/c;->e:Lb/c/a/e/f/a/c;

    .line 12
    iget p2, p2, Lb/c/a/e/f/a/c;->b:F

    sub-float p3, p2, v2

    cmpl-float p4, p1, p3

    if-ltz p4, :cond_e

    goto :goto_4

    :cond_e
    move p3, v1

    :goto_4
    sub-float p4, p2, p1

    div-float/2addr p4, p5

    cmpg-float p4, p4, v2

    if-gtz p4, :cond_f

    mul-float/2addr p5, v2

    sub-float v1, p2, p5

    .line 13
    :cond_f
    invoke-static {p3, v1}, Ljava/lang/Math;->min(FF)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p2

    .line 14
    :goto_5
    iput p2, p0, Lb/c/a/e/f/a/c;->b:F

    :goto_6
    return-void
.end method

.method public c(Lb/c/a/e/f/a/c;Landroid/graphics/Rect;F)Z
    .locals 10

    .line 1
    sget-object v0, Lb/c/a/e/f/a/c;->c:Lb/c/a/e/f/a/c;

    sget-object v1, Lb/c/a/e/f/a/c;->d:Lb/c/a/e/f/a/c;

    sget-object v2, Lb/c/a/e/f/a/c;->e:Lb/c/a/e/f/a/c;

    sget-object v3, Lb/c/a/e/f/a/c;->f:Lb/c/a/e/f/a/c;

    iget v4, p1, Lb/c/a/e/f/a/c;->b:F

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v5, :cond_3

    if-eq v5, v8, :cond_2

    if-eq v5, v7, :cond_1

    if-eq v5, v6, :cond_0

    move v5, v4

    goto :goto_1

    :cond_0
    iget v5, p2, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_1
    iget v5, p2, Landroid/graphics/Rect;->right:I

    goto :goto_0

    :cond_2
    iget v5, p2, Landroid/graphics/Rect;->top:I

    goto :goto_0

    :cond_3
    iget v5, p2, Landroid/graphics/Rect;->left:I

    :goto_0
    int-to-float v5, v5

    :goto_1
    sub-float/2addr v5, v4

    .line 2
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-eqz v4, :cond_a

    if-eq v4, v8, :cond_8

    if-eq v4, v7, :cond_6

    if-eq v4, v6, :cond_4

    goto/16 :goto_9

    :cond_4
    invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget p1, p2, Landroid/graphics/Rect;->left:I

    int-to-float p1, p1

    .line 3
    iget v0, v2, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v0, v5

    goto :goto_2

    .line 4
    :cond_5
    invoke-virtual {p1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    iget p1, p2, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    .line 5
    iget v0, v0, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v0, v5

    move v9, v0

    move v0, p1

    move p1, v9

    :goto_2
    iget v1, v1, Lb/c/a/e/f/a/c;->b:F

    .line 6
    invoke-static {p1, v1, v0, p3}, Lb/c/a/a;->c(FFFF)F

    move-result p3

    move v4, p1

    move v5, p3

    goto/16 :goto_6

    :cond_6
    invoke-virtual {p1, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget p1, p2, Landroid/graphics/Rect;->top:I

    int-to-float p1, p1

    .line 7
    iget v1, v3, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v1, v5

    move v9, v1

    move v1, p1

    move p1, v9

    goto :goto_3

    .line 8
    :cond_7
    invoke-virtual {p1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    .line 9
    iget v1, v1, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v1, v5

    :goto_3
    iget v0, v0, Lb/c/a/e/f/a/c;->b:F

    .line 10
    invoke-static {v0, v1, p1, p3}, Lb/c/a/a;->e(FFFF)F

    move-result p3

    move v5, p1

    move v6, p3

    move v4, v0

    goto :goto_7

    :cond_8
    invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget p1, p2, Landroid/graphics/Rect;->left:I

    int-to-float p1, p1

    .line 11
    iget v0, v2, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v0, v5

    goto :goto_4

    .line 12
    :cond_9
    invoke-virtual {p1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    iget p1, p2, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    .line 13
    iget v0, v0, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v0, v5

    move v9, v0

    move v0, p1

    move p1, v9

    :goto_4
    iget v1, v3, Lb/c/a/e/f/a/c;->b:F

    .line 14
    invoke-static {p1, v0, v1, p3}, Lb/c/a/a;->f(FFFF)F

    move-result p3

    move v4, p1

    move v3, p3

    move v6, v0

    move v5, v1

    goto :goto_8

    :cond_a
    invoke-virtual {p1, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget p1, p2, Landroid/graphics/Rect;->top:I

    int-to-float p1, p1

    .line 15
    iget v0, v3, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v0, v5

    move v1, p1

    move p1, v0

    goto :goto_5

    .line 16
    :cond_b
    invoke-virtual {p1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    .line 17
    iget v0, v1, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v0, v5

    move v1, v0

    :goto_5
    iget v0, v2, Lb/c/a/e/f/a/c;->b:F

    .line 18
    invoke-static {v1, v0, p1, p3}, Lb/c/a/a;->d(FFFF)F

    move-result p3

    move v5, p1

    move v4, p3

    :goto_6
    move v6, v0

    :goto_7
    move v3, v1

    :goto_8
    move-object v2, p0

    move-object v7, p2

    invoke-virtual/range {v2 .. v7}, Lb/c/a/e/f/a/c;->d(FFFFLandroid/graphics/Rect;)Z

    move-result p1

    return p1

    :cond_c
    :goto_9
    return v8
.end method

.method public final d(FFFFLandroid/graphics/Rect;)Z
    .locals 1

    iget v0, p5, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-ltz p1, :cond_1

    iget p1, p5, Landroid/graphics/Rect;->left:I

    int-to-float p1, p1

    cmpg-float p1, p2, p1

    if-ltz p1, :cond_1

    iget p1, p5, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    cmpl-float p1, p3, p1

    if-gtz p1, :cond_1

    iget p1, p5, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    cmpl-float p1, p4, p1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public e(Landroid/graphics/Rect;F)Z
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v1, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v3, 0x3

    if-eq v0, v3, :cond_0

    goto :goto_1

    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    iget v0, p0, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr p1, v0

    cmpg-float p1, p1, p2

    if-gez p1, :cond_4

    goto :goto_0

    :cond_1
    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    iget v0, p0, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr p1, v0

    cmpg-float p1, p1, p2

    if-gez p1, :cond_4

    goto :goto_0

    :cond_2
    iget v0, p0, Lb/c/a/e/f/a/c;->b:F

    iget p1, p1, Landroid/graphics/Rect;->top:I

    int-to-float p1, p1

    sub-float/2addr v0, p1

    cmpg-float p1, v0, p2

    if-gez p1, :cond_4

    goto :goto_0

    :cond_3
    iget v0, p0, Lb/c/a/e/f/a/c;->b:F

    iget p1, p1, Landroid/graphics/Rect;->left:I

    int-to-float p1, p1

    sub-float/2addr v0, p1

    cmpg-float p1, v0, p2

    if-gez p1, :cond_4

    goto :goto_0

    :cond_4
    move v1, v2

    :goto_0
    move v2, v1

    :goto_1
    return v2
.end method

.method public f(F)V
    .locals 1

    iget v0, p0, Lb/c/a/e/f/a/c;->b:F

    add-float/2addr v0, p1

    iput v0, p0, Lb/c/a/e/f/a/c;->b:F

    return-void
.end method

.method public g(Landroid/graphics/Rect;)F
    .locals 3

    iget v0, p0, Lb/c/a/e/f/a/c;->b:F

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_1
    iget p1, p1, Landroid/graphics/Rect;->right:I

    goto :goto_0

    :cond_2
    iget p1, p1, Landroid/graphics/Rect;->top:I

    goto :goto_0

    :cond_3
    iget p1, p1, Landroid/graphics/Rect;->left:I

    :goto_0
    int-to-float p1, p1

    iput p1, p0, Lb/c/a/e/f/a/c;->b:F

    :goto_1
    iget p1, p0, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr p1, v0

    return p1
.end method
