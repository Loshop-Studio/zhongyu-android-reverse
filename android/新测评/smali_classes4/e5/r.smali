.class public final Le5/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le5/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le5/r;

    .line 2
    .line 3
    invoke-direct {v0}, Le5/r;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le5/r;->a:Le5/r;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Path;FFF)Landroid/graphics/Path;
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 7
    .line 8
    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 9
    .line 10
    .line 11
    const v0, 0x3ecccccd    # 0.4f

    .line 12
    .line 13
    .line 14
    mul-float/2addr p4, v0

    .line 15
    sub-float v0, p2, p4

    .line 16
    .line 17
    sub-float v1, p3, p4

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 20
    .line 21
    .line 22
    add-float/2addr p2, p4

    .line 23
    add-float/2addr p3, p4

    .line 24
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0, p3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 31
    .line 32
    .line 33
    return-object p1
.end method

.method public final b(Landroid/graphics/Path;FFF)Landroid/graphics/Path;
    .locals 9

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    int-to-float v0, v0

    .line 8
    mul-float v1, p4, v0

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    int-to-float v2, v2

    .line 12
    div-float/2addr v1, v2

    .line 13
    div-float/2addr v1, v0

    .line 14
    div-float v0, p4, v0

    .line 15
    .line 16
    const v2, 0x3fddb3d0

    .line 17
    .line 18
    .line 19
    mul-float/2addr v2, v0

    .line 20
    new-instance v3, Landroid/graphics/RectF;

    .line 21
    .line 22
    sub-float v4, p2, p4

    .line 23
    .line 24
    sub-float v5, p3, p4

    .line 25
    .line 26
    add-float v6, p2, p4

    .line 27
    .line 28
    add-float/2addr p4, p3

    .line 29
    invoke-direct {v3, v4, v5, v6, p4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 30
    .line 31
    .line 32
    const/high16 p4, 0x41f00000    # 30.0f

    .line 33
    .line 34
    const/high16 v4, 0x42f00000    # 120.0f

    .line 35
    .line 36
    invoke-virtual {p1, v3, p4, v4}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 37
    .line 38
    .line 39
    sub-float v5, p2, v2

    .line 40
    .line 41
    sub-float v6, p3, v0

    .line 42
    .line 43
    sub-float v7, v6, v1

    .line 44
    .line 45
    invoke-virtual {p1, v5, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 49
    .line 50
    .line 51
    add-float/2addr v5, v1

    .line 52
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 53
    .line 54
    .line 55
    const/16 v5, 0xb4

    .line 56
    .line 57
    int-to-float v5, v5

    .line 58
    sub-float/2addr p4, v5

    .line 59
    invoke-virtual {p1, v3, p4, v4}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 60
    .line 61
    .line 62
    add-float/2addr v2, p2

    .line 63
    add-float/2addr v0, p3

    .line 64
    add-float p4, v0, v1

    .line 65
    .line 66
    invoke-virtual {p1, v2, p4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 70
    .line 71
    .line 72
    sub-float/2addr v2, v1

    .line 73
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 74
    .line 75
    .line 76
    sub-float v4, p2, v1

    .line 77
    .line 78
    sub-float v5, p3, v1

    .line 79
    .line 80
    add-float v6, p2, v1

    .line 81
    .line 82
    add-float v7, p3, v1

    .line 83
    .line 84
    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 85
    .line 86
    move-object v3, p1

    .line 87
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 88
    .line 89
    .line 90
    return-object v3
.end method

.method public final c(Landroid/graphics/Path;FFF)Landroid/graphics/Path;
    .locals 3

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 7
    .line 8
    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 9
    .line 10
    .line 11
    const/high16 v0, 0x3f000000    # 0.5f

    .line 12
    .line 13
    mul-float/2addr p4, v0

    .line 14
    sub-float v0, p2, p4

    .line 15
    .line 16
    sub-float v1, p3, p4

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 19
    .line 20
    .line 21
    add-float v2, p2, p4

    .line 22
    .line 23
    add-float/2addr p4, p3

    .line 24
    invoke-virtual {p1, v2, p4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0, p3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v2, p3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v2, p4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2, p4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 43
    .line 44
    .line 45
    return-object p1
.end method

.method public final d(Landroid/graphics/Path;FFF)Landroid/graphics/Path;
    .locals 6

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 7
    .line 8
    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 9
    .line 10
    .line 11
    const/high16 v0, 0x3f000000    # 0.5f

    .line 12
    .line 13
    mul-float/2addr p4, v0

    .line 14
    const v0, 0x3f333333    # 0.7f

    .line 15
    .line 16
    .line 17
    mul-float/2addr v0, p4

    .line 18
    const/16 v1, 0xb4

    .line 19
    .line 20
    int-to-float v1, v1

    .line 21
    const/high16 v2, 0x41f00000    # 30.0f

    .line 22
    .line 23
    sub-float/2addr v1, v2

    .line 24
    new-instance v3, Landroid/graphics/RectF;

    .line 25
    .line 26
    sub-float v4, p2, p4

    .line 27
    .line 28
    sub-float v5, p3, p4

    .line 29
    .line 30
    add-float/2addr p2, p4

    .line 31
    add-float/2addr p4, p3

    .line 32
    invoke-direct {v3, v4, v5, p2, p4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v3, v2, v1}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 36
    .line 37
    .line 38
    add-float v2, p3, v0

    .line 39
    .line 40
    invoke-virtual {p1, v4, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v4, p3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 44
    .line 45
    .line 46
    new-instance v2, Landroid/graphics/RectF;

    .line 47
    .line 48
    invoke-direct {v2, v4, v5, p2, p4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 49
    .line 50
    .line 51
    const/4 p4, 0x0

    .line 52
    neg-float v1, v1

    .line 53
    invoke-virtual {p1, v2, p4, v1}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 54
    .line 55
    .line 56
    sub-float p4, p3, v0

    .line 57
    .line 58
    invoke-virtual {p1, p2, p4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 62
    .line 63
    .line 64
    return-object p1
.end method

.method public final e(Landroid/graphics/Path;FFF)Landroid/graphics/Path;
    .locals 6

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 7
    .line 8
    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 9
    .line 10
    .line 11
    const/high16 v0, 0x3f000000    # 0.5f

    .line 12
    .line 13
    mul-float/2addr v0, p4

    .line 14
    const v1, 0x3dcccccd    # 0.1f

    .line 15
    .line 16
    .line 17
    mul-float/2addr p4, v1

    .line 18
    const v1, 0x3f333333    # 0.7f

    .line 19
    .line 20
    .line 21
    mul-float/2addr v1, v0

    .line 22
    sub-float v2, p2, v0

    .line 23
    .line 24
    sub-float v3, p3, v0

    .line 25
    .line 26
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 27
    .line 28
    .line 29
    sub-float v4, p2, p4

    .line 30
    .line 31
    sub-float v5, p3, p4

    .line 32
    .line 33
    invoke-virtual {p1, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 34
    .line 35
    .line 36
    add-float v4, v2, v1

    .line 37
    .line 38
    invoke-virtual {p1, v4, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 42
    .line 43
    .line 44
    add-float/2addr v3, v1

    .line 45
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 46
    .line 47
    .line 48
    add-float v2, p2, v0

    .line 49
    .line 50
    add-float/2addr v0, p3

    .line 51
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 52
    .line 53
    .line 54
    add-float/2addr p2, p4

    .line 55
    add-float/2addr p3, p4

    .line 56
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 57
    .line 58
    .line 59
    sub-float p2, v2, v1

    .line 60
    .line 61
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 65
    .line 66
    .line 67
    sub-float/2addr v0, v1

    .line 68
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 72
    .line 73
    .line 74
    return-object p1
.end method

.method public final f(Landroid/graphics/RectF;)Landroid/graphics/Path;
    .locals 5

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 9
    .line 10
    .line 11
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 12
    .line 13
    const/high16 v2, 0x3e800000    # 0.25f

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    mul-float/2addr v3, v2

    .line 20
    add-float/2addr v1, v3

    .line 21
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 22
    .line 23
    const/high16 v3, 0x3f000000    # 0.5f

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    mul-float/2addr v4, v3

    .line 30
    add-float/2addr v2, v4

    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 32
    .line 33
    .line 34
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 35
    .line 36
    const v2, 0x3ed58106    # 0.417f

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    mul-float/2addr v3, v2

    .line 44
    add-float/2addr v1, v3

    .line 45
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 46
    .line 47
    const v3, 0x3f2ac083    # 0.667f

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    mul-float/2addr v4, v3

    .line 55
    add-float/2addr v2, v4

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 57
    .line 58
    .line 59
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 60
    .line 61
    const/high16 v2, 0x3f400000    # 0.75f

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    mul-float/2addr v3, v2

    .line 68
    add-float/2addr v1, v3

    .line 69
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 70
    .line 71
    const v3, 0x3e958106    # 0.292f

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    mul-float/2addr p1, v3

    .line 79
    add-float/2addr v2, p1

    .line 80
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 81
    .line 82
    .line 83
    return-object v0
.end method
