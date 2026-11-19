.class public Landroidx/constraintlayout/core/dsl/OnSwipe;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/core/dsl/OnSwipe$Drag;,
        Landroidx/constraintlayout/core/dsl/OnSwipe$Side;,
        Landroidx/constraintlayout/core/dsl/OnSwipe$TouchUp;,
        Landroidx/constraintlayout/core/dsl/OnSwipe$Boundary;,
        Landroidx/constraintlayout/core/dsl/OnSwipe$Mode;
    }
.end annotation


# static fields
.field public static final FLAG_DISABLE_POST_SCROLL:I = 0x1

.field public static final FLAG_DISABLE_SCROLL:I = 0x2


# instance fields
.field private mAutoCompleteMode:Landroidx/constraintlayout/core/dsl/OnSwipe$Mode;

.field private mDragDirection:Landroidx/constraintlayout/core/dsl/OnSwipe$Drag;

.field private mDragScale:F

.field private mDragThreshold:F

.field private mLimitBoundsTo:Ljava/lang/String;

.field private mMaxAcceleration:F

.field private mMaxVelocity:F

.field private mOnTouchUp:Landroidx/constraintlayout/core/dsl/OnSwipe$TouchUp;

.field private mRotationCenterId:Ljava/lang/String;

.field private mSpringBoundary:Landroidx/constraintlayout/core/dsl/OnSwipe$Boundary;

.field private mSpringDamping:F

.field private mSpringMass:F

.field private mSpringStiffness:F

.field private mSpringStopThreshold:F

.field private mTouchAnchorId:Ljava/lang/String;

.field private mTouchAnchorSide:Landroidx/constraintlayout/core/dsl/OnSwipe$Side;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragDirection:Landroidx/constraintlayout/core/dsl/OnSwipe$Drag;

    .line 3
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mTouchAnchorSide:Landroidx/constraintlayout/core/dsl/OnSwipe$Side;

    .line 4
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mTouchAnchorId:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mLimitBoundsTo:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mOnTouchUp:Landroidx/constraintlayout/core/dsl/OnSwipe$TouchUp;

    .line 7
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mRotationCenterId:Ljava/lang/String;

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 8
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mMaxVelocity:F

    .line 9
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mMaxAcceleration:F

    .line 10
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragScale:F

    .line 11
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragThreshold:F

    .line 12
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringDamping:F

    .line 13
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringMass:F

    .line 14
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringStiffness:F

    .line 15
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringStopThreshold:F

    .line 16
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringBoundary:Landroidx/constraintlayout/core/dsl/OnSwipe$Boundary;

    .line 17
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mAutoCompleteMode:Landroidx/constraintlayout/core/dsl/OnSwipe$Mode;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroidx/constraintlayout/core/dsl/OnSwipe$Side;Landroidx/constraintlayout/core/dsl/OnSwipe$Drag;)V
    .locals 2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mLimitBoundsTo:Ljava/lang/String;

    .line 20
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mOnTouchUp:Landroidx/constraintlayout/core/dsl/OnSwipe$TouchUp;

    .line 21
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mRotationCenterId:Ljava/lang/String;

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 22
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mMaxVelocity:F

    .line 23
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mMaxAcceleration:F

    .line 24
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragScale:F

    .line 25
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragThreshold:F

    .line 26
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringDamping:F

    .line 27
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringMass:F

    .line 28
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringStiffness:F

    .line 29
    iput v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringStopThreshold:F

    .line 30
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringBoundary:Landroidx/constraintlayout/core/dsl/OnSwipe$Boundary;

    .line 31
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mAutoCompleteMode:Landroidx/constraintlayout/core/dsl/OnSwipe$Mode;

    .line 32
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mTouchAnchorId:Ljava/lang/String;

    .line 33
    iput-object p2, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mTouchAnchorSide:Landroidx/constraintlayout/core/dsl/OnSwipe$Side;

    .line 34
    iput-object p3, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragDirection:Landroidx/constraintlayout/core/dsl/OnSwipe$Drag;

    return-void
.end method


# virtual methods
.method public getAutoCompleteMode()Landroidx/constraintlayout/core/dsl/OnSwipe$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mAutoCompleteMode:Landroidx/constraintlayout/core/dsl/OnSwipe$Mode;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDragDirection()Landroidx/constraintlayout/core/dsl/OnSwipe$Drag;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragDirection:Landroidx/constraintlayout/core/dsl/OnSwipe$Drag;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDragScale()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragScale:F

    .line 2
    .line 3
    return v0
