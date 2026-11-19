.class public final Landroidx/compose/ui/graphics/PathSegment;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/graphics/PathSegment$Type;
    }
.end annotation


# instance fields
.field private final points:[F

.field private final type:Landroidx/compose/ui/graphics/PathSegment$Type;

.field private final weight:F


# direct methods
.method public constructor <init>(Landroidx/compose/ui/graphics/PathSegment$Type;[FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/graphics/PathSegment;->type:Landroidx/compose/ui/graphics/PathSegment$Type;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/graphics/PathSegment;->points:[F

    .line 7
    .line 8
    iput p3, p0, Landroidx/compose/ui/graphics/PathSegment;->weight:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

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
    if-eqz p1, :cond_4

    .line 7
    .line 8
    const-class v2, Landroidx/compose/ui/graphics/PathSegment;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Landroidx/compose/ui/graphics/PathSegment;

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/compose/ui/graphics/PathSegment;->type:Landroidx/compose/ui/graphics/PathSegment$Type;

    .line 20
    .line 21
    iget-object v3, p1, Landroidx/compose/ui/graphics/PathSegment;->type:Landroidx/compose/ui/graphics/PathSegment$Type;

    .line 22
    .line 23
    if-eq v2, v3, :cond_2

    .line 24
    .line 25
    return v1

    .line 26
    :cond_2
    iget-object v2, p0, Landroidx/compose/ui/graphics/PathSegment;->points:[F

    .line 27
    .line 28
    iget-object v3, p1, Landroidx/compose/ui/graphics/PathSegment;->points:[F

    .line 29
    .line 30
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([F[F)Z

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
    iget v2, p0, Landroidx/compose/ui/graphics/PathSegment;->weight:F

    .line 38
    .line 39
    iget p1, p1, Landroidx/compose/ui/graphics/PathSegment;->weight:F

    .line 40
    .line 41
    cmpg-float p1, v2, p1

    .line 42
    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    return v0

    .line 46
    :cond_4
    :goto_0
    return v1
.end method

.method public final getPoints()[F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/PathSegment;->points:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()Landroidx/compose/ui/graphics/PathSegment$Type;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/PathSegment;->type:Landroidx/compose/ui/graphics/PathSegment$Type;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWeight()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/PathSegment;->weight:F

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/PathSegment;->type:Landroidx/compose/ui/graphics/PathSegment$Type;

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
    iget-object v1, p0, Landroidx/compose/ui/graphics/PathSegment;->points:[F

    .line 10
    .line 11
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

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
    iget v1, p0, Landroidx/compose/ui/graphics/PathSegment;->weight:F

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
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
    const-string v1, "PathSegment(type="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/compose/ui/graphics/PathSegment;->type:Landroidx/compose/ui/graphics/PathSegment$Type;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", points="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Landroidx/compose/ui/graphics/PathSegment;->points:[F

    .line 22
    .line 23
    invoke-static {v1}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string/jumbo v2, "toString(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", weight="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget v1, p0, Landroidx/compose/ui/graphics/PathSegment;->weight:F

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const/16 v1, 0x29

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
.end method
