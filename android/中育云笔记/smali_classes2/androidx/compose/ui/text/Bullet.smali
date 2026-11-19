.class public final Landroidx/compose/ui/text/Bullet;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/text/AnnotatedString$Annotation;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final alpha:F

.field private final brush:Landroidx/compose/ui/graphics/Brush;

.field private final drawStyle:Landroidx/compose/ui/graphics/drawscope/DrawStyle;

.field private final padding:J

.field private final shape:Landroidx/compose/ui/graphics/Shape;

.field private final size:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/compose/ui/text/Bullet;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 4
    iput-wide p2, p0, Landroidx/compose/ui/text/Bullet;->size:J

    .line 5
    iput-wide p4, p0, Landroidx/compose/ui/text/Bullet;->padding:J

    .line 6
    iput-object p6, p0, Landroidx/compose/ui/text/Bullet;->brush:Landroidx/compose/ui/graphics/Brush;

    .line 7
    iput p7, p0, Landroidx/compose/ui/text/Bullet;->alpha:F

    .line 8
    iput-object p8, p0, Landroidx/compose/ui/text/Bullet;->drawStyle:Landroidx/compose/ui/graphics/drawscope/DrawStyle;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Landroidx/compose/ui/text/Bullet;-><init>(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;)V

    return-void
.end method