.end method

.method public getDragThreshold()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragThreshold:F

    .line 2
    .line 3
    return v0
.end method

.method public getLimitBoundsTo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mLimitBoundsTo:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxAcceleration()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mMaxAcceleration:F

    .line 2
    .line 3
    return v0
.end method

.method public getMaxVelocity()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mMaxVelocity:F

    .line 2
    .line 3
    return v0
.end method

.method public getOnTouchUp()Landroidx/constraintlayout/core/dsl/OnSwipe$TouchUp;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mOnTouchUp:Landroidx/constraintlayout/core/dsl/OnSwipe$TouchUp;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRotationCenterId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mRotationCenterId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSpringBoundary()Landroidx/constraintlayout/core/dsl/OnSwipe$Boundary;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringBoundary:Landroidx/constraintlayout/core/dsl/OnSwipe$Boundary;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSpringDamping()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringDamping:F

    .line 2
    .line 3
    return v0
.end method

.method public getSpringMass()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringMass:F

    .line 2
    .line 3
    return v0
.end method

.method public getSpringStiffness()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringStiffness:F

    .line 2
    .line 3
    return v0
.end method

.method public getSpringStopThreshold()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringStopThreshold:F

    .line 2
    .line 3
    return v0
.end method

.method public getTouchAnchorId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mTouchAnchorId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTouchAnchorSide()Landroidx/constraintlayout/core/dsl/OnSwipe$Side;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mTouchAnchorSide:Landroidx/constraintlayout/core/dsl/OnSwipe$Side;

    .line 2
    .line 3
    return-object v0
.end method

