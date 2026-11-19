.class public Landroidx/constraintlayout/core/dsl/KeyPositions;
.super Landroidx/constraintlayout/core/dsl/Keys;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/core/dsl/KeyPositions$Type;
    }
.end annotation


# instance fields
.field private mFrames:[I

.field private mPercentHeight:[F

.field private mPercentWidth:[F

.field private mPercentX:[F

.field private mPercentY:[F

.field private mPositionType:Landroidx/constraintlayout/core/dsl/KeyPositions$Type;

.field private mTarget:[Ljava/lang/String;

.field private mTransitionEasing:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(I[Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/constraintlayout/core/dsl/Keys;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mTransitionEasing:Ljava/lang/String;

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPositionType:Landroidx/constraintlayout/core/dsl/KeyPositions$Type;

    .line 8
    .line 9
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mFrames:[I

    .line 10
    .line 11
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentWidth:[F

    .line 12
    .line 13
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentHeight:[F

    .line 14
    .line 15
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentX:[F

    .line 16
    .line 17
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentY:[F

    .line 18
    .line 19
    iput-object p2, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mTarget:[Ljava/lang/String;

    .line 20
    .line 21
    new-array p1, p1, [I

    .line 22
    .line 23
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mFrames:[I

    .line 24
    .line 25
    array-length p1, p1

    .line 26
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    int-to-float p1, p1

    .line 29
    const/high16 p2, 0x42c80000    # 100.0f

    .line 30
    .line 31
    div-float/2addr p2, p1

    .line 32
    const/4 p1, 0x0

    .line 33
    :goto_0
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mFrames:[I

    .line 34
    .line 35
    array-length v1, v0

    .line 36
    if-ge p1, v1, :cond_0

    .line 37
    .line 38
    int-to-float v1, p1

    .line 39
    mul-float/2addr v1, p2

    .line 40
    add-float/2addr v1, p2

    .line 41
    float-to-int v1, v1

    .line 42
    aput v1, v0, p1

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-void
.end method


# virtual methods
.method public getFrames()[I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mFrames:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public getPercentHeight()[F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentHeight:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public getPercentWidth()[F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentWidth:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public getPercentX()[F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentX:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public getPercentY()[F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentY:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public getPositionType()Landroidx/constraintlayout/core/dsl/KeyPositions$Type;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPositionType:Landroidx/constraintlayout/core/dsl/KeyPositions$Type;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTarget()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mTarget:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTransitionEasing()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mTransitionEasing:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public varargs setFrames([I)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mFrames:[I

    .line 2
    .line 3
    return-void
.end method

.method public varargs setPercentHeight([F)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentHeight:[F

    .line 2
    .line 3
    return-void
.end method

.method public varargs setPercentWidth([F)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentWidth:[F

    .line 2
    .line 3
    return-void
.end method

.method public varargs setPercentX([F)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentX:[F

    .line 2
    .line 3
    return-void
.end method

.method public varargs setPercentY([F)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentY:[F

    .line 2
    .line 3
    return-void
.end method

.method public setPositionType(Landroidx/constraintlayout/core/dsl/KeyPositions$Type;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPositionType:Landroidx/constraintlayout/core/dsl/KeyPositions$Type;

    .line 2
    .line 3
    return-void
.end method

.method public setTransitionEasing(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mTransitionEasing:Ljava/lang/String;

    .line 2
    .line 3
    return-void
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
    const-string v1, "KeyPositions:{\n"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string/jumbo v1, "target"

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mTarget:[Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1, v2}, Landroidx/constraintlayout/core/dsl/Keys;->append(Ljava/lang/StringBuilder;Ljava/lang/String;[Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "frame:"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mFrames:[I

    .line 25
    .line 26
    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ",\n"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPositionType:Landroidx/constraintlayout/core/dsl/KeyPositions$Type;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    const-string/jumbo v1, "type:\'"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPositionType:Landroidx/constraintlayout/core/dsl/KeyPositions$Type;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, "\',\n"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    :cond_0
    const-string v1, "easing"

    .line 59
    .line 60
    iget-object v2, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mTransitionEasing:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p0, v0, v1, v2}, Landroidx/constraintlayout/core/dsl/Keys;->append(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentX:[F

    .line 66
    .line 67
    const-string/jumbo v2, "percentX"

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0, v2, v1}, Landroidx/constraintlayout/core/dsl/Keys;->append(Ljava/lang/StringBuilder;Ljava/lang/String;[F)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentY:[F

    .line 74
    .line 75
    invoke-virtual {p0, v0, v2, v1}, Landroidx/constraintlayout/core/dsl/Keys;->append(Ljava/lang/StringBuilder;Ljava/lang/String;[F)V

    .line 76
    .line 77
    .line 78
    const-string/jumbo v1, "percentWidth"

    .line 79
    .line 80
    .line 81
    iget-object v2, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentWidth:[F

    .line 82
    .line 83
    invoke-virtual {p0, v0, v1, v2}, Landroidx/constraintlayout/core/dsl/Keys;->append(Ljava/lang/StringBuilder;Ljava/lang/String;[F)V

    .line 84
    .line 85
    .line 86
    const-string/jumbo v1, "percentHeight"

    .line 87
    .line 88
    .line 89
    iget-object v2, p0, Landroidx/constraintlayout/core/dsl/KeyPositions;->mPercentHeight:[F

    .line 90
    .line 91
    invoke-virtual {p0, v0, v1, v2}, Landroidx/constraintlayout/core/dsl/Keys;->append(Ljava/lang/StringBuilder;Ljava/lang/String;[F)V

    .line 92
    .line 93
    .line 94
    const-string/jumbo v1, "},\n"

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0
.end method