.method public static synthetic copy-1XB3EBo$default(Landroidx/compose/ui/text/Bullet;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;ILjava/lang/Object;)Landroidx/compose/ui/text/Bullet;
    .locals 0

    .line 1
    and-int/lit8 p10, p9, 0x1

    .line 2
    .line 3
    if-eqz p10, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/compose/ui/text/Bullet;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p10, p9, 0x2

    .line 8
    .line 9
    if-eqz p10, :cond_1

    .line 10
    .line 11
    iget-wide p2, p0, Landroidx/compose/ui/text/Bullet;->size:J

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p10, p9, 0x4

    .line 14
    .line 15
    if-eqz p10, :cond_2

    .line 16
    .line 17
    iget-wide p4, p0, Landroidx/compose/ui/text/Bullet;->padding:J

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p10, p9, 0x8

    .line 20
    .line 21
    if-eqz p10, :cond_3

    .line 22
    .line 23
    iget-object p6, p0, Landroidx/compose/ui/text/Bullet;->brush:Landroidx/compose/ui/graphics/Brush;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p10, p9, 0x10

    .line 26
    .line 27
    if-eqz p10, :cond_4

    .line 28
    .line 29
    iget p7, p0, Landroidx/compose/ui/text/Bullet;->alpha:F

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p9, p9, 0x20

    .line 32
    .line 33
    if-eqz p9, :cond_5

    .line 34
    .line 35
    iget-object p8, p0, Landroidx/compose/ui/text/Bullet;->drawStyle:Landroidx/compose/ui/graphics/drawscope/DrawStyle;

    .line 36
    .line 37
    :cond_5
    move p9, p7

    .line 38
    move-object p10, p8

    .line 39
    move-object p8, p6

    .line 40
    move-wide p6, p4

    .line 41
    move-wide p4, p2

    .line 42
    move-object p2, p0

    .line 43
    move-object p3, p1

    .line 44
    invoke-virtual/range {p2 .. p10}, Landroidx/compose/ui/text/Bullet;->copy-1XB3EBo(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/Bullet;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method


# virtual methods
.method public final copy-1XB3EBo(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/Bullet;
    .locals 10

    .line 1
    new-instance v0, Landroidx/compose/ui/text/Bullet;

    .line 2
    .line 3
    const/4 v9, 0x0

    .line 4
    move-object v1, p1

    .line 5
    move-wide v2, p2

    .line 6
    move-wide v4, p4

    .line 7
    move-object/from16 v6, p6

    .line 8
    .line 9
    move/from16 v7, p7

    .line 10
    .line 11
    move-object/from16 v8, p8

    .line 12
    .line 13
    invoke-direct/range {v0 .. v9}, Landroidx/compose/ui/text/Bullet;-><init>(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/n;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_7

    .line 7
    .line 8
    instance-of v2, p1, Landroidx/compose/ui/text/Bullet;

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iget-object v2, p0, Landroidx/compose/ui/text/Bullet;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 14
    .line 15
    check-cast p1, Landroidx/compose/ui/text/Bullet;

    .line 16
    .line 17
    iget-object v3, p1, Landroidx/compose/ui/text/Bullet;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    return v1

    .line 26
    :cond_2
    iget-wide v2, p0, Landroidx/compose/ui/text/Bullet;->size:J

    .line 27
    .line 28
    iget-wide v4, p1, Landroidx/compose/ui/text/Bullet;->size:J

    .line 29
    .line 30
    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/unit/TextUnit;->equals-impl0(JJ)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_3

    .line 35
    .line 36
    return v1

    .line 37
    :cond_3
    iget-wide v2, p0, Landroidx/compose/ui/text/Bullet;->padding:J

    .line 38
    .line 39
    iget-wide v4, p1, Landroidx/compose/ui/text/Bullet;->padding:J

    .line 40
    .line 41
    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/unit/TextUnit;->equals-impl0(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_4

    .line 46
    .line 47
    return v1

    .line 48
    :cond_4
    iget-object v2, p0, Landroidx/compose/ui/text/Bullet;->brush:Landroidx/compose/ui/graphics/Brush;

    .line 49
    .line 50
    iget-object v3, p1, Landroidx/compose/ui/text/Bullet;->brush:Landroidx/compose/ui/graphics/Brush;

    .line 51
    .line 52
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_5

    .line 57
    .line 58
    return v1

    .line 59
    :cond_5
    iget v2, p0, Landroidx/compose/ui/text/Bullet;->alpha:F

    .line 60
    .line 61
    iget v3, p1, Landroidx/compose/ui/text/Bullet;->alpha:F

    .line 62
    .line 63
    cmpg-float v2, v2, v3

    .line 64
    .line 65
    if-nez v2, :cond_7

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/compose/ui/text/Bullet;->drawStyle:Landroidx/compose/ui/graphics/drawscope/DrawStyle;

    .line 68
    .line 69
    iget-object p1, p1, Landroidx/compose/ui/text/Bullet;->drawStyle:Landroidx/compose/ui/graphics/drawscope/DrawStyle;

    .line 70
    .line 71
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-nez p1, :cond_6

    .line 76
    .line 77
    return v1

    .line 78
    :cond_6
    return v0

    .line 79
    :cond_7
    :goto_0
    return v1
.end method

.method public final getAlpha()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/text/Bullet;->alpha:F

    .line 2
    .line 3
    return v0
.end method

.method public final getBrush()Landroidx/compose/ui/graphics/Brush;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/Bullet;->brush:Landroidx/compose/ui/graphics/Brush;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDrawStyle()Landroidx/compose/ui/graphics/drawscope/DrawStyle;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/Bullet;->drawStyle:Landroidx/compose/ui/graphics/drawscope/DrawStyle;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPadding-XSAIIZE()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/text/Bullet;->padding:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getShape()Landroidx/compose/ui/graphics/Shape;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/Bullet;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSize-XSAIIZE()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/text/Bullet;->size:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/Bullet;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-wide v1, p0, Landroidx/compose/ui/text/Bullet;->size:J

    .line 10
    .line 11
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/TextUnit;->hashCode-impl(J)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-wide v1, p0, Landroidx/compose/ui/text/Bullet;->padding:J

    .line 19
    .line 20
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/TextUnit;->hashCode-impl(J)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Landroidx/compose/ui/text/Bullet;->brush:Landroidx/compose/ui/graphics/Brush;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v1, 0x0

    .line 37
    :goto_0
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget v1, p0, Landroidx/compose/ui/text/Bullet;->alpha:F

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v0, v1

    .line 47
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    .line 49
    iget-object v1, p0, Landroidx/compose/ui/text/Bullet;->drawStyle:Landroidx/compose/ui/graphics/drawscope/DrawStyle;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/2addr v0, v1

    .line 56
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Bullet(shape="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/compose/ui/text/Bullet;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", size="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-wide v1, p0, Landroidx/compose/ui/text/Bullet;->size:J

    .line 22
    .line 23
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/TextUnit;->toString-impl(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", padding="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-wide v1, p0, Landroidx/compose/ui/text/Bullet;->padding:J

    .line 36
    .line 37
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/TextUnit;->toString-impl(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", brush="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Landroidx/compose/ui/text/Bullet;->brush:Landroidx/compose/ui/graphics/Brush;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", alpha="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget v1, p0, Landroidx/compose/ui/text/Bullet;->alpha:F

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", drawStyle="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Landroidx/compose/ui/text/Bullet;->drawStyle:Landroidx/compose/ui/graphics/drawscope/DrawStyle;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const/16 v1, 0x29

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0
.end method
