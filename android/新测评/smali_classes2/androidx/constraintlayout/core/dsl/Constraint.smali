.class public Landroidx/constraintlayout/core/dsl/Constraint;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;,
        Landroidx/constraintlayout/core/dsl/Constraint$HSide;,
        Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;,
        Landroidx/constraintlayout/core/dsl/Constraint$VSide;,
        Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;,
        Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;,
        Landroidx/constraintlayout/core/dsl/Constraint$Anchor;,
        Landroidx/constraintlayout/core/dsl/Constraint$Side;
    }
.end annotation


# static fields
.field public static final PARENT:Landroidx/constraintlayout/core/dsl/Constraint;

.field static UNSET:I

.field static chainModeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field helperJason:Ljava/lang/String;

.field helperType:Ljava/lang/String;

.field private mBaseline:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

.field private mBottom:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

.field private mCircleAngle:F

.field private mCircleConstraint:Ljava/lang/String;

.field private mCircleRadius:I

.field private mConstrainedHeight:Z

.field private mConstrainedWidth:Z

.field private mDimensionRatio:Ljava/lang/String;

.field private mEditorAbsoluteX:I

.field private mEditorAbsoluteY:I

.field private mEnd:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

.field private mHeight:I

.field private mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

.field private mHeightMax:I

.field private mHeightMin:I

.field private mHeightPercent:F

.field private mHorizontalBias:F

.field private mHorizontalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

.field private mHorizontalWeight:F

.field private final mId:Ljava/lang/String;

.field private mLeft:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