.method public setAutoCompleteMode(Landroidx/constraintlayout/core/dsl/OnSwipe$Mode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mAutoCompleteMode:Landroidx/constraintlayout/core/dsl/OnSwipe$Mode;

    .line 2
    .line 3
    return-void
.end method

.method public setDragDirection(Landroidx/constraintlayout/core/dsl/OnSwipe$Drag;)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragDirection:Landroidx/constraintlayout/core/dsl/OnSwipe$Drag;

    .line 2
    .line 3
    return-object p0
.end method

.method public setDragScale(I)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragScale:F

    .line 3
    .line 4
    return-object p0
.end method

.method public setDragThreshold(I)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragThreshold:F

    .line 3
    .line 4
    return-object p0
.end method

.method public setLimitBoundsTo(Ljava/lang/String;)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mLimitBoundsTo:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setMaxAcceleration(I)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mMaxAcceleration:F

    .line 3
    .line 4
    return-object p0
.end method

.method public setMaxVelocity(I)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mMaxVelocity:F

    .line 3
    .line 4
    return-object p0
.end method

.method public setOnTouchUp(Landroidx/constraintlayout/core/dsl/OnSwipe$TouchUp;)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mOnTouchUp:Landroidx/constraintlayout/core/dsl/OnSwipe$TouchUp;

    .line 2
    .line 3
    return-object p0
.end method

.method public setRotateCenter(Ljava/lang/String;)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mRotationCenterId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setSpringBoundary(Landroidx/constraintlayout/core/dsl/OnSwipe$Boundary;)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringBoundary:Landroidx/constraintlayout/core/dsl/OnSwipe$Boundary;

    .line 2
    .line 3
    return-object p0
.end method

.method public setSpringDamping(F)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringDamping:F

    .line 2
    .line 3
    return-object p0
.end method

.method public setSpringMass(F)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringMass:F

    .line 2
    .line 3
    return-object p0
.end method

.method public setSpringStiffness(F)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringStiffness:F

    .line 2
    .line 3
    return-object p0
.end method

.method public setSpringStopThreshold(F)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringStopThreshold:F

    .line 2
    .line 3
    return-object p0
.end method

.method public setTouchAnchorId(Ljava/lang/String;)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mTouchAnchorId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setTouchAnchorSide(Landroidx/constraintlayout/core/dsl/OnSwipe$Side;)Landroidx/constraintlayout/core/dsl/OnSwipe;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mTouchAnchorSide:Landroidx/constraintlayout/core/dsl/OnSwipe$Side;

    .line 2
    .line 3
    return-object p0
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
    const-string v1, "OnSwipe:{\n"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mTouchAnchorId:Ljava/lang/String;

    .line 12
    .line 13
    const-string v2, "\',\n"

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v1, "anchor:\'"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mTouchAnchorId:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragDirection:Landroidx/constraintlayout/core/dsl/OnSwipe$Drag;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const-string v1, "direction:\'"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragDirection:Landroidx/constraintlayout/core/dsl/OnSwipe$Drag;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mTouchAnchorSide:Landroidx/constraintlayout/core/dsl/OnSwipe$Side;

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    const-string/jumbo v1, "side:\'"

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mTouchAnchorSide:Landroidx/constraintlayout/core/dsl/OnSwipe$Side;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :cond_2
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragScale:F

    .line 82
    .line 83
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_3

    .line 88
    .line 89
    const-string/jumbo v1, "scale:\'"

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragScale:F

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    :cond_3
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragThreshold:F

    .line 104
    .line 105
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_4

    .line 110
    .line 111
    const-string/jumbo v1, "threshold:\'"

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mDragThreshold:F

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    :cond_4
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mMaxVelocity:F

    .line 126
    .line 127
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_5

    .line 132
    .line 133
    const-string/jumbo v1, "maxVelocity:\'"

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mMaxVelocity:F

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    :cond_5
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mMaxAcceleration:F

    .line 148
    .line 149
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_6

    .line 154
    .line 155
    const-string/jumbo v1, "maxAccel:\'"

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mMaxAcceleration:F

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    :cond_6
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mLimitBoundsTo:Ljava/lang/String;

    .line 170
    .line 171
    if-eqz v1, :cond_7

    .line 172
    .line 173
    const-string v1, "limitBounds:\'"

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mLimitBoundsTo:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    :cond_7
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mAutoCompleteMode:Landroidx/constraintlayout/core/dsl/OnSwipe$Mode;

    .line 187
    .line 188
    if-eqz v1, :cond_8

    .line 189
    .line 190
    const-string/jumbo v1, "mode:\'"

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mAutoCompleteMode:Landroidx/constraintlayout/core/dsl/OnSwipe$Mode;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    :cond_8
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mOnTouchUp:Landroidx/constraintlayout/core/dsl/OnSwipe$TouchUp;

    .line 213
    .line 214
    if-eqz v1, :cond_9

    .line 215
    .line 216
    const-string/jumbo v1, "touchUp:\'"

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mOnTouchUp:Landroidx/constraintlayout/core/dsl/OnSwipe$TouchUp;

    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    :cond_9
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringMass:F

    .line 239
    .line 240
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-nez v1, :cond_a

    .line 245
    .line 246
    const-string/jumbo v1, "springMass:\'"

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringMass:F

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    :cond_a
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringStiffness:F

    .line 261
    .line 262
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-nez v1, :cond_b

    .line 267
    .line 268
    const-string/jumbo v1, "springStiffness:\'"

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringStiffness:F

    .line 275
    .line 276
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    :cond_b
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringDamping:F

    .line 283
    .line 284
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-nez v1, :cond_c

    .line 289
    .line 290
    const-string/jumbo v1, "springDamping:\'"

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringDamping:F

    .line 297
    .line 298
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    :cond_c
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringStopThreshold:F

    .line 305
    .line 306
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    if-nez v1, :cond_d

    .line 311
    .line 312
    const-string/jumbo v1, "stopThreshold:\'"

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    iget v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringStopThreshold:F

    .line 319
    .line 320
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    :cond_d
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringBoundary:Landroidx/constraintlayout/core/dsl/OnSwipe$Boundary;

    .line 327
    .line 328
    if-eqz v1, :cond_e

    .line 329
    .line 330
    const-string/jumbo v1, "springBoundary:\'"

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mSpringBoundary:Landroidx/constraintlayout/core/dsl/OnSwipe$Boundary;

    .line 337
    .line 338
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    :cond_e
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mRotationCenterId:Ljava/lang/String;

    .line 345
    .line 346
    if-eqz v1, :cond_f

    .line 347
    .line 348
    const-string v1, "around:\'"

    .line 349
    .line 350
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/OnSwipe;->mRotationCenterId:Ljava/lang/String;

    .line 354
    .line 355
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    :cond_f
    const-string/jumbo v1, "},\n"

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    return-object v0
.end method