.field private mReferenceIds:[Ljava/lang/String;

.field private mRight:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

.field private mStart:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

.field private mTop:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

.field private mVerticalBias:F

.field private mVerticalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

.field private mVerticalWeight:F

.field private mWidth:I

.field private mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

.field private mWidthMax:I

.field private mWidthMin:I

.field private mWidthPercent:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/constraintlayout/core/dsl/Constraint;

    .line 2
    .line 3
    const-string/jumbo v1, "parent"

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Landroidx/constraintlayout/core/dsl/Constraint;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Landroidx/constraintlayout/core/dsl/Constraint;->PARENT:Landroidx/constraintlayout/core/dsl/Constraint;

    .line 10
    .line 11
    const/high16 v0, -0x80000000

    .line 12
    .line 13
    sput v0, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/constraintlayout/core/dsl/Constraint;->chainModeMap:Ljava/util/Map;

    .line 21
    .line 22
    sget-object v1, Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;->SPREAD:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 23
    .line 24
    const-string/jumbo v2, "spread"

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    sget-object v0, Landroidx/constraintlayout/core/dsl/Constraint;->chainModeMap:Ljava/util/Map;

    .line 31
    .line 32
    sget-object v1, Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;->SPREAD_INSIDE:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 33
    .line 34
    const-string/jumbo v2, "spread_inside"

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    sget-object v0, Landroidx/constraintlayout/core/dsl/Constraint;->chainModeMap:Ljava/util/Map;

    .line 41
    .line 42
    sget-object v1, Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;->PACKED:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 43
    .line 44
    const-string/jumbo v2, "packed"

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->helperType:Ljava/lang/String;

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->helperJason:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 10
    .line 11
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$HSide;->LEFT:Landroidx/constraintlayout/core/dsl/Constraint$HSide;

    .line 12
    .line 13
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$HSide;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mLeft:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 17
    .line 18
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 19
    .line 20
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$HSide;->RIGHT:Landroidx/constraintlayout/core/dsl/Constraint$HSide;

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$HSide;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mRight:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 26
    .line 27
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 28
    .line 29
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$VSide;->TOP:Landroidx/constraintlayout/core/dsl/Constraint$VSide;

    .line 30
    .line 31
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$VSide;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mTop:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 35
    .line 36
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 37
    .line 38
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$VSide;->BOTTOM:Landroidx/constraintlayout/core/dsl/Constraint$VSide;

    .line 39
    .line 40
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$VSide;)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBottom:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 44
    .line 45
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 46
    .line 47
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$HSide;->START:Landroidx/constraintlayout/core/dsl/Constraint$HSide;

    .line 48
    .line 49
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$HSide;)V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mStart:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 53
    .line 54
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 55
    .line 56
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$HSide;->END:Landroidx/constraintlayout/core/dsl/Constraint$HSide;

    .line 57
    .line 58
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$HSide;)V

    .line 59
    .line 60
    .line 61
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEnd:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 62
    .line 63
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 64
    .line 65
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$VSide;->BASELINE:Landroidx/constraintlayout/core/dsl/Constraint$VSide;

    .line 66
    .line 67
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$VSide;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBaseline:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 71
    .line 72
    sget v1, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 73
    .line 74
    iput v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidth:I

    .line 75
    .line 76
    iput v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeight:I

    .line 77
    .line 78
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 79
    .line 80
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalBias:F

    .line 81
    .line 82
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalBias:F

    .line 83
    .line 84
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mDimensionRatio:Ljava/lang/String;

    .line 85
    .line 86
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleConstraint:Ljava/lang/String;

    .line 87
    .line 88
    const/high16 v3, -0x80000000

    .line 89
    .line 90
    iput v3, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

    .line 91
    .line 92
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

    .line 93
    .line 94
    iput v3, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEditorAbsoluteX:I

    .line 95
    .line 96
    iput v3, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEditorAbsoluteY:I

    .line 97
    .line 98
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalWeight:F

    .line 99
    .line 100
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalWeight:F

    .line 101
    .line 102
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 103
    .line 104
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 105
    .line 106
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 107
    .line 108
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 109
    .line 110
    iput v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMax:I

    .line 111
    .line 112
    iput v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMax:I

    .line 113
    .line 114
    iput v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMin:I

    .line 115
    .line 116
    iput v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMin:I

    .line 117
    .line 118
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthPercent:F

    .line 119
    .line 120
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightPercent:F

    .line 121
    .line 122
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mReferenceIds:[Ljava/lang/String;

    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    iput-boolean v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedWidth:Z

    .line 126
    .line 127
    iput-boolean v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedHeight:Z

    .line 128
    .line 129
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mId:Ljava/lang/String;

    .line 130
    .line 131
    return-void
.end method

.method public static synthetic access$000(Landroidx/constraintlayout/core/dsl/Constraint;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public append(Ljava/lang/StringBuilder;Ljava/lang/String;F)V
    .locals 1

    .line 1
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p2, ":"

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p2, ",\n"

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public convertStringArrayToString([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    array-length v2, p1

    .line 10
    if-ge v1, v2, :cond_1

    .line 11
    .line 12
    const-string v2, "\'"

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    move-object v3, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const-string v3, ",\'"

    .line 19
    .line 20
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    aget-object v3, p1, v1

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-string p1, "]"

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method

.method public getBaseline()Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBaseline:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBottom()Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBottom:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCircleAngle()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

    .line 2
    .line 3
    return v0
.end method

.method public getCircleConstraint()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleConstraint:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCircleRadius()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

    .line 2
    .line 3
    return v0
.end method

.method public getDimensionRatio()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mDimensionRatio:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEditorAbsoluteX()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEditorAbsoluteX:I

    .line 2
    .line 3
    return v0
.end method

.method public getEditorAbsoluteY()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEditorAbsoluteY:I

    .line 2
    .line 3
    return v0
.end method

.method public getEnd()Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEnd:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeight:I

    .line 2
    .line 3
    return v0
.end method

.method public getHeightDefault()Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHeightMax()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMax:I

    .line 2
    .line 3
    return v0
.end method

.method public getHeightMin()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMin:I

    .line 2
    .line 3
    return v0
.end method

.method public getHeightPercent()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightPercent:F

    .line 2
    .line 3
    return v0
.end method

.method public getHorizontalBias()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalBias:F

    .line 2
    .line 3
    return v0
.end method

.method public getHorizontalChainStyle()Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHorizontalWeight()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalWeight:F

    .line 2
    .line 3
    return v0
.end method

.method public getLeft()Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mLeft:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 2
    .line 3
    return-object v0
.end method

.method public getReferenceIds()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mReferenceIds:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRight()Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mRight:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 2
    .line 3
    return-object v0
.end method

.method public getStart()Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mStart:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTop()Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mTop:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVerticalBias()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalBias:F

    .line 2
    .line 3
    return v0
.end method

.method public getVerticalChainStyle()Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVerticalWeight()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalWeight:F

    .line 2
    .line 3
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidth:I

    .line 2
    .line 3
    return v0
.end method

.method public getWidthDefault()Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 2
    .line 3
    return-object v0
.end method

.method public getWidthMax()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMax:I

    .line 2
    .line 3
    return v0
.end method

.method public getWidthMin()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMin:I

    .line 2
    .line 3
    return v0
.end method

.method public getWidthPercent()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthPercent:F

    .line 2
    .line 3
    return v0
.end method

.method public isConstrainedHeight()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedHeight:Z

    .line 2
    .line 3
    return v0
.end method

.method public isConstrainedWidth()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedWidth:Z

    .line 2
    .line 3
    return v0
.end method

.method public linkToBaseline(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToBaseline(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;I)V

    return-void
.end method

.method public linkToBaseline(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToBaseline(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;II)V

    return-void
.end method

.method public linkToBaseline(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBaseline:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public linkToBottom(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToBottom(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;I)V

    return-void
.end method

.method public linkToBottom(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToBottom(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;II)V

    return-void
.end method

.method public linkToBottom(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBottom:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public linkToEnd(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToEnd(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V

    return-void
.end method

.method public linkToEnd(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToEnd(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V

    return-void
.end method

.method public linkToEnd(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEnd:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public linkToLeft(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToLeft(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V

    return-void
.end method

.method public linkToLeft(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToLeft(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V

    return-void
.end method

.method public linkToLeft(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mLeft:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public linkToRight(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToRight(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V

    return-void
.end method

.method public linkToRight(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToRight(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V

    return-void
.end method

.method public linkToRight(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mRight:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public linkToStart(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToStart(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V

    return-void
.end method

.method public linkToStart(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToStart(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V

    return-void
.end method

.method public linkToStart(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mStart:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public linkToTop(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToTop(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;I)V

    return-void
.end method

.method public linkToTop(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToTop(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;II)V

    return-void
.end method

.method public linkToTop(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mTop:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public setCircleAngle(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

    .line 2
    .line 3
    return-void
.end method

.method public setCircleConstraint(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleConstraint:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setCircleRadius(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

    .line 2
    .line 3
    return-void
.end method

.method public setConstrainedHeight(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedHeight:Z

    .line 2
    .line 3
    return-void
.end method

.method public setConstrainedWidth(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedWidth:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDimensionRatio(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mDimensionRatio:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setEditorAbsoluteX(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEditorAbsoluteX:I

    .line 2
    .line 3
    return-void
.end method

.method public setEditorAbsoluteY(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEditorAbsoluteY:I

    .line 2
    .line 3
    return-void
.end method

.method public setHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeight:I

    .line 2
    .line 3
    return-void
.end method

.method public setHeightDefault(Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 2
    .line 3
    return-void
.end method

.method public setHeightMax(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMax:I

    .line 2
    .line 3
    return-void
.end method

.method public setHeightMin(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMin:I

    .line 2
    .line 3
    return-void
.end method

.method public setHeightPercent(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightPercent:F

    .line 2
    .line 3
    return-void
.end method

.method public setHorizontalBias(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalBias:F

    .line 2
    .line 3
    return-void
.end method

.method public setHorizontalChainStyle(Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 2
    .line 3
    return-void
.end method

.method public setHorizontalWeight(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalWeight:F

    .line 2
    .line 3
    return-void
.end method

.method public setReferenceIds([Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mReferenceIds:[Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setVerticalBias(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalBias:F

    .line 2
    .line 3
    return-void
.end method

.method public setVerticalChainStyle(Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 2
    .line 3
    return-void
.end method

.method public setVerticalWeight(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalWeight:F

    .line 2
    .line 3
    return-void
.end method

.method public setWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidth:I

    .line 2
    .line 3
    return-void
.end method

.method public setWidthDefault(Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 2
    .line 3
    return-void
.end method

.method public setWidthMax(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMax:I

    .line 2
    .line 3
    return-void
.end method

.method public setWidthMin(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMin:I

    .line 2
    .line 3
    return-void
.end method

.method public setWidthPercent(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthPercent:F

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mId:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v2, ":{\n"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mLeft:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mRight:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mTop:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBottom:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mStart:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEnd:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBaseline:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 58
    .line 59
    .line 60
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidth:I

    .line 61
    .line 62
    sget v2, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 63
    .line 64
    const-string v3, ",\n"

    .line 65
    .line 66
    if-eq v1, v2, :cond_0

    .line 67
    .line 68
    const-string/jumbo v1, "width:"

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidth:I

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    :cond_0
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeight:I

    .line 83
    .line 84
    sget v2, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 85
    .line 86
    if-eq v1, v2, :cond_1

    .line 87
    .line 88
    const-string v1, "height:"

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeight:I

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    :cond_1
    const-string v1, "horizontalBias"

    .line 102
    .line 103
    iget v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalBias:F

    .line 104
    .line 105
    invoke-virtual {p0, v0, v1, v2}, Landroidx/constraintlayout/core/dsl/Constraint;->append(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 106
    .line 107
    .line 108
    const-string/jumbo v1, "verticalBias"

    .line 109
    .line 110
    .line 111
    iget v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalBias:F

    .line 112
    .line 113
    invoke-virtual {p0, v0, v1, v2}, Landroidx/constraintlayout/core/dsl/Constraint;->append(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mDimensionRatio:Ljava/lang/String;

    .line 117
    .line 118
    const-string v2, "\',\n"

    .line 119
    .line 120
    if-eqz v1, :cond_2

    .line 121
    .line 122
    const-string v1, "dimensionRatio:\'"

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mDimensionRatio:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    :cond_2
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleConstraint:Ljava/lang/String;

    .line 136
    .line 137
    const-string v4, "\'"

    .line 138
    .line 139
    if-eqz v1, :cond_7

    .line 140
    .line 141
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

    .line 142
    .line 143
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    const/high16 v5, -0x80000000

    .line 148
    .line 149
    if-eqz v1, :cond_3

    .line 150
    .line 151
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

    .line 152
    .line 153
    if-eq v1, v5, :cond_7

    .line 154
    .line 155
    :cond_3
    const-string v1, "circular:[\'"

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleConstraint:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

    .line 169
    .line 170
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    const-string v6, ","

    .line 175
    .line 176
    if-nez v1, :cond_4

    .line 177
    .line 178
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

    .line 182
    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    :cond_4
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

    .line 187
    .line 188
    if-eq v1, v5, :cond_6

    .line 189
    .line 190
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

    .line 191
    .line 192
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_5

    .line 197
    .line 198
    const-string v1, ",0,"

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_5
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

    .line 213
    .line 214
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    :cond_6
    :goto_0
    const-string v1, "],\n"

    .line 218
    .line 219
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    :cond_7
    const-string/jumbo v1, "verticalWeight"

    .line 223
    .line 224
    .line 225
    iget v5, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalWeight:F

    .line 226
    .line 227
    invoke-virtual {p0, v0, v1, v5}, Landroidx/constraintlayout/core/dsl/Constraint;->append(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 228
    .line 229
    .line 230
    const-string v1, "horizontalWeight"

    .line 231
    .line 232
    iget v5, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalWeight:F

    .line 233
    .line 234
    invoke-virtual {p0, v0, v1, v5}, Landroidx/constraintlayout/core/dsl/Constraint;->append(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 235
    .line 236
    .line 237
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 238
    .line 239
    if-eqz v1, :cond_8

    .line 240
    .line 241
    const-string v1, "horizontalChainStyle:\'"

    .line 242
    .line 243
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    sget-object v1, Landroidx/constraintlayout/core/dsl/Constraint;->chainModeMap:Ljava/util/Map;

    .line 247
    .line 248
    iget-object v5, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 249
    .line 250
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    check-cast v1, Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    :cond_8
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 263
    .line 264
    if-eqz v1, :cond_9

    .line 265
    .line 266
    const-string/jumbo v1, "verticalChainStyle:\'"

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    sget-object v1, Landroidx/constraintlayout/core/dsl/Constraint;->chainModeMap:Ljava/util/Map;

    .line 273
    .line 274
    iget-object v5, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 275
    .line 276
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    check-cast v1, Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    :cond_9
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 289
    .line 290
    const-string v5, ",min:"

    .line 291
    .line 292
    const-string v6, ",max:"

    .line 293
    .line 294
    const-string/jumbo v7, "width:\'"

    .line 295
    .line 296
    .line 297
    const-string/jumbo v8, "},\n"

    .line 298
    .line 299
    .line 300
    if-eqz v1, :cond_d

    .line 301
    .line 302
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMax:I

    .line 303
    .line 304
    sget v9, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 305
    .line 306
    if-ne v1, v9, :cond_a

    .line 307
    .line 308
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMin:I

    .line 309
    .line 310
    if-ne v1, v9, :cond_a

    .line 311
    .line 312
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    goto :goto_1

    .line 332
    :cond_a
    const-string/jumbo v1, "width:{value:\'"

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 339
    .line 340
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMax:I

    .line 355
    .line 356
    sget v9, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 357
    .line 358
    if-eq v1, v9, :cond_b

    .line 359
    .line 360
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMax:I

    .line 364
    .line 365
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    :cond_b
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMin:I

    .line 369
    .line 370
    sget v9, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 371
    .line 372
    if-eq v1, v9, :cond_c

    .line 373
    .line 374
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMin:I

    .line 378
    .line 379
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    :cond_c
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    :cond_d
    :goto_1
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 386
    .line 387
    const-string v9, "height:\'"

    .line 388
    .line 389
    if-eqz v1, :cond_11

    .line 390
    .line 391
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMax:I

    .line 392
    .line 393
    sget v10, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 394
    .line 395
    if-ne v1, v10, :cond_e

    .line 396
    .line 397
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMin:I

    .line 398
    .line 399
    if-ne v1, v10, :cond_e

    .line 400
    .line 401
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 405
    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    goto :goto_2

    .line 421
    :cond_e
    const-string v1, "height:{value:\'"

    .line 422
    .line 423
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMax:I

    .line 443
    .line 444
    sget v2, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 445
    .line 446
    if-eq v1, v2, :cond_f

    .line 447
    .line 448
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMax:I

    .line 452
    .line 453
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    :cond_f
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMin:I

    .line 457
    .line 458
    sget v2, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 459
    .line 460
    if-eq v1, v2, :cond_10

    .line 461
    .line 462
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMin:I

    .line 466
    .line 467
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    :cond_10
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    :cond_11
    :goto_2
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthPercent:F

    .line 474
    .line 475
    float-to-double v1, v1

    .line 476
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    const-string v2, "%\',\n"

    .line 481
    .line 482
    if-nez v1, :cond_12

    .line 483
    .line 484
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthPercent:F

    .line 488
    .line 489
    float-to-int v1, v1

    .line 490
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    :cond_12
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightPercent:F

    .line 497
    .line 498
    float-to-double v4, v1

    .line 499
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    if-nez v1, :cond_13

    .line 504
    .line 505
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightPercent:F

    .line 509
    .line 510
    float-to-int v1, v1

    .line 511
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    :cond_13
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mReferenceIds:[Ljava/lang/String;

    .line 518
    .line 519
    if-eqz v1, :cond_14

    .line 520
    .line 521
    const-string/jumbo v1, "referenceIds:"

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mReferenceIds:[Ljava/lang/String;

    .line 528
    .line 529
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/core/dsl/Constraint;->convertStringArrayToString([Ljava/lang/String;)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    :cond_14
    iget-boolean v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedWidth:Z

    .line 540
    .line 541
    if-eqz v1, :cond_15

    .line 542
    .line 543
    const-string v1, "constrainedWidth:"

    .line 544
    .line 545
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    iget-boolean v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedWidth:Z

    .line 549
    .line 550
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 554
    .line 555
    .line 556
    :cond_15
    iget-boolean v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedHeight:Z

    .line 557
    .line 558
    if-eqz v1, :cond_16

    .line 559
    .line 560
    const-string v1, "constrainedHeight:"

    .line 561
    .line 562
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    iget-boolean v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedHeight:Z

    .line 566
    .line 567
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    :cond_16
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    return-object v0
.end method
